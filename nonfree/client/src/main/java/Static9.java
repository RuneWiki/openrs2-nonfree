import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "A", descriptor = "I")
	public static int anInt10387;

	@OriginalMember(owner = "client!aea", name = "B", descriptor = "Lclient!tf;")
	public static Class17 aClass17_77;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_225 = new Class151(50, 3);

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "[Lclient!eba;")
	public static final Class82[] aClass82Array41 = new Class82[8];

	@OriginalMember(owner = "client!aea", name = "x", descriptor = "[I")
	public static final int[] anIntArray715 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
	public static int anInt10388 = 0;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIZII)V")
	public static void method8773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = Static385.method4989(Static73.anInt1542, arg0, Static527.anInt8177);
		@Pc(22) int local22 = Static385.method4989(Static73.anInt1542, arg1, Static527.anInt8177);
		@Pc(28) int local28 = Static385.method4989(Static472.anInt7503, arg4, Static257.anInt4172);
		@Pc(34) int local34 = Static385.method4989(Static472.anInt7503, arg2, Static257.anInt4172);
		@Pc(42) int local42 = Static385.method4989(Static73.anInt1542, arg0 + arg5, Static527.anInt8177);
		@Pc(54) int local54 = Static385.method4989(Static73.anInt1542, arg1 - arg5, Static527.anInt8177);
		for (@Pc(56) int local56 = local16; local56 < local42; local56++) {
			Static559.method7424(arg3, Static172.anIntArrayArray17[local56], local34, local28);
		}
		for (@Pc(72) int local72 = local22; local72 > local54; local72--) {
			Static559.method7424(arg3, Static172.anIntArrayArray17[local72], local34, local28);
		}
		@Pc(94) int local94 = Static385.method4989(Static472.anInt7503, arg5 + arg4, Static257.anInt4172);
		@Pc(102) int local102 = Static385.method4989(Static472.anInt7503, arg2 - arg5, Static257.anInt4172);
		for (@Pc(104) int local104 = local42; local104 <= local54; local104++) {
			@Pc(110) int[] local110 = Static172.anIntArrayArray17[local104];
			Static559.method7424(arg3, local110, local94, local28);
			Static559.method7424(arg3, local110, local34, local102);
		}
	}
}
