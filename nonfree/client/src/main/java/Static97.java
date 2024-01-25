import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dfa", name = "l", descriptor = "I")
	public static int anInt1434 = -1;

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
	public static int anInt1438 = 0;

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZIIJ)Ljava/lang/String;")
	public static String method1403(@OriginalArg(2) int arg0, @OriginalArg(3) long arg1) {
		Static585.method8158(arg1);
		@Pc(17) Calendar local17 = Static390.aCalendar2;
		@Pc(28) int local28 = local17.get(5);
		@Pc(34) int local34 = local17.get(2) + 1;
		@Pc(38) int local38 = local17.get(1);
		@Pc(42) int local42 = local17.get(11);
		@Pc(46) int local46 = local17.get(12);
		return Integer.toString(local28 / 10) + local28 % 10 + "/" + local34 / 10 + local34 % 10 + "/" + local38 % 100 / 10 + local38 % 10 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10;
	}
}
