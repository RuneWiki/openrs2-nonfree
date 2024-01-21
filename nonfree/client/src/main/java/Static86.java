import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_37;

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_38;

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "Lclient!wa;")
	public static Class2_Sub13_Sub1 aClass2_Sub13_Sub1_13 = new Class2_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1596 = Static32.method683("(U2");

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "[I")
	public static int[] anIntArray315 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
	public static int anInt3521 = 0;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1597 = Static32.method683(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1598 = Static32.method683("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
	public static int anInt3522 = 0;

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "[J")
	public static long[] aLongArray20 = new long[32];

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1599 = Static32.method683("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ka", name = "Y", descriptor = "J")
	public static long aLong144 = 0L;

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1600 = aClass49_1599;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public static void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class85 local8 = Static114.method1938(arg0, arg2);
		if (local8 != null && local8.anObjectArray21 != null) {
			@Pc(17) Class2_Sub12 local17 = new Class2_Sub12();
			local17.aClass85_4 = local8;
			local17.anObjectArray2 = local8.anObjectArray21;
			Static38.method766(local17);
		}
		Static108.aBoolean93 = true;
		Static148.anInt3151 = arg0;
		Static138.anInt2937 = arg1;
		Static7.anInt138 = arg2;
		Static102.method1756(local8);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
	public static void method2728() {
		aClass2_Sub13_Sub1_13 = null;
		aClass11_Sub1_37 = null;
		aClass49_1599 = null;
		aClass49_1597 = null;
		aClass11_Sub1_38 = null;
		aClass49_1598 = null;
		aClass49_1600 = null;
		aClass49_1596 = null;
		anIntArray315 = null;
		aLongArray20 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
	public static void method2729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILclient!ka;IJZ)Z")
	public static boolean method2730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub2_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static108.method1829(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
