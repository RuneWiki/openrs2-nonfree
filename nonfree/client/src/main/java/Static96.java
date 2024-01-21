import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!jd;")
	public static Class37 aClass37_38;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!va;")
	public static Class56 aClass56_5;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public static int anInt2744 = 0;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt2745 = 0;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1752 = Static69.method1153("leuchten1:");

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!md;")
	public static Class50 aClass50_14 = new Class50();

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1753 = Static69.method1153(" x");

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1754 = Static69.method1153("Abbrechen");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1755 = Static69.method1153("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1756 = Static69.method1153("Untersuchen");

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
	public static int[] anIntArray434 = new int[500];

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1757 = Static69.method1153("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[I")
	public static int[] anIntArray436 = new int[2048];

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1758 = Static69.method1153("gelb:");

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1759 = Static69.method1153("flash2:");

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1760 = aClass64_1759;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1999() {
		Static110.aClass58_8 = new Class58(32);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)Z")
	public static boolean method2002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method2003() {
		aClass64_1755 = null;
		aClass50_14 = null;
		anIntArray435 = null;
		aClass37_38 = null;
		aClass64_1758 = null;
		aClass64_1759 = null;
		aClass64_1757 = null;
		anIntArray434 = null;
		aClass64_1756 = null;
		aClass64_1760 = null;
		aClass64_1752 = null;
		anIntArray436 = null;
		aClass56_5 = null;
		aClass64_1754 = null;
		aClass64_1753 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public static void method2005() {
		Static17.method351(Static27.anInt889);
		if (Static45.anInt1077 != -1) {
			Static17.method351(Static45.anInt1077);
		}
		Static113.anInt1815 = 0;
		Static119.aClass37_39.method1459();
		Static21.anIntArray82 = Static112.method1980(Static21.anIntArray82);
		Static47.method1948();
		Static120.method2100(503, 765, 0, Static27.anInt889);
		if (Static45.anInt1077 != -1) {
			Static120.method2100(503, 765, 0, Static45.anInt1077);
		}
		if (Static94.aBoolean132) {
			Static19.method391();
		} else {
			Static55.method2072();
			Static95.method1560();
		}
		try {
			@Pc(63) Graphics local63 = Static93.aCanvas1.getGraphics();
			Static119.aClass37_39.method1457(0, 0, local63);
		} catch (@Pc(71) Exception local71) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	public static void method2006() {
		if (Static21.anInt649 == 0) {
			return;
		}
		@Pc(13) Class1_Sub1_Sub5_Sub1 local13 = Static3.aClass1_Sub1_Sub5_Sub1_1;
		@Pc(15) int local15 = 0;
		if (Static66.anInt1526 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static120.aClass64Array19[local21] != null) {
				@Pc(31) int local31 = Static22.anIntArray85[local21];
				@Pc(35) Class64 local35 = Static22.aClass64Array8[local21];
				@Pc(37) byte local37 = 0;
				if (local35 != null && local35.method1479(Static41.aClass64_1692)) {
					local35 = local35.method1481(5);
					local37 = 1;
				}
				if (local35 != null && local35.method1479(Static66.aClass64_949)) {
					local35 = local35.method1481(5);
					local37 = 2;
				}
				@Pc(92) int local92;
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Static108.anInt2556 == 0 || Static108.anInt2556 == 1 && Static19.method394(local35))) {
					local92 = 329 - local15 * 13;
					local15++;
					local13.method661(Static58.aClass64_820, 4, local92, 0);
					local13.method661(Static58.aClass64_820, 4, local92 - 1, 65535);
					@Pc(115) int local115 = local13.method654(Static58.aClass64_820) + 4;
					local115 += local13.method655(32);
					if (local37 == 1) {
						Static89.aClass1_Sub1_Sub5_Sub3Array5[0].method1290(local115, local92 - 12);
						local115 += 14;
					}
					if (local37 == 2) {
						Static89.aClass1_Sub1_Sub5_Sub3Array5[1].method1290(local115, local92 - 12);
						local115 += 14;
					}
					local13.method661(Static82.method1383(new Class64[] { local35, Static114.aClass64_1751, Static120.aClass64Array19[local21] }), local115, local92, 0);
					local13.method661(Static82.method1383(new Class64[] { local35, Static114.aClass64_1751, Static120.aClass64Array19[local21] }), local115, local92 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local31 == 5 && Static108.anInt2556 < 2) {
					local92 = 329 - local15 * 13;
					local15++;
					local13.method661(Static120.aClass64Array19[local21], 4, local92, 0);
					local13.method661(Static120.aClass64Array19[local21], 4, local92 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local31 == 6 && Static108.anInt2556 < 2) {
					local92 = 329 - local15 * 13;
					local13.method661(Static82.method1383(new Class64[] { Static15.aClass64_319, Static117.aClass64_1801, local35, Static114.aClass64_1751, Static120.aClass64Array19[local21] }), 4, local92, 0);
					local15++;
					local13.method661(Static82.method1383(new Class64[] { Static15.aClass64_319, Static117.aClass64_1801, local35, Static114.aClass64_1751, Static120.aClass64Array19[local21] }), 4, local92 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}
}
