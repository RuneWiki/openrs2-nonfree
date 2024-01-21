import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
	public static int anInt2308;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
	public static int[] anIntArray311 = new int[25];

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!na;")
	private static Class53 aClass53_1111 = Static109.method1737("Loading title screen )2 ");

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_1107 = aClass53_1111;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_1108 = Static109.method1737(":tradereq:");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!na;")
	private static Class53 aClass53_1109 = Static109.method1737("Loading sprites )2 ");

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!na;")
	private static Class53 aClass53_1110 = Static109.method1737("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Z")
	public static boolean aBoolean96 = true;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "[I")
	public static int[] anIntArray313 = new int[128];

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public static int anInt2312 = -1;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1112 = aClass53_1110;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_1113 = aClass53_1109;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1627() {
		anIntArray313 = null;
		aClass53_1109 = null;
		aClass53_1108 = null;
		aClass53_1111 = null;
		anIntArray311 = null;
		aClass53_1110 = null;
		aClass53_1113 = null;
		aClass53_1107 = null;
		aClass53_1112 = null;
		anIntArray312 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method1628() {
		try {
			if (Static40.anInt1183 == 1) {
				@Pc(10) int local10 = Static120.aClass3_Sub10_Sub4_2.method1900();
				if (local10 > 0 && Static120.aClass3_Sub10_Sub4_2.method1899()) {
					local10 -= Static62.anInt1638;
					if (local10 < 0) {
						local10 = 0;
					}
					Static120.aClass3_Sub10_Sub4_2.method1893(local10);
					return;
				}
				Static120.aClass3_Sub10_Sub4_2.method1887();
				Static120.aClass3_Sub10_Sub4_2.method1875();
				Static77.aClass3_Sub6_1 = null;
				Static23.aClass68_1 = null;
				if (Static22.aClass62_4 == null) {
					Static40.anInt1183 = 0;
				} else {
					Static40.anInt1183 = 2;
				}
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static120.aClass3_Sub10_Sub4_2.method1887();
			Static23.aClass68_1 = null;
			Static40.anInt1183 = 0;
			Static77.aClass3_Sub6_1 = null;
			Static22.aClass62_4 = null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)Lclient!qc;")
	public static Class3_Sub1_Sub11 method1629(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub11 local6 = (Class3_Sub1_Sub11) Static107.aClass75_67.method1728((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static79.aClass62_16.method1512(12, arg0);
		local6 = new Class3_Sub1_Sub11();
		if (local20 != null) {
			local6.method1558(new Class3_Sub7(local20));
		}
		local6.method1563();
		Static107.aClass75_67.method1730(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
	public static void method1630(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub18 local8 = (Class3_Sub18) Static38.aClass77_4.method1805((long) arg0);
		if (local8 != null) {
			for (@Pc(21) int local21 = 0; local21 < local8.anIntArray374.length; local21++) {
				local8.anIntArray374[local21] = -1;
				local8.anIntArray373[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method1631() {
		if (!Static83.aBoolean77) {
			return;
		}
		Static48.aClass3_Sub1_Sub5_Sub3_12 = null;
		Static32.aClass3_Sub1_Sub5_Sub3_9 = null;
		Static119.aClass3_Sub1_Sub5_Sub3_5 = null;
		Static18.aClass27_6 = null;
		Static18.anIntArray50 = null;
		Static75.aClass27_30 = null;
		Static87.aClass27_33 = null;
		Static118.anIntArray388 = null;
		Static71.anIntArray229 = null;
		Static11.aClass27_4 = null;
		Static121.aClass27_46 = null;
		Static80.aClass3_Sub1_Sub5_Sub3_18 = null;
		Static62.aClass27_25 = null;
		Static15.anIntArray32 = null;
		Static101.aClass3_Sub1_Sub5_Sub3_22 = null;
		Static73.aClass3_Sub1_Sub5_Sub3_15 = null;
		Static106.aClass3_Sub1_Sub5_Sub3_24 = null;
		Static123.aClass3_Sub1_Sub5_Sub3_26 = null;
		Static27.aClass27_13 = null;
		Static111.aClass27_40 = null;
		Static41.aClass3_Sub1_Sub5_Sub3Array3 = null;
		Static109.anIntArray333 = null;
		Static96.aClass3_Sub1_Sub5_Sub3_13 = null;
		Static60.aClass27_22 = null;
		Static114.aClass27_41 = null;
		Static38.aClass3_Sub1_Sub5_Sub3_10 = null;
		Static78.aClass3_Sub1_Sub5_Sub3_16 = null;
		Static33.aClass3_Sub1_Sub5_Sub3_17 = null;
		Static72.aClass3_Sub1_Sub5_Sub3_14 = null;
		Static85.anIntArray269 = null;
		Static118.aClass27_44 = null;
		Static83.aBoolean77 = false;
		Static54.aClass27_48 = null;
		Static126.aClass3_Sub1_Sub5_Sub3_20 = null;
		Static62.aClass27_24 = null;
		Static69.anIntArray224 = null;
		Static111.aClass27_39 = null;
		Static58.aClass27_21 = null;
		Static105.aClass3_Sub1_Sub5_Sub3_23 = null;
		Static108.aClass3_Sub1_Sub5_Sub3_25 = null;
		Static68.aClass27_27 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!vb;)I")
	public static int method1632(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub15 arg1) {
		if (arg1.anIntArrayArray29 == null || arg0 >= arg1.anIntArrayArray29.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray29[arg0];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(33) int local33 = 0;
				@Pc(38) int local38 = local20[local24++];
				@Pc(40) byte local40 = 0;
				if (local38 == 0) {
					return local22;
				}
				if (local38 == 15) {
					local40 = 1;
				}
				if (local38 == 1) {
					local33 = anIntArray311[local20[local24++]];
				}
				if (local38 == 2) {
					local33 = Static9.anIntArray21[local20[local24++]];
				}
				if (local38 == 16) {
					local40 = 2;
				}
				if (local38 == 17) {
					local40 = 3;
				}
				if (local38 == 3) {
					local33 = Static108.anIntArray329[local20[local24++]];
				}
				@Pc(106) int local106;
				@Pc(117) Class3_Sub1_Sub15 local117;
				@Pc(122) int local122;
				@Pc(134) int local134;
				if (local38 == 4) {
					local106 = local20[local24++] << 16;
					@Pc(113) int local113 = local106 + local20[local24++];
					local117 = Static30.method666(local113);
					local122 = local20[local24++];
					if (local122 != -1 && (!Static2.method38(local122).aBoolean57 || Static123.aBoolean129)) {
						for (local134 = 0; local134 < local117.anIntArray383.length; local134++) {
							if (local117.anIntArray383[local134] == local122 + 1) {
								local33 += local117.anIntArray381[local134];
							}
						}
					}
				}
				if (local38 == 5) {
					local33 = Static13.anIntArray31[local20[local24++]];
				}
				if (local38 == 6) {
					local33 = Class24.anIntArray111[Static9.anIntArray21[local20[local24++]] - 1];
				}
				if (local38 == 7) {
					local33 = Static13.anIntArray31[local20[local24++]] * 100 / 46875;
				}
				if (local38 == 8) {
					local33 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1489;
				}
				if (local38 == 9) {
					for (local106 = 0; local106 < 25; local106++) {
						if (Static43.aBooleanArray6[local106]) {
							local33 += Static9.anIntArray21[local106];
						}
					}
				}
				if (local38 == 10) {
					local106 = local20[local24++] << 16;
					local106 += local20[local24++];
					local117 = Static30.method666(local106);
					local122 = local20[local24++];
					if (local122 != -1 && (!Static2.method38(local122).aBoolean57 || Static123.aBoolean129)) {
						for (local134 = 0; local134 < local117.anIntArray383.length; local134++) {
							if (local122 + 1 == local117.anIntArray383[local134]) {
								local33 = 999999999;
								break;
							}
						}
					}
				}
				if (local38 == 11) {
					local33 = Static3.anInt72;
				}
				if (local38 == 12) {
					local33 = Static65.anInt1668;
				}
				if (local38 == 13) {
					local106 = Static13.anIntArray31[local20[local24++]];
					@Pc(322) int local322 = local20[local24++];
					local33 = (0x1 << local322 & local106) == 0 ? 0 : 1;
				}
				if (local38 == 14) {
					local106 = local20[local24++];
					local33 = Static70.method1202(local106);
				}
				if (local38 == 18) {
					local33 = (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 >> 7) + Static80.anInt2029;
				}
				if (local38 == 19) {
					local33 = (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 >> 7) + Static4.anInt145;
				}
				if (local38 == 20) {
					local33 = local20[local24++];
				}
				if (local40 == 0) {
					if (local26 == 0) {
						local22 += local33;
					}
					if (local26 == 1) {
						local22 -= local33;
					}
					if (local26 == 2 && local33 != 0) {
						local22 /= local33;
					}
					if (local26 == 3) {
						local22 *= local33;
					}
					local26 = 0;
				} else {
					local26 = local40;
				}
			}
		} catch (@Pc(433) Exception local433) {
			return -1;
		}
	}
}
