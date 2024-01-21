import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
	public static int anInt3048;

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_50;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_47;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1332 = Static63.method1251("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1333 = Static63.method1251(" )2> @yel@");

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
	public static int[] anIntArray478 = new int[4000];

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1334 = Static63.method1251(" )2> ");

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1336 = Static63.method1251("K");

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1335 = aClass45_1336;

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1337 = Static63.method1251("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1338 = Static63.method1251("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
	public static int anInt3054 = 0;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1339 = aClass45_1336;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Z")
	public static boolean method2112(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BIII)I")
	public static int method2113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
	public static void method2114() {
		aClass45_1337 = null;
		aClass45_1336 = null;
		aClass45_1339 = null;
		aClass45_1333 = null;
		aClass45_1338 = null;
		anIntArray478 = null;
		aClass45_1335 = null;
		aClass45_1334 = null;
		aClass45_1332 = null;
		aClass29_Sub1_50 = null;
		aClass5_Sub2_Sub6_Sub4_47 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
	public static int method2115(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}
}
