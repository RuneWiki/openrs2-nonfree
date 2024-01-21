import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public static int anInt2391;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public static int anInt2392;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
	public static int anInt2405;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1096 = Static2.method66("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1097 = Static2.method66("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1100 = Static2.method66("World");

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1098 = aClass39_1100;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1099 = Static2.method66("Login attempts exceeded)3");

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1101 = Static2.method66("l");

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1102 = aClass39_1099;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	public static int anInt2397 = 0;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1103 = aClass39_1097;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	public static int anInt2400 = 1;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1104 = Static2.method66(" ");

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "Lclient!g;")
	public static Class2_Sub5 aClass2_Sub5_5 = new Class2_Sub5(new byte[5000]);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)I")
	public static int method1723(@OriginalArg(0) int arg0) {
		@Pc(7) Class2_Sub1_Sub12 local7 = method1725(arg0);
		@Pc(15) int local15 = local7.anInt1968;
		@Pc(18) int local18 = local7.anInt1960;
		@Pc(21) int local21 = local7.anInt1956;
		@Pc(28) int local28 = Class2_Sub13.anIntArray349[local18 - local21];
		return local28 & Static28.anIntArray89[local15] >> local21;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method1724() {
		aClass39_1096 = null;
		aClass39_1099 = null;
		aClass39_1097 = null;
		aClass39_1104 = null;
		aClass39_1098 = null;
		aClass39_1100 = null;
		aClass2_Sub5_5 = null;
		aClass39_1102 = null;
		aClass39_1103 = null;
		aClass39_1101 = null;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(BI)Lclient!na;")
	private static Class2_Sub1_Sub12 method1725(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub1_Sub12 local11 = (Class2_Sub1_Sub12) Static2.aClass54_1.method1634((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static20.aClass36_15.method1761(14, arg0);
		local11 = new Class2_Sub1_Sub12();
		if (local25 != null) {
			local11.method1406(new Class2_Sub5(local25));
		}
		Static2.aClass54_1.method1637((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method1726() {
		@Pc(10) int local10 = Static51.aClass2_Sub5_Sub1_4.method1309(8);
		@Pc(15) int local15;
		if (Static61.anInt1740 > local10) {
			for (local15 = local10; local15 < Static61.anInt1740; local15++) {
				Static60.anIntArray214[anInt2397++] = Static7.anIntArray21[local15];
			}
		}
		if (local10 > Static61.anInt1740) {
			throw new RuntimeException("gppov1");
		}
		Static61.anInt1740 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(57) int local57 = Static7.anIntArray21[local15];
			@Pc(61) Class2_Sub1_Sub2_Sub3_Sub1 local61 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local57];
			@Pc(66) int local66 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
			if (local66 == 0) {
				Static7.anIntArray21[Static61.anInt1740++] = local57;
				local61.anInt2931 = Static64.anInt1889;
			} else {
				@Pc(89) int local89 = Static51.aClass2_Sub5_Sub1_4.method1309(2);
				if (local89 == 0) {
					Static7.anIntArray21[Static61.anInt1740++] = local57;
					local61.anInt2931 = Static64.anInt1889;
					Static39.anIntArray167[Static60.anInt1626++] = local57;
				} else {
					@Pc(133) int local133;
					@Pc(147) int local147;
					if (local89 == 1) {
						Static7.anIntArray21[Static61.anInt1740++] = local57;
						local61.anInt2931 = Static64.anInt1889;
						local133 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
						local61.method2070(local133, false);
						local147 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
						if (local147 == 1) {
							Static39.anIntArray167[Static60.anInt1626++] = local57;
						}
					} else if (local89 == 2) {
						Static7.anIntArray21[Static61.anInt1740++] = local57;
						local61.anInt2931 = Static64.anInt1889;
						local133 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
						local61.method2070(local133, true);
						local147 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
						local61.method2070(local147, true);
						@Pc(211) int local211 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
						if (local211 == 1) {
							Static39.anIntArray167[Static60.anInt1626++] = local57;
						}
					} else if (local89 == 3) {
						Static60.anIntArray214[anInt2397++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method1727() {
		while (true) {
			if (Static51.aClass2_Sub5_Sub1_4.method1307(Static48.anInt1342) >= 26) {
				@Pc(18) int local18 = Static51.aClass2_Sub5_Sub1_4.method1309(14);
				if (local18 != 16383) {
					@Pc(23) boolean local23 = false;
					if (Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local18] == null) {
						local23 = true;
						Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local18] = new Class2_Sub1_Sub2_Sub3_Sub2();
					}
					@Pc(39) Class2_Sub1_Sub2_Sub3_Sub2 local39 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local18];
					Static50.anIntArray193[Static95.anInt2510++] = local18;
					local39.anInt2931 = Static64.anInt1889;
					@Pc(57) int local57 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
					local39.aClass2_Sub1_Sub8_1 = Static63.method1331(Static51.aClass2_Sub5_Sub1_4.method1309(13));
					@Pc(70) int local70 = Static51.aClass2_Sub5_Sub1_4.method1309(5);
					if (local70 > 15) {
						local70 -= 32;
					}
					@Pc(79) int local79 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
					if (local79 == 1) {
						Static39.anIntArray167[Static60.anInt1626++] = local18;
					}
					@Pc(99) int local99 = Static51.aClass2_Sub5_Sub1_4.method1309(5);
					@Pc(106) int local106 = Static29.anIntArray91[Static51.aClass2_Sub5_Sub1_4.method1309(3)];
					local39.anInt2906 = local39.aClass2_Sub1_Sub8_1.anInt1377;
					if (local23) {
						local39.anInt2909 = local106;
					}
					local39.anInt2889 = local39.aClass2_Sub1_Sub8_1.anInt1374;
					local39.anInt2935 = local39.aClass2_Sub1_Sub8_1.anInt1380;
					local39.anInt2897 = local39.aClass2_Sub1_Sub8_1.anInt1385;
					local39.anInt2939 = local39.aClass2_Sub1_Sub8_1.anInt1376;
					local39.anInt2891 = local39.aClass2_Sub1_Sub8_1.anInt1392;
					if (local99 > 15) {
						local99 -= 32;
					}
					local39.anInt2883 = local39.aClass2_Sub1_Sub8_1.anInt1379;
					local39.anInt2898 = local39.aClass2_Sub1_Sub8_1.anInt1369;
					local39.anInt2895 = local39.aClass2_Sub1_Sub8_1.anInt1384;
					if (local39.anInt2889 == 0) {
						local39.anInt2909 = 0;
					}
					local39.method2066(local57 == 1, local99 + Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0], local70 + Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0]);
					continue;
				}
			}
			Static51.aClass2_Sub5_Sub1_4.method1303();
			return;
		}
	}
}
