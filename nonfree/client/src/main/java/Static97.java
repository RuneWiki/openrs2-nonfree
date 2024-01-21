import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Lclient!sb;")
	public static Class53 aClass53_3;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	public static int anInt2699;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array8;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "Lclient!sb;")
	public static Class53 aClass53_4;

	@OriginalMember(owner = "client!t", name = "H", descriptor = "Lclient!bc;")
	public static Class7 aClass7_5;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1204 = Static24.method441("Loading fonts )2 ");

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1205 = Static24.method441("::hiddenbuttontest");

	@OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
	public static int[] anIntArray399 = new int[128];

	@OriginalMember(owner = "client!t", name = "n", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1206 = Static24.method441("(U3");

	@OriginalMember(owner = "client!t", name = "o", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1207 = Static24.method441("Loading friend list");

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1208 = Static24.method441("b12_full");

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!pc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1209 = aClass65_1207;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1210 = aClass65_1204;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "I")
	public static int anInt2711 = 255;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public static void method1655() {
		anIntArray399 = null;
		aClass2_Sub1_Sub4_Sub2Array8 = null;
		aClass65_1208 = null;
		aClass65_1209 = null;
		aClass65_1205 = null;
		aClass65_1206 = null;
		aClass65_1204 = null;
		aClass7_5 = null;
		aClass53_3 = null;
		aClass65_1210 = null;
		aClass65_1207 = null;
		aClass53_4 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method1656() {
		Static50.anIntArray199 = null;
		Static90.anIntArray196 = null;
		Static68.anIntArrayArray18 = null;
		Static7.aByteArrayArrayArray3 = null;
		Static100.anIntArrayArrayArray7 = null;
		Static5.aByteArrayArrayArray1 = null;
		Static7.aByteArrayArrayArray2 = null;
		Static89.anIntArray369 = null;
		Static4.anIntArray28 = null;
		Static60.anIntArray247 = null;
		Static100.aByteArrayArrayArray9 = null;
		Static38.aByteArrayArrayArray4 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BIIII)V")
	public static void method1657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub3 local10 = (Class2_Sub3) Static22.aClass52_4.method1587(); local10 != null; local10 = (Class2_Sub3) Static22.aClass52_4.method1588()) {
			if (local10.anInt657 != -1 || local10.anIntArray88 != null) {
				@Pc(22) int local22 = 0;
				if (local10.anInt652 < arg0) {
					local22 = arg0 - local10.anInt652;
				} else if (local10.anInt653 > arg0) {
					local22 = local10.anInt653 - arg0;
				}
				if (local10.anInt662 < arg3) {
					local22 += arg3 - local10.anInt662;
				} else if (local10.anInt655 > arg3) {
					local22 += local10.anInt655 - arg3;
				}
				if (local22 - 64 > local10.anInt663 || Static83.anInt2378 == 0 || arg2 != local10.anInt650) {
					if (local10.aClass2_Sub10_Sub1_1 != null) {
						Static8.aClass2_Sub10_Sub2_1.method1674(local10.aClass2_Sub10_Sub1_1);
						local10.aClass2_Sub10_Sub1_1 = null;
					}
					if (local10.aClass2_Sub10_Sub1_2 != null) {
						Static8.aClass2_Sub10_Sub2_1.method1674(local10.aClass2_Sub10_Sub1_2);
						local10.aClass2_Sub10_Sub1_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(144) int local144 = Static83.anInt2378 * (local10.anInt663 - local22) / local10.anInt663;
					if (local10.aClass2_Sub10_Sub1_1 != null) {
						local10.aClass2_Sub10_Sub1_1.method1327(local144);
					} else if (local10.anInt657 >= 0) {
						@Pc(162) Class35 local162 = Static112.method964(Static25.aClass33_Sub1_13, local10.anInt657);
						if (local162 != null) {
							@Pc(169) Class2_Sub4_Sub1 local169 = local162.method965().method1239(Static99.aClass12_3);
							@Pc(174) Class2_Sub10_Sub1 local174 = Static113.method1321(local169, local144);
							local174.method1318(-1);
							Static8.aClass2_Sub10_Sub2_1.method1677(local174);
							local10.aClass2_Sub10_Sub1_1 = local174;
						}
					}
					if (local10.aClass2_Sub10_Sub1_2 != null) {
						local10.aClass2_Sub10_Sub1_2.method1327(local144);
						if (!local10.aClass2_Sub10_Sub1_2.method1326()) {
							local10.aClass2_Sub10_Sub1_2 = null;
						}
					} else if (local10.anIntArray88 != null && (local10.anInt649 -= arg1) <= 0) {
						@Pc(218) int local218 = (int) ((double) local10.anIntArray88.length * Math.random());
						@Pc(226) Class35 local226 = Static112.method964(Static25.aClass33_Sub1_13, local10.anIntArray88[local218]);
						if (local226 != null) {
							@Pc(233) Class2_Sub4_Sub1 local233 = local226.method965().method1239(Static99.aClass12_3);
							@Pc(238) Class2_Sub10_Sub1 local238 = Static113.method1321(local233, local144);
							local238.method1318(0);
							Static8.aClass2_Sub10_Sub2_1.method1677(local238);
							local10.anInt649 = (int) ((double) (local10.anInt656 - local10.anInt664) * Math.random()) + local10.anInt664;
							local10.aClass2_Sub10_Sub1_2 = local238;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public static void method1658() {
		if (Static101.anInt2793 != 1) {
			return;
		}
		if (Static89.anInt2559 >= 6 && Static89.anInt2559 <= 106 && Static32.anInt1044 >= 467 && Static32.anInt1044 <= 499) {
			Static103.anInt2811 = (Static103.anInt2811 + 1) % 4;
			Static107.aBoolean156 = true;
			Static81.aBoolean158 = true;
			Static12.aClass2_Sub8_Sub1_8.method1425(0);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static103.anInt2811);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static42.anInt1350);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static85.anInt2454);
		}
		if (Static89.anInt2559 >= 135 && Static89.anInt2559 <= 235 && Static32.anInt1044 >= 467 && Static32.anInt1044 <= 499) {
			Static81.aBoolean158 = true;
			Static107.aBoolean156 = true;
			Static42.anInt1350 = (Static42.anInt1350 + 1) % 3;
			Static12.aClass2_Sub8_Sub1_8.method1425(0);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static103.anInt2811);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static42.anInt1350);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static85.anInt2454);
		}
		if (Static89.anInt2559 >= 273 && Static89.anInt2559 <= 373 && Static32.anInt1044 >= 467 && Static32.anInt1044 <= 499) {
			Static81.aBoolean158 = true;
			Static85.anInt2454 = (Static85.anInt2454 + 1) % 3;
			Static107.aBoolean156 = true;
			Static12.aClass2_Sub8_Sub1_8.method1425(0);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static103.anInt2811);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static42.anInt1350);
			Static12.aClass2_Sub8_Sub1_8.method1375(Static85.anInt2454);
		}
		if (Static89.anInt2559 < 412 || Static89.anInt2559 > 512 || Static32.anInt1044 < 467 || Static32.anInt1044 > 499) {
			return;
		}
		if (Static98.anInt2770 == -1) {
			Static19.method1106();
			if (Static84.anInt2416 != -1) {
				Static99.anInt2544 = Static98.anInt2770 = Static84.anInt2416;
				Static8.aClass65_142 = Static8.aClass65_145;
				Static17.aBoolean39 = false;
				return;
			}
		} else {
			Static36.method742(Static8.aClass65_145, Static33.aClass65_1055, 0);
		}
		return;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public static void method1659() {
		@Pc(10) int local10 = Static59.aClass2_Sub8_Sub1_19.method1419(8);
		@Pc(19) int local19;
		if (Static54.anInt1640 > local10) {
			for (local19 = local10; local19 < Static54.anInt1640; local19++) {
				Static68.anIntArray276[Static12.anInt416++] = Static24.anIntArray99[local19];
			}
		}
		if (Static54.anInt1640 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static54.anInt1640 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(62) int local62 = Static24.anIntArray99[local19];
			@Pc(66) Class2_Sub1_Sub1_Sub2_Sub2 local66 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local62];
			@Pc(71) int local71 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
			if (local71 == 0) {
				Static24.anIntArray99[Static54.anInt1640++] = local62;
				local66.anInt1544 = Static108.anInt2902;
			} else {
				@Pc(91) int local91 = Static59.aClass2_Sub8_Sub1_19.method1419(2);
				if (local91 == 0) {
					Static24.anIntArray99[Static54.anInt1640++] = local62;
					local66.anInt1544 = Static108.anInt2902;
					Static61.anIntArray248[Static39.anInt1251++] = local62;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local91 == 1) {
						Static24.anIntArray99[Static54.anInt1640++] = local62;
						local66.anInt1544 = Static108.anInt2902;
						local135 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
						local66.method921(false, local135);
						local145 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
						if (local145 == 1) {
							Static61.anIntArray248[Static39.anInt1251++] = local62;
						}
					} else if (local91 == 2) {
						Static24.anIntArray99[Static54.anInt1640++] = local62;
						local66.anInt1544 = Static108.anInt2902;
						local135 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
						local66.method921(true, local135);
						local145 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
						local66.method921(true, local145);
						@Pc(203) int local203 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
						if (local203 == 1) {
							Static61.anIntArray248[Static39.anInt1251++] = local62;
						}
					} else if (local91 == 3) {
						Static68.anIntArray276[Static12.anInt416++] = local62;
					}
				}
			}
		}
	}
}
