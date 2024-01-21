import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!k", name = "W", descriptor = "I")
	public static int anInt2295 = 0;

	@OriginalMember(owner = "client!k", name = "X", descriptor = "I")
	public static int anInt2296 = 0;

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "[I")
	public static final int[] anIntArray216 = new int[32];

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_836 = Static177.method3050("null");

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
	public static int anInt2298 = 0;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(II)V")
	public static void method1775(@OriginalArg(0) int arg0) {
		if (!Static165.method2751(arg0)) {
			return;
		}
		@Pc(14) Class1[] local14 = Static54.aClass1ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(30) Class1 local30 = local14[local16];
			if (local30 != null) {
				local30.anInt76 = 0;
				local30.anInt70 = 0;
			}
		}
	}
}
