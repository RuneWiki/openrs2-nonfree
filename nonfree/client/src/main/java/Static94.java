import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!pe", name = "Tb", descriptor = "I")
	public static int anInt2162;

	@OriginalMember(owner = "client!pe", name = "bc", descriptor = "I")
	public static int anInt2164;

	@OriginalMember(owner = "client!pe", name = "fc", descriptor = "Lclient!rb;")
	public static Class70 aClass70_4;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "Lclient!p;")
	public static Class63 aClass63_18 = new Class63(100);

	@OriginalMember(owner = "client!pe", name = "Sb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1019 = Static78.method1313("Please enter your username)3");

	@OriginalMember(owner = "client!pe", name = "Ub", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1020 = Static78.method1313("<col=ff0000>");

	@OriginalMember(owner = "client!pe", name = "Vb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1021 = Static78.method1313("Loaded title screen");

	@OriginalMember(owner = "client!pe", name = "jc", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1030 = Static78.method1313("flash3:");

	@OriginalMember(owner = "client!pe", name = "Wb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1022 = aClass25_1030;

	@OriginalMember(owner = "client!pe", name = "Xb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1023 = Static78.method1313("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!pe", name = "Yb", descriptor = "I")
	public static int anInt2163 = 0;

	@OriginalMember(owner = "client!pe", name = "Zb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1024 = Static78.method1313("mn");

	@OriginalMember(owner = "client!pe", name = "ac", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1025 = aClass25_1019;

	@OriginalMember(owner = "client!pe", name = "cc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1026 = Static78.method1313("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!pe", name = "dc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1027 = aClass25_1021;

	@OriginalMember(owner = "client!pe", name = "gc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1028 = Static78.method1313("<col=ff3000>");

	@OriginalMember(owner = "client!pe", name = "hc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1029 = Static78.method1313("huffman");

	@OriginalMember(owner = "client!pe", name = "ic", descriptor = "[I")
	public static int[] anIntArray381 = new int[500];

	@OriginalMember(owner = "client!pe", name = "kc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1031 = aClass25_1030;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)Z")
	public static boolean method1578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && arg0 == Static49.anInt1232) {
			return true;
		} else if (arg1 == 1 && Static8.anInt228 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static54.anInt1294 == arg0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
	public static void method1579() {
		aClass25_1022 = null;
		aClass25_1025 = null;
		aClass25_1029 = null;
		aClass25_1030 = null;
		aClass25_1027 = null;
		aClass25_1031 = null;
		aClass25_1020 = null;
		aClass25_1028 = null;
		aClass25_1024 = null;
		aClass25_1026 = null;
		aClass70_4 = null;
		aClass25_1019 = null;
		aClass63_18 = null;
		anIntArray381 = null;
		aClass25_1021 = null;
		aClass25_1023 = null;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	public static void method1580() {
		Static35.aClass1_Sub5_Sub1_1.method685();
		@Pc(9) int local9 = Static35.aClass1_Sub5_Sub1_1.method691(8);
		@Pc(22) int local22;
		if (local9 < Static13.anInt383) {
			for (local22 = local9; local22 < Static13.anInt383; local22++) {
				Static28.anIntArray151[Static25.anInt719++] = Static106.anIntArray423[local22];
			}
		}
		if (local9 > Static13.anInt383) {
			throw new RuntimeException("gnpov1");
		}
		Static13.anInt383 = 0;
		for (local22 = 0; local22 < local9; local22++) {
			@Pc(64) int local64 = Static106.anIntArray423[local22];
			@Pc(68) Class1_Sub2_Sub3_Sub4_Sub1 local68 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local64];
			@Pc(73) int local73 = Static35.aClass1_Sub5_Sub1_1.method691(1);
			if (local73 == 0) {
				Static106.anIntArray423[Static13.anInt383++] = local64;
				local68.anInt2794 = Static60.anInt1366;
			} else {
				@Pc(93) int local93 = Static35.aClass1_Sub5_Sub1_1.method691(2);
				if (local93 == 0) {
					Static106.anIntArray423[Static13.anInt383++] = local64;
					local68.anInt2794 = Static60.anInt1366;
					Static85.anIntArray336[Static59.anInt1356++] = local64;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local93 == 1) {
						Static106.anIntArray423[Static13.anInt383++] = local64;
						local68.anInt2794 = Static60.anInt1366;
						local138 = Static35.aClass1_Sub5_Sub1_1.method691(3);
						local68.method1971(false, local138);
						local148 = Static35.aClass1_Sub5_Sub1_1.method691(1);
						if (local148 == 1) {
							Static85.anIntArray336[Static59.anInt1356++] = local64;
						}
					} else if (local93 == 2) {
						Static106.anIntArray423[Static13.anInt383++] = local64;
						local68.anInt2794 = Static60.anInt1366;
						local138 = Static35.aClass1_Sub5_Sub1_1.method691(3);
						local68.method1971(true, local138);
						local148 = Static35.aClass1_Sub5_Sub1_1.method691(3);
						local68.method1971(true, local148);
						@Pc(202) int local202 = Static35.aClass1_Sub5_Sub1_1.method691(1);
						if (local202 == 1) {
							Static85.anIntArray336[Static59.anInt1356++] = local64;
						}
					} else if (local93 == 3) {
						Static28.anIntArray151[Static25.anInt719++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	public static int method1582(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = (local19 >>> 4) + local19 & 0xF0F0F0F;
		@Pc(37) int local37 = local27 + (local27 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public static void method1588() {
		try {
			if (Static80.anInt1778 == 0) {
				if (Static100.aClass77_5 != null) {
					Static100.aClass77_5.method1909();
					Static100.aClass77_5 = null;
				}
				Static34.anInt941 = 0;
				Static93.aClass50_5 = null;
				Static80.anInt1778 = 1;
				Static25.aBoolean22 = false;
			}
			if (Static80.anInt1778 == 1) {
				if (Static93.aClass50_5 == null) {
					Static93.aClass50_5 = Static71.aClass74_2.method1817(Static102.anInt2365, Static52.aString1);
				}
				if (Static93.aClass50_5.anInt1485 == 2) {
					throw new IOException();
				}
				if (Static93.aClass50_5.anInt1485 == 1) {
					Static100.aClass77_5 = new Class77((Socket) Static93.aClass50_5.anObject4, Static71.aClass74_2);
					Static93.aClass50_5 = null;
					Static80.anInt1778 = 2;
				}
			}
			if (Static80.anInt1778 == 2) {
				@Pc(81) long local81 = Static38.aLong76 = Static81.aClass25_862.method770();
				Static68.aClass1_Sub5_Sub1_2.anInt792 = 0;
				Static68.aClass1_Sub5_Sub1_2.method676(14);
				@Pc(95) int local95 = (int) (local81 >> 16 & 0x1FL);
				Static68.aClass1_Sub5_Sub1_2.method676(local95);
				Static100.aClass77_5.method1904(2, Static68.aClass1_Sub5_Sub1_2.aByteArray13);
				Static80.anInt1778 = 3;
				Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
			}
			@Pc(128) int local128;
			if (Static80.anInt1778 == 3) {
				if (Static18.aClass57_1 != null) {
					Static18.aClass57_1.method2007();
				}
				if (Static90.aClass57_2 != null) {
					Static90.aClass57_2.method2007();
				}
				local128 = Static100.aClass77_5.method1907();
				if (Static18.aClass57_1 != null) {
					Static18.aClass57_1.method2007();
				}
				if (Static90.aClass57_2 != null) {
					Static90.aClass57_2.method2007();
				}
				if (local128 != 0) {
					Static47.method977(local128);
					return;
				}
				Static80.anInt1778 = 4;
				Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
			}
			if (Static80.anInt1778 == 4) {
				if (Static35.aClass1_Sub5_Sub1_1.anInt792 < 8) {
					local128 = Static100.aClass77_5.method1902();
					if (local128 > 8 - Static35.aClass1_Sub5_Sub1_1.anInt792) {
						local128 = 8 - Static35.aClass1_Sub5_Sub1_1.anInt792;
					}
					if (local128 > 0) {
						Static100.aClass77_5.method1905(Static35.aClass1_Sub5_Sub1_1.anInt792, Static35.aClass1_Sub5_Sub1_1.aByteArray13, local128);
						Static35.aClass1_Sub5_Sub1_1.anInt792 += local128;
					}
				}
				if (Static35.aClass1_Sub5_Sub1_1.anInt792 == 8) {
					Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
					Static37.aLong72 = Static35.aClass1_Sub5_Sub1_1.method669();
					Static80.anInt1778 = 5;
				}
			}
			if (Static80.anInt1778 == 5) {
				Static68.aClass1_Sub5_Sub1_2.anInt792 = 0;
				@Pc(220) int[] local220 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static37.aLong72 >> 32), (int) Static37.aLong72 };
				Static68.aClass1_Sub5_Sub1_2.method676(10);
				Static68.aClass1_Sub5_Sub1_2.method633(local220[0]);
				Static68.aClass1_Sub5_Sub1_2.method633(local220[1]);
				Static68.aClass1_Sub5_Sub1_2.method633(local220[2]);
				Static68.aClass1_Sub5_Sub1_2.method633(local220[3]);
				Static68.aClass1_Sub5_Sub1_2.method633(Static71.aClass74_2.anInt2621);
				Static68.aClass1_Sub5_Sub1_2.method640(Static81.aClass25_862.method770());
				Static68.aClass1_Sub5_Sub1_2.method637(Static81.aClass25_857);
				Static68.aClass1_Sub5_Sub1_2.method673(Static118.aBigInteger2, Static10.aBigInteger1);
				Static82.aClass1_Sub5_Sub1_3.anInt792 = 0;
				if (Static48.anInt1227 == 40) {
					Static82.aClass1_Sub5_Sub1_3.method676(18);
				} else {
					Static82.aClass1_Sub5_Sub1_3.method676(16);
				}
				Static82.aClass1_Sub5_Sub1_3.method676(Static68.aClass1_Sub5_Sub1_2.anInt792 + 69);
				Static82.aClass1_Sub5_Sub1_3.method633(458);
				Static82.aClass1_Sub5_Sub1_3.method676(Static63.aBoolean55 ? 1 : 0);
				Static82.aClass1_Sub5_Sub1_3.method633(Static38.aClass56_Sub1_5.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static67.aClass56_Sub1_11.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static49.aClass56_Sub1_9.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static71.aClass56_Sub1_12.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static45.aClass56_Sub1_6.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static18.aClass56_Sub1_2.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static49.aClass56_Sub1_10.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static96.aClass56_Sub1_19.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static110.aClass56_Sub1_17.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static45.aClass56_Sub1_7.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static1.aClass56_Sub1_1.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static120.aClass56_Sub1_20.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static25.aClass56_Sub1_4.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static111.aClass56_Sub1_18.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static25.aClass56_Sub1_3.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method633(Static48.aClass56_Sub1_8.anInt1645);
				Static82.aClass1_Sub5_Sub1_3.method662(Static68.aClass1_Sub5_Sub1_2.anInt792, Static68.aClass1_Sub5_Sub1_2.aByteArray13);
				Static100.aClass77_5.method1904(Static82.aClass1_Sub5_Sub1_3.anInt792, Static82.aClass1_Sub5_Sub1_3.aByteArray13);
				Static68.aClass1_Sub5_Sub1_2.method683(local220);
				for (@Pc(432) int local432 = 0; local432 < 4; local432++) {
					local220[local432] += 50;
				}
				Static35.aClass1_Sub5_Sub1_1.method683(local220);
				Static80.anInt1778 = 6;
			}
			if (Static80.anInt1778 == 6 && Static100.aClass77_5.method1902() > 0) {
				local128 = Static100.aClass77_5.method1907();
				if (local128 == 21 && Static48.anInt1227 == 20) {
					Static80.anInt1778 = 7;
				} else if (local128 == 2) {
					Static80.anInt1778 = 9;
				} else if (local128 == 15 && Static48.anInt1227 == 40) {
					Static75.method1227();
					return;
				} else if (local128 == 23 && Static121.anInt2877 < 1) {
					Static121.anInt2877++;
					Static80.anInt1778 = 0;
				} else {
					Static47.method977(local128);
					return;
				}
			}
			if (Static80.anInt1778 == 7 && Static100.aClass77_5.method1902() > 0) {
				Static80.anInt1782 = Static100.aClass77_5.method1907() * 60 + 180;
				Static80.anInt1778 = 8;
			}
			if (Static80.anInt1778 == 8) {
				Static34.anInt941 = 0;
				Static114.method1829(Static116.method1859(new Class25[] { Static74.method1214(Static80.anInt1782 / 60), Static76.aClass25_780 }), Static80.aClass25_851, Static31.aClass25_364);
				if (--Static80.anInt1782 <= 0) {
					Static80.anInt1778 = 0;
				}
			} else {
				if (Static80.anInt1778 == 9 && Static100.aClass77_5.method1902() >= 8) {
					Static5.anInt108 = Static100.aClass77_5.method1907();
					Static87.aBoolean64 = Static100.aClass77_5.method1907() == 1;
					Static45.anInt1178 = Static100.aClass77_5.method1907();
					Static45.anInt1178 <<= 0x8;
					Static45.anInt1178 += Static100.aClass77_5.method1907();
					Static109.anInt2506 = Static100.aClass77_5.method1907();
					Static100.aClass77_5.method1905(0, Static35.aClass1_Sub5_Sub1_1.aByteArray13, 1);
					Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
					Static38.anInt1078 = Static35.aClass1_Sub5_Sub1_1.method689();
					Static100.aClass77_5.method1905(0, Static35.aClass1_Sub5_Sub1_1.aByteArray13, 2);
					Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
					Static110.anInt2558 = Static35.aClass1_Sub5_Sub1_1.method651();
					Static80.anInt1778 = 10;
				}
				if (Static80.anInt1778 != 10) {
					Static34.anInt941++;
					if (Static34.anInt941 > 2000) {
						if (Static121.anInt2877 < 1) {
							if (Static69.anInt1483 == Static102.anInt2365) {
								Static102.anInt2365 = Static55.anInt1307;
							} else {
								Static102.anInt2365 = Static69.anInt1483;
							}
							Static80.anInt1778 = 0;
							Static121.anInt2877++;
						} else {
							Static47.method977(-3);
						}
					}
				} else if (Static100.aClass77_5.method1902() >= Static110.anInt2558) {
					Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
					Static100.aClass77_5.method1905(0, Static35.aClass1_Sub5_Sub1_1.aByteArray13, Static110.anInt2558);
					Static70.method1098();
					Static59.anInt1354 = -1;
					Static77.method1292(false);
					Static38.anInt1078 = -1;
				}
			}
		} catch (@Pc(704) IOException local704) {
			if (Static121.anInt2877 < 1) {
				if (Static102.anInt2365 == Static69.anInt1483) {
					Static102.anInt2365 = Static55.anInt1307;
				} else {
					Static102.anInt2365 = Static69.anInt1483;
				}
				Static80.anInt1778 = 0;
				Static121.anInt2877++;
			} else {
				Static47.method977(-2);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)V")
	public static void method1590(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static49.anInt1230 >= 100) {
			Static25.method584(0, Static100.aClass25_1101, Static92.aClass25_985);
			return;
		}
		@Pc(25) Class25 local25 = Static24.method575(arg0).method772();
		for (@Pc(27) int local27 = 0; local27 < Static49.anInt1230; local27++) {
			if (arg0 == Static68.aLongArray3[local27]) {
				Static25.method584(0, Static116.method1859(new Class25[] { local25, Static104.aClass25_1128 }), Static92.aClass25_985);
				return;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static80.anInt1786; local71++) {
			if (arg0 == Static129.aLongArray6[local71]) {
				Static25.method584(0, Static116.method1859(new Class25[] { Static93.aClass25_1002, local25, Static86.aClass25_934 }), Static92.aClass25_985);
				return;
			}
		}
		if (!local25.method787(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass25_1384)) {
			Static68.aLongArray3[Static49.anInt1230++] = arg0;
			Static90.aBoolean98 = true;
			Static68.aClass1_Sub5_Sub1_2.method688(209);
			Static68.aClass1_Sub5_Sub1_2.method640(arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z")
	public static boolean method1591(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V")
	public static void method1593() {
		Static4.aBoolean1 = true;
		Static63.aBoolean55 = true;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)I")
	public static int method1596(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
