import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	public static int anInt1021;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_583 = Static28.method504("title)3jpg");

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
	public static int anInt1019 = 0;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	public static int anInt1020 = 0;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Z")
	public static final boolean aBoolean44 = false;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!ja;")
	private static Class39 aClass39_585 = Static28.method504("as it was used to break our rules)3");

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_584 = aClass39_585;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public static int anInt1022 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)I")
	public static int method680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg2;
			arg2 = local6;
		}
		@Pc(14) int local14 = arg5 & 0x3;
		if (local14 == 0) {
			return arg3;
		} else if (local14 == 1) {
			return 8 - arg0 - arg1;
		} else if (local14 == 2) {
			return 1 + 7 - arg2 - arg3;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method682() {
		aClass39_584 = null;
		aClass39_585 = null;
		aClass39_583 = null;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	public static void method683() {
		while (true) {
			if (Static35.aClass4_Sub16_Sub1_1.method1493(Static97.anInt2446) >= 27) {
				@Pc(14) int local14 = Static35.aClass4_Sub16_Sub1_1.method1500(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local14] == null) {
						Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local14] = new Class4_Sub2_Sub1_Sub1_Sub2();
						local19 = true;
					}
					@Pc(35) Class4_Sub2_Sub1_Sub1_Sub2 local35 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local14];
					Static33.anIntArray94[Static72.anInt799++] = local14;
					local35.anInt2681 = Static71.anInt1738;
					@Pc(51) int local51 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
					if (local51 == 1) {
						Static35.anIntArray101[Static30.anInt785++] = local14;
					}
					@Pc(71) int local71 = Static128.anIntArray361[Static35.aClass4_Sub16_Sub1_1.method1500(3)];
					if (local19) {
						local35.anInt2644 = local35.anInt2670 = local71;
					}
					@Pc(86) int local86 = Static35.aClass4_Sub16_Sub1_1.method1500(5);
					if (local86 > 15) {
						local86 -= 32;
					}
					@Pc(95) int local95 = Static35.aClass4_Sub16_Sub1_1.method1500(5);
					if (local95 > 15) {
						local95 -= 32;
					}
					local35.aClass4_Sub2_Sub16_1 = Static91.method1636(Static35.aClass4_Sub16_Sub1_1.method1500(14));
					@Pc(114) int local114 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
					local35.anInt2656 = local35.aClass4_Sub2_Sub16_1.anInt2918;
					local35.anInt2658 = local35.aClass4_Sub2_Sub16_1.anInt2932;
					local35.anInt2657 = local35.aClass4_Sub2_Sub16_1.anInt2930;
					local35.anInt2653 = local35.aClass4_Sub2_Sub16_1.anInt2922;
					local35.anInt2655 = local35.aClass4_Sub2_Sub16_1.anInt2925;
					local35.anInt2690 = local35.aClass4_Sub2_Sub16_1.anInt2946;
					local35.anInt2665 = local35.aClass4_Sub2_Sub16_1.anInt2945;
					if (local35.anInt2658 == 0) {
						local35.anInt2670 = 0;
					}
					local35.anInt2679 = local35.aClass4_Sub2_Sub16_1.anInt2928;
					local35.anInt2669 = local35.aClass4_Sub2_Sub16_1.anInt2941;
					local35.method1913(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0] + local95, local86 + Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], local114 == 1);
					continue;
				}
			}
			Static35.aClass4_Sub16_Sub1_1.method1491();
			return;
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	public static void method684() {
		Static19.method344(Static129.aClass4_Sub5_72);
		Static125.anInt3121++;
		if (Static26.aBoolean27 && Static62.aBoolean92) {
			@Pc(32) int local32 = Static73.anInt1769;
			@Pc(34) int local34 = Static88.anInt2198;
			local34 -= Static58.anInt1549;
			local32 -= Static77.anInt1849;
			if (Static2.anInt12 > local32) {
				local32 = Static2.anInt12;
			}
			if (local34 < Static115.anInt2883) {
				local34 = Static115.anInt2883;
			}
			if (Static129.aClass4_Sub5_72.anInt1244 + local34 > Static71.aClass4_Sub5_38.anInt1244 + Static115.anInt2883) {
				local34 = Static115.anInt2883 + Static71.aClass4_Sub5_38.anInt1244 - Static129.aClass4_Sub5_72.anInt1244;
			}
			if (Static71.aClass4_Sub5_38.anInt1259 + Static2.anInt12 < Static129.aClass4_Sub5_72.anInt1259 + local32) {
				local32 = Static2.anInt12 + Static71.aClass4_Sub5_38.anInt1259 - Static129.aClass4_Sub5_72.anInt1259;
			}
			@Pc(104) int local104 = local34 - Static75.anInt1794;
			@Pc(109) int local109 = local32 - Static41.anInt1029;
			@Pc(117) int local117 = Static71.aClass4_Sub5_38.anInt1237 + local34 - Static115.anInt2883;
			@Pc(125) int local125 = Static71.aClass4_Sub5_38.anInt1214 + local32 - Static2.anInt12;
			@Pc(128) int local128 = Static129.aClass4_Sub5_72.anInt1215;
			if (Static125.anInt3121 > Static129.aClass4_Sub5_72.anInt1264 && (local104 > local128 || -local128 > local104 || local128 < local109 || -local128 > local109)) {
				Static14.aBoolean13 = true;
			}
			@Pc(165) Class4_Sub17 local165;
			if (Static129.aClass4_Sub5_72.anObjectArray14 != null && Static14.aBoolean13) {
				local165 = new Class4_Sub17();
				local165.anInt2342 = local125;
				local165.anObjectArray27 = Static129.aClass4_Sub5_72.anObjectArray14;
				local165.anInt2343 = local117;
				local165.aClass4_Sub5_51 = Static129.aClass4_Sub5_72;
				Static104.method1857(local165);
			}
			if (Static62.anInt1639 == 0) {
				if (Static14.aBoolean13) {
					if (Static129.aClass4_Sub5_72.anObjectArray9 != null) {
						local165 = new Class4_Sub17();
						local165.anInt2343 = local117;
						local165.anObjectArray27 = Static129.aClass4_Sub5_72.anObjectArray9;
						local165.aClass4_Sub5_50 = Static2.aClass4_Sub5_1;
						local165.anInt2342 = local125;
						local165.aClass4_Sub5_51 = Static129.aClass4_Sub5_72;
						Static104.method1857(local165);
					}
					if (Static2.aClass4_Sub5_1 != null && Static78.method1300(Static129.aClass4_Sub5_72) != null) {
						Static114.aClass4_Sub16_Sub1_3.method1499(228);
						Static114.aClass4_Sub16_Sub1_3.method1473(Static2.aClass4_Sub5_1.anInt1212);
						Static114.aClass4_Sub16_Sub1_3.method1451(Static2.aClass4_Sub5_1.anInt1230);
						Static114.aClass4_Sub16_Sub1_3.method1441(Static129.aClass4_Sub5_72.anInt1212);
						Static114.aClass4_Sub16_Sub1_3.method1454(Static129.aClass4_Sub5_72.anInt1230);
					}
				} else if ((Static2.anInt19 == 1 || Static72.method532(Static105.anInt2033 - 1)) && Static105.anInt2033 > 2) {
					Static88.method1612();
				} else if (Static105.anInt2033 > 0) {
					Static67.method1166(Static105.anInt2033 - 1);
				}
				Static129.aClass4_Sub5_72 = null;
			}
		} else if (Static125.anInt3121 > 1) {
			Static129.aClass4_Sub5_72 = null;
		}
	}
}
