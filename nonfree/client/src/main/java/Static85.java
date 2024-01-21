import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!kg", name = "L", descriptor = "[I")
	public static int[] anIntArray199 = new int[200];

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!kg", name = "R", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "(I)V")
	public static void method1505() {
		anIntArray199 = null;
		aShortArrayArray3 = null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)V")
	public static void method1506(@OriginalArg(0) int arg0) {
		@Pc(18) Class3_Sub16 local18 = (Class3_Sub16) Static69.aClass16_6.method554((long) arg0);
		if (local18 != null) {
			local18.method2783();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIBI)V")
	public static void method1508(@OriginalArg(0) boolean arg0) {
		Static96.anInt2137 = 2;
		Static143.anInt3288 = 22050;
		Static126.aBoolean195 = arg0;
	}
}
