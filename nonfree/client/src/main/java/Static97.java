import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	public static int anInt2635;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array7;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "[Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4[] aClass5_Sub2_Sub6_Sub4Array5;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1113 = Static63.method1251("Loading ignore list");

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1114 = aClass45_1113;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1115 = Static63.method1251("Einloggen");

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1116 = Static63.method1251("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1119 = Static63.method1251("Bad session id)3");

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1117 = aClass45_1119;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1118 = Static63.method1251("Die Verbindung konnte");

	@OriginalMember(owner = "client!re", name = "r", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1120 = Static63.method1251("hitmarks");

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1121 = Static63.method1251("(U5");

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	public static int anInt2643 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!f;IIIB)V")
	public static void method1801(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class5_Sub11 local3 = new Class5_Sub11();
		local3.anInt1337 = arg1.anInt833;
		local3.anInt1341 = arg0 * 128;
		local3.anIntArray216 = arg1.anIntArray141;
		local3.anInt1338 = arg1.anInt850;
		local3.anInt1336 = arg4 * 128;
		local3.anInt1330 = arg1.anInt855;
		local3.anInt1332 = arg3;
		local3.anInt1333 = arg1.anInt860 * 128;
		@Pc(50) int local50 = arg1.anInt839;
		@Pc(53) int local53 = arg1.anInt829;
		if (arg2 == 1 || arg2 == 3) {
			local53 = arg1.anInt839;
			local50 = arg1.anInt829;
		}
		local3.anInt1329 = (local50 + arg4) * 128;
		local3.anInt1343 = (local53 + arg0) * 128;
		if (arg1.anIntArray143 != null) {
			local3.aClass5_Sub2_Sub7_1 = arg1;
			local3.method977();
		}
		Static48.aClass10_7.method234(local3);
		if (local3.anIntArray216 != null) {
			local3.anInt1328 = (int) ((double) (local3.anInt1338 - local3.anInt1337) * Math.random()) + local3.anInt1337;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method1802() {
		aClass45_1117 = null;
		aClass5_Sub2_Sub6_Sub4Array5 = null;
		aClass45_1113 = null;
		aClass45_1120 = null;
		aClass45_1121 = null;
		aClass45_1115 = null;
		aClass45_1118 = null;
		anIntArray399 = null;
		aClass5_Sub2_Sub6_Sub3Array7 = null;
		anIntArray400 = null;
		aClass45_1114 = null;
		aClass45_1116 = null;
		aClass45_1119 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLclient!b;B)V")
	public static void method1803(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class7 arg1) {
		if (Static1.aClass7_1 != null) {
			try {
				Static1.aClass7_1.method73();
			} catch (@Pc(14) Exception local14) {
			}
			Static1.aClass7_1 = null;
		}
		Static1.aClass7_1 = arg1;
		Static3.method63(arg0);
		Static107.aClass5_Sub2_Sub11_1 = null;
		Static13.anInt415 = 0;
		Static104.aClass5_Sub9_5 = null;
		Static57.aClass5_Sub9_2.anInt2140 = 0;
		while (true) {
			@Pc(39) Class5_Sub2_Sub11 local39 = (Class5_Sub2_Sub11) Static45.aClass66_7.method1815();
			if (local39 == null) {
				while (true) {
					local39 = (Class5_Sub2_Sub11) Static34.aClass66_4.method1815();
					if (local39 == null) {
						if (Static99.aByte5 != 0) {
							try {
								@Pc(91) Class5_Sub9 local91 = new Class5_Sub9(4);
								local91.method1428(4);
								local91.method1428(Static99.aByte5);
								local91.method1455(0);
								Static1.aClass7_1.method80(4, local91.aByteArray28);
							} catch (@Pc(114) IOException local114) {
								try {
									Static1.aClass7_1.method73();
								} catch (@Pc(119) Exception local119) {
								}
								Static1.aClass7_1 = null;
								Static45.anInt1314++;
							}
						}
						Static19.anInt629 = 0;
						Static78.aLong99 = Static62.method1228();
						return;
					}
					Static101.aClass49_2.method1471(local39);
					Static90.aClass66_9.method1811(local39.aLong146, local39);
					Static52.anInt3132++;
					Static7.anInt199--;
				}
			}
			Static27.aClass66_2.method1811(local39.aLong146, local39);
			Static84.anInt2339--;
			Static75.anInt2176++;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1804() {
		if (Static96.anInt2617 != 0 || Static104.aClass5_Sub2_Sub8_5 != null) {
			return;
		}
		@Pc(18) int local18 = Static28.anInt881;
		if (Static13.aBoolean12 && Static67.anInt1906 >= 516 && Static36.anInt1063 >= 160 && Static67.anInt1906 <= 765 && Static36.anInt1063 <= 205) {
			local18 = 0;
		}
		@Pc(49) int local49;
		@Pc(47) int local47;
		@Pc(112) int local112;
		if (!Static2.aBoolean2) {
			if (local18 == 1 && Static14.anInt426 > 0) {
				local49 = Static2.anIntArray5[Static14.anInt426 - 1];
				if (local49 == 35 || local49 == 31 || local49 == 26 || local49 == 44 || local49 == 25 || local49 == 53 || local49 == 49 || local49 == 22 || local49 == 50 || local49 == 24 || local49 == 37 || local49 == 1004) {
					local47 = Static16.anIntArray69[Static14.anInt426 - 1];
					local112 = Static35.anIntArray163[Static14.anInt426 - 1];
					@Pc(284) Class5_Sub2_Sub8 local284 = Static80.method1507(local112);
					if (Static81.method1512(Static74.method1700(local284)) || Static74.method1699(Static74.method1700(local284))) {
						Static100.anInt2686 = Static67.anInt1906;
						Static119.anInt3088 = Static36.anInt1063;
						Static50.anInt1603 = local112;
						Static37.aBoolean55 = false;
						Static96.anInt2617 = 2;
						if (Static63.anInt1837 == local112 >> 16) {
							Static96.anInt2617 = 1;
						}
						Static70.anInt2022 = local47;
						if (local112 >> 16 == Static67.anInt1909) {
							Static96.anInt2617 = 3;
						}
						Static100.anInt2701 = 0;
						return;
					}
				}
			}
			if (local18 == 1 && (Static75.anInt2180 == 1 || Static5.method77(Static14.anInt426 - 1)) && Static14.anInt426 > 2) {
				local18 = 2;
			}
			if (local18 == 1 && Static14.anInt426 > 0) {
				Static34.method689(Static14.anInt426 - 1);
			}
			if (local18 != 2 || Static14.anInt426 <= 0) {
				return;
			}
			method1807();
			return;
		}
		if (local18 != 1) {
			local47 = Static47.anInt1354;
			local49 = Static14.anInt425;
			if (anInt2635 == 0) {
				local47 -= 4;
				local49 -= 4;
			}
			if (anInt2635 == 1) {
				local47 -= 205;
				local49 -= 553;
			}
			if (anInt2635 == 2) {
				local49 -= 17;
				local47 -= 357;
			}
			if (local49 < Static90.anInt2532 - 10 || Static102.anInt2742 + Static90.anInt2532 + 10 < local49 || local47 < Static40.anInt1178 - 10 || local47 > Static74.anInt2511 + Static40.anInt1178 + 10) {
				if (anInt2635 == 1) {
					Static72.aBoolean99 = true;
				}
				Static2.aBoolean2 = false;
				if (anInt2635 == 2) {
					Static51.aBoolean81 = true;
				}
			}
		}
		if (local18 != 1) {
			return;
		}
		local49 = Static90.anInt2532;
		local47 = Static40.anInt1178;
		local112 = Static102.anInt2742;
		@Pc(114) int local114 = -1;
		@Pc(116) int local116 = Static67.anInt1906;
		@Pc(118) int local118 = Static36.anInt1063;
		if (anInt2635 == 0) {
			local118 -= 4;
			local116 -= 4;
		}
		if (anInt2635 == 1) {
			local118 -= 205;
			local116 -= 553;
		}
		if (anInt2635 == 2) {
			local116 -= 17;
			local118 -= 357;
		}
		for (@Pc(138) int local138 = 0; local138 < Static14.anInt426; local138++) {
			@Pc(153) int local153 = local47 + (-local138 + (Static14.anInt426 - 1)) * 15 + 31;
			if (local116 > local49 && local116 < local49 + local112 && local153 - 13 < local118 && local153 + 3 > local118) {
				local114 = local138;
			}
		}
		if (local114 != -1) {
			Static34.method689(local114);
		}
		if (anInt2635 == 2) {
			Static51.aBoolean81 = true;
		}
		Static2.aBoolean2 = false;
		if (anInt2635 == 1) {
			Static72.aBoolean99 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
	public static void method1805(@OriginalArg(1) boolean arg0) {
		Static2.aBoolean3 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		@Pc(126) int local126;
		@Pc(149) int local149;
		@Pc(153) int local153;
		@Pc(157) int local157;
		if (!Static2.aBoolean3) {
			local13 = Static70.aClass5_Sub9_Sub1_3.method1452();
			local17 = Static70.aClass5_Sub9_Sub1_3.method1452();
			local22 = (Static69.anInt1989 - Static70.aClass5_Sub9_Sub1_3.anInt2140) / 16;
			Static71.anIntArrayArray21 = new int[local22][4];
			for (local26 = 0; local26 < local22; local26++) {
				for (local30 = 0; local30 < 4; local30++) {
					Static71.anIntArrayArray21[local26][local30] = Static70.aClass5_Sub9_Sub1_3.method1442();
				}
			}
			local30 = Static70.aClass5_Sub9_Sub1_3.method1435();
			@Pc(383) boolean local383 = false;
			local37 = Static70.aClass5_Sub9_Sub1_3.method1408();
			local126 = Static70.aClass5_Sub9_Sub1_3.method1418();
			Static76.anIntArray309 = new int[local22];
			Static31.aByteArrayArray4 = new byte[local22][];
			Static63.anIntArray281 = new int[local22];
			Static33.anIntArray158 = new int[local22];
			if ((local13 / 8 == 48 || local13 / 8 == 49) && (local126 / 8) == 48) {
				local383 = true;
			}
			if (local13 / 8 == 48 && local126 / 8 == 148) {
				local383 = true;
			}
			Static79.aByteArrayArray7 = new byte[local22][];
			local22 = 0;
			for (local149 = (local13 - 6) / 8; local149 <= (local13 + 6) / 8; local149++) {
				for (local153 = (local126 - 6) / 8; local153 <= (local126 + 6) / 8; local153++) {
					local157 = local153 + (local149 << 8);
					if (!local383 || local153 != 49 && local153 != 149 && local153 != 147 && local149 != 50 && (local149 != 49 || local153 != 47)) {
						Static33.anIntArray158[local22] = local157;
						Static76.anIntArray309[local22] = Static46.aClass29_Sub1_17.method746(Static39.method1443(new Class45[] { Static10.aClass45_166, Static76.method1476(local149), Static81.aClass45_960, Static76.method1476(local153) }));
						Static63.anIntArray281[local22] = Static46.aClass29_Sub1_17.method746(Static39.method1443(new Class45[] { Static96.aClass45_1103, Static76.method1476(local149), Static81.aClass45_960, Static76.method1476(local153) }));
						local22++;
					}
				}
			}
			Static44.method949(local126, local17, local30, local37, local13);
			return;
		}
		local13 = Static70.aClass5_Sub9_Sub1_3.method1444();
		local17 = Static70.aClass5_Sub9_Sub1_3.method1435();
		Static70.aClass5_Sub9_Sub1_3.method1462();
		for (local22 = 0; local22 < 4; local22++) {
			for (local26 = 0; local26 < 13; local26++) {
				for (local30 = 0; local30 < 13; local30++) {
					local37 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
					if (local37 == 1) {
						Static73.anIntArrayArrayArray7[local22][local26][local30] = Static70.aClass5_Sub9_Sub1_3.method1456(26);
					} else {
						Static73.anIntArrayArrayArray7[local22][local26][local30] = -1;
					}
				}
			}
		}
		Static70.aClass5_Sub9_Sub1_3.method1464();
		local26 = (Static69.anInt1989 - Static70.aClass5_Sub9_Sub1_3.anInt2140) / 16;
		Static71.anIntArrayArray21 = new int[local26][4];
		for (local30 = 0; local30 < local26; local30++) {
			for (local37 = 0; local37 < 4; local37++) {
				Static71.anIntArrayArray21[local30][local37] = Static70.aClass5_Sub9_Sub1_3.method1442();
			}
		}
		local37 = Static70.aClass5_Sub9_Sub1_3.method1418();
		local126 = Static70.aClass5_Sub9_Sub1_3.method1418();
		@Pc(130) int local130 = Static70.aClass5_Sub9_Sub1_3.method1408();
		Static79.aByteArrayArray7 = new byte[local26][];
		Static63.anIntArray281 = new int[local26];
		Static76.anIntArray309 = new int[local26];
		Static33.anIntArray158 = new int[local26];
		Static31.aByteArrayArray4 = new byte[local26][];
		local26 = 0;
		for (local149 = 0; local149 < 4; local149++) {
			for (local153 = 0; local153 < 13; local153++) {
				for (local157 = 0; local157 < 13; local157++) {
					@Pc(167) int local167 = Static73.anIntArrayArrayArray7[local149][local153][local157];
					if (local167 != -1) {
						@Pc(176) int local176 = local167 >> 14 & 0x3FF;
						@Pc(182) int local182 = local167 >> 3 & 0x7FF;
						@Pc(192) int local192 = (local176 / 8 << 8) + local182 / 8;
						for (@Pc(194) int local194 = 0; local194 < local26; local194++) {
							if (Static33.anIntArray158[local194] == local192) {
								local192 = -1;
								break;
							}
						}
						if (local192 != -1) {
							Static33.anIntArray158[local26] = local192;
							@Pc(225) int local225 = local192 & 0xFF;
							@Pc(231) int local231 = local192 >> 8 & 0xFF;
							Static76.anIntArray309[local26] = Static46.aClass29_Sub1_17.method746(Static39.method1443(new Class45[] { Static10.aClass45_166, Static76.method1476(local231), Static81.aClass45_960, Static76.method1476(local225) }));
							Static63.anIntArray281[local26] = Static46.aClass29_Sub1_17.method746(Static39.method1443(new Class45[] { Static96.aClass45_1103, Static76.method1476(local231), Static81.aClass45_960, Static76.method1476(local225) }));
							local26++;
						}
					}
				}
			}
		}
		Static44.method949(local13, local37, local126, local130, local17);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	public static void method1806() {
		Static70.aClass5_Sub9_Sub1_3.method1462();
		@Pc(11) int local11 = Static70.aClass5_Sub9_Sub1_3.method1456(8);
		@Pc(16) int local16;
		if (local11 < Static62.anInt1819) {
			for (local16 = local11; local16 < Static62.anInt1819; local16++) {
				Static79.anIntArray313[Static4.anInt106++] = Static70.anIntArray297[local16];
			}
		}
		if (local11 > Static62.anInt1819) {
			throw new RuntimeException("gnpov1");
		}
		Static62.anInt1819 = 0;
		for (local16 = 0; local16 < local11; local16++) {
			@Pc(56) int local56 = Static70.anIntArray297[local16];
			@Pc(60) Class5_Sub2_Sub4_Sub3_Sub2 local60 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local56];
			@Pc(65) int local65 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
			if (local65 == 0) {
				Static70.anIntArray297[Static62.anInt1819++] = local56;
				local60.anInt2406 = Static3.anInt94;
			} else {
				@Pc(87) int local87 = Static70.aClass5_Sub9_Sub1_3.method1456(2);
				if (local87 == 0) {
					Static70.anIntArray297[Static62.anInt1819++] = local56;
					local60.anInt2406 = Static3.anInt94;
					Static104.anIntArray425[Static79.anInt2240++] = local56;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local87 == 1) {
						Static70.anIntArray297[Static62.anInt1819++] = local56;
						local60.anInt2406 = Static3.anInt94;
						local133 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
						local60.method1619(false, local133);
						local143 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
						if (local143 == 1) {
							Static104.anIntArray425[Static79.anInt2240++] = local56;
						}
					} else if (local87 == 2) {
						Static70.anIntArray297[Static62.anInt1819++] = local56;
						local60.anInt2406 = Static3.anInt94;
						local133 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
						local60.method1619(true, local133);
						local143 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
						local60.method1619(true, local143);
						@Pc(194) int local194 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
						if (local194 == 1) {
							Static104.anIntArray425[Static79.anInt2240++] = local56;
						}
					} else if (local87 == 3) {
						Static79.anIntArray313[Static4.anInt106++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method1807() {
		@Pc(14) int local14 = Static8.aClass5_Sub2_Sub6_Sub1_1.method520(Static2.aClass45_8);
		@Pc(24) int local24;
		for (@Pc(16) int local16 = 0; local16 < Static14.anInt426; local16++) {
			local24 = Static8.aClass5_Sub2_Sub6_Sub1_1.method501(Static35.aClass45Array10[local16]);
			if (local14 < local24) {
				local14 = local24;
			}
		}
		local14 += 8;
		local24 = Static14.anInt426 * 15 + 21;
		@Pc(70) int local70;
		@Pc(83) int local83;
		if (Static101.anInt1036 != -1) {
			Static102.anInt2742 = local14;
			Static74.anInt2511 = Static14.anInt426 * 15 + 22;
			anInt2635 = 0;
			Static2.aBoolean2 = true;
			local70 = Static67.anInt1906 - local14 / 2;
			if (local70 + local14 > 765) {
				local70 = 765 - local14;
			}
			local83 = Static36.anInt1063;
			if (local83 + local24 > 503) {
				local83 = 503 - local24;
			}
			if (local83 < 0) {
				local83 = 0;
			}
			Static40.anInt1178 = local83;
			if (local70 < 0) {
				local70 = 0;
			}
			Static90.anInt2532 = local70;
		} else if (Static67.anInt1906 > 4 && Static36.anInt1063 > 4 && Static67.anInt1906 < 516 && Static36.anInt1063 < 338) {
			Static102.anInt2742 = local14;
			anInt2635 = 0;
			Static74.anInt2511 = Static14.anInt426 * 15 + 22;
			local70 = Static67.anInt1906 - local14 / 2 - 4;
			if (local14 + local70 > 512) {
				local70 = 512 - local14;
			}
			Static2.aBoolean2 = true;
			if (local70 < 0) {
				local70 = 0;
			}
			Static90.anInt2532 = local70;
			local83 = Static36.anInt1063 - 4;
			if (local24 + local83 > 334) {
				local83 = 334 - local24;
			}
			if (local83 < 0) {
				local83 = 0;
			}
			Static40.anInt1178 = local83;
		} else if (Static67.anInt1906 > 553 && Static36.anInt1063 > 205 && Static67.anInt1906 < 743 && Static36.anInt1063 < 466) {
			Static102.anInt2742 = local14;
			Static2.aBoolean2 = true;
			local70 = Static67.anInt1906 - local14 / 2 - 553;
			Static74.anInt2511 = Static14.anInt426 * 15 + 22;
			anInt2635 = 1;
			local83 = Static36.anInt1063 - 205;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 + local14 > 190) {
				local70 = 190 - local14;
			}
			if (local83 < 0) {
				local83 = 0;
			} else if (local24 + local83 > 261) {
				local83 = 261 - local24;
			}
			Static40.anInt1178 = local83;
			Static90.anInt2532 = local70;
		} else if (Static67.anInt1906 > 17 && Static36.anInt1063 > 357 && Static67.anInt1906 < 496 && Static36.anInt1063 < 453) {
			Static2.aBoolean2 = true;
			Static74.anInt2511 = Static14.anInt426 * 15 + 22;
			anInt2635 = 2;
			local83 = Static36.anInt1063 - 357;
			Static102.anInt2742 = local14;
			if (local83 < 0) {
				local83 = 0;
			} else if (local24 + local83 > 96) {
				local83 = 96 - local24;
			}
			Static40.anInt1178 = local83;
			local70 = Static67.anInt1906 - local14 / 2 - 17;
			if (local70 < 0) {
				local70 = 0;
			} else if (local14 + local70 > 479) {
				local70 = 479 - local14;
			}
			Static90.anInt2532 = local70;
		}
	}
}
