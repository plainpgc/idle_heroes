package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable.Operator;
import rx.Scheduler;
import rx.Subscriber;

public final class OperatorThrottleFirst<T> implements Operator<T, T> {
    final Scheduler scheduler;
    final long timeInMilliseconds;

    public OperatorThrottleFirst(long windowDuration, TimeUnit unit, Scheduler scheduler) {
        this.timeInMilliseconds = unit.toMillis(windowDuration);
        this.scheduler = scheduler;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) {
            private long lastOnNext = -1;

            public void onStart() {
                request(Long.MAX_VALUE);
            }

            public void onNext(T v) {
                long now = OperatorThrottleFirst.this.scheduler.now();
                if (this.lastOnNext == -1 || now - this.lastOnNext >= OperatorThrottleFirst.this.timeInMilliseconds) {
                    this.lastOnNext = now;
                    subscriber.onNext(v);
                }
            }

            public void onCompleted() {
                subscriber.onCompleted();
            }

            public void onError(Throwable e) {
                subscriber.onError(e);
            }
        };
    }
}
