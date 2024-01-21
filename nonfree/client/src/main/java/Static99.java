import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!kg", name = "mb", descriptor = "[[Lclient!wd;")
	public static Class97[][] aClass97ArrayArray1;

	@OriginalMember(owner = "client!kg", name = "ub", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1491 = Static118.method2249("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!kg", name = "K", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1485 = aClass65_1491;

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "[I")
	public static final int[] anIntArray280 = new int[500];

	@OriginalMember(owner = "client!kg", name = "qb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1489 = Static118.method2249("Create a free account");

	@OriginalMember(owner = "client!kg", name = "U", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1486 = aClass65_1489;

	@OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
	public static int anInt2495 = 0;

	@OriginalMember(owner = "client!kg", name = "hb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1487 = Static118.method2249("M");

	@OriginalMember(owner = "client!kg", name = "ob", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1488 = Static118.method2249("Could not complete login)3");

	@OriginalMember(owner = "client!kg", name = "tb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1490 = aClass65_1488;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	public static void method1880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static119.aBoolean120 = true;
		Static9.anInt236 = arg0;
		Static2.anInt73 = arg1;
		Static15.anInt416 = arg2;
		Static108.anInt2645 = -1;
		Static11.anInt260 = -1;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V")
	public static void method1885() {
		@Pc(5) int local5 = Static51.anInt1360;
		@Pc(7) int local7 = Static71.anInt1742;
		@Pc(9) int local9 = Static197.anInt4258;
		@Pc(11) int local11 = Static195.anInt4218;
		Static194.method3096(local5, local9, local7, local11, 6116423);
		Static194.method3096(local5 + 1, local9 + 1, local7 - 2, 16, 0);
		Static194.method3095(local5 + 1, local9 + 18, local7 - 2, local11 + -19, 0);
		Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1597(Static149.aClass65_2014, local5 + 3, local9 + 14, 6116423, -1);
		@Pc(63) int local63 = Static53.anInt1441;
		@Pc(65) int local65 = Static38.anInt1051;
		for (@Pc(67) int local67 = 0; local67 < Static101.anInt2533; local67++) {
			@Pc(70) int local70 = 16777215;
			@Pc(83) int local83 = (Static101.anInt2533 - local67 - 1) * 15 + local9 + 31;
			if (local5 < local63 && local63 < local5 + local7 && local83 - 13 < local65 && local83 + 3 > local65) {
				local70 = 16776960;
			}
			Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1597(Static128.method2421(local67), local5 + 3, local83, local70, 0);
		}
		Static134.method2557(Static51.anInt1360, Static71.anInt1742, Static197.anInt4258, Static195.anInt4218);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIIIII)V")
	public static void method1889(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class93 local13 = local7.aClass93_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4263;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class76 local58 = local7.aClass76_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt3521;
		@Pc(67) int local67 = local58.anInt3519;
		@Pc(70) int local70 = local58.anInt3520;
		@Pc(73) int local73 = local58.anInt3522;
		@Pc(77) int[] local77 = Static75.anIntArrayArray16[local23];
		@Pc(81) int[] local81 = Static129.anIntArrayArray29[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(B)V")
	public static void method1890() {
		if (!Static138.aBoolean138) {
			return;
		}
		@Pc(11) Class97 local11 = Static173.method2926(Static54.anInt3676, Static83.anInt2029);
		if (local11 != null && local11.anObjectArray9 != null) {
			@Pc(25) Class1_Sub26 local25 = new Class1_Sub26();
			local25.anObjectArray3 = local11.anObjectArray9;
			local25.aClass97_14 = local11;
			Static94.method1780(local25);
		}
		Static138.aBoolean138 = false;
		Static25.method448(local11);
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(II)Lclient!oc;")
	public static Class65 method1891(@OriginalArg(1) int arg0) {
		@Pc(5) Class65 local5 = Static118.method2250(arg0);
		for (@Pc(11) int local11 = local5.method2482() - 3; local11 > 0; local11 -= 3) {
			local5 = Static109.method2004(new Class65[] { local5.method2481(local11, 0), Static200.aClass65_2557, local5.method2483(local11) });
		}
		if (local5.method2482() > 9) {
			return Static109.method2004(new Class65[] { Static183.aClass65_2323, local5.method2481(local5.method2482() - 8, 0), Static50.aClass65_875, Static201.aClass65_2374, local5, Static119.aClass65_1712 });
		} else if (local5.method2482() > 6) {
			return Static109.method2004(new Class65[] { Static139.aClass65_1955, local5.method2481(local5.method2482() - 4, 0), Static25.aClass65_541, Static201.aClass65_2374, local5, Static119.aClass65_1712 });
		} else {
			return Static109.method2004(new Class65[] { Static4.aClass65_52, local5, Static8.aClass65_95 });
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(Z)V")
	public static void method1893() {
		if (Static114.anInt2802 > 0) {
			Static114.anInt2802--;
		}
		if (Static51.anInt1367 > 1) {
			Static51.anInt1367--;
		}
		if (Static190.aBoolean165) {
			Static190.aBoolean165 = false;
			Static16.method304();
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < 100 && Static156.method2723(); local25++) {
		}
		if (Static174.anInt3884 != 30) {
			return;
		}
		Static61.method1081(Static45.aClass1_Sub14_Sub1_8);
		@Pc(47) Object local47 = Static36.aClass64_1.anObject3;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(112) int local112;
		@Pc(95) int local95;
		synchronized (Static36.aClass64_1.anObject3) {
			if (!Static3.aBoolean3) {
				Static36.aClass64_1.anInt3158 = 0;
			} else if (Static96.anInt2403 != 0 || Static36.aClass64_1.anInt3158 >= 40) {
				Static45.aClass1_Sub14_Sub1_8.method1761(10);
				Static45.aClass1_Sub14_Sub1_8.method1710(0);
				local77 = Static45.aClass1_Sub14_Sub1_8.anInt2306;
				local79 = 0;
				for (local81 = 0; local81 < Static36.aClass64_1.anInt3158 && Static45.aClass1_Sub14_Sub1_8.anInt2306 - local77 < 240; local81++) {
					local79++;
					local95 = Static36.aClass64_1.anIntArray366[local81];
					if (local95 < 0) {
						local95 = 0;
					} else if (local95 > 764) {
						local95 = 764;
					}
					local112 = Static36.aClass64_1.anIntArray365[local81];
					if (local112 < 0) {
						local112 = 0;
					} else if (local112 > 502) {
						local112 = 502;
					}
					@Pc(130) int local130 = local95 + local112 * 765;
					if (Static36.aClass64_1.anIntArray365[local81] == -1 && Static36.aClass64_1.anIntArray366[local81] == -1) {
						local130 = 524287;
						local112 = -1;
						local95 = -1;
					}
					if (local95 != Static201.anInt3931 || local112 != Static107.anInt2628) {
						@Pc(178) int local178 = local112 - Static107.anInt2628;
						Static107.anInt2628 = local112;
						@Pc(185) int local185 = local95 - Static201.anInt3931;
						Static201.anInt3931 = local95;
						if (Static199.anInt4287 < 8 && local185 >= -32 && local185 <= 31 && local178 >= -32 && local178 <= 31) {
							local178 += 32;
							local185 += 32;
							Static45.aClass1_Sub14_Sub1_8.method1726(local178 + (Static199.anInt4287 << 12) + (local185 << 6));
							Static199.anInt4287 = 0;
						} else if (Static199.anInt4287 < 8) {
							Static45.aClass1_Sub14_Sub1_8.method1746(local130 + (Static199.anInt4287 << 19) + 8388608);
							Static199.anInt4287 = 0;
						} else {
							Static45.aClass1_Sub14_Sub1_8.method1724((Static199.anInt4287 << 19) + local130 - 1073741824);
							Static199.anInt4287 = 0;
						}
					} else if (Static199.anInt4287 < 2047) {
						Static199.anInt4287++;
					}
				}
				Static45.aClass1_Sub14_Sub1_8.method1697(Static45.aClass1_Sub14_Sub1_8.anInt2306 - local77);
				if (local79 >= Static36.aClass64_1.anInt3158) {
					Static36.aClass64_1.anInt3158 = 0;
				} else {
					Static36.aClass64_1.anInt3158 -= local79;
					for (local112 = 0; local112 < Static36.aClass64_1.anInt3158; local112++) {
						Static36.aClass64_1.anIntArray366[local112] = Static36.aClass64_1.anIntArray366[local112 + local79];
						Static36.aClass64_1.anIntArray365[local112] = Static36.aClass64_1.anIntArray365[local79 + local112];
					}
				}
			}
		}
		if (Static96.anInt2403 != 0) {
			@Pc(339) long local339 = (Static25.aLong23 - Static153.aLong117) / 50L;
			if (local339 > 4095L) {
				local339 = 4095L;
			}
			Static153.aLong117 = Static25.aLong23;
			local77 = Static182.anInt4065;
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 502) {
				local77 = 502;
			}
			local79 = Static2.anInt67;
			@Pc(368) byte local368 = 0;
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 764) {
				local79 = 764;
			}
			if (Static96.anInt2403 == 2) {
				local368 = 1;
			}
			Static45.aClass1_Sub14_Sub1_8.method1761(157);
			local81 = local77 * 765 + local79;
			local95 = (int) local339;
			Static45.aClass1_Sub14_Sub1_8.method1718((local95 << 20) + ((local368 << 19) + local81));
		}
		if (Static204.aBooleanArray19[96] || Static204.aBooleanArray19[97] || Static204.aBooleanArray19[98] || Static204.aBooleanArray19[99]) {
			Static67.aBoolean75 = true;
		}
		if (Static21.anInt647 > 0) {
			Static21.anInt647--;
		}
		if (Static67.aBoolean75 && Static21.anInt647 <= 0) {
			Static21.anInt647 = 20;
			Static67.aBoolean75 = false;
			Static45.aClass1_Sub14_Sub1_8.method1761(22);
			Static45.aClass1_Sub14_Sub1_8.method1748(Static82.anInt2025);
			Static45.aClass1_Sub14_Sub1_8.method1741(Static54.anInt3674);
		}
		if (Static40.aBoolean42 && !Static23.aBoolean30) {
			Static23.aBoolean30 = true;
			Static45.aClass1_Sub14_Sub1_8.method1761(25);
			Static45.aClass1_Sub14_Sub1_8.method1710(1);
		}
		if (!Static40.aBoolean42 && Static23.aBoolean30) {
			Static23.aBoolean30 = false;
			Static45.aClass1_Sub14_Sub1_8.method1761(25);
			Static45.aClass1_Sub14_Sub1_8.method1710(0);
		}
		Static123.method2347();
		if (Static174.anInt3884 != 30) {
			return;
		}
		Static71.method1213();
		Static20.method385();
		Static124.anInt3084++;
		if (Static124.anInt3084 > 750) {
			Static16.method304();
			return;
		}
		Static142.method2621();
		Static192.method3155();
		Static48.method826();
		Static200.method3236();
		if (Static26.anInt775 != 0) {
			Static184.anInt4067 += 20;
			if (Static184.anInt4067 >= 400) {
				Static26.anInt775 = 0;
			}
		}
		Static160.anInt2781++;
		if (Static143.aClass97_6 != null) {
			Static11.anInt259++;
			if (Static11.anInt259 >= 15) {
				Static25.method448(Static143.aClass97_6);
				Static143.aClass97_6 = null;
			}
		}
		@Pc(639) Class97 local639;
		if (Static130.aClass97_10 != null) {
			Static25.method448(Static130.aClass97_10);
			Static20.anInt622++;
			if (Static53.anInt1441 > Static8.anInt209 + 5 || Static8.anInt209 - 5 > Static53.anInt1441 || Static54.anInt3673 + 5 < Static38.anInt1051 || Static38.anInt1051 < Static54.anInt3673 - 5) {
				Static82.aBoolean93 = true;
			}
			if (Static122.anInt3456 == 0) {
				if (Static82.aBoolean93 && Static20.anInt622 >= 5) {
					if (Static170.aClass97_12 == Static130.aClass97_10 && Static161.anInt3635 != Static60.anInt1551) {
						local639 = Static130.aClass97_10;
						@Pc(641) byte local641 = 0;
						if (Static116.anInt2834 == 1 && local639.anInt4314 == 206) {
							local641 = 1;
						}
						if (local639.anIntArray512[Static161.anInt3635] <= 0) {
							local641 = 0;
						}
						if (Static130.method2479(Static153.method2677(local639))) {
							local77 = Static60.anInt1551;
							local79 = Static161.anInt3635;
							local639.anIntArray512[local79] = local639.anIntArray512[local77];
							local639.anIntArray507[local79] = local639.anIntArray507[local77];
							local639.anIntArray512[local77] = -1;
							local639.anIntArray507[local77] = 0;
						} else if (local641 == 1) {
							local77 = Static60.anInt1551;
							local79 = Static161.anInt3635;
							while (local77 != local79) {
								if (local77 > local79) {
									local639.method3273(local77 - 1, local77);
									local77--;
								} else if (local79 > local77) {
									local639.method3273(local77 + 1, local77);
									local77++;
								}
							}
						} else {
							local639.method3273(Static161.anInt3635, Static60.anInt1551);
						}
						Static45.aClass1_Sub14_Sub1_8.method1761(147);
						Static45.aClass1_Sub14_Sub1_8.method1726(Static60.anInt1551);
						Static45.aClass1_Sub14_Sub1_8.method1740(Static130.aClass97_10.anInt4376);
						Static45.aClass1_Sub14_Sub1_8.method1741(Static161.anInt3635);
						Static45.aClass1_Sub14_Sub1_8.method1698(local641);
					}
				} else if ((Static201.anInt3942 == 1 || Static101.method1913(Static101.anInt2533 - 1)) && Static101.anInt2533 > 2) {
					Static171.method2897();
				} else if (Static101.anInt2533 > 0) {
					Static95.method1807(Static101.anInt2533 - 1);
				}
				Static11.anInt259 = 10;
				Static130.aClass97_10 = null;
				Static96.anInt2403 = 0;
			}
		}
		Static107.aBoolean105 = false;
		Static60.anInt1557 = 0;
		local639 = Static204.aClass97_16;
		Static66.aClass97_7 = null;
		@Pc(811) Class97 local811 = Static71.aClass97_8;
		Static71.aClass97_8 = null;
		Static195.aBoolean167 = false;
		Static204.aClass97_16 = null;
		while (Static70.method1201() && Static60.anInt1557 < 128) {
			Static33.anIntArray88[Static60.anInt1557] = Static35.anInt1011;
			Static49.anIntArray122[Static60.anInt1557] = Static38.anInt1050;
			Static60.anInt1557++;
		}
		Static132.aClass97_11 = null;
		if (Static28.anInt856 != -1) {
			Static158.method2748(0, 0, Static33.anInt972, Static176.anInt3920, Static28.anInt856, 0, 0);
		}
		Static1.anInt4459++;
		while (true) {
			@Pc(860) Class1_Sub26 local860;
			@Pc(873) Class97 local873;
			@Pc(865) Class97 local865;
			do {
				local860 = (Class1_Sub26) Static112.aClass91_10.method3145();
				if (local860 == null) {
					while (true) {
						do {
							local860 = (Class1_Sub26) Static156.aClass91_17.method3145();
							if (local860 == null) {
								while (true) {
									do {
										local860 = (Class1_Sub26) Static158.aClass91_18.method3145();
										if (local860 == null) {
											if (Static172.aBoolean155 && Static132.aClass97_11 == null) {
												Static172.aBoolean155 = false;
											}
											if (Static195.aClass97_13 != null) {
												Static92.method1763();
											}
											if (Static108.anInt2645 != -1) {
												local77 = Static108.anInt2645;
												local79 = Static11.anInt260;
												@Pc(1027) boolean local1027 = Static198.method3220(0, 0, local79, true, 0, 0, 0, local77, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
												Static108.anInt2645 = -1;
												if (local1027) {
													Static26.anInt775 = 1;
													Static30.anInt880 = Static182.anInt4065;
													Static93.anInt2338 = Static2.anInt67;
													Static184.anInt4067 = 0;
												}
											}
											Static196.method3202();
											if (Static204.aClass97_16 != local639) {
												if (local639 != null) {
													Static25.method448(local639);
												}
												if (Static204.aClass97_16 != null) {
													Static25.method448(Static204.aClass97_16);
												}
											}
											if (local811 != Static71.aClass97_8 && Static86.anInt2066 == Static98.anInt2470) {
												if (local811 != null) {
													Static25.method448(local811);
												}
												if (Static71.aClass97_8 != null) {
													Static25.method448(Static71.aClass97_8);
												}
											}
											if (Static71.aClass97_8 == null) {
												if (Static86.anInt2066 > 0) {
													Static86.anInt2066--;
												}
											} else if (Static98.anInt2470 > Static86.anInt2066) {
												Static86.anInt2066++;
												if (Static86.anInt2066 == Static98.anInt2470) {
													Static25.method448(Static71.aClass97_8);
												}
											}
											Static158.method2747();
											if (Static77.aBoolean81) {
												Static42.method717();
											}
											for (local77 = 0; local77 < 5; local77++) {
												@Pc(1113) int local1113 = Static97.anIntArray274[local77]++;
											}
											local79 = Static186.method3082();
											local81 = Static173.method2929();
											if (local79 > 4500 && local81 > 4500) {
												Static114.anInt2802 = 250;
												Static108.method1979(4000);
												Static45.aClass1_Sub14_Sub1_8.method1761(30);
											}
											Static108.anInt2649++;
											Static177.anInt3991++;
											Static176.anInt3922++;
											if (Static176.anInt3922 > 500) {
												Static176.anInt3922 = 0;
												local112 = (int) (Math.random() * 8.0D);
												if ((local112 & 0x2) == 2) {
													Static185.anInt4102 += Static52.anInt1410;
												}
												if ((local112 & 0x4) == 4) {
													Static157.anInt4282 += Static113.anInt2778;
												}
												if ((local112 & 0x1) == 1) {
													Static8.anInt202 += Static101.anInt2541;
												}
											}
											if (Static157.anInt4282 < -40) {
												Static113.anInt2778 = 1;
											}
											if (Static8.anInt202 < -50) {
												Static101.anInt2541 = 2;
											}
											if (Static157.anInt4282 > 40) {
												Static113.anInt2778 = -1;
											}
											if (Static8.anInt202 > 50) {
												Static101.anInt2541 = -2;
											}
											if (Static185.anInt4102 < -55) {
												Static52.anInt1410 = 2;
											}
											if (Static108.anInt2649 > 500) {
												Static108.anInt2649 = 0;
												local112 = (int) (Math.random() * 8.0D);
												if ((local112 & 0x1) == 1) {
													Static105.anInt2597 += Static33.anInt968;
												}
												if ((local112 & 0x2) == 2) {
													Static130.anInt3193 += Static131.anInt3260;
												}
											}
											if (Static185.anInt4102 > 55) {
												Static52.anInt1410 = -2;
											}
											if (Static105.anInt2597 < -60) {
												Static33.anInt968 = 2;
											}
											if (Static105.anInt2597 > 60) {
												Static33.anInt968 = -2;
											}
											if (Static130.anInt3193 < -20) {
												Static131.anInt3260 = 1;
											}
											if (Static130.anInt3193 > 10) {
												Static131.anInt3260 = -1;
											}
											if (Static177.anInt3991 > 50) {
												Static45.aClass1_Sub14_Sub1_8.method1761(213);
											}
											try {
												if (Static123.aClass23_4 != null && Static45.aClass1_Sub14_Sub1_8.anInt2306 > 0) {
													Static123.aClass23_4.method726(Static45.aClass1_Sub14_Sub1_8.anInt2306, Static45.aClass1_Sub14_Sub1_8.aByteArray29);
													Static45.aClass1_Sub14_Sub1_8.anInt2306 = 0;
													Static177.anInt3991 = 0;
													return;
												}
												return;
											} catch (@Pc(1325) IOException local1325) {
												Static16.method304();
												return;
											}
										}
										local865 = local860.aClass97_14;
										if (local865.anInt4330 < 0) {
											break;
										}
										local873 = Static154.method2691(local865.anInt4319);
									} while (local873 == null || local873.aClass97Array2 == null || local873.aClass97Array2.length <= local865.anInt4330 || local873.aClass97Array2[local865.anInt4330] != local865);
									Static94.method1780(local860);
								}
							}
							local865 = local860.aClass97_14;
							if (local865.anInt4330 < 0) {
								break;
							}
							local873 = Static154.method2691(local865.anInt4319);
						} while (local873 == null || local873.aClass97Array2 == null || local865.anInt4330 >= local873.aClass97Array2.length || local873.aClass97Array2[local865.anInt4330] != local865);
						Static94.method1780(local860);
					}
				}
				local865 = local860.aClass97_14;
				if (local865.anInt4330 < 0) {
					break;
				}
				local873 = Static154.method2691(local865.anInt4319);
			} while (local873 == null || local873.aClass97Array2 == null || local873.aClass97Array2.length <= local865.anInt4330 || local873.aClass97Array2[local865.anInt4330] != local865);
			Static94.method1780(local860);
		}
	}
}
