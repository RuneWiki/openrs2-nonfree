import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!k", name = "Sb", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!k", name = "Fb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1338 = Static118.method2249("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!k", name = "Eb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1337 = aClass65_1338;

	@OriginalMember(owner = "client!k", name = "Gb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1339 = Static118.method2249("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!k", name = "Ib", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1340 = Static118.method2249("compass");

	@OriginalMember(owner = "client!k", name = "Kb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1341 = Static118.method2249("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!k", name = "Wb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1343 = Static118.method2249("Members object");

	@OriginalMember(owner = "client!k", name = "Qb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1342 = aClass65_1343;

	@OriginalMember(owner = "client!k", name = "Tb", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_38 = new Class87(100);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!wg;III)V")
	public static void method1757(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub7 local12;
		if (arg2 < Static201.anInt3978) {
			local12 = Static83.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass33_1 != null && local12.aClass33_1.aClass6_3.method2986()) {
				arg0.method2990(local12.aClass33_1.aClass6_3, 128, 0, 0, true);
			}
		}
		if (arg3 < Static201.anInt3978) {
			local12 = Static83.aClass1_Sub7ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass33_1 != null && local12.aClass33_1.aClass6_3.method2986()) {
				arg0.method2990(local12.aClass33_1.aClass6_3, 0, 0, 128, true);
			}
		}
		if (arg2 < Static201.anInt3978 && arg3 < Static198.anInt4264) {
			local12 = Static83.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass33_1 != null && local12.aClass33_1.aClass6_3.method2986()) {
				arg0.method2990(local12.aClass33_1.aClass6_3, 128, 0, 128, true);
			}
		}
		if (arg2 < Static201.anInt3978 && arg3 > 0) {
			local12 = Static83.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass33_1 != null && local12.aClass33_1.aClass6_3.method2986()) {
				arg0.method2990(local12.aClass33_1.aClass6_3, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "k", descriptor = "(II)V")
	public static void method1760(@OriginalArg(0) int arg0) {
		if (Static191.anInt4167 == 0) {
			Static63.aClass1_Sub6_Sub2_1.method2070(arg0);
		} else {
			Static200.anInt4299 = arg0;
		}
	}

	@OriginalMember(owner = "client!k", name = "s", descriptor = "(I)V")
	public static void method1763() {
		Static25.method448(Static195.aClass97_13);
		Static28.anInt855++;
		if (Static107.aBoolean105 && Static195.aBoolean167) {
			@Pc(22) int local22 = Static38.anInt1051;
			@Pc(24) int local24 = Static53.anInt1441;
			local24 -= Static2.anInt66;
			local22 -= Static28.anInt854;
			if (local24 < Static124.anInt3083) {
				local24 = Static124.anInt3083;
			}
			if (local22 < Static188.anInt4137) {
				local22 = Static188.anInt4137;
			}
			if (Static57.aClass97_5.anInt4354 + Static188.anInt4137 < Static195.aClass97_13.anInt4354 + local22) {
				local22 = Static57.aClass97_5.anInt4354 + Static188.anInt4137 - Static195.aClass97_13.anInt4354;
			}
			if (local24 + Static195.aClass97_13.anInt4353 > Static124.anInt3083 - -Static57.aClass97_5.anInt4353) {
				local24 = Static124.anInt3083 + Static57.aClass97_5.anInt4353 - Static195.aClass97_13.anInt4353;
			}
			@Pc(100) int local100 = local24 - Static190.anInt4158;
			@Pc(105) int local105 = local22 - Static178.anInt4025;
			@Pc(112) int local112 = Static57.aClass97_5.anInt4310 + local24 - Static124.anInt3083;
			@Pc(115) int local115 = Static195.aClass97_13.anInt4324;
			@Pc(123) int local123 = Static57.aClass97_5.anInt4342 + local22 - Static188.anInt4137;
			if (Static195.aClass97_13.anInt4320 < Static28.anInt855 && (local115 < local100 || -local115 > local100 || local115 < local105 || -local115 > local105)) {
				Static166.aBoolean150 = true;
			}
			@Pc(160) Class1_Sub26 local160;
			if (Static195.aClass97_13.anObjectArray23 != null && Static166.aBoolean150) {
				local160 = new Class1_Sub26();
				local160.anObjectArray3 = Static195.aClass97_13.anObjectArray23;
				local160.aClass97_14 = Static195.aClass97_13;
				local160.anInt4256 = local112;
				local160.anInt4254 = local123;
				Static94.method1780(local160);
			}
			if (Static122.anInt3456 == 0) {
				if (Static166.aBoolean150) {
					if (Static195.aClass97_13.anObjectArray21 != null) {
						local160 = new Class1_Sub26();
						local160.anObjectArray3 = Static195.aClass97_13.anObjectArray21;
						local160.aClass97_15 = Static66.aClass97_7;
						local160.aClass97_14 = Static195.aClass97_13;
						local160.anInt4256 = local112;
						local160.anInt4254 = local123;
						Static94.method1780(local160);
					}
					if (Static66.aClass97_7 != null && Static33.method638(Static195.aClass97_13) != null) {
						Static45.aClass1_Sub14_Sub1_8.method1761(58);
						Static45.aClass1_Sub14_Sub1_8.method1740(Static195.aClass97_13.anInt4376);
						Static45.aClass1_Sub14_Sub1_8.method1736(Static66.aClass97_7.anInt4330);
						Static45.aClass1_Sub14_Sub1_8.method1726(Static195.aClass97_13.anInt4330);
						Static45.aClass1_Sub14_Sub1_8.method1724(Static66.aClass97_7.anInt4376);
					}
				} else if ((Static201.anInt3942 == 1 || Static101.method1913(Static101.anInt2533 - 1)) && Static101.anInt2533 > 2) {
					Static171.method2897();
				} else if (Static101.anInt2533 > 0) {
					Static95.method1807(Static101.anInt2533 - 1);
				}
				Static195.aClass97_13 = null;
			}
		} else if (Static28.anInt855 > 1) {
			Static195.aClass97_13 = null;
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Lclient!oc;I)Z")
	public static boolean method1764(@OriginalArg(0) Class65 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static33.anInt973; local9++) {
			if (arg0.method2489(Static125.aClass65Array41[local9])) {
				return true;
			}
		}
		return arg0.method2489(Static201.aClass6_Sub4_Sub1_3.aClass65_479);
	}
}
