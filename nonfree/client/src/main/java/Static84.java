import java.awt.Graphics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "[I")
	public static int[] anIntArray227 = new int[5];

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!od;")
	private static Class60 aClass60_824 = Static41.method597("Please remove ");

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
	public static int[] anIntArray228 = new int[2000];

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean70 = false;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_825 = aClass60_824;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_826 = aClass60_824;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!me;Lclient!me;)V")
	public static void method1349(@OriginalArg(1) Class4_Sub3_Sub6_Sub1_Sub1 arg0, @OriginalArg(2) Class4_Sub3_Sub6_Sub1_Sub1 arg1) {
		if (Static47.aBoolean42) {
			Static121.method1915(arg0, arg1);
			return;
		}
		if (Static120.anInt2757 == 0 || Static120.anInt2757 == 5) {
			arg1.method1202(Static20.aClass60_214, 382, 225, 16777215, -1);
			Static34.method1650(230, 233, 304, 34, 9179409);
			Static34.method1650(231, 234, 302, 32, 0);
			Static34.method1649(232, 235, Static97.anInt2283 * 3, 30, 9179409);
			Static34.method1649(Static97.anInt2283 * 3 + 232, 235, 300 - Static97.anInt2283 * 3, 30, 0);
			arg1.method1202(Static68.aClass60_682, 382, 256, 16777215, -1);
		}
		@Pc(110) short local110;
		@Pc(118) int local118;
		if (Static120.anInt2757 == 20) {
			Static4.aClass4_Sub3_Sub6_Sub2_1.method1558(382 - Static4.aClass4_Sub3_Sub6_Sub2_1.anInt2255 / 2, -(Static4.aClass4_Sub3_Sub6_Sub2_1.anInt2256 / 2) + 271);
			local110 = 211;
			arg1.method1202(Static68.aClass60_677, 382, 211, 16776960, 0);
			local118 = local110 + 15;
			arg1.method1202(Static68.aClass60_675, 382, 226, 16776960, 0);
			@Pc(126) int local126 = local118 + 15;
			arg1.method1202(Static68.aClass60_683, 382, 241, 16776960, 0);
			@Pc(134) int local134 = local126 + 15;
			@Pc(135) int local135 = local134 + 10;
			arg1.method1204(Static12.method1761(new Class60[] { Static112.aClass60_1039, Static93.method1199(Static68.aClass60_670) }), 272, 266, 16777215, 0);
			@Pc(155) int local155 = local135 + 15;
			arg1.method1204(Static12.method1761(new Class60[] { Static2.aClass60_6, Static68.aClass60_665.method1307() }), 274, 281, 16777215, 0);
			@Pc(176) int local176 = local155 + 15;
		}
		if (Static120.anInt2757 == 10) {
			Static4.aClass4_Sub3_Sub6_Sub2_1.method1558(202, 171);
			if (Static115.anInt2694 == 0) {
				local110 = 251;
				arg1.method1202(Static78.aClass60_785, 382, 251, 16776960, 0);
				Static86.aClass4_Sub3_Sub6_Sub2_3.method1558(229, 271);
				arg1.method1210(Static62.aClass60_583, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				local118 = local110 + 30;
				Static86.aClass4_Sub3_Sub6_Sub2_3.method1558(389, 271);
				arg1.method1210(Static132.aClass60_1137, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static115.anInt2694 == 2) {
				local110 = 211;
				arg1.method1202(Static68.aClass60_677, 382, 211, 16776960, 0);
				local118 = local110 + 15;
				arg1.method1202(Static68.aClass60_675, 382, 226, 16776960, 0);
				local118 += 15;
				arg1.method1202(Static68.aClass60_683, 382, 241, 16776960, 0);
				local118 += 15;
				local118 += 10;
				arg1.method1204(Static12.method1761(new Class60[] { Static112.aClass60_1039, Static93.method1199(Static68.aClass60_670), Static29.anInt880 == 0 & Static118.anInt2741 % 40 < 20 ? Static108.aClass60_1003 : Static68.aClass60_674 }), 272, 266, 16777215, 0);
				local118 += 15;
				arg1.method1204(Static12.method1761(new Class60[] { Static2.aClass60_6, Static68.aClass60_665.method1307(), Static29.anInt880 == 1 & Static118.anInt2741 % 40 < 20 ? Static108.aClass60_1003 : Static68.aClass60_674 }), 274, 281, 16777215, 0);
				local118 += 15;
				Static86.aClass4_Sub3_Sub6_Sub2_3.method1558(229, 301);
				arg1.method1202(Static2.aClass60_5, 302, 326, 16777215, 0);
				Static86.aClass4_Sub3_Sub6_Sub2_3.method1558(389, 301);
				arg1.method1202(Static119.aClass60_1072, 462, 326, 16777215, 0);
			} else if (Static115.anInt2694 == 3) {
				local110 = 236;
				arg1.method1202(Static48.aClass60_456, 382, 211, 16776960, 0);
				arg1.method1202(Static127.aClass60_421, 382, 236, 16777215, 0);
				local118 = local110 + 15;
				arg1.method1202(Static90.aClass60_876, 382, 251, 16777215, 0);
				local118 += 15;
				arg1.method1202(Static122.aClass60_1086, 382, 266, 16777215, 0);
				local118 += 15;
				arg1.method1202(Static38.aClass60_391, 382, 281, 16777215, 0);
				Static86.aClass4_Sub3_Sub6_Sub2_3.method1558(309, 301);
				local118 += 15;
				arg1.method1202(Static119.aClass60_1072, 382, 326, 16777215, 0);
			}
		}
		if (Static19.anInt680 != 1) {
			if (Static97.anInt2278 > 0) {
				Static43.method625(Static97.anInt2278);
				Static97.anInt2278 = 0;
			}
			Static52.method860();
		}
		Static71.aClass4_Sub3_Sub6_Sub2Array7[Static41.aBoolean41 ? 1 : 0].method1558(725, 463);
		if (Static120.anInt2757 > 5 && Static49.anInt1206 != 2 && Static11.anInt428 == 0) {
			if (Static97.aClass4_Sub3_Sub6_Sub2_4 == null) {
				Static97.aClass4_Sub3_Sub6_Sub2_4 = Static122.method1921(Static16.aClass10_Sub1_4, Static59.aClass60_568, Static68.aClass60_674);
			} else {
				Static97.aClass4_Sub3_Sub6_Sub2_4.method1558(5, 463);
				arg1.method1202(Static12.method1761(new Class60[] { Static24.aClass60_271, Static113.aClass60_488, Static65.method1051(Static42.anInt1103) }), 55, 478, 16777215, 0);
				if (Static105.aClass52_1 == null) {
					arg0.method1202(Static77.aClass60_778, 55, 492, 16777215, 0);
				} else {
					arg0.method1202(Static103.aClass60_966, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(623) Graphics local623 = Static110.aCanvas1.getGraphics();
			Static86.aClass14_1.method690(local623);
		} catch (@Pc(631) Exception local631) {
			Static110.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public static void method1350() {
		aClass60_826 = null;
		aCalendar1 = null;
		anIntArray228 = null;
		aClass60_825 = null;
		anIntArray229 = null;
		anIntArray227 = null;
		aClass60_824 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1351() {
		@Pc(9) int local9 = Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1218(Static33.aClass60_335);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static48.anInt1184; local11++) {
			local19 = Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1218(Static48.method668(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		Static12.aBoolean107 = true;
		local9 += 8;
		Static25.anInt848 = Static48.anInt1184 * 15 + 22;
		Static22.anInt800 = local9;
		local19 = Static48.anInt1184 * 15 + 21;
		@Pc(56) int local56 = Static122.anInt2791 - local9 / 2;
		@Pc(58) int local58 = Static63.anInt1591;
		if (local9 + local56 > 765) {
			local56 = 765 - local9;
		}
		if (local56 < 0) {
			local56 = 0;
		}
		Static60.anInt2966 = local56;
		if (local19 + local58 > 503) {
			local58 = 503 - local19;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		Static48.anInt1182 = local58;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!c;ILclient!c;)V")
	public static void method1352(@OriginalArg(0) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		Static56.aClass10_18 = arg0;
		Static24.aClass10_9 = arg1;
		Static62.anInt1587 = Static56.aClass10_18.method1772(3);
	}
}
