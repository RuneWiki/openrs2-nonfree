import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!mo;")
	public static Class143 aClass143_53;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public static int anInt2248;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	public static int anInt2253;

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "Z")
	public static boolean aBoolean159;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
	public static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "Z")
	public static boolean aBoolean157 = true;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZIIIIII)V")
	public static void method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg1 < 1 || Static195.anInt3965 - 2 < arg5 || Static298.anInt5716 - 2 < arg1) {
			return;
		}
		if (!Static96.method2208() && !Static112.method2401(arg5, Static125.anInt2720, arg6, arg1)) {
			return;
		}
		if (Static98.aClass213ArrayArrayArray2 == null) {
			return;
		}
		@Pc(37) int local37 = arg6;
		if (arg6 < 3 && Static6.method132(arg1, arg5)) {
			local37 = arg6 + 1;
		}
		Static182.method3512(Static75.aClass65Array1[arg6], arg5, Static218.aClass46_5, local37, arg1, arg6, arg0);
		if (arg4 >= 0) {
			@Pc(66) boolean local66 = Static323.aBoolean52;
			Static323.aBoolean52 = true;
			Static137.method2761(false, Static75.aClass65Array1[arg6], arg5, Static218.aClass46_5, arg1, false, arg3, arg2, arg7, arg4, arg6, local37);
			Static323.aBoolean52 = local66;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)I")
	public static int method2226(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
