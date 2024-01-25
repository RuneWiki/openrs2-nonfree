import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)I")
	public static int method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!aq;IILclient!uo;B)V")
	public static void method1460(@OriginalArg(0) Class16 arg0, @OriginalArg(3) Class129 arg1) {
		Static4.aClass16_1.method191();
		if (Static292.aBoolean370) {
			return;
		}
		for (@Pc(25) Class11_Sub8 local25 = (Class11_Sub8) arg0.method193(); local25 != null; local25 = (Class11_Sub8) arg0.method188()) {
			@Pc(32) Class23 local32 = Static212.method3827(local25.anInt863);
			if (Static4.method19(local32)) {
				@Pc(46) boolean local46 = Static7.method63(local32, arg1, local25);
				if (local46) {
					Static325.method1029(local25, local32, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!nq;I)V")
	public static void method1461(@OriginalArg(0) Class144 arg0) {
		Static7.aClass144_3 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1462(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method1463() {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(31) int local31;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(45) int local45;
		if (Static34.anInt635 == 160) {
			Static246.aClass11_Sub25_Sub1_3.method5185();
			local16 = Static246.aClass11_Sub25_Sub1_3.method5185();
			local24 = Static132.anInt2477 + (local16 >> 4 & 0x7);
			local31 = Static63.anInt1170 + (local16 & 0x7);
			local37 = Static246.aClass11_Sub25_Sub1_3.method5187();
			local41 = Static246.aClass11_Sub25_Sub1_3.method5185();
			local45 = Static246.aClass11_Sub25_Sub1_3.method5221();
			@Pc(49) String local49 = Static246.aClass11_Sub25_Sub1_3.method5184();
			Static99.method613(local41, local45, local24, local37, local31, local49);
			return;
		}
		@Pc(100) int local100;
		@Pc(106) int local106;
		if (Static34.anInt635 == 231) {
			local16 = Static246.aClass11_Sub25_Sub1_3.method5201();
			if (local16 == 65535) {
				local16 = -1;
			}
			local24 = Static246.aClass11_Sub25_Sub1_3.method5190();
			local31 = local24 >> 2;
			local37 = local24 & 0x3;
			local41 = Static174.anIntArray225[local31];
			local45 = Static246.aClass11_Sub25_Sub1_3.method5185();
			local100 = (local45 >> 4 & 0x7) + Static132.anInt2477;
			local106 = (local45 & 0x7) + Static63.anInt1170;
			Static280.method162(Static322.anInt6250, local100, local106, local31, local16, local41, local37);
		} else if (Static34.anInt635 == 41) {
			local16 = Static246.aClass11_Sub25_Sub1_3.method5187();
			local24 = Static246.aClass11_Sub25_Sub1_3.method5185();
			Static108.method1650(local16).method1639(local24);
		} else if (Static34.anInt635 == 46) {
			local16 = Static246.aClass11_Sub25_Sub1_3.method5185();
			local24 = (local16 >> 4 & 0x7) + Static132.anInt2477;
			local31 = (local16 & 0x7) + Static63.anInt1170;
			local37 = Static246.aClass11_Sub25_Sub1_3.method5187();
			local41 = Static246.aClass11_Sub25_Sub1_3.method5185();
			local45 = Static246.aClass11_Sub25_Sub1_3.method5187();
			if (local24 >= 0 && local31 >= 0 && local24 < Static24.anInt454 && Static240.anInt4832 > local31) {
				local100 = local24 * 128 + 64;
				local106 = local31 * 128 + 64;
				@Pc(225) Class67_Sub3_Sub4 local225 = new Class67_Sub3_Sub4(local37, local45, Static293.anInt5807, Static322.anInt6250, local100, Static168.method2721(local100, Static322.anInt6250, local106) - local41, local106, local24, local24, local31, local31);
				Static270.aClass16_42.method190(new Class11_Sub4_Sub21(local225));
			}
		} else {
			@Pc(286) int local286;
			@Pc(290) int local290;
			@Pc(294) int local294;
			@Pc(298) int local298;
			@Pc(309) int local309;
			@Pc(400) Class67_Sub3_Sub2 local400;
			if (Static34.anInt635 == 227) {
				local16 = Static246.aClass11_Sub25_Sub1_3.method5185();
				local24 = Static132.anInt2477 + (local16 >> 4 & 0x7);
				local31 = (local16 & 0x7) + Static63.anInt1170;
				local37 = Static246.aClass11_Sub25_Sub1_3.method5175() + local24;
				local41 = local31 + Static246.aClass11_Sub25_Sub1_3.method5175();
				local45 = Static246.aClass11_Sub25_Sub1_3.method5220();
				local100 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local106 = Static246.aClass11_Sub25_Sub1_3.method5185() * 4;
				local286 = Static246.aClass11_Sub25_Sub1_3.method5185() * 4;
				local290 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local294 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local298 = Static246.aClass11_Sub25_Sub1_3.method5185();
				if (local298 == 255) {
					local298 = -1;
				}
				local309 = Static246.aClass11_Sub25_Sub1_3.method5185();
				if (local24 >= 0 && local31 >= 0 && Static24.anInt454 > local24 && Static240.anInt4832 > local31 && local37 >= 0 && local41 >= 0 && Static24.anInt454 > local37 && Static240.anInt4832 > local41 && local100 != 65535) {
					local24 = local24 * 128 + 64;
					local41 = local41 * 128 + 64;
					local37 = local37 * 128 + 64;
					local31 = local31 * 128 + 64;
					local400 = new Class67_Sub3_Sub2(local100, Static322.anInt6250, local24, local31, Static168.method2721(local24, Static322.anInt6250, local31) - local106, local290 + Static293.anInt5807, Static293.anInt5807 + local294, local298, local309, local45, local286);
					local400.method2497(local37, Static168.method2721(local37, Static322.anInt6250, local41) - local286, local41, local290 + Static293.anInt5807);
					Static325.aClass16_14.method190(new Class11_Sub4_Sub3(local400));
				}
			} else if (Static34.anInt635 == 73) {
				local16 = Static246.aClass11_Sub25_Sub1_3.method5185();
				local24 = local16 >> 2;
				local31 = local16 & 0x3;
				local37 = Static174.anIntArray225[local24];
				local41 = Static246.aClass11_Sub25_Sub1_3.method5219();
				local45 = (local41 >> 4 & 0x7) + Static132.anInt2477;
				local100 = (local41 & 0x7) + Static63.anInt1170;
				local106 = Static246.aClass11_Sub25_Sub1_3.method5179();
				if (local45 >= 0 && local100 >= 0 && Static24.anInt454 > local45 && Static240.anInt4832 > local100) {
					Static185.method3207(local106, 0, local37, -1, local24, local45, Static322.anInt6250, local100, local31);
				}
			} else if (Static34.anInt635 == 58) {
				local16 = Static246.aClass11_Sub25_Sub1_3.method5185();
				local24 = (local16 >> 4 & 0xF) + Static132.anInt2477 * 2;
				local31 = (local16 & 0xF) + Static63.anInt1170 * 2;
				local37 = local24 + Static246.aClass11_Sub25_Sub1_3.method5175();
				local41 = local31 + Static246.aClass11_Sub25_Sub1_3.method5175();
				local45 = Static246.aClass11_Sub25_Sub1_3.method5220();
				local100 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local106 = Static246.aClass11_Sub25_Sub1_3.method5185() * 4;
				local286 = Static246.aClass11_Sub25_Sub1_3.method5185() * 4;
				local290 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local294 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local298 = Static246.aClass11_Sub25_Sub1_3.method5185();
				if (local298 == 255) {
					local298 = -1;
				}
				local309 = Static246.aClass11_Sub25_Sub1_3.method5185();
				if (local24 >= 0 && local31 >= 0 && Static24.anInt454 * 2 > local24 && local31 < Static24.anInt454 * 2 && local37 >= 0 && local41 >= 0 && Static240.anInt4832 * 2 > local37 && local41 < Static240.anInt4832 * 2 && local100 != 65535) {
					local24 = local24 * 64;
					local41 *= 64;
					local37 *= 64;
					local31 = local31 * 64;
					local400 = new Class67_Sub3_Sub2(local100, Static322.anInt6250, local24, local31, Static168.method2721(local24, Static322.anInt6250, local31) - local106, Static293.anInt5807 + local290, local294 + Static293.anInt5807, local298, local309, local45, local286);
					local400.method2497(local37, Static168.method2721(local37, Static322.anInt6250, local41) - local286, local41, Static293.anInt5807 + local290);
					Static325.aClass16_14.method190(new Class11_Sub4_Sub3(local400));
				}
			} else {
				@Pc(790) int local790;
				if (Static34.anInt635 == 45) {
					local16 = Static246.aClass11_Sub25_Sub1_3.method5185();
					local24 = Static132.anInt2477 * 2 + (local16 >> 4 & 0xF);
					local31 = Static63.anInt1170 * 2 + (local16 & 0xF);
					local37 = Static246.aClass11_Sub25_Sub1_3.method5175() + local24;
					local41 = local31 + Static246.aClass11_Sub25_Sub1_3.method5175();
					local45 = Static246.aClass11_Sub25_Sub1_3.method5220();
					local100 = Static246.aClass11_Sub25_Sub1_3.method5220();
					local106 = Static246.aClass11_Sub25_Sub1_3.method5187();
					local286 = Static246.aClass11_Sub25_Sub1_3.method5175();
					local290 = Static246.aClass11_Sub25_Sub1_3.method5185() * 4;
					local294 = Static246.aClass11_Sub25_Sub1_3.method5187();
					local298 = Static246.aClass11_Sub25_Sub1_3.method5187();
					local309 = Static246.aClass11_Sub25_Sub1_3.method5185();
					local790 = Static246.aClass11_Sub25_Sub1_3.method5185();
					if (local309 == 255) {
						local309 = -1;
					}
					if (local24 >= 0 && local31 >= 0 && Static24.anInt454 * 2 > local24 && Static24.anInt454 * 2 > local31 && local37 >= 0 && local41 >= 0 && local37 < Static240.anInt4832 * 2 && local41 < Static240.anInt4832 * 2 && local106 != 65535) {
						local31 = local31 * 64;
						local41 = local41 * 64;
						local37 *= 64;
						local24 = local24 * 64;
						if (local45 != 0) {
							@Pc(874) int local874;
							@Pc(882) Class67_Sub3_Sub3 local882;
							@Pc(868) int local868;
							@Pc(878) int local878;
							if (local45 >= 0) {
								local868 = local45 - 1;
								local874 = local868 >> 11 & 0xF;
								local878 = local868 & 0x7FF;
								local882 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local878];
							} else {
								local868 = -local45 - 1;
								local874 = local868 >> 11 & 0xF;
								local878 = local868 & 0x7FF;
								if (local878 == Static256.anInt5197) {
									local882 = Static156.aClass67_Sub3_Sub3_Sub2_2;
								} else {
									local882 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local878];
								}
							}
							if (local882 != null) {
								@Pc(920) Class55 local920 = local882.method4374();
								if (local920.anIntArrayArray5 != null && local920.anIntArrayArray5[local874] != null) {
									local878 = local920.anIntArrayArray5[local874][0];
									@Pc(942) int local942 = local920.anIntArrayArray5[local874][2];
									@Pc(947) int local947 = local882.aClass17_7.method204();
									@Pc(951) int local951 = Class140.anIntArray330[local947];
									@Pc(955) int local955 = Class140.anIntArray329[local947];
									@Pc(965) int local965 = local878 * local955 + local942 * local951 >> 15;
									@Pc(976) int local976 = local942 * local955 - local951 * local878 >> 15;
									local24 += local965;
									local286 -= local920.anIntArrayArray5[local874][1];
									local31 += local976;
								}
							}
						}
						@Pc(1023) Class67_Sub3_Sub2 local1023 = new Class67_Sub3_Sub2(local106, Static322.anInt6250, local24, local31, Static168.method2721(local24, Static322.anInt6250, local31) - local286, local294 - -Static293.anInt5807, local298 + Static293.anInt5807, local309, local790, local100, local290);
						local1023.method2497(local37, Static168.method2721(local37, Static322.anInt6250, local41) - local290, local41, Static293.anInt5807 + local294);
						Static325.aClass16_14.method190(new Class11_Sub4_Sub3(local1023));
					}
				} else if (Static34.anInt635 == 179) {
					local16 = Static246.aClass11_Sub25_Sub1_3.method5185();
					local24 = (local16 >> 4 & 0x7) + Static132.anInt2477;
					local31 = Static63.anInt1170 + (local16 & 0x7);
					local37 = Static246.aClass11_Sub25_Sub1_3.method5187();
					local41 = Static246.aClass11_Sub25_Sub1_3.method5187();
					local45 = Static246.aClass11_Sub25_Sub1_3.method5187();
					if (Static301.aClass58_35 != null && local24 >= 0 && local31 >= 0 && local24 < Static24.anInt454 && local31 < Static240.anInt4832) {
						@Pc(1112) Class11_Sub40 local1112 = (Class11_Sub40) Static301.aClass58_35.method1009((long) (local24 | Static322.anInt6250 << 28 | local31 << 14));
						if (local1112 != null) {
							for (@Pc(1120) Class11_Sub29 local1120 = (Class11_Sub29) local1112.aClass16_53.method193(); local1120 != null; local1120 = (Class11_Sub29) local1112.aClass16_53.method188()) {
								if (local1120.anInt4569 == (local37 & 0x7FFF) && local1120.anInt4574 == local41) {
									local1120.method5701();
									local1120.anInt4574 = local45;
									Static120.method1448(local31, Static322.anInt6250, local24, local1120);
									break;
								}
							}
							Static212.method3826(Static322.anInt6250, local31, local24);
						}
					}
				} else if (Static34.anInt635 == 122) {
					local16 = Static246.aClass11_Sub25_Sub1_3.method5179();
					local24 = Static246.aClass11_Sub25_Sub1_3.method5185();
					local31 = Static132.anInt2477 + (local24 >> 4 & 0x7);
					local37 = (local24 & 0x7) + Static63.anInt1170;
					if (local31 >= 0 && local37 >= 0 && local31 < Static24.anInt454 && local37 < Static240.anInt4832) {
						@Pc(1220) Class11_Sub40 local1220 = (Class11_Sub40) Static301.aClass58_35.method1009((long) (Static322.anInt6250 << 28 | local37 << 14 | local31));
						if (local1220 != null) {
							for (@Pc(1228) Class11_Sub29 local1228 = (Class11_Sub29) local1220.aClass16_53.method193(); local1228 != null; local1228 = (Class11_Sub29) local1220.aClass16_53.method188()) {
								if ((local16 & 0x7FFF) == local1228.anInt4569) {
									local1228.method5701();
									break;
								}
							}
							if (local1220.aClass16_53.method194()) {
								local1220.method5701();
							}
							Static212.method3826(Static322.anInt6250, local37, local31);
						}
					}
				} else if (Static34.anInt635 == 169) {
					local16 = Static246.aClass11_Sub25_Sub1_3.method5190();
					local24 = (local16 >> 4 & 0x7) + Static132.anInt2477;
					local31 = Static63.anInt1170 + (local16 & 0x7);
					local37 = Static246.aClass11_Sub25_Sub1_3.method5200();
					local41 = local37 >> 2;
					local45 = local37 & 0x3;
					local100 = Static174.anIntArray225[local41];
					if (local24 >= 0 && local31 >= 0 && Static24.anInt454 > local24 && Static240.anInt4832 > local31) {
						Static185.method3207(-1, 0, local100, -1, local41, local24, Static322.anInt6250, local31, local45);
					}
				} else {
					if (Static34.anInt635 == 102) {
						@Pc(1344) byte local1344 = Static246.aClass11_Sub25_Sub1_3.method5169();
						local24 = Static246.aClass11_Sub25_Sub1_3.method5179();
						local31 = Static246.aClass11_Sub25_Sub1_3.method5187();
						@Pc(1358) byte local1358 = Static246.aClass11_Sub25_Sub1_3.method5169();
						@Pc(1362) byte local1362 = Static246.aClass11_Sub25_Sub1_3.method5175();
						@Pc(1366) byte local1366 = Static246.aClass11_Sub25_Sub1_3.method5169();
						local100 = Static246.aClass11_Sub25_Sub1_3.method5200();
						local106 = (local100 >> 4 & 0x7) + Static132.anInt2477;
						local286 = Static63.anInt1170 + (local100 & 0x7);
						local290 = Static246.aClass11_Sub25_Sub1_3.method5200();
						local294 = local290 >> 2;
						local298 = local290 & 0x3;
						local309 = Static246.aClass11_Sub25_Sub1_3.method5187();
						local790 = Static246.aClass11_Sub25_Sub1_3.method5220();
						if (!Static107.aClass129_4.method4927()) {
							Static241.method4264(local309, local790, local294, local24, local106, local298, local1344, local31, local1366, local1362, local1358, local286);
						}
					}
					if (Static34.anInt635 == 57) {
						local16 = Static246.aClass11_Sub25_Sub1_3.method5185();
						local24 = Static132.anInt2477 + (local16 >> 4 & 0x7);
						local31 = (local16 & 0x7) + Static63.anInt1170;
						local37 = Static246.aClass11_Sub25_Sub1_3.method5187();
						if (local37 == 65535) {
							local37 = -1;
						}
						local41 = Static246.aClass11_Sub25_Sub1_3.method5185();
						local45 = local41 >> 4 & 0xF;
						local100 = local41 & 0x7;
						local106 = Static246.aClass11_Sub25_Sub1_3.method5185();
						local286 = Static246.aClass11_Sub25_Sub1_3.method5185();
						if (local24 >= 0 && local31 >= 0 && Static24.anInt454 > local24 && Static240.anInt4832 > local31) {
							local290 = local45 + 1;
							if (local24 - local290 <= Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0] && Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0] <= local24 + local290 && Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] >= local31 - local290 && local290 + local31 >= Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] && Static326.anInt5865 != 0 && local100 > 0 && Static306.anInt6038 < 50 && local37 != -1) {
								Static253.anIntArray393[Static306.anInt6038] = local37;
								Static270.anIntArray416[Static306.anInt6038] = local100;
								Static291.anIntArray446[Static306.anInt6038] = local106;
								Static53.aClass102Array1[Static306.anInt6038] = null;
								Static64.anIntArray76[Static306.anInt6038] = (local31 << 8) + (local24 << 16) + local45;
								Static75.anIntArray93[Static306.anInt6038] = local286;
								Static306.anInt6038++;
							}
						}
					} else if (Static34.anInt635 == 162) {
						local16 = Static246.aClass11_Sub25_Sub1_3.method5201();
						local24 = Static246.aClass11_Sub25_Sub1_3.method5171();
						local31 = Static246.aClass11_Sub25_Sub1_3.method5185();
						local37 = (local31 >> 4 & 0x7) + Static132.anInt2477;
						local41 = Static63.anInt1170 + (local31 & 0x7);
						if (local37 >= 0 && local41 >= 0 && local37 < Static24.anInt454 && Static240.anInt4832 > local41) {
							Static120.method1448(local41, Static322.anInt6250, local37, new Class11_Sub29(local16, local24));
							Static212.method3826(Static322.anInt6250, local41, local37);
						}
					} else if (Static34.anInt635 == 71) {
						local16 = Static246.aClass11_Sub25_Sub1_3.method5187();
						local24 = Static246.aClass11_Sub25_Sub1_3.method5179();
						local31 = Static246.aClass11_Sub25_Sub1_3.method5200();
						local37 = (local31 >> 4 & 0x7) + Static132.anInt2477;
						local41 = (local31 & 0x7) + Static63.anInt1170;
						local45 = Static246.aClass11_Sub25_Sub1_3.method5187();
						if (local37 >= 0 && local41 >= 0 && local37 < Static24.anInt454 && Static240.anInt4832 > local41 && Static256.anInt5197 != local16) {
							Static120.method1448(local41, Static322.anInt6250, local37, new Class11_Sub29(local24, local45));
							Static212.method3826(Static322.anInt6250, local41, local37);
						}
					}
				}
			}
		}
	}
}
