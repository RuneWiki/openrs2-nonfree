import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!dd;")
	public static Class16 aClass16_12;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_3;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1 aClass1_Sub1_Sub8_Sub1_3;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "Lclient!ef;")
	public static Class20 aClass20_8;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!ea;")
	public static Class18 aClass18_743 = Static8.method128("<img=1>");

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!ea;")
	private static Class18 aClass18_744 = Static8.method128("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public static int anInt2948 = 0;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!d;")
	public static Class1_Sub6_Sub1 aClass1_Sub6_Sub1_1 = new Class1_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	public static int anInt2953 = 0;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Lclient!ea;")
	public static Class18 aClass18_745 = aClass18_744;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "I")
	public static int anInt2954 = 99;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "Lclient!ea;")
	public static Class18 aClass18_746 = Static8.method128("<img=1>");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V")
	public static void method2076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static118.anInt3373 == 2) {
			Static71.method1524(Static93.anInt2876 * 2, Static126.anInt3635 + (Static87.anInt2639 - Static117.anInt3328 << 7), (Static146.anInt4048 - Static110.anInt3227 << 7) - -Static177.anInt4716);
			if (Static170.anInt4621 > -1 && Static41.anInt1322 % 20 < 10) {
				Static178.aClass1_Sub1_Sub8_Sub3Array10[0].method1659(Static170.anInt4621 + arg1 - 12, Static59.anInt805 + -28 + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z")
	public static boolean method2079(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	public static void method2081() {
		if (Static92.anInt2817 > 0) {
			Static92.anInt2817--;
		}
		if (Static86.anInt2621 > 1) {
			Static86.anInt2621--;
		}
		if (Static117.aBoolean145) {
			Static117.aBoolean145 = false;
			Static108.method2227();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static108.method2224(); local32++) {
		}
		if (Static73.anInt1886 != 30) {
			return;
		}
		Static158.method2948(aClass1_Sub6_Sub1_1);
		@Pc(56) Object local56 = Static144.aClass56_1.anObject4;
		@Pc(83) int local83;
		@Pc(85) int local85;
		@Pc(87) int local87;
		@Pc(104) int local104;
		@Pc(109) int local109;
		synchronized (Static144.aClass56_1.anObject4) {
			if (!Static91.aBoolean112) {
				Static144.aClass56_1.anInt3314 = 0;
			} else if (Static145.anInt4043 != 0 || Static144.aClass56_1.anInt3314 >= 40) {
				aClass1_Sub6_Sub1_1.method555(121);
				aClass1_Sub6_Sub1_1.method530(0);
				local83 = aClass1_Sub6_Sub1_1.anInt839;
				local85 = 0;
				for (local87 = 0; local87 < Static144.aClass56_1.anInt3314 && aClass1_Sub6_Sub1_1.anInt839 - local83 < 240; local87++) {
					local85++;
					local104 = Static144.aClass56_1.anIntArray291[local87];
					local109 = Static144.aClass56_1.anIntArray290[local87];
					if (local109 < 0) {
						local109 = 0;
					} else if (local109 > 764) {
						local109 = 764;
					}
					if (local104 < 0) {
						local104 = 0;
					} else if (local104 > 502) {
						local104 = 502;
					}
					@Pc(145) int local145 = local109 + local104 * 765;
					if (Static144.aClass56_1.anIntArray291[local87] == -1 && Static144.aClass56_1.anIntArray290[local87] == -1) {
						local104 = -1;
						local145 = 524287;
						local109 = -1;
					}
					if (local109 != Static56.anInt2215 || local104 != Static151.anInt4182) {
						@Pc(184) int local184 = local109 - Static56.anInt2215;
						Static56.anInt2215 = local109;
						@Pc(191) int local191 = local104 - Static151.anInt4182;
						Static151.anInt4182 = local104;
						if (Static86.anInt2615 < 8 && local184 >= -32 && local184 <= 31 && local191 >= -32 && local191 <= 31) {
							local184 += 32;
							local191 += 32;
							aClass1_Sub6_Sub1_1.method531((local184 << 6) + ((Static86.anInt2615 << 12) + local191));
							Static86.anInt2615 = 0;
						} else if (Static86.anInt2615 < 8) {
							aClass1_Sub6_Sub1_1.method496(local145 + (Static86.anInt2615 << 19) + 8388608);
							Static86.anInt2615 = 0;
						} else {
							aClass1_Sub6_Sub1_1.method513(local145 + (Static86.anInt2615 << 19) - 1073741824);
							Static86.anInt2615 = 0;
						}
					} else if (Static86.anInt2615 < 2047) {
						Static86.anInt2615++;
					}
				}
				aClass1_Sub6_Sub1_1.method514(aClass1_Sub6_Sub1_1.anInt839 - local83);
				if (local85 < Static144.aClass56_1.anInt3314) {
					Static144.aClass56_1.anInt3314 -= local85;
					for (local104 = 0; local104 < Static144.aClass56_1.anInt3314; local104++) {
						Static144.aClass56_1.anIntArray290[local104] = Static144.aClass56_1.anIntArray290[local104 + local85];
						Static144.aClass56_1.anIntArray291[local104] = Static144.aClass56_1.anIntArray291[local85 + local104];
					}
				} else {
					Static144.aClass56_1.anInt3314 = 0;
				}
			}
		}
		if (Static145.anInt4043 != 0) {
			@Pc(344) long local344 = (Static179.aLong138 - Static108.aLong96) / 50L;
			if (local344 > 4095L) {
				local344 = 4095L;
			}
			Static108.aLong96 = Static179.aLong138;
			local83 = Static91.anInt2764;
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 502) {
				local83 = 502;
			}
			local85 = Static74.anInt2247;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 764) {
				local85 = 764;
			}
			local87 = local85 + local83 * 765;
			@Pc(394) byte local394 = 0;
			local109 = (int) local344;
			if (Static145.anInt4043 == 2) {
				local394 = 1;
			}
			aClass1_Sub6_Sub1_1.method555(167);
			aClass1_Sub6_Sub1_1.method539(local87 + (local109 << 20) + (local394 << 19));
		}
		if (Static97.anInt3003 > 0) {
			Static97.anInt3003--;
		}
		if (Static45.aBooleanArray6[96] || Static45.aBooleanArray6[97] || Static45.aBooleanArray6[98] || Static45.aBooleanArray6[99]) {
			Static145.aBoolean181 = true;
		}
		if (Static145.aBoolean181 && Static97.anInt3003 <= 0) {
			Static97.anInt3003 = 20;
			Static145.aBoolean181 = false;
			aClass1_Sub6_Sub1_1.method555(169);
			aClass1_Sub6_Sub1_1.method528(Static155.anInt4270);
			aClass1_Sub6_Sub1_1.method528(Static98.anInt3021);
		}
		if (Static160.aBoolean195 && !Static149.aBoolean184) {
			Static149.aBoolean184 = true;
			aClass1_Sub6_Sub1_1.method555(34);
			aClass1_Sub6_Sub1_1.method530(1);
		}
		if (!Static160.aBoolean195 && Static149.aBoolean184) {
			Static149.aBoolean184 = false;
			aClass1_Sub6_Sub1_1.method555(34);
			aClass1_Sub6_Sub1_1.method530(0);
		}
		Static144.method2734();
		if (Static73.anInt1886 != 30) {
			return;
		}
		Static146.method2772();
		Static80.method1788();
		Static151.anInt4183++;
		if (Static151.anInt4183 > 750) {
			Static108.method2227();
			return;
		}
		Static163.method3020();
		Static125.method2484();
		Static78.method1712();
		if (Static45.anInt1554 != 0) {
			Static62.anInt1927 += 20;
			if (Static62.anInt1927 >= 400) {
				Static45.anInt1554 = 0;
			}
		}
		Static180.anInt4776++;
		if (Static124.aClass20_11 != null) {
			anInt2953++;
			if (anInt2953 >= 15) {
				Static152.method2858(Static124.aClass20_11);
				Static124.aClass20_11 = null;
			}
		}
		@Pc(647) Class20 local647;
		if (Static178.aClass20_14 != null) {
			Static152.method2858(Static178.aClass20_14);
			Static161.anInt4407++;
			if (Static59.anInt800 + 5 < Static154.anInt4252 || Static59.anInt800 - 5 > Static154.anInt4252 || Static122.anInt3467 + 5 < Static9.anInt293 || Static122.anInt3467 - 5 > Static9.anInt293) {
				Static157.aBoolean191 = true;
			}
			if (Static127.anInt3639 == 0) {
				if (Static157.aBoolean191 && Static161.anInt4407 >= 5) {
					if (Static11.aClass20_2 == Static178.aClass20_14 && Static154.anInt4251 != Static46.anInt4775) {
						@Pc(645) byte local645 = 0;
						local647 = Static178.aClass20_14;
						if (Static71.anInt2160 == 1 && local647.anInt1221 == 206) {
							local645 = 1;
						}
						if (local647.anIntArray79[Static154.anInt4251] <= 0) {
							local645 = 0;
						}
						if (method2079(Static36.method758(local647))) {
							local85 = Static154.anInt4251;
							local83 = Static46.anInt4775;
							local647.anIntArray79[local85] = local647.anIntArray79[local83];
							local647.anIntArray82[local85] = local647.anIntArray82[local83];
							local647.anIntArray79[local83] = -1;
							local647.anIntArray82[local83] = 0;
						} else if (local645 == 1) {
							local83 = Static46.anInt4775;
							local85 = Static154.anInt4251;
							while (local85 != local83) {
								if (local83 > local85) {
									local647.method780(local83, local83 - 1);
									local83--;
								} else if (local85 > local83) {
									local647.method780(local83, local83 + 1);
									local83++;
								}
							}
						} else {
							local647.method780(Static46.anInt4775, Static154.anInt4251);
						}
						aClass1_Sub6_Sub1_1.method555(166);
						aClass1_Sub6_Sub1_1.method523(Static154.anInt4251);
						aClass1_Sub6_Sub1_1.method512(local645);
						aClass1_Sub6_Sub1_1.method532(Static178.aClass20_14.anInt1240);
						aClass1_Sub6_Sub1_1.method528(Static46.anInt4775);
					}
				} else if ((Static8.anInt219 == 1 || Static177.method3180(Static80.anInt2478 - 1)) && Static80.anInt2478 > 2) {
					Static132.method2562();
				} else if (Static80.anInt2478 > 0) {
					Static32.method698(Static80.anInt2478 - 1);
				}
				Static145.anInt4043 = 0;
				anInt2953 = 10;
				Static178.aClass20_14 = null;
			}
		}
		Static89.anInt2750 = 0;
		Static122.aClass20_10 = null;
		Static73.aBoolean75 = false;
		local647 = aClass20_8;
		@Pc(823) Class20 local823 = Static45.aClass20_7;
		aClass20_8 = null;
		Static56.aBoolean87 = false;
		Static45.aClass20_7 = null;
		while (Static101.method2132() && Static89.anInt2750 < 128) {
			Static34.anIntArray72[Static89.anInt2750] = Static6.anInt195;
			Static75.anIntArray201[Static89.anInt2750] = Static177.anInt4717;
			Static89.anInt2750++;
		}
		Static2.method53(0, Static73.anInt1882, 0, 0, 765, 0, 503);
		Static167.anInt4526++;
		while (true) {
			@Pc(869) Class1_Sub10 local869;
			@Pc(885) Class20 local885;
			@Pc(874) Class20 local874;
			do {
				local869 = (Class1_Sub10) Static72.aClass59_34.method2423();
				if (local869 == null) {
					while (true) {
						do {
							local869 = (Class1_Sub10) Static37.aClass59_15.method2423();
							if (local869 == null) {
								while (true) {
									do {
										local869 = (Class1_Sub10) Static114.aClass59_45.method2423();
										if (local869 == null) {
											if (Static41.aClass20_4 != null) {
												Static28.method2239();
											}
											if (Static138.anInt3862 != -1) {
												local83 = Static138.anInt3862;
												local85 = Static138.anInt3855;
												@Pc(1034) boolean local1034 = Static12.method3143(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0], 0, local83, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0], true, 0, 0, 0, 0, local85, 0);
												Static138.anInt3862 = -1;
												if (local1034) {
													Static62.anInt1927 = 0;
													Static35.anInt668 = Static74.anInt2247;
													Static45.anInt1554 = 1;
													Static61.anInt1872 = Static91.anInt2764;
												}
											}
											Static46.method3208();
											if (aClass20_8 != local647) {
												if (local647 != null) {
													Static152.method2858(local647);
												}
												if (aClass20_8 != null) {
													Static152.method2858(aClass20_8);
												}
											}
											if (local823 != Static45.aClass20_7 && Static136.anInt3831 == Static14.anInt390) {
												if (local823 != null) {
													Static152.method2858(local823);
												}
												if (Static45.aClass20_7 != null) {
													Static152.method2858(Static45.aClass20_7);
												}
											}
											if (Static45.aClass20_7 == null) {
												if (Static14.anInt390 > 0) {
													Static14.anInt390--;
												}
											} else if (Static136.anInt3831 > Static14.anInt390) {
												Static14.anInt390++;
												if (Static14.anInt390 == Static136.anInt3831) {
													Static152.method2858(Static45.aClass20_7);
												}
											}
											Static35.method418();
											if (Static122.aBoolean152) {
												Static152.method2857();
											}
											for (local83 = 0; local83 < 5; local83++) {
												@Pc(1123) int local1123 = Static123.anIntArray310[local83]++;
											}
											local85 = Static84.method1827();
											local87 = Static49.method1042();
											if (local85 > 4500 && local87 > 4500) {
												Static92.anInt2817 = 250;
												Static123.method2418(4000);
												aClass1_Sub6_Sub1_1.method555(236);
											}
											Static154.anInt4250++;
											Static157.anInt4313++;
											if (Static154.anInt4250 > 500) {
												Static154.anInt4250 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x1) == 1) {
													Static72.anInt2205 += Static30.anInt1026;
												}
												if ((local104 & 0x4) == 4) {
													Static167.anInt4529 += Static172.anInt4639;
												}
												if ((local104 & 0x2) == 2) {
													Static129.anInt3682 += Static87.anInt2632;
												}
											}
											if (Static167.anInt4529 < -40) {
												Static172.anInt4639 = 1;
											}
											if (Static167.anInt4529 > 40) {
												Static172.anInt4639 = -1;
											}
											if (Static72.anInt2205 < -50) {
												Static30.anInt1026 = 2;
											}
											if (Static157.anInt4313 > 500) {
												local104 = (int) (Math.random() * 8.0D);
												Static157.anInt4313 = 0;
												if ((local104 & 0x2) == 2) {
													Static160.anInt4384 += Static108.anInt3180;
												}
												if ((local104 & 0x1) == 1) {
													Static180.anInt4777 += Static64.anInt1941;
												}
											}
											if (Static129.anInt3682 < -55) {
												Static87.anInt2632 = 2;
											}
											if (Static129.anInt3682 > 55) {
												Static87.anInt2632 = -2;
											}
											if (Static160.anInt4384 < -20) {
												Static108.anInt3180 = 1;
											}
											Static57.anInt1791++;
											if (Static160.anInt4384 > 10) {
												Static108.anInt3180 = -1;
											}
											if (Static72.anInt2205 > 50) {
												Static30.anInt1026 = -2;
											}
											if (Static180.anInt4777 < -60) {
												Static64.anInt1941 = 2;
											}
											if (Static180.anInt4777 > 60) {
												Static64.anInt1941 = -2;
											}
											if (Static57.anInt1791 > 50) {
												aClass1_Sub6_Sub1_1.method555(186);
											}
											try {
												if (Static35.aClass21_2 != null && aClass1_Sub6_Sub1_1.anInt839 > 0) {
													Static35.aClass21_2.method1024(aClass1_Sub6_Sub1_1.aByteArray3, aClass1_Sub6_Sub1_1.anInt839);
													Static57.anInt1791 = 0;
													aClass1_Sub6_Sub1_1.anInt839 = 0;
													return;
												}
												return;
											} catch (@Pc(1335) IOException local1335) {
												Static108.method2227();
												return;
											}
										}
										local874 = local869.aClass20_6;
										if (local874.anInt1200 < 0) {
											break;
										}
										local885 = Static84.method1826(local874.anInt1233);
									} while (local885 == null || local885.aClass20Array1 == null || local885.aClass20Array1.length <= local874.anInt1200 || local874 != local885.aClass20Array1[local874.anInt1200]);
									Static97.method2118(local869);
								}
							}
							local874 = local869.aClass20_6;
							if (local874.anInt1200 < 0) {
								break;
							}
							local885 = Static84.method1826(local874.anInt1233);
						} while (local885 == null || local885.aClass20Array1 == null || local885.aClass20Array1.length <= local874.anInt1200 || local885.aClass20Array1[local874.anInt1200] != local874);
						Static97.method2118(local869);
					}
				}
				local874 = local869.aClass20_6;
				if (local874.anInt1200 < 0) {
					break;
				}
				local885 = Static84.method1826(local874.anInt1233);
			} while (local885 == null || local885.aClass20Array1 == null || local885.aClass20Array1.length <= local874.anInt1200 || local874 != local885.aClass20Array1[local874.anInt1200]);
			Static97.method2118(local869);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)I")
	public static int method2085(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public static void method2087() {
		aClass16_12 = null;
		aClass18_744 = null;
		aClass20_8 = null;
		aClass1_Sub1_Sub8_Sub3_3 = null;
		aClass18_743 = null;
		aClass18_745 = null;
		aClass1_Sub1_Sub8_Sub1_3 = null;
		aClass1_Sub6_Sub1_1 = null;
		aClass18_746 = null;
	}
}
