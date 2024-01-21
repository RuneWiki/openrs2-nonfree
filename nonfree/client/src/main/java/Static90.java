import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1040 = Static34.method846("Connection timed out)3");

	@OriginalMember(owner = "client!sa", name = "bb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1041 = Static34.method846("wishes to trade with you)3");

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1042 = aClass55_1040;

	@OriginalMember(owner = "client!sa", name = "sb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1045 = Static34.method846("Please use a different world)3");

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1043 = aClass55_1045;

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1044 = Static34.method846("backvmid2");

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "Lclient!ab;")
	public static Class3 aClass3_6 = new Class3();

	@OriginalMember(owner = "client!sa", name = "vb", descriptor = "[I")
	public static int[] anIntArray243 = new int[25];

	@OriginalMember(owner = "client!sa", name = "yb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1046 = aClass55_1041;

	@OriginalMember(owner = "client!sa", name = "Bb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1048 = Static34.method846("Bad session id)3");

	@OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1047 = aClass55_1048;

	@OriginalMember(owner = "client!sa", name = "Cb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1049 = Static34.method846("Menge eingeben:");

	@OriginalMember(owner = "client!sa", name = "Db", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1050 = Static34.method846("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!sa", name = "Eb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1051 = Static34.method846(" )2> @yel@");

	@OriginalMember(owner = "client!sa", name = "Fb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1052 = Static34.method846("b12_full");

	@OriginalMember(owner = "client!sa", name = "Gb", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!sa", name = "Hb", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!sa", name = "Ib", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1053 = aClass55_1050;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
	public static void method1716() {
		aClass55_1048 = null;
		aClass55_1045 = null;
		aClass55_1050 = null;
		aClass55_1049 = null;
		aClass55_1044 = null;
		aClass55_1053 = null;
		anIntArray243 = null;
		aClass55_1043 = null;
		aClass55_1041 = null;
		aClass55_1052 = null;
		aClass55_1046 = null;
		aClass55_1047 = null;
		aClass55_1042 = null;
		aClass3_6 = null;
		aClass55_1051 = null;
		aClass55_1040 = null;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method1718() {
		@Pc(7) Class55 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static94.anInt2645; local9++) {
			if (Static76.aClass55Array20[local9].method1645(Static112.aClass55_1353) != -1) {
				local7 = Static76.aClass55Array20[local9].method1673(Static76.aClass55Array20[local9].method1645(Static112.aClass55_1353));
				break;
			}
		}
		if (local7 == null) {
			Static109.method2036();
			return;
		}
		@Pc(43) int local43 = Static39.anInt1694;
		@Pc(45) int local45 = Static7.anInt281;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(54) int local54 = Static57.anInt1734;
		@Pc(56) int local56 = Static96.anInt2823;
		if (local56 > 190) {
			local56 = 190;
		}
		Static53.method1276(local43, local45, local56, local54, 6116423);
		Static53.method1276(local43 + 1, local45 + 1, local56 - 2, 16, 0);
		Static53.method1284(local43 + 1, local45 + 18, local56 - 2, local54 + -19, 0);
		Static81.aClass6_Sub2_Sub2_Sub4_4.method1297(local7, local43 + 3, local45 + 14, 6116423, false);
		@Pc(112) int local112 = Static58.anInt1741;
		@Pc(114) int local114 = Static27.anInt1358;
		if (Static1.anInt6 == 0) {
			local112 -= 4;
			local114 -= 4;
		}
		if (Static1.anInt6 == 1) {
			local112 -= 553;
			local114 -= 205;
		}
		if (Static1.anInt6 == 2) {
			local112 -= 17;
			local114 -= 357;
		}
		for (@Pc(133) int local133 = 0; local133 < Static94.anInt2645; local133++) {
			@Pc(149) int local149 = local45 + (-local133 + Static94.anInt2645 + -1) * 15 + 31;
			@Pc(151) int local151 = 16777215;
			@Pc(155) Class55 local155 = Static76.aClass55Array20[local133];
			if (local155.method1666(local7)) {
				local155 = local155.method1671(0, local155.method1674() - local7.method1674());
				if (local155.method1666(Static52.aClass55_637)) {
					local155 = local155.method1671(0, local155.method1674() - Static52.aClass55_637.method1674());
				}
			}
			if (local112 > local43 && local56 + local43 > local112 && local149 - 13 < local114 && local149 + 3 > local114) {
				local151 = 16776960;
			}
			Static81.aClass6_Sub2_Sub2_Sub4_4.method1297(local155, local43 + 3, local149, local151, true);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lclient!ka;")
	public static Class6_Sub2_Sub7 method1721(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2_Sub7 local10 = (Class6_Sub2_Sub7) Static29.aClass36_13.method1154((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static111.method2041(arg0, Static27.aClass40_20, Static107.aClass40_38);
		if (local10 != null) {
			Static29.aClass36_13.method1161((long) arg0, local10);
		}
		return local10;
	}
}
