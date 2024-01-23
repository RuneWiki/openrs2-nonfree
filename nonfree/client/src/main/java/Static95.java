import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!h", name = "O", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!h", name = "db", descriptor = "Lclient!ak;")
	public static Class7 aClass7_87;

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub8 aClass1_Sub2_Sub8_1;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString53 = "wave:";

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
	public static int anInt1822 = 0;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
	public static int anInt1824 = 0;

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString54 = "Loaded fonts";

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(ZI)V")
	public static void method1565(@OriginalArg(0) boolean arg0) {
		Static40.anIntArray123 = new int[5];
		Static140.anIntArray315 = new int[104];
		Static103.anIntArray260 = new int[104];
		Static297.anInt5897 = 99;
		@Pc(25) byte local25;
		if (arg0) {
			local25 = 1;
		} else {
			local25 = 4;
		}
		Static97.aByteArrayArrayArray11 = new byte[local25][104][104];
		Static40.aByteArrayArrayArray6 = new byte[local25][104][104];
		Static143.anIntArray326 = new int[104];
		Static249.aByteArrayArrayArray24 = new byte[local25][104][104];
		Static84.aByteArrayArrayArray9 = new byte[local25][104][104];
		Static38.aByteArrayArrayArray5 = new byte[local25][105][105];
		Static224.anIntArray534 = new int[104];
		Static253.anIntArrayArrayArray19 = new int[local25][105][105];
		Static75.anIntArray175 = new int[104];
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	public static void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static168.anInt3095 = 0;
		@Pc(9) int local9;
		@Pc(643) int local643;
		@Pc(84) int local84;
		@Pc(268) int local268;
		@Pc(312) int local312;
		@Pc(362) int local362;
		@Pc(651) int local651;
		for (local9 = -1; local9 < Static293.anInt5831 + Static241.anInt4977; local9++) {
			@Pc(31) Class6_Sub6 local31;
			if (local9 == -1) {
				local31 = Static28.aClass6_Sub6_Sub2_1;
			} else if (local9 < Static241.anInt4977) {
				local31 = Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local9]];
			} else {
				local31 = Static211.aClass6_Sub6_Sub1Array2[Static75.anIntArray178[local9 - Static241.anInt4977]];
			}
			if (local31 != null && local31.method3514()) {
				@Pc(62) Class19 local62;
				if (local31 instanceof Class6_Sub6_Sub1) {
					local62 = ((Class6_Sub6_Sub1) local31).aClass19_1;
					if (local62.anIntArray67 != null) {
						local62 = local62.method507();
					}
					if (local62 == null) {
						continue;
					}
				}
				@Pc(165) int local165;
				if (local9 >= Static241.anInt4977) {
					local62 = ((Class6_Sub6_Sub1) local31).aClass19_1;
					if (local62.anIntArray67 != null) {
						local62 = local62.method507();
					}
					if (local62.anInt631 >= 0 && Static105.aClass1_Sub2_Sub2Array5.length > local62.anInt631) {
						if (local62.anInt658 == -1) {
							local268 = local31.method3510() + 15;
						} else {
							local268 = local62.anInt658 + 15;
						}
						Static294.method4500(local268, arg2, local31, arg4, arg1 >> 1, arg5 >> 1);
						if (Static55.anInt1167 > -1) {
							Static105.aClass1_Sub2_Sub2Array5[local62.anInt631].method3921(arg0 + Static55.anInt1167 - 12, Static178.anInt3321 + -30 + arg3);
						}
					}
					@Pc(310) Class36[] local310 = Static187.aClass36Array1;
					for (local312 = 0; local312 < local310.length; local312++) {
						@Pc(324) Class36 local324 = local310[local312];
						if (local324 != null && local324.anInt1168 == 1 && Static75.anIntArray178[local9 - Static241.anInt4977] == local324.anInt1172 && Static261.anInt5259 % 20 < 10) {
							if (local62.anInt658 == -1) {
								local362 = local31.method3510() + 15;
							} else {
								local362 = local62.anInt658 + 15;
							}
							Static294.method4500(local362, arg2, local31, arg4, arg1 >> 1, arg5 >> 1);
							if (Static55.anInt1167 > -1) {
								Static121.aClass1_Sub2_Sub2Array6[local324.anInt1166].method3921(arg0 + Static55.anInt1167 - 12, arg3 + Static178.anInt3321 + -28);
							}
						}
					}
				} else {
					local84 = 30;
					@Pc(87) Class6_Sub6_Sub2 local87 = (Class6_Sub6_Sub2) local31;
					if (local87.anInt4601 != -1 || local87.anInt4598 != -1) {
						Static294.method4500(local31.method3510() + 15, arg2, local31, arg4, arg1 >> 1, arg5 >> 1);
						if (Static55.anInt1167 > -1) {
							if (local87.anInt4601 != -1) {
								Static17.aClass1_Sub2_Sub2Array1[local87.anInt4601].method3921(Static55.anInt1167 + arg0 - 12, Static178.anInt3321 + (arg3 - 30));
								local84 += 25;
							}
							if (local87.anInt4598 != -1) {
								Static105.aClass1_Sub2_Sub2Array5[local87.anInt4598].method3921(arg0 + Static55.anInt1167 - 12, Static178.anInt3321 + (arg3 - local84));
								local84 += 25;
							}
						}
					}
					if (local9 >= 0) {
						local165 = 0;
						@Pc(167) Class36[] local167 = Static187.aClass36Array1;
						while (local165 < local167.length) {
							@Pc(175) Class36 local175 = local167[local165];
							if (local175 != null && local175.anInt1168 == 10 && Static143.anIntArray331[local9] == local175.anInt1172) {
								Static294.method4500(local31.method3510() + 15, arg2, local31, arg4, arg1 >> 1, arg5 >> 1);
								if (Static55.anInt1167 > -1) {
									Static121.aClass1_Sub2_Sub2Array6[local175.anInt1166].method3921(Static55.anInt1167 + arg0 - 12, arg3 - -Static178.anInt3321 - local84);
								}
							}
							local165++;
						}
					}
				}
				if (local31.aString145 != null && (Static241.anInt4977 <= local9 || Static105.anInt1945 == 0 || Static105.anInt1945 == 3 || Static105.anInt1945 == 1 && Static178.method2684(((Class6_Sub6_Sub2) local31).aString147))) {
					Static294.method4500(local31.method3510(), arg2, local31, arg4, arg1 >> 1, arg5 >> 1);
					if (Static55.anInt1167 > -1 && Static168.anInt3095 < Static143.anInt2661) {
						Static143.anIntArray327[Static168.anInt3095] = Static10.aClass1_Sub2_Sub12_1.method4390(local31.aString145) / 2;
						Static143.anIntArray333[Static168.anInt3095] = Static10.aClass1_Sub2_Sub12_1.anInt5693;
						Static143.anIntArray325[Static168.anInt3095] = Static55.anInt1167;
						Static143.anIntArray332[Static168.anInt3095] = Static178.anInt3321;
						Static143.anIntArray330[Static168.anInt3095] = local31.anInt4529;
						Static143.anIntArray329[Static168.anInt3095] = local31.anInt4521;
						Static143.anIntArray328[Static168.anInt3095] = local31.anInt4563;
						Static143.aStringArray11[Static168.anInt3095] = local31.aString145;
						Static168.anInt3095++;
					}
				}
				if (Static261.anInt5259 < local31.anInt4502) {
					@Pc(515) Class1_Sub2_Sub2 local515 = Static216.aClass1_Sub2_Sub2Array11[1];
					@Pc(519) Class1_Sub2_Sub2 local519 = Static216.aClass1_Sub2_Sub2Array11[0];
					if (local31 instanceof Class6_Sub6_Sub1) {
						@Pc(525) Class6_Sub6_Sub1 local525 = (Class6_Sub6_Sub1) local31;
						@Pc(535) Class1_Sub2_Sub2[] local535 = (Class1_Sub2_Sub2[]) Static198.aClass31_29.method852((long) local525.aClass19_1.anInt636);
						if (local535 == null) {
							local535 = Static237.method2439(local525.aClass19_1.anInt636, Static58.aClass7_58);
							if (local535 != null) {
								Static198.aClass31_29.method851(local535, (long) local525.aClass19_1.anInt636);
							}
						}
						@Pc(561) Class19 local561 = local525.aClass19_1;
						if (local535 != null && local535.length == 2) {
							local515 = local535[1];
							local519 = local535[0];
						}
						if (local561.anInt658 == -1) {
							local312 = local31.method3510();
						} else {
							local312 = local561.anInt658;
						}
					} else {
						local312 = local31.method3510();
					}
					Static294.method4500(local312 + local519.anInt5112 + 10, arg2, local31, arg4, arg1 >> 1, arg5 >> 1);
					if (Static55.anInt1167 > -1) {
						local165 = arg0 + Static55.anInt1167 - (local519.anInt5119 >> 1);
						local362 = Static178.anInt3321 + arg3 - 3;
						local519.method3921(local165, local362);
						local643 = local519.anInt5112;
						local651 = local31.anInt4536 * local519.anInt5119 / 255;
						if (Static240.aBoolean369) {
							Static50.method858(local165, local362, local165 + local651, local362 - -local643);
						} else {
							Static213.method3366(local165, local362, local165 + local651, local362 - -local643);
						}
						local515.method3921(local165, local362);
						if (Static240.aBoolean369) {
							Static50.method867(arg0, arg3, arg5 + arg0, arg1 + arg3);
						} else {
							Static213.method3369(arg0, arg3, arg0 + arg5, arg1 + arg3);
						}
					}
				}
				for (local84 = 0; local84 < 4; local84++) {
					if (local31.anIntArray520[local84] > Static261.anInt5259) {
						if (local31 instanceof Class6_Sub6_Sub1) {
							@Pc(725) Class6_Sub6_Sub1 local725 = (Class6_Sub6_Sub1) local31;
							@Pc(728) Class19 local728 = local725.aClass19_1;
							if (local728.anInt658 == -1) {
								local268 = local31.method3510() / 2;
							} else {
								local268 = local728.anInt658 / 2;
							}
						} else {
							local268 = local31.method3510() / 2;
						}
						Static294.method4500(local268, arg2, local31, arg4, arg1 >> 1, arg5 >> 1);
						if (Static55.anInt1167 > -1) {
							if (local84 == 1) {
								Static178.anInt3321 -= 20;
							}
							if (local84 == 2) {
								Static55.anInt1167 -= 15;
								Static178.anInt3321 -= 10;
							}
							if (local84 == 3) {
								Static55.anInt1167 += 15;
								Static178.anInt3321 -= 10;
							}
							Static156.aClass1_Sub2_Sub2Array4[local31.anIntArray517[local84]].method3921(arg0 + Static55.anInt1167 - 12, arg3 + -12 + Static178.anInt3321);
							Static169.aClass1_Sub2_Sub12_3.method4382(Integer.toString(local31.anIntArray518[local84]), arg0 + Static55.anInt1167 - 1, Static178.anInt3321 + arg3 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (local9 = 0; local9 < Static168.anInt3095; local9++) {
			@Pc(862) int local862 = Static143.anIntArray325[local9];
			local84 = Static143.anIntArray332[local9];
			local312 = Static143.anIntArray333[local9];
			local268 = Static143.anIntArray327[local9];
			@Pc(876) boolean local876 = true;
			while (local876) {
				local876 = false;
				for (local362 = 0; local362 < local9; local362++) {
					if (Static143.anIntArray332[local362] - Static143.anIntArray333[local362] < local84 - -2 && local84 - local312 < Static143.anIntArray332[local362] + 2 && local862 - local268 < Static143.anIntArray325[local362] + Static143.anIntArray327[local362] && local268 + local862 > Static143.anIntArray325[local362] - Static143.anIntArray327[local362] && Static143.anIntArray332[local362] - Static143.anIntArray333[local362] < local84) {
						local876 = true;
						local84 = Static143.anIntArray332[local362] - Static143.anIntArray333[local362];
					}
				}
			}
			Static55.anInt1167 = Static143.anIntArray325[local9];
			Static178.anInt3321 = Static143.anIntArray332[local9] = local84;
			@Pc(982) String local982 = Static143.aStringArray11[local9];
			if (Static261.anInt5256 == 0) {
				local651 = 16776960;
				if (Static143.anIntArray330[local9] < 6) {
					local651 = Static99.anIntArray256[Static143.anIntArray330[local9]];
				}
				if (Static143.anIntArray330[local9] == 6) {
					local651 = Static152.anInt2841 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static143.anIntArray330[local9] == 7) {
					local651 = Static152.anInt2841 % 20 >= 10 ? 65535 : 255;
				}
				if (Static143.anIntArray330[local9] == 8) {
					local651 = Static152.anInt2841 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static143.anIntArray330[local9] == 9) {
					local643 = 150 - Static143.anIntArray328[local9];
					if (local643 < 50) {
						local651 = local643 * 1280 + 16711680;
					} else if (local643 < 100) {
						local651 = 16776960 + 16384000 - local643 * 327680;
					} else if (local643 < 150) {
						local651 = local643 * 5 + 65280 - 500;
					}
				}
				if (Static143.anIntArray330[local9] == 10) {
					local643 = 150 - Static143.anIntArray328[local9];
					if (local643 < 50) {
						local651 = local643 * 5 + 16711680;
					} else if (local643 < 100) {
						local651 = 16384000 + 16711935 - local643 * 327680;
					} else if (local643 < 150) {
						local651 = (local643 - 100) * 327680 + 255 + 500 - local643 * 5;
					}
				}
				if (Static143.anIntArray330[local9] == 11) {
					local643 = 150 - Static143.anIntArray328[local9];
					if (local643 < 50) {
						local651 = 16777215 - local643 * 327685;
					} else if (local643 < 100) {
						local651 = (local643 - 50) * 327685 + 65280;
					} else if (local643 < 150) {
						local651 = 16777215 - (local643 - 100) * 327680;
					}
				}
				if (Static143.anIntArray329[local9] == 0) {
					Static10.aClass1_Sub2_Sub12_1.method4382(local982, Static55.anInt1167 + arg0, Static178.anInt3321 + arg3, local651, 0);
				}
				if (Static143.anIntArray329[local9] == 1) {
					Static10.aClass1_Sub2_Sub12_1.method4383(local982, arg0 + Static55.anInt1167, Static178.anInt3321 + arg3, local651, Static152.anInt2841);
				}
				if (Static143.anIntArray329[local9] == 2) {
					Static10.aClass1_Sub2_Sub12_1.method4384(local982, arg0 + Static55.anInt1167, Static178.anInt3321 + arg3, local651, Static152.anInt2841);
				}
				if (Static143.anIntArray329[local9] == 3) {
					Static10.aClass1_Sub2_Sub12_1.method4387(local982, arg0 + Static55.anInt1167, Static178.anInt3321 + arg3, local651, Static152.anInt2841, 150 - Static143.anIntArray328[local9]);
				}
				if (Static143.anIntArray329[local9] == 4) {
					local643 = (150 - Static143.anIntArray328[local9]) * (Static10.aClass1_Sub2_Sub12_1.method4390(local982) + 100) / 150;
					if (Static240.aBoolean369) {
						Static50.method858(arg0 + Static55.anInt1167 - 50, arg3, Static55.anInt1167 + arg0 + 50, arg3 - -arg1);
					} else {
						Static213.method3366(Static55.anInt1167 + arg0 - 50, arg3, arg0 + Static55.anInt1167 + 50, arg3 - -arg1);
					}
					Static10.aClass1_Sub2_Sub12_1.method4394(local982, Static55.anInt1167 + arg0 + 50 - local643, arg3 - -Static178.anInt3321, local651, 0);
					if (Static240.aBoolean369) {
						Static50.method867(arg0, arg3, arg0 + arg5, arg3 - -arg1);
					} else {
						Static213.method3369(arg0, arg3, arg0 + arg5, arg3 - -arg1);
					}
				}
				if (Static143.anIntArray329[local9] == 5) {
					local643 = 150 - Static143.anIntArray328[local9];
					@Pc(1416) int local1416 = 0;
					if (Static240.aBoolean369) {
						Static50.method858(arg0, arg3 + Static178.anInt3321 - Static10.aClass1_Sub2_Sub12_1.anInt5693 - 1, arg5 + arg0, arg3 + Static178.anInt3321 + 5);
					} else {
						Static213.method3366(arg0, Static178.anInt3321 + arg3 - Static10.aClass1_Sub2_Sub12_1.anInt5693 - 1, arg5 + arg0, Static178.anInt3321 + arg3 + 5);
					}
					if (local643 < 25) {
						local1416 = local643 - 25;
					} else if (local643 > 125) {
						local1416 = local643 - 125;
					}
					Static10.aClass1_Sub2_Sub12_1.method4382(local982, arg0 + Static55.anInt1167, local1416 + arg3 + Static178.anInt3321, local651, 0);
					if (Static240.aBoolean369) {
						Static50.method867(arg0, arg3, arg5 + arg0, arg1 + arg3);
					} else {
						Static213.method3369(arg0, arg3, arg5 + arg0, arg3 - -arg1);
					}
				}
			} else {
				Static10.aClass1_Sub2_Sub12_1.method4382(local982, arg0 + Static55.anInt1167, Static178.anInt3321 + arg3, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(I)V")
	public static void method1568() {
		Static277.aClass31_41.method850();
		Static140.aClass31_23.method850();
	}
}
