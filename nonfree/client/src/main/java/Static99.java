import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
	public static int anInt1769;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	public static void method1700() {
		Static180.method3537();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)J")
	public static synchronized long method1701() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static451.aLong226) {
			Static149.aLong87 += Static451.aLong226 - local5;
		}
		Static451.aLong226 = local5;
		return local5 + Static149.aLong87;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
	public static void method1702() {
		if (Static637.anApplet2 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static637.anApplet2.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (method1701() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static675.method1326("document.cookie=\"" + local30 + "\"", Static637.anApplet2);
		} catch (@Pc(44) Throwable local44) {
		}
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V")
	public static void method1703() {
		Static326.aBoolean439 = true;
	}
}
