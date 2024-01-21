import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!me", name = "lb", descriptor = "Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2 aClass3_Sub2_Sub3_Sub2_3;

	@OriginalMember(owner = "client!me", name = "sb", descriptor = "Lclient!oc;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!me", name = "Db", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!me", name = "Y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_795 = Static65.method1172("M");

	@OriginalMember(owner = "client!me", name = "ib", descriptor = "Lclient!kb;")
	private static Class46 aClass46_799 = Static65.method1172("New User");

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_796 = aClass46_799;

	@OriginalMember(owner = "client!me", name = "vb", descriptor = "Lclient!kb;")
	private static Class46 aClass46_801 = Static65.method1172("glow1:");

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "Lclient!kb;")
	public static Class46 aClass46_797 = aClass46_801;

	@OriginalMember(owner = "client!me", name = "db", descriptor = "[I")
	public static int[] anIntArray246 = new int[200];

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_798 = aClass46_801;

	@OriginalMember(owner = "client!me", name = "kb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_800 = Static65.method1172(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	public static int anInt2410 = 0;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	public static void method1636() {
		aClass3_Sub2_Sub3_Sub2_3 = null;
		aClass49_1 = null;
		aClass46_798 = null;
		aClass46_800 = null;
		aClass46_799 = null;
		aClass46_801 = null;
		aClass46_796 = null;
		anIntArray246 = null;
		aClass46_795 = null;
		aClass46_797 = null;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(II)Z")
	public static boolean method1638(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	public static void method1643() {
		@Pc(10) int local10;
		if (Static71.anInt1839 > 0) {
			for (local10 = 0; local10 < 256; local10++) {
				if (Static71.anInt1839 > 768) {
					Static1.anIntArray1[local10] = Static78.method1610(1024 - Static71.anInt1839, Static63.anIntArray157[local10], Static31.anIntArray66[local10]);
				} else if (Static71.anInt1839 > 256) {
					Static1.anIntArray1[local10] = Static31.anIntArray66[local10];
				} else {
					Static1.anIntArray1[local10] = Static78.method1610(256 - Static71.anInt1839, Static31.anIntArray66[local10], Static63.anIntArray157[local10]);
				}
			}
		} else if (Static88.anInt2168 <= 0) {
			for (local10 = 0; local10 < 256; local10++) {
				Static1.anIntArray1[local10] = Static63.anIntArray157[local10];
			}
		} else {
			for (local10 = 0; local10 < 256; local10++) {
				if (Static88.anInt2168 > 768) {
					Static1.anIntArray1[local10] = Static78.method1610(1024 - Static88.anInt2168, Static63.anIntArray157[local10], Static78.anIntArray240[local10]);
				} else if (Static88.anInt2168 <= 256) {
					Static1.anIntArray1[local10] = Static78.method1610(256 - Static88.anInt2168, Static78.anIntArray240[local10], Static63.anIntArray157[local10]);
				} else {
					Static1.anIntArray1[local10] = Static78.anIntArray240[local10];
				}
			}
		}
		@Pc(154) int local154 = Static128.aClass3_Sub2_Sub3_Sub3_32.anInt2694 * 9;
		@Pc(156) int local156 = 0;
		local10 = 0;
		@Pc(175) int local175;
		@Pc(185) int local185;
		@Pc(198) int local198;
		@Pc(193) int local193;
		@Pc(210) int local210;
		@Pc(214) int local214;
		for (@Pc(160) int local160 = 1; local160 < 255; local160++) {
			local175 = Static23.anIntArray37[local160] * (256 - local160) / 256 + 22;
			if (local175 < 0) {
				local175 = 0;
			}
			local10 += local175;
			for (local185 = local175; local185 < 128; local185++) {
				local193 = Static128.aClass3_Sub2_Sub3_Sub3_32.anIntArray301[local154++];
				local198 = Static54.anIntArray134[local10++];
				if (local198 == 0) {
					Static85.aClass3_Sub2_Sub3_Sub3_7.anIntArray301[local156++] = local193;
				} else {
					local210 = local198;
					local214 = 256 - local198;
					local198 = Static1.anIntArray1[local198];
					Static85.aClass3_Sub2_Sub3_Sub3_7.anIntArray301[local156++] = (local214 * (local193 & 0xFF00FF) + local210 * (local198 & 0xFF00FF) & 0xFF00FF00) + (local214 * (local193 & 0xFF00) + (local198 & 0xFF00) * local210 & 0xFF0000) >> 8;
				}
			}
			for (local198 = 0; local198 < local175; local198++) {
				Static85.aClass3_Sub2_Sub3_Sub3_7.anIntArray301[local156++] = Static128.aClass3_Sub2_Sub3_Sub3_32.anIntArray301[local154++];
			}
			local154 += Static128.aClass3_Sub2_Sub3_Sub3_32.anInt2694 - 128;
		}
		local10 = 0;
		Static85.aClass3_Sub2_Sub3_Sub3_7.method1888(0, 9);
		local156 = 0;
		local154 = Static128.aClass3_Sub2_Sub3_Sub3_32.anInt2694 * 9 + 128;
		for (local175 = 1; local175 < 255; local175++) {
			local185 = Static23.anIntArray37[local175] * (256 - local175) / 256 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			for (local198 = 0; local198 < local185; local198++) {
				@Pc(350) int local350 = local156++;
				local154--;
				Static41.aClass3_Sub2_Sub3_Sub3_39.anIntArray301[local350] = Static128.aClass3_Sub2_Sub3_Sub3_32.anIntArray301[local154];
			}
			for (local193 = local185; local193 < 128; local193++) {
				local154--;
				local214 = Static128.aClass3_Sub2_Sub3_Sub3_32.anIntArray301[local154];
				local210 = Static54.anIntArray134[local10++];
				if (local210 == 0) {
					Static41.aClass3_Sub2_Sub3_Sub3_39.anIntArray301[local156++] = local214;
				} else {
					@Pc(395) int local395 = local210;
					@Pc(400) int local400 = 256 - local210;
					local210 = Static1.anIntArray1[local210];
					Static41.aClass3_Sub2_Sub3_Sub3_39.anIntArray301[local156++] = (local400 * (local214 & 0xFF00FF) + local395 * (local210 & 0xFF00FF) & 0xFF00FF00) + ((local210 & 0xFF00) * local395 + (local400 * (local214 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local10 += local185;
			local154 += Static128.aClass3_Sub2_Sub3_Sub3_32.anInt2694 + 128;
		}
		Static41.aClass3_Sub2_Sub3_Sub3_39.method1888(637, 9);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
	public static void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static103.method2215(arg1, arg0, arg2 + arg1, arg0 + arg3);
		Static132.method2230();
		Static42.anInt1175++;
		Static42.method851(true);
		Static29.method489(true);
		Static42.method851(false);
		Static29.method489(false);
		Static81.method1354();
		Static47.method937();
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (!Static123.aBoolean122) {
			local39 = Static98.anInt2371;
			local45 = Static142.anInt3266 + Static29.anInt697 & 0x7FF;
			if (local39 < Static71.anInt1843 / 256) {
				local39 = Static71.anInt1843 / 256;
			}
			if (Static168.aBooleanArray19[4] && Static34.anIntArray76[4] + 128 > local39) {
				local39 = Static34.anIntArray76[4] + 128;
			}
			Static54.method1022(local39, Static178.anInt3927, local39 * 3 + 600, Static4.anInt3714, Static168.method2689(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700, anInt2422) - 50, local45);
		}
		if (Static123.aBoolean122) {
			local39 = Static33.method586();
		} else {
			local39 = Static74.method1248();
		}
		@Pc(105) int local105 = Static163.anInt3624;
		local45 = Static134.anInt3130;
		@Pc(109) int local109 = Static94.anInt2298;
		@Pc(111) int local111 = Static70.anInt1833;
		@Pc(113) int local113 = Static124.anInt2967;
		@Pc(156) int local156;
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			if (Static168.aBooleanArray19[local115]) {
				local156 = (int) ((double) (Static42.anIntArray105[local115] * 2 + 1) * Math.random() - (double) Static42.anIntArray105[local115] + Math.sin((double) Static22.anIntArray36[local115] / 100.0D * (double) Static81.anIntArray203[local115]) * (double) Static34.anIntArray76[local115]);
				if (local115 == 1) {
					Static94.anInt2298 += local156;
				}
				if (local115 == 4) {
					Static163.anInt3624 += local156;
					if (Static163.anInt3624 < 128) {
						Static163.anInt3624 = 128;
					}
					if (Static163.anInt3624 > 383) {
						Static163.anInt3624 = 383;
					}
				}
				if (local115 == 2) {
					Static70.anInt1833 += local156;
				}
				if (local115 == 3) {
					Static124.anInt2967 = Static124.anInt2967 + local156 & 0x7FF;
				}
				if (local115 == 0) {
					Static134.anInt3130 += local156;
				}
			}
		}
		local156 = Static85.anInt676;
		@Pc(213) int local213 = Static149.anInt3582;
		if (local156 >= arg1 && local156 < arg1 + arg2 && arg0 <= local213 && arg3 + arg0 > local213) {
			Static45.anInt2605 = 0;
			Static45.aBoolean111 = true;
			Static45.anInt2603 = Static85.anInt676 - arg1;
			Static45.anInt2602 = Static149.anInt3582 - arg0;
		} else {
			Static45.aBoolean111 = false;
			Static45.anInt2605 = 0;
		}
		Static177.method2831();
		Static103.method2210(arg1, arg0, arg2, arg3, 0);
		Static177.method2831();
		Static154.aClass62_1.method2000(Static134.anInt3130, Static94.anInt2298, Static70.anInt1833, Static163.anInt3624, Static124.anInt2967, local39);
		Static177.method2831();
		Static154.aClass62_1.method2004();
		Static27.method447(arg0, arg2, arg1, arg3);
		Static92.method1537(arg1, arg0);
		((Class88) Static132.anInterface3_1).method2824(Static22.anInt526);
		Static161.method2583(arg1, arg2, arg3, arg0);
		Static163.anInt3624 = local105;
		Static94.anInt2298 = local109;
		Static124.anInt2967 = local113;
		Static70.anInt1833 = local111;
		Static134.anInt3130 = local45;
		if (Static59.aBoolean59 && Static66.method1177() == 0) {
			Static59.aBoolean59 = false;
		}
		if (Static59.aBoolean59) {
			Static103.method2210(arg1, arg0, arg2, arg3, 0);
			Static139.method2339(Static31.aClass46_232, false);
		}
		if (!Static59.aBoolean59 && !Static105.aBoolean103 && arg1 <= local156 && arg2 + arg1 > local156 && local213 >= arg0 && local213 < arg0 + arg3) {
			Static97.method1165(local156, arg1, arg0, local213);
		}
	}
}
