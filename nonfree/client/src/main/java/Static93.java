import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!de", name = "y", descriptor = "[Lclient!lk;")
	public static Class188[] aClass188Array1;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IIB)Z")
	public static boolean method2311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static199.aBoolean358) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static299.aClass302ArrayArray2[local21] == null || Static299.aClass302ArrayArray2[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class302 local43 = Static299.aClass302ArrayArray2[local21][local25];
		@Pc(58) Class6_Sub5_Sub9 local58;
		if (arg1 == -1 && local43.anInt8936 == 0) {
			for (local58 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local58 != null; local58 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
				if (local58.anInt3240 == 59 || local58.anInt3240 == 1006 || local58.anInt3240 == 21 || local58.anInt3240 == 49 || local58.anInt3240 == 9) {
					for (@Pc(89) Class302 local89 = Static299.method5103(local58.anInt3241); local89 != null; local89 = Static613.method8401(local89)) {
						if (local89.anInt8867 == local43.anInt8867) {
							return true;
						}
					}
				}
			}
		} else {
			for (local58 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local58 != null; local58 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
				if (arg1 == local58.anInt3242 && local58.anInt3241 == local43.anInt8867 && (local58.anInt3240 == 59 || local58.anInt3240 == 1006 || local58.anInt3240 == 21 || local58.anInt3240 == 49 || local58.anInt3240 == 9)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBI)I")
	public static int method2312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = (local12 * (arg0 & 0xFF00) & 0xFF0000 | local12 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return ((local35 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local35 & 0xFF00FF00) >>> 8) + local30;
	}
}
