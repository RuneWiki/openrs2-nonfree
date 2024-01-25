import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt1880 = 0;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_67 = new Class107(49, 3);

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([III[II)V")
	public static void method1627(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg1) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg2[local8];
		arg2[local8] = arg2[arg3];
		arg2[arg3] = local28;
		@Pc(47) int local47 = ~local14 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(49) int local49 = arg1; local49 < arg3; local49++) {
			if (arg0[local49] < (local47 & local49) + local14) {
				@Pc(67) int local67 = arg0[local49];
				arg0[local49] = arg0[local10];
				arg0[local10] = local67;
				@Pc(81) int local81 = arg2[local49];
				arg2[local49] = arg2[local10];
				arg2[local10++] = local81;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg2[arg3] = arg2[local10];
		arg2[local10] = local28;
		method1627(arg0, arg1, arg2, local10 - 1);
		method1627(arg0, local10 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!ul;Lclient!ul;Lclient!ul;Lclient!ul;)V")
	public static void method1628(@OriginalArg(1) Class246 arg0, @OriginalArg(2) Class246 arg1, @OriginalArg(3) Class246 arg2, @OriginalArg(4) Class246 arg3) {
		Static359.aClass246_194 = arg0;
		Static95.aClass246_58 = arg3;
		Static177.aClass246_107 = arg2;
		Static233.aClass246_38 = arg1;
		Static437.aClass251ArrayArray2 = new Class251[Static359.aClass246_194.method5502()][];
		Static209.aBooleanArray29 = new boolean[Static359.aClass246_194.method5502()];
	}
}
