import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_28 = new Class268(7, 0);

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Lclient!io;")
	public static final Class152 aClass152_3 = new Class152(6, 1);

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)I")
	public static int method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)V")
	public static void method1433(@OriginalArg(0) int arg0) {
		@Pc(15) Class6_Sub2_Sub9 local15 = Static144.method2332(5, arg0);
		local15.method3722();
	}
}
