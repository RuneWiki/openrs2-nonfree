import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
	public static int anInt4562;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "Lclient!eka;")
	public static Class98 aClass98_3;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIII)V")
	public static void method4199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg1;
		@Pc(14) int local14 = arg4 - arg3;
		if (local14 == 0) {
			if (local9 != 0) {
				Static246.method3493(arg1, arg2, arg3, arg0);
			}
		} else if (local9 == 0) {
			Static715.method9490(arg0, arg3, arg4, arg1);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(70) boolean local70 = local9 > local14;
			@Pc(74) int local74;
			@Pc(78) int local78;
			if (local70) {
				local74 = arg3;
				arg3 = arg1;
				local78 = arg4;
				arg1 = local74;
				arg4 = arg2;
				arg2 = local78;
			}
			if (arg3 > arg4) {
				local74 = arg3;
				local78 = arg1;
				arg3 = arg4;
				arg1 = arg2;
				arg4 = local74;
				arg2 = local78;
			}
			local74 = arg1;
			local78 = arg4 - arg3;
			@Pc(111) int local111 = arg2 - arg1;
			@Pc(116) int local116 = -(local78 >> 1);
			if (local111 < 0) {
				local111 = -local111;
			}
			@Pc(129) int local129 = arg1 < arg2 ? 1 : -1;
			@Pc(133) int local133;
			if (local70) {
				for (local133 = arg3; local133 <= arg4; local133++) {
					Static118.anIntArrayArray7[local133][local74] = arg0;
					local116 += local111;
					if (local116 > 0) {
						local116 -= local78;
						local74 += local129;
					}
				}
			} else {
				for (local133 = arg3; local133 <= arg4; local133++) {
					Static118.anIntArrayArray7[local74][local133] = arg0;
					local116 += local111;
					if (local116 > 0) {
						local74 += local129;
						local116 -= local78;
					}
				}
			}
		}
	}
}
