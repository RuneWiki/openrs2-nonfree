import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!ud;")
	public static Class74 aClass74_4;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1076 = Static108.method1915("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt2127 = 0;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1077 = Static108.method1915("Loading fonts )2 ");

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1085 = Static108.method1915("level)2");

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1078 = aClass39_1085;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1079 = Static108.method1915("");

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1080 = Static108.method1915("Wordpack geladen)3");

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1081 = aClass39_1077;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public static int anInt2130 = 0;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1082 = Static108.method1915("This computers address has been blocked");

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1083 = Static108.method1915(" loggt sich ein)3");

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1084 = Static108.method1915(" )2> ");

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1086 = aClass39_1082;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1087 = Static108.method1915("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1088 = Static108.method1915("(Z");

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
	public static int anInt2131 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I")
	public static int method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = 256 - arg1;
		return ((arg0 & 0xFF00) * arg1 + local4 * (arg2 & 0xFF00) & 0xFF0000) + (arg1 * (arg0 & 0xFF00FF) + (arg2 & 0xFF00FF) * local4 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!kd;I)I")
	public static int method1486(@OriginalArg(0) Class39 arg0) {
		if (Static122.anInt2972 == 1) {
			return 7;
		} else if (arg0.method1185(Static124.aClass39_1498)) {
			return 1;
		} else if (arg0.method1185(Static46.aClass39_1323)) {
			return 1;
		} else if (arg0.method1185(Static95.aClass39_1395)) {
			return 2;
		} else if (arg0.method1185(Static53.aClass39_710)) {
			return 2;
		} else if (arg0.method1185(Static66.aClass39_841)) {
			return 3;
		} else if (arg0.method1185(Static41.aClass39_1507)) {
			return 4;
		} else if (arg0.method1185(Static93.aClass39_1134)) {
			return 5;
		} else if (arg0.method1185(Static29.aClass39_450)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method1487() {
		aClass39_1081 = null;
		aClass39_1082 = null;
		aClass39_1088 = null;
		aClass39_1087 = null;
		aClass39_1077 = null;
		aClass74_4 = null;
		aClass39_1084 = null;
		aClass39_1086 = null;
		aClass39_1085 = null;
		aClass39_1079 = null;
		aClass39_1083 = null;
		aClass39_1078 = null;
		aClass39_1076 = null;
		aClass39_1080 = null;
	}
}
