import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!tb", name = "vb", descriptor = "[I")
	public static int[] anIntArray404;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1229 = Static24.method441("Take");

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1230 = aClass65_1229;

	@OriginalMember(owner = "client!tb", name = "Fb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1240 = Static24.method441("Enter name of player to add to list");

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1231 = aClass65_1240;

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1232 = Static24.method441("This computers address has been blocked");

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
	public static int anInt2758 = 0;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
	public static int anInt2759 = -1;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
	public static int anInt2760 = 0;

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
	public static int anInt2762 = 0;

	@OriginalMember(owner = "client!tb", name = "xb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1237 = Static24.method441("To play on this world move to a free area first");

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1233 = aClass65_1237;

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
	public static int anInt2765 = 0;

	@OriginalMember(owner = "client!tb", name = "sb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1234 = Static24.method441("@yel@");

	@OriginalMember(owner = "client!tb", name = "ub", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1235 = Static24.method441("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!tb", name = "wb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1236 = Static24.method441("mapfunction");

	@OriginalMember(owner = "client!tb", name = "zb", descriptor = "I")
	public static int anInt2770 = -1;

	@OriginalMember(owner = "client!tb", name = "Ab", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1238 = Static24.method441("Freunde");

	@OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
	public static int anInt2771 = -1;

	@OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
	public static volatile int anInt2772 = -1;

	@OriginalMember(owner = "client!tb", name = "Eb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1239 = aClass65_1232;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
	public static void method1690() {
		Static76.aClass52_9 = new Class52();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!k;ZLclient!k;)Lclient!na;")
	public static Class2_Sub1_Sub9 method1691(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(4) Class33 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method1131(arg0);
		for (@Pc(19) int local19 = 0; local19 < local12.length; local19++) {
			@Pc(29) byte[] local29 = arg1.method1154(local12[local19], arg0);
			if (local29 == null) {
				local7 = false;
			} else {
				@Pc(49) int local49 = (local29[0] & 0xFF) << 8 | local29[1] & 0xFF;
				@Pc(67) byte[] local67 = arg2.method1154(0, local49);
				if (local67 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub9(arg1, arg2, arg0, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	public static void method1692() {
		@Pc(5) Object local5 = Static28.anObject2;
		synchronized (Static28.anObject2) {
			if (Static20.anInt625 == 0) {
				Static97.aClass53_3.method1628(new Class43(), 5);
			}
			Static20.anInt625 = 600;
		}
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	public static void method1693() {
		aClass65_1233 = null;
		aClass65_1230 = null;
		aClass65_1236 = null;
		aClass65_1240 = null;
		aClass65_1234 = null;
		aClass65_1235 = null;
		anIntArray404 = null;
		aClass65_1229 = null;
		aClass65_1239 = null;
		aClass65_1237 = null;
		aClass65_1232 = null;
		aClass65_1238 = null;
		aClass65_1231 = null;
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
	public static void method1694() {
		Static102.aClass21_34.method743();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
	public static void method1695(@OriginalArg(0) int arg0) {
		Static70.method1266(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V")
	public static void method1697() {
		try {
			@Pc(7) Graphics local7 = Static70.aCanvas1.getGraphics();
			Static20.aClass15_14.method1104(205, local7, 553);
		} catch (@Pc(15) Exception local15) {
			Static70.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)V")
	public static void method1698(@OriginalArg(0) int arg0) {
		Static57.method1000();
		@Pc(12) int local12 = Static39.method764(arg0).anInt2755;
		if (local12 == 0) {
			return;
		}
		@Pc(22) int local22 = Static26.anIntArray416[arg0];
		if (local12 == 1) {
			if (local22 == 1) {
				Static10.method248(0.9D);
				((Class4) Static10.anInterface1_1).method123(0.9D);
			}
			if (local22 == 2) {
				Static10.method248(0.8D);
				((Class4) Static10.anInterface1_1).method123(0.8D);
			}
			if (local22 == 3) {
				Static10.method248(0.7D);
				((Class4) Static10.anInterface1_1).method123(0.7D);
			}
			if (local22 == 4) {
				Static10.method248(0.6D);
				((Class4) Static10.anInterface1_1).method123(0.6D);
			}
			Static23.method423();
			Static38.aBoolean74 = true;
		}
		if (local12 == 3) {
			@Pc(78) short local78 = 0;
			if (local22 == 0) {
				local78 = 255;
			}
			if (local22 == 1) {
				local78 = 192;
			}
			if (local22 == 2) {
				local78 = 128;
			}
			if (local22 == 3) {
				local78 = 64;
			}
			if (local22 == 4) {
				local78 = 0;
			}
			if (local78 != Static97.anInt2711) {
				if (Static97.anInt2711 == 0 && Static15.anInt478 != -1) {
					Static57.method1003(Static15.anInt478, Static26.aClass33_Sub1_50, 0, local78);
					Static71.anInt2165 = 0;
				} else if (local78 == 0) {
					Static57.method998();
					Static71.anInt2165 = 0;
				} else {
					Static99.method1566(local78);
				}
				Static97.anInt2711 = local78;
			}
		}
		if (local12 == 4) {
			if (local22 == 0) {
				Static21.anInt2499 = 127;
			}
			if (local22 == 1) {
				Static21.anInt2499 = 96;
			}
			if (local22 == 2) {
				Static21.anInt2499 = 64;
			}
			if (local22 == 3) {
				Static21.anInt2499 = 32;
			}
			if (local22 == 4) {
				Static21.anInt2499 = 0;
			}
		}
		if (local12 == 10) {
			if (local22 == 0) {
				Static83.anInt2378 = 127;
			}
			if (local22 == 1) {
				Static83.anInt2378 = 96;
			}
			if (local22 == 2) {
				Static83.anInt2378 = 64;
			}
			if (local22 == 3) {
				Static83.anInt2378 = 32;
			}
			if (local22 == 4) {
				Static83.anInt2378 = 0;
			}
		}
		if (local12 == 8) {
			Static107.aBoolean156 = true;
			Static47.anInt1390 = local22;
		}
		if (local12 == 9) {
			Static39.anInt1254 = local22;
		}
		if (local12 == 6) {
			Static46.anInt1374 = local22;
		}
		if (local12 == 5) {
			Static100.anInt2779 = local22;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!k;Lclient!k;Z)V")
	public static void method1700(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1) {
		Static27.aClass33_9 = arg0;
		Static60.aClass33_31 = arg1;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V")
	public static void method1701() {
		for (@Pc(7) int local7 = 0; local7 < Static39.anInt1251; local7++) {
			@Pc(21) int local21 = Static61.anIntArray248[local7];
			@Pc(25) Class2_Sub1_Sub1_Sub2_Sub1 local25 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local21];
			@Pc(29) int local29 = Static59.aClass2_Sub8_Sub1_19.method1410();
			if ((local29 & 0x80) != 0) {
				local25.aClass2_Sub1_Sub11_1 = Static75.method1301(Static59.aClass2_Sub8_Sub1_19.method1391());
				local25.anInt1536 = local25.aClass2_Sub1_Sub11_1.anInt2126;
				local25.anInt1559 = local25.aClass2_Sub1_Sub11_1.anInt2124;
				local25.anInt1555 = local25.aClass2_Sub1_Sub11_1.anInt2110;
				local25.anInt1528 = local25.aClass2_Sub1_Sub11_1.anInt2112;
				local25.anInt1571 = local25.aClass2_Sub1_Sub11_1.anInt2114;
				local25.anInt1515 = local25.aClass2_Sub1_Sub11_1.anInt2096;
				local25.anInt1521 = local25.aClass2_Sub1_Sub11_1.anInt2105;
				local25.anInt1548 = local25.aClass2_Sub1_Sub11_1.anInt2116;
				local25.anInt1558 = local25.aClass2_Sub1_Sub11_1.anInt2108;
			}
			@Pc(93) int local93;
			@Pc(97) int local97;
			if ((local29 & 0x2) != 0) {
				local93 = Static59.aClass2_Sub8_Sub1_19.method1395();
				local97 = Static59.aClass2_Sub8_Sub1_19.method1395();
				local25.method920(local93, Static108.anInt2902, local97);
				local25.anInt1543 = Static108.anInt2902 + 300;
				local25.anInt1530 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local25.anInt1532 = Static59.aClass2_Sub8_Sub1_19.method1410();
			}
			if ((local29 & 0x8) != 0) {
				local93 = Static59.aClass2_Sub8_Sub1_19.method1396();
				if (local93 == 65535) {
					local93 = -1;
				}
				local97 = Static59.aClass2_Sub8_Sub1_19.method1410();
				if (local93 == local25.anInt1552 && local93 != -1) {
					@Pc(148) int local148 = Static71.method1291(local93).anInt1186;
					if (local148 == 1) {
						local25.anInt1569 = local97;
						local25.anInt1564 = 0;
						local25.anInt1566 = 0;
						local25.anInt1549 = 0;
					}
					if (local148 == 2) {
						local25.anInt1564 = 0;
					}
				} else if (local93 == -1 || local25.anInt1552 == -1 || Static71.method1291(local93).anInt1199 >= Static71.method1291(local25.anInt1552).anInt1199) {
					local25.anInt1549 = 0;
					local25.anInt1566 = 0;
					local25.anInt1552 = local93;
					local25.anInt1569 = local97;
					local25.anInt1534 = local25.anInt1570;
					local25.anInt1564 = 0;
				}
			}
			if ((local29 & 0x10) != 0) {
				local25.anInt1554 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local93 = Static59.aClass2_Sub8_Sub1_19.method1401();
				if (local25.anInt1554 == 65535) {
					local25.anInt1554 = -1;
				}
				local25.anInt1557 = 0;
				local25.anInt1563 = 0;
				local25.anInt1537 = local93 >> 16;
				local25.anInt1535 = (local93 & 0xFFFF) + Static108.anInt2902;
				if (Static108.anInt2902 < local25.anInt1535) {
					local25.anInt1563 = -1;
				}
			}
			if ((local29 & 0x1) != 0) {
				local93 = Static59.aClass2_Sub8_Sub1_19.method1395();
				local97 = Static59.aClass2_Sub8_Sub1_19.method1395();
				local25.method920(local93, Static108.anInt2902, local97);
				local25.anInt1543 = Static108.anInt2902 + 300;
				local25.anInt1530 = Static59.aClass2_Sub8_Sub1_19.method1412();
				local25.anInt1532 = Static59.aClass2_Sub8_Sub1_19.method1410();
			}
			if ((local29 & 0x20) != 0) {
				local25.anInt1553 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local25.anInt1560 = Static59.aClass2_Sub8_Sub1_19.method1394();
			}
			if ((local29 & 0x40) != 0) {
				local25.aClass65_707 = Static59.aClass2_Sub8_Sub1_19.method1400();
				local25.anInt1531 = 100;
			}
			if ((local29 & 0x4) != 0) {
				local25.anInt1527 = Static59.aClass2_Sub8_Sub1_19.method1382();
				if (local25.anInt1527 == 65535) {
					local25.anInt1527 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!k;II)Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 method1702(@OriginalArg(0) Class33 arg0, @OriginalArg(2) int arg1) {
		return Static47.method821(arg1, arg0) ? Static51.method899() : null;
	}
}
