import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt2520;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1127 = Static24.method441("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1131 = Static24.method441("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1128 = aClass65_1131;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1129 = Static24.method441("Loaded update list");

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1130 = Static24.method441("blinken1:");

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1132 = Static24.method441("Absender:");

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	public static int anInt2519 = 0;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1133 = Static24.method441("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "[Lclient!fe;")
	public static Class2_Sub8[] aClass2_Sub8Array1 = new Class2_Sub8[2048];

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1134 = aClass65_1129;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1135 = Static24.method441("welle2:");

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	public static int anInt2521 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method1545() {
		aClass65_1135 = null;
		aClass65_1132 = null;
		aClass65_1131 = null;
		aClass65_1133 = null;
		aClass65_1129 = null;
		aClass2_Sub8Array1 = null;
		aClass65_1127 = null;
		aClass65_1128 = null;
		aClass65_1134 = null;
		aClass65_1130 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
	public static int method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47 = Static100.method1704(arg0 - 1, arg1 + -1) + Static100.method1704(arg0 + 1, arg1 + -1) + Static100.method1704(arg0 - 1, arg1 - -1) + Static100.method1704(arg0 - -1, arg1 - -1);
		@Pc(76) int local76 = Static100.method1704(arg0 - 1, arg1) + Static100.method1704(arg0 + 1, arg1) + Static100.method1704(arg0, arg1 - 1) + Static100.method1704(arg0, arg1 + 1);
		@Pc(81) int local81 = Static100.method1704(arg0, arg1);
		return local81 / 4 + local47 / 16 + local76 / 8;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method1547() {
		if (Static108.aClass19_1 != null) {
			@Pc(7) Class19 local7 = Static108.aClass19_1;
			synchronized (Static108.aClass19_1) {
				Static108.aClass19_1 = null;
			}
		}
	}
}
