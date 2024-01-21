import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public static int anInt1829;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public static int anInt1837;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_774 = Static187.method3089(" has logged in)3");

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
	public static final int[] anIntArray155 = new int[5];

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!vd;")
	public static Class92 aClass92_775 = aClass92_774;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_776 = Static187.method3089("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(14) int local14 = arg1 - arg2;
		@Pc(18) int local18 = arg1 * arg1;
		@Pc(22) int local22 = arg5 - arg2;
		@Pc(26) int local26 = local14 * local14;
		@Pc(30) int local30 = arg5 * arg5;
		@Pc(34) int local34 = local22 * local22;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = local34 << 1;
		@Pc(44) int local44 = local18 << 1;
		@Pc(48) int local48 = local30 << 1;
		@Pc(52) int local52 = local22 << 1;
		@Pc(56) int local56 = local26 << 1;
		@Pc(60) int local60 = arg5 << 1;
		@Pc(69) int local69 = (1 - local60) * local18 + local48;
		@Pc(78) int local78 = local30 - (local60 - 1) * local44;
		@Pc(88) int local88 = local26 * (1 - local52) + local40;
		@Pc(92) int local92 = local18 << 2;
		@Pc(101) int local101 = local34 - local56 * (local52 - 1);
		@Pc(105) int local105 = local30 << 2;
		@Pc(109) int local109 = local26 << 2;
		@Pc(113) int local113 = local48 * 3;
		@Pc(119) int local119 = (local60 - 3) * local44;
		@Pc(123) int local123 = local34 << 2;
		@Pc(127) int local127 = local40 * 3;
		@Pc(133) int local133 = (local52 - 3) * local56;
		@Pc(135) int local135 = local105;
		@Pc(145) int local145 = local92 * (arg5 - 1);
		@Pc(147) int local147 = local123;
		@Pc(153) int local153 = local109 * (local22 - 1);
		@Pc(157) int[] local157 = Static142.anIntArrayArray25[arg0];
		Static74.method1123(arg4 - arg1, arg3, local157, arg4 - local14);
		Static74.method1123(arg4 - local14, arg6, local157, arg4 + local14);
		Static74.method1123(local14 + arg4, arg3, local157, arg4 + arg1);
		while (local9 > 0) {
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local135;
					local3++;
					local135 += local105;
					local69 += local113;
					local113 += local105;
				}
			}
			if (local78 < 0) {
				local78 += local135;
				local69 += local113;
				local3++;
				local135 += local105;
				local113 += local105;
			}
			local69 += -local145;
			local78 += -local119;
			local119 -= local92;
			local145 -= local92;
			@Pc(269) boolean local269 = local9 <= local22;
			if (local269) {
				if (local88 < 0) {
					while (local88 < 0) {
						local36++;
						local101 += local147;
						local88 += local127;
						local147 += local123;
						local127 += local123;
					}
				}
				if (local101 < 0) {
					local36++;
					local101 += local147;
					local147 += local123;
					local88 += local127;
					local127 += local123;
				}
				local88 += -local153;
				local153 -= local109;
				local101 += -local133;
				local133 -= local109;
			}
			local9--;
			@Pc(342) int local342 = local9 + arg0;
			@Pc(347) int local347 = arg4 + local3;
			@Pc(352) int local352 = arg0 - local9;
			@Pc(357) int local357 = arg4 - local3;
			if (local269) {
				@Pc(363) int local363 = local36 + arg4;
				@Pc(368) int local368 = arg4 - local36;
				Static74.method1123(local357, arg3, Static142.anIntArrayArray25[local352], local368);
				Static74.method1123(local368, arg6, Static142.anIntArrayArray25[local352], local363);
				Static74.method1123(local363, arg3, Static142.anIntArrayArray25[local352], local347);
				Static74.method1123(local357, arg3, Static142.anIntArrayArray25[local342], local368);
				Static74.method1123(local368, arg6, Static142.anIntArrayArray25[local342], local363);
				Static74.method1123(local363, arg3, Static142.anIntArrayArray25[local342], local347);
			} else {
				Static74.method1123(local357, arg3, Static142.anIntArrayArray25[local352], local347);
				Static74.method1123(local357, arg3, Static142.anIntArrayArray25[local342], local347);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
	public static int method1267(@OriginalArg(0) int arg0) {
		@Pc(7) Class1_Sub3_Sub7 local7 = Static71.method1102(arg0);
		@Pc(15) int local15 = local7.anInt1609;
		@Pc(18) int local18 = local7.anInt1614;
		@Pc(21) int local21 = local7.anInt1613;
		@Pc(28) int local28 = Class62.anIntArray198[local21 - local15];
		return Static84.anIntArray156[local18] >> local15 & local28;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	public static void method1268() {
		Static176.aClass47_24.method1276();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIII)V")
	public static void method1269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (local12 = 0; local12 < 8; local12++) {
				Static156.anIntArrayArrayArray6[arg2][arg1 + local8][local12 + arg0] = 0;
			}
		}
		if (arg1 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static156.anIntArrayArrayArray6[arg2][arg1][arg0 + local12] = Static156.anIntArrayArrayArray6[arg2][arg1 - 1][local12 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static156.anIntArrayArrayArray6[arg2][local12 + arg1][arg0] = Static156.anIntArrayArrayArray6[arg2][arg1 + local12][arg0 - 1];
			}
		}
		if (arg1 > 0 && Static156.anIntArrayArrayArray6[arg2][arg1 - 1][arg0] != 0) {
			Static156.anIntArrayArrayArray6[arg2][arg1][arg0] = Static156.anIntArrayArrayArray6[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && Static156.anIntArrayArrayArray6[arg2][arg1][arg0 - 1] != 0) {
			Static156.anIntArrayArrayArray6[arg2][arg1][arg0] = Static156.anIntArrayArrayArray6[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && Static156.anIntArrayArrayArray6[arg2][arg1 - 1][arg0 - 1] != 0) {
			Static156.anIntArrayArrayArray6[arg2][arg1][arg0] = Static156.anIntArrayArrayArray6[arg2][arg1 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method1270() {
		Static38.aClass1_Sub14_Sub1_3.method3067(62);
		for (@Pc(18) Class1_Sub4 local18 = (Class1_Sub4) Static183.aClass97_21.method3372(); local18 != null; local18 = (Class1_Sub4) Static183.aClass97_21.method3377()) {
			if (local18.anInt489 == 0) {
				Static151.method2294(true, local18);
			}
		}
		if (Static82.aClass11_6 != null) {
			Static73.method1118(Static82.aClass11_6);
			Static82.aClass11_6 = null;
		}
	}
}
