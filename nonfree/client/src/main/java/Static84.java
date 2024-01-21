import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 aClass5_Sub2_Sub6_Sub3_2;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!sd;")
	public static Class29 aClass29_55;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!mb;")
	private static Class45 aClass45_988 = Static63.method1251("Unexpected server response");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_986 = aClass45_988;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public static int anInt2332 = 0;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public static int anInt2334 = 0;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_987 = Static63.method1251("Okay");

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public static int anInt2339 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1588() {
		aClass5_Sub2_Sub6_Sub3_2 = null;
		aClass29_55 = null;
		aClass45_988 = null;
		aClass45_987 = null;
		aClass45_986 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!mb;Lclient!sd;Lclient!mb;)[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] method1589(@OriginalArg(1) Class45 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) Class45 arg2) {
		@Pc(8) int local8 = arg1.method746(arg2);
		@Pc(14) int local14 = arg1.method753(arg0, local8);
		return Static89.method1701(local8, arg1, local14);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!ia;)Lclient!mb;")
	public static Class45 method1590(@OriginalArg(1) Class5_Sub2_Sub8 arg0) {
		if (Static13.method268(Static74.method1700(arg0)) == 0) {
			return null;
		} else if (arg0.aClass45_548 == null || arg0.aClass45_548.method1297().method1317() == 0) {
			return Static110.aBoolean123 ? Static23.aClass45_375 : null;
		} else {
			return arg0.aClass45_548;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI[B)I")
	public static int method1591(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static3.method68(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lclient!he;")
	public static Class21 method1592() {
		try {
			return (Class21) Class.forName("Class21_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([BB)V")
	public static void method1593(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub9 local8 = new Class5_Sub9(arg0);
		local8.anInt2140 = arg0.length - 2;
		Static64.anInt1854 = local8.method1418();
		Static111.anIntArray440 = new int[Static64.anInt1854];
		Static89.anIntArray368 = new int[Static64.anInt1854];
		Static110.anIntArray438 = new int[Static64.anInt1854];
		Static104.anIntArray424 = new int[Static64.anInt1854];
		Static16.aByteArrayArray2 = new byte[Static64.anInt1854][];
		local8.anInt2140 = arg0.length - Static64.anInt1854 * 8 - 7;
		Static64.anInt1855 = local8.method1418();
		Static45.anInt1316 = local8.method1418();
		@Pc(60) int local60 = (local8.method1408() & 0xFF) + 1;
		for (@Pc(62) int local62 = 0; local62 < Static64.anInt1854; local62++) {
			Static89.anIntArray368[local62] = local8.method1418();
		}
		for (@Pc(75) int local75 = 0; local75 < Static64.anInt1854; local75++) {
			Static111.anIntArray440[local75] = local8.method1418();
		}
		for (@Pc(92) int local92 = 0; local92 < Static64.anInt1854; local92++) {
			Static110.anIntArray438[local92] = local8.method1418();
		}
		for (@Pc(109) int local109 = 0; local109 < Static64.anInt1854; local109++) {
			Static104.anIntArray424[local109] = local8.method1418();
		}
		local8.anInt2140 = arg0.length - Static64.anInt1854 * 8 - (local60 - 1) * 3 - 7;
		Static7.anIntArray25 = new int[local60];
		for (@Pc(142) int local142 = 1; local142 < local60; local142++) {
			Static7.anIntArray25[local142] = local8.method1409();
			if (Static7.anIntArray25[local142] == 0) {
				Static7.anIntArray25[local142] = 1;
			}
		}
		local8.anInt2140 = 0;
		for (@Pc(173) int local173 = 0; local173 < Static64.anInt1854; local173++) {
			@Pc(178) int local178 = Static104.anIntArray424[local173];
			@Pc(182) int local182 = Static110.anIntArray438[local173];
			@Pc(186) int local186 = local182 * local178;
			@Pc(189) byte[] local189 = new byte[local186];
			Static16.aByteArrayArray2[local173] = local189;
			@Pc(197) int local197 = local8.method1408();
			@Pc(209) int local209;
			if (local197 == 0) {
				for (local209 = 0; local209 < local186; local209++) {
					local189[local209] = local8.method1447();
				}
			} else if (local197 == 1) {
				for (local209 = 0; local209 < local182; local209++) {
					for (@Pc(212) int local212 = 0; local212 < local178; local212++) {
						local189[local209 + local212 * local182] = local8.method1447();
					}
				}
			}
		}
	}
}
