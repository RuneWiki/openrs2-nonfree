import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIJI)Ljava/lang/String;")
	public static String method1603(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static659.method9126(arg1);
		@Pc(10) Calendar local10 = Static379.aCalendar19;
		@Pc(21) int local21 = local10.get(5);
		@Pc(25) int local25 = local10.get(2);
		@Pc(34) int local34 = local10.get(1);
		@Pc(38) int local38 = local10.get(11);
		@Pc(42) int local42 = local10.get(12);
		return arg0 == 3 ? Static59.method1282(arg0, arg1) : Integer.toString(local21 / 10) + local21 % 10 + "-" + Static141.aStringArrayArray52[arg0][local25] + "-" + local34 + " " + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10;
	}
}
