import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Lclient!tq;")
	public static Class239 aClass239_4;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "I")
	public static int anInt1785 = 0;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "I")
	public static int anInt1790 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
	public static boolean method1659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZIII)V")
	public static void method1661(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static155.anInt2774 == 0) {
			Static22.method312(false);
		} else {
			Static63.anInt1331 = Static155.anInt2774;
			Static385.method5310(0);
		}
		Static397.anInt6565 = arg3;
		Static238.anInt4073 = arg2;
		Static289.aBoolean346 = arg1;
		Static36.method2048(arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(FZ)F")
	public static float method1662(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}
}
