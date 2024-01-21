import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!p", name = "r", descriptor = "Lclient!ff;")
	public static Class11 aClass11_37;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	public static int anInt2274 = 255;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!wd;")
	private static Class80 aClass80_901 = Static2.method59(" has logged in)3");

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_893 = aClass80_901;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
	public static int[] anIntArray306 = new int[2000];

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!wd;")
	private static Class80 aClass80_898 = Static2.method59("Take");

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_894 = aClass80_898;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!wd;")
	private static Class80 aClass80_896 = Static2.method59("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_895 = aClass80_896;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_900 = Static2.method59("To create a new account you need to");

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_897 = aClass80_900;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_899 = Static2.method59(" (X");

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	public static int anInt2281 = 2;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!va;)Lclient!wd;")
	public static Class80 method1402(@OriginalArg(1) Class2_Sub1_Sub17 arg0) {
		if (Static61.method1053(Static102.method1660(arg0)) == 0) {
			return null;
		} else if (arg0.aClass80_1158 == null || arg0.aClass80_1158.method2026().method1999() == 0) {
			return Static97.aBoolean188 ? Static42.aClass80_466 : null;
		} else {
			return arg0.aClass80_1158;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLclient!ff;Lclient!ff;)V")
	public static void method1403(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static62.aClass11_28 = arg1;
		Static28.aClass11_38 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1404() {
		aClass80_899 = null;
		aClass80_898 = null;
		aClass80_900 = null;
		anIntArray306 = null;
		aClass80_893 = null;
		aClass80_897 = null;
		aClass11_37 = null;
		aClass80_894 = null;
		aClass80_895 = null;
		aClass80_896 = null;
		aLongArray8 = null;
		aClass80_901 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)Lclient!wd;")
	public static Class80 method1406(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static28.method1422(arg0) : Static62.aClass80_662;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lclient!ba;")
	public static Class2_Sub1_Sub2 method1407(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub2 local10 = (Class2_Sub1_Sub2) Static120.aClass32_55.method887((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static11.aClass11_5.method383(arg0, 1);
		local10 = new Class2_Sub1_Sub2();
		if (local20 != null) {
			local10.method131(arg0, new Class2_Sub17(local20));
		}
		local10.method135();
		Static120.aClass32_55.method880(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!v;Lclient!ff;ZLclient!ff;I)V")
	public static void method1408(@OriginalArg(0) Class2_Sub1_Sub9_Sub4 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class11 arg3) {
		Static23.aClass11_15 = arg1;
		Static90.aClass11_36 = arg3;
		Static84.aBoolean154 = arg2;
		Static86.anInt2120 = Static23.aClass11_15.method387(10);
		Static73.aClass2_Sub1_Sub9_Sub4_23 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!hb;III)V")
	public static void method1409(@OriginalArg(0) Class2_Sub1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(19) int local19 = arg1 * arg1 + arg2 * arg2;
		@Pc(25) int local25 = Static92.anInt2272 + Static124.anInt3139 & 0x7FF;
		if (local19 > 6400) {
			return;
		}
		@Pc(35) int local35 = Class2_Sub1_Sub9_Sub2.anIntArray202[local25];
		@Pc(39) int local39 = Class2_Sub1_Sub9_Sub2.anIntArray198[local25];
		@Pc(47) int local47 = local39 * 256 / (Static108.anInt2879 + 256);
		@Pc(55) int local55 = local35 * 256 / (Static108.anInt2879 + 256);
		@Pc(65) int local65 = arg2 * local47 + arg1 * local55 >> 16;
		@Pc(76) int local76 = arg1 * local47 - local55 * arg2 >> 16;
		if (local19 <= 2500) {
			arg0.method825(local65 + 4 + 94 - arg0.anInt1447 / 2, -local76 + -4 + 83 - arg0.anInt1446 / 2);
		} else {
			arg0.method830(Static89.aClass2_Sub1_Sub9_Sub3_55, local65 + 4 + 94 - arg0.anInt1447 / 2, -local76 + 83 - arg0.anInt1446 / 2 + -4);
		}
	}
}
