import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dfa", name = "w", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!dfa", name = "y", descriptor = "Lclient!om;")
	public static Class246 aClass246_46;

	@OriginalMember(owner = "client!dfa", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!dfa", name = "K", descriptor = "Lclient!om;")
	public static Class246 aClass246_47;

	@OriginalMember(owner = "client!dfa", name = "B", descriptor = "[I")
	public static final int[] anIntArray141 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!dfa", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString30 = null;

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)V")
	public static void method2011() {
		Static511.aClass130_51 = new Class130();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static554.aClass63ArrayArrayArray4 == null) {
			Static4.aClass43_1.method7185(arg1, arg3, arg2, arg0, -16777216);
		} else if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 >= 0 && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 < Static400.anInt6818 * 512 && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 >= 0 && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 < Static271.anInt5050 * 512) {
			Static337.anInt5983++;
			if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 != null && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 + 256 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5569() * 256 >> 9 == Static341.anInt6021 && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 + 256 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5569() * 256 >> 9 == Static329.anInt5894) {
				Static341.anInt6021 = -1;
				Static329.anInt5894 = -1;
				Static468.method6468();
			}
			Static402.method5857();
			if (!arg4) {
				Static224.method3883();
			}
			Static69.method1637();
			Static557.method7421(arg2, arg0, arg1, arg3, true);
			@Pc(125) int local125 = Static290.anInt9206;
			@Pc(127) int local127 = Static201.anInt4077;
			@Pc(129) int local129 = Static588.anInt2856;
			@Pc(131) int local131 = Static446.anInt7361;
			@Pc(139) int local139;
			@Pc(173) int local173;
			if (Static446.anInt7363 == 1) {
				local139 = (int) Static527.aFloat183;
				if (Static168.anInt8982 >> 8 > local139) {
					local139 = Static168.anInt8982 >> 8;
				}
				if (Static508.aBooleanArray30[4] && Static47.anIntArray92[4] + 128 > local139) {
					local139 = Static47.anIntArray92[4] + 128;
				}
				local173 = (int) Static439.aFloat151 + Static91.anInt2282 & 0x3FFF;
				Static162.method2890(local139, local131, (local139 >> 3) * 3 + 600 << 2, Static498.anInt7926, local173, Static45.anInt998, Static130.method2562(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980, Static209.anInt8182, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975) - 200);
			} else if (Static446.anInt7363 == 4) {
				local139 = (int) Static527.aFloat183;
				if (local139 < Static168.anInt8982 >> 8) {
					local139 = Static168.anInt8982 >> 8;
				}
				if (Static508.aBooleanArray30[4] && local139 < Static47.anIntArray92[4] + 128) {
					local139 = Static47.anIntArray92[4] + 128;
				}
				local173 = (int) Static439.aFloat151 & 0x3FFF;
				Static162.method2890(local139, local131, (local139 >> 3) * 3 + 600 << 2, Static498.anInt7926, local173, Static45.anInt998, Static130.method2562(Static383.anInt6591, Static209.anInt8182, Static92.anInt2289) - 200);
			} else if (Static446.anInt7363 == 5) {
				Static88.method1969(local131);
			}
			local139 = Static421.anInt7061;
			local173 = Static545.anInt8633;
			@Pc(282) int local282 = Static233.anInt4431;
			@Pc(284) int local284 = Static37.anInt878;
			@Pc(286) int local286 = Static154.anInt3150;
			@Pc(330) int local330;
			for (@Pc(288) int local288 = 0; local288 < 5; local288++) {
				if (Static508.aBooleanArray30[local288]) {
					local330 = (int) ((double) -Static244.anIntArray365[local288] + (double) (Static244.anIntArray365[local288] * 2 + 1) * Math.random() + Math.sin((double) Static461.anIntArray585[local288] * ((double) Static282.anIntArray385[local288] / 100.0D)) * (double) Static47.anIntArray92[local288]);
					if (local288 == 4) {
						Static37.anInt878 += local330;
						if (Static37.anInt878 < 1024) {
							Static37.anInt878 = 1024;
						} else if (Static37.anInt878 > 3072) {
							Static37.anInt878 = 3072;
						}
					}
					if (local288 == 0) {
						Static421.anInt7061 += local330 << 2;
					}
					if (local288 == 2) {
						Static233.anInt4431 += local330 << 2;
					}
					if (local288 == 3) {
						Static154.anInt3150 = Static154.anInt3150 + local330 & 0x3FFF;
					}
					if (local288 == 1) {
						Static545.anInt8633 += local330 << 2;
					}
				}
			}
			if (Static421.anInt7061 < 0) {
				Static421.anInt7061 = 0;
			}
			if ((Static411.anInt6927 << 9) - 1 < Static421.anInt7061) {
				Static421.anInt7061 = (Static411.anInt6927 << 9) - 1;
			}
			if (Static233.anInt4431 < 0) {
				Static233.anInt4431 = 0;
			}
			if (Static233.anInt4431 > (Static157.anInt3168 << 9) - 1) {
				Static233.anInt4431 = (Static157.anInt3168 << 9) - 1;
			}
			Static182.method3149();
			Static62.method4288();
			Static4.aClass43_1.da(local127, local125, local127 + local129, local131 + local125);
			Static4.aClass43_1.ya();
			local330 = Static278.anInt5099;
			if (Static461.aClass242_1 == null) {
				Static4.aClass43_1.ja(local330);
			} else {
				Static461.aClass242_1.method5529(local127, local125, local129, Static37.anInt878, Static154.anInt3150, Static150.anInt3121 << 3, local131, Static4.aClass43_1, local330);
			}
			Static66.method1526();
			Static328.aClass109_5.na(Static421.anInt7061, Static545.anInt8633, Static233.anInt4431, -Static37.anInt878 & 0x3FFF, -Static154.anInt3150 & 0x3FFF, -Static68.anInt4065 & 0x3FFF);
			Static4.aClass43_1.method7187(Static328.aClass109_5);
			Static4.aClass43_1.la(local129 / 2 + local127, local125 - -(local131 / 2), Static143.anInt8271 << 1, Static143.anInt8271 << 1);
			Static232.method3926(Static143.anInt8271 << 1, local127 + local129 / 2, Static143.anInt8271 << 1, local125 + local131 / 2);
			Static5.method98(Static545.anInt8633, -Static37.anInt878 & 0x3FFF, -Static68.anInt4065 & 0x3FFF, -Static154.anInt3150 & 0x3FFF, Static421.anInt7061, Static233.anInt4431);
			@Pc(569) byte local569 = Static278.aClass3_Sub13_Sub1_1.method4481(Static260.anInt4932) == 2 ? (byte) Static337.anInt5983 : 1;
			Static349.method5290(Static305.anInt5560, Static421.anInt7061, Static545.anInt8633, Static233.anInt4431, Static55.aByteArrayArrayArray2, Static76.anIntArray123, Static368.anIntArray498, Static334.anIntArray462, Static336.anIntArray464, Static280.anIntArray383, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 + 1, local569, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 >> 9, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 >> 9, !Static278.aClass3_Sub13_Sub1_1.aBoolean402);
			Static66.method1526();
			if (Static246.anInt4542 == 10) {
				Static596.method7816(local125, local127, local131, local129);
				Static434.method4791(local129, local125, local127, local131);
				Static415.method7486(local131, local125, local129, local127);
				Static477.method6550(local125, local127, local131, local129);
			}
			Static441.method6205();
			Static545.anInt8633 = local173;
			Static421.anInt7061 = local139;
			Static37.anInt878 = local284;
			Static233.anInt4431 = local282;
			Static154.anInt3150 = local286;
			if (Static204.aBoolean320 && Static153.aClass331_1.method7004() == 0) {
				Static204.aBoolean320 = false;
			}
			if (Static204.aBoolean320) {
				Static4.aClass43_1.method7185(local125, local131, local129, local127, -16777216);
				Static392.method5757(Static4.aClass43_1, Static48.aClass33_14.method797(Static131.anInt2839), false, Static49.aClass117_1, Static103.aClass58_6);
			}
		} else {
			Static4.aClass43_1.method7185(arg1, arg3, arg2, arg0, -16777216);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!om;ILclient!om;Lclient!om;Lclient!om;)V")
	public static void method2013(@OriginalArg(0) Class246 arg0, @OriginalArg(2) Class246 arg1, @OriginalArg(3) Class246 arg2, @OriginalArg(4) Class246 arg3) {
		Static552.aClass246_253 = arg0;
		Static252.aClass246_119 = arg1;
		Static249.aClass246_117 = arg3;
		Static59.aClass203ArrayArray3 = new Class203[Static552.aClass246_253.method5682()][];
		Static457.aBooleanArray29 = new boolean[Static552.aClass246_253.method5682()];
	}

	@OriginalMember(owner = "client!dfa", name = "e", descriptor = "(I)V")
	public static void method2014() {
		if (Static527.aFloat183 < 1024.0F) {
			Static527.aFloat183 = 1024.0F;
		}
		while (Static439.aFloat151 >= 16384.0F) {
			Static439.aFloat151 -= 16384.0F;
		}
		if (Static527.aFloat183 > 3072.0F) {
			Static527.aFloat183 = 3072.0F;
		}
		while (Static439.aFloat151 < 0.0F) {
			Static439.aFloat151 += 16384.0F;
		}
		@Pc(41) int local41 = Static45.anInt998 >> 9;
		@Pc(50) int local50 = Static498.anInt7926 >> 9;
		@Pc(56) int local56 = Static130.method2562(Static498.anInt7926, Static209.anInt8182, Static45.anInt998);
		@Pc(58) int local58 = 0;
		@Pc(84) int local84;
		if (local41 > 3 && local50 > 3 && local41 < Static400.anInt6818 - 4 && Static271.anInt5050 - 4 > local50) {
			for (local84 = local41 - 4; local84 <= local41 + 4; local84++) {
				for (@Pc(90) int local90 = local50 - 4; local90 <= local50 + 4; local90++) {
					@Pc(94) int local94 = Static209.anInt8182;
					if (local94 < 3 && Static425.method6053(local84, local90)) {
						local94++;
					}
					@Pc(105) int local105 = 0;
					if (Static589.aClass70_Sub1_2.aByteArrayArrayArray14 != null && Static589.aClass70_Sub1_2.aByteArrayArrayArray14[local94] != null) {
						local105 = (Static589.aClass70_Sub1_2.aByteArrayArrayArray14[local94][local84][local90] & 0xFF) * 8;
					}
					if (Static29.aClass139Array6 != null && Static29.aClass139Array6[local94] != null) {
						@Pc(144) int local144 = local56 + local105 - Static29.aClass139Array6[local94].method6889(local84, local90);
						if (local58 < local144) {
							local58 = local144;
						}
					}
				}
			}
		}
		local84 = (local58 >> 2) * 1536;
		if (local84 > 786432) {
			local84 = 786432;
		}
		if (local84 < 262144) {
			local84 = 262144;
		}
		if (Static168.anInt8982 < local84) {
			Static168.anInt8982 += (local84 - Static168.anInt8982) / 24;
		} else if (local84 < Static168.anInt8982) {
			Static168.anInt8982 += (local84 - Static168.anInt8982) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)V")
	public static void method2016() {
		Static294.aClass10_31.method258(5);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I[S)[S")
	public static short[] method2017(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static604.method5913(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
