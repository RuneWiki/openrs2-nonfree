import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public static int anInt1938;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!hd;")
	public static Class2_Sub10 aClass2_Sub10_1 = new Class2_Sub10(0, 0);

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_947 = Static32.method683("k");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBIIIIII)V")
	public static void method1582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static163.method531(arg6)) {
			Static65.method3008(arg1, arg4, arg2, arg5, Static149.aClass85ArrayArray1[arg6], arg3, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
	public static int method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = arg2 & 0x3;
		if (local11 == 0) {
			return arg0;
		} else if (local11 == 1) {
			return 7 - arg1;
		} else if (local11 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method1584() {
		Static21.aClass74_19.method2347();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Z")
	public static boolean method1585() {
		@Pc(9) Class39 local9 = Static181.aClass39_1;
		synchronized (Static181.aClass39_1) {
			if (Static155.anInt3388 == Static50.anInt1148) {
				return false;
			} else {
				Static180.anInt3987 = Static74.anIntArray180[Static155.anInt3388];
				Static72.anInt1492 = Static28.anIntArray52[Static155.anInt3388];
				Static155.anInt3388 = Static155.anInt3388 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1586() {
		aClass2_Sub10_1 = null;
		aClass49_947 = null;
	}
}
