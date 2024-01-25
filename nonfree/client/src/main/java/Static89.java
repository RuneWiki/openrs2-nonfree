import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	public static int anInt1953 = -1;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "J")
	public static long aLong69 = 0L;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "[I")
	public static final int[] anIntArray202 = new int[4];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIII)V")
	public static void method1576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = Static181.method3367(Static229.anInt4777, arg4, Static165.anInt3366);
		@Pc(19) int local19 = Static181.method3367(Static229.anInt4777, arg3, Static165.anInt3366);
		@Pc(25) int local25 = Static181.method3367(Static338.anInt5369, arg0, Static295.anInt5964);
		@Pc(31) int local31 = Static181.method3367(Static338.anInt5369, arg2, Static295.anInt5964);
		for (@Pc(37) int local37 = local13; local37 <= local19; local37++) {
			Static182.method3394(local25, Static30.anIntArrayArray10[local37], arg1, local31);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)I")
	public static int method1577(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
