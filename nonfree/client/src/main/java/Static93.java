import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "Lclient!ah;")
	public static Class7 aClass7_43;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
	public static int anInt2605 = 0;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!eh;")
	public static Class28 aClass28_816 = Static170.method3101("welle2:");

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "[I")
	public static int[] anIntArray446 = new int[1000];

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "Lclient!eh;")
	public static Class28 aClass28_817 = Static170.method3101("rect_debug=");

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
	public static int anInt2607 = 0;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
	public static int anInt2608 = -1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method2069() {
		aClass28_817 = null;
		aShortArrayArray6 = null;
		aClass7_43 = null;
		anIntArray446 = null;
		aClass28_816 = null;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)I")
	public static int method2070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (local3 + arg1) / arg0 - local3;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static92.anIntArrayArrayArray41[arg0][local16][local20] == -Static38.anInt1098) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static35.anIntArrayArrayArray17[arg0][arg1][arg3] + arg5;
			if (!Static34.method851(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static34.method851(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static34.method851(local20, local156, local182)) {
				return false;
			} else if (Static34.method851(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static94.method2076(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static34.method851(local16 + 1, Static35.anIntArrayArrayArray17[arg0][arg1][arg3] + arg5, local20 + 1) && Static34.method851(local16 + 128 - 1, Static35.anIntArrayArrayArray17[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static34.method851(local16 + 128 - 1, Static35.anIntArrayArrayArray17[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static34.method851(local16 + 1, Static35.anIntArrayArrayArray17[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
