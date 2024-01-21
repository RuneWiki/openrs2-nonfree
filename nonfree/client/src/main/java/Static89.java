import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pd", name = "Dc", descriptor = "I")
	public static int anInt1979;

	@OriginalMember(owner = "client!pd", name = "Fc", descriptor = "Lclient!na;")
	public static Class56 aClass56_29;

	@OriginalMember(owner = "client!pd", name = "Bc", descriptor = "I")
	public static final int anInt1978 = 50;

	@OriginalMember(owner = "client!pd", name = "Cc", descriptor = "Lclient!pe;")
	public static Class65 aClass65_840 = Static119.method1462("0(U");

	@OriginalMember(owner = "client!pd", name = "Ec", descriptor = "Lclient!pe;")
	public static Class65 aClass65_841 = Static119.method1462("scrollen:");

	@OriginalMember(owner = "client!pd", name = "Gc", descriptor = "Lclient!pe;")
	public static Class65 aClass65_842 = Static119.method1462("b12_full");

	@OriginalMember(owner = "client!pd", name = "Jc", descriptor = "Lclient!pe;")
	public static Class65 aClass65_843 = Static119.method1462("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
	public static void method1472() {
		aClass65_842 = null;
		aClass65_843 = null;
		aClass65_840 = null;
		aClass65_841 = null;
		aClass56_29 = null;
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
	public static void method1473() {
		if (Static49.aClass39_1 != null) {
			@Pc(8) Class39 local8 = Static49.aClass39_1;
			synchronized (Static49.aClass39_1) {
				Static49.aClass39_1 = null;
			}
		}
	}
}
