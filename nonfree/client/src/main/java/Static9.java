import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "[Lclient!sha;")
	public static Class328[] aClass328Array1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aea", name = "l", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_4 = new Class241(62, 7);

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "J")
	public static long aLong3 = 1L;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!uu;")
	public static Class369 aClass369_1 = new Class369(0, 1);

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)I")
	public static int method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 <= arg2) {
			return arg2 <= arg0 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BILclient!ha;)Z")
	public static boolean method119(@OriginalArg(1) int arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(11) int local11 = (Static29.anInt380 - 104) / 2;
		@Pc(17) int local17 = (Static327.anInt5650 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(31) int local31;
		@Pc(44) int local44;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(27) int local27 = local17; local27 < local17 + 104; local27++) {
				for (local31 = arg0; local31 <= 3; local31++) {
					if (Static596.method8244(local27, local21, arg0, local31)) {
						local44 = local31;
						if (Static180.method3417(1, local21, local27)) {
							local44 = local31 - 1;
						}
						if (local44 >= 0) {
							local19 &= Static235.method4150(local27, local44, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(99) int[] local99 = new int[262144];
		for (local31 = 0; local31 < local99.length; local31++) {
			local99[local31] = -16777216;
		}
		Static289.aClass49_24 = arg1.method6692(512, 512, local99, 512);
		Static108.method2050();
		if (-31 != -31) {
			aClass369_1 = null;
		}
		local44 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (228 - -((int) (Math.random() * 20.0D)) << 8) + 238 - 10 | 0xFF000000;
		@Pc(182) int local182 = ((int) (Math.random() * 20.0D) + 228 | 0x1F58FF00) << 16;
		@Pc(201) int local201 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(213) boolean[][] local213 = new boolean[Static87.anInt9495 + 2 + 1][Static87.anInt9495 + 2 + 1];
		@Pc(221) int local221;
		@Pc(227) int local227;
		@Pc(229) int local229;
		@Pc(231) int local231;
		@Pc(239) int local239;
		@Pc(251) int local251;
		@Pc(261) int local261;
		@Pc(289) int local289;
		@Pc(295) int local295;
		@Pc(364) int local364;
		@Pc(371) int local371;
		@Pc(375) int local375;
		@Pc(398) int local398;
		for (@Pc(215) int local215 = local11; local215 < local11 + 104; local215 += Static87.anInt9495) {
			for (local221 = local17; local221 < local17 + 104; local221 += Static87.anInt9495) {
				local227 = 0;
				local229 = 0;
				local231 = local215;
				if (local215 > 0) {
					local231 = local215 - 1;
					local227 += 4;
				}
				local239 = local221;
				if (local221 > 0) {
					local239 = local221 - 1;
				}
				local251 = local215 + Static87.anInt9495;
				if (local251 < 104) {
					local251++;
				}
				local261 = local221 + Static87.anInt9495;
				if (local261 < 104) {
					local229 += 4;
					local261++;
				}
				arg1.KA(0, 0, Static87.anInt9495 * 4 + local227, Static87.anInt9495 * 4 + local229);
				arg1.GA(-16777216);
				@Pc(301) int local301;
				for (local289 = arg0; local289 <= 3; local289++) {
					for (local295 = 0; local295 <= Static87.anInt9495; local295++) {
						for (local301 = 0; local301 <= Static87.anInt9495; local301++) {
							local213[local295][local301] = Static596.method8244(local239 + local301, local295 + local231, arg0, local289);
						}
					}
					Static524.aClass96Array2[local289].method8069(local231, local239, local251, local261, local213);
					if (!Static550.aBoolean672) {
						for (local301 = -4; local301 < Static87.anInt9495; local301++) {
							for (local364 = -4; local364 < Static87.anInt9495; local364++) {
								local371 = local215 + local301;
								local375 = local364 + local221;
								if (local11 <= local371 && local17 <= local375 && Static596.method8244(local375, local371, arg0, local289)) {
									local398 = local289;
									if (Static180.method3417(1, local371, local375)) {
										local398 = local289 - 1;
									}
									if (local398 >= 0) {
										Static401.method6128(local229 + (Static87.anInt9495 - local364) * 4 - 4, local375, arg1, local398, local227 + local301 * 4, local371, local182, local44);
									}
								}
							}
						}
					}
				}
				if (Static550.aBoolean672) {
					@Pc(469) Class356 local469 = Static669.aClass356Array1[arg0];
					for (local301 = 0; local301 < Static87.anInt9495; local301++) {
						for (local364 = 0; local364 < Static87.anInt9495; local364++) {
							local371 = local301 + local215;
							local375 = local221 + local364;
							local398 = local469.anIntArrayArray53[local371 - local469.anInt9620][local375 - local469.anInt9604];
							if ((local398 & 0x40240000) != 0) {
								arg1.method6631(4, local227 + local301 * 4, 4, -1713569622, (Static87.anInt9495 - local364) * 4 + local229 - 4);
							} else if ((local398 & 0x800000) != 0) {
								arg1.method6661((Static87.anInt9495 - local364) * 4 + local229 - 4, 4, local227 + local301 * 4, -1713569622);
							} else if ((local398 & 0x2000000) != 0) {
								arg1.method6691((Static87.anInt9495 - local364) * 4 + local229 - 4, 4, local301 * 4 + local227 + 3, -1713569622);
							} else if ((local398 & 0x8000000) != 0) {
								arg1.method6661(local229 + (Static87.anInt9495 - local364) * 4 + 3 - 4, 4, local301 * 4 + local227, -1713569622);
							} else if ((local398 & 0x20000000) != 0) {
								arg1.method6691(local229 + (Static87.anInt9495 - local364) * 4 - 4, 4, local227 + local301 * 4, -1713569622);
							}
						}
					}
				}
				arg1.aa(local227, local229, Static87.anInt9495 * 4, Static87.anInt9495 * 4, local201, 2);
				Static289.aClass49_24.method8976((local215 - local11) * 4 + 48, -(Static87.anInt9495 * 4) + -((local221 + -local17) * 4) + 464, Static87.anInt9495 * 4, Static87.anInt9495 * 4, local227, local229);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static35.method456();
		Static529.anInt8695 = 0;
		Static519.aClass340_66.method8129();
		if (!Static550.aBoolean672) {
			for (local221 = local11; local221 < local11 + 104; local221++) {
				for (local227 = local17; local227 < local17 + 104; local227++) {
					for (local229 = arg0; local229 <= arg0 + 1 && local229 <= 3; local229++) {
						if (Static596.method8244(local227, local221, arg0, local229)) {
							@Pc(786) Interface23 local786 = (Interface23) Static64.method787(local229, local221, local227);
							if (local786 == null) {
								local786 = (Interface23) Static122.method2204(local229, local221, local227, aClass1 == null ? (aClass1 = Class10.a("rt")) : aClass1);
							}
							if (local786 == null) {
								local786 = (Interface23) Static593.method8225(local229, local221, local227);
							}
							if (local786 == null) {
								local786 = (Interface23) Static382.method5910(local229, local221, local227);
							}
							if (local786 != null) {
								@Pc(832) Class125 local832 = Static290.aClass163_5.method4124(124, local786.method7934());
								if (!local832.aBoolean295 || Static340.aBoolean430) {
									local251 = local832.anInt3580;
									if (local832.anIntArray198 != null) {
										for (local261 = 0; local261 < local832.anIntArray198.length; local261++) {
											if (local832.anIntArray198[local261] != -1) {
												@Pc(866) Class125 local866 = Static290.aClass163_5.method4124(123, local832.anIntArray198[local261]);
												if (local866.anInt3580 >= 0) {
													local251 = local866.anInt3580;
												}
											}
										}
									}
									if (local251 >= 0) {
										@Pc(891) boolean local891 = false;
										if (local251 >= 0) {
											@Pc(901) Class361 local901 = Static508.aClass190_3.method4695(local251);
											if (local901 != null && local901.aBoolean722) {
												local891 = true;
											}
										}
										local289 = local221;
										local295 = local227;
										if (local891) {
											@Pc(921) int[][] local921 = Static669.aClass356Array1[local229].anIntArrayArray53;
											local364 = Static669.aClass356Array1[local229].anInt9620;
											local371 = Static669.aClass356Array1[local229].anInt9604;
											for (local375 = 0; local375 < 10; local375++) {
												local398 = (int) (Math.random() * 4.0D);
												if (local398 == 0 && local289 > local11 && local289 > local221 - 3 && (local921[local289 - local364 - 1][local295 - local371] & 0x2C0108) == 0) {
													local289--;
												}
												if (local398 == 1 && local289 < local11 + 104 - 1 && local221 + 3 > local289 && (local921[local289 + 1 - local364][local295 - local371] & 0x2C0180) == 0) {
													local289++;
												}
												if (local398 == 2 && local295 > local17 && local227 - 3 < local295 && (local921[local289 - local364][local295 - local371 - 1] & 0x2C0102) == 0) {
													local295--;
												}
												if (local398 == 3 && local17 + 104 - 1 > local295 && local227 + 3 > local295 && (local921[local289 - local364][local295 + 1 - local371] & 0x2C0120) == 0) {
													local295++;
												}
											}
										}
										Static630.anIntArray238[Static529.anInt8695] = local832.anInt3629;
										Static360.anIntArray359[Static529.anInt8695] = local289;
										Static477.anIntArray275[Static529.anInt8695] = local295;
										Static529.anInt8695++;
									}
								}
							}
						}
					}
				}
			}
			if (Static66.aClass176_1 != null) {
				Static460.aClass223_93.anInt5858 = 1;
				Static508.aClass190_3.method4690(64, 1024);
				for (local227 = 0; local227 < Static66.aClass176_1.anInt5012; local227++) {
					local229 = Static66.aClass176_1.anIntArray272[local227];
					if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 == local229 >> 28) {
						local231 = (local229 >> 14 & 0x3FFF) - Static50.anInt606;
						local239 = (local229 & 0x3FFF) - Static404.anInt7039;
						if (local231 >= 0 && local231 < Static29.anInt380 && local239 >= 0 && local239 < Static327.anInt5650) {
							Static519.aClass340_66.method8131(new Class6_Sub6(local227));
						} else {
							@Pc(1257) Class361 local1257 = Static508.aClass190_3.method4695(Static66.aClass176_1.anIntArray273[local227]);
							if (local1257.anIntArray644 != null && local1257.anInt9812 + local231 >= 0 && Static29.anInt380 > local1257.anInt9791 + local231 && local1257.anInt9813 + local239 >= 0 && Static327.anInt5650 > local1257.anInt9822 + local239) {
								Static519.aClass340_66.method8131(new Class6_Sub6(local227));
							}
						}
					}
				}
				Static508.aClass190_3.method4690(64, 128);
				Static460.aClass223_93.anInt5858 = 2;
				Static460.aClass223_93.method5268();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIII)Lclient!sn;")
	public static Class81 method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg1 * 76724863L ^ (long) arg3 * 97549L ^ (long) arg0 * 67481L ^ (long) arg5 * 475427L ^ (long) arg4 * 986053L ^ (long) arg2 * 32147369L;
		@Pc(50) Class81 local50 = (Class81) Static98.aClass359_11.method8517(local33);
		if (local50 == null) {
			local50 = Static473.aClass75_14.method6659(arg0, arg3, arg5, arg4, arg2, arg1);
			Static98.aClass359_11.method8515(local33, local50);
			return local50;
		} else {
			return local50;
		}
	}
}
