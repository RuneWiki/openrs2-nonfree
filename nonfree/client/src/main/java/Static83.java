import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ib", name = "Hb", descriptor = "[S")
	public static short[] aShortArray15;

	@OriginalMember(owner = "client!ib", name = "fc", descriptor = "Lclient!te;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!ib", name = "nc", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_22;

	@OriginalMember(owner = "client!ib", name = "Jb", descriptor = "I")
	public static int anInt1935 = -1;

	@OriginalMember(owner = "client!ib", name = "Ub", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ib", name = "Zb", descriptor = "I")
	public static int anInt1948 = 0;

	@OriginalMember(owner = "client!ib", name = "lc", descriptor = "Lclient!ia;")
	public static Class51 aClass51_618 = Static64.method1101("::clientdrop");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIILclient!ij;IJ)Z")
	public static boolean method1458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static14.method277(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}
}
