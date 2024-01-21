import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt2828;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!pb;")
	public static Class40 aClass40_35;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_22;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "Lclient!pb;")
	public static Class40 aClass40_36;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!le;")
	public static Class36 aClass36_33 = new Class36(20);

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1184 = Static34.method846("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1185 = Static34.method846("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1186 = Static34.method846("Titelbild geladen)3");

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1187 = Static34.method846(":chalreq:");

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1188 = Static34.method846("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public static int anInt2829 = 0;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1189 = Static34.method846("Select");

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1190 = Static34.method846("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1191 = Static34.method846("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1192 = Static34.method846(" is already on your friend list");

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1193 = aClass55_1189;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1194 = Static34.method846("backbase2");

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1195 = aClass55_1192;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
	public static volatile int anInt2830 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1868(@OriginalArg(1) Component arg0) {
		@Pc(1) Method local1 = Static25.aMethod2;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(15) Throwable local15) {
			}
		}
		arg0.addKeyListener(Static59.aClass24_1);
		arg0.addFocusListener(Static59.aClass24_1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!te;I)Z")
	public static boolean method1869(@OriginalArg(0) Class6_Sub2_Sub14 arg0) {
		if (arg0.anIntArray269 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray269.length; local12++) {
			@Pc(19) int local19 = Static101.method1934(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray270[local12];
			if (arg0.anIntArray269[local12] == 2) {
				if (local19 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray269[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray269[local12] == 4) {
				if (local24 == local19) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method1870() {
		aClass55_1189 = null;
		aClass40_36 = null;
		aClass55_1188 = null;
		aClass55_1191 = null;
		aClass55_1193 = null;
		aClass55_1184 = null;
		aClass6_Sub2_Sub2_Sub1_22 = null;
		aClass55_1185 = null;
		aClass55_1187 = null;
		aClass55_1186 = null;
		aClass55_1194 = null;
		aClass55_1195 = null;
		aClass55_1190 = null;
		aClass36_33 = null;
		aClass40_35 = null;
		aClass55_1192 = null;
	}
}
