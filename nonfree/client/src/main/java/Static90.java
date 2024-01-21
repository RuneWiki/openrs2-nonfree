import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	public static int anInt545;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "Z")
	private static boolean aBoolean38;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!rd;")
	private static Class64 aClass64_340 = Static69.method1153("Loaded title screen");

	@OriginalMember(owner = "client!r", name = "k", descriptor = "Lclient!rd;")
	public static Class64 aClass64_341 = Static69.method1153("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_342 = aClass64_340;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Lclient!dd;")
	public static Class19 aClass19_21 = new Class19(260);

	@OriginalMember(owner = "client!r", name = "M", descriptor = "Lclient!rd;")
	public static Class64 aClass64_343 = Static69.method1153("M");

	@OriginalMember(owner = "client!r", name = "R", descriptor = "[I")
	public static int[] anIntArray69 = new int[2048];

	@OriginalMember(owner = "client!r", name = "S", descriptor = "Lclient!rd;")
	public static Class64 aClass64_344 = Static69.method1153("@gr3@");

	@OriginalMember(owner = "client!r", name = "T", descriptor = "I")
	public static int anInt560 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method327() {
		try {
			if (Static69.anInt1562 == 0) {
				if (Static14.aClass27_1 != null) {
					Static14.aClass27_1.method562();
					Static14.aClass27_1 = null;
				}
				Static43.aClass48_6 = null;
				Static69.anInt1562 = 1;
				Static99.anInt2205 = 0;
				Static50.aBoolean69 = false;
			}
			if (Static69.anInt1562 == 1) {
				if (Static43.aClass48_6 == null) {
					Static43.aClass48_6 = Static28.aClass28_6.method574(Static105.anInt2477);
				}
				if (Static43.aClass48_6.anInt1534 == 2) {
					throw new IOException();
				}
				if (Static43.aClass48_6.anInt1534 == 1) {
					Static14.aClass27_1 = new Class27((Socket) Static43.aClass48_6.anObject5, Static28.aClass28_6);
					Static69.anInt1562 = 2;
					Static43.aClass48_6 = null;
				}
			}
			if (Static69.anInt1562 == 2) {
				@Pc(78) long local78 = Static6.aLong10 = Static34.aClass64_496.method1492();
				Static49.aClass1_Sub6_Sub1_1.anInt2574 = 0;
				@Pc(88) int local88 = (int) (local78 >> 16 & 0x1FL);
				Static49.aClass1_Sub6_Sub1_1.method1853(14);
				Static49.aClass1_Sub6_Sub1_1.method1853(local88);
				Static14.aClass27_1.method560(2, Static49.aClass1_Sub6_Sub1_1.aByteArray27);
				Static69.anInt1562 = 3;
				Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
			}
			@Pc(119) int local119;
			if (Static69.anInt1562 == 3) {
				local119 = Static14.aClass27_1.method567();
				if (local119 != 0) {
					Static3.method131(local119);
					return;
				}
				Static69.anInt1562 = 4;
				Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
			}
			if (Static69.anInt1562 == 4) {
				if (Static64.aClass1_Sub6_Sub1_2.anInt2574 < 8) {
					local119 = Static14.aClass27_1.method559();
					if (local119 > 8 - Static64.aClass1_Sub6_Sub1_2.anInt2574) {
						local119 = 8 - Static64.aClass1_Sub6_Sub1_2.anInt2574;
					}
					if (local119 > 0) {
						Static14.aClass27_1.method563(Static64.aClass1_Sub6_Sub1_2.anInt2574, Static64.aClass1_Sub6_Sub1_2.aByteArray27, local119);
						Static64.aClass1_Sub6_Sub1_2.anInt2574 += local119;
					}
				}
				if (Static64.aClass1_Sub6_Sub1_2.anInt2574 == 8) {
					Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
					Static69.aLong45 = Static64.aClass1_Sub6_Sub1_2.method1865();
					Static69.anInt1562 = 5;
				}
			}
			if (Static69.anInt1562 == 5) {
				@Pc(192) int[] local192 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), 0, 0 };
				Static49.aClass1_Sub6_Sub1_1.anInt2574 = 0;
				local192[2] = (int) (Static69.aLong45 >> 32);
				local192[3] = (int) Static69.aLong45;
				Static49.aClass1_Sub6_Sub1_1.method1853(10);
				Static49.aClass1_Sub6_Sub1_1.method1851(local192[0]);
				Static49.aClass1_Sub6_Sub1_1.method1851(local192[1]);
				Static49.aClass1_Sub6_Sub1_1.method1851(local192[2]);
				Static49.aClass1_Sub6_Sub1_1.method1851(local192[3]);
				Static49.aClass1_Sub6_Sub1_1.method1851(Static28.aClass28_6.anInt820);
				Static49.aClass1_Sub6_Sub1_1.method1830(Static34.aClass64_496.method1492());
				Static49.aClass1_Sub6_Sub1_1.method1827(Static34.aClass64_502);
				Static49.aClass1_Sub6_Sub1_1.method1836(Static55.aBigInteger52, Static44.aBigInteger18);
				Static71.aClass1_Sub6_Sub1_3.anInt2574 = 0;
				if (Static64.anInt1487 == 40) {
					Static71.aClass1_Sub6_Sub1_3.method1853(18);
				} else {
					Static71.aClass1_Sub6_Sub1_3.method1853(16);
				}
				Static71.aClass1_Sub6_Sub1_3.method1853(Static49.aClass1_Sub6_Sub1_1.anInt2574 + 61);
				Static71.aClass1_Sub6_Sub1_3.method1851(449);
				Static71.aClass1_Sub6_Sub1_3.method1853(Static52.aBoolean169 ? 1 : 0);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static92.aClass41_Sub1_14.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static39.aClass41_Sub1_8.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static95.aClass41_Sub1_16.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static38.aClass41_Sub1_7.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static10.aClass41_Sub1_1.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static81.aClass41_Sub1_11.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static114.aClass41_Sub1_21.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static94.aClass41_Sub1_15.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static85.aClass41_Sub1_22.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static25.aClass41_Sub1_23.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static106.aClass41_Sub1_19.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static44.aClass41_Sub1_9.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static21.aClass41_Sub1_2.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1851(Static67.aClass41_Sub1_12.anInt1395);
				Static71.aClass1_Sub6_Sub1_3.method1858(Static49.aClass1_Sub6_Sub1_1.aByteArray27, Static49.aClass1_Sub6_Sub1_1.anInt2574);
				Static14.aClass27_1.method560(Static71.aClass1_Sub6_Sub1_3.anInt2574, Static71.aClass1_Sub6_Sub1_3.aByteArray27);
				Static49.aClass1_Sub6_Sub1_1.method1875(local192);
				for (@Pc(413) int local413 = 0; local413 < 4; local413++) {
					local192[local413] += 50;
				}
				Static64.aClass1_Sub6_Sub1_2.method1875(local192);
				Static69.anInt1562 = 6;
			}
			if (Static69.anInt1562 == 6 && Static14.aClass27_1.method559() > 0) {
				local119 = Static14.aClass27_1.method567();
				if (local119 == 21 && Static64.anInt1487 == 20) {
					Static69.anInt1562 = 7;
				} else if (local119 == 2) {
					Static69.anInt1562 = 9;
				} else if (local119 == 15 && Static64.anInt1487 == 40) {
					Static39.method686();
					return;
				} else if (local119 == 23 && Static121.anInt2878 < 1) {
					Static69.anInt1562 = 0;
					Static121.anInt2878++;
				} else {
					Static3.method131(local119);
					return;
				}
			}
			if (Static69.anInt1562 == 7 && Static14.aClass27_1.method559() > 0) {
				Static10.anInt417 = (Static14.aClass27_1.method567() + 3) * 60;
				Static69.anInt1562 = 8;
			}
			if (Static69.anInt1562 == 8) {
				Static99.anInt2205 = 0;
				Static11.method268(Static82.method1383(new Class64[] { Static12.method1395(Static10.anInt417 / 60), Static10.aClass64_284 }), Static113.aClass64_1116, Static50.aClass64_755);
				if (--Static10.anInt417 <= 0) {
					Static69.anInt1562 = 0;
				}
			} else {
				if (Static69.anInt1562 == 9 && Static14.aClass27_1.method559() >= 8) {
					Static46.anInt1085 = Static14.aClass27_1.method567();
					Static77.aBoolean114 = Static14.aClass27_1.method567() == 1;
					Static64.anInt1485 = Static14.aClass27_1.method567();
					Static64.anInt1485 <<= 0x8;
					Static64.anInt1485 += Static14.aClass27_1.method567();
					Static108.anInt2551 = Static14.aClass27_1.method567();
					Static14.aClass27_1.method563(0, Static64.aClass1_Sub6_Sub1_2.aByteArray27, 1);
					Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
					Static54.anInt2055 = Static64.aClass1_Sub6_Sub1_2.method1874();
					Static14.aClass27_1.method563(0, Static64.aClass1_Sub6_Sub1_2.aByteArray27, 2);
					Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
					Static62.anInt1454 = Static64.aClass1_Sub6_Sub1_2.method1842();
					Static69.anInt1562 = 10;
				}
				if (Static69.anInt1562 != 10) {
					Static99.anInt2205++;
					if (Static99.anInt2205 > 2000) {
						if (Static121.anInt2878 < 1) {
							Static121.anInt2878++;
							Static69.anInt1562 = 0;
							if (Static48.anInt2585 == Static105.anInt2477) {
								Static105.anInt2477 = Static71.anInt1610;
							} else {
								Static105.anInt2477 = Static48.anInt2585;
							}
						} else {
							Static3.method131(-3);
						}
					}
				} else if (Static14.aClass27_1.method559() >= Static62.anInt1454) {
					Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
					Static14.aClass27_1.method563(0, Static64.aClass1_Sub6_Sub1_2.aByteArray27, Static62.anInt1454);
					Static87.method1431();
					Static108.anInt2553 = -1;
					Static34.method564(false);
					Static54.anInt2055 = -1;
				}
			}
		} catch (@Pc(699) IOException local699) {
			if (Static121.anInt2878 < 1) {
				Static121.anInt2878++;
				Static69.anInt1562 = 0;
				if (Static48.anInt2585 == Static105.anInt2477) {
					Static105.anInt2477 = Static71.anInt1610;
				} else {
					Static105.anInt2477 = Static48.anInt2585;
				}
			} else {
				Static3.method131(-2);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	public static void method329() {
		@Pc(11) Class69 local11 = Static74.aClass69_1;
		synchronized (Static74.aClass69_1) {
			Static95.anInt2167 = Static74.anInt1753;
			@Pc(26) int local26;
			if (Static79.anInt1888 >= 0) {
				while (Static10.anInt397 != Static79.anInt1888) {
					local26 = Static60.anIntArray209[Static10.anInt397];
					Static10.anInt397 = Static10.anInt397 + 1 & 0x7F;
					if (local26 >= 0) {
						Static82.aBooleanArray9[local26] = true;
					} else {
						Static82.aBooleanArray9[~local26] = false;
					}
				}
			} else {
				for (local26 = 0; local26 < 112; local26++) {
					Static82.aBooleanArray9[local26] = false;
				}
				Static79.anInt1888 = Static10.anInt397;
			}
			Static74.anInt1753 = Static17.anInt562;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public static void method339() {
		Static63.aBoolean83 = true;
		Static28.method1687();
		if (Static3.aBoolean9) {
			Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static60.aClass64_865, 239, 40, 0);
			Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static82.method1383(new Class64[] { Static60.aClass64_869, Static66.aClass64_950 }), 239, 60, 128);
		} else if (Static118.anInt2834 == 1) {
			Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static9.aClass64_255, 239, 40, 0);
			Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static82.method1383(new Class64[] { Static60.aClass64_863, Static66.aClass64_950 }), 239, 60, 128);
		} else if (Static118.anInt2834 == 2) {
			Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static37.aClass64_572, 239, 40, 0);
			Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static82.method1383(new Class64[] { Static60.aClass64_863, Static66.aClass64_950 }), 239, 60, 128);
		} else {
			@Pc(64) Class1_Sub1_Sub5_Sub1 local64;
			@Pc(71) int local71;
			@Pc(82) int local82;
			if (Static118.anInt2834 == 3) {
				if (Static60.aClass64_864 != Static60.aClass64_863) {
					Static19.method397(Static60.aClass64_863);
					Static60.aClass64_864 = Static60.aClass64_863;
				}
				local64 = Static3.aClass1_Sub1_Sub5_Sub1_1;
				Static47.method1951(0, 0, 463, 77);
				for (local71 = 0; local71 < Static21.anInt655; local71++) {
					local82 = local71 * 14 + 18 - Static77.anInt1845;
					if (local82 > 0 && local82 < 110) {
						local64.method665(Static6.aClass64Array2[local71], 239, local82, 0);
					}
				}
				Static47.method1949();
				if (Static21.anInt655 > 5) {
					Static110.method1890(Static77.anInt1845, 463, Static21.anInt655 * 14 + 7, 77, 0);
				}
				if (Static60.aClass64_863.method1469() == 0) {
					Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static16.aClass64_329, 239, 40, 255);
				} else if (Static21.anInt655 == 0) {
					Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static31.aClass64_492, 239, 40, 0);
				}
				local64.method665(Static82.method1383(new Class64[] { Static60.aClass64_863, Static66.aClass64_950 }), 239, 90, 0);
				Static47.method1955(0, 77, 479, 0);
			} else if (Static118.anInt2834 == 4) {
				Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static60.aClass64_866, 239, 40, 0);
				Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static82.method1383(new Class64[] { Static60.aClass64_863, Static66.aClass64_950 }), 239, 60, 128);
			} else if (Static48.aClass64_1637 == null) {
				@Pc(217) boolean local217;
				if (Static101.anInt2272 != -1) {
					local217 = Static120.method2100(96, 479, 2, Static101.anInt2272);
					if (!local217) {
						Static116.aBoolean166 = true;
					}
				} else if (Static6.anInt322 == -1) {
					local64 = Static3.aClass1_Sub1_Sub5_Sub1_1;
					Static47.method1951(0, 0, 463, 77);
					local71 = 0;
					for (local82 = 0; local82 < 100; local82++) {
						if (Static120.aClass64Array19[local82] != null) {
							@Pc(244) int local244 = Static22.anIntArray85[local82];
							@Pc(248) Class64 local248 = Static22.aClass64Array8[local82];
							@Pc(257) int local257 = Static43.anInt986 + 70 - local71 * 14;
							@Pc(259) byte local259 = 0;
							if (local248 != null && local248.method1479(Static41.aClass64_1692)) {
								local248 = local248.method1481(5);
								local259 = 1;
							}
							if (local248 != null && local248.method1479(Static66.aClass64_949)) {
								local248 = local248.method1481(5);
								local259 = 2;
							}
							if (local244 == 0) {
								if (local257 > 0 && local257 < 110) {
									local64.method661(Static120.aClass64Array19[local82], 4, local257, 0);
								}
								local71++;
							}
							@Pc(338) int local338;
							if ((local244 == 1 || local244 == 2) && (local244 == 1 || Static10.anInt406 == 0 || Static10.anInt406 == 1 && Static19.method394(local248))) {
								if (local257 > 0 && local257 < 110) {
									local338 = 4;
									if (local259 == 1) {
										Static89.aClass1_Sub1_Sub5_Sub3Array5[0].method1290(4, local257 - 12);
										local338 += 14;
									}
									if (local259 == 2) {
										Static89.aClass1_Sub1_Sub5_Sub3Array5[1].method1290(local338, local257 - 12);
										local338 += 14;
									}
									local64.method661(Static82.method1383(new Class64[] { local248, Static82.aClass64_1178 }), local338, local257, 0);
									local338 += local64.method654(local248) + 8;
									local64.method661(Static120.aClass64Array19[local82], local338, local257, 255);
								}
								local71++;
							}
							if ((local244 == 3 || local244 == 7) && Static21.anInt649 == 0 && (local244 == 7 || Static108.anInt2556 == 0 || Static108.anInt2556 == 1 && Static19.method394(local248))) {
								local71++;
								if (local257 > 0 && local257 < 110) {
									local64.method661(Static58.aClass64_820, 4, local257, 0);
									local338 = local64.method654(Static58.aClass64_820) + 4;
									local338 += local64.method655(32);
									if (local259 == 1) {
										Static89.aClass1_Sub1_Sub5_Sub3Array5[0].method1290(local338, local257 - 12);
										local338 += 14;
									}
									if (local259 == 2) {
										Static89.aClass1_Sub1_Sub5_Sub3Array5[1].method1290(local338, local257 - 12);
										local338 += 14;
									}
									local64.method661(Static82.method1383(new Class64[] { local248, Static82.aClass64_1178 }), local338, local257, 0);
									local338 += local64.method654(local248) + 8;
									local64.method661(Static120.aClass64Array19[local82], local338, local257, 8388608);
								}
							}
							if (local244 == 4 && (Static80.anInt1901 == 0 || Static80.anInt1901 == 1 && Static19.method394(local248))) {
								local71++;
								if (local257 > 0 && local257 < 110) {
									local64.method661(Static82.method1383(new Class64[] { local248, Static117.aClass64_1801, Static120.aClass64Array19[local82] }), 4, local257, 8388736);
								}
							}
							if (local244 == 5 && Static21.anInt649 == 0 && Static108.anInt2556 < 2) {
								local71++;
								if (local257 > 0 && local257 < 110) {
									local64.method661(Static120.aClass64Array19[local82], 4, local257, 8388608);
								}
							}
							if (local244 == 6 && Static21.anInt649 == 0 && Static108.anInt2556 < 2) {
								local71++;
								if (local257 > 0 && local257 < 110) {
									local64.method661(Static82.method1383(new Class64[] { Static15.aClass64_319, Static117.aClass64_1801, local248, Static82.aClass64_1178 }), 4, local257, 0);
									local64.method661(Static120.aClass64Array19[local82], local64.method654(Static82.method1383(new Class64[] { Static15.aClass64_319, Static117.aClass64_1801, local248 })) + 12, local257, 8388608);
								}
							}
							if (local244 == 8 && (Static80.anInt1901 == 0 || Static80.anInt1901 == 1 && Static19.method394(local248))) {
								if (local257 > 0 && local257 < 110) {
									local64.method661(Static82.method1383(new Class64[] { local248, Static117.aClass64_1801, Static120.aClass64Array19[local82] }), 4, local257, 8270336);
								}
								local71++;
							}
						}
					}
					Static47.method1949();
					Static70.anInt1573 = local71 * 14 + 7;
					if (Static70.anInt1573 < 78) {
						Static70.anInt1573 = 78;
					}
					Static110.method1890(Static70.anInt1573 - Static43.anInt986 - 77, 463, Static70.anInt1573, 77, 0);
					@Pc(746) Class64 local746;
					if (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1 == null || Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass64_1543 == null) {
						local746 = Static34.aClass64_496;
					} else {
						local746 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass64_1543;
					}
					local64.method661(Static82.method1383(new Class64[] { local746, Static82.aClass64_1178 }), 4, 90, 0);
					local64.method661(Static82.method1383(new Class64[] { Static60.aClass64_868, Static66.aClass64_950 }), local64.method654(Static82.method1383(new Class64[] { local746, Static114.aClass64_1751 })) + 6, 90, 255);
					Static47.method1955(0, 77, 479, 0);
				} else {
					local217 = Static120.method2100(96, 479, 3, Static6.anInt322);
					if (!local217) {
						Static116.aBoolean166 = true;
					}
				}
			} else {
				Static17.aClass1_Sub1_Sub5_Sub1_2.method658(Static48.aClass64_1637, 10, 20, 459, 40, 0, false, 1, 1, 0);
				Static17.aClass1_Sub1_Sub5_Sub1_2.method665(Static23.aClass64_428, 239, 80, 128);
			}
		}
		if (Static94.aBoolean132 && Static12.anInt1938 == 2) {
			Static19.method391();
		}
		Static75.method1257();
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public static void method340() {
		for (@Pc(6) Class1_Sub7 local6 = (Class1_Sub7) Static91.aClass50_10.method1151(); local6 != null; local6 = (Class1_Sub7) Static91.aClass50_10.method1141()) {
			if (local6.aClass1_Sub2_Sub1_1 != null) {
				Static23.aClass1_Sub2_Sub2_1.method1523(local6.aClass1_Sub2_Sub1_1);
				local6.aClass1_Sub2_Sub1_1 = null;
			}
			if (local6.aClass1_Sub2_Sub1_2 != null) {
				Static23.aClass1_Sub2_Sub2_1.method1523(local6.aClass1_Sub2_Sub1_2);
				local6.aClass1_Sub2_Sub1_2 = null;
			}
		}
		Static91.aClass50_10.method1145();
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public static void method343() {
		anIntArray69 = null;
		aClass19_21 = null;
		aClass64_342 = null;
		aClass64_341 = null;
		aClass64_344 = null;
		aClass64_340 = null;
		aClass64_343 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nd;B)V")
	public static void method346(@OriginalArg(0) Class1_Sub1_Sub11 arg0) {
		@Pc(9) int local9 = arg0.anInt1717 >> 16;
		if (Static101.anInt2272 == local9 || Static6.anInt322 == local9) {
			Static116.aBoolean166 = true;
		}
		if (Static101.anInt2274 == local9 || Static101.anIntArray334[Static83.anInt1922] == local9) {
			Static19.aBoolean41 = true;
		}
	}
}
