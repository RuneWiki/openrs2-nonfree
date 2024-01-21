import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	public static int anInt2524;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	public static int anInt2527;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!a;")
	public static Class1 aClass1_2629 = Static94.method1596(",Zffentlicher Chat");

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Z")
	public static final boolean aBoolean147 = false;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	public static int anInt2521 = 0;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_2630 = Static94.method1596("auf der Hautpseite)3");

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_2631 = Static94.method1596("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!a;")
	private static Class1 aClass1_2632 = Static94.method1596("Error loading your profile)3");

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static int anInt2526 = 0;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!a;")
	public static Class1 aClass1_2633 = aClass1_2632;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lclient!bc;")
	public static Class2_Sub1_Sub2_Sub1 method1664() {
		@Pc(12) Class2_Sub1_Sub2_Sub1 local12 = new Class2_Sub1_Sub2_Sub1(Static67.anIntArray342, Static27.anIntArray113, Static109.anIntArray347, Static7.anIntArray121, Static94.aByteArrayArray8);
		Static37.method931();
		return local12;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!bd;Lclient!bd;I)I")
	public static int method1665(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1706(Static59.aClass1_1848, Static104.aClass1_1591)) {
			local5++;
		}
		if (arg1.method1706(Static17.aClass1_674, Static104.aClass1_1591)) {
			local5++;
		}
		if (arg1.method1706(Static42.aClass1_1435, Static104.aClass1_1591)) {
			local5++;
		}
		if (arg1.method1706(Static34.aClass1_1235, Static104.aClass1_1591)) {
			local5++;
		}
		if (arg1.method1706(Static12.aClass1_2751, Static104.aClass1_1591)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public static void method1666() {
		if (Static5.aClass10_1 != null) {
			Static5.aClass10_1.method1740();
			Static5.aClass10_1 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1667() {
		@Pc(9) int local9 = Static97.aClass2_Sub1_Sub2_Sub1_3.method370(Static83.aClass1_2338);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static37.anInt1346; local11++) {
			local19 = Static97.aClass2_Sub1_Sub2_Sub1_3.method366(Static84.aClass1Array20[local11]);
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static37.anInt1346 * 15 + 21;
		@Pc(78) int local78;
		@Pc(105) int local105;
		if (Static93.anInt2360 > 4 && Static1.anInt13 > 4 && Static93.anInt2360 < 516 && Static1.anInt13 < 338) {
			Static18.anInt835 = 0;
			Static5.anInt404 = Static37.anInt1346 * 15 + 22;
			Static6.aBoolean11 = true;
			local78 = Static93.anInt2360 - local9 / 2 - 4;
			Static77.anInt2065 = local9;
			if (local9 + local78 > 512) {
				local78 = 512 - local9;
			}
			if (local78 < 0) {
				local78 = 0;
			}
			Static32.anInt1230 = local78;
			local105 = Static1.anInt13 - 4;
			if (local105 + local19 > 334) {
				local105 = 334 - local19;
			}
			if (local105 < 0) {
				local105 = 0;
			}
			Static17.anInt772 = local105;
		}
		if (Static93.anInt2360 > 553 && Static1.anInt13 > 205 && Static93.anInt2360 < 743 && Static1.anInt13 < 466) {
			Static5.anInt404 = Static37.anInt1346 * 15 + 22;
			Static18.anInt835 = 1;
			local105 = Static1.anInt13 - 205;
			local78 = Static93.anInt2360 - local9 / 2 - 553;
			if (local78 < 0) {
				local78 = 0;
			} else if (local9 + local78 > 190) {
				local78 = 190 - local9;
			}
			Static6.aBoolean11 = true;
			Static32.anInt1230 = local78;
			if (local105 < 0) {
				local105 = 0;
			} else if (local19 + local105 > 261) {
				local105 = 261 - local19;
			}
			Static77.anInt2065 = local9;
			Static17.anInt772 = local105;
		}
		if (Static93.anInt2360 <= 17 || Static1.anInt13 <= 357 || Static93.anInt2360 >= 496 || Static1.anInt13 >= 453) {
			return;
		}
		Static77.anInt2065 = local9;
		Static18.anInt835 = 2;
		Static5.anInt404 = Static37.anInt1346 * 15 + 22;
		local105 = Static1.anInt13 - 357;
		if (local105 < 0) {
			local105 = 0;
		} else if (local19 + local105 > 96) {
			local105 = 96 - local19;
		}
		local78 = Static93.anInt2360 - local9 / 2 - 17;
		Static6.aBoolean11 = true;
		Static17.anInt772 = local105;
		if (local78 < 0) {
			local78 = 0;
		} else if (local78 + local9 > 479) {
			local78 = 479 - local9;
		}
		Static32.anInt1230 = local78;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IJ)Lclient!a;")
	public static Class1 method1668(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) long local29 = arg0;
			@Pc(31) int local31 = 0;
			while (local29 != 0L) {
				local29 /= 37L;
				local31++;
			}
			@Pc(52) byte[] local52 = new byte[local31];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local31--;
				local52[local31] = Static5.aByteArray3[(int) (local56 - arg0 * 37L)];
			}
			@Pc(83) Class1 local83 = new Class1();
			local83.aByteArray1 = local52;
			local83.anInt23 = local52.length;
			return local83;
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method1669() {
		Static59.aClass29_1.method1590();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static55.aLongArray2[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static112.aLongArray7[local22] = 0L;
		}
		Static20.anInt898 = 0;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public static void method1670() {
		Static50.method1105();
		if (Static85.anInt2262 != 10) {
			return;
		}
		@Pc(17) int local17 = Static93.anInt2360 - 202;
		@Pc(19) int local19 = Static103.anInt2617;
		@Pc(23) int local23 = Static1.anInt13 - 171;
		if (Static47.anInt1558 == 0) {
			if (local19 == 1 && local17 >= 25 && local17 <= 175 && local23 >= 100 && local23 <= 140) {
				Static69.anInt2811 = 0;
				Static47.anInt1558 = 3;
			}
			if (local19 == 1 && local17 >= 185 && local17 <= 335 && local23 >= 100 && local23 <= 140) {
				Static47.anInt1558 = 2;
				Static69.anInt2811 = 0;
				Static104.aClass1_1587 = Static69.aClass1_2944;
				Static104.aClass1_1597 = Static33.aClass1_1224;
				Static104.aClass1_1588 = Static69.aClass1_2930;
				return;
			}
			return;
		}
		if (Static47.anInt1558 == 2) {
			@Pc(123) byte local123 = 60;
			@Pc(126) int local126 = local123 + 30;
			if (local19 == 1 && local23 >= 75 && local23 < 90) {
				Static69.anInt2811 = 0;
			}
			local126 += 15;
			if (local19 == 1 && local23 >= 90 && local23 < 105) {
				Static69.anInt2811 = 1;
			}
			local126 += 15;
			if (local19 == 1 && local17 >= 25 && local17 <= 175 && local23 >= 130 && local23 <= 170) {
				Static104.aClass1_1593 = Static104.aClass1_1593.method13().method36();
				Static60.method1284(Static69.aClass1_2941, Static69.aClass1_2937, Static18.aClass1_743);
				Static29.method759(20);
				return;
			}
			if (local19 == 1 && local17 >= 185 && local17 <= 335 && local23 >= 130 && local23 <= 170) {
				Static104.aClass1_1593 = Static104.aClass1_1591;
				Static104.aClass1_1582 = Static104.aClass1_1591;
				Static47.anInt1558 = 0;
			}
			while (true) {
				@Pc(261) boolean local261;
				label138: do {
					while (Static62.method1297()) {
						local261 = false;
						for (@Pc(263) int local263 = 0; local263 < Static104.aClass1_1595.method10(); local263++) {
							if (Static98.anInt2514 == Static104.aClass1_1595.method6(local263)) {
								local261 = true;
								break;
							}
						}
						if (Static69.anInt2811 != 0) {
							continue label138;
						}
						if (Static96.anInt2469 == 85 && Static104.aClass1_1593.method10() > 0) {
							Static104.aClass1_1593 = Static104.aClass1_1593.method19(0, Static104.aClass1_1593.method10() - 1);
						}
						if (Static96.anInt2469 == 84 || Static96.anInt2469 == 80) {
							Static69.anInt2811 = 1;
						}
						if (local261 && Static104.aClass1_1593.method10() < 12) {
							Static104.aClass1_1593 = Static104.aClass1_1593.method21(Static98.anInt2514);
						}
					}
					return;
				} while (Static69.anInt2811 != 1);
				if (Static96.anInt2469 == 85 && Static104.aClass1_1582.method10() > 0) {
					Static104.aClass1_1582 = Static104.aClass1_1582.method19(0, Static104.aClass1_1582.method10() - 1);
				}
				if (Static96.anInt2469 == 84 || Static96.anInt2469 == 80) {
					Static69.anInt2811 = 0;
				}
				if (local261 && Static104.aClass1_1582.method10() < 20) {
					Static104.aClass1_1582 = Static104.aClass1_1582.method21(Static98.anInt2514);
				}
			}
		}
		if (Static47.anInt1558 != 3 || local19 != 1 || local17 < 105 || local17 > 255 || local23 < 130 || local23 > 170) {
			return;
		}
		Static47.anInt1558 = 0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	public static void method1671() {
		aClass1_2629 = null;
		aClass1_2630 = null;
		aClass1_2631 = null;
		aClass1_2632 = null;
		aClass1_2633 = null;
	}
}
