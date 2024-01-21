import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	public static int anInt2090;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
	public static int anInt2089 = 10;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_929 = Static134.method2017("<img=0>");

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "Lclient!v;")
	public static Class76 aClass76_930 = Static134.method2017(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
	public static int[] anIntArray289 = new int[5];

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "[I")
	public static int[] anIntArray290 = new int[1000];

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!pa", name = "E", descriptor = "Lclient!v;")
	private static Class76 aClass76_931 = Static134.method2017("You have only just left another world)3");

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "Lclient!v;")
	public static Class76 aClass76_932 = aClass76_931;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lclient!lc;")
	public static Class4_Sub4_Sub10 method1465(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4_Sub10 local10 = (Class4_Sub4_Sub10) Static82.aClass72_21.method1781((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static48.aClass17_18.method290(9, arg0);
		local10 = new Class4_Sub4_Sub10();
		local10.anInt1709 = arg0;
		if (local20 != null) {
			local10.method1127(new Class4_Sub10(local20));
		}
		local10.method1131();
		Static82.aClass72_21.method1783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Lclient!wb;")
	public static Class4_Sub4_Sub17 method1466(@OriginalArg(1) int arg0) {
		@Pc(20) Class4_Sub4_Sub17 local20 = (Class4_Sub4_Sub17) Static3.aClass72_23.method1781((long) arg0);
		if (local20 != null) {
			return local20;
		}
		local20 = Static14.method172(Static63.aClass17_22, Static55.aClass17_20, arg0);
		if (local20 != null) {
			Static3.aClass72_23.method1783(local20, (long) arg0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!la;Lclient!v;ZLclient!la;Lclient!v;)Lclient!mb;")
	public static Class4_Sub4_Sub5_Sub3_Sub1 method1467(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(3) Class17 arg2, @OriginalArg(4) Class76 arg3) {
		@Pc(8) int local8 = arg2.method299(arg3);
		@Pc(19) int local19 = arg2.method298(arg1, local8);
		return Static110.method1679(arg2, arg0, local19, local8);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!wc;Lclient!na;IIIIII)V")
	public static void method1468(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static76.aBoolean119 && (Static62.aByteArrayArrayArray4[0][arg0][arg3] & 0x2) == 0) {
			if ((Static62.aByteArrayArrayArray4[arg6][arg0][arg3] & 0x10) != 0) {
				return;
			}
			if (Static38.method739(arg0, arg6, arg3) != Static8.anInt164) {
				return;
			}
		}
		if (arg6 < Static132.anInt2824) {
			Static132.anInt2824 = arg6;
		}
		@Pc(51) Class4_Sub4_Sub8 local51 = Static104.method1600(arg4);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg5 == 1 || arg5 == 3) {
			local62 = local51.anInt1505;
			local65 = local51.anInt1498;
		} else {
			local62 = local51.anInt1498;
			local65 = local51.anInt1505;
		}
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (arg0 + local62 <= 104) {
			local85 = arg0 + (local62 >> 1);
			local94 = arg0 + (local62 + 1 >> 1);
		} else {
			local85 = arg0;
			local94 = arg0 + 1;
		}
		@Pc(113) int local113;
		@Pc(111) int local111;
		if (local65 + arg3 > 104) {
			local111 = arg3 + 1;
			local113 = arg3;
		} else {
			local111 = arg3 + (local65 + 1 >> 1);
			local113 = arg3 + (local65 >> 1);
		}
		@Pc(135) int[][] local135 = Static66.anIntArrayArrayArray3[arg6];
		@Pc(144) int local144 = (arg0 << 7) + (local62 << 6);
		@Pc(171) int local171 = local135[local94][local113] + local135[local85][local113] + local135[local85][local111] + local135[local94][local111] >> 2;
		@Pc(179) int local179 = (local65 << 6) + (arg3 << 7);
		@Pc(191) int local191 = (arg4 << 14) + (arg3 << 7) + arg0 + 1073741824;
		if (local51.anInt1511 == 0) {
			local191 += Integer.MIN_VALUE;
		}
		@Pc(207) int local207 = arg7 + (arg5 << 6);
		if (local51.anInt1520 == 1) {
			local207 += 256;
		}
		if (local51.method998()) {
			Static32.method479(local51, arg0, arg5, arg6, arg3);
		}
		@Pc(267) Class4_Sub4_Sub3 local267;
		if (arg7 != 22) {
			@Pc(376) int local376;
			if (arg7 == 10 || arg7 == 11) {
				if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
					local267 = local51.method1003(local179, local171, arg5, 10, local135, local144);
				} else {
					local267 = new Class4_Sub4_Sub3_Sub6(arg4, 10, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
				}
				if (local267 != null && arg1.method1959(arg6, arg0, arg3, local171, local62, local65, local267, arg7 == 11 ? 256 : 0, local191, local207) && local51.aBoolean91) {
					local376 = 15;
					if (local267 instanceof Class4_Sub4_Sub3_Sub7) {
						local376 = ((Class4_Sub4_Sub3_Sub7) local267).method1778() / 4;
						if (local376 > 30) {
							local376 = 30;
						}
					}
					for (@Pc(392) int local392 = 0; local392 <= local62; local392++) {
						for (@Pc(396) int local396 = 0; local396 <= local65; local396++) {
							if (local376 > Static84.aByteArrayArrayArray5[arg6][local392 + arg0][local396 + arg3]) {
								Static84.aByteArrayArrayArray5[arg6][arg0 + local392][arg3 + local396] = (byte) local376;
							}
						}
					}
				}
				if (local51.anInt1500 != 0 && arg2 != null) {
					arg2.method1374(local62, local51.aBoolean89, arg3, arg0, local65);
				}
			} else if (arg7 >= 12) {
				if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
					local267 = local51.method1003(local179, local171, arg5, arg7, local135, local144);
				} else {
					local267 = new Class4_Sub4_Sub3_Sub6(arg4, arg7, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
				}
				arg1.method1959(arg6, arg0, arg3, local171, 1, 1, local267, 0, local191, local207);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg6 > 0) {
					Static29.anIntArrayArrayArray1[arg6][arg0][arg3] |= 0x924;
				}
				if (local51.anInt1500 != 0 && arg2 != null) {
					arg2.method1374(local62, local51.aBoolean89, arg3, arg0, local65);
				}
			} else if (arg7 == 0) {
				if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
					local267 = local51.method1003(local179, local171, arg5, 0, local135, local144);
				} else {
					local267 = new Class4_Sub4_Sub3_Sub6(arg4, 0, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
				}
				arg1.method1995(arg6, arg0, arg3, local171, local267, null, Static69.anIntArray238[arg5], 0, local191, local207);
				if (arg5 == 0) {
					if (local51.aBoolean91) {
						Static84.aByteArrayArrayArray5[arg6][arg0][arg3] = 50;
						Static84.aByteArrayArrayArray5[arg6][arg0][arg3 + 1] = 50;
					}
					if (local51.aBoolean92) {
						Static29.anIntArrayArrayArray1[arg6][arg0][arg3] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (local51.aBoolean91) {
						Static84.aByteArrayArrayArray5[arg6][arg0][arg3 + 1] = 50;
						Static84.aByteArrayArrayArray5[arg6][arg0 + 1][arg3 + 1] = 50;
					}
					if (local51.aBoolean92) {
						Static29.anIntArrayArrayArray1[arg6][arg0][arg3 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (local51.aBoolean91) {
						Static84.aByteArrayArrayArray5[arg6][arg0 + 1][arg3] = 50;
						Static84.aByteArrayArrayArray5[arg6][arg0 + 1][arg3 + 1] = 50;
					}
					if (local51.aBoolean92) {
						Static29.anIntArrayArrayArray1[arg6][arg0 + 1][arg3] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (local51.aBoolean91) {
						Static84.aByteArrayArrayArray5[arg6][arg0][arg3] = 50;
						Static84.aByteArrayArrayArray5[arg6][arg0 + 1][arg3] = 50;
					}
					if (local51.aBoolean92) {
						Static29.anIntArrayArrayArray1[arg6][arg0][arg3] |= 0x492;
					}
				}
				if (local51.anInt1500 != 0 && arg2 != null) {
					arg2.method1376(arg0, local51.aBoolean89, arg3, arg5, arg7);
				}
				if (local51.anInt1503 != 16) {
					arg1.method1952(arg6, arg0, arg3, local51.anInt1503);
				}
			} else if (arg7 == 1) {
				if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
					local267 = local51.method1003(local179, local171, arg5, 1, local135, local144);
				} else {
					local267 = new Class4_Sub4_Sub3_Sub6(arg4, 1, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
				}
				arg1.method1995(arg6, arg0, arg3, local171, local267, null, Static40.anIntArray128[arg5], 0, local191, local207);
				if (local51.aBoolean91) {
					if (arg5 == 0) {
						Static84.aByteArrayArrayArray5[arg6][arg0][arg3 + 1] = 50;
					} else if (arg5 == 1) {
						Static84.aByteArrayArrayArray5[arg6][arg0 + 1][arg3 + 1] = 50;
					} else if (arg5 == 2) {
						Static84.aByteArrayArrayArray5[arg6][arg0 + 1][arg3] = 50;
					} else if (arg5 == 3) {
						Static84.aByteArrayArrayArray5[arg6][arg0][arg3] = 50;
					}
				}
				if (local51.anInt1500 != 0 && arg2 != null) {
					arg2.method1376(arg0, local51.aBoolean89, arg3, arg5, arg7);
				}
			} else {
				@Pc(981) int local981;
				@Pc(1012) Class4_Sub4_Sub3 local1012;
				if (arg7 == 2) {
					local981 = arg5 + 1 & 0x3;
					@Pc(1002) Class4_Sub4_Sub3 local1002;
					if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
						local1002 = local51.method1003(local179, local171, arg5 + 4, 2, local135, local144);
						local1012 = local51.method1003(local179, local171, local981, 2, local135, local144);
					} else {
						local1002 = new Class4_Sub4_Sub3_Sub6(arg4, 2, arg5 + 4, arg6, arg0, arg3, local51.anInt1487, true, null);
						local1012 = new Class4_Sub4_Sub3_Sub6(arg4, 2, local981, arg6, arg0, arg3, local51.anInt1487, true, null);
					}
					arg1.method1995(arg6, arg0, arg3, local171, local1002, local1012, Static69.anIntArray238[arg5], Static69.anIntArray238[local981], local191, local207);
					if (local51.aBoolean92) {
						if (arg5 == 0) {
							Static29.anIntArrayArrayArray1[arg6][arg0][arg3] |= 0x249;
							Static29.anIntArrayArrayArray1[arg6][arg0][arg3 + 1] |= 0x492;
						} else if (arg5 == 1) {
							Static29.anIntArrayArrayArray1[arg6][arg0][arg3 + 1] |= 0x492;
							Static29.anIntArrayArrayArray1[arg6][arg0 + 1][arg3] |= 0x249;
						} else if (arg5 == 2) {
							Static29.anIntArrayArrayArray1[arg6][arg0 + 1][arg3] |= 0x249;
							Static29.anIntArrayArrayArray1[arg6][arg0][arg3] |= 0x492;
						} else if (arg5 == 3) {
							Static29.anIntArrayArrayArray1[arg6][arg0][arg3] |= 0x492;
							Static29.anIntArrayArrayArray1[arg6][arg0][arg3] |= 0x249;
						}
					}
					if (local51.anInt1500 != 0 && arg2 != null) {
						arg2.method1376(arg0, local51.aBoolean89, arg3, arg5, arg7);
					}
					if (local51.anInt1503 != 16) {
						arg1.method1952(arg6, arg0, arg3, local51.anInt1503);
					}
				} else if (arg7 == 3) {
					if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
						local267 = local51.method1003(local179, local171, arg5, 3, local135, local144);
					} else {
						local267 = new Class4_Sub4_Sub3_Sub6(arg4, 3, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
					}
					arg1.method1995(arg6, arg0, arg3, local171, local267, null, Static40.anIntArray128[arg5], 0, local191, local207);
					if (local51.aBoolean91) {
						if (arg5 == 0) {
							Static84.aByteArrayArrayArray5[arg6][arg0][arg3 + 1] = 50;
						} else if (arg5 == 1) {
							Static84.aByteArrayArrayArray5[arg6][arg0 + 1][arg3 + 1] = 50;
						} else if (arg5 == 2) {
							Static84.aByteArrayArrayArray5[arg6][arg0 + 1][arg3] = 50;
						} else if (arg5 == 3) {
							Static84.aByteArrayArrayArray5[arg6][arg0][arg3] = 50;
						}
					}
					if (local51.anInt1500 != 0 && arg2 != null) {
						arg2.method1376(arg0, local51.aBoolean89, arg3, arg5, arg7);
					}
				} else if (arg7 == 9) {
					if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
						local267 = local51.method1003(local179, local171, arg5, arg7, local135, local144);
					} else {
						local267 = new Class4_Sub4_Sub3_Sub6(arg4, arg7, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
					}
					arg1.method1959(arg6, arg0, arg3, local171, 1, 1, local267, 0, local191, local207);
					if (local51.anInt1500 != 0 && arg2 != null) {
						arg2.method1374(local62, local51.aBoolean89, arg3, arg0, local65);
					}
					if (local51.anInt1503 != 16) {
						arg1.method1952(arg6, arg0, arg3, local51.anInt1503);
					}
				} else if (arg7 == 4) {
					if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
						local267 = local51.method1003(local179, local171, arg5, 4, local135, local144);
					} else {
						local267 = new Class4_Sub4_Sub3_Sub6(arg4, 4, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
					}
					arg1.method1969(arg6, arg0, arg3, local171, local267, null, Static69.anIntArray238[arg5], 0, 0, 0, local191, local207);
				} else if (arg7 == 5) {
					local981 = 16;
					local376 = arg1.method1954(arg6, arg0, arg3);
					if (local376 != 0) {
						local981 = Static104.method1600(local376 >> 14 & 0x7FFF).anInt1503;
					}
					if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
						local1012 = local51.method1003(local179, local171, arg5, 4, local135, local144);
					} else {
						local1012 = new Class4_Sub4_Sub3_Sub6(arg4, 4, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
					}
					arg1.method1969(arg6, arg0, arg3, local171, local1012, null, Static69.anIntArray238[arg5], 0, Static2.anIntArray10[arg5] * local981, local981 * Static66.anIntArray228[arg5], local191, local207);
				} else if (arg7 == 6) {
					local981 = 8;
					local376 = arg1.method1954(arg6, arg0, arg3);
					if (local376 != 0) {
						local981 = Static104.method1600(local376 >> 14 & 0x7FFF).anInt1503 / 2;
					}
					if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
						local1012 = local51.method1003(local179, local171, arg5 + 4, 4, local135, local144);
					} else {
						local1012 = new Class4_Sub4_Sub3_Sub6(arg4, 4, arg5 + 4, arg6, arg0, arg3, local51.anInt1487, true, null);
					}
					arg1.method1969(arg6, arg0, arg3, local171, local1012, null, 256, arg5, local981 * Static18.anIntArray46[arg5], Static77.anIntArray264[arg5] * local981, local191, local207);
				} else if (arg7 == 7) {
					local376 = arg5 + 2 & 0x3;
					if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
						local267 = local51.method1003(local179, local171, local376 + 4, 4, local135, local144);
					} else {
						local267 = new Class4_Sub4_Sub3_Sub6(arg4, 4, local376 + 4, arg6, arg0, arg3, local51.anInt1487, true, null);
					}
					arg1.method1969(arg6, arg0, arg3, local171, local267, null, 256, local376, 0, 0, local191, local207);
				} else if (arg7 == 8) {
					local981 = 8;
					local376 = arg1.method1954(arg6, arg0, arg3);
					if (local376 != 0) {
						local981 = Static104.method1600(local376 >> 14 & 0x7FFF).anInt1503 / 2;
					}
					@Pc(1788) int local1788 = arg5 + 2 & 0x3;
					@Pc(1827) Class4_Sub4_Sub3 local1827;
					if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
						local1012 = local51.method1003(local179, local171, arg5 + 4, 4, local135, local144);
						local1827 = local51.method1003(local179, local171, local1788 + 4, 4, local135, local144);
					} else {
						local1012 = new Class4_Sub4_Sub3_Sub6(arg4, 4, arg5 + 4, arg6, arg0, arg3, local51.anInt1487, true, null);
						local1827 = new Class4_Sub4_Sub3_Sub6(arg4, 4, local1788 + 4, arg6, arg0, arg3, local51.anInt1487, true, null);
					}
					arg1.method1969(arg6, arg0, arg3, local171, local1012, local1827, 256, arg5, Static18.anIntArray46[arg5] * local981, Static77.anIntArray264[arg5] * local981, local191, local207);
				}
			}
		} else if (!Static76.aBoolean119 || local51.anInt1511 != 0 || local51.anInt1500 == 1 || local51.aBoolean94) {
			if (local51.anInt1487 == -1 && local51.anIntArray192 == null) {
				local267 = local51.method1003(local179, local171, arg5, 22, local135, local144);
			} else {
				local267 = new Class4_Sub4_Sub3_Sub6(arg4, 22, arg5, arg6, arg0, arg3, local51.anInt1487, true, null);
			}
			arg1.method1993(arg6, arg0, arg3, local171, local267, local191, local207);
			if (local51.anInt1500 == 1 && arg2 != null) {
				arg2.method1387(arg3, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	public static void method1469() {
		aClass76_932 = null;
		aClass76_929 = null;
		anIntArray289 = null;
		aClass76_930 = null;
		aClass76_931 = null;
		anIntArray290 = null;
	}
}
