import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!kc;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "J")
	public static long aLong79;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array6;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Lclient!bd;")
	public static Class7 aClass7_12;

	@OriginalMember(owner = "client!q", name = "E", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public static int anInt2389 = 0;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public static int anInt2390 = 0;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
	public static int[] anIntArray367 = new int[4000];

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_1146 = Static45.method1937("blaugr-Un:");

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_1147 = Static45.method1937("sl_flags");

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_1148 = Static45.method1937("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "I")
	public static int anInt2395 = 0;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "Z")
	public static boolean aBoolean95 = true;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "[Lclient!rd;")
	public static Class1_Sub20[] aClass1_Sub20Array1 = new Class1_Sub20[2048];

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Lclient!af;")
	public static Class5 aClass5_1149 = Static45.method1937(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!af;")
	public static Class5 aClass5_1150 = Static45.method1937("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!q", name = "B", descriptor = "Lclient!af;")
	public static Class5 aClass5_1151 = Static45.method1937("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZIIII)V")
	public static void method1633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg2; local7 <= arg2 + arg1; local7++) {
			for (@Pc(13) int local13 = arg3; local13 <= arg0 + arg3; local13++) {
				if (local13 >= 0 && local13 < 104 && local7 >= 0 && local7 < 104) {
					Static109.aByteArrayArrayArray6[0][local13][local7] = 127;
					if (arg3 == local13 && local13 > 0) {
						Static95.anIntArrayArrayArray2[0][local13][local7] = Static95.anIntArrayArrayArray2[0][local13 - 1][local7];
					}
					if (local13 == arg3 + arg0 && local13 < 103) {
						Static95.anIntArrayArrayArray2[0][local13][local7] = Static95.anIntArrayArrayArray2[0][local13 + 1][local7];
					}
					if (arg2 == local7 && local7 > 0) {
						Static95.anIntArrayArrayArray2[0][local13][local7] = Static95.anIntArrayArrayArray2[0][local13][local7 - 1];
					}
					if (arg2 + arg1 == local7 && local7 < 103) {
						Static95.anIntArrayArrayArray2[0][local13][local7] = Static95.anIntArrayArrayArray2[0][local13][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ja;I)V")
	public static void method1635(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub9_5 != null) {
			arg0.aClass1_Sub9_5.anInt3154 = 0;
		}
		arg0.aBoolean63 = false;
		for (@Pc(18) Class1_Sub1 local18 = arg0.method1362(); local18 != null; local18 = arg0.method1357()) {
			method1635(local18);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
	public static void method1636(@OriginalArg(1) int arg0) {
		if (Static95.anInt2352 == arg0) {
			return;
		}
		if (Static95.anInt2352 == 0) {
			Static62.method1699();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static71.anInt1631 = 0;
			Static116.anInt2892 = 0;
			Static99.anInt2454 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static65.aClass78_3 != null) {
			Static65.aClass78_3.method2176();
			Static65.aClass78_3 = null;
		}
		if (Static95.anInt2352 == 25) {
			Static54.anInt1300 = 1;
			Static92.anInt2322 = 0;
			Static12.anInt3241 = 0;
			Static10.anInt315 = 1;
			Static124.anInt3182 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static54.method945(Static109.aClass41_Sub1_20, Static12.aCanvas3, Static62.aClass41_Sub1_17);
		} else {
			Static54.method944();
		}
		Static95.anInt2352 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method1640() {
		aClass1_Sub3_Sub1_Sub2Array6 = null;
		aClass5_1149 = null;
		anIntArrayArrayArray3 = null;
		aClass5_1148 = null;
		aClass1_Sub20Array1 = null;
		aClass7_12 = null;
		aClass5_1151 = null;
		anIntArray367 = null;
		aClass10_1 = null;
		aClass5_1147 = null;
		aClass5_1146 = null;
		aClass5_1150 = null;
	}
}
