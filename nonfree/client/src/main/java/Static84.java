import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

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

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 9)
	public static void method1479() {
		if (Class38.anInt1672 > 0) {
			Class38.anInt1672--;
		}
		if (Class52.anInt1973 > 1) {
			Class52.anInt1973--;
		}
		if (Class45.aBoolean164) {
			Class45.aBoolean164 = false;
			Static32.method626();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static2.method22(); local27++) {
		}
		if (Class2_Sub2_Sub11.anInt1075 != 30 && Class2_Sub2_Sub11.anInt1075 != 35) {
			return;
		}
		@Pc(66) int local66;
		if (Class44.aBoolean147 && Class2_Sub2_Sub11.anInt1075 == 30) {
			Class2_Sub2_Sub12_Sub5.anInt2030 = 0;
			Class45_Sub1.anInt2170 = 0;
			while (Static89.method1561()) {
			}
			for (local66 = 0; local66 < Class2_Sub2_Sub15.aBooleanArray37.length; local66++) {
				Class2_Sub2_Sub15.aBooleanArray37[local66] = false;
			}
		}
		Static63.method337(Class47.aClass2_Sub3_Sub1_4);
		@Pc(88) Object local88 = Static41.aClass52_1.anObject5;
		@Pc(115) int local115;
		@Pc(112) int local112;
		@Pc(117) int local117;
		@Pc(132) int local132;
		synchronized (Static41.aClass52_1.anObject5) {
			if (!Class12.aBoolean149) {
				Static41.aClass52_1.anInt1982 = 0;
			} else if (Class2_Sub2_Sub12_Sub5.anInt2030 != 0 || Static41.aClass52_1.anInt1982 >= 40) {
				Class47.aClass2_Sub3_Sub1_4.method1736(94);
				Class47.aClass2_Sub3_Sub1_4.method1703(0);
				local112 = 0;
				local115 = Class47.aClass2_Sub3_Sub1_4.anInt2546;
				@Pc(150) int local150;
				for (local117 = 0; local117 < Static41.aClass52_1.anInt1982 && Class47.aClass2_Sub3_Sub1_4.anInt2546 - local115 < 240; local117++) {
					local112++;
					local132 = Static41.aClass52_1.anIntArray432[local117];
					if (local132 < 0) {
						local132 = 0;
					} else if (local132 > 764) {
						local132 = 764;
					}
					local150 = Static41.aClass52_1.anIntArray433[local117];
					if (local150 < 0) {
						local150 = 0;
					} else if (local150 > 502) {
						local150 = 502;
					}
					@Pc(172) int local172 = local150 * 765 + local132;
					if (Static41.aClass52_1.anIntArray433[local117] == -1 && Static41.aClass52_1.anIntArray432[local117] == -1) {
						local132 = -1;
						local150 = -1;
						local172 = 524287;
					}
					if (local132 != Class18.anInt1871 || Class17.anInt442 != local150) {
						@Pc(215) int local215 = local132 - Class18.anInt1871;
						Class18.anInt1871 = local132;
						@Pc(222) int local222 = local150 - Class17.anInt442;
						Class17.anInt442 = local150;
						if (Class2_Sub2_Sub13.anInt1612 < 8 && local215 >= -32 && local215 <= 31 && local222 >= -32 && local222 <= 31) {
							local215 += 32;
							local222 += 32;
							Class47.aClass2_Sub3_Sub1_4.method1694((Class2_Sub2_Sub13.anInt1612 << 12) + (local215 << 6) + local222);
							Class2_Sub2_Sub13.anInt1612 = 0;
						} else if (Class2_Sub2_Sub13.anInt1612 < 8) {
							Class47.aClass2_Sub3_Sub1_4.method1688(local172 + (Class2_Sub2_Sub13.anInt1612 << 19) + 8388608);
							Class2_Sub2_Sub13.anInt1612 = 0;
						} else {
							Class47.aClass2_Sub3_Sub1_4.method1725((Class2_Sub2_Sub13.anInt1612 << 19) + local172 - 1073741824);
							Class2_Sub2_Sub13.anInt1612 = 0;
						}
					} else if (Class2_Sub2_Sub13.anInt1612 < 2047) {
						Class2_Sub2_Sub13.anInt1612++;
					}
				}
				Class47.aClass2_Sub3_Sub1_4.method1731(Class47.aClass2_Sub3_Sub1_4.anInt2546 - local115);
				if (local112 < Static41.aClass52_1.anInt1982) {
					Static41.aClass52_1.anInt1982 -= local112;
					for (local150 = 0; local150 < Static41.aClass52_1.anInt1982; local150++) {
						Static41.aClass52_1.anIntArray432[local150] = Static41.aClass52_1.anIntArray432[local112 + local150];
						Static41.aClass52_1.anIntArray433[local150] = Static41.aClass52_1.anIntArray433[local150 + local112];
					}
				} else {
					Static41.aClass52_1.anInt1982 = 0;
				}
			}
		}
		if (Class2_Sub2_Sub12_Sub5.anInt2030 != 0) {
			@Pc(380) long local380 = (Class1.aLong1 - Class2_Sub2_Sub1.aLong12) / 50L;
			if (local380 > 4095L) {
				local380 = 4095L;
			}
			Class2_Sub2_Sub1.aLong12 = Class1.aLong1;
			@Pc(394) byte local394 = 0;
			local115 = Class56.anInt2133;
			if (local115 < 0) {
				local115 = 0;
			} else if (local115 > 502) {
				local115 = 502;
			}
			if (Class2_Sub2_Sub12_Sub5.anInt2030 == 2) {
				local394 = 1;
			}
			local112 = Class24.anInt2500;
			local132 = (int) local380;
			Class47.aClass2_Sub3_Sub1_4.method1736(55);
			if (local112 < 0) {
				local112 = 0;
			} else if (local112 > 764) {
				local112 = 764;
			}
			local117 = local115 * 765 + local112;
			Class47.aClass2_Sub3_Sub1_4.method1697(local117 + (local132 << 20) + (local394 << 19));
		}
		if (Class1.anInt10 > 0) {
			Class1.anInt10--;
		}
		if (Class2_Sub2_Sub15.aBooleanArray37[96] || Class2_Sub2_Sub15.aBooleanArray37[97] || Class2_Sub2_Sub15.aBooleanArray37[98] || Class2_Sub2_Sub15.aBooleanArray37[99]) {
			Class34.aBoolean121 = true;
		}
		if (Class34.aBoolean121 && Class1.anInt10 <= 0) {
			Class1.anInt10 = 20;
			Class34.aBoolean121 = false;
			Class47.aClass2_Sub3_Sub1_4.method1736(2);
			Class47.aClass2_Sub3_Sub1_4.method1707(Class38.anInt1669);
			Class47.aClass2_Sub3_Sub1_4.method1720(Class58.anInt2177);
		}
		if (Static89.aBoolean174 && !Class2_Sub2_Sub3.aBoolean27) {
			Class2_Sub2_Sub3.aBoolean27 = true;
			Class47.aClass2_Sub3_Sub1_4.method1736(99);
			Class47.aClass2_Sub3_Sub1_4.method1703(1);
		}
		if (!Static89.aBoolean174 && Class2_Sub2_Sub3.aBoolean27) {
			Class2_Sub2_Sub3.aBoolean27 = false;
			Class47.aClass2_Sub3_Sub1_4.method1736(99);
			Class47.aClass2_Sub3_Sub1_4.method1703(0);
		}
		Static71.method1277();
		if (Class2_Sub2_Sub11.anInt1075 != 30 && Class2_Sub2_Sub11.anInt1075 != 35) {
			return;
		}
		Static68.method1209();
		Static34.method637();
		Class6.anInt231++;
		if (Class6.anInt231 > 750) {
			Static32.method626();
			return;
		}
		Static66.method1197();
		Static69.method1227();
		Static2.method19();
		Class27.anInt1095++;
		if (Class27.anInt1096 != 0) {
			Class61.anInt2410 += 20;
			if (Class61.anInt2410 >= 400) {
				Class27.anInt1096 = 0;
			}
		}
		if (Class19.anInt481 != 0) {
			Class21.anInt719++;
			if (Class21.anInt719 >= 15) {
				if (Class19.anInt481 == 3) {
					Class41.aBoolean144 = true;
				}
				if (Class19.anInt481 == 2) {
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				Class19.anInt481 = 0;
			}
		}
		if (Class54.anInt2077 != 0) {
			Class1.anInt14++;
			if (Class2_Sub5.anInt742 > Class11.anInt309 + 5 || Class11.anInt309 - 5 > Class2_Sub5.anInt742 || Class2_Sub2_Sub15.anInt2394 > Class2_Sub2_Sub13.anInt1571 + 5 || Class2_Sub2_Sub13.anInt1571 - 5 > Class2_Sub2_Sub15.anInt2394) {
				Class40.aBoolean142 = true;
			}
			if (Class45_Sub1.anInt2170 == 0) {
				if (Class54.anInt2077 == 2) {
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				if (Class54.anInt2077 == 3) {
					Class41.aBoolean144 = true;
				}
				Class54.anInt2077 = 0;
				if (Class40.aBoolean142 && Class1.anInt14 >= 5) {
					Applet_Sub1.anInt390 = -1;
					Static19.method389();
					if (Class47.anInt1911 == Applet_Sub1.anInt390 && Class15.anInt434 != Class2_Sub2_Sub12_Sub6.anInt2239) {
						@Pc(753) byte local753 = 0;
						@Pc(757) Class2_Sub2_Sub13 local757 = Static73.method1340(Class47.anInt1911);
						if (Class2_Sub2_Sub1.anInt182 == 1 && local757.anInt1610 == 206) {
							local753 = 1;
						}
						if (local757.anIntArray331[Class15.anInt434] <= 0) {
							local753 = 0;
						}
						if (local757.aBoolean126) {
							local115 = Class2_Sub2_Sub12_Sub6.anInt2239;
							local112 = Class15.anInt434;
							local757.anIntArray331[local112] = local757.anIntArray331[local115];
							local757.anIntArray327[local112] = local757.anIntArray327[local115];
							local757.anIntArray331[local115] = -1;
							local757.anIntArray327[local115] = 0;
						} else if (local753 == 1) {
							local112 = Class15.anInt434;
							local115 = Class2_Sub2_Sub12_Sub6.anInt2239;
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
							local757.method1054(Class15.anInt434, Class2_Sub2_Sub12_Sub6.anInt2239);
						}
						Class47.aClass2_Sub3_Sub1_4.method1736(125);
						Class47.aClass2_Sub3_Sub1_4.method1720(Class2_Sub2_Sub12_Sub6.anInt2239);
						Class47.aClass2_Sub3_Sub1_4.method1711(Class15.anInt434);
						Class47.aClass2_Sub3_Sub1_4.method1697(Class47.anInt1911);
						Class47.aClass2_Sub3_Sub1_4.method1716(local753);
					}
				} else if ((Class9.anInt263 == 1 || Static33.method634(Class2_Sub6.anInt797 - 1)) && Class2_Sub6.anInt797 > 2) {
					Static27.method583();
				} else if (Class2_Sub6.anInt797 > 0) {
					Static88.method1549(Class2_Sub6.anInt797 - 1);
				}
				Class2_Sub2_Sub12_Sub5.anInt2030 = 0;
				Class21.anInt719 = 10;
			}
		}
		@Pc(890) int local890;
		if (Class55.anInt2100 != -1) {
			local890 = Class55.anInt2096;
			local66 = Class55.anInt2100;
			@Pc(912) boolean local912 = Static75.method1349(local890, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 0, true, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local66);
			Class55.anInt2100 = -1;
			if (local912) {
				Class35.anInt1554 = Class24.anInt2500;
				Class27.anInt1096 = 1;
				Class61.anInt2410 = 0;
				Class2_Sub2_Sub16.anInt2465 = Class56.anInt2133;
			}
		}
		if (Class2_Sub2_Sub12_Sub5.anInt2030 == 1 && Class14.aClass40_112 != null) {
			Class2_Sub2_Sub12_Sub5.anInt2030 = 0;
			Class41.aBoolean144 = true;
			Class14.aClass40_112 = null;
		}
		Static58.method1060();
		if (Class52.anInt1971 == -1) {
			Static78.method1386();
			Static73.method1337();
			Static72.method1331();
		}
		if (Class45_Sub1.anInt2170 == 1 || Class2_Sub2_Sub12_Sub5.anInt2030 == 1) {
			Class2_Sub2_Sub12_Sub1.anInt2326++;
		}
		if (Class32.anInt1501 == -1 && Class2_Sub2_Sub12_Sub1_Sub2.anInt2340 == -1 && Class2_Sub2_Sub9.anInt1012 == -1) {
			if (Class37.anInt1645 > 0) {
				Class37.anInt1645--;
			}
		} else if (Class37.anInt1645 < 100) {
			Class37.anInt1645++;
			if (Class37.anInt1645 == 100) {
				if (Class2_Sub2_Sub12_Sub1_Sub2.anInt2340 != -1) {
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				if (Class32.anInt1501 != -1) {
					Class41.aBoolean144 = true;
				}
			}
		}
		Static17.method357();
		if (Class6.aBoolean22) {
			Static75.method1348();
		}
		for (local66 = 0; local66 < 5; local66++) {
			@Pc(1017) int local1017 = Class18.anIntArray415[local66]++;
		}
		Static98.method1740();
		local890 = Static32.method623();
		local115 = Static70.method1477();
		if (local890 > 4500 && local115 > 4500) {
			Class38.anInt1672 = 250;
			Static35.method722(4000);
			Class47.aClass2_Sub3_Sub1_4.method1736(247);
		}
		Class57.anInt2146++;
		Class21.anInt716++;
		Class51.anInt1966++;
		if (Class21.anInt716 > 500) {
			Class21.anInt716 = 0;
			local112 = (int) (Math.random() * 8.0D);
			if ((local112 & 0x4) == 4) {
				Class9.anInt262 += Class2_Sub2_Sub12_Sub1.anInt2299;
			}
			if ((local112 & 0x1) == 1) {
				Class63.anInt2518 += Class40.anInt1779;
			}
			if ((local112 & 0x2) == 2) {
				Class60.anInt2371 += Class2_Sub2_Sub6.anInt667;
			}
		}
		if (Class51.anInt1966 > 500) {
			Class51.anInt1966 = 0;
			local112 = (int) (Math.random() * 8.0D);
			if ((local112 & 0x2) == 2) {
				Class12_Sub1.anInt1857 += Class2_Sub6.anInt798;
			}
			if ((local112 & 0x1) == 1) {
				Class52.anInt1978 += Class2_Sub6.anInt804;
			}
		}
		if (Class12_Sub1.anInt1857 < -20) {
			Class2_Sub6.anInt798 = 1;
		}
		if (Class9.anInt262 < -40) {
			Class2_Sub2_Sub12_Sub1.anInt2299 = 1;
		}
		if (Class52.anInt1978 < -60) {
			Class2_Sub6.anInt804 = 2;
		}
		if (Class52.anInt1978 > 60) {
			Class2_Sub6.anInt804 = -2;
		}
		if (Class63.anInt2518 < -50) {
			Class40.anInt1779 = 2;
		}
		if (Class60.anInt2371 < -55) {
			Class2_Sub2_Sub6.anInt667 = 2;
		}
		if (Class63.anInt2518 > 50) {
			Class40.anInt1779 = -2;
		}
		if (Class12_Sub1.anInt1857 > 10) {
			Class2_Sub6.anInt798 = -1;
		}
		if (Class9.anInt262 > 40) {
			Class2_Sub2_Sub12_Sub1.anInt2299 = -1;
		}
		if (Class60.anInt2371 > 55) {
			Class2_Sub2_Sub6.anInt667 = -2;
		}
		if (Class57.anInt2146 > 50) {
			Class47.aClass2_Sub3_Sub1_4.method1736(217);
		}
		try {
			if (Static64.aClass25_36 != null && Class47.aClass2_Sub3_Sub1_4.anInt2546 > 0) {
				Static64.aClass25_36.method731(Class47.aClass2_Sub3_Sub1_4.aByteArray24, Class47.aClass2_Sub3_Sub1_4.anInt2546);
				Class47.aClass2_Sub3_Sub1_4.anInt2546 = 0;
				Class57.anInt2146 = 0;
			}
		} catch (@Pc(1235) IOException local1235) {
			Static32.method626();
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 645)
	public static void method1480() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
		System.exit(1);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 761)
	public static void method1482() {
		Class45_Sub1.aClass40_617 = null;
		Class45_Sub1.aClass44_7 = null;
		Class45_Sub1.aClass40_620 = null;
		aClass5_28 = null;
		Class45_Sub1.aClass40_619 = null;
		Class45_Sub1.aClass40_622 = null;
		aClass45_29 = null;
		anIntArray472 = null;
		aBooleanArray31 = null;
		Class45_Sub1.aClass40_618 = null;
		Class45_Sub1.aClass40_621 = null;
		Class45_Sub1.aClass47_21 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ud;Z)V", line = 783)
	public static void method1483(@OriginalArg(0) Class5 arg0) {
		Static26.aClass5_9 = arg0;
		Static54.anInt1505 = Static26.aClass5_9.method76(16);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ud;I)Z", line = 795)
	public static boolean method1484(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg1.method68(arg0, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static78.method1384(local9);
			return true;
		}
	}
}
