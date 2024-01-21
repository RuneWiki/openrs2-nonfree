import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_7;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!pa;")
	public static Class51 aClass51_56;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Lclient!c;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_3;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1186 = Static2.method66("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WMissbrauch melden(W Option benutzen");

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1187 = Static2.method66("Your profile will be transferred in:");

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	public static int anInt2646 = 0;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!rc;")
	public static Class57 aClass57_6 = new Class57(4096);

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1188 = aClass39_1187;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static int anInt2648 = 1;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1189 = Static2.method66("Connecting to update server");

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1190 = Static2.method66(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!td", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1191 = aClass39_1189;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public static void method1854() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(66) int local66;
		@Pc(76) int local76;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(118) int local118;
		if (Static95.anInt2513 == 171) {
			local12 = Static51.aClass2_Sub5_Sub1_4.method1247();
			local16 = Static51.aClass2_Sub5_Sub1_4.method1289();
			local24 = (local16 >> 4 & 0x7) + Static76.anInt2104;
			local30 = (local16 & 0x7) + Static107.anInt2656;
			local34 = Static51.aClass2_Sub5_Sub1_4.method1293();
			local38 = local34 >> 2;
			local42 = local34 & 0x3;
			local46 = Static89.anIntArray302[local38];
			if (local24 >= 0 && local30 >= 0 && local24 < 103 && local30 < 103) {
				local66 = Static22.anIntArrayArrayArray3[Static18.anInt560][local24][local30];
				local76 = Static22.anIntArrayArrayArray3[Static18.anInt560][local24 + 1][local30];
				local88 = Static22.anIntArrayArrayArray3[Static18.anInt560][local24 + 1][local30 + 1];
				local98 = Static22.anIntArrayArrayArray3[Static18.anInt560][local24][local30 + 1];
				if (local46 == 0) {
					@Pc(109) Class18 local109 = Static77.aClass43_1.method1185(Static18.anInt560, local24, local30);
					if (local109 != null) {
						local118 = local109.anInt665 >> 14 & 0x7FFF;
						if (local38 == 2) {
							local109.aClass2_Sub1_Sub2_2 = new Class2_Sub1_Sub2_Sub6(local118, 2, local42 + 4, local66, local76, local88, local98, local12, false);
							local109.aClass2_Sub1_Sub2_3 = new Class2_Sub1_Sub2_Sub6(local118, 2, local42 + 1 & 0x3, local66, local76, local88, local98, local12, false);
						} else {
							local109.aClass2_Sub1_Sub2_2 = new Class2_Sub1_Sub2_Sub6(local118, local38, local42, local66, local76, local88, local98, local12, false);
						}
					}
				}
				if (local46 == 1) {
					@Pc(182) Class22 local182 = Static77.aClass43_1.method1183(Static18.anInt560, local24, local30);
					if (local182 != null) {
						local182.aClass2_Sub1_Sub2_5 = new Class2_Sub1_Sub2_Sub6(local182.anInt839 >> 14 & 0x7FFF, 4, 0, local66, local76, local88, local98, local12, false);
					}
				}
				if (local46 == 2) {
					@Pc(214) Class16 local214 = Static77.aClass43_1.method1215(Static18.anInt560, local24, local30);
					if (local38 == 11) {
						local38 = 10;
					}
					if (local214 != null) {
						local214.aClass2_Sub1_Sub2_1 = new Class2_Sub1_Sub2_Sub6(local214.anInt613 >> 14 & 0x7FFF, local38, local42, local66, local76, local88, local98, local12, false);
					}
				}
				if (local46 == 3) {
					@Pc(251) Class20 local251 = Static77.aClass43_1.method1177(Static18.anInt560, local24, local30);
					if (local251 != null) {
						local251.aClass2_Sub1_Sub2_4 = new Class2_Sub1_Sub2_Sub6(local251.anInt808 >> 14 & 0x7FFF, 22, local42, local66, local76, local88, local98, local12, false);
					}
				}
			}
		} else if (Static95.anInt2513 == 210) {
			local12 = Static51.aClass2_Sub5_Sub1_4.method1281();
			local16 = local12 >> 2;
			local24 = local12 & 0x3;
			local30 = Static89.anIntArray302[local16];
			local34 = Static51.aClass2_Sub5_Sub1_4.method1281();
			local42 = (local34 & 0x7) + Static107.anInt2656;
			local38 = (local34 >> 4 & 0x7) + Static76.anInt2104;
			if (local38 >= 0 && local42 >= 0 && local38 < 104 && local42 < 104) {
				Static4.method78(local42, local24, local38, 0, -1, local16, Static18.anInt560, -1, local30);
			}
		} else if (Static95.anInt2513 == 37) {
			local12 = Static51.aClass2_Sub5_Sub1_4.method1289();
			local16 = local12 >> 2;
			local30 = Static89.anIntArray302[local16];
			local34 = Static51.aClass2_Sub5_Sub1_4.method1293();
			local24 = local12 & 0x3;
			local38 = (local34 >> 4 & 0x7) + Static76.anInt2104;
			local42 = (local34 & 0x7) + Static107.anInt2656;
			local46 = Static51.aClass2_Sub5_Sub1_4.method1273();
			if (local38 >= 0 && local42 >= 0 && local38 < 104 && local42 < 104) {
				Static4.method78(local42, local24, local38, 0, local46, local16, Static18.anInt560, -1, local30);
			}
		} else {
			@Pc(470) Class2_Sub1_Sub2_Sub5 local470;
			if (Static95.anInt2513 == 85) {
				local12 = Static51.aClass2_Sub5_Sub1_4.method1247();
				local16 = Static51.aClass2_Sub5_Sub1_4.method1264();
				local30 = (local16 & 0x7) + Static107.anInt2656;
				local24 = Static76.anInt2104 + (local16 >> 4 & 0x7);
				local34 = Static51.aClass2_Sub5_Sub1_4.method1271();
				if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104) {
					local470 = new Class2_Sub1_Sub2_Sub5();
					local470.anInt2154 = local34;
					local470.anInt2151 = local12;
					if (Static55.aClass34ArrayArrayArray1[Static18.anInt560][local24][local30] == null) {
						Static55.aClass34ArrayArrayArray1[Static18.anInt560][local24][local30] = new Class34();
					}
					Static55.aClass34ArrayArrayArray1[Static18.anInt560][local24][local30].method876(local470);
					Static84.method2052(local30, local24);
				}
			} else if (Static95.anInt2513 == 60) {
				local12 = Static51.aClass2_Sub5_Sub1_4.method1247();
				local16 = Static51.aClass2_Sub5_Sub1_4.method1293();
				local24 = (local16 >> 4 & 0x7) + Static76.anInt2104;
				local30 = (local16 & 0x7) + Static107.anInt2656;
				if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104) {
					@Pc(557) Class34 local557 = Static55.aClass34ArrayArrayArray1[Static18.anInt560][local24][local30];
					if (local557 != null) {
						for (local470 = (Class2_Sub1_Sub2_Sub5) local557.method872(); local470 != null; local470 = (Class2_Sub1_Sub2_Sub5) local557.method879()) {
							if ((local12 & 0x7FFF) == local470.anInt2154) {
								local470.method2045();
								break;
							}
						}
						if (local557.method872() == null) {
							Static55.aClass34ArrayArrayArray1[Static18.anInt560][local24][local30] = null;
						}
						Static84.method2052(local30, local24);
					}
				}
			} else if (Static95.anInt2513 == 200) {
				local12 = Static51.aClass2_Sub5_Sub1_4.method1247();
				local16 = Static51.aClass2_Sub5_Sub1_4.method1281();
				local24 = Static76.anInt2104 + (local16 >> 4 & 0x7);
				local30 = (local16 & 0x7) + Static107.anInt2656;
				local34 = Static51.aClass2_Sub5_Sub1_4.method1261();
				local38 = Static51.aClass2_Sub5_Sub1_4.method1261();
				if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104 && Static82.anInt2217 != local34) {
					@Pc(657) Class2_Sub1_Sub2_Sub5 local657 = new Class2_Sub1_Sub2_Sub5();
					local657.anInt2151 = local12;
					local657.anInt2154 = local38;
					if (Static55.aClass34ArrayArrayArray1[Static18.anInt560][local24][local30] == null) {
						Static55.aClass34ArrayArrayArray1[Static18.anInt560][local24][local30] = new Class34();
					}
					Static55.aClass34ArrayArrayArray1[Static18.anInt560][local24][local30].method876(local657);
					Static84.method2052(local30, local24);
				}
			} else if (Static95.anInt2513 == 51) {
				local12 = Static51.aClass2_Sub5_Sub1_4.method1281();
				local24 = (local12 & 0x7) + Static107.anInt2656;
				local16 = (local12 >> 4 & 0x7) + Static76.anInt2104;
				local30 = Static51.aClass2_Sub5_Sub1_4.method1273();
				local34 = Static51.aClass2_Sub5_Sub1_4.method1281();
				local38 = Static51.aClass2_Sub5_Sub1_4.method1273();
				if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104) {
					local24 = local24 * 128 + 64;
					local16 = local16 * 128 + 64;
					@Pc(775) Class2_Sub1_Sub2_Sub4 local775 = new Class2_Sub1_Sub2_Sub4(local30, Static18.anInt560, local16, local24, Static51.method1779(local24, local16, Static18.anInt560) - local34, local38, Static64.anInt1889);
					Static90.aClass34_46.method876(local775);
				}
			} else {
				if (Static95.anInt2513 == 83) {
					local12 = Static51.aClass2_Sub5_Sub1_4.method1281();
					local24 = Static107.anInt2656 + (local12 & 0x7);
					local16 = Static76.anInt2104 + (local12 >> 4 & 0x7);
					local30 = Static51.aClass2_Sub5_Sub1_4.method1273();
					local34 = Static51.aClass2_Sub5_Sub1_4.method1281();
					local38 = local34 >> 4 & 0xF;
					local42 = local34 & 0x7;
					local46 = Static51.aClass2_Sub5_Sub1_4.method1281();
					if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104) {
						local66 = local38 + 1;
						if (local16 - local66 <= Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0] && local16 + local66 >= Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0] && Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0] >= local24 - local66 && local66 + local24 >= Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0] && Static25.anInt723 != 0 && local42 > 0 && Static1.anInt1 < 50) {
							Static54.anIntArray210[Static1.anInt1] = local30;
							Static23.anIntArray70[Static1.anInt1] = local42;
							Static8.anIntArray26[Static1.anInt1] = local46;
							Static66.aClass56Array1[Static1.anInt1] = null;
							Static79.anIntArray335[Static1.anInt1] = (local16 << 16) - (-(local24 << 8) - local38);
							Static1.anInt1++;
						}
					}
				}
				@Pc(979) int local979;
				if (Static95.anInt2513 == 187) {
					@Pc(931) byte local931 = Static51.aClass2_Sub5_Sub1_4.method1278();
					@Pc(935) byte local935 = Static51.aClass2_Sub5_Sub1_4.method1256();
					local24 = Static51.aClass2_Sub5_Sub1_4.method1273();
					local30 = Static51.aClass2_Sub5_Sub1_4.method1273();
					@Pc(947) byte local947 = Static51.aClass2_Sub5_Sub1_4.method1278();
					@Pc(951) byte local951 = Static51.aClass2_Sub5_Sub1_4.method1256();
					local42 = Static51.aClass2_Sub5_Sub1_4.method1264();
					local46 = local42 >> 2;
					local66 = local42 & 0x3;
					local76 = Static89.anIntArray302[local46];
					local88 = Static51.aClass2_Sub5_Sub1_4.method1271();
					local98 = Static51.aClass2_Sub5_Sub1_4.method1271();
					local979 = Static51.aClass2_Sub5_Sub1_4.method1264();
					local118 = Static76.anInt2104 + (local979 >> 4 & 0x7);
					@Pc(995) int local995 = Static107.anInt2656 + (local979 & 0x7);
					@Pc(1004) Class2_Sub1_Sub2_Sub3_Sub1 local1004;
					if (local98 == Static82.anInt2217) {
						local1004 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1;
					} else {
						local1004 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local98];
					}
					if (local1004 != null) {
						@Pc(1016) Class2_Sub1_Sub5 local1016 = Static48.method916(local24);
						@Pc(1024) int local1024 = Static22.anIntArrayArrayArray3[Static18.anInt560][local118][local995];
						@Pc(1034) int local1034 = Static22.anIntArrayArrayArray3[Static18.anInt560][local118 + 1][local995];
						@Pc(1046) int local1046 = Static22.anIntArrayArrayArray3[Static18.anInt560][local118 + 1][local995 + 1];
						@Pc(1056) int local1056 = Static22.anIntArrayArrayArray3[Static18.anInt560][local118][local995 + 1];
						@Pc(1066) Class2_Sub1_Sub2_Sub2 local1066 = local1016.method415(local66, local1056, local1034, local46, local1024, local1046);
						if (local1066 != null) {
							@Pc(1073) byte local1073;
							if (local935 > local931) {
								local1073 = local935;
								local935 = local931;
								local931 = local1073;
							}
							if (local947 < local951) {
								local1073 = local951;
								local951 = local947;
								local947 = local1073;
							}
							Static4.method78(local995, 0, local118, local88 + 1, -1, 0, Static18.anInt560, local30 + 1, local76);
							local1004.aClass2_Sub1_Sub2_Sub2_3 = local1066;
							@Pc(1111) int local1111 = local1016.anInt537;
							@Pc(1114) int local1114 = local1016.anInt528;
							local1004.anInt2630 = local88 + Static64.anInt1889;
							if (local66 == 1 || local66 == 3) {
								local1111 = local1016.anInt528;
								local1114 = local1016.anInt537;
							}
							local1004.anInt2619 = local118 * 128 + local1114 * 64;
							local1004.anInt2627 = local995 * 128 + local1111 * 64;
							local1004.anInt2618 = local30 + Static64.anInt1889;
							local1004.anInt2615 = Static51.method1779(local1004.anInt2627, local1004.anInt2619, Static18.anInt560);
							local1004.anInt2620 = local931 + local118;
							local1004.anInt2621 = local935 + local118;
							local1004.anInt2617 = local947 + local995;
							local1004.anInt2635 = local951 + local995;
						}
					}
				}
				if (Static95.anInt2513 == 80) {
					local12 = Static51.aClass2_Sub5_Sub1_4.method1281();
					local24 = Static107.anInt2656 + (local12 & 0x7);
					local16 = Static76.anInt2104 + (local12 >> 4 & 0x7);
					local30 = Static51.aClass2_Sub5_Sub1_4.method1273();
					local34 = Static51.aClass2_Sub5_Sub1_4.method1273();
					local38 = Static51.aClass2_Sub5_Sub1_4.method1273();
					if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104) {
						@Pc(1246) Class34 local1246 = Static55.aClass34ArrayArrayArray1[Static18.anInt560][local16][local24];
						if (local1246 != null) {
							for (@Pc(1253) Class2_Sub1_Sub2_Sub5 local1253 = (Class2_Sub1_Sub2_Sub5) local1246.method872(); local1253 != null; local1253 = (Class2_Sub1_Sub2_Sub5) local1246.method879()) {
								if (local1253.anInt2154 == (local30 & 0x7FFF) && local1253.anInt2151 == local34) {
									local1253.anInt2151 = local38;
									break;
								}
							}
							Static84.method2052(local24, local16);
						}
					}
				} else if (Static95.anInt2513 == 249) {
					local12 = Static51.aClass2_Sub5_Sub1_4.method1281();
					local16 = (local12 >> 4 & 0x7) + Static76.anInt2104;
					local24 = Static107.anInt2656 + (local12 & 0x7);
					local30 = local16 + Static51.aClass2_Sub5_Sub1_4.method1254();
					local34 = Static51.aClass2_Sub5_Sub1_4.method1254() + local24;
					local38 = Static51.aClass2_Sub5_Sub1_4.method1269();
					local42 = Static51.aClass2_Sub5_Sub1_4.method1273();
					local46 = Static51.aClass2_Sub5_Sub1_4.method1281() * 4;
					local66 = Static51.aClass2_Sub5_Sub1_4.method1281() * 4;
					local76 = Static51.aClass2_Sub5_Sub1_4.method1273();
					local88 = Static51.aClass2_Sub5_Sub1_4.method1273();
					local98 = Static51.aClass2_Sub5_Sub1_4.method1281();
					local979 = Static51.aClass2_Sub5_Sub1_4.method1281();
					if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104 && local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104 && local42 != 65535) {
						local24 = local24 * 128 + 64;
						local16 = local16 * 128 + 64;
						local30 = local30 * 128 + 64;
						@Pc(1427) Class2_Sub1_Sub2_Sub1 local1427 = new Class2_Sub1_Sub2_Sub1(local42, Static18.anInt560, local16, local24, Static51.method1779(local24, local16, Static18.anInt560) - local46, Static64.anInt1889 + local76, local88 + Static64.anInt1889, local98, local979, local38, local66);
						local34 = local34 * 128 + 64;
						local1427.method549(local34, Static64.anInt1889 + local76, local30, Static51.method1779(local34, local30, Static18.anInt560) - local66);
						Static15.aClass34_55.method876(local1427);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1855() {
		for (@Pc(12) Class2_Sub1_Sub2_Sub1 local12 = (Class2_Sub1_Sub2_Sub1) Static15.aClass34_55.method872(); local12 != null; local12 = (Class2_Sub1_Sub2_Sub1) Static15.aClass34_55.method879()) {
			if (local12.anInt781 != Static18.anInt560 || Static64.anInt1889 > local12.anInt792) {
				local12.method2045();
			} else if (Static64.anInt1889 >= local12.anInt788) {
				if (local12.anInt794 > 0) {
					@Pc(58) Class2_Sub1_Sub2_Sub3_Sub2 local58 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local12.anInt794 - 1];
					if (local58 != null && local58.anInt2896 >= 0 && local58.anInt2896 < 13312 && local58.anInt2899 >= 0 && local58.anInt2899 < 13312) {
						local12.method549(local58.anInt2899, Static64.anInt1889, local58.anInt2896, Static51.method1779(local58.anInt2899, local58.anInt2896, local12.anInt781) - local12.anInt785);
					}
				}
				if (local12.anInt794 < 0) {
					@Pc(111) int local111 = -local12.anInt794 - 1;
					@Pc(122) Class2_Sub1_Sub2_Sub3_Sub1 local122;
					if (Static82.anInt2217 == local111) {
						local122 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1;
					} else {
						local122 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local111];
					}
					if (local122 != null && local122.anInt2896 >= 0 && local122.anInt2896 < 13312 && local122.anInt2899 >= 0 && local122.anInt2899 < 13312) {
						local12.method549(local122.anInt2899, Static64.anInt1889, local122.anInt2896, Static51.method1779(local122.anInt2899, local122.anInt2896, local12.anInt781) - local12.anInt785);
					}
				}
				local12.method550(Static17.anInt489);
				Static77.aClass43_1.method1180(Static18.anInt560, (int) local12.aDouble8, (int) local12.aDouble7, (int) local12.aDouble4, 60, local12, local12.anInt784, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static void method1856(@OriginalArg(1) int arg0) {
		if (!Static23.method442(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub1_Sub6[] local14 = Static76.aClass2_Sub1_Sub6ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class2_Sub1_Sub6 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt702 = 0;
				local22.anInt689 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1857() {
		aClass51_56 = null;
		aClass39_1188 = null;
		aClass39_1186 = null;
		aClass39_1187 = null;
		aClass2_Sub1_Sub4_Sub1_3 = null;
		aClass39_1189 = null;
		aClass39_1190 = null;
		aClass39_1191 = null;
		aClass2_Sub1_Sub4_Sub2_7 = null;
		aClass57_6 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!da;IIII)V")
	public static void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) Class2_Sub10 local3 = new Class2_Sub10();
		local3.anInt2055 = arg1.anInt546;
		local3.anInt2060 = arg3;
		local3.anInt2074 = arg4 * 128;
		local3.anIntArray258 = arg1.anIntArray57;
		local3.anInt2056 = arg0 * 128;
		@Pc(35) int local35 = arg1.anInt537;
		local3.anInt2059 = arg1.anInt532;
		@Pc(42) int local42 = arg1.anInt528;
		local3.anInt2057 = arg1.anInt548;
		local3.anInt2053 = arg1.anInt549 * 128;
		if (arg2 == 1 || arg2 == 3) {
			local42 = arg1.anInt537;
			local35 = arg1.anInt528;
		}
		local3.anInt2071 = (arg4 + local35) * 128;
		local3.anInt2064 = (local42 + arg0) * 128;
		if (arg1.anIntArray61 != null) {
			local3.aClass2_Sub1_Sub5_1 = arg1;
			local3.method1490();
		}
		Static12.aClass34_9.method876(local3);
		if (local3.anIntArray258 != null) {
			local3.anInt2069 = (int) ((double) (local3.anInt2055 - local3.anInt2057) * Math.random()) + local3.anInt2057;
		}
	}
}
