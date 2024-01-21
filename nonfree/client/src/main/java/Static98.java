import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!r", name = "I", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_932 = Static119.method1462("rect_debug=");

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!pe;")
	public static Class65 aClass65_933 = Static119.method1462("Einloggen");

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_934 = Static119.method1462("leuchten2:");

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	public static int anInt2238 = 0;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "Lclient!pe;")
	public static Class65 aClass65_935 = Static119.method1462("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!r", name = "G", descriptor = "Lclient!pe;")
	public static Class65 aClass65_936 = Static119.method1462("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!r", name = "H", descriptor = "[I")
	public static int[] anIntArray290 = new int[1000];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
	public static void method1604(@OriginalArg(1) int arg0) {
		if (arg0 == Static129.anInt2753) {
			return;
		}
		if (Static129.anInt2753 == 0) {
			Static49.method846();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static1.anInt16 = 0;
			Static130.anInt2837 = 0;
			Static12.anInt342 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static126.aClass7_4 != null) {
			Static126.aClass7_4.method157();
			Static126.aClass7_4 = null;
		}
		if (Static129.anInt2753 == 25) {
			Static75.anInt2330 = 0;
			Static102.anInt2297 = 0;
			Static44.anInt1085 = 1;
			Static114.anInt2533 = 0;
			Static125.anInt2669 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static77.method1289(Static17.aClass56_Sub1_8, Static115.aCanvas1, Static16.aClass56_Sub1_24);
		} else {
			Static134.method2050();
		}
		Static129.anInt2753 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1605() {
		Static95.aClass8_46.method171();
		Static75.aClass8_52.method171();
		Static36.aClass8_21.method171();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[Lclient!wa;IIIIII)V")
	public static void method1610(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub22[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			@Pc(21) Class2_Sub22 local21 = arg1[local15];
			if (local21 != null && (!local21.aBoolean124 || local21.anInt2813 == 0 || local21.aBoolean123 || Static114.method1834(local21) != 0 || local21 == Static82.aClass2_Sub22_17) && arg4 == local21.anInt2800 && (!local21.aBoolean124 || !Static129.method1958(local21))) {
				@Pc(59) int local59 = local21.anInt2770 + arg0;
				@Pc(65) int local65 = local21.anInt2766 + arg2;
				if (local21 == Static52.aClass2_Sub22_6) {
					Static20.anInt505 = local65;
					Static94.aBoolean85 = true;
					Static18.anInt401 = local59;
				}
				@Pc(82) int local82;
				@Pc(86) int local86;
				@Pc(84) int local84;
				@Pc(88) int local88;
				@Pc(106) int local106;
				if (local21.anInt2813 == 2) {
					local82 = arg7;
					local84 = arg5;
					local86 = arg3;
					local88 = arg6;
				} else {
					@Pc(98) int local98;
					@Pc(100) int local100;
					if (local21.anInt2813 == 9) {
						local98 = local65;
						local100 = local59;
						local106 = local59 + local21.anInt2765;
						@Pc(111) int local111 = local65 + local21.anInt2787;
						if (local111 < local65) {
							local98 = local111;
							local111 = local65;
						}
						local111++;
						local82 = local98 > arg7 ? local98 : arg7;
						if (local106 < local59) {
							local100 = local106;
							local106 = local59;
						}
						local86 = arg3 < local100 ? local100 : arg3;
						local84 = arg5 <= local111 ? arg5 : local111;
						local106++;
						local88 = arg6 > local106 ? local106 : arg6;
					} else {
						local86 = arg3 < local59 ? local59 : arg3;
						local98 = local21.anInt2787 + local65;
						local84 = local98 < arg5 ? local98 : arg5;
						local82 = local65 <= arg7 ? arg7 : local65;
						local100 = local59 + local21.anInt2765;
						local88 = arg6 > local100 ? local100 : arg6;
					}
				}
				if (!local21.aBoolean124 || local82 < local84 && local86 < local88) {
					if (local21.anInt2801 == 1337) {
						Static116.method1853(local21);
					} else if (local21.anInt2801 == 1338) {
						Static44.method761(local59, local65);
					} else {
						if (local21.anInt2813 == 0) {
							if (!local21.aBoolean124 && Static129.method1958(local21) && local21 != Static4.aClass2_Sub22_5) {
								continue;
							}
							method1610(local59 - local21.anInt2781, arg1, local65 - local21.anInt2817, local86, local21.anInt2835, local84, local88, local82);
							if (local21.aClass2_Sub22Array2 != null) {
								method1610(local59 - local21.anInt2781, local21.aClass2_Sub22Array2, local65 - local21.anInt2817, local86, local21.anInt2835, local84, local88, local82);
							}
							@Pc(312) Class2_Sub7 local312 = (Class2_Sub7) Static112.aClass40_21.method851((long) local21.anInt2835);
							if (local312 != null) {
								Static75.method1671(local59, local88, local312.anInt1527, local65, local82, local84, local86);
							}
						}
						if (local21.aBoolean124) {
							@Pc(349) boolean local349;
							if (local82 <= Static66.anInt1586 && local86 <= Static39.anInt837 && Static66.anInt1586 < local84 && local88 > Static39.anInt837) {
								local349 = true;
							} else {
								local349 = false;
							}
							@Pc(355) boolean local355 = false;
							@Pc(357) boolean local357 = false;
							if (Static17.anInt380 == 1 && local349) {
								local357 = true;
							}
							if (Static17.anInt390 == 1 && local82 <= Static96.anInt2190 && Static100.anInt2282 >= local86 && Static96.anInt2190 < local84 && Static100.anInt2282 < local88) {
								local355 = true;
							}
							if (local355) {
								Static34.method637(Static96.anInt2190 - local65, local21, Static100.anInt2282 - local59);
							}
							if (Static52.aClass2_Sub22_6 != null && local21 != Static52.aClass2_Sub22_6 && local349 && Static111.method1809(Static114.method1834(local21))) {
								Static17.aClass2_Sub22_2 = local21;
							}
							if (Static82.aClass2_Sub22_17 == local21) {
								Static66.aBoolean57 = true;
								Static18.anInt402 = local59;
								Static91.anInt2029 = local65;
							}
							if (local21.aBoolean123) {
								@Pc(442) Class2_Sub9 local442;
								if (local349 && Static130.anInt2839 != 0 && local21.anObjectArray7 != null) {
									local442 = new Class2_Sub9();
									local442.anInt1718 = Static130.anInt2839;
									local442.anObjectArray2 = local21.anObjectArray7;
									local442.aClass2_Sub22_7 = local21;
									Static97.aClass13_13.method263(local442);
								}
								if (Static52.aClass2_Sub22_6 != null || Static95.aClass2_Sub22_11 != null || Static3.aBoolean5) {
									local357 = false;
									local349 = false;
									local355 = false;
								}
								if (!local21.aBoolean122 && local355) {
									local21.aBoolean122 = true;
									if (local21.anObjectArray18 != null) {
										local442 = new Class2_Sub9();
										local442.aClass2_Sub22_7 = local21;
										local442.anInt1718 = Static100.anInt2282 - local59;
										local442.anInt1723 = Static96.anInt2190 - local65;
										local442.anObjectArray2 = local21.anObjectArray18;
										Static97.aClass13_13.method263(local442);
									}
								}
								if (local21.aBoolean122 && local357 && local21.anObjectArray4 != null) {
									local442 = new Class2_Sub9();
									local442.anInt1718 = Static39.anInt837 - local59;
									local442.anObjectArray2 = local21.anObjectArray4;
									local442.anInt1723 = Static66.anInt1586 - local65;
									local442.aClass2_Sub22_7 = local21;
									Static97.aClass13_13.method263(local442);
								}
								if (local21.aBoolean122 && !local357) {
									local21.aBoolean122 = false;
									if (local21.anObjectArray25 != null) {
										local442 = new Class2_Sub9();
										local442.anInt1723 = Static66.anInt1586 - local65;
										local442.anObjectArray2 = local21.anObjectArray25;
										local442.aClass2_Sub22_7 = local21;
										local442.anInt1718 = Static39.anInt837 - local59;
										Static54.aClass13_8.method263(local442);
									}
								}
								if (local357 && local21.anObjectArray6 != null) {
									local442 = new Class2_Sub9();
									local442.anInt1718 = Static39.anInt837 - local59;
									local442.anInt1723 = Static66.anInt1586 - local65;
									local442.anObjectArray2 = local21.anObjectArray6;
									local442.aClass2_Sub22_7 = local21;
									Static97.aClass13_13.method263(local442);
								}
								if (!local21.aBoolean125 && local349) {
									local21.aBoolean125 = true;
									if (local21.anObjectArray21 != null) {
										local442 = new Class2_Sub9();
										local442.anInt1723 = Static66.anInt1586 - local65;
										local442.anInt1718 = Static39.anInt837 - local59;
										local442.anObjectArray2 = local21.anObjectArray21;
										local442.aClass2_Sub22_7 = local21;
										Static97.aClass13_13.method263(local442);
									}
								}
								if (local21.aBoolean125 && local349 && local21.anObjectArray15 != null) {
									local442 = new Class2_Sub9();
									local442.aClass2_Sub22_7 = local21;
									local442.anInt1718 = Static39.anInt837 - local59;
									local442.anObjectArray2 = local21.anObjectArray15;
									local442.anInt1723 = Static66.anInt1586 - local65;
									Static97.aClass13_13.method263(local442);
								}
								if (local21.aBoolean125 && !local349) {
									local21.aBoolean125 = false;
									if (local21.anObjectArray8 != null) {
										local442 = new Class2_Sub9();
										local442.anObjectArray2 = local21.anObjectArray8;
										local442.anInt1718 = Static39.anInt837 - local59;
										local442.aClass2_Sub22_7 = local21;
										local442.anInt1723 = Static66.anInt1586 - local65;
										Static54.aClass13_8.method263(local442);
									}
								}
								if (local21.anObjectArray13 != null) {
									local442 = new Class2_Sub9();
									local442.anObjectArray2 = local21.anObjectArray13;
									local442.aClass2_Sub22_7 = local21;
									Static32.aClass13_7.method263(local442);
								}
								@Pc(780) int local780;
								@Pc(782) int local782;
								@Pc(794) Class2_Sub9 local794;
								if (local21.anObjectArray14 != null && local21.anInt2825 < Static95.anInt2154) {
									if (local21.anIntArray368 == null || Static95.anInt2154 - local21.anInt2825 > 32) {
										local442 = new Class2_Sub9();
										local442.aClass2_Sub22_7 = local21;
										local442.anObjectArray2 = local21.anObjectArray14;
										Static97.aClass13_13.method263(local442);
									} else {
										label369: for (local106 = local21.anInt2825; local106 < Static95.anInt2154; local106++) {
											local780 = Static128.anIntArray361[local106 & 0x1F];
											for (local782 = 0; local782 < local21.anIntArray368.length; local782++) {
												if (local780 == local21.anIntArray368[local782]) {
													local794 = new Class2_Sub9();
													local794.anObjectArray2 = local21.anObjectArray14;
													local794.aClass2_Sub22_7 = local21;
													Static97.aClass13_13.method263(local794);
													break label369;
												}
											}
										}
									}
									local21.anInt2825 = Static95.anInt2154;
								}
								if (local21.anObjectArray17 != null && Static82.anInt2718 > local21.anInt2784) {
									if (local21.anIntArray366 == null || Static82.anInt2718 - local21.anInt2784 > 32) {
										local442 = new Class2_Sub9();
										local442.aClass2_Sub22_7 = local21;
										local442.anObjectArray2 = local21.anObjectArray17;
										Static97.aClass13_13.method263(local442);
									} else {
										label349: for (local106 = local21.anInt2784; local106 < Static82.anInt2718; local106++) {
											local780 = Static46.anIntArray133[local106 & 0x1F];
											for (local782 = 0; local782 < local21.anIntArray366.length; local782++) {
												if (local780 == local21.anIntArray366[local782]) {
													local794 = new Class2_Sub9();
													local794.anObjectArray2 = local21.anObjectArray17;
													local794.aClass2_Sub22_7 = local21;
													Static97.aClass13_13.method263(local794);
													break label349;
												}
											}
										}
									}
									local21.anInt2784 = Static82.anInt2718;
								}
								if (local21.anObjectArray12 != null && local21.anInt2769 < Static108.anInt2422) {
									if (local21.anIntArray369 == null || Static108.anInt2422 - local21.anInt2769 > 32) {
										local442 = new Class2_Sub9();
										local442.anObjectArray2 = local21.anObjectArray12;
										local442.aClass2_Sub22_7 = local21;
										Static97.aClass13_13.method263(local442);
									} else {
										label329: for (local106 = local21.anInt2769; local106 < Static108.anInt2422; local106++) {
											local780 = Static52.anIntArray159[local106 & 0x1F];
											for (local782 = 0; local782 < local21.anIntArray369.length; local782++) {
												if (local780 == local21.anIntArray369[local782]) {
													local794 = new Class2_Sub9();
													local794.aClass2_Sub22_7 = local21;
													local794.anObjectArray2 = local21.anObjectArray12;
													Static97.aClass13_13.method263(local794);
													break label329;
												}
											}
										}
									}
									local21.anInt2769 = Static108.anInt2422;
								}
								if (Static5.anInt166 > local21.anInt2797 && local21.anObjectArray5 != null) {
									local442 = new Class2_Sub9();
									local442.aClass2_Sub22_7 = local21;
									local442.anObjectArray2 = local21.anObjectArray5;
									Static97.aClass13_13.method263(local442);
								}
								if (Static59.anInt1470 > local21.anInt2797 && local21.anObjectArray10 != null) {
									local442 = new Class2_Sub9();
									local442.aClass2_Sub22_7 = local21;
									local442.anObjectArray2 = local21.anObjectArray10;
									Static97.aClass13_13.method263(local442);
								}
								if (local21.anInt2797 < Static134.anInt2946 && local21.anObjectArray9 != null) {
									local442 = new Class2_Sub9();
									local442.aClass2_Sub22_7 = local21;
									local442.anObjectArray2 = local21.anObjectArray9;
									Static97.aClass13_13.method263(local442);
								}
								if (Static54.anInt1346 > local21.anInt2797 && local21.anObjectArray28 != null) {
									local442 = new Class2_Sub9();
									local442.aClass2_Sub22_7 = local21;
									local442.anObjectArray2 = local21.anObjectArray28;
									Static97.aClass13_13.method263(local442);
								}
								local21.anInt2797 = Static8.anInt228;
								if (local21.anObjectArray27 != null) {
									for (local106 = 0; local106 < Static61.anInt1501; local106++) {
										@Pc(1149) Class2_Sub9 local1149 = new Class2_Sub9();
										local1149.aClass2_Sub22_7 = local21;
										local1149.anInt1721 = Static114.anIntArray334[local106];
										local1149.anInt1726 = Static111.anIntArray331[local106];
										local1149.anObjectArray2 = local21.anObjectArray27;
										Static97.aClass13_13.method263(local1149);
									}
								}
							}
						}
						if (!local21.aBoolean124) {
							if (Static52.aClass2_Sub22_6 != null || Static95.aClass2_Sub22_11 != null || Static3.aBoolean5) {
								return;
							}
							if ((local21.anInt2823 >= 0 || local21.anInt2788 != 0) && local82 <= Static66.anInt1586 && Static39.anInt837 >= local86 && local84 > Static66.anInt1586 && Static39.anInt837 < local88) {
								if (local21.anInt2823 >= 0) {
									Static4.aClass2_Sub22_5 = arg1[local21.anInt2823];
								} else {
									Static4.aClass2_Sub22_5 = local21;
								}
							}
							if (local21.anInt2813 == 8 && Static66.anInt1586 >= local82 && local86 <= Static39.anInt837 && local84 > Static66.anInt1586 && local88 > Static39.anInt837) {
								Static117.aClass2_Sub22_15 = local21;
							}
							if (local21.anInt2785 > local21.anInt2765) {
								Static5.method126(local59, Static66.anInt1586, local65 + local21.anInt2787, local21.anInt2785, Static39.anInt837, local21.anInt2765, local21);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public static void method1613() {
		aClass65_934 = null;
		aClass65_936 = null;
		Class70.anIntArray289 = null;
		aClass65_932 = null;
		anIntArray291 = null;
		anIntArray290 = null;
		aClass65_935 = null;
		aClass65_933 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public static void method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static17.anInt389 = 0;
		@Pc(78) int local78;
		for (@Pc(14) int local14 = -1; local14 < Static35.anInt795 + Static110.anInt2469; local14++) {
			@Pc(21) Class2_Sub1_Sub1_Sub4 local21;
			if (local14 == -1) {
				local21 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1;
			} else if (Static35.anInt795 > local14) {
				local21 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static76.anIntArray223[local14]];
			} else {
				local21 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static117.anIntArray340[local14 - Static35.anInt795]];
			}
			if (local21 != null && local21.method1466()) {
				@Pc(62) Class2_Sub1_Sub12 local62;
				if (local21 instanceof Class2_Sub1_Sub1_Sub4_Sub2) {
					local62 = ((Class2_Sub1_Sub1_Sub4_Sub2) local21).aClass2_Sub1_Sub12_1;
					if (local62.anIntArray282 != null) {
						local62 = local62.method1557();
					}
					if (local62 == null) {
						continue;
					}
				}
				if (local14 >= Static35.anInt795) {
					local62 = ((Class2_Sub1_Sub1_Sub4_Sub2) local21).aClass2_Sub1_Sub12_1;
					if (local62.anIntArray282 != null) {
						local62 = local62.method1557();
					}
					if (local62.anInt2143 >= 0 && local62.anInt2143 < Static17.aClass2_Sub1_Sub4_Sub1Array3.length) {
						Static88.method1441(local21.anInt1942 + 15, local21);
						if (Static112.anInt2513 > -1) {
							Static17.aClass2_Sub1_Sub4_Sub1Array3[local62.anInt2143].method461(arg3 + Static112.anInt2513 - 12, Static84.anInt1814 + (arg1 - 30));
						}
					}
					if (Static26.anInt631 == 1 && Static117.anIntArray340[local14 - Static35.anInt795] == Static105.anInt2363 && Static10.anInt2951 % 20 < 10) {
						Static88.method1441(local21.anInt1942 + 15, local21);
						if (Static112.anInt2513 > -1) {
							Static84.aClass2_Sub1_Sub4_Sub1Array8[0].method461(arg3 + Static112.anInt2513 - 12, Static84.anInt1814 + -28 + arg1);
						}
					}
				} else {
					local78 = 30;
					@Pc(81) Class2_Sub1_Sub1_Sub4_Sub1 local81 = (Class2_Sub1_Sub1_Sub4_Sub1) local21;
					if (local81.anInt1027 != -1 || local81.anInt1020 != -1) {
						Static88.method1441(local21.anInt1942 + 15, local21);
						if (Static112.anInt2513 > -1) {
							if (local81.anInt1027 != -1) {
								Static40.aClass2_Sub1_Sub4_Sub1Array5[local81.anInt1027].method461(arg3 + Static112.anInt2513 - 12, Static84.anInt1814 + -30 + arg1);
								local78 += 25;
							}
							if (local81.anInt1020 != -1) {
								Static17.aClass2_Sub1_Sub4_Sub1Array3[local81.anInt1020].method461(Static112.anInt2513 + arg3 - 12, arg1 - -Static84.anInt1814 - local78);
								local78 += 25;
							}
						}
					}
					if (local14 >= 0 && Static26.anInt631 == 10 && Static76.anIntArray223[local14] == Static16.anInt2224) {
						Static88.method1441(local21.anInt1942 + 15, local21);
						if (Static112.anInt2513 > -1) {
							Static84.aClass2_Sub1_Sub4_Sub1Array8[1].method461(Static112.anInt2513 + arg3 - 12, -local78 + Static84.anInt1814 + arg1);
						}
					}
				}
				if (local21.aClass65_838 != null && (Static35.anInt795 <= local14 || Static42.anInt1050 == 0 || Static42.anInt1050 == 3 || Static42.anInt1050 == 1 && Static32.method622(((Class2_Sub1_Sub1_Sub4_Sub1) local21).aClass65_457))) {
					Static88.method1441(local21.anInt1942, local21);
					if (Static112.anInt2513 > -1 && Static75.anInt2329 > Static17.anInt389) {
						Static75.anIntArray304[Static17.anInt389] = Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2087(local21.aClass65_838) / 2;
						Static75.anIntArray303[Static17.anInt389] = Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.anInt2975;
						Static75.anIntArray305[Static17.anInt389] = Static112.anInt2513;
						Static75.anIntArray308[Static17.anInt389] = Static84.anInt1814;
						Static75.anIntArray301[Static17.anInt389] = local21.anInt1967;
						Static75.anIntArray306[Static17.anInt389] = local21.anInt1950;
						Static75.anIntArray302[Static17.anInt389] = local21.anInt1955;
						Static75.aClass65Array58[Static17.anInt389] = local21.aClass65_838;
						Static17.anInt389++;
					}
				}
				if (local21.anInt1951 > Static10.anInt2951) {
					Static88.method1441(local21.anInt1942 + 15, local21);
					if (Static112.anInt2513 > -1) {
						local78 = local21.anInt1940 * 30 / local21.anInt1968;
						if (local78 > 30) {
							local78 = 30;
						}
						Static118.method2081(arg3 + Static112.anInt2513 - 15, arg1 + -3 - -Static84.anInt1814, local78, 5, 65280);
						Static118.method2081(local78 + Static112.anInt2513 + arg3 - 15, Static84.anInt1814 + arg1 - 3, 30 - local78, 5, 16711680);
					}
				}
				for (local78 = 0; local78 < 4; local78++) {
					if (Static10.anInt2951 < local21.anIntArray262[local78]) {
						Static88.method1441(local21.anInt1942 / 2, local21);
						if (Static112.anInt2513 > -1) {
							if (local78 == 1) {
								Static84.anInt1814 -= 20;
							}
							if (local78 == 2) {
								Static84.anInt1814 -= 10;
								Static112.anInt2513 -= 15;
							}
							if (local78 == 3) {
								Static84.anInt1814 -= 10;
								Static112.anInt2513 += 15;
							}
							Static46.aClass2_Sub1_Sub4_Sub1Array6[local21.anIntArray261[local78]].method461(Static112.anInt2513 + arg3 - 12, arg1 - (-Static84.anInt1814 - -12));
							Static107.aClass2_Sub1_Sub4_Sub3_Sub1_3.method2086(Static120.method1871(local21.anIntArray260[local78]), arg3 + Static112.anInt2513 - 1, arg1 - -Static84.anInt1814 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(537) int local537 = 0; local537 < Static17.anInt389; local537++) {
			@Pc(543) int local543 = Static75.anIntArray308[local537];
			@Pc(547) int local547 = Static75.anIntArray304[local537];
			local78 = Static75.anIntArray305[local537];
			@Pc(555) int local555 = Static75.anIntArray303[local537];
			@Pc(557) boolean local557 = true;
			while (local557) {
				local557 = false;
				for (@Pc(563) int local563 = 0; local563 < local537; local563++) {
					if (local543 + 2 > Static75.anIntArray308[local563] + -Static75.anIntArray303[local563] && local543 - local555 < Static75.anIntArray308[local563] - -2 && local78 - local547 < Static75.anIntArray305[local563] + Static75.anIntArray304[local563] && Static75.anIntArray305[local563] - Static75.anIntArray304[local563] < local78 + local547 && local543 > Static75.anIntArray308[local563] - Static75.anIntArray303[local563]) {
						local543 = Static75.anIntArray308[local563] - Static75.anIntArray303[local563];
						local557 = true;
					}
				}
			}
			Static112.anInt2513 = Static75.anIntArray305[local537];
			Static84.anInt1814 = Static75.anIntArray308[local537] = local543;
			@Pc(666) Class65 local666 = Static75.aClass65Array58[local537];
			if (Static72.anInt1645 == 0) {
				@Pc(683) int local683 = 16776960;
				if (Static75.anIntArray301[local537] < 6) {
					local683 = Static44.anIntArray125[Static75.anIntArray301[local537]];
				}
				if (Static75.anIntArray301[local537] == 6) {
					local683 = Static77.anInt1714 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static75.anIntArray301[local537] == 7) {
					local683 = Static77.anInt1714 % 20 >= 10 ? 65535 : 255;
				}
				if (Static75.anIntArray301[local537] == 8) {
					local683 = Static77.anInt1714 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(756) int local756;
				if (Static75.anIntArray301[local537] == 9) {
					local756 = 150 - Static75.anIntArray302[local537];
					if (local756 < 50) {
						local683 = local756 * 1280 + 16711680;
					} else if (local756 < 100) {
						local683 = 33160960 - local756 * 327680;
					} else if (local756 < 150) {
						local683 = local756 * 5 + 65280 - 500;
					}
				}
				if (Static75.anIntArray301[local537] == 10) {
					local756 = 150 - Static75.anIntArray302[local537];
					if (local756 < 50) {
						local683 = local756 * 5 + 16711680;
					} else if (local756 < 100) {
						local683 = 16711935 - (local756 - 50) * 327680;
					} else if (local756 < 150) {
						local683 = local756 * 327680 - (local756 - 100) * 5 - 32767745;
					}
				}
				if (Static75.anIntArray301[local537] == 11) {
					local756 = 150 - Static75.anIntArray302[local537];
					if (local756 < 50) {
						local683 = 16777215 - local756 * 327685;
					} else if (local756 < 100) {
						local683 = (local756 - 50) * 327685 + 65280;
					} else if (local756 < 150) {
						local683 = 16777215 - (local756 - 100) * 327680;
					}
				}
				if (Static75.anIntArray306[local537] == 0) {
					Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2086(local666, Static112.anInt2513 + arg3, Static84.anInt1814 + arg1, local683, 0);
				}
				if (Static75.anIntArray306[local537] == 1) {
					Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2103(local666, arg3 + Static112.anInt2513, Static84.anInt1814 + arg1, local683, Static77.anInt1714);
				}
				if (Static75.anIntArray306[local537] == 2) {
					Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2085(local666, Static112.anInt2513 + arg3, Static84.anInt1814 + arg1, local683, Static77.anInt1714);
				}
				if (Static75.anIntArray306[local537] == 3) {
					Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2083(local666, Static112.anInt2513 + arg3, Static84.anInt1814 + arg1, local683, Static77.anInt1714, 150 - Static75.anIntArray302[local537]);
				}
				if (Static75.anIntArray306[local537] == 4) {
					local756 = (150 - Static75.anIntArray302[local537]) * (Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2087(local666) + 100) / 150;
					Static118.method2069(arg3 + Static112.anInt2513 - 50, arg1, Static112.anInt2513 + arg3 + 50, arg2 + arg1);
					Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2099(local666, Static112.anInt2513 + arg3 + 50 - local756, arg1 - -Static84.anInt1814, local683, 0);
					Static118.method2073(arg3, arg1, arg3 + arg0, arg1 - -arg2);
				}
				if (Static75.anIntArray306[local537] == 5) {
					local756 = 150 - Static75.anIntArray302[local537];
					Static118.method2069(arg3, Static84.anInt1814 + arg1 - Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.anInt2975 - 1, arg0 + arg3, arg1 + Static84.anInt1814 + 5);
					@Pc(1073) int local1073 = 0;
					if (local756 < 25) {
						local1073 = local756 - 25;
					} else if (local756 > 125) {
						local1073 = local756 - 125;
					}
					Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2086(local666, Static112.anInt2513 + arg3, arg1 + Static84.anInt1814 + local1073, local683, 0);
					Static118.method2073(arg3, arg1, arg0 + arg3, arg1 - -arg2);
				}
			} else {
				Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2086(local666, Static112.anInt2513 + arg3, Static84.anInt1814 + arg1, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!na;Lclient!na;ZZ)V")
	public static void method1615(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) boolean arg2) {
		Static13.aClass56_36 = arg0;
		Static119.aClass56_28 = arg1;
		Static105.aBoolean98 = arg2;
	}
}
