import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!me;")
	public static Class2_Sub13 aClass2_Sub13_3;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_656 = Static38.method685("scrollbar");

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_657 = Static38.method685("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_658 = Static38.method685("Registrierter Benutzer");

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!ai;")
	public static Class6 aClass6_659 = Static38.method685("<col=ffff00>*V");

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!wa;")
	public static Class87 aClass87_6 = null;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "[I")
	public static int[] anIntArray154 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)I")
	public static int method1474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static76.method1169(arg1 + 45365, arg0 - -91923, 4) + (Static76.method1169(arg1 + 10294, arg0 + 37821, 2) - 128 >> 1) + (Static76.method1169(arg1, arg0, 1) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!te;Lclient!c;ILclient!c;Z)V")
	public static void method1483(@OriginalArg(0) Class2_Sub3_Sub2_Sub4_Sub1 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) boolean arg3) {
		Static111.aClass10_87 = arg1;
		Static106.aClass10_145 = arg2;
		Static38.aBoolean39 = arg3;
		Static112.anInt2716 = Static111.aClass10_87.method1588(10);
		Static12.aClass2_Sub3_Sub2_Sub4_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	public static void method1486() {
		aClass87_6 = null;
		aClass6_657 = null;
		anIntArray153 = null;
		anIntArray154 = null;
		aClass6_658 = null;
		aClass6_656 = null;
		aClass2_Sub13_3 = null;
		aClass6_659 = null;
	}
}
