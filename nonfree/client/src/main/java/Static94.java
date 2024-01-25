import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_20 = new Class38();

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "[I")
	public static final int[] anIntArray186 = new int[256];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!qa;Lclient!vp;III)V")
	public static void method2175(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class23 local8 = arg1.method7389(arg0);
		if (local8 == null) {
			return;
		}
		arg0.N(arg2, arg3, arg1.anInt8790 + arg2, arg3 - -arg1.anInt8752);
		if (Static222.anInt4501 == 2 || Static222.anInt4501 == 5 || Static352.aClass12_8 == null) {
			arg0.G(-16777216, local8, arg2, arg3);
			return;
		}
		@Pc(51) int local51;
		@Pc(54) int local54;
		@Pc(48) int local48;
		@Pc(61) int local61;
		if (Static464.anInt8003 == 4) {
			local48 = (int) -Static443.aFloat151 & 0x3FFF;
			local51 = Static347.anInt6403;
			local54 = Static67.anInt1925;
			local61 = 4096;
		} else {
			local48 = Static96.anInt2375 + (int) -Static443.aFloat151 & 0x3FFF;
			local51 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189;
			local54 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191;
			local61 = 4096 - Static189.anInt4000 * 16;
		}
		@Pc(87) int local87 = local51 / 32 + 48 - (Static542.anInt9387 + -104) * 2;
		@Pc(105) int local105 = Static36.anInt1324 * 4 + 48 - (Static36.anInt1324 - 104) * 2 - local54 / 32;
		Static352.aClass12_8.method7197((float) arg2 + (float) arg1.anInt8790 / 2.0F, (float) arg3 + (float) arg1.anInt8752 / 2.0F, (float) local87, (float) local105, local61, local48 << 2, local8, arg2, arg3);
		@Pc(155) int local155;
		@Pc(165) int local165;
		@Pc(176) int local176;
		@Pc(186) int local186;
		for (@Pc(139) Class1_Sub33 local139 = (Class1_Sub33) Static245.aClass38_37.method1419(); local139 != null; local139 = (Class1_Sub33) Static245.aClass38_37.method1415()) {
			@Pc(143) int local143 = local139.anInt6397;
			local155 = (Static161.aClass179_3.anIntArray392[local143] >> 14 & 0x3FFF) - Static324.anInt6132;
			local165 = (Static161.aClass179_3.anIntArray392[local143] & 0x3FFF) - Static517.anInt8716;
			local176 = local155 * 4 + 2 - local51 / 32;
			local186 = local165 * 4 + 2 - local54 / 32;
			Static45.method1409(local176, arg1, arg0, arg2, local8, Static161.aClass179_3.anIntArray393[local143], local186, arg3);
		}
		for (local155 = 0; local155 < Static516.anInt8709; local155++) {
			local165 = Static59.anIntArray156[local155] * 4 + 2 - local51 / 32;
			local176 = Static200.anIntArray323[local155] * 4 + 2 - local54 / 32;
			@Pc(242) Class288 local242 = Static365.aClass194_6.method5084(Static365.anIntArray769[local155]);
			if (local242.anIntArray650 != null) {
				local242 = local242.method7065(Static343.aClass286_1);
				if (local242 == null || local242.anInt8346 == -1) {
					continue;
				}
			}
			Static45.method1409(local165, arg1, arg0, arg2, local8, local242.anInt8346, local176, arg3);
		}
		@Pc(320) int local320;
		@Pc(330) int local330;
		for (@Pc(277) Class1_Sub11 local277 = (Class1_Sub11) Static528.aClass174_40.method4421(); local277 != null; local277 = (Class1_Sub11) Static528.aClass174_40.method4429()) {
			local176 = (int) (local277.aLong244 >> 28 & 0x3L);
			if (Static99.anInt2448 == local176) {
				local186 = (int) (local277.aLong244 & 0x3FFFL) - Static324.anInt6132;
				@Pc(309) int local309 = (int) (local277.aLong244 >> 14 & 0x3FFFL) - Static517.anInt8716;
				local320 = local186 * 4 + 2 - local51 / 32;
				local330 = local309 * 4 + 2 - local54 / 32;
				Static167.method3274(arg1, local320, local8, arg3, Static19.aClass12Array1[0], local330, arg2);
			}
		}
		@Pc(419) int local419;
		for (local176 = 0; local176 < Static457.anInt7857; local176++) {
			@Pc(360) Class1_Sub10 local360 = (Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local176]);
			if (local360 != null) {
				@Pc(365) Class47_Sub2_Sub3_Sub1 local365 = local360.aClass47_Sub2_Sub3_Sub1_2;
				if (local365.method3706() && Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 == local365.aByte94) {
					@Pc(381) Class238 local381 = local365.aClass238_1;
					if (local381 != null && local381.anIntArray511 != null) {
						local381 = local381.method5866(Static343.aClass286_1);
					}
					if (local381 != null && local381.aBoolean448 && local381.aBoolean452) {
						local330 = local365.anInt8189 / 32 - local51 / 32;
						local419 = local365.anInt8191 / 32 - local54 / 32;
						if (local381.anInt6791 == -1) {
							Static167.method3274(arg1, local330, local8, arg3, Static19.aClass12Array1[1], local419, arg2);
						} else {
							Static45.method1409(local330, arg1, arg0, arg2, local8, local381.anInt6791, local419, arg3);
						}
					}
				}
			}
		}
		local186 = Static412.anInt7191;
		@Pc(459) int[] local459 = Static349.anIntArray479;
		@Pc(501) int local501;
		@Pc(505) int local505;
		@Pc(531) int local531;
		for (local320 = 0; local320 < local186; local320++) {
			@Pc(468) Class47_Sub2_Sub3_Sub2 local468 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local459[local320]];
			if (local468 != null && local468.method4370() && Static16.aClass47_Sub2_Sub3_Sub2_1 != local468 && local468.aByte94 == Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94) {
				local419 = local468.anInt8189 / 32 - local51 / 32;
				local501 = local468.anInt8191 / 32 - local54 / 32;
				@Pc(503) boolean local503 = false;
				for (local505 = 0; local505 < Static108.anInt2509; local505++) {
					if (local468.aString36.equals(Static366.aStringArray40[local505]) && Static210.anIntArray326[local505] != 0) {
						local503 = true;
						break;
					}
				}
				@Pc(529) boolean local529 = false;
				for (local531 = 0; local531 < Static308.anInt5922; local531++) {
					if (local468.aString36.equals(Static83.aClass169Array1[local531].aString41)) {
						local529 = true;
						break;
					}
				}
				@Pc(549) boolean local549 = false;
				if (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5088 != 0 && local468.anInt5088 != 0 && local468.anInt5088 == Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5088) {
					local549 = true;
				}
				if (local468.aBoolean346) {
					Static167.method3274(arg1, local419, local8, arg3, Static19.aClass12Array1[6], local501, arg2);
				} else if (local503) {
					Static167.method3274(arg1, local419, local8, arg3, Static19.aClass12Array1[3], local501, arg2);
				} else if (local529) {
					Static167.method3274(arg1, local419, local8, arg3, Static19.aClass12Array1[5], local501, arg2);
				} else if (local549) {
					Static167.method3274(arg1, local419, local8, arg3, Static19.aClass12Array1[4], local501, arg2);
				} else {
					Static167.method3274(arg1, local419, local8, arg3, Static19.aClass12Array1[2], local501, arg2);
				}
			}
		}
		@Pc(647) Class28[] local647 = Static484.aClass28Array1;
		@Pc(731) int local731;
		for (local419 = 0; local419 < local647.length; local419++) {
			@Pc(654) Class28 local654 = local647[local419];
			if (local654 != null && local654.anInt1262 != 0 && Static416.anInt7252 % 20 < 10) {
				@Pc(695) int local695;
				if (local654.anInt1262 == 1) {
					@Pc(680) Class1_Sub10 local680 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local654.anInt1265);
					if (local680 != null) {
						@Pc(685) Class47_Sub2_Sub3_Sub1 local685 = local680.aClass47_Sub2_Sub3_Sub1_2;
						local695 = local685.anInt8189 / 32 - local51 / 32;
						local531 = local685.anInt8191 / 32 - local54 / 32;
						Static320.method5231(arg1, local654.anInt1264, local695, local8, arg3, local531, arg2, 360000L);
					}
				}
				if (local654.anInt1262 == 2) {
					local731 = local654.anInt1260 / 32 - local51 / 32;
					local505 = local654.anInt1263 / 32 - local54 / 32;
					@Pc(747) long local747 = (long) (local654.anInt1259 << 5);
					@Pc(751) long local751 = local747 * local747;
					Static320.method5231(arg1, local654.anInt1264, local731, local8, arg3, local505, arg2, local751);
				}
				if (local654.anInt1262 == 10 && local654.anInt1265 >= 0 && local654.anInt1265 < Static473.aClass47_Sub2_Sub3_Sub2Array1.length) {
					@Pc(785) Class47_Sub2_Sub3_Sub2 local785 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local654.anInt1265];
					if (local785 != null) {
						local505 = local785.anInt8189 / 32 - local51 / 32;
						local695 = local785.anInt8191 / 32 - local54 / 32;
						Static320.method5231(arg1, local654.anInt1264, local505, local8, arg3, local695, arg2, 360000L);
					}
				}
			}
		}
		if (Static464.anInt8003 == 4) {
			return;
		}
		if (Static540.anInt9357 != 0) {
			local501 = Static540.anInt9357 * 4 + Static16.aClass47_Sub2_Sub3_Sub2_1.method4350() * 2 + 2 - local51 / 32 - 2;
			local731 = Static417.anInt6093 * 4 + Static16.aClass47_Sub2_Sub3_Sub2_1.method4350() * 2 + 2 - local54 / 32 - 2;
			Static167.method3274(arg1, local501, local8, arg3, Static42.aClass12Array4[Static79.aBoolean156 ? 1 : 0], local731, arg2);
		}
		arg0.method7632(arg2 + arg1.anInt8790 / 2 - 1, -1, 3, 3, arg3 + arg1.anInt8752 / 2 - 1);
		return;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static542.aByteArrayArrayArray17[0][arg2][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static542.aByteArrayArrayArray17[arg3][arg2][arg1] & 0x10) == 0) {
			return Static112.method2463(arg1, arg2, arg3) == arg0;
		} else {
			return false;
		}
	}
}
