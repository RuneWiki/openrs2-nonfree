import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_26 = new Class218(93, 4);

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	public static int anInt2551 = -1;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public static void method2488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static170.aClass106ArrayArrayArray1[0][arg1][arg2] != null && Static170.aClass106ArrayArrayArray1[0][arg1][arg2].aClass106_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static170.aClass106ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(44) Class106 local44 = Static170.aClass106ArrayArrayArray1[local22][arg1][arg2] = new Class106(local22);
				if (local20) {
					local44.aByte46++;
				}
			}
		}
	}
}
