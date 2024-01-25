import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString10 = null;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)Z")
	public static boolean method1758(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 45 || arg0 == 22 || arg0 == 51 || arg0 == 12) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
	public static void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0];
		@Pc(13) int local13 = Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0];
		if (Static111.anInt2077 == 1) {
			if (!Static155.method2784(arg0, false, 1, 0, 1, arg1, -2, 0, local13, local8)) {
				Static155.method2784(arg0, false, 1, 0, 1, arg1, -3, 0, local13, local8);
			}
		} else if (!Static155.method2784(arg0, false, 1, 0, 1, arg1, -3, 0, local13, local8)) {
			Static155.method2784(arg0, false, 1, 0, 1, arg1, -2, 0, local13, local8);
		}
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public static void method1760() {
		Static291.aClass55_11.method5223(Static144.aFloat22 * ((float) Static192.anInt3806 * 0.1F + 0.7F));
		Static291.aClass55_11.method5221(Static49.anInt4961, Static133.aFloat17, Static6.aFloat2, (float) Static232.anInt4692, (float) Static222.anInt4381, (float) Static52.anInt969);
		Static291.aClass55_11.method5179(Static88.aClass54_2);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V")
	public static void method1762() {
		Static185.aClass109_41.method2858();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIILclient!rd;)V")
	public static void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub5_Sub2_Sub2 arg2) {
		if (arg1 == arg2.anInt5383 && arg1 != -1) {
			@Pc(14) Class89 local14 = Static162.method2849(arg1);
			@Pc(17) int local17 = local14.anInt2468;
			if (local17 == 1) {
				arg2.anInt5353 = 0;
				arg2.anInt5365 = 0;
				arg2.anInt5409 = 1;
				arg2.anInt5389 = 0;
				arg2.anInt5382 = arg0;
				Static311.method3258(local14, arg2.anInt6631, false, arg2.anInt5365, arg2.anInt6632);
			}
			if (local17 == 2) {
				arg2.anInt5353 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt5383 == -1 || Static162.method2849(arg1).anInt2465 >= Static162.method2849(arg2.anInt5383).anInt2465) {
			arg2.anInt5353 = 0;
			arg2.anInt5383 = arg1;
			arg2.anInt5365 = 0;
			arg2.anInt5389 = 0;
			arg2.anInt5382 = arg0;
			arg2.anInt5419 = arg2.anInt5413;
			arg2.anInt5409 = 1;
			if (arg2.anInt5383 != -1) {
				Static311.method3258(Static162.method2849(arg2.anInt5383), arg2.anInt6631, false, arg2.anInt5365, arg2.anInt6632);
			}
		}
	}
}
