import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static94 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!gl;")
	public static Class2 aClass2_11;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array6;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Lclient!lk;")
	public static final Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Lclient!ne;")
	public static Class146 aClass146_21 = null;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "F")
	public static float aFloat42 = 0.0F;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Lclient!al;")
	public static final Class11 aClass11_51 = new Class11(64);

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "[I")
	public static final int[] anIntArray198 = new int[13];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BIIII)V")
	public static void method2175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static6.anInt136 <= arg3 - arg0 && arg3 + arg0 <= Static275.anInt5244 && Static32.anInt750 <= arg2 - arg0 && Static112.anInt2485 >= arg0 + arg2) {
			Static317.method5473(arg2, arg1, arg3, arg0);
		} else {
			Static162.method3225(arg1, arg3, arg0, arg2);
		}
	}
}
