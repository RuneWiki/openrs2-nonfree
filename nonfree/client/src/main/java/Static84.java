import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_114 = new Class159("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public static int anInt2385 = -50;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method2102(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				@Pc(71) char local71 = Static45.aCharArray3[(int) (local57 - arg0 * 37L)];
				if (local71 == '_') {
					@Pc(81) int local81 = local53.length() - 1;
					local71 = ' ';
					local53.setCharAt(local81, Character.toUpperCase(local53.charAt(local81)));
				}
				local53.append(local71);
			}
			local53.reverse();
			local53.setCharAt(0, Character.toUpperCase(local53.charAt(0)));
			return local53.toString();
		}
	}
}
