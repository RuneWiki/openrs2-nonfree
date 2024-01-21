import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lclient!ue;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "Lclient!wd;")
	public static Class80 aClass80_121 = Static2.method59("0(U");

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lclient!wd;")
	private static Class80 aClass80_122 = Static2.method59("Loaded textures");

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
	public static int anInt255 = 0;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Lclient!wd;")
	public static Class80 aClass80_123 = Static2.method59("sideicons");

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "Lclient!wd;")
	public static Class80 aClass80_124 = aClass80_122;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
	public static int anInt258 = 0;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lclient!wd;")
	public static Class80 aClass80_125 = Static2.method59("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "J")
	public static volatile long aLong18 = 0L;

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
	public static int anInt262 = 0;

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_126 = Static2.method59("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "[I")
	public static int[] anIntArray23 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public static void method149() {
		Static37.method652(false);
		anInt258 = 0;
		@Pc(8) boolean local8 = true;
		for (@Pc(10) int local10 = 0; local10 < Static8.aByteArrayArray1.length; local10++) {
			if (Static114.anIntArray383[local10] != -1 && Static8.aByteArrayArray1[local10] == null) {
				Static8.aByteArrayArray1[local10] = Static8.aClass11_Sub1_2.method383(0, Static114.anIntArray383[local10]);
				if (Static8.aByteArrayArray1[local10] == null) {
					anInt258++;
					local8 = false;
				}
			}
			if (Static68.anIntArray235[local10] != -1 && Static91.aByteArrayArray7[local10] == null) {
				Static91.aByteArrayArray7[local10] = Static8.aClass11_Sub1_2.method370(Static68.anIntArray235[local10], Static23.anIntArrayArray11[local10], 0);
				if (Static91.aByteArrayArray7[local10] == null) {
					anInt258++;
					local8 = false;
				}
			}
		}
		if (!local8) {
			Static105.anInt2367 = 1;
			return;
		}
		Static121.anInt3086 = 0;
		local8 = true;
		@Pc(114) int local114;
		@Pc(125) int local125;
		for (@Pc(95) int local95 = 0; local95 < Static8.aByteArrayArray1.length; local95++) {
			@Pc(101) byte[] local101 = Static91.aByteArrayArray7[local95];
			if (local101 != null) {
				local114 = (Static103.anIntArray351[local95] >> 8) * 64 - Static57.anInt1736;
				local125 = (Static103.anIntArray351[local95] & 0xFF) * 64 - Static66.anInt1860;
				if (Static2.aBoolean9) {
					local114 = 10;
					local125 = 10;
				}
				local8 &= Static32.method589(local101, local125, local114);
			}
		}
		if (!local8) {
			Static105.anInt2367 = 2;
			return;
		}
		if (Static105.anInt2367 != 0) {
			Static23.method467(Static86.aClass80_835, Static83.aClass80_806, true);
		}
		Static38.method657();
		Static71.method1138();
		Static38.method657();
		Static93.aClass64_1.method1647();
		Static38.method657();
		System.gc();
		for (@Pc(172) int local172 = 0; local172 < 4; local172++) {
			Static17.aClass49Array1[local172].method1169();
		}
		@Pc(195) int local195;
		for (local114 = 0; local114 < 4; local114++) {
			for (local125 = 0; local125 < 104; local125++) {
				for (local195 = 0; local195 < 104; local195++) {
					Static108.aByteArrayArrayArray7[local114][local125][local195] = 0;
				}
			}
		}
		Static38.method657();
		Static44.method736();
		local125 = Static8.aByteArrayArray1.length;
		Static23.method472();
		Static37.method652(true);
		@Pc(252) int local252;
		@Pc(262) int local262;
		@Pc(381) int local381;
		@Pc(320) int local320;
		@Pc(370) int local370;
		if (!Static2.aBoolean9) {
			@Pc(266) byte[] local266;
			for (local195 = 0; local195 < local125; local195++) {
				local252 = (Static103.anIntArray351[local195] >> 8) * 64 - Static57.anInt1736;
				local262 = (Static103.anIntArray351[local195] & 0xFF) * 64 - Static66.anInt1860;
				local266 = Static8.aByteArrayArray1[local195];
				if (local266 != null) {
					Static38.method657();
					Static105.method1440(local252, (Static119.anInt1677 - 6) * 8, local266, local262, (Static78.anInt1997 - 6) * 8, Static17.aClass49Array1);
				}
			}
			for (local252 = 0; local252 < local125; local252++) {
				local262 = (Static103.anIntArray351[local252] >> 8) * 64 - Static57.anInt1736;
				local320 = (Static103.anIntArray351[local252] & 0xFF) * 64 - Static66.anInt1860;
				@Pc(324) byte[] local324 = Static8.aByteArrayArray1[local252];
				if (local324 == null && Static78.anInt1997 < 800) {
					Static38.method657();
					Static43.method707(local262, local320, 64, 64);
				}
			}
			Static37.method652(true);
			for (local262 = 0; local262 < local125; local262++) {
				local266 = Static91.aByteArrayArray7[local262];
				if (local266 != null) {
					local370 = (Static103.anIntArray351[local262] >> 8) * 64 - Static57.anInt1736;
					local381 = (Static103.anIntArray351[local262] & 0xFF) * 64 - Static66.anInt1860;
					Static38.method657();
					Static71.method1140(local370, Static17.aClass49Array1, local381, local266, Static93.aClass64_1);
				}
			}
		}
		@Pc(439) int local439;
		@Pc(451) int local451;
		if (Static2.aBoolean9) {
			@Pc(457) int local457;
			@Pc(467) int local467;
			@Pc(469) int local469;
			for (local195 = 0; local195 < 4; local195++) {
				Static38.method657();
				for (local252 = 0; local252 < 13; local252++) {
					for (local262 = 0; local262 < 13; local262++) {
						@Pc(422) boolean local422 = false;
						local370 = Static37.anIntArrayArrayArray1[local195][local252][local262];
						if (local370 != -1) {
							local439 = local370 >> 1 & 0x3;
							local381 = local370 >> 24 & 0x3;
							local451 = local370 >> 14 & 0x3FF;
							local457 = local370 >> 3 & 0x7FF;
							local467 = local457 / 8 + (local451 / 8 << 8);
							for (local469 = 0; local469 < Static103.anIntArray351.length; local469++) {
								if (Static103.anIntArray351[local469] == local467 && Static8.aByteArrayArray1[local469] != null) {
									local422 = true;
									Static127.method2002(local252 * 8, local439, Static8.aByteArrayArray1[local469], local195, (local457 & 0x7) * 8, (local451 & 0x7) * 8, local381, local262 * 8, Static17.aClass49Array1);
									break;
								}
							}
						}
						if (!local422) {
							Static88.method1319(local195, local262 * 8, local252 * 8);
						}
					}
				}
			}
			for (local252 = 0; local252 < 13; local252++) {
				for (local262 = 0; local262 < 13; local262++) {
					local320 = Static37.anIntArrayArrayArray1[0][local252][local262];
					if (local320 == -1) {
						Static43.method707(local252 * 8, local262 * 8, 8, 8);
					}
				}
			}
			Static37.method652(true);
			for (local262 = 0; local262 < 4; local262++) {
				Static38.method657();
				for (local320 = 0; local320 < 13; local320++) {
					for (local370 = 0; local370 < 13; local370++) {
						local381 = Static37.anIntArrayArrayArray1[local262][local320][local370];
						if (local381 != -1) {
							local439 = local381 >> 24 & 0x3;
							local451 = local381 >> 1 & 0x3;
							local457 = local381 >> 14 & 0x3FF;
							local467 = local381 >> 3 & 0x7FF;
							local469 = (local457 / 8 << 8) + (local467 / 8);
							for (@Pc(658) int local658 = 0; local658 < Static103.anIntArray351.length; local658++) {
								if (local469 == Static103.anIntArray351[local658] && Static91.aByteArrayArray7[local658] != null) {
									Static97.method1583(local439, Static91.aByteArrayArray7[local658], (local467 & 0x7) * 8, local370 * 8, Static93.aClass64_1, (local457 & 0x7) * 8, Static17.aClass49Array1, local451, local320 * 8, local262);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static37.method652(true);
		Static71.method1138();
		Static38.method657();
		Static20.method482(Static93.aClass64_1, Static17.aClass49Array1);
		Static37.method652(true);
		local195 = Static113.anInt2928;
		if (Static16.anInt444 < local195) {
			local195 = Static16.anInt444;
		}
		if (local195 < Static16.anInt444 - 1) {
		}
		if (Static18.aBoolean51) {
			Static93.aClass64_1.method1613(Static113.anInt2928);
		} else {
			Static93.aClass64_1.method1613(0);
		}
		for (local252 = 0; local252 < 104; local252++) {
			for (local262 = 0; local262 < 104; local262++) {
				Static86.method1284(local252, local262);
			}
		}
		Static38.method657();
		Static43.method705();
		Static25.aClass32_16.method878();
		if (Static37.aFrame1 != null) {
			Static120.aClass2_Sub17_Sub1_3.method1799(173);
			Static120.aClass2_Sub17_Sub1_3.method1765(1057001181);
		}
		if (!Static2.aBoolean9) {
			local262 = (Static119.anInt1677 - 6) / 8;
			local370 = (Static78.anInt1997 - 6) / 8;
			local320 = (Static119.anInt1677 + 6) / 8;
			local381 = (Static78.anInt1997 + 6) / 8;
			for (local439 = local262 - 1; local439 <= local320 + 1; local439++) {
				for (local451 = local370 - 1; local451 <= local381 + 1; local451++) {
					if (local439 < local262 || local439 > local320 || local451 < local370 || local451 > local381) {
						Static8.aClass11_Sub1_2.method380(Static93.method1444(new Class80[] { Static35.aClass80_390, Static28.method1422(local439), Static104.aClass80_1027, Static28.method1422(local451) }));
						Static8.aClass11_Sub1_2.method380(Static93.method1444(new Class80[] { Static88.aClass80_852, Static28.method1422(local439), Static104.aClass80_1027, Static28.method1422(local451) }));
					}
				}
			}
		}
		if (Static91.anInt2232 == -1) {
			Static10.method167(30);
		} else {
			Static10.method167(35);
		}
		Static38.method657();
		Static123.method1973();
		Static120.aClass2_Sub17_Sub1_3.method1799(186);
		Static112.method1852();
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
	public static void method150() {
		aClass80_126 = null;
		aClass80_123 = null;
		aClass80_121 = null;
		aByteArrayArray2 = null;
		aClass80_122 = null;
		anIntArray23 = null;
		aClass80_124 = null;
		aClass80_125 = null;
		aClass74_1 = null;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
	public static void method152() {
		for (@Pc(10) Class2_Sub5 local10 = (Class2_Sub5) Static90.aClass58_11.method1285(); local10 != null; local10 = (Class2_Sub5) Static90.aClass58_11.method1281()) {
			if (local10.anInt1505 > 0) {
				local10.anInt1505--;
			}
			if (local10.anInt1505 != 0) {
				if (local10.anInt1512 > 0) {
					local10.anInt1512--;
				}
				if (local10.anInt1512 == 0 && local10.anInt1509 >= 1 && local10.anInt1497 >= 1 && local10.anInt1509 <= 102 && local10.anInt1497 <= 102 && (local10.anInt1510 < 0 || Static82.method1957(local10.anInt1504, local10.anInt1510))) {
					Static19.method429(local10.anInt1511, local10.anInt1497, local10.anInt1502, local10.anInt1510, local10.anInt1509, local10.anInt1500, local10.anInt1504);
					local10.anInt1512 = -1;
					if (local10.anInt1501 == local10.anInt1510 && local10.anInt1501 == -1) {
						local10.method1961();
					} else if (local10.anInt1510 == local10.anInt1501 && local10.anInt1500 == local10.anInt1507 && local10.anInt1504 == local10.anInt1503) {
						local10.method1961();
					}
				}
			} else if (local10.anInt1501 < 0 || Static82.method1957(local10.anInt1503, local10.anInt1501)) {
				Static19.method429(local10.anInt1511, local10.anInt1497, local10.anInt1502, local10.anInt1501, local10.anInt1509, local10.anInt1507, local10.anInt1503);
				local10.method1961();
			}
		}
	}
}
