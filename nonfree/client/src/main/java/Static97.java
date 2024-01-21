import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!dd;")
	public static Class14 aClass14_22;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1057 = Static56.method816("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1054 = aClass34_1057;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1055 = Static56.method816("Hidden");

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1056 = Static56.method816("null");

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public static int anInt2257 = 0;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1058 = Static56.method816("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[Lclient!kd;")
	public static Class42[] aClass42Array1 = new Class42[4];

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1059 = aClass34_1055;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IJ)V")
	public static void method1360(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
	public static void method1363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static110.method1721(arg2, arg1, arg3 + arg2, arg1 + arg0);
		Static11.method178();
		Static48.anInt2953++;
		Static62.method938(true);
		Static28.method502(true);
		Static62.method938(false);
		Static28.method502(false);
		Static56.method813();
		Static84.method1246();
		@Pc(39) int local39;
		@Pc(75) int local75;
		if (!Static112.aBoolean100) {
			local39 = Static59.anInt1552;
			if (local39 < Static42.anInt1035 / 256) {
				local39 = Static42.anInt1035 / 256;
			}
			if (Static83.aBooleanArray14[4] && local39 < Static74.anIntArray227[4] + 128) {
				local39 = Static74.anIntArray227[4] + 128;
			}
			local75 = Static129.anInt3042 + Static72.anInt1744 & 0x7FF;
			Static95.method1357(local39, local75, Static112.anInt2505, Static123.method1945(Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059, Static42.anInt1024, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043) - 50, 600 - -(local39 * 3), Static47.anInt1274);
		}
		if (Static112.aBoolean100) {
			local39 = Static14.method236();
		} else {
			local39 = Static47.method732();
		}
		@Pc(108) int local108 = Static113.anInt2579;
		local75 = Static48.anInt2951;
		@Pc(112) int local112 = Static13.anInt345;
		@Pc(114) int local114 = Static24.anInt1900;
		@Pc(116) int local116 = Static19.anInt593;
		@Pc(160) int local160;
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (Static83.aBooleanArray14[local118]) {
				local160 = (int) ((double) -Static111.anIntArray401[local118] + (double) (Static111.anIntArray401[local118] * 2 + 1) * Math.random() + Math.sin((double) Static13.anIntArray48[local118] * ((double) Static54.anIntArray170[local118] / 100.0D)) * (double) Static74.anIntArray227[local118]);
				if (local118 == 2) {
					Static13.anInt345 += local160;
				}
				if (local118 == 0) {
					Static48.anInt2951 += local160;
				}
				if (local118 == 3) {
					Static19.anInt593 = local160 + Static19.anInt593 & 0x7FF;
				}
				if (local118 == 1) {
					Static113.anInt2579 += local160;
				}
				if (local118 == 4) {
					Static24.anInt1900 += local160;
					if (Static24.anInt1900 < 128) {
						Static24.anInt1900 = 128;
					}
					if (Static24.anInt1900 > 383) {
						Static24.anInt1900 = 383;
					}
				}
			}
		}
		@Pc(227) int local227 = Static121.anInt2909;
		local160 = Static14.anInt366;
		if (arg2 <= local160 && local160 < arg2 + arg3 && arg1 <= local227 && arg1 + arg0 > local227) {
			Static85.anInt2154 = 0;
			Static85.anInt2149 = Static121.anInt2909 - arg1;
			Static85.anInt2150 = Static14.anInt366 - arg2;
			Static85.aBoolean82 = true;
		} else {
			Static85.anInt2154 = 0;
			Static85.aBoolean82 = false;
		}
		Static33.method548();
		Static110.method1729(arg2, arg1, arg3, arg0, 0);
		Static33.method548();
		Static3.aClass64_1.method1424(Static48.anInt2951, Static113.anInt2579, Static13.anInt345, Static24.anInt1900, Static19.anInt593, local39);
		Static33.method548();
		Static3.aClass64_1.method1402();
		Static53.method777(arg3, arg0, arg2, arg1);
		Static49.method748(arg1, arg2);
		((Class26) Static11.anInterface3_1).method624(Static69.anInt1683);
		Static9.method99(arg3, arg0, arg1, arg2);
		Static19.anInt593 = local116;
		Static113.anInt2579 = local108;
		Static48.anInt2951 = local75;
		Static24.anInt1900 = local114;
		Static13.anInt345 = local112;
		if (Static93.aBoolean86 && Static116.method1640() == 0) {
			Static93.aBoolean86 = false;
		}
		if (Static93.aBoolean86) {
			Static110.method1729(arg2, arg1, arg3, arg0, 0);
			Static105.method1477(Static113.aClass34_1209, false);
		}
		if (!Static93.aBoolean86 && !Static90.aBoolean14 && arg2 <= local160 && local160 < arg2 + arg3 && local227 >= arg1 && local227 < arg1 + arg0) {
			Static42.method635(arg2, local160, arg1, local227);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[BI)I")
	public static int method1364(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static106.method1499(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)Lclient!ic;")
	public static Class34 method1365(@OriginalArg(1) int arg0) {
		return Static95.method1348(true, arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method1366() {
		aClass34_1054 = null;
		aClass34_1058 = null;
		aClass34_1059 = null;
		anIntArrayArrayArray5 = null;
		aClass34_1056 = null;
		aClass34_1055 = null;
		aClass42Array1 = null;
		aClass14_22 = null;
		aClass34_1057 = null;
	}
}
