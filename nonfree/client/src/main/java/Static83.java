import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
	public static final int[] anIntArray203 = new int[4096];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!tj;Lclient!tj;Z)V")
	public static void method2098(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1) {
		Static239.aClass193_83 = arg0;
		Static157.aClass193_58 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	public static void method2099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 13);
		local8.method4908();
		local8.anInt5705 = arg1;
	}
}
