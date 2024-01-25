import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static89 {

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!oa;")
	public static Class90 aClass90_3;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!cc;")
	public static final Class45 aClass45_2 = new Class45("WTRC", 1);

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt1491 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I")
	public static int method1371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method1374() {
		Static564.aClass118Array1 = null;
	}
}
