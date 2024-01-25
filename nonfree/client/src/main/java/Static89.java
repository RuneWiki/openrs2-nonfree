import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
	public static int anInt1838;

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "[S")
	public static short[] aShortArray29;

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
	public static int anInt1837 = -1;

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_8 = new Class85();

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZIII)V")
	public static void method1592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(28) int local28 = arg3 - 334;
		if (local28 < 0) {
			local28 = 0;
		} else if (local28 > 100) {
			local28 = 100;
		}
		@Pc(53) int local53 = Static343.aShort68 + local28 * (Static6.aShort1 - Static343.aShort68) / 100;
		if (local53 < Static76.aShort23) {
			local53 = Static76.aShort23;
		} else if (Static46.aShort12 < local53) {
			local53 = Static46.aShort12;
		}
		@Pc(75) int local75 = local53 * arg3 * 512 / (arg0 * 334);
		@Pc(108) int local108;
		@Pc(115) int local115;
		@Pc(83) short local83;
		if (local75 < Static371.aShort84) {
			local83 = Static371.aShort84;
			local53 = local83 * arg0 * 334 / (arg3 * 512);
			if (local53 > Static46.aShort12) {
				local53 = Static46.aShort12;
				local108 = arg3 * local53 * 512 / (local83 * 334);
				local115 = (arg0 - local108) / 2;
				if (arg2) {
					Static269.aClass51_9.e();
					Static269.aClass51_9.method5286(local115, -16777216, arg1, arg3, arg4);
					Static269.aClass51_9.method5286(local115, -16777216, arg1 + arg0 - local115, arg3, arg4);
				}
				arg1 += local115;
				arg0 -= local115 * 2;
			}
		} else if (local75 > Static26.aShort2) {
			local83 = Static26.aShort2;
			local53 = arg0 * 334 * local83 / (arg3 * 512);
			if (Static76.aShort23 > local53) {
				local53 = Static76.aShort23;
				local108 = arg0 * local83 * 334 / (local53 * 512);
				local115 = (arg3 - local108) / 2;
				if (arg2) {
					Static269.aClass51_9.e();
					Static269.aClass51_9.method5286(arg0, -16777216, arg1, local115, arg4);
					Static269.aClass51_9.method5286(arg0, -16777216, arg1, local115, arg3 + arg4 - local115);
				}
				arg4 += local115;
				arg3 -= local115 * 2;
			}
		}
		Static269.anInt4578 = (short) arg0;
		Static393.anInt6285 = arg1;
		Static180.anInt3243 = (short) arg3;
		Static417.anInt6626 = local53 * arg3 / 334;
		Static185.anInt3322 = arg4;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static206.method2966(arg1, arg0) | (arg1 & 0x800) != 0 || Static141.method2175(arg1, arg0);
	}
}
