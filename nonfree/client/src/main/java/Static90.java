import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
	public static int anInt5299;

	@OriginalMember(owner = "client!fj", name = "gc", descriptor = "I")
	public static int anInt5360;

	@OriginalMember(owner = "client!fj", name = "ec", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_98 = new Class93("Hidden", "Versteckt", "Caché", "Oculto");

	@OriginalMember(owner = "client!fj", name = "fc", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_99 = new Class93(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)V")
	public static void method4773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static43.method1042(arg3, arg2, arg1, arg0);
		} else if (Static124.anInt4221 <= arg0 - arg3 && arg0 + arg3 <= Static96.anInt2180 && Static228.anInt920 <= arg2 - arg4 && arg2 + arg4 <= Static307.anInt6214) {
			Static317.method5557(arg2, arg3, arg1, arg0, arg4);
		} else {
			Static293.method5191(arg1, arg2, arg3, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(II)Lclient!ra;")
	public static Class166 method4778(@OriginalArg(1) int arg0) {
		@Pc(10) Class166 local10 = (Class166) Static257.aClass119_160.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static274.aClass191_180.method5459(31, arg0);
		local10 = new Class166();
		if (local20 != null) {
			local10.method4817(new Class2_Sub10(local20), arg0);
		}
		Static257.aClass119_160.method3308(local10, (long) arg0);
		return local10;
	}
}
