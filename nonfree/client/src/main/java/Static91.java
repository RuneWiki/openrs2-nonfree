import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_859 = Static187.method3089("Connecting to update server");

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "Lclient!vd;")
	public static Class92 aClass92_860 = aClass92_859;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBIIIII)V")
	public static void method1350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static19.method429(Static118.anInt2521, arg2, Static204.anInt2389);
		@Pc(17) int local17 = Static19.method429(Static118.anInt2521, arg1, Static204.anInt2389);
		@Pc(27) int local27 = Static19.method429(Static102.anInt2207, arg5, Static116.anInt2488);
		@Pc(33) int local33 = Static19.method429(Static102.anInt2207, arg0, Static116.anInt2488);
		@Pc(41) int local41 = Static19.method429(Static118.anInt2521, arg4 + arg2, Static204.anInt2389);
		@Pc(50) int local50 = Static19.method429(Static118.anInt2521, arg1 - arg4, Static204.anInt2389);
		for (@Pc(52) int local52 = local11; local52 < local41; local52++) {
			Static74.method1123(local27, arg3, Static142.anIntArrayArray25[local52], local33);
		}
		for (@Pc(72) int local72 = local17; local72 > local50; local72--) {
			Static74.method1123(local27, arg3, Static142.anIntArrayArray25[local72], local33);
		}
		@Pc(94) int local94 = Static19.method429(Static102.anInt2207, arg4 + arg5, Static116.anInt2488);
		@Pc(103) int local103 = Static19.method429(Static102.anInt2207, arg0 - arg4, Static116.anInt2488);
		for (@Pc(105) int local105 = local41; local105 <= local50; local105++) {
			@Pc(111) int[] local111 = Static142.anIntArrayArray25[local105];
			Static74.method1123(local27, arg3, local111, local94);
			Static74.method1123(local103, arg3, local111, local33);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
	public static void method1351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class85 local13 = local7.aClass85_1;
		if (local13 != null) {
			local13.anInt3795 = local13.anInt3795 * arg3 / 16;
			local13.anInt3791 = local13.anInt3791 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
	public static void method1353() {
		@Pc(18) int local18 = (Static15.aClass8_Sub3_Sub1_1.anInt3606 >> 7) + Static138.anInt2800;
		Static82.anInt1825 = 0;
		@Pc(28) int local28 = (Static15.aClass8_Sub3_Sub1_1.anInt3600 >> 7) + Static100.anInt2141;
		if (local28 >= 3053 && local28 <= 3156 && local18 >= 3056 && local18 <= 3136) {
			Static82.anInt1825 = 1;
		}
		if (local28 >= 3072 && local28 <= 3118 && local18 >= 9492 && local18 <= 9535) {
			Static82.anInt1825 = 1;
		}
		if (Static82.anInt1825 == 1 && local28 >= 3139 && local28 <= 3199 && local18 >= 3008 && local18 <= 3062) {
			Static82.anInt1825 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lclient!ag;II[BIII)V")
	public static void method1356(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg1 > 0 && arg1 + local7 < 103 && local11 + arg4 > 0 && arg4 + local11 < 103) {
						arg0[local3].anIntArrayArray4[arg1 + local7][arg4 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(97) Class1_Sub14 local97 = new Class1_Sub14(arg2);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
					Static12.method231(local97, 0, arg1 + local103, arg4 + local107, arg5, arg3, local11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ab;Lclient!ab;I)V")
	public static void method1357(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		Static63.aClass3_34 = arg0;
		Static102.aClass3_18 = arg1;
	}
}
