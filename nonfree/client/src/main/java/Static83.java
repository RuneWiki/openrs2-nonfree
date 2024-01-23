import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static83 {

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "S")
	public static short aShort6 = 256;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "[Lclient!ee;")
	public static Class46_Sub1[] aClass46_Sub1Array1 = new Class46_Sub1[29];

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!pk;I)Lclient!me;")
	public static Class43 method1365(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1) {
		return Static34.method533(arg0, arg1) ? Static225.method3492() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!pk;B)V")
	public static void method1367(@OriginalArg(0) Class132 arg0) {
		Static239.aClass132_81 = arg0;
	}
}
