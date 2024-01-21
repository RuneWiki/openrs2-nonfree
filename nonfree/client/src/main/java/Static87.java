import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!oc", name = "Hb", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!oc", name = "mb", descriptor = "I")
	public static int anInt2260 = 0;

	@OriginalMember(owner = "client!oc", name = "nb", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!oc", name = "qb", descriptor = "I")
	public static int anInt2264 = 1;

	@OriginalMember(owner = "client!oc", name = "xb", descriptor = "Lclient!id;")
	private static Class34 aClass34_1150 = Static9.method266(" has logged in)3");

	@OriginalMember(owner = "client!oc", name = "rb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1149 = aClass34_1150;

	@OriginalMember(owner = "client!oc", name = "Eb", descriptor = "Lclient!id;")
	private static Class34 aClass34_1151 = Static9.method266("Error connecting to server)3");

	@OriginalMember(owner = "client!oc", name = "Fb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1152 = Static9.method266("Untersuchen");

	@OriginalMember(owner = "client!oc", name = "Gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1153 = aClass34_1151;

	@OriginalMember(owner = "client!oc", name = "Ib", descriptor = "Lclient!id;")
	public static Class34 aClass34_1154 = Static9.method266("<)4col>");

	@OriginalMember(owner = "client!oc", name = "Jb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1155 = Static9.method266("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
	public static void method1483() {
		Static21.aByteArrayArrayArray6 = new byte[4][104][104];
		Static50.anIntArrayArrayArray1 = new int[4][105][105];
		Static84.anIntArrayArray23 = new int[105][105];
		Static113.anIntArray342 = new int[104];
		Static16.aByteArrayArrayArray5 = new byte[4][104][104];
		Static93.anIntArray307 = new int[104];
		Static127.aByteArrayArrayArray8 = new byte[4][104][104];
		Static5.anInt358 = 99;
		Static16.anIntArray63 = new int[104];
		Static69.aByteArrayArrayArray7 = new byte[4][105][105];
		Static100.anIntArray315 = new int[104];
		Static6.aByteArrayArrayArray1 = new byte[4][104][104];
		Static76.anIntArray232 = new int[104];
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)I")
	public static int method1484() {
		return Static58.anInt1620++;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBZILclient!ie;I)V")
	public static void method1485(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class35 arg2, @OriginalArg(5) int arg3) {
		Static76.anInt2063 = 10000;
		Static37.anInt1103 = arg0;
		Static21.anInt756 = arg1;
		Static93.anInt2429 = 1;
		Static98.aClass35_25 = arg2;
		Static12.anInt540 = arg3;
		Static76.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)I")
	public static int method1486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg2;
		} else if (local8 == 1) {
			return 7 - arg1;
		} else if (local8 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
	public static void method1488() {
		anIntArray297 = null;
		aClass34_1152 = null;
		aClass34_1153 = null;
		aClass34_1151 = null;
		aClass34_1154 = null;
		aClass34_1155 = null;
		aClass34_1150 = null;
		aClass34_1149 = null;
	}
}
