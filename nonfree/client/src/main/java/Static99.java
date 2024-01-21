import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Lclient!k;")
	public static Class33 aClass33_41;

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_44;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
	public static int anInt2540;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
	public static int anInt2541;

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "Lclient!cd;")
	public static Class12 aClass12_3;

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lclient!gb;")
	public static Class20 aClass20_12;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "[I")
	public static int[] anIntArray368 = new int[128];

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1143 = Static24.method441("Duell akzeptieren");

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1144 = null;

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
	public static int anInt2539 = 0;

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1145 = Static24.method441("Create a free account");

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1146 = Static24.method441("::clientdrop");

	@OriginalMember(owner = "client!tc", name = "N", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1147 = Static24.method441("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1148 = aClass65_1145;

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1149 = Static24.method441("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "[Lclient!ac;")
	public static Class3[] aClass3Array3 = new Class3[12];

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1150 = Static24.method441("Entfernen");

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
	public static int anInt2544 = -1;

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
	public static int anInt2547 = 0;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(BI)V")
	public static void method1562(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static90.aClass2_Sub1_Sub4_Sub2_6.anIntArray105;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(41) int local41;
		@Pc(43) int local43;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local41 = (52736 - local29 * 512) * 4 + 24628;
			for (local43 = 1; local43 < 103; local43++) {
				if ((Static50.aByteArrayArrayArray6[arg0][local43][local29] & 0x18) == 0) {
					Static67.aClass18_1.method615(local8, local41, arg0, local43, local29);
				}
				if (arg0 < 3 && (Static50.aByteArrayArrayArray6[arg0 + 1][local43][local29] & 0x8) != 0) {
					Static67.aClass18_1.method615(local8, local41, arg0 + 1, local43, local29);
				}
				local41 += 4;
			}
		}
		Static90.aClass2_Sub1_Sub4_Sub2_6.method480();
		local41 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
		local43 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 < 103; local149++) {
			for (local153 = 1; local153 < 103; local153++) {
				if ((Static50.aByteArrayArrayArray6[arg0][local153][local149] & 0x18) == 0) {
					Static52.method931(local41, local153, local149, local43, arg0);
				}
				if (arg0 < 3 && (Static50.aByteArrayArrayArray6[arg0 + 1][local153][local149] & 0x8) != 0) {
					Static52.method931(local41, local153, local149, local43, arg0 + 1);
				}
			}
		}
		Static9.anInt314 = 0;
		for (local153 = 0; local153 < 104; local153++) {
			for (@Pc(228) int local228 = 0; local228 < 104; local228++) {
				@Pc(236) int local236 = Static67.aClass18_1.method608(Static62.anInt1879, local153, local228);
				if (local236 != 0) {
					local236 = local236 >> 14 & 0x7FFF;
					@Pc(252) int local252 = Static29.method518(local236).anInt2646;
					if (local252 >= 0) {
						@Pc(256) int local256 = local153;
						@Pc(258) int local258 = local228;
						if (local252 != 22 && local252 != 29 && local252 != 34 && local252 != 36 && local252 != 46 && local252 != 47 && local252 != 48) {
							@Pc(292) int[][] local292 = Static84.aClass58Array1[Static62.anInt1879].anIntArrayArray25;
							for (@Pc(294) int local294 = 0; local294 < 10; local294++) {
								@Pc(301) int local301 = (int) (Math.random() * 4.0D);
								if (local301 == 0 && local256 > 0 && local256 > local153 - 3 && (local292[local256 - 1][local258] & 0x1280108) == 0) {
									local256--;
								}
								if (local301 == 1 && local256 < 103 && local153 + 3 > local256 && (local292[local256 + 1][local258] & 0x1280180) == 0) {
									local256++;
								}
								if (local301 == 2 && local258 > 0 && local258 > local228 - 3 && (local292[local256][local258 - 1] & 0x1280102) == 0) {
									local258--;
								}
								if (local301 == 3 && local258 < 103 && local258 < local228 + 3 && (local292[local256][local258 + 1] & 0x1280120) == 0) {
									local258++;
								}
							}
						}
						Static16.aClass2_Sub1_Sub4_Sub2Array5[Static9.anInt314] = Static45.aClass2_Sub1_Sub4_Sub2Array7[local252];
						Static76.anIntArray300[Static9.anInt314] = local256;
						Static102.anIntArray408[Static9.anInt314] = local258;
						Static9.anInt314++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)I")
	public static int method1565(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static60.anIntArray246[arg0];
		@Pc(11) int local11 = (local3 * Static3.anInt158 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V")
	public static void method1566(@OriginalArg(0) int arg0) {
		if (!Static48.method845()) {
			return;
		}
		if (Static40.aBoolean77) {
			Static42.anInt1349 = arg0;
		} else {
			Static4.method97(arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	public static void method1567() {
		Static59.aClass2_Sub8_Sub1_19.method1421();
		@Pc(16) int local16 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
		if (local16 == 0) {
			return;
		}
		@Pc(27) int local27 = Static59.aClass2_Sub8_Sub1_19.method1419(2);
		if (local27 == 0) {
			Static61.anIntArray248[Static39.anInt1251++] = 2047;
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		if (local27 == 1) {
			local46 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
			Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.method921(false, local46);
			local56 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
			if (local56 == 1) {
				Static61.anIntArray248[Static39.anInt1251++] = 2047;
			}
			return;
		}
		@Pc(98) int local98;
		if (local27 == 2) {
			local46 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
			Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.method921(true, local46);
			local56 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
			Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.method921(true, local56);
			local98 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
			if (local98 == 1) {
				Static61.anIntArray248[Static39.anInt1251++] = 2047;
			}
		} else if (local27 == 3) {
			Static62.anInt1879 = Static59.aClass2_Sub8_Sub1_19.method1419(2);
			local46 = Static59.aClass2_Sub8_Sub1_19.method1419(7);
			local56 = Static59.aClass2_Sub8_Sub1_19.method1419(7);
			local98 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
			@Pc(142) int local142 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
			if (local142 == 1) {
				Static61.anIntArray248[Static39.anInt1251++] = 2047;
			}
			Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.method922(local46, local98 == 1, local56);
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(BI)Lclient!wb;")
	public static Class65 method1568(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static93.method1617(arg0) : Static12.aClass65_218;
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public static void method1569() {
		aClass65_1146 = null;
		aClass20_12 = null;
		aClass33_41 = null;
		aClass65_1149 = null;
		aClass33_Sub1_44 = null;
		aClass65_1143 = null;
		aClass65_1150 = null;
		aClass3Array3 = null;
		aClass65_1148 = null;
		anIntArray368 = null;
		aClass65_1144 = null;
		aClass12_3 = null;
		aClass65_1147 = null;
		aClass65_1145 = null;
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	public static void method1570() {
		Static104.aClass21_35.method743();
		Static33.aClass21_31.method743();
	}
}
