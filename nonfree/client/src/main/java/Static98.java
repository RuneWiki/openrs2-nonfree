import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "Lclient!jf;")
	public static Class3_Sub1_Sub4_Sub1_Sub2 aClass3_Sub1_Sub4_Sub1_Sub2_1;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_13;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!na;")
	private static Class53 aClass53_1123 = Static109.method1737("Please try using a different world)3");

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_1114 = aClass53_1123;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!na;")
	private static Class53 aClass53_1115 = Static109.method1737("white:");

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_1116 = aClass53_1115;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_1118 = Static109.method1737("wave:");

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_1117 = aClass53_1118;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_1119 = Static109.method1737("Mitteilung");

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!na;")
	private static Class53 aClass53_1120 = Static109.method1737("as it was used to break our rules)3");

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public static volatile int anInt2321 = -1;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1121 = aClass53_1123;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!na;")
	private static Class53 aClass53_1127 = Static109.method1737("No response from server)3");

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_1122 = aClass53_1127;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_1124 = aClass53_1123;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_1125 = aClass53_1123;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "Lclient!na;")
	public static Class53 aClass53_1126 = Static109.method1737("gelb:");

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
	public static int anInt2331 = 0;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "Lclient!na;")
	public static Class53 aClass53_1128 = Static109.method1737("Versteckt");

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "Lclient!na;")
	public static Class53 aClass53_1129 = aClass53_1120;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Lclient!na;")
	public static Class53 aClass53_1130 = aClass53_1123;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "[I")
	public static int[] anIntArray314 = new int[50];

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1131 = aClass53_1115;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "Lclient!na;")
	public static Class53 aClass53_1132 = aClass53_1118;

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_1133 = aClass53_1123;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Z")
	public static boolean method1633(@OriginalArg(1) int arg0) {
		if (Static15.aBooleanArray1[arg0]) {
			return true;
		} else if (Static88.aClass62_17.method1513(arg0)) {
			@Pc(23) int local23 = Static88.aClass62_17.method1507(arg0);
			if (local23 == 0) {
				Static15.aBooleanArray1[arg0] = true;
				return true;
			}
			if (Static107.aClass3_Sub1_Sub15ArrayArray1[arg0] == null) {
				Static107.aClass3_Sub1_Sub15ArrayArray1[arg0] = new Class3_Sub1_Sub15[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static107.aClass3_Sub1_Sub15ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static88.aClass62_17.method1512(arg0, local45);
					if (local59 != null) {
						Static107.aClass3_Sub1_Sub15ArrayArray1[arg0][local45] = new Class3_Sub1_Sub15();
						Static107.aClass3_Sub1_Sub15ArrayArray1[arg0][local45].anInt2686 = (arg0 << 16) + local45;
						if (local59[0] == -1) {
							Static107.aClass3_Sub1_Sub15ArrayArray1[arg0][local45].method1859(new Class3_Sub7(local59));
						} else {
							Static107.aClass3_Sub1_Sub15ArrayArray1[arg0][local45].method1854(new Class3_Sub7(local59));
						}
					}
				}
			}
			Static15.aBooleanArray1[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method1634() {
		Static83.method1429(false);
		@Pc(6) boolean local6 = true;
		Static82.anInt946 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static66.aByteArrayArray3.length; local14++) {
			if (Static11.anIntArray29[local14] != -1 && Static66.aByteArrayArray3[local14] == null) {
				Static66.aByteArrayArray3[local14] = Static7.aClass62_Sub1_2.method1512(Static11.anIntArray29[local14], 0);
				if (Static66.aByteArrayArray3[local14] == null) {
					Static82.anInt946++;
					local6 = false;
				}
			}
			if (Static77.anIntArray258[local14] != -1 && Static120.aByteArrayArray9[local14] == null) {
				Static120.aByteArrayArray9[local14] = Static7.aClass62_Sub1_2.method1498(Static77.anIntArray258[local14], Static22.anIntArrayArray3[local14], 0);
				if (Static120.aByteArrayArray9[local14] == null) {
					Static82.anInt946++;
					local6 = false;
				}
			}
		}
		if (!local6) {
			Static2.anInt56 = 1;
			return;
		}
		local6 = true;
		Static94.anInt2245 = 0;
		@Pc(117) int local117;
		@Pc(128) int local128;
		for (@Pc(98) int local98 = 0; local98 < Static66.aByteArrayArray3.length; local98++) {
			@Pc(104) byte[] local104 = Static120.aByteArrayArray9[local98];
			if (local104 != null) {
				local117 = (Static96.anIntArray182[local98] >> 8) * 64 - Static80.anInt2029;
				local128 = (Static96.anIntArray182[local98] & 0xFF) * 64 - Static4.anInt145;
				if (Static93.aBoolean91) {
					local117 = 10;
					local128 = 10;
				}
				local6 &= Static43.method864(local117, local104, local128);
			}
		}
		if (!local6) {
			Static2.anInt56 = 2;
			return;
		}
		if (Static2.anInt56 != 0) {
			Static18.method295(Static42.aClass53_538, Static75.aClass53_842, true);
		}
		Static40.method820();
		Static54.method1954();
		Static40.method820();
		Static120.aClass39_1.method995();
		Static40.method820();
		System.gc();
		for (@Pc(176) int local176 = 0; local176 < 4; local176++) {
			Static90.aClass9Array1[local176].method150();
		}
		@Pc(197) int local197;
		for (local117 = 0; local117 < 4; local117++) {
			for (local128 = 0; local128 < 104; local128++) {
				for (local197 = 0; local197 < 104; local197++) {
					Static37.aByteArrayArrayArray17[local117][local128][local197] = 0;
				}
			}
		}
		Static40.method820();
		Static56.method1038();
		local128 = Static66.aByteArrayArray3.length;
		Static30.method673();
		Static83.method1429(true);
		@Pc(252) int local252;
		@Pc(263) int local263;
		@Pc(374) int local374;
		@Pc(321) int local321;
		@Pc(364) int local364;
		if (!Static93.aBoolean91) {
			@Pc(267) byte[] local267;
			for (local197 = 0; local197 < local128; local197++) {
				local252 = (Static96.anIntArray182[local197] >> 8) * 64 - Static80.anInt2029;
				local263 = (Static96.anIntArray182[local197] & 0xFF) * 64 - Static4.anInt145;
				local267 = Static66.aByteArrayArray3[local197];
				if (local267 != null) {
					Static40.method820();
					Static100.method1653((Static101.anInt2381 - 6) * 8, Static15.anInt339 * 8 - 48, Static90.aClass9Array1, local252, local263, local267);
				}
			}
			for (local252 = 0; local252 < local128; local252++) {
				local263 = (Static96.anIntArray182[local252] >> 8) * 64 - Static80.anInt2029;
				@Pc(310) byte[] local310 = Static66.aByteArrayArray3[local252];
				local321 = (Static96.anIntArray182[local252] & 0xFF) * 64 - Static4.anInt145;
				if (local310 == null && Static101.anInt2381 < 800) {
					Static40.method820();
					Static51.method943(64, local263, 64, local321);
				}
			}
			Static83.method1429(true);
			for (local263 = 0; local263 < local128; local263++) {
				local267 = Static120.aByteArrayArray9[local263];
				if (local267 != null) {
					local364 = (Static96.anIntArray182[local263] >> 8) * 64 - Static80.anInt2029;
					local374 = (Static96.anIntArray182[local263] & 0xFF) * 64 - Static4.anInt145;
					Static40.method820();
					Static45.method890(local267, Static120.aClass39_1, local374, local364, Static90.aClass9Array1);
				}
			}
		}
		@Pc(426) int local426;
		@Pc(438) int local438;
		if (Static93.aBoolean91) {
			@Pc(444) int local444;
			@Pc(454) int local454;
			@Pc(456) int local456;
			for (local197 = 0; local197 < 4; local197++) {
				Static40.method820();
				for (local252 = 0; local252 < 13; local252++) {
					for (local263 = 0; local263 < 13; local263++) {
						local364 = Static59.anIntArrayArrayArray4[local197][local252][local263];
						@Pc(417) boolean local417 = false;
						if (local364 != -1) {
							local426 = local364 >> 1 & 0x3;
							local374 = local364 >> 24 & 0x3;
							local438 = local364 >> 14 & 0x3FF;
							local444 = local364 >> 3 & 0x7FF;
							local454 = local444 / 8 + (local438 / 8 << 8);
							for (local456 = 0; local456 < Static96.anIntArray182.length; local456++) {
								if (local454 == Static96.anIntArray182[local456] && Static66.aByteArrayArray3[local456] != null) {
									Static36.method769(Static90.aClass9Array1, Static66.aByteArrayArray3[local456], local263 * 8, (local444 & 0x7) * 8, local197, local252 * 8, (local438 & 0x7) * 8, local426, local374);
									local417 = true;
									break;
								}
							}
						}
						if (!local417) {
							Static82.method626(local252 * 8, local263 * 8, local197);
						}
					}
				}
			}
			for (local252 = 0; local252 < 13; local252++) {
				for (local263 = 0; local263 < 13; local263++) {
					local321 = Static59.anIntArrayArrayArray4[0][local252][local263];
					if (local321 == -1) {
						Static51.method943(8, local252 * 8, 8, local263 * 8);
					}
				}
			}
			Static83.method1429(true);
			for (local263 = 0; local263 < 4; local263++) {
				Static40.method820();
				for (local321 = 0; local321 < 13; local321++) {
					for (local364 = 0; local364 < 13; local364++) {
						local374 = Static59.anIntArrayArrayArray4[local263][local321][local364];
						if (local374 != -1) {
							local426 = local374 >> 24 & 0x3;
							local438 = local374 >> 1 & 0x3;
							local444 = local374 >> 14 & 0x3FF;
							local454 = local374 >> 3 & 0x7FF;
							local456 = (local444 / 8 << 8) + local454 / 8;
							for (@Pc(633) int local633 = 0; local633 < Static96.anIntArray182.length; local633++) {
								if (Static96.anIntArray182[local633] == local456 && Static120.aByteArrayArray9[local633] != null) {
									Static27.method517(local321 * 8, local426, Static120.aClass39_1, local438, Static120.aByteArrayArray9[local633], local364 * 8, Static90.aClass9Array1, local263, (local454 & 0x7) * 8, (local444 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static83.method1429(true);
		Static54.method1954();
		Static40.method820();
		Static119.method291(Static90.aClass9Array1, Static120.aClass39_1);
		Static83.method1429(true);
		local197 = Static21.anInt706;
		if (Static72.anInt1813 < local197) {
			local197 = Static72.anInt1813;
		}
		if (local197 < Static72.anInt1813 - 1) {
		}
		if (Static45.aBoolean47) {
			Static120.aClass39_1.method968(Static21.anInt706);
		} else {
			Static120.aClass39_1.method968(0);
		}
		for (local252 = 0; local252 < 104; local252++) {
			for (local263 = 0; local263 < 104; local263++) {
				Static59.method1069(local252, local263);
			}
		}
		Static40.method820();
		Static43.method868();
		Static71.aClass75_48.method1724();
		if (Static91.aFrame1 != null) {
			Static115.aClass3_Sub7_Sub1_3.method662(230);
			Static115.aClass3_Sub7_Sub1_3.method642(1057001181);
		}
		if (!Static93.aBoolean91) {
			local321 = (Static15.anInt339 + 6) / 8;
			local263 = (Static15.anInt339 - 6) / 8;
			local374 = (Static101.anInt2381 + 6) / 8;
			local364 = (Static101.anInt2381 - 6) / 8;
			for (local426 = local263 - 1; local426 <= local321 + 1; local426++) {
				for (local438 = local364 - 1; local438 <= local374 + 1; local438++) {
					if (local263 > local426 || local426 > local321 || local364 > local438 || local374 < local438) {
						Static7.aClass62_Sub1_2.method1511(Static103.method1689(new Class53[] { Static58.aClass53_687, Static108.method1725(local426), Static109.aClass53_1261, Static108.method1725(local438) }));
						Static7.aClass62_Sub1_2.method1511(Static103.method1689(new Class53[] { Static85.aClass53_946, Static108.method1725(local426), Static109.aClass53_1261, Static108.method1725(local438) }));
					}
				}
			}
		}
		if (Static123.anInt2858 == -1) {
			Static103.method1692(30);
		} else {
			Static103.method1692(35);
		}
		Static40.method820();
		Static89.method1463();
		Static115.aClass3_Sub7_Sub1_3.method662(63);
		Static81.method1422();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public static void method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub1_Sub10 local7 = Static58.method1062(arg1);
		@Pc(10) int local10 = local7.anInt2031;
		@Pc(13) int local13 = local7.anInt2034;
		@Pc(16) int local16 = local7.anInt2026;
		@Pc(22) int local22 = Class29.anIntArray133[local16 - local13];
		if (arg0 < 0 || arg0 > local22) {
			arg0 = 0;
		}
		local22 <<= local13;
		Static13.anIntArray31[local10] = local22 & arg0 << local13 | ~local22 & Static13.anIntArray31[local10];
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1636() {
		aClass53_1118 = null;
		aClass53_1121 = null;
		aClass53_1122 = null;
		aClass53_1119 = null;
		aClass53_1131 = null;
		aClass53_1127 = null;
		aClass53_1126 = null;
		aClass53_1133 = null;
		anIntArray314 = null;
		aClass53_1132 = null;
		aClass53_1128 = null;
		aClass53_1125 = null;
		aClass53_1115 = null;
		aClass53_1114 = null;
		aClass53_1123 = null;
		aClass53_1124 = null;
		aClass53_1120 = null;
		aClass53_1129 = null;
		aClass62_Sub1_13 = null;
		aClass53_1130 = null;
		aClass53_1116 = null;
		aByteArrayArray6 = null;
		aClass3_Sub1_Sub4_Sub1_Sub2_1 = null;
		aClass53_1117 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method1637(@OriginalArg(0) Class3_Sub1_Sub4_Sub1 arg0) {
		if (arg0.anInt1416 == Static27.anInt843 || arg0.anInt1442 == -1 || arg0.anInt1460 != 0 || arg0.anInt1456 + 1 > Static97.method1629(arg0.anInt1442).anIntArray305[arg0.anInt1422]) {
			@Pc(34) int local34 = arg0.anInt1416 - arg0.anInt1462;
			@Pc(40) int local40 = Static27.anInt843 - arg0.anInt1462;
			@Pc(50) int local50 = arg0.anInt1453 * 64 + arg0.anInt1454 * 128;
			@Pc(60) int local60 = arg0.anInt1475 * 128 + arg0.anInt1453 * 64;
			@Pc(70) int local70 = arg0.anInt1478 * 128 + arg0.anInt1453 * 64;
			arg0.anInt1427 = (local40 * local70 + local60 * (local34 - local40)) / local34;
			@Pc(93) int local93 = arg0.anInt1461 * 128 + arg0.anInt1453 * 64;
			arg0.anInt1424 = (local50 * (local34 - local40) + local93 * local40) / local34;
		}
		arg0.anInt1476 = 0;
		if (arg0.anInt1479 == 0) {
			arg0.anInt1430 = 1024;
		}
		if (arg0.anInt1479 == 1) {
			arg0.anInt1430 = 1536;
		}
		if (arg0.anInt1479 == 2) {
			arg0.anInt1430 = 0;
		}
		if (arg0.anInt1479 == 3) {
			arg0.anInt1430 = 512;
		}
		arg0.anInt1426 = arg0.anInt1430;
	}
}
