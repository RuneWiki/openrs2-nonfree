import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt2564;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!ah;")
	public static Class7 aClass7_42;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public static int anInt2569 = 0;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt2570 = 1;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public static int anInt2571 = 3;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "[Lclient!gd;")
	public static Class32[] aClass32Array1 = new Class32[5000];

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray31 = new int[4][105][105];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIILclient!kb;IJ)Z")
	public static boolean method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub2_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static92.method3173(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method2048() {
		anIntArrayArrayArray31 = null;
		aClass32Array1 = null;
		aClass7_42 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method2049(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static87.anInt2539 != 1) {
			return;
		}
		if (Static2.anInt80 >= 280 && Static2.anInt80 <= 294 && Static160.anInt3914 >= 4 && Static160.anInt3914 <= 18) {
			Static26.method683(0, 0);
			return;
		}
		if (Static2.anInt80 >= 295 && Static2.anInt80 <= 360 && Static160.anInt3914 >= 4 && Static160.anInt3914 <= 18) {
			Static26.method683(1, 0);
			return;
		}
		if (Static2.anInt80 >= 390 && Static2.anInt80 <= 404 && Static160.anInt3914 >= 4 && Static160.anInt3914 <= 18) {
			Static26.method683(0, 1);
			return;
		}
		if (Static2.anInt80 >= 405 && Static2.anInt80 <= 470 && Static160.anInt3914 >= 4 && Static160.anInt3914 <= 18) {
			Static26.method683(1, 1);
			return;
		}
		if (Static2.anInt80 >= 500 && Static2.anInt80 <= 514 && Static160.anInt3914 >= 4 && Static160.anInt3914 <= 18) {
			Static26.method683(0, 2);
			return;
		}
		if (Static2.anInt80 >= 515 && Static2.anInt80 <= 580 && Static160.anInt3914 >= 4 && Static160.anInt3914 <= 18) {
			Static26.method683(1, 2);
			return;
		}
		if (Static2.anInt80 >= 610 && Static2.anInt80 <= 624 && Static160.anInt3914 >= 4 && Static160.anInt3914 <= 18) {
			Static26.method683(0, 3);
			return;
		}
		if (Static2.anInt80 >= 625 && Static2.anInt80 <= 690 && Static160.anInt3914 >= 4 && Static160.anInt3914 <= 18) {
			Static26.method683(1, 3);
			return;
		}
		if (Static2.anInt80 >= 708 && Static160.anInt3914 >= 4 && Static2.anInt80 <= 758 && Static160.anInt3914 <= 20) {
			Static109.aBoolean138 = false;
			Static60.aClass3_Sub2_Sub2_Sub4_4.method986(0, 0);
			Static15.aClass3_Sub2_Sub2_Sub4_3.method986(382, 0);
			Static119.aClass3_Sub2_Sub2_Sub3_2.method840(382 - Static119.aClass3_Sub2_Sub2_Sub3_2.anInt1013 / 2, 18);
			return;
		}
		if (Static102.anInt2668 == -1) {
			return;
		}
		@Pc(261) Class67 local261 = Static59.aClass67Array1[Static102.anInt2668];
		if (local261.aBoolean155 == Static86.aBoolean127) {
			@Pc(281) byte[] local281 = Static4.method96(new Class28[] { local261.aClass28_1077, Static15.aClass28_366 }).method935();
			Static81.aString1 = new String(local281, 0, local281.length);
			Static109.aBoolean138 = false;
			if (Static81.anInt2377 != 0) {
				Static81.anInt2377 = 0;
				Static23.anInt602 = 443;
				Static128.anInt3275 = 43594;
				Static74.anInt2214 = 43594;
			}
			Static170.anInt4098 = local261.anInt3279;
			Static60.aClass3_Sub2_Sub2_Sub4_4.method986(0, 0);
			Static15.aClass3_Sub2_Sub2_Sub4_3.method986(382, 0);
			Static119.aClass3_Sub2_Sub2_Sub3_2.method840(382 - Static119.aClass3_Sub2_Sub2_Sub3_2.anInt1013 / 2, 18);
			return;
		}
		@Pc(382) Class28 local382 = Static4.method96(new Class28[] { Static48.aClass28_429, local261.aClass28_1077, Static15.aClass28_366, Static156.aClass28_1304, Static9.aClass28_112, Static146.method2793(Static179.aBoolean202 ? 1 : 0), Static129.aClass28_1078, Static146.method2793(Static140.anInt3584), Static170.aClass28_1429, Static146.method2793(Static43.anInt1212) });
		try {
			arg0.getAppletContext().showDocument(local382.method909(), "_self");
		} catch (@Pc(391) Exception local391) {
		}
	}
}
