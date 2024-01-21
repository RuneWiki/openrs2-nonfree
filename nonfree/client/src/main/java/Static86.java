import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt1842;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!g;")
	public static Class26 aClass26_21;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "[I")
	public static int[] anIntArray259 = new int[5];

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_1247 = Static72.method1077("");

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "Lclient!u;")
	private static Class74 aClass74_1257 = Static72.method1077("FULL");

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1248 = aClass74_1257;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Lclient!u;")
	private static Class74 aClass74_1255 = Static72.method1077("Checking for updates )2 ");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_1249 = aClass74_1255;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!u;")
	private static Class74 aClass74_1256 = Static72.method1077("Malformed login packet)3");

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_1250 = aClass74_1256;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1251 = Static72.method1077("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!u;")
	private static Class74 aClass74_1254 = Static72.method1077("Loaded sprites");

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_1252 = aClass74_1254;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	public static int anInt1843 = 128;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!u;")
	private static Class74 aClass74_1253 = Static72.method1077("wishes to trade with you)3");

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_1258 = aClass74_1253;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "Lclient!u;")
	public static Class74 aClass74_1259 = Static72.method1077("@yel@*V");

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "Lclient!u;")
	public static Class74 aClass74_1260 = Static72.method1077("An:");

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
	public static final int anInt1852 = 7759444;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
	public static int anInt1853 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1300(@OriginalArg(1) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 <= 0 || local2 >= 256) {
			local2 = -1;
		}
		return local2;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1303() {
		aClass74_1260 = null;
		aClass74_1255 = null;
		aClass74_1247 = null;
		aClass26_21 = null;
		aClass74_1250 = null;
		aClass74_1254 = null;
		aClass74_1252 = null;
		aClass74_1251 = null;
		aClass74_1259 = null;
		aClass74_1249 = null;
		aClass74_1253 = null;
		anIntArray259 = null;
		aClass74_1256 = null;
		aClass74_1257 = null;
		aClass74_1248 = null;
		aClass74_1258 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!u;)I")
	public static int method1304(@OriginalArg(1) Class74 arg0) {
		if (Static95.anInt2095 == 1) {
			return 7;
		} else if (arg0.method1719(Static39.aClass74_685)) {
			return 1;
		} else if (arg0.method1719(Static63.aClass74_996)) {
			return 1;
		} else if (arg0.method1719(Static9.aClass74_223)) {
			return 2;
		} else if (arg0.method1719(Static119.aClass74_1597)) {
			return 2;
		} else if (arg0.method1719(Static37.aClass74_1324)) {
			return 3;
		} else if (arg0.method1719(Static36.aClass74_660)) {
			return 4;
		} else if (arg0.method1719(Static46.aClass74_764)) {
			return 5;
		} else if (arg0.method1719(Static45.aClass74_736)) {
			return 6;
		} else {
			return 0;
		}
	}
}
