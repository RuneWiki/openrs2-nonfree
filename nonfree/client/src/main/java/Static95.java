import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1372 = Static118.method2249("The server is being updated)3");

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
	public static int anInt2376 = 0;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1373 = aClass65_1372;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
	public static void method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass55_1 = null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ID)V")
	public static void method1803(@OriginalArg(1) double arg0) {
		if (arg0 == Static153.aDouble10) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static11.anIntArray31[local7] = local19 <= 255 ? local19 : 255;
		}
		Static153.aDouble10 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!oc;IB)V")
	public static void method1804(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class65 local5 = arg0.method2456().method2488();
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < Static44.anInt1123; local13++) {
			@Pc(20) Class6_Sub4_Sub1 local20 = Static158.aClass6_Sub4_Sub1Array1[Static138.anIntArray385[local13]];
			if (local20 != null && local20.aClass65_479 != null && local20.aClass65_479.method2489(local5)) {
				Static198.method3220(0, 1, local20.anIntArray455[0], false, 1, 0, 2, local20.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				if (arg1 == 1) {
					Static45.aClass1_Sub14_Sub1_8.method1761(209);
					Static45.aClass1_Sub14_Sub1_8.method1748(Static138.anIntArray385[local13]);
				} else if (arg1 == 4) {
					Static45.aClass1_Sub14_Sub1_8.method1761(110);
					Static45.aClass1_Sub14_Sub1_8.method1741(Static138.anIntArray385[local13]);
				} else if (arg1 == 6) {
					Static45.aClass1_Sub14_Sub1_8.method1761(107);
					Static45.aClass1_Sub14_Sub1_8.method1736(Static138.anIntArray385[local13]);
				} else if (arg1 == 7) {
					Static45.aClass1_Sub14_Sub1_8.method1761(189);
					Static45.aClass1_Sub14_Sub1_8.method1741(Static138.anIntArray385[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static31.method603(0, Static117.aClass65_1665, Static109.method2004(new Class65[] { Static122.aClass65_1994, local5 }));
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(III)J")
	public static long method1805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass88_1 == null ? 0L : local7.aClass88_1.aLong138;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)V")
	public static void method1806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class49[] local7 = Static44.aClass49Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class49 local15 = local7[local9];
			if (local15 != null && local15.anInt2337 == 2) {
				Static55.method972((local15.anInt2331 - Static58.anInt1543 << 7) + local15.anInt2330, local15.anInt2325 + (-Static205.anInt4337 + local15.anInt2336 << 7), local15.anInt2334 * 2);
				if (Static141.anInt3425 > -1 && Static174.anInt3887 % 20 < 10) {
					Static136.aClass1_Sub2_Sub5_Sub3Array10[local15.anInt2333].method1315(arg0 + Static141.anInt3425 - 12, Static93.anInt2335 + arg1 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)V")
	public static void method1807(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static101.anIntArray288[arg0];
		@Pc(17) int local17 = Static99.anIntArray280[arg0];
		@Pc(21) int local21 = Static162.aShortArray52[arg0];
		@Pc(26) int local26 = (int) Static158.aLongArray7[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = Static158.aLongArray7[arg0];
		@Pc(41) Class6_Sub4_Sub1 local41;
		if (local21 == 5) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static184.anInt4067 = 0;
				Static26.anInt775 = 2;
				Static30.anInt880 = Static182.anInt4065;
				Static93.anInt2338 = Static2.anInt67;
				Static45.aClass1_Sub14_Sub1_8.method1761(224);
				Static45.aClass1_Sub14_Sub1_8.method1736(local26);
			}
		}
		if (local21 == 1007) {
			Static184.anInt4067 = 0;
			Static93.anInt2338 = Static2.anInt67;
			Static26.anInt775 = 2;
			Static30.anInt880 = Static182.anInt4065;
			Static45.aClass1_Sub14_Sub1_8.method1761(231);
			Static45.aClass1_Sub14_Sub1_8.method1726(local26);
		}
		@Pc(137) boolean local137;
		if (local21 == 37) {
			local137 = Static198.method3220(0, 0, local17, false, 0, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			if (!local137) {
				Static198.method3220(0, 1, local17, false, 1, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			}
			Static93.anInt2338 = Static2.anInt67;
			Static184.anInt4067 = 0;
			Static26.anInt775 = 2;
			Static30.anInt880 = Static182.anInt4065;
			Static45.aClass1_Sub14_Sub1_8.method1761(91);
			Static45.aClass1_Sub14_Sub1_8.method1726(Static4.anInt85);
			Static45.aClass1_Sub14_Sub1_8.method1748(local26);
			Static45.aClass1_Sub14_Sub1_8.method1724(Static157.anInt4276);
			Static45.aClass1_Sub14_Sub1_8.method1726(Static23.anInt694);
			Static45.aClass1_Sub14_Sub1_8.method1736(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1741(Static58.anInt1543 + local17);
		}
		if (local21 == 10) {
			Static45.aClass1_Sub14_Sub1_8.method1761(152);
			Static45.aClass1_Sub14_Sub1_8.method1748(local26);
			Static45.aClass1_Sub14_Sub1_8.method1736(local13);
			Static45.aClass1_Sub14_Sub1_8.method1743(local17);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 50) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static184.anInt4067 = 0;
				Static93.anInt2338 = Static2.anInt67;
				Static30.anInt880 = Static182.anInt4065;
				Static26.anInt775 = 2;
				Static45.aClass1_Sub14_Sub1_8.method1761(209);
				Static45.aClass1_Sub14_Sub1_8.method1748(local26);
			}
		}
		if (local21 == 6) {
			local137 = Static198.method3220(0, 0, local17, false, 0, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			if (!local137) {
				Static198.method3220(0, 1, local17, false, 1, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			}
			Static93.anInt2338 = Static2.anInt67;
			Static26.anInt775 = 2;
			Static184.anInt4067 = 0;
			Static30.anInt880 = Static182.anInt4065;
			Static45.aClass1_Sub14_Sub1_8.method1761(98);
			Static45.aClass1_Sub14_Sub1_8.method1748(Static58.anInt1543 + local17);
			Static45.aClass1_Sub14_Sub1_8.method1736(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1748(local26);
		}
		@Pc(387) Class6_Sub4_Sub2 local387;
		if (local21 == 1) {
			local387 = Static106.aClass6_Sub4_Sub2Array1[local26];
			if (local387 != null) {
				Static198.method3220(0, 1, local387.anIntArray455[0], false, 1, 0, 2, local387.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static26.anInt775 = 2;
				Static93.anInt2338 = Static2.anInt67;
				Static184.anInt4067 = 0;
				Static30.anInt880 = Static182.anInt4065;
				Static45.aClass1_Sub14_Sub1_8.method1761(151);
				Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			}
		}
		if (local21 == 29) {
			Static3.method60(local34, local17, local13);
			Static45.aClass1_Sub14_Sub1_8.method1761(162);
			Static45.aClass1_Sub14_Sub1_8.method1741((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static45.aClass1_Sub14_Sub1_8.method1726(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1736(local17 + Static58.anInt1543);
		}
		if (local21 == 18) {
			Static45.aClass1_Sub14_Sub1_8.method1761(136);
			Static45.aClass1_Sub14_Sub1_8.method1724(local17);
			Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			Static45.aClass1_Sub14_Sub1_8.method1726(local13);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 34) {
			local137 = Static198.method3220(0, 0, local17, false, 0, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			if (!local137) {
				Static198.method3220(0, 1, local17, false, 1, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			}
			Static184.anInt4067 = 0;
			Static93.anInt2338 = Static2.anInt67;
			Static30.anInt880 = Static182.anInt4065;
			Static26.anInt775 = 2;
			Static45.aClass1_Sub14_Sub1_8.method1761(159);
			Static45.aClass1_Sub14_Sub1_8.method1748(Static58.anInt1543 + local17);
			Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			Static45.aClass1_Sub14_Sub1_8.method1748(local13 + Static205.anInt4337);
		}
		if (local21 == 12) {
			local387 = Static106.aClass6_Sub4_Sub2Array1[local26];
			if (local387 != null) {
				Static198.method3220(0, 1, local387.anIntArray455[0], false, 1, 0, 2, local387.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static93.anInt2338 = Static2.anInt67;
				Static184.anInt4067 = 0;
				Static26.anInt775 = 2;
				Static30.anInt880 = Static182.anInt4065;
				Static45.aClass1_Sub14_Sub1_8.method1761(220);
				Static45.aClass1_Sub14_Sub1_8.method1748(Static23.anInt694);
				Static45.aClass1_Sub14_Sub1_8.method1736(Static4.anInt85);
				Static45.aClass1_Sub14_Sub1_8.method1748(local26);
				Static45.aClass1_Sub14_Sub1_8.method1740(Static157.anInt4276);
			}
		}
		if (local21 == 33) {
			Static45.aClass1_Sub14_Sub1_8.method1761(185);
			Static45.aClass1_Sub14_Sub1_8.method1748(local26);
			Static45.aClass1_Sub14_Sub1_8.method1718(local17);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 44) {
			Static45.aClass1_Sub14_Sub1_8.method1761(169);
			Static45.aClass1_Sub14_Sub1_8.method1726(local13);
			Static45.aClass1_Sub14_Sub1_8.method1740(local17);
			Static45.aClass1_Sub14_Sub1_8.method1748(local26);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 39) {
			local137 = Static198.method3220(0, 0, local17, false, 0, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			if (!local137) {
				Static198.method3220(0, 1, local17, false, 1, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			}
			Static30.anInt880 = Static182.anInt4065;
			Static26.anInt775 = 2;
			Static93.anInt2338 = Static2.anInt67;
			Static184.anInt4067 = 0;
			Static45.aClass1_Sub14_Sub1_8.method1761(21);
			Static45.aClass1_Sub14_Sub1_8.method1726(local17 + Static58.anInt1543);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1726(local26);
		}
		@Pc(832) int local832;
		@Pc(814) Class97 local814;
		if (local21 == 9) {
			Static45.aClass1_Sub14_Sub1_8.method1761(119);
			Static45.aClass1_Sub14_Sub1_8.method1724(local17);
			local814 = Static154.method2691(local17);
			if (local814.anIntArrayArray40 != null && local814.anIntArrayArray40[0][0] == 5) {
				local832 = local814.anIntArrayArray40[0][1];
				Static135.anIntArray379[local832] = 1 - Static135.anIntArray379[local832];
				Static146.method2643(local832);
			}
		}
		if (local21 == 19) {
			local387 = Static106.aClass6_Sub4_Sub2Array1[local26];
			if (local387 != null) {
				Static198.method3220(0, 1, local387.anIntArray455[0], false, 1, 0, 2, local387.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static30.anInt880 = Static182.anInt4065;
				Static184.anInt4067 = 0;
				Static93.anInt2338 = Static2.anInt67;
				Static26.anInt775 = 2;
				Static45.aClass1_Sub14_Sub1_8.method1761(36);
				Static45.aClass1_Sub14_Sub1_8.method1726(local26);
			}
		}
		if (local21 == 1005) {
			Static30.anInt880 = Static182.anInt4065;
			Static93.anInt2338 = Static2.anInt67;
			Static184.anInt4067 = 0;
			Static26.anInt775 = 2;
			local387 = Static106.aClass6_Sub4_Sub2Array1[local26];
			if (local387 != null) {
				@Pc(921) Class1_Sub2_Sub11 local921 = local387.aClass1_Sub2_Sub11_1;
				if (local921.anIntArray151 != null) {
					local921 = local921.method1076();
				}
				if (local921 != null) {
					Static45.aClass1_Sub14_Sub1_8.method1761(66);
					Static45.aClass1_Sub14_Sub1_8.method1726(local921.anInt1599);
				}
			}
		}
		if (local21 == 38) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static93.anInt2338 = Static2.anInt67;
				Static26.anInt775 = 2;
				Static30.anInt880 = Static182.anInt4065;
				Static184.anInt4067 = 0;
				Static45.aClass1_Sub14_Sub1_8.method1761(192);
				Static45.aClass1_Sub14_Sub1_8.method1726(local26);
			}
		}
		if (local21 == 24) {
			Static45.aClass1_Sub14_Sub1_8.method1761(64);
			Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			Static45.aClass1_Sub14_Sub1_8.method1740(local17);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 42) {
			Static99.method1880(Static207.anInt4425, local13, local17);
		}
		if (local21 == 16) {
			Static3.method60(local34, local17, local13);
			Static45.aClass1_Sub14_Sub1_8.method1761(214);
			Static45.aClass1_Sub14_Sub1_8.method1741(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static45.aClass1_Sub14_Sub1_8.method1736(local17 + Static58.anInt1543);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13 + Static205.anInt4337);
		}
		if (local21 == 20 || local21 == 1003) {
			Static23.method415(local17, local26, Static198.aClass65Array62[arg0], local13);
		}
		if (local21 == 31) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static26.anInt775 = 2;
				Static184.anInt4067 = 0;
				Static30.anInt880 = Static182.anInt4065;
				Static93.anInt2338 = Static2.anInt67;
				Static45.aClass1_Sub14_Sub1_8.method1761(193);
				Static45.aClass1_Sub14_Sub1_8.method1748(local26);
			}
		}
		if (local21 == 2) {
			local387 = Static106.aClass6_Sub4_Sub2Array1[local26];
			if (local387 != null) {
				Static198.method3220(0, 1, local387.anIntArray455[0], false, 1, 0, 2, local387.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static26.anInt775 = 2;
				Static184.anInt4067 = 0;
				Static93.anInt2338 = Static2.anInt67;
				Static30.anInt880 = Static182.anInt4065;
				Static45.aClass1_Sub14_Sub1_8.method1761(128);
				Static45.aClass1_Sub14_Sub1_8.method1736(local26);
			}
		}
		if (local21 == 25) {
			Static99.method1890();
			local814 = Static154.method2691(local17);
			Static23.anInt694 = local26;
			Static4.anInt85 = local13;
			Static157.anInt4276 = local17;
			Static145.anInt3438 = 1;
			Static25.method448(local814);
			Static27.aClass65_569 = Static109.method2004(new Class65[] { Static48.aClass65_786, Static40.method700(local26).aClass65_229, Static28.aClass65_594 });
			if (Static27.aClass65_569 == null) {
				Static27.aClass65_569 = Static158.aClass65_2098;
			}
			return;
		}
		if (local21 == 4) {
			local814 = Static154.method2691(local17);
			@Pc(1265) boolean local1265 = true;
			if (local814.anInt4314 > 0) {
				local1265 = Static145.method2632(local814);
			}
			if (local1265) {
				Static45.aClass1_Sub14_Sub1_8.method1761(119);
				Static45.aClass1_Sub14_Sub1_8.method1724(local17);
			}
		}
		if (local21 == 23) {
			Static45.aClass1_Sub14_Sub1_8.method1761(119);
			Static45.aClass1_Sub14_Sub1_8.method1724(local17);
			local814 = Static154.method2691(local17);
			if (local814.anIntArrayArray40 != null && local814.anIntArrayArray40[0][0] == 5) {
				local832 = local814.anIntArrayArray40[0][1];
				if (local814.anIntArray511[0] != Static135.anIntArray379[local832]) {
					Static135.anIntArray379[local832] = local814.anIntArray511[0];
					Static146.method2643(local832);
				}
			}
		}
		if (local21 == 32) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static184.anInt4067 = 0;
				Static30.anInt880 = Static182.anInt4065;
				Static26.anInt775 = 2;
				Static93.anInt2338 = Static2.anInt67;
				Static45.aClass1_Sub14_Sub1_8.method1761(189);
				Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			}
		}
		if (local21 == 40) {
			Static45.aClass1_Sub14_Sub1_8.method1761(34);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13);
			Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			Static45.aClass1_Sub14_Sub1_8.method1724(local17);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 1004) {
			local814 = Static154.method2691(local17);
			if (local814 == null || local814.anIntArray507[local13] < 100000) {
				Static45.aClass1_Sub14_Sub1_8.method1761(231);
				Static45.aClass1_Sub14_Sub1_8.method1726(local26);
			} else {
				Static31.method603(0, Static117.aClass65_1665, Static109.method2004(new Class65[] { Static118.method2250(local814.anIntArray507[local13]), Static7.aClass65_85, Static40.method700(local26).aClass65_229 }));
			}
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 15) {
			local387 = Static106.aClass6_Sub4_Sub2Array1[local26];
			if (local387 != null) {
				Static198.method3220(0, 1, local387.anIntArray455[0], false, 1, 0, 2, local387.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static93.anInt2338 = Static2.anInt67;
				Static30.anInt880 = Static182.anInt4065;
				Static26.anInt775 = 2;
				Static184.anInt4067 = 0;
				Static45.aClass1_Sub14_Sub1_8.method1761(1);
				Static45.aClass1_Sub14_Sub1_8.method1743(Static54.anInt3676);
				Static45.aClass1_Sub14_Sub1_8.method1726(local26);
				Static45.aClass1_Sub14_Sub1_8.method1748(Static83.anInt2029);
			}
		}
		if (local21 == 49) {
			Static157.method3230();
		}
		if (local21 == 8) {
			Static45.aClass1_Sub14_Sub1_8.method1761(140);
			Static45.aClass1_Sub14_Sub1_8.method1743(Static157.anInt4276);
			Static45.aClass1_Sub14_Sub1_8.method1724(local17);
			Static45.aClass1_Sub14_Sub1_8.method1736(Static23.anInt694);
			Static45.aClass1_Sub14_Sub1_8.method1726(local26);
			Static45.aClass1_Sub14_Sub1_8.method1726(local13);
			Static45.aClass1_Sub14_Sub1_8.method1726(Static4.anInt85);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 43) {
			local137 = Static198.method3220(0, 0, local17, false, 0, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			if (!local137) {
				Static198.method3220(0, 1, local17, false, 1, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			}
			Static30.anInt880 = Static182.anInt4065;
			Static184.anInt4067 = 0;
			Static93.anInt2338 = Static2.anInt67;
			Static26.anInt775 = 2;
			Static45.aClass1_Sub14_Sub1_8.method1761(199);
			Static45.aClass1_Sub14_Sub1_8.method1736(local17 + Static58.anInt1543);
			Static45.aClass1_Sub14_Sub1_8.method1726(local26);
			Static45.aClass1_Sub14_Sub1_8.method1736(local13 + Static205.anInt4337);
		}
		if (local21 == 36) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static93.anInt2338 = Static2.anInt67;
				Static184.anInt4067 = 0;
				Static30.anInt880 = Static182.anInt4065;
				Static26.anInt775 = 2;
				Static45.aClass1_Sub14_Sub1_8.method1761(92);
				Static45.aClass1_Sub14_Sub1_8.method1736(local26);
			}
		}
		if (local21 == 30) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static93.anInt2338 = Static2.anInt67;
				Static26.anInt775 = 2;
				Static30.anInt880 = Static182.anInt4065;
				Static184.anInt4067 = 0;
				Static45.aClass1_Sub14_Sub1_8.method1761(107);
				Static45.aClass1_Sub14_Sub1_8.method1736(local26);
			}
		}
		if (local21 == 22) {
			Static45.aClass1_Sub14_Sub1_8.method1761(116);
			Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			Static45.aClass1_Sub14_Sub1_8.method1748(local13);
			Static45.aClass1_Sub14_Sub1_8.method1740(local17);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 35) {
			local137 = Static198.method3220(0, 0, local17, false, 0, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			if (!local137) {
				Static198.method3220(0, 1, local17, false, 1, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			}
			Static30.anInt880 = Static182.anInt4065;
			Static184.anInt4067 = 0;
			Static93.anInt2338 = Static2.anInt67;
			Static26.anInt775 = 2;
			Static45.aClass1_Sub14_Sub1_8.method1761(138);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			Static45.aClass1_Sub14_Sub1_8.method1726(Static83.anInt2029);
			Static45.aClass1_Sub14_Sub1_8.method1748(local17 + Static58.anInt1543);
			Static45.aClass1_Sub14_Sub1_8.method1718(Static54.anInt3676);
		}
		if (local21 == 7) {
			Static45.aClass1_Sub14_Sub1_8.method1761(252);
			Static45.aClass1_Sub14_Sub1_8.method1736(local26);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13);
			Static45.aClass1_Sub14_Sub1_8.method1740(local17);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 14) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static93.anInt2338 = Static2.anInt67;
				Static184.anInt4067 = 0;
				Static30.anInt880 = Static182.anInt4065;
				Static26.anInt775 = 2;
				Static45.aClass1_Sub14_Sub1_8.method1761(155);
				Static45.aClass1_Sub14_Sub1_8.method1748(Static83.anInt2029);
				Static45.aClass1_Sub14_Sub1_8.method1718(Static54.anInt3676);
				Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			}
		}
		if (local21 == 3 && Static3.method60(local34, local17, local13)) {
			Static45.aClass1_Sub14_Sub1_8.method1761(148);
			Static45.aClass1_Sub14_Sub1_8.method1748(Static58.anInt1543 + local17);
			Static45.aClass1_Sub14_Sub1_8.method1743(Static54.anInt3676);
			Static45.aClass1_Sub14_Sub1_8.method1741(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static45.aClass1_Sub14_Sub1_8.method1748(Static83.anInt2029);
			Static45.aClass1_Sub14_Sub1_8.method1726(local13 + Static205.anInt4337);
		}
		if (local21 == 41) {
			Static45.aClass1_Sub14_Sub1_8.method1761(174);
			Static45.aClass1_Sub14_Sub1_8.method1736(local26);
			Static45.aClass1_Sub14_Sub1_8.method1718(Static54.anInt3676);
			Static45.aClass1_Sub14_Sub1_8.method1741(Static83.anInt2029);
			Static45.aClass1_Sub14_Sub1_8.method1743(local17);
			Static45.aClass1_Sub14_Sub1_8.method1748(local13);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 1001) {
			Static93.anInt2338 = Static2.anInt67;
			Static26.anInt775 = 2;
			Static30.anInt880 = Static182.anInt4065;
			Static184.anInt4067 = 0;
			Static45.aClass1_Sub14_Sub1_8.method1761(170);
			Static45.aClass1_Sub14_Sub1_8.method1726(local26);
		}
		if (local21 == 1006) {
			Static3.method60(local34, local17, local13);
			Static45.aClass1_Sub14_Sub1_8.method1761(175);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1748(local17 + Static58.anInt1543);
			Static45.aClass1_Sub14_Sub1_8.method1726((int) (local34 >>> 32) & Integer.MAX_VALUE);
		}
		if (local21 == 58 && Static3.method60(local34, local17, local13)) {
			Static45.aClass1_Sub14_Sub1_8.method1761(2);
			Static45.aClass1_Sub14_Sub1_8.method1748(Static23.anInt694);
			Static45.aClass1_Sub14_Sub1_8.method1741(Static4.anInt85);
			Static45.aClass1_Sub14_Sub1_8.method1726(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1748((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static45.aClass1_Sub14_Sub1_8.method1748(local17 + Static58.anInt1543);
			Static45.aClass1_Sub14_Sub1_8.method1740(Static157.anInt4276);
		}
		if (local21 == 46) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static26.anInt775 = 2;
				Static93.anInt2338 = Static2.anInt67;
				Static184.anInt4067 = 0;
				Static30.anInt880 = Static182.anInt4065;
				Static45.aClass1_Sub14_Sub1_8.method1761(70);
				Static45.aClass1_Sub14_Sub1_8.method1736(Static4.anInt85);
				Static45.aClass1_Sub14_Sub1_8.method1748(local26);
				Static45.aClass1_Sub14_Sub1_8.method1741(Static23.anInt694);
				Static45.aClass1_Sub14_Sub1_8.method1740(Static157.anInt4276);
			}
		}
		if (local21 == 51) {
			local137 = Static198.method3220(0, 0, local17, false, 0, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			if (!local137) {
				Static198.method3220(0, 1, local17, false, 1, 0, 2, local13, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
			}
			Static93.anInt2338 = Static2.anInt67;
			Static184.anInt4067 = 0;
			Static30.anInt880 = Static182.anInt4065;
			Static26.anInt775 = 2;
			Static45.aClass1_Sub14_Sub1_8.method1761(156);
			Static45.aClass1_Sub14_Sub1_8.method1726(local26);
			Static45.aClass1_Sub14_Sub1_8.method1726(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1736(Static58.anInt1543 + local17);
		}
		if (local21 == 48) {
			local41 = Static158.aClass6_Sub4_Sub1Array1[local26];
			if (local41 != null) {
				Static198.method3220(0, 1, local41.anIntArray455[0], false, 1, 0, 2, local41.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static26.anInt775 = 2;
				Static184.anInt4067 = 0;
				Static30.anInt880 = Static182.anInt4065;
				Static93.anInt2338 = Static2.anInt67;
				Static45.aClass1_Sub14_Sub1_8.method1761(110);
				Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			}
		}
		if (local21 == 17) {
			local814 = Static173.method2926(local17, local13);
			if (local814 != null) {
				Static99.method1890();
				Static125.method2376(local17, Static106.method1970(Static153.method2677(local814)), local13);
				Static145.anInt3438 = 0;
				Static83.aClass65_1223 = Static78.method1382(local814);
				if (Static83.aClass65_1223 == null) {
					Static83.aClass65_1223 = Static114.aClass65_1615;
				}
				if (!local814.aBoolean181) {
					Static19.aClass65_481 = Static109.method2004(new Class65[] { Static193.aClass65_2483, local814.aClass65_2564, Static28.aClass65_594 });
					return;
				}
				Static19.aClass65_481 = Static109.method2004(new Class65[] { local814.aClass65_2565, Static28.aClass65_594 });
			}
			return;
		}
		if (local21 == 28) {
			Static3.method60(local34, local17, local13);
			Static45.aClass1_Sub14_Sub1_8.method1761(212);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13 + Static205.anInt4337);
			Static45.aClass1_Sub14_Sub1_8.method1748((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static45.aClass1_Sub14_Sub1_8.method1741(Static58.anInt1543 + local17);
		}
		if (local21 == 21 && Static7.aClass97_1 == null) {
			Static7.method129(local17, local13);
			Static7.aClass97_1 = Static173.method2926(local17, local13);
			Static25.method448(Static7.aClass97_1);
		}
		if (local21 == 26) {
			local387 = Static106.aClass6_Sub4_Sub2Array1[local26];
			if (local387 != null) {
				Static198.method3220(0, 1, local387.anIntArray455[0], false, 1, 0, 2, local387.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static184.anInt4067 = 0;
				Static26.anInt775 = 2;
				Static93.anInt2338 = Static2.anInt67;
				Static30.anInt880 = Static182.anInt4065;
				Static45.aClass1_Sub14_Sub1_8.method1761(198);
				Static45.aClass1_Sub14_Sub1_8.method1748(local26);
			}
		}
		if (local21 == 47) {
			Static45.aClass1_Sub14_Sub1_8.method1761(206);
			Static45.aClass1_Sub14_Sub1_8.method1741(local13);
			Static45.aClass1_Sub14_Sub1_8.method1724(local17);
			Static45.aClass1_Sub14_Sub1_8.method1741(local26);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (local21 == 11) {
			Static3.method60(local34, local17, local13);
			Static45.aClass1_Sub14_Sub1_8.method1761(172);
			Static45.aClass1_Sub14_Sub1_8.method1726(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static45.aClass1_Sub14_Sub1_8.method1726(Static205.anInt4337 + local13);
			Static45.aClass1_Sub14_Sub1_8.method1726(local17 + Static58.anInt1543);
		}
		if (local21 == 45) {
			local387 = Static106.aClass6_Sub4_Sub2Array1[local26];
			if (local387 != null) {
				Static198.method3220(0, 1, local387.anIntArray455[0], false, 1, 0, 2, local387.anIntArray451[0], Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
				Static30.anInt880 = Static182.anInt4065;
				Static93.anInt2338 = Static2.anInt67;
				Static184.anInt4067 = 0;
				Static26.anInt775 = 2;
				Static45.aClass1_Sub14_Sub1_8.method1761(218);
				Static45.aClass1_Sub14_Sub1_8.method1736(local26);
			}
		}
		if (local21 == 13) {
			Static45.aClass1_Sub14_Sub1_8.method1761(39);
			Static45.aClass1_Sub14_Sub1_8.method1740(local17);
			Static45.aClass1_Sub14_Sub1_8.method1718(Static54.anInt3676);
			Static45.aClass1_Sub14_Sub1_8.method1726(Static83.anInt2029);
			Static45.aClass1_Sub14_Sub1_8.method1748(local13);
		}
		if (local21 == 57) {
			Static45.aClass1_Sub14_Sub1_8.method1761(114);
			Static45.aClass1_Sub14_Sub1_8.method1748(local26);
			Static45.aClass1_Sub14_Sub1_8.method1748(local13);
			Static45.aClass1_Sub14_Sub1_8.method1724(local17);
			Static11.anInt259 = 0;
			Static143.aClass97_6 = Static154.method2691(local17);
			Static179.anInt4028 = local13;
		}
		if (Static145.anInt3438 != 0) {
			Static145.anInt3438 = 0;
			Static25.method448(Static154.method2691(Static157.anInt4276));
		}
		if (Static138.aBoolean138) {
			Static99.method1890();
		}
		if (Static143.aClass97_6 != null && Static11.anInt259 == 0) {
			Static25.method448(Static143.aClass97_6);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)I")
	public static int method1808(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
