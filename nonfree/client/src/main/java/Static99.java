import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dda", name = "G", descriptor = "Lclient!rg;")
	public static Class310 aClass310_23;

	@OriginalMember(owner = "client!dda", name = "I", descriptor = "Lclient!ma;")
	public static Class228 aClass228_2;

	@OriginalMember(owner = "client!dda", name = "H", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_57 = new Class251(78, -1);

	@OriginalMember(owner = "client!dda", name = "J", descriptor = "Z")
	public static final boolean aBoolean126 = true;

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "(I)V")
	public static void method1657() {
		Static433.method6480(false);
		Static140.anInt2225 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static73.aByteArrayArray2.length; local14++) {
			if (Static535.anIntArray475[local14] != -1 && Static73.aByteArrayArray2[local14] == null) {
				Static73.aByteArrayArray2[local14] = Static655.aClass310_132.method7803(0, Static535.anIntArray475[local14]);
				if (Static73.aByteArrayArray2[local14] == null) {
					local12 = false;
					Static140.anInt2225++;
				}
			}
			if (Static634.anIntArray558[local14] != -1 && Static601.aByteArrayArray29[local14] == null) {
				Static601.aByteArrayArray29[local14] = Static655.aClass310_132.method7791(Static157.anIntArrayArray16[local14], Static634.anIntArray558[local14], 0);
				if (Static601.aByteArrayArray29[local14] == null) {
					Static140.anInt2225++;
					local12 = false;
				}
			}
			if (Static495.anIntArray447[local14] != -1 && Static103.aByteArrayArray3[local14] == null) {
				Static103.aByteArrayArray3[local14] = Static655.aClass310_132.method7803(0, Static495.anIntArray447[local14]);
				if (Static103.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static140.anInt2225++;
				}
			}
			if (Static250.anIntArray238[local14] != -1 && Static475.aByteArrayArray20[local14] == null) {
				Static475.aByteArrayArray20[local14] = Static655.aClass310_132.method7803(0, Static250.anIntArray238[local14]);
				if (Static475.aByteArrayArray20[local14] == null) {
					Static140.anInt2225++;
					local12 = false;
				}
			}
			if (Static47.anIntArray50 != null && Static511.aByteArrayArray23[local14] == null && Static47.anIntArray50[local14] != -1) {
				Static511.aByteArrayArray23[local14] = Static655.aClass310_132.method7791(Static157.anIntArrayArray16[local14], Static47.anIntArray50[local14], 0);
				if (Static511.aByteArrayArray23[local14] == null) {
					local12 = false;
					Static140.anInt2225++;
				}
			}
		}
		if (Static131.aClass309_3 == null) {
			if (Static688.aClass14_Sub2_Sub10_3 == null || !Static123.aClass310_26.method7798(Static688.aClass14_Sub2_Sub10_3.aString66 + "_staticelements")) {
				Static131.aClass309_3 = new Class309(0);
			} else if (Static123.aClass310_26.method7783(Static688.aClass14_Sub2_Sub10_3.aString66 + "_staticelements")) {
				Static131.aClass309_3 = Static256.method4307(Static123.aClass310_26, Static212.aBoolean270, Static688.aClass14_Sub2_Sub10_3.aString66 + "_staticelements");
			} else {
				Static140.anInt2225++;
				local12 = false;
			}
		}
		if (!local12) {
			Static472.anInt8114 = 1;
			return;
		}
		Static464.anInt7758 = 0;
		local12 = true;
		@Pc(310) int local310;
		@Pc(321) int local321;
		for (@Pc(291) int local291 = 0; local291 < Static73.aByteArrayArray2.length; local291++) {
			@Pc(297) byte[] local297 = Static601.aByteArrayArray29[local291];
			if (local297 != null) {
				local310 = (Static365.anIntArray336[local291] >> 8) * 64 - Static36.anInt617;
				local321 = (Static365.anIntArray336[local291] & 0xFF) * 64 - Static550.anInt9242;
				if (Static627.anInt10289 != 0) {
					local310 = 10;
					local321 = 10;
				}
				local12 &= Static469.method9390(Static380.anInt6689, local321, local310, Static542.anInt9214, local297);
			}
			local297 = Static475.aByteArrayArray20[local291];
			if (local297 != null) {
				local310 = (Static365.anIntArray336[local291] >> 8) * 64 - Static36.anInt617;
				local321 = (Static365.anIntArray336[local291] & 0xFF) * 64 - Static550.anInt9242;
				if (Static627.anInt10289 != 0) {
					local321 = 10;
					local310 = 10;
				}
				local12 &= Static469.method9390(Static380.anInt6689, local321, local310, Static542.anInt9214, local297);
			}
		}
		if (!local12) {
			Static472.anInt8114 = 2;
			return;
		}
		if (Static472.anInt8114 != 0) {
			Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, true, Static21.aClass21_11.method324(Static26.anInt352) + "<br>(100%)", Static103.aClass144_3);
		}
		Static599.method8480();
		Static419.method9119();
		Static87.method1439();
		@Pc(423) boolean local423 = false;
		if (Static103.aClass144_3.method6897() && Static181.aClass14_Sub26_9.aClass43_Sub14_1.method4225() == 2) {
			for (local310 = 0; local310 < Static73.aByteArrayArray2.length; local310++) {
				if (Static475.aByteArrayArray20[local310] != null || Static103.aByteArrayArray3[local310] != null) {
					local423 = true;
					break;
				}
			}
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub21_1.method5857() == 1) {
			local310 = Static357.anIntArray333[Static241.anInt4622];
		} else {
			local310 = Static493.anIntArray437[Static241.anInt4622];
		}
		if (Static103.aClass144_3.method6962()) {
			local310++;
		}
		Static589.method8390(Static103.aClass144_3, Static106.anInt1837, Static380.anInt6689, Static542.anInt9214, local310, local423, Static103.aClass144_3.method6926() > 0);
		Static513.method7348(Static327.anInt5650);
		if (Static327.anInt5650 == 0) {
			Static75.method1233((Class68) null);
		} else {
			Static75.method1233(Static474.aClass68_9);
		}
		for (local321 = 0; local321 < 4; local321++) {
			Static40.aClass289Array1[local321].method7082();
		}
		Static149.method2184();
		Static379.method5838(false);
		Static190.method2835();
		Static599.aBoolean682 = false;
		Static599.method8480();
		System.gc();
		Static433.method6480(true);
		Static438.method6533();
		Static296.anInt5322 = Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751();
		Static183.aBoolean221 = Static360.anInt6168 >= 96;
		Static688.aBoolean777 = Static181.aClass14_Sub26_9.aClass43_Sub14_1.method4225() == 2;
		Static619.aBoolean710 = Static181.aClass14_Sub26_9.aClass43_Sub16_1.method4851() == 1;
		Static230.anInt4432 = Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 1 ? -1 : Static114.anInt1886;
		Static428.aBoolean510 = Static181.aClass14_Sub26_9.aClass43_Sub24_1.method7390() == 1;
		Static308.aBoolean400 = Static181.aClass14_Sub26_9.aClass43_Sub5_1.method1872() == 1;
		Static15.aClass49_Sub1_1 = new Class49_Sub1(4, Static380.anInt6689, Static542.anInt9214, false);
		if (Static627.anInt10289 == 0) {
			Static301.method5287(Static73.aByteArrayArray2, Static15.aClass49_Sub1_1);
		} else {
			Static654.method9149(Static15.aClass49_Sub1_1, Static73.aByteArrayArray2);
		}
		Static239.method4000(Static542.anInt9214 >> 4, Static380.anInt6689 >> 4);
		Static417.method6263();
		if (local423) {
			Static303.method6870(true);
			Static551.aClass49_Sub1_2 = new Class49_Sub1(1, Static380.anInt6689, Static542.anInt9214, true);
			if (Static627.anInt10289 == 0) {
				Static301.method5287(Static103.aByteArrayArray3, Static551.aClass49_Sub1_2);
				Static433.method6480(true);
			} else {
				Static654.method9149(Static551.aClass49_Sub1_2, Static103.aByteArrayArray3);
				Static433.method6480(true);
			}
			Static551.aClass49_Sub1_2.method6721(Static15.aClass49_Sub1_1.anIntArrayArrayArray17[0]);
			Static551.aClass49_Sub1_2.method6720((int[][][]) null, (Class289[]) null, Static103.aClass144_3);
			Static303.method6870(false);
		}
		Static15.aClass49_Sub1_1.method6720(local423 ? Static551.aClass49_Sub1_2.anIntArrayArrayArray17 : null, Static40.aClass289Array1, Static103.aClass144_3);
		if (Static627.anInt10289 == 0) {
			Static433.method6480(true);
			Static400.method965(Static15.aClass49_Sub1_1, Static601.aByteArrayArray29);
			if (Static511.aByteArrayArray23 != null) {
				Static218.method3765();
			}
		} else {
			Static433.method6480(true);
			Static91.method1528(Static15.aClass49_Sub1_1, Static601.aByteArrayArray29);
		}
		Static419.method9119();
		if (Static360.anInt6168 < 96) {
			Static608.method8581();
		}
		Static433.method6480(true);
		Static15.aClass49_Sub1_1.method6715((Class159) null, Static103.aClass144_3, local423 ? Static346.aClass159Array2[0] : null);
		Static15.aClass49_Sub1_1.method6732(false, Static103.aClass144_3);
		Static433.method6480(true);
		if (local423) {
			Static303.method6870(true);
			Static433.method6480(true);
			if (Static627.anInt10289 == 0) {
				Static400.method965(Static551.aClass49_Sub1_2, Static475.aByteArrayArray20);
			} else {
				Static91.method1528(Static551.aClass49_Sub1_2, Static475.aByteArrayArray20);
			}
			Static419.method9119();
			Static433.method6480(true);
			Static551.aClass49_Sub1_2.method6715(Static445.aClass159Array3[0], Static103.aClass144_3, (Class159) null);
			Static551.aClass49_Sub1_2.method6732(true, Static103.aClass144_3);
			Static433.method6480(true);
			Static303.method6870(false);
		}
		Static497.method7461();
		@Pc(848) int local848 = Static15.aClass49_Sub1_1.anInt7605;
		if (Static391.anInt6811 < local848) {
			local848 = Static391.anInt6811;
		}
		if (Static391.anInt6811 - 1 > local848) {
			local848 = Static391.anInt6811 - 1;
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 0) {
			Static133.method2020(local848);
		} else {
			Static133.method2020(0);
		}
		@Pc(892) int local892;
		@Pc(896) int local896;
		for (@Pc(886) int local886 = 0; local886 < 4; local886++) {
			for (local892 = 0; local892 < Static380.anInt6689; local892++) {
				for (local896 = 0; local896 < Static542.anInt9214; local896++) {
					Static379.method5837(local886, local892, local896);
				}
			}
		}
		Static357.method5426();
		Static599.method8480();
		Static243.method4061();
		Static419.method9119();
		Static419.method9120();
		@Pc(959) Class14_Sub54 local959;
		if (Static613.aFrame2 != null && Static277.aClass347_2.aClass278_2 != null && Static387.anInt9114 == 12) {
			local959 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static86.aClass251_49);
			local959.aClass14_Sub21_Sub2_2.method7730(1057001181);
			Static277.aClass347_2.method8308(local959);
		}
		if (Static627.anInt10289 == 0) {
			local892 = (Static406.anInt7033 - (Static380.anInt6689 >> 4)) / 8;
			local896 = ((Static380.anInt6689 >> 4) + Static406.anInt7033) / 8;
			@Pc(999) int local999 = (Static306.anInt6137 - (Static542.anInt9214 >> 4)) / 8;
			@Pc(1007) int local1007 = (Static306.anInt6137 + (Static542.anInt9214 >> 4)) / 8;
			for (@Pc(1011) int local1011 = local892 - 1; local1011 <= local896 + 1; local1011++) {
				for (@Pc(1017) int local1017 = local999 - 1; local1017 <= local1007 + 1; local1017++) {
					if (local892 > local1011 || local1011 > local896 || local1017 < local999 || local1017 > local1007) {
						Static655.aClass310_132.method7799("m" + local1011 + "_" + local1017);
						Static655.aClass310_132.method7799("l" + local1011 + "_" + local1017);
					}
				}
			}
		}
		if (Static387.anInt9114 == 4) {
			Static160.method2323(3);
		} else if (Static387.anInt9114 == 8) {
			Static160.method2323(7);
		} else if (Static387.anInt9114 == 10) {
			Static160.method2323(9);
		} else {
			Static160.method2323(11);
			if (Static277.aClass347_2.aClass278_2 != null) {
				local959 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static254.aClass251_111);
				Static277.aClass347_2.method8308(local959);
			}
		}
		Static335.method5162();
		Static599.method8480();
		Static459.method8984();
		Static282.aBoolean384 = true;
		if (Static599.aBoolean681) {
			Static590.method8398("Took: " + (Static26.method382() - Static146.aLong96) + "ms");
			Static599.aBoolean681 = false;
		}
	}
}
