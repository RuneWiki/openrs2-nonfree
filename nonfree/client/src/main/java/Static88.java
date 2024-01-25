import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "Lclient!lt;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_50 = new Class263(83, 4);

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
	public static String method1557(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(35) int local35 = 2;
		@Pc(47) int local47 = arg0 / 10;
		while (local47 != 0) {
			local47 /= 10;
			local35++;
		}
		@Pc(61) char[] local61 = new char[local35];
		local61[0] = '+';
		for (@Pc(69) int local69 = local35 - 1; local69 > 0; local69--) {
			@Pc(72) int local72 = arg0;
			arg0 /= 10;
			@Pc(82) int local82 = local72 - arg0 * 10;
			if (local82 < 10) {
				local61[local69] = (char) (local82 + 48);
			} else {
				local61[local69] = (char) (local82 + 87);
			}
		}
		return new String(local61);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Lclient!hd;")
	public static Class103_Sub1 method1558() {
		return Static159.anInt3380 < Static279.aClass103_Sub1Array3.length ? Static279.aClass103_Sub1Array3[Static159.anInt3380++] : null;
	}
}
