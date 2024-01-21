import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!ca;")
	public static Class5_Sub2_Sub1 aClass5_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public static int anInt2058 = 1;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_620 = Static81.method1507("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!dj;")
	public static Class24 aClass24_616 = aClass24_620;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_617 = Static81.method1507("<col=ffff00>");

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "[I")
	public static final int[] anIntArray177 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_618 = Static81.method1507("Texturen geladen)3");

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_619 = Static81.method1507("Wordpack geladen)3");

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "Lclient!s;")
	public static final Class87 aClass87_14 = new Class87();

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "[I")
	public static final int[] anIntArray178 = new int[5];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZII)Lclient!vc;")
	public static Class98 method1589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class98 local7 = Static188.method3229(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass98Array3 == null || local7.aClass98Array3.length <= arg1) {
			return null;
		} else {
			return local7.aClass98Array3[arg1];
		}
	}
}
