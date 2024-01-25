import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
	public static int anInt1599;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5;

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!pq;")
	public static Class251 aClass251_29;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
	public static int anInt1600;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "J")
	public static long aLong54 = -1L;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIILclient!ul;)V")
	public static void method1504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class29_Sub3 arg3) {
		@Pc(4) Class9 local4 = Static157.method2295(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass29_Sub3_1 = arg3;
		}
	}
}
