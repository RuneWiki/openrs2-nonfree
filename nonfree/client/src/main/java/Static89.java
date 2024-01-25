import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static89 {

	@OriginalMember(owner = "client!dl", name = "R", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
	public static final int anInt1941 = 1401;

	@OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
	public static int anInt1948 = -1;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!oa;II)V")
	public static void method1813(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		Static236.aClass5_4 = arg1;
		Static313.aClass92ArrayArray1 = new Class92[arg0][arg2];
		if (Static342.anIntArray555 != null) {
			Static214.aClass66_2 = Static407.method6165(Static342.anIntArray555[2], Static342.anIntArray555[4], Static342.anIntArray555[5], Static342.anIntArray555[3], Static342.anIntArray555[0], Static342.anIntArray555[1]);
		}
		Static510.aClass92_2 = new Class92();
		Static374.method5882();
	}
}
