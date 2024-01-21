import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!cf;")
	public static Class16 aClass16_5;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!pd;")
	public static Class20 aClass20_43;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!d;")
	public static Class4_Sub1_Sub2 aClass4_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!pb;")
	public static Class61 aClass61_11 = new Class61();

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1084 = Static28.method504(":duelreq:");

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "[I")
	public static int[] anIntArray222 = new int[32];

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!c;")
	public static Class12 aClass12_57 = new Class12(50);

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!c;")
	public static Class12 aClass12_58 = new Class12(100);

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	public static int anInt2125 = 0;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	public static int anInt2126 = 0;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1087 = Static28.method504("flash2:");

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1085 = aClass39_1087;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "[I")
	public static int[] anIntArray223 = new int[256];

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1086 = aClass39_1087;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
	public static int anInt2127 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1520() {
		aClass39_1086 = null;
		aClass12_57 = null;
		aClass16_5 = null;
		aClass39_1084 = null;
		aClass4_Sub1_Sub2_2 = null;
		anIntArray222 = null;
		anIntArray223 = null;
		aClass39_1085 = null;
		aClass20_43 = null;
		aClass12_58 = null;
		aClass39_1087 = null;
		aClass61_11 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ja;ILclient!ja;ILclient!ja;)V")
	public static void method1521(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class39 arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static30.anIntArray88[local3] = Static30.anIntArray88[local3 - 1];
			Static100.aClass39Array18[local3] = Static100.aClass39Array18[local3 - 1];
			Static94.aClass39Array17[local3] = Static94.aClass39Array17[local3 - 1];
			Static103.aClass39Array20[local3] = Static103.aClass39Array20[local3 - 1];
		}
		Static30.anIntArray88[0] = arg2;
		Static100.aClass39Array18[0] = arg0;
		Static94.aClass39Array17[0] = arg3;
		Static103.aClass39Array20[0] = arg1;
		Static98.anInt1020 = Static129.anInt3153;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Lclient!ja;")
	public static Class39 method1522(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static62.method1123(new Class39[] { Static19.aClass39_301, Static29.method510(arg0), Static40.aClass39_579 });
		} else if (arg0 < 10000000) {
			return Static62.method1123(new Class39[] { Static126.aClass39_1777, Static29.method510(arg0 / 1000), Static117.aClass39_1541, Static40.aClass39_579 });
		} else {
			return Static62.method1123(new Class39[] { Static27.aClass39_391, Static29.method510(arg0 / 1000000), Static25.aClass39_1786, Static40.aClass39_579 });
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method1523(@OriginalArg(1) Class4_Sub2_Sub1_Sub1 arg0) {
		arg0.aBoolean134 = false;
		@Pc(21) Class4_Sub2_Sub2 local21;
		if (arg0.anInt2691 != -1) {
			local21 = Static116.method2017(arg0.anInt2691);
			if (local21 == null || local21.anIntArray33 == null) {
				arg0.anInt2691 = -1;
			} else {
				arg0.anInt2673++;
				if (local21.anIntArray33.length > arg0.anInt2663 && arg0.anInt2673 > local21.anIntArray35[arg0.anInt2663]) {
					arg0.anInt2663++;
					arg0.anInt2673 = 1;
					Static24.method327(arg0.anInt2643, arg0.anInt2663, arg0.anInt2641, local21);
				}
				if (arg0.anInt2663 >= local21.anIntArray33.length) {
					arg0.anInt2673 = 0;
					arg0.anInt2663 = 0;
					Static24.method327(arg0.anInt2643, arg0.anInt2663, arg0.anInt2641, local21);
				}
			}
		}
		if (arg0.anInt2692 != -1 && Static71.anInt1738 >= arg0.anInt2662) {
			if (arg0.anInt2684 < 0) {
				arg0.anInt2684 = 0;
			}
			@Pc(122) int local122 = Static35.method590(arg0.anInt2692).anInt2545;
			if (local122 == -1) {
				arg0.anInt2692 = -1;
			} else {
				@Pc(129) Class4_Sub2_Sub2 local129 = Static116.method2017(local122);
				if (local129 == null || local129.anIntArray33 == null) {
					arg0.anInt2692 = -1;
				} else {
					arg0.anInt2695++;
					if (arg0.anInt2684 < local129.anIntArray33.length && local129.anIntArray35[arg0.anInt2684] < arg0.anInt2695) {
						arg0.anInt2695 = 1;
						arg0.anInt2684++;
						Static24.method327(arg0.anInt2643, arg0.anInt2684, arg0.anInt2641, local129);
					}
					if (arg0.anInt2684 >= local129.anIntArray33.length && (arg0.anInt2684 < 0 || local129.anIntArray33.length <= arg0.anInt2684)) {
						arg0.anInt2692 = -1;
					}
				}
			}
		}
		if (arg0.anInt2678 != -1 && arg0.anInt2659 <= 1) {
			local21 = Static116.method2017(arg0.anInt2678);
			if (local21.anInt318 == 1 && arg0.anInt2685 > 0 && Static71.anInt1738 >= arg0.anInt2654 && Static71.anInt1738 > arg0.anInt2687) {
				arg0.anInt2659 = 1;
				return;
			}
		}
		if (arg0.anInt2678 != -1 && arg0.anInt2659 == 0) {
			local21 = Static116.method2017(arg0.anInt2678);
			if (local21 == null || local21.anIntArray33 == null) {
				arg0.anInt2678 = -1;
			} else {
				arg0.anInt2646++;
				if (arg0.anInt2671 < local21.anIntArray33.length && arg0.anInt2646 > local21.anIntArray35[arg0.anInt2671]) {
					arg0.anInt2646 = 1;
					arg0.anInt2671++;
					Static24.method327(arg0.anInt2643, arg0.anInt2671, arg0.anInt2641, local21);
				}
				if (local21.anIntArray33.length <= arg0.anInt2671) {
					arg0.anInt2677++;
					arg0.anInt2671 -= local21.anInt320;
					if (arg0.anInt2677 >= local21.anInt315) {
						arg0.anInt2678 = -1;
					} else if (arg0.anInt2671 >= 0 && local21.anIntArray33.length > arg0.anInt2671) {
						Static24.method327(arg0.anInt2643, arg0.anInt2671, arg0.anInt2641, local21);
					} else {
						arg0.anInt2678 = -1;
					}
				}
				arg0.aBoolean134 = local21.aBoolean11;
			}
		}
		if (arg0.anInt2659 > 0) {
			arg0.anInt2659--;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1524() {
		@Pc(9) int local9 = Static53.anInt1392 * 128 + 64;
		@Pc(15) int local15 = Static19.anInt514 * 128 + 64;
		@Pc(23) int local23 = Static94.method1708(local9, local15, Static131.anInt3202) - Static92.anInt736;
		if (Static119.anInt3113 < local15) {
			Static119.anInt3113 += Static52.anInt1347 * (local15 - Static119.anInt3113) / 1000 + Static1.anInt11;
			if (Static119.anInt3113 > local15) {
				Static119.anInt3113 = local15;
			}
		}
		if (local15 < Static119.anInt3113) {
			Static119.anInt3113 -= Static1.anInt11 + Static52.anInt1347 * (Static119.anInt3113 - local15) / 1000;
			if (local15 > Static119.anInt3113) {
				Static119.anInt3113 = local15;
			}
		}
		local15 = Static73.anInt1762 * 128 + 64;
		if (local9 > Static69.anInt1723) {
			Static69.anInt1723 += Static1.anInt11 + (local9 - Static69.anInt1723) * Static52.anInt1347 / 1000;
			if (local9 < Static69.anInt1723) {
				Static69.anInt1723 = local9;
			}
		}
		if (local23 > Static97.anInt2445) {
			Static97.anInt2445 += Static52.anInt1347 * (local23 - Static97.anInt2445) / 1000 + Static1.anInt11;
			if (Static97.anInt2445 > local23) {
				Static97.anInt2445 = local23;
			}
		}
		if (Static97.anInt2445 > local23) {
			Static97.anInt2445 -= (Static97.anInt2445 - local23) * Static52.anInt1347 / 1000 + Static1.anInt11;
			if (Static97.anInt2445 < local23) {
				Static97.anInt2445 = local23;
			}
		}
		if (Static69.anInt1723 > local9) {
			Static69.anInt1723 -= (Static69.anInt1723 - local9) * Static52.anInt1347 / 1000 + Static1.anInt11;
			if (local9 > Static69.anInt1723) {
				Static69.anInt1723 = local9;
			}
		}
		local9 = Static92.anInt735 * 128 + 64;
		local23 = Static94.method1708(local9, local15, Static131.anInt3202) - Static20.anInt560;
		@Pc(199) int local199 = local9 - Static69.anInt1723;
		@Pc(204) int local204 = local15 - Static119.anInt3113;
		@Pc(209) int local209 = local23 - Static97.anInt2445;
		@Pc(220) int local220 = (int) Math.sqrt((double) (local204 * local204 + local199 * local199));
		@Pc(231) int local231 = (int) (Math.atan2((double) local209, (double) local220) * 325.949D) & 0x7FF;
		@Pc(242) int local242 = (int) (Math.atan2((double) local199, (double) local204) * -325.949D) & 0x7FF;
		@Pc(247) int local247 = local242 - Static121.anInt3006;
		if (local231 < 128) {
			local231 = 128;
		}
		if (local231 > 383) {
			local231 = 383;
		}
		if (local247 > 1024) {
			local247 -= 2048;
		}
		if (local247 < -1024) {
			local247 += 2048;
		}
		if (local231 > Static18.anInt423) {
			Static18.anInt423 += Static51.anInt2475 * (local231 - Static18.anInt423) / 1000 + Static116.anInt2887;
			if (local231 < Static18.anInt423) {
				Static18.anInt423 = local231;
			}
		}
		if (local247 > 0) {
			Static121.anInt3006 += Static51.anInt2475 * local247 / 1000 + Static116.anInt2887;
			Static121.anInt3006 &= 0x7FF;
		}
		if (local247 < 0) {
			Static121.anInt3006 -= Static116.anInt2887 + Static51.anInt2475 * -local247 / 1000;
			Static121.anInt3006 &= 0x7FF;
		}
		@Pc(344) int local344 = local242 - Static121.anInt3006;
		if (local344 > 1024) {
			local344 -= 2048;
		}
		if (local344 < -1024) {
			local344 += 2048;
		}
		if (Static18.anInt423 > local231) {
			Static18.anInt423 -= Static116.anInt2887 + (Static18.anInt423 - local231) * Static51.anInt2475 / 1000;
			if (local231 > Static18.anInt423) {
				Static18.anInt423 = local231;
			}
		}
		if (local344 < 0 && local247 > 0 || local344 > 0 && local247 < 0) {
			Static121.anInt3006 = local242;
		}
	}
}
