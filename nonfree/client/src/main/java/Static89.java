import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_413 = Static64.method1101("::rect_debug");

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1027(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static233.method868(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)I")
	public static int method1028(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local18 * local32 >> 12;
	}
}
