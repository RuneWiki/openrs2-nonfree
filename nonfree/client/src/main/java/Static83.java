import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static83 {

	@OriginalMember(owner = "client!cn", name = "qd", descriptor = "[I")
	public static final int[] anIntArray64 = new int[32];

	@OriginalMember(owner = "client!cn", name = "Zc", descriptor = "[I")
	public static final int[] anIntArray70 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	public static void method1277() {
		Static80.aClass291_4.method6986(-125);
		Static103.aClass291_7.method6986(-95);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)I")
	public static int method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > arg2) {
			return arg0;
		} else if (arg1 >= arg2) {
			return arg2;
		} else {
			return arg1;
		}
	}
}
