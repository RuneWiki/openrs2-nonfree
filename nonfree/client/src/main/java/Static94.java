import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "[Lclient!u;")
	public static final Class196[] aClass196Array1 = new Class196[50];

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "[I")
	public static final int[] anIntArray127 = new int[14];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void method1992() {
		Static26.aClass59_2.method4791(((float) Static190.anInt3772 * 0.1F + 0.7F) * 1.1523438F);
		Static26.aClass59_2.method4793(Static12.anInt376, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static26.aClass59_2.method4790(Static28.anInt775, -1);
		Static26.aClass59_2.method4788(Static230.aClass18_4);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIBIII)V")
	public static void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg3 - 32) * arg3 / arg2;
		if (local11 < 8) {
			local11 = 8;
		}
		@Pc(30) int local30 = arg0 * (arg3 - local11 - 32) / (arg2 - arg3);
		Static225.aClass54Array17[0].method5569(arg4, arg1);
		Static225.aClass54Array17[1].method5569(arg4, arg1 + arg3 - 16);
		Static15.aClass59_1.method4835(arg1 + 16, arg4, arg3 - 32, 16, Static67.anInt1688);
		Static15.aClass59_1.method4835(arg1 + local30 + 16, arg4, local11, 16, Static172.anInt3528);
		Static15.aClass59_1.method4821(arg4, Static271.anInt5202, local11, arg1 + local30 + 16);
		Static15.aClass59_1.method4821(arg4 + 1, Static271.anInt5202, local11, local30 + arg1 + 16);
		Static15.aClass59_1.method4797(Static271.anInt5202, local30 + arg1 + 16, 16, arg4);
		Static15.aClass59_1.method4797(Static271.anInt5202, arg1 + local30 + 17, 16, arg4);
		Static15.aClass59_1.method4821(arg4 + 15, Static65.anInt1965, local11, arg1 + local30 + 16);
		Static15.aClass59_1.method4821(arg4 + 14, Static65.anInt1965, local11 - 1, arg1 + 17 + local30);
		Static15.aClass59_1.method4797(Static65.anInt1965, local11 + local30 + arg1 + 15, 16, arg4);
		Static15.aClass59_1.method4797(Static65.anInt1965, local30 + arg1 + local11 + 14, 15, arg4 + 1);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V")
	public static void method1998() {
		if (Static236.aBoolean333) {
			return;
		}
		Static197.method3520(Static275.aClass51ArrayArrayArray3);
		if (Static147.aClass51ArrayArrayArray2 != null) {
			Static197.method3520(Static147.aClass51ArrayArrayArray2);
		}
		Static236.aBoolean333 = true;
	}
}
