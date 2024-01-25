import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	public static int anInt1898;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_24 = new Class274(97, 6);

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
	public static final int[] anIntArray170 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_25 = new Class274(91, 8);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1664(@OriginalArg(1) long arg0) {
		Static178.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static178.aCalendar1.get(7);
		@Pc(17) int local17 = Static178.aCalendar1.get(5);
		@Pc(21) int local21 = Static178.aCalendar1.get(2);
		@Pc(25) int local25 = Static178.aCalendar1.get(1);
		@Pc(29) int local29 = Static178.aCalendar1.get(11);
		@Pc(38) int local38 = Static178.aCalendar1.get(12);
		@Pc(42) int local42 = Static178.aCalendar1.get(13);
		return Static329.aStringArray42[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static529.aStringArray39[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
