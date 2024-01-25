import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_38 = new Class16();

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	public static int anInt4649 = -2;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
	public static int anInt4650 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)I")
	public static int method4097(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBZ)V")
	public static void method4100(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class11_Sub6 local8 = Static158.method2534(arg0, arg1);
		if (local8 != null) {
			local8.method5701();
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	public static void method4103() {
		Static296.aClass26_53.method328();
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Lclient!mk;")
	public static Class67_Sub2 method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass67_Sub2_2;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
	public static int method4106(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local65 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local65 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local65 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local46 - local32);
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
		return (local165 >> 5 << 7) + ((local160 & 0xFF) >> 2 << 10) + (local170 >> 1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIIZ)V")
	public static void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 < 1 || arg2 < 1 || Static24.anInt454 - 2 < arg5 || arg2 > Static240.anInt4832 - 2) {
			return;
		}
		if (!Static283.method4712() && !Static14.method210(Static141.anInt2602, arg2, arg7, arg5)) {
			return;
		}
		if (Static212.aClass106ArrayArrayArray2 == null) {
			return;
		}
		@Pc(43) int local43 = arg7;
		if (arg7 < 3 && Static223.method3983(arg2, arg5)) {
			local43 = arg7 + 1;
		}
		Static247.method4335(arg0, Static107.aClass129_4, arg5, Static211.aClass92Array1[arg7], arg2, arg7, local43);
		if (arg4 >= 0) {
			@Pc(69) boolean local69 = Static280.aBoolean11;
			Static280.aBoolean11 = true;
			Static262.method4547(arg1, arg6, false, arg4, false, arg7, local43, arg3, Static107.aClass129_4, arg5, arg2, Static211.aClass92Array1[arg7]);
			Static280.aBoolean11 = local69;
		}
	}
}
