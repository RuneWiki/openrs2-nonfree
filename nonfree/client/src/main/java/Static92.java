import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
	public static int anInt2213;

	@OriginalMember(owner = "client!pa", name = "Kb", descriptor = "I")
	public static int anInt2247;

	@OriginalMember(owner = "client!pa", name = "Mb", descriptor = "I")
	public static int anInt2249;

	@OriginalMember(owner = "client!pa", name = "fb", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!pa", name = "sb", descriptor = "Ljava/util/Random;")
	public static Random aRandom2 = new Random();

	@OriginalMember(owner = "client!pa", name = "Ob", descriptor = "Lclient!r;")
	private static Class61 aClass61_647 = Static129.method2060("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!pa", name = "Eb", descriptor = "Lclient!r;")
	public static Class61 aClass61_644 = aClass61_647;

	@OriginalMember(owner = "client!pa", name = "Gb", descriptor = "Lclient!r;")
	private static Class61 aClass61_645 = Static129.method2060("Continue");

	@OriginalMember(owner = "client!pa", name = "Nb", descriptor = "Lclient!r;")
	public static Class61 aClass61_646 = Static129.method2060("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!pa", name = "Pb", descriptor = "Lclient!r;")
	public static Class61 aClass61_648 = aClass61_645;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1431(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static127.aClass44_1);
		arg0.removeFocusListener(Static127.aClass44_1);
		Static41.anInt2294 = -1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!e;)V")
	public static void method1456(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static75.anInt1772 != 1) {
			return;
		}
		if (Static26.anInt613 >= 280 && Static26.anInt613 <= 294 && Static12.anInt308 >= 4 && Static12.anInt308 <= 18) {
			Static43.method764(0, 0);
			return;
		}
		if (Static26.anInt613 >= 295 && Static26.anInt613 <= 360 && Static12.anInt308 >= 4 && Static12.anInt308 <= 18) {
			Static43.method764(1, 0);
			return;
		}
		if (Static26.anInt613 >= 390 && Static26.anInt613 <= 404 && Static12.anInt308 >= 4 && Static12.anInt308 <= 18) {
			Static43.method764(0, 1);
			return;
		}
		if (Static26.anInt613 >= 405 && Static26.anInt613 <= 470 && Static12.anInt308 >= 4 && Static12.anInt308 <= 18) {
			Static43.method764(1, 1);
			return;
		}
		if (Static26.anInt613 >= 500 && Static26.anInt613 <= 514 && Static12.anInt308 >= 4 && Static12.anInt308 <= 18) {
			Static43.method764(0, 2);
			return;
		}
		if (Static26.anInt613 >= 515 && Static26.anInt613 <= 580 && Static12.anInt308 >= 4 && Static12.anInt308 <= 18) {
			Static43.method764(1, 2);
			return;
		}
		if (Static26.anInt613 >= 610 && Static26.anInt613 <= 624 && Static12.anInt308 >= 4 && Static12.anInt308 <= 18) {
			Static43.method764(0, 3);
			return;
		}
		if (Static26.anInt613 >= 625 && Static26.anInt613 <= 690 && Static12.anInt308 >= 4 && Static12.anInt308 <= 18) {
			Static43.method764(1, 3);
			return;
		}
		if (Static26.anInt613 >= 708 && Static12.anInt308 >= 4 && Static26.anInt613 <= 758 && Static12.anInt308 <= 20) {
			Static95.aBoolean86 = false;
			Static54.aClass5_Sub2_Sub1_Sub4_4.method2026(0, 0);
			Static25.aClass5_Sub2_Sub1_Sub4_2.method2026(382, 0);
			Static20.aClass5_Sub2_Sub1_Sub3_1.method1354(382 - Static20.aClass5_Sub2_Sub1_Sub3_1.anInt2091 / 2, 18);
			return;
		}
		if (Static20.anInt636 == -1) {
			return;
		}
		@Pc(267) Class18 local267 = Static39.aClass18Array1[Static20.anInt636];
		if (local267.aBoolean25 == Static54.aBoolean49) {
			@Pc(287) byte[] local287 = Static123.method1929(new Class61[] { local267.aClass61_270, Static44.aClass61_348 }).method1719();
			Static30.aString1 = new String(local287, 0, local287.length);
			Static95.aBoolean86 = false;
			if (Static30.anInt925 != 0) {
				Static127.anInt3202 = 443;
				Static30.anInt925 = 0;
				Static79.anInt2009 = 43594;
				Static107.anInt2778 = 43594;
			}
			Static67.anInt1683 = local267.anInt907;
			Static54.aClass5_Sub2_Sub1_Sub4_4.method2026(0, 0);
			Static25.aClass5_Sub2_Sub1_Sub4_2.method2026(382, 0);
			Static20.aClass5_Sub2_Sub1_Sub3_1.method1354(382 - Static20.aClass5_Sub2_Sub1_Sub3_1.anInt2091 / 2, 18);
			return;
		}
		@Pc(385) Class61 local385 = Static123.method1929(new Class61[] { Static112.aClass61_878, local267.aClass61_270, Static44.aClass61_348, Static96.aClass61_742, Static47.aClass61_368, Static39.method730(Static61.aBoolean57 ? 1 : 0), Static43.aClass61_339, Static39.method730(Static91.anInt2419), Static66.aClass61_497, Static39.method730(Static16.anInt495) });
		try {
			arg0.getAppletContext().showDocument(local385.method1729(), "_self");
			return;
		} catch (@Pc(394) Exception local394) {
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)I")
	public static int method1460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 ^ local17 << 13;
		@Pc(37) int local37 = local23 * (local23 * 15731 * local23 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "(II)Lclient!ce;")
	public static Class5_Sub2_Sub3 method1469(@OriginalArg(0) int arg0) {
		@Pc(6) Class5_Sub2_Sub3 local6 = (Class5_Sub2_Sub3) Static67.aClass29_18.method766((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static60.aClass26_7.method1038(5, arg0);
		local6 = new Class5_Sub2_Sub3();
		if (local20 != null) {
			local6.method403(new Class5_Sub14(local20));
		}
		Static67.aClass29_18.method762(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!r;IILclient!r;III)V")
	public static void method1470(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class61 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static117.aBoolean105 || Static36.anInt1015 >= 500) {
			return;
		}
		Static123.aClass61Array23[Static36.anInt1015] = arg0;
		Static107.aClass61Array19[Static36.anInt1015] = arg2;
		Static38.anIntArray223[Static36.anInt1015] = arg5;
		Static86.anIntArray294[Static36.anInt1015] = arg1;
		Static76.anIntArray266[Static36.anInt1015] = arg4;
		Static23.anIntArray124[Static36.anInt1015] = arg3;
		Static36.anInt1015++;
	}

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "(I)V")
	public static void method1475() {
		aClass61_645 = null;
		aClass61_644 = null;
		aClass61_647 = null;
		aClass61_646 = null;
		aRandom2 = null;
		aClass61_648 = null;
	}
}
