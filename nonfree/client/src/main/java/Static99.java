import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!em", name = "j", descriptor = "Lclient!fl;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public static int anInt2354;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII[B)V")
	public static void method1703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(13) int local13 = arg1 - arg0 >> 2;
		arg2 += arg0;
		while (true) {
			local13--;
			if (local13 < 0) {
				local13 = arg1 - arg0 & 0x3;
				while (true) {
					local13--;
					if (local13 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(26) int local26 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg3[local26] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg3[local31] = 1;
			arg2 = local36 + 1;
			arg3[local36] = 1;
		}
	}
}
