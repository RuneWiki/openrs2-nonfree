import java.awt.datatransfer.Clipboard;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Lclient!cn;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
	public static int anInt2198;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_40 = new Class217(20, 11);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!nu;Z)Lclient!ok;")
	public static Class179 method1700(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub2 arg1) {
		@Pc(12) Class179 local12;
		if (Static37.aClass179_1 == null) {
			local12 = new Class179();
		} else {
			local12 = Static37.aClass179_1;
			Static37.aClass179_1 = Static37.aClass179_1.aClass179_3;
			local12.aClass179_3 = null;
			Static219.anInt4143--;
		}
		local12.anInt5239 = arg0;
		local12.aClass7_Sub2_2 = arg1;
		return local12;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1702(@OriginalArg(0) long arg0) {
		Static95.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static95.aCalendar1.get(7);
		@Pc(25) int local25 = Static95.aCalendar1.get(5);
		@Pc(29) int local29 = Static95.aCalendar1.get(2);
		@Pc(33) int local33 = Static95.aCalendar1.get(1);
		@Pc(37) int local37 = Static95.aCalendar1.get(11);
		@Pc(41) int local41 = Static95.aCalendar1.get(12);
		@Pc(45) int local45 = Static95.aCalendar1.get(13);
		return Static50.aStringArray8[local13 - 1] + ", " + local25 / 10 + local25 % 10 + "-" + Static134.aStringArray27[local29] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}
}
