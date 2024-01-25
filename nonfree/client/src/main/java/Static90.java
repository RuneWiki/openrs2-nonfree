import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!em", name = "Yb", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array3;

	@OriginalMember(owner = "client!em", name = "sc", descriptor = "[I")
	public static int[] anIntArray171;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIZI)Ljava/lang/String;")
	public static String method1743(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(35) int local35 = 2;
		for (@Pc(44) int local44 = arg0 / 10; local44 != 0; local44 /= 10) {
			local35++;
		}
		@Pc(56) char[] local56 = new char[local35];
		local56[0] = '+';
		for (@Pc(64) int local64 = local35 - 1; local64 > 0; local64--) {
			@Pc(68) int local68 = arg0;
			arg0 /= 10;
			@Pc(79) int local79 = local68 - arg0 * 10;
			if (local79 < 10) {
				local56[local64] = (char) (local79 + 48);
			} else {
				local56[local64] = (char) (local79 + 87);
			}
		}
		return new String(local56);
	}
}
