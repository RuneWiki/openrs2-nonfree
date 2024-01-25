import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
	public static int anInt1662;

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
	public static int anInt1665;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
	public static int anInt1663 = -1;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Lclient!pq;")
	public static Class25_Sub4 method1355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass25_Sub4_2 == null ? null : local7.aClass25_Sub4_2;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)I")
	public static int method1356(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local14;
		if (local23 < local14) {
			local37 = local23;
		}
		if (local37 > local30) {
			local37 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local14 < local23) {
			local51 = local23;
		}
		if (local51 < local30) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local37) / 2.0D;
		if (local37 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local37) / (local51 + local37);
			}
			if (local14 == local51) {
				local65 = (local23 - local30) / (local51 - local37);
			} else if (local51 == local23) {
				local65 = (local30 - local14) / (-local37 + local51) + 2.0D;
			} else if (local51 == local30) {
				local65 = (local14 - local23) / (-local37 + local51) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local37) / (2.0D - local51 - local37);
			}
		}
		local65 /= 6.0D;
		@Pc(160) int local160 = (int) (local65 * 256.0D);
		@Pc(165) int local165 = (int) (local67 * 256.0D);
		@Pc(170) int local170 = (int) (local73 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local170 > 243) {
			local165 >>= 0x4;
		} else if (local170 > 217) {
			local165 >>= 0x3;
		} else if (local170 > 192) {
			local165 >>= 0x2;
		} else if (local170 > 179) {
			local165 >>= 0x1;
		}
		return (local170 >> 1) + (local165 >> 5 << 7) + ((local160 >> 2 & 0x3F) << 10);
	}
}
