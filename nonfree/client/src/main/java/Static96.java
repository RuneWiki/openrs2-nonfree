import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "[Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4[] aClass5_Sub2_Sub6_Sub4Array4;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Lclient!we;")
	public static Class77 aClass77_3;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public static int anInt2617 = 0;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lclient!kc;")
	public static Class38[] aClass38Array1 = new Class38[50];

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1100 = Static63.method1251(" @whi@(X");

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1101 = Static63.method1251("System)2Update in: ");

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1104 = Static63.method1251("Your account is already logged in)3");

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1102 = aClass45_1104;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1103 = Static63.method1251("l");

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1105 = Static63.method1251("welle2:");

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!ca;")
	public static Class10 aClass10_11 = new Class10();

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public static int anInt2623 = 0;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1112 = Static63.method1251("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1106 = aClass45_1112;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1107 = Static63.method1251("redstone2");

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "[I")
	public static int[] anIntArray396 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1108 = Static63.method1251("Please wait)3)3)3");

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1109 = Static63.method1251("compass");

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1110 = aClass45_1108;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1111 = aClass45_1108;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!i;I[Lclient!jc;)V")
	public static void method1795(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class37[] arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static48.aByteArrayArrayArray3[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static48.aByteArrayArrayArray3[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg1[local30].method1122(local15, local11);
						}
					}
				}
			}
		}
		Static54.anInt1638 += (int) (Math.random() * 5.0D) - 2;
		Static73.anInt2170 += (int) (Math.random() * 5.0D) - 2;
		if (Static73.anInt2170 < -8) {
			Static73.anInt2170 = -8;
		}
		if (Static73.anInt2170 > 8) {
			Static73.anInt2170 = 8;
		}
		if (Static54.anInt1638 < -16) {
			Static54.anInt1638 = -16;
		}
		if (Static54.anInt1638 > 16) {
			Static54.anInt1638 = 16;
		}
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(160) int local160;
		@Pc(181) int local181;
		@Pc(194) int local194;
		@Pc(204) int local204;
		@Pc(198) int local198;
		@Pc(210) int local210;
		@Pc(226) int local226;
		@Pc(277) int local277;
		@Pc(498) int local498;
		@Pc(537) int local537;
		@Pc(638) int local638;
		@Pc(648) int local648;
		@Pc(666) int local666;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(122) byte[][] local122 = Static51.aByteArrayArrayArray4[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local132 = local30 * 768 >> 8;
			for (local134 = 1; local134 < 103; local134++) {
				for (local138 = 1; local138 < 103; local138++) {
					local160 = Static40.anIntArrayArrayArray2[local11][local138 + 1][local134] - Static40.anIntArrayArrayArray2[local11][local138 - 1][local134];
					local181 = Static40.anIntArrayArrayArray2[local11][local138][local134 + 1] - Static40.anIntArrayArrayArray2[local11][local138][local134 - 1];
					local194 = (int) Math.sqrt((double) (local181 * local181 + local160 * local160 + 65536));
					local198 = 65536 / local194;
					local204 = (local160 << 8) / local194;
					local210 = (local181 << 8) / local194;
					local226 = (local210 * -50 + local198 * -10 + local204 * -50) / local132 + 96;
					local277 = (local122[local138][local134] >> 1) + ((local122[local138 - 1][local134] >> 2) + (local122[local138 + 1][local134] >> 3)) + (local122[local138][local134 + -1] >> 2) + (local122[local138][local134 + 1] >> 3);
					Static52.anIntArrayArray31[local138][local134] = local226 - local277;
				}
			}
			for (local138 = 0; local138 < 104; local138++) {
				Static2.anIntArray6[local138] = 0;
				Static112.anIntArray449[local138] = 0;
				Static98.anIntArray402[local138] = 0;
				Static34.anIntArray159[local138] = 0;
				Static73.anIntArray307[local138] = 0;
			}
			for (local160 = -5; local160 < 109; local160++) {
				for (local181 = 0; local181 < 104; local181++) {
					local194 = local160 + 5;
					@Pc(394) int local394;
					if (local194 >= 0 && local194 < 104) {
						local204 = Static112.aByteArrayArrayArray8[local11][local194][local181] & 0xFF;
						if (local204 > 0) {
							@Pc(358) Class5_Sub2_Sub5 local358 = Static13.method265(local204 - 1);
							Static2.anIntArray6[local181] += local358.anInt621;
							Static112.anIntArray449[local181] += local358.anInt633;
							Static98.anIntArray402[local181] += local358.anInt635;
							Static34.anIntArray159[local181] += local358.anInt623;
							local394 = Static73.anIntArray307[local181]++;
						}
					}
					local204 = local160 - 5;
					if (local204 >= 0 && local204 < 104) {
						local198 = Static112.aByteArrayArrayArray8[local11][local204][local181] & 0xFF;
						if (local198 > 0) {
							@Pc(427) Class5_Sub2_Sub5 local427 = Static13.method265(local198 - 1);
							Static2.anIntArray6[local181] -= local427.anInt621;
							Static112.anIntArray449[local181] -= local427.anInt633;
							Static98.anIntArray402[local181] -= local427.anInt635;
							Static34.anIntArray159[local181] -= local427.anInt623;
							local394 = Static73.anIntArray307[local181]--;
						}
					}
				}
				if (local160 >= 1 && local160 < 103) {
					local194 = 0;
					local198 = 0;
					local204 = 0;
					local226 = 0;
					local210 = 0;
					for (local277 = -5; local277 < 109; local277++) {
						local498 = local277 + 5;
						if (local498 >= 0 && local498 < 104) {
							local226 += Static73.anIntArray307[local498];
							local198 += Static98.anIntArray402[local498];
							local194 += Static2.anIntArray6[local498];
							local210 += Static34.anIntArray159[local498];
							local204 += Static112.anIntArray449[local498];
						}
						local537 = local277 - 5;
						if (local537 >= 0 && local537 < 104) {
							local226 -= Static73.anIntArray307[local537];
							local194 -= Static2.anIntArray6[local537];
							local204 -= Static112.anIntArray449[local537];
							local198 -= Static98.anIntArray402[local537];
							local210 -= Static34.anIntArray159[local537];
						}
						if (local277 >= 1 && local277 < 103 && (!Static103.aBoolean122 || (Static48.aByteArrayArrayArray3[0][local160][local277] & 0x2) != 0 || (Static48.aByteArrayArrayArray3[local11][local160][local277] & 0x10) == 0 && Static121.method1620(local277, local11, local160) == Static99.anInt2657)) {
							if (Static32.anInt936 > local11) {
								Static32.anInt936 = local11;
							}
							local638 = Static112.aByteArrayArrayArray8[local11][local160][local277] & 0xFF;
							local648 = Static88.aByteArrayArrayArray6[local11][local160][local277] & 0xFF;
							if (local638 > 0 || local648 > 0) {
								local666 = Static40.anIntArrayArrayArray2[local11][local160][local277];
								@Pc(676) int local676 = Static40.anIntArrayArrayArray2[local11][local160 + 1][local277];
								@Pc(688) int local688 = Static40.anIntArrayArrayArray2[local11][local160 + 1][local277 + 1];
								@Pc(698) int local698 = Static40.anIntArrayArrayArray2[local11][local160][local277 + 1];
								@Pc(704) int local704 = Static52.anIntArrayArray31[local160][local277];
								@Pc(712) int local712 = Static52.anIntArrayArray31[local160 + 1][local277];
								@Pc(720) int local720 = Static52.anIntArrayArray31[local160][local277 + 1];
								@Pc(722) int local722 = -1;
								@Pc(732) int local732 = Static52.anIntArrayArray31[local160 + 1][local277 + 1];
								@Pc(734) int local734 = -1;
								@Pc(742) int local742;
								@Pc(750) int local750;
								if (local638 > 0) {
									local742 = local194 * 256 / local210;
									@Pc(746) int local746 = local198 / local226;
									local750 = local204 / local226;
									local722 = Static116.method2103(local746, local750, local742);
									local746 += Static54.anInt1638;
									if (local746 < 0) {
										local746 = 0;
									} else if (local746 > 255) {
										local746 = 255;
									}
									local742 = Static73.anInt2170 + local742 & 0xFF;
									local734 = Static116.method2103(local746, local750, local742);
								}
								if (local11 > 0) {
									@Pc(789) boolean local789 = true;
									if (local638 == 0 && Static32.aByteArrayArrayArray2[local11][local160][local277] != 0) {
										local789 = false;
									}
									if (local648 > 0 && !Static41.method1539(local648 - 1).aBoolean7) {
										local789 = false;
									}
									if (local789 && local676 == local666 && local688 == local666 && local698 == local666) {
										Static40.anIntArrayArrayArray1[local11][local160][local277] |= 0x924;
									}
								}
								local742 = 0;
								if (local734 != -1) {
									local742 = Static86.anIntArray359[Static36.method775(96, local734)];
								}
								if (local648 == 0) {
									arg0.method885(local11, local160, local277, 0, 0, -1, local666, local676, local688, local698, Static36.method775(local704, local722), Static36.method775(local712, local722), Static36.method775(local732, local722), Static36.method775(local720, local722), 0, 0, 0, 0, local742, 0);
								} else {
									@Pc(911) byte local911 = Static78.aByteArrayArrayArray5[local11][local160][local277];
									local750 = Static32.aByteArrayArrayArray2[local11][local160][local277] + 1;
									@Pc(927) Class5_Sub2_Sub2 local927 = Static41.method1539(local648 - 1);
									@Pc(930) int local930 = local927.anInt202;
									@Pc(947) int local947;
									@Pc(981) int local981;
									@Pc(954) int local954;
									@Pc(960) int local960;
									if (local930 >= 0) {
										local981 = Static86.anInterface2_1.method1676(local930);
										local947 = -1;
									} else if (local927.anInt198 == 16711935) {
										local981 = -2;
										local930 = -1;
										local947 = -2;
									} else {
										local947 = Static116.method2103(local927.anInt209, local927.anInt203, local927.anInt197);
										local954 = Static73.anInt2170 + local927.anInt197 & 0xFF;
										local960 = local927.anInt209 + Static54.anInt1638;
										if (local960 < 0) {
											local960 = 0;
										} else if (local960 > 255) {
											local960 = 255;
										}
										local981 = Static116.method2103(local960, local927.anInt203, local954);
									}
									local954 = 0;
									if (local981 != -2) {
										local954 = Static86.anIntArray359[Static116.method2100(96, local981)];
									}
									if (local927.anInt208 != -1) {
										local960 = Static73.anInt2170 + local927.anInt205 & 0xFF;
										@Pc(1027) int local1027 = local927.anInt190 + Static54.anInt1638;
										if (local1027 < 0) {
											local1027 = 0;
										} else if (local1027 > 255) {
											local1027 = 255;
										}
										local981 = Static116.method2103(local1027, local927.anInt204, local960);
										local954 = Static86.anIntArray359[Static116.method2100(96, local981)];
									}
									arg0.method885(local11, local160, local277, local750, local911, local930, local666, local676, local688, local698, Static36.method775(local704, local722), Static36.method775(local712, local722), Static36.method775(local732, local722), Static36.method775(local720, local722), Static116.method2100(local704, local947), Static116.method2100(local712, local947), Static116.method2100(local732, local947), Static116.method2100(local720, local947), local742, local954);
								}
							}
						}
					}
				}
			}
			for (local181 = 1; local181 < 103; local181++) {
				for (local194 = 1; local194 < 103; local194++) {
					arg0.method927(local11, local194, local181, Static121.method1620(local181, local11, local194));
				}
			}
			Static112.aByteArrayArrayArray8[local11] = null;
			Static88.aByteArrayArrayArray6[local11] = null;
			Static32.aByteArrayArrayArray2[local11] = null;
			Static78.aByteArrayArrayArray5[local11] = null;
			Static51.aByteArrayArrayArray4[local11] = null;
		}
		arg0.method929();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static48.aByteArrayArrayArray3[1][local15][local30] & 0x2) == 2) {
					arg0.method905(local15, local30);
				}
			}
		}
		local30 = 1;
		local134 = 4;
		local132 = 2;
		for (local138 = 0; local138 < 4; local138++) {
			if (local138 > 0) {
				local132 <<= 0x3;
				local134 <<= 0x3;
				local30 <<= 0x3;
			}
			for (local160 = 0; local160 <= local138; local160++) {
				for (local181 = 0; local181 <= 104; local181++) {
					for (local194 = 0; local194 <= 104; local194++) {
						if ((Static40.anIntArrayArrayArray1[local160][local194][local181] & local30) != 0) {
							for (local198 = local181; local198 < 104 && (Static40.anIntArrayArrayArray1[local160][local194][local198 + 1] & local30) != 0; local198++) {
							}
							local210 = local160;
							local204 = local181;
							local226 = local160;
							while (local204 > 0 && (local30 & Static40.anIntArrayArrayArray1[local160][local194][local204 - 1]) != 0) {
								local204--;
							}
							label347: while (local210 > 0) {
								for (local277 = local204; local277 <= local198; local277++) {
									if ((Static40.anIntArrayArrayArray1[local210 - 1][local194][local277] & local30) == 0) {
										break label347;
									}
								}
								local210--;
							}
							label336: while (local138 > local226) {
								for (local277 = local204; local277 <= local198; local277++) {
									if ((local30 & Static40.anIntArrayArrayArray1[local226 + 1][local194][local277]) == 0) {
										break label336;
									}
								}
								local226++;
							}
							local277 = (local226 + 1 - local210) * (local198 + 1 - local204);
							if (local277 >= 8) {
								local537 = Static40.anIntArrayArrayArray2[local226][local194][local204] - 240;
								local638 = Static40.anIntArrayArrayArray2[local210][local194][local204];
								Static43.method908(local138, 1, local194 * 128, local194 * 128, local204 * 128, local198 * 128 + 128, local537, local638);
								for (local648 = local210; local648 <= local226; local648++) {
									for (local666 = local204; local666 <= local198; local666++) {
										Static40.anIntArrayArrayArray1[local648][local194][local666] &= ~local30;
									}
								}
							}
						}
						if ((Static40.anIntArrayArrayArray1[local160][local194][local181] & local132) != 0) {
							local198 = local194;
							local204 = local194;
							while (local198 < 104 && (Static40.anIntArrayArrayArray1[local160][local198 + 1][local181] & local132) != 0) {
								local198++;
							}
							while (local204 > 0 && (local132 & Static40.anIntArrayArrayArray1[local160][local204 - 1][local181]) != 0) {
								local204--;
							}
							local226 = local160;
							label401: for (local210 = local160; local210 > 0; local210--) {
								for (local277 = local204; local277 <= local198; local277++) {
									if ((local132 & Static40.anIntArrayArrayArray1[local210 - 1][local277][local181]) == 0) {
										break label401;
									}
								}
							}
							label390: while (local226 < local138) {
								for (local277 = local204; local277 <= local198; local277++) {
									if ((Static40.anIntArrayArrayArray1[local226 + 1][local277][local181] & local132) == 0) {
										break label390;
									}
								}
								local226++;
							}
							local277 = (local198 + 1 - local204) * (local226 + 1 - local210);
							if (local277 >= 8) {
								local638 = Static40.anIntArrayArrayArray2[local210][local204][local181];
								local537 = Static40.anIntArrayArrayArray2[local226][local204][local181] - 240;
								Static43.method908(local138, 2, local204 * 128, local198 * 128 + 128, local181 * 128, local181 * 128, local537, local638);
								for (local648 = local210; local648 <= local226; local648++) {
									for (local666 = local204; local666 <= local198; local666++) {
										Static40.anIntArrayArrayArray1[local648][local666][local181] &= ~local132;
									}
								}
							}
						}
						if ((Static40.anIntArrayArrayArray1[local160][local194][local181] & local134) != 0) {
							for (local210 = local181; local210 > 0 && (local134 & Static40.anIntArrayArrayArray1[local160][local194][local210 - 1]) != 0; local210--) {
							}
							local226 = local181;
							local198 = local194;
							while (local226 < 104 && (Static40.anIntArrayArrayArray1[local160][local194][local226 + 1] & local134) != 0) {
								local226++;
							}
							label455: for (local204 = local194; local204 > 0; local204--) {
								for (local277 = local210; local277 <= local226; local277++) {
									if ((local134 & Static40.anIntArrayArrayArray1[local160][local204 - 1][local277]) == 0) {
										break label455;
									}
								}
							}
							label444: while (local198 < 104) {
								for (local277 = local210; local277 <= local226; local277++) {
									if ((Static40.anIntArrayArrayArray1[local160][local198 + 1][local277] & local134) == 0) {
										break label444;
									}
								}
								local198++;
							}
							if ((local198 + 1 - local204) * (-local210 + (local226 - -1)) >= 4) {
								local277 = Static40.anIntArrayArrayArray2[local160][local204][local210];
								Static43.method908(local138, 4, local204 * 128, local198 * 128 + 128, local210 * 128, local226 * 128 + 128, local277, local277);
								for (local498 = local204; local498 <= local198; local498++) {
									for (local537 = local210; local537 <= local226; local537++) {
										Static40.anIntArrayArrayArray1[local160][local498][local537] &= ~local134;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method1796() {
		if (Static104.aClass7_3 != null) {
			Static104.aClass7_3.method73();
			Static104.aClass7_3 = null;
		}
		Static70.method1357();
		Static110.aClass34_1.method914();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static51.aClass37Array1[local18].method1125();
		}
		System.gc();
		Static11.method223();
		Static73.anInt2169 = -1;
		Static61.aBoolean88 = false;
		Static100.method1838();
		Static39.method1422(10);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1797() {
		Static7.anIntArray25 = null;
		Static111.anIntArray440 = null;
		Static104.anIntArray424 = null;
		Static89.anIntArray368 = null;
		Static16.aByteArrayArray2 = null;
		Static110.anIntArray438 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!mb;Lclient!sd;Lclient!mb;)[Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4[] method1798(@OriginalArg(1) Class45 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) Class45 arg2) {
		@Pc(13) int local13 = arg1.method746(arg0);
		@Pc(19) int local19 = arg1.method753(arg2, local13);
		return Static103.method1894(local13, arg1, local19);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method1799() {
		aClass45_1101 = null;
		aClass45_1105 = null;
		aClass45_1106 = null;
		aClass45_1104 = null;
		aClass10_11 = null;
		aClass45_1100 = null;
		aClass45_1109 = null;
		aClass45_1102 = null;
		anIntArray396 = null;
		aClass38Array1 = null;
		aClass45_1108 = null;
		aClass45_1112 = null;
		aClass5_Sub2_Sub6_Sub4Array4 = null;
		aClass45_1103 = null;
		aClass77_3 = null;
		aClass45_1110 = null;
		aClass45_1107 = null;
		aClass45_1111 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!hb;)Lclient!mb;")
	public static Class45 method1800(@OriginalArg(1) Class5_Sub9 arg0) {
		return Static32.method679(arg0);
	}
}
