import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!oe", name = "jb", descriptor = "Lclient!kf;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "Lclient!af;")
	private static Class5 aClass5_1074 = Static45.method1937("Invalid username or password)3");

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "Lclient!af;")
	private static Class5 aClass5_1077 = Static45.method1937("Loaded title screen");

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "Lclient!af;")
	public static Class5 aClass5_1075 = aClass5_1077;

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "Lclient!af;")
	public static Class5 aClass5_1076 = aClass5_1074;

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1078 = Static45.method1937("gleiten:");

	@OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
	public static int anInt2229 = 0;

	@OriginalMember(owner = "client!oe", name = "fb", descriptor = "Lclient!gd;")
	public static Class28 aClass28_62 = new Class28(64);

	@OriginalMember(owner = "client!oe", name = "gb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1079 = Static45.method1937("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1080 = Static45.method1937("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1081 = Static45.method1937("<)4col> x");

	@OriginalMember(owner = "client!oe", name = "lb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1082 = Static45.method1937("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!oe", name = "mb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1083 = Static45.method1937("Members only world");

	@OriginalMember(owner = "client!oe", name = "nb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1084 = aClass5_1083;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public static void method1559() {
		aClass43_1 = null;
		aClass5_1083 = null;
		aClass5_1082 = null;
		anIntArray337 = null;
		aClass28_62 = null;
		aClass5_1079 = null;
		aClass5_1084 = null;
		aClass5_1077 = null;
		aClass5_1081 = null;
		aClass5_1078 = null;
		aClass5_1075 = null;
		aClass5_1076 = null;
		aClass5_1080 = null;
		aClass5_1074 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V")
	public static void method1561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static44.aClass1_Sub20_Sub1_1.method2108(181);
		Static44.aClass1_Sub20_Sub1_1.method2060(arg1);
		Static44.aClass1_Sub20_Sub1_1.method2064(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!af;ILclient!af;Lclient!kb;)Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 method1563(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(8) int local8 = arg2.method1724(arg0);
		@Pc(14) int local14 = arg2.method1698(arg1, local8);
		return Static64.method1171(arg2, local8, local14);
	}
}
