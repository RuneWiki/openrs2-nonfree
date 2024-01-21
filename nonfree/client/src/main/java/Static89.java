import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	public static int anInt2478;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public static int anInt2479;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public static int anInt2469 = 0;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
	public static int[] anIntArray282 = new int[1000];

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1286 = Static80.method1463("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[I")
	public static int[] anIntArray283 = new int[2000];

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!mb;")
	public static Class49 aClass49_23 = new Class49(64);

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt2473 = 0;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1287 = Static80.method1463("Your account has been disabled)3");

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1288 = aClass63_1287;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "[[[Lclient!a;")
	public static Class1[][][] aClass1ArrayArrayArray1 = new Class1[4][104][104];

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1289 = Static80.method1463("gelb:");

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1291 = Static80.method1463("Invalid username or password)3");

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1290 = aClass63_1291;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
	public static int method1599(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub3_Sub6 local12 = Static68.method1345(arg0);
		@Pc(15) int local15 = local12.anInt1214;
		@Pc(18) int local18 = local12.anInt1212;
		@Pc(21) int local21 = local12.anInt1202;
		@Pc(28) int local28 = Class6_Sub10.anIntArray191[local15 - local21];
		return local28 & anIntArray283[local18] >> local21;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method1600() {
		Static36.aClass49_9.method1389();
		Static36.aClass49_10.method1389();
		Static73.aClass49_20.method1389();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
	public static int method1601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local10 ^ local10 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method1602() {
		Static37.aClass49_11.method1389();
		Static12.aClass49_5.method1389();
		Static70.aClass49_19.method1389();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 method1603() {
		@Pc(9) Class6_Sub3_Sub3_Sub2 local9 = new Class6_Sub3_Sub3_Sub2();
		local9.anInt1889 = Static39.anIntArray143[0];
		local9.anInt1890 = Static12.anInt417;
		@Pc(21) byte[] local21 = Static61.aByteArrayArray6[0];
		local9.anInt1892 = Static59.anIntArray189[0];
		local9.anInt1891 = Static18.anInt566;
		local9.anInt1894 = Static117.anIntArray345[0];
		@Pc(40) int local40 = local9.anInt1892 * local9.anInt1894;
		local9.anIntArray221 = new int[local40];
		local9.anInt1893 = Static22.anIntArray65[0];
		for (@Pc(51) int local51 = 0; local51 < local40; local51++) {
			local9.anIntArray221[local51] = Static61.anIntArray190[local21[local51] & 0xFF];
		}
		Static5.method36();
		return local9;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
	public static void method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static99.anInt2785 = -1;
			Static120.anInt3217 = -1;
			return;
		}
		@Pc(38) int local38 = Static110.method2038(Static101.anInt2810, arg1, arg2) - arg0;
		@Pc(42) int local42 = arg1 - Static4.anInt45;
		@Pc(46) int local46 = arg2 - Static41.anInt1273;
		@Pc(50) int local50 = Class6_Sub3_Sub3_Sub4.anIntArray343[Static35.anInt1172];
		@Pc(54) int local54 = Class6_Sub3_Sub3_Sub4.anIntArray343[Static94.anInt2627];
		@Pc(58) int local58 = local38 - Static34.anInt1163;
		@Pc(62) int local62 = Class6_Sub3_Sub3_Sub4.anIntArray342[Static94.anInt2627];
		@Pc(66) int local66 = Class6_Sub3_Sub3_Sub4.anIntArray342[Static35.anInt1172];
		@Pc(77) int local77 = local42 * local54 + local46 * local62 >> 16;
		@Pc(88) int local88 = local42 * local62 - local54 * local46 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(101) int local101 = local58 * local66 - local50 * local88 >> 16;
		@Pc(111) int local111 = local58 * local50 + local88 * local66 >> 16;
		if (local111 < 50) {
			Static120.anInt3217 = -1;
			Static99.anInt2785 = -1;
		} else {
			Static120.anInt3217 = (local101 << 9) / local111 + 167;
			Static99.anInt2785 = (local90 << 9) / local111 + 256;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		if (Static61.aBoolean98 && Static101.anInt2810 != arg1) {
			return;
		}
		@Pc(39) int local39 = 0;
		if (arg0 == 0) {
			local39 = Static76.aClass19_1.method689(arg1, arg2, arg6);
		}
		if (arg0 == 1) {
			local39 = Static76.aClass19_1.method679(arg1, arg2, arg6);
		}
		if (arg0 == 2) {
			local39 = Static76.aClass19_1.method690(arg1, arg2, arg6);
		}
		if (arg0 == 3) {
			local39 = Static76.aClass19_1.method694(arg1, arg2, arg6);
		}
		@Pc(87) int local87;
		if (local39 != 0) {
			local87 = Static76.aClass19_1.method697(arg1, arg2, arg6, local39);
			@Pc(93) int local93 = local39 >> 14 & 0x7FFF;
			@Pc(97) int local97 = local87 & 0x1F;
			@Pc(103) int local103 = local87 >> 6 & 0x3;
			@Pc(117) Class6_Sub3_Sub10 local117;
			if (arg0 == 0) {
				Static76.aClass19_1.method662(arg1, arg2, arg6);
				local117 = Static123.method2172(local93);
				if (local117.aBoolean83) {
					Static15.aClass30Array1[arg1].method990(arg6, arg2, local117.aBoolean88, local103, local97);
				}
			}
			if (arg0 == 1) {
				Static76.aClass19_1.method663(arg1, arg2, arg6);
			}
			if (arg0 == 2) {
				Static76.aClass19_1.method691(arg1, arg2, arg6);
				local117 = Static123.method2172(local93);
				if (local117.anInt1672 + arg2 > 103 || arg6 + local117.anInt1672 > 103 || arg2 + local117.anInt1683 > 103 || local117.anInt1683 + arg6 > 103) {
					return;
				}
				if (local117.aBoolean83) {
					Static15.aClass30Array1[arg1].method992(local117.anInt1672, arg2, arg6, local117.aBoolean88, local103, local117.anInt1683);
				}
			}
			if (arg0 == 3) {
				Static76.aClass19_1.method678(arg1, arg2, arg6);
				local117 = Static123.method2172(local93);
				if (local117.aBoolean83 && local117.anInt1682 == 1) {
					Static15.aClass30Array1[arg1].method994(arg6, arg2);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		local87 = arg1;
		if (arg1 < 3 && (Static103.aByteArrayArrayArray92[1][arg2][arg6] & 0x2) == 2) {
			local87 = arg1 + 1;
		}
		Static50.method1042(Static76.aClass19_1, Static15.aClass30Array1[arg1], arg3, local87, arg2, arg1, arg4, arg6, arg5);
		return;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method1606() {
		aClass63_1290 = null;
		anIntArray282 = null;
		aClass63_1288 = null;
		aClass49_23 = null;
		aClass63_1289 = null;
		aClass1ArrayArrayArray1 = null;
		aClass63_1291 = null;
		anIntArrayArrayArray9 = null;
		aClass63_1286 = null;
		aClass63_1287 = null;
		anIntArray283 = null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)J")
	public static synchronized long method1607() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static2.aLong1) {
			Static52.aLong41 += Static2.aLong1 - local10;
		}
		Static2.aLong1 = local10;
		return local10 + Static52.aLong41;
	}
}
