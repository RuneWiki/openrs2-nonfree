import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1023 = Static34.method846("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1020 = aClass55_1023;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "J")
	public static long aLong86 = 0L;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1021 = Static34.method846("Error connecting to server)3");

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1022 = aClass55_1021;

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1024 = Static34.method846(" )2> @cya@");

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1025 = Static34.method846(" has logged out)3");

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1026 = aClass55_1025;

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "Lclient!ab;")
	public static Class3 aClass3_5 = new Class3();

	@OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
	public static int anInt2485 = 0;

	@OriginalMember(owner = "client!s", name = "qb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1027 = Static34.method846("leuchten2:");

	@OriginalMember(owner = "client!s", name = "rb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1028 = Static34.method846("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)Z")
	public static boolean method1695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static100.anInt2945 == arg1) {
			return true;
		} else if (arg0 == 1 && arg1 == Static13.anInt795) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static29.anInt1152;
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method1696() {
		if (Static77.aClass6_Sub2_Sub14_37 == null) {
			return;
		}
		@Pc(13) Class6_Sub2_Sub14 local13 = Static77.aClass6_Sub2_Sub14_37;
		@Pc(19) Class6_Sub2_Sub14 local19 = Static56.method1177(local13);
		if (local19 == null) {
			Static77.aClass6_Sub2_Sub14_37 = null;
			return;
		}
		Static38.anInt1386++;
		@Pc(32) int[] local32 = Static1.method2(local19);
		@Pc(36) int[] local36 = Static1.method2(local13);
		@Pc(41) int local41 = Static27.anInt1358 - Static65.anInt1952;
		@Pc(45) int local45 = Static58.anInt1741 - Static63.anInt1890;
		if (local45 <= local13.anInt2893 && -local13.anInt2893 <= local45 && local13.anInt2893 >= local41 && local41 >= -local13.anInt2893 && !Static11.aBoolean30) {
			local41 = 0;
			local45 = 0;
		} else if (Static38.anInt1386 > local13.anInt2872 || Static11.aBoolean30) {
			Static11.aBoolean30 = true;
		} else {
			local41 = 0;
			local45 = 0;
		}
		@Pc(101) int local101 = local36[1] + local41 - local32[1];
		if (local101 < 0) {
			local101 = 0;
		}
		@Pc(118) int local118 = local45 + local36[0] - local32[0];
		if (local118 < 0) {
			local118 = 0;
		}
		if (local19.anInt2914 < local118 + local13.anInt2914) {
			local118 = local19.anInt2914 - local13.anInt2914;
		}
		if (local13.anInt2875 + local101 > local19.anInt2875) {
			local101 = local19.anInt2875 - local13.anInt2875;
		}
		if (Static77.aClass6_Sub2_Sub14_37.anObjectArray4 != null && Static11.aBoolean30) {
			Static51.method1093(local101, local13.anObjectArray4, local13, local118);
		}
		if (Static6.anInt275 != 0) {
			return;
		}
		if (!Static11.aBoolean30) {
			if (Static77.aClass6_Sub2_Sub14_37.anObjectArray6 != null) {
				Static51.method1093(local101, local13.anObjectArray6, local13, local118);
			}
			if ((Static1.anInt5 == 1 || Static51.method1096(Static94.anInt2645 - 1)) && Static94.anInt2645 > 2) {
				Static9.method352();
			} else if (Static94.anInt2645 > 0) {
				Static57.method1185(Static94.anInt2645 - 1);
			}
		} else if (Static77.aClass6_Sub2_Sub14_37.anObjectArray12 != null) {
			Static51.method1093(local101, local13.anObjectArray12, local13, local118);
		}
		Static77.aClass6_Sub2_Sub14_37 = null;
		return;
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	public static void method1697() {
		aClass55_1024 = null;
		aClass55_1028 = null;
		aClass55_1025 = null;
		aClass55_1020 = null;
		aClass55_1023 = null;
		aClass55_1021 = null;
		aClass55_1022 = null;
		aClass55_1027 = null;
		aClass3_5 = null;
		aClass55_1026 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([Lclient!rc;I)Lclient!rc;")
	public static Class55 method1698(@OriginalArg(0) Class55[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static3.method36(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public static void method1699() {
		for (@Pc(10) Class6_Sub2_Sub3_Sub6 local10 = (Class6_Sub2_Sub3_Sub6) Static44.aClass3_8.method31(); local10 != null; local10 = (Class6_Sub2_Sub3_Sub6) Static44.aClass3_8.method26()) {
			if (local10.anInt3232 != Static56.anInt1718 || Static85.anInt2389 > local10.anInt3236) {
				local10.method2083();
			} else if (Static85.anInt2389 >= local10.anInt3238) {
				if (local10.anInt3225 > 0) {
					@Pc(46) Class6_Sub2_Sub3_Sub1_Sub2 local46 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local10.anInt3225 - 1];
					if (local46 != null && local46.anInt2710 >= 0 && local46.anInt2710 < 13312 && local46.anInt2744 >= 0 && local46.anInt2744 < 13312) {
						local10.method2070(Static85.anInt2389, local46.anInt2710, Static112.method2073(local10.anInt3232, local46.anInt2710, local46.anInt2744) - local10.anInt3237, local46.anInt2744);
					}
				}
				if (local10.anInt3225 < 0) {
					@Pc(96) int local96 = -local10.anInt3225 - 1;
					@Pc(105) Class6_Sub2_Sub3_Sub1_Sub1 local105;
					if (local96 == Static41.anInt1401) {
						local105 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1;
					} else {
						local105 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local96];
					}
					if (local105 != null && local105.anInt2710 >= 0 && local105.anInt2710 < 13312 && local105.anInt2744 >= 0 && local105.anInt2744 < 13312) {
						local10.method2070(Static85.anInt2389, local105.anInt2710, Static112.method2073(local10.anInt3232, local105.anInt2710, local105.anInt2744) - local10.anInt3237, local105.anInt2744);
					}
				}
				local10.method2072(Static45.anInt1477);
				Static109.aClass34_1.method1037(Static56.anInt1718, (int) local10.aDouble8, (int) local10.aDouble6, (int) local10.aDouble9, 60, local10, local10.anInt3222, -1, false);
			}
		}
	}
}
