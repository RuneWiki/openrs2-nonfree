import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "[I")
	public static final int[] anIntArray171 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "J")
	public static long aLong49 = 0L;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIZI)V")
	public static void method1721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static179.anInt3768 <= arg2 && arg2 <= Static121.anInt6758) {
			@Pc(15) int local15 = Static86.method1459(Static69.anInt1551, arg0, Static317.anInt5793);
			@Pc(21) int local21 = Static86.method1459(Static69.anInt1551, arg3, Static317.anInt5793);
			Static342.method5480(local15, arg2, local21, arg1);
		}
	}
}
