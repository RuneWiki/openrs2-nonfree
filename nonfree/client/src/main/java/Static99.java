import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
	public static int anInt2333 = 0;

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1095 = Static56.method816(" has logged out)3");

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1094 = aClass34_1095;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!wf;I)I")
	public static int method1445(@OriginalArg(0) Class8_Sub24 arg0) {
		@Pc(17) Class8_Sub5 local17 = (Class8_Sub5) Static39.aClass7_6.method45((long) arg0.anInt3122 + ((long) arg0.anInt3124 << 32));
		return local17 == null ? arg0.anInt3128 : local17.anInt390;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V")
	public static void method1447() {
		aClass34_1094 = null;
		aClass34_1095 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!dd;Lclient!dd;B)V")
	public static void method1449(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14 arg1) {
		Static106.aClass14_25 = arg1;
		Static14.aClass14_2 = arg0;
	}
}
