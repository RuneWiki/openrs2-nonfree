import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!t", name = "R", descriptor = "Lclient!qb;")
	public static Class54 aClass54_6;

	@OriginalMember(owner = "client!t", name = "V", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!t", name = "H", descriptor = "Lclient!v;")
	private static Class62 aClass62_1122 = Static45.method753("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\u001c1(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!v;")
	private static Class62 aClass62_1120 = aClass62_1122;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!v;")
	public static Class62 aClass62_1121 = Static45.method753("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!t", name = "y", descriptor = "[Lclient!v;")
	public static Class62[] aClass62Array12 = new Class62[100];

	@OriginalMember(owner = "client!t", name = "I", descriptor = "Lclient!v;")
	public static Class62 aClass62_1123 = Static45.method753("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!t", name = "J", descriptor = "Lclient!v;")
	public static Class62 aClass62_1124 = Static45.method753("redstone2");

	@OriginalMember(owner = "client!t", name = "L", descriptor = "Lclient!v;")
	private static Class62 aClass62_1125 = Static45.method753("Loading )2 please wait)3");

	@OriginalMember(owner = "client!t", name = "M", descriptor = "Lclient!v;")
	public static Class62 aClass62_1126 = Static45.method753("backbase2");

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "Lclient!v;")
	private static Class62 aClass62_1127 = Static45.method753("Password: ");

	@OriginalMember(owner = "client!t", name = "S", descriptor = "I")
	public static int anInt2485 = -1;

	@OriginalMember(owner = "client!t", name = "T", descriptor = "Lclient!v;")
	public static Class62 aClass62_1128 = Static45.method753("@whi@ )4 ");

	@OriginalMember(owner = "client!t", name = "U", descriptor = "I")
	public static int anInt2486 = 0;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "Lclient!v;")
	public static Class62 aClass62_1129 = aClass62_1125;

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "Lclient!v;")
	private static Class62 aClass62_1130 = Static45.method753("flash3:");

	@OriginalMember(owner = "client!t", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_1131 = aClass62_1127;

	@OriginalMember(owner = "client!t", name = "bb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1132 = Static45.method753("Neuer Benutzer");

	@OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
	public static int anInt2488 = 0;

	@OriginalMember(owner = "client!t", name = "db", descriptor = "[J")
	public static long[] aLongArray31 = new long[100];

	@OriginalMember(owner = "client!t", name = "gb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1135 = Static45.method753("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!t", name = "eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1133 = aClass62_1135;

	@OriginalMember(owner = "client!t", name = "fb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1134 = aClass62_1130;

	@OriginalMember(owner = "client!t", name = "hb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1136 = Static45.method753("Enter object name");

	@OriginalMember(owner = "client!t", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_1137 = aClass62_1136;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public static void method1588() {
		Static30.method598();
		if (Static35.anInt1104 != 10) {
			return;
		}
		@Pc(18) int local18 = Static79.anInt2109;
		@Pc(22) int local22 = Static27.anInt825 - 171;
		@Pc(26) int local26 = Static104.anInt2769 - 202;
		if (Static19.anInt2835 == 0) {
			if (local18 == 1 && local26 >= 25 && local26 <= 175 && local22 >= 100 && local22 <= 140) {
				Static106.anInt2802 = 0;
				Static19.anInt2835 = 3;
			}
			if (local18 == 1 && local26 >= 185 && local26 <= 335 && local22 >= 100 && local22 <= 140) {
				Static74.aClass62_872 = Static109.aClass62_1301;
				Static19.anInt2835 = 2;
				Static74.aClass62_870 = Static56.aClass62_668;
				Static74.aClass62_869 = Static109.aClass62_1333;
				Static106.anInt2802 = 0;
				return;
			}
			return;
		}
		if (Static19.anInt2835 == 2) {
			@Pc(112) byte local112 = 60;
			@Pc(113) int local113 = local112 + 30;
			if (local18 == 1 && local22 >= 75 && local22 < 90) {
				Static106.anInt2802 = 0;
			}
			local113 += 15;
			if (local18 == 1 && local22 >= 90 && local22 < 105) {
				Static106.anInt2802 = 1;
			}
			local113 += 15;
			if (local18 == 1 && local26 >= 25 && local26 <= 175 && local22 >= 130 && local22 <= 170) {
				Static74.aClass62_875 = Static74.aClass62_875.method1692().method1681();
				Static35.method663(Static13.aClass62_173, Static109.aClass62_1322, Static109.aClass62_1309);
				Static65.method1089(20);
				return;
			}
			if (local18 == 1 && local26 >= 185 && local26 <= 335 && local22 >= 130 && local22 <= 170) {
				Static74.aClass62_875 = Static74.aClass62_874;
				Static74.aClass62_867 = Static74.aClass62_874;
				Static19.anInt2835 = 0;
			}
			while (true) {
				@Pc(244) boolean local244;
				label138: do {
					while (Static46.method766()) {
						local244 = false;
						for (@Pc(246) int local246 = 0; aClass62_1120.method1688() > local246; local246++) {
							if (Static94.anInt2493 == aClass62_1120.method1710(local246)) {
								local244 = true;
								break;
							}
						}
						if (Static106.anInt2802 != 0) {
							continue label138;
						}
						if (Static38.anInt1138 == 85 && Static74.aClass62_875.method1688() > 0) {
							Static74.aClass62_875 = Static74.aClass62_875.method1693(Static74.aClass62_875.method1688() - 1, 0);
						}
						if (Static38.anInt1138 == 84 || Static38.anInt1138 == 80) {
							Static106.anInt2802 = 1;
						}
						if (local244 && Static74.aClass62_875.method1688() < 12) {
							Static74.aClass62_875 = Static74.aClass62_875.method1684(Static94.anInt2493);
						}
					}
					return;
				} while (Static106.anInt2802 != 1);
				if (Static38.anInt1138 == 85 && Static74.aClass62_867.method1688() > 0) {
					Static74.aClass62_867 = Static74.aClass62_867.method1693(Static74.aClass62_867.method1688() - 1, 0);
				}
				if (Static38.anInt1138 == 84 || Static38.anInt1138 == 80) {
					Static106.anInt2802 = 0;
				}
				if (local244 && Static74.aClass62_867.method1688() < 20) {
					Static74.aClass62_867 = Static74.aClass62_867.method1684(Static94.anInt2493);
				}
			}
		}
		if (Static19.anInt2835 != 3 || local18 != 1 || local26 < 105 || local26 > 255 || local22 < 130 || local22 > 170) {
			return;
		}
		Static19.anInt2835 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public static void method1589() {
		try {
			@Pc(6) Graphics local6 = Static44.aCanvas1.getGraphics();
			Static108.aClass9_53.method686(local6, 0, 4);
			Static42.aClass9_23.method686(local6, 0, 357);
			Static7.aClass9_5.method686(local6, 722, 4);
			Static79.aClass9_40.method686(local6, 743, 205);
			Static81.aClass9_42.method686(local6, 0, 0);
			Static86.aClass9_46.method686(local6, 516, 4);
			Static92.aClass9_48.method686(local6, 516, 205);
			Static69.aClass9_34.method686(local6, 496, 357);
			Static37.aClass9_20.method686(local6, 0, 338);
		} catch (@Pc(67) Exception local67) {
			Static44.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	public static void method1590() {
		aClass62_1136 = null;
		aClass62_1133 = null;
		aClass62_1120 = null;
		aClass62_1126 = null;
		aClass54_6 = null;
		aClass62_1122 = null;
		aClass62_1127 = null;
		aClass62_1132 = null;
		anIntArray274 = null;
		aClass62_1135 = null;
		aClass62_1124 = null;
		aClass62_1123 = null;
		aClass62_1134 = null;
		aClass62_1137 = null;
		aClass62_1125 = null;
		aClass62_1128 = null;
		aLongArray31 = null;
		aClass62_1131 = null;
		aClass62_1130 = null;
		aClass62_1129 = null;
		anIntArray273 = null;
		aClass62Array12 = null;
		aClass62_1121 = null;
	}
}
