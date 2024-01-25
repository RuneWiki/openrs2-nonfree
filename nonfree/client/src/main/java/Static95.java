import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static95 {

	@OriginalMember(owner = "client!da", name = "o", descriptor = "I")
	public static int anInt9415 = 765;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "[Lclient!pja;")
	public static final Class3_Sub37[] aClass3_Sub37Array8 = new Class3_Sub37[300];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IC)Z")
	public static boolean method7685(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
