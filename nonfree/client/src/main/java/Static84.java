import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	public static int anInt2021;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_893 = Static134.method2017("cross");

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_894 = Static134.method2017("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!v;")
	private static Class76 aClass76_895 = Static134.method2017("Prepared sound engine");

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_896 = Static134.method2017(":chalreq:");

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_897 = Static134.method2017("Hierhin gehen");

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_898 = aClass76_895;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	public static int anInt2023 = 0;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_899 = Static134.method2017("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "[I")
	public static int[] anIntArray281 = new int[200];

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	public static int anInt2027 = 0;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V")
	public static void method1423(@OriginalArg(1) int arg0) {
		if (Static48.anInt1229 == 0) {
			Static30.aClass4_Sub12_Sub2_4.method1064(arg0);
		} else {
			Static110.anInt2401 = arg0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class4_Sub4_Sub13 method1424(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub13 local10 = (Class4_Sub4_Sub13) Static7.aClass72_6.method1781((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static61.aClass17_21.method290(13, arg0);
		local10 = new Class4_Sub4_Sub13();
		local10.anInt2224 = arg0;
		if (local22 != null) {
			local10.method1548(new Class4_Sub10(local22));
		}
		Static7.aClass72_6.method1783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method1425() {
		Static30.aClass4_Sub12_Sub2_4.method1089();
		Static28.aClass17_6 = null;
		Static48.anInt1229 = 1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!dd;)Lclient!dd;")
	public static Class4_Sub8 method1426(@OriginalArg(1) Class4_Sub8 arg0) {
		@Pc(13) int local13 = Static101.method1588(Static35.method627(arg0));
		if (local13 == 0) {
			return null;
		}
		for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
			arg0 = Static52.method946(arg0.anInt489);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V")
	public static void method1427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg1;
		@Pc(14) int local14 = 1;
		@Pc(17) int[] local17 = new int[4];
		local17[0] = arg0;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (arg1 != Static60.anIntArray203[local28]) {
				local8[local14] = Static60.anIntArray203[local28];
				local17[local14] = Static24.anIntArray76[local28];
				local14++;
			}
		}
		Static24.anIntArray76 = local17;
		Static60.anIntArray203 = local8;
		Static97.method1559(Static24.anIntArray76, Static81.aClass61Array1, Static81.aClass61Array1.length - 1, Static60.anIntArray203, 0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method1428() {
		aClass76_893 = null;
		aClass76_894 = null;
		aClass76_899 = null;
		aClass76_897 = null;
		aClass76_898 = null;
		aByteArrayArrayArray5 = null;
		aClass76_896 = null;
		anIntArray281 = null;
		aClass76_895 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!la;Lclient!v;Lclient!v;B)[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] method1429(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class76 arg2) {
		@Pc(4) int local4 = arg0.method299(arg2);
		@Pc(10) int local10 = arg0.method298(arg1, local4);
		return Static54.method1752(arg0, local4, local10);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!la;II)Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2 method1430(@OriginalArg(1) Class17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static1.method3(arg2, arg1, arg0) ? Static98.method1573() : null;
	}
}
