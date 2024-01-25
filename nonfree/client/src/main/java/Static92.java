import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static92 {

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "I")
	public static int anInt2339 = 0;

	@OriginalMember(owner = "client!dfa", name = "j", descriptor = "I")
	public static final int anInt2341 = 1337;

	@OriginalMember(owner = "client!dfa", name = "k", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_33 = new Class287(41, 3);

	@OriginalMember(owner = "client!dfa", name = "l", descriptor = "[I")
	public static final int[] anIntArray78 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZIII)V")
	public static void method1986(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static37.anInt1122 == 0) {
			Static427.method5898(false);
		} else {
			Static91.anInt2333 = Static37.anInt1122;
			Static47.method1180(0);
		}
		Static76.anInt4840 = arg3;
		Static274.aBoolean348 = arg0;
		Static46.anInt1248 = arg2;
		Static157.method2249(arg1);
	}
}
