import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!qb", name = "fb", descriptor = "[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] aClass1_Sub1_Sub5_Sub2Array7;

	@OriginalMember(owner = "client!qb", name = "mb", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1254 = Static69.method1153("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1255 = Static69.method1153("gr-Un:");

	@OriginalMember(owner = "client!qb", name = "kb", descriptor = "Z")
	public static final boolean aBoolean122 = false;

	@OriginalMember(owner = "client!qb", name = "lb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1256 = Static69.method1153("Neuer Benutzer");

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1257 = Static69.method1153(":: (X");

	@OriginalMember(owner = "client!qb", name = "pb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1258 = Static69.method1153("Null");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIII)I")
	public static int method1413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static18.aByteArrayArrayArray2[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static18.aByteArrayArrayArray2[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lclient!wa;")
	public static Class1_Sub1_Sub17 method1414(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub1_Sub17 local19 = (Class1_Sub1_Sub17) Static52.aClass19_110.method410((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(29) byte[] local29 = Static61.aClass41_35.method1062(3, arg0);
		local19 = new Class1_Sub1_Sub17();
		if (local29 != null) {
			local19.method2069(new Class1_Sub6(local29));
		}
		Static52.aClass19_110.method409(local19, (long) arg0);
		return local19;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)I")
	public static int method1415(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!rd;Lclient!rd;Lclient!pb;I)[Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3[] method1416(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) Class41 arg2) {
		@Pc(8) int local8 = arg2.method1066(arg1);
		@Pc(14) int local14 = arg2.method1050(arg0, local8);
		return Static121.method2101(local8, arg2, local14);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBLclient!f;)V")
	public static void method1417(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub1 arg1) {
		if (arg1.anInt2375 < 128 || arg1.anInt2412 < 128 || arg1.anInt2375 >= 13184 || arg1.anInt2412 >= 13184) {
			arg1.anInt2403 = 0;
			arg1.anInt2375 = arg1.anIntArray354[0] * 128 + arg1.anInt2395 * 64;
			arg1.anInt2382 = -1;
			arg1.anInt2412 = arg1.anInt2395 * 64 + arg1.anIntArray355[0] * 128;
			arg1.anInt2370 = 0;
			arg1.anInt2407 = -1;
			arg1.method1692();
		}
		if (arg1 == Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1 && (arg1.anInt2375 < 1536 || arg1.anInt2412 < 1536 || arg1.anInt2375 >= 11776 || arg1.anInt2412 >= 11776)) {
			arg1.anInt2375 = arg1.anInt2395 * 64 + arg1.anIntArray354[0] * 128;
			arg1.anInt2407 = -1;
			arg1.anInt2370 = 0;
			arg1.anInt2382 = -1;
			arg1.anInt2403 = 0;
			arg1.anInt2412 = arg1.anIntArray355[0] * 128 + arg1.anInt2395 * 64;
			arg1.method1692();
		}
		if (Static15.anInt471 < arg1.anInt2403) {
			Static19.method388(arg1);
		} else if (Static15.anInt471 > arg1.anInt2370) {
			Static106.method1741(arg1);
		} else {
			Static82.method1375(arg1);
		}
		Static62.method1087(arg1);
		Static18.method356(arg1);
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	public static void method1418() {
		aClass1_Sub1_Sub5_Sub2Array7 = null;
		aClass64_1256 = null;
		aClass64_1258 = null;
		aClass64_1255 = null;
		aClass64_1257 = null;
		aClass64_1254 = null;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	public static void method1419() {
		Static70.anInt1581 = 0;
		Static39.anInt914 = 0;
		Static3.method130();
		Static93.method1494();
		Static67.method1131();
		Static116.method2038();
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < Static70.anInt1581; local19++) {
			local27 = Static83.anIntArray286[local19];
			if (Static15.anInt471 != Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local27].anInt2377) {
				Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local27] = null;
			}
		}
		if (Static64.aClass1_Sub6_Sub1_2.anInt2574 != Static62.anInt1454) {
			throw new RuntimeException("gpp1 pos:" + Static64.aClass1_Sub6_Sub1_2.anInt2574 + " psize:" + Static62.anInt1454);
		}
		for (local27 = 0; local27 < Static6.anInt319; local27++) {
			if (Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static90.anIntArray69[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static6.anInt319);
			}
		}
	}
}
