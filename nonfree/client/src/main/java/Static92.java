import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "Lclient!dq;")
	public static Class53 aClass53_2;

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "J")
	public static long aLong59;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_6 = new Class154(4);

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
	public static int anInt1742 = 0;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "Z")
	public static boolean aBoolean149 = true;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/lang/Object;IBI[J)V")
	public static void method1581(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg1; local46++) {
			if (arg3[local46] < local20 + (long) (local46 & 0x1)) {
				@Pc(67) long local67 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local67;
				@Pc(81) Object local81 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local81;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method1581(arg0, local16 - 1, arg2, arg3);
		method1581(arg0, arg1, local16 + 1, arg3);
	}
}
