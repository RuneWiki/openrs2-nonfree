import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Lclient!fs;")
	public static Class76 aClass76_23;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!lq;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_20 = new Class215(59, 18);

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public static int anInt1816 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BIIIII)V")
	public static void method1588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg1) {
			Static164.method3580(arg0, arg2, arg1, arg3);
		} else if (Static354.anInt6186 <= arg3 - arg1 && Static208.anInt2656 >= arg1 + arg3 && Static376.anInt6287 <= arg0 - arg4 && Static168.anInt3256 >= arg4 + arg0) {
			Static72.method1355(arg0, arg1, arg2, arg4, arg3);
		} else {
			Static12.method124(arg4, arg3, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1590(@OriginalArg(0) String arg0) {
		return Static51.method839(arg0);
	}
}
