import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!sfa;")
	public static Class338 aClass338_3;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "J")
	public static long aLong68;

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljava/lang/Class;")
	public static Class aClass8;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[Lclient!lu;")
	public static Class238_Sub1[] aClass238_Sub1Array1 = new Class238_Sub1[0];

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1857(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static607.anInt9201;
		@Pc(3) int[] local3 = Static384.anIntArray436;
		@Pc(9) int local9;
		if (Static103.anInt2245 == 3) {
			local9 = Static470.aClass7Array1.length;
		} else {
			local9 = Static426.aBoolean440 ? local1 : local1 + Static28.anInt1087;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class9_Sub1_Sub1_Sub2 local36;
			if (Static103.anInt2245 == 3) {
				@Pc(29) Class7 local29 = Static470.aClass7Array1[local21];
				if (!local29.aBoolean4) {
					continue;
				}
				local36 = local29.method249();
			} else {
				if (local21 < local1) {
					local36 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local3[local21]];
				} else {
					local36 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local21 - local1])).aClass9_Sub1_Sub1_Sub2_Sub2_2;
				}
				if (local36.aByte139 != arg0) {
					continue;
				}
				if (local36.anInt8770 < 0) {
					local36.aBoolean591 = false;
					continue;
				}
			}
			local36.anInt8762 = 0;
			@Pc(80) int local80 = local36.method7485();
			if ((local80 & 0x1) == 0) {
				if ((local36.anInt10694 & 0x1FF) != 0 || (local36.anInt10695 & 0x1FF) != 0) {
					local36.aBoolean591 = false;
					continue;
				}
			} else if ((local36.anInt10694 & 0x1FF) != 256 || (local36.anInt10695 & 0x1FF) != 256) {
				local36.aBoolean591 = false;
				continue;
			}
			if (Static103.anInt2245 != 3) {
				@Pc(135) int local135;
				@Pc(140) int local140;
				@Pc(166) int local166;
				if (local80 == 1) {
					local135 = local36.anInt10694 >> 9;
					local140 = local36.anInt10695 >> 9;
					if (local36.anInt8770 != Static672.anIntArrayArray64[local135][local140]) {
						local36.aBoolean591 = true;
						continue;
					}
					if (Static44.anIntArrayArray5[local135][local140] > 1) {
						local166 = Static44.anIntArrayArray5[local135][local140]--;
						local36.aBoolean591 = true;
						continue;
					}
				} else {
					local135 = (local80 - 1) * 256 + 252;
					local140 = local36.anInt10694 - local135 >> 9;
					@Pc(196) int local196 = local36.anInt10695 - local135 >> 9;
					@Pc(203) int local203 = local36.anInt10694 + local135 >> 9;
					@Pc(210) int local210 = local36.anInt10695 + local135 >> 9;
					if (!Static207.method3119(local140, local210, local203, local196, local36.anInt8770)) {
						for (@Pc(221) int local221 = local140; local221 <= local203; local221++) {
							for (@Pc(224) int local224 = local196; local224 <= local210; local224++) {
								if (local36.anInt8770 == Static672.anIntArrayArray64[local221][local224]) {
									local166 = Static44.anIntArrayArray5[local221][local224]--;
								}
							}
						}
						local36.aBoolean591 = true;
						continue;
					}
				}
			}
			local36.aBoolean591 = false;
			local36.anInt10690 = Static77.method1633(local36.anInt10695, local36.anInt10694, local36.aByte139);
			Static507.method6900(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1860(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static607.anInt9201;
		@Pc(3) int[] local3 = Static384.anIntArray436;
		@Pc(9) int local9;
		if (Static103.anInt2245 == 3) {
			local9 = Static470.aClass7Array1.length;
		} else {
			local9 = local1 + Static28.anInt1087;
		}
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(31) Class9_Sub1_Sub1_Sub2 local31;
			if (Static103.anInt2245 == 3) {
				@Pc(24) Class7 local24 = Static470.aClass7Array1[local16];
				if (!local24.aBoolean4) {
					continue;
				}
				local31 = local24.method249();
			} else {
				if (local16 < local1) {
					local31 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local3[local16]];
				} else {
					local31 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local16 - local1])).aClass9_Sub1_Sub1_Sub2_Sub2_2;
				}
				if (local31.aByte139 != arg0 || local31.anInt8770 < 0) {
					continue;
				}
			}
			@Pc(69) int local69 = local31.method7485();
			if ((local69 & 0x1) == 0) {
				if ((local31.anInt10694 & 0x1FF) != 0 || (local31.anInt10695 & 0x1FF) != 0) {
					continue;
				}
			} else if ((local31.anInt10694 & 0x1FF) != 256 || (local31.anInt10695 & 0x1FF) != 256) {
				continue;
			}
			@Pc(113) int local113;
			@Pc(118) int local118;
			@Pc(155) int local155;
			if (local69 == 1) {
				local113 = local31.anInt10694 >> 9;
				local118 = local31.anInt10695 >> 9;
				if (local31.anInt8770 > Static672.anIntArrayArray64[local113][local118]) {
					Static672.anIntArrayArray64[local113][local118] = local31.anInt8770;
					Static44.anIntArrayArray5[local113][local118] = 1;
				} else if (local31.anInt8770 == Static672.anIntArrayArray64[local113][local118]) {
					local155 = Static44.anIntArrayArray5[local113][local118]++;
				}
			} else {
				local113 = (local69 - 1) * 256 + 60;
				local118 = local31.anInt10694 - local113 >> 9;
				@Pc(182) int local182 = local31.anInt10695 - local113 >> 9;
				@Pc(189) int local189 = local31.anInt10694 + local113 >> 9;
				@Pc(196) int local196 = local31.anInt10695 + local113 >> 9;
				for (@Pc(198) int local198 = local118; local198 <= local189; local198++) {
					for (@Pc(201) int local201 = local182; local201 <= local196; local201++) {
						if (local31.anInt8770 > Static672.anIntArrayArray64[local198][local201]) {
							Static672.anIntArrayArray64[local198][local201] = local31.anInt8770;
							Static44.anIntArrayArray5[local198][local201] = 1;
						} else if (local31.anInt8770 == Static672.anIntArrayArray64[local198][local201]) {
							local155 = Static44.anIntArrayArray5[local198][local201]++;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1861(@OriginalArg(0) int arg0) {
		@Pc(18) Class3_Sub50 local18 = (Class3_Sub50) Static55.aClass313_7.method7104((long) arg0);
		if (local18 != null) {
			@Pc(25) Class3_Sub32_Sub4 local25 = local18.aClass253_Sub1_1.method7290();
			if (local25 != null) {
				@Pc(32) double local32 = local18.aClass253_Sub1_1.method7291();
				if ((double) local25.method8593() <= local32 && (double) local25.method8596() >= local32) {
					return local25.method8592();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1863() {
		@Pc(1) int local1 = Static607.anInt9201;
		@Pc(3) int[] local3 = Static384.anIntArray436;
		@Pc(9) int local9;
		if (Static103.anInt2245 == 3) {
			local9 = Static470.aClass7Array1.length;
		} else {
			local9 = Static426.aBoolean440 ? local1 : local1 + Static28.anInt1087;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class9_Sub1_Sub1_Sub2 local36;
			if (Static103.anInt2245 == 3) {
				@Pc(29) Class7 local29 = Static470.aClass7Array1[local21];
				if (!local29.aBoolean4) {
					continue;
				}
				local36 = local29.method249();
			} else {
				if (local21 < local1) {
					local36 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local3[local21]];
				} else {
					local36 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local21 - local1])).aClass9_Sub1_Sub1_Sub2_Sub2_2;
				}
				if (local36.anInt8770 < 0) {
					continue;
				}
			}
			@Pc(68) int local68 = local36.method7485();
			if ((local68 & 0x1) == 0) {
				if ((local36.anInt10694 & 0x1FF) == 0 && (local36.anInt10695 & 0x1FF) == 0) {
					continue;
				}
			} else if ((local36.anInt10694 & 0x1FF) == 256 && (local36.anInt10695 & 0x1FF) == 256) {
				continue;
			}
			local36.anInt10690 = Static77.method1633(local36.anInt10695, local36.anInt10694, local36.aByte139);
			Static507.method6900(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)I")
	public static int method1864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static172.anIntArray202[arg1 & 0x3] : Static243.anIntArray286[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nt;)Z")
	public static boolean method1865(@OriginalArg(0) Class270 arg0) {
		if (Static571.aBoolean583) {
			if (method1871(arg0).anInt7682 != 0) {
				return false;
			}
			if (arg0.anInt7008 == 0) {
				return false;
			}
		}
		return arg0.aBoolean470;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1866() {
		@Pc(1) int local1 = Static607.anInt9201;
		@Pc(3) int[] local3 = Static384.anIntArray436;
		@Pc(8) int local8 = Static580.aClass3_Sub22_24.aClass21_Sub1_1.method712();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class9_Sub1_Sub1_Sub2_Sub1 local39 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local3[local32]];
			if (!local39.method476()) {
				local39.anInt8770 = -1;
			} else if (local39.aBoolean34) {
				local39.anInt8770 = -1;
			} else {
				local39.method9097();
				if (local39.aShort123 >= 0 && local39.aShort120 >= 0 && local39.aShort122 < Static497.anInt7926 && local39.aShort121 < Static646.anInt9979) {
					local39.aBoolean39 = local39.aBoolean593 ? local30 : false;
					if (local39 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2) {
						local39.anInt8770 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean591) {
							local103++;
						}
						if (local39.anInt8769 > Static716.anInt11157) {
							local103 += 2;
						}
						local103 += 5 - local39.method7485() << 2;
						if (local39.aBoolean36 || local39.aBoolean37) {
							local103 += 512;
						} else {
							if (Static349.anInt5569 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt8770 = local103 + 1;
					}
				} else {
					local39.anInt8770 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static28.anInt1087; local155++) {
			@Pc(166) Class9_Sub1_Sub1_Sub2_Sub2 local166 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local155])).aClass9_Sub1_Sub1_Sub2_Sub2_2;
			if (local166.method7500() && local166.aClass219_1.method5028(Static380.aClass127_1)) {
				local166.method9097();
				if (local166.aShort123 >= 0 && local166.aShort120 >= 0 && local166.aShort122 < Static497.anInt7926 && local166.aShort121 < Static646.anInt9979) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean591) {
						local213++;
					}
					if (local166.anInt8769 > Static716.anInt11157) {
						local213 += 2;
					}
					local213 += 5 - local166.method7485() << 2;
					if (Static349.anInt5569 == 0) {
						if (local166.aClass219_1.aBoolean369) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static349.anInt5569 == 1) {
						if (local166.aClass219_1.aBoolean369) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass219_1.aBoolean367) {
						local213 += 1024;
					} else if (!local166.aClass219_1.aBoolean372) {
						local213 += 256;
					}
					local166.anInt8770 = local213 + 1;
				} else {
					local166.anInt8770 = -1;
				}
			} else {
				local166.anInt8770 = -1;
			}
		}
		for (local103 = 0; local103 < Static110.aClass197Array1.length; local103++) {
			@Pc(292) Class197 local292 = Static110.aClass197Array1[local103];
			if (local292 != null) {
				if (local292.anInt5073 == 1) {
					@Pc(308) Class3_Sub52 local308 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local292.anInt5082);
					if (local308 != null) {
						@Pc(313) Class9_Sub1_Sub1_Sub2_Sub2 local313 = local308.aClass9_Sub1_Sub1_Sub2_Sub2_2;
						if (local313.anInt8770 >= 0) {
							local313.anInt8770 += 2048;
						}
					}
				} else if (local292.anInt5073 == 10) {
					@Pc(333) Class9_Sub1_Sub1_Sub2_Sub1 local333 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local292.anInt5082];
					if (local333 != null && local333 != Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 && local333.anInt8770 >= 0) {
						local333.anInt8770 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method1867(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(21) char local21 = arg0.charAt(local13);
			if (local21 > '\u0000' && local21 < '\u0080' || local21 >= ' ' && local21 <= 'ÿ') {
				local11[local13] = (byte) local21;
			} else if (local21 == '€') {
				local11[local13] = -128;
			} else if (local21 == '‚') {
				local11[local13] = -126;
			} else if (local21 == 'ƒ') {
				local11[local13] = -125;
			} else if (local21 == '„') {
				local11[local13] = -124;
			} else if (local21 == '…') {
				local11[local13] = -123;
			} else if (local21 == '†') {
				local11[local13] = -122;
			} else if (local21 == '‡') {
				local11[local13] = -121;
			} else if (local21 == 'ˆ') {
				local11[local13] = -120;
			} else if (local21 == '‰') {
				local11[local13] = -119;
			} else if (local21 == 'Š') {
				local11[local13] = -118;
			} else if (local21 == '‹') {
				local11[local13] = -117;
			} else if (local21 == 'Œ') {
				local11[local13] = -116;
			} else if (local21 == 'Ž') {
				local11[local13] = -114;
			} else if (local21 == '‘') {
				local11[local13] = -111;
			} else if (local21 == '’') {
				local11[local13] = -110;
			} else if (local21 == '“') {
				local11[local13] = -109;
			} else if (local21 == '”') {
				local11[local13] = -108;
			} else if (local21 == '•') {
				local11[local13] = -107;
			} else if (local21 == '–') {
				local11[local13] = -106;
			} else if (local21 == '—') {
				local11[local13] = -105;
			} else if (local21 == '˜') {
				local11[local13] = -104;
			} else if (local21 == '™') {
				local11[local13] = -103;
			} else if (local21 == 'š') {
				local11[local13] = -102;
			} else if (local21 == '›') {
				local11[local13] = -101;
			} else if (local21 == 'œ') {
				local11[local13] = -100;
			} else if (local21 == 'ž') {
				local11[local13] = -98;
			} else if (local21 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		if (false) {
			method1876();
		}
		return local11;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!nt;IIIIIIIIIII)V")
	public static void method1869(@OriginalArg(0) Class270[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label908: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class270 local6 = arg0[local1];
			if (local6 != null && local6.anInt7050 == arg1) {
				@Pc(19) int local19 = local6.anInt7036 + arg6;
				@Pc(24) int local24 = local6.anInt6981 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt7008 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt7015;
					local47 = local24 + local6.anInt7045;
					if (local6.anInt7008 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt7008 == 0 || local6.aBoolean481 || method1871(local6).anInt7682 != 0 || local6 == Static309.aClass270_9 || local6.anInt7042 == Static673.anInt10807 || local6.anInt7042 == Static210.anInt3464 || local6.anInt7042 == Static727.anInt11271 || local6.anInt7042 == Static344.anInt5515) {
					if (!method1865(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static347.aBoolean360) {
							local42 = Static308.method4570();
							local47 = Static541.method7180();
						}
						if (local6 == Static334.aClass270_10 && Static8.method247(Static334.aClass270_10) != null) {
							Static633.aBoolean655 = true;
							Static528.anInt8245 = local19;
							Static516.anInt8131 = local24;
						}
						if (local6.aBoolean475 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean463 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(220) Class3_Sub41 local220 = (Class3_Sub41) Static501.aClass342_61.method7644(); local220 != null; local220 = (Class3_Sub41) Static501.aClass342_61.method7650()) {
									if (local220.aBoolean397) {
										local220.method9596();
										local220.aClass270_12.aBoolean477 = false;
									}
								}
								if (Static331.anInt5332 == 0) {
									Static334.aClass270_10 = null;
									Static309.aClass270_9 = null;
								}
								Static116.anInt2383 = 0;
								Static570.aBoolean582 = false;
								Static685.aBoolean393 = false;
								if (!Static530.aBoolean556) {
									Static205.method3103();
								}
							}
							@Pc(308) boolean local308 = local6.aBoolean468 && local6.anInt7008 == 5 && local6.anInt7002 == 0 && local6.anInt6962 < 0 && local6.anInt7001 == -1 && local6.anInt7044 == -1 && !local6.aBoolean471 && local6.anInt6966 == 0;
							@Pc(310) boolean local310 = false;
							@Pc(402) int local402;
							if (Static334.aClass18_1.method4192() + local42 >= local30 && Static334.aClass18_1.method4196() + local47 >= local32 && Static334.aClass18_1.method4192() + local42 < local34 && Static334.aClass18_1.method4196() + local47 < local36) {
								if (local308) {
									@Pc(353) Class252 local353 = local6.method6017(Static153.aClass22_4);
									if (local353 != null && local353.anInt6384 == local6.anInt7015 && local353.anInt6388 == local6.anInt7045) {
										@Pc(380) int local380 = Static334.aClass18_1.method4192() + local42 - local19;
										@Pc(388) int local388 = Static334.aClass18_1.method4196() + local47 - local24;
										if (local388 >= 0 && local388 < local353.anIntArray489.length) {
											local402 = local353.anIntArray489[local388];
											if (local380 >= local402 && local380 <= local402 + local353.anIntArray490[local388]) {
												local310 = true;
											}
										}
									} else {
										local310 = true;
									}
								} else {
									local310 = true;
								}
							}
							if (!Static474.aBoolean505 && local310) {
								if (local6.anInt7031 >= 0) {
									Static167.anInt2966 = local6.anInt7031;
								} else if (local6.aBoolean463) {
									Static167.anInt2966 = -1;
								}
							}
							if (!Static530.aBoolean556 && local310) {
								Static412.method5511(local6, arg10 - local19, arg10 - local24);
							}
							@Pc(462) boolean local462 = false;
							if (Static334.aClass18_1.method4200() && local310) {
								local462 = true;
							}
							@Pc(474) boolean local474 = false;
							@Pc(479) Class3_Sub23 local479 = (Class3_Sub23) Static114.aClass342_21.method7644();
							@Pc(549) int local549;
							@Pc(555) int local555;
							@Pc(569) int local569;
							@Pc(524) Class252 local524;
							if (local479 != null && local479.method3194() == 0 && local479.method3197() >= local30 && local479.method3196() >= local32 && local479.method3197() < local34 && local479.method3196() < local36) {
								if (local308) {
									local524 = local6.method6017(Static153.aClass22_4);
									if (local524 != null && local524.anInt6384 == local6.anInt7015 && local524.anInt6388 == local6.anInt7045) {
										local549 = local479.method3197() - local19;
										local555 = local479.method3196() - local24;
										if (local555 >= 0 && local555 < local524.anIntArray489.length) {
											local569 = local524.anIntArray489[local555];
											if (local549 >= local569 && local549 <= local569 + local524.anIntArray490[local555]) {
												local474 = true;
											}
										}
									} else {
										local474 = true;
									}
								} else {
									local474 = true;
								}
							}
							if (local6.aByteArray68 != null && !Static647.method8510()) {
								for (local402 = 0; local402 < local6.aByteArray68.length; local402++) {
									if (Static43.aClass50_1.method7394(local6.aByteArray68[local402])) {
										if (local6.anIntArray516 == null || Static716.anInt11157 >= local6.anIntArray516[local402]) {
											@Pc(634) byte local634 = local6.aByteArray67[local402];
											if (local634 == 0 || ((local634 & 0x8) == 0 || !Static43.aClass50_1.method7394(86) && !Static43.aClass50_1.method7394(82) && !Static43.aClass50_1.method7394(81)) && ((local634 & 0x2) == 0 || Static43.aClass50_1.method7394(86)) && ((local634 & 0x1) == 0 || Static43.aClass50_1.method7394(82)) && ((local634 & 0x4) == 0 || Static43.aClass50_1.method7394(81))) {
												if (local402 < 10) {
													Static412.method5512("", local402 + 1, -1, local6.anInt6973);
												} else if (local402 == 10) {
													Static443.method5872();
													@Pc(726) Class3_Sub47 local726 = method1871(local6);
													Static340.method4863(local726.anInt7683, local6, local726.method6627());
													Static261.aString59 = Static699.method9255(local6);
													if (Static261.aString59 == null) {
														Static261.aString59 = "Null";
													}
													Static96.aString130 = local6.aString93 + "<col=ffffff>";
												}
												local555 = local6.anIntArray519[local402];
												if (local6.anIntArray516 == null) {
													local6.anIntArray516 = new int[local6.aByteArray68.length];
												}
												if (local555 == 0) {
													local6.anIntArray516[local402] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray516[local402] = Static716.anInt11157 + local555;
												}
											}
										}
									} else if (local6.anIntArray516 != null) {
										local6.anIntArray516[local402] = 0;
									}
								}
							}
							if (local474) {
								Static355.method9496(local42 + local479.method3197() - local19, local47 + local479.method3196() - local24, local6);
							}
							if (Static334.aClass270_10 != null && Static334.aClass270_10 != local6 && local310 && method1871(local6).method6622()) {
								Static21.aClass270_1 = local6;
							}
							if (local6 == Static309.aClass270_9) {
								Static512.aBoolean721 = true;
								Static570.anInt8655 = local19;
								Static725.anInt11253 = local24;
							}
							if (local6.aBoolean481 || local6.anInt7042 != 0) {
								@Pc(877) Class3_Sub41 local877;
								if (local310 && Static452.anInt6919 != 0 && local6.anObjectArray18 != null) {
									local877 = new Class3_Sub41();
									local877.aBoolean397 = true;
									local877.aClass270_12 = local6;
									local877.anInt6143 = Static452.anInt6919;
									local877.anObjectArray4 = local6.anObjectArray18;
									Static501.aClass342_61.method7654(local877);
								}
								if (Static334.aClass270_10 != null) {
									local474 = false;
									local462 = false;
								} else if (Static530.aBoolean556 || local6.anInt7042 != Static308.anInt4972 && Static116.anInt2383 > 0) {
									local474 = false;
									local462 = false;
									local310 = false;
								}
								if (local6.anInt7042 != 0) {
									if (local6.anInt7042 == Static727.anInt11271 || local6.anInt7042 == Static344.anInt5515) {
										Static34.aClass270_2 = local6;
										if (Static538.aClass200_5 != null) {
											Static538.aClass200_5.method4701(local6.anInt7045, Static580.aClass3_Sub22_24.aClass21_Sub14_1.method5011(), Static153.aClass22_4);
										}
										if (local6.anInt7042 == Static727.anInt11271) {
											if (Static530.aBoolean556 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static317.method4651(Static153.aClass22_4, arg8, arg9);
											@Pc(991) Class9_Sub10 local991 = (Class9_Sub10) Static295.aClass319_5.method7195();
											while (true) {
												if (local991 == null) {
													continue label908;
												}
												if (arg10 >= local991.anInt10812 && arg10 < local991.anInt10814 && arg11 >= local991.anInt10813 && arg11 < local991.anInt10819) {
													Static205.method3103();
													Static469.method6371(local991.aClass9_Sub1_Sub1_Sub2_1);
												}
												local991 = (Class9_Sub10) Static295.aClass319_5.method7188();
											}
										}
									}
									if (local6.anInt7042 == Static673.anInt10807) {
										local524 = local6.method6017(Static153.aClass22_4);
										if (local524 == null || Static306.anInt4920 != 0 && Static306.anInt4920 != 3 || Static530.aBoolean556 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local549 = arg10 - local19;
										local555 = arg11 - local24;
										local569 = local524.anIntArray489[local555];
										if (local549 < local569 || local549 > local569 + local524.anIntArray490[local555]) {
											continue;
										}
										local549 -= local6.anInt7015 / 2;
										local555 -= local6.anInt7045 / 2;
										@Pc(1125) int local1125;
										if (Static262.anInt4081 == 4) {
											local1125 = (int) Static382.aFloat40 & 0x3FFF;
										} else {
											local1125 = (int) Static382.aFloat40 + Static194.anInt3310 & 0x3FFF;
										}
										@Pc(1137) int local1137 = Class3_Sub7_Sub17_Sub1.anIntArray549[local1125];
										@Pc(1141) int local1141 = Class3_Sub7_Sub17_Sub1.anIntArray548[local1125];
										if (Static262.anInt4081 != 4) {
											local1137 = local1137 * (Static402.anInt6239 + 256) >> 8;
											local1141 = local1141 * (Static402.anInt6239 + 256) >> 8;
										}
										@Pc(1170) int local1170 = local555 * local1137 + local549 * local1141 >> 14;
										@Pc(1180) int local1180 = local555 * local1141 - local549 * local1137 >> 14;
										@Pc(1191) int local1191;
										@Pc(1199) int local1199;
										if (Static262.anInt4081 == 4) {
											local1191 = (Static13.anInt566 >> 9) + (local1170 >> 2);
											local1199 = (Static78.anInt1842 >> 9) - (local1180 >> 2);
										} else {
											@Pc(1208) int local1208 = (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() - 1) * 256;
											local1191 = (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 - local1208 >> 9) + (local1170 >> 2);
											local1199 = (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 - local1208 >> 9) - (local1180 >> 2);
										}
										if (Static474.aBoolean505 && (Static723.anInt11214 & 0x40) != 0) {
											@Pc(1243) Class270 local1243 = Static1.method9504(Static418.anInt6410, Static216.anInt3565);
											if (local1243 == null) {
												Static443.method5872();
											} else {
												Static283.method4000(local1199, Static261.aString59, true, (long) (local6.anInt7020 << 0 | local6.anInt6973), local6.anInt7001, Static302.anInt4875, true, local1191, " ->", 19, 1L, false);
											}
											continue;
										}
										if (Static346.aClass309_6 == Static422.aClass309_8) {
											Static283.method4000(local1199, Static430.aClass257_26.method5699(Static456.anInt7118), true, 0L, -1, -1, true, local1191, "", 9, 1L, false);
										}
										Static283.method4000(local1199, Static99.aString39, true, 0L, -1, Static229.anInt3718, true, local1191, "", 17, 1L, false);
										continue;
									}
									if (local6.anInt7042 == Static308.anInt4972) {
										Static140.aClass270_6 = local6;
										if (local310) {
											Static570.aBoolean582 = true;
										}
										if (local474) {
											local402 = (int) ((double) (local42 + local479.method3197() - local19 - local6.anInt7015 / 2) * 2.0D / (double) Static327.aFloat32);
											local549 = (int) -((double) (local47 + local479.method3196() - local24 - local6.anInt7045 / 2) * 2.0D / (double) Static327.aFloat32);
											local555 = Static550.anInt8467 + local402 + Static327.anInt1084;
											local569 = Static90.anInt4562 + local549 + Static327.anInt1076;
											@Pc(1383) Class3_Sub7_Sub18 local1383 = Static145.method2459();
											if (local1383 == null) {
												continue;
											}
											@Pc(1388) int[] local1388 = new int[3];
											local1383.method6942(local1388, local555, local569);
											if (local1388 != null) {
												if (Static43.aClass50_1.method7394(82) && Static432.anInt6579 > 0) {
													Static688.method9110(local1388[0], local1388[2], local1388[1]);
													continue;
												}
												Static685.aBoolean393 = true;
												Static605.anInt9181 = local1388[0];
												Static263.anInt4103 = local1388[1];
												Static362.anInt5707 = local1388[2];
											}
											Static116.anInt2383 = 1;
											Static166.aBoolean191 = false;
											Static323.anInt5198 = Static334.aClass18_1.method4192();
											Static720.anInt11175 = Static334.aClass18_1.method4196();
											continue;
										}
										if (local462 && Static116.anInt2383 > 0) {
											if (Static116.anInt2383 == 1 && (Static323.anInt5198 != Static334.aClass18_1.method4192() || Static720.anInt11175 != Static334.aClass18_1.method4196())) {
												Static379.anInt5868 = Static550.anInt8467;
												Static96.anInt10775 = Static90.anInt4562;
												Static116.anInt2383 = 2;
											}
											if (Static116.anInt2383 == 2) {
												Static166.aBoolean191 = true;
												Static103.method2078(Static379.anInt5868 + (int) ((double) (Static323.anInt5198 - Static334.aClass18_1.method4192()) * 2.0D / (double) Static327.aFloat31));
												Static653.method8577(Static96.anInt10775 - (int) ((double) (Static720.anInt11175 - Static334.aClass18_1.method4196()) * 2.0D / (double) Static327.aFloat31));
											}
											continue;
										}
										if (Static116.anInt2383 > 0 && !Static166.aBoolean191) {
											if ((Static639.anInt9892 == 1 || Static535.method9060()) && Static716.anInt11158 > 2) {
												Static498.method6804(Static323.anInt5198, Static720.anInt11175);
											} else if (Static557.method7275()) {
												Static498.method6804(Static323.anInt5198, Static720.anInt11175);
											}
										}
										Static116.anInt2383 = 0;
										continue;
									}
									if (local6.anInt7042 == Static592.anInt9022) {
										if (local462) {
											Static298.method4189(local47 + Static334.aClass18_1.method4196() - local24, local6.anInt7045, local42 + Static334.aClass18_1.method4192() - local19, local6.anInt7015);
										}
										continue;
									}
									if (local6.anInt7042 == Static210.anInt3464) {
										Static262.method3720(local24, local19, local6);
										continue;
									}
								}
								if (!local6.aBoolean480 && local474) {
									local6.aBoolean480 = true;
									if (local6.anObjectArray21 != null) {
										local877 = new Class3_Sub41();
										local877.aBoolean397 = true;
										local877.aClass270_12 = local6;
										local877.anInt6145 = local42 + local479.method3197() - local19;
										local877.anInt6143 = local47 + local479.method3196() - local24;
										local877.anObjectArray4 = local6.anObjectArray21;
										Static501.aClass342_61.method7654(local877);
									}
								}
								if (local6.aBoolean480 && local462 && local6.anObjectArray26 != null) {
									local877 = new Class3_Sub41();
									local877.aBoolean397 = true;
									local877.aClass270_12 = local6;
									local877.anInt6145 = local42 + Static334.aClass18_1.method4192() - local19;
									local877.anInt6143 = local47 + Static334.aClass18_1.method4196() - local24;
									local877.anObjectArray4 = local6.anObjectArray26;
									Static501.aClass342_61.method7654(local877);
								}
								if (local6.aBoolean480 && !local462) {
									local6.aBoolean480 = false;
									if (local6.anObjectArray28 != null) {
										local877 = new Class3_Sub41();
										local877.aBoolean397 = true;
										local877.aClass270_12 = local6;
										local877.anInt6145 = local42 + Static334.aClass18_1.method4192() - local19;
										local877.anInt6143 = local47 + Static334.aClass18_1.method4196() - local24;
										local877.anObjectArray4 = local6.anObjectArray28;
										Static408.aClass342_48.method7654(local877);
									}
								}
								if (local462 && local6.anObjectArray9 != null) {
									local877 = new Class3_Sub41();
									local877.aBoolean397 = true;
									local877.aClass270_12 = local6;
									local877.anInt6145 = local42 + Static334.aClass18_1.method4192() - local19;
									local877.anInt6143 = local47 + Static334.aClass18_1.method4196() - local24;
									local877.anObjectArray4 = local6.anObjectArray9;
									Static501.aClass342_61.method7654(local877);
								}
								if (!local6.aBoolean477 && local310) {
									local6.aBoolean477 = true;
									if (local6.anObjectArray35 != null) {
										local877 = new Class3_Sub41();
										local877.aBoolean397 = true;
										local877.aClass270_12 = local6;
										local877.anInt6145 = local42 + Static334.aClass18_1.method4192() - local19;
										local877.anInt6143 = local47 + Static334.aClass18_1.method4196() - local24;
										local877.anObjectArray4 = local6.anObjectArray35;
										Static501.aClass342_61.method7654(local877);
									}
								}
								if (local6.aBoolean477 && local310 && local6.anObjectArray27 != null) {
									local877 = new Class3_Sub41();
									local877.aBoolean397 = true;
									local877.aClass270_12 = local6;
									local877.anInt6145 = local42 + Static334.aClass18_1.method4192() - local19;
									local877.anInt6143 = local47 + Static334.aClass18_1.method4196() - local24;
									local877.anObjectArray4 = local6.anObjectArray27;
									Static501.aClass342_61.method7654(local877);
								}
								if (local6.aBoolean477 && !local310) {
									local6.aBoolean477 = false;
									if (local6.anObjectArray15 != null) {
										local877 = new Class3_Sub41();
										local877.aBoolean397 = true;
										local877.aClass270_12 = local6;
										local877.anInt6145 = local42 + Static334.aClass18_1.method4192() - local19;
										local877.anInt6143 = local47 + Static334.aClass18_1.method4196() - local24;
										local877.anObjectArray4 = local6.anObjectArray15;
										Static408.aClass342_48.method7654(local877);
									}
								}
								if (local6.anObjectArray19 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray19;
									Static477.aClass342_58.method7654(local877);
								}
								@Pc(2022) Class3_Sub41 local2022;
								if (local6.anObjectArray25 != null && Static420.anInt6421 > local6.anInt6978) {
									if (local6.anIntArray520 == null || Static420.anInt6421 - local6.anInt6978 > 32) {
										local877 = new Class3_Sub41();
										local877.aClass270_12 = local6;
										local877.anObjectArray4 = local6.anObjectArray25;
										Static501.aClass342_61.method7654(local877);
									} else {
										label768: for (local402 = local6.anInt6978; local402 < Static420.anInt6421; local402++) {
											local549 = Static521.anIntArray591[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray520.length; local555++) {
												if (local6.anIntArray520[local555] == local549) {
													local2022 = new Class3_Sub41();
													local2022.aClass270_12 = local6;
													local2022.anObjectArray4 = local6.anObjectArray25;
													Static501.aClass342_61.method7654(local2022);
													break label768;
												}
											}
										}
									}
									local6.anInt6978 = Static420.anInt6421;
								}
								if (local6.anObjectArray34 != null && Static313.anInt5064 > local6.anInt6995) {
									if (local6.anIntArray512 == null || Static313.anInt5064 - local6.anInt6995 > 32) {
										local877 = new Class3_Sub41();
										local877.aClass270_12 = local6;
										local877.anObjectArray4 = local6.anObjectArray34;
										Static501.aClass342_61.method7654(local877);
									} else {
										label744: for (local402 = local6.anInt6995; local402 < Static313.anInt5064; local402++) {
											local549 = Static706.anIntArray786[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray512.length; local555++) {
												if (local6.anIntArray512[local555] == local549) {
													local2022 = new Class3_Sub41();
													local2022.aClass270_12 = local6;
													local2022.anObjectArray4 = local6.anObjectArray34;
													Static501.aClass342_61.method7654(local2022);
													break label744;
												}
											}
										}
									}
									local6.anInt6995 = Static313.anInt5064;
								}
								if (local6.anObjectArray11 != null && Static120.anInt2463 > local6.anInt7012) {
									if (local6.anIntArray514 == null || Static120.anInt2463 - local6.anInt7012 > 32) {
										local877 = new Class3_Sub41();
										local877.aClass270_12 = local6;
										local877.anObjectArray4 = local6.anObjectArray11;
										Static501.aClass342_61.method7654(local877);
									} else {
										label720: for (local402 = local6.anInt7012; local402 < Static120.anInt2463; local402++) {
											local549 = Static141.anIntArray163[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray514.length; local555++) {
												if (local6.anIntArray514[local555] == local549) {
													local2022 = new Class3_Sub41();
													local2022.aClass270_12 = local6;
													local2022.anObjectArray4 = local6.anObjectArray11;
													Static501.aClass342_61.method7654(local2022);
													break label720;
												}
											}
										}
									}
									local6.anInt7012 = Static120.anInt2463;
								}
								if (local6.anObjectArray5 != null && Static428.anInt6544 > local6.anInt6985) {
									if (local6.anIntArray518 == null || Static428.anInt6544 - local6.anInt6985 > 32) {
										local877 = new Class3_Sub41();
										local877.aClass270_12 = local6;
										local877.anObjectArray4 = local6.anObjectArray5;
										Static501.aClass342_61.method7654(local877);
									} else {
										label696: for (local402 = local6.anInt6985; local402 < Static428.anInt6544; local402++) {
											local549 = Static247.anIntArray287[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray518.length; local555++) {
												if (local6.anIntArray518[local555] == local549) {
													local2022 = new Class3_Sub41();
													local2022.aClass270_12 = local6;
													local2022.anObjectArray4 = local6.anObjectArray5;
													Static501.aClass342_61.method7654(local2022);
													break label696;
												}
											}
										}
									}
									local6.anInt6985 = Static428.anInt6544;
								}
								if (local6.anObjectArray29 != null && Static533.anInt8307 > local6.anInt7010) {
									if (local6.anIntArray515 == null || Static533.anInt8307 - local6.anInt7010 > 32) {
										local877 = new Class3_Sub41();
										local877.aClass270_12 = local6;
										local877.anObjectArray4 = local6.anObjectArray29;
										Static501.aClass342_61.method7654(local877);
									} else {
										label672: for (local402 = local6.anInt7010; local402 < Static533.anInt8307; local402++) {
											local549 = Static472.anIntArray552[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray515.length; local555++) {
												if (local6.anIntArray515[local555] == local549) {
													local2022 = new Class3_Sub41();
													local2022.aClass270_12 = local6;
													local2022.anObjectArray4 = local6.anObjectArray29;
													Static501.aClass342_61.method7654(local2022);
													break label672;
												}
											}
										}
									}
									local6.anInt7010 = Static533.anInt8307;
								}
								if (local6.anObjectArray14 != null && Static35.anInt1185 > local6.anInt6991) {
									if (local6.anIntArray517 == null || Static35.anInt1185 - local6.anInt6991 > 32) {
										local877 = new Class3_Sub41();
										local877.aClass270_12 = local6;
										local877.anObjectArray4 = local6.anObjectArray14;
										Static501.aClass342_61.method7654(local877);
									} else {
										label648: for (local402 = local6.anInt6991; local402 < Static35.anInt1185; local402++) {
											local549 = Static556.anIntArray620[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray517.length; local555++) {
												if (local6.anIntArray517[local555] == local549) {
													local2022 = new Class3_Sub41();
													local2022.aClass270_12 = local6;
													local2022.anObjectArray4 = local6.anObjectArray14;
													Static501.aClass342_61.method7654(local2022);
													break label648;
												}
											}
										}
									}
									local6.anInt6991 = Static35.anInt1185;
								}
								if (Static671.anInt10587 > local6.anInt6986 && local6.anObjectArray17 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray17;
									Static501.aClass342_61.method7654(local877);
								}
								if (Static507.anInt8071 > local6.anInt6986 && local6.anObjectArray32 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray32;
									Static501.aClass342_61.method7654(local877);
								}
								if (Static324.anInt5254 > local6.anInt6986 && local6.anObjectArray16 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray16;
									Static501.aClass342_61.method7654(local877);
								}
								if (Static281.anInt4323 > local6.anInt6986 && local6.anObjectArray12 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray12;
									Static501.aClass342_61.method7654(local877);
								}
								if (Static503.anInt8018 > local6.anInt6986 && local6.anObjectArray8 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray8;
									Static501.aClass342_61.method7654(local877);
								}
								if (Static704.anInt10983 > local6.anInt6986 && local6.anObjectArray22 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray22;
									Static501.aClass342_61.method7654(local877);
								}
								if (Static365.anInt5729 > local6.anInt6986 && local6.anObjectArray10 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray10;
									Static501.aClass342_61.method7654(local877);
								}
								local6.anInt6986 = Static475.anInt7494;
								if (local6.anObjectArray37 != null) {
									for (local402 = 0; local402 < Static303.anInt4880; local402++) {
										@Pc(2682) Class3_Sub41 local2682 = new Class3_Sub41();
										local2682.aClass270_12 = local6;
										local2682.anInt6140 = Static708.anInterface26Array2[local402].method5024();
										local2682.anInt6148 = Static708.anInterface26Array2[local402].method5026();
										local2682.anObjectArray4 = local6.anObjectArray37;
										Static501.aClass342_61.method7654(local2682);
									}
								}
								if (Static261.aBoolean260 && local6.anObjectArray36 != null) {
									local877 = new Class3_Sub41();
									local877.aClass270_12 = local6;
									local877.anObjectArray4 = local6.anObjectArray36;
									Static501.aClass342_61.method7654(local877);
								}
							}
							if (local6.anInt7008 == 5 && local6.anInt6962 != -1) {
								local6.method6026(Class3_Sub33_Sub3.lb, Static499.aClass297_1).method4701(local6.anInt7045, Static580.aClass3_Sub22_24.aClass21_Sub14_1.method5011(), Static153.aClass22_4);
							}
							Static112.method2178(local6);
							if (local6.anInt7008 == 0) {
								method1869(arg0, local6.anInt6973, local30, local32, local34, local36, local19 - local6.anInt6982, local24 - local6.lb, arg8, arg9, arg10, arg11);
								if (local6.aClass270Array2 != null) {
									method1869(local6.aClass270Array2, local6.anInt6973, local30, local32, local34, local36, local19 - local6.anInt6982, local24 - local6.lb, arg8, arg9, arg10, arg11);
								}
								@Pc(2824) Class3_Sub20 local2824 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local6.anInt6973);
								if (local2824 != null) {
									if (Static346.aClass309_6 == Static326.aClass309_5 && local2824.anInt2491 == 0 && !Static530.aBoolean556 && local310 && !Static571.aBoolean583) {
										Static205.method3103();
									}
									Static628.method8260(arg11, local2824.anInt2493, local36, arg9, local34, arg8, local19, local24, arg10, local32, local30);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static112.method2178(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!nt;)Lclient!pc;")
	public static Class3_Sub47 method1871(@OriginalArg(0) Class270 arg0) {
		@Pc(13) Class3_Sub47 local13 = (Class3_Sub47) Static407.aClass313_32.method7104(((long) arg0.anInt6973 << 32) + (long) arg0.anInt7020);
		return local13 == null ? arg0.aClass3_Sub47_3 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!nt;)Lclient!nt;")
	public static Class270 method1873(@OriginalArg(0) Class270 arg0) {
		@Pc(4) int local4 = method1871(arg0).method6624();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static254.method3544(arg0.anInt7050);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1875() {
		Static94.anInt2117 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static28.anInt1087; local3++) {
			@Pc(14) Class9_Sub1_Sub1_Sub2_Sub2 local14 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local3])).aClass9_Sub1_Sub1_Sub2_Sub2_2;
			if (local14.aBoolean591 && local14.method7475() != -1) {
				@Pc(34) int local34 = (local14.method7485() - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt10694 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt10695 - local34 >> 9;
				@Pc(55) Class9_Sub1_Sub1_Sub2 local55 = Static451.method5966(local48, local41, local14.aByte139);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt8783;
					if (local55 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
						local60 += 2048;
					}
					if (local55.anInt8762 == 0 && local55.method7475() != -1) {
						Static83.anIntArray793[Static94.anInt2117] = local60;
						Static308.anIntArray368[Static94.anInt2117] = local60;
						Static94.anInt2117++;
						local55.anInt8762++;
					}
					Static83.anIntArray793[Static94.anInt2117] = local60;
					Static308.anIntArray368[Static94.anInt2117] = local14.anInt8783 + 2048;
					Static94.anInt2117++;
					local55.anInt8762++;
				}
			}
		}
		Static233.method3388(0, Static94.anInt2117 - 1, Static308.anIntArray368, Static83.anIntArray793);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1876() {
		for (@Pc(1) int local1 = 0; local1 < Static497.anInt7926; local1++) {
			@Pc(6) int[] local6 = Static672.anIntArrayArray64[local1];
			for (@Pc(8) int local8 = 0; local8 < Static646.anInt9979; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
