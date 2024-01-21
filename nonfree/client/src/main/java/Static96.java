import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array4;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Z")
	public static boolean aBoolean98 = true;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
	public static int[] anIntArray229 = new int[2000];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lclient!ae;")
	public static Class5 method1319(@OriginalArg(1) int arg0) {
		return Static70.method1194(false, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method1320() {
		anIntArray229 = null;
		aClass3_Sub1_Sub2_Sub4Array4 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lclient!o;")
	public static Class37 method1321() {
		try {
			return (Class37) Class.forName("Class37_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class37_Sub1();
		}
	}
}
