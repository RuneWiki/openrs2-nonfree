import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
	public static final int anInt1713 = 1409;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLclient!ib;)V")
	public static void method1533(@OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(20) Class6_Sub35 local20 = (Class6_Sub35) Static429.aClass209_52.method5038((long) arg0.anInt5103);
		if (local20 == null) {
			Static513.method7270((Class2_Sub1_Sub1_Sub3_Sub2) null, (Class308) null, arg0.anIntArray302[0], arg0.anIntArray301[0], arg0, 0, arg0.aByte140);
		} else {
			local20.method4895();
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "([SI[Ljava/lang/String;II)V")
	public static void method1534(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg2; local46++) {
			if (local20 == null || arg1[local46] != null && (local46 & 0x1) > arg1[local46].compareTo(local20)) {
				@Pc(71) String local71 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local71;
				@Pc(85) short local85 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local85;
			}
		}
		arg1[arg2] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method1534(arg0, arg1, local16 - 1, arg3);
		method1534(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!lp;BZ)V")
	public static void method1535(@OriginalArg(0) Class6_Sub8_Sub4 arg0) {
		Static231.aClass64_2.method1730(arg0);
		Static456.method6612(Static231.aClass64_2, Static98.aClass8_123, Static86.aClass8_25, arg0, Static465.aClass8_112);
	}
}
