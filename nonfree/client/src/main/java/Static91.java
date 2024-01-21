import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_23;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!rc;")
	public static Class1_Sub12_Sub1 aClass1_Sub12_Sub1_1;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public static int anInt2407;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean134 = true;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[Lclient!ba;")
	public static Class6[] aClass6Array1 = new Class6[4];

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1291 = Static23.method501("Existing user");

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1290 = aClass42_1291;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public static int anInt2400 = 0;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public static int anInt2401 = 0;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public static int anInt2403 = 0;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	public static int[] anIntArray370 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1292 = Static23.method501("backbase2");

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1293 = Static23.method501("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1294 = Static23.method501("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1295 = Static23.method501("Mitteilung");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!fc;III)V")
	public static void method1659(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static83.anInt2216 >= 400) {
			return;
		}
		if (arg1.anIntArray90 != null) {
			arg1 = arg1.method551();
		}
		if (arg1 == null || !arg1.aBoolean36) {
			return;
		}
		@Pc(31) Class42 local31 = arg1.aClass42_414;
		if (arg1.anInt759 != 0) {
			local31 = Static57.method1822(new Class42[] { local31, Static24.method510(arg1.anInt759, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2622), Static11.aClass42_199, Static82.aClass42_1172, Static38.method642(arg1.anInt759), Static82.aClass42_1163 });
		}
		if (Static35.anInt874 == 1) {
			Static69.method1232(arg0, Static57.method1822(new Class42[] { Static53.aClass42_1432, Static60.aClass42_783, local31 }), Static67.aClass42_862, arg2, 45, arg3);
		} else if (Static12.anInt362 != 1) {
			@Pc(80) Class42[] local80 = arg1.aClass42Array5;
			if (Static105.aBoolean148) {
				local80 = Static70.method1258(local80);
			}
			@Pc(94) int local94;
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && !local80[local94].method1040(Static43.aClass42_611)) {
						@Pc(113) byte local113 = 0;
						if (local94 == 0) {
							local113 = 16;
						}
						if (local94 == 1) {
							local113 = 4;
						}
						if (local94 == 2) {
							local113 = 24;
						}
						if (local94 == 3) {
							local113 = 29;
						}
						if (local94 == 4) {
							local113 = 37;
						}
						Static69.method1232(arg0, Static57.method1822(new Class42[] { Static99.aClass42_1353, local31 }), local80[local94], arg2, local113, arg3);
					}
				}
			}
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && local80[local94].method1040(Static43.aClass42_611)) {
						@Pc(198) short local198 = 0;
						@Pc(200) int local200 = 0;
						if (Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2622 < arg1.anInt759) {
							local198 = 2000;
						}
						if (local94 == 0) {
							local200 = local198 + 16;
						}
						if (local94 == 1) {
							local200 = local198 + 4;
						}
						if (local94 == 2) {
							local200 = local198 + 24;
						}
						if (local94 == 3) {
							local200 = local198 + 29;
						}
						if (local94 == 4) {
							local200 = local198 + 37;
						}
						Static69.method1232(arg0, Static57.method1822(new Class42[] { Static99.aClass42_1353, local31 }), local80[local94], arg2, local200, arg3);
					}
				}
			}
			Static69.method1232(arg0, Static57.method1822(new Class42[] { Static99.aClass42_1353, local31 }), Static73.aClass42_970, arg2, 1005, arg3);
			return;
		} else if ((Static82.anInt2193 & 0x2) == 2) {
			Static69.method1232(arg0, Static57.method1822(new Class42[] { Static70.aClass42_916, Static60.aClass42_783, local31 }), Static83.aClass42_1187, arg2, 20, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 method1660() {
		@Pc(8) Class1_Sub1_Sub1_Sub1 local8 = new Class1_Sub1_Sub1_Sub1();
		local8.anInt89 = Static108.anInt2749;
		local8.anInt88 = Static45.anInt1859;
		local8.anInt86 = Static39.anIntArray37[0];
		local8.anInt84 = Static36.anIntArray124[0];
		local8.anInt87 = Static83.anIntArray340[0];
		local8.anInt85 = Static29.anIntArray98[0];
		@Pc(42) byte[] local42 = Static98.aByteArrayArray10[0];
		@Pc(48) int local48 = local8.anInt85 * local8.anInt87;
		local8.anIntArray12 = new int[local48];
		for (@Pc(54) int local54 = 0; local54 < local48; local54++) {
			local8.anIntArray12[local54] = Static69.anIntArray243[local42[local54] & 0xFF];
		}
		Static34.method590();
		return local8;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method1661() {
		Static19.anInt638 = 0;
		@Pc(16) int local16 = (Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 >> 7) + Static51.anInt1373;
		@Pc(23) int local23 = Static45.anInt1843 + (Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 >> 7);
		if (local16 >= 3053 && local16 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static19.anInt638 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static19.anInt638 = 1;
		}
		if (Static19.anInt638 == 1 && local16 >= 3139 && local16 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static19.anInt638 = 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public static void method1662() {
		Static67.method1149(false);
		Static90.anInt2395 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < aByteArrayArray9.length; local14++) {
			if (Static10.anIntArray32[local14] != -1 && aByteArrayArray9[local14] == null) {
				aByteArrayArray9[local14] = Static33.aClass33_Sub1_11.method1305(0, Static10.anIntArray32[local14]);
				if (aByteArrayArray9[local14] == null) {
					Static90.anInt2395++;
					local12 = false;
				}
			}
			if (Static46.anIntArray181[local14] != -1 && Static8.aByteArrayArray1[local14] == null) {
				Static8.aByteArrayArray1[local14] = Static33.aClass33_Sub1_11.method1316(0, Static36.anIntArrayArray11[local14], Static46.anIntArray181[local14]);
				if (Static8.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static90.anInt2395++;
				}
			}
		}
		if (!local12) {
			Static46.anInt1212 = 1;
			return;
		}
		local12 = true;
		Static80.anInt2110 = 0;
		@Pc(127) int local127;
		@Pc(117) int local117;
		for (@Pc(98) int local98 = 0; local98 < aByteArrayArray9.length; local98++) {
			@Pc(104) byte[] local104 = Static8.aByteArrayArray1[local98];
			if (local104 != null) {
				local117 = (Static20.anIntArray52[local98] & 0xFF) * 64 - Static45.anInt1843;
				local127 = (Static20.anIntArray52[local98] >> 8) * 64 - Static51.anInt1373;
				if (Static101.aBoolean143) {
					local117 = 10;
					local127 = 10;
				}
				local12 &= Static21.method447(local104, local117, local127);
			}
		}
		if (!local12) {
			Static46.anInt1212 = 2;
			return;
		}
		if (Static46.anInt1212 != 0) {
			Static19.method440(true, Static42.aClass42_1389, Static5.aClass42_92);
		}
		Static67.method1151();
		Static88.aClass20_1.method499();
		System.gc();
		for (@Pc(173) int local173 = 0; local173 < 4; local173++) {
			aClass6Array1[local173].method114();
		}
		@Pc(196) int local196;
		for (local127 = 0; local127 < 4; local127++) {
			for (local117 = 0; local117 < 104; local117++) {
				for (local196 = 0; local196 < 104; local196++) {
					Static61.aByteArrayArrayArray7[local127][local117][local196] = 0;
				}
			}
		}
		Static77.method1416();
		local117 = aByteArrayArray9.length;
		Static59.method1422();
		Static67.method1149(true);
		@Pc(249) int local249;
		@Pc(263) int local263;
		@Pc(369) int local369;
		@Pc(314) int local314;
		@Pc(358) int local358;
		if (!Static101.aBoolean143) {
			@Pc(253) byte[] local253;
			for (local196 = 0; local196 < local117; local196++) {
				local249 = (Static20.anIntArray52[local196] >> 8) * 64 - Static51.anInt1373;
				local253 = aByteArrayArray9[local196];
				local263 = (Static20.anIntArray52[local196] & 0xFF) * 64 - Static45.anInt1843;
				if (local253 != null) {
					Static42.method1759(local249, Static2.anInt98 * 8 - 48, local263, (Static89.anInt2380 - 6) * 8, local253, aClass6Array1);
				}
			}
			for (local249 = 0; local249 < local117; local249++) {
				local263 = (Static20.anIntArray52[local249] >> 8) * 64 - Static51.anInt1373;
				local314 = (Static20.anIntArray52[local249] & 0xFF) * 64 - Static45.anInt1843;
				@Pc(318) byte[] local318 = aByteArrayArray9[local249];
				if (local318 == null && Static89.anInt2380 < 800) {
					Static92.method1676(local314, 64, 64, local263);
				}
			}
			Static67.method1149(true);
			for (local263 = 0; local263 < local117; local263++) {
				local253 = Static8.aByteArrayArray1[local263];
				if (local253 != null) {
					local358 = (Static20.anIntArray52[local263] >> 8) * 64 - Static51.anInt1373;
					local369 = (Static20.anIntArray52[local263] & 0xFF) * 64 - Static45.anInt1843;
					Static95.method1688(local369, local358, local253, aClass6Array1, Static88.aClass20_1);
				}
			}
		}
		@Pc(424) int local424;
		@Pc(430) int local430;
		if (Static101.aBoolean143) {
			@Pc(436) int local436;
			@Pc(446) int local446;
			@Pc(448) int local448;
			for (local196 = 0; local196 < 4; local196++) {
				for (local249 = 0; local249 < 13; local249++) {
					for (local263 = 0; local263 < 13; local263++) {
						local358 = Static36.anIntArrayArrayArray4[local196][local249][local263];
						@Pc(408) boolean local408 = false;
						if (local358 != -1) {
							local369 = local358 >> 24 & 0x3;
							local424 = local358 >> 1 & 0x3;
							local430 = local358 >> 14 & 0x3FF;
							local436 = local358 >> 3 & 0x7FF;
							local446 = local436 / 8 + (local430 / 8 << 8);
							for (local448 = 0; local448 < Static20.anIntArray52.length; local448++) {
								if (local446 == Static20.anIntArray52[local448] && aByteArrayArray9[local448] != null) {
									Static48.method858(local249 * 8, local369, local263 * 8, (local436 & 0x7) * 8, (local430 & 0x7) * 8, local196, local424, aByteArrayArray9[local448], aClass6Array1);
									local408 = true;
									break;
								}
							}
						}
						if (!local408) {
							Static68.method1168(local196, local263 * 8, local249 * 8);
						}
					}
				}
			}
			for (local249 = 0; local249 < 13; local249++) {
				for (local263 = 0; local263 < 13; local263++) {
					local314 = Static36.anIntArrayArrayArray4[0][local249][local263];
					if (local314 == -1) {
						Static92.method1676(local263 * 8, 8, 8, local249 * 8);
					}
				}
			}
			Static67.method1149(true);
			for (local263 = 0; local263 < 4; local263++) {
				for (local314 = 0; local314 < 13; local314++) {
					for (local358 = 0; local358 < 13; local358++) {
						local369 = Static36.anIntArrayArrayArray4[local263][local314][local358];
						if (local369 != -1) {
							local424 = local369 >> 24 & 0x3;
							local430 = local369 >> 1 & 0x3;
							local446 = local369 >> 3 & 0x7FF;
							local436 = local369 >> 14 & 0x3FF;
							local448 = (local436 / 8 << 8) + local446 / 8;
							for (@Pc(624) int local624 = 0; local624 < Static20.anIntArray52.length; local624++) {
								if (local448 == Static20.anIntArray52[local624] && Static8.aByteArrayArray1[local624] != null) {
									Static18.method424(Static8.aByteArrayArray1[local624], local263, local424, (local436 & 0x7) * 8, local430, aClass6Array1, Static88.aClass20_1, local358 * 8, (local446 & 0x7) * 8, local314 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static67.method1149(true);
		Static67.method1151();
		Static80.method1482(aClass6Array1, Static88.aClass20_1);
		Static67.method1149(true);
		local196 = Static75.anInt1419;
		if (Static82.anInt2165 < local196) {
			local196 = Static82.anInt2165;
		}
		if (local196 < Static82.anInt2165 - 1) {
		}
		if (Static75.aBoolean85) {
			Static88.aClass20_1.method461(Static75.anInt1419);
		} else {
			Static88.aClass20_1.method461(0);
		}
		for (local249 = 0; local249 < 104; local249++) {
			for (local263 = 0; local263 < 104; local263++) {
				Static90.method1658(local263, local249);
			}
		}
		Static70.method1261();
		Static38.aClass37_15.method976();
		if (Static15.aFrame1 != null) {
			Static98.aClass1_Sub8_Sub1_3.method1236(98);
			Static98.aClass1_Sub8_Sub1_3.method1218(1057001181);
		}
		if (!Static101.aBoolean143) {
			local263 = (Static2.anInt98 - 6) / 8;
			local314 = (Static2.anInt98 + 6) / 8;
			local358 = (Static89.anInt2380 - 6) / 8;
			local369 = (Static89.anInt2380 + 6) / 8;
			for (local424 = local263 - 1; local424 <= local314 + 1; local424++) {
				for (local430 = local358 - 1; local430 <= local369 + 1; local430++) {
					if (local424 < local263 || local314 < local424 || local358 > local430 || local369 < local430) {
						Static33.aClass33_Sub1_11.method1301(Static57.method1822(new Class42[] { Static67.aClass42_863, Static38.method642(local424), Static25.aClass42_395, Static38.method642(local430) }));
						Static33.aClass33_Sub1_11.method1301(Static57.method1822(new Class42[] { Static46.aClass42_663, Static38.method642(local424), Static25.aClass42_395, Static38.method642(local430) }));
					}
				}
			}
		}
		if (Static43.anInt1144 == -1) {
			Static12.method278(30);
		} else {
			Static12.method278(35);
		}
		Static57.method1823();
		Static98.aClass1_Sub8_Sub1_3.method1236(99);
		Static45.method1300();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method1663() {
		aClass42_1295 = null;
		aClass42_1294 = null;
		aClass1_Sub12_Sub1_1 = null;
		aClass42_1291 = null;
		aByteArrayArray9 = null;
		aClass1_Sub1_Sub1_Sub4_23 = null;
		aClass42_1293 = null;
		aClass42_1292 = null;
		anIntArray370 = null;
		aClass42_1290 = null;
		aClass6Array1 = null;
	}
}
