import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Lclient!nh;")
	public static Class62 aClass62_26;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public static int anInt2445 = 0;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "[I")
	public static final int[] anIntArray230 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!nh;)V")
	public static void method1857(@OriginalArg(1) Class62 arg0) {
		Static172.aClass62_44 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZ)V")
	public static void method1858(@OriginalArg(1) boolean arg0) {
		Static6.method100();
		Static65.anInt1717++;
		if (Static65.anInt1717 < 50 && !arg0) {
			return;
		}
		Static65.anInt1717 = 0;
		if (Static10.aBoolean21 || Static59.aClass27_2 == null) {
			return;
		}
		Static90.aClass4_Sub11_Sub1_1.method1285(41);
		try {
			Static59.aClass27_2.method957(Static90.aClass4_Sub11_Sub1_1.aByteArray19, Static90.aClass4_Sub11_Sub1_1.anInt1597);
			Static90.aClass4_Sub11_Sub1_1.anInt1597 = 0;
		} catch (@Pc(48) IOException local48) {
			Static10.aBoolean21 = true;
		}
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V")
	public static void method1859() {
		Static103.aBoolean113 = false;
		Static186.aBoolean169 = false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!ei;Lclient!ei;)V")
	public static void method1860(@OriginalArg(1) Class4_Sub1_Sub7_Sub1_Sub1 arg0, @OriginalArg(2) Class4_Sub1_Sub7_Sub1_Sub1 arg1) {
		if (Static151.aClass4_Sub1_Sub7_Sub2Array11 == null) {
			Static151.aClass4_Sub1_Sub7_Sub2Array11 = Static71.method1494(0, Static80.anInt2012, Static52.aClass62_Sub1_37);
		}
		if (Static48.aClass4_Sub1_Sub7_Sub3Array6 == null) {
			Static48.aClass4_Sub1_Sub7_Sub3Array6 = Static41.method707(Static36.anInt954, 0, Static52.aClass62_Sub1_37);
		}
		if (Static65.aClass4_Sub1_Sub7_Sub3Array9 == null) {
			Static65.aClass4_Sub1_Sub7_Sub3Array9 = Static41.method707(Static4.anInt2847, 0, Static52.aClass62_Sub1_37);
		}
		if (Static100.aClass4_Sub1_Sub7_Sub3Array10 == null) {
			Static100.aClass4_Sub1_Sub7_Sub3Array10 = Static41.method707(Static120.anInt3734, 0, Static52.aClass62_Sub1_37);
		}
		Static145.method2941(0, 23, 765, 480, 0);
		Static145.method2946(0, 0, 125, 23, 12425273, 9135624);
		Static145.method2946(125, 0, 640, 23, 5197647, 2697513);
		arg0.method906(Static36.aClass46_322, 62, 15, 0, -1);
		if (Static100.aClass4_Sub1_Sub7_Sub3Array10 != null) {
			Static100.aClass4_Sub1_Sub7_Sub3Array10[1].method2642(140, 1);
			arg1.method890(Static144.aClass46_1240, 152, 10, 16777215, -1);
			Static100.aClass4_Sub1_Sub7_Sub3Array10[0].method2642(140, 12);
			arg1.method890(Static113.aClass46_1017, 152, 21, 16777215, -1);
		}
		if (Static65.aClass4_Sub1_Sub7_Sub3Array9 != null) {
			if (Static176.anIntArray426[0] == 0 && Static148.anIntArray320[0] == 0) {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[2].method2642(280, 4);
			} else {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[0].method2642(280, 4);
			}
			if (Static176.anIntArray426[0] == 0 && Static148.anIntArray320[0] == 1) {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[3].method2642(295, 4);
			} else {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[1].method2642(295, 4);
			}
			arg0.method890(Static59.aClass46_559, 312, 17, 16777215, -1);
			if (Static176.anIntArray426[0] == 1 && Static148.anIntArray320[0] == 0) {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[2].method2642(390, 4);
			} else {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[0].method2642(390, 4);
			}
			if (Static176.anIntArray426[0] == 1 && Static148.anIntArray320[0] == 1) {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[3].method2642(405, 4);
			} else {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[1].method2642(405, 4);
			}
			arg0.method890(Static105.aClass46_956, 422, 17, 16777215, -1);
			if (Static176.anIntArray426[0] == 2 && Static148.anIntArray320[0] == 0) {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[2].method2642(500, 4);
			} else {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[0].method2642(500, 4);
			}
			if (Static176.anIntArray426[0] == 2 && Static148.anIntArray320[0] == 1) {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[3].method2642(515, 4);
			} else {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[1].method2642(515, 4);
			}
			arg0.method890(Static174.aClass46_1424, 532, 17, 16777215, -1);
			if (Static176.anIntArray426[0] == 3 && Static148.anIntArray320[0] == 0) {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[2].method2642(610, 4);
			} else {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[0].method2642(610, 4);
			}
			if (Static176.anIntArray426[0] == 3 && Static148.anIntArray320[0] == 1) {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[3].method2642(625, 4);
			} else {
				Static65.aClass4_Sub1_Sub7_Sub3Array9[1].method2642(625, 4);
			}
			arg0.method890(Static107.aClass46_964, 642, 17, 16777215, -1);
		}
		Static145.method2941(708, 4, 50, 16, 0);
		arg1.method906(Static93.aClass46_863, 733, 16, 16777215, -1);
		Static73.anInt1867 = -1;
		if (Static151.aClass4_Sub1_Sub7_Sub2Array11 == null) {
			return;
		}
		@Pc(394) int local394 = 8;
		@Pc(402) int local402 = 24;
		@Pc(404) int local404;
		@Pc(406) int local406;
		do {
			local404 = local402;
			local406 = local394;
			if ((local394 - 1) * local402 >= Static140.anInt3267) {
				local394--;
			}
			if ((local402 - 1) * local394 >= Static140.anInt3267) {
				local402--;
			}
			if ((local402 - 1) * local394 >= Static140.anInt3267) {
				local402--;
			}
		} while (local404 != local402 || local394 != local406);
		local406 = (480 - local402 * 19) / (local402 + 1);
		if (local406 > 5) {
			local406 = 5;
		}
		@Pc(471) int local471 = (480 - local402 * 19 - local406 * (local402 - 1)) / 2;
		@Pc(476) int local476 = local471 + 23;
		local404 = (765 - local394 * 88) / (local394 + 1);
		if (local404 > 5) {
			local404 = 5;
		}
		@Pc(507) int local507 = (765 - local394 * 88 - (local394 - 1) * local404) / 2;
		@Pc(509) int local509 = local507;
		@Pc(511) int local511 = 0;
		for (@Pc(513) int local513 = 0; local513 < Static140.anInt3267; local513++) {
			@Pc(519) Class19 local519 = Static132.aClass19Array1[local513];
			@Pc(524) Class46 local524 = Static127.method2240(local519.anInt759);
			@Pc(526) boolean local526 = true;
			if (local519.anInt759 == -1) {
				local524 = Static81.aClass46_770;
				local526 = false;
			} else if (local519.anInt759 > 1980) {
				local524 = Static185.aClass46_1494;
				local526 = false;
			}
			if (Static25.anInt620 >= local509 && local476 <= Static169.anInt3778 && local509 + 88 > Static25.anInt620 && Static169.anInt3778 < local476 + 19 && local526) {
				Static73.anInt1867 = local513;
				Static151.aClass4_Sub1_Sub7_Sub2Array11[local519.aBoolean39 ? 1 : 0].method2537(local509, local476);
			} else {
				Static151.aClass4_Sub1_Sub7_Sub2Array11[local519.aBoolean39 ? 1 : 0].method2533(local509, local476);
			}
			if (Static48.aClass4_Sub1_Sub7_Sub3Array6 != null) {
				Static48.aClass4_Sub1_Sub7_Sub3Array6[(local519.aBoolean39 ? 8 : 0) + local519.anInt760].method2642(local509 + 29, local476);
			}
			arg0.method906(Static127.method2240(local519.anInt761), local509 + 15, local476 + 14, 0, -1);
			arg1.method906(local524, local509 + 60, local476 + 5 + 9, 268435455, -1);
			local476 += local406 + 19;
			local511++;
			if (local511 >= local402) {
				local476 = local471 + 23;
				local509 += local404 + 88;
				local511 = 0;
			}
		}
	}
}
