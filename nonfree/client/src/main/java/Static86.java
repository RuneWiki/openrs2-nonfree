import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
	public static int anInt1676;

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "Lclient!ae;")
	public static Class8 aClass8_25;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "Lclient!o;")
	public static final Class246 aClass246_9 = new Class246(1, 2, 2, 0);

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_28 = new Class289(69, 4);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!rh;)I")
	public static int method1491(@OriginalArg(1) Class305 arg0) {
		if (arg0 == Static363.aClass305_2) {
			return 9216;
		} else if (arg0 == Static534.aClass305_3) {
			return 34065;
		} else if (Static571.aClass305_4 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
