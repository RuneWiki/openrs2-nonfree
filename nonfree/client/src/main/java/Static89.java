import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!fc;")
	public static Class79 aClass79_3;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "I")
	public static int anInt1645;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	public static int anInt1646;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "[I")
	public static final int[] anIntArray215 = new int[25];

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_54 = new Class48(52, 4);

	@OriginalMember(owner = "client!es", name = "i", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!es", name = "j", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_38 = new Class211(38, 8);

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BII)I")
	public static int method1346(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return local43 + (arg0 & 0xFF80);
		}
	}
}
