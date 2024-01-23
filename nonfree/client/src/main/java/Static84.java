import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
	public static int anInt1719;

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "[Lclient!wb;")
	public static Class4_Sub2_Sub4[] aClass4_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "Lclient!ul;")
	public static Class172 aClass172_14 = new Class172(64);

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
	public static int anInt1718 = 500;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString66 = "Connecting to update server";

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
	public static int method1412() {
		return Static272.anInt5429;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([IIIIII)V")
	public static void method1415(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class131 local13 = local7.aClass131_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4070;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class187 local58 = local7.aClass187_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt5839;
		@Pc(67) int local67 = local58.anInt5840;
		@Pc(70) int local70 = local58.anInt5842;
		@Pc(73) int local73 = local58.anInt5841;
		@Pc(77) int[] local77 = Static293.anIntArrayArray39[local23];
		@Pc(81) int[] local81 = Static233.anIntArrayArray30[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method1417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - arg1;
		if (local4 < -9) {
			return "<col=ff0000>";
		} else if (local4 < -6) {
			return "<col=ff3000>";
		} else if (local4 < -3) {
			return "<col=ff7000>";
		} else if (local4 < 0) {
			return "<col=ffb000>";
		} else if (local4 > 9) {
			return "<col=00ff00>";
		} else if (local4 > 6) {
			return "<col=40ff00>";
		} else if (local4 <= 3) {
			return local4 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
		} else {
			return "<col=80ff00>";
		}
	}
}
