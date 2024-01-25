import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!l;")
	public static Class11 aClass11_6;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
	public static int anInt1983;

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "Lclient!vg;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "[I")
	public static final int[] anIntArray126 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_10 = new Class94(3, 5);

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
	public static int anInt1979 = 0;

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "F")
	public static float aFloat52 = 0.0F;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BII)V")
	public static void method1707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static55.aClass137_1 == Static191.aClass137_3) {
			if (Static253.method3388(0, false, arg0, 0, 1, -2, arg1, 1)) {
				return;
			}
			Static253.method3388(0, false, arg0, 0, 1, -3, arg1, 1);
		} else if (Static253.method3388(0, false, arg0, 0, 1, -3, arg1, 1)) {
			return;
		} else {
			Static253.method3388(0, false, arg0, 0, 1, -2, arg1, 1);
		}
	}
}
