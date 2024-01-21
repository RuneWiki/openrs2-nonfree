import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pc", name = "jb", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_13;

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lclient!he;")
	public static Class26 aClass26_1310 = Static6.method100("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!pc", name = "lb", descriptor = "Lclient!he;")
	private static Class26 aClass26_1315 = Static6.method100("Unable to connect)3");

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "Lclient!he;")
	public static Class26 aClass26_1311 = aClass26_1315;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lclient!he;")
	public static Class26 aClass26_1312 = Static6.method100("Wordpack geladen)3");

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
	public static int anInt2490 = 0;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "Lclient!he;")
	public static Class26 aClass26_1313 = Static6.method100("Einloggen");

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1314 = aClass26_1315;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!hc;")
	public static Class3_Sub1_Sub8 method1658(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub1_Sub8 local15 = (Class3_Sub1_Sub8) Static107.aClass66_25.method1970((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static1.aClass16_2.method566(13, arg0);
		local15 = new Class3_Sub1_Sub8();
		local15.anInt1313 = arg0;
		if (local25 != null) {
			local15.method812(new Class3_Sub11(local25));
		}
		Static107.aClass66_25.method1969((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIILclient!ef;)Z")
	public static boolean method1659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(14) byte[] local14 = arg2.method566(arg1, arg0);
		if (local14 == null) {
			return false;
		} else {
			Static105.method1947(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ef;)V")
	public static void method1660(@OriginalArg(1) Class16 arg0) {
		Static13.aClass16_20 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!fb;)V")
	public static void method1661(@OriginalArg(1) Class3_Sub1_Sub5_Sub1 arg0) {
		arg0.anInt2723 = arg0.anInt2729;
		if (arg0.anInt2699 == 0) {
			arg0.anInt2730 = 0;
			return;
		}
		if (arg0.anInt2738 != -1 && arg0.anInt2695 == 0) {
			@Pc(31) Class3_Sub1_Sub17 local31 = Static111.method2009(arg0.anInt2738);
			if (arg0.anInt2706 > 0 && local31.anInt3097 == 0) {
				arg0.anInt2730++;
				return;
			}
			if (arg0.anInt2706 <= 0 && local31.anInt3101 == 0) {
				arg0.anInt2730++;
				return;
			}
		}
		@Pc(63) int local63 = arg0.anInt2733;
		@Pc(66) int local66 = arg0.anInt2731;
		@Pc(81) int local81 = arg0.anInt2712 * 64 + arg0.anIntArray325[arg0.anInt2699 - 1] * 128;
		@Pc(96) int local96 = arg0.anInt2712 * 64 + arg0.anIntArray326[arg0.anInt2699 - 1] * 128;
		if (local96 - local63 > 256 || local96 - local63 < -256 || local81 - local66 > 256 || local81 - local66 < -256) {
			arg0.anInt2733 = local96;
			arg0.anInt2731 = local81;
			return;
		}
		if (local96 <= local63) {
			if (local63 <= local96) {
				if (local81 > local66) {
					arg0.anInt2691 = 1024;
				} else if (local81 < local66) {
					arg0.anInt2691 = 0;
				}
			} else if (local81 > local66) {
				arg0.anInt2691 = 768;
			} else if (local81 >= local66) {
				arg0.anInt2691 = 512;
			} else {
				arg0.anInt2691 = 256;
			}
		} else if (local81 > local66) {
			arg0.anInt2691 = 1280;
		} else if (local81 < local66) {
			arg0.anInt2691 = 1792;
		} else {
			arg0.anInt2691 = 1536;
		}
		@Pc(206) int local206 = arg0.anInt2732;
		@Pc(215) int local215 = arg0.anInt2691 - arg0.anInt2692 & 0x7FF;
		if (local215 > 1024) {
			local215 -= 2048;
		}
		if (local215 >= -256 && local215 <= 256) {
			local206 = arg0.anInt2734;
		} else if (local215 >= 256 && local215 < 768) {
			local206 = arg0.anInt2717;
		} else if (local215 >= -768 && local215 <= -256) {
			local206 = arg0.anInt2728;
		}
		if (local206 == -1) {
			local206 = arg0.anInt2734;
		}
		arg0.anInt2723 = local206;
		@Pc(270) int local270 = 4;
		@Pc(272) boolean local272 = true;
		if (arg0 instanceof Class3_Sub1_Sub5_Sub1_Sub2) {
			local272 = ((Class3_Sub1_Sub5_Sub1_Sub2) arg0).aClass3_Sub1_Sub3_1.aBoolean18;
		}
		if (local272) {
			if (arg0.anInt2691 != arg0.anInt2692 && arg0.anInt2749 == -1 && arg0.anInt2707 != 0) {
				local270 = 2;
			}
			if (arg0.anInt2699 > 2) {
				local270 = 6;
			}
			if (arg0.anInt2699 > 3) {
				local270 = 8;
			}
			if (arg0.anInt2730 > 0 && arg0.anInt2699 > 1) {
				arg0.anInt2730--;
				local270 = 8;
			}
		} else {
			if (arg0.anInt2699 > 1) {
				local270 = 6;
			}
			if (arg0.anInt2699 > 2) {
				local270 = 8;
			}
			if (arg0.anInt2730 > 0 && arg0.anInt2699 > 1) {
				local270 = 8;
				arg0.anInt2730--;
			}
		}
		if (arg0.aBooleanArray26[arg0.anInt2699 - 1]) {
			local270 <<= 0x1;
		}
		if (local270 >= 8 && arg0.anInt2723 == arg0.anInt2734 && arg0.anInt2736 != -1) {
			arg0.anInt2723 = arg0.anInt2736;
		}
		if (local96 > local63) {
			arg0.anInt2733 += local270;
			if (local96 < arg0.anInt2733) {
				arg0.anInt2733 = local96;
			}
		} else if (local96 < local63) {
			arg0.anInt2733 -= local270;
			if (local96 > arg0.anInt2733) {
				arg0.anInt2733 = local96;
			}
		}
		if (local81 > local66) {
			arg0.anInt2731 += local270;
			if (arg0.anInt2731 > local81) {
				arg0.anInt2731 = local81;
			}
		} else if (local66 > local81) {
			arg0.anInt2731 -= local270;
			if (arg0.anInt2731 < local81) {
				arg0.anInt2731 = local81;
			}
		}
		if (local96 == arg0.anInt2733 && arg0.anInt2731 == local81) {
			arg0.anInt2699--;
			if (arg0.anInt2706 > 0) {
				arg0.anInt2706--;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	public static void method1662() {
		aClass26_1312 = null;
		aClass26_1310 = null;
		aClass16_Sub1_13 = null;
		aClass26_1315 = null;
		aClass26_1313 = null;
		aClass26_1311 = null;
		aClass26_1314 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZLclient!vc;)V")
	public static void method1664(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class76 arg1) {
		if (Static63.aClass76_3 != null) {
			try {
				Static63.aClass76_3.method2183();
			} catch (@Pc(8) Exception local8) {
			}
			Static63.aClass76_3 = null;
		}
		Static63.aClass76_3 = arg1;
		Static58.method1182(arg0);
		Static122.aClass3_Sub11_35.anInt1562 = 0;
		Static64.aClass3_Sub11_21 = null;
		Static115.anInt3048 = 0;
		Static56.aClass3_Sub1_Sub11_1 = null;
		while (true) {
			@Pc(37) Class3_Sub1_Sub11 local37 = (Class3_Sub1_Sub11) Static85.aClass17_15.method598();
			if (local37 == null) {
				while (true) {
					local37 = (Class3_Sub1_Sub11) Static60.aClass17_11.method598();
					if (local37 == null) {
						if (Static14.aByte1 != 0) {
							try {
								@Pc(92) Class3_Sub11 local92 = new Class3_Sub11(4);
								local92.method992(4);
								local92.method992(Static14.aByte1);
								local92.method972(0);
								Static63.aClass76_3.method2185(4, local92.aByteArray13);
							} catch (@Pc(113) IOException local113) {
								try {
									Static63.aClass76_3.method2183();
								} catch (@Pc(118) Exception local118) {
								}
								Static109.anInt2925++;
								Static63.aClass76_3 = null;
							}
						}
						Static115.anInt3045 = 0;
						Static13.aLong10 = Static87.method1625();
						return;
					}
					Static4.aClass1_1.method3(local37);
					Static96.aClass17_16.method594(local37, local37.aLong100);
					Static8.anInt200--;
					Static124.anInt3201++;
				}
			}
			Static63.aClass17_13.method594(local37, local37.aLong100);
			Static103.anInt2778--;
			Static52.anInt1615++;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lclient!ac;Lclient!td;B)V")
	public static void method1665(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) Class69 arg1) {
		@Pc(7) int local7;
		@Pc(28) int local28;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (@Pc(11) int local11 = 0; local11 < 104; local11++) {
					if ((Static74.aByteArrayArrayArray5[local3][local7][local11] & 0x1) == 1) {
						local28 = local3;
						if ((Static74.aByteArrayArrayArray5[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg0[local28].method75(local7, local11);
						}
					}
				}
			}
		}
		Static93.anInt2533 += (int) (Math.random() * 5.0D) - 2;
		if (Static93.anInt2533 < -8) {
			Static93.anInt2533 = -8;
		}
		Static94.anInt2551 += (int) (Math.random() * 5.0D) - 2;
		if (Static94.anInt2551 < -16) {
			Static94.anInt2551 = -16;
		}
		if (Static94.anInt2551 > 16) {
			Static94.anInt2551 = 16;
		}
		if (Static93.anInt2533 > 8) {
			Static93.anInt2533 = 8;
		}
		@Pc(136) int local136;
		@Pc(142) int local142;
		@Pc(144) int local144;
		@Pc(148) int local148;
		@Pc(171) int local171;
		@Pc(192) int local192;
		@Pc(206) int local206;
		@Pc(212) int local212;
		@Pc(216) int local216;
		@Pc(222) int local222;
		@Pc(238) int local238;
		@Pc(288) int local288;
		@Pc(516) int local516;
		@Pc(512) int local512;
		@Pc(647) int local647;
		@Pc(657) int local657;
		@Pc(679) int local679;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(132) byte[][] local132 = Static86.aByteArrayArrayArray6[local7];
			local136 = (int) Math.sqrt(5100.0D);
			local142 = local136 * 768 >> 8;
			for (local144 = 1; local144 < 103; local144++) {
				for (local148 = 1; local148 < 103; local148++) {
					local171 = Static117.anIntArrayArrayArray6[local7][local148 + 1][local144] - Static117.anIntArrayArrayArray6[local7][local148 - 1][local144];
					local192 = Static117.anIntArrayArrayArray6[local7][local148][local144 + 1] - Static117.anIntArrayArrayArray6[local7][local148][local144 - 1];
					local206 = (int) Math.sqrt((double) (local171 * local171 + local192 * local192 + 65536));
					local212 = (local171 << 8) / local206;
					local216 = 65536 / local206;
					local222 = (local192 << 8) / local206;
					local238 = (local216 * -10 + local212 * -50 + local222 * -50) / local142 + 96;
					local288 = (local132[local148][local144 - 1] >> 2) + ((local132[local148 + 1][local144] >> 3) + (local132[local148 - 1][local144] >> 2) - (-(local132[local148][local144 + 1] >> 3) + -(local132[local148][local144] >> 1)));
					Static58.anIntArrayArray14[local148][local144] = local238 - local288;
				}
			}
			for (local148 = 0; local148 < 104; local148++) {
				Static117.anIntArray368[local148] = 0;
				Static74.anIntArray200[local148] = 0;
				Static108.anIntArray346[local148] = 0;
				Static106.anIntArray342[local148] = 0;
				Static44.anIntArray142[local148] = 0;
			}
			for (local171 = -5; local171 < 109; local171++) {
				for (local192 = 0; local192 < 104; local192++) {
					local206 = local171 + 5;
					@Pc(408) int local408;
					if (local206 >= 0 && local206 < 104) {
						local212 = Static24.aByteArrayArrayArray1[local7][local206][local192] & 0xFF;
						if (local212 > 0) {
							@Pc(372) Class3_Sub1_Sub2 local372 = Static46.method891(local212 - 1);
							Static117.anIntArray368[local192] += local372.anInt173;
							Static74.anIntArray200[local192] += local372.anInt161;
							Static108.anIntArray346[local192] += local372.anInt168;
							Static106.anIntArray342[local192] += local372.anInt172;
							local408 = Static44.anIntArray142[local192]++;
						}
					}
					local212 = local171 - 5;
					if (local212 >= 0 && local212 < 104) {
						local216 = Static24.aByteArrayArrayArray1[local7][local212][local192] & 0xFF;
						if (local216 > 0) {
							@Pc(441) Class3_Sub1_Sub2 local441 = Static46.method891(local216 - 1);
							Static117.anIntArray368[local192] -= local441.anInt173;
							Static74.anIntArray200[local192] -= local441.anInt161;
							Static108.anIntArray346[local192] -= local441.anInt168;
							Static106.anIntArray342[local192] -= local441.anInt172;
							local408 = Static44.anIntArray142[local192]--;
						}
					}
				}
				if (local171 >= 1 && local171 < 103) {
					local206 = 0;
					local212 = 0;
					local216 = 0;
					local238 = 0;
					local222 = 0;
					for (local288 = -5; local288 < 109; local288++) {
						local512 = local288 - 5;
						local516 = local288 + 5;
						if (local516 >= 0 && local516 < 104) {
							local206 += Static117.anIntArray368[local516];
							local222 += Static106.anIntArray342[local516];
							local216 += Static108.anIntArray346[local516];
							local212 += Static74.anIntArray200[local516];
							local238 += Static44.anIntArray142[local516];
						}
						if (local512 >= 0 && local512 < 104) {
							local206 -= Static117.anIntArray368[local512];
							local216 -= Static108.anIntArray346[local512];
							local222 -= Static106.anIntArray342[local512];
							local212 -= Static74.anIntArray200[local512];
							local238 -= Static44.anIntArray142[local512];
						}
						if (local288 >= 1 && local288 < 103 && (!Static98.aBoolean151 || (Static74.aByteArrayArrayArray5[0][local171][local288] & 0x2) != 0 || (Static74.aByteArrayArrayArray5[local7][local171][local288] & 0x10) == 0 && Static91.method1675(local171, local7, local288) == Static80.anInt2211)) {
							if (local7 < Static32.anInt1043) {
								Static32.anInt1043 = local7;
							}
							local647 = Static24.aByteArrayArrayArray1[local7][local171][local288] & 0xFF;
							local657 = Static98.aByteArrayArrayArray7[local7][local171][local288] & 0xFF;
							if (local647 > 0 || local657 > 0) {
								@Pc(671) int local671 = Static117.anIntArrayArrayArray6[local7][local171 + 1][local288];
								local679 = Static117.anIntArrayArrayArray6[local7][local171][local288];
								@Pc(691) int local691 = Static117.anIntArrayArrayArray6[local7][local171 + 1][local288 + 1];
								@Pc(701) int local701 = Static117.anIntArrayArrayArray6[local7][local171][local288 + 1];
								@Pc(707) int local707 = Static58.anIntArrayArray14[local171][local288];
								@Pc(715) int local715 = Static58.anIntArrayArray14[local171 + 1][local288];
								@Pc(725) int local725 = Static58.anIntArrayArray14[local171 + 1][local288 + 1];
								@Pc(733) int local733 = Static58.anIntArrayArray14[local171][local288 + 1];
								@Pc(735) int local735 = -1;
								@Pc(737) int local737 = -1;
								@Pc(745) int local745;
								@Pc(749) int local749;
								if (local647 > 0) {
									local745 = local206 * 256 / local222;
									local749 = local212 / local238;
									@Pc(753) int local753 = local216 / local238;
									local735 = Static5.method2204(local753, local749, local745);
									@Pc(765) int local765 = local745 + Static93.anInt2533 & 0xFF;
									local753 += Static94.anInt2551;
									if (local753 < 0) {
										local753 = 0;
									} else if (local753 > 255) {
										local753 = 255;
									}
									local737 = Static5.method2204(local753, local749, local765);
								}
								if (local7 > 0) {
									@Pc(796) boolean local796 = true;
									if (local647 == 0 && Static71.aByteArrayArrayArray3[local7][local171][local288] != 0) {
										local796 = false;
									}
									if (local657 > 0 && !Static32.method631(local657 - 1).aBoolean98) {
										local796 = false;
									}
									if (local796 && local671 == local679 && local679 == local691 && local701 == local679) {
										Static15.anIntArrayArrayArray1[local7][local171][local288] |= 0x924;
									}
								}
								local745 = 0;
								if (local737 != -1) {
									local745 = Static127.anIntArray390[Static101.method1893(96, local737)];
								}
								if (local657 == 0) {
									arg1.method2063(local7, local171, local288, 0, 0, -1, local679, local671, local691, local701, Static101.method1893(local707, local735), Static101.method1893(local715, local735), Static101.method1893(local725, local735), Static101.method1893(local733, local735), 0, 0, 0, 0, local745, 0);
								} else {
									@Pc(916) byte local916 = Static71.aByteArrayArrayArray4[local7][local171][local288];
									local749 = Static71.aByteArrayArrayArray3[local7][local171][local288] + 1;
									@Pc(932) Class3_Sub1_Sub10 local932 = Static32.method631(local657 - 1);
									@Pc(935) int local935 = local932.anInt1921;
									@Pc(948) int local948;
									@Pc(952) int local952;
									@Pc(976) int local976;
									@Pc(969) int local969;
									if (local935 >= 0) {
										local948 = -1;
										local952 = Static127.anInterface2_1.method1098(local935);
									} else if (local932.anInt1919 == 16711935) {
										local948 = -2;
										local935 = -1;
										local952 = -2;
									} else {
										local948 = Static5.method2204(local932.anInt1923, local932.anInt1932, local932.anInt1925);
										local969 = local932.anInt1923 + Static94.anInt2551;
										local976 = local932.anInt1925 + Static93.anInt2533 & 0xFF;
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										local952 = Static5.method2204(local969, local932.anInt1932, local976);
									}
									local976 = 0;
									if (local952 != -2) {
										local976 = Static127.anIntArray390[Static91.method1674(local952, 96)];
									}
									if (local932.anInt1917 != -1) {
										local969 = Static93.anInt2533 + local932.anInt1918 & 0xFF;
										@Pc(1033) int local1033 = Static94.anInt2551 + local932.anInt1922;
										if (local1033 < 0) {
											local1033 = 0;
										} else if (local1033 > 255) {
											local1033 = 255;
										}
										local952 = Static5.method2204(local1033, local932.anInt1930, local969);
										local976 = Static127.anIntArray390[Static91.method1674(local952, 96)];
									}
									arg1.method2063(local7, local171, local288, local749, local916, local935, local679, local671, local691, local701, Static101.method1893(local707, local735), Static101.method1893(local715, local735), Static101.method1893(local725, local735), Static101.method1893(local733, local735), Static91.method1674(local948, local707), Static91.method1674(local948, local715), Static91.method1674(local948, local725), Static91.method1674(local948, local733), local745, local976);
								}
							}
						}
					}
				}
			}
			for (local192 = 1; local192 < 103; local192++) {
				for (local206 = 1; local206 < 103; local206++) {
					arg1.method2020(local7, local206, local192, Static91.method1675(local206, local7, local192));
				}
			}
			Static24.aByteArrayArrayArray1[local7] = null;
			Static98.aByteArrayArrayArray7[local7] = null;
			Static71.aByteArrayArrayArray3[local7] = null;
			Static71.aByteArrayArrayArray4[local7] = null;
			Static86.aByteArrayArrayArray6[local7] = null;
		}
		arg1.method2041();
		for (local28 = 0; local28 < 104; local28++) {
			for (local136 = 0; local136 < 104; local136++) {
				if ((Static74.aByteArrayArrayArray5[1][local28][local136] & 0x2) == 2) {
					arg1.method2025(local28, local136);
				}
			}
		}
		local136 = 1;
		local144 = 4;
		local142 = 2;
		for (local148 = 0; local148 < 4; local148++) {
			if (local148 > 0) {
				local142 <<= 0x3;
				local136 <<= 0x3;
				local144 <<= 0x3;
			}
			for (local171 = 0; local171 <= local148; local171++) {
				for (local192 = 0; local192 <= 104; local192++) {
					for (local206 = 0; local206 <= 104; local206++) {
						if ((local136 & Static15.anIntArrayArrayArray1[local171][local206][local192]) != 0) {
							local212 = local192;
							local216 = local192;
							while (local212 > 0 && (Static15.anIntArrayArrayArray1[local171][local206][local212 - 1] & local136) != 0) {
								local212--;
							}
							local222 = local171;
							while (local216 < 104 && (Static15.anIntArrayArrayArray1[local171][local206][local216 + 1] & local136) != 0) {
								local216++;
							}
							label348: while (local222 > 0) {
								for (local288 = local212; local288 <= local216; local288++) {
									if ((local136 & Static15.anIntArrayArrayArray1[local222 - 1][local206][local288]) == 0) {
										break label348;
									}
								}
								local222--;
							}
							label336: for (local238 = local171; local238 < local148; local238++) {
								for (local288 = local212; local288 <= local216; local288++) {
									if ((local136 & Static15.anIntArrayArrayArray1[local238 + 1][local206][local288]) == 0) {
										break label336;
									}
								}
							}
							local288 = (local216 + 1 - local212) * ((local238 - local222) + 1);
							if (local288 >= 8) {
								local512 = Static117.anIntArrayArrayArray6[local238][local206][local212] - 240;
								local647 = Static117.anIntArrayArrayArray6[local222][local206][local212];
								Static112.method2049(local148, 1, local206 * 128, local206 * 128, local212 * 128, local216 * 128 + 128, local512, local647);
								for (local657 = local222; local657 <= local238; local657++) {
									for (local679 = local212; local679 <= local216; local679++) {
										Static15.anIntArrayArrayArray1[local657][local206][local679] &= ~local136;
									}
								}
							}
						}
						if ((Static15.anIntArrayArrayArray1[local171][local206][local192] & local142) != 0) {
							for (local212 = local206; local212 > 0 && (Static15.anIntArrayArrayArray1[local171][local212 - 1][local192] & local142) != 0; local212--) {
							}
							local222 = local171;
							local238 = local171;
							for (local216 = local206; local216 < 104 && (local142 & Static15.anIntArrayArrayArray1[local171][local216 + 1][local192]) != 0; local216++) {
							}
							label402: while (local222 > 0) {
								for (local288 = local212; local288 <= local216; local288++) {
									if ((local142 & Static15.anIntArrayArrayArray1[local222 - 1][local288][local192]) == 0) {
										break label402;
									}
								}
								local222--;
							}
							label391: while (local148 > local238) {
								for (local288 = local212; local288 <= local216; local288++) {
									if ((local142 & Static15.anIntArrayArrayArray1[local238 + 1][local288][local192]) == 0) {
										break label391;
									}
								}
								local238++;
							}
							local288 = (local238 + 1 - local222) * (local216 + 1 - local212);
							if (local288 >= 8) {
								local512 = Static117.anIntArrayArrayArray6[local238][local212][local192] - 240;
								local647 = Static117.anIntArrayArrayArray6[local222][local212][local192];
								Static112.method2049(local148, 2, local212 * 128, local216 * 128 + 128, local192 * 128, local192 * 128, local512, local647);
								for (local657 = local222; local657 <= local238; local657++) {
									for (local679 = local212; local679 <= local216; local679++) {
										Static15.anIntArrayArrayArray1[local657][local679][local192] &= ~local142;
									}
								}
							}
						}
						if ((Static15.anIntArrayArrayArray1[local171][local206][local192] & local144) != 0) {
							local212 = local206;
							local238 = local192;
							local216 = local206;
							while (local238 < 104 && (local144 & Static15.anIntArrayArrayArray1[local171][local206][local238 + 1]) != 0) {
								local238++;
							}
							for (local222 = local192; local222 > 0 && (local144 & Static15.anIntArrayArrayArray1[local171][local206][local222 - 1]) != 0; local222--) {
							}
							label456: while (local212 > 0) {
								for (local288 = local222; local288 <= local238; local288++) {
									if ((local144 & Static15.anIntArrayArrayArray1[local171][local212 - 1][local288]) == 0) {
										break label456;
									}
								}
								local212--;
							}
							label445: while (local216 < 104) {
								for (local288 = local222; local288 <= local238; local288++) {
									if ((Static15.anIntArrayArrayArray1[local171][local216 + 1][local288] & local144) == 0) {
										break label445;
									}
								}
								local216++;
							}
							if ((local238 + 1 - local222) * (local216 + 1 + -local212) >= 4) {
								local288 = Static117.anIntArrayArrayArray6[local171][local212][local222];
								Static112.method2049(local148, 4, local212 * 128, local216 * 128 + 128, local222 * 128, local238 * 128 + 128, local288, local288);
								for (local516 = local212; local516 <= local216; local516++) {
									for (local512 = local222; local512 <= local238; local512++) {
										Static15.anIntArrayArrayArray1[local171][local516][local512] &= ~local144;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
