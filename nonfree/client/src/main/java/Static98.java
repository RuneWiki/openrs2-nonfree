import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!eo", name = "jd", descriptor = "J")
	public static long aLong68;

	@OriginalMember(owner = "client!eo", name = "qc", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_74 = new Class92(81, 3);

	@OriginalMember(owner = "client!eo", name = "kd", descriptor = "I")
	public static int anInt2228 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)V")
	public static void method1725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class14 local9 = Static125.aClass14ArrayArray2[arg0][arg2];
		Static60.method1197(arg1, local9 == null ? Static311.aClass14_2 : local9);
	}
}
