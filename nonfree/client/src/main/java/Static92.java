import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Lclient!ud;")
	public static Class5 aClass5_28;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	public static int anInt2172;

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lclient!p;")
	public static Class45 aClass45_29;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!qc;")
	public static Class47 aClass47_21 = new Class47(500);

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Lclient!o;")
	public static Class40 aClass40_617 = Static13.method257("Ok");

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "Lclient!o;")
	public static Class40 aClass40_618 = Static13.method257("System update in: ");

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Lclient!od;")
	public static Class44 aClass44_7 = new Class44();

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "Lclient!o;")
	public static Class40 aClass40_619 = Static13.method257("Loading interfaces )2 ");

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_620 = Static13.method257("p11_full");

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "Lclient!o;")
	public static Class40 aClass40_621 = Static13.method257("To switch to a members)2only world:*6n1(Y Logout and return to the world selection page)3*6n2(Y Choose one of the members world with a gold star next to it(Ws name)3*6n*6nIf you prefer you can continue to use this world)1*6nbut members only features will be unavailable here)3");

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "Lclient!o;")
	public static Class40 aClass40_622 = Static13.method257("@cr2@");

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
	public static int anInt2170 = 0;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method1479() {
		if (Static67.anInt1672 > 0) {
			Static67.anInt1672--;
		}
		if (Static84.anInt1973 > 1) {
			Static84.anInt1973--;
		}
		if (Static76.aBoolean164) {
			Static76.aBoolean164 = false;
			Static34.method626();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static2.method22(); local27++) {
		}
		if (Static44.anInt1075 != 30 && Static44.anInt1075 != 35) {
			return;
		}
		@Pc(66) int local66;
		if (Static75.aBoolean147 && Static44.anInt1075 == 30) {
			Static86.anInt2030 = 0;
			anInt2170 = 0;
			while (Static97.method1561()) {
			}
			for (local66 = 0; local66 < Static100.aBooleanArray37.length; local66++) {
				Static100.aBooleanArray37[local66] = false;
			}
		}
		Static68.method337(Static80.aClass2_Sub3_Sub1_4);
		@Pc(88) Object local88 = Static44.aClass52_1.anObject5;
		@Pc(115) int local115;
		@Pc(112) int local112;
		@Pc(117) int local117;
		@Pc(132) int local132;
		synchronized (Static44.aClass52_1.anObject5) {
			if (!Static43.aBoolean149) {
				Static44.aClass52_1.anInt1982 = 0;
			} else if (Static86.anInt2030 != 0 || Static44.aClass52_1.anInt1982 >= 40) {
				Static80.aClass2_Sub3_Sub1_4.method1736(94);
				Static80.aClass2_Sub3_Sub1_4.method1703(0);
				local112 = 0;
				local115 = Static80.aClass2_Sub3_Sub1_4.anInt2546;
				@Pc(150) int local150;
				for (local117 = 0; local117 < Static44.aClass52_1.anInt1982 && Static80.aClass2_Sub3_Sub1_4.anInt2546 - local115 < 240; local117++) {
					local112++;
					local132 = Static44.aClass52_1.anIntArray432[local117];
					if (local132 < 0) {
						local132 = 0;
					} else if (local132 > 764) {
						local132 = 764;
					}
					local150 = Static44.aClass52_1.anIntArray433[local117];
					if (local150 < 0) {
						local150 = 0;
					} else if (local150 > 502) {
						local150 = 502;
					}
					@Pc(172) int local172 = local150 * 765 + local132;
					if (Static44.aClass52_1.anIntArray433[local117] == -1 && Static44.aClass52_1.anIntArray432[local117] == -1) {
						local132 = -1;
						local150 = -1;
						local172 = 524287;
					}
					if (local132 != Static79.anInt1871 || Static19.anInt442 != local150) {
						@Pc(215) int local215 = local132 - Static79.anInt1871;
						Static79.anInt1871 = local132;
						@Pc(222) int local222 = local150 - Static19.anInt442;
						Static19.anInt442 = local150;
						if (Static63.anInt1612 < 8 && local215 >= -32 && local215 <= 31 && local222 >= -32 && local222 <= 31) {
							local215 += 32;
							local222 += 32;
							Static80.aClass2_Sub3_Sub1_4.method1694((Static63.anInt1612 << 12) + (local215 << 6) + local222);
							Static63.anInt1612 = 0;
						} else if (Static63.anInt1612 < 8) {
							Static80.aClass2_Sub3_Sub1_4.method1688(local172 + (Static63.anInt1612 << 19) + 8388608);
							Static63.anInt1612 = 0;
						} else {
							Static80.aClass2_Sub3_Sub1_4.method1725((Static63.anInt1612 << 19) + local172 - 1073741824);
							Static63.anInt1612 = 0;
						}
					} else if (Static63.anInt1612 < 2047) {
						Static63.anInt1612++;
					}
				}
				Static80.aClass2_Sub3_Sub1_4.method1731(Static80.aClass2_Sub3_Sub1_4.anInt2546 - local115);
				if (local112 < Static44.aClass52_1.anInt1982) {
					Static44.aClass52_1.anInt1982 -= local112;
					for (local150 = 0; local150 < Static44.aClass52_1.anInt1982; local150++) {
						Static44.aClass52_1.anIntArray432[local150] = Static44.aClass52_1.anIntArray432[local112 + local150];
						Static44.aClass52_1.anIntArray433[local150] = Static44.aClass52_1.anIntArray433[local150 + local112];
					}
				} else {
					Static44.aClass52_1.anInt1982 = 0;
				}
			}
		}
		if (Static86.anInt2030 != 0) {
			@Pc(380) long local380 = (Static1.aLong1 - Static5.aLong12) / 50L;
			if (local380 > 4095L) {
				local380 = 4095L;
			}
			Static5.aLong12 = Static1.aLong1;
			@Pc(394) byte local394 = 0;
			local115 = Static90.anInt2133;
			if (local115 < 0) {
				local115 = 0;
			} else if (local115 > 502) {
				local115 = 502;
			}
			if (Static86.anInt2030 == 2) {
				local394 = 1;
			}
			local112 = Static107.anInt2500;
			local132 = (int) local380;
			Static80.aClass2_Sub3_Sub1_4.method1736(55);
			if (local112 < 0) {
				local112 = 0;
			} else if (local112 > 764) {
				local112 = 764;
			}
			local117 = local115 * 765 + local112;
			Static80.aClass2_Sub3_Sub1_4.method1697(local117 + (local132 << 20) + (local394 << 19));
		}
		if (Static1.anInt10 > 0) {
			Static1.anInt10--;
		}
		if (Static100.aBooleanArray37[96] || Static100.aBooleanArray37[97] || Static100.aBooleanArray37[98] || Static100.aBooleanArray37[99]) {
			Static61.aBoolean121 = true;
		}
		if (Static61.aBoolean121 && Static1.anInt10 <= 0) {
			Static1.anInt10 = 20;
			Static61.aBoolean121 = false;
			Static80.aClass2_Sub3_Sub1_4.method1736(2);
			Static80.aClass2_Sub3_Sub1_4.method1707(Static67.anInt1669);
			Static80.aClass2_Sub3_Sub1_4.method1720(Static93.anInt2177);
		}
		if (Static97.aBoolean174 && !Static12.aBoolean27) {
			Static12.aBoolean27 = true;
			Static80.aClass2_Sub3_Sub1_4.method1736(99);
			Static80.aClass2_Sub3_Sub1_4.method1703(1);
		}
		if (!Static97.aBoolean174 && Static12.aBoolean27) {
			Static12.aBoolean27 = false;
			Static80.aClass2_Sub3_Sub1_4.method1736(99);
			Static80.aClass2_Sub3_Sub1_4.method1703(0);
		}
		Static79.method1277();
		if (Static44.anInt1075 != 30 && Static44.anInt1075 != 35) {
			return;
		}
		Static74.method1209();
		Static36.method637();
		Static7.anInt231++;
		if (Static7.anInt231 > 750) {
			Static34.method626();
			return;
		}
		Static72.method1197();
		Static75.method1227();
		Static2.method19();
		Static45.anInt1095++;
		if (Static45.anInt1096 != 0) {
			Static101.anInt2410 += 20;
			if (Static101.anInt2410 >= 400) {
				Static45.anInt1096 = 0;
			}
		}
		if (Static21.anInt481 != 0) {
			Static29.anInt719++;
			if (Static29.anInt719 >= 15) {
				if (Static21.anInt481 == 3) {
					Static73.aBoolean144 = true;
				}
				if (Static21.anInt481 == 2) {
					Static33.aBoolean59 = true;
				}
				Static21.anInt481 = 0;
			}
		}
		if (Static88.anInt2077 != 0) {
			Static1.anInt14++;
			if (Static32.anInt742 > Static13.anInt309 + 5 || Static13.anInt309 - 5 > Static32.anInt742 || Static100.anInt2394 > Static63.anInt1571 + 5 || Static63.anInt1571 - 5 > Static100.anInt2394) {
				Static72.aBoolean142 = true;
			}
			if (anInt2170 == 0) {
				if (Static88.anInt2077 == 2) {
					Static33.aBoolean59 = true;
				}
				if (Static88.anInt2077 == 3) {
					Static73.aBoolean144 = true;
				}
				Static88.anInt2077 = 0;
				if (Static72.aBoolean142 && Static1.anInt14 >= 5) {
					Static68.anInt390 = -1;
					Static20.method389();
					if (Static80.anInt1911 == Static68.anInt390 && Static18.anInt434 != Static95.anInt2239) {
						@Pc(753) byte local753 = 0;
						@Pc(757) Class2_Sub2_Sub13 local757 = Static81.method1340(Static80.anInt1911);
						if (Static5.anInt182 == 1 && local757.anInt1610 == 206) {
							local753 = 1;
						}
						if (local757.anIntArray331[Static18.anInt434] <= 0) {
							local753 = 0;
						}
						if (local757.aBoolean126) {
							local115 = Static95.anInt2239;
							local112 = Static18.anInt434;
							local757.anIntArray331[local112] = local757.anIntArray331[local115];
							local757.anIntArray327[local112] = local757.anIntArray327[local115];
							local757.anIntArray331[local115] = -1;
							local757.anIntArray327[local115] = 0;
						} else if (local753 == 1) {
							local112 = Static18.anInt434;
							local115 = Static95.anInt2239;
							while (local115 != local112) {
								if (local112 < local115) {
									local757.method1054(local115 - 1, local115);
									local115--;
								} else if (local112 > local115) {
									local757.method1054(local115 + 1, local115);
									local115++;
								}
							}
						} else {
							local757.method1054(Static18.anInt434, Static95.anInt2239);
						}
						Static80.aClass2_Sub3_Sub1_4.method1736(125);
						Static80.aClass2_Sub3_Sub1_4.method1720(Static95.anInt2239);
						Static80.aClass2_Sub3_Sub1_4.method1711(Static18.anInt434);
						Static80.aClass2_Sub3_Sub1_4.method1697(Static80.anInt1911);
						Static80.aClass2_Sub3_Sub1_4.method1716(local753);
					}
				} else if ((Static10.anInt263 == 1 || Static35.method634(Static34.anInt797 - 1)) && Static34.anInt797 > 2) {
					Static29.method583();
				} else if (Static34.anInt797 > 0) {
					Static96.method1549(Static34.anInt797 - 1);
				}
				Static86.anInt2030 = 0;
				Static29.anInt719 = 10;
			}
		}
		@Pc(890) int local890;
		if (Static89.anInt2100 != -1) {
			local890 = Static89.anInt2096;
			local66 = Static89.anInt2100;
			@Pc(912) boolean local912 = Static83.method1349(local890, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 0, true, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local66);
			Static89.anInt2100 = -1;
			if (local912) {
				Static62.anInt1554 = Static107.anInt2500;
				Static45.anInt1096 = 1;
				Static101.anInt2410 = 0;
				Static102.anInt2465 = Static90.anInt2133;
			}
		}
		if (Static86.anInt2030 == 1 && Static17.aClass40_112 != null) {
			Static86.anInt2030 = 0;
			Static73.aBoolean144 = true;
			Static17.aClass40_112 = null;
		}
		Static63.method1060();
		if (Static84.anInt1971 == -1) {
			Static86.method1386();
			Static81.method1337();
			Static80.method1331();
		}
		if (anInt2170 == 1 || Static86.anInt2030 == 1) {
			Static56.anInt2326++;
		}
		if (Static59.anInt1501 == -1 && Static96.anInt2340 == -1 && Static41.anInt1012 == -1) {
			if (Static66.anInt1645 > 0) {
				Static66.anInt1645--;
			}
		} else if (Static66.anInt1645 < 100) {
			Static66.anInt1645++;
			if (Static66.anInt1645 == 100) {
				if (Static96.anInt2340 != -1) {
					Static33.aBoolean59 = true;
				}
				if (Static59.anInt1501 != -1) {
					Static73.aBoolean144 = true;
				}
			}
		}
		Static18.method357();
		if (Static7.aBoolean22) {
			Static83.method1348();
		}
		for (local66 = 0; local66 < 5; local66++) {
			@Pc(1017) int local1017 = Static79.anIntArray415[local66]++;
		}
		Static106.method1740();
		local890 = Static34.method623();
		local115 = Static76.method1477();
		if (local890 > 4500 && local115 > 4500) {
			Static67.anInt1672 = 250;
			Static37.method722(4000);
			Static80.aClass2_Sub3_Sub1_4.method1736(247);
		}
		Static91.anInt2146++;
		Static29.anInt716++;
		Static83.anInt1966++;
		if (Static29.anInt716 > 500) {
			Static29.anInt716 = 0;
			local112 = (int) (Math.random() * 8.0D);
			if ((local112 & 0x4) == 4) {
				Static10.anInt262 += Static56.anInt2299;
			}
			if ((local112 & 0x1) == 1) {
				Static104.anInt2518 += Static72.anInt1779;
			}
			if ((local112 & 0x2) == 2) {
				Static98.anInt2371 += Static25.anInt667;
			}
		}
		if (Static83.anInt1966 > 500) {
			Static83.anInt1966 = 0;
			local112 = (int) (Math.random() * 8.0D);
			if ((local112 & 0x2) == 2) {
				Static15.anInt1857 += Static34.anInt798;
			}
			if ((local112 & 0x1) == 1) {
				Static84.anInt1978 += Static34.anInt804;
			}
		}
		if (Static15.anInt1857 < -20) {
			Static34.anInt798 = 1;
		}
		if (Static10.anInt262 < -40) {
			Static56.anInt2299 = 1;
		}
		if (Static84.anInt1978 < -60) {
			Static34.anInt804 = 2;
		}
		if (Static84.anInt1978 > 60) {
			Static34.anInt804 = -2;
		}
		if (Static104.anInt2518 < -50) {
			Static72.anInt1779 = 2;
		}
		if (Static98.anInt2371 < -55) {
			Static25.anInt667 = 2;
		}
		if (Static104.anInt2518 > 50) {
			Static72.anInt1779 = -2;
		}
		if (Static15.anInt1857 > 10) {
			Static34.anInt798 = -1;
		}
		if (Static10.anInt262 > 40) {
			Static56.anInt2299 = -1;
		}
		if (Static98.anInt2371 > 55) {
			Static25.anInt667 = -2;
		}
		if (Static91.anInt2146 > 50) {
			Static80.aClass2_Sub3_Sub1_4.method1736(217);
		}
		try {
			if (Static70.aClass25_36 != null && Static80.aClass2_Sub3_Sub1_4.anInt2546 > 0) {
				Static70.aClass25_36.method731(Static80.aClass2_Sub3_Sub1_4.aByteArray24, Static80.aClass2_Sub3_Sub1_4.anInt2546);
				Static80.aClass2_Sub3_Sub1_4.anInt2546 = 0;
				Static91.anInt2146 = 0;
			}
		} catch (@Pc(1235) IOException local1235) {
			Static34.method626();
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public static void method1480() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
		System.exit(1);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method1482() {
		aClass40_617 = null;
		aClass44_7 = null;
		aClass40_620 = null;
		aClass5_28 = null;
		aClass40_619 = null;
		aClass40_622 = null;
		aClass45_29 = null;
		anIntArray472 = null;
		aBooleanArray31 = null;
		aClass40_618 = null;
		aClass40_621 = null;
		aClass47_21 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ud;Z)V")
	public static void method1483(@OriginalArg(0) Class5 arg0) {
		Static27.aClass5_9 = arg0;
		Static59.anInt1505 = Static27.aClass5_9.method76(16);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ud;I)Z")
	public static boolean method1484(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg1.method68(arg0, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static86.method1384(local9);
			return true;
		}
	}
}
