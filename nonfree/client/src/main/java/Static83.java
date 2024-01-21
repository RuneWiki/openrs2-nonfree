import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!od", name = "jb", descriptor = "I")
	public static int anInt2155;

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "Z")
	public static boolean aBoolean165;

	@OriginalMember(owner = "client!od", name = "T", descriptor = "Lclient!je;")
	private static Class40 aClass40_1106 = Static69.method1231("Please contact customer support)3");

	@OriginalMember(owner = "client!od", name = "X", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "Lclient!je;")
	private static Class40 aClass40_1107 = Static69.method1231("level)2");

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1108 = aClass40_1106;

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "[I")
	public static int[] anIntArray236 = new int[500];

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1109 = Static69.method1231(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "Lclient!je;")
	private static Class40 aClass40_1110 = Static69.method1231("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1111 = aClass40_1110;

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "Z")
	public static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!od", name = "ob", descriptor = "I")
	public static int anInt2158 = 0;

	@OriginalMember(owner = "client!od", name = "qb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1112 = Static69.method1231("Abbrechen");

	@OriginalMember(owner = "client!od", name = "rb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1113 = Static69.method1231("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!od", name = "tb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1114 = aClass40_1107;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public static void method1488() {
		if (Static52.aClass12_1 != null) {
			@Pc(7) Class12 local7 = Static52.aClass12_1;
			synchronized (Static52.aClass12_1) {
				Static52.aClass12_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
	public static void method1489() {
		aClass40_1106 = null;
		aClass40_1113 = null;
		aClass40_1109 = null;
		aClass40_1108 = null;
		aClass40_1114 = null;
		aClass40_1107 = null;
		aClass40_1111 = null;
		aClass40_1112 = null;
		anIntArray236 = null;
		aClass40_1110 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZLclient!fd;Lclient!fd;Lclient!oe;)V")
	public static void method1490(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class2_Sub1_Sub2_Sub3_Sub1 arg3) {
		Static124.aBoolean237 = arg0;
		Static54.aClass24_14 = arg1;
		Static8.aClass24_4 = arg2;
		Static54.aClass24_14.method1927(10);
		Static17.aClass2_Sub1_Sub2_Sub3_Sub1_1 = arg3;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	public static void method1491() {
		Static57.aClass2_Sub9_Sub1_2.method673(45);
		Static57.aClass2_Sub9_Sub1_2.method647((long) 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
	public static boolean method1492(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)Lclient!ne;")
	public static Class2_Sub1_Sub8 method1493(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub1_Sub8 local6 = (Class2_Sub1_Sub8) Static73.aClass55_52.method1410((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static92.aClass24_26.method1931(arg0, 16);
		local6 = new Class2_Sub1_Sub8();
		if (local29 != null) {
			local6.method1344(new Class2_Sub9(local29));
		}
		Static73.aClass55_52.method1411((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
	public static void method1494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub13 local8 = Static87.method894(arg2, arg0);
		if (local8 != null && local8.anObjectArray15 != null) {
			@Pc(17) Class2_Sub7 local17 = new Class2_Sub7();
			local17.anObjectArray1 = local8.anObjectArray15;
			local17.aClass2_Sub13_4 = local8;
			Static58.method1028(local17);
		}
		Static31.aBoolean53 = true;
		Static32.anInt773 = arg2;
		Static8.anInt206 = arg0;
		Static95.anInt2422 = arg1;
		Static17.method316(local8);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZ)V")
	public static void method1495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class3 local11 = Static81.aClass3ArrayArrayArray1[Static105.anInt2531][arg0][arg1];
		if (local11 == null) {
			Static111.aClass30_1.method765(Static105.anInt2531, arg0, arg1);
			return;
		}
		@Pc(24) Class2_Sub1_Sub1_Sub4 local24 = (Class2_Sub1_Sub1_Sub4) local11.method82();
		@Pc(26) int local26 = -99999999;
		@Pc(28) Class2_Sub1_Sub1_Sub4 local28 = null;
		while (local24 != null) {
			@Pc(34) Class2_Sub1_Sub10 local34 = Static102.method1800(local24.anInt771);
			@Pc(37) int local37 = local34.anInt2257;
			if (local34.anInt2258 == 1) {
				local37 *= local24.anInt767 + 1;
			}
			if (local26 < local37) {
				local26 = local37;
				local28 = local24;
			}
			local24 = (Class2_Sub1_Sub1_Sub4) local11.method74();
		}
		if (local28 == null) {
			Static111.aClass30_1.method765(Static105.anInt2531, arg0, arg1);
			return;
		}
		local11.method84(local28);
		local24 = (Class2_Sub1_Sub1_Sub4) local11.method82();
		@Pc(81) Class2_Sub1_Sub1_Sub4 local81 = null;
		@Pc(89) int local89 = (arg1 << 7) + arg0 + 1610612736;
		@Pc(100) Class2_Sub1_Sub1_Sub4 local100 = null;
		while (local24 != null) {
			if (local24.anInt771 != local28.anInt771) {
				if (local81 == null) {
					local81 = local24;
				}
				if (local81.anInt771 != local24.anInt771 && local100 == null) {
					local100 = local24;
				}
			}
			local24 = (Class2_Sub1_Sub1_Sub4) local11.method74();
		}
		Static111.aClass30_1.method772(Static105.anInt2531, arg0, arg1, Static93.method1730(arg0 * 128 + 64, Static105.anInt2531, arg1 * 128 + 64), local28, local89, local81, local100);
	}
}
