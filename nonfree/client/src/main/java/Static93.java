import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!di", name = "z", descriptor = "Lclient!dga;")
	public static Class65 aClass65_29;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "Lclient!ep;")
	public static Class93 aClass93_6 = null;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Z")
	public static boolean method2045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
	public static void method2046() {
		if (Static110.anInt2516 != -1) {
			Static289.method4773(-1, Static110.anInt2516, -1, false);
			Static110.anInt2516 = -1;
		}
	}
}
