import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	public static int anInt1786;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "Lclient!ir;")
	public static Class100 aClass100_34;

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	public static int anInt1794;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "Lclient!tr;")
	public static final Class195 aClass195_1 = new Class195();

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString61 = "cyan:";

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([J[IIIB)V")
	public static void method1435(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg3) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local25;
		@Pc(39) int local39 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local39;
		for (@Pc(51) int local51 = arg2; local51 < arg3; local51++) {
			if (arg0[local51] < (long) (local51 & 0x1) + local25) {
				@Pc(72) long local72 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local72;
				@Pc(86) int local86 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21++] = local86;
			}
		}
		arg0[arg3] = arg0[local21];
		arg0[local21] = local25;
		arg1[arg3] = arg1[local21];
		arg1[local21] = local39;
		method1435(arg0, arg1, arg2, local21 - 1);
		method1435(arg0, arg1, local21 + 1, arg3);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIC)I")
	public static int method1436(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg0 + arg5 && arg5 < arg1 + arg3) {
			return arg7 < arg6 + arg2 && arg4 + arg7 > arg2;
		} else {
			return false;
		}
	}
}
