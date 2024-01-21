import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!od", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "I")
	public static int anInt3022 = 0;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "Lclient!af;")
	public static Class5 aClass5_1361 = Static45.method1937("null");

	@OriginalMember(owner = "client!od", name = "X", descriptor = "Lclient!af;")
	public static Class5 aClass5_1362 = Static45.method1937("(U3");

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1364 = Static45.method1937("Loading textures )2 ");

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "Lclient!af;")
	public static Class5 aClass5_1363 = aClass5_1364;

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
	public static int anInt3028 = -2;

	@OriginalMember(owner = "client!od", name = "db", descriptor = "[I")
	public static int[] anIntArray442 = new int[25];

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1369 = Static45.method1937("Prepared visibility map");

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1365 = aClass5_1369;

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1366 = Static45.method1937("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1367 = aClass5_1366;

	@OriginalMember(owner = "client!od", name = "jb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1368 = Static45.method1937("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!od", name = "nb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1370 = Static45.method1937("jolt");

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public static void method2144() {
		@Pc(8) boolean local8 = false;
		while (!local8) {
			local8 = true;
			for (@Pc(18) int local18 = 0; local18 < Static18.anInt3043 - 1; local18++) {
				if (Static124.anIntArray455[local18] < 1000 && Static124.anIntArray455[local18 + 1] > 1000) {
					local8 = false;
					@Pc(42) Class5 local42 = Static75.aClass5Array12[local18];
					Static75.aClass5Array12[local18] = Static75.aClass5Array12[local18 + 1];
					Static75.aClass5Array12[local18 + 1] = local42;
					@Pc(60) Class5 local60 = Static124.aClass5Array24[local18];
					Static124.aClass5Array24[local18] = Static124.aClass5Array24[local18 + 1];
					Static124.aClass5Array24[local18 + 1] = local60;
					@Pc(78) int local78 = Static124.anIntArray455[local18];
					Static124.anIntArray455[local18] = Static124.anIntArray455[local18 + 1];
					Static124.anIntArray455[local18 + 1] = local78;
					@Pc(96) int local96 = Static42.anIntArray186[local18];
					Static42.anIntArray186[local18] = Static42.anIntArray186[local18 + 1];
					Static42.anIntArray186[local18 + 1] = local96;
					@Pc(114) int local114 = Static99.anIntArray375[local18];
					Static99.anIntArray375[local18] = Static99.anIntArray375[local18 + 1];
					Static99.anIntArray375[local18 + 1] = local114;
					@Pc(132) int local132 = Static115.anIntArray430[local18];
					Static115.anIntArray430[local18] = Static115.anIntArray430[local18 + 1];
					Static115.anIntArray430[local18 + 1] = local132;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
	public static void method2145() {
		anIntArray442 = null;
		aClass5_1365 = null;
		aClass5_1370 = null;
		aClass5_1366 = null;
		aClass5_1364 = null;
		aBooleanArray26 = null;
		aClass5_1367 = null;
		aClass5_1361 = null;
		aClass5_1363 = null;
		aClass5_1368 = null;
		aClass5_1362 = null;
		aClass5_1369 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)V")
	public static void method2146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static95.anIntArrayArrayArray2[arg2][local3 + arg1][arg0 + local7] = 0;
			}
		}
		if (arg1 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static95.anIntArrayArrayArray2[arg2][arg1][local7 + arg0] = Static95.anIntArrayArrayArray2[arg2][arg1 - 1][local7 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static95.anIntArrayArrayArray2[arg2][arg1 + local7][arg0] = Static95.anIntArrayArrayArray2[arg2][arg1 + local7][arg0 - 1];
			}
		}
		if (arg1 > 0 && Static95.anIntArrayArrayArray2[arg2][arg1 - 1][arg0] != 0) {
			Static95.anIntArrayArrayArray2[arg2][arg1][arg0] = Static95.anIntArrayArrayArray2[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && Static95.anIntArrayArrayArray2[arg2][arg1][arg0 - 1] != 0) {
			Static95.anIntArrayArrayArray2[arg2][arg1][arg0] = Static95.anIntArrayArrayArray2[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && Static95.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 - 1] != 0) {
			Static95.anIntArrayArrayArray2[arg2][arg1][arg0] = Static95.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	public static void method2147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static79.anInt1891 = 0;
		@Pc(77) int local77;
		for (@Pc(13) int local13 = -1; local13 < Static93.anInt2338 + Static111.anInt2739; local13++) {
			@Pc(20) Class1_Sub3_Sub4_Sub2 local20;
			if (local13 == -1) {
				local20 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1;
			} else if (Static111.anInt2739 <= local13) {
				local20 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[Static131.anIntArray468[local13 - Static111.anInt2739]];
			} else {
				local20 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[Static77.anIntArray299[local13]];
			}
			if (local20 != null && local20.method2159()) {
				@Pc(57) Class1_Sub3_Sub12 local57;
				if (local20 instanceof Class1_Sub3_Sub4_Sub2_Sub2) {
					local57 = ((Class1_Sub3_Sub4_Sub2_Sub2) local20).aClass1_Sub3_Sub12_1;
					if (local57.anIntArray324 != null) {
						local57 = local57.method1475();
					}
					if (local57 == null) {
						continue;
					}
				}
				if (Static111.anInt2739 <= local13) {
					local57 = ((Class1_Sub3_Sub4_Sub2_Sub2) local20).aClass1_Sub3_Sub12_1;
					if (local57.anIntArray324 != null) {
						local57 = local57.method1475();
					}
					if (local57.anInt2107 >= 0 && local57.anInt2107 < Static6.aClass1_Sub3_Sub1_Sub2Array2.length) {
						Static118.method2118(local20.anInt3088 + 15, local20);
						if (Static68.anInt1572 > -1) {
							Static6.aClass1_Sub3_Sub1_Sub2Array2[local57.anInt2107].method735(Static68.anInt1572 + arg1 - 12, Static12.anInt3244 + arg3 + -30);
						}
					}
					if (Static23.anInt750 == 1 && Static131.anIntArray468[local13 - Static111.anInt2739] == Static63.anInt1755 && Static131.anInt3270 % 20 < 10) {
						Static118.method2118(local20.anInt3088 + 15, local20);
						if (Static68.anInt1572 > -1) {
							Static97.aClass1_Sub3_Sub1_Sub2Array6[0].method735(Static68.anInt1572 + arg1 - 12, Static12.anInt3244 + -28 + arg3);
						}
					}
				} else {
					local77 = 30;
					@Pc(80) Class1_Sub3_Sub4_Sub2_Sub1 local80 = (Class1_Sub3_Sub4_Sub2_Sub1) local20;
					if (local80.anInt2005 != -1 || local80.anInt2008 != -1) {
						Static118.method2118(local20.anInt3088 + 15, local20);
						if (Static68.anInt1572 > -1) {
							if (local80.anInt2005 != -1) {
								Static98.aClass1_Sub3_Sub1_Sub2Array7[local80.anInt2005].method735(Static68.anInt1572 + arg1 - 12, Static12.anInt3244 + -30 + arg3);
								local77 += 25;
							}
							if (local80.anInt2008 != -1) {
								Static6.aClass1_Sub3_Sub1_Sub2Array2[local80.anInt2008].method735(arg1 + Static68.anInt1572 - 12, Static12.anInt3244 + arg3 + -local77);
								local77 += 25;
							}
						}
					}
					if (local13 >= 0 && Static23.anInt750 == 10 && Static77.anIntArray299[local13] == Static127.anInt3248) {
						Static118.method2118(local20.anInt3088 + 15, local20);
						if (Static68.anInt1572 > -1) {
							Static97.aClass1_Sub3_Sub1_Sub2Array6[1].method735(arg1 + Static68.anInt1572 - 12, -local77 + Static12.anInt3244 + arg3);
						}
					}
				}
				if (local20.aClass5_1372 != null && (Static111.anInt2739 <= local13 || Static77.anInt1817 == 0 || Static77.anInt1817 == 3 || Static77.anInt1817 == 1 && Static38.method697(((Class1_Sub3_Sub4_Sub2_Sub1) local20).aClass5_985))) {
					Static118.method2118(local20.anInt3088, local20);
					if (Static68.anInt1572 > -1 && Static39.anInt1039 > Static79.anInt1891) {
						Static39.anIntArray181[Static79.anInt1891] = Static25.aClass1_Sub3_Sub1_Sub1_1.method154(local20.aClass5_1372) / 2;
						Static39.anIntArray174[Static79.anInt1891] = Static25.aClass1_Sub3_Sub1_Sub1_1.anInt145;
						Static39.anIntArray179[Static79.anInt1891] = Static68.anInt1572;
						Static39.anIntArray180[Static79.anInt1891] = Static12.anInt3244;
						Static39.anIntArray176[Static79.anInt1891] = local20.anInt3091;
						Static39.anIntArray178[Static79.anInt1891] = local20.anInt3045;
						Static39.anIntArray177[Static79.anInt1891] = local20.anInt3076;
						Static39.aClass5Array8[Static79.anInt1891] = local20.aClass5_1372;
						Static79.anInt1891++;
					}
				}
				if (Static131.anInt3270 < local20.anInt3058) {
					Static118.method2118(local20.anInt3088 + 15, local20);
					if (Static68.anInt1572 > -1) {
						local77 = local20.anInt3082 * 30 / local20.anInt3057;
						if (local77 > 30) {
							local77 = 30;
						}
						Static33.method1984(arg1 + Static68.anInt1572 - 15, Static12.anInt3244 + -3 + arg3, local77, 5, 65280);
						Static33.method1984(local77 + arg1 + Static68.anInt1572 - 15, arg3 + (Static12.anInt3244 - 3), 30 - local77, 5, 16711680);
					}
				}
				for (local77 = 0; local77 < 4; local77++) {
					if (local20.anIntArray444[local77] > Static131.anInt3270) {
						Static118.method2118(local20.anInt3088 / 2, local20);
						if (Static68.anInt1572 > -1) {
							if (local77 == 1) {
								Static12.anInt3244 -= 20;
							}
							if (local77 == 2) {
								Static68.anInt1572 -= 15;
								Static12.anInt3244 -= 10;
							}
							if (local77 == 3) {
								Static68.anInt1572 += 15;
								Static12.anInt3244 -= 10;
							}
							Static127.aClass1_Sub3_Sub1_Sub2Array10[local20.anIntArray447[local77]].method735(Static68.anInt1572 + arg1 - 12, Static12.anInt3244 + arg3 + -12);
							Static48.aClass1_Sub3_Sub1_Sub1_2.method170(Static48.method838(local20.anIntArray445[local77]), arg1 + Static68.anInt1572 - 1, arg3 - -Static12.anInt3244 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(529) int local529 = 0; local529 < Static79.anInt1891; local529++) {
			local77 = Static39.anIntArray179[local529];
			@Pc(539) int local539 = Static39.anIntArray180[local529];
			@Pc(541) boolean local541 = true;
			@Pc(545) int local545 = Static39.anIntArray181[local529];
			@Pc(549) int local549 = Static39.anIntArray174[local529];
			while (local541) {
				local541 = false;
				for (@Pc(555) int local555 = 0; local555 < local529; local555++) {
					if (local539 + 2 > -Static39.anIntArray174[local555] + Static39.anIntArray180[local555] && local539 - local549 < Static39.anIntArray180[local555] + 2 && Static39.anIntArray179[local555] + Static39.anIntArray181[local555] > local77 - local545 && Static39.anIntArray179[local555] - Static39.anIntArray181[local555] < local545 + local77 && Static39.anIntArray180[local555] - Static39.anIntArray174[local555] < local539) {
						local541 = true;
						local539 = Static39.anIntArray180[local555] - Static39.anIntArray174[local555];
					}
				}
			}
			Static68.anInt1572 = Static39.anIntArray179[local529];
			Static12.anInt3244 = Static39.anIntArray180[local529] = local539;
			@Pc(654) Class5 local654 = Static39.aClass5Array8[local529];
			if (Static91.anInt2282 == 0) {
				@Pc(672) int local672 = 16776960;
				if (Static39.anIntArray176[local529] < 6) {
					local672 = Static52.anIntArray206[Static39.anIntArray176[local529]];
				}
				if (Static39.anIntArray176[local529] == 6) {
					local672 = Static122.anInt3127 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static39.anIntArray176[local529] == 7) {
					local672 = Static122.anInt3127 % 20 < 10 ? 255 : 65535;
				}
				if (Static39.anIntArray176[local529] == 8) {
					local672 = Static122.anInt3127 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(749) int local749;
				if (Static39.anIntArray176[local529] == 9) {
					local749 = 150 - Static39.anIntArray177[local529];
					if (local749 < 50) {
						local672 = local749 * 1280 + 16711680;
					} else if (local749 < 100) {
						local672 = 16776960 - (local749 - 50) * 327680;
					} else if (local749 < 150) {
						local672 = (local749 - 100) * 5 + 65280;
					}
				}
				if (Static39.anIntArray176[local529] == 10) {
					local749 = 150 - Static39.anIntArray177[local529];
					if (local749 < 50) {
						local672 = local749 * 5 + 16711680;
					} else if (local749 < 100) {
						local672 = 16711935 - (local749 - 50) * 327680;
					} else if (local749 < 150) {
						local672 = local749 * 327680 + 255 + 500 - local749 * 5 - 32768000;
					}
				}
				if (Static39.anIntArray176[local529] == 11) {
					local749 = 150 - Static39.anIntArray177[local529];
					if (local749 < 50) {
						local672 = 16777215 - local749 * 327685;
					} else if (local749 < 100) {
						local672 = (local749 - 50) * 327685 + 65280;
					} else if (local749 < 150) {
						local672 = 16777215 + 32768000 - local749 * 327680;
					}
				}
				if (Static39.anIntArray178[local529] == 0) {
					Static25.aClass1_Sub3_Sub1_Sub1_1.method170(local654, arg1 + Static68.anInt1572, arg3 + Static12.anInt3244, local672, 0);
				}
				if (Static39.anIntArray178[local529] == 1) {
					Static25.aClass1_Sub3_Sub1_Sub1_1.method161(local654, arg1 + Static68.anInt1572, Static12.anInt3244 + arg3, local672, Static122.anInt3127);
				}
				if (Static39.anIntArray178[local529] == 2) {
					Static25.aClass1_Sub3_Sub1_Sub1_1.method159(local654, Static68.anInt1572 + arg1, arg3 - -Static12.anInt3244, local672, Static122.anInt3127);
				}
				if (Static39.anIntArray178[local529] == 3) {
					Static25.aClass1_Sub3_Sub1_Sub1_1.method164(local654, Static68.anInt1572 + arg1, arg3 + Static12.anInt3244, local672, Static122.anInt3127, 150 - Static39.anIntArray177[local529]);
				}
				if (Static39.anIntArray178[local529] == 4) {
					local749 = (150 - Static39.anIntArray177[local529]) * (Static25.aClass1_Sub3_Sub1_Sub1_1.method154(local654) + 100) / 150;
					Static33.method1985(arg1 + Static68.anInt1572 - 50, arg3, arg1 + Static68.anInt1572 + 50, arg0 + arg3);
					Static25.aClass1_Sub3_Sub1_Sub1_1.method165(local654, arg1 + Static68.anInt1572 + 50 - local749, Static12.anInt3244 + arg3, local672, 0);
					Static33.method1981(arg1, arg3, arg1 + arg2, arg3 + arg0);
				}
				if (Static39.anIntArray178[local529] == 5) {
					@Pc(1046) int local1046 = 0;
					local749 = 150 - Static39.anIntArray177[local529];
					if (local749 < 25) {
						local1046 = local749 - 25;
					} else if (local749 > 125) {
						local1046 = local749 - 125;
					}
					Static33.method1985(arg1, arg3 + Static12.anInt3244 - Static25.aClass1_Sub3_Sub1_Sub1_1.anInt145 - 1, arg2 + arg1, Static12.anInt3244 + arg3 + 5);
					Static25.aClass1_Sub3_Sub1_Sub1_1.method170(local654, Static68.anInt1572 + arg1, local1046 + arg3 - -Static12.anInt3244, local672, 0);
					Static33.method1981(arg1, arg3, arg1 + arg2, arg3 - -arg0);
				}
			} else {
				Static25.aClass1_Sub3_Sub1_Sub1_1.method170(local654, arg1 + Static68.anInt1572, arg3 + Static12.anInt3244, 16776960, 0);
			}
		}
	}
}
