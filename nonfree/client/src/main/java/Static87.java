import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt2447;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!cc;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_29;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1002 = Static34.method846("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1003 = Static34.method846(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1004 = Static34.method846("(U3");

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	public static int[] anIntArray239 = new int[128];

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1005 = aClass55_1002;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1006 = Static34.method846("welle:");

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1007 = Static34.method846("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1008 = Static34.method846("Weiter");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZJ)V")
	public static void method1676(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!pb;I)V")
	public static void method1677(@OriginalArg(0) Class40 arg0) {
		Static17.aClass40_15 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1678() {
		aClass55_1006 = null;
		aClass55_1005 = null;
		aClass55_1008 = null;
		aClass55_1007 = null;
		aClass55_1002 = null;
		anIntArray239 = null;
		aClass40_Sub1_29 = null;
		aClass55_1003 = null;
		aClass10_1 = null;
		aClass55_1004 = null;
	}
}
