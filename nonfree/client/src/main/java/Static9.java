import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "[[Lclient!ob;")
	public static Class60[][] aClass60ArrayArray1;

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	public static volatile int anInt376 = -1;

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
	public static int anInt378 = 0;

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "Lclient!ed;")
	public static Class23 aClass23_131 = Static169.method2903("(U(Y");

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "[Lclient!a;")
	public static Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
	public static void method208() {
		aClass60ArrayArray1 = null;
		aClass23_131 = null;
		anIntArray55 = null;
		aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Z")
	public static boolean method209(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
