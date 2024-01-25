import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1389(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static113.aClass133ArrayArrayArray1 == null) {
			Static554.aClass90_12.method7482(arg1, -16777216, arg3, arg0, arg2);
		} else if (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >= 0 && Static18.anInt5706 * 512 > Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 && Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >= 0 && Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 < Static80.anInt1367 * 512) {
			Static114.anInt1963++;
			if (Static461.aClass15_Sub2_Sub4_Sub2_2 != null && Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 - (Static461.aClass15_Sub2_Sub4_Sub2_2.method7135() - 1) * 256 >> 9 == Static567.anInt9818 && Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 + 256 - Static461.aClass15_Sub2_Sub4_Sub2_2.method7135() * 256 >> 9 == Static542.anInt9320) {
				Static542.anInt9320 = -1;
				Static567.anInt9818 = -1;
				Static398.method5755();
			}
			Static500.method6916();
			if (!arg4) {
				Static410.method5894();
			}
			Static492.method6862();
			Static577.method7887(arg3, arg1, true, arg2, arg0);
			@Pc(114) int local114 = Static135.anInt2588;
			@Pc(116) int local116 = Static201.anInt3845;
			@Pc(118) int local118 = Static337.anInt6450;
			@Pc(120) int local120 = Static250.anInt4584;
			@Pc(131) int local131;
			@Pc(162) int local162;
			if (Static60.anInt1008 == 1) {
				local131 = (int) Static532.aFloat185;
				if (local131 < Static428.anInt7623 >> 8) {
					local131 = Static428.anInt7623 >> 8;
				}
				if (Static297.aBooleanArray18[4] && Static10.anIntArray7[4] + 128 > local131) {
					local131 = Static10.anIntArray7[4] + 128;
				}
				local162 = Static270.anInt4763 + (int) Static562.aFloat14 & 0x3FFF;
				Static58.method834(Static168.anInt3085, local131, Static37.method631(Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911, Static391.anInt7128) - 200, Static480.anInt8528, (local131 >> 3) * 3 + 600 << 2, local114, local162);
			} else if (Static60.anInt1008 == 4) {
				local131 = (int) Static532.aFloat185;
				if (Static428.anInt7623 >> 8 > local131) {
					local131 = Static428.anInt7623 >> 8;
				}
				if (Static297.aBooleanArray18[4] && Static10.anIntArray7[4] + 128 > local131) {
					local131 = Static10.anIntArray7[4] + 128;
				}
				local162 = (int) Static562.aFloat14 & 0x3FFF;
				Static58.method834(Static168.anInt3085, local131, Static37.method631(Static450.anInt7952, Static173.anInt3141, Static391.anInt7128) - 200, Static480.anInt8528, (local131 >> 3) * 3 + 600 << 2, local114, local162);
			} else if (Static60.anInt1008 == 5) {
				Static239.method3733(local114);
			}
			local131 = Static378.anInt6923;
			local162 = Static12.anInt183;
			@Pc(262) int local262 = Static208.anInt3949;
			@Pc(264) int local264 = Static38.anInt742;
			@Pc(266) int local266 = Static232.anInt9865;
			@Pc(310) int local310;
			for (@Pc(268) int local268 = 0; local268 < 5; local268++) {
				if (Static297.aBooleanArray18[local268]) {
					local310 = (int) ((double) -Static348.anIntArray459[local268] + (double) (Static348.anIntArray459[local268] * 2 + 1) * Math.random() + Math.sin((double) Static12.anIntArray11[local268] * ((double) Static134.anIntArray559[local268] / 100.0D)) * (double) Static10.anIntArray7[local268]);
					if (local268 == 3) {
						Static232.anInt9865 = Static232.anInt9865 + local310 & 0x3FFF;
					}
					if (local268 == 2) {
						Static208.anInt3949 += local310 << 2;
					}
					if (local268 == 1) {
						Static12.anInt183 += local310 << 2;
					}
					if (local268 == 0) {
						Static378.anInt6923 += local310 << 2;
					}
					if (local268 == 4) {
						Static38.anInt742 += local310;
						if (Static38.anInt742 < 1024) {
							Static38.anInt742 = 1024;
						} else if (Static38.anInt742 > 3072) {
							Static38.anInt742 = 3072;
						}
					}
				}
			}
			if (Static378.anInt6923 < 0) {
				Static378.anInt6923 = 0;
			}
			if (Static378.anInt6923 > (Static547.anInt9363 << 9) - 1) {
				Static378.anInt6923 = (Static547.anInt9363 << 9) - 1;
			}
			if (Static208.anInt3949 < 0) {
				Static208.anInt3949 = 0;
			}
			if (Static208.anInt3949 > (Static20.anInt358 << 9) - 1) {
				Static208.anInt3949 = (Static20.anInt358 << 9) - 1;
			}
			Static222.method3515();
			Static378.method5548();
			Static554.aClass90_12.ca(local120, local116, local118 + local120, local114 + local116);
			Static554.aClass90_12.method7521();
			local310 = Static163.anInt2988;
			if (Static145.aClass141_1 == null) {
				Static554.aClass90_12.D(local310);
			} else {
				Static145.aClass141_1.method3487(local116, local114, Static38.anInt742, local310, local120, local118, Static122.anInt2116 << 3, Static232.anInt9865, Static554.aClass90_12);
			}
			Static262.method3999();
			Static211.aClass93_7.pa(Static378.anInt6923, Static12.anInt183, Static208.anInt3949, -Static38.anInt742 & 0x3FFF, -Static232.anInt9865 & 0x3FFF, -Static463.anInt8184 & 0x3FFF);
			Static554.aClass90_12.method7492(Static211.aClass93_7);
			Static554.aClass90_12.m(local120 + local118 / 2, local116 + local114 / 2, Static76.anInt1290 << 1, Static76.anInt1290 << 1);
			Static79.method2308(Static76.anInt1290 << 1, local116 + local114 / 2, Static76.anInt1290 << 1, local118 / 2 + local120);
			Static242.method3763(-Static38.anInt742 & 0x3FFF, Static378.anInt6923, Static208.anInt3949, -Static463.anInt8184 & 0x3FFF, -Static232.anInt9865 & 0x3FFF, Static12.anInt183);
			@Pc(552) byte local552 = Static58.aClass6_Sub17_Sub1_1.method7360(Static79.anInt2700) == 2 ? (byte) Static114.anInt1963 : 1;
			Static213.method3447(Static554.aClass90_12, Static363.anInt6671, Static202.anInt3848, Static211.aClass93_7, Static378.anInt6923, Static12.anInt183, Static208.anInt3949, Static289.aByteArrayArrayArray7, Static471.anIntArray579, Static443.anIntArray562, Static103.anIntArray152, Static249.anIntArray376, Static435.anIntArray555, Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 + 1, local552, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 9, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 9, !Static58.aClass6_Sub17_Sub1_1.aBoolean609);
			Static262.method3999();
			if (Static375.anInt9162 == 10) {
				Static192.method3254(local120, local114, local118, local116);
				Static311.method4667(local118, local120, local116, local114);
				Static79.method2309(local116, local114, local120, local118);
				Static560.method7785(local118, local116, local120, local114);
			}
			Static377.method5519();
			Static38.anInt742 = local264;
			Static12.anInt183 = local162;
			Static378.anInt6923 = local131;
			Static208.anInt3949 = local262;
			Static232.anInt9865 = local266;
			if (Static302.aBoolean385 && Static469.aClass180_3.method4348() == 0) {
				Static302.aBoolean385 = false;
			}
			if (Static302.aBoolean385) {
				Static554.aClass90_12.method7482(local116, -16777216, local118, local114, local120);
				Static237.method3695(Static146.aClass103_13.method2355(Static188.anInt28), Static75.aClass82_1, false);
			}
		} else {
			Static554.aClass90_12.method7482(arg1, -16777216, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static76.method1083(arg4)) {
			return;
		}
		if (Static140.aClass97ArrayArray1[arg4] == null) {
			Static74.method1045(Static360.aClass97ArrayArray2[arg4], -1, arg2, arg0, arg7, arg5, arg3, arg1, arg8, arg6);
		} else {
			Static74.method1045(Static140.aClass97ArrayArray1[arg4], -1, arg2, arg0, arg7, arg5, arg3, arg1, arg8, arg6);
		}
	}
}
