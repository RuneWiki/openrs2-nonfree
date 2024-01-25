import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_99 = new Class15("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public static int anInt5461 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIBIII)I")
	public static int method4423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static278.aClass41Array3 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(22) int local22 = arg0 >> 7;
			@Pc(26) int local26 = arg1 >> 7;
			if (arg4 < 0 || arg2 < 0 || Static337.anInt5497 - 1 < arg4 || Static282.anInt4644 - 1 < arg2) {
				return 0;
			} else if (local22 >= 1 && local26 >= 1 && Static337.anInt5497 - 1 >= local22 && Static282.anInt4644 - 1 >= local26) {
				@Pc(88) boolean local88 = (Static4.aByteArrayArrayArray1[1][arg0 >> 7][arg1 >> 7] & 0x2) != 0;
				@Pc(116) boolean local116;
				@Pc(132) boolean local132;
				if ((arg0 & 0x7F) == 0) {
					local116 = (Static4.aByteArrayArrayArray1[1][local22 - 1][arg1 >> 7] & 0x2) != 0;
					local132 = (Static4.aByteArrayArrayArray1[1][local22][arg1 >> 7] & 0x2) != 0;
					if (local132 != local116) {
						local88 = (Static4.aByteArrayArrayArray1[1][arg4][arg2] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x7F) == 0) {
					local116 = (Static4.aByteArrayArrayArray1[1][arg0 >> 7][local26 - 1] & 0x2) != 0;
					local132 = (Static4.aByteArrayArrayArray1[1][arg0 >> 7][local26] & 0x2) != 0;
					if (local132 != local116) {
						local88 = (Static4.aByteArrayArrayArray1[1][arg4][arg2] & 0x2) != 0;
					}
				}
				if (local88) {
					arg3++;
				}
				return Static278.aClass41Array3[arg3].a(arg0, arg1);
			} else {
				return 0;
			}
		} else {
			return Static278.aClass41Array3[arg3].a(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!la;BLjava/lang/String;Z)V")
	public static void method4424(@OriginalArg(0) Class123 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(26) int local26 = Static221.aClass158_6.method3036(250, arg1, null);
		@Pc(35) int local35 = Static221.aClass158_6.method3027(arg1, 250, null) * 13;
		Static39.aClass135_1.O(6, 6, local26 + 8, local35 - -4 + 4, -16777216, 0);
		Static39.aClass135_1.method5354(6, 6, local26 + 4 + 4, local35 - -4 + 4, -1, 0);
		arg0.method5789(-1, 10, null, 0, local26, local35, 10, arg1, null, null, 0, 1, -1);
		Static204.method2868(local35 + 4 + 4, 6, 6, local26 + 4 + 4);
		if (arg2) {
			Static39.aClass135_1.method5341();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZII)I")
	public static int method4425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static278.aClass41Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || Static337.anInt5497 - 1 < local11 || local15 > Static282.anInt4644 - 1) {
			return 0;
		}
		@Pc(52) int local52 = arg1;
		if (arg1 < 3 && (Static4.aByteArrayArrayArray1[1][local11][local15] & 0x2) != 0) {
			local52 = arg1 + 1;
		}
		return Static278.aClass41Array3[local52].a(arg2, arg0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static62.anInt1114 && Static207.anInt3632 >= arg8 && Static62.anInt1114 <= arg5 && arg5 <= Static207.anInt3632 && arg3 >= Static62.anInt1114 && Static207.anInt3632 >= arg3 && arg1 >= Static62.anInt1114 && arg1 <= Static207.anInt3632 && arg4 >= Static254.anInt4211 && Static275.anInt4594 >= arg4 && arg2 >= Static254.anInt4211 && Static275.anInt4594 >= arg2 && Static254.anInt4211 <= arg6 && Static275.anInt4594 >= arg6 && arg0 >= Static254.anInt4211 && arg0 <= Static275.anInt4594) {
			Static356.method4707(arg1, arg6, arg0, arg2, arg5, arg3, arg4, arg7, arg8);
		} else {
			Static438.method2165(arg1, arg8, arg7, arg3, arg4, arg6, arg0, arg2, arg5);
		}
	}
}
