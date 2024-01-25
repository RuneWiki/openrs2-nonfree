import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static92 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!uu;")
	public static Class250 aClass250_31;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
	public static void method1569(@OriginalArg(0) int arg0) {
		if (Static395.anInt6596 == 1) {
			Static305.anInt5237 = arg0;
		} else if (Static395.anInt6596 == 2 || Static395.anInt6596 == 3) {
			Static237.anInt4058 = arg0;
		}
	}
}
