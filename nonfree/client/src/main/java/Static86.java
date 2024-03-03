import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1912;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([I[ILclient!oe;I[I)V", line = 4)
	public static void method1968(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class11_Sub5_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) int local9 = arg0[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg2.aClass20Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass20Array3[local19] = null;
					} else {
						@Pc(41) Class157 local41 = Static37.aClass85_1.method2373(local9);
						@Pc(44) int local44 = local41.anInt4017;
						@Pc(49) Class20 local49 = arg2.aClass20Array3[local19];
						if (local49 != null) {
							if (local9 == local49.anInt624) {
								if (local44 == 0) {
									local49 = arg2.aClass20Array3[local19] = null;
								} else if (local44 == 1) {
									local49.anInt626 = 0;
									local49.anInt625 = 0;
									local49.anInt629 = local17;
									local49.anInt628 = 0;
									local49.anInt627 = 1;
									Static1.method4(local41, false, arg2.aByte78, arg2.anInt6768, arg2.anInt6770, 0);
								} else if (local44 == 2) {
									local49.anInt626 = 0;
								}
							} else if (local41.anInt4018 >= Static37.aClass85_1.method2373(local49.anInt624).anInt4018) {
								local49 = arg2.aClass20Array3[local19] = null;
							}
						}
						if (local49 == null) {
							local49 = arg2.aClass20Array3[local19] = new Class20();
							local49.anInt625 = 0;
							local49.anInt627 = 1;
							local49.anInt628 = 0;
							local49.anInt624 = local9;
							local49.anInt626 = 0;
							local49.anInt629 = local17;
							Static1.method4(local41, false, arg2.aByte78, arg2.anInt6768, arg2.anInt6770, 0);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!nk;Lclient!wm;IIB)V", line = 105)
	public static void method1969(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class78 local14 = arg0.method4110(arg1);
		if (local14 == null) {
			return;
		}
		arg1.method2897(arg3, arg2, arg3 + arg0.anInt4242, arg0.anInt4255 + arg2);
		if (Class103.anInt2700 == 2 || Class103.anInt2700 == 5 || Static269.aClass13_15 == null) {
			arg1.method2813(local14, arg3, arg2);
			return;
		}
		@Pc(61) int local61;
		@Pc(58) int local58;
		@Pc(69) int local69;
		@Pc(55) int local55;
		if (Static291.anInt5899 == 4) {
			local58 = Class229.anInt6436;
			local55 = 4096;
			local69 = (int) -Class187.aFloat66 & 0x3FFF;
			local61 = Class2_Sub3_Sub39.anInt7251;
		} else {
			local55 = 4096 - Class71.anInt2003 * 16;
			local58 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770;
			local61 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768;
			local69 = Class2_Sub3_Sub1.anInt158 + (int) -Class187.aFloat66 & 0x3FFF;
		}
		@Pc(96) int local96 = local61 / 32 + 48 - (Class241.anInt7020 + -104) * 2;
		@Pc(115) int local115 = OutputStream_Sub1.anInt4442 * 4 + 48 - (OutputStream_Sub1.anInt4442 - 104) * 2 - local58 / 32;
		Static269.aClass13_15.method6397((float) arg0.anInt4242 / 2.0F + (float) arg3, (float) arg0.anInt4255 / 2.0F + (float) arg2, (float) local96, (float) local115, local55, local69 << 2, local14, arg3, arg2);
		@Pc(165) int local165;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(149) Class2_Sub39 local149 = (Class2_Sub39) Class43.aClass135_13.method3552(); local149 != null; local149 = (Class2_Sub39) Class43.aClass135_13.method3553()) {
			@Pc(154) int local154 = local149.anInt6805;
			local165 = (Static33.aClass103_3.anIntArray170[local154] >> 14 & 0x3FFF) - Static154.anInt3136;
			local174 = (Static33.aClass103_3.anIntArray170[local154] & 0x3FFF) - Static139.anInt2716;
			local185 = local165 * 4 + 2 - local61 / 32;
			local196 = local174 * 4 + 2 - local58 / 32;
			Static201.method3777(arg3, arg0, Static33.aClass103_3.anIntArray171[local154], arg1, local196, local14, local185, arg2);
		}
		for (local165 = 0; local165 < Class19.anInt2828; local165++) {
			local174 = Class248.anIntArray494[local165] * 4 + 2 - local61 / 32;
			local185 = Class3.anIntArray2[local165] * 4 + 2 - local58 / 32;
			@Pc(253) Class41 local253 = Static334.aClass202_4.method5164(Class12_Sub4.anIntArray265[local165]);
			if (local253.anIntArray94 != null) {
				local253 = local253.method1535(Static199.aClass226_1);
				if (local253 == null || local253.anInt1305 == -1) {
					continue;
				}
			}
			Static201.method3777(arg3, arg0, local253.anInt1305, arg1, local185, local14, local174, arg2);
		}
		for (@Pc(293) Class2_Sub32 local293 = (Class2_Sub32) Class87.aClass4_49.method80(); local293 != null; local293 = (Class2_Sub32) Class87.aClass4_49.method79()) {
			local185 = (int) (local293.aLong232 >> 28 & 0x3L);
			if (local185 == Class226.anInt6377) {
				local196 = (int) (local293.aLong232 & 0x3FFFL) * 4 + 2 - local61 / 32;
				@Pc(337) int local337 = (int) (local293.aLong232 >> 14 & 0x3FFFL) * 4 + 2 - local58 / 32;
				Static351.method6289(local14, local196, arg3, local337, Static72.aClass13Array5[0], arg2, arg0);
			}
		}
		@Pc(410) int local410;
		for (local185 = 0; local185 < Class117.anInt3183; local185++) {
			@Pc(365) Class11_Sub5_Sub2_Sub2 local365 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local185]];
			if (local365 != null && local365.method4337() && local365.aByte78 == Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) {
				@Pc(383) Class71 local383 = local365.aClass71_1;
				if (local383 != null && local383.anIntArray129 != null) {
					local383 = local383.method2095(Static199.aClass226_1);
				}
				if (local383 != null && local383.aBoolean147 && local383.aBoolean145) {
					local410 = local365.anInt6768 / 32 - local61 / 32;
					@Pc(419) int local419 = local365.anInt6770 / 32 - local58 / 32;
					if (local383.anInt2035 == -1) {
						Static351.method6289(local14, local410, arg3, local419, Static72.aClass13Array5[1], arg2, arg0);
					} else {
						Static201.method3777(arg3, arg0, local383.anInt2035, arg1, local419, local14, local410, arg2);
					}
				}
			}
		}
		local196 = Class28.anInt751;
		@Pc(455) int[] local455 = Class64.anIntArray121;
		@Pc(489) int local489;
		@Pc(498) int local498;
		@Pc(502) int local502;
		for (local410 = 0; local410 < local196; local410++) {
			@Pc(465) Class11_Sub5_Sub2_Sub1 local465 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local455[local410]];
			if (local465 != null && local465.method4066() && Static17.aClass11_Sub5_Sub2_Sub1_3 != local465 && local465.aByte78 == Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) {
				local489 = local465.anInt6768 / 32 - local61 / 32;
				local498 = local465.anInt6770 / 32 - local58 / 32;
				@Pc(500) boolean local500 = false;
				for (local502 = 0; local502 < Class2_Sub43.anInt7165; local502++) {
					if (local465.aString41.equals(Class12_Sub1_Sub1.aStringArray43[local502]) && Class173_Sub2.anIntArray333[local502] != 0) {
						local500 = true;
						break;
					}
				}
				@Pc(528) boolean local528 = false;
				for (@Pc(530) int local530 = 0; local530 < Static174.anInt3726; local530++) {
					if (local465.aString41.equals(Static44.aClass214Array1[local530].aString60)) {
						local528 = true;
						break;
					}
				}
				@Pc(550) boolean local550 = false;
				if (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4187 != 0 && local465.anInt4187 != 0 && local465.anInt4187 == Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4187) {
					local550 = true;
				}
				if (local500) {
					Static351.method6289(local14, local489, arg3, local498, Static72.aClass13Array5[3], arg2, arg0);
				} else if (local528) {
					Static351.method6289(local14, local489, arg3, local498, Static72.aClass13Array5[5], arg2, arg0);
				} else if (local550) {
					Static351.method6289(local14, local489, arg3, local498, Static72.aClass13Array5[4], arg2, arg0);
				} else {
					Static351.method6289(local14, local489, arg3, local498, Static72.aClass13Array5[2], arg2, arg0);
				}
			}
		}
		@Pc(636) Class84[] local636 = Class41.aClass84Array1;
		@Pc(728) int local728;
		for (local489 = 0; local489 < local636.length; local489++) {
			@Pc(644) Class84 local644 = local636[local489];
			if (local644 != null && local644.anInt2352 != 0 && Class83.anInt2345 % 20 < 10) {
				@Pc(699) int local699;
				if (local644.anInt2352 == 1 && local644.anInt2351 >= 0 && local644.anInt2351 < Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1.length) {
					@Pc(677) Class11_Sub5_Sub2_Sub2 local677 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local644.anInt2351];
					if (local677 != null) {
						local502 = local677.anInt6768 / 32 - local61 / 32;
						local699 = local677.anInt6770 / 32 - local58 / 32;
						Static241.method6250(local644.anInt2360, 360000, local502, local699, arg2, arg0, local14, arg3);
					}
				}
				if (local644.anInt2352 == 2) {
					local728 = (local644.anInt2349 - Static154.anInt3136) * 4 + 2 - local61 / 32;
					local502 = (local644.anInt2361 - Static139.anInt2716) * 4 + 2 - local58 / 32;
					local699 = local644.anInt2346 * 4;
					local699 *= local699;
					Static241.method6250(local644.anInt2360, local699, local728, local502, arg2, arg0, local14, arg3);
				}
				if (local644.anInt2352 == 10 && local644.anInt2351 >= 0 && Class9.aClass11_Sub5_Sub2_Sub1Array1.length > local644.anInt2351) {
					@Pc(786) Class11_Sub5_Sub2_Sub1 local786 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local644.anInt2351];
					if (local786 != null) {
						local502 = local786.anInt6768 / 32 - local61 / 32;
						local699 = local786.anInt6770 / 32 - local58 / 32;
						Static241.method6250(local644.anInt2360, 360000, local502, local699, arg2, arg0, local14, arg3);
					}
				}
			}
		}
		if (Static291.anInt5899 == 4) {
			return;
		}
		if (Class130.anInt6538 != 0) {
			local498 = Class130.anInt6538 * 4 + Static17.aClass11_Sub5_Sub2_Sub1_3.method4329() * 2 + 2 - local61 / 32 - 2;
			local728 = Class2_Sub3_Sub31.anInt5832 * 4 + Static17.aClass11_Sub5_Sub2_Sub1_3.method4329() * 2 + 2 - local58 / 32 - 2;
			Static351.method6289(local14, local498, arg3, local728, Static327.aClass13Array25[Class2_Sub3_Sub38.aBoolean474 ? 1 : 0], arg2, arg0);
		}
		arg1.method2870(3, arg3 + arg0.anInt4242 / 2 - 1, arg2 + arg0.anInt4255 / 2 - 1, -1, 3);
	}
}
