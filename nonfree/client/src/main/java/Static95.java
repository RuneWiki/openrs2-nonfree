import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
	public static int anInt2560;

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray34;

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
	public static int anInt2571;

	@OriginalMember(owner = "client!td", name = "rb", descriptor = "Lclient!oa;")
	public static Class9 aClass9_26;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "Lclient!lc;")
	public static Class31 aClass31_885 = Static56.method1206("Cancel");

	@OriginalMember(owner = "client!td", name = "X", descriptor = "I")
	public static int anInt2558 = 0;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Lclient!lc;")
	public static Class31 aClass31_886 = Static56.method1206("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
	public static int anInt2563 = 0;

	@OriginalMember(owner = "client!td", name = "jb", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
	public static int anInt2569 = 0;

	@OriginalMember(owner = "client!td", name = "qb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_887 = Static56.method1206("To change your recovery questions:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WSet new recovery questions(W)3");

	@OriginalMember(owner = "client!td", name = "sb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_888 = Static56.method1206("@yel@0 unread messages");

	@OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
	public static int anInt2576 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method1599() {
		if (Static59.anInt2044 < 2 && Static63.anInt2118 == 0 && Static47.anInt1737 == 0) {
			return;
		}
		@Pc(36) Class31 local36;
		if (Static63.anInt2118 == 1 && Static59.anInt2044 < 2) {
			local36 = Static37.method974(new Class31[] { Static10.aClass31_132, Static40.aClass31_711, Static54.aClass31_642 });
		} else if (Static47.anInt1737 == 1 && Static59.anInt2044 < 2) {
			local36 = Static37.method974(new Class31[] { Static85.aClass31_866, Static59.aClass31_715 });
		} else {
			local36 = Static85.aClass31Array14[Static59.anInt2044 - 1];
		}
		if (Static59.anInt2044 > 2) {
			local36 = Static37.method974(new Class31[] { local36, Static70.aClass31_775, Static89.method1499(Static59.anInt2044 - 2), Static93.aClass31_872 });
		}
		Static69.aClass2_Sub1_Sub3_Sub3_5.method955(local36, 4, 16777215, Static49.anInt2694 / 1000);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class2_Sub1_Sub3_Sub2 local17;
		if (arg0 == 0) {
			local17 = (Class2_Sub1_Sub3_Sub2) Static44.aClass17_63.method786((long) arg1);
			if (local17 != null && local17.anInt689 != arg2 && local17.anInt689 != -1) {
				local17.method1695();
				local17 = null;
			}
			if (local17 != null) {
				return local17;
			}
		}
		@Pc(47) Class2_Sub1_Sub13 local47 = Static7.method178(arg1);
		if (local47.anIntArray351 == null) {
			arg2 = -1;
		}
		if (arg2 > 1) {
			@Pc(59) int local59 = -1;
			for (@Pc(61) int local61 = 0; local61 < 10; local61++) {
				if (arg2 >= local47.anIntArray348[local61] && local47.anIntArray348[local61] != 0) {
					local59 = local47.anIntArray351[local61];
				}
			}
			if (local59 != -1) {
				local47 = Static7.method178(local59);
			}
		}
		@Pc(103) Class2_Sub1_Sub4_Sub5 local103 = local47.method1546(1, true);
		if (local103 == null) {
			return null;
		}
		@Pc(109) Class2_Sub1_Sub3_Sub2 local109 = null;
		if (local47.anInt2461 != -1) {
			local109 = method1601(-1, local47.anInt2450, 10);
			if (local109 == null) {
				return null;
			}
		}
		@Pc(127) int[] local127 = Static97.method1654();
		@Pc(129) int local129 = Static81.anInt2634;
		@Pc(131) int[] local131 = Static81.anIntArray373;
		@Pc(133) int local133 = Static81.anInt2636;
		@Pc(135) int local135 = Static81.anInt2635;
		@Pc(137) int local137 = Static81.anInt2632;
		@Pc(139) int local139 = Static81.anInt2637;
		@Pc(141) int local141 = Static81.anInt2633;
		local17 = new Class2_Sub1_Sub3_Sub2(32, 32);
		Static81.method1645(local17.anIntArray89, 32, 32);
		Static85.anIntArray358 = Static97.method1653(Static85.anIntArray358);
		Static81.method1646(0, 0, 32, 32, 0);
		Static97.aBoolean136 = false;
		@Pc(166) int local166 = local47.anInt2482;
		if (arg0 == -1) {
			local166 = (int) ((double) local166 * 1.5D);
		}
		if (arg0 > 0) {
			local166 = (int) ((double) local166 * 1.04D);
		}
		@Pc(196) int local196 = local166 * Class2_Sub1_Sub3_Sub4.anIntArray379[local47.anInt2478] >> 16;
		@Pc(205) int local205 = local166 * Class2_Sub1_Sub3_Sub4.anIntArray376[local47.anInt2478] >> 16;
		local103.method920();
		local103.method923(local47.anInt2491, local47.anInt2480, local47.anInt2478, local47.anInt2458, local47.anInt2464 + local103.anInt1974 / 2 + local196, local47.anInt2464 + local205);
		for (@Pc(233) int local233 = 31; local233 >= 0; local233--) {
			for (local205 = 31; local205 >= 0; local205--) {
				if (local17.anIntArray89[local205 * 32 + local233] == 0) {
					if (local233 > 0 && local17.anIntArray89[local233 + local205 * 32 - 1] > 1) {
						local17.anIntArray89[local233 + local205 * 32] = 1;
					} else if (local205 > 0 && local17.anIntArray89[(local205 - 1) * 32 + local233] > 1) {
						local17.anIntArray89[local205 * 32 + local233] = 1;
					} else if (local233 < 31 && local17.anIntArray89[local205 * 32 + local233 + 1] > 1) {
						local17.anIntArray89[local205 * 32 + local233] = 1;
					} else if (local205 < 31 && local17.anIntArray89[local233 + (local205 + 1) * 32] > 1) {
						local17.anIntArray89[local233 + local205 * 32] = 1;
					}
				}
			}
		}
		@Pc(373) int local373;
		if (arg0 > 0) {
			for (local373 = 31; local373 >= 0; local373--) {
				for (local205 = 31; local205 >= 0; local205--) {
					if (local17.anIntArray89[local373 + local205 * 32] == 0) {
						if (local373 > 0 && local17.anIntArray89[local373 + local205 * 32 - 1] == 1) {
							local17.anIntArray89[local205 * 32 + local373] = arg0;
						} else if (local205 > 0 && local17.anIntArray89[local373 + local205 * 32 - 32] == 1) {
							local17.anIntArray89[local373 + local205 * 32] = arg0;
						} else if (local373 < 31 && local17.anIntArray89[local205 * 32 + local373 + 1] == 1) {
							local17.anIntArray89[local373 + local205 * 32] = arg0;
						} else if (local205 < 31 && local17.anIntArray89[(local205 + 1) * 32 + local373] == 1) {
							local17.anIntArray89[local373 + local205 * 32] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (local373 = 31; local373 >= 0; local373--) {
				for (local205 = 31; local205 >= 0; local205--) {
					if (local17.anIntArray89[local205 * 32 + local373] == 0 && local373 > 0 && local205 > 0 && local17.anIntArray89[local373 + local205 * 32 - 1 - 32] > 0) {
						local17.anIntArray89[local205 * 32 + local373] = 3153952;
					}
				}
			}
		}
		if (local47.anInt2461 != -1) {
			@Pc(570) int local570 = local109.anInt689;
			local373 = local109.anInt687;
			local109.anInt687 = 32;
			local109.anInt689 = 32;
			local109.method469(0, 0);
			local109.anInt689 = local570;
			local109.anInt687 = local373;
		}
		if (arg0 == 0) {
			Static44.aClass17_63.method783(local17, (long) arg1);
		}
		Static81.method1645(local131, local129, local133);
		Static81.method1637(local135, local137, local139, local141);
		Static97.method1653(local127);
		local17.anInt689 = arg2;
		Static97.aBoolean136 = true;
		if (local47.aBoolean128) {
			local17.anInt687 = 33;
		} else {
			local17.anInt687 = 32;
		}
		return local17;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)V")
	public static void method1603() {
		Static76.aClass9_20.method861();
		Static93.aClass2_Sub1_Sub3_Sub1_16.method291(0, 0);
		Static79.anIntArray325 = Static97.method1653(Static79.anIntArray325);
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	public static void method1605() {
		aByteArrayArrayArray34 = null;
		aClass9_26 = null;
		anIntArray366 = null;
		aClass31_885 = null;
		aClass31_887 = null;
		aClass31_886 = null;
		aClass31_888 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!kc;III)[Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1[] method1606(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static85.method1563(arg2, arg0, arg1) ? Static49.method1700() : null;
	}
}
