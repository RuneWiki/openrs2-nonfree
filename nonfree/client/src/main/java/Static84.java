import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lclient!oc;")
	public static Class34 aClass34_66;

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
	public static int anInt2351;

	@OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lclient!rb;")
	public static Class55 aClass55_37;

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1320 = Static15.method178(" )2> @yel@");

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "Lclient!ba;")
	public static Class5 aClass5_50 = new Class5(64);

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1321 = Static15.method178("Enter name of player to delete from list");

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1322 = Static15.method178("System)2Update in: ");

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1323 = Static15.method178("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1324 = Static15.method178("Einloggen");

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
	public static int anInt2353 = -1;

	@OriginalMember(owner = "client!qe", name = "ib", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1325 = aClass23_1321;

	@OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1326 = Static15.method178("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!qe", name = "kb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1327 = Static15.method178("blinken3:");

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1328 = Static15.method178("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!qe", name = "mb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1329 = Static15.method178("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method1467() {
		if (Static97.aClass11_1 == null) {
			return;
		}
		if (Static19.anInt494 >= 0) {
			if (Static11.anInt219 > 0) {
				Static5.anInt144 += Static87.anInt2854;
				Static97.aClass11_1.method1107(Static19.anInt494, Static5.anInt144);
				Static11.anInt219--;
				if (Static11.anInt219 == 0) {
					Static97.aClass11_1.method1103();
					Static11.anInt219 = 20;
					Static19.anInt494 = -1;
				}
			}
		} else if (Static11.anInt219 > 0) {
			Static11.anInt219--;
			if (Static11.anInt219 == 0) {
				if (Static42.aByteArray7 == null) {
					Static97.aClass11_1.method1105(256);
				} else {
					Static97.aClass11_1.method1105(Static95.anInt2488);
					Static19.anInt494 = Static95.anInt2488;
					Static97.aClass11_1.method1104(Static95.anInt2488, Static42.aByteArray7, Static26.aBoolean48);
					Static42.aByteArray7 = null;
				}
				Static5.anInt144 = 0;
			}
		}
		Static97.aClass11_1.method1111();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public static void method1468() {
		Static17.aClass5_13.method99();
		Static9.aClass5_7.method99();
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	public static void method1469() {
		aClass23_1320 = null;
		aClass34_66 = null;
		aClass23_1322 = null;
		aClass23_1325 = null;
		aClass23_1327 = null;
		aClass5_50 = null;
		aClass23_1321 = null;
		aClass23_1329 = null;
		aClass23_1324 = null;
		aClass23_1328 = null;
		aClass55_37 = null;
		aClass23_1326 = null;
		aClass23_1323 = null;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public static void method1472() {
		for (@Pc(1) int local1 = 0; local1 < Static37.anInt1299; local1++) {
			@Pc(6) int local6 = Static88.anIntArray151[local1];
			@Pc(10) Class1_Sub1_Sub2_Sub1_Sub2 local10 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local6];
			@Pc(14) int local14 = Static83.aClass1_Sub5_Sub1_3.method716();
			if ((local14 & 0x2) != 0) {
				local14 += Static83.aClass1_Sub5_Sub1_3.method716() << 8;
			}
			Static92.method1911(local6, local14, local10);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	public static void method1473(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && Static77.anInt2108 == 0) {
			Static77.method1345();
		} else if (arg0 != -1 && Static115.anInt2966 != arg0 && Static13.anInt232 != 0 && Static77.anInt2108 == 0) {
			Static77.method1344(Static42.aClass55_Sub1_7, arg0, Static13.anInt232, 0);
		}
		Static115.anInt2966 = arg0;
	}
}
