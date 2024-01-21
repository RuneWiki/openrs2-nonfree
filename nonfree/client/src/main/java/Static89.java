import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lclient!ra;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
	public static int anInt1872 = 0;

	@OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_740 = Static120.method1824("flash3:");

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_739 = aClass80_740;

	@OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
	public static int anInt1875 = -1;

	@OriginalMember(owner = "client!ka", name = "lb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_741 = Static120.method1824("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_742 = Static120.method1824("cookiehost");

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_743 = aClass80_740;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!qc;Lclient!qc;)V")
	public static void method1310(@OriginalArg(1) Class3_Sub1_Sub4_Sub3_Sub1 arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub3_Sub1 arg1) {
		if (Static21.aBoolean29) {
			Static134.method2363(arg1, arg0);
			return;
		}
		if (Static21.anInt516 == 0 || Static21.anInt516 == 5) {
			arg1.method2273(Static175.aClass80_1522, 382, 225, 16777215, -1);
			Static24.method2564(230, 233, 304, 34, 9179409);
			Static24.method2564(231, 234, 302, 32, 0);
			Static24.method2576(232, 235, Static78.anInt1720 * 3, 30, 9179409);
			Static24.method2576(Static78.anInt1720 * 3 + 232, 235, 300 - Static78.anInt1720 * 3, 30, 0);
			arg1.method2273(Static78.aClass80_672, 382, 256, 16777215, -1);
		}
		@Pc(109) short local109;
		@Pc(117) int local117;
		if (Static21.anInt516 == 20) {
			Static51.aClass3_Sub1_Sub4_Sub1_1.method567(382 - Static51.aClass3_Sub1_Sub4_Sub1_1.anInt819 / 2, 271 - Static51.aClass3_Sub1_Sub4_Sub1_1.anInt818 / 2);
			local109 = 211;
			arg1.method2273(Static78.aClass80_669, 382, 211, 16776960, 0);
			local117 = local109 + 15;
			arg1.method2273(Static78.aClass80_668, 382, 226, 16776960, 0);
			@Pc(125) int local125 = local117 + 15;
			arg1.method2273(Static78.aClass80_670, 382, 241, 16776960, 0);
			@Pc(133) int local133 = local125 + 15;
			@Pc(134) int local134 = local133 + 10;
			arg1.method2264(Static154.method2467(new Class80[] { Static88.aClass80_718, Static76.method2250(Static78.aClass80_666) }), 272, 266, 16777215, 0);
			@Pc(154) int local154 = local134 + 15;
			arg1.method2264(Static154.method2467(new Class80[] { Static130.aClass80_1113, Static78.aClass80_671.method2450() }), 274, 281, 16777215, 0);
			@Pc(175) int local175 = local154 + 15;
		}
		if (Static21.anInt516 == 10) {
			Static51.aClass3_Sub1_Sub4_Sub1_1.method567(202, 171);
			if (Static163.anInt3649 == 0) {
				local109 = 251;
				arg1.method2273(Static64.aClass80_541, 382, 251, 16776960, 0);
				Static87.aClass3_Sub1_Sub4_Sub1_3.method567(229, 271);
				local117 = local109 + 30;
				arg1.method2247(Static39.aClass80_318, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static87.aClass3_Sub1_Sub4_Sub1_3.method567(389, 271);
				arg1.method2247(Static67.aClass80_574, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static163.anInt3649 == 2) {
				local109 = 211;
				arg1.method2273(Static78.aClass80_669, 382, 211, 16776960, 0);
				local117 = local109 + 15;
				arg1.method2273(Static78.aClass80_668, 382, 226, 16776960, 0);
				local117 += 15;
				arg1.method2273(Static78.aClass80_670, 382, 241, 16776960, 0);
				@Pc(303) boolean local303;
				if (Static39.anInt876 == 0 && Static193.anInt4411 % 40 < 20 && Static122.aBoolean105) {
					local303 = true;
				} else {
					local303 = false;
				}
				local117 += 15;
				local117 += 10;
				arg1.method2264(Static154.method2467(new Class80[] { Static88.aClass80_718, Static76.method2250(Static78.aClass80_666), local303 ? Static102.aClass80_863 : Static78.aClass80_667 }), 272, 266, 16777215, 0);
				if (Static39.anInt876 == 1 && Static193.anInt4411 % 40 < 20 && Static122.aBoolean105) {
					local303 = true;
				} else {
					local303 = false;
				}
				local117 += 15;
				arg1.method2264(Static154.method2467(new Class80[] { Static130.aClass80_1113, Static78.aClass80_671.method2450(), local303 ? Static102.aClass80_863 : Static78.aClass80_667 }), 274, 281, 16777215, 0);
				local117 += 15;
				Static87.aClass3_Sub1_Sub4_Sub1_3.method567(229, 301);
				arg1.method2273(Static66.aClass80_563, 302, 326, 16777215, 0);
				Static87.aClass3_Sub1_Sub4_Sub1_3.method567(389, 301);
				arg1.method2273(Static181.aClass80_1571, 462, 326, 16777215, 0);
			} else if (Static163.anInt3649 == 3) {
				arg1.method2273(Static103.aClass80_876, 382, 211, 16776960, 0);
				local109 = 236;
				arg1.method2273(Static96.aClass80_820, 382, 236, 16777215, 0);
				local117 = local109 + 15;
				arg1.method2273(Static171.aClass80_1478, 382, 251, 16777215, 0);
				local117 += 15;
				arg1.method2273(Static82.aClass80_681, 382, 266, 16777215, 0);
				local117 += 15;
				arg1.method2273(Static14.aClass80_96, 382, 281, 16777215, 0);
				local117 += 15;
				Static87.aClass3_Sub1_Sub4_Sub1_3.method567(309, 301);
				arg1.method2273(Static181.aClass80_1571, 382, 326, 16777215, 0);
			}
		}
		if (Static44.anInt1010 != 1) {
			if (Static108.anInt2956 > 0) {
				Static107.method1632(Static108.anInt2956);
				Static108.anInt2956 = 0;
			}
			Static69.method1035();
		}
		Static98.aClass3_Sub1_Sub4_Sub1Array4[Static131.aBoolean170 ? 1 : 0].method567(725, 463);
		if (Static21.anInt516 <= 5 || Static85.anInt1782 == 2 || Static44.anInt1005 != 0) {
			return;
		}
		if (Static82.aClass3_Sub1_Sub4_Sub1_2 == null) {
			Static82.aClass3_Sub1_Sub4_Sub1_2 = Static181.method2907(Static130.aClass1_Sub1_21, Static152.anInt3409);
		}
		if (Static82.aClass3_Sub1_Sub4_Sub1_2 == null) {
			return;
		}
		Static82.aClass3_Sub1_Sub4_Sub1_2.method567(5, 463);
		arg1.method2273(Static154.method2467(new Class80[] { Static92.aClass80_1191, Static53.aClass80_455, Static83.method1219(Static120.anInt2639) }), 55, 478, 16777215, 0);
		if (Static73.aClass33_1 != null) {
			arg0.method2273(Static130.aClass80_1104, 55, 492, 16777215, 0);
			return;
		}
		arg0.method2273(Static11.aClass80_87, 55, 492, 16777215, 0);
		return;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
	public static void method1311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static60.anInt1321; local3++) {
			if (arg1 < Static148.anIntArray427[local3] + Static160.anIntArray444[local3] && Static160.anIntArray444[local3] < arg2 + arg1 && arg0 < Static33.anIntArray99[local3] + Static130.anIntArray379[local3] && Static33.anIntArray99[local3] < arg3 + arg0) {
				Static63.aBooleanArray8[local3] = true;
			}
		}
	}
}
