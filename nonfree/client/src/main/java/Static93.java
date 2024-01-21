import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!sg;")
	public static Class77 aClass77_921 = Static146.method2172("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	public static int anInt2394 = -1;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBBZILclient!qd;I)V")
	public static void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) (arg5 + (arg3 << 16));
		@Pc(12) Class2_Sub2_Sub4 local12 = (Class2_Sub2_Sub4) Static48.aClass74_5.method2433(local6);
		if (local12 != null) {
			return;
		}
		local12 = (Class2_Sub2_Sub4) Static169.aClass74_11.method2433(local6);
		if (local12 != null) {
			return;
		}
		local12 = (Class2_Sub2_Sub4) Static42.aClass74_4.method2433(local6);
		if (local12 == null) {
			if (!arg2) {
				local12 = (Class2_Sub2_Sub4) Static53.aClass74_6.method2433(local6);
				if (local12 != null) {
					return;
				}
			}
			local12 = new Class2_Sub2_Sub4();
			local12.aByte1 = arg1;
			local12.anInt383 = arg0;
			local12.aClass43_Sub1_2 = arg4;
			if (arg2) {
				Static48.aClass74_5.method2432(local6, local12);
				Static15.anInt481++;
			} else {
				Static173.aClass85_2.method2758(local12);
				Static42.aClass74_4.method2432(local6, local12);
				Static136.anInt3301++;
			}
		} else if (arg2) {
			local12.method2900();
			Static48.aClass74_5.method2432(local6, local12);
			Static136.anInt3301--;
			Static15.anInt481++;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!sg;)Z")
	public static boolean method1683(@OriginalArg(1) Class77 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static181.anInt4605; local11++) {
			if (arg0.method2508(Static173.aClass77Array26[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method1684() {
		aClass77_921 = null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
	public static void method1685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static86.anInt2242 = 0;
		@Pc(66) int local66;
		for (@Pc(7) int local7 = -1; local7 < Static124.anInt3042 + Static145.anInt3533; local7++) {
			@Pc(24) Class2_Sub2_Sub1_Sub6 local24;
			if (local7 == -1) {
				local24 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11;
			} else if (local7 >= Static124.anInt3042) {
				local24 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[Static160.anIntArray643[local7 - Static124.anInt3042]];
			} else {
				local24 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[Static177.anIntArray632[local7]];
			}
			if (local24 != null && local24.method2916()) {
				@Pc(48) Class2_Sub2_Sub16 local48;
				if (local24 instanceof Class2_Sub2_Sub1_Sub6_Sub2) {
					local48 = ((Class2_Sub2_Sub1_Sub6_Sub2) local24).aClass2_Sub2_Sub16_1;
					if (local48.anIntArray555 != null) {
						local48 = local48.method2613();
					}
					if (local48 == null) {
						continue;
					}
				}
				if (Static124.anInt3042 <= local7) {
					local48 = ((Class2_Sub2_Sub1_Sub6_Sub2) local24).aClass2_Sub2_Sub16_1;
					if (local48.anIntArray555 != null) {
						local48 = local48.method2613();
					}
					if (local48.anInt3787 >= 0 && Static133.aClass2_Sub2_Sub3_Sub2Array10.length > local48.anInt3787) {
						Static85.method1560(local24, 15 - local24.aShort32);
						if (Static159.anInt3921 > -1) {
							Static133.aClass2_Sub2_Sub3_Sub2Array10[local48.anInt3787].method401(arg1 + Static159.anInt3921 - 12, arg2 - (-Static57.anInt4543 + 30));
						}
					}
					if (Static119.anInt2968 == 1 && Static160.anIntArray643[local7 - Static124.anInt3042] == Static148.anInt3613 && Static143.anInt3513 % 20 < 10) {
						Static85.method1560(local24, 15 - local24.aShort32);
						if (Static159.anInt3921 > -1) {
							Static167.aClass2_Sub2_Sub3_Sub2Array12[0].method401(Static159.anInt3921 + arg1 - 12, Static57.anInt4543 + -28 + arg2);
						}
					}
				} else {
					@Pc(64) Class2_Sub2_Sub1_Sub6_Sub1 local64 = (Class2_Sub2_Sub1_Sub6_Sub1) local24;
					local66 = 30;
					if (local64.anInt4339 != -1 || local64.anInt4328 != -1) {
						Static85.method1560(local24, 15 - local24.aShort32);
						if (Static159.anInt3921 > -1) {
							if (local64.anInt4339 != -1) {
								Static6.aClass2_Sub2_Sub3_Sub2Array1[local64.anInt4339].method401(arg1 + Static159.anInt3921 - 12, Static57.anInt4543 + -30 + arg2);
								local66 += 25;
							}
							if (local64.anInt4328 != -1) {
								Static133.aClass2_Sub2_Sub3_Sub2Array10[local64.anInt4328].method401(Static159.anInt3921 + arg1 - 12, -local66 + Static57.anInt4543 + arg2);
								local66 += 25;
							}
						}
					}
					if (local7 >= 0 && Static119.anInt2968 == 10 && Static140.anInt3376 == Static177.anIntArray632[local7]) {
						Static85.method1560(local24, 15 - local24.aShort32);
						if (Static159.anInt3921 > -1) {
							Static167.aClass2_Sub2_Sub3_Sub2Array12[1].method401(arg1 + Static159.anInt3921 - 12, -local66 + Static57.anInt4543 + arg2);
						}
					}
				}
				if (local24.aClass77_1508 != null && (local7 >= Static124.anInt3042 || Static38.anInt1109 == 0 || Static38.anInt1109 == 3 || Static38.anInt1109 == 1 && Static27.method565(((Class2_Sub2_Sub1_Sub6_Sub1) local24).aClass77_1482))) {
					Static85.method1560(local24, -local24.aShort32);
					if (Static159.anInt3921 > -1 && Static86.anInt2242 < Static60.anInt1614) {
						Static60.anIntArray244[Static86.anInt2242] = Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1276(local24.aClass77_1508) / 2;
						Static60.anIntArray245[Static86.anInt2242] = Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.anInt1744;
						Static60.anIntArray247[Static86.anInt2242] = Static159.anInt3921;
						Static60.anIntArray243[Static86.anInt2242] = Static57.anInt4543;
						Static60.anIntArray248[Static86.anInt2242] = local24.anInt4405;
						Static60.anIntArray246[Static86.anInt2242] = local24.anInt4410;
						Static60.anIntArray249[Static86.anInt2242] = local24.anInt4419;
						Static60.aClass77Array11[Static86.anInt2242] = local24.aClass77_1508;
						Static86.anInt2242++;
					}
				}
				if (local24.anInt4420 > Static143.anInt3513) {
					Static85.method1560(local24, 15 - local24.aShort32);
					if (Static159.anInt3921 > -1) {
						local66 = local24.anInt4427 * 30 / local24.anInt4384;
						if (local66 > 30) {
							local66 = 30;
						}
						Static113.method1243(Static159.anInt3921 + arg1 - 15, Static57.anInt4543 + arg2 - 3, local66, 5, 65280);
						Static113.method1243(arg1 + Static159.anInt3921 + local66 - 15, Static57.anInt4543 + arg2 - 3, 30 - local66, 5, 16711680);
					}
				}
				for (local66 = 0; local66 < 4; local66++) {
					if (local24.anIntArray617[local66] > Static143.anInt3513) {
						Static85.method1560(local24, -local24.aShort32 / 2);
						if (Static159.anInt3921 > -1) {
							if (local66 == 1) {
								Static57.anInt4543 -= 20;
							}
							if (local66 == 2) {
								Static57.anInt4543 -= 10;
								Static159.anInt3921 -= 15;
							}
							if (local66 == 3) {
								Static159.anInt3921 += 15;
								Static57.anInt4543 -= 10;
							}
							Static83.aClass2_Sub2_Sub3_Sub2Array4[local24.anIntArray621[local66]].method401(arg1 + Static159.anInt3921 - 12, arg2 + Static57.anInt4543 + -12);
							Static99.aClass2_Sub2_Sub3_Sub4_Sub1_5.method1255(Static2.method61(local24.anIntArray618[local66]), arg1 + Static159.anInt3921 - 1, arg2 + 3 + Static57.anInt4543, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(520) int local520 = 0; local520 < Static86.anInt2242; local520++) {
			local66 = Static60.anIntArray247[local520];
			@Pc(529) int local529 = Static60.anIntArray245[local520];
			@Pc(533) int local533 = Static60.anIntArray243[local520];
			@Pc(537) int local537 = Static60.anIntArray244[local520];
			@Pc(539) boolean local539 = true;
			while (local539) {
				local539 = false;
				for (@Pc(544) int local544 = 0; local544 < local520; local544++) {
					if (Static60.anIntArray243[local544] - Static60.anIntArray245[local544] < local533 + 2 && Static60.anIntArray243[local544] + 2 > local533 + -local529 && Static60.anIntArray247[local544] + Static60.anIntArray244[local544] > -local537 + local66 && local537 + local66 > -Static60.anIntArray244[local544] + Static60.anIntArray247[local544] && Static60.anIntArray243[local544] - Static60.anIntArray245[local544] < local533) {
						local533 = Static60.anIntArray243[local544] - Static60.anIntArray245[local544];
						local539 = true;
					}
				}
			}
			Static159.anInt3921 = Static60.anIntArray247[local520];
			Static57.anInt4543 = Static60.anIntArray243[local520] = local533;
			@Pc(645) Class77 local645 = Static60.aClass77Array11[local520];
			if (Static49.anInt1347 == 0) {
				@Pc(652) int local652 = 16776960;
				if (Static60.anIntArray248[local520] < 6) {
					local652 = Static71.anIntArray318[Static60.anIntArray248[local520]];
				}
				if (Static60.anIntArray248[local520] == 6) {
					local652 = Static128.anInt3108 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static60.anIntArray248[local520] == 7) {
					local652 = Static128.anInt3108 % 20 < 10 ? 255 : 65535;
				}
				if (Static60.anIntArray248[local520] == 8) {
					local652 = Static128.anInt3108 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(721) int local721;
				if (Static60.anIntArray248[local520] == 9) {
					local721 = 150 - Static60.anIntArray249[local520];
					if (local721 < 50) {
						local652 = local721 * 1280 + 16711680;
					} else if (local721 < 100) {
						local652 = 33160960 - local721 * 327680;
					} else if (local721 < 150) {
						local652 = local721 * 5 + 65280 - 500;
					}
				}
				if (Static60.anIntArray248[local520] == 10) {
					local721 = 150 - Static60.anIntArray249[local520];
					if (local721 < 50) {
						local652 = local721 * 5 + 16711680;
					} else if (local721 < 100) {
						local652 = 16711935 + 16384000 - local721 * 327680;
					} else if (local721 < 150) {
						local652 = (local721 - 100) * 327680 + 755 - local721 * 5;
					}
				}
				if (Static60.anIntArray248[local520] == 11) {
					local721 = 150 - Static60.anIntArray249[local520];
					if (local721 < 50) {
						local652 = 16777215 - local721 * 327685;
					} else if (local721 < 100) {
						local652 = (local721 - 50) * 327685 + 65280;
					} else if (local721 < 150) {
						local652 = 16777215 - (local721 - 100) * 327680;
					}
				}
				if (Static60.anIntArray246[local520] == 0) {
					Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1255(local645, Static159.anInt3921 + arg1, Static57.anInt4543 + arg2, local652, 0);
				}
				if (Static60.anIntArray246[local520] == 1) {
					Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1260(local645, arg1 + Static159.anInt3921, arg2 - -Static57.anInt4543, local652, Static128.anInt3108);
				}
				if (Static60.anIntArray246[local520] == 2) {
					Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1265(local645, arg1 + Static159.anInt3921, arg2 - -Static57.anInt4543, local652, Static128.anInt3108);
				}
				if (Static60.anIntArray246[local520] == 3) {
					Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1280(local645, arg1 + Static159.anInt3921, arg2 - -Static57.anInt4543, local652, Static128.anInt3108, 150 - Static60.anIntArray249[local520]);
				}
				if (Static60.anIntArray246[local520] == 4) {
					local721 = (150 - Static60.anIntArray249[local520]) * (Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1276(local645) + 100) / 150;
					Static113.method1245(Static159.anInt3921 + arg1 - 50, arg2, arg1 + Static159.anInt3921 + 50, arg0 + arg2);
					Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1256(local645, arg1 + Static159.anInt3921 + 50 - local721, arg2 + Static57.anInt4543, local652, 0);
					Static113.method1244(arg1, arg2, arg1 + arg3, arg0 + arg2);
				}
				if (Static60.anIntArray246[local520] == 5) {
					@Pc(1018) int local1018 = 0;
					local721 = 150 - Static60.anIntArray249[local520];
					Static113.method1245(arg1, Static57.anInt4543 + arg2 - Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.anInt1744 - 1, arg1 + arg3, arg2 + Static57.anInt4543 + 5);
					if (local721 < 25) {
						local1018 = local721 - 25;
					} else if (local721 > 125) {
						local1018 = local721 - 125;
					}
					Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1255(local645, arg1 + Static159.anInt3921, Static57.anInt4543 + arg2 + local1018, local652, 0);
					Static113.method1244(arg1, arg2, arg1 + arg3, arg0 + arg2);
				}
			} else {
				Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1255(local645, arg1 + Static159.anInt3921, arg2 + Static57.anInt4543, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I")
	public static int method1686() {
		return Static9.anInt259++;
	}
}
