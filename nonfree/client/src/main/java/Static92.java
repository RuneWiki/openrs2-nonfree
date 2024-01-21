import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Lclient!kb;")
	public static Class9 aClass9_48;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Lclient!i;")
	public static Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!v;")
	private static Class62 aClass62_1101 = Static45.method753(" seconds)3");

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!v;")
	public static Class62 aClass62_1100 = aClass62_1101;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "[I")
	public static int[] anIntArray269 = new int[1000];

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!jb;")
	public static Class34 aClass34_30 = new Class34(260);

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	public static int anInt2448 = -1;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
	public static int[] anIntArray271 = new int[2000];

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public static int anInt2449 = -1;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
	public static int anInt2450 = 0;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_1102 = Static45.method753("backvmid1");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!v;Lclient!v;ZIILclient!mb;II)V")
	public static synchronized void method1545(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class42 arg3) {
		if (Static45.method754()) {
			@Pc(12) int local12 = arg3.method1521(arg0);
			@Pc(25) int local25 = arg3.method1498(arg1, local12);
			method1550(local25, arg3, arg2, local12);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static synchronized void method1546() {
		if (!Static45.method754()) {
			return;
		}
		if (Static79.aBoolean124) {
			@Pc(18) byte[] local18 = Static83.method349(Static99.anInt2601, Static51.aClass42_63, Static80.anInt2156, Static41.anInt1198);
			if (local18 != null) {
				if (Static17.anInt2851 >= 0) {
					Static61.method1028(Static81.aBoolean130, Static17.anInt2851, local18, Static7.anInt214);
				} else if (Static6.anInt207 < 0) {
					Static51.method1436(Static7.anInt214, Static81.aBoolean130, local18);
				} else {
					Static79.method1279(Static7.anInt214, Static6.anInt207, Static81.aBoolean130, local18);
				}
				Static79.aBoolean124 = false;
				Static51.aClass42_63 = null;
			}
		}
		Static9.method1156();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Lclient!db;")
	public static Class3_Sub1_Sub4 method1547(@OriginalArg(0) int arg0) {
		@Pc(22) Class3_Sub1_Sub4 local22 = (Class3_Sub1_Sub4) Static39.aClass34_14.method764((long) arg0);
		if (local22 != null) {
			return local22;
		}
		@Pc(32) byte[] local32 = Static96.aClass42_69.method1504(9, arg0);
		local22 = new Class3_Sub1_Sub4();
		local22.anInt660 = arg0;
		if (local32 != null) {
			local22.method439(new Class3_Sub8(local32));
		}
		local22.method437();
		Static39.aClass34_14.method765((long) arg0, local22);
		return local22;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1548() {
		aClass34_30.method762();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public static void method1549() {
		aClass62_1101 = null;
		aClass3_Sub4_1 = null;
		aClass34_30 = null;
		aBooleanArray11 = null;
		anIntArray270 = null;
		anIntArray271 = null;
		aClass9_48 = null;
		aClass62_1102 = null;
		aClass62_1100 = null;
		anIntArray269 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILclient!mb;IZII)V")
	public static synchronized void method1550(@OriginalArg(1) int arg0, @OriginalArg(3) Class42 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (!Static45.method754()) {
			return;
		}
		Static41.anInt1198 = 0;
		Static51.aClass42_63 = arg1;
		Static17.anInt2851 = 10;
		Static81.aBoolean130 = false;
		Static80.anInt2156 = arg0;
		Static7.anInt214 = arg2;
		Static99.anInt2601 = arg3;
		Static6.anInt207 = -1;
		Static79.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static synchronized void method1551() {
		if (Static45.method754()) {
			Static76.method1247();
			Static79.aBoolean124 = false;
			Static51.aClass42_63 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!mb;IIZI)V")
	public static synchronized void method1552(@OriginalArg(0) int arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static45.method754()) {
			return;
		}
		Static41.anInt1198 = arg0;
		Static7.anInt214 = arg3;
		Static6.anInt207 = -1;
		Static80.anInt2156 = 0;
		Static79.aBoolean124 = true;
		Static81.aBoolean130 = false;
		Static99.anInt2601 = arg2;
		Static17.anInt2851 = -1;
		Static51.aClass42_63 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)V")
	public static void method1553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class24 local7 = Static40.aClass24ArrayArrayArray1[Static27.anInt818][arg1][arg0];
		if (local7 == null) {
			Static76.aClass1_1.method25(Static27.anInt818, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(26) Class3_Sub1_Sub3_Sub5 local26 = (Class3_Sub1_Sub3_Sub5) local7.method534();
		@Pc(28) Class3_Sub1_Sub3_Sub5 local28 = null;
		while (local26 != null) {
			@Pc(34) Class3_Sub1_Sub2 local34 = Static4.method160(local26.anInt2268);
			@Pc(37) int local37 = local34.anInt296;
			if (local34.aBoolean12) {
				local37 *= local26.anInt2274 + 1;
			}
			if (local21 < local37) {
				local28 = local26;
				local21 = local37;
			}
			local26 = (Class3_Sub1_Sub3_Sub5) local7.method525();
		}
		@Pc(63) Class3_Sub1_Sub3_Sub5 local63 = null;
		@Pc(65) Class3_Sub1_Sub3_Sub5 local65 = null;
		local7.method524(local28);
		for (local26 = (Class3_Sub1_Sub3_Sub5) local7.method534(); local26 != null; local26 = (Class3_Sub1_Sub3_Sub5) local7.method525()) {
			if (local28.anInt2268 != local26.anInt2268 && local63 == null) {
				local63 = local26;
			}
			if (local26.anInt2268 != local28.anInt2268 && local26.anInt2268 != local63.anInt2268 && local65 == null) {
				local65 = local26;
			}
		}
		@Pc(125) int local125 = (arg0 << 7) + (arg1 + 1610612736);
		Static76.aClass1_1.method20(Static27.anInt818, arg1, arg0, Static91.method1541(arg1 * 128 + 64, arg0 * 128 + 64, Static27.anInt818), local28, local125, local63, local65);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
	public static synchronized void method1554() {
		Static86.method1409();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public static synchronized void method1555() {
		if (Static45.method754()) {
			Static40.method692();
			Static79.aBoolean124 = false;
			Static51.aClass42_63 = null;
		}
	}
}
