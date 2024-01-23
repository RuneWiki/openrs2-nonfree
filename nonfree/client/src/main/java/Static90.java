import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
	public static int anInt1865;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
	public static int anInt1866;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "Lclient!dh;")
	public static Class33 aClass33_13 = new Class33(100);

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "Lclient!sg;")
	public static Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
	public static void method1439() {
		Static263.aClass33_7.method839();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBILclient!cc;I)V")
	public static void method1440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) int arg3) {
		Static81.method3275();
		if (Static178.aBoolean216) {
			Static186.method2963(arg0, arg1, arg0 + arg2.anInt546, arg1 - -arg2.anInt602);
		} else {
			Static166.method2622(arg0, arg1, arg2.anInt546 + arg0, arg1 + arg2.anInt602);
		}
		if (Static47.anInt949 != 2 && Static47.anInt949 != 5 && Static116.aClass4_Sub2_Sub1_4 != null) {
			@Pc(58) int local58 = Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32 + 48;
			@Pc(66) int local66 = 464 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
			@Pc(74) int local74 = (int) Static270.aFloat49 + Static113.anInt2470 & 0x7FF;
			if (Static178.aBoolean216) {
				((Class4_Sub2_Sub1_Sub2) Static116.aClass4_Sub2_Sub1_4).method2582(arg0, arg1, arg2.anInt546, arg2.anInt602, local58, local66, local74, Static44.anInt879 + 256, (Class4_Sub2_Sub1_Sub2) arg2.method461(false));
			} else {
				((Class4_Sub2_Sub1_Sub1) Static116.aClass4_Sub2_Sub1_4).method3480(arg0, arg1, arg2.anInt546, arg2.anInt602, local58, local66, local74, Static44.anInt879 + 256, arg2.anIntArray52, arg2.anIntArray60);
			}
			@Pc(173) int local173;
			@Pc(152) int local152;
			@Pc(177) int local177;
			@Pc(189) int local189;
			@Pc(228) int local228;
			@Pc(210) int local210;
			@Pc(247) int local247;
			@Pc(279) int local279;
			if (Static158.aClass9_1 != null) {
				for (@Pc(123) int local123 = 0; local123 < Static158.aClass9_1.anInt203; local123++) {
					if (Static158.aClass9_1.method175(local123)) {
						local152 = ((Static158.aClass9_1.anIntArray22[local123] & 0x3FFF) - Static239.anInt4613) * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
						local173 = ((Static158.aClass9_1.anIntArray22[local123] >> 14 & 0x3FFF) - Static170.anInt3385) * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
						local177 = Class131.anIntArray355[local74];
						@Pc(185) int local185 = local177 * 256 / (Static44.anInt879 + 256);
						local189 = Class131.anIntArray353[local74];
						@Pc(197) int local197 = local189 * 256 / (Static44.anInt879 + 256);
						@Pc(199) Class4_Sub2_Sub12 local199 = Static79.aClass4_Sub2_Sub12_2;
						local210 = local197 * local152 - local185 * local173 >> 16;
						if (Static158.aClass9_1.method178(local123) == 1) {
							local199 = Static49.aClass4_Sub2_Sub12_1;
						}
						local228 = local173 * local197 + local185 * local152 >> 16;
						if (Static158.aClass9_1.method178(local123) == 2) {
							local199 = Static289.aClass4_Sub2_Sub12_3;
						}
						local247 = local199.method4178(Static158.aClass9_1.aStringArray2[local123], 100);
						local228 -= local247 / 2;
						if (local228 >= -arg2.anInt546 && arg2.anInt546 >= local228 && -arg2.anInt602 <= local210 && local210 <= arg2.anInt602) {
							local279 = 16777215;
							if (Static158.aClass9_1.anIntArray21[local123] != -1) {
								local279 = Static158.aClass9_1.anIntArray21[local123];
							}
							if (Static178.aBoolean216) {
								Static186.method2966((Class4_Sub2_Sub1_Sub2) arg2.method461(false));
							} else {
								Static166.method2628(arg2.anIntArray52, arg2.anIntArray60);
							}
							local199.method4194(Static158.aClass9_1.aStringArray2[local123], arg0 + local228 + arg2.anInt546 / 2, arg1 + arg2.anInt602 / 2 - local210, local247, 50, local279, 0, 1, 0, 0);
							if (Static178.aBoolean216) {
								Static186.method2969();
							} else {
								Static166.method2606();
							}
						}
					}
				}
			}
			for (local173 = 0; local173 < Static167.anInt3310; local173++) {
				local152 = Static94.anIntArray209[local173] * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
				local177 = Static93.anIntArray207[local173] * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
				@Pc(394) Class47 local394 = Static170.method2683(Static3.anIntArray5[local173]);
				if (local394.anIntArray142 != null) {
					local394 = local394.method1096();
					if (local394 == null || local394.anInt1365 == -1) {
						continue;
					}
				}
				Static268.method4003(arg2, local152, Static61.aClass4_Sub2_Sub1Array5[local394.anInt1365], arg1, arg0, local177);
			}
			for (local173 = 0; local173 < 104; local173++) {
				for (local152 = 0; local152 < 104; local152++) {
					@Pc(448) Class10 local448 = Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local173][local152];
					if (local448 != null) {
						local189 = local173 * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
						local228 = local152 * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
						Static268.method4003(arg2, local189, Static1.aClass4_Sub2_Sub1Array1[0], arg1, arg0, local228);
					}
				}
			}
			for (local173 = 0; local173 < Static68.anInt1262; local173++) {
				@Pc(507) Class12_Sub3_Sub1 local507 = Static100.aClass12_Sub3_Sub1Array1[Static10.anIntArray20[local173]];
				if (local507 != null && local507.method3374()) {
					@Pc(518) Class175 local518 = local507.aClass175_1;
					if (local518 != null && local518.anIntArray462 != null) {
						local518 = local518.method4133();
					}
					if (local518 != null && local518.aBoolean346 && local518.aBoolean345) {
						local189 = local507.anInt4141 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
						local228 = local507.anInt4113 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
						if (local518.anInt5193 == -1) {
							Static268.method4003(arg2, local189, Static1.aClass4_Sub2_Sub1Array1[1], arg1, arg0, local228);
						} else {
							Static268.method4003(arg2, local189, Static61.aClass4_Sub2_Sub1Array5[local518.anInt5193], arg1, arg0, local228);
						}
					}
				}
			}
			for (local173 = 0; local173 < Static41.anInt856; local173++) {
				@Pc(605) Class12_Sub3_Sub2 local605 = Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local173]];
				if (local605 != null && local605.method3374()) {
					local177 = local605.anInt4141 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
					@Pc(626) boolean local626 = false;
					local189 = local605.anInt4113 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
					@Pc(642) long local642 = Static34.method491(local605.aString132);
					for (local247 = 0; local247 < Static231.anInt4525; local247++) {
						if (Static153.aLongArray7[local247] == local642 && Static131.anIntArray247[local247] != 0) {
							local626 = true;
							break;
						}
					}
					@Pc(672) boolean local672 = false;
					for (local279 = 0; local279 < Static26.anInt478; local279++) {
						if (local642 == Static83.aClass4_Sub16Array3[local279].aLong200) {
							local672 = true;
							break;
						}
					}
					@Pc(693) boolean local693 = false;
					if (Static239.aClass12_Sub3_Sub2_2.anInt4208 != 0 && local605.anInt4208 != 0 && local605.anInt4208 == Static239.aClass12_Sub3_Sub2_2.anInt4208) {
						local693 = true;
					}
					if (local626) {
						Static268.method4003(arg2, local177, Static1.aClass4_Sub2_Sub1Array1[3], arg1, arg0, local189);
					} else if (local672) {
						Static268.method4003(arg2, local177, Static1.aClass4_Sub2_Sub1Array1[5], arg1, arg0, local189);
					} else if (local693) {
						Static268.method4003(arg2, local177, Static1.aClass4_Sub2_Sub1Array1[4], arg1, arg0, local189);
					} else {
						Static268.method4003(arg2, local177, Static1.aClass4_Sub2_Sub1Array1[2], arg1, arg0, local189);
					}
				}
			}
			@Pc(774) Class7[] local774 = Static250.aClass7Array1;
			for (local152 = 0; local152 < local774.length; local152++) {
				@Pc(784) Class7 local784 = local774[local152];
				if (local784 != null && local784.anInt135 != 0 && Static104.anInt2226 % 20 < 10) {
					if (local784.anInt135 == 1 && local784.anInt133 >= 0 && local784.anInt133 < Static100.aClass12_Sub3_Sub1Array1.length) {
						@Pc(819) Class12_Sub3_Sub1 local819 = Static100.aClass12_Sub3_Sub1Array1[local784.anInt133];
						if (local819 != null) {
							local228 = local819.anInt4141 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
							local210 = local819.anInt4113 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
							Static281.method4238(arg1, arg2, local784.anInt131, local210, arg0, local228, 360000);
						}
					}
					if (local784.anInt135 == 2) {
						local189 = (local784.anInt137 - Static170.anInt3385) * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
						local210 = local784.anInt130 * 4;
						local210 *= local210;
						local228 = (local784.anInt139 - Static239.anInt4613) * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
						Static281.method4238(arg1, arg2, local784.anInt131, local228, arg0, local189, local210);
					}
					if (local784.anInt135 == 10 && local784.anInt133 >= 0 && local784.anInt133 < Static257.aClass12_Sub3_Sub2Array1.length) {
						@Pc(931) Class12_Sub3_Sub2 local931 = Static257.aClass12_Sub3_Sub2Array1[local784.anInt133];
						if (local931 != null) {
							local210 = local931.anInt4113 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
							local228 = local931.anInt4141 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
							Static281.method4238(arg1, arg2, local784.anInt131, local210, arg0, local228, 360000);
						}
					}
				}
			}
			if (Static207.anInt4065 != 0) {
				local173 = Static207.anInt4065 * 4 + Static239.aClass12_Sub3_Sub2_2.method3375() * 2 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32 - 2;
				local152 = Static296.anInt1762 * 4 + Static239.aClass12_Sub3_Sub2_2.method3375() * 2 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32 - 2;
				Static268.method4003(arg2, local173, Static251.aClass4_Sub2_Sub1_9, arg1, arg0, local152);
			}
			if (Static178.aBoolean216) {
				Static186.method2968(arg2.anInt546 / 2 + arg0 - 1, arg1 + arg2.anInt602 / 2 - 1, 3, 3, 16777215);
			} else {
				Static166.method2627(arg2.anInt546 / 2 + arg0 - 1, arg2.anInt602 / 2 + (arg1 - 1), 3, 3, 16777215);
			}
		} else if (Static178.aBoolean216) {
			@Pc(1074) Class4_Sub2_Sub1 local1074 = arg2.method461(false);
			if (local1074 != null) {
				local1074.method3454(arg0, arg1);
			}
		} else {
			Static166.method2607(arg0, arg1, arg2.anIntArray52, arg2.anIntArray60);
		}
		Static72.aBooleanArray11[arg3] = true;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	public static void method1441() {
		aClass33_13 = null;
		aString56 = null;
		aClass154_1 = null;
		aByteArrayArray9 = null;
	}
}
