import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[[[Lclient!ui;")
	public static Class227[][][] aClass227ArrayArrayArray1;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!aq;")
	public static Class5 aClass5_2;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	public static int anInt1713;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!ll;")
	public static Class143 aClass143_12;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!oj;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[Lclient!vq;")
	public static Class243[] aClass243Array1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!pf;B)I")
	public static int method1549(@OriginalArg(0) Class2_Sub13_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method4257(2);
		@Pc(19) int local19;
		if (local10 == 0) {
			local19 = 0;
		} else if (local10 == 1) {
			local19 = arg0.method4257(5);
		} else if (local10 == 2) {
			local19 = arg0.method4257(8);
		} else {
			local19 = arg0.method4257(11);
		}
		return local19;
	}
}
