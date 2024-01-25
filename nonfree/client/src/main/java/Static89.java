import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!lm;")
	public static Class134 aClass134_39;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "[[Lclient!qs;")
	public static Class172[][] aClass172ArrayArray1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString68 = "Loaded update list";

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
	public static final int[] anIntArray145 = new int[4096];

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_33 = new Class37(4);

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	public static int anInt1702 = 0;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "[I")
	public static final int[] anIntArray146 = new int[100];

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "[I")
	public static final int[] anIntArray147 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZI)I")
	public static int method1431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static306.method5294(arg0 - 1, arg1 + -1) + Static306.method5294(arg0 + 1, arg1 - 1) + Static306.method5294(arg0 + -1, arg1 + 1) + Static306.method5294(arg0 + 1, arg1 + 1);
		@Pc(77) int local77 = Static306.method5294(arg0 - 1, arg1) + Static306.method5294(arg0 + 1, arg1) + Static306.method5294(arg0, arg1 + -1) + Static306.method5294(arg0, arg1 + 1);
		@Pc(82) int local82 = Static306.method5294(arg0, arg1);
		return local82 / 4 + local47 / 16 + local77 / 8;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V")
	public static void method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static60.anInt1399 && arg1 <= Static138.anInt6334 && Static41.anInt1131 <= arg0 && Static165.anInt3409 >= arg2) {
			Static86.method1395(arg0, arg3, arg1, arg4, arg2);
		} else {
			Static22.method394(arg1, arg4, arg3, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg5) {
			Static25.method409(arg6, arg1, arg5, arg3, arg0, arg2);
		} else if (arg2 - arg5 >= Static60.anInt1399 && arg5 + arg2 <= Static138.anInt6334 && Static41.anInt1131 <= arg0 - arg4 && arg4 + arg0 <= Static165.anInt3409) {
			Static242.method4429(arg2, arg4, arg5, arg3, arg1, arg6, arg0);
		} else {
			Static261.method4703(arg3, arg5, arg6, arg1, arg2, arg0, arg4);
		}
	}
}
