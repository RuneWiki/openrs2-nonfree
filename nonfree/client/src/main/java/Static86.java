import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!oa", name = "eb", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array4;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "Lclient!af;")
	public static Class5 aClass5_1061 = Static45.method1937("Hidden)2use");

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
	public static int anInt2184 = 0;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
	public static int anInt2186 = 0;

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "J")
	public static long aLong74 = 0L;

	@OriginalMember(owner = "client!oa", name = "ib", descriptor = "[J")
	public static long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)I")
	public static int method1522(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(23) int local23 = local10 | local10 >>> 2;
		@Pc(29) int local29 = local23 | local23 >>> 4;
		@Pc(35) int local35 = local29 | local29 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!af;Lclient!of;)Lclient!af;")
	public static Class5 method1524(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0.method195(Static69.aClass5_805) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(22) int local22 = arg0.method195(Static42.aClass5_510);
			if (local22 == -1) {
				while (true) {
					local22 = arg0.method195(Static12.aClass5_1452);
					if (local22 == -1) {
						while (true) {
							local22 = arg0.method195(Static89.aClass5_1362);
							if (local22 == -1) {
								while (true) {
									local22 = arg0.method195(Static51.aClass5_653);
									if (local22 == -1) {
										while (true) {
											local22 = arg0.method195(Static74.aClass5_850);
											if (local22 == -1) {
												while (true) {
													local22 = arg0.method195(Static41.aClass5_499);
													if (local22 == -1) {
														return arg0;
													}
													@Pc(234) Class5 local234 = Static49.aClass5_612;
													if (Static125.aClass51_10 != null) {
														local234 = Static111.method1921(Static125.aClass51_10.anInt1881);
														try {
															if (Static125.aClass51_10.anObject2 != null) {
																@Pc(250) byte[] local250 = ((String) Static125.aClass51_10.anObject2).getBytes("ISO-8859-1");
																local234 = Static87.method2233(local250.length, 0, local250);
															}
														} catch (@Pc(259) UnsupportedEncodingException local259) {
														}
													}
													arg0 = Static100.method1696(new Class5[] { arg0.method200(0, local22), local234, arg0.method184(local22 + 4) });
												}
											}
											arg0 = Static100.method1696(new Class5[] { arg0.method200(0, local22), Static38.method696(Static96.method1622(arg1, 4)), arg0.method184(local22 + 2) });
										}
									}
									arg0 = Static100.method1696(new Class5[] { arg0.method200(0, local22), Static38.method696(Static96.method1622(arg1, 3)), arg0.method184(local22 + 2) });
								}
							}
							arg0 = Static100.method1696(new Class5[] { arg0.method200(0, local22), Static38.method696(Static96.method1622(arg1, 2)), arg0.method184(local22 + 2) });
						}
					}
					arg0 = Static100.method1696(new Class5[] { arg0.method200(0, local22), Static38.method696(Static96.method1622(arg1, 1)), arg0.method184(local22 + 2) });
				}
			}
			arg0 = Static100.method1696(new Class5[] { arg0.method200(0, local22), Static38.method696(Static96.method1622(arg1, 0)), arg0.method184(local22 + 2) });
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V")
	public static void method1525() {
		aLongArray3 = null;
		aClass1_Sub3_Sub1_Sub2Array4 = null;
		aClass5_1061 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([BI[Lclient!md;IIII)V")
	public static void method1526(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			for (@Pc(19) int local19 = 0; local19 < 64; local19++) {
				for (local23 = 0; local23 < 64; local23++) {
					if (arg5 + local19 > 0 && arg5 + local19 < 103 && arg4 + local23 > 0 && arg4 + local23 < 103) {
						arg2[local15].anIntArrayArray58[arg5 + local19][arg4 + local23] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(105) Class1_Sub20 local105 = new Class1_Sub20(arg0);
		for (local23 = 0; local23 < 4; local23++) {
			for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
				for (@Pc(115) int local115 = 0; local115 < 64; local115++) {
					Static65.method1185(arg1, 0, local105, local111 + arg5, arg3, local115 + arg4, local23);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V")
	public static void method1528(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static42.anIntArray186[arg0];
		@Pc(17) int local17 = Static99.anIntArray375[arg0];
		@Pc(21) int local21 = Static124.anIntArray455[arg0];
		@Pc(25) int local25 = Static115.anIntArray430[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(38) Class1_Sub3_Sub4_Sub2_Sub2 local38;
		if (local21 == 26) {
			local38 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local25];
			if (local38 != null) {
				Static54.method946(local38.anIntArray443[0], local38.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static120.anInt1841 = Static97.anInt2390;
				Static36.anInt950 = 0;
				Static28.anInt860 = 2;
				Static45.anInt2753 = Static9.anInt280;
				Static44.aClass1_Sub20_Sub1_1.method2108(86);
				Static44.aClass1_Sub20_Sub1_1.method2064(local25);
			}
		}
		@Pc(97) Class1_Sub17 local97;
		if (local21 == 1) {
			@Pc(93) boolean local93 = true;
			local97 = Static36.method680(local17);
			if (local97.anInt2291 > 0) {
				local93 = Static100.method1697(local97);
			}
			if (local93) {
				Static44.aClass1_Sub20_Sub1_1.method2108(189);
				Static44.aClass1_Sub20_Sub1_1.method2092(local17);
			}
		}
		if (local21 == 5) {
			Static44.aClass1_Sub20_Sub1_1.method2108(92);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13);
			Static44.aClass1_Sub20_Sub1_1.method2060(local17);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 33) {
			Static44.aClass1_Sub20_Sub1_1.method2108(134);
			Static44.aClass1_Sub20_Sub1_1.method2061(local13);
			Static44.aClass1_Sub20_Sub1_1.method2060(local17);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 46) {
			local38 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local25];
			if (local38 != null) {
				Static54.method946(local38.anIntArray443[0], local38.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static120.anInt1841 = Static97.anInt2390;
				Static45.anInt2753 = Static9.anInt280;
				Static28.anInt860 = 2;
				Static36.anInt950 = 0;
				Static44.aClass1_Sub20_Sub1_1.method2108(202);
				Static44.aClass1_Sub20_Sub1_1.method2060(Static84.anInt2143);
				Static44.aClass1_Sub20_Sub1_1.method2055(Static20.anInt654);
				Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			}
		}
		@Pc(277) boolean local277;
		if (local21 == 30) {
			local277 = Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			if (!local277) {
				Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			}
			Static36.anInt950 = 0;
			Static45.anInt2753 = Static9.anInt280;
			Static120.anInt1841 = Static97.anInt2390;
			Static28.anInt860 = 2;
			Static44.aClass1_Sub20_Sub1_1.method2108(56);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			Static44.aClass1_Sub20_Sub1_1.method2055(Static50.anInt1243);
			Static44.aClass1_Sub20_Sub1_1.method2064(local17 + Static32.anInt927);
			Static44.aClass1_Sub20_Sub1_1.method2090(Static9.anInt285);
			Static44.aClass1_Sub20_Sub1_1.method2061(Static30.anInt875);
			Static44.aClass1_Sub20_Sub1_1.method2064(Static129.anInt3262 + local13);
		}
		if (local21 == 1001) {
			Static36.anInt950 = 0;
			Static28.anInt860 = 2;
			Static120.anInt1841 = Static97.anInt2390;
			Static45.anInt2753 = Static9.anInt280;
			Static44.aClass1_Sub20_Sub1_1.method2108(82);
			Static44.aClass1_Sub20_Sub1_1.method2055(local25);
		}
		if (local21 == 11) {
			Static44.aClass1_Sub20_Sub1_1.method2108(172);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13);
			Static44.aClass1_Sub20_Sub1_1.method2092(local17);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 43) {
			Static51.method901();
			local97 = Static36.method680(local17);
			Static50.anInt1243 = local13;
			Static120.anInt1840 = 1;
			Static30.anInt875 = local25;
			Static9.anInt285 = local17;
			Static119.method2161(local97);
			Static74.aClass5_851 = Static100.method1696(new Class5[] { Static16.aClass5_252, Static56.method1022(local25).aClass5_1323, Static18.aClass5_1371 });
			if (Static74.aClass5_851 == null) {
				Static74.aClass5_851 = Static129.aClass5_1479;
			}
			return;
		}
		@Pc(450) Class1_Sub3_Sub4_Sub2_Sub1 local450;
		if (local21 == 21) {
			local450 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local25];
			if (local450 != null) {
				Static54.method946(local450.anIntArray443[0], local450.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static120.anInt1841 = Static97.anInt2390;
				Static45.anInt2753 = Static9.anInt280;
				Static36.anInt950 = 0;
				Static28.anInt860 = 2;
				Static44.aClass1_Sub20_Sub1_1.method2108(62);
				Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			}
		}
		if (local21 == 1006) {
			Static45.method1932(local17, local25, local13);
			Static44.aClass1_Sub20_Sub1_1.method2108(151);
			Static44.aClass1_Sub20_Sub1_1.method2061(local17 + Static32.anInt927);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25 >> 14 & 0x7FFF);
			Static44.aClass1_Sub20_Sub1_1.method2095(Static129.anInt3262 + local13);
		}
		if (local21 == 23) {
			local38 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local25];
			if (local38 != null) {
				Static54.method946(local38.anIntArray443[0], local38.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static45.anInt2753 = Static9.anInt280;
				Static28.anInt860 = 2;
				Static120.anInt1841 = Static97.anInt2390;
				Static36.anInt950 = 0;
				Static44.aClass1_Sub20_Sub1_1.method2108(184);
				Static44.aClass1_Sub20_Sub1_1.method2061(local25);
			}
		}
		if (local21 == 14) {
			Static44.aClass1_Sub20_Sub1_1.method2108(63);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13);
			Static44.aClass1_Sub20_Sub1_1.method2090(local17);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 29) {
			Static44.aClass1_Sub20_Sub1_1.method2108(255);
			Static44.aClass1_Sub20_Sub1_1.method2095(Static30.anInt875);
			Static44.aClass1_Sub20_Sub1_1.method2095(local13);
			Static44.aClass1_Sub20_Sub1_1.method2090(local17);
			Static44.aClass1_Sub20_Sub1_1.method2061(Static50.anInt1243);
			Static44.aClass1_Sub20_Sub1_1.method2059(Static9.anInt285);
			Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 37) {
			Static44.aClass1_Sub20_Sub1_1.method2108(10);
			Static44.aClass1_Sub20_Sub1_1.method2095(Static20.anInt654);
			Static44.aClass1_Sub20_Sub1_1.method2059(local17);
			Static44.aClass1_Sub20_Sub1_1.method2090(Static84.anInt2143);
			Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			Static44.aClass1_Sub20_Sub1_1.method2055(local13);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		@Pc(744) int local744;
		if (local21 == 34) {
			Static44.aClass1_Sub20_Sub1_1.method2108(189);
			Static44.aClass1_Sub20_Sub1_1.method2092(local17);
			local97 = Static36.method680(local17);
			if (local97.anIntArrayArray67 != null && local97.anIntArrayArray67[0][0] == 5) {
				local744 = local97.anIntArrayArray67[0][1];
				Static40.anIntArray182[local744] = 1 - Static40.anIntArray182[local744];
				Static18.method2158(local744);
			}
		}
		if (local21 == 25) {
			Static3.method63();
		}
		if (local21 == 45) {
			local277 = Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			if (!local277) {
				Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			}
			Static120.anInt1841 = Static97.anInt2390;
			Static36.anInt950 = 0;
			Static45.anInt2753 = Static9.anInt280;
			Static28.anInt860 = 2;
			Static44.aClass1_Sub20_Sub1_1.method2108(241);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13 + Static129.anInt3262);
			Static44.aClass1_Sub20_Sub1_1.method2055(Static32.anInt927 + local17);
		}
		if (local21 == 13) {
			local97 = Static18.method2150(local17, local13);
			if (local97 != null) {
				Static51.method901();
				Static57.method1039(Static92.method1586(Static6.method221(local97)), local13, local17);
				Static120.anInt1840 = 0;
				Static80.aClass5_989 = Static85.method1499(local97);
				if (Static80.aClass5_989 == null) {
					Static80.aClass5_989 = Static100.aClass5_1174;
				}
				if (!local97.aBoolean89) {
					Static108.aClass5_1252 = Static100.method1696(new Class5[] { Static72.aClass5_821, local97.aClass5_1093, Static18.aClass5_1371 });
					return;
				}
				Static108.aClass5_1252 = Static100.method1696(new Class5[] { local97.aClass5_1097, Static18.aClass5_1371 });
			}
			return;
		}
		if (local21 == 35) {
			local38 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local25];
			if (local38 != null) {
				Static54.method946(local38.anIntArray443[0], local38.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static28.anInt860 = 2;
				Static45.anInt2753 = Static9.anInt280;
				Static120.anInt1841 = Static97.anInt2390;
				Static36.anInt950 = 0;
				Static44.aClass1_Sub20_Sub1_1.method2108(226);
				Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			}
		}
		if (local21 == 1007) {
			local97 = Static36.method680(local17);
			if (local97 == null || local97.anIntArray340[local13] < 100000) {
				Static44.aClass1_Sub20_Sub1_1.method2108(82);
				Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			} else {
				Static50.method893(Static100.method1696(new Class5[] { Static48.method838(local97.anIntArray340[local13]), Static108.aClass5_1248, Static56.method1022(local25).aClass5_1323 }), 0, Static49.aClass5_612);
			}
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 39) {
			local277 = Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			if (!local277) {
				Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			}
			Static120.anInt1841 = Static97.anInt2390;
			Static28.anInt860 = 2;
			Static36.anInt950 = 0;
			Static45.anInt2753 = Static9.anInt280;
			Static44.aClass1_Sub20_Sub1_1.method2108(81);
			Static44.aClass1_Sub20_Sub1_1.method2055(local13 + Static129.anInt3262);
			Static44.aClass1_Sub20_Sub1_1.method2055(Static32.anInt927 + local17);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25);
		}
		if (local21 == 19) {
			Static45.method1932(local17, local25, local13);
			Static44.aClass1_Sub20_Sub1_1.method2108(215);
			Static44.aClass1_Sub20_Sub1_1.method2064(local17 + Static32.anInt927);
			Static44.aClass1_Sub20_Sub1_1.method2055(local25 >> 14 & 0x7FFF);
			Static44.aClass1_Sub20_Sub1_1.method2061(local13 + Static129.anInt3262);
		}
		if (local21 == 2) {
			local277 = Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			if (!local277) {
				Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			}
			Static28.anInt860 = 2;
			Static120.anInt1841 = Static97.anInt2390;
			Static36.anInt950 = 0;
			Static45.anInt2753 = Static9.anInt280;
			Static44.aClass1_Sub20_Sub1_1.method2108(199);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			Static44.aClass1_Sub20_Sub1_1.method2064(Static129.anInt3262 + local13);
			Static44.aClass1_Sub20_Sub1_1.method2095(local17 + Static32.anInt927);
		}
		if (local21 == 18) {
			Static44.aClass1_Sub20_Sub1_1.method2108(52);
			Static44.aClass1_Sub20_Sub1_1.method2061(local13);
			Static44.aClass1_Sub20_Sub1_1.method2059(local17);
			Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 28) {
			Static44.aClass1_Sub20_Sub1_1.method2108(24);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13);
			Static44.aClass1_Sub20_Sub1_1.method2059(local17);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 44) {
			local38 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local25];
			if (local38 != null) {
				Static54.method946(local38.anIntArray443[0], local38.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static36.anInt950 = 0;
				Static120.anInt1841 = Static97.anInt2390;
				Static45.anInt2753 = Static9.anInt280;
				Static28.anInt860 = 2;
				Static44.aClass1_Sub20_Sub1_1.method2108(11);
				Static44.aClass1_Sub20_Sub1_1.method2064(Static50.anInt1243);
				Static44.aClass1_Sub20_Sub1_1.method2055(local25);
				Static44.aClass1_Sub20_Sub1_1.method2055(Static30.anInt875);
				Static44.aClass1_Sub20_Sub1_1.method2090(Static9.anInt285);
			}
		}
		if (local21 == 15) {
			Static44.aClass1_Sub20_Sub1_1.method2108(237);
			Static44.aClass1_Sub20_Sub1_1.method2059(local17);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13);
			Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 1002) {
			Static120.anInt1841 = Static97.anInt2390;
			Static28.anInt860 = 2;
			Static36.anInt950 = 0;
			Static45.anInt2753 = Static9.anInt280;
			Static44.aClass1_Sub20_Sub1_1.method2108(6);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25 >> 14 & 0x7FFF);
		}
		if (local21 == 4) {
			Static44.aClass1_Sub20_Sub1_1.method2108(65);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13);
			Static44.aClass1_Sub20_Sub1_1.method2060(local17);
			Static44.aClass1_Sub20_Sub1_1.method2064(Static20.anInt654);
			Static44.aClass1_Sub20_Sub1_1.method2059(Static84.anInt2143);
		}
		if (local21 == 12 && Static45.method1932(local17, local25, local13)) {
			Static44.aClass1_Sub20_Sub1_1.method2108(175);
			Static44.aClass1_Sub20_Sub1_1.method2061(local25 >> 14 & 0x7FFF);
			Static44.aClass1_Sub20_Sub1_1.method2061(local17 + Static32.anInt927);
			Static44.aClass1_Sub20_Sub1_1.method2061(Static30.anInt875);
			Static44.aClass1_Sub20_Sub1_1.method2059(Static9.anInt285);
			Static44.aClass1_Sub20_Sub1_1.method2061(Static129.anInt3262 + local13);
			Static44.aClass1_Sub20_Sub1_1.method2055(Static50.anInt1243);
		}
		if (local21 == 41) {
			local277 = Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			if (!local277) {
				Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			}
			Static45.anInt2753 = Static9.anInt280;
			Static120.anInt1841 = Static97.anInt2390;
			Static36.anInt950 = 0;
			Static28.anInt860 = 2;
			Static44.aClass1_Sub20_Sub1_1.method2108(207);
			Static44.aClass1_Sub20_Sub1_1.method2061(Static32.anInt927 + local17);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			Static44.aClass1_Sub20_Sub1_1.method2055(Static129.anInt3262 + local13);
		}
		if (local21 == 57 && Static45.method1932(local17, local25, local13)) {
			Static44.aClass1_Sub20_Sub1_1.method2108(179);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25 >> 14 & 0x7FFF);
			Static44.aClass1_Sub20_Sub1_1.method2064(Static32.anInt927 + local17);
			Static44.aClass1_Sub20_Sub1_1.method2059(Static84.anInt2143);
			Static44.aClass1_Sub20_Sub1_1.method2095(Static20.anInt654);
			Static44.aClass1_Sub20_Sub1_1.method2095(Static129.anInt3262 + local13);
		}
		if (local21 == 38) {
			Static44.aClass68_1.method1854(Static7.anInt213, local13, local17);
		}
		if (local21 == 31) {
			local450 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local25];
			if (local450 != null) {
				Static54.method946(local450.anIntArray443[0], local450.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static36.anInt950 = 0;
				Static45.anInt2753 = Static9.anInt280;
				Static120.anInt1841 = Static97.anInt2390;
				Static28.anInt860 = 2;
				Static44.aClass1_Sub20_Sub1_1.method2108(170);
				Static44.aClass1_Sub20_Sub1_1.method2061(local25);
			}
		}
		if (local21 == 58) {
			Static44.aClass1_Sub20_Sub1_1.method2108(176);
			Static44.aClass1_Sub20_Sub1_1.method2055(local13);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			Static44.aClass1_Sub20_Sub1_1.method2060(local17);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 6) {
			Static45.method1932(local17, local25, local13);
			Static44.aClass1_Sub20_Sub1_1.method2108(138);
			Static44.aClass1_Sub20_Sub1_1.method2061(local13 + Static129.anInt3262);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25 >> 14 & 0x7FFF);
			Static44.aClass1_Sub20_Sub1_1.method2061(local17 + Static32.anInt927);
		}
		if (local21 == 49) {
			local277 = Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			if (!local277) {
				Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			}
			Static120.anInt1841 = Static97.anInt2390;
			Static45.anInt2753 = Static9.anInt280;
			Static28.anInt860 = 2;
			Static36.anInt950 = 0;
			Static44.aClass1_Sub20_Sub1_1.method2108(240);
			Static44.aClass1_Sub20_Sub1_1.method2060(Static84.anInt2143);
			Static44.aClass1_Sub20_Sub1_1.method2064(Static20.anInt654);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13 + Static129.anInt3262);
			Static44.aClass1_Sub20_Sub1_1.method2095(local25);
			Static44.aClass1_Sub20_Sub1_1.method2055(Static32.anInt927 + local17);
		}
		if (local21 == 7 || local21 == 1004) {
			Static76.method1315(local17, local13, local25, Static75.aClass5Array12[arg0]);
		}
		if (local21 == 42) {
			local450 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local25];
			if (local450 != null) {
				Static54.method946(local450.anIntArray443[0], local450.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static45.anInt2753 = Static9.anInt280;
				Static36.anInt950 = 0;
				Static28.anInt860 = 2;
				Static120.anInt1841 = Static97.anInt2390;
				Static44.aClass1_Sub20_Sub1_1.method2108(234);
				Static44.aClass1_Sub20_Sub1_1.method2061(local25);
				Static44.aClass1_Sub20_Sub1_1.method2064(Static20.anInt654);
				Static44.aClass1_Sub20_Sub1_1.method2059(Static84.anInt2143);
			}
		}
		if (local21 == 47) {
			Static45.method1932(local17, local25, local13);
			Static44.aClass1_Sub20_Sub1_1.method2108(152);
			Static44.aClass1_Sub20_Sub1_1.method2061(local17 + Static32.anInt927);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25 >> 14 & 0x7FFF);
			Static44.aClass1_Sub20_Sub1_1.method2064(local13 + Static129.anInt3262);
		}
		if (local21 == 8) {
			local450 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local25];
			if (local450 != null) {
				Static54.method946(local450.anIntArray443[0], local450.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static45.anInt2753 = Static9.anInt280;
				Static36.anInt950 = 0;
				Static28.anInt860 = 2;
				Static120.anInt1841 = Static97.anInt2390;
				Static44.aClass1_Sub20_Sub1_1.method2108(84);
				Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			}
		}
		if (local21 == 9) {
			Static45.method1932(local17, local25, local13);
			Static44.aClass1_Sub20_Sub1_1.method2108(36);
			Static44.aClass1_Sub20_Sub1_1.method2055(local17 + Static32.anInt927);
			Static44.aClass1_Sub20_Sub1_1.method2061(local25 >> 14 & 0x7FFF);
			Static44.aClass1_Sub20_Sub1_1.method2061(local13 + Static129.anInt3262);
		}
		if (local21 == 32) {
			local38 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local25];
			if (local38 != null) {
				Static54.method946(local38.anIntArray443[0], local38.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static28.anInt860 = 2;
				Static36.anInt950 = 0;
				Static45.anInt2753 = Static9.anInt280;
				Static120.anInt1841 = Static97.anInt2390;
				Static44.aClass1_Sub20_Sub1_1.method2108(198);
				Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			}
		}
		if (local21 == 16) {
			local450 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local25];
			if (local450 != null) {
				Static54.method946(local450.anIntArray443[0], local450.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static45.anInt2753 = Static9.anInt280;
				Static28.anInt860 = 2;
				Static36.anInt950 = 0;
				Static120.anInt1841 = Static97.anInt2390;
				Static44.aClass1_Sub20_Sub1_1.method2108(43);
				Static44.aClass1_Sub20_Sub1_1.method2055(Static30.anInt875);
				Static44.aClass1_Sub20_Sub1_1.method2055(Static50.anInt1243);
				Static44.aClass1_Sub20_Sub1_1.method2095(local25);
				Static44.aClass1_Sub20_Sub1_1.method2090(Static9.anInt285);
			}
		}
		if (local21 == 24) {
			local38 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local25];
			if (local38 != null) {
				Static54.method946(local38.anIntArray443[0], local38.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static120.anInt1841 = Static97.anInt2390;
				Static45.anInt2753 = Static9.anInt280;
				Static36.anInt950 = 0;
				Static28.anInt860 = 2;
				Static44.aClass1_Sub20_Sub1_1.method2108(220);
				Static44.aClass1_Sub20_Sub1_1.method2055(local25);
			}
		}
		if (local21 == 20) {
			Static44.aClass1_Sub20_Sub1_1.method2108(69);
			Static44.aClass1_Sub20_Sub1_1.method2061(local13);
			Static44.aClass1_Sub20_Sub1_1.method2092(local17);
			Static44.aClass1_Sub20_Sub1_1.method2061(local25);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 3) {
			local450 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local25];
			if (local450 != null) {
				Static54.method946(local450.anIntArray443[0], local450.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static28.anInt860 = 2;
				Static120.anInt1841 = Static97.anInt2390;
				Static45.anInt2753 = Static9.anInt280;
				Static36.anInt950 = 0;
				Static44.aClass1_Sub20_Sub1_1.method2108(9);
				Static44.aClass1_Sub20_Sub1_1.method2064(local25);
			}
		}
		if (local21 == 22) {
			Static44.aClass1_Sub20_Sub1_1.method2108(112);
			Static44.aClass1_Sub20_Sub1_1.method2061(local13);
			Static44.aClass1_Sub20_Sub1_1.method2060(local17);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25);
			Static103.anInt2536 = 0;
			Static5.aClass1_Sub17_9 = Static36.method680(local17);
			Static83.anInt2118 = local13;
		}
		if (local21 == 10) {
			local277 = Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			if (!local277) {
				Static54.method946(local13, local17, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
			}
			Static28.anInt860 = 2;
			Static45.anInt2753 = Static9.anInt280;
			Static120.anInt1841 = Static97.anInt2390;
			Static36.anInt950 = 0;
			Static44.aClass1_Sub20_Sub1_1.method2108(131);
			Static44.aClass1_Sub20_Sub1_1.method2064(local25);
			Static44.aClass1_Sub20_Sub1_1.method2064(local17 + Static32.anInt927);
			Static44.aClass1_Sub20_Sub1_1.method2095(local13 + Static129.anInt3262);
		}
		if (local21 == 17) {
			local450 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local25];
			if (local450 != null) {
				Static54.method946(local450.anIntArray443[0], local450.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				Static36.anInt950 = 0;
				Static28.anInt860 = 2;
				Static120.anInt1841 = Static97.anInt2390;
				Static45.anInt2753 = Static9.anInt280;
				Static44.aClass1_Sub20_Sub1_1.method2108(200);
				Static44.aClass1_Sub20_Sub1_1.method2061(local25);
			}
		}
		if (local21 == 48 && Static11.aClass1_Sub17_14 == null) {
			Static90.method1561(local13, local17);
			Static11.aClass1_Sub17_14 = Static18.method2150(local17, local13);
			Static119.method2161(Static11.aClass1_Sub17_14);
		}
		if (local21 == 40) {
			Static44.aClass1_Sub20_Sub1_1.method2108(189);
			Static44.aClass1_Sub20_Sub1_1.method2092(local17);
			local97 = Static36.method680(local17);
			if (local97.anIntArrayArray67 != null && local97.anIntArrayArray67[0][0] == 5) {
				local744 = local97.anIntArrayArray67[0][1];
				if (local97.anIntArray344[0] != Static40.anIntArray182[local744]) {
					Static40.anIntArray182[local744] = local97.anIntArray344[0];
					Static18.method2158(local744);
				}
			}
		}
		if (local21 == 1005) {
			Static28.anInt860 = 2;
			Static120.anInt1841 = Static97.anInt2390;
			Static36.anInt950 = 0;
			Static45.anInt2753 = Static9.anInt280;
			local38 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local25];
			if (local38 != null) {
				@Pc(2599) Class1_Sub3_Sub12 local2599 = local38.aClass1_Sub3_Sub12_1;
				if (local2599.anIntArray324 != null) {
					local2599 = local2599.method1475();
				}
				if (local2599 != null) {
					Static44.aClass1_Sub20_Sub1_1.method2108(72);
					Static44.aClass1_Sub20_Sub1_1.method2095(local2599.anInt2105);
				}
			}
		}
		if (Static120.anInt1840 != 0) {
			Static120.anInt1840 = 0;
			Static119.method2161(Static36.method680(Static9.anInt285));
		}
		if (Static47.aBoolean35) {
			Static51.method901();
		}
	}
}
