import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!p;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public static int anInt2272;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array13;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	public static int anInt2273;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "Lclient!fe;")
	public static Class1 aClass1_2;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_1089 = Static109.method1737("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_1091 = Static109.method1737("flash1:");

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!na;")
	public static Class53 aClass53_1090 = aClass53_1091;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_1092 = aClass53_1091;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!na;")
	private static Class53 aClass53_1095 = Static109.method1737("Connecting to friendserver");

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_1093 = aClass53_1095;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	public static int anInt2271 = 1;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "[[[Lclient!c;")
	public static Class11[][][] aClass11ArrayArrayArray1 = new Class11[4][104][104];

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!na;")
	private static Class53 aClass53_1094 = Static109.method1737("Cancel");

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Lclient!te;")
	public static Class75 aClass75_62 = new Class75(100);

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_1096 = aClass53_1094;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	public static int anInt2276 = 0;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	public static volatile int anInt2277 = 0;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "Lclient!na;")
	public static Class53 aClass53_1097 = Static109.method1737("Benutzername: ");

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_1098 = Static109.method1737("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "Lclient!na;")
	private static Class53 aClass53_1099 = Static109.method1737("Prepared sound engine");

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "Lclient!na;")
	public static Class53 aClass53_1100 = aClass53_1099;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method1567() {
		@Pc(7) Class53 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static36.anInt1122; local9++) {
			if (Static99.aClass53Array17[local9].method1281(Static8.aClass53_93) != -1) {
				local7 = Static99.aClass53Array17[local9].method1289(Static99.aClass53Array17[local9].method1281(Static8.aClass53_93));
				break;
			}
		}
		if (local7 == null) {
			Static45.method889();
			return;
		}
		@Pc(47) int local47 = Static37.anInt2216;
		@Pc(49) int local49 = Static87.anInt2096;
		@Pc(51) int local51 = Static116.anInt2638;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = Static19.anInt2422;
		if (local57 > 190) {
			local57 = 190;
		}
		Static84.method1316(local47, local51, local57, local49, 6116423);
		Static84.method1316(local47 + 1, local51 + 1, local57 - 2, 16, 0);
		Static84.method1324(local47 + 1, local51 + 18, local57 - 2, local49 + -19, 0);
		Static43.aClass3_Sub1_Sub5_Sub2_1.method749(local7, local47 + 3, local51 + 14, 6116423, false);
		@Pc(111) int local111 = Static99.anInt2348;
		@Pc(113) int local113 = Static105.anInt2433;
		if (Static35.anInt1112 == 0) {
			local113 -= 4;
			local111 -= 4;
		}
		if (Static35.anInt1112 == 1) {
			local113 -= 205;
			local111 -= 553;
		}
		if (Static35.anInt1112 == 2) {
			local113 -= 357;
			local111 -= 17;
		}
		for (@Pc(129) int local129 = 0; local129 < Static36.anInt1122; local129++) {
			@Pc(133) int local133 = 16777215;
			@Pc(146) int local146 = (Static36.anInt1122 - local129 - 1) * 15 + local51 + 31;
			if (local47 < local111 && local47 + local57 > local111 && local113 > local146 - 13 && local146 + 3 > local113) {
				local133 = 16776960;
			}
			@Pc(178) Class53 local178 = Static99.aClass53Array17[local129];
			if (local178.method1290(local7)) {
				local178 = local178.method1267(local178.method1294() - local7.method1294(), 0);
				if (local178.method1290(Static76.aClass53_854)) {
					local178 = local178.method1267(local178.method1294() - Static76.aClass53_854.method1294(), 0);
				}
			}
			Static43.aClass3_Sub1_Sub5_Sub2_1.method749(local178, local47 + 3, local146, local133, true);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZI)I")
	public static int method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static37.aByteArrayArrayArray17[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static37.aByteArrayArrayArray17[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
	public static int method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (local15 + arg0) / arg1 - local15;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI)I")
	public static int method1570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		return Static126.aClass3_Sub1_Sub12_2 != null && Static126.aClass3_Sub1_Sub12_2.aLong94 == local11 ? Static19.aClass3_Sub7_7.anInt964 * 99 / (Static19.aClass3_Sub7_7.aByteArray15.length - Static126.aClass3_Sub1_Sub12_2.aByte3) + 1 : 0;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public static void method1571() {
		Static53.aClass75_59.method1724();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1572() {
		aClass53_1097 = null;
		aClass53_1090 = null;
		aClass53_1098 = null;
		aClass53_1089 = null;
		aClass3_Sub1_Sub5_Sub4Array13 = null;
		aClass57_1 = null;
		aClass11ArrayArrayArray1 = null;
		aClass53_1096 = null;
		aClass53_1094 = null;
		aClass53_1091 = null;
		aClass53_1099 = null;
		aClass75_62 = null;
		aClass53_1095 = null;
		aClass53_1093 = null;
		aClass1_2 = null;
		aClass53_1100 = null;
		aClass53_1092 = null;
	}
}
