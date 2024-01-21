import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!ad;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt2088 = 0;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1057 = Static108.method1915("backtop1");

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1058 = Static108.method1915("World");

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1059 = Static108.method1915(":tradereq:");

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1060 = Static108.method1915("welle2:");

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1061 = aClass39_1058;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1062 = Static108.method1915("lila:");

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1063 = Static108.method1915("sl_stars");

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "[I")
	public static int[] anIntArray322 = new int[200];

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1064 = aClass39_1058;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BILclient!q;)Lclient!pf;")
	public static Class1_Sub17 method1464(@OriginalArg(1) int arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(16) byte[] local16 = arg1.method1998(arg0);
		return local16 == null ? null : new Class1_Sub17(local16);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!q;ZLclient!gd;Lclient!q;)V")
	public static void method1468(@OriginalArg(1) Class62 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1_Sub1_Sub4_Sub3 arg2, @OriginalArg(4) Class62 arg3) {
		Static81.aClass62_25 = arg0;
		Static68.aBoolean150 = arg1;
		Static53.aClass62_15 = arg3;
		Static117.anInt2912 = Static53.aClass62_15.method1999(10);
		Static73.aClass1_Sub1_Sub4_Sub3_2 = arg2;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method1470() {
		aClass39_1063 = null;
		aLongArray4 = null;
		aClass39_1057 = null;
		aClass3_1 = null;
		aClass39_1062 = null;
		aClass39_1060 = null;
		aClass39_1059 = null;
		anIntArray322 = null;
		aClass39_1061 = null;
		aClass39_1058 = null;
		aClass39_1064 = null;
	}
}
