import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "F")
	public static float aFloat260;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "[Lclient!wg;")
	public static final Class362[] aClass362Array3 = new Class362[4];

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
	public static int anInt9596 = -1;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7703(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local29++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static564.aCharArray7[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(82) int local82 = local54.length() - 1;
					local72 = ' ';
					local54.setCharAt(local82, Character.toUpperCase(local54.charAt(local82)));
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}
}
