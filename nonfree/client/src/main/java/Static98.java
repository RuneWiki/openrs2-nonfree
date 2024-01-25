import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "[I")
	public static final int[] anIntArray436 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public static int anInt2060 = 0;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Z")
	public static boolean method1940() throws IOException {
		if (Static88.aClass221_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static88.aClass221_1.method4795();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static339.aClass205_128 == null) {
			if (Static167.aBoolean395) {
				local13--;
				Static88.aClass221_1.method4800(0, 1, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
				Static167.aBoolean395 = false;
				Static367.anInt6239++;
			}
			Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
			if (Static218.aClass2_Sub16_Sub2_3.method5385()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static88.aClass221_1.method4800(1, 1, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
				Static367.anInt6239++;
			}
			Static167.aBoolean395 = true;
			@Pc(66) Class205[] local66 = Static228.method3721();
			local70 = Static218.aClass2_Sub16_Sub2_3.method5388();
			if (local70 < 0 || local66.length <= local70) {
				throw new IOException("invo:" + local70);
			}
			Static339.aClass205_128 = local66[local70];
			Static276.anInt4757 = Static339.aClass205_128.anInt5017;
		}
		if (Static276.anInt4757 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static88.aClass221_1.method4800(0, 1, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
			local13--;
			Static367.anInt6239++;
			Static276.anInt4757 = Static218.aClass2_Sub16_Sub2_3.aByteArray112[0] & 0xFF;
		}
		if (Static276.anInt4757 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static88.aClass221_1.method4800(0, 2, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
			Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
			Static276.anInt4757 = Static218.aClass2_Sub16_Sub2_3.method5312();
			local13 -= 2;
			Static367.anInt6239 += 2;
		}
		if (local13 < Static276.anInt4757) {
			return false;
		}
		Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
		Static88.aClass221_1.method4800(0, Static276.anInt4757, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
		Static239.aClass205_95 = Static113.aClass205_56;
		Static367.anInt6239 += Static276.anInt4757;
		Static218.anInt4548 = 0;
		Static113.aClass205_56 = Static37.aClass205_20;
		Static37.aClass205_20 = Static339.aClass205_128;
		if (Static339.aClass205_128 == Static347.aClass205_130) {
			Static282.method4305(Static261.aClass62_10);
			Static339.aClass205_128 = null;
			return true;
		}
		@Pc(229) int local229;
		@Pc(237) int local237;
		if (Static71.aClass205_33 == Static339.aClass205_128) {
			Static284.anInt4919 = Static218.aClass2_Sub16_Sub2_3.method5315();
			Static289.anInt5010 = Static218.aClass2_Sub16_Sub2_3.method5315();
			Static252.anInt4465 = Static218.aClass2_Sub16_Sub2_3.method5315();
			for (@Pc(213) Class2_Sub28 local213 = (Class2_Sub28) Static94.aClass246_6.method5606(); local213 != null; local213 = (Class2_Sub28) Static94.aClass246_6.method5614()) {
				local70 = (int) (local213.aLong209 & 0x3FFFL);
				local229 = (int) (local213.aLong209 >> 14 & 0x3FFFL);
				local237 = (int) (local213.aLong209 >> 28 & 0x3L);
				if (Static284.anInt4919 == local237 && local70 >= Static289.anInt5010 && local70 < Static289.anInt5010 + 8 && local229 >= Static252.anInt4465 && Static252.anInt4465 + 8 > local229) {
					local213.method5617();
					Static76.method1207(local70, Static284.anInt4919, local229);
				}
			}
			for (@Pc(284) Class2_Sub43 local284 = (Class2_Sub43) Static370.aClass30_43.method694(); local284 != null; local284 = (Class2_Sub43) Static370.aClass30_43.method682()) {
				if (local284.anInt6039 >= Static289.anInt5010 && Static289.anInt5010 + 8 > local284.anInt6039 && Static252.anInt4465 <= local284.anInt6046 && Static252.anInt4465 + 8 > local284.anInt6046 && local284.anInt6040 == Static284.anInt4919) {
					local284.anInt6042 = 0;
				}
			}
			Static339.aClass205_128 = null;
			return true;
		}
		@Pc(372) int local372;
		@Pc(374) int local374;
		@Pc(380) int local380;
		@Pc(384) int local384;
		@Pc(364) boolean local364;
		if (Static339.aClass205_128 == Static13.aClass205_4) {
			local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
			local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
			local364 = (local229 & 0x1) == 1;
			Static220.method3634(local70, local364);
			local372 = Static218.aClass2_Sub16_Sub2_3.method5312();
			for (local374 = 0; local374 < local372; local374++) {
				local380 = Static218.aClass2_Sub16_Sub2_3.method5349();
				local384 = Static218.aClass2_Sub16_Sub2_3.method5350();
				if (local384 == 255) {
					local384 = Static218.aClass2_Sub16_Sub2_3.method5366();
				}
				Static55.method918(local380 - 1, local374, local364, local384, local70);
			}
			Static159.anIntArray609[Static272.anInt4721++ & 0x1F] = local70;
			Static339.aClass205_128 = null;
			return true;
		} else if (Static260.aClass205_101 == Static339.aClass205_128) {
			Static282.method4305(Static350.aClass62_8);
			Static339.aClass205_128 = null;
			return true;
		} else if (Static307.aClass205_115 == Static339.aClass205_128) {
			local70 = Static218.aClass2_Sub16_Sub2_3.method5350();
			if (Static218.aClass2_Sub16_Sub2_3.method5350() == 0) {
				Static61.aClass158Array1[local70] = new Class158();
			} else {
				Static218.aClass2_Sub16_Sub2_3.anInt6145--;
				Static61.aClass158Array1[local70] = new Class158(Static218.aClass2_Sub16_Sub2_3);
			}
			Static37.anInt782 = Static102.anInt2133;
			Static339.aClass205_128 = null;
			return true;
		} else if (Static339.aClass205_128 == Static360.aClass205_133) {
			Static321.aClass211_1.method4469();
			Static212.anInt3858 += 32;
			Static339.aClass205_128 = null;
			return true;
		} else if (Static193.aClass205_81 == Static339.aClass205_128) {
			Static89.anInt1708 = Static218.aClass2_Sub16_Sub2_3.method5341();
			Static339.aClass205_128 = null;
			Static321.anInt5507 = Static102.anInt2133;
			return true;
		} else if (Static255.aClass205_99 == Static339.aClass205_128) {
			Static339.anInt5795 = Static218.aClass2_Sub16_Sub2_3.method5350();
			Static257.anInt4520 = Static102.anInt2133;
			Static339.aClass205_128 = null;
			return true;
		} else {
			@Pc(528) String local528;
			@Pc(520) String local520;
			if (Static84.aClass205_39 == Static339.aClass205_128) {
				local520 = Static218.aClass2_Sub16_Sub2_3.method5364();
				local528 = Static249.method5599(Static373.method5465(Static185.method3199(Static218.aClass2_Sub16_Sub2_3)));
				Static292.method4413(local520, 6, local528, 0, local520);
				Static339.aClass205_128 = null;
				return true;
			}
			@Pc(554) String local554;
			if (Static339.aClass205_128 == Static62.aClass205_31) {
				local70 = Static218.aClass2_Sub16_Sub2_3.method5317();
				local229 = Static218.aClass2_Sub16_Sub2_3.method5369();
				local554 = Static218.aClass2_Sub16_Sub2_3.method5364();
				if (Static255.method3995(local70)) {
					Static131.method2585(local229, local554);
				}
				Static339.aClass205_128 = null;
				return true;
			}
			@Pc(608) int local608;
			@Pc(680) String local680;
			@Pc(599) long local599;
			@Pc(594) long local594;
			@Pc(578) boolean local578;
			@Pc(604) long local604;
			if (Static339.aClass205_128 == Static288.aClass205_110) {
				local578 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
				local528 = Static218.aClass2_Sub16_Sub2_3.method5364();
				local554 = local528;
				if (local578) {
					local554 = Static218.aClass2_Sub16_Sub2_3.method5364();
				}
				local594 = Static218.aClass2_Sub16_Sub2_3.method5348();
				local599 = Static218.aClass2_Sub16_Sub2_3.method5312();
				local604 = Static218.aClass2_Sub16_Sub2_3.method5356();
				local608 = Static218.aClass2_Sub16_Sub2_3.method5350();
				@Pc(614) long local614 = local604 + (local599 << 32);
				@Pc(616) boolean local616 = false;
				@Pc(618) int local618 = 0;
				while (true) {
					if (local618 >= 100) {
						if (local608 <= 1) {
							if (Static305.aBoolean386 && !Static169.aBoolean245 || Static51.aBoolean82) {
								local616 = true;
							} else if (Static67.method1057(local554)) {
								local616 = true;
							}
						}
						break;
					}
					if (Static382.aLongArray8[local618] == local614) {
						local616 = true;
						break;
					}
					local618++;
				}
				if (!local616 && Static380.anInt6478 == 0) {
					Static382.aLongArray8[Static77.anInt1462] = local614;
					Static77.anInt1462 = (Static77.anInt1462 + 1) % 100;
					local680 = Static249.method5599(Static373.method5465(Static185.method3199(Static218.aClass2_Sub16_Sub2_3)));
					if (local608 == 2 || local608 == 3) {
						Static64.method1050("<img=1>" + local554, 0, 9, "<img=1>" + local528, local680, Static191.method3271(local594), -1);
					} else if (local608 == 1) {
						Static64.method1050("<img=0>" + local554, 0, 9, "<img=0>" + local528, local680, Static191.method3271(local594), -1);
					} else {
						Static64.method1050(local554, 0, 9, local528, local680, Static191.method3271(local594), -1);
					}
				}
				Static339.aClass205_128 = null;
				return true;
			} else if (Static156.aClass205_68 == Static339.aClass205_128) {
				@Pc(763) byte local763 = Static218.aClass2_Sub16_Sub2_3.method5330();
				local229 = Static218.aClass2_Sub16_Sub2_3.method5317();
				Static321.aClass211_1.method4470(local229, local763);
				Static339.aClass205_128 = null;
				return true;
			} else if (Static339.aClass205_128 == Static43.aClass205_21) {
				Static282.method4305(Static114.aClass62_3);
				Static339.aClass205_128 = null;
				return true;
			} else if (Static339.aClass205_128 == Static17.aClass205_7) {
				local70 = Static218.aClass2_Sub16_Sub2_3.method5317();
				local229 = Static218.aClass2_Sub16_Sub2_3.method5349();
				local237 = Static218.aClass2_Sub16_Sub2_3.method5353();
				local372 = Static218.aClass2_Sub16_Sub2_3.method5349();
				if (Static255.method3995(local70)) {
					Static358.method2019((local229 << 16) + local372, local237);
				}
				Static339.aClass205_128 = null;
				return true;
			} else if (Static339.aClass205_128 == Static204.aClass205_83) {
				local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
				local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local364 = (local229 & 0x1) == 1;
				while (Static276.anInt4757 > Static218.aClass2_Sub16_Sub2_3.anInt6145) {
					local372 = Static218.aClass2_Sub16_Sub2_3.method5311();
					local374 = Static218.aClass2_Sub16_Sub2_3.method5312();
					local380 = 0;
					if (local374 != 0) {
						local380 = Static218.aClass2_Sub16_Sub2_3.method5350();
						if (local380 == 255) {
							local380 = Static218.aClass2_Sub16_Sub2_3.method5346();
						}
					}
					Static55.method918(local374 - 1, local372, local364, local380, local70);
				}
				Static159.anIntArray609[Static272.anInt4721++ & 0x1F] = local70;
				Static339.aClass205_128 = null;
				return true;
			} else {
				@Pc(935) String local935;
				@Pc(939) String local939;
				@Pc(925) String local925;
				if (Static57.aClass205_79 == Static339.aClass205_128) {
					local70 = Static218.aClass2_Sub16_Sub2_3.method5350();
					@Pc(917) boolean local917 = (local70 & 0x1) == 1;
					local554 = Static218.aClass2_Sub16_Sub2_3.method5364();
					local925 = Static218.aClass2_Sub16_Sub2_3.method5364();
					if (local925.equals("")) {
						local925 = local554;
					}
					local935 = Static218.aClass2_Sub16_Sub2_3.method5364();
					local939 = Static218.aClass2_Sub16_Sub2_3.method5364();
					if (local939.equals("")) {
						local939 = local935;
					}
					if (local917) {
						for (local384 = 0; local384 < Static376.anInt6317; local384++) {
							if (Static290.aStringArray131[local384].equals(local939)) {
								Static347.aStringArray149[local384] = local554;
								Static290.aStringArray131[local384] = local925;
								Static366.aStringArray157[local384] = local935;
								Static61.aStringArray38[local384] = local939;
								break;
							}
						}
					} else {
						Static347.aStringArray149[Static376.anInt6317] = local554;
						Static290.aStringArray131[Static376.anInt6317] = local925;
						Static366.aStringArray157[Static376.anInt6317] = local935;
						Static61.aStringArray38[Static376.anInt6317] = local939;
						Static110.aBooleanArray15[Static376.anInt6317] = (local70 & 0x2) == 2;
						Static376.anInt6317++;
					}
					Static339.aClass205_128 = null;
					Static257.anInt4520 = Static102.anInt2133;
					return true;
				} else if (Static339.aClass205_128 == Static344.aClass205_107) {
					local70 = Static218.aClass2_Sub16_Sub2_3.method5323();
					local229 = Static218.aClass2_Sub16_Sub2_3.method5315();
					local237 = Static218.aClass2_Sub16_Sub2_3.method5349();
					@Pc(1043) Class1_Sub5_Sub1_Sub2 local1043 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local70];
					if (local1043 != null) {
						Static365.method5394(local229, local237, local1043);
					}
					Static339.aClass205_128 = null;
					return true;
				} else if (Static339.aClass205_128 == Static106.aClass205_49) {
					Static276.method4199(Static276.anInt4757, Static359.aClass111_5, Static218.aClass2_Sub16_Sub2_3);
					Static339.aClass205_128 = null;
					return true;
				} else if (Static339.aClass205_128 == Static30.aClass205_16) {
					local70 = Static218.aClass2_Sub16_Sub2_3.method5349();
					local229 = Static218.aClass2_Sub16_Sub2_3.method5366();
					local237 = Static218.aClass2_Sub16_Sub2_3.method5349();
					if (local237 == 65535) {
						local237 = -1;
					}
					if (Static255.method3995(local70)) {
						Static390.method5663(-1, local237, 2, local229);
					}
					Static339.aClass205_128 = null;
					return true;
				} else if (Static345.aClass205_140 == Static339.aClass205_128) {
					local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
					@Pc(1113) byte local1113 = Static218.aClass2_Sub16_Sub2_3.method5330();
					local237 = Static218.aClass2_Sub16_Sub2_3.method5323();
					if (Static255.method3995(local70)) {
						Static356.method5233(local1113, local237);
					}
					Static339.aClass205_128 = null;
					return true;
				} else if (Static27.aClass205_12 == Static339.aClass205_128) {
					Static289.anInt5010 = Static218.aClass2_Sub16_Sub2_3.method5350();
					Static252.anInt4465 = Static218.aClass2_Sub16_Sub2_3.method5338();
					Static284.anInt4919 = Static218.aClass2_Sub16_Sub2_3.method5338();
					while (Static218.aClass2_Sub16_Sub2_3.anInt6145 < Static276.anInt4757) {
						@Pc(1153) Class62 local1153 = Static221.method5130()[Static218.aClass2_Sub16_Sub2_3.method5350()];
						Static282.method4305(local1153);
					}
					Static339.aClass205_128 = null;
					return true;
				} else if (Static339.aClass205_128 == Static318.aClass205_118) {
					local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
					local229 = Static218.aClass2_Sub16_Sub2_3.method5346();
					if (Static255.method3995(local70)) {
						@Pc(1186) Class2_Sub38 local1186 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local229);
						if (local1186 != null) {
							Static293.method5577(local1186, false, true);
						}
						if (Static108.aClass4_26 != null) {
							Static51.method872(Static108.aClass4_26);
							Static108.aClass4_26 = null;
						}
					}
					Static339.aClass205_128 = null;
					return true;
				} else if (Static107.aClass205_59 == Static339.aClass205_128) {
					Static282.method4305(Static285.aClass62_14);
					Static339.aClass205_128 = null;
					return true;
				} else if (Static339.aClass205_128 == Static226.aClass205_136) {
					local70 = Static218.aClass2_Sub16_Sub2_3.method5353();
					local229 = Static218.aClass2_Sub16_Sub2_3.method5349();
					local237 = Static218.aClass2_Sub16_Sub2_3.method5366();
					local372 = Static218.aClass2_Sub16_Sub2_3.method5317();
					if (local372 == 65535) {
						local372 = -1;
					}
					if (Static255.method3995(local229)) {
						Static104.method2178(local237, local70, local372);
						@Pc(1254) Class179 local1254 = Static15.aClass81_1.method2175(local372);
						Static332.method4901(local70, local1254.anInt4386, local1254.anInt4397, local1254.anInt4399);
						Static155.method2834(local1254.anInt4419, local70, local1254.anInt4434, local1254.anInt4388);
					}
					Static339.aClass205_128 = null;
					return true;
				} else if (Static186.aClass205_75 == Static339.aClass205_128) {
					Static282.method4305(Static177.aClass62_6);
					Static339.aClass205_128 = null;
					return true;
				} else {
					@Pc(1319) Class2_Sub38 local1319;
					if (Static339.aClass205_128 == Static301.aClass205_117) {
						local70 = Static218.aClass2_Sub16_Sub2_3.method5349();
						local229 = Static218.aClass2_Sub16_Sub2_3.method5369();
						local237 = Static218.aClass2_Sub16_Sub2_3.method5353();
						if (Static255.method3995(local70)) {
							@Pc(1312) Class2_Sub38 local1312 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local229);
							local1319 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local237);
							if (local1319 != null) {
								Static293.method5577(local1319, false, local1312 == null || local1319.anInt4976 != local1312.anInt4976);
							}
							if (local1312 != null) {
								local1312.method5617();
								Static12.aClass246_2.method5609(local1312, (long) local237);
							}
							@Pc(1354) Class4 local1354 = Static380.method5560(local229);
							if (local1354 != null) {
								Static51.method872(local1354);
							}
							local1354 = Static380.method5560(local237);
							if (local1354 != null) {
								Static51.method872(local1354);
								Static35.method640(local1354, true);
							}
							if (Static234.anInt4158 != -1) {
								Static55.method919(1, Static234.anInt4158);
							}
						}
						Static339.aClass205_128 = null;
						return true;
					} else if (Static270.aClass205_71 == Static339.aClass205_128) {
						local70 = Static218.aClass2_Sub16_Sub2_3.method5366();
						local229 = Static218.aClass2_Sub16_Sub2_3.method5323();
						local237 = Static218.aClass2_Sub16_Sub2_3.method5349();
						if (Static255.method3995(local229)) {
							Static356.method5233(local70, local237);
						}
						Static339.aClass205_128 = null;
						return true;
					} else if (Static214.aClass205_87 == Static339.aClass205_128) {
						Static307.method4499(false);
						Static339.aClass205_128 = null;
						return true;
					} else {
						@Pc(1469) long local1469;
						@Pc(1487) Class2_Sub11 local1487;
						@Pc(1475) Class2_Sub11 local1475;
						if (Static339.aClass205_128 == Static239.aClass205_94) {
							local70 = Static218.aClass2_Sub16_Sub2_3.method5366();
							local229 = Static218.aClass2_Sub16_Sub2_3.method5349();
							local237 = Static218.aClass2_Sub16_Sub2_3.method5349();
							local372 = Static218.aClass2_Sub16_Sub2_3.method5349();
							if (local372 == 65535) {
								local372 = -1;
							}
							local374 = Static218.aClass2_Sub16_Sub2_3.method5349();
							if (local374 == 65535) {
								local374 = -1;
							}
							if (Static255.method3995(local229)) {
								for (local380 = local374; local380 <= local372; local380++) {
									local1469 = (long) local380 + ((long) local70 << 32);
									local1475 = (Class2_Sub11) Static154.aClass246_8.method5613(local1469);
									if (local1475 != null) {
										local1487 = new Class2_Sub11(local1475.anInt750, local237);
										local1475.method5617();
									} else if (local380 == -1) {
										local1487 = new Class2_Sub11(Static380.method5560(local70).aClass2_Sub11_1.anInt750, local237);
									} else {
										local1487 = new Class2_Sub11(0, local237);
									}
									Static154.aClass246_8.method5609(local1487, local1469);
								}
							}
							Static339.aClass205_128 = null;
							return true;
						} else if (Static339.aClass205_128 == Static141.aClass205_64) {
							Static282.method4305(Static176.aClass62_5);
							Static339.aClass205_128 = null;
							return true;
						} else if (Static339.aClass205_128 == Static325.aClass205_121) {
							Static358.anInt2087 = Static218.aClass2_Sub16_Sub2_3.method5312() * 30;
							Static321.anInt5507 = Static102.anInt2133;
							Static339.aClass205_128 = null;
							return true;
						} else if (Static190.aClass205_77 == Static339.aClass205_128) {
							if (Static234.anInt4158 != -1) {
								Static55.method919(0, Static234.anInt4158);
							}
							Static339.aClass205_128 = null;
							return true;
						} else if (Static386.aClass205_139 == Static339.aClass205_128) {
							local70 = Static218.aClass2_Sub16_Sub2_3.method5350();
							local229 = Static218.aClass2_Sub16_Sub2_3.method5312();
							local237 = Static218.aClass2_Sub16_Sub2_3.method5366();
							if (Static255.method3995(local229)) {
								Static255.method3996(local237, local70);
							}
							Static339.aClass205_128 = null;
							return true;
						} else if (Static273.aClass205_105 == Static339.aClass205_128) {
							Static250.method3961(false);
							Static339.aClass205_128 = null;
							return false;
						} else if (Static79.aClass205_102 == Static339.aClass205_128) {
							local70 = Static218.aClass2_Sub16_Sub2_3.method5346();
							local229 = Static218.aClass2_Sub16_Sub2_3.method5323();
							Static321.aClass211_1.method4473(local229, local70);
							Static339.aClass205_128 = null;
							return true;
						} else if (Static339.aClass205_128 == Static34.aClass205_19) {
							Static270.method2993(Static218.aClass2_Sub16_Sub2_3, Static276.anInt4757);
							Static339.aClass205_128 = null;
							return true;
						} else if (Static339.aClass205_128 == Static326.aClass205_122) {
							Static218.aClass2_Sub16_Sub2_3.anInt6145 += 28;
							if (Static218.aClass2_Sub16_Sub2_3.method5326()) {
								Static339.method4974(Static218.aClass2_Sub16_Sub2_3, Static218.aClass2_Sub16_Sub2_3.anInt6145 - 28);
							}
							Static339.aClass205_128 = null;
							return true;
						} else if (Static339.aClass205_128 == Static361.aClass205_134) {
							if (Static385.aFrame2 != null) {
								Static145.method4675(Static213.anInt3866, -1, -1, false);
							}
							@Pc(1669) byte[] local1669 = new byte[Static276.anInt4757];
							Static218.aClass2_Sub16_Sub2_3.method5377(local1669, Static276.anInt4757);
							local528 = Static49.method851(local1669, Static276.anInt4757, 0);
							Static280.method4252(Static62.anInt1261 == 1, true, local528, Static359.aClass111_5);
							Static339.aClass205_128 = null;
							return true;
						} else if (Static190.aClass205_78 == Static339.aClass205_128) {
							local70 = Static218.aClass2_Sub16_Sub2_3.method5315();
							local229 = Static218.aClass2_Sub16_Sub2_3.method5323();
							local364 = (local70 & 0x1) == 1;
							Static56.method928(local229, local364);
							Static159.anIntArray609[Static272.anInt4721++ & 0x1F] = local229;
							Static339.aClass205_128 = null;
							return true;
						} else if (Static339.aClass205_128 == Static131.aClass205_62) {
							Static250.method3961(true);
							Static339.aClass205_128 = null;
							return false;
						} else if (Static339.aClass205_128 == Static296.aClass205_112) {
							local70 = Static218.aClass2_Sub16_Sub2_3.method5353();
							local229 = Static218.aClass2_Sub16_Sub2_3.method5323();
							if (Static255.method3995(local229)) {
								Static390.method5663(-1, -1, 3, local70);
							}
							Static339.aClass205_128 = null;
							return true;
						} else {
							@Pc(1809) int local1809;
							@Pc(1819) int local1819;
							if (Static339.aClass205_128 == Static193.aClass205_80) {
								local578 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
								local528 = Static218.aClass2_Sub16_Sub2_3.method5364();
								local554 = local528;
								if (local578) {
									local554 = Static218.aClass2_Sub16_Sub2_3.method5364();
								}
								local594 = Static218.aClass2_Sub16_Sub2_3.method5312();
								local599 = Static218.aClass2_Sub16_Sub2_3.method5356();
								local1809 = Static218.aClass2_Sub16_Sub2_3.method5350();
								@Pc(1815) long local1815 = (local594 << 32) + local599;
								@Pc(1817) boolean local1817 = false;
								local1819 = 0;
								while (true) {
									if (local1819 >= 100) {
										if (local1809 <= 1) {
											if (Static305.aBoolean386 && !Static169.aBoolean245 || Static51.aBoolean82) {
												local1817 = true;
											} else if (Static67.method1057(local554)) {
												local1817 = true;
											}
										}
										break;
									}
									if (Static382.aLongArray8[local1819] == local1815) {
										local1817 = true;
										break;
									}
									local1819++;
								}
								if (!local1817 && Static380.anInt6478 == 0) {
									Static382.aLongArray8[Static77.anInt1462] = local1815;
									Static77.anInt1462 = (Static77.anInt1462 + 1) % 100;
									@Pc(1883) String local1883 = Static249.method5599(Static373.method5465(Static185.method3199(Static218.aClass2_Sub16_Sub2_3)));
									if (local1809 == 2) {
										Static64.method1050("<img=1>" + local554, 0, 7, "<img=1>" + local528, local1883, null, -1);
									} else if (local1809 == 1) {
										Static64.method1050("<img=0>" + local554, 0, 7, "<img=0>" + local528, local1883, null, -1);
									} else {
										Static64.method1050(local554, 0, 3, local528, local1883, null, -1);
									}
								}
								Static339.aClass205_128 = null;
								return true;
							}
							@Pc(2055) String local2055;
							@Pc(1996) int local1996;
							if (Static339.aClass205_128 == Static143.aClass205_65) {
								local578 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
								local528 = Static218.aClass2_Sub16_Sub2_3.method5364();
								local554 = local528;
								if (local578) {
									local554 = Static218.aClass2_Sub16_Sub2_3.method5364();
								}
								local594 = Static218.aClass2_Sub16_Sub2_3.method5348();
								local599 = Static218.aClass2_Sub16_Sub2_3.method5312();
								local604 = Static218.aClass2_Sub16_Sub2_3.method5356();
								local608 = Static218.aClass2_Sub16_Sub2_3.method5350();
								local1996 = Static218.aClass2_Sub16_Sub2_3.method5312();
								@Pc(2002) long local2002 = local604 + (local599 << 32);
								@Pc(2004) boolean local2004 = false;
								@Pc(2006) int local2006 = 0;
								while (true) {
									if (local2006 >= 100) {
										if (local608 <= 1 && Static67.method1057(local554)) {
											local2004 = true;
										}
										break;
									}
									if (Static382.aLongArray8[local2006] == local2002) {
										local2004 = true;
										break;
									}
									local2006++;
								}
								if (!local2004 && Static380.anInt6478 == 0) {
									Static382.aLongArray8[Static77.anInt1462] = local2002;
									Static77.anInt1462 = (Static77.anInt1462 + 1) % 100;
									local2055 = Static3.method74(local1996).method1145(Static218.aClass2_Sub16_Sub2_3);
									if (local608 == 2) {
										Static64.method1050("<img=1>" + local554, 0, 20, "<img=1>" + local528, local2055, Static191.method3271(local594), local1996);
									} else if (local608 == 1) {
										Static64.method1050("<img=0>" + local554, 0, 20, "<img=0>" + local528, local2055, Static191.method3271(local594), local1996);
									} else {
										Static64.method1050(local554, 0, 20, local528, local2055, Static191.method3271(local594), local1996);
									}
								}
								Static339.aClass205_128 = null;
								return true;
							} else if (Static182.aClass205_86 == Static339.aClass205_128) {
								Static376.anInt6317 = Static218.aClass2_Sub16_Sub2_3.method5350();
								for (local70 = 0; local70 < Static376.anInt6317; local70++) {
									Static347.aStringArray149[local70] = Static218.aClass2_Sub16_Sub2_3.method5364();
									Static290.aStringArray131[local70] = Static218.aClass2_Sub16_Sub2_3.method5364();
									if (Static290.aStringArray131[local70].equals("")) {
										Static290.aStringArray131[local70] = Static347.aStringArray149[local70];
									}
									Static366.aStringArray157[local70] = Static218.aClass2_Sub16_Sub2_3.method5364();
									Static61.aStringArray38[local70] = Static218.aClass2_Sub16_Sub2_3.method5364();
									if (Static61.aStringArray38[local70].equals("")) {
										Static61.aStringArray38[local70] = Static366.aStringArray157[local70];
									}
									Static110.aBooleanArray15[local70] = false;
								}
								Static339.aClass205_128 = null;
								Static257.anInt4520 = Static102.anInt2133;
								return true;
							} else {
								@Pc(2371) int local2371;
								@Pc(2396) Class234 local2396;
								@Pc(2375) boolean local2375;
								if (Static273.aClass205_104 == Static339.aClass205_128) {
									Static59.anInt1119 = Static102.anInt2133;
									if (Static276.anInt4757 == 0) {
										Static303.aString56 = null;
										Static261.aString53 = null;
										Static19.anInt436 = 0;
										Static339.aClass205_128 = null;
										Static372.aClass234Array1 = null;
										return true;
									}
									Static261.aString53 = Static218.aClass2_Sub16_Sub2_3.method5364();
									local578 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
									if (local578) {
										Static218.aClass2_Sub16_Sub2_3.method5364();
									}
									@Pc(2246) long local2246 = Static218.aClass2_Sub16_Sub2_3.method5348();
									Static303.aString56 = Static292.method4422(local2246);
									Static213.aByte41 = Static218.aClass2_Sub16_Sub2_3.method5330();
									local372 = Static218.aClass2_Sub16_Sub2_3.method5350();
									if (local372 == 255) {
										Static339.aClass205_128 = null;
										return true;
									}
									Static19.anInt436 = local372;
									@Pc(2270) Class234[] local2270 = new Class234[100];
									for (local380 = 0; local380 < Static19.anInt436; local380++) {
										local2270[local380] = new Class234();
										local2270[local380].aString61 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local578 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
										if (local578) {
											local2270[local380].aString60 = Static218.aClass2_Sub16_Sub2_3.method5364();
										} else {
											local2270[local380].aString60 = local2270[local380].aString61;
										}
										local2270[local380].aString62 = Static136.method2646(local2270[local380].aString60);
										local2270[local380].anInt6049 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local2270[local380].aByte62 = Static218.aClass2_Sub16_Sub2_3.method5330();
										local2270[local380].aString63 = Static218.aClass2_Sub16_Sub2_3.method5364();
										if (local2270[local380].aString60.equals(Static206.aClass1_Sub5_Sub1_Sub1_1.aString24)) {
											Static269.aByte48 = local2270[local380].aByte62;
										}
									}
									local2371 = Static19.anInt436;
									while (local2371 > 0) {
										local2375 = true;
										local2371--;
										for (local608 = 0; local608 < local2371; local608++) {
											if (local2270[local608].aString62.compareTo(local2270[local608 + 1].aString62) > 0) {
												local2396 = local2270[local608];
												local2270[local608] = local2270[local608 + 1];
												local2375 = false;
												local2270[local608 + 1] = local2396;
											}
										}
										if (local2375) {
											break;
										}
									}
									Static372.aClass234Array1 = local2270;
									Static339.aClass205_128 = null;
									return true;
								} else if (Static339.aClass205_128 == Static117.aClass205_60) {
									local70 = Static218.aClass2_Sub16_Sub2_3.method5315();
									local229 = Static218.aClass2_Sub16_Sub2_3.method5315();
									if (local70 == 255) {
										local70 = -1;
										local229 = -1;
									}
									Static243.method3905(local70, local229);
									Static339.aClass205_128 = null;
									return true;
								} else if (Static31.aClass205_17 == Static339.aClass205_128) {
									local70 = Static218.aClass2_Sub16_Sub2_3.method5317();
									local229 = Static218.aClass2_Sub16_Sub2_3.method5323();
									local237 = Static218.aClass2_Sub16_Sub2_3.method5346();
									local372 = Static218.aClass2_Sub16_Sub2_3.method5315();
									if (Static255.method3995(local70)) {
										local1319 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local237);
										if (local1319 != null) {
											Static293.method5577(local1319, false, local229 != local1319.anInt4976);
										}
										Static148.method2763(local229, false, local372, local237);
									}
									Static339.aClass205_128 = null;
									return true;
								} else if (Static339.aClass205_128 == Static245.aClass205_98) {
									for (local70 = 0; local70 < Static125.aClass1_Sub5_Sub1_Sub1Array1.length; local70++) {
										if (Static125.aClass1_Sub5_Sub1_Sub1Array1[local70] != null) {
											Static125.aClass1_Sub5_Sub1_Sub1Array1[local70].anInt6405 = -1;
										}
									}
									for (local229 = 0; local229 < Static299.aClass1_Sub5_Sub1_Sub2Array1.length; local229++) {
										if (Static299.aClass1_Sub5_Sub1_Sub2Array1[local229] != null) {
											Static299.aClass1_Sub5_Sub1_Sub2Array1[local229].anInt6405 = -1;
										}
									}
									Static339.aClass205_128 = null;
									return true;
								} else if (Static355.aClass205_131 == Static339.aClass205_128) {
									local70 = Static218.aClass2_Sub16_Sub2_3.method5311();
									local229 = Static218.aClass2_Sub16_Sub2_3.method5346();
									local237 = Static218.aClass2_Sub16_Sub2_3.method5350();
									local925 = "";
									local935 = local925;
									if ((local237 & 0x1) != 0) {
										local925 = Static218.aClass2_Sub16_Sub2_3.method5364();
										if ((local237 & 0x2) == 0) {
											local935 = local925;
										} else {
											local935 = Static218.aClass2_Sub16_Sub2_3.method5364();
										}
									}
									local939 = Static218.aClass2_Sub16_Sub2_3.method5364();
									if (local70 == 99) {
										Static210.method3525(local939);
									} else if (local935.equals("") || !Static67.method1057(local935)) {
										Static292.method4413(local925, local70, local939, local229, local935);
									} else {
										Static339.aClass205_128 = null;
										return true;
									}
									Static339.aClass205_128 = null;
									return true;
								} else if (Static339.aClass205_128 == Static144.aClass205_66) {
									local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
									local229 = Static218.aClass2_Sub16_Sub2_3.method5346();
									if (Static255.method3995(local70)) {
										Static390.method5663(0, Static176.anInt3381, 5, local229);
									}
									Static339.aClass205_128 = null;
									return true;
								} else {
									@Pc(2933) String local2933;
									if (Static297.aClass205_113 == Static339.aClass205_128) {
										local578 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
										local528 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local554 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local374 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local939 = "";
										local2375 = false;
										if (local372 > 0) {
											local939 = Static218.aClass2_Sub16_Sub2_3.method5364();
											local2375 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
										}
										for (local1809 = 0; local1809 < Static121.anInt2600; local1809++) {
											if (local578) {
												if (local554.equals(Static174.aStringArray82[local1809])) {
													Static174.aStringArray82[local1809] = local528;
													local528 = null;
													Static21.aStringArray13[local1809] = local554;
													break;
												}
											} else if (local528.equals(Static174.aStringArray82[local1809])) {
												if (Static249.anIntArray1341[local1809] != local372) {
													Static249.anIntArray1341[local1809] = local372;
													if (local372 > 0) {
														Static292.method4413("", 5, local528 + Static5.aClass32_4.method701(Static107.anInt2498), 0, "");
													}
													if (local372 == 0) {
														Static292.method4413("", 5, local528 + Static212.aClass32_56.method701(Static107.anInt2498), 0, "");
													}
												}
												Static21.aStringArray13[local1809] = local554;
												Static250.aStringArray113[local1809] = local939;
												Static286.anIntArray981[local1809] = local374;
												Static189.aBooleanArray38[local1809] = local2375;
												local528 = null;
												break;
											}
										}
										if (local528 != null && Static121.anInt2600 < 200) {
											Static174.aStringArray82[Static121.anInt2600] = local528;
											Static21.aStringArray13[Static121.anInt2600] = local554;
											Static249.anIntArray1341[Static121.anInt2600] = local372;
											Static250.aStringArray113[Static121.anInt2600] = local939;
											Static286.anIntArray981[Static121.anInt2600] = local374;
											Static189.aBooleanArray38[Static121.anInt2600] = local2375;
											Static121.anInt2600++;
										}
										Static257.anInt4520 = Static102.anInt2133;
										local608 = Static121.anInt2600;
										while (local608 > 0) {
											local608--;
											@Pc(2882) boolean local2882 = true;
											for (local1996 = 0; local1996 < local608; local1996++) {
												if (Static249.anIntArray1341[local1996] != Static347.anInt5864 && Static347.anInt5864 == Static249.anIntArray1341[local1996 + 1] || Static249.anIntArray1341[local1996] == 0 && Static249.anIntArray1341[local1996 + 1] != 0) {
													local1819 = Static249.anIntArray1341[local1996];
													Static249.anIntArray1341[local1996] = Static249.anIntArray1341[local1996 + 1];
													Static249.anIntArray1341[local1996 + 1] = local1819;
													local2933 = Static250.aStringArray113[local1996];
													Static250.aStringArray113[local1996] = Static250.aStringArray113[local1996 + 1];
													Static250.aStringArray113[local1996 + 1] = local2933;
													local680 = Static174.aStringArray82[local1996];
													Static174.aStringArray82[local1996] = Static174.aStringArray82[local1996 + 1];
													Static174.aStringArray82[local1996 + 1] = local680;
													local2055 = Static21.aStringArray13[local1996];
													Static21.aStringArray13[local1996] = Static21.aStringArray13[local1996 + 1];
													Static21.aStringArray13[local1996 + 1] = local2055;
													@Pc(2987) int local2987 = Static286.anIntArray981[local1996];
													Static286.anIntArray981[local1996] = Static286.anIntArray981[local1996 + 1];
													Static286.anIntArray981[local1996 + 1] = local2987;
													@Pc(3005) boolean local3005 = Static189.aBooleanArray38[local1996];
													Static189.aBooleanArray38[local1996] = Static189.aBooleanArray38[local1996 + 1];
													local2882 = false;
													Static189.aBooleanArray38[local1996 + 1] = local3005;
												}
											}
											if (local2882) {
												break;
											}
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static135.aClass205_76 == Static339.aClass205_128) {
										Static282.method4305(Static85.aClass62_2);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static170.aClass205_72) {
										Static289.anInt5010 = Static218.aClass2_Sub16_Sub2_3.method5338();
										Static284.anInt4919 = Static218.aClass2_Sub16_Sub2_3.method5359();
										Static252.anInt4465 = Static218.aClass2_Sub16_Sub2_3.method5359();
										Static339.aClass205_128 = null;
										return true;
									} else if (Static379.aClass205_137 == Static339.aClass205_128) {
										Static282.method4305(Static238.aClass62_9);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static213.aClass205_85 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5359();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5317();
										Static321.aClass211_1.method4473(local229, local70);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static12.aClass205_3) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5353();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5323();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5317();
										local374 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (Static255.method3995(local374)) {
											Static390.method5663(local237, local372 << 16 | local70, 7, local229);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static2.aClass205_1 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (local70 == 65535) {
											local70 = -1;
										}
										local229 = Static218.aClass2_Sub16_Sub2_3.method5315();
										Static84.method1291(local229, local70);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static61.aClass205_30 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (local70 == 65535) {
											local70 = -1;
										}
										local229 = Static218.aClass2_Sub16_Sub2_3.method5321();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5315();
										Static139.method2654(local229, local237, local70);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static335.aClass205_125 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5346();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5323();
										if (local229 >> 30 == 0) {
											@Pc(3414) Class202 local3414;
											@Pc(3348) Class34 local3348;
											@Pc(3408) Class202 local3408;
											@Pc(3393) Class34 local3393;
											@Pc(3361) Class202 local3361;
											if (local229 >> 29 != 0) {
												local374 = local229 & 0xFFFF;
												@Pc(3316) Class1_Sub5_Sub1_Sub2 local3316 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local374];
												if (local3316 != null) {
													if (local372 == 65535) {
														local372 = -1;
													}
													local2375 = true;
													if (local372 != -1 && local3316.anInt6420 != -1) {
														if (local372 == local3316.anInt6420) {
															local3348 = Static149.aClass173_5.method3800(local372);
															if (local3348.aBoolean65 && local3348.anInt863 != -1) {
																local3361 = Static36.aClass236_1.method5396(local3348.anInt863);
																local608 = local3361.anInt4932;
																if (local608 == 0 || local608 == 2) {
																	local2375 = false;
																} else if (local608 == 1) {
																	local2375 = true;
																}
															}
														} else {
															local3348 = Static149.aClass173_5.method3800(local372);
															local3393 = Static149.aClass173_5.method3800(local3316.anInt6420);
															if (local3348.anInt863 != -1 && local3393.anInt863 != -1) {
																local3408 = Static36.aClass236_1.method5396(local3348.anInt863);
																local3414 = Static36.aClass236_1.method5396(local3393.anInt863);
																if (local3408.anInt4945 < local3414.anInt4945) {
																	local2375 = false;
																}
															}
														}
													}
													if (local2375) {
														local3316.anInt6404 = 0;
														local3316.anInt6400 = 0;
														local3316.anInt6395 = Static253.anInt4469 + local237;
														local3316.anInt6420 = local372;
														local3316.anInt6442 = 1;
														local3316.anInt6411 = local70;
														if (Static253.anInt4469 < local3316.anInt6395) {
															local3316.anInt6404 = -1;
														}
														if (local3316.anInt6420 != -1 && local3316.anInt6395 == Static253.anInt4469) {
															local1809 = Static149.aClass173_5.method3800(local3316.anInt6420).anInt863;
															if (local1809 != -1) {
																local3361 = Static36.aClass236_1.method5396(local1809);
																if (local3361 != null && local3361.anIntArray974 != null) {
																	Static169.method2965(0, false, local3316.aByte69, local3316.anInt6390, local3361, local3316.anInt6386);
																}
															}
														}
													}
												}
											} else if (local229 >> 28 != 0) {
												local374 = local229 & 0xFFFF;
												@Pc(3513) Class1_Sub5_Sub1_Sub1 local3513;
												if (local374 == Static176.anInt3381) {
													local3513 = Static206.aClass1_Sub5_Sub1_Sub1_1;
												} else {
													local3513 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local374];
												}
												if (local3513 != null) {
													if (local372 == 65535) {
														local372 = -1;
													}
													local2375 = true;
													if (local372 != -1 && local3513.anInt6420 != -1) {
														if (local372 == local3513.anInt6420) {
															local3348 = Static149.aClass173_5.method3800(local372);
															if (local3348.aBoolean65 && local3348.anInt863 != -1) {
																local3361 = Static36.aClass236_1.method5396(local3348.anInt863);
																local608 = local3361.anInt4932;
																if (local608 == 0 || local608 == 2) {
																	local2375 = false;
																} else if (local608 == 1) {
																	local2375 = true;
																}
															}
														} else {
															local3348 = Static149.aClass173_5.method3800(local372);
															local3393 = Static149.aClass173_5.method3800(local3513.anInt6420);
															if (local3348.anInt863 != -1 && local3393.anInt863 != -1) {
																local3408 = Static36.aClass236_1.method5396(local3348.anInt863);
																local3414 = Static36.aClass236_1.method5396(local3393.anInt863);
																if (local3414.anInt4945 > local3408.anInt4945) {
																	local2375 = false;
																}
															}
														}
													}
													if (local2375) {
														local3513.anInt6442 = 1;
														local3513.anInt6395 = Static253.anInt4469 + local237;
														local3513.anInt6400 = 0;
														local3513.anInt6411 = local70;
														local3513.anInt6404 = 0;
														local3513.anInt6420 = local372;
														if (local3513.anInt6420 == 65535) {
															local3513.anInt6420 = -1;
														}
														if (Static253.anInt4469 < local3513.anInt6395) {
															local3513.anInt6404 = -1;
														}
														if (local3513.anInt6420 != -1 && local3513.anInt6395 == Static253.anInt4469) {
															local1809 = Static149.aClass173_5.method3800(local3513.anInt6420).anInt863;
															if (local1809 != -1) {
																local3361 = Static36.aClass236_1.method5396(local1809);
																if (local3361 != null && local3361.anIntArray974 != null) {
																	Static169.method2965(0, local3513 == Static206.aClass1_Sub5_Sub1_Sub1_1, local3513.aByte69, local3513.anInt6390, local3361, local3513.anInt6386);
																}
															}
														}
													}
												}
											}
										} else {
											local374 = local229 >> 28 & 0x3;
											local380 = (local229 >> 14 & 0x3FFF) - Static28.anInt606;
											local384 = (local229 & 0x3FFF) - Static319.anInt5425;
											if (local380 >= 0 && local384 >= 0 && Static246.anInt4374 > local380 && local384 < Static185.anInt3485) {
												local1809 = local380 * 128 + 64;
												local2371 = local384 * 128 + 64;
												@Pc(3292) Class1_Sub5_Sub6 local3292 = new Class1_Sub5_Sub6(local372, 0, Static253.anInt4469, local374, local1809, Static170.method3006(local1809, local2371, local374) - local70, local2371, local380, local380, local384, local384);
												Static261.aClass30_37.method685(new Class2_Sub10_Sub10(local3292));
											}
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static303.aClass205_114) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5346();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5317();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (local237 == 65535) {
											local237 = -1;
										}
										local372 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (local372 == 65535) {
											local372 = -1;
										}
										local374 = Static218.aClass2_Sub16_Sub2_3.method5353();
										if (Static255.method3995(local229)) {
											for (local380 = local372; local380 <= local237; local380++) {
												local1469 = ((long) local70 << 32) + ((long) local380);
												local1475 = (Class2_Sub11) Static154.aClass246_8.method5613(local1469);
												if (local1475 != null) {
													local1487 = new Class2_Sub11(local374, local1475.anInt748);
													local1475.method5617();
												} else if (local380 == -1) {
													local1487 = new Class2_Sub11(local374, Static380.method5560(local70).aClass2_Sub11_1.anInt748);
												} else {
													local1487 = new Class2_Sub11(local374, -1);
												}
												Static154.aClass246_8.method5609(local1487, local1469);
											}
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static81.aClass205_35) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local374 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local380 = Static218.aClass2_Sub16_Sub2_3.method5350();
										if (Static255.method3995(local70)) {
											Static219.method3626(local372, local229, local237, local380, local374);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static16.aClass205_6 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5349();
										if (Static255.method3995(local237)) {
											Static195.method3316(local70, local229);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static100.aClass205_47 == Static339.aClass205_128) {
										local520 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (Static255.method3995(local229)) {
											Static222.method3649(local520, local237);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static176.aClass205_73 == Static339.aClass205_128) {
										Static282.method4305(Static339.aClass62_17);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static247.aClass205_123) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5359();
										if (Static255.method3995(local70)) {
											Static100.anInt2068 = local229;
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static335.aClass205_126) {
										Static233.anInt4156 = Static218.aClass2_Sub16_Sub2_3.method5350();
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static339.aClass205_127) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local374 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local380 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (Static255.method3995(local70)) {
											Static88.aBooleanArray12[local229] = true;
											Static53.anIntArray225[local229] = local237;
											Static365.anIntArray1304[local229] = local372;
											Static100.anIntArray438[local229] = local374;
											Static47.anIntArray190[local229] = local380;
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static334.aClass205_124) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5341();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5346();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (Static255.method3995(local237)) {
											Static29.method508(local229, local70);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static15.aClass205_5 == Static339.aClass205_128) {
										Static282.method4305(Static281.aClass62_13);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static323.aClass205_120) {
										Static282.method4305(Static32.aClass62_1);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static244.aClass205_96 == Static339.aClass205_128) {
										Static282.method4305(Static325.aClass62_16);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static83.aClass205_36 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5323();
										if (local70 == 65535) {
											local70 = -1;
										}
										local229 = Static218.aClass2_Sub16_Sub2_3.method5353();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (Static255.method3995(local237)) {
											Static4.method91(local229, local70);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static55.aClass205_26 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (Static255.method3995(local70)) {
											Static307.method4497();
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static119.aClass205_61 == Static339.aClass205_128) {
										local578 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
										local528 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local554 = local528;
										if (local578) {
											local554 = Static218.aClass2_Sub16_Sub2_3.method5364();
										}
										local594 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local599 = Static218.aClass2_Sub16_Sub2_3.method5356();
										local1809 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local2371 = Static218.aClass2_Sub16_Sub2_3.method5312();
										@Pc(4173) long local4173 = (local594 << 32) + local599;
										@Pc(4175) boolean local4175 = false;
										@Pc(4177) int local4177 = 0;
										while (true) {
											if (local4177 >= 100) {
												if (local1809 <= 1 && Static67.method1057(local554)) {
													local4175 = true;
												}
												break;
											}
											if (local4173 == Static382.aLongArray8[local4177]) {
												local4175 = true;
												break;
											}
											local4177++;
										}
										if (!local4175 && Static380.anInt6478 == 0) {
											Static382.aLongArray8[Static77.anInt1462] = local4173;
											Static77.anInt1462 = (Static77.anInt1462 + 1) % 100;
											local2933 = Static3.method74(local2371).method1145(Static218.aClass2_Sub16_Sub2_3);
											if (local1809 == 2) {
												Static64.method1050("<img=1>" + local554, 0, 18, "<img=1>" + local528, local2933, null, local2371);
											} else if (local1809 == 1) {
												Static64.method1050("<img=0>" + local554, 0, 18, "<img=0>" + local528, local2933, null, local2371);
											} else {
												Static64.method1050(local554, 0, 18, local528, local2933, null, local2371);
											}
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static32.aClass205_18 == Static339.aClass205_128) {
										if (Static276.anInt4757 == 0) {
											Static82.aString17 = Static297.aClass32_78.method701(Static107.anInt2498);
										} else {
											Static82.aString17 = Static218.aClass2_Sub16_Sub2_3.method5364();
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static66.aClass205_32) {
										local520 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local554 = Static3.method74(local229).method1145(Static218.aClass2_Sub16_Sub2_3);
										Static64.method1050(local520, 0, 19, local520, local554, null, local229);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static75.aClass205_34 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local229 = local70 >> 5;
										local237 = local70 & 0x1F;
										if (local237 == 0) {
											Static335.aClass141Array1[local229] = null;
											Static339.aClass205_128 = null;
											return true;
										}
										@Pc(4373) Class141 local4373 = new Class141();
										local4373.anInt3559 = local237;
										local4373.anInt3554 = Static218.aClass2_Sub16_Sub2_3.method5350();
										if (local4373.anInt3554 >= 0 && local4373.anInt3554 < Static164.aClass18Array7.length) {
											if (local4373.anInt3559 == 1 || local4373.anInt3559 == 10) {
												local4373.anInt3561 = Static218.aClass2_Sub16_Sub2_3.method5312();
												Static218.aClass2_Sub16_Sub2_3.anInt6145 += 6;
											} else if (local4373.anInt3559 >= 2 && local4373.anInt3559 <= 6) {
												if (local4373.anInt3559 == 2) {
													local4373.anInt3553 = 64;
													local4373.anInt3556 = 64;
												}
												if (local4373.anInt3559 == 3) {
													local4373.anInt3553 = 64;
													local4373.anInt3556 = 0;
												}
												if (local4373.anInt3559 == 4) {
													local4373.anInt3556 = 128;
													local4373.anInt3553 = 64;
												}
												if (local4373.anInt3559 == 5) {
													local4373.anInt3556 = 64;
													local4373.anInt3553 = 0;
												}
												if (local4373.anInt3559 == 6) {
													local4373.anInt3553 = 128;
													local4373.anInt3556 = 64;
												}
												local4373.anInt3559 = 2;
												local4373.anInt3565 = Static218.aClass2_Sub16_Sub2_3.method5350();
												local4373.anInt3557 = Static218.aClass2_Sub16_Sub2_3.method5312();
												local4373.anInt3563 = Static218.aClass2_Sub16_Sub2_3.method5312();
												local4373.anInt3564 = Static218.aClass2_Sub16_Sub2_3.method5350();
												local4373.anInt3560 = Static218.aClass2_Sub16_Sub2_3.method5312();
											}
											local4373.anInt3555 = Static218.aClass2_Sub16_Sub2_3.method5312();
											if (local4373.anInt3555 == 65535) {
												local4373.anInt3555 = -1;
											}
											Static335.aClass141Array1[local229] = local4373;
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static113.aClass205_55) {
										Static32.method596();
										Static339.aClass205_128 = null;
										return false;
									} else if (Static339.aClass205_128 == Static92.aClass205_43) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5346();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5323();
										Static321.aClass211_1.method4470(local229, local70);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static50.aClass205_25) {
										Static241.anInt4325 = Static218.aClass2_Sub16_Sub2_3.method5350();
										Static339.aClass205_128 = null;
										Static321.anInt5507 = Static102.anInt2133;
										return true;
									} else if (Static339.aClass205_128 == Static285.aClass205_109) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (Static255.method3995(local70)) {
											Static235.method3813();
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static28.aClass205_13) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5366();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5317();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5323();
										if (Static255.method3995(local229)) {
											Static244.method3910(local237, local70);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static197.aClass205_82 == Static339.aClass205_128) {
										local520 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5323();
										if (local237 == 65535) {
											local237 = -1;
										}
										local372 = Static218.aClass2_Sub16_Sub2_3.method5350();
										if (local229 >= 1 && local229 <= 8) {
											if (local520.equalsIgnoreCase("null")) {
												local520 = null;
											}
											Static292.aStringArray132[local229 - 1] = local520;
											Static176.anIntArray656[local229 - 1] = local237;
											Static2.aBooleanArray1[local229 - 1] = local372 == 0;
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static165.aClass205_69) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5346();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5317();
										local374 = Static218.aClass2_Sub16_Sub2_3.method5349();
										if (Static255.method3995(local374)) {
											Static332.method4901(local70, local229, local237, local372);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static19.aClass205_8) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (local70 == 65535) {
											local70 = -1;
										}
										local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5350();
										Static315.method4659(local70, local237, local229, local372);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static216.aClass205_88 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5369();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5317();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (Static255.method3995(local229)) {
											Static81.method1227(local70, local237);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static267.aClass205_103) {
										Static282.method4305(Static299.aClass62_15);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static245.aClass205_97 == Static339.aClass205_128) {
										local520 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local364 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
										if (local364) {
											local528 = Static218.aClass2_Sub16_Sub2_3.method5364();
										} else {
											local528 = local520;
										}
										local372 = Static218.aClass2_Sub16_Sub2_3.method5312();
										@Pc(4834) byte local4834 = Static218.aClass2_Sub16_Sub2_3.method5330();
										@Pc(4836) boolean local4836 = false;
										if (local4834 == -128) {
											local4836 = true;
										}
										if (local4836) {
											if (Static19.anInt436 == 0) {
												Static339.aClass205_128 = null;
												return true;
											}
											for (local384 = 0; Static19.anInt436 > local384 && (!Static372.aClass234Array1[local384].aString60.equals(local528) || local372 != Static372.aClass234Array1[local384].anInt6049); local384++) {
											}
											if (local384 < Static19.anInt436) {
												while (Static19.anInt436 - 1 > local384) {
													Static372.aClass234Array1[local384] = Static372.aClass234Array1[local384 + 1];
													local384++;
												}
												Static19.anInt436--;
												Static372.aClass234Array1[Static19.anInt436] = null;
											}
										} else {
											@Pc(4915) String local4915 = Static218.aClass2_Sub16_Sub2_3.method5364();
											local2396 = new Class234();
											local2396.aString60 = local528;
											local2396.aString61 = local520;
											local2396.aString62 = Static136.method2646(local2396.aString60);
											local2396.anInt6049 = local372;
											local2396.aString63 = local4915;
											local2396.aByte62 = local4834;
											for (local2371 = Static19.anInt436 - 1; local2371 >= 0; local2371--) {
												local608 = Static372.aClass234Array1[local2371].aString62.compareTo(local2396.aString62);
												if (local608 == 0) {
													Static372.aClass234Array1[local2371].anInt6049 = local372;
													Static372.aClass234Array1[local2371].aByte62 = local4834;
													Static372.aClass234Array1[local2371].aString63 = local4915;
													if (local528.equals(Static206.aClass1_Sub5_Sub1_Sub1_1.aString24)) {
														Static269.aByte48 = local4834;
													}
													Static339.aClass205_128 = null;
													Static59.anInt1119 = Static102.anInt2133;
													return true;
												}
												if (local608 < 0) {
													break;
												}
											}
											if (Static372.aClass234Array1.length <= Static19.anInt436) {
												Static339.aClass205_128 = null;
												return true;
											}
											for (local608 = Static19.anInt436 - 1; local608 > local2371; local608--) {
												Static372.aClass234Array1[local608 + 1] = Static372.aClass234Array1[local608];
											}
											if (Static19.anInt436 == 0) {
												Static372.aClass234Array1 = new Class234[100];
											}
											Static372.aClass234Array1[local2371 + 1] = local2396;
											Static19.anInt436++;
											if (local528.equals(Static206.aClass1_Sub5_Sub1_Sub1_1.aString24)) {
												Static269.aByte48 = local4834;
											}
										}
										Static59.anInt1119 = Static102.anInt2133;
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static323.aClass205_119) {
										Static386.method5633(Static218.aClass2_Sub16_Sub2_3.method5364());
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static222.aClass205_91) {
										Static254.anInt4497 = Static218.aClass2_Sub16_Sub2_3.method5350();
										Static156.anInt3026 = Static218.aClass2_Sub16_Sub2_3.method5350();
										Static369.anInt6250 = Static218.aClass2_Sub16_Sub2_3.method5359();
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static163.aClass205_58) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local528 = Static218.aClass2_Sub16_Sub2_3.method5364();
										@Pc(5107) Object[] local5107 = new Object[local528.length() + 1];
										for (local372 = local528.length() - 1; local372 >= 0; local372--) {
											if (local528.charAt(local372) == 's') {
												local5107[local372 + 1] = Static218.aClass2_Sub16_Sub2_3.method5364();
											} else {
												local5107[local372 + 1] = Integer.valueOf(Static218.aClass2_Sub16_Sub2_3.method5346());
											}
										}
										local5107[0] = Integer.valueOf(Static218.aClass2_Sub16_Sub2_3.method5346());
										if (Static255.method3995(local70)) {
											@Pc(5163) Class2_Sub22 local5163 = new Class2_Sub22();
											local5163.anObjectArray33 = local5107;
											Static256.method4003(local5163);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static89.aClass205_42 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5366();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5349();
										if (Static255.method3995(local237)) {
											Static26.method489(local229, local70);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static138.aClass205_23 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (local229 == 65535) {
											local229 = -1;
										}
										local237 = Static218.aClass2_Sub16_Sub2_3.method5353();
										if (Static255.method3995(local70)) {
											Static390.method5663(-1, local229, 1, local237);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static258.aClass205_100 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5369();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5359();
										Static214.anIntArray761[local237] = local70;
										Static267.anIntArray895[local237] = local229;
										Static115.anIntArray476[local237] = 1;
										local372 = Static183.anIntArray664[local237] - 1;
										for (local374 = 0; local374 < local372; local374++) {
											if (local70 >= Class2_Sub4_Sub9.anIntArray282[local374]) {
												Static115.anIntArray476[local237] = local374 + 2;
											}
										}
										Static169.anIntArray642[Static28.anInt607++ & 0x1F] = local237;
										Static339.aClass205_128 = null;
										return true;
									} else if (Static95.aClass205_138 == Static339.aClass205_128) {
										Static282.method4305(Static141.aClass62_4);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static49.aClass205_24) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local528 = Static218.aClass2_Sub16_Sub2_3.method5364();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (Static255.method3995(local70)) {
											Static222.method3649(local528, local237);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static311.aClass205_116 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5338();
										local229 = local70 >> 2;
										local237 = local70 & 0x3;
										local372 = Static181.anIntArray1303[local229];
										local374 = Static218.aClass2_Sub16_Sub2_3.method5353();
										local380 = local374 >> 28 & 0x3;
										local384 = local374 >> 14 & 0x3FFF;
										local1809 = local374 & 0x3FFF;
										local2371 = Static218.aClass2_Sub16_Sub2_3.method5317();
										if (local2371 == 65535) {
											local2371 = -1;
										}
										local1809 -= Static319.anInt5425;
										local384 -= Static28.anInt606;
										Static345.method5668(local237, local384, local1809, local380, local229, local372, local2371);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static359.aClass205_132 == Static339.aClass205_128) {
										Static282.method4305(Static357.aClass62_12);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static344.aClass205_108) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5353();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5317();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5369();
										if (Static255.method3995(local237)) {
											Static390.method5663(local372, local229, 5, local70);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static136.aClass205_63 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5346();
										Static138.aClass182_3 = Static359.aClass111_5.method2821(local70);
										Static339.aClass205_128 = null;
										return true;
									} else if (Static181.aClass205_135 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5349();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (Static255.method3995(local237)) {
											if (local229 == 2) {
												Static125.method2505();
											}
											Static234.anInt4158 = local70;
											Static35.method641(local70);
											Static242.method4238(false);
											Static256.method3998(Static234.anInt4158);
											for (local372 = 0; local372 < 100; local372++) {
												Static331.aBooleanArray30[local372] = true;
											}
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static300.aClass205_38) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5312();
										if (Static255.method3995(local70) && Static183.aClass4ArrayArray1[local229] != null) {
											for (local374 = local237; local374 < local372; local374++) {
												local380 = Static218.aClass2_Sub16_Sub2_3.method5356();
												if (Static183.aClass4ArrayArray1[local229].length > local374 && Static183.aClass4ArrayArray1[local229][local374] != null) {
													Static183.aClass4ArrayArray1[local229][local374].anInt129 = local380;
												}
											}
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static155.aClass205_67) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5335();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5337();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5369();
										if (Static255.method3995(local70)) {
											Static141.method2670(local372, local229, local237);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static4.aClass205_2 == Static339.aClass205_128) {
										local70 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local229 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local237 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local372 = Static218.aClass2_Sub16_Sub2_3.method5312();
										local374 = Static218.aClass2_Sub16_Sub2_3.method5350();
										local380 = Static218.aClass2_Sub16_Sub2_3.method5350();
										if (Static255.method3995(local70)) {
											Static210.method3524(local229, local237, local372, local380, true, local374);
										}
										Static339.aClass205_128 = null;
										return true;
									} else if (Static339.aClass205_128 == Static210.aClass205_84) {
										Static307.method4499(true);
										Static339.aClass205_128 = null;
										return true;
									} else {
										Static142.method2676(null, "T1 - " + (Static339.aClass205_128 == null ? -1 : Static339.aClass205_128.method4376()) + "," + (Static113.aClass205_56 == null ? -1 : Static113.aClass205_56.method4376()) + "," + (Static239.aClass205_95 == null ? -1 : Static239.aClass205_95.method4376()) + " - " + Static276.anInt4757);
										Static32.method596();
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLclient!vc;Lclient!ae;)V")
	public static void method1941(@OriginalArg(1) Class63 arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(31) boolean local31 = Static15.aClass81_1.method2182(arg1.anInt127, arg0, arg1.anInt58, arg1.aBoolean14 ? Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1 : null, arg1.anInt134 | 0xFF000000, arg1.anInt93, arg1.anInt116) == null;
		if (local31) {
			Static233.aClass30_34.method685(new Class2_Sub33(arg1.anInt58, arg1.anInt127, arg1.anInt116, arg1.anInt134 | 0xFF000000, arg1.anInt93, arg1.aBoolean14));
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Z")
	public static boolean method1943() {
		@Pc(8) Class2_Sub26 local8 = (Class2_Sub26) Static195.aClass30_28.aClass2_41.aClass2_244;
		if (local8 == null || local8 == Static195.aClass30_28.aClass2_41) {
			return false;
		} else {
			if (local8.anInt3594 >= 2000) {
				local8.anInt3594 -= 2000;
			}
			return local8.anInt3594 == 1002;
		}
	}
}
