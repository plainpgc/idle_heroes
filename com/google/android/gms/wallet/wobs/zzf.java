package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<TextModuleData> {
    static void zza(TextModuleData textModuleData, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, textModuleData.getVersionCode());
        zzb.zza(parcel, 2, textModuleData.zzaSG, false);
        zzb.zza(parcel, 3, textModuleData.zzCI, false);
        zzb.zzH(parcel, zzac);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzgD(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzjI(x0);
    }

    public TextModuleData zzgD(Parcel parcel) {
        String str = null;
        int zzab = zza.zzab(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i = zza.zzg(parcel, zzaa);
                    break;
                case 2:
                    str2 = zza.zzo(parcel, zzaa);
                    break;
                case 3:
                    str = zza.zzo(parcel, zzaa);
                    break;
                default:
                    zza.zzb(parcel, zzaa);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new TextModuleData(i, str2, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzab, parcel);
    }

    public TextModuleData[] zzjI(int i) {
        return new TextModuleData[i];
    }
}
