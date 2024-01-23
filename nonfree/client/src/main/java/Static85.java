import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!fh;")
	public static Class58 aClass58_41;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Lclient!fh;")
	public static Class58 aClass58_42;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
	public static int anInt1975;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
	public static int anInt1976;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)Lclient!jf;")
	public static Class78 method1500() {
		try {
			return new Class78_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class78) Class.forName("Class78_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class78_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V")
	public static void method1501(@OriginalArg(0) int arg0) {
		Static131.aClass26_25.method511();
		Static131.aClass26_25 = new Class26(arg0);
	}
}
