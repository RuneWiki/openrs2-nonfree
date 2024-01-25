import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static373.method5873(arg5, arg0, arg2, arg4, arg1, 0, arg3);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Lclient!pk;")
	public static Class4_Sub5 method1761() {
		@Pc(8) Class4_Sub5 local8 = (Class4_Sub5) Static502.aClass90_17.method2319();
		if (local8 == null) {
			return new Class4_Sub5();
		} else {
			Static429.anInt7897--;
			return local8;
		}
	}
}
