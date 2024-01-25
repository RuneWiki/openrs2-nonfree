import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public static int anInt1889;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public static int anInt1888 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
	public static void method1708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = arg3 * arg3;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg3 << 1;
		@Pc(42) int local42 = local17 * (1 - local33) + local25;
		@Pc(50) int local50 = local21 - local29 * (local33 - 1);
		@Pc(54) int local54 = local17 << 2;
		@Pc(58) int local58 = local21 << 2;
		@Pc(66) int local66 = local25 * 3;
		@Pc(74) int local74 = ((arg3 << 1) - 3) * local29;
		@Pc(80) int local80 = local58;
		@Pc(86) int local86 = (arg3 - 1) * local54;
		Static583.method7816(Static158.anIntArrayArray66[arg4], arg0, arg2 - arg1, arg2 - -arg1);
		while (local13 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local42 += local66;
					local50 += local80;
					local66 += local58;
					local7++;
					local80 += local58;
				}
			}
			if (local50 < 0) {
				local42 += local66;
				local50 += local80;
				local66 += local58;
				local7++;
				local80 += local58;
			}
			local50 += -local74;
			local42 += -local86;
			local74 -= local54;
			local13--;
			local86 -= local54;
			@Pc(173) int local173 = arg4 - local13;
			@Pc(177) int local177 = local13 + arg4;
			@Pc(181) int local181 = local7 + arg2;
			@Pc(186) int local186 = arg2 - local7;
			Static583.method7816(Static158.anIntArrayArray66[local173], arg0, local186, local181);
			Static583.method7816(Static158.anIntArrayArray66[local177], arg0, local186, local181);
		}
	}
}
