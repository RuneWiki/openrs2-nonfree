import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public static int anInt1327;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!je;")
	public static Class40 aClass40_667 = Static69.method1231("");

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_660 = aClass40_667;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_661 = aClass40_667;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_662 = aClass40_667;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_663 = Static69.method1231("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!je;")
	public static Class40 aClass40_664 = aClass40_667;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_665 = Static69.method1231("Angreifen");

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_666 = Static69.method1231("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
	public static int[] anIntArray139 = new int[4000];

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_668 = aClass40_667;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_669 = aClass40_667;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!ob;")
	public static Class55 aClass55_37 = new Class55(50);

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "Lclient!je;")
	private static Class40 aClass40_670 = Static69.method1231("Your account is already logged in)3");

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Lclient!je;")
	public static Class40 aClass40_671 = aClass40_670;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BJ)V")
	public static void method893(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static75.anInt1945 >= 100) {
			Static72.method1228(Static83.aClass40_1111, Static43.aClass40_568, 0);
			return;
		}
		@Pc(25) Class40 local25 = Static74.method665(arg0).method965();
		for (@Pc(27) int local27 = 0; local27 < Static75.anInt1945; local27++) {
			if (arg0 == Static10.aLongArray8[local27]) {
				Static72.method1228(Static40.method722(new Class40[] { local25, Static117.aClass40_1477 }), Static43.aClass40_568, 0);
				return;
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static114.anInt2621; local75++) {
			if (arg0 == Static88.aLongArray7[local75]) {
				Static72.method1228(Static40.method722(new Class40[] { Static18.aClass40_322, local25, Static41.aClass40_563 }), Static43.aClass40_568, 0);
				return;
			}
		}
		if (local25.method960(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass40_892)) {
			Static72.method1228(Static70.aClass40_939, Static43.aClass40_568, 0);
			return;
		}
		Static10.aLongArray8[Static75.anInt1945] = arg0;
		Static56.aClass40Array5[Static75.anInt1945++] = Static74.method665(arg0);
		Static21.anInt643 = Static70.anInt1886;
		Static57.aClass2_Sub9_Sub1_2.method673(162);
		Static57.aClass2_Sub9_Sub1_2.method647(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Lclient!kc;")
	public static Class2_Sub13 method894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub13 local7 = Static55.method972(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass2_Sub13Array2 == null || local7.aClass2_Sub13Array2.length <= arg0) {
			return null;
		} else {
			return local7.aClass2_Sub13Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
	public static void method895(@OriginalArg(0) boolean arg0) {
		Static63.aBoolean34 = arg0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(130) int local130;
		@Pc(138) int local138;
		@Pc(146) int local146;
		if (!Static63.aBoolean34) {
			local20 = (Static130.anInt3009 - Static7.aClass2_Sub9_Sub1_1.anInt976) / 16;
			Static118.anIntArrayArray27 = new int[local20][4];
			for (local26 = 0; local26 < local20; local26++) {
				for (local30 = 0; local30 < 4; local30++) {
					Static118.anIntArrayArray27[local26][local30] = Static7.aClass2_Sub9_Sub1_1.method662();
				}
			}
			local30 = Static7.aClass2_Sub9_Sub1_1.method632();
			local58 = Static7.aClass2_Sub9_Sub1_1.method639();
			local62 = Static7.aClass2_Sub9_Sub1_1.method650();
			local66 = Static7.aClass2_Sub9_Sub1_1.method632();
			local70 = Static7.aClass2_Sub9_Sub1_1.method640();
			Static127.aByteArrayArray10 = new byte[local20][];
			Static19.anIntArray71 = new int[local20];
			Static35.anIntArray95 = new int[local20];
			Static55.anIntArray144 = new int[local20];
			@Pc(84) boolean local84 = false;
			if ((local66 / 8 == 48 || local66 / 8 == 49) && local62 / 8 == 48) {
				local84 = true;
			}
			Static95.aByteArrayArray7 = new byte[local20][];
			if (local66 / 8 == 48 && local62 / 8 == 148) {
				local84 = true;
			}
			local20 = 0;
			for (local130 = (local66 - 6) / 8; local130 <= (local66 + 6) / 8; local130++) {
				for (local138 = (local62 - 6) / 8; local138 <= (local62 + 6) / 8; local138++) {
					local146 = (local130 << 8) + local138;
					if (!local84 || local138 != 49 && local138 != 149 && local138 != 147 && local130 != 50 && (local130 != 49 || local138 != 47)) {
						Static35.anIntArray95[local20] = local146;
						Static19.anIntArray71[local20] = Static80.aClass24_Sub1_13.method1915(Static40.method722(new Class40[] { Static43.aClass40_573, Static49.method886(local130), Static28.aClass40_400, Static49.method886(local138) }));
						Static55.anIntArray144[local20] = Static80.aClass24_Sub1_13.method1915(Static40.method722(new Class40[] { Static33.aClass40_1449, Static49.method886(local130), Static28.aClass40_400, Static49.method886(local138) }));
						local20++;
					}
				}
			}
			Static133.method2219(local58, local70, local66, local62, local30);
			return;
		}
		local20 = Static7.aClass2_Sub9_Sub1_1.method650();
		local26 = Static7.aClass2_Sub9_Sub1_1.method621();
		local30 = Static7.aClass2_Sub9_Sub1_1.method640();
		local58 = Static7.aClass2_Sub9_Sub1_1.method639();
		Static7.aClass2_Sub9_Sub1_1.method672();
		@Pc(301) int local301;
		for (local62 = 0; local62 < 4; local62++) {
			for (local66 = 0; local66 < 13; local66++) {
				for (local70 = 0; local70 < 13; local70++) {
					local301 = Static7.aClass2_Sub9_Sub1_1.method671(1);
					if (local301 == 1) {
						Static123.anIntArrayArrayArray7[local62][local66][local70] = Static7.aClass2_Sub9_Sub1_1.method671(26);
					} else {
						Static123.anIntArrayArrayArray7[local62][local66][local70] = -1;
					}
				}
			}
		}
		Static7.aClass2_Sub9_Sub1_1.method675();
		local66 = (Static130.anInt3009 - Static7.aClass2_Sub9_Sub1_1.anInt976) / 16;
		Static118.anIntArrayArray27 = new int[local66][4];
		for (local70 = 0; local70 < local66; local70++) {
			for (local301 = 0; local301 < 4; local301++) {
				Static118.anIntArrayArray27[local70][local301] = Static7.aClass2_Sub9_Sub1_1.method637();
			}
		}
		local301 = Static7.aClass2_Sub9_Sub1_1.method621();
		Static55.anIntArray144 = new int[local66];
		Static19.anIntArray71 = new int[local66];
		Static35.anIntArray95 = new int[local66];
		Static95.aByteArrayArray7 = new byte[local66][];
		Static127.aByteArrayArray10 = new byte[local66][];
		local66 = 0;
		for (local130 = 0; local130 < 4; local130++) {
			for (local138 = 0; local138 < 13; local138++) {
				for (local146 = 0; local146 < 13; local146++) {
					@Pc(418) int local418 = Static123.anIntArrayArrayArray7[local130][local138][local146];
					if (local418 != -1) {
						@Pc(428) int local428 = local418 >> 14 & 0x3FF;
						@Pc(434) int local434 = local418 >> 3 & 0x7FF;
						@Pc(444) int local444 = (local428 / 8 << 8) + local434 / 8;
						for (@Pc(446) int local446 = 0; local446 < local66; local446++) {
							if (Static35.anIntArray95[local446] == local444) {
								local444 = -1;
								break;
							}
						}
						if (local444 != -1) {
							@Pc(474) int local474 = local444 >> 8 & 0xFF;
							Static35.anIntArray95[local66] = local444;
							@Pc(482) int local482 = local444 & 0xFF;
							Static19.anIntArray71[local66] = Static80.aClass24_Sub1_13.method1915(Static40.method722(new Class40[] { Static43.aClass40_573, Static49.method886(local474), Static28.aClass40_400, Static49.method886(local482) }));
							Static55.anIntArray144[local66] = Static80.aClass24_Sub1_13.method1915(Static40.method722(new Class40[] { Static33.aClass40_1449, Static49.method886(local474), Static28.aClass40_400, Static49.method886(local482) }));
							local66++;
						}
					}
				}
			}
		}
		Static133.method2219(local20, local30, local58, local26, local301);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lclient!qa;")
	public static Class2_Sub1_Sub11 method896(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub1_Sub11 local12 = (Class2_Sub1_Sub11) Static24.aClass55_92.method1410((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static61.aClass24_18.method1931(arg0, 9);
		local12 = new Class2_Sub1_Sub11();
		local12.anInt2344 = arg0;
		if (local22 != null) {
			local12.method1669(new Class2_Sub9(local22));
		}
		local12.method1660();
		Static24.aClass55_92.method1411((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	public static void method898(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static81.aBooleanArray20[arg0]) {
			return;
		}
		Static60.aClass24_17.method1916(arg0);
		if (Static45.aClass2_Sub13ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < Static45.aClass2_Sub13ArrayArray1[arg0].length; local36++) {
			if (Static45.aClass2_Sub13ArrayArray1[arg0][local36] != null) {
				if (Static45.aClass2_Sub13ArrayArray1[arg0][local36].anInt1583 == 2) {
					local34 = false;
				} else {
					Static45.aClass2_Sub13ArrayArray1[arg0][local36] = null;
				}
			}
		}
		if (local34) {
			Static45.aClass2_Sub13ArrayArray1[arg0] = null;
		}
		Static81.aBooleanArray20[arg0] = false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method899() {
		aClass40_664 = null;
		aClass40_665 = null;
		aClass40_666 = null;
		aClass40_661 = null;
		aClass40_671 = null;
		aByteArrayArrayArray9 = null;
		aClass40_667 = null;
		aClass40_662 = null;
		aClass40_668 = null;
		aClass55_37 = null;
		aClass40_660 = null;
		aClass40_669 = null;
		anIntArray139 = null;
		aClass40_670 = null;
		aClass40_663 = null;
	}
}
