import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
	public static int anInt6127;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "[Lclient!nc;")
	public static Class106[] aClass106Array4;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Lclient!dp;")
	public static Class53 aClass53_152;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "Lclient!dp;")
	public static Class53 aClass53_153;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public static int anInt6128 = 0;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Z")
	public static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[BILclient!ja;[[BIBIII[[BI[ZLclient!ml;Lclient!sb;)V")
	public static void method5556(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) Class136 arg11, @OriginalArg(13) Class181 arg12) {
		@Pc(47) int local47;
		if (arg11 != null && arg12 != null || arg12 != null && arg9 == 12 || arg11 != null && arg9 == 0) {
			@Pc(31) boolean[] local31 = arg11 != null && arg11.aBoolean282 ? Static346.aBooleanArrayArray8[arg9] : Static289.aBooleanArrayArray7[arg9];
			@Pc(55) Class136 local55;
			@Pc(72) byte local72;
			@Pc(88) int local88;
			@Pc(93) int local93;
			if (arg5 > 0) {
				if (arg7 > 0) {
					local47 = arg8[arg7 - 1][arg5 - 1] & 0xFF;
					if (local47 > 0) {
						local55 = Static211.method3756(local47 - 1);
						if (local55.anInt3679 != -1 && local55.aBoolean282) {
							local72 = arg3[arg7 - 1][arg5 - 1];
							local88 = arg0[arg7 - 1][arg5 - 1] * 2 + 4 & 0x7;
							local93 = Static184.method3479(local55, arg2);
							if (Static66.aBooleanArrayArray4[local72][local88]) {
								Static17.anIntArray705[0] = local55.anInt3679;
								Static319.anIntArray668[0] = local93;
								Static229.anIntArray719[0] = arg2.method2988() ? local55.anInt3688 : local55.anInt3671;
								Static215.anIntArray462[0] = local55.anInt3674;
								Static143.anIntArray350[0] = local55.anInt3675;
								Static281.anIntArray571[0] = 256;
							}
						}
					}
				}
				if (arg6 - 1 > arg7) {
					local47 = arg8[arg7 + 1][arg5 - 1] & 0xFF;
					if (local47 > 0) {
						local55 = Static211.method3756(local47 - 1);
						if (local55.anInt3679 != -1 && local55.aBoolean282) {
							local72 = arg3[arg7 + 1][arg5 - 1];
							local88 = arg0[arg7 + 1][arg5 - 1] * 2 + 6 & 0x7;
							local93 = Static184.method3479(local55, arg2);
							if (Static66.aBooleanArrayArray4[local72][local88]) {
								Static17.anIntArray705[2] = local55.anInt3679;
								Static319.anIntArray668[2] = local93;
								Static229.anIntArray719[2] = arg2.method2988() ? local55.anInt3688 : local55.anInt3671;
								Static215.anIntArray462[2] = local55.anInt3674;
								Static143.anIntArray350[2] = local55.anInt3675;
								Static281.anIntArray571[2] = 512;
							}
						}
					}
				}
			}
			if (arg4 - 1 > arg5) {
				if (arg7 > 0) {
					local47 = arg8[arg7 - 1][arg5 + 1] & 0xFF;
					if (local47 > 0) {
						local55 = Static211.method3756(local47 - 1);
						if (local55.anInt3679 != -1 && local55.aBoolean282) {
							local72 = arg3[arg7 - 1][arg5 + 1];
							local88 = arg0[arg7 - 1][arg5 + 1] * 2 + 2 & 0x7;
							local93 = Static184.method3479(local55, arg2);
							if (Static66.aBooleanArrayArray4[local72][local88]) {
								Static17.anIntArray705[6] = local55.anInt3679;
								Static319.anIntArray668[6] = local93;
								Static229.anIntArray719[6] = arg2.method2988() ? local55.anInt3688 : local55.anInt3671;
								Static215.anIntArray462[6] = local55.anInt3674;
								Static143.anIntArray350[6] = local55.anInt3675;
								Static281.anIntArray571[6] = 64;
							}
						}
					}
				}
				if (arg7 < arg6 - 1) {
					local47 = arg8[arg7 + 1][arg5 + 1] & 0xFF;
					if (local47 > 0) {
						local55 = Static211.method3756(local47 - 1);
						if (local55.anInt3679 != -1 && local55.aBoolean282) {
							local72 = arg3[arg7 + 1][arg5 + 1];
							local88 = arg0[arg7 + 1][arg5 + 1] * 2 & 0x7;
							local93 = Static184.method3479(local55, arg2);
							if (Static66.aBooleanArrayArray4[local72][local88]) {
								Static17.anIntArray705[4] = local55.anInt3679;
								Static319.anIntArray668[4] = local93;
								Static229.anIntArray719[4] = arg2.method2988() ? local55.anInt3688 : local55.anInt3671;
								Static215.anIntArray462[4] = local55.anInt3674;
								Static143.anIntArray350[4] = local55.anInt3675;
								Static281.anIntArray571[4] = 128;
							}
						}
					}
				}
			}
			@Pc(522) int local522;
			@Pc(527) int local527;
			@Pc(529) int local529;
			@Pc(511) byte local511;
			if (arg5 > 0) {
				local47 = arg8[arg7][arg5 - 1] & 0xFF;
				if (local47 > 0) {
					local55 = Static211.method3756(local47 - 1);
					if (local55.anInt3679 != -1) {
						local72 = arg3[arg7][arg5 - 1];
						local511 = arg0[arg7][arg5 - 1];
						if (local55.aBoolean282) {
							local93 = 2;
							local522 = local511 * 2 + 4;
							local527 = Static184.method3479(local55, arg2);
							for (local529 = 0; local529 < 3; local529++) {
								local93 &= 0x7;
								local522 &= 0x7;
								if (Static66.aBooleanArrayArray4[local72][local522] && Static143.anIntArray350[local93] <= local55.anInt3675) {
									Static17.anIntArray705[local93] = local55.anInt3679;
									Static319.anIntArray668[local93] = local527;
									Static229.anIntArray719[local93] = arg2.method2988() ? local55.anInt3688 : local55.anInt3671;
									Static215.anIntArray462[local93] = local55.anInt3674;
									if (local55.anInt3675 == Static143.anIntArray350[local93]) {
										Static281.anIntArray571[local93] |= 0x20;
									} else {
										Static281.anIntArray571[local93] = 32;
									}
									Static143.anIntArray350[local93] = local55.anInt3675;
								}
								local522++;
								local93--;
							}
							if (!local31[arg1 & 0x3]) {
								arg10[0] = Static346.aBooleanArrayArray8[local72][local511 + 2 & 0x3];
							}
						} else if (!local31[arg1 & 0x3]) {
							arg10[0] = Static289.aBooleanArrayArray7[local72][local511 + 2 & 0x3];
						}
					}
				}
			}
			if (arg5 < arg4 - 1) {
				local47 = arg8[arg7][arg5 + 1] & 0xFF;
				if (local47 > 0) {
					local55 = Static211.method3756(local47 - 1);
					if (local55.anInt3679 != -1) {
						local72 = arg3[arg7][arg5 + 1];
						local511 = arg0[arg7][arg5 + 1];
						if (local55.aBoolean282) {
							local93 = 4;
							local522 = local511 * 2 + 2;
							local527 = Static184.method3479(local55, arg2);
							for (local529 = 0; local529 < 3; local529++) {
								local522 &= 0x7;
								local93 &= 0x7;
								if (Static66.aBooleanArrayArray4[local72][local522] && local55.anInt3675 >= Static143.anIntArray350[local93]) {
									Static17.anIntArray705[local93] = local55.anInt3679;
									Static319.anIntArray668[local93] = local527;
									Static229.anIntArray719[local93] = arg2.method2988() ? local55.anInt3688 : local55.anInt3671;
									Static215.anIntArray462[local93] = local55.anInt3674;
									if (local55.anInt3675 == Static143.anIntArray350[local93]) {
										Static281.anIntArray571[local93] |= 0x10;
									} else {
										Static281.anIntArray571[local93] = 16;
									}
									Static143.anIntArray350[local93] = local55.anInt3675;
								}
								local93++;
								local522--;
							}
							if (!local31[arg1 + 2 & 0x3]) {
								arg10[2] = Static346.aBooleanArrayArray8[local72][local511 & 0x3];
							}
						} else if (!local31[arg1 + 2 & 0x3]) {
							arg10[2] = Static289.aBooleanArrayArray7[local72][local511 & 0x3];
						}
					}
				}
			}
			if (arg7 > 0) {
				local47 = arg8[arg7 - 1][arg5] & 0xFF;
				if (local47 > 0) {
					local55 = Static211.method3756(local47 - 1);
					if (local55.anInt3679 != -1) {
						local72 = arg3[arg7 - 1][arg5];
						local511 = arg0[arg7 - 1][arg5];
						if (local55.aBoolean282) {
							local93 = 6;
							local522 = local511 * 2 + 4;
							local527 = Static184.method3479(local55, arg2);
							for (local529 = 0; local529 < 3; local529++) {
								local93 &= 0x7;
								local522 &= 0x7;
								if (Static66.aBooleanArrayArray4[local72][local522] && local55.anInt3675 >= Static143.anIntArray350[local93]) {
									Static17.anIntArray705[local93] = local55.anInt3679;
									Static319.anIntArray668[local93] = local527;
									Static229.anIntArray719[local93] = arg2.method2988() ? local55.anInt3688 : local55.anInt3671;
									Static215.anIntArray462[local93] = local55.anInt3674;
									if (Static143.anIntArray350[local93] == local55.anInt3675) {
										Static281.anIntArray571[local93] |= 0x8;
									} else {
										Static281.anIntArray571[local93] = 8;
									}
									Static143.anIntArray350[local93] = local55.anInt3675;
								}
								local93++;
								local522--;
							}
							if (!local31[arg1 + 3 & 0x3]) {
								arg10[3] = Static346.aBooleanArrayArray8[local72][local511 + 1 & 0x3];
							}
						} else if (!local31[arg1 + 3 & 0x3]) {
							arg10[3] = Static289.aBooleanArrayArray7[local72][local511 + 1 & 0x3];
						}
					}
				}
			}
			if (arg6 - 1 > arg7) {
				local47 = arg8[arg7 + 1][arg5] & 0xFF;
				if (local47 > 0) {
					local55 = Static211.method3756(local47 - 1);
					if (local55.anInt3679 != -1) {
						local72 = arg3[arg7 + 1][arg5];
						local511 = arg0[arg7 + 1][arg5];
						if (local55.aBoolean282) {
							local93 = 4;
							local522 = local511 * 2 + 6;
							local527 = Static184.method3479(local55, arg2);
							for (local529 = 0; local529 < 3; local529++) {
								local93 &= 0x7;
								local522 &= 0x7;
								if (Static66.aBooleanArrayArray4[local72][local522] && Static143.anIntArray350[local93] <= local55.anInt3675) {
									Static17.anIntArray705[local93] = local55.anInt3679;
									Static319.anIntArray668[local93] = local527;
									Static229.anIntArray719[local93] = arg2.method2988() ? local55.anInt3688 : local55.anInt3671;
									Static215.anIntArray462[local93] = local55.anInt3674;
									if (local55.anInt3675 == Static143.anIntArray350[local93]) {
										Static281.anIntArray571[local93] |= 0x4;
									} else {
										Static281.anIntArray571[local93] = 4;
									}
									Static143.anIntArray350[local93] = local55.anInt3675;
								}
								local522++;
								local93--;
							}
							if (!local31[arg1 + 1 & 0x3]) {
								arg10[1] = Static346.aBooleanArrayArray8[local72][local511 + 3 & 0x3];
							}
						} else if (!local31[arg1 + 1 & 0x3]) {
							arg10[1] = Static289.aBooleanArrayArray7[local72][local511 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		@Pc(1229) int local1229 = Static184.method3479(arg11, arg2);
		if (!arg11.aBoolean282) {
			return;
		}
		for (local47 = 0; local47 < 8; local47++) {
			@Pc(1244) int local1244 = local47 - arg1 * 2 & 0x7;
			if (Static66.aBooleanArrayArray4[arg9][local47] && arg11.anInt3675 >= Static143.anIntArray350[local1244]) {
				Static17.anIntArray705[local1244] = arg11.anInt3679;
				Static319.anIntArray668[local1244] = local1229;
				Static229.anIntArray719[local1244] = arg2.method2988() ? arg11.anInt3688 : arg11.anInt3671;
				Static215.anIntArray462[local1244] = arg11.anInt3674;
				if (Static143.anIntArray350[local1244] == arg11.anInt3675) {
					Static281.anIntArray571[local1244] |= 0x2;
				} else {
					Static281.anIntArray571[local1244] = 2;
				}
				Static143.anIntArray350[local1244] = arg11.anInt3675;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!rn;Lclient!mb;IIIBLclient!ja;II)V")
	public static void method5557(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) Class165 local18 = Static345.method5701(arg6);
		if (local18 == null || !local18.aBoolean329 || !local18.method4325()) {
			return;
		}
		@Pc(37) int local37;
		if (local18.anIntArray509 != null) {
			@Pc(35) int[] local35 = new int[local18.anIntArray509.length];
			@Pc(51) int local51;
			for (local37 = 0; local37 < local35.length / 2; local37++) {
				if (Static334.anInt6112 == 4) {
					local51 = (int) Static117.aFloat58 & 0x3FFF;
				} else {
					local51 = Static345.anInt6260 + (int) Static117.aFloat58 & 0x3FFF;
				}
				@Pc(62) int local62 = Class207.anIntArray697[local51];
				@Pc(66) int local66 = Class207.anIntArray698[local51];
				if (Static334.anInt6112 != 4) {
					local62 = local62 * 256 / (Static279.anInt5302 + 256);
					local66 = local66 * 256 / (Static279.anInt5302 + 256);
				}
				local35[local37 * 2] = ((arg4 + local18.anIntArray509[local37 * 2] * 4) * local66 + (local18.anIntArray509[local37 * 2 + 1] * 4 + arg3) * local62 >> 15) + arg1.anInt3507 / 2 + arg7;
				local35[local37 * 2 + 1] = arg1.anInt3503 / 2 + arg2 - ((local18.anIntArray509[local37 * 2 + 1] * 4 + arg3) * local66 - local62 * (local18.anIntArray509[local37 * 2] * 4 + arg4) >> 15);
			}
			Static123.method2435(arg5, local35, local18.anInt4696, arg1.anIntArray408, arg1.anIntArray405);
			for (local51 = 0; local51 < local35.length / 2 - 1; local51++) {
				arg5.method3000(local35[local51 * 2], local35[local51 * 2 + 1], local35[(local51 + 1) * 2], local35[local51 * 2 + 1 + 2], local18.anInt4687, arg0, arg7, arg2);
			}
			arg5.method3000(local35[local35.length - 2], local35[local35.length - 1], local35[0], local35[1], local18.anInt4687, arg0, arg7, arg2);
		}
		@Pc(265) Class40 local265 = null;
		if (local18.anInt4689 != -1) {
			local265 = local18.method4329(arg5, false);
			if (local265 != null) {
				Static5.method96(arg1, local265, arg4, arg2, arg7, arg3, arg0);
			}
		}
		if (local18.aString196 == null) {
			return;
		}
		local37 = 0;
		if (local265 != null) {
			local37 = local265.method5075();
		}
		@Pc(299) Class30 local299 = Static350.aClass30_6;
		@Pc(301) Class26 local301 = Static139.aClass26_5;
		if (local18.anInt4694 == 1) {
			local299 = Static298.aClass30_4;
			local301 = Static38.aClass26_3;
		}
		if (local18.anInt4694 == 2) {
			local299 = Static309.aClass30_5;
			local301 = Static220.aClass26_6;
		}
		Static209.method3738(local37, arg3, arg2, arg4, local301, local18.anInt4698, local299, local18.aString196, arg0, arg7, arg1);
		return;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lclient!ga;")
	public static Class79 method5558(@OriginalArg(1) int arg0) {
		@Pc(12) Class79 local12 = (Class79) Static223.aClass70_74.method1396((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static345.aClass53_158.method1033(arg0, 29);
		local12 = new Class79();
		if (local22 != null) {
			local12.method1712(arg0, new Class6_Sub10(local22));
		}
		Static223.aClass70_74.method1406(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V")
	public static void method5559(@OriginalArg(0) int arg0) {
		@Pc(15) Class6_Sub38 local15 = (Class6_Sub38) Static297.aClass108_31.method2900((long) arg0);
		if (local15 != null) {
			local15.method5756();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
	public static void method5561(@OriginalArg(0) boolean arg0) {
		Static131.aClass6_Sub10_Sub1_2.method2886(202);
		for (@Pc(18) Class6_Sub30 local18 = (Class6_Sub30) Static197.aClass108_30.method2903(); local18 != null; local18 = (Class6_Sub30) Static197.aClass108_30.method2905()) {
			if (!local18.method5757()) {
				local18 = (Class6_Sub30) Static197.aClass108_30.method2903();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt4314 == 0) {
				Static103.method2104(true, arg0, local18);
			}
		}
		if (Static109.aClass132_7 != null) {
			Static298.method5108(Static109.aClass132_7);
			Static109.aClass132_7 = null;
		}
	}
}
