import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pe", name = "Qb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_875 = Static121.method2047("wave2:");

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "Lclient!qc;")
	public static Class60 aClass60_867 = aClass60_875;

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
	public static int anInt2110 = 0;

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!pe", name = "ib", descriptor = "Lclient!qc;")
	public static Class60 aClass60_868 = Static121.method2047("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_869 = Static121.method2047("(U1");

	@OriginalMember(owner = "client!pe", name = "vb", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!pe", name = "Db", descriptor = "Lclient!qc;")
	public static Class60 aClass60_871 = aClass60_875;

	@OriginalMember(owner = "client!pe", name = "Tb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_876 = Static121.method2047("Error loading your profile)3");

	@OriginalMember(owner = "client!pe", name = "Ib", descriptor = "Lclient!qc;")
	public static Class60 aClass60_872 = aClass60_876;

	@OriginalMember(owner = "client!pe", name = "Mb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_873 = Static121.method2047("null");

	@OriginalMember(owner = "client!pe", name = "Ob", descriptor = "Lclient!qc;")
	public static Class60 aClass60_874 = null;

	@OriginalMember(owner = "client!pe", name = "Sb", descriptor = "I")
	public static int anInt2139 = 0;

	@OriginalMember(owner = "client!pe", name = "Ub", descriptor = "Lclient!qc;")
	public static Class60 aClass60_877 = Static121.method2047("blaugr-Un:");

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method1541() {
		aClass60_867 = null;
		aClass60_873 = null;
		aClass60_872 = null;
		aClass60_871 = null;
		aClass60_869 = null;
		aClass60_876 = null;
		aClass60_877 = null;
		aClass60_875 = null;
		aClass60_868 = null;
		aClass60_874 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)V")
	public static void method1544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 == Static127.anInt2975 && arg1 == Static58.anInt1441 && (Static127.anInt2976 == arg4 || !Static61.aBoolean57)) {
			return;
		}
		Static127.anInt2975 = arg2;
		Static127.anInt2976 = arg4;
		if (!Static61.aBoolean57) {
			Static127.anInt2976 = 0;
		}
		Static58.anInt1441 = arg1;
		Static4.method32(25);
		Static71.method1377(Static84.aClass60_833, true);
		@Pc(48) int local48 = Static99.anInt2424;
		Static99.anInt2424 = (arg1 - 6) * 8;
		@Pc(56) int local56 = Static106.anInt2518;
		Static106.anInt2518 = (arg2 - 6) * 8;
		@Pc(66) int local66 = Static99.anInt2424 - local48;
		@Pc(73) int local73 = Static106.anInt2518 - local56;
		for (@Pc(77) int local77 = 0; local77 < 32768; local77++) {
			@Pc(83) Class4_Sub4_Sub1_Sub2_Sub1 local83 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local77];
			if (local83 != null) {
				for (@Pc(87) int local87 = 0; local87 < 10; local87++) {
					local83.anIntArray286[local87] -= local73;
					local83.anIntArray288[local87] -= local66;
				}
				local83.anInt2601 -= local66 * 128;
				local83.anInt2620 -= local73 * 128;
			}
		}
		for (@Pc(137) int local137 = 0; local137 < 2048; local137++) {
			@Pc(143) Class4_Sub4_Sub1_Sub2_Sub2 local143 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local137];
			if (local143 != null) {
				for (@Pc(147) int local147 = 0; local147 < 10; local147++) {
					local143.anIntArray286[local147] -= local73;
					local143.anIntArray288[local147] -= local66;
				}
				local143.anInt2601 -= local66 * 128;
				local143.anInt2620 -= local73 * 128;
			}
		}
		Static129.anInt3003 = arg4;
		Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.method1880(arg0, false, arg3);
		@Pc(203) byte local203 = 0;
		@Pc(205) byte local205 = 104;
		@Pc(207) byte local207 = 1;
		@Pc(209) byte local209 = 0;
		if (local73 < 0) {
			local207 = -1;
			local203 = 103;
			local205 = -1;
		}
		@Pc(219) byte local219 = 104;
		@Pc(221) byte local221 = 1;
		if (local66 < 0) {
			local219 = -1;
			local221 = -1;
			local209 = 103;
		}
		for (@Pc(231) int local231 = local203; local231 != local205; local231 += local207) {
			for (@Pc(235) int local235 = local209; local235 != local219; local235 += local221) {
				@Pc(241) int local241 = local235 + local66;
				@Pc(245) int local245 = local231 + local73;
				for (@Pc(247) int local247 = 0; local247 < 4; local247++) {
					if (local245 >= 0 && local241 >= 0 && local245 < 104 && local241 < 104) {
						Static74.aClass70ArrayArrayArray1[local247][local231][local235] = Static74.aClass70ArrayArrayArray1[local247][local245][local241];
					} else {
						Static74.aClass70ArrayArrayArray1[local247][local231][local235] = null;
					}
				}
			}
		}
		for (@Pc(319) Class4_Sub19 local319 = (Class4_Sub19) Static52.aClass70_12.method1939(); local319 != null; local319 = (Class4_Sub19) Static52.aClass70_12.method1936()) {
			local319.anInt2496 -= local73;
			local319.anInt2499 -= local66;
			if (local319.anInt2496 < 0 || local319.anInt2499 < 0 || local319.anInt2496 >= 104 || local319.anInt2499 >= 104) {
				local319.method2124();
			}
		}
		Static130.anInt3022 = 0;
		if (Static81.anInt1951 != 0) {
			Static123.anInt2922 -= local66;
			Static81.anInt1951 -= local73;
		}
		Static67.anInt2823 = -1;
		Static110.aBoolean115 = false;
		Static127.aClass70_18.method1933();
		Static129.aClass70_19.method1933();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method1547(@OriginalArg(0) Class4_Sub4_Sub1_Sub2 arg0) {
		if (arg0.anInt2628 == 0) {
			return;
		}
		@Pc(41) int local41;
		@Pc(35) int local35;
		if (arg0.anInt2625 != -1 && arg0.anInt2625 < 32768) {
			@Pc(26) Class4_Sub4_Sub1_Sub2_Sub1 local26 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[arg0.anInt2625];
			if (local26 != null) {
				local35 = arg0.anInt2601 - local26.anInt2601;
				local41 = arg0.anInt2620 - local26.anInt2620;
				if (local41 != 0 || local35 != 0) {
					arg0.anInt2634 = (int) (Math.atan2((double) local41, (double) local35) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(69) int local69;
		if (arg0.anInt2625 >= 32768) {
			local69 = arg0.anInt2625 - 32768;
			if (Static18.anInt467 == local69) {
				local69 = 2047;
			}
			@Pc(82) Class4_Sub4_Sub1_Sub2_Sub2 local82 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local69];
			if (local82 != null) {
				local35 = arg0.anInt2620 - local82.anInt2620;
				@Pc(97) int local97 = arg0.anInt2601 - local82.anInt2601;
				if (local35 != 0 || local97 != 0) {
					arg0.anInt2634 = (int) (Math.atan2((double) local35, (double) local97) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2641 != 0 || arg0.anInt2607 != 0) && (arg0.anInt2600 == 0 || arg0.anInt2587 > 0)) {
			local69 = arg0.anInt2620 - (arg0.anInt2641 - Static106.anInt2518 - Static106.anInt2518) * 64;
			local41 = arg0.anInt2601 - (arg0.anInt2607 - Static99.anInt2424 - Static99.anInt2424) * 64;
			if (local69 != 0 || local41 != 0) {
				arg0.anInt2634 = (int) (Math.atan2((double) local69, (double) local41) * 325.949D) & 0x7FF;
			}
			arg0.anInt2641 = 0;
			arg0.anInt2607 = 0;
		}
		local69 = arg0.anInt2634 - arg0.anInt2591 & 0x7FF;
		if (local69 == 0) {
			arg0.anInt2615 = 0;
			return;
		}
		arg0.anInt2615++;
		@Pc(214) boolean local214;
		if (local69 <= 1024) {
			arg0.anInt2591 += arg0.anInt2628;
			local214 = true;
			if (local69 < arg0.anInt2628 || 2048 - arg0.anInt2628 < local69) {
				arg0.anInt2591 = arg0.anInt2634;
				local214 = false;
			}
			if (arg0.anInt2632 == arg0.anInt2594 && (arg0.anInt2615 > 25 || local214)) {
				if (arg0.anInt2603 == -1) {
					arg0.anInt2632 = arg0.anInt2637;
				} else {
					arg0.anInt2632 = arg0.anInt2603;
				}
			}
		} else {
			local214 = true;
			arg0.anInt2591 -= arg0.anInt2628;
			if (arg0.anInt2628 > local69 || local69 > 2048 - arg0.anInt2628) {
				local214 = false;
				arg0.anInt2591 = arg0.anInt2634;
			}
			if (arg0.anInt2594 == arg0.anInt2632 && (arg0.anInt2615 > 25 || local214)) {
				if (arg0.anInt2590 == -1) {
					arg0.anInt2632 = arg0.anInt2637;
				} else {
					arg0.anInt2632 = arg0.anInt2590;
				}
			}
		}
		arg0.anInt2591 &= 0x7FF;
	}
}
