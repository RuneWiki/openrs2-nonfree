import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!fp;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!ct;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	public static int anInt239 = -1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)V")
	public static void method293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= Static93.anInt5014 && Static122.anInt1360 >= arg1 && Static131.anInt2843 <= arg4 && arg0 <= Static38.anInt945) {
			if (arg3 == 1) {
				Static359.method5943(arg4, arg5, arg0, arg1, arg2);
			} else {
				Static194.method3629(arg5, arg4, arg0, arg2, arg3, arg1);
			}
		} else if (arg3 == 1) {
			Static320.method4035(arg2, arg5, arg1, arg0, arg4);
		} else {
			Static356.method5904(arg0, arg4, arg1, arg5, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method294() {
		if (Static272.aBoolean405 && Static271.aClass60_2.method1863(81) && Static224.anInt4512 > 2) {
			Static102.method6044((Class1_Sub22) Static317.aClass42_43.aClass1_73.aClass1_252.aClass1_252);
		} else {
			Static102.method6044((Class1_Sub22) Static317.aClass42_43.aClass1_73.aClass1_252);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method296(@OriginalArg(0) String arg0) {
		return Static152.method2918(arg0);
	}
}
