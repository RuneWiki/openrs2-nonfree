import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!pd;")
	public static Class62 aClass62_4;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_1261 = Static72.method1077("Art");

	@OriginalMember(owner = "client!p", name = "c", descriptor = "J")
	public static volatile long aLong74 = 0L;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_1262 = Static72.method1077("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt1857 = -1;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	public static int anInt1858 = 0;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!u;")
	public static Class74 aClass74_1263 = Static72.method1077("Von:");

	@OriginalMember(owner = "client!p", name = "m", descriptor = "[I")
	public static int[] anIntArray260 = new int[2000];

	@OriginalMember(owner = "client!p", name = "n", descriptor = "[I")
	public static int[] anIntArray261 = new int[500];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public static void method1308() {
		for (@Pc(3) int local3 = -1; local3 < Static10.anInt320; local3++) {
			@Pc(10) int local10;
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static92.anIntArray267[local3];
			}
			@Pc(20) Class2_Sub2_Sub2_Sub1_Sub2 local20 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local10];
			if (local20 != null) {
				Static57.method953(local20, 1);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!sd;IBIIILclient!ob;II)V")
	public static void method1309(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class55 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static84.aBoolean73 && (Static17.aByteArrayArrayArray1[0][arg4][arg2] & 0x2) == 0) {
			if ((Static17.aByteArrayArrayArray1[arg3][arg4][arg2] & 0x10) != 0) {
				return;
			}
			if (Static61.method1095(arg3, arg4, arg2) != Static71.anInt1547) {
				return;
			}
		}
		if (Static109.anInt2400 > arg3) {
			Static109.anInt2400 = arg3;
		}
		@Pc(56) int local56 = Static56.anIntArrayArrayArray2[arg3][arg4][arg2];
		@Pc(68) int local68 = Static56.anIntArrayArrayArray2[arg3][arg4 + 1][arg2 + 1];
		@Pc(78) int local78 = Static56.anIntArrayArrayArray2[arg3][arg4 + 1][arg2];
		@Pc(88) int local88 = Static56.anIntArrayArrayArray2[arg3][arg4][arg2 + 1];
		@Pc(99) int local99 = local88 + local56 + local78 + local68 >> 2;
		@Pc(111) int local111 = (arg2 << 7) + arg4 + (arg7 << 14) + 1073741824;
		@Pc(115) Class2_Sub2_Sub14 local115 = Static2.method19(arg7);
		if (local115.anInt2271 == 0) {
			local111 += Integer.MIN_VALUE;
		}
		@Pc(129) int local129 = (arg1 << 6) + arg6;
		if (local115.anInt2252 == 1) {
			local129 += 256;
		}
		if (local115.method1555()) {
			Static66.method1016(arg2, arg4, arg1, arg3, local115);
		}
		@Pc(187) Class2_Sub2_Sub2 local187;
		if (arg6 != 22) {
			@Pc(285) int local285;
			if (arg6 == 10 || arg6 == 11) {
				if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
					local187 = local115.method1564(local68, local56, local78, local88, 10, arg1);
				} else {
					local187 = new Class2_Sub2_Sub2_Sub2(arg7, 10, arg1, local56, local78, local68, local88, local115.anInt2268, true, null);
				}
				if (local187 != null) {
					@Pc(269) int local269 = 0;
					@Pc(282) int local282;
					if (arg1 == 1 || arg1 == 3) {
						local282 = local115.anInt2279;
						local285 = local115.anInt2259;
					} else {
						local282 = local115.anInt2259;
						local285 = local115.anInt2279;
					}
					if (arg6 == 11) {
						local269 += 256;
					}
					if (arg0.method1624(arg3, arg4, arg2, local99, local285, local282, local187, local269, local111, local129) && local115.aBoolean95) {
						@Pc(317) int local317 = 15;
						if (local187 instanceof Class2_Sub2_Sub2_Sub5) {
							local317 = ((Class2_Sub2_Sub2_Sub5) local187).method1126() / 4;
							if (local317 > 30) {
								local317 = 30;
							}
						}
						for (@Pc(335) int local335 = 0; local335 <= local285; local335++) {
							for (@Pc(339) int local339 = 0; local339 <= local282; local339++) {
								if (local317 > Static45.aByteArrayArrayArray3[arg3][arg4 + local335][local339 + arg2]) {
									Static45.aByteArrayArrayArray3[arg3][arg4 + local335][arg2 + local339] = (byte) local317;
								}
							}
						}
					}
				}
				if (local115.anInt2242 != 0 && arg5 != null) {
					arg5.method1271(arg1, local115.anInt2259, arg2, local115.anInt2279, arg4, local115.aBoolean93);
				}
			} else if (arg6 >= 12) {
				if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
					local187 = local115.method1564(local68, local56, local78, local88, arg6, arg1);
				} else {
					local187 = new Class2_Sub2_Sub2_Sub2(arg7, arg6, arg1, local56, local78, local68, local88, local115.anInt2268, true, null);
				}
				arg0.method1624(arg3, arg4, arg2, local99, 1, 1, local187, 0, local111, local129);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg3 > 0) {
					Static113.anIntArrayArrayArray5[arg3][arg4][arg2] |= 0x924;
				}
				if (local115.anInt2242 != 0 && arg5 != null) {
					arg5.method1271(arg1, local115.anInt2259, arg2, local115.anInt2279, arg4, local115.aBoolean93);
				}
			} else if (arg6 == 0) {
				if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
					local187 = local115.method1564(local68, local56, local78, local88, 0, arg1);
				} else {
					local187 = new Class2_Sub2_Sub2_Sub2(arg7, 0, arg1, local56, local78, local68, local88, local115.anInt2268, true, null);
				}
				arg0.method1620(arg3, arg4, arg2, local99, local187, null, Static100.anIntArray315[arg1], 0, local111, local129);
				if (arg1 == 0) {
					if (local115.aBoolean95) {
						Static45.aByteArrayArrayArray3[arg3][arg4][arg2] = 50;
						Static45.aByteArrayArrayArray3[arg3][arg4][arg2 + 1] = 50;
					}
					if (local115.aBoolean92) {
						Static113.anIntArrayArrayArray5[arg3][arg4][arg2] |= 0x249;
					}
				} else if (arg1 == 1) {
					if (local115.aBoolean95) {
						Static45.aByteArrayArrayArray3[arg3][arg4][arg2 + 1] = 50;
						Static45.aByteArrayArrayArray3[arg3][arg4 + 1][arg2 + 1] = 50;
					}
					if (local115.aBoolean92) {
						Static113.anIntArrayArrayArray5[arg3][arg4][arg2 + 1] |= 0x492;
					}
				} else if (arg1 == 2) {
					if (local115.aBoolean95) {
						Static45.aByteArrayArrayArray3[arg3][arg4 + 1][arg2] = 50;
						Static45.aByteArrayArrayArray3[arg3][arg4 + 1][arg2 + 1] = 50;
					}
					if (local115.aBoolean92) {
						Static113.anIntArrayArrayArray5[arg3][arg4 + 1][arg2] |= 0x249;
					}
				} else if (arg1 == 3) {
					if (local115.aBoolean95) {
						Static45.aByteArrayArrayArray3[arg3][arg4][arg2] = 50;
						Static45.aByteArrayArrayArray3[arg3][arg4 + 1][arg2] = 50;
					}
					if (local115.aBoolean92) {
						Static113.anIntArrayArrayArray5[arg3][arg4][arg2] |= 0x492;
					}
				}
				if (local115.anInt2242 != 0 && arg5 != null) {
					arg5.method1276(arg6, local115.aBoolean93, arg4, arg2, arg1);
				}
				if (local115.anInt2254 != 16) {
					arg0.method1644(arg3, arg4, arg2, local115.anInt2254);
				}
			} else if (arg6 == 1) {
				if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
					local187 = local115.method1564(local68, local56, local78, local88, 1, arg1);
				} else {
					local187 = new Class2_Sub2_Sub2_Sub2(arg7, 1, arg1, local56, local78, local68, local88, local115.anInt2268, true, null);
				}
				arg0.method1620(arg3, arg4, arg2, local99, local187, null, Static112.anIntArray350[arg1], 0, local111, local129);
				if (local115.aBoolean95) {
					if (arg1 == 0) {
						Static45.aByteArrayArrayArray3[arg3][arg4][arg2 + 1] = 50;
					} else if (arg1 == 1) {
						Static45.aByteArrayArrayArray3[arg3][arg4 + 1][arg2 + 1] = 50;
					} else if (arg1 == 2) {
						Static45.aByteArrayArrayArray3[arg3][arg4 + 1][arg2] = 50;
					} else if (arg1 == 3) {
						Static45.aByteArrayArrayArray3[arg3][arg4][arg2] = 50;
					}
				}
				if (local115.anInt2242 != 0 && arg5 != null) {
					arg5.method1276(arg6, local115.aBoolean93, arg4, arg2, arg1);
				}
			} else {
				@Pc(946) int local946;
				@Pc(985) Class2_Sub2_Sub2 local985;
				if (arg6 == 2) {
					local946 = arg1 + 1 & 0x3;
					@Pc(970) Class2_Sub2_Sub2 local970;
					if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
						local970 = local115.method1564(local68, local56, local78, local88, 2, arg1 + 4);
						local985 = local115.method1564(local68, local56, local78, local88, 2, local946);
					} else {
						local970 = new Class2_Sub2_Sub2_Sub2(arg7, 2, arg1 + 4, local56, local78, local68, local88, local115.anInt2268, true, null);
						local985 = new Class2_Sub2_Sub2_Sub2(arg7, 2, local946, local56, local78, local68, local88, local115.anInt2268, true, null);
					}
					arg0.method1620(arg3, arg4, arg2, local99, local970, local985, Static100.anIntArray315[arg1], Static100.anIntArray315[local946], local111, local129);
					if (local115.aBoolean92) {
						if (arg1 == 0) {
							Static113.anIntArrayArrayArray5[arg3][arg4][arg2] |= 0x249;
							Static113.anIntArrayArrayArray5[arg3][arg4][arg2 + 1] |= 0x492;
						} else if (arg1 == 1) {
							Static113.anIntArrayArrayArray5[arg3][arg4][arg2 + 1] |= 0x492;
							Static113.anIntArrayArrayArray5[arg3][arg4 + 1][arg2] |= 0x249;
						} else if (arg1 == 2) {
							Static113.anIntArrayArrayArray5[arg3][arg4 + 1][arg2] |= 0x249;
							Static113.anIntArrayArrayArray5[arg3][arg4][arg2] |= 0x492;
						} else if (arg1 == 3) {
							Static113.anIntArrayArrayArray5[arg3][arg4][arg2] |= 0x492;
							Static113.anIntArrayArrayArray5[arg3][arg4][arg2] |= 0x249;
						}
					}
					if (local115.anInt2242 != 0 && arg5 != null) {
						arg5.method1276(arg6, local115.aBoolean93, arg4, arg2, arg1);
					}
					if (local115.anInt2254 != 16) {
						arg0.method1644(arg3, arg4, arg2, local115.anInt2254);
					}
				} else if (arg6 == 3) {
					if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
						local187 = local115.method1564(local68, local56, local78, local88, 3, arg1);
					} else {
						local187 = new Class2_Sub2_Sub2_Sub2(arg7, 3, arg1, local56, local78, local68, local88, local115.anInt2268, true, null);
					}
					arg0.method1620(arg3, arg4, arg2, local99, local187, null, Static112.anIntArray350[arg1], 0, local111, local129);
					if (local115.aBoolean95) {
						if (arg1 == 0) {
							Static45.aByteArrayArrayArray3[arg3][arg4][arg2 + 1] = 50;
						} else if (arg1 == 1) {
							Static45.aByteArrayArrayArray3[arg3][arg4 + 1][arg2 + 1] = 50;
						} else if (arg1 == 2) {
							Static45.aByteArrayArrayArray3[arg3][arg4 + 1][arg2] = 50;
						} else if (arg1 == 3) {
							Static45.aByteArrayArrayArray3[arg3][arg4][arg2] = 50;
						}
					}
					if (local115.anInt2242 != 0 && arg5 != null) {
						arg5.method1276(arg6, local115.aBoolean93, arg4, arg2, arg1);
					}
				} else if (arg6 == 9) {
					if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
						local187 = local115.method1564(local68, local56, local78, local88, arg6, arg1);
					} else {
						local187 = new Class2_Sub2_Sub2_Sub2(arg7, arg6, arg1, local56, local78, local68, local88, local115.anInt2268, true, null);
					}
					arg0.method1624(arg3, arg4, arg2, local99, 1, 1, local187, 0, local111, local129);
					if (local115.anInt2242 != 0 && arg5 != null) {
						arg5.method1271(arg1, local115.anInt2259, arg2, local115.anInt2279, arg4, local115.aBoolean93);
					}
				} else {
					if (local115.aBoolean90) {
						if (arg1 == 1) {
							local946 = local88;
							local88 = local68;
							local68 = local78;
							local78 = local56;
							local56 = local946;
						} else if (arg1 == 2) {
							local946 = local88;
							local88 = local78;
							local78 = local946;
							local946 = local68;
							local68 = local56;
							local56 = local946;
						} else if (arg1 == 3) {
							local946 = local88;
							local88 = local56;
							local56 = local78;
							local78 = local68;
							local68 = local946;
						}
					}
					if (arg6 == 4) {
						if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
							local187 = local115.method1564(local68, local56, local78, local88, 4, 0);
						} else {
							local187 = new Class2_Sub2_Sub2_Sub2(arg7, 4, 0, local56, local78, local68, local88, local115.anInt2268, true, null);
						}
						arg0.method1618(arg3, arg4, arg2, local99, local187, Static100.anIntArray315[arg1], arg1 * 512, 0, 0, local111, local129);
					} else if (arg6 == 5) {
						local946 = 16;
						local285 = arg0.method1638(arg3, arg4, arg2);
						if (local285 != 0) {
							local946 = Static2.method19(local285 >> 14 & 0x7FFF).anInt2254;
						}
						if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
							local985 = local115.method1564(local68, local56, local78, local88, 4, 0);
						} else {
							local985 = new Class2_Sub2_Sub2_Sub2(arg7, 4, 0, local56, local78, local68, local88, local115.anInt2268, true, null);
						}
						arg0.method1618(arg3, arg4, arg2, local99, local985, Static100.anIntArray315[arg1], arg1 * 512, local946 * Static69.anIntArray189[arg1], Static90.anIntArray264[arg1] * local946, local111, local129);
					} else if (arg6 == 6) {
						if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
							local187 = local115.method1564(local68, local56, local78, local88, 4, 0);
						} else {
							local187 = new Class2_Sub2_Sub2_Sub2(arg7, 4, 0, local56, local78, local68, local88, local115.anInt2268, true, null);
						}
						arg0.method1618(arg3, arg4, arg2, local99, local187, 256, arg1, 0, 0, local111, local129);
					} else if (arg6 == 7) {
						if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
							local187 = local115.method1564(local68, local56, local78, local88, 4, 0);
						} else {
							local187 = new Class2_Sub2_Sub2_Sub2(arg7, 4, 0, local56, local78, local68, local88, local115.anInt2268, true, null);
						}
						arg0.method1618(arg3, arg4, arg2, local99, local187, 512, arg1, 0, 0, local111, local129);
					} else if (arg6 == 8) {
						if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
							local187 = local115.method1564(local68, local56, local78, local88, 4, 0);
						} else {
							local187 = new Class2_Sub2_Sub2_Sub2(arg7, 4, 0, local56, local78, local68, local88, local115.anInt2268, true, null);
						}
						arg0.method1618(arg3, arg4, arg2, local99, local187, 768, arg1, 0, 0, local111, local129);
					}
				}
			}
		} else if (!Static84.aBoolean73 || local115.anInt2271 != 0 || local115.anInt2242 == 1 || local115.aBoolean91) {
			if (local115.anInt2268 == -1 && local115.anIntArray318 == null) {
				local187 = local115.method1564(local68, local56, local78, local88, 22, arg1);
			} else {
				local187 = new Class2_Sub2_Sub2_Sub2(arg7, 22, arg1, local56, local78, local68, local88, local115.anInt2268, true, null);
			}
			arg0.method1648(arg3, arg4, arg2, local99, local187, local111, local129);
			if (local115.anInt2242 == 1 && arg5 != null) {
				arg5.method1283(arg2, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1310() {
		aClass74_1261 = null;
		aClass62_4 = null;
		aClass74_1263 = null;
		aClass74_1262 = null;
		anIntArray260 = null;
		anIntArray261 = null;
		aString4 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method1311() {
		for (@Pc(23) Class2_Sub9 local23 = (Class2_Sub9) Static35.aClass13_69.method415(); local23 != null; local23 = (Class2_Sub9) Static35.aClass13_69.method414()) {
			if (local23.aClass2_Sub2_Sub14_1 != null) {
				local23.method807();
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lclient!fb;")
	public static Class2_Sub2_Sub6 method1312(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub6 local10 = (Class2_Sub2_Sub6) Static3.aClass16_3.method490((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static72.aClass26_16.method1358(arg0, 8);
		local10 = new Class2_Sub2_Sub6();
		if (local20 != null) {
			local10.method589(new Class2_Sub10(local20));
		}
		Static3.aClass16_3.method492(local10, (long) arg0);
		return local10;
	}
}
