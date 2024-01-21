import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1109 = Static38.method736("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1111 = Static38.method736("Classic");

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1110 = aClass71_1111;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	public static int anInt2285 = 0;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1112 = Static38.method736("On");

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public static int anInt2286 = -1;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1113 = Static38.method736(",Zffentlicher Chat");

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1119 = Static38.method736(" has logged out)3");

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1114 = aClass71_1119;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
	public static int anInt2287 = -1;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1115 = Static38.method736("weiss:");

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1116 = Static38.method736("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1117 = aClass71_1112;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1118 = Static38.method736("Privater Chat");

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
	public static volatile int anInt2293 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!f;)V")
	public static void method1576(@OriginalArg(1) Class23 arg0) {
		Static35.aClass23_1 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!me;IIIIIBII)V")
	public static void method1578(@OriginalArg(0) Class5_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static56.aBoolean60) {
			Static2.anInt1862 = 32;
		} else {
			Static2.anInt1862 = 0;
		}
		Static56.aBoolean60 = false;
		@Pc(159) int local159;
		if (arg6 >= arg3 && arg6 < arg3 + 16 && arg5 >= arg7 && arg5 < arg7 + 16) {
			if (arg4 == 1) {
				Static28.aBoolean33 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static68.aBoolean72 = true;
			}
			arg0.anInt1774 -= Static79.anInt1938 * 4;
		} else if (arg3 <= arg6 && arg3 + 16 > arg6 && arg1 + arg7 - 16 <= arg5 && arg5 < arg7 + arg1) {
			if (arg4 == 2 || arg4 == 3) {
				Static68.aBoolean72 = true;
			}
			if (arg4 == 1) {
				Static28.aBoolean33 = true;
			}
			arg0.anInt1774 += Static79.anInt1938 * 4;
		} else if (arg6 >= arg3 - Static2.anInt1862 && arg3 + Static2.anInt1862 + 16 > arg6 && arg5 >= arg7 + 16 && arg5 < arg7 + arg1 - 16 && Static79.anInt1938 > 0) {
			Static56.aBoolean60 = true;
			if (arg4 == 1) {
				Static28.aBoolean33 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static68.aBoolean72 = true;
			}
			local159 = arg1 * (arg1 - 32) / arg2;
			if (local159 < 8) {
				local159 = 8;
			}
			@Pc(173) int local173 = arg1 - local159 - 32;
			@Pc(184) int local184 = arg5 - local159 / 2 - arg7 - 16;
			arg0.anInt1774 = local184 * (arg2 - arg1) / local173;
		}
		if (Static88.anInt2064 == 0) {
			return;
		}
		local159 = arg0.anInt1776;
		if (arg4 == -1) {
			local159 = 479;
		}
		if (arg6 < arg3 - local159 || arg7 > arg5 || arg3 + 16 <= arg6 || arg1 + arg7 < arg5) {
			return;
		}
		if (arg4 == 1) {
			Static28.aBoolean33 = true;
		}
		arg0.anInt1774 += Static88.anInt2064 * 45;
		if (arg4 == 2 || arg4 == 3) {
			Static68.aBoolean72 = true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public static void method1580() {
		aClass71_1115 = null;
		aClass71_1109 = null;
		aClass71_1118 = null;
		aClass71_1110 = null;
		aClass71_1114 = null;
		aClass71_1111 = null;
		aByteArrayArray9 = null;
		aClass71_1116 = null;
		aClass71_1119 = null;
		aClass71_1113 = null;
		aClass71_1112 = null;
		aClass71_1117 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method1583() {
		Static30.aClass54_19.method1402();
	}
}
