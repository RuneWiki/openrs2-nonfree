import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!l", name = "W", descriptor = "Lclient!hc;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "Lclient!mf;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!l", name = "hb", descriptor = "J")
	public static long aLong92;

	@OriginalMember(owner = "client!l", name = "V", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1064 = Static122.method531("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!l", name = "Y", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1065 = Static122.method531(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!l", name = "db", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1066 = Static122.method531("Nehmen");

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1067 = Static122.method531("l");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
	public static void method1528(@OriginalArg(1) boolean arg0) {
		if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 >> 7 == Static14.anInt354 && Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 >> 7 == Static29.anInt764) {
			Static14.anInt354 = 0;
		}
		@Pc(29) int local29 = Static6.anInt158;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(45) Class3_Sub1_Sub4_Sub7_Sub1 local45;
			@Pc(51) int local51;
			if (arg0) {
				local45 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1;
				local51 = 33538048;
			} else {
				local45 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[Static47.anIntArray184[local35]];
				local51 = Static47.anIntArray184[local35] << 14;
			}
			if (local45 != null && local45.method2274()) {
				local45.aBoolean180 = false;
				if ((Static85.aBoolean127 && Static6.anInt158 > 50 || Static6.anInt158 > 200) && !arg0 && local45.anInt3141 == local45.anInt3154) {
					local45.aBoolean180 = true;
				}
				@Pc(93) int local93 = local45.anInt3169 >> 7;
				@Pc(98) int local98 = local45.anInt3159 >> 7;
				if (local93 >= 0 && local93 < 104 && local98 >= 0 && local98 < 104) {
					if (local45.aClass3_Sub1_Sub4_Sub5_1 == null || Static44.anInt1024 < local45.anInt2700 || Static44.anInt1024 >= local45.anInt2714) {
						if ((local45.anInt3169 & 0x7F) == 64 && (local45.anInt3159 & 0x7F) == 64) {
							if (Static142.anIntArrayArray35[local93][local98] == Static100.anInt2225) {
								continue;
							}
							Static142.anIntArrayArray35[local93][local98] = Static100.anInt2225;
						}
						local45.anInt2704 = Static107.method1922(local45.anInt3169, local45.anInt3159, Static147.anInt3309);
						Static119.aClass35_1.method1144(Static147.anInt3309, local45.anInt3169, local45.anInt3159, local45.anInt2704, 60, local45, local45.anInt3138, local51, local45.aBoolean212);
					} else {
						local45.aBoolean180 = false;
						local45.anInt2704 = Static107.method1922(local45.anInt3169, local45.anInt3159, Static147.anInt3309);
						Static119.aClass35_1.method1138(Static147.anInt3309, local45.anInt3169, local45.anInt3159, local45.anInt2704, local45, local45.anInt3138, local51, local45.anInt2696, local45.anInt2701, local45.anInt2707, local45.anInt2694);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IB)V")
	public static void method1529(@OriginalArg(0) int arg0) {
		if (Static150.method2586(arg0)) {
			Static33.method610(Static57.aClass83ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	public static void method1530() {
		aClass73_1067 = null;
		aClass73_1064 = null;
		aClass73_1066 = null;
		aClass30_1 = null;
		aClass73_1065 = null;
		aClass54_1 = null;
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	public static void method1531() {
		@Pc(26) int local26;
		@Pc(18) int local18;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(12) int local12;
		if (Static132.anInt3019 == 22) {
			local12 = Static159.aClass3_Sub12_Sub1_4.method1354();
			local18 = (local12 & 0x7) + Static20.anInt534;
			local26 = (local12 >> 4 & 0x7) + Static68.anInt1579;
			local30 = Static159.aClass3_Sub12_Sub1_4.method1359();
			local36 = Static159.aClass3_Sub12_Sub1_4.method1359();
			local40 = Static159.aClass3_Sub12_Sub1_4.method1359();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				@Pc(61) Class72 local61 = Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local26][local18];
				if (local61 != null) {
					for (@Pc(68) Class3_Sub1_Sub4_Sub2 local68 = (Class3_Sub1_Sub4_Sub2) local61.method2401(); local68 != null; local68 = (Class3_Sub1_Sub4_Sub2) local61.method2407()) {
						if ((local30 & 0x7FFF) == local68.anInt813 && local68.anInt819 == local36) {
							local68.anInt819 = local40;
							break;
						}
					}
					Static109.method1954(local18, local26);
				}
			}
			return;
		}
		@Pc(153) Class3_Sub1_Sub4_Sub2 local153;
		if (Static132.anInt3019 == 157) {
			local12 = Static159.aClass3_Sub12_Sub1_4.method1387();
			local26 = Static68.anInt1579 + (local12 >> 4 & 0x7);
			local18 = Static20.anInt534 + (local12 & 0x7);
			local30 = Static159.aClass3_Sub12_Sub1_4.method1377();
			local36 = Static159.aClass3_Sub12_Sub1_4.method1359();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				local153 = new Class3_Sub1_Sub4_Sub2();
				local153.anInt813 = local30;
				local153.anInt819 = local36;
				if (Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local26][local18] == null) {
					Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local26][local18] = new Class72();
				}
				Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local26][local18].method2404(local153);
				Static109.method1954(local18, local26);
			}
			return;
		}
		@Pc(237) int local237;
		@Pc(229) int local229;
		@Pc(275) int local275;
		if (Static132.anInt3019 == 39) {
			local12 = Static159.aClass3_Sub12_Sub1_4.method1354();
			local26 = local12 >> 2;
			local30 = Static16.anIntArray27[local26];
			local18 = local12 & 0x3;
			local36 = Static159.aClass3_Sub12_Sub1_4.method1359();
			local40 = Static159.aClass3_Sub12_Sub1_4.method1378();
			local229 = (local40 & 0x7) + Static20.anInt534;
			local237 = (local40 >> 4 & 0x7) + Static68.anInt1579;
			if (local237 >= 0 && local229 >= 0 && local237 < 103 && local229 < 103) {
				if (local30 == 0) {
					@Pc(266) Class34 local266 = Static119.aClass35_1.method1132(Static147.anInt3309, local237, local229);
					if (local266 != null) {
						local275 = local266.anInt1474 >> 14 & 0x7FFF;
						if (local26 == 2) {
							local266.aClass3_Sub1_Sub4_2 = new Class3_Sub1_Sub4_Sub6(local275, 2, local18 + 4, Static147.anInt3309, local237, local229, local36, false, local266.aClass3_Sub1_Sub4_2);
							local266.aClass3_Sub1_Sub4_3 = new Class3_Sub1_Sub4_Sub6(local275, 2, local18 + 1 & 0x3, Static147.anInt3309, local237, local229, local36, false, local266.aClass3_Sub1_Sub4_3);
						} else {
							local266.aClass3_Sub1_Sub4_2 = new Class3_Sub1_Sub4_Sub6(local275, local26, local18, Static147.anInt3309, local237, local229, local36, false, local266.aClass3_Sub1_Sub4_2);
						}
					}
				}
				if (local30 == 1) {
					@Pc(342) Class51 local342 = Static119.aClass35_1.method1135(Static147.anInt3309, local237, local229);
					if (local342 != null) {
						local275 = local342.anInt2081 >> 14 & 0x7FFF;
						if (local26 == 4 || local26 == 5) {
							local342.aClass3_Sub1_Sub4_4 = new Class3_Sub1_Sub4_Sub6(local275, 4, local18, Static147.anInt3309, local237, local229, local36, false, local342.aClass3_Sub1_Sub4_4);
						} else if (local26 == 6) {
							local342.aClass3_Sub1_Sub4_4 = new Class3_Sub1_Sub4_Sub6(local275, 4, local18 + 4, Static147.anInt3309, local237, local229, local36, false, local342.aClass3_Sub1_Sub4_4);
						} else if (local26 == 7) {
							local342.aClass3_Sub1_Sub4_4 = new Class3_Sub1_Sub4_Sub6(local275, 4, (local18 + 2 & 0x3) + 4, Static147.anInt3309, local237, local229, local36, false, local342.aClass3_Sub1_Sub4_4);
						} else if (local26 == 8) {
							local342.aClass3_Sub1_Sub4_4 = new Class3_Sub1_Sub4_Sub6(local275, 4, local18 + 4, Static147.anInt3309, local237, local229, local36, false, local342.aClass3_Sub1_Sub4_4);
							local342.aClass3_Sub1_Sub4_5 = new Class3_Sub1_Sub4_Sub6(local275, 4, (local18 + 2 & 0x3) + 4, Static147.anInt3309, local237, local229, local36, false, local342.aClass3_Sub1_Sub4_5);
						}
					}
				}
				if (local30 == 2) {
					if (local26 == 11) {
						local26 = 10;
					}
					@Pc(481) Class4 local481 = Static119.aClass35_1.method1141(Static147.anInt3309, local237, local229);
					if (local481 != null) {
						local481.aClass3_Sub1_Sub4_1 = new Class3_Sub1_Sub4_Sub6(local481.anInt68 >> 14 & 0x7FFF, local26, local18, Static147.anInt3309, local237, local229, local36, false, local481.aClass3_Sub1_Sub4_1);
					}
				}
				if (local30 == 3) {
					@Pc(512) Class55 local512 = Static119.aClass35_1.method1151(Static147.anInt3309, local237, local229);
					if (local512 != null) {
						local512.aClass3_Sub1_Sub4_6 = new Class3_Sub1_Sub4_Sub6(local512.anInt2527 >> 14 & 0x7FFF, 22, local18, Static147.anInt3309, local237, local229, local36, false, local512.aClass3_Sub1_Sub4_6);
					}
				}
			}
		} else if (Static132.anInt3019 == 175) {
			local12 = Static159.aClass3_Sub12_Sub1_4.method1354();
			local26 = (local12 >> 4 & 0x7) + Static68.anInt1579;
			local18 = (local12 & 0x7) + Static20.anInt534;
			local30 = Static159.aClass3_Sub12_Sub1_4.method1359();
			local36 = Static159.aClass3_Sub12_Sub1_4.method1354();
			local40 = Static159.aClass3_Sub12_Sub1_4.method1359();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				local26 = local26 * 128 + 64;
				local18 = local18 * 128 + 64;
				@Pc(614) Class3_Sub1_Sub4_Sub3 local614 = new Class3_Sub1_Sub4_Sub3(local30, Static147.anInt3309, local26, local18, Static107.method1922(local26, local18, Static147.anInt3309) - local36, local40, Static44.anInt1024);
				Static121.aClass72_38.method2404(local614);
			}
		} else {
			@Pc(676) int local676;
			@Pc(684) int local684;
			@Pc(694) int local694;
			if (Static132.anInt3019 == 114) {
				local12 = Static159.aClass3_Sub12_Sub1_4.method1354();
				local18 = (local12 & 0x7) + Static20.anInt534;
				local26 = Static68.anInt1579 + (local12 >> 4 & 0x7);
				local30 = local26 + Static159.aClass3_Sub12_Sub1_4.method1342();
				local36 = local18 + Static159.aClass3_Sub12_Sub1_4.method1342();
				local40 = Static159.aClass3_Sub12_Sub1_4.method1375();
				local237 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local229 = Static159.aClass3_Sub12_Sub1_4.method1354() * 4;
				local676 = Static159.aClass3_Sub12_Sub1_4.method1354() * 4;
				local275 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local684 = Static159.aClass3_Sub12_Sub1_4.method1359();
				@Pc(688) int local688 = Static159.aClass3_Sub12_Sub1_4.method1354();
				local694 = Static159.aClass3_Sub12_Sub1_4.method1354();
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104 && local30 >= 0 && local36 >= 0 && local30 < 104 && local36 < 104 && local237 != 65535) {
					local18 = local18 * 128 + 64;
					local30 = local30 * 128 + 64;
					local26 = local26 * 128 + 64;
					@Pc(774) Class3_Sub1_Sub4_Sub1 local774 = new Class3_Sub1_Sub4_Sub1(local237, Static147.anInt3309, local26, local18, Static107.method1922(local26, local18, Static147.anInt3309) - local229, Static44.anInt1024 + local275, local684 + Static44.anInt1024, local688, local694, local40, local676);
					local36 = local36 * 128 + 64;
					local774.method300(local36, local30, Static107.method1922(local30, local36, Static147.anInt3309) - local676, local275 - -Static44.anInt1024);
					Static94.aClass72_29.method2404(local774);
				}
			} else if (Static132.anInt3019 == 83) {
				local12 = Static159.aClass3_Sub12_Sub1_4.method1352();
				local26 = Static159.aClass3_Sub12_Sub1_4.method1347();
				local18 = Static68.anInt1579 + (local26 >> 4 & 0x7);
				local30 = Static20.anInt534 + (local26 & 0x7);
				local36 = Static159.aClass3_Sub12_Sub1_4.method1378();
				local40 = local36 >> 2;
				local237 = local36 & 0x3;
				local229 = Static16.anIntArray27[local40];
				if (local18 >= 0 && local30 >= 0 && local18 < 104 && local30 < 104) {
					Static148.method2426(local30, -1, local237, local12, 0, local18, Static147.anInt3309, local40, local229);
				}
			} else if (Static132.anInt3019 == 148) {
				local12 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local26 = Static159.aClass3_Sub12_Sub1_4.method1377();
				local18 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local30 = Static159.aClass3_Sub12_Sub1_4.method1387();
				local40 = Static20.anInt534 + (local30 & 0x7);
				local36 = (local30 >> 4 & 0x7) + Static68.anInt1579;
				if (local36 >= 0 && local40 >= 0 && local36 < 104 && local40 < 104 && Static61.anInt1455 != local12) {
					@Pc(938) Class3_Sub1_Sub4_Sub2 local938 = new Class3_Sub1_Sub4_Sub2();
					local938.anInt813 = local26;
					local938.anInt819 = local18;
					if (Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local36][local40] == null) {
						Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local36][local40] = new Class72();
					}
					Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local36][local40].method2404(local938);
					Static109.method1954(local40, local36);
				}
			} else if (Static132.anInt3019 == 204) {
				local12 = Static159.aClass3_Sub12_Sub1_4.method1347();
				local26 = (local12 >> 4 & 0x7) + Static68.anInt1579;
				local18 = Static20.anInt534 + (local12 & 0x7);
				local30 = Static159.aClass3_Sub12_Sub1_4.method1359();
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
					@Pc(1032) Class72 local1032 = Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local26][local18];
					if (local1032 != null) {
						for (local153 = (Class3_Sub1_Sub4_Sub2) local1032.method2401(); local153 != null; local153 = (Class3_Sub1_Sub4_Sub2) local1032.method2407()) {
							if (local153.anInt813 == (local30 & 0x7FFF)) {
								local153.method2783();
								break;
							}
						}
						if (local1032.method2401() == null) {
							Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local26][local18] = null;
						}
						Static109.method1954(local18, local26);
					}
				}
			} else {
				if (Static132.anInt3019 == 172) {
					@Pc(1093) byte local1093 = Static159.aClass3_Sub12_Sub1_4.method1370();
					local26 = Static159.aClass3_Sub12_Sub1_4.method1352();
					local18 = Static159.aClass3_Sub12_Sub1_4.method1347();
					local30 = local18 >> 2;
					local40 = Static16.anIntArray27[local30];
					local36 = local18 & 0x3;
					local237 = Static159.aClass3_Sub12_Sub1_4.method1377();
					local229 = Static159.aClass3_Sub12_Sub1_4.method1377();
					local676 = Static159.aClass3_Sub12_Sub1_4.method1378();
					local275 = Static68.anInt1579 + (local676 >> 4 & 0x7);
					local684 = (local676 & 0x7) + Static20.anInt534;
					@Pc(1144) byte local1144 = Static159.aClass3_Sub12_Sub1_4.method1355();
					local694 = Static159.aClass3_Sub12_Sub1_4.method1352();
					@Pc(1152) byte local1152 = Static159.aClass3_Sub12_Sub1_4.method1355();
					@Pc(1156) byte local1156 = Static159.aClass3_Sub12_Sub1_4.method1395();
					@Pc(1163) Class3_Sub1_Sub4_Sub7_Sub1 local1163;
					if (Static61.anInt1455 == local229) {
						local1163 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1;
					} else {
						local1163 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local229];
					}
					if (local1163 != null) {
						@Pc(1173) Class3_Sub1_Sub15 local1173 = Static151.method2466(local237);
						@Pc(1182) int local1182;
						@Pc(1185) int local1185;
						if (local36 == 1 || local36 == 3) {
							local1182 = local1173.anInt3014;
							local1185 = local1173.anInt3012;
						} else {
							local1182 = local1173.anInt3012;
							local1185 = local1173.anInt3014;
						}
						@Pc(1201) int local1201 = (local1182 + 1 >> 1) + local275;
						@Pc(1207) int local1207 = local275 + (local1182 >> 1);
						@Pc(1211) int[][] local1211 = Static65.anIntArrayArrayArray5[Static147.anInt3309];
						@Pc(1217) int local1217 = (local1185 >> 1) + local684;
						@Pc(1225) int local1225 = (local1185 + 1 >> 1) + local684;
						@Pc(1251) int local1251 = local1211[local1201][local1225] + local1211[local1207][local1225] + local1211[local1201][local1217] + local1211[local1207][local1217] >> 2;
						@Pc(1260) int local1260 = (local275 << 7) + (local1182 << 6);
						@Pc(1268) int local1268 = (local1185 << 6) + (local684 << 7);
						@Pc(1280) Class3_Sub1_Sub4_Sub5 local1280 = local1173.method2194(local1211, local1260, local1251, local36, local30, local1268);
						if (local1280 != null) {
							@Pc(1287) byte local1287;
							if (local1093 < local1144) {
								local1287 = local1144;
								local1144 = local1093;
								local1093 = local1287;
							}
							if (local1156 < local1152) {
								local1287 = local1152;
								local1152 = local1156;
								local1156 = local1287;
							}
							Static148.method2426(local684, local694 + 1, 0, -1, local26 + 1, local275, Static147.anInt3309, 0, local40);
							local1163.anInt2710 = local1251;
							local1163.anInt2694 = local684 + local1156;
							local1163.anInt2700 = Static44.anInt1024 + local26;
							local1163.anInt2701 = local1152 + local684;
							local1163.anInt2696 = local1144 + local275;
							local1163.anInt2695 = local1182 * 64 + local275 * 128;
							local1163.anInt2707 = local1093 + local275;
							local1163.anInt2715 = local1185 * 64 + local684 * 128;
							local1163.anInt2714 = local694 + Static44.anInt1024;
							local1163.aClass3_Sub1_Sub4_Sub5_1 = local1280;
						}
					}
				}
				if (Static132.anInt3019 == 69) {
					local12 = Static159.aClass3_Sub12_Sub1_4.method1354();
					local26 = Static68.anInt1579 + (local12 >> 4 & 0x7);
					local18 = Static20.anInt534 + (local12 & 0x7);
					local30 = Static159.aClass3_Sub12_Sub1_4.method1359();
					local36 = Static159.aClass3_Sub12_Sub1_4.method1354();
					local40 = local36 >> 4 & 0xF;
					local237 = local36 & 0x7;
					local229 = Static159.aClass3_Sub12_Sub1_4.method1354();
					if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
						local676 = local40 + 1;
						if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0] >= local26 - local676 && Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0] <= local26 + local676 && local18 - local676 <= Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0] && Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0] <= local676 + local18 && Static51.anInt1201 != 0 && local237 > 0 && Static34.anInt835 < 50) {
							Static176.anIntArray420[Static34.anInt835] = local30;
							Static138.anIntArray331[Static34.anInt835] = local237;
							Static41.anIntArray94[Static34.anInt835] = local229;
							Static117.aClass66Array1[Static34.anInt835] = null;
							Static166.anIntArray382[Static34.anInt835] = local40 + (local26 << 16) + (local18 << 8);
							Static34.anInt835++;
						}
					}
				}
				if (Static132.anInt3019 == 64) {
					local12 = Static159.aClass3_Sub12_Sub1_4.method1347();
					local26 = Static68.anInt1579 + (local12 >> 4 & 0x7);
					local18 = Static20.anInt534 + (local12 & 0x7);
					local30 = Static159.aClass3_Sub12_Sub1_4.method1347();
					local40 = local30 & 0x3;
					local36 = local30 >> 2;
					local237 = Static16.anIntArray27[local36];
					if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
						Static148.method2426(local18, -1, local40, -1, 0, local26, Static147.anInt3309, local36, local237);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBI)V")
	public static void method1532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static109.method1956();
		Static15.method2296(arg2, arg0, arg2 + Static84.aClass3_Sub1_Sub3_Sub3_6.anInt1917, arg0 + Static84.aClass3_Sub1_Sub3_Sub3_6.anInt1914);
		if (Static59.anInt2722 == 2 || Static59.anInt2722 == 5) {
			Static15.method2306(arg2 + 25, arg0 + 5, Static88.anIntArray201, Static29.anIntArray73);
		} else {
			@Pc(53) int local53 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32 + 48;
			@Pc(59) int local59 = Static25.anInt716 + Static120.anInt2841 & 0x7FF;
			@Pc(67) int local67 = 464 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
			Static8.aClass3_Sub1_Sub3_Sub4_3.method2332(arg2 + 25, arg0 + 5, 146, 151, local53, local67, local59, Static170.anInt3687 + 256, Static88.anIntArray201, Static29.anIntArray73);
			@Pc(102) int local102;
			@Pc(115) int local115;
			for (@Pc(87) int local87 = 0; local87 < Static72.anInt1640; local87++) {
				local102 = Static37.anIntArray90[local87] * 4 + 2 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32;
				local115 = Static90.anIntArray216[local87] * 4 + 2 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
				Static4.method47(local102, Static56.aClass3_Sub1_Sub3_Sub4Array5[local87], arg0, local115, arg2);
			}
			@Pc(174) int local174;
			@Pc(162) int local162;
			for (local102 = 0; local102 < 104; local102++) {
				for (local115 = 0; local115 < 104; local115++) {
					@Pc(148) Class72 local148 = Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local102][local115];
					if (local148 != null) {
						local162 = local115 * 4 + 2 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
						local174 = local102 * 4 + 2 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32;
						Static4.method47(local174, Static5.aClass3_Sub1_Sub3_Sub4Array1[0], arg0, local162, arg2);
					}
				}
			}
			@Pc(240) int local240;
			for (local115 = 0; local115 < Static86.anInt1943; local115++) {
				@Pc(203) Class3_Sub1_Sub4_Sub7_Sub2 local203 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[Static52.anIntArray132[local115]];
				if (local203 != null && local203.method2274()) {
					@Pc(212) Class3_Sub1_Sub10 local212 = local203.aClass3_Sub1_Sub10_1;
					if (local212 != null && local212.anIntArray174 != null) {
						local212 = local212.method1201();
					}
					if (local212 != null && local212.aBoolean100 && local212.aBoolean99) {
						local240 = local203.anInt3159 / 32 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
						local162 = local203.anInt3169 / 32 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32;
						Static4.method47(local162, Static5.aClass3_Sub1_Sub3_Sub4Array1[1], arg0, local240, arg2);
					}
				}
			}
			@Pc(278) Class3_Sub1_Sub4_Sub7_Sub1 local278;
			for (@Pc(270) int local270 = 0; local270 < Static6.anInt158; local270++) {
				local278 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[Static47.anIntArray184[local270]];
				if (local278 != null && local278.method2274()) {
					local162 = local278.anInt3169 / 32 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32;
					local240 = local278.anInt3159 / 32 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
					@Pc(308) boolean local308 = false;
					@Pc(313) long local313 = local278.aClass73_1521.method2425();
					for (@Pc(315) int local315 = 0; local315 < Static166.anInt3619; local315++) {
						if (local313 == Static138.aLongArray5[local315] && Static109.anIntArray283[local315] != 0) {
							local308 = true;
							break;
						}
					}
					@Pc(341) boolean local341 = false;
					if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2708 != 0 && local278.anInt2708 != 0 && local278.anInt2708 == Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2708) {
						local341 = true;
					}
					if (local308) {
						Static4.method47(local162, Static5.aClass3_Sub1_Sub3_Sub4Array1[3], arg0, local240, arg2);
					} else if (local341) {
						Static4.method47(local162, Static5.aClass3_Sub1_Sub3_Sub4Array1[4], arg0, local240, arg2);
					} else {
						Static4.method47(local162, Static5.aClass3_Sub1_Sub3_Sub4Array1[2], arg0, local240, arg2);
					}
				}
			}
			if (Static160.anInt3497 != 0 && Static44.anInt1024 % 20 < 10) {
				if (Static160.anInt3497 == 1 && Static91.anInt2032 >= 0 && Static91.anInt2032 < Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1.length) {
					@Pc(430) Class3_Sub1_Sub4_Sub7_Sub2 local430 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[Static91.anInt2032];
					if (local430 != null) {
						local162 = local430.anInt3169 / 32 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32;
						local240 = local430.anInt3159 / 32 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
						Static58.method1015(Static12.aClass3_Sub1_Sub3_Sub4Array2[1], local162, local240, arg0, arg2);
					}
				}
				if (Static160.anInt3497 == 2) {
					local174 = (Static78.anInt1721 - Static151.anInt3389) * 4 + 2 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32;
					local162 = (Static39.anInt918 - Static134.anInt3066) * 4 + 2 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
					Static58.method1015(Static12.aClass3_Sub1_Sub3_Sub4Array2[1], local174, local162, arg0, arg2);
				}
				if (Static160.anInt3497 == 10 && Static71.anInt1633 >= 0 && Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1.length > Static71.anInt1633) {
					local278 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[Static71.anInt1633];
					if (local278 != null) {
						local162 = local278.anInt3169 / 32 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32;
						local240 = local278.anInt3159 / 32 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
						Static58.method1015(Static12.aClass3_Sub1_Sub3_Sub4Array2[1], local162, local240, arg0, arg2);
					}
				}
			}
			if (Static14.anInt354 != 0) {
				local174 = Static14.anInt354 * 4 + 2 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 / 32;
				local162 = Static29.anInt764 * 4 + 2 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 / 32;
				Static4.method47(local174, Static12.aClass3_Sub1_Sub3_Sub4Array2[0], arg0, local162, arg2);
			}
			Static15.method2297(arg2 + 4 + 93, arg0 - -82 + -4, 3, 3, 16777215);
		}
		if (Static59.anInt2722 < 3) {
			Static94.aClass3_Sub1_Sub3_Sub4_22.method2332(arg2, arg0, 33, 33, 25, 25, Static25.anInt716, 256, Static173.anIntArray400, Static153.anIntArray370);
		} else {
			Static15.method2306(arg2, arg0, Static173.anIntArray400, Static153.anIntArray370);
		}
		if (Static139.aBooleanArray9[arg1]) {
			Static84.aClass3_Sub1_Sub3_Sub3_6.method1493(arg2, arg0);
		}
		Static84.aBooleanArray7[arg1] = true;
	}
}
