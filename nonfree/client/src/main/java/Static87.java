import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!f;")
	public static Class27 aClass27_3;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public static int anInt957 = 0;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
	public static int[] anIntArray121 = new int[100];

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
	public static int anInt958 = 500;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
	public static int[] anIntArray122 = new int[25];

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!ed;")
	public static Class23 aClass23_370 = Static169.method2903("<col=00ff80>");

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	public static int anInt959 = -1;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_371 = Static169.method2903("welle2:");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Lclient!db;")
	public static Class1_Sub1_Sub6 method576(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub6 local15 = (Class1_Sub1_Sub6) Static50.aClass79_5.method2657((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static70.aClass30_29.method1301(14, arg0);
		local15 = new Class1_Sub1_Sub6();
		if (local25 != null) {
			local15.method532(new Class1_Sub8(local25));
		}
		Static50.aClass79_5.method2658((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public static void method579() {
		aClass23_370 = null;
		aClass23_371 = null;
		aClass27_3 = null;
		anIntArray122 = null;
		anIntArray121 = null;
	}
}
