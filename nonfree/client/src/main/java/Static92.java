import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static92 {

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "Lclient!tq;")
	public static Class318 aClass318_2;

	@OriginalMember(owner = "client!dga", name = "H", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!dga", name = "B", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_28 = new Class361();

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(III)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static353.aClass230_3 == Static275.aClass230_2) {
			if (!Static493.method6900(1, 0, arg0, false, 0, -2, arg1, 1)) {
				Static493.method6900(1, 0, arg0, false, 0, -3, arg1, 1);
			}
		} else if (!Static493.method6900(1, 0, arg0, false, 0, -3, arg1, 1)) {
			Static493.method6900(1, 0, arg0, false, 0, -2, arg1, 1);
		}
	}
}
