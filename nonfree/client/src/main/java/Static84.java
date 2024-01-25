import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Lclient!vl;")
	public static Class4_Sub1 method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub1_3;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method1477(@OriginalArg(0) String arg0) {
		Static438.aString70 = arg0;
		if (Static303.aClass131_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static303.aClass131_4.anApplet1.getParameter("cookieprefix");
			@Pc(23) String local23 = Static303.aClass131_4.anApplet1.getParameter("cookiehost");
			@Pc(38) String local38 = local18 + "settings=" + arg0 + "; version=1; path=/; domain=" + local23;
			if (arg0.length() == 0) {
				local38 = local38 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local38 = local38 + "; Expires=" + Static322.method4610(Static208.method3182() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static461.method3592(Static303.aClass131_4.anApplet1, "document.cookie=\"" + local38 + "\"");
		} catch (@Pc(90) Throwable local90) {
		}
	}
}
