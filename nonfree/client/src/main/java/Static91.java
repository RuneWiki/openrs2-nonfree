import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static91 {

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString127 = " is already on your friend list.";

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(CB)Z")
	public static boolean method1963(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1964(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static335.aClass5_Sub1_Sub1_3.method174(252);
			Static335.aClass5_Sub1_Sub1_3.method1886(Static344.method954(arg0));
			Static335.aClass5_Sub1_Sub1_3.method1849(arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V")
	public static void method1966() {
		Static25.aClass66_3.method1944(5);
	}
}
