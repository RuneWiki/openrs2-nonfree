import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Lclient!mo;")
	public static Class236 aClass236_1;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	public static int anInt1559;

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
	public static int anInt1556 = 0;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)I")
	public static int method1448() {
		@Pc(5) int local5 = 0;
		@Pc(15) Field[] local15 = mfa.class.getDeclaredFields();
		for (@Pc(25) int local25 = 0; local25 < local15.length; local25++) {
			@Pc(30) Field local30 = local15[local25];
			if (ok.class.isAssignableFrom(local30.getType())) {
				local5++;
			}
		}
		return local5 + 1;
	}
}
