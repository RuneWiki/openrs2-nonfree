import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static87 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public static int anInt2536;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public static int anInt2537;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public static int anInt2539 = 0;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	public static int[] anIntArray421 = new int[50];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)Z")
	public static boolean method1993(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1994() {
		anIntArray421 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)Lclient!eh;")
	public static Class28 method1995(@OriginalArg(0) int arg0) {
		return Static69.aClass28Array12[arg0].method901() > 0 ? Static4.method96(new Class28[] { Static145.aClass28Array22[arg0], Static22.aClass28_242, Static69.aClass28Array12[arg0] }) : Static145.aClass28Array22[arg0];
	}
}
