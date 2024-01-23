import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
	public static int anInt1755;

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
	public static int anInt1756;

	@OriginalMember(owner = "client!hi", name = "U", descriptor = "Lclient!ie;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
	public static int anInt1761;

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!hi", name = "Q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_555 = Static186.method3527("_labels");

	@OriginalMember(owner = "client!hi", name = "T", descriptor = "Lclient!hh;")
	public static Class50 aClass50_556 = Static186.method3527("<col=ffff00>");

	@OriginalMember(owner = "client!hi", name = "V", descriptor = "[I")
	public static int[] anIntArray138 = new int[2];

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(B)V")
	public static void method1278() {
		Static40.aClass84_16.method2576();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!hh;B)I")
	public static int method1279(@OriginalArg(0) Class50 arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static21.anInt420; local16++) {
			if (arg0.method1256(Static149.aClass50Array58[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
