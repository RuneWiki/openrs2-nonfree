import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!sg;")
	private static Class77 aClass77_941 = Static146.method2172("Jan");

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!sg;")
	private static Class77 aClass77_929 = Static146.method2172("Feb");

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!sg;")
	private static Class77 aClass77_931 = Static146.method2172("Mar");

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!sg;")
	private static Class77 aClass77_939 = Static146.method2172("Apr");

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!sg;")
	private static Class77 aClass77_944 = Static146.method2172("May");

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!sg;")
	private static Class77 aClass77_938 = Static146.method2172("Jun");

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!sg;")
	private static Class77 aClass77_945 = Static146.method2172("Jul");

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!sg;")
	private static Class77 aClass77_937 = Static146.method2172("Aug");

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!sg;")
	private static Class77 aClass77_930 = Static146.method2172("Sep");

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!sg;")
	private static Class77 aClass77_942 = Static146.method2172("Oct");

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!sg;")
	private static Class77 aClass77_936 = Static146.method2172("Nov");

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!sg;")
	private static Class77 aClass77_933 = Static146.method2172("Dec");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array16 = new Class77[] { aClass77_941, aClass77_929, aClass77_931, aClass77_939, aClass77_944, aClass77_938, aClass77_945, aClass77_937, aClass77_930, aClass77_942, aClass77_936, aClass77_933 };

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[Lclient!dc;")
	public static Class17[] aClass17Array1 = new Class17[50];

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_932 = null;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_934 = Static146.method2172("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Lclient!sg;")
	public static Class77 aClass77_935 = Static146.method2172("p12_full");

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[S")
	public static short[] aShortArray87 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!sg;")
	public static Class77 aClass77_940 = Static146.method2172("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Lclient!sg;")
	public static Class77 aClass77_943 = Static146.method2172("titlebutton");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!g;")
	public static Class2_Sub2_Sub7 method1753(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub7 local10 = (Class2_Sub2_Sub7) Static84.aClass82_47.method2699((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static17.aClass43_5.method2205(arg0, 4);
		local10 = new Class2_Sub2_Sub7();
		if (local20 != null) {
			local10.method960(new Class2_Sub18(local20), arg0);
		}
		local10.method963();
		Static84.aClass82_47.method2701((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIILclient!bg;II)V")
	public static void method1754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub3_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = arg3 * arg3 + arg0 * arg0;
		if (local17 <= 4225 || local17 >= 90000) {
			Static61.method1147(arg3, arg2, arg4, arg1, arg0);
			return;
		}
		@Pc(31) int local31 = Static160.anInt4572 + Static28.anInt832 & 0x7FF;
		@Pc(35) int local35 = Class2_Sub2_Sub3_Sub1.anIntArray52[local31];
		@Pc(39) int local39 = Class2_Sub2_Sub3_Sub1.anIntArray50[local31];
		@Pc(47) int local47 = local39 * 256 / (Static130.anInt3166 + 256);
		@Pc(55) int local55 = local35 * 256 / (Static130.anInt3166 + 256);
		@Pc(65) int local65 = local55 * arg3 + local47 * arg0 >> 16;
		@Pc(75) int local75 = local55 * arg0 - local47 * arg3 >> 16;
		@Pc(81) double local81 = Math.atan2((double) local65, (double) local75);
		@Pc(87) int local87 = (int) (Math.sin(local81) * 63.0D);
		@Pc(93) int local93 = (int) (Math.cos(local81) * 57.0D);
		Static55.aClass2_Sub2_Sub3_Sub2_2.method412(local87 + arg4 + 4 + 94 - 10, -local93 + arg1 - -83 + -20, local81);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method1755() {
		aClass77_932 = null;
		aClass77_943 = null;
		aClass77_937 = null;
		aClass77_929 = null;
		aClass77_940 = null;
		aClass77_936 = null;
		aClass77_942 = null;
		aClass77_944 = null;
		aClass77Array16 = null;
		aClass77_933 = null;
		aClass77_938 = null;
		aClass17Array1 = null;
		aClass77_935 = null;
		aClass77_931 = null;
		aClass77_939 = null;
		aShortArray87 = null;
		aClass77_945 = null;
		aClass77_941 = null;
		aClass77_930 = null;
		aClass77_934 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIB)V")
	public static void method1756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (local12 = 0; local12 < 8; local12++) {
				Static122.anIntArrayArrayArray2[arg1][arg2 + local8][local12 + arg0] = 0;
			}
		}
		if (arg2 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static122.anIntArrayArrayArray2[arg1][arg2][local12 + arg0] = Static122.anIntArrayArrayArray2[arg1][arg2 - 1][arg0 + local12];
			}
		}
		if (arg0 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static122.anIntArrayArrayArray2[arg1][local12 + arg2][arg0] = Static122.anIntArrayArrayArray2[arg1][arg2 + local12][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static122.anIntArrayArrayArray2[arg1][arg2 - 1][arg0] != 0) {
			Static122.anIntArrayArrayArray2[arg1][arg2][arg0] = Static122.anIntArrayArrayArray2[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static122.anIntArrayArrayArray2[arg1][arg2][arg0 - 1] != 0) {
			Static122.anIntArrayArrayArray2[arg1][arg2][arg0] = Static122.anIntArrayArrayArray2[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static122.anIntArrayArrayArray2[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static122.anIntArrayArrayArray2[arg1][arg2][arg0] = Static122.anIntArrayArrayArray2[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!hg;Lclient!hg;I)V")
	public static void method1757(@OriginalArg(0) Class2_Sub2_Sub3_Sub4_Sub1 arg0, @OriginalArg(1) Class2_Sub2_Sub3_Sub4_Sub1 arg1) {
		if (Static48.aBoolean67) {
			Static81.method1499(arg0, arg1);
			return;
		}
		if (Static97.anInt2440 == 0 || Static97.anInt2440 == 5) {
			arg1.method1255(Static107.aClass77_1021, 382, 225, 16777215, -1);
			Static113.method1250(230, 233, 304, 34, 9179409);
			Static113.method1250(231, 234, 302, 32, 0);
			Static113.method1243(232, 235, Static49.anInt1343 * 3, 30, 9179409);
			Static113.method1243(Static49.anInt1343 * 3 + 232, 235, 300 - Static49.anInt1343 * 3, 30, 0);
			arg1.method1255(Static39.aClass77_449, 382, 256, 16777215, -1);
		}
		@Pc(94) short local94;
		@Pc(118) int local118;
		if (Static97.anInt2440 == 20) {
			local94 = 211;
			Static112.aClass2_Sub2_Sub3_Sub3_3.method1019(382 - Static112.aClass2_Sub2_Sub3_Sub3_3.anInt1451 / 2, -(Static112.aClass2_Sub2_Sub3_Sub3_3.anInt1449 / 2) + 271);
			arg1.method1255(Static39.aClass77_448, 382, 211, 16776960, 0);
			local118 = local94 + 15;
			arg1.method1255(Static39.aClass77_439, 382, 226, 16776960, 0);
			@Pc(126) int local126 = local118 + 15;
			arg1.method1255(Static39.aClass77_443, 382, 241, 16776960, 0);
			@Pc(134) int local134 = local126 + 15;
			@Pc(135) int local135 = local134 + 10;
			arg1.method1256(Static146.method2168(new Class77[] { Static44.aClass77_474, Static102.method1279(Static39.aClass77_446) }), 272, 266, 16777215, 0);
			@Pc(155) int local155 = local135 + 15;
			arg1.method1256(Static146.method2168(new Class77[] { Static74.aClass77_788, Static39.aClass77_445.method2527() }), 274, 281, 16777215, 0);
			@Pc(178) int local178 = local155 + 15;
		}
		if (Static97.anInt2440 == 10) {
			Static112.aClass2_Sub2_Sub3_Sub3_3.method1019(202, 171);
			if (Static24.anInt729 == 0) {
				local94 = 251;
				arg1.method1255(Static149.aClass77_1267, 382, 251, 16776960, 0);
				local118 = local94 + 30;
				Static119.aClass2_Sub2_Sub3_Sub3_4.method1019(229, 271);
				arg1.method1272(Static51.aClass77_545, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static119.aClass2_Sub2_Sub3_Sub3_4.method1019(389, 271);
				arg1.method1272(Static40.aClass77_462, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static24.anInt729 == 2) {
				local94 = 211;
				arg1.method1255(Static39.aClass77_448, 382, 211, 16776960, 0);
				local118 = local94 + 15;
				arg1.method1255(Static39.aClass77_439, 382, 226, 16776960, 0);
				local118 += 15;
				arg1.method1255(Static39.aClass77_443, 382, 241, 16776960, 0);
				@Pc(302) boolean local302;
				if (Static9.anInt261 == 0 && Static143.anInt3513 % 40 < 20 && Static41.aBoolean57) {
					local302 = true;
				} else {
					local302 = false;
				}
				local118 += 15;
				local118 += 10;
				arg1.method1256(Static146.method2168(new Class77[] { Static44.aClass77_474, Static102.method1279(Static39.aClass77_446), local302 ? Static25.aClass77_314 : Static39.aClass77_451 }), 272, 266, 16777215, 0);
				if (Static9.anInt261 == 1 && Static143.anInt3513 % 40 < 20 && Static41.aBoolean57) {
					local302 = true;
				} else {
					local302 = false;
				}
				local118 += 15;
				arg1.method1256(Static146.method2168(new Class77[] { Static74.aClass77_788, Static39.aClass77_445.method2527(), local302 ? Static25.aClass77_314 : Static39.aClass77_451 }), 274, 281, 16777215, 0);
				local118 += 15;
				Static119.aClass2_Sub2_Sub3_Sub3_4.method1019(229, 301);
				arg1.method1255(Static158.aClass77_1347, 302, 326, 16777215, 0);
				Static119.aClass2_Sub2_Sub3_Sub3_4.method1019(389, 301);
				arg1.method1255(Static181.aClass77_1563, 462, 326, 16777215, 0);
			} else if (Static24.anInt729 == 3) {
				arg1.method1255(Static114.aClass77_1068, 382, 211, 16776960, 0);
				local94 = 236;
				arg1.method1255(Static130.aClass77_1155, 382, 236, 16777215, 0);
				local118 = local94 + 15;
				arg1.method1255(Static172.aClass77_1481, 382, 251, 16777215, 0);
				local118 += 15;
				arg1.method1255(Static49.aClass77_525, 382, 266, 16777215, 0);
				local118 += 15;
				arg1.method1255(Static5.aClass77_55, 382, 281, 16777215, 0);
				local118 += 15;
				Static119.aClass2_Sub2_Sub3_Sub3_4.method1019(309, 301);
				arg1.method1255(Static181.aClass77_1563, 382, 326, 16777215, 0);
			}
		}
		if (Static174.anInt4450 != 1) {
			if (Static25.anInt734 > 0) {
				Static5.method97(Static25.anInt734);
				Static25.anInt734 = 0;
			}
			Static112.method1993();
		}
		Static181.aClass2_Sub2_Sub3_Sub3Array20[Static92.aBoolean102 ? 1 : 0].method1019(725, 463);
		if (Static97.anInt2440 <= 5 || Static164.anInt4022 == 2 || Static136.anInt3303 != 0) {
			return;
		}
		if (Static119.aClass2_Sub2_Sub3_Sub3_5 == null) {
			Static119.aClass2_Sub2_Sub3_Sub3_5 = Static179.method2997(Static7.aClass77_119, Static91.aClass43_Sub1_12, Static39.aClass77_451);
			return;
		}
		Static119.aClass2_Sub2_Sub3_Sub3_5.method1019(5, 463);
		arg1.method1255(Static146.method2168(new Class77[] { Static166.aClass77_1507, Static85.aClass77_872, Static2.method61(Static70.anInt1900) }), 55, 478, 16777215, 0);
		if (Static23.aClass58_1 == null) {
			arg0.method1255(Static54.aClass77_580, 55, 492, 16777215, 0);
		} else {
			arg0.method1255(Static49.aClass77_522, 55, 492, 16777215, 0);
		}
	}
}
