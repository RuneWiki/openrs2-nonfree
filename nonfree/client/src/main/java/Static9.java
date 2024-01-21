import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array1;

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
	public static int anInt125;

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "Lclient!tf;")
	public static Class4_Sub9 aClass4_Sub9_2;

	@OriginalMember(owner = "client!bc", name = "ob", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!bc", name = "qb", descriptor = "I")
	public static int anInt136;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Lclient!od;")
	private static Class60 aClass60_65 = Static41.method597("scroll:");

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	public static int anInt106 = 1;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
	public static int anInt112 = 0;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "Lclient!od;")
	public static Class60 aClass60_66 = Static41.method597("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
	public static int anInt116 = 0;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "Lclient!od;")
	public static Class60 aClass60_67 = aClass60_65;

	@OriginalMember(owner = "client!bc", name = "ub", descriptor = "Lclient!od;")
	public static Class60 aClass60_68 = Static41.method597("Clientscript error in: ");

	@OriginalMember(owner = "client!bc", name = "Pb", descriptor = "Lclient!od;")
	public static Class60 aClass60_69 = aClass60_65;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method92() {
		if (Static75.aClass4_Sub14_9 != null || Static81.aClass4_Sub14_12 != null) {
			return;
		}
		@Pc(18) int local18 = Static97.anInt2284;
		@Pc(36) int local36;
		@Pc(96) int local96;
		@Pc(102) int local102;
		if (Static12.aBoolean107) {
			if (local18 != 1) {
				local36 = Static36.anInt1006;
				local96 = Static85.anInt2015;
				if (local36 < Static60.anInt2966 - 10 || Static60.anInt2966 + Static22.anInt800 + 10 < local36 || local96 < Static48.anInt1182 - 10 || local96 > Static25.anInt848 + Static48.anInt1182 + 10) {
					Static12.aBoolean107 = false;
					Static97.method1576(Static48.anInt1182, Static25.anInt848, Static22.anInt800, Static60.anInt2966);
				}
			}
			if (local18 != 1) {
				return;
			}
			local102 = Static22.anInt800;
			local96 = Static48.anInt1182;
			local36 = Static60.anInt2966;
			@Pc(248) int local248 = Static63.anInt1591;
			@Pc(250) int local250 = -1;
			@Pc(252) int local252 = Static122.anInt2791;
			for (@Pc(254) int local254 = 0; local254 < Static48.anInt1184; local254++) {
				@Pc(268) int local268 = local96 + (Static48.anInt1184 + -1 - local254) * 15 + 31;
				if (local252 > local36 && local102 + local36 > local252 && local268 - 13 < local248 && local248 < local268 + 3) {
					local250 = local254;
				}
			}
			if (local250 != -1) {
				Static96.method1570(local250);
			}
			Static12.aBoolean107 = false;
			Static97.method1576(Static48.anInt1182, Static25.anInt848, Static22.anInt800, Static60.anInt2966);
			return;
		}
		if (local18 == 1 && Static48.anInt1184 > 0) {
			local36 = Static82.anIntArray226[Static48.anInt1184 - 1];
			if (local36 == 26 || local36 == 31 || local36 == 16 || local36 == 18 || local36 == 50 || local36 == 9 || local36 == 42 || local36 == 34 || local36 == 12 || local36 == 17 || local36 == 47 || local36 == 1004) {
				local96 = Static25.anIntArray87[Static48.anInt1184 - 1];
				local102 = Static61.anIntArray178[Static48.anInt1184 - 1];
				@Pc(106) Class4_Sub14 local106 = Static61.method991(local102);
				if (Static38.method576(Static38.method575(local106)) || Static40.method584(Static38.method575(local106))) {
					Static74.aBoolean65 = false;
					Static120.anInt2753 = 0;
					if (Static75.aClass4_Sub14_9 != null) {
						Static36.method558(Static75.aClass4_Sub14_9);
					}
					Static75.aClass4_Sub14_9 = Static61.method991(local102);
					Static69.anInt1721 = local96;
					Static16.anInt553 = Static63.anInt1591;
					Static90.anInt2122 = Static122.anInt2791;
					Static36.method558(Static75.aClass4_Sub14_9);
					return;
				}
			}
		}
		if (local18 == 1 && (Static18.anInt630 == 1 && Static48.anInt1184 > 2 || Static132.method1987(Static48.anInt1184 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static48.anInt1184 > 0) {
			Static96.method1570(Static48.anInt1184 - 1);
		}
		if (local18 == 2 && Static48.anInt1184 > 0) {
			Static84.method1351();
			return;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!c;Lclient!c;I)I")
	public static int method94(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1) {
		@Pc(1) int local1 = 0;
		if (arg0.method1775(Static85.aClass60_836, Static68.aClass60_674)) {
			local1++;
		}
		if (arg1.method1775(Static60.aClass60_1146, Static68.aClass60_674)) {
			local1++;
		}
		if (arg1.method1775(Static14.aClass60_161, Static68.aClass60_674)) {
			local1++;
		}
		if (arg1.method1775(Static42.aClass60_413, Static68.aClass60_674)) {
			local1++;
		}
		if (arg1.method1775(Static66.aClass60_635, Static68.aClass60_674)) {
			local1++;
		}
		if (arg1.method1775(Static31.aClass60_316, Static68.aClass60_674)) {
			local1++;
		}
		arg1.method1775(Static6.aClass60_39, Static68.aClass60_674);
		arg1.method1775(Static75.aClass60_464, Static68.aClass60_674);
		arg1.method1775(Static31.aClass60_313, Static68.aClass60_674);
		arg1.method1775(Static23.aClass60_248, Static68.aClass60_674);
		arg1.method1775(Static59.aClass60_568, Static68.aClass60_674);
		return local1;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Lclient!fd;")
	public static Class4_Sub3_Sub7 method98(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub7 local10 = (Class4_Sub3_Sub7) Static76.aClass12_14.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static56.aClass10_18.method1774(3, arg0);
		local10 = new Class4_Sub3_Sub7();
		if (local20 != null) {
			local10.method556(new Class4_Sub9(local20));
		}
		Static76.aClass12_14.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method102() {
		aClass60_65 = null;
		aClass60_67 = null;
		aClass60_69 = null;
		aClass60_68 = null;
		aClass60_66 = null;
		aClass4_Sub3_Sub6_Sub2Array1 = null;
		aByteArrayArrayArray1 = null;
		aClass4_Sub9_2 = null;
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	public static void method112() {
		for (@Pc(10) Class4_Sub3_Sub1_Sub3 local10 = (Class4_Sub3_Sub1_Sub3) Static69.aClass45_13.method982(); local10 != null; local10 = (Class4_Sub3_Sub1_Sub3) Static69.aClass45_13.method986()) {
			if (local10.anInt679 != Static77.anInt1866 || local10.anInt675 < Static118.anInt2741) {
				local10.method1989();
			} else if (local10.anInt681 <= Static118.anInt2741) {
				if (local10.anInt671 > 0) {
					@Pc(46) Class4_Sub3_Sub1_Sub2_Sub2 local46 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local10.anInt671 - 1];
					if (local46 != null && local46.anInt1440 >= 0 && local46.anInt1440 < 13312 && local46.anInt1407 >= 0 && local46.anInt1407 < 13312) {
						local10.method370(local46.anInt1440, local46.anInt1407, Static55.method882(local46.anInt1407, local46.anInt1440, local10.anInt679) - local10.anInt677, Static118.anInt2741);
					}
				}
				if (local10.anInt671 < 0) {
					@Pc(96) int local96 = -local10.anInt671 - 1;
					@Pc(103) Class4_Sub3_Sub1_Sub2_Sub1 local103;
					if (Static94.anInt2216 == local96) {
						local103 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1;
					} else {
						local103 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local96];
					}
					if (local103 != null && local103.anInt1440 >= 0 && local103.anInt1440 < 13312 && local103.anInt1407 >= 0 && local103.anInt1407 < 13312) {
						local10.method370(local103.anInt1440, local103.anInt1407, Static55.method882(local103.anInt1407, local103.anInt1440, local10.anInt679) - local10.anInt677, Static118.anInt2741);
					}
				}
				local10.method371(Static116.anInt2713);
				Static30.aClass48_1.method1046(Static77.anInt1866, (int) local10.aDouble1, (int) local10.aDouble3, (int) local10.aDouble6, 60, local10, local10.anInt674, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIBZILclient!c;I)V")
	public static void method113(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class10 arg2, @OriginalArg(6) int arg3) {
		Static133.aBoolean128 = false;
		Static72.anInt1827 = 2;
		Static82.aClass10_22 = arg2;
		Static44.anInt2165 = arg3;
		Static130.anInt2874 = arg1;
		anInt112 = 1;
		Static118.anInt2733 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!tf;I)Lclient!od;")
	public static Class60 method123(@OriginalArg(0) Class4_Sub9 arg0) {
		return Static7.method65(arg0);
	}
}
