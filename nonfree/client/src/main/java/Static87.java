import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!daa", name = "B", descriptor = "[B")
	public static final byte[] aByteArray15 = new byte[2048];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)Z")
	public static boolean method1475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static159.method2761(arg1, arg0) || Static505.method7347(arg0, arg1);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZII)I")
	public static int method1476(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class3_Sub52 local10 = Static504.method7331(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray654.length; local23++) {
				if (arg0 == local10.anIntArray653[local23]) {
					local21 += local10.anIntArray654[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)Z")
	public static boolean method1479(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
