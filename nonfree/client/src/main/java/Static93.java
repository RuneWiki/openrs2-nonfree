import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!la", name = "H", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	public static int anInt2343 = 2;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!ch;")
	public static Class14 aClass14_120 = new Class14(64);

	@OriginalMember(owner = "client!la", name = "D", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Z")
	public static boolean aBoolean115 = true;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1397 = Static107.method1838("jlv");

	@OriginalMember(owner = "client!la", name = "J", descriptor = "I")
	public static int anInt2353 = 0;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1627() {
		Static101.aClass35_6 = new Class35(32);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZ)V")
	public static void method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static100.anInt2509 == 2) {
			Static10.method319(Static64.anInt1756 + (Static125.anInt2945 - Static3.anInt2434 << 7), Static90.anInt2311 * 2, (Static21.anInt727 - Static39.anInt1055 << 7) + Static169.anInt3800);
			if (Static125.anInt2948 > -1 && Static156.anInt3491 % 20 < 10) {
				Static102.aClass2_Sub4_Sub3_Sub4Array8[0].method2829(Static125.anInt2948 + arg1 - 12, arg0 + -28 + Static167.anInt3744);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public static void method1629() {
		if (Static177.aBoolean170 && Static142.anInt3246 != Static103.anInt2568) {
			Static149.method2324(Static127.anInt3016, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], Static142.anInt3243, Static103.anInt2568);
		} else if (Static103.anInt2568 != Static23.anInt750) {
			Static23.anInt750 = Static103.anInt2568;
			Static120.method1975(Static103.anInt2568);
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	public static void method1630() {
		aClass28_1397 = null;
		anIntArray227 = null;
		aClass14_120 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILclient!ff;)V")
	public static void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class24 arg2) {
		if (Static19.anInt890 != 0 && Static19.anInt890 != 3) {
			return;
		}
		@Pc(18) int local18 = arg0 - arg2.anInt1357 / 2;
		@Pc(25) int local25 = arg1 - arg2.anInt1427 / 2;
		@Pc(31) int local31 = Static110.anInt2692 + Static66.anInt1789 & 0x7FF;
		@Pc(35) int local35 = Class2_Sub4_Sub3_Sub1.anIntArray60[local31];
		@Pc(48) int local48 = (Static178.anInt3957 + 256) * local35 >> 8;
		@Pc(52) int local52 = Class2_Sub4_Sub3_Sub1.anIntArray58[local31];
		@Pc(60) int local60 = (Static178.anInt3957 + 256) * local52 >> 8;
		@Pc(71) int local71 = local25 * local48 - local60 * local18 >> 11;
		@Pc(82) int local82 = local25 * local60 + local18 * local48 >> 11;
		@Pc(90) int local90 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 + local82 >> 7;
		@Pc(98) int local98 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 - local71 >> 7;
		@Pc(118) boolean local118 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 1, local90, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local98, true, 0);
		if (!local118) {
			return;
		}
		Static128.aClass2_Sub2_Sub1_2.method1700(local18);
		Static128.aClass2_Sub2_Sub1_2.method1700(local25);
		Static128.aClass2_Sub2_Sub1_2.method1696(Static66.anInt1789);
		Static128.aClass2_Sub2_Sub1_2.method1700(57);
		Static128.aClass2_Sub2_Sub1_2.method1700(Static110.anInt2692);
		Static128.aClass2_Sub2_Sub1_2.method1700(Static178.anInt3957);
		Static128.aClass2_Sub2_Sub1_2.method1700(89);
		Static128.aClass2_Sub2_Sub1_2.method1696(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633);
		Static128.aClass2_Sub2_Sub1_2.method1696(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635);
		Static128.aClass2_Sub2_Sub1_2.method1700(Static135.anInt3098);
		Static128.aClass2_Sub2_Sub1_2.method1700(63);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILclient!gg;Lclient!gg;)V")
	public static void method1632(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) Class28 arg2) {
		Static135.method2138(arg2, arg0, null, arg1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!th;ILclient!th;)V")
	public static void method1633(@OriginalArg(0) Class2_Sub4_Sub3_Sub2_Sub1 arg0, @OriginalArg(2) Class2_Sub4_Sub3_Sub2_Sub1 arg1) {
		if (Static82.aBoolean103) {
			Static12.method361(arg1, arg0);
			return;
		}
		if (Static124.anInt2924 == 0 || Static124.anInt2924 == 5) {
			arg1.method2457(Static66.aClass28_1044, 382, 225, 16777215, -1);
			Static161.method2804(230, 233, 304, 34, 9179409);
			Static161.method2804(231, 234, 302, 32, 0);
			Static161.method2809(232, 235, Static107.anInt2609 * 3, 30, 9179409);
			Static161.method2809(Static107.anInt2609 * 3 + 232, 235, 300 - Static107.anInt2609 * 3, 30, 0);
			arg1.method2457(Static138.aClass28_1857, 382, 256, 16777215, -1);
		}
		@Pc(111) short local111;
		@Pc(119) int local119;
		if (Static124.anInt2924 == 20) {
			Static82.aClass2_Sub4_Sub3_Sub3_3.method2242(382 - Static82.aClass2_Sub4_Sub3_Sub3_3.anInt3233 / 2, -(Static82.aClass2_Sub4_Sub3_Sub3_3.anInt3234 / 2) + 271);
			local111 = 211;
			arg1.method2457(Static138.aClass28_1861, 382, 211, 16776960, 0);
			local119 = local111 + 15;
			arg1.method2457(Static138.aClass28_1855, 382, 226, 16776960, 0);
			@Pc(127) int local127 = local119 + 15;
			arg1.method2457(Static138.aClass28_1859, 382, 241, 16776960, 0);
			@Pc(135) int local135 = local127 + 15;
			@Pc(136) int local136 = local135 + 10;
			arg1.method2454(Static83.method1481(new Class28[] { Static170.aClass28_2448, Static68.method2470(Static138.aClass28_1854) }), 272, 266, 16777215, 0);
			@Pc(156) int local156 = local136 + 15;
			arg1.method2454(Static83.method1481(new Class28[] { Static81.aClass28_1461, Static138.aClass28_1856.method1125() }), 274, 281, 16777215, 0);
			@Pc(177) int local177 = local156 + 15;
		}
		if (Static124.anInt2924 == 10) {
			Static82.aClass2_Sub4_Sub3_Sub3_3.method2242(202, 171);
			if (Static74.anInt1949 == 0) {
				local111 = 251;
				arg1.method2457(Static59.aClass28_884, 382, 251, 16776960, 0);
				local119 = local111 + 30;
				Static119.aClass2_Sub4_Sub3_Sub3_4.method2242(229, 271);
				arg1.method2458(Static85.aClass28_1280, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static119.aClass2_Sub4_Sub3_Sub3_4.method2242(389, 271);
				arg1.method2458(Static13.aClass28_404, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static74.anInt1949 == 2) {
				local111 = 211;
				arg1.method2457(Static138.aClass28_1861, 382, 211, 16776960, 0);
				local119 = local111 + 15;
				arg1.method2457(Static138.aClass28_1855, 382, 226, 16776960, 0);
				local119 += 15;
				arg1.method2457(Static138.aClass28_1859, 382, 241, 16776960, 0);
				local119 += 15;
				local119 += 10;
				@Pc(232) boolean local232;
				if (Static125.anInt2950 == 0 && Static156.anInt3491 % 40 < 20 && Static131.aBoolean138) {
					local232 = true;
				} else {
					local232 = false;
				}
				arg1.method2454(Static83.method1481(new Class28[] { Static170.aClass28_2448, Static68.method2470(Static138.aClass28_1854), local232 ? Static176.aClass28_2331 : Static138.aClass28_1860 }), 272, 266, 16777215, 0);
				local119 += 15;
				if (Static125.anInt2950 == 1 && Static156.anInt3491 % 40 < 20 && Static131.aBoolean138) {
					local232 = true;
				} else {
					local232 = false;
				}
				arg1.method2454(Static83.method1481(new Class28[] { Static81.aClass28_1461, Static138.aClass28_1856.method1125(), local232 ? Static176.aClass28_2331 : Static138.aClass28_1860 }), 274, 281, 16777215, 0);
				local119 += 15;
				Static119.aClass2_Sub4_Sub3_Sub3_4.method2242(229, 301);
				arg1.method2457(Static109.aClass28_1562, 302, 326, 16777215, 0);
				Static119.aClass2_Sub4_Sub3_Sub3_4.method2242(389, 301);
				arg1.method2457(Static95.aClass28_1404, 462, 326, 16777215, 0);
			} else if (Static74.anInt1949 == 3) {
				arg1.method2457(Static98.aClass28_1422, 382, 211, 16776960, 0);
				local111 = 236;
				arg1.method2457(Static9.aClass28_331, 382, 236, 16777215, 0);
				local119 = local111 + 15;
				arg1.method2457(Static118.aClass28_2376, 382, 251, 16777215, 0);
				local119 += 15;
				arg1.method2457(Static160.aClass28_2057, 382, 266, 16777215, 0);
				local119 += 15;
				arg1.method2457(Static79.aClass28_1211, 382, 281, 16777215, 0);
				Static119.aClass2_Sub4_Sub3_Sub3_4.method2242(309, 301);
				arg1.method2457(Static95.aClass28_1404, 382, 326, 16777215, 0);
				local119 += 15;
			}
		}
		if (Static51.anInt1940 != 1) {
			if (Static98.anInt2454 > 0) {
				Static28.method587(Static98.anInt2454);
				Static98.anInt2454 = 0;
			}
			Static166.method2584();
		}
		Static124.aClass2_Sub4_Sub3_Sub3Array5[Static171.aBoolean167 ? 1 : 0].method2242(725, 463);
		if (Static124.anInt2924 <= 5 || Static58.anInt1513 == 2 || Static22.anInt739 != 0) {
			return;
		}
		if (Static79.aClass2_Sub4_Sub3_Sub3_2 == null) {
			Static79.aClass2_Sub4_Sub3_Sub3_2 = Static147.method2307(Static138.aClass28_1860, Static12.aClass28_375, Static101.aClass40_Sub1_16);
			return;
		}
		Static79.aClass2_Sub4_Sub3_Sub3_2.method2242(5, 463);
		arg1.method2457(Static83.method1481(new Class28[] { Static107.aClass28_1543, Static62.aClass28_957, Static158.method2411(Static97.anInt2448) }), 55, 478, 16777215, 0);
		if (Static101.aClass82_2 == null) {
			arg0.method2457(Static47.aClass28_949, 55, 492, 16777215, 0);
		} else {
			arg0.method2457(Static122.aClass28_1706, 55, 492, 16777215, 0);
		}
	}
}
