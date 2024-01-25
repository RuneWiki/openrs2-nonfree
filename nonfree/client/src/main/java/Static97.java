import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "[[I")
	public static int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "Lclient!ta;")
	public static Class217 aClass217_4;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "[I")
	public static final int[] anIntArray194 = new int[13];

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "[Lclient!bd;")
	public static Class23_Sub1[] aClass23_Sub1Array1 = new Class23_Sub1[0];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1629(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)I")
	public static int method1633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < arg2) {
			return arg2;
		} else if (arg1 >= arg0) {
			return arg0;
		} else {
			return arg1;
		}
	}
}
