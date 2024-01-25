import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array5;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "[I")
	public static final int[] anIntArray117 = new int[25];

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	public static int anInt2642 = -1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIB)I")
	public static int method2234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(30) byte local30;
		if (arg1 > 20000) {
			local30 = 4;
			Static426.method6634();
		} else if (arg1 > 10000) {
			local30 = 3;
			Static139.method2957();
		} else if (arg1 <= 5000) {
			local30 = 1;
			Static169.method3359();
		} else {
			local30 = 2;
			Static127.method2816();
		}
		if (arg0 != Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358()) {
			Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, arg0);
			Static553.method7773(false, arg0);
		}
		Static35.method7912();
		return local30;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static132.method2911(Static444.anInt8258, arg1, Static188.anInt4410);
		@Pc(22) int local22 = Static132.method2911(Static444.anInt8258, arg5, Static188.anInt4410);
		@Pc(28) int local28 = Static132.method2911(Static251.anInt9634, arg4, Static366.anInt6946);
		@Pc(34) int local34 = Static132.method2911(Static251.anInt9634, arg3, Static366.anInt6946);
		@Pc(42) int local42 = Static132.method2911(Static444.anInt8258, arg0 + arg1, Static188.anInt4410);
		@Pc(51) int local51 = Static132.method2911(Static444.anInt8258, arg5 - arg0, Static188.anInt4410);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static36.method1264(Static632.anIntArrayArray65[local53], local28, arg6, local34);
		}
		for (@Pc(73) int local73 = local22; local73 > local51; local73--) {
			Static36.method1264(Static632.anIntArrayArray65[local73], local28, arg6, local34);
		}
		@Pc(101) int local101 = Static132.method2911(Static251.anInt9634, arg0 + arg4, Static366.anInt6946);
		@Pc(110) int local110 = Static132.method2911(Static251.anInt9634, arg3 - arg0, Static366.anInt6946);
		for (@Pc(112) int local112 = local42; local112 <= local51; local112++) {
			@Pc(118) int[] local118 = Static632.anIntArrayArray65[local112];
			Static36.method1264(local118, local28, arg6, local101);
			Static36.method1264(local118, local101, arg2, local110);
			Static36.method1264(local118, local110, arg6, local34);
		}
	}
}
