import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "Lclient!jb;")
	public static Class33 aClass33_33 = new Class33(64);

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	public static int anInt2217 = 0;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "[I")
	public static int[] anIntArray338 = new int[100];

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	public static int anInt2223 = -1;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1142 = Static108.method1915("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1145 = Static108.method1915("wishes to trade with you)3");

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1143 = aClass39_1145;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1144 = Static108.method1915("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "[I")
	public static int[] anIntArray339 = new int[25];

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
	public static int anInt2224 = 0;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "[S")
	public static short[] aShortArray8 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1146 = Static108.method1915("weiss:");

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
	public static void method1582() {
		try {
			@Pc(6) Graphics local6 = Static16.aCanvas10.getGraphics();
			Static79.aClass6_17.method2067(4, 4, local6);
		} catch (@Pc(14) Exception local14) {
			Static16.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(JI)V")
	public static void method1583(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static108.anInt2750 >= 100) {
			Static66.method1189(Static8.aClass39_147, Static17.aClass39_303, 0);
			return;
		}
		@Pc(33) Class39 local33 = Static75.method1290(arg0).method1153();
		for (@Pc(35) int local35 = 0; local35 < Static108.anInt2750; local35++) {
			if (arg0 == Static88.aLongArray4[local35]) {
				Static66.method1189(Static8.aClass39_147, Static30.method601(new Class39[] { local33, Static53.aClass39_709 }), 0);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static12.anInt502; local66++) {
			if (Static45.aLongArray3[local66] == arg0) {
				Static66.method1189(Static8.aClass39_147, Static30.method601(new Class39[] { Static79.aClass39_1223, local33, Static129.aClass39_1556 }), 0);
				return;
			}
		}
		if (!local33.method1159(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass39_1234)) {
			Static88.aLongArray4[Static108.anInt2750++] = arg0;
			Static35.aBoolean96 = true;
			Static103.aClass1_Sub18_Sub1_5.method2203(24);
			Static103.aClass1_Sub18_Sub1_5.method2179(arg0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public static void method1586() {
		aClass39_1142 = null;
		aClass39_1144 = null;
		anIntArray339 = null;
		aClass39_1143 = null;
		aClass39_1145 = null;
		anIntArray338 = null;
		aClass39_1146 = null;
		aShortArray8 = null;
		aClass33_33 = null;
	}
}
