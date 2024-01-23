import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!ie;")
	public static Class53 aClass53_2;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Lclient!qh;")
	public static Class93 aClass93_58 = null;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "[S")
	public static short[] aShortArray26 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "Lclient!hh;")
	public static Class50 aClass50_596 = Static186.method3527(" x ");

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "Lclient!hh;")
	private static Class50 aClass50_597 = Static186.method3527("Loaded input handler");

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
	public static volatile int anInt1907 = 0;

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "Lclient!hh;")
	public static Class50 aClass50_598 = aClass50_597;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)I")
	public static int method1461(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IJ)V")
	public static void method1462(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static201.anInt4066 >= 100) {
			Static123.method1275(Static112.aClass50_717, Static7.aClass50_69, 0);
			return;
		}
		@Pc(32) Class50 local32 = Static130.method2183(arg0).method1218();
		for (@Pc(34) int local34 = 0; local34 < Static201.anInt4066; local34++) {
			if (arg0 == Static118.aLongArray5[local34]) {
				Static123.method1275(Static17.method257(new Class50[] { local32, Static37.aClass50_299 }), Static7.aClass50_69, 0);
				return;
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static21.anInt420; local73++) {
			if (arg0 == Static129.aLongArray6[local73]) {
				Static123.method1275(Static17.method257(new Class50[] { Static79.aClass50_1061, local32, Static68.aClass50_478 }), Static7.aClass50_69, 0);
				return;
			}
		}
		if (local32.method1236(Static230.aClass20_Sub3_Sub1_3.aClass50_493)) {
			Static123.method1275(Static54.aClass50_383, Static7.aClass50_69, 0);
			return;
		}
		Static118.aLongArray5[Static201.anInt4066] = arg0;
		Static209.aClass50Array79[Static201.anInt4066++] = Static130.method2183(arg0);
		Static205.anInt4112 = Static31.anInt594;
		Static32.aClass1_Sub17_Sub1_1.method2182(196);
		Static32.aClass1_Sub17_Sub1_1.method2171(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!gj;IIII)V")
	public static void method1463(@OriginalArg(0) Class20_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static230.aClass20_Sub3_Sub1_3 == arg0 || Static193.anInt3035 >= 400) {
			return;
		}
		@Pc(46) Class50 local46;
		if (arg0.anInt1498 == 0) {
			local46 = Static17.method257(new Class50[] { arg0.method1089(), Static30.method438(arg0.anInt1505, Static230.aClass20_Sub3_Sub1_3.anInt1505), Static60.aClass50_424, Static117.aClass50_793, Static160.method2684(arg0.anInt1505), Static66.aClass50_472 });
		} else {
			local46 = Static17.method257(new Class50[] { arg0.method1089(), Static60.aClass50_424, Static76.aClass50_501, Static160.method2684(arg0.anInt1498), Static66.aClass50_472 });
		}
		@Pc(130) int local130;
		if (Static123.anInt1750 == 1) {
			Static150.method2516(Static17.method257(new Class50[] { Static234.aClass50_1437, Static25.aClass50_196, local46 }), arg1, (long) arg3, Static125.aClass50_864, (short) 48, arg2);
		} else if (!Static234.aBoolean218) {
			for (local130 = 7; local130 >= 0; local130--) {
				if (Static138.aClass50Array53[local130] != null) {
					@Pc(138) short local138 = 0;
					if (Static186.anInt4481 == 0 && Static138.aClass50Array53[local130].method1256(Static206.aClass50_1317)) {
						if (Static230.aClass20_Sub3_Sub1_3.anInt1505 < arg0.anInt1505) {
							local138 = 2000;
						}
						if (Static230.aClass20_Sub3_Sub1_3.anInt1496 != 0 && arg0.anInt1496 != 0) {
							if (arg0.anInt1496 == Static230.aClass20_Sub3_Sub1_3.anInt1496) {
								local138 = 2000;
							} else {
								local138 = 0;
							}
						}
					} else if (Static47.aBooleanArray2[local130]) {
						local138 = 2000;
					}
					@Pc(200) short local200 = Static141.aShortArray55[local130];
					@Pc(205) short local205 = (short) (local200 + local138);
					Static150.method2516(Static17.method257(new Class50[] { Static25.aClass50_197, local46 }), arg1, (long) arg3, Static138.aClass50Array53[local130], local205, arg2);
				}
			}
		} else if ((Static58.anInt1154 & 0x8) == 8) {
			Static150.method2516(Static17.method257(new Class50[] { Static191.aClass50_1261, Static25.aClass50_196, local46 }), arg1, (long) arg3, Static148.aClass50_1016, (short) 13, arg2);
		}
		for (local130 = 0; local130 < Static193.anInt3035; local130++) {
			if (Static27.aShortArray4[local130] == 45) {
				Static211.aClass50Array80[local130] = Static17.method257(new Class50[] { Static25.aClass50_197, local46 });
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	public static void method1465() {
		while (true) {
			if (Static97.aClass1_Sub17_Sub1_2.method2186(Static217.anInt4289) >= 11) {
				@Pc(18) int local18 = Static97.aClass1_Sub17_Sub1_2.method2181(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static232.aClass20_Sub3_Sub1Array1[local18] == null) {
						Static232.aClass20_Sub3_Sub1Array1[local18] = new Class20_Sub3_Sub1();
						local25 = true;
						if (Static119.aClass1_Sub17Array1[local18] != null) {
							Static232.aClass20_Sub3_Sub1Array1[local18].method1092(Static119.aClass1_Sub17Array1[local18]);
						}
					}
					Static52.anIntArray356[Static13.anInt250++] = local18;
					@Pc(61) Class20_Sub3_Sub1 local61 = Static232.aClass20_Sub3_Sub1Array1[local18];
					local61.anInt3018 = Static107.anInt2132;
					@Pc(71) int local71 = Static133.anIntArray291[Static97.aClass1_Sub17_Sub1_2.method2181(3)];
					if (local25) {
						local61.anInt3042 = local61.anInt3054 = local71;
					}
					@Pc(84) int local84 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
					@Pc(89) int local89 = Static97.aClass1_Sub17_Sub1_2.method2181(5);
					if (local89 > 15) {
						local89 -= 32;
					}
					@Pc(100) int local100 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
					if (local100 == 1) {
						Static164.anIntArray360[Static80.anInt1584++] = local18;
					}
					@Pc(118) int local118 = Static97.aClass1_Sub17_Sub1_2.method2181(5);
					if (local118 > 15) {
						local118 -= 32;
					}
					local61.method2470(Static230.aClass20_Sub3_Sub1_3.anIntArray311[0] + local89, Static230.aClass20_Sub3_Sub1_3.anIntArray313[0] - -local118, local84 == 1);
					continue;
				}
			}
			Static97.aClass1_Sub17_Sub1_2.method2188();
			return;
		}
	}
}
