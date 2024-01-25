import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	public static int anInt1674;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public static int anInt1677;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_50 = new Class12(53, 0);

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_51 = new Class12(95, 8);

	@OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
	public static final int[] anIntArray118 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!el", name = "l", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_46 = new Class119("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	public static int anInt1676 = 100;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method1459() {
		if (Static372.anInt6263 > 0) {
			Static372.anInt6263--;
		}
		if (Static338.anInt5778 > 1) {
			Static338.anInt5778--;
			Static15.anInt300 = Static18.anInt379;
		}
		if (Static321.aBoolean622) {
			Static321.aBoolean622 = false;
			Static34.method490();
			return;
		}
		if (!Static17.aBoolean39) {
			Static108.method1714();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static124.method5685(); local38++) {
		}
		if (Static312.anInt5414 != 9) {
			return;
		}
		Static294.method4027(Static129.aClass103_98.method2274(), Static18.aClass1_Sub28_Sub1_1);
		if (Static247.aClass1_Sub42_1 == null) {
			if (Static195.aLong115 <= Static27.method359()) {
				Static247.aClass1_Sub42_1 = Static98.aClass66_1.method1461(Static259.aClass156_4.aString53);
			}
		} else if (Static247.aClass1_Sub42_1.anInt7261 != -1) {
			Static52.method867(Static160.aClass103_116);
			Static18.aClass1_Sub28_Sub1_1.method5393(Static247.aClass1_Sub42_1.anInt7261);
			Static247.aClass1_Sub42_1 = null;
			Static195.aLong115 = Static27.method359() + 30000L;
		}
		@Pc(103) Class1_Sub24 local103 = (Class1_Sub24) Static130.aClass227_19.method4967();
		@Pc(117) int local117;
		@Pc(140) int local140;
		@Pc(158) int local158;
		@Pc(176) boolean local176;
		@Pc(230) int local230;
		@Pc(237) int local237;
		@Pc(248) int local248;
		if (local103 != null || Static27.method359() - 2000L > Static151.aLong92) {
			@Pc(114) boolean local114 = false;
			local117 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
			for (@Pc(122) Class1_Sub24 local122 = (Class1_Sub24) Static135.aClass227_20.method4967(); local122 != null && Static18.aClass1_Sub28_Sub1_1.anInt6812 - local117 < 240; local122 = (Class1_Sub24) Static135.aClass227_20.method4973()) {
				local122.method5915();
				local140 = local122.method2421();
				if (local140 < 0) {
					local140 = 0;
				} else if (local140 > 65534) {
					local140 = 65534;
				}
				local158 = local122.method2418();
				if (local158 < 0) {
					local158 = 0;
				} else if (local158 > 65534) {
					local158 = 65534;
				}
				local176 = false;
				if (local122.method2421() == -1 && local122.method2418() == -1) {
					local176 = true;
					local158 = -1;
					local140 = -1;
				}
				if (local158 != Static140.anInt2478 || Static311.anInt5413 != local140) {
					if (!local114) {
						Static52.method867(Static399.aClass103_235);
						Static18.aClass1_Sub28_Sub1_1.method5398(0);
						local117 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
						local114 = true;
					}
					local230 = local158 - Static140.anInt2478;
					Static140.anInt2478 = local158;
					local237 = local140 - Static311.anInt5413;
					Static311.anInt5413 = local140;
					local248 = (int) ((local122.method2420() - Static151.aLong92) / 20L);
					if (local248 < 8 && local230 >= -32 && local230 <= 31 && local237 >= -32 && local237 <= 31) {
						local237 += 32;
						local230 += 32;
						Static18.aClass1_Sub28_Sub1_1.method5393((local248 << 12) + (local230 << 6) + local237);
					} else if (local248 < 32 && local230 >= -128 && local230 <= 127 && local237 >= -128 && local237 <= 127) {
						local230 += 128;
						local237 += 128;
						Static18.aClass1_Sub28_Sub1_1.method5398(local248 + 128);
						Static18.aClass1_Sub28_Sub1_1.method5393((local230 << 8) + local237);
					} else if (local248 < 32) {
						Static18.aClass1_Sub28_Sub1_1.method5398(local248 + 192);
						if (local176) {
							Static18.aClass1_Sub28_Sub1_1.method5347(Integer.MIN_VALUE);
						} else {
							Static18.aClass1_Sub28_Sub1_1.method5347(local140 << 16 | local158);
						}
					} else {
						Static18.aClass1_Sub28_Sub1_1.method5393(local248 + 57344);
						if (local176) {
							Static18.aClass1_Sub28_Sub1_1.method5347(Integer.MIN_VALUE);
						} else {
							Static18.aClass1_Sub28_Sub1_1.method5347(local140 << 16 | local158);
						}
					}
					Static151.aLong92 = local122.method2420();
				}
			}
			if (local114) {
				Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local117);
			}
		}
		@Pc(420) int local420;
		@Pc(470) int local470;
		if (local103 != null) {
			@Pc(402) long local402 = (local103.method2420() - Static239.aLong175) / 50L;
			if (local402 > 32767L) {
				local402 = 32767L;
			}
			Static239.aLong175 = local103.method2420();
			local420 = local103.method2421();
			if (local420 < 0) {
				local420 = 0;
			} else if (local420 > 65535) {
				local420 = 65535;
			}
			local140 = local103.method2418();
			if (local140 < 0) {
				local140 = 0;
			} else if (local140 > 65535) {
				local140 = 65535;
			}
			@Pc(453) byte local453 = 0;
			if (local103.method2417() == 2) {
				local453 = 1;
			}
			Static52.method867(Static299.aClass103_252);
			local470 = (int) local402;
			Static18.aClass1_Sub28_Sub1_1.method5393(local470 | local453 << 15);
			Static18.aClass1_Sub28_Sub1_1.method5347(local420 << 16 | local140);
		}
		@Pc(495) int local495;
		if (Static324.anInt5556 > 0) {
			local495 = 0;
			for (local117 = 0; local117 < Static324.anInt5556; local117++) {
				if (Static94.aClass128Array1[local117].method4781()) {
					local495++;
				}
			}
			if (local495 > 0) {
				if (local495 > 75) {
					local495 = 75;
				}
				Static52.method867(Static20.aClass103_177);
				Static18.aClass1_Sub28_Sub1_1.method5398(local495 * 3);
				for (local420 = 0; local420 < Static324.anInt5556; local420++) {
					@Pc(543) Class128 local543 = Static94.aClass128Array1[local420];
					if (local543.method4781()) {
						@Pc(556) long local556 = (local543.method4782() - Static130.aLong70) / 50L;
						if (local556 > 65535L) {
							local556 = 65535L;
						}
						Static130.aLong70 = local543.method4782();
						Static18.aClass1_Sub28_Sub1_1.method5398(local543.method4778());
						Static18.aClass1_Sub28_Sub1_1.method5393((int) local556);
					}
				}
			}
		}
		if (Static179.anInt3134 > 0) {
			Static179.anInt3134--;
		}
		if (Static297.aBoolean669 && Static179.anInt3134 <= 0) {
			Static297.aBoolean669 = false;
			Static179.anInt3134 = 20;
			Static52.method867(Static423.aClass103_226);
			Static18.aClass1_Sub28_Sub1_1.method5359((int) Static98.aFloat20 >> 3);
			Static18.aClass1_Sub28_Sub1_1.method5395((int) Static262.aFloat62 >> 3);
		}
		if (Static138.aBoolean285 && !Static132.aBoolean269) {
			Static132.aBoolean269 = true;
			Static52.method867(Static112.aClass103_92);
			Static18.aClass1_Sub28_Sub1_1.method5398(1);
		}
		if (!Static138.aBoolean285 && Static132.aBoolean269) {
			Static132.aBoolean269 = false;
			Static52.method867(Static112.aClass103_92);
			Static18.aClass1_Sub28_Sub1_1.method5398(0);
		}
		if (!Static303.aBoolean816) {
			Static52.method867(Static293.aClass103_186);
			Static18.aClass1_Sub28_Sub1_1.method5398(0);
			local495 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
			@Pc(686) Class1_Sub28 local686 = Static453.aClass136_Sub1_1.method3525();
			Static18.aClass1_Sub28_Sub1_1.method5387(local686.aByteArray86, local686.anInt6812);
			Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local495);
			Static303.aBoolean816 = true;
		}
		if (Static359.aClass169ArrayArrayArray5 != null) {
			if (Static333.anInt5693 == 2) {
				Static130.method2037();
			} else if (Static333.anInt5693 == 3) {
				Static409.method5275();
			}
		}
		if (Static453.aBoolean815) {
			Static453.aBoolean815 = false;
		} else {
			Static351.aFloat72 /= 2.0F;
		}
		if (Static278.aBoolean562) {
			Static278.aBoolean562 = false;
		} else {
			Static252.aFloat61 /= 2.0F;
		}
		Static338.method4535();
		if (Static312.anInt5414 != 9) {
			return;
		}
		Static1.method9();
		Static233.method3346();
		Static388.method5070();
		Static204.method2901();
		Static264.anInt4796++;
		if (Static264.anInt4796 > 750) {
			Static34.method490();
			return;
		}
		Static95.method1489();
		Static337.method4523();
		Static122.method1924();
		for (local495 = Static320.aClass249_2.method5604(true); local495 != -1; local495 = Static320.aClass249_2.method5604(false)) {
			Static12.method202(local495);
			Static17.anIntArray17[Static396.anInt6617++ & 0x1F] = local495;
		}
		@Pc(850) Class124 local850;
		for (@Pc(808) Class1_Sub5_Sub11 local808 = Static16.method250(); local808 != null; local808 = Static16.method250()) {
			local420 = local808.method2664();
			local140 = local808.method2663();
			if (local420 == 1) {
				Static352.anIntArray414[local140] = local808.anInt3213;
				Static433.aBoolean797 |= Static148.aBooleanArray9[local140];
				Static453.anIntArray514[Static427.anInt7221++ & 0x1F] = local140;
			} else if (local420 == 2) {
				Static11.aStringArray3[local140] = local808.aString38;
				Static416.anIntArray464[Static391.anInt6532++ & 0x1F] = local140;
			} else if (local420 == 3) {
				local850 = Static412.method5315(local140);
				if (!local808.aString38.equals(local850.aString42)) {
					local850.aString42 = local808.aString38;
					Static160.method2323(local850);
				}
			} else if (local420 == 4) {
				local850 = Static412.method5315(local140);
				local470 = local808.anInt3213;
				local230 = local808.anInt3212;
				local237 = local808.anInt3209;
				if (local470 != local850.anInt3401 || local230 != local850.anInt3422 || local237 != local850.anInt3363) {
					local850.anInt3363 = local237;
					local850.anInt3401 = local470;
					local850.anInt3422 = local230;
					Static160.method2323(local850);
				}
			} else if (local420 == 5) {
				local850 = Static412.method5315(local140);
				if (local808.anInt3213 != local850.anInt3429 || local808.anInt3213 == -1) {
					local850.anInt3365 = 0;
					local850.anInt3359 = 1;
					local850.anInt3358 = 0;
					local850.anInt3429 = local808.anInt3213;
					Static160.method2323(local850);
				}
			} else if (local420 == 6) {
				local158 = local808.anInt3213;
				local470 = local158 >> 10 & 0x1F;
				local230 = local158 >> 5 & 0x1F;
				local237 = local158 & 0x1F;
				local248 = (local470 << 19) + (local230 << 11) + (local237 << 3);
				@Pc(1314) Class124 local1314 = Static412.method5315(local140);
				if (local1314.anInt3399 != local248) {
					local1314.anInt3399 = local248;
					Static160.method2323(local1314);
				}
			} else if (local420 == 7) {
				local850 = Static412.method5315(local140);
				local176 = local808.anInt3213 == 1;
				if (local850.aBoolean399 != local176) {
					local850.aBoolean399 = local176;
					Static160.method2323(local850);
				}
			} else if (local420 == 8) {
				local850 = Static412.method5315(local140);
				if (local850.anInt3379 != local808.anInt3213 || local850.anInt3428 != local808.anInt3212 || local850.anInt3406 != local808.anInt3209) {
					local850.anInt3406 = local808.anInt3209;
					local850.anInt3379 = local808.anInt3213;
					local850.anInt3428 = local808.anInt3212;
					if (local850.anInt3405 != -1) {
						if (local850.anInt3352 > 0) {
							local850.anInt3406 = local850.anInt3406 * 32 / local850.anInt3352;
						} else if (local850.anInt3377 > 0) {
							local850.anInt3406 = local850.anInt3406 * 32 / local850.anInt3377;
						}
					}
					Static160.method2323(local850);
				}
			} else if (local420 == 9) {
				local850 = Static412.method5315(local140);
				if (local808.anInt3213 != local850.anInt3405 || local850.anInt3351 != local808.anInt3212) {
					local850.anInt3351 = local808.anInt3212;
					local850.anInt3405 = local808.anInt3213;
					Static160.method2323(local850);
				}
			} else if (local420 == 10) {
				local850 = Static412.method5315(local140);
				if (local808.anInt3213 != local850.anInt3355 || local850.anInt3369 != local808.anInt3212 || local850.anInt3372 != local808.anInt3209) {
					local850.anInt3355 = local808.anInt3213;
					local850.anInt3369 = local808.anInt3212;
					local850.anInt3372 = local808.anInt3209;
					Static160.method2323(local850);
				}
			} else if (local420 == 11) {
				local850 = Static412.method5315(local140);
				local850.anInt3370 = local850.anInt3397 = local808.anInt3213;
				local850.anInt3414 = local850.anInt3385 = local808.anInt3212;
				local850.aByte49 = 0;
				local850.aByte46 = 0;
				Static160.method2323(local850);
			} else if (local420 == 12) {
				local850 = Static412.method5315(local140);
				local470 = local808.anInt3213;
				if (local850 != null && local850.anInt3417 == 0) {
					if (local850.anInt3415 - local850.anInt3356 < local470) {
						local470 = local850.anInt3415 - local850.anInt3356;
					}
					if (local470 < 0) {
						local470 = 0;
					}
					if (local850.anInt3418 != local470) {
						local850.anInt3418 = local470;
						Static160.method2323(local850);
					}
				}
			} else if (local420 == 14) {
				local850 = Static412.method5315(local140);
				local850.anInt3350 = local808.anInt3213;
			} else if (local420 == 15) {
				Static14.aBoolean32 = true;
				Static11.anInt185 = local808.anInt3213;
				Static232.anInt4096 = local808.anInt3212;
			} else if (local420 == 16) {
				local850 = Static412.method5315(local140);
				local850.anInt3403 = local808.anInt3213;
			}
		}
		if (Static289.anInt5057 != 0) {
			Static401.anInt6679 += 20;
			if (Static401.anInt6679 >= 400) {
				Static289.anInt5057 = 0;
			}
		}
		Static341.anInt5831++;
		if (Static49.aClass124_1 != null) {
			Static425.anInt7184++;
			if (Static425.anInt7184 >= 15) {
				Static160.method2323(Static49.aClass124_1);
				Static49.aClass124_1 = null;
			}
		}
		Static219.aClass124_5 = null;
		Static310.aBoolean608 = false;
		Static253.aClass124_7 = null;
		Static145.aBoolean232 = false;
		Static437.method5726(null, -1, -1);
		Static361.method4848(null, -1, -1);
		if (!Static433.aBoolean798) {
			Static33.anInt530 = -1;
		}
		Static116.method1853();
		Static18.anInt379++;
		if (Static338.aBoolean660) {
			Static52.method867(Static244.aClass103_164);
			Static18.aClass1_Sub28_Sub1_1.method5370(Static20.anInt4876 << 28 | Static412.anInt6773 << 14 | Static130.anInt2371);
			Static338.aBoolean660 = false;
		}
		while (true) {
			@Pc(1448) Class1_Sub40 local1448;
			@Pc(1453) Class124 local1453;
			do {
				local1448 = (Class1_Sub40) Static3.aClass227_36.method4974();
				if (local1448 == null) {
					while (true) {
						do {
							local1448 = (Class1_Sub40) Static104.aClass227_9.method4974();
							if (local1448 == null) {
								while (true) {
									do {
										local1448 = (Class1_Sub40) Static254.aClass227_28.method4974();
										if (local1448 == null) {
											if (Static253.aClass124_7 == null) {
												Static339.anInt5788 = 0;
											}
											if (Static371.aClass124_10 != null) {
												Static83.method1382();
											}
											if (Static154.anInt2601 > 0 && Static160.aClass123_1.method2750(82) && Static160.aClass123_1.method2750(81) && Static208.anInt3611 != 0) {
												local420 = Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 - Static208.anInt3611;
												if (local420 < 0) {
													local420 = 0;
												} else if (local420 > 3) {
													local420 = 3;
												}
												Static263.method3719(Static199.anInt3480 + Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0], Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0] + Static164.anInt2731, local420);
											}
											Static295.method4032();
											for (local420 = 0; local420 < 5; local420++) {
												@Pc(1656) int local1656 = Static3.anIntArray399[local420]++;
											}
											if (Static433.aBoolean797 && Static27.method359() - 60000L > Static216.aLong125) {
												Static364.method2863();
											}
											for (@Pc(1679) Class4_Sub1_Sub1 local1679 = (Class4_Sub1_Sub1) Static341.aClass262_11.method5819(); local1679 != null; local1679 = (Class4_Sub1_Sub1) Static341.aClass262_11.method5813()) {
												if (Static27.method359() / 1000L - 5L > (long) local1679.anInt3922) {
													if (local1679.aShort57 > 0) {
														Static90.method1430(local1679.aString46 + Static31.aClass119_13.method2673(Static394.anInt6582), "", 5, "", 0);
													}
													if (local1679.aShort57 == 0) {
														Static90.method1430(local1679.aString46 + Static276.aClass119_114.method2673(Static394.anInt6582), "", 5, "", 0);
													}
													local1679.method5572();
												}
											}
											Static155.anInt2624++;
											if (Static155.anInt2624 > 500) {
												Static155.anInt2624 = 0;
												local158 = (int) (Math.random() * 8.0D);
												if ((local158 & 0x4) == 4) {
													Static368.anInt6211 += Static71.anInt1309;
												}
												if ((local158 & 0x1) == 1) {
													Static356.anInt6091 += Static79.anInt1471;
												}
												if ((local158 & 0x2) == 2) {
													Static130.anInt2372 += Static61.anInt1463;
												}
											}
											if (Static356.anInt6091 < -50) {
												Static79.anInt1471 = 2;
											}
											if (Static356.anInt6091 > 50) {
												Static79.anInt1471 = -2;
											}
											if (Static130.anInt2372 < -55) {
												Static61.anInt1463 = 2;
											}
											if (Static130.anInt2372 > 55) {
												Static61.anInt1463 = -2;
											}
											if (Static368.anInt6211 < -40) {
												Static71.anInt1309 = 1;
											}
											if (Static368.anInt6211 > 40) {
												Static71.anInt1309 = -1;
											}
											Static13.anInt266++;
											if (Static13.anInt266 > 500) {
												Static13.anInt266 = 0;
												local158 = (int) (Math.random() * 8.0D);
												if ((local158 & 0x1) == 1) {
													Static378.anInt2798 += Static458.anInt6285;
												}
												if ((local158 & 0x2) == 2) {
													Static435.anInt7311 += Static121.anInt2245;
												}
											}
											if (Static378.anInt2798 < -60) {
												Static458.anInt6285 = 2;
											}
											if (Static378.anInt2798 > 60) {
												Static458.anInt6285 = -2;
											}
											if (Static435.anInt7311 < -20) {
												Static121.anInt2245 = 1;
											}
											Static343.anInt5889++;
											if (Static435.anInt7311 > 10) {
												Static121.anInt2245 = -1;
											}
											if (Static343.anInt5889 > 50) {
												Static52.method867(Static412.aClass103_239);
											}
											if (Static223.aBoolean668) {
												Static29.method384();
												Static223.aBoolean668 = false;
											}
											try {
												if (Static395.aClass131_3 != null && Static18.aClass1_Sub28_Sub1_1.anInt6812 > 0) {
													Static316.anInt5454 += Static18.aClass1_Sub28_Sub1_1.anInt6812;
													Static395.aClass131_3.method2928(Static18.aClass1_Sub28_Sub1_1.aByteArray86, Static18.aClass1_Sub28_Sub1_1.anInt6812);
													Static343.anInt5889 = 0;
													Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
													return;
												}
												return;
											} catch (@Pc(1938) IOException local1938) {
												Static34.method490();
												return;
											}
										}
										local1453 = local1448.aClass124_14;
										if (local1453.anInt3430 < 0) {
											break;
										}
										local850 = Static412.method5315(local1453.anInt3344);
									} while (local850 == null || local850.aClass124Array1 == null || local850.aClass124Array1.length <= local1453.anInt3430 || local850.aClass124Array1[local1453.anInt3430] != local1453);
									Static298.method4076(local1448);
								}
							}
							local1453 = local1448.aClass124_14;
							if (local1453.anInt3430 < 0) {
								break;
							}
							local850 = Static412.method5315(local1453.anInt3344);
						} while (local850 == null || local850.aClass124Array1 == null || local850.aClass124Array1.length <= local1453.anInt3430 || local850.aClass124Array1[local1453.anInt3430] != local1453);
						Static298.method4076(local1448);
					}
				}
				local1453 = local1448.aClass124_14;
				if (local1453.anInt3430 < 0) {
					break;
				}
				local850 = Static412.method5315(local1453.anInt3344);
			} while (local850 == null || local850.aClass124Array1 == null || local850.aClass124Array1.length <= local1453.anInt3430 || local1453 != local850.aClass124Array1[local1453.anInt3430]);
			Static298.method4076(local1448);
		}
	}
}
