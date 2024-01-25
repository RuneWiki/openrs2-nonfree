import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "Lclient!eq;")
	public static Class97 aClass97_97;

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
	public static int anInt7012 = 1;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLjava/lang/String;IZ)Z")
	public static boolean method5861(@OriginalArg(1) String arg0) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(43) char local43 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local43 == '-') {
					local29 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local43 >= '0' && local43 <= '9') {
				local73 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local73 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local73 = local43 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local29) {
				local73 = -local73;
			}
			@Pc(111) int local111 = local33 * 10 + local73;
			if (local111 / 10 != local33) {
				return false;
			}
			local31 = true;
			local33 = local111;
		}
		return local31;
	}
}
