import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!qd", name = "yb", descriptor = "Z")
	public static boolean aBoolean115;

	@OriginalMember(owner = "client!qd", name = "Bb", descriptor = "I")
	public static int anInt2305;

	@OriginalMember(owner = "client!qd", name = "hb", descriptor = "[I")
	public static int[] anIntArray349 = new int[32768];

	@OriginalMember(owner = "client!qd", name = "jb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1084 = Static87.method1648("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
	public static int anInt2296 = 0;

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
	public static int anInt2297 = 0;

	@OriginalMember(owner = "client!qd", name = "mb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1085 = Static87.method1648("Ignorieren");

	@OriginalMember(owner = "client!qd", name = "Ab", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1086 = Static87.method1648("@yel@");

	@OriginalMember(owner = "client!qd", name = "Db", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1087 = Static87.method1648(" weitere Optionen");

	@OriginalMember(owner = "client!qd", name = "Fb", descriptor = "I")
	public static int anInt2308 = 0;

	@OriginalMember(owner = "client!qd", name = "Kb", descriptor = "I")
	public static int anInt2313 = 0;

	@OriginalMember(owner = "client!qd", name = "Lb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1088 = Static87.method1648("Enter name:");

	@OriginalMember(owner = "client!qd", name = "Ob", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!qd", name = "Pb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1089 = aClass27_1088;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public static void method1627() {
		aClass27_1088 = null;
		anIntArray349 = null;
		aClass27_1084 = null;
		aClass27_1086 = null;
		aClass27_1085 = null;
		aClass27_1087 = null;
		aBooleanArray11 = null;
		aClass27_1089 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!hb;BLclient!td;Lclient!hb;)[Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4[] method1628(@OriginalArg(0) Class27 arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) Class27 arg2) {
		@Pc(15) int local15 = arg1.method1620(arg0);
		@Pc(21) int local21 = arg1.method1613(arg2, local15);
		return Static104.method1863(arg1, local15, local21);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)Z")
	public static boolean method1630(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static53.anIntArray234[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 6;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(JI)V")
	public static void method1631(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static43.anInt1241 >= 100 && Static86.anInt2326 != 1 || Static43.anInt1241 >= 200) {
			Static43.method901(Static91.aClass27_1189, Static45.aClass27_182, 0);
			return;
		}
		@Pc(31) Class27 local31 = Static38.method712(arg0).method746();
		for (@Pc(33) int local33 = 0; local33 < Static43.anInt1241; local33++) {
			if (arg0 == Static53.aLongArray8[local33]) {
				Static43.method901(Static98.method1779(new Class27[] { local31, Static32.aClass27_392 }), Static45.aClass27_182, 0);
				return;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static38.anInt910; local68++) {
			if (Static45.aLongArray5[local68] == arg0) {
				Static43.method901(Static98.method1779(new Class27[] { Static80.aClass27_1035, local31, Static17.aClass27_226 }), Static45.aClass27_182, 0);
				return;
			}
		}
		if (local31.method733(Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass27_1150)) {
			return;
		}
		Static46.aClass27Array5[Static43.anInt1241] = local31;
		Static53.aLongArray8[Static43.anInt1241] = arg0;
		Static22.anIntArray116[Static43.anInt1241] = 0;
		Static43.anInt1241++;
		Static75.aBoolean101 = true;
		Static78.aClass3_Sub11_Sub1_3.method1478(45);
		Static78.aClass3_Sub11_Sub1_3.method1468(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)I")
	public static int method1635() {
		return Static66.anInt1717++;
	}
}
