import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static91 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
	public static int anInt2523;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!ob;")
	public static Interface2 anInterface2_1 = null;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "[I")
	public static int[] anIntArray189 = new int[2500];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
	public static void method1949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			Static147.method2681(Static29.anIntArrayArray10[arg0], arg1, arg3, arg2);
		} else {
			Static147.method2681(Static29.anIntArrayArray10[arg0], arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!hc;BI)[Lclient!ge;")
	public static Class7_Sub1[] method1950(@OriginalArg(0) Class51 arg0, @OriginalArg(2) int arg1) {
		return Static181.method3124(arg0, arg1) ? Static84.method1827() : null;
	}
}
