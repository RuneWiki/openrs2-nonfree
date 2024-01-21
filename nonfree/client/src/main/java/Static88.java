import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "Lclient!bc;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_21;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!a;")
	public static Class1 aClass1_2429 = Static94.method1596("@whi@ )4 ");

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_2430 = Static94.method1596(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!cb;")
	public static Class11 aClass11_21 = new Class11(64);

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!a;")
	private static Class1 aClass1_2432 = Static94.method1596("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_2431 = aClass1_2432;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
	public static int anInt2314 = 0;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!a;")
	private static Class1 aClass1_2434 = Static94.method1596("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_2433 = aClass1_2434;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "Lclient!a;")
	public static Class1 aClass1_2435 = Static94.method1596("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Lclient!cb;")
	public static Class11 aClass11_22 = new Class11(50);

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "Lclient!a;")
	public static Class1 aClass1_2436 = Static94.method1596("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_2437 = Static94.method1596("backright2");

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_2438 = Static94.method1596("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1561() {
		@Pc(14) int local14;
		@Pc(28) int local28;
		@Pc(20) int local20;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(73) int local73;
		@Pc(83) int local83;
		@Pc(95) int local95;
		@Pc(105) int local105;
		@Pc(122) int local122;
		if (Static93.anInt2359 == 49) {
			local14 = Static13.aClass2_Sub3_Sub1_1.method799();
			local20 = Static29.anInt1085 + (local14 & 0x7);
			local28 = (local14 >> 4 & 0x7) + Static50.anInt1643;
			local32 = Static13.aClass2_Sub3_Sub1_1.method799();
			local36 = local32 >> 2;
			local40 = local32 & 0x3;
			local44 = Static109.anIntArray346[local36];
			local48 = Static13.aClass2_Sub3_Sub1_1.method827();
			if (local28 >= 0 && local20 >= 0 && local28 < 103 && local20 < 103) {
				local73 = Static50.anIntArrayArrayArray7[Static2.anInt287][local28][local20];
				local83 = Static50.anIntArrayArrayArray7[Static2.anInt287][local28 + 1][local20];
				local95 = Static50.anIntArrayArrayArray7[Static2.anInt287][local28 + 1][local20 + 1];
				local105 = Static50.anIntArrayArrayArray7[Static2.anInt287][local28][local20 + 1];
				if (local44 == 0) {
					@Pc(113) Class12 local113 = Static109.aClass3_1.method158(Static2.anInt287, local28, local20);
					if (local113 != null) {
						local122 = local113.anInt686 >> 14 & 0x7FFF;
						if (local36 == 2) {
							local113.aClass2_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub3(local122, 2, local40 + 4, local73, local83, local95, local105, local48, false);
							local113.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub3(local122, 2, local40 + 1 & 0x3, local73, local83, local95, local105, local48, false);
						} else {
							local113.aClass2_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub3(local122, local36, local40, local73, local83, local95, local105, local48, false);
						}
					}
				}
				if (local44 == 1) {
					@Pc(188) Class54 local188 = Static109.aClass3_1.method132(Static2.anInt287, local28, local20);
					if (local188 != null) {
						local188.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub3(local188.anInt2317 >> 14 & 0x7FFF, 4, 0, local73, local83, local95, local105, local48, false);
					}
				}
				if (local44 == 2) {
					@Pc(220) Class22 local220 = Static109.aClass3_1.method139(Static2.anInt287, local28, local20);
					if (local36 == 11) {
						local36 = 10;
					}
					if (local220 != null) {
						local220.aClass2_Sub1_Sub1_3 = new Class2_Sub1_Sub1_Sub3(local220.anInt1226 >> 14 & 0x7FFF, local36, local40, local73, local83, local95, local105, local48, false);
					}
				}
				if (local44 == 3) {
					@Pc(255) Class27 local255 = Static109.aClass3_1.method165(Static2.anInt287, local28, local20);
					if (local255 != null) {
						local255.aClass2_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub3(local255.anInt1545 >> 14 & 0x7FFF, 22, local40, local73, local83, local95, local105, local48, false);
					}
				}
			}
		} else if (Static93.anInt2359 == 241) {
			local14 = Static13.aClass2_Sub3_Sub1_1.method794();
			local20 = local14 & 0x3;
			local28 = local14 >> 2;
			local32 = Static109.anIntArray346[local28];
			local36 = Static13.aClass2_Sub3_Sub1_1.method792();
			local40 = Static13.aClass2_Sub3_Sub1_1.method799();
			local48 = (local40 & 0x7) + Static29.anInt1085;
			local44 = Static50.anInt1643 + (local40 >> 4 & 0x7);
			if (local44 >= 0 && local48 >= 0 && local44 < 104 && local48 < 104) {
				Static44.method1016(local36, local44, local20, -1, Static2.anInt287, local48, local32, local28, 0);
			}
		} else {
			if (Static93.anInt2359 == 9) {
				local14 = Static13.aClass2_Sub3_Sub1_1.method791();
				local20 = (local14 & 0x7) + Static29.anInt1085;
				local28 = (local14 >> 4 & 0x7) + Static50.anInt1643;
				local32 = Static13.aClass2_Sub3_Sub1_1.method792();
				local36 = Static13.aClass2_Sub3_Sub1_1.method791();
				local40 = local36 >> 4 & 0xF;
				local44 = local36 & 0x7;
				local48 = Static13.aClass2_Sub3_Sub1_1.method791();
				if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
					local73 = local40 + 1;
					if (local28 - local73 <= Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0] && local28 + local73 >= Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0] && local20 - local73 <= Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0] && local20 + local73 >= Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0] && Static53.anInt1756 != 0 && local44 > 0 && Static31.anInt1216 < 50) {
						Static79.anIntArray271[Static31.anInt1216] = local32;
						Static96.anIntArray301[Static31.anInt1216] = local44;
						Static20.anIntArray90[Static31.anInt1216] = local48;
						Static31.aClass39Array1[Static31.anInt1216] = null;
						Static52.anIntArray179[Static31.anInt1216] = local40 + (local20 << 8) + (local28 << 16);
						Static31.anInt1216++;
					}
				}
			}
			if (Static93.anInt2359 == 202) {
				local14 = Static13.aClass2_Sub3_Sub1_1.method791();
				local28 = (local14 >> 4 & 0x7) + Static50.anInt1643;
				local20 = Static29.anInt1085 + (local14 & 0x7);
				local32 = Static13.aClass2_Sub3_Sub1_1.method792();
				local36 = Static13.aClass2_Sub3_Sub1_1.method791();
				local40 = Static13.aClass2_Sub3_Sub1_1.method792();
				if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
					local20 = local20 * 128 + 64;
					local28 = local28 * 128 + 64;
					@Pc(569) Class2_Sub1_Sub1_Sub6 local569 = new Class2_Sub1_Sub1_Sub6(local32, Static2.anInt287, local28, local20, Static65.method1338(Static2.anInt287, local28, local20) - local36, local40, Static69.anInt2806);
					Static93.aClass46_10.method1437(local569);
				}
			} else if (Static93.anInt2359 == 99) {
				local14 = Static13.aClass2_Sub3_Sub1_1.method791();
				local28 = Static50.anInt1643 + (local14 >> 4 & 0x7);
				local20 = (local14 & 0x7) + Static29.anInt1085;
				local32 = Static13.aClass2_Sub3_Sub1_1.method792();
				local36 = Static13.aClass2_Sub3_Sub1_1.method792();
				local40 = Static13.aClass2_Sub3_Sub1_1.method792();
				if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
					@Pc(631) Class46 local631 = Static15.aClass46ArrayArrayArray1[Static2.anInt287][local28][local20];
					if (local631 != null) {
						for (@Pc(638) Class2_Sub1_Sub1_Sub4 local638 = (Class2_Sub1_Sub1_Sub4) local631.method1435(); local638 != null; local638 = (Class2_Sub1_Sub1_Sub4) local631.method1442()) {
							if (local638.anInt1708 == (local32 & 0x7FFF) && local36 == local638.anInt1702) {
								local638.anInt1702 = local40;
								break;
							}
						}
						Static106.method1756(local20, local28);
					}
				}
			} else if (Static93.anInt2359 == 143) {
				local14 = Static13.aClass2_Sub3_Sub1_1.method799();
				local20 = Static29.anInt1085 + (local14 & 0x7);
				local28 = Static50.anInt1643 + (local14 >> 4 & 0x7);
				local32 = Static13.aClass2_Sub3_Sub1_1.method794();
				local40 = local32 & 0x3;
				local36 = local32 >> 2;
				local44 = Static109.anIntArray346[local36];
				if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
					Static44.method1016(-1, local28, local40, -1, Static2.anInt287, local20, local44, local36, 0);
				}
			} else {
				if (Static93.anInt2359 == 229) {
					@Pc(745) byte local745 = Static13.aClass2_Sub3_Sub1_1.method818();
					local28 = Static13.aClass2_Sub3_Sub1_1.method784();
					@Pc(753) byte local753 = Static13.aClass2_Sub3_Sub1_1.method831();
					@Pc(757) byte local757 = Static13.aClass2_Sub3_Sub1_1.method831();
					local36 = Static13.aClass2_Sub3_Sub1_1.method799();
					local44 = local36 & 0x3;
					local40 = local36 >> 2;
					local48 = Static109.anIntArray346[local40];
					local73 = Static13.aClass2_Sub3_Sub1_1.method803();
					local95 = (local73 & 0x7) + Static29.anInt1085;
					local83 = Static50.anInt1643 + (local73 >> 4 & 0x7);
					local105 = Static13.aClass2_Sub3_Sub1_1.method792();
					@Pc(800) byte local800 = Static13.aClass2_Sub3_Sub1_1.method790();
					local122 = Static13.aClass2_Sub3_Sub1_1.method813();
					@Pc(808) int local808 = Static13.aClass2_Sub3_Sub1_1.method827();
					@Pc(815) Class2_Sub1_Sub1_Sub1_Sub1 local815;
					if (local28 == Static57.anInt1796) {
						local815 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1;
					} else {
						local815 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local28];
					}
					if (local815 != null) {
						@Pc(825) Class2_Sub1_Sub10 local825 = Static28.method739(local122);
						@Pc(833) int local833 = Static50.anIntArrayArrayArray7[Static2.anInt287][local83][local95];
						@Pc(843) int local843 = Static50.anIntArrayArrayArray7[Static2.anInt287][local83][local95 + 1];
						@Pc(855) int local855 = Static50.anIntArrayArrayArray7[Static2.anInt287][local83 + 1][local95 + 1];
						@Pc(865) int local865 = Static50.anIntArrayArrayArray7[Static2.anInt287][local83 + 1][local95];
						@Pc(875) Class2_Sub1_Sub1_Sub5 local875 = local825.method1007(local855, local843, local44, local833, local40, local865);
						if (local875 != null) {
							@Pc(886) byte local886;
							if (local745 < local800) {
								local886 = local800;
								local800 = local745;
								local745 = local886;
							}
							if (local753 < local757) {
								local886 = local757;
								local757 = local753;
								local753 = local886;
							}
							Static44.method1016(-1, local83, 0, local808 + 1, Static2.anInt287, local95, local48, 0, local105 + 1);
							local815.anInt292 = local808 + Static69.anInt2806;
							@Pc(922) int local922 = local825.anInt1481;
							local815.aClass2_Sub1_Sub1_Sub5_1 = local875;
							local815.anInt298 = local105 + Static69.anInt2806;
							@Pc(933) int local933 = local825.anInt1491;
							if (local44 == 1 || local44 == 3) {
								local933 = local825.anInt1481;
								local922 = local825.anInt1491;
							}
							local815.anInt289 = local83 * 128 + local922 * 64;
							local815.anInt301 = local95 * 128 + local933 * 64;
							local815.anInt290 = Static65.method1338(Static2.anInt287, local815.anInt289, local815.anInt301);
							local815.anInt297 = local757 + local95;
							local815.anInt280 = local83 + local800;
							local815.anInt283 = local83 + local745;
							local815.anInt300 = local753 + local95;
						}
					}
				}
				@Pc(1058) Class2_Sub1_Sub1_Sub4 local1058;
				if (Static93.anInt2359 == 74) {
					local14 = Static13.aClass2_Sub3_Sub1_1.method791();
					local28 = Static50.anInt1643 + (local14 >> 4 & 0x7);
					local20 = (local14 & 0x7) + Static29.anInt1085;
					local32 = Static13.aClass2_Sub3_Sub1_1.method784();
					if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
						@Pc(1051) Class46 local1051 = Static15.aClass46ArrayArrayArray1[Static2.anInt287][local28][local20];
						if (local1051 != null) {
							for (local1058 = (Class2_Sub1_Sub1_Sub4) local1051.method1435(); local1058 != null; local1058 = (Class2_Sub1_Sub1_Sub4) local1051.method1442()) {
								if ((local32 & 0x7FFF) == local1058.anInt1708) {
									local1058.method1820();
									break;
								}
							}
							if (local1051.method1435() == null) {
								Static15.aClass46ArrayArrayArray1[Static2.anInt287][local28][local20] = null;
							}
							Static106.method1756(local20, local28);
						}
					}
				} else if (Static93.anInt2359 == 1) {
					local14 = Static13.aClass2_Sub3_Sub1_1.method791();
					local20 = (local14 & 0x7) + Static29.anInt1085;
					local28 = Static50.anInt1643 + (local14 >> 4 & 0x7);
					local32 = local28 + Static13.aClass2_Sub3_Sub1_1.method831();
					local36 = local20 + Static13.aClass2_Sub3_Sub1_1.method831();
					local40 = Static13.aClass2_Sub3_Sub1_1.method786();
					local44 = Static13.aClass2_Sub3_Sub1_1.method792();
					local48 = Static13.aClass2_Sub3_Sub1_1.method791() * 4;
					local73 = Static13.aClass2_Sub3_Sub1_1.method791() * 4;
					local83 = Static13.aClass2_Sub3_Sub1_1.method792();
					local95 = Static13.aClass2_Sub3_Sub1_1.method792();
					local105 = Static13.aClass2_Sub3_Sub1_1.method791();
					@Pc(1167) int local1167 = Static13.aClass2_Sub3_Sub1_1.method791();
					if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local44 != 65535) {
						local32 = local32 * 128 + 64;
						local28 = local28 * 128 + 64;
						local20 = local20 * 128 + 64;
						@Pc(1245) Class2_Sub1_Sub1_Sub2 local1245 = new Class2_Sub1_Sub1_Sub2(local44, Static2.anInt287, local28, local20, Static65.method1338(Static2.anInt287, local28, local20) - local48, local83 - -Static69.anInt2806, local95 + Static69.anInt2806, local105, local1167, local40, local73);
						local36 = local36 * 128 + 64;
						local1245.method527(local83 + Static69.anInt2806, local36, Static65.method1338(Static2.anInt287, local32, local36) - local73, local32);
						Static72.aClass46_6.method1437(local1245);
					}
				} else if (Static93.anInt2359 == 19) {
					local14 = Static13.aClass2_Sub3_Sub1_1.method827();
					local28 = Static13.aClass2_Sub3_Sub1_1.method827();
					local20 = Static13.aClass2_Sub3_Sub1_1.method792();
					local32 = Static13.aClass2_Sub3_Sub1_1.method799();
					local36 = (local32 >> 4 & 0x7) + Static50.anInt1643;
					local40 = (local32 & 0x7) + Static29.anInt1085;
					if (local36 >= 0 && local40 >= 0 && local36 < 104 && local40 < 104 && local28 != Static57.anInt1796) {
						@Pc(1335) Class2_Sub1_Sub1_Sub4 local1335 = new Class2_Sub1_Sub1_Sub4();
						local1335.anInt1708 = local20;
						local1335.anInt1702 = local14;
						if (Static15.aClass46ArrayArrayArray1[Static2.anInt287][local36][local40] == null) {
							Static15.aClass46ArrayArrayArray1[Static2.anInt287][local36][local40] = new Class46();
						}
						Static15.aClass46ArrayArrayArray1[Static2.anInt287][local36][local40].method1437(local1335);
						Static106.method1756(local40, local36);
					}
				} else if (Static93.anInt2359 == 175) {
					local14 = Static13.aClass2_Sub3_Sub1_1.method813();
					local28 = Static13.aClass2_Sub3_Sub1_1.method792();
					local20 = Static13.aClass2_Sub3_Sub1_1.method791();
					local36 = Static29.anInt1085 + (local20 & 0x7);
					local32 = Static50.anInt1643 + (local20 >> 4 & 0x7);
					if (local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104) {
						local1058 = new Class2_Sub1_Sub1_Sub4();
						local1058.anInt1702 = local28;
						local1058.anInt1708 = local14;
						if (Static15.aClass46ArrayArrayArray1[Static2.anInt287][local32][local36] == null) {
							Static15.aClass46ArrayArrayArray1[Static2.anInt287][local32][local36] = new Class46();
						}
						Static15.aClass46ArrayArrayArray1[Static2.anInt287][local32][local36].method1437(local1058);
						Static106.method1756(local36, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBII)V")
	public static void method1562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static8.anInt510 == 0 || arg1 == 0 || Static31.anInt1216 >= 50) {
			return;
		}
		Static79.anIntArray271[Static31.anInt1216] = arg0;
		Static96.anIntArray301[Static31.anInt1216] = arg1;
		Static20.anIntArray90[Static31.anInt1216] = arg2;
		Static31.aClass39Array1[Static31.anInt1216] = null;
		Static52.anIntArray179[Static31.anInt1216] = 0;
		Static31.anInt1216++;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!bc;Lclient!bc;)V")
	public static void method1563(@OriginalArg(1) Class2_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub1 arg1) {
		Static66.aClass4_55.method1527();
		if (Static85.anInt2262 == 0 || Static85.anInt2262 == 5) {
			arg0.method371(Static81.aClass1_2272, 180, 54, 16777215);
			Static92.method1129(28, 62, 304, 34, 9179409);
			Static92.method1129(29, 63, 302, 32, 0);
			Static92.method1120(30, 64, Static112.anInt2804 * 3, 30, 9179409);
			Static92.method1120(Static112.anInt2804 * 3 + 30, 64, 300 - Static112.anInt2804 * 3, 30, 0);
			arg0.method371(Static104.aClass1_1598, 180, 85, 16777215);
		}
		@Pc(89) byte local89;
		@Pc(101) int local101;
		if (Static85.anInt2262 == 20) {
			local89 = 40;
			Static95.aClass2_Sub1_Sub2_Sub2_25.method637(0, 0);
			arg0.method373(Static104.aClass1_1587, 180, 40, 16776960, true);
			local101 = local89 + 15;
			arg0.method373(Static104.aClass1_1597, 180, 55, 16776960, true);
			@Pc(109) int local109 = local101 + 15;
			arg0.method373(Static104.aClass1_1588, 180, 70, 16776960, true);
			@Pc(117) int local117 = local109 + 15;
			@Pc(118) int local118 = local117 + 10;
			arg0.method368(Static97.method1655(new Class1[] { Static102.aClass1_2687, Static104.aClass1_1593 }), 90, 95, 16777215, true);
			@Pc(137) int local137 = local118 + 15;
			arg0.method368(Static97.method1655(new Class1[] { Static33.aClass1_1228, Static104.aClass1_1582.method12() }), 92, 110, 16777215, true);
			@Pc(158) int local158 = local137 + 15;
		}
		if (Static85.anInt2262 == 10) {
			Static95.aClass2_Sub1_Sub2_Sub2_25.method637(0, 0);
			if (Static47.anInt1558 == 0) {
				local89 = 80;
				arg0.method373(Static17.aClass1_673, 180, 80, 16776960, true);
				local101 = local89 + 30;
				Static98.aClass2_Sub1_Sub2_Sub2_27.method637(27, 100);
				arg0.method357(Static87.aClass1_2423, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static98.aClass2_Sub1_Sub2_Sub2_27.method637(187, 100);
				arg0.method357(Static71.aClass1_2039, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static47.anInt1558 == 2) {
				local89 = 40;
				arg0.method373(Static104.aClass1_1587, 180, 40, 16776960, true);
				local101 = local89 + 15;
				arg0.method373(Static104.aClass1_1597, 180, 55, 16776960, true);
				local101 += 15;
				arg0.method373(Static104.aClass1_1588, 180, 70, 16776960, true);
				local101 += 15;
				local101 += 10;
				arg0.method368(Static97.method1655(new Class1[] { Static102.aClass1_2687, Static104.aClass1_1593, Static69.anInt2806 % 40 < 20 & Static69.anInt2811 == 0 ? Static41.aClass1_1378 : Static104.aClass1_1591 }), 90, 95, 16777215, true);
				local101 += 15;
				arg0.method368(Static97.method1655(new Class1[] { Static33.aClass1_1228, Static104.aClass1_1582.method12(), Static69.anInt2806 % 40 < 20 & Static69.anInt2811 == 1 ? Static41.aClass1_1378 : Static104.aClass1_1591 }), 92, 110, 16777215, true);
				Static98.aClass2_Sub1_Sub2_Sub2_27.method637(27, 130);
				local101 += 15;
				arg0.method373(Static30.aClass1_1156, 100, 155, 16777215, true);
				Static98.aClass2_Sub1_Sub2_Sub2_27.method637(187, 130);
				arg0.method373(Static113.aClass1_2348, 260, 155, 16777215, true);
			} else if (Static47.anInt1558 == 3) {
				arg0.method373(Static112.aClass1_2904, 180, 40, 16776960, true);
				local89 = 65;
				arg0.method373(Static93.aClass1_2460, 180, 65, 16777215, true);
				local101 = local89 + 15;
				arg0.method373(aClass1_2433, 180, 80, 16777215, true);
				local101 += 15;
				arg0.method373(aClass1_2431, 180, 95, 16777215, true);
				local101 += 15;
				arg0.method373(Static80.aClass1_2270, 180, 110, 16777215, true);
				Static98.aClass2_Sub1_Sub2_Sub2_27.method637(107, 130);
				arg0.method373(Static113.aClass1_2348, 180, 155, 16777215, true);
				local101 += 15;
			}
		}
		Static17.method498();
		try {
			@Pc(468) Graphics local468 = Static103.aCanvas1.getGraphics();
			Static66.aClass4_55.method1525(202, local468, 171);
			Static12.aClass4_61.method1525(0, local468, 0);
			Static48.aClass4_33.method1525(637, local468, 0);
			if (Static80.aBoolean119) {
				Static80.aBoolean119 = false;
				Static68.aClass4_44.method1525(128, local468, 0);
				Static85.aClass4_52.method1525(202, local468, 371);
				Static27.aClass4_19.method1525(0, local468, 265);
				Static89.aClass4_54.method1525(562, local468, 265);
				Static44.aClass4_30.method1525(128, local468, 171);
				Static113.aClass4_50.method1525(562, local468, 171);
			}
		} catch (@Pc(535) Exception local535) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1564() {
		aClass2_Sub1_Sub2_Sub2_21 = null;
		aClass2_Sub1_Sub2_Sub1_1 = null;
		aClass11_21 = null;
		aClass1_2429 = null;
		aClass1_2431 = null;
		aClass1_2430 = null;
		aClass1_2436 = null;
		aClass1_2438 = null;
		aClass1_2437 = null;
		aClass1_2432 = null;
		aClass11_22 = null;
		aClass1_2433 = null;
		aLongArray5 = null;
		aClass1_2435 = null;
		aClass1_2434 = null;
	}
}
