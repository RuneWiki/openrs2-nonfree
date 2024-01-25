import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "[I")
	public static final int[] anIntArray100 = new int[1];

	@OriginalMember(owner = "client!dia", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[128][128];

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[S)[S")
	public static short[] method2491(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static655.method6402(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
	public static void method2492(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static194.method3870(arg2, arg3, arg5, null, arg1, -1, arg4, arg0);
	}
}
