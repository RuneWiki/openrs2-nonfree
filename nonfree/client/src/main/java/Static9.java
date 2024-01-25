import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_1 = new Class379("", 17);

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString1 = null;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Lclient!uv;")
	public static Class344 aClass344_1 = null;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
	public static void method188() {
		if (Static303.anApplet3 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static303.anApplet3.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static191.method3071() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static652.method1817("document.cookie=\"" + local30 + "\"", Static303.anApplet3);
		} catch (@Pc(49) Throwable local49) {
		}
	}
}
