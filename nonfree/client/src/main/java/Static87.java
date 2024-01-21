import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!pb;")
	public static Class31 aClass31_33;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!pb;")
	public static Class31 aClass31_34;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!ud;")
	public static Class59 aClass59_5;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
	public static int anInt2274;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!ka;")
	public static Class1_Sub8 aClass1_Sub8_4 = new Class1_Sub8(8);

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1216 = Static23.method501(")3000");

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1223 = Static23.method501("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1217 = aClass42_1223;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public static int anInt2275 = 0;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1219 = Static23.method501("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1218 = aClass42_1219;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1220 = Static23.method501(":  ");

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1221 = Static23.method501("Ung-Ultiger Benutzername oder Passwort)3");

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1222 = Static23.method501("backright1");

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "[J")
	public static long[] aLongArray5 = new long[200];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)I")
	public static int method1575(@OriginalArg(1) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ja;Lclient!ja;ILclient!ja;)V")
	public static void method1576(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) Class33 arg2) {
		Static17.aClass33_5 = arg2;
		Static101.aClass33_30 = arg0;
		Static83.aClass33_24 = arg1;
		Static61.aClass1_Sub1_Sub12ArrayArray1 = new Class1_Sub1_Sub12[Static101.aClass33_30.method1322()][];
		aBooleanArray16 = new boolean[Static101.aClass33_30.method1322()];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!ja;B)Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 method1577(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		return Static25.method522(arg0, arg1) ? Static70.method1264() : null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1578() {
		for (@Pc(18) Class1_Sub1_Sub8_Sub5 local18 = (Class1_Sub1_Sub8_Sub5) Static43.aClass22_8.method515(); local18 != null; local18 = (Class1_Sub1_Sub8_Sub5) Static43.aClass22_8.method519()) {
			if (Static82.anInt2165 != local18.anInt2376 || local18.anInt2369 < Static27.anInt768) {
				local18.method1825();
			} else if (local18.anInt2375 <= Static27.anInt768) {
				if (local18.anInt2357 > 0) {
					@Pc(50) Class1_Sub1_Sub8_Sub1_Sub1 local50 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local18.anInt2357 - 1];
					if (local50 != null && local50.anInt2576 >= 0 && local50.anInt2576 < 13312 && local50.anInt2583 >= 0 && local50.anInt2583 < 13312) {
						local18.method1648(Static27.anInt768, local50.anInt2583, local50.anInt2576, Static104.method1821(local50.anInt2583, local18.anInt2376, local50.anInt2576) - local18.anInt2378);
					}
				}
				if (local18.anInt2357 < 0) {
					@Pc(102) int local102 = -local18.anInt2357 - 1;
					@Pc(107) Class1_Sub1_Sub8_Sub1_Sub2 local107;
					if (Static75.anInt1420 == local102) {
						local107 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1;
					} else {
						local107 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local102];
					}
					if (local107 != null && local107.anInt2576 >= 0 && local107.anInt2576 < 13312 && local107.anInt2583 >= 0 && local107.anInt2583 < 13312) {
						local18.method1648(Static27.anInt768, local107.anInt2583, local107.anInt2576, Static104.method1821(local107.anInt2583, local18.anInt2376, local107.anInt2576) - local18.anInt2378);
					}
				}
				local18.method1644(Static59.anInt1992);
				Static88.aClass20_1.method456(Static82.anInt2165, (int) local18.aDouble5, (int) local18.aDouble2, (int) local18.aDouble3, 60, local18, local18.anInt2363, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method1579() {
		aClass42_1222 = null;
		aClass42_1219 = null;
		aClass42_1216 = null;
		aClass42_1217 = null;
		aClass42_1223 = null;
		aClass42_1220 = null;
		aLongArray5 = null;
		aClass1_Sub8_4 = null;
		aClass59_5 = null;
		aBooleanArray16 = null;
		aClass42_1218 = null;
		aClass42_1221 = null;
		aClass31_33 = null;
		aClass31_34 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!mc;Lclient!ja;Lclient!mc;I)Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 method1580(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class42 arg2) {
		@Pc(8) int local8 = arg1.method1302(arg0);
		@Pc(14) int local14 = arg1.method1320(arg2, local8);
		return Static58.method1009(local8, local14, arg1);
	}
}
