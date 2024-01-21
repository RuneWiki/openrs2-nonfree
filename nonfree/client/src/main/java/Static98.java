import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!rb;")
	public static Class55 aClass55_40;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Lclient!oc;")
	public static Class34 aClass34_71;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1432 = Static15.method178("Your account is already logged in)3");

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
	public static int[] anIntArray346 = new int[32768];

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1433 = Static15.method178("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1434 = Static15.method178("::errortest");

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1435 = Static15.method178("Ok");

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	public static int anInt2537 = 0;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1439 = Static15.method178("Cancel");

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1436 = aClass23_1439;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1437 = Static15.method178("mapedge");

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1438 = Static15.method178("Login");

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!ba;")
	public static Class5 aClass5_55 = new Class5(64);

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1440 = aClass23_1432;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1441 = Static15.method178(" (X");

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1442 = aClass23_1438;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1443 = aClass23_1435;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
	public static int method1647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static39.method858(arg0 - 1, arg1 - 1) + Static39.method858(arg0 + 1, arg1 + -1) + Static39.method858(arg0 - 1, arg1 - -1) + Static39.method858(arg0 + 1, arg1 + 1);
		@Pc(67) int local67 = Static39.method858(arg0 - 1, arg1) + Static39.method858(arg0 + 1, arg1) + Static39.method858(arg0, arg1 + -1) + Static39.method858(arg0, arg1 - -1);
		@Pc(77) int local77 = Static39.method858(arg0, arg1);
		return local77 / 4 + local67 / 8 + local39 / 16;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg2;
			arg2 = arg5;
			arg5 = local10;
		}
		@Pc(18) int local18 = arg4 & 0x3;
		if (local18 == 0) {
			return arg3;
		} else if (local18 == 1) {
			return arg0;
		} else if (local18 == 2) {
			return 7 + 1 - arg3 - arg2;
		} else {
			return 7 + 1 - arg0 - arg5;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIIII)Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 method1649(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) long local25 = ((long) arg2 << 40) + (long) arg3 + ((long) arg1 << 16) + ((long) arg4 << 38);
		@Pc(33) Class1_Sub1_Sub6_Sub1 local33;
		if (!arg0) {
			local33 = (Class1_Sub1_Sub6_Sub1) Static2.aClass5_49.method98(local25);
			if (local33 != null) {
				return local33;
			}
		}
		@Pc(41) Class1_Sub1_Sub1 local41 = Static111.method1907(arg3);
		if (arg1 > 1 && local41.anIntArray8 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (local41.anIntArray11[local51] <= arg1 && local41.anIntArray11[local51] != 0) {
					local49 = local41.anIntArray8[local51];
				}
			}
			if (local49 != -1) {
				local41 = Static111.method1907(local49);
			}
		}
		@Pc(92) Class1_Sub1_Sub2_Sub6 local92 = local41.method37(1, true);
		if (local92 == null) {
			return null;
		}
		@Pc(98) Class1_Sub1_Sub6_Sub1 local98 = null;
		if (local41.anInt53 != -1) {
			local98 = method1649(true, 10, 0, local41.anInt67, 1);
			if (local98 == null) {
				return null;
			}
		}
		@Pc(118) int[] local118 = Static24.anIntArray333;
		@Pc(120) int local120 = Static24.anInt2465;
		@Pc(122) int local122 = Static24.anInt2468;
		@Pc(124) int local124 = Static24.anInt2464;
		@Pc(126) int local126 = Static24.anInt2466;
		@Pc(128) int local128 = Static24.anInt2469;
		@Pc(130) int local130 = Static24.anInt2467;
		@Pc(132) int[] local132 = Static93.method1601();
		@Pc(134) int local134 = Static93.anInt2472;
		@Pc(136) int local136 = Static93.anInt2476;
		local33 = new Class1_Sub1_Sub6_Sub1(36, 32);
		Static24.method1584(local33.anIntArray155, 36, 32);
		Static25.anIntArray109 = Static93.method1588(Static25.anIntArray109);
		Static24.method1578(0, 0, 36, 32, 0);
		Static93.aBoolean116 = false;
		Static93.method1598(16, 16);
		@Pc(164) int local164 = local41.anInt85;
		if (arg0) {
			local164 = (int) ((double) local164 * 1.5D);
		} else if (arg4 == 2) {
			local164 = (int) ((double) local164 * 1.04D);
		}
		@Pc(194) int local194 = local164 * Class1_Sub1_Sub6_Sub4.anIntArray338[local41.anInt90] >> 16;
		@Pc(203) int local203 = Class1_Sub1_Sub6_Sub4.anIntArray337[local41.anInt90] * local164 >> 16;
		local92.method1443();
		local92.method1445(local41.anInt55, local41.anInt73, local41.anInt90, local41.anInt75, local41.anInt59 + local92.anInt2285 / 2 + local194, local203 + local41.anInt59);
		if (arg4 >= 1) {
			local33.method778(1);
		}
		if (arg4 >= 2) {
			local33.method778(16777215);
		}
		if (arg2 != 0) {
			local33.method785(arg2);
		}
		Static24.method1584(local33.anIntArray155, 36, 32);
		if (local41.anInt53 != -1) {
			local98.method798(0, 0);
		}
		if (!arg0 && (local41.anInt62 == 1 || arg1 != 1)) {
			Static28.aClass1_Sub1_Sub6_Sub2_12.method836(Static44.method921(arg1), 1, 10, 1);
			Static28.aClass1_Sub1_Sub6_Sub2_12.method836(Static44.method921(arg1), 0, 9, 16776960);
		}
		if (!arg0) {
			Static2.aClass5_49.method97(local33, local25);
		}
		Static24.method1584(local118, local120, local128);
		Static24.method1580(local122, local126, local124, local130);
		Static93.method1588(local132);
		Static93.anInt2476 = local136;
		Static93.anInt2472 = local134;
		Static93.method1594();
		Static93.aBoolean116 = true;
		return local33;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ee;I)Z")
	public static boolean method1650(@OriginalArg(0) Class1_Sub1_Sub7 arg0) {
		if (arg0.anIntArray112 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray112.length; local12++) {
			@Pc(19) int local19 = Static12.method1547(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray114[local12];
			if (arg0.anIntArray112[local12] == 2) {
				if (local19 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray112[local12] == 3) {
				if (local19 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray112[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local24 != local19) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1651() {
		aClass5_55 = null;
		anIntArray345 = null;
		aClass55_40 = null;
		aClass23_1441 = null;
		aClass23_1439 = null;
		aClass23_1436 = null;
		aClass23_1440 = null;
		aClass23_1433 = null;
		aClass23_1437 = null;
		aClass23_1438 = null;
		anIntArray346 = null;
		aClass23_1442 = null;
		aClass23_1434 = null;
		aClass34_71 = null;
		aClass23_1435 = null;
		aClass23_1443 = null;
		aClass23_1432 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1652(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static86.aMethod1;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static113.aClass29_1);
		arg0.addFocusListener(Static113.aClass29_1);
	}
}
