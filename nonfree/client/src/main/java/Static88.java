import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
	public static int anInt1938;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "[I")
	public static final int[] anIntArray200 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)V")
	public static void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0];
		@Pc(18) int local18 = Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0];
		if (Static269.anInt5508 == 1) {
			if (!Static309.method5200(0, 0, local18, local8, 1, arg1, 1, -2, arg0, false)) {
				Static309.method5200(0, 0, local18, local8, 1, arg1, 1, -3, arg0, false);
			}
		} else if (!Static309.method5200(0, 0, local18, local8, 1, arg1, 1, -3, arg0, false)) {
			Static309.method5200(0, 0, local18, local8, 1, arg1, 1, -2, arg0, false);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
	public static void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= Static338.anInt5369 && Static295.anInt5964 >= arg2 && Static229.anInt4777 <= arg4 && arg1 <= Static165.anInt3366) {
			Static79.method1439(arg0, arg4, arg3, arg2, arg1);
		} else {
			Static89.method1576(arg0, arg3, arg2, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!hq;)V")
	public static void method1569(@OriginalArg(1) Class17_Sub4 arg0) {
		arg0.aClass2_Sub2_Sub1_1 = null;
		if (Static154.anInt3459 < 20) {
			Static79.aClass204_5.method5365(arg0);
			Static154.anInt3459++;
		}
	}
}
