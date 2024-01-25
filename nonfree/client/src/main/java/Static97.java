import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_6 = new Class37(6, 0, 4, 2);

	@OriginalMember(owner = "client!em", name = "j", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_41 = new Class25(101, 12);

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Lclient!of;")
	public static final Class188 aClass188_17 = new Class188(4);

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_31 = new Class231("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_42 = new Class25(71, 0);

	@OriginalMember(owner = "client!em", name = "p", descriptor = "I")
	public static int anInt1555 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z")
	public static boolean method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
