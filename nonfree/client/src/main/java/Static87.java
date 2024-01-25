import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static87 {

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "Lclient!nd;")
	public static Class238 aClass238_49;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BII)Z")
	public static boolean method1820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static205.method5785(arg0, arg1) | (arg0 & 0x10000) != 0 || Static528.method2882(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static617.method8585(arg0, arg1);
		}
	}
}
