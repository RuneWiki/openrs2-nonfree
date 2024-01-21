import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "Lclient!dh;")
	public static Class18 aClass18_6;

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "Lclient!kh;")
	public static Class29 aClass29_26;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!cd;")
	public static Class10 aClass10_604 = Static51.method932(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "Lclient!cd;")
	private static Class10 aClass10_606 = Static51.method932("Please wait)3)3)3");

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "Lclient!cd;")
	public static Class10 aClass10_605 = aClass10_606;

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_607 = Static51.method932("Spieler");

	@OriginalMember(owner = "client!kh", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_608 = Static51.method932("title_mute");

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	public static void method1013() {
		for (@Pc(7) int local7 = 0; local7 < Static97.anInt2273; local7++) {
			@Pc(13) int local13 = Static142.anIntArray334[local7];
			@Pc(17) Class2_Sub1_Sub3_Sub2_Sub2 local17 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local13];
			@Pc(21) int local21 = Static75.aClass2_Sub11_Sub1_1.method1461();
			if ((local21 & 0x20) != 0) {
				local17.aClass10_1514 = Static75.aClass2_Sub11_Sub1_1.method1452();
				local17.anInt3459 = 100;
			}
			@Pc(44) int local44;
			@Pc(48) int local48;
			if ((local21 & 0x4) != 0) {
				local44 = Static75.aClass2_Sub11_Sub1_1.method1443();
				local48 = Static75.aClass2_Sub11_Sub1_1.method1461();
				if (local44 == 65535) {
					local44 = -1;
				}
				if (local17.anInt3509 == local44 && local44 != -1) {
					@Pc(65) int local65 = Static19.method325(local44).anInt1920;
					if (local65 == 1) {
						local17.anInt3458 = 0;
						local17.anInt3497 = 0;
						local17.anInt3473 = 0;
						local17.anInt3481 = local48;
					}
					if (local65 == 2) {
						local17.anInt3497 = 0;
					}
				} else if (local44 == -1 || local17.anInt3509 == -1 || Static19.method325(local44).anInt1927 >= Static19.method325(local17.anInt3509).anInt1927) {
					local17.anInt3481 = local48;
					local17.anInt3473 = 0;
					local17.anInt3458 = 0;
					local17.anInt3469 = local17.anInt3476;
					local17.anInt3497 = 0;
					local17.anInt3509 = local44;
				}
			}
			if ((local21 & 0x2) != 0) {
				local44 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local48 = Static75.aClass2_Sub11_Sub1_1.method1460();
				local17.method2464(Static14.anInt386, local48, local44);
				local17.anInt3474 = Static14.anInt386 + 300;
				local17.anInt3486 = Static75.aClass2_Sub11_Sub1_1.method1460();
				local17.anInt3495 = Static75.aClass2_Sub11_Sub1_1.method1460();
			}
			if ((local21 & 0x40) != 0) {
				local17.aClass2_Sub1_Sub2_1 = Static106.method1725(Static75.aClass2_Sub11_Sub1_1.method1456());
				local17.anInt3493 = local17.aClass2_Sub1_Sub2_1.anInt77;
				local17.anInt3480 = local17.aClass2_Sub1_Sub2_1.anInt67;
				local17.anInt3466 = local17.aClass2_Sub1_Sub2_1.anInt66;
				local17.anInt3482 = local17.aClass2_Sub1_Sub2_1.anInt68;
				local17.anInt3496 = local17.aClass2_Sub1_Sub2_1.anInt73;
				local17.anInt3467 = local17.aClass2_Sub1_Sub2_1.anInt72;
				local17.anInt3487 = local17.aClass2_Sub1_Sub2_1.anInt65;
				local17.anInt3464 = local17.aClass2_Sub1_Sub2_1.anInt57;
				local17.anInt3455 = local17.aClass2_Sub1_Sub2_1.anInt69;
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt3508 = Static75.aClass2_Sub11_Sub1_1.method1459();
				local44 = Static75.aClass2_Sub11_Sub1_1.method1454();
				if (local17.anInt3508 == 65535) {
					local17.anInt3508 = -1;
				}
				local17.anInt3470 = 0;
				local17.anInt3500 = 0;
				local17.anInt3478 = local44 >> 16;
				local17.anInt3485 = (local44 & 0xFFFF) + Static14.anInt386;
				if (Static14.anInt386 < local17.anInt3485) {
					local17.anInt3500 = -1;
				}
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt3475 = Static75.aClass2_Sub11_Sub1_1.method1459();
				local17.anInt3456 = Static75.aClass2_Sub11_Sub1_1.method1456();
			}
			if ((local21 & 0x10) != 0) {
				local17.anInt3457 = Static75.aClass2_Sub11_Sub1_1.method1475();
				if (local17.anInt3457 == 65535) {
					local17.anInt3457 = -1;
				}
			}
			if ((local21 & 0x80) != 0) {
				local44 = Static75.aClass2_Sub11_Sub1_1.method1466();
				local48 = Static75.aClass2_Sub11_Sub1_1.method1460();
				local17.method2464(Static14.anInt386, local48, local44);
				local17.anInt3474 = Static14.anInt386 + 300;
				local17.anInt3486 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local17.anInt3495 = Static75.aClass2_Sub11_Sub1_1.method1462();
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!fa;III)V")
	public static void method1014(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt1025 == 1) {
			Static144.method2257(0, arg0.anInt1057, 8, arg0.aClass10_507, Static63.aClass10_687, 0);
		}
		if (arg0.anInt1025 == 2 && !Static69.aBoolean74) {
			@Pc(33) Class10 local33 = Static63.method1125(arg0);
			if (local33 != null) {
				Static144.method2257(0, arg0.anInt1057, 32, local33, Static3.method36(new Class10[] { Static114.aClass10_1105, arg0.aClass10_505 }), -1);
			}
		}
		if (arg0.anInt1025 == 3) {
			Static144.method2257(0, arg0.anInt1057, 17, Static169.aClass10_1567, Static63.aClass10_687, 0);
		}
		if (arg0.anInt1025 == 4) {
			Static144.method2257(0, arg0.anInt1057, 43, arg0.aClass10_507, Static63.aClass10_687, 0);
		}
		if (arg0.anInt1025 == 5) {
			Static144.method2257(0, arg0.anInt1057, 1, arg0.aClass10_507, Static63.aClass10_687, 0);
		}
		if (arg0.anInt1025 == 6 && Static68.aClass23_6 == null) {
			Static144.method2257(0, arg0.anInt1057, 36, arg0.aClass10_507, Static63.aClass10_687, -1);
		}
		@Pc(154) int local154;
		@Pc(148) int local148;
		if (arg0.anInt1090 == 2) {
			local148 = 0;
			for (@Pc(150) int local150 = 0; local150 < arg0.anInt1087; local150++) {
				for (local154 = 0; local154 < arg0.anInt1089; local154++) {
					@Pc(163) int local163 = local154 * (arg0.anInt1064 + 32);
					@Pc(170) int local170 = local150 * (arg0.anInt1037 + 32);
					if (local148 < 20) {
						local170 += arg0.anIntArray132[local148];
						local163 += arg0.anIntArray125[local148];
					}
					if (arg1 >= local163 && arg2 >= local170 && arg1 < local163 + 32 && local170 + 32 > arg2) {
						Static29.aClass23_2 = arg0;
						Static59.anInt1475 = local148;
						if (arg0.anIntArray131[local148] > 0) {
							@Pc(238) Class2_Sub1_Sub6 local238 = Static78.method577(arg0.anIntArray131[local148] - 1);
							if (Static44.anInt1023 == 1 && Static130.method2083(Static126.method2068(arg0))) {
								if (arg0.anInt1057 != Static149.anInt3231 || local148 != Static73.anInt1744) {
									Static144.method2257(local238.anInt1491, arg0.anInt1057, 23, Static151.aClass10_1426, Static3.method36(new Class10[] { Static163.aClass10_1521, Static94.aClass10_938, local238.aClass10_662 }), local148);
								}
							} else if (!Static69.aBoolean74 || !Static130.method2083(Static126.method2068(arg0))) {
								@Pc(307) Class10[] local307 = local238.aClass10Array10;
								if (Static157.aBoolean150) {
									local307 = Static157.method2404(local307);
								}
								@Pc(323) int local323;
								@Pc(371) byte local371;
								if (Static130.method2083(Static126.method2068(arg0))) {
									for (local323 = 4; local323 >= 3; local323--) {
										if (local307 != null && local307[local323] != null) {
											if (local323 == 3) {
												local371 = 2;
											} else {
												local371 = 24;
											}
											Static144.method2257(local238.anInt1491, arg0.anInt1057, local371, local307[local323], Static3.method36(new Class10[] { Static150.aClass10_1549, local238.aClass10_662 }), local148);
										} else if (local323 == 4) {
											Static144.method2257(local238.anInt1491, arg0.anInt1057, 24, Static91.aClass10_905, Static3.method36(new Class10[] { Static150.aClass10_1549, local238.aClass10_662 }), local148);
										}
									}
								}
								if (Static135.method2149(Static126.method2068(arg0))) {
									Static144.method2257(local238.anInt1491, arg0.anInt1057, 12, Static151.aClass10_1426, Static3.method36(new Class10[] { Static150.aClass10_1549, local238.aClass10_662 }), local148);
								}
								if (Static130.method2083(Static126.method2068(arg0)) && local307 != null) {
									for (local323 = 2; local323 >= 0; local323--) {
										if (local307[local323] != null) {
											local371 = 0;
											if (local323 == 0) {
												local371 = 28;
											}
											if (local323 == 1) {
												local371 = 51;
											}
											if (local323 == 2) {
												local371 = 14;
											}
											Static144.method2257(local238.anInt1491, arg0.anInt1057, local371, local307[local323], Static3.method36(new Class10[] { Static150.aClass10_1549, local238.aClass10_662 }), local148);
										}
									}
								}
								local307 = arg0.aClass10Array7;
								if (Static157.aBoolean150) {
									local307 = Static157.method2404(local307);
								}
								if (local307 != null) {
									for (local323 = 4; local323 >= 0; local323--) {
										if (local307[local323] != null) {
											local371 = 0;
											if (local323 == 0) {
												local371 = 31;
											}
											if (local323 == 1) {
												local371 = 20;
											}
											if (local323 == 2) {
												local371 = 25;
											}
											if (local323 == 3) {
												local371 = 13;
											}
											if (local323 == 4) {
												local371 = 4;
											}
											Static144.method2257(local238.anInt1491, arg0.anInt1057, local371, local307[local323], Static3.method36(new Class10[] { Static150.aClass10_1549, local238.aClass10_662 }), local148);
										}
									}
								}
								Static144.method2257(local238.anInt1491, arg0.anInt1057, 1001, Static142.aClass10_1386, Static3.method36(new Class10[] { Static150.aClass10_1549, local238.aClass10_662 }), local148);
							} else if ((Static147.anInt3804 & 0x10) == 16) {
								Static144.method2257(local238.anInt1491, arg0.anInt1057, 35, Static111.aClass10_1098, Static3.method36(new Class10[] { Static121.aClass10_1190, Static94.aClass10_938, local238.aClass10_662 }), local148);
							}
						}
					}
					local148++;
				}
			}
		}
		if (!arg0.aBoolean37) {
			return;
		}
		if (!Static69.aBoolean74) {
			@Pc(673) Class10 local673;
			for (local148 = 9; local148 >= 5; local148--) {
				local673 = Static29.method614(local148, arg0);
				if (local673 != null) {
					Static144.method2257(local148 + 1, arg0.anInt1057, 1006, local673, arg0.aClass10_501, arg0.anInt1056);
				}
			}
			local673 = Static63.method1125(arg0);
			if (local673 != null) {
				Static144.method2257(0, arg0.anInt1057, 32, local673, arg0.aClass10_501, arg0.anInt1056);
			}
			for (local154 = 4; local154 >= 0; local154--) {
				@Pc(732) Class10 local732 = Static29.method614(local154, arg0);
				if (local732 != null) {
					Static144.method2257(local154 + 1, arg0.anInt1057, 40, local732, arg0.aClass10_501, arg0.anInt1056);
				}
			}
			if (Static164.method2483(Static126.method2068(arg0))) {
				Static144.method2257(0, arg0.anInt1057, 36, Static36.aClass10_422, Static63.aClass10_687, arg0.anInt1056);
				return;
			}
			return;
		}
		if (Static38.method781(Static126.method2068(arg0)) && (Static147.anInt3804 & 0x20) == 32) {
			Static144.method2257(0, arg0.anInt1057, 33, Static111.aClass10_1098, Static3.method36(new Class10[] { Static121.aClass10_1190, Static3.aClass10_33, arg0.aClass10_501 }), arg0.anInt1056);
			return;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!fa;)Z")
	public static boolean method1023(@OriginalArg(1) Class23 arg0) {
		if (arg0.anIntArray124 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray124.length; local17++) {
			@Pc(24) int local24 = Static169.method2595(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray127[local17];
			if (arg0.anIntArray124[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray124[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray124[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZIII)V")
	public static void method1028(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg2; local7 <= arg2 + arg3; local7++) {
			for (@Pc(11) int local11 = arg0; local11 <= arg1 + arg0; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static99.aByteArrayArrayArray8[0][local11][local7] = 127;
					if (local11 == arg0 && local11 > 0) {
						Static162.anIntArrayArrayArray8[0][local11][local7] = Static162.anIntArrayArrayArray8[0][local11 - 1][local7];
					}
					if (local11 == arg0 + arg1 && local11 < 103) {
						Static162.anIntArrayArrayArray8[0][local11][local7] = Static162.anIntArrayArrayArray8[0][local11 + 1][local7];
					}
					if (arg2 == local7 && local7 > 0) {
						Static162.anIntArrayArrayArray8[0][local11][local7] = Static162.anIntArrayArrayArray8[0][local11][local7 - 1];
					}
					if (local7 == arg3 + arg2 && local7 < 103) {
						Static162.anIntArrayArrayArray8[0][local11][local7] = Static162.anIntArrayArrayArray8[0][local11][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!kh;Lclient!kh;)V")
	public static void method1031(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Class29 arg1) {
		Static29.aClass29_15 = arg1;
		aClass29_26 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method1035() {
		aClass10_606 = null;
		aClass10_605 = null;
		aClass29_26 = null;
		aClass18_6 = null;
		aClass10_604 = null;
		aClass10_607 = null;
		aClass10_608 = null;
	}
}
