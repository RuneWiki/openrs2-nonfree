import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_89;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "[Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!sd;")
	public static Class2 aClass2_18;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!ua;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1090 = Static56.method972("scroll:");

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5 = new byte[4][104][104];

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1091 = Static56.method972("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1092 = Static56.method972("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1093 = Static56.method972("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	public static int anInt2371 = 0;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1094 = aClass5_1090;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1556() {
		aClass25_1 = null;
		aClass5_1090 = null;
		aByteArrayArrayArray5 = null;
		anIntArray270 = null;
		aClass5_1091 = null;
		aClass3_Sub1_Sub2_Sub4_12 = null;
		aClass11_Sub1_89 = null;
		aClass3_Sub1_Sub2_Sub4Array5 = null;
		aClass5_1094 = null;
		aClass5_1092 = null;
		aClass2_18 = null;
		aClass5_1093 = null;
		aClass3_Sub1_Sub2_Sub4Array6 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1557() {
		Static95.aClass3_Sub6_Sub1_3.method1645(70);
		if (Static106.anInt2736 != -1) {
			Static67.method1174(Static106.anInt2736);
			Static106.anInt2736 = -1;
			Static100.aBoolean123 = true;
			Static116.aBoolean157 = true;
			Static85.anInt2100 = -1;
		}
		if (Static88.anInt2255 != -1) {
			Static67.method1174(Static88.anInt2255);
			Static88.anInt2255 = -1;
			Static15.aBoolean22 = true;
			Static85.anInt2100 = -1;
		}
		if (Static63.anInt2924 != -1) {
			Static67.method1174(Static63.anInt2924);
			Static63.anInt2924 = -1;
			Static116.method1971(30);
		}
		if (Static27.anInt824 != -1) {
			Static67.method1174(Static27.anInt824);
			Static27.anInt824 = -1;
		}
		if (Static89.anInt2288 != -1) {
			Static67.method1174(Static89.anInt2288);
			Static85.anInt2100 = -1;
			Static89.anInt2288 = -1;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method1558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 < 1 || arg3 < 1 || arg6 > 102 || arg3 > 102) {
			return;
		}
		if (Static74.aBoolean91 && arg1 != Static12.anInt480) {
			return;
		}
		@Pc(38) int local38 = 0;
		if (arg0 == 0) {
			local38 = Static73.aClass42_1.method1035(arg1, arg6, arg3);
		}
		if (arg0 == 1) {
			local38 = Static73.aClass42_1.method1019(arg1, arg6, arg3);
		}
		if (arg0 == 2) {
			local38 = Static73.aClass42_1.method1040(arg1, arg6, arg3);
		}
		if (arg0 == 3) {
			local38 = Static73.aClass42_1.method1060(arg1, arg6, arg3);
		}
		@Pc(97) int local97;
		if (local38 != 0) {
			@Pc(90) int local90 = local38 >> 14 & 0x7FFF;
			local97 = Static73.aClass42_1.method1015(arg1, arg6, arg3, local38);
			@Pc(101) int local101 = local97 & 0x1F;
			@Pc(107) int local107 = local97 >> 6 & 0x3;
			@Pc(121) Class3_Sub1_Sub15 local121;
			if (arg0 == 0) {
				Static73.aClass42_1.method1036(arg1, arg6, arg3);
				local121 = Static72.method1211(local90);
				if (local121.aBoolean112) {
					Static80.aClass30Array1[arg1].method702(local107, arg6, arg3, local101, local121.aBoolean114);
				}
			}
			if (arg0 == 1) {
				Static73.aClass42_1.method1022(arg1, arg6, arg3);
			}
			if (arg0 == 2) {
				Static73.aClass42_1.method1054(arg1, arg6, arg3);
				local121 = Static72.method1211(local90);
				if (arg6 + local121.anInt2312 > 103 || arg3 + local121.anInt2312 > 103 || arg6 + local121.anInt2331 > 103 || arg3 + local121.anInt2331 > 103) {
					return;
				}
				if (local121.aBoolean112) {
					Static80.aClass30Array1[arg1].method698(local107, local121.anInt2331, arg3, arg6, local121.aBoolean114, local121.anInt2312);
				}
			}
			if (arg0 == 3) {
				Static73.aClass42_1.method1020(arg1, arg6, arg3);
				local121 = Static72.method1211(local90);
				if (local121.aBoolean112 && local121.anInt2324 == 1) {
					Static80.aClass30Array1[arg1].method703(arg6, arg3);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		local97 = arg1;
		if (arg1 < 3 && (aByteArrayArrayArray5[1][arg6][arg3] & 0x2) == 2) {
			local97 = arg1 + 1;
		}
		Static80.method1295(Static80.aClass30Array1[arg1], arg6, arg2, arg1, local97, arg4, arg5, Static73.aClass42_1, arg3);
		return;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)Lclient!od;")
	public static Class3_Sub1_Sub12 method1559(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub12 local10 = (Class3_Sub1_Sub12) Static115.aClass9_27.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static12.method321(arg0, Static87.aClass11_53, Static60.aClass11_72);
		if (local10 != null) {
			Static115.aClass9_27.method284(local10, (long) arg0);
		}
		return local10;
	}
}
