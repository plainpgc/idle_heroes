package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzbr implements Creator<TrashResourceRequest> {
    static void zza(TrashResourceRequest trashResourceRequest, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, trashResourceRequest.zzCY);
        zzb.zza(parcel, 2, trashResourceRequest.zzaeq, i, false);
        zzb.zzH(parcel, zzac);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzbu(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzdj(x0);
    }

    public TrashResourceRequest zzbu(Parcel parcel) {
        int zzab = zza.zzab(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i = zza.zzg(parcel, zzaa);
                    break;
                case 2:
                    driveId = (DriveId) zza.zza(parcel, zzaa, DriveId.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new TrashResourceRequest(i, driveId);
        }
        throw new zza.zza("Overread allowed size end=" + zzab, parcel);
    }

    public TrashResourceRequest[] zzdj(int i) {
        return new TrashResourceRequest[i];
    }
}
