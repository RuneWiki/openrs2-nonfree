import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!es", name = "l", descriptor = "I")
	public static int anInt1799;

	@OriginalMember(owner = "client!es", name = "b", descriptor = "[I")
	public static int[] anIntArray189 = new int[2];

	@OriginalMember(owner = "client!es", name = "c", descriptor = "I")
	public static int anInt1792 = 0;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "I")
	public static int anInt1793 = 0;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	public static int anInt1796 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIB)Z")
	public static boolean method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static376.method4535(arg0, arg1) & Static326.method4621(arg1, arg0);
	}
}
