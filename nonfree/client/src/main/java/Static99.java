import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static99 {

	@OriginalMember(owner = "client!dt", name = "C", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_25;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_4 = new Class342(1, 2, 2, 0);

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
	public static int anInt1913 = -1;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIB)Z")
	public static boolean method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
