import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "[I")
	public static final int[] anIntArray225 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZIIIZ)I")
	public static int method2059(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class4_Sub20 local10 = Static17.method367(arg2, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray309.length; local18++) {
			if (local10.anIntArray309[local18] >= 0 && Static195.aClass99_1.anInt3088 > local10.anIntArray309[local18]) {
				@Pc(40) Class222 local40 = Static195.aClass99_1.method2798(local10.anIntArray309[local18]);
				@Pc(50) int local50 = local40.method4922(arg1, Static53.aClass152_1.method3679(arg1).anInt1575);
				if (arg0) {
					local16 += local10.anIntArray308[local18] * local50;
				} else {
					local16 += local50;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg6) {
			Static569.method3888(arg3, arg5, arg2, arg1, arg0, arg6);
		} else if (arg1 - arg6 >= Static68.anInt1306 && arg1 + arg6 <= Static589.anInt9684 && arg0 - arg4 >= Static252.anInt4971 && Static359.anInt6232 >= arg4 + arg0) {
			Static17.method368(arg2, arg0, arg5, arg1, arg3, arg6, arg4);
		} else {
			Static585.method7922(arg5, arg1, arg6, arg0, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!eh;I)Lclient!lda;")
	public static Class52_Sub1_Sub1 method2061(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(7) Class52_Sub1 local7 = Static310.method4786(arg0);
		@Pc(11) int local11 = arg0.method6003();
		return new Class52_Sub1_Sub1(local7.aClass297_12, local7.aClass58_13, local7.anInt8820, local7.anInt8826, local7.anInt8822, local7.anInt8828, local7.anInt8824, local7.anInt8827, local7.anInt8821, local7.anInt5408, local7.anInt5409, local7.anInt5406, local7.anInt5405, local7.anInt5407, local7.anInt5412, local11);
	}
}
