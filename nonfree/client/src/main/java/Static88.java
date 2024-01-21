import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1068 = Static122.method531("K");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1069 = Static122.method531("Please use a different world)3");

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1070 = Static122.method531("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1071 = aClass73_1068;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1072 = aClass73_1069;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1073 = aClass73_1069;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1074 = Static122.method531("Fps:");

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1075 = Static122.method531("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1076 = aClass73_1068;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1533() {
		if (Static70.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static134.anIntArray318[189] = 26;
			Static134.anIntArray318[190] = 72;
			Static134.anIntArray318[221] = 43;
			Static134.anIntArray318[188] = 71;
			Static134.anIntArray318[219] = 42;
			Static134.anIntArray318[220] = 74;
			Static134.anIntArray318[192] = 58;
			Static134.anIntArray318[191] = 73;
			Static134.anIntArray318[222] = 59;
			Static134.anIntArray318[223] = 28;
			Static134.anIntArray318[186] = 57;
			Static134.anIntArray318[187] = 27;
			return;
		}
		Static134.anIntArray318[47] = 73;
		Static134.anIntArray318[61] = 27;
		if (Static70.aMethod1 == null) {
			Static134.anIntArray318[222] = 59;
			Static134.anIntArray318[192] = 58;
		} else {
			Static134.anIntArray318[520] = 59;
			Static134.anIntArray318[192] = 28;
			Static134.anIntArray318[222] = 58;
		}
		Static134.anIntArray318[93] = 43;
		Static134.anIntArray318[91] = 42;
		Static134.anIntArray318[46] = 72;
		Static134.anIntArray318[45] = 26;
		Static134.anIntArray318[59] = 57;
		Static134.anIntArray318[44] = 71;
		Static134.anIntArray318[92] = 74;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
	public static void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static136.anInt3089 == 0 || arg2 == 0 || Static34.anInt835 >= 50) {
			return;
		}
		Static176.anIntArray420[Static34.anInt835] = arg1;
		Static138.anIntArray331[Static34.anInt835] = arg2;
		Static41.anIntArray94[Static34.anInt835] = arg0;
		Static117.aClass66Array1[Static34.anInt835] = null;
		Static166.anIntArray382[Static34.anInt835] = 0;
		Static34.anInt835++;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method1535() {
		aClass73_1076 = null;
		aClass73_1071 = null;
		aClass73_1072 = null;
		aClass73_1068 = null;
		anIntArrayArray17 = null;
		aClass73_1069 = null;
		aClass73_1073 = null;
		aClass73_1075 = null;
		aClass73_1074 = null;
		anIntArray201 = null;
		aClass73_1070 = null;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)J")
	public static synchronized long method1536() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static87.aLong92) {
			Static130.aLong138 += Static87.aLong92 - local10;
		}
		Static87.aLong92 = local10;
		return local10 + Static130.aLong138;
	}
}
