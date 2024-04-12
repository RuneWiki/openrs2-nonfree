import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 4)
	public static void method1489() {
		if (Class1.aBoolean1) {
			Class1.aBoolean1 = false;
			Static39.method768(Static23.aGraphics1);
			Class30.aBoolean95 = true;
			Class2_Sub3.aBoolean184 = true;
			Class41.aBoolean144 = true;
			Class2_Sub2_Sub7.aBoolean59 = true;
		}
		Static21.method1713();
		if (Class2_Sub12.aBoolean175 && Static1.anInt16 == 1) {
			Class2_Sub2_Sub7.aBoolean59 = true;
		}
		@Pc(32) boolean local32;
		if (Class37.anInt1654 != -1) {
			local32 = Static26.method533(Class37.anInt1654);
			if (local32) {
				Class2_Sub2_Sub7.aBoolean59 = true;
			}
		}
		if (Class19.anInt481 == 2) {
			Class2_Sub2_Sub7.aBoolean59 = true;
		}
		if (Class54.anInt2077 == 2) {
			Class2_Sub2_Sub7.aBoolean59 = true;
		}
		if (Class2_Sub2_Sub7.aBoolean59) {
			Class2_Sub2_Sub7.aBoolean59 = false;
			Static79.method1401();
		}
		@Pc(101) int local101;
		if (Class53.anInt1994 == -1) {
			Class35.aClass2_Sub2_Sub13_1.anInt1587 = Class32.anInt1506 - Class2_Sub6.anInt799 - 77;
			if (Class2_Sub5.anInt742 > 448 && Class2_Sub5.anInt742 < 560 && Class2_Sub2_Sub15.anInt2394 > 332) {
				Static49.method920(Class35.aClass2_Sub2_Sub13_1, 463, Class32.anInt1506, 77, -1, Class2_Sub2_Sub15.anInt2394 - 357, Class2_Sub5.anInt742 + -17, 0);
			}
			local101 = Class32.anInt1506 - Class35.aClass2_Sub2_Sub13_1.anInt1587 - 77;
			if (local101 < 0) {
				local101 = 0;
			}
			if (local101 > Class32.anInt1506 - 77) {
				local101 = Class32.anInt1506 - 77;
			}
			if (Class2_Sub6.anInt799 != local101) {
				Class41.aBoolean144 = true;
				Class2_Sub6.anInt799 = local101;
			}
		}
		if (Class53.anInt1994 == -1 && Class61.anInt2399 == 3) {
			Class35.aClass2_Sub2_Sub13_1.anInt1587 = Class4.anInt53;
			local101 = Class2_Sub2_Sub14.anInt2066 * 14 + 7;
			if (Class2_Sub5.anInt742 > 448 && Class2_Sub5.anInt742 < 560 && Class2_Sub2_Sub15.anInt2394 > 332) {
				Static49.method920(Class35.aClass2_Sub2_Sub13_1, 463, local101, 77, -1, Class2_Sub2_Sub15.anInt2394 - 357, Class2_Sub5.anInt742 + -17, 0);
			}
			@Pc(168) int local168 = Class35.aClass2_Sub2_Sub13_1.anInt1587;
			if (local168 < 0) {
				local168 = 0;
			}
			if (local168 > local101 - 77) {
				local168 = local101 - 77;
			}
			if (local168 != Class4.anInt53) {
				Class4.anInt53 = local168;
				Class41.aBoolean144 = true;
			}
		}
		if (Class53.anInt1994 != -1) {
			local32 = Static26.method533(Class53.anInt1994);
			if (local32) {
				Class41.aBoolean144 = true;
			}
		}
		if (Class19.anInt481 == 3) {
			Class41.aBoolean144 = true;
		}
		if (Class54.anInt2077 == 3) {
			Class41.aBoolean144 = true;
		}
		if (Class14.aClass40_112 != null) {
			Class41.aBoolean144 = true;
		}
		if (Class2_Sub12.aBoolean175 && Static1.anInt16 == 2) {
			Class41.aBoolean144 = true;
		}
		if (Class41.aBoolean144) {
			Class41.aBoolean144 = false;
			Static2.method23();
		}
		Static18.method370();
		if (Class62.anInt2492 != -1) {
			Class2_Sub3.aBoolean184 = true;
		}
		if (Class2_Sub3.aBoolean184) {
			if (Class62.anInt2492 != -1 && Class35.anInt1551 == Class62.anInt2492) {
				Class62.anInt2492 = -1;
				Class47.aClass2_Sub3_Sub1_4.method1736(145);
				Class47.aClass2_Sub3_Sub1_4.method1703(Class35.anInt1551);
			}
			Class45_Sub1.aBoolean165 = true;
			Class2_Sub3.aBoolean184 = false;
			Static85.method1487(Class35.anInt1551, Class3.anIntArray2, Class24.anInt2511 % 20 < 10 ? -1 : Class62.anInt2492, Class37.anInt1654 == -1, Static23.aGraphics1);
		}
		if (Class30.aBoolean95) {
			Class45_Sub1.aBoolean165 = true;
			Class30.aBoolean95 = false;
			Static99.method1664(Class63.anInt2515, Static23.aGraphics1, Static95.aClass2_Sub2_Sub2_Sub2_5, Class62.anInt2491, Class2_Sub2_Sub4.anInt583);
		}
		Class27.anInt1095 = 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 164)
	public static synchronized void method1490() {
		if (Static64.method1110()) {
			Static30.method595();
			Class12_Sub1.aBoolean151 = false;
			Static63.aClass5_6 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIZIIILclient!ud;)V", line = 198)
	public static synchronized void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class5 arg3) {
		if (!Static64.method1110()) {
			return;
		}
		Static43.anInt2458 = arg2;
		Static63.aClass5_6 = arg3;
		Class12_Sub1.aBoolean151 = true;
		Static70.anInt2153 = -1;
		Static64.anInt1696 = arg1;
		Static90.anInt2370 = arg0;
		Static93.aBoolean179 = false;
		Static82.anInt2135 = 10;
		Static13.anInt310 = 0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 218)
	public static void method1492() {
		Static26.method533(Class52.anInt1971);
		if (Class58.anInt2175 != -1) {
			Static26.method533(Class58.anInt2175);
		}
		Class27.anInt1095 = 0;
		Static27.aClass45_14.method1476();
		Static34.anIntArray162 = Static6.method175(Static34.anIntArray162);
		Static25.method1610();
		Static20.method403(0, -1, Class52.anInt1971, 0, 0, 503, 0, 765);
		if (Class58.anInt2175 != -1) {
			Static20.method403(0, -1, Class58.anInt2175, 0, 0, 503, 0, 765);
		}
		if (Class2_Sub12.aBoolean175) {
			Static22.method480();
		} else {
			Static19.method389();
			Static5.method115();
		}
		Static27.aClass45_14.method1474(Static23.aGraphics1, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 256)
	public static synchronized void method1493() {
		Static10.method235();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZJ)V", line = 267)
	public static void method1494(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static97.method1672(arg0 - 1L);
			Static97.method1672(1L);
		} else {
			Static97.method1672(arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 289)
	public static void method1495() {
		Class2_Sub9.anInt1190 = 0;
		Class11.anInt304 = 0;
		Static22.method477();
		Static24.method520();
		Static64.method1109();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Class11.anInt304; local22++) {
			local28 = Class30.anIntArray258[local22];
			if (Class24.anInt2511 != Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local28].anInt2274) {
				Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local28].aClass2_Sub2_Sub7_1 = null;
				Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local28] = null;
			}
		}
		if (Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 != Class2_Sub2_Sub7.anInt785) {
			throw new RuntimeException("gnp1 pos:" + Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 + " psize:" + Class2_Sub2_Sub7.anInt785);
		}
		for (local28 = 0; local28 < Class41.anInt1800; local28++) {
			if (Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Class2_Sub2_Sub13.anIntArray326[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Class41.anInt1800);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!o;Lclient!o;Lclient!ud;IZIII)V", line = 350)
	public static synchronized void method1496(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(6) int arg3) {
		if (Static64.method1110()) {
			@Pc(12) int local12 = arg2.method80(arg0);
			@Pc(18) int local18 = arg2.method72(arg1, local12);
			method1491(local12, arg3, local18, arg2);
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 384)
	public static synchronized void method1497() {
		if (Static64.method1110()) {
			Static58.method1055();
			Static63.aClass5_6 = null;
			Class12_Sub1.aBoolean151 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V", line = 404)
	public static void method1498() {
		Class59.aClass40_630 = null;
		Class59.aClass40_633 = null;
		Class59.aClass40_631 = null;
		Class59.aClass40_632 = null;
		Class59.aClass40_629 = null;
		Class59.aClass40_628 = null;
		Class59.anIntArray473 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!ud;IZ)V", line = 421)
	public static synchronized void method1499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class5 arg2, @OriginalArg(5) int arg3) {
		if (!Static64.method1110()) {
			return;
		}
		Static13.anInt310 = arg0;
		Static70.anInt2153 = -1;
		Static82.anInt2135 = -1;
		Static64.anInt1696 = arg3;
		Static43.anInt2458 = 0;
		Static93.aBoolean179 = false;
		Class12_Sub1.aBoolean151 = true;
		Static63.aClass5_6 = arg2;
		Static90.anInt2370 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V", line = 442)
	public static synchronized void method1500() {
		if (!Static64.method1110()) {
			return;
		}
		if (Class12_Sub1.aBoolean151) {
			@Pc(22) byte[] local22 = Static98.method1735(Static13.anInt310, Static43.anInt2458, Static63.aClass5_6, Static90.anInt2370);
			if (local22 != null) {
				if (Static82.anInt2135 >= 0) {
					Static63.method335(Static93.aBoolean179, local22, Static64.anInt1696, Static82.anInt2135);
				} else if (Static70.anInt2153 < 0) {
					Static67.method1208(Static93.aBoolean179, Static64.anInt1696, local22);
				} else {
					Static43.method1634(Static93.aBoolean179, local22, Static70.anInt2153, Static64.anInt1696);
				}
				Class12_Sub1.aBoolean151 = false;
				Static63.aClass5_6 = null;
			}
		}
		Static35.method719();
	}
}
