import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "Lclient!c;")
	public static Class10 aClass10_77;

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "Lclient!ai;")
	public static Class6 aClass6_675 = Static38.method685("null");

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "Lclient!ai;")
	public static Class6 aClass6_676 = Static38.method685("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
	public static int anInt2355 = -1;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "[I")
	public static int[] anIntArray178 = new int[25];

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray38 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ai;I)Z")
	public static boolean method1543(@OriginalArg(0) Class6 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static111.anInt2637; local11++) {
			if (arg0.method137(Static118.aClass6Array16[local11])) {
				return true;
			}
		}
		return arg0.method137(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass6_244);
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
	public static void method1544() {
		aClass6_675 = null;
		aClass10_77 = null;
		Class2_Sub3_Sub11.anIntArray177 = null;
		aClass6_676 = null;
		anIntArray178 = null;
		anIntArrayArray38 = null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ai;IIIILclient!ai;I)V")
	public static void method1546(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6 arg5) {
		if (Static160.aBoolean24 || Static46.anInt1322 >= 500) {
			return;
		}
		Static103.aClass6Array13[Static46.anInt1322] = arg5;
		Static134.aClass6Array17[Static46.anInt1322] = arg0;
		Static65.anIntArray104[Static46.anInt1322] = arg1;
		Static117.anIntArray238[Static46.anInt1322] = arg3;
		Static30.anIntArray34[Static46.anInt1322] = arg4;
		Static134.anIntArray283[Static46.anInt1322] = arg2;
		Static46.anInt1322++;
	}
}
