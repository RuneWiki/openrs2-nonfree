import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	public static int anInt2455;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!jg;")
	public static Class1_Sub8 aClass1_Sub8_6;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!ed;")
	private static Class23 aClass23_926 = Static169.method2903("May");

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!ed;")
	private static Class23 aClass23_927 = Static169.method2903("Nov");

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!ed;")
	private static Class23 aClass23_928 = Static169.method2903("Dec");

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!ed;")
	private static Class23 aClass23_929 = Static169.method2903("Jan");

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!ed;")
	private static Class23 aClass23_930 = Static169.method2903("button near the top of that page)3");

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!ed;")
	private static Class23 aClass23_931 = Static169.method2903("Feb");

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_932 = aClass23_930;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!ed;")
	private static Class23 aClass23_933 = Static169.method2903("Jun");

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!ed;")
	private static Class23 aClass23_934 = Static169.method2903("Apr");

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!ed;")
	private static Class23 aClass23_935 = Static169.method2903("Aug");

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!ed;")
	private static Class23 aClass23_937 = Static169.method2903("Ok");

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!ed;")
	public static Class23 aClass23_936 = aClass23_937;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!ed;")
	private static Class23 aClass23_940 = Static169.method2903("Mar");

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!ed;")
	private static Class23 aClass23_938 = Static169.method2903("Jul");

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Lclient!ed;")
	private static Class23 aClass23_941 = Static169.method2903("Sep");

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "Lclient!ed;")
	private static Class23 aClass23_939 = Static169.method2903("Oct");

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array9 = new Class23[] { aClass23_929, aClass23_931, aClass23_940, aClass23_934, aClass23_926, aClass23_933, aClass23_938, aClass23_935, aClass23_941, aClass23_939, aClass23_927, aClass23_928 };

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	public static int anInt2462 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	public static boolean method1631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = 0; local8 < 104; local8++) {
			for (local12 = 0; local12 < 104; local12++) {
				Static76.anIntArrayArray22[local8][local12] = 0;
				Static130.anIntArrayArray32[local8][local12] = 99999999;
			}
		}
		local12 = arg5;
		Static76.anIntArrayArray22[arg5][arg1] = 99;
		Static130.anIntArrayArray32[arg5][arg1] = 0;
		@Pc(58) int local58 = arg1;
		@Pc(60) byte local60 = 0;
		@Pc(62) int local62 = 0;
		Static15.anIntArray67[0] = arg5;
		@Pc(68) boolean local68 = false;
		@Pc(71) int local71 = local60 + 1;
		Static132.anIntArray544[0] = arg1;
		@Pc(76) int local76 = Static15.anIntArray67.length;
		@Pc(81) int[][] local81 = Static132.aClass69Array3[Static85.anInt2267].anIntArrayArray33;
		@Pc(191) int local191;
		while (local62 != local71) {
			local58 = Static132.anIntArray544[local62];
			local12 = Static15.anIntArray67[local62];
			local62 = (local62 + 1) % local76;
			if (arg3 == local12 && local58 == arg2) {
				local68 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static132.aClass69Array3[Static85.anInt2267].method2396(arg6, arg9 - 1, arg2, arg3, local12, local58)) {
					local68 = true;
					break;
				}
				if (arg9 < 10 && Static132.aClass69Array3[Static85.anInt2267].method2400(arg6, local58, arg2, arg3, arg9 - 1, local12)) {
					local68 = true;
					break;
				}
			}
			if (arg10 != 0 && arg0 != 0 && Static132.aClass69Array3[Static85.anInt2267].method2397(arg2, arg4, local12, local58, arg10, arg0, arg3)) {
				local68 = true;
				break;
			}
			local191 = Static130.anIntArrayArray32[local12][local58] + 1;
			if (local12 > 0 && Static76.anIntArrayArray22[local12 - 1][local58] == 0 && (local81[local12 - 1][local58] & 0x12C0108) == 0) {
				Static15.anIntArray67[local71] = local12 - 1;
				Static132.anIntArray544[local71] = local58;
				Static76.anIntArrayArray22[local12 - 1][local58] = 2;
				Static130.anIntArrayArray32[local12 - 1][local58] = local191;
				local71 = (local71 + 1) % local76;
			}
			if (local12 < 103 && Static76.anIntArrayArray22[local12 + 1][local58] == 0 && (local81[local12 + 1][local58] & 0x12C0180) == 0) {
				Static15.anIntArray67[local71] = local12 + 1;
				Static132.anIntArray544[local71] = local58;
				Static76.anIntArrayArray22[local12 + 1][local58] = 8;
				Static130.anIntArrayArray32[local12 + 1][local58] = local191;
				local71 = (local71 + 1) % local76;
			}
			if (local58 > 0 && Static76.anIntArrayArray22[local12][local58 - 1] == 0 && (local81[local12][local58 - 1] & 0x12C0102) == 0) {
				Static15.anIntArray67[local71] = local12;
				Static132.anIntArray544[local71] = local58 - 1;
				Static76.anIntArrayArray22[local12][local58 - 1] = 1;
				Static130.anIntArrayArray32[local12][local58 - 1] = local191;
				local71 = (local71 + 1) % local76;
			}
			if (local58 < 103 && Static76.anIntArrayArray22[local12][local58 + 1] == 0 && (local81[local12][local58 + 1] & 0x12C0120) == 0) {
				Static15.anIntArray67[local71] = local12;
				Static132.anIntArray544[local71] = local58 + 1;
				local71 = (local71 + 1) % local76;
				Static76.anIntArrayArray22[local12][local58 + 1] = 4;
				Static130.anIntArrayArray32[local12][local58 + 1] = local191;
			}
			if (local12 > 0 && local58 > 0 && Static76.anIntArrayArray22[local12 - 1][local58 - 1] == 0 && (local81[local12 - 1][local58 - 1] & 0x12C010E) == 0 && (local81[local12 - 1][local58] & 0x12C0108) == 0 && (local81[local12][local58 - 1] & 0x12C0102) == 0) {
				Static15.anIntArray67[local71] = local12 - 1;
				Static132.anIntArray544[local71] = local58 - 1;
				Static76.anIntArrayArray22[local12 - 1][local58 - 1] = 3;
				Static130.anIntArrayArray32[local12 - 1][local58 - 1] = local191;
				local71 = (local71 + 1) % local76;
			}
			if (local12 < 103 && local58 > 0 && Static76.anIntArrayArray22[local12 + 1][local58 - 1] == 0 && (local81[local12 + 1][local58 - 1] & 0x12C0183) == 0 && (local81[local12 + 1][local58] & 0x12C0180) == 0 && (local81[local12][local58 - 1] & 0x12C0102) == 0) {
				Static15.anIntArray67[local71] = local12 + 1;
				Static132.anIntArray544[local71] = local58 - 1;
				Static76.anIntArrayArray22[local12 + 1][local58 - 1] = 9;
				Static130.anIntArrayArray32[local12 + 1][local58 - 1] = local191;
				local71 = (local71 + 1) % local76;
			}
			if (local12 > 0 && local58 < 103 && Static76.anIntArrayArray22[local12 - 1][local58 + 1] == 0 && (local81[local12 - 1][local58 + 1] & 0x12C0138) == 0 && (local81[local12 - 1][local58] & 0x12C0108) == 0 && (local81[local12][local58 + 1] & 0x12C0120) == 0) {
				Static15.anIntArray67[local71] = local12 - 1;
				Static132.anIntArray544[local71] = local58 + 1;
				local71 = (local71 + 1) % local76;
				Static76.anIntArrayArray22[local12 - 1][local58 + 1] = 6;
				Static130.anIntArrayArray32[local12 - 1][local58 + 1] = local191;
			}
			if (local12 < 103 && local58 < 103 && Static76.anIntArrayArray22[local12 + 1][local58 + 1] == 0 && (local81[local12 + 1][local58 + 1] & 0x12C01E0) == 0 && (local81[local12 + 1][local58] & 0x12C0180) == 0 && (local81[local12][local58 + 1] & 0x12C0120) == 0) {
				Static15.anIntArray67[local71] = local12 + 1;
				Static132.anIntArray544[local71] = local58 + 1;
				local71 = (local71 + 1) % local76;
				Static76.anIntArrayArray22[local12 + 1][local58 + 1] = 12;
				Static130.anIntArrayArray32[local12 + 1][local58 + 1] = local191;
			}
		}
		Static18.anInt567 = 0;
		@Pc(813) int local813;
		@Pc(820) int local820;
		@Pc(827) int local827;
		if (!local68) {
			if (!arg7) {
				return false;
			}
			local191 = 1000;
			local813 = 100;
			for (local820 = arg3 - 10; local820 <= arg3 + 10; local820++) {
				for (local827 = arg2 - 10; local827 <= arg2 + 10; local827++) {
					if (local820 >= 0 && local827 >= 0 && local820 < 104 && local827 < 104 && Static130.anIntArrayArray32[local820][local827] < 100) {
						@Pc(860) int local860 = 0;
						if (arg3 > local820) {
							local860 = arg3 - local820;
						} else if (arg3 + arg10 - 1 < local820) {
							local860 = local820 + 1 - arg3 - arg10;
						}
						@Pc(887) int local887 = 0;
						if (local827 < arg2) {
							local887 = arg2 - local827;
						} else if (local827 > arg2 + arg0 - 1) {
							local887 = local827 + 1 - arg0 - arg2;
						}
						@Pc(924) int local924 = local887 * local887 + local860 * local860;
						if (local924 < local191 || local924 == local191 && local813 > Static130.anIntArrayArray32[local820][local827]) {
							local191 = local924;
							local813 = Static130.anIntArrayArray32[local820][local827];
							local12 = local820;
							local58 = local827;
						}
					}
				}
			}
			if (local191 == 1000) {
				return false;
			}
			if (local12 == arg5 && local58 == arg1) {
				return false;
			}
			Static18.anInt567 = 1;
		}
		@Pc(989) byte local989 = 0;
		Static15.anIntArray67[0] = local12;
		local62 = local989 + 1;
		Static132.anIntArray544[0] = local58;
		local191 = local813 = Static76.anIntArrayArray22[local12][local58];
		while (local12 != arg5 || arg1 != local58) {
			if (local191 != local813) {
				local813 = local191;
				Static15.anIntArray67[local62] = local12;
				Static132.anIntArray544[local62++] = local58;
			}
			if ((local191 & 0x1) != 0) {
				local58++;
			} else if ((local191 & 0x4) != 0) {
				local58--;
			}
			if ((local191 & 0x2) != 0) {
				local12++;
			} else if ((local191 & 0x8) != 0) {
				local12--;
			}
			local191 = Static76.anIntArrayArray22[local12][local58];
		}
		if (local62 > 0) {
			local76 = local62;
			if (local62 > 25) {
				local76 = 25;
			}
			local62--;
			@Pc(1084) int local1084 = Static15.anIntArray67[local62];
			local820 = Static132.anIntArray544[local62];
			if (arg8 == 0) {
				Static25.aClass1_Sub8_Sub1_1.method919(223);
				Static25.aClass1_Sub8_Sub1_1.method862(local76 + local76 + 3);
			}
			if (arg8 == 1) {
				Static25.aClass1_Sub8_Sub1_1.method919(198);
				Static25.aClass1_Sub8_Sub1_1.method862(local76 + local76 + 3 + 14);
			}
			if (arg8 == 2) {
				Static25.aClass1_Sub8_Sub1_1.method919(150);
				Static25.aClass1_Sub8_Sub1_1.method862(local76 + local76 + 3);
			}
			Static25.aClass1_Sub8_Sub1_1.method862(Static92.aBooleanArray11[82] ? 1 : 0);
			Static25.aClass1_Sub8_Sub1_1.method879(Static152.anInt3545 + local1084);
			Static111.anInt2840 = Static15.anIntArray67[0];
			Static32.anInt934 = Static132.anIntArray544[0];
			for (local827 = 1; local827 < local76; local827++) {
				local62--;
				Static25.aClass1_Sub8_Sub1_1.method899(Static15.anIntArray67[local62] - local1084);
				Static25.aClass1_Sub8_Sub1_1.method899(Static132.anIntArray544[local62] - local820);
			}
			Static25.aClass1_Sub8_Sub1_1.method895(local820 + Static75.anInt2039);
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1632() {
		Static171.aClass79_27.method2659();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ed;BI)V")
	public static void method1633(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class23 local15 = arg0.method630().method667();
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < Static152.anInt3549; local19++) {
			@Pc(27) Class1_Sub1_Sub1_Sub1_Sub1 local27 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static112.anIntArray382[local19]];
			if (local27 != null && local27.aClass23_68 != null && local27.aClass23_68.method644(local15)) {
				method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local27.anIntArray248[0], local27.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				if (arg1 == 1) {
					Static25.aClass1_Sub8_Sub1_1.method919(153);
					Static25.aClass1_Sub8_Sub1_1.method879(Static112.anIntArray382[local19]);
				} else if (arg1 == 4) {
					Static25.aClass1_Sub8_Sub1_1.method919(247);
					Static25.aClass1_Sub8_Sub1_1.method895(Static112.anIntArray382[local19]);
				} else if (arg1 == 6) {
					Static25.aClass1_Sub8_Sub1_1.method919(132);
					Static25.aClass1_Sub8_Sub1_1.method860(Static112.anIntArray382[local19]);
				} else if (arg1 == 7) {
					Static25.aClass1_Sub8_Sub1_1.method919(80);
					Static25.aClass1_Sub8_Sub1_1.method879(Static112.anIntArray382[local19]);
				}
				local17 = true;
				break;
			}
		}
		if (!local17) {
			Static73.method1339(Static149.method2571(new Class23[] { Static108.aClass23_681, local15 }), Static101.aClass23_1001, 0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1634() {
		aClass23_932 = null;
		aClass23_939 = null;
		aClass23_938 = null;
		aClass23_936 = null;
		aClass23_941 = null;
		aClass23_927 = null;
		aClass23_940 = null;
		aClass23_930 = null;
		aClass23_937 = null;
		aClass23_934 = null;
		aClass23Array9 = null;
		aClass23_929 = null;
		aClass23_928 = null;
		aClass1_Sub8_6 = null;
		aClass23_931 = null;
		aClass23_935 = null;
		aClass23_933 = null;
		aClass23_926 = null;
	}
}
