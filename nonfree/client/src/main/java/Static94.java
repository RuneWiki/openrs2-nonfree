import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_67 = new Class157(75, -1);

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_73 = new Class221(18, -1);

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "S")
	public static short aShort31 = 205;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public static int anInt1826 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([[BII[[BILclient!km;III[[BLclient!eq;I[ZLclient!dr;)V")
	public static void method1858(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) Class121 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) Class63 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean[] arg11, @OriginalArg(13) Class37 arg12) {
		@Pc(53) int local53;
		if (arg9 != null && arg4 != null || arg4 != null && arg2 == 12 || arg9 != null && arg2 == 0) {
			@Pc(37) boolean[] local37 = arg9 != null && arg9.aBoolean140 ? Static267.aBooleanArrayArray5[arg2] : Static6.aBooleanArrayArray1[arg2];
			@Pc(64) Class63 local64;
			@Pc(82) byte local82;
			@Pc(99) int local99;
			@Pc(104) int local104;
			if (arg1 > 0) {
				if (arg10 > 0) {
					local53 = arg8[arg10 - 1][arg1 - 1] & 0xFF;
					if (local53 > 0) {
						local64 = Static364.method5843(local53 - 1);
						if (local64.anInt1560 != -1 && local64.aBoolean140) {
							local82 = arg0[arg10 - 1][arg1 - 1];
							local99 = arg3[arg10 - 1][arg1 - 1] * 2 + 4 & 0x7;
							local104 = Static98.method1972(local64, arg12);
							if (Static70.aBooleanArrayArray2[local82][local99]) {
								Static229.anIntArray391[0] = local64.anInt1560;
								Static142.anIntArray248[0] = local104;
								Static263.anIntArray430[0] = arg12.method3738() ? local64.anInt1559 : local64.anInt1570;
								Static261.anIntArray412[0] = local64.anInt1558;
								Static50.anIntArray73[0] = local64.anInt1557;
								Static335.anIntArray500[0] = 256;
							}
						}
					}
				}
				if (arg10 < arg7 - 1) {
					local53 = arg8[arg10 + 1][arg1 - 1] & 0xFF;
					if (local53 > 0) {
						local64 = Static364.method5843(local53 - 1);
						if (local64.anInt1560 != -1 && local64.aBoolean140) {
							local82 = arg0[arg10 + 1][arg1 - 1];
							local99 = arg3[arg10 + 1][arg1 - 1] * 2 + 6 & 0x7;
							local104 = Static98.method1972(local64, arg12);
							if (Static70.aBooleanArrayArray2[local82][local99]) {
								Static229.anIntArray391[2] = local64.anInt1560;
								Static142.anIntArray248[2] = local104;
								Static263.anIntArray430[2] = arg12.method3738() ? local64.anInt1559 : local64.anInt1570;
								Static261.anIntArray412[2] = local64.anInt1558;
								Static50.anIntArray73[2] = local64.anInt1557;
								Static335.anIntArray500[2] = 512;
							}
						}
					}
				}
			}
			if (arg1 < arg6 - 1) {
				if (arg10 > 0) {
					local53 = arg8[arg10 - 1][arg1 + 1] & 0xFF;
					if (local53 > 0) {
						local64 = Static364.method5843(local53 - 1);
						if (local64.anInt1560 != -1 && local64.aBoolean140) {
							local82 = arg0[arg10 - 1][arg1 + 1];
							local99 = arg3[arg10 - 1][arg1 + 1] * 2 + 2 & 0x7;
							local104 = Static98.method1972(local64, arg12);
							if (Static70.aBooleanArrayArray2[local82][local99]) {
								Static229.anIntArray391[6] = local64.anInt1560;
								Static142.anIntArray248[6] = local104;
								Static263.anIntArray430[6] = arg12.method3738() ? local64.anInt1559 : local64.anInt1570;
								Static261.anIntArray412[6] = local64.anInt1558;
								Static50.anIntArray73[6] = local64.anInt1557;
								Static335.anIntArray500[6] = 64;
							}
						}
					}
				}
				if (arg7 - 1 > arg10) {
					local53 = arg8[arg10 + 1][arg1 + 1] & 0xFF;
					if (local53 > 0) {
						local64 = Static364.method5843(local53 - 1);
						if (local64.anInt1560 != -1 && local64.aBoolean140) {
							local82 = arg0[arg10 + 1][arg1 + 1];
							local99 = arg3[arg10 + 1][arg1 + 1] * 2 & 0x7;
							local104 = Static98.method1972(local64, arg12);
							if (Static70.aBooleanArrayArray2[local82][local99]) {
								Static229.anIntArray391[4] = local64.anInt1560;
								Static142.anIntArray248[4] = local104;
								Static263.anIntArray430[4] = arg12.method3738() ? local64.anInt1559 : local64.anInt1570;
								Static261.anIntArray412[4] = local64.anInt1558;
								Static50.anIntArray73[4] = local64.anInt1557;
								Static335.anIntArray500[4] = 128;
							}
						}
					}
				}
			}
			@Pc(531) int local531;
			@Pc(536) int local536;
			@Pc(538) int local538;
			@Pc(519) byte local519;
			if (arg1 > 0) {
				local53 = arg8[arg10][arg1 - 1] & 0xFF;
				if (local53 > 0) {
					local64 = Static364.method5843(local53 - 1);
					if (local64.anInt1560 != -1) {
						local82 = arg0[arg10][arg1 - 1];
						local519 = arg3[arg10][arg1 - 1];
						if (local64.aBoolean140) {
							local104 = 2;
							local531 = local519 * 2 + 4;
							local536 = Static98.method1972(local64, arg12);
							for (local538 = 0; local538 < 3; local538++) {
								local104 &= 0x7;
								local531 &= 0x7;
								if (Static70.aBooleanArrayArray2[local82][local531] && Static50.anIntArray73[local104] <= local64.anInt1557) {
									Static229.anIntArray391[local104] = local64.anInt1560;
									Static142.anIntArray248[local104] = local536;
									Static263.anIntArray430[local104] = arg12.method3738() ? local64.anInt1559 : local64.anInt1570;
									Static261.anIntArray412[local104] = local64.anInt1558;
									if (local64.anInt1557 == Static50.anIntArray73[local104]) {
										Static335.anIntArray500[local104] |= 0x20;
									} else {
										Static335.anIntArray500[local104] = 32;
									}
									Static50.anIntArray73[local104] = local64.anInt1557;
								}
								local531++;
								local104--;
							}
							if (!local37[arg5 & 0x3]) {
								arg11[0] = Static267.aBooleanArrayArray5[local82][local519 + 2 & 0x3];
							}
						} else if (!local37[arg5 & 0x3]) {
							arg11[0] = Static6.aBooleanArrayArray1[local82][local519 + 2 & 0x3];
						}
					}
				}
			}
			if (arg6 - 1 > arg1) {
				local53 = arg8[arg10][arg1 + 1] & 0xFF;
				if (local53 > 0) {
					local64 = Static364.method5843(local53 - 1);
					if (local64.anInt1560 != -1) {
						local82 = arg0[arg10][arg1 + 1];
						local519 = arg3[arg10][arg1 + 1];
						if (local64.aBoolean140) {
							local104 = 4;
							local531 = local519 * 2 + 2;
							local536 = Static98.method1972(local64, arg12);
							for (local538 = 0; local538 < 3; local538++) {
								local531 &= 0x7;
								local104 &= 0x7;
								if (Static70.aBooleanArrayArray2[local82][local531] && local64.anInt1557 >= Static50.anIntArray73[local104]) {
									Static229.anIntArray391[local104] = local64.anInt1560;
									Static142.anIntArray248[local104] = local536;
									Static263.anIntArray430[local104] = arg12.method3738() ? local64.anInt1559 : local64.anInt1570;
									Static261.anIntArray412[local104] = local64.anInt1558;
									if (local64.anInt1557 == Static50.anIntArray73[local104]) {
										Static335.anIntArray500[local104] |= 0x10;
									} else {
										Static335.anIntArray500[local104] = 16;
									}
									Static50.anIntArray73[local104] = local64.anInt1557;
								}
								local104++;
								local531--;
							}
							if (!local37[arg5 + 2 & 0x3]) {
								arg11[2] = Static267.aBooleanArrayArray5[local82][local519 & 0x3];
							}
						} else if (!local37[arg5 + 2 & 0x3]) {
							arg11[2] = Static6.aBooleanArrayArray1[local82][local519 & 0x3];
						}
					}
				}
			}
			if (arg10 > 0) {
				local53 = arg8[arg10 - 1][arg1] & 0xFF;
				if (local53 > 0) {
					local64 = Static364.method5843(local53 - 1);
					if (local64.anInt1560 != -1) {
						local82 = arg0[arg10 - 1][arg1];
						local519 = arg3[arg10 - 1][arg1];
						if (local64.aBoolean140) {
							local104 = 6;
							local531 = local519 * 2 + 4;
							local536 = Static98.method1972(local64, arg12);
							for (local538 = 0; local538 < 3; local538++) {
								local531 &= 0x7;
								local104 &= 0x7;
								if (Static70.aBooleanArrayArray2[local82][local531] && local64.anInt1557 >= Static50.anIntArray73[local104]) {
									Static229.anIntArray391[local104] = local64.anInt1560;
									Static142.anIntArray248[local104] = local536;
									Static263.anIntArray430[local104] = arg12.method3738() ? local64.anInt1559 : local64.anInt1570;
									Static261.anIntArray412[local104] = local64.anInt1558;
									if (local64.anInt1557 == Static50.anIntArray73[local104]) {
										Static335.anIntArray500[local104] |= 0x8;
									} else {
										Static335.anIntArray500[local104] = 8;
									}
									Static50.anIntArray73[local104] = local64.anInt1557;
								}
								local531--;
								local104++;
							}
							if (!local37[arg5 + 3 & 0x3]) {
								arg11[3] = Static267.aBooleanArrayArray5[local82][local519 + 1 & 0x3];
							}
						} else if (!local37[arg5 + 3 & 0x3]) {
							arg11[3] = Static6.aBooleanArrayArray1[local82][local519 + 1 & 0x3];
						}
					}
				}
			}
			if (arg10 < arg7 - 1) {
				local53 = arg8[arg10 + 1][arg1] & 0xFF;
				if (local53 > 0) {
					local64 = Static364.method5843(local53 - 1);
					if (local64.anInt1560 != -1) {
						local82 = arg0[arg10 + 1][arg1];
						local519 = arg3[arg10 + 1][arg1];
						if (local64.aBoolean140) {
							local104 = 4;
							local531 = local519 * 2 + 6;
							local536 = Static98.method1972(local64, arg12);
							for (local538 = 0; local538 < 3; local538++) {
								local104 &= 0x7;
								local531 &= 0x7;
								if (Static70.aBooleanArrayArray2[local82][local531] && local64.anInt1557 >= Static50.anIntArray73[local104]) {
									Static229.anIntArray391[local104] = local64.anInt1560;
									Static142.anIntArray248[local104] = local536;
									Static263.anIntArray430[local104] = arg12.method3738() ? local64.anInt1559 : local64.anInt1570;
									Static261.anIntArray412[local104] = local64.anInt1558;
									if (local64.anInt1557 == Static50.anIntArray73[local104]) {
										Static335.anIntArray500[local104] |= 0x4;
									} else {
										Static335.anIntArray500[local104] = 4;
									}
									Static50.anIntArray73[local104] = local64.anInt1557;
								}
								local531++;
								local104--;
							}
							if (!local37[arg5 + 1 & 0x3]) {
								arg11[1] = Static267.aBooleanArrayArray5[local82][local519 + 3 & 0x3];
							}
						} else if (!local37[arg5 + 1 & 0x3]) {
							arg11[1] = Static6.aBooleanArrayArray1[local82][local519 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg9 == null) {
			return;
		}
		@Pc(1228) int local1228 = Static98.method1972(arg9, arg12);
		if (!arg9.aBoolean140) {
			return;
		}
		for (local53 = 0; local53 < 8; local53++) {
			@Pc(1244) int local1244 = local53 - arg5 * 2 & 0x7;
			if (Static70.aBooleanArrayArray2[arg2][local53] && arg9.anInt1557 >= Static50.anIntArray73[local1244]) {
				Static229.anIntArray391[local1244] = arg9.anInt1560;
				Static142.anIntArray248[local1244] = local1228;
				Static263.anIntArray430[local1244] = arg12.method3738() ? arg9.anInt1559 : arg9.anInt1570;
				Static261.anIntArray412[local1244] = arg9.anInt1558;
				if (Static50.anIntArray73[local1244] == arg9.anInt1557) {
					Static335.anIntArray500[local1244] |= 0x2;
				} else {
					Static335.anIntArray500[local1244] = 2;
				}
				Static50.anIntArray73[local1244] = arg9.anInt1557;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
	public static void method1859(@OriginalArg(1) int arg0) {
		if (Static146.method2839(arg0)) {
			Static67.method3654(-1, Static264.aClass68ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1860(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg0); local9 != -1; local9 = arg2.indexOf(arg0, local9 + arg1.length())) {
			arg2 = arg2.substring(0, local9) + arg1 + arg2.substring(local9 + arg0.length());
		}
		return arg2;
	}
}
