import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!qe", name = "ob", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1093 = Static38.method736("Password: ");

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1084 = aClass71_1093;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1085 = Static38.method736("backleft2");

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1086 = Static38.method736("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1087 = Static38.method736("*6n");

	@OriginalMember(owner = "client!qe", name = "ib", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1091 = Static38.method736("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1088 = aClass71_1091;

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1089 = Static38.method736("::gc");

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1090 = Static38.method736("backvmid1");

	@OriginalMember(owner = "client!qe", name = "mb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1092 = Static38.method736("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!qe", name = "Ab", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1094 = Static38.method736("Weiter");

	@OriginalMember(owner = "client!qe", name = "Hb", descriptor = "I")
	public static int anInt2246 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!vc;ILclient!vc;)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) Class71 arg2) {
		if (arg0 == 0 && Static7.anInt275 != -1) {
			Static48.aClass71_709 = arg1;
			Static66.anInt1652 = 0;
		}
		if (Static62.anInt1577 == -1) {
			Static68.aBoolean72 = true;
		}
		for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
			Static31.anIntArray104[local26] = Static31.anIntArray104[local26 - 1];
			Static9.aClass71Array3[local26] = Static9.aClass71Array3[local26 - 1];
			Static31.aClass71Array9[local26] = Static31.aClass71Array9[local26 - 1];
		}
		Static9.aClass71Array3[0] = arg2;
		Static31.aClass71Array9[0] = arg1;
		Static31.anIntArray104[0] = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
	public static void method1519() {
		aClass71_1086 = null;
		aClass71_1084 = null;
		aClass71_1087 = null;
		aClass71_1085 = null;
		aClass71_1091 = null;
		aClass71_1094 = null;
		aClass71_1090 = null;
		aClass71_1092 = null;
		aClass71_1093 = null;
		aClass71_1088 = null;
		aClass71_1089 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!me;)Lclient!vc;")
	public static Class71 method1542(@OriginalArg(1) Class5_Sub1_Sub11 arg0) {
		if (Static69.method1162(Static23.method545(arg0)) == 0) {
			return null;
		} else if (arg0.aClass71_881 == null || arg0.aClass71_881.method1821().method1784() == 0) {
			return Static3.aBoolean3 ? Static56.aClass71_739 : null;
		} else {
			return arg0.aClass71_881;
		}
	}
}
