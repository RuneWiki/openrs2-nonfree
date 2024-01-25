import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!em", name = "v", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!em", name = "G", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_22 = new Class25(66, 7);

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(III)Z")
	public static boolean method1588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V")
	public static void method1590() {
		Static124.method3214();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static254.aClass61Array2[local8].method1487();
		}
		Static134.method2179();
		Static403.method5492();
		System.gc();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)B")
	public static byte method1591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!em", name = "h", descriptor = "(I)V")
	public static void method1592() {
		Static401.method5464(false);
		Static306.anInt3571 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static439.aByteArrayArray47.length; local14++) {
			if (Static100.anIntArray40[local14] != -1 && Static439.aByteArrayArray47[local14] == null) {
				Static439.aByteArrayArray47[local14] = Static118.aClass158_26.method3672(0, Static100.anIntArray40[local14]);
				if (Static439.aByteArrayArray47[local14] == null) {
					Static306.anInt3571++;
					local12 = false;
				}
			}
			if (Static183.anIntArray518[local14] != -1 && Static37.aByteArrayArray48[local14] == null) {
				Static37.aByteArrayArray48[local14] = Static118.aClass158_26.method3699(Static183.anIntArray518[local14], Static58.anIntArrayArray8[local14], 0);
				if (Static37.aByteArrayArray48[local14] == null) {
					local12 = false;
					Static306.anInt3571++;
				}
			}
			if (Static369.anIntArray540[local14] != -1 && Static325.aByteArrayArray30[local14] == null) {
				Static325.aByteArrayArray30[local14] = Static118.aClass158_26.method3672(0, Static369.anIntArray540[local14]);
				if (Static325.aByteArrayArray30[local14] == null) {
					Static306.anInt3571++;
					local12 = false;
				}
			}
			if (Static247.anIntArray381[local14] != -1 && Static121.aByteArrayArray17[local14] == null) {
				Static121.aByteArrayArray17[local14] = Static118.aClass158_26.method3672(0, Static247.anIntArray381[local14]);
				if (Static121.aByteArrayArray17[local14] == null) {
					local12 = false;
					Static306.anInt3571++;
				}
			}
			if (Static53.anIntArray94 != null && Static27.aByteArrayArray5[local14] == null && Static53.anIntArray94[local14] != -1) {
				Static27.aByteArrayArray5[local14] = Static118.aClass158_26.method3699(Static53.anIntArray94[local14], Static58.anIntArrayArray8[local14], 0);
				if (Static27.aByteArrayArray5[local14] == null) {
					Static306.anInt3571++;
					local12 = false;
				}
			}
		}
		if (Static63.aClass267_2 == null) {
			if (Static167.aClass6_Sub1_Sub4_3 == null || !Static422.aClass158_88.method3682(Static167.aClass6_Sub1_Sub4_3.aString11 + "_staticelements")) {
				Static63.aClass267_2 = new Class267(0);
			} else if (Static422.aClass158_88.method3667(Static167.aClass6_Sub1_Sub4_3.aString11 + "_staticelements")) {
				Static63.aClass267_2 = Static126.method4052(Static118.aBoolean158, Static167.aClass6_Sub1_Sub4_3.aString11 + "_staticelements", Static422.aClass158_88);
			} else {
				local12 = false;
				Static306.anInt3571++;
			}
		}
		if (!local12) {
			Static102.anInt4995 = 1;
			return;
		}
		Static371.anInt6173 = 0;
		local12 = true;
		@Pc(265) int local265;
		@Pc(276) int local276;
		for (@Pc(247) int local247 = 0; local247 < Static439.aByteArrayArray47.length; local247++) {
			@Pc(253) byte[] local253 = Static37.aByteArrayArray48[local247];
			if (local253 != null) {
				local265 = (Static175.anIntArray282[local247] >> 8) * 64 - Static206.anInt3592;
				local276 = (Static175.anIntArray282[local247] & 0xFF) * 64 - Static99.anInt1814;
				if (Static261.anInt4478 != 0) {
					local276 = 10;
					local265 = 10;
				}
				local12 &= Static23.method331(local265, local253, Static84.anInt1632, local276, Static261.anInt4480);
			}
			local253 = Static121.aByteArrayArray17[local247];
			if (local253 != null) {
				local265 = (Static175.anIntArray282[local247] >> 8) * 64 - Static206.anInt3592;
				local276 = (Static175.anIntArray282[local247] & 0xFF) * 64 - Static99.anInt1814;
				if (Static261.anInt4478 != 0) {
					local265 = 10;
					local276 = 10;
				}
				local12 &= Static23.method331(local265, local253, Static84.anInt1632, local276, Static261.anInt4480);
			}
		}
		if (!local12) {
			Static102.anInt4995 = 2;
			return;
		}
		if (Static102.anInt4995 != 0) {
			Static94.method1630(true, Static60.aClass92_2, Static306.aClass231_61.method5138(Static382.anInt6289) + "<br>(100%)");
		}
		Static88.method1553();
		Static403.method5492();
		@Pc(374) boolean local374 = false;
		if (Static44.aClass28_14.method3530() && Static8.aClass173_Sub1_1.aBoolean301) {
			for (local265 = 0; local265 < Static439.aByteArrayArray47.length; local265++) {
				if (Static121.aByteArrayArray17[local265] != null || Static325.aByteArrayArray30[local265] != null) {
					local374 = true;
					break;
				}
			}
		}
		if (Static8.aClass173_Sub1_1.aBoolean303) {
			local265 = Static220.anIntArray320[Static130.anInt2325];
		} else {
			local265 = Static367.anIntArray613[Static130.anInt2325];
		}
		if (Static44.aClass28_14.method3557()) {
			local265++;
		}
		Static367.method5803(Static84.anInt1632, Static261.anInt4480, local265, local374, Static44.aClass28_14.method3574() > 0);
		for (local276 = 0; local276 < 4; local276++) {
			Static254.aClass61Array2[local276].method1487();
		}
		Static76.method1440();
		Static433.method3962(false);
		Static121.method1984();
		Static243.aClass46_1 = null;
		Static88.method1553();
		System.gc();
		Static401.method5464(true);
		Static138.method5580();
		Static100.aBoolean37 = Static8.aClass173_Sub1_1.aBoolean301;
		Static29.aBoolean33 = !Static8.aClass173_Sub1_1.aBoolean304;
		Static63.aBoolean112 = Static8.aClass173_Sub1_1.aBoolean317;
		Static314.anInt7070 = Static8.aClass173_Sub1_1.anInt4420;
		Static3.aBoolean419 = Static2.anInt8 >= 96;
		Static255.anInt4370 = Static8.aClass173_Sub1_1.method3965(Static155.anInt2774) ? -1 : Static3.anInt6323;
		Static271.aBoolean334 = Static155.anInt2774 == 1 || Static8.aClass173_Sub1_1.aBoolean305;
		Static160.aClass204_Sub1_1 = new Class204_Sub1(4, Static84.anInt1632, Static261.anInt4480, false);
		if (Static261.anInt4478 == 0) {
			Static170.method1627(Static439.aByteArrayArray47, Static160.aClass204_Sub1_1);
		} else {
			Static281.method4245(Static439.aByteArrayArray47, Static160.aClass204_Sub1_1);
		}
		Static65.method1234(Static261.anInt4480 >> 4, Static84.anInt1632 >> 4);
		Static312.method4468();
		if (local374) {
			Static165.method2688(true);
			Static237.aClass204_Sub1_2 = new Class204_Sub1(1, Static84.anInt1632, Static261.anInt4480, true);
			if (Static261.anInt4478 == 0) {
				Static170.method1627(Static325.aByteArrayArray30, Static237.aClass204_Sub1_2);
				Static401.method5464(true);
			} else {
				Static281.method4245(Static325.aByteArrayArray30, Static237.aClass204_Sub1_2);
				Static401.method5464(true);
			}
			Static237.aClass204_Sub1_2.method4538(Static160.aClass204_Sub1_1.anIntArrayArrayArray6[0]);
			Static237.aClass204_Sub1_2.method4529(Static44.aClass28_14, null, null);
			Static165.method2688(false);
		}
		Static160.aClass204_Sub1_1.method4529(Static44.aClass28_14, Static254.aClass61Array2, local374 ? Static237.aClass204_Sub1_2.anIntArrayArrayArray6 : null);
		if (Static261.anInt4478 == 0) {
			Static401.method5464(true);
			Static306.method3207(Static37.aByteArrayArray48, Static160.aClass204_Sub1_1);
			if (Static27.aByteArrayArray5 != null) {
				Static391.method1869();
			}
		} else {
			Static401.method5464(true);
			Static278.method4211(Static160.aClass204_Sub1_1, Static37.aByteArrayArray48);
		}
		Static403.method5492();
		Static401.method5464(true);
		Static160.aClass204_Sub1_1.method4534(local374 ? Static365.aClass84Array3[0] : null, null, Static44.aClass28_14);
		Static160.aClass204_Sub1_1.method4543(Static44.aClass28_14);
		Static401.method5464(true);
		if (local374) {
			Static165.method2688(true);
			Static401.method5464(true);
			if (Static261.anInt4478 == 0) {
				Static306.method3207(Static121.aByteArrayArray17, Static237.aClass204_Sub1_2);
			} else {
				Static278.method4211(Static237.aClass204_Sub1_2, Static121.aByteArrayArray17);
			}
			Static403.method5492();
			Static401.method5464(true);
			Static237.aClass204_Sub1_2.method4534(null, Static93.aClass84Array1[0], Static44.aClass28_14);
			Static237.aClass204_Sub1_2.method4543(Static44.aClass28_14);
			Static401.method5464(true);
			Static165.method2688(false);
		}
		Static232.method3614();
		@Pc(699) int local699 = Static160.aClass204_Sub1_1.anInt5196;
		if (local699 > Static4.anInt30) {
			local699 = Static4.anInt30;
		}
		if (local699 < Static4.anInt30 - 1) {
			local699 = Static4.anInt30 - 1;
		}
		if (Static8.aClass173_Sub1_1.method3965(Static155.anInt2774)) {
			Static300.method5941(0);
		} else {
			Static300.method5941(local699);
		}
		@Pc(734) int local734;
		@Pc(738) int local738;
		for (@Pc(730) int local730 = 0; local730 < 4; local730++) {
			for (local734 = 0; local734 < Static84.anInt1632; local734++) {
				for (local738 = 0; local738 < Static261.anInt4480; local738++) {
					Static316.method5796(local734, local738, local730);
				}
			}
		}
		Static158.method2616();
		Static88.method1553();
		Static428.method5840();
		Static403.method5492();
		Static84.aBoolean137 = false;
		Static127.method2070();
		if (Static176.aFrame2 != null && Static103.aClass30_1 != null && Static54.anInt1123 == 25) {
			Static298.method4373(Static262.aClass25_69);
			Static449.aClass6_Sub15_Sub1_2.method3107(1057001181);
		}
		if (Static261.anInt4478 == 0) {
			local734 = (Static371.anInt6170 - (Static84.anInt1632 >> 4)) / 8;
			local738 = ((Static84.anInt1632 >> 4) + Static371.anInt6170) / 8;
			@Pc(815) int local815 = (Static80.anInt1561 - (Static261.anInt4480 >> 4)) / 8;
			@Pc(823) int local823 = ((Static261.anInt4480 >> 4) + Static80.anInt1561) / 8;
			for (@Pc(827) int local827 = local734 - 1; local827 <= local738 + 1; local827++) {
				for (@Pc(833) int local833 = local815 - 1; local833 <= local823 + 1; local833++) {
					if (local827 < local734 || local738 < local827 || local815 > local833 || local823 < local833) {
						Static118.aClass158_26.method3690("m" + local827 + "_" + local833);
						Static118.aClass158_26.method3690("l" + local827 + "_" + local833);
					}
				}
			}
		}
		if (Static54.anInt1123 == 28) {
			Static260.method4007(10);
		} else {
			Static260.method4007(30);
			if (Static103.aClass30_1 != null) {
				Static298.method4373(Static114.aClass25_25);
			}
		}
		Static203.method3210();
		Static88.method1553();
		Static100.method402();
	}
}
