import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ef", name = "ub", descriptor = "I")
	public static int anInt1715;

	@OriginalMember(owner = "client!ef", name = "zb", descriptor = "[[[Lclient!sd;")
	public static Class211[][][] aClass211ArrayArrayArray1;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_13 = new Class266();

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
	public static int anInt1697 = 0;

	@OriginalMember(owner = "client!ef", name = "yb", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_54 = new Class131(55, 15);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZIII)V")
	public static void method1458(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(26) int local26 = arg3 - 334;
		if (local26 < 0) {
			local26 = 0;
		} else if (local26 > 100) {
			local26 = 100;
		}
		@Pc(51) int local51 = Static73.aShort12 + (Static333.aShort68 - Static73.aShort12) * local26 / 100;
		if (local51 < Static141.aShort29) {
			local51 = Static141.aShort29;
		} else if (local51 > Static280.aShort53) {
			local51 = Static280.aShort53;
		}
		@Pc(81) int local81 = local51 * arg3 * 512 / (arg2 * 334);
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(93) short local93;
		if (local81 < Static232.aShort43) {
			local93 = Static232.aShort43;
			local51 = arg2 * local93 * 334 / (arg3 * 512);
			if (local51 > Static280.aShort53) {
				local51 = Static280.aShort53;
				local122 = local51 * arg3 * 512 / (local93 * 334);
				local128 = (arg2 - local122) / 2;
				if (arg1) {
					Static276.aClass109_10.va();
					Static276.aClass109_10.method4743(arg0, -16777216, arg4, arg3, local128);
					Static276.aClass109_10.method4743(arg0 + arg2 - local128, -16777216, arg4, arg3, local128);
				}
				arg0 += local128;
				arg2 -= local128 * 2;
			}
		} else if (Static434.aShort102 < local81) {
			local93 = Static434.aShort102;
			local51 = local93 * 334 * arg2 / (arg3 * 512);
			if (Static141.aShort29 > local51) {
				local51 = Static141.aShort29;
				local122 = arg2 * local93 * 334 / (local51 * 512);
				local128 = (arg3 - local122) / 2;
				if (arg1) {
					Static276.aClass109_10.va();
					Static276.aClass109_10.method4743(arg0, -16777216, arg4, local128, arg2);
					Static276.aClass109_10.method4743(arg0, -16777216, arg3 + arg4 - local128, local128, arg2);
				}
				arg3 -= local128 * 2;
				arg4 += local128;
			}
		}
		Static106.anInt1963 = arg3 * local51 / 334;
		Static405.anInt7213 = arg0;
		Static239.anInt4288 = (short) arg3;
		Static388.anInt6762 = arg4;
		Static211.anInt3868 = (short) arg2;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBIII)V")
	public static void method1460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 + 1;
		Static217.method3280(Static59.anIntArrayArray34[arg3], arg1, arg0, arg2);
		@Pc(17) int local17 = arg4 - 1;
		Static217.method3280(Static59.anIntArrayArray34[arg4], arg1, arg0, arg2);
		for (@Pc(25) int local25 = local4; local25 <= local17; local25++) {
			@Pc(36) int[] local36 = Static59.anIntArrayArray34[local25];
			local36[arg1] = local36[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)I")
	public static int method1461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static427.anIntArray639[arg0 & 0x3] : 256;
	}
}
