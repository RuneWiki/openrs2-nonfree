import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2 aClass1_Sub1_Sub5_Sub2_8;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
	public static int anInt2074;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1318 = Static69.method1153("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1319 = Static69.method1153("Schlie-8en");

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "Lclient!pc;")
	public static Class58 aClass58_6 = new Class58(32);

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
	public static int anInt2092 = 10;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1320 = Static69.method1153("::errortest");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1465() {
		anIntArray305 = null;
		aClass64_1318 = null;
		aClass58_6 = null;
		aCanvas1 = null;
		aClass1_Sub1_Sub5_Sub2_8 = null;
		aClass64_1320 = null;
		aClass64_1319 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method1466() {
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static54.anInt2055 == 190) {
			local14 = Static64.aClass1_Sub6_Sub1_2.method1837();
			local23 = Static38.anInt907 + (local14 >> 4 & 0x7);
			local30 = Static15.anInt473 + (local14 & 0x7);
			local34 = Static64.aClass1_Sub6_Sub1_2.method1842();
			local38 = Static64.aClass1_Sub6_Sub1_2.method1837();
			local42 = Static64.aClass1_Sub6_Sub1_2.method1842();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				local30 = local30 * 128 + 64;
				local23 = local23 * 128 + 64;
				@Pc(86) Class1_Sub1_Sub2_Sub6 local86 = new Class1_Sub1_Sub2_Sub6(local34, Static15.anInt463, local23, local30, Static114.method1996(Static15.anInt463, local23, local30) - local38, local42, Static15.anInt471);
				Static46.aClass50_5.method1142(local86);
			}
			return;
		}
		@Pc(131) int local131;
		if (Static54.anInt2055 == 207) {
			local14 = Static64.aClass1_Sub6_Sub1_2.method1841();
			local23 = Static38.anInt907 + (local14 >> 4 & 0x7);
			local30 = (local14 & 0x7) + Static15.anInt473;
			local34 = Static64.aClass1_Sub6_Sub1_2.method1841();
			local38 = local34 >> 2;
			local42 = local34 & 0x3;
			local131 = Static103.anIntArray344[local38];
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				Static68.method1138(local30, local23, local42, -1, 0, Static15.anInt463, local131, -1, local38);
			}
		} else if (Static54.anInt2055 == 80) {
			local14 = Static64.aClass1_Sub6_Sub1_2.method1837();
			local23 = Static38.anInt907 + (local14 >> 4 & 0x7);
			local30 = (local14 & 0x7) + Static15.anInt473;
			local34 = Static64.aClass1_Sub6_Sub1_2.method1842();
			local38 = Static64.aClass1_Sub6_Sub1_2.method1842();
			local42 = Static64.aClass1_Sub6_Sub1_2.method1842();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				@Pc(213) Class50 local213 = Static64.aClass50ArrayArrayArray1[Static15.anInt463][local23][local30];
				if (local213 != null) {
					for (@Pc(220) Class1_Sub1_Sub2_Sub4 local220 = (Class1_Sub1_Sub2_Sub4) local213.method1151(); local220 != null; local220 = (Class1_Sub1_Sub2_Sub4) local213.method1141()) {
						if (local220.anInt1844 == (local34 & 0x7FFF) && local38 == local220.anInt1850) {
							local220.anInt1850 = local42;
							break;
						}
					}
					Static26.method517(local23, local30);
				}
			}
		} else {
			@Pc(294) int local294;
			@Pc(319) int local319;
			@Pc(329) int local329;
			@Pc(341) int local341;
			@Pc(351) int local351;
			@Pc(371) int local371;
			if (Static54.anInt2055 == 152) {
				local14 = Static64.aClass1_Sub6_Sub1_2.method1841();
				local23 = local14 >> 2;
				local34 = Static103.anIntArray344[local23];
				local38 = Static64.aClass1_Sub6_Sub1_2.method1857();
				local42 = (local38 >> 4 & 0x7) + Static38.anInt907;
				local30 = local14 & 0x3;
				local131 = (local38 & 0x7) + Static15.anInt473;
				local294 = Static64.aClass1_Sub6_Sub1_2.method1842();
				if (local42 >= 0 && local131 >= 0 && local42 < 103 && local131 < 103) {
					local319 = Static102.anIntArrayArrayArray5[Static15.anInt463][local42][local131];
					local329 = Static102.anIntArrayArrayArray5[Static15.anInt463][local42 + 1][local131];
					local341 = Static102.anIntArrayArrayArray5[Static15.anInt463][local42 + 1][local131 + 1];
					local351 = Static102.anIntArrayArrayArray5[Static15.anInt463][local42][local131 + 1];
					if (local34 == 0) {
						@Pc(362) Class67 local362 = Static82.aClass68_1.method1776(Static15.anInt463, local42, local131);
						if (local362 != null) {
							local371 = local362.anInt2226 >> 14 & 0x7FFF;
							if (local23 == 2) {
								local362.aClass1_Sub1_Sub2_7 = new Class1_Sub1_Sub2_Sub5(local371, 2, local30 + 4, local319, local329, local341, local351, local294, false, local362.aClass1_Sub1_Sub2_7);
								local362.aClass1_Sub1_Sub2_8 = new Class1_Sub1_Sub2_Sub5(local371, 2, local30 + 1 & 0x3, local319, local329, local341, local351, local294, false, local362.aClass1_Sub1_Sub2_8);
							} else {
								local362.aClass1_Sub1_Sub2_7 = new Class1_Sub1_Sub2_Sub5(local371, local23, local30, local319, local329, local341, local351, local294, false, local362.aClass1_Sub1_Sub2_7);
							}
						}
					}
					if (local34 == 1) {
						@Pc(441) Class9 local441 = Static82.aClass68_1.method1745(Static15.anInt463, local42, local131);
						if (local441 != null) {
							local441.aClass1_Sub1_Sub2_1 = new Class1_Sub1_Sub2_Sub5(local441.anInt342 >> 14 & 0x7FFF, 4, 0, local319, local329, local341, local351, local294, false, local441.aClass1_Sub1_Sub2_1);
						}
					}
					if (local34 == 2) {
						if (local23 == 11) {
							local23 = 10;
						}
						@Pc(482) Class43 local482 = Static82.aClass68_1.method1773(Static15.anInt463, local42, local131);
						if (local482 != null) {
							local482.aClass1_Sub1_Sub2_2 = new Class1_Sub1_Sub2_Sub5(local482.anInt1468 >> 14 & 0x7FFF, local23, local30, local319, local329, local341, local351, local294, false, local482.aClass1_Sub1_Sub2_2);
						}
					}
					if (local34 == 3) {
						@Pc(514) Class62 local514 = Static82.aClass68_1.method1751(Static15.anInt463, local42, local131);
						if (local514 != null) {
							local514.aClass1_Sub1_Sub2_6 = new Class1_Sub1_Sub2_Sub5(local514.anInt2039 >> 14 & 0x7FFF, 22, local30, local319, local329, local341, local351, local294, false, local514.aClass1_Sub1_Sub2_6);
						}
					}
				}
			} else {
				if (Static54.anInt2055 == 91) {
					local14 = Static64.aClass1_Sub6_Sub1_2.method1837();
					local30 = Static15.anInt473 + (local14 & 0x7);
					local23 = (local14 >> 4 & 0x7) + Static38.anInt907;
					local34 = Static64.aClass1_Sub6_Sub1_2.method1842();
					local38 = Static64.aClass1_Sub6_Sub1_2.method1837();
					local131 = local38 & 0x7;
					local42 = local38 >> 4 & 0xF;
					local294 = Static64.aClass1_Sub6_Sub1_2.method1837();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						local319 = local42 + 1;
						if (local23 - local319 <= Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0] && Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0] <= local23 + local319 && Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0] >= local30 - local319 && local30 + local319 >= Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0] && Static69.anInt1549 != 0 && local131 > 0 && Static70.anInt1591 < 50) {
							Static60.anIntArray210[Static70.anInt1591] = local34;
							Static119.anIntArray452[Static70.anInt1591] = local131;
							Static7.anIntArray48[Static70.anInt1591] = local294;
							Static25.aClass34Array5[Static70.anInt1591] = null;
							Static37.anIntArray136[Static70.anInt1591] = (local30 << 8) + (local23 << 16) + local42;
							Static70.anInt1591++;
						}
					}
				}
				if (Static54.anInt2055 == 17) {
					local14 = Static64.aClass1_Sub6_Sub1_2.method1857();
					local30 = local14 & 0x3;
					local23 = local14 >> 2;
					local34 = Static103.anIntArray344[local23];
					local38 = Static64.aClass1_Sub6_Sub1_2.method1842();
					local42 = Static64.aClass1_Sub6_Sub1_2.method1826();
					local294 = (local42 & 0x7) + Static15.anInt473;
					local131 = Static38.anInt907 + (local42 >> 4 & 0x7);
					if (local131 >= 0 && local294 >= 0 && local131 < 104 && local294 < 104) {
						Static68.method1138(local294, local131, local30, -1, 0, Static15.anInt463, local34, local38, local23);
					}
				} else {
					@Pc(836) int local836;
					if (Static54.anInt2055 == 65) {
						local14 = Static64.aClass1_Sub6_Sub1_2.method1837();
						local23 = Static38.anInt907 + (local14 >> 4 & 0x7);
						local30 = (local14 & 0x7) + Static15.anInt473;
						local34 = local23 + Static64.aClass1_Sub6_Sub1_2.method1824();
						local38 = Static64.aClass1_Sub6_Sub1_2.method1824() + local30;
						local42 = Static64.aClass1_Sub6_Sub1_2.method1861();
						local131 = Static64.aClass1_Sub6_Sub1_2.method1842();
						local294 = Static64.aClass1_Sub6_Sub1_2.method1837() * 4;
						local319 = Static64.aClass1_Sub6_Sub1_2.method1837() * 4;
						local329 = Static64.aClass1_Sub6_Sub1_2.method1842();
						local341 = Static64.aClass1_Sub6_Sub1_2.method1842();
						local351 = Static64.aClass1_Sub6_Sub1_2.method1837();
						local836 = Static64.aClass1_Sub6_Sub1_2.method1837();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local131 != 65535) {
							local38 = local38 * 128 + 64;
							local34 = local34 * 128 + 64;
							local30 = local30 * 128 + 64;
							local23 = local23 * 128 + 64;
							@Pc(920) Class1_Sub1_Sub2_Sub2 local920 = new Class1_Sub1_Sub2_Sub2(local131, Static15.anInt463, local23, local30, Static114.method1996(Static15.anInt463, local23, local30) - local294, local329 + Static15.anInt471, Static15.anInt471 + local341, local351, local836, local42, local319);
							local920.method966(Static114.method1996(Static15.anInt463, local34, local38) - local319, local38, local34, local329 + Static15.anInt471);
							Static53.aClass50_7.method1142(local920);
						}
					} else {
						@Pc(995) Class1_Sub1_Sub2_Sub4 local995;
						if (Static54.anInt2055 == 39) {
							local14 = Static64.aClass1_Sub6_Sub1_2.method1826();
							local23 = (local14 >> 4 & 0x7) + Static38.anInt907;
							local30 = Static15.anInt473 + (local14 & 0x7);
							local34 = Static64.aClass1_Sub6_Sub1_2.method1842();
							local38 = Static64.aClass1_Sub6_Sub1_2.method1850();
							if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
								local995 = new Class1_Sub1_Sub2_Sub4();
								local995.anInt1850 = local34;
								local995.anInt1844 = local38;
								if (Static64.aClass50ArrayArrayArray1[Static15.anInt463][local23][local30] == null) {
									Static64.aClass50ArrayArrayArray1[Static15.anInt463][local23][local30] = new Class50();
								}
								Static64.aClass50ArrayArrayArray1[Static15.anInt463][local23][local30].method1142(local995);
								Static26.method517(local23, local30);
							}
						} else if (Static54.anInt2055 == 8) {
							local14 = Static64.aClass1_Sub6_Sub1_2.method1842();
							local23 = Static64.aClass1_Sub6_Sub1_2.method1842();
							local30 = Static64.aClass1_Sub6_Sub1_2.method1841();
							local34 = (local30 >> 4 & 0x7) + Static38.anInt907;
							local38 = (local30 & 0x7) + Static15.anInt473;
							local42 = Static64.aClass1_Sub6_Sub1_2.method1855();
							if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local14 != Static64.anInt1485) {
								@Pc(1091) Class1_Sub1_Sub2_Sub4 local1091 = new Class1_Sub1_Sub2_Sub4();
								local1091.anInt1850 = local42;
								local1091.anInt1844 = local23;
								if (Static64.aClass50ArrayArrayArray1[Static15.anInt463][local34][local38] == null) {
									Static64.aClass50ArrayArrayArray1[Static15.anInt463][local34][local38] = new Class50();
								}
								Static64.aClass50ArrayArrayArray1[Static15.anInt463][local34][local38].method1142(local1091);
								Static26.method517(local34, local38);
							}
						} else {
							if (Static54.anInt2055 == 178) {
								@Pc(1137) byte local1137 = Static64.aClass1_Sub6_Sub1_2.method1835();
								local23 = Static64.aClass1_Sub6_Sub1_2.method1855();
								local30 = Static64.aClass1_Sub6_Sub1_2.method1850();
								local34 = Static64.aClass1_Sub6_Sub1_2.method1832();
								@Pc(1153) byte local1153 = Static64.aClass1_Sub6_Sub1_2.method1820();
								@Pc(1157) byte local1157 = Static64.aClass1_Sub6_Sub1_2.method1820();
								local131 = Static64.aClass1_Sub6_Sub1_2.method1855();
								local294 = Static64.aClass1_Sub6_Sub1_2.method1857();
								local319 = local294 >> 2;
								local329 = local294 & 0x3;
								local341 = Static103.anIntArray344[local319];
								local351 = Static64.aClass1_Sub6_Sub1_2.method1857();
								local836 = Static38.anInt907 + (local351 >> 4 & 0x7);
								local371 = (local351 & 0x7) + Static15.anInt473;
								@Pc(1200) byte local1200 = Static64.aClass1_Sub6_Sub1_2.method1860();
								@Pc(1205) Class1_Sub1_Sub2_Sub1_Sub2 local1205;
								if (Static64.anInt1485 == local34) {
									local1205 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1;
								} else {
									local1205 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local34];
								}
								if (local1205 != null) {
									@Pc(1217) Class1_Sub1_Sub3 local1217 = Static108.method1807(local131);
									@Pc(1229) int local1229 = Static102.anIntArrayArrayArray5[Static15.anInt463][local836 + 1][local371 + 1];
									@Pc(1239) int local1239 = Static102.anIntArrayArrayArray5[Static15.anInt463][local836 + 1][local371];
									@Pc(1247) int local1247 = Static102.anIntArrayArrayArray5[Static15.anInt463][local836][local371];
									@Pc(1257) int local1257 = Static102.anIntArrayArrayArray5[Static15.anInt463][local836][local371 + 1];
									@Pc(1267) Class1_Sub1_Sub2_Sub7 local1267 = local1217.method255(local329, local1247, local1239, local319, local1229, local1257);
									if (local1267 != null) {
										Static68.method1138(local371, local836, 0, local30 + 1, local23 + 1, Static15.anInt463, local341, -1, 0);
										local1205.anInt2434 = Static15.anInt471 + local23;
										local1205.aClass1_Sub1_Sub2_Sub7_1 = local1267;
										@Pc(1301) byte local1301;
										if (local1157 > local1200) {
											local1301 = local1157;
											local1157 = local1200;
											local1200 = local1301;
										}
										@Pc(1308) int local1308 = local1217.anInt411;
										local1205.anInt2437 = local30 + Static15.anInt471;
										if (local1137 > local1153) {
											local1301 = local1137;
											local1137 = local1153;
											local1153 = local1301;
										}
										@Pc(1326) int local1326 = local1217.anInt420;
										if (local329 == 1 || local329 == 3) {
											local1326 = local1217.anInt411;
											local1308 = local1217.anInt420;
										}
										local1205.anInt2428 = local1326 * 64 + local836 * 128;
										local1205.anInt2418 = local371 * 128 + local1308 * 64;
										local1205.anInt2436 = Static114.method1996(Static15.anInt463, local1205.anInt2428, local1205.anInt2418);
										local1205.anInt2419 = local1157 + local836;
										local1205.anInt2415 = local1200 + local836;
										local1205.anInt2425 = local1153 + local371;
										local1205.anInt2416 = local371 + local1137;
									}
								}
							}
							if (Static54.anInt2055 == 244) {
								local14 = Static64.aClass1_Sub6_Sub1_2.method1841();
								local23 = (local14 >> 4 & 0x7) + Static38.anInt907;
								local30 = Static15.anInt473 + (local14 & 0x7);
								local34 = Static64.aClass1_Sub6_Sub1_2.method1850();
								if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
									@Pc(1437) Class50 local1437 = Static64.aClass50ArrayArrayArray1[Static15.anInt463][local23][local30];
									if (local1437 != null) {
										for (local995 = (Class1_Sub1_Sub2_Sub4) local1437.method1151(); local995 != null; local995 = (Class1_Sub1_Sub2_Sub4) local1437.method1141()) {
											if (local995.anInt1844 == (local34 & 0x7FFF)) {
												local995.method2076();
												break;
											}
										}
										if (local1437.method1151() == null) {
											Static64.aClass50ArrayArrayArray1[Static15.anInt463][local23][local30] = null;
										}
										Static26.method517(local23, local30);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)V")
	public static void method1494() {
		@Pc(10) int local10 = Static64.aClass1_Sub6_Sub1_2.method1873(8);
		@Pc(20) int local20;
		if (local10 < Static6.anInt319) {
			for (local20 = local10; local20 < Static6.anInt319; local20++) {
				Static83.anIntArray286[Static70.anInt1581++] = Static90.anIntArray69[local20];
			}
		}
		if (Static6.anInt319 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static6.anInt319 = 0;
		for (local20 = 0; local20 < local10; local20++) {
			@Pc(54) int local54 = Static90.anIntArray69[local20];
			@Pc(58) Class1_Sub1_Sub2_Sub1_Sub2 local58 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local54];
			@Pc(63) int local63 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
			if (local63 == 0) {
				Static90.anIntArray69[Static6.anInt319++] = local54;
				local58.anInt2377 = Static15.anInt471;
			} else {
				@Pc(86) int local86 = Static64.aClass1_Sub6_Sub1_2.method1873(2);
				if (local86 == 0) {
					Static90.anIntArray69[Static6.anInt319++] = local54;
					local58.anInt2377 = Static15.anInt471;
					Static96.anIntArray436[Static39.anInt914++] = local54;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local86 == 1) {
						Static90.anIntArray69[Static6.anInt319++] = local54;
						local58.anInt2377 = Static15.anInt471;
						local133 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
						local58.method1688(false, local133);
						local143 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
						if (local143 == 1) {
							Static96.anIntArray436[Static39.anInt914++] = local54;
						}
					} else if (local86 == 2) {
						Static90.anIntArray69[Static6.anInt319++] = local54;
						local58.anInt2377 = Static15.anInt471;
						local133 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
						local58.method1688(true, local133);
						local143 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
						local58.method1688(true, local143);
						@Pc(195) int local195 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
						if (local195 == 1) {
							Static96.anIntArray436[Static39.anInt914++] = local54;
						}
					} else if (local86 == 3) {
						Static83.anIntArray286[Static70.anInt1581++] = local54;
					}
				}
			}
		}
	}
}
