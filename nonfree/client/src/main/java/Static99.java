import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
	public static int anInt2511;

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
	public static int anInt2515;

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "J")
	public static long aLong80;

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lclient!pb;")
	public static Class31 aClass31_36;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1351 = Static23.method501("Please contact customer support)3");

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1356 = Static23.method501(" is already on your ignore list");

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1352 = aClass42_1356;

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1353 = Static23.method501("@yel@");

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1354 = Static23.method501("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1355 = aClass42_1351;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
	public static int anInt2518 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIIII)V")
	public static void method1728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static107.method1831(arg3) || (arg0 < arg6 || arg7 > arg5 || arg4 <= arg0 || arg1 <= arg5)) {
			return;
		}
		@Pc(31) Class1_Sub1_Sub12[] local31 = Static61.aClass1_Sub1_Sub12ArrayArray1[arg3];
		for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
			@Pc(39) Class1_Sub1_Sub12 local39 = local31[local33];
			if (local39 != null && local39.anInt2191 == arg9) {
				@Pc(56) int local56 = arg6 + local39.anInt2172;
				@Pc(63) int local63 = local39.anInt2161 + arg7 - arg2;
				if (local39.anInt2177 == 8 && arg0 >= local56 && arg5 >= local63 && local39.anInt2185 + local56 > arg0 && local39.anInt2183 + local63 > arg5) {
					Static103.anInt2663 = local33;
				}
				if ((local39.anInt2164 >= 0 || local39.anInt2181 != 0) && local56 <= arg0 && arg5 >= local63 && local39.anInt2185 + local56 > arg0 && local39.anInt2183 + local63 > arg5) {
					if (local39.anInt2164 >= 0) {
						Static70.anInt1793 = local39.anInt2164;
					} else {
						Static70.anInt1793 = local33;
					}
				}
				if (local39.anInt2177 != 0) {
					if (local39.anInt2156 == 1 && local56 <= arg0 && arg5 >= local63 && arg0 < local56 + local39.anInt2185 && arg5 < local39.anInt2183 + local63) {
						@Pc(245) boolean local245 = false;
						if (local39.anInt2160 != 0) {
							local245 = Static101.method1775(local39);
						}
						if (!local245) {
							Static69.method1232(0, Static11.aClass42_195, local39.aClass42_1171, 0, 42, local33 + (arg3 << 16));
						}
					}
					if (local39.anInt2156 == 2 && Static12.anInt362 == 0 && arg0 >= local56 && local63 <= arg5 && local56 + local39.anInt2185 > arg0 && local63 + local39.anInt2183 > arg5) {
						Static69.method1232(0, Static57.method1822(new Class42[] { Static45.aClass42_961, local39.aClass42_1162 }), local39.aClass42_1164, 0, 49, local33 + (arg3 << 16));
					}
					if (local39.anInt2156 == 3 && arg0 >= local56 && arg5 >= local63 && arg0 < local56 + local39.anInt2185 && local63 + local39.anInt2183 > arg5) {
						@Pc(378) byte local378;
						if (arg8 == 3) {
							local378 = 55;
						} else {
							local378 = 54;
						}
						Static69.method1232(0, Static11.aClass42_195, Static15.aClass42_305, 0, local378, (arg3 << 16) + local33);
					}
					if (local39.anInt2156 == 4 && arg0 >= local56 && local63 <= arg5 && local39.anInt2185 + local56 > arg0 && arg5 < local63 + local39.anInt2183) {
						Static69.method1232(0, Static11.aClass42_195, local39.aClass42_1171, 0, 15, local33 + (arg3 << 16));
					}
					if (local39.anInt2156 == 5 && local56 <= arg0 && local63 <= arg5 && arg0 < local56 + local39.anInt2185 && arg5 < local39.anInt2183 + local63) {
						Static69.method1232(0, Static11.aClass42_195, local39.aClass42_1171, 0, 8, (arg3 << 16) + local33);
					}
					if (local39.anInt2156 == 6 && !Static62.aBoolean87 && local56 <= arg0 && arg5 >= local63 && local39.anInt2185 + local56 > arg0 && arg5 < local39.anInt2183 + local63) {
						Static69.method1232(0, Static11.aClass42_195, local39.aClass42_1171, 0, 22, (arg3 << 16) + local33);
					}
					if (local39.anInt2177 == 2) {
						@Pc(556) int local556 = 0;
						for (@Pc(558) int local558 = 0; local558 < local39.anInt2183; local558++) {
							for (@Pc(562) int local562 = 0; local562 < local39.anInt2185; local562++) {
								@Pc(574) int local574 = (local39.anInt2153 + 32) * local562 + local56;
								@Pc(583) int local583 = local63 + local558 * (local39.anInt2174 + 32);
								if (local556 < 20) {
									local574 += local39.anIntArray334[local556];
									local583 += local39.anIntArray331[local556];
								}
								if (arg0 >= local574 && arg5 >= local583 && arg0 < local574 + 32 && local583 + 32 > arg5) {
									Static98.anInt2491 = local556;
									Static109.anInt2762 = (arg3 << 16) + local33;
									if (local39.anIntArray332[local556] > 0) {
										@Pc(643) Class1_Sub1_Sub2 local643 = Static36.method617(local39.anIntArray332[local556] - 1);
										if (Static35.anInt874 == 1 && local39.aBoolean119) {
											if (anInt2515 != (arg3 << 16) + local33 || local556 != Static81.anInt2124) {
												Static69.method1232(local556, Static57.method1822(new Class42[] { Static53.aClass42_1432, Static69.aClass42_898, local643.aClass42_120 }), Static67.aClass42_862, local643.anInt189, 28, (arg3 << 16) + local33);
											}
										} else if (Static12.anInt362 != 1 || !local39.aBoolean119) {
											@Pc(708) Class42[] local708 = local643.aClass42Array1;
											if (Static105.aBoolean148) {
												local708 = Static70.method1258(local708);
											}
											@Pc(719) int local719;
											@Pc(734) byte local734;
											if (local39.aBoolean119) {
												for (local719 = 4; local719 >= 3; local719--) {
													if (local708 != null && local708[local719] != null) {
														if (local719 == 3) {
															local734 = 18;
														} else {
															local734 = 38;
														}
														Static69.method1232(local556, Static57.method1822(new Class42[] { Static28.aClass42_438, local643.aClass42_120 }), local708[local719], local643.anInt189, local734, (arg3 << 16) + local33);
													} else if (local719 == 4) {
														Static69.method1232(local556, Static57.method1822(new Class42[] { Static28.aClass42_438, local643.aClass42_120 }), Static65.aClass42_835, local643.anInt189, 38, local33 + (arg3 << 16));
													}
												}
											}
											if (local39.aBoolean123) {
												Static69.method1232(local556, Static57.method1822(new Class42[] { Static28.aClass42_438, local643.aClass42_120 }), Static67.aClass42_862, local643.anInt189, 46, (arg3 << 16) + local33);
											}
											if (local39.aBoolean119 && local708 != null) {
												for (local719 = 2; local719 >= 0; local719--) {
													if (local708[local719] != null) {
														local734 = 0;
														if (local719 == 0) {
															local734 = 56;
														}
														if (local719 == 1) {
															local734 = 50;
														}
														if (local719 == 2) {
															local734 = 9;
														}
														Static69.method1232(local556, Static57.method1822(new Class42[] { Static28.aClass42_438, local643.aClass42_120 }), local708[local719], local643.anInt189, local734, local33 + (arg3 << 16));
													}
												}
											}
											local708 = local39.aClass42Array10;
											if (Static105.aBoolean148) {
												local708 = Static70.method1258(local708);
											}
											if (local708 != null) {
												for (local719 = 4; local719 >= 0; local719--) {
													if (local708[local719] != null) {
														local734 = 0;
														if (local719 == 0) {
															local734 = 39;
														}
														if (local719 == 1) {
															local734 = 51;
														}
														if (local719 == 2) {
															local734 = 53;
														}
														if (local719 == 3) {
															local734 = 40;
														}
														if (local719 == 4) {
															local734 = 11;
														}
														Static69.method1232(local556, Static57.method1822(new Class42[] { Static28.aClass42_438, local643.aClass42_120 }), local708[local719], local643.anInt189, local734, local33 + (arg3 << 16));
													}
												}
											}
											Static69.method1232(local556, Static57.method1822(new Class42[] { Static28.aClass42_438, local643.aClass42_120 }), Static73.aClass42_970, local643.anInt189, 1001, local33 + (arg3 << 16));
										} else if ((Static82.anInt2193 & 0x10) == 16) {
											Static69.method1232(local556, Static57.method1822(new Class42[] { Static70.aClass42_916, Static69.aClass42_898, local643.aClass42_120 }), Static83.aClass42_1187, local643.anInt189, 52, local33 + (arg3 << 16));
										}
									}
								}
								local556++;
							}
						}
					}
				} else if (!local39.aBoolean122 || Static59.method1428(arg8, local33) || Static18.aBoolean27) {
					method1728(arg0, local63 + local39.anInt2183, local39.anInt2152, arg3, local39.anInt2185 + local56, arg5, local56, local63, arg8, local33);
					if (local39.anInt2192 > local39.anInt2183) {
						Static38.method645(local39.anInt2185 + local56, arg0, arg5, local39.anInt2192, local39, arg8, local39.anInt2183, local63);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BI)Z")
	public static boolean method1730(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static1.anIntArray1[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 3;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method1731() {
		aClass42_1352 = null;
		aClass42_1356 = null;
		aClass42_1354 = null;
		anIntArray378 = null;
		aClass42_1351 = null;
		aClass42_1353 = null;
		aClass31_36 = null;
		aClass42_1355 = null;
	}
}
