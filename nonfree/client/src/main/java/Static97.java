import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
	public static int anInt2318;

	@OriginalMember(owner = "client!rd", name = "gb", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!rd", name = "qb", descriptor = "I")
	public static int anInt2326;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1133 = Static38.method736("Loading game screen )2 ");

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1134 = Static38.method736("Loading )2 please wait)3");

	@OriginalMember(owner = "client!rd", name = "pb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1146 = Static38.method736(" is already on your friend list");

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1135 = aClass71_1146;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1136 = Static38.method736("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1139 = Static38.method736("Your account is already logged in)3");

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1137 = aClass71_1139;

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1138 = aClass71_1133;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
	public static int anInt2317 = 0;

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1140 = Static38.method736("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1141 = Static38.method736("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
	public static int anInt2320 = 0;

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "Z")
	public static boolean aBoolean101 = true;

	@OriginalMember(owner = "client!rd", name = "fb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1142 = Static38.method736("Add friend");

	@OriginalMember(owner = "client!rd", name = "hb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1143 = Static38.method736("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!rd", name = "ib", descriptor = "I")
	public static int anInt2322 = -1;

	@OriginalMember(owner = "client!rd", name = "kb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1144 = Static38.method736("(U");

	@OriginalMember(owner = "client!rd", name = "mb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1145 = aClass71_1142;

	@OriginalMember(owner = "client!rd", name = "rb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1147 = Static38.method736("Loaded gamescreen");

	@OriginalMember(owner = "client!rd", name = "sb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1148 = aClass71_1147;

	@OriginalMember(owner = "client!rd", name = "ub", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1149 = aClass71_1134;

	@OriginalMember(owner = "client!rd", name = "wb", descriptor = "Z")
	public static boolean aBoolean102 = true;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)V")
	public static void method1605(@OriginalArg(1) int arg0) {
		if (!Static111.method709()) {
			return;
		}
		if (Static87.aBoolean98) {
			Static64.anInt2486 = arg0;
		} else {
			Static73.method1216(arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lclient!td;")
	public static Class5_Sub1_Sub15 method1606(@OriginalArg(1) int arg0) {
		@Pc(6) Class5_Sub1_Sub15 local6 = (Class5_Sub1_Sub15) Static71.aClass54_27.method1397((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static88.aClass24_17.method679(6, arg0);
		local6 = new Class5_Sub1_Sub15();
		local6.anInt2568 = arg0;
		if (local22 != null) {
			local6.method1705(new Class5_Sub11(local22));
		}
		local6.method1713();
		if (local6.aBoolean115) {
			local6.aBoolean109 = false;
			local6.aBoolean111 = false;
		}
		Static71.aClass54_27.method1399(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
	public static void method1607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static25.aClass5_Sub1_Sub10_Sub1Array5[0].method921(arg1, arg4);
		@Pc(17) int local17 = (arg0 - 32) * arg0 / arg3;
		Static25.aClass5_Sub1_Sub10_Sub1Array5[1].method921(arg1, arg0 + arg4 - 16);
		Static52.method2024(arg1, arg4 + 16, 16, arg0 - 32, Static49.anInt1380);
		if (local17 < 8) {
			local17 = 8;
		}
		@Pc(60) int local60 = (arg0 - local17 - 32) * arg2 / (arg3 - arg0);
		Static52.method2024(arg1, arg4 + local60 + 16, 16, local17, Static49.anInt1396);
		Static52.method2022(arg1, local60 + arg4 + 16, local17, Static71.anInt1726);
		Static52.method2022(arg1 + 1, arg4 - -local60 + 16, local17, Static71.anInt1726);
		Static52.method2023(arg1, local60 + arg4 + 16, 16, Static71.anInt1726);
		Static52.method2023(arg1, arg4 + local60 + 17, 16, Static71.anInt1726);
		Static52.method2022(arg1 + 15, local60 + 16 + arg4, local17, Static2.anInt1865);
		Static52.method2022(arg1 + 14, arg4 - -local60 + 17, local17 - 1, Static2.anInt1865);
		Static52.method2023(arg1, local17 + local60 + arg4 + 15, 16, Static2.anInt1865);
		Static52.method2023(arg1 + 1, arg4 + 14 - -local60 - -local17, 15, Static2.anInt1865);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!nb;I)Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 method1608(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) int arg2) {
		return Static6.method156(arg1, arg2, arg0) ? Static68.method1141() : null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!nb;Lclient!nb;ILclient!nb;)V")
	public static void method1609(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(3) Class24 arg2) {
		Static91.aClass24_19 = arg0;
		Static27.aClass24_7 = arg1;
		Static88.aClass24_18 = arg2;
		Static30.aClass5_Sub1_Sub11ArrayArray1 = new Class5_Sub1_Sub11[Static91.aClass24_19.method671()][];
		Static85.aBooleanArray14 = new boolean[Static91.aClass24_19.method671()];
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	public static void method1610() {
		aClass71_1141 = null;
		aClass71_1134 = null;
		anIntArray256 = null;
		aClass71_1147 = null;
		aClass71_1144 = null;
		aClass71_1149 = null;
		aClass71_1145 = null;
		aClass71_1136 = null;
		aClass71_1142 = null;
		aClass71_1133 = null;
		aClass71_1137 = null;
		aClass71_1140 = null;
		aClass71_1139 = null;
		aClass71_1146 = null;
		aClass71_1148 = null;
		aClass71_1138 = null;
		aClass71_1143 = null;
		aClass71_1135 = null;
	}
}
