import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_31 = new Class286(25, 12);

	@OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
	public static final int[] anIntArray96 = new int[25];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
	public static int method1357(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}
}
