import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ob", name = "Uc", descriptor = "Lclient!ca;")
	public static Class12 aClass12_38;

	@OriginalMember(owner = "client!ob", name = "Lb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_938 = Static78.method1313(" from your friend list first");

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_934 = aClass25_938;

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
	public static int[] anIntArray342 = new int[2000];

	@OriginalMember(owner = "client!ob", name = "Ib", descriptor = "Lclient!fc;")
	public static Class25 aClass25_936 = Static78.method1313(" x");

	@OriginalMember(owner = "client!ob", name = "Kb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_937 = Static78.method1313("<col=ff9040>");

	@OriginalMember(owner = "client!ob", name = "Pc", descriptor = "[I")
	public static int[] anIntArray347 = new int[500];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([Lclient!fc;B)[Lclient!fc;")
	public static Class25[] method1430(@OriginalArg(0) Class25[] arg0) {
		@Pc(4) Class25[] local4 = new Class25[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local4[local15] = Static116.method1859(new Class25[] { Static74.method1214(local15), Static74.aClass25_739 });
			if (arg0 != null && arg0[local15] != null) {
				local4[local15] = Static116.method1859(new Class25[] { local4[local15], arg0[local15] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method1435() {
		aClass25_937 = null;
		anIntArray347 = null;
		anIntArray342 = null;
		aClass12_38 = null;
		aClass25_936 = null;
		aClass25_938 = null;
		aClass25_934 = null;
	}
}
