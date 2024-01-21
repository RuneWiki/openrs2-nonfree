import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
	public static boolean aBoolean13;

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "Lclient!gg;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "Lclient!rf;")
	private static Class70 aClass70_105 = Static49.method1293("Invalid username or password)3");

	@OriginalMember(owner = "client!ai", name = "jb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_111 = Static49.method1293("The server is being updated)3");

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "Lclient!rf;")
	public static Class70 aClass70_106 = aClass70_111;

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_107 = Static49.method1293("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ai", name = "cb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_108 = aClass70_107;

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_109 = Static49.method1293("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!ai", name = "hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_110 = Static49.method1293("huffman");

	@OriginalMember(owner = "client!ai", name = "kb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_112 = aClass70_105;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBI)I")
	public static int method275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(B)V")
	public static void method276() {
		aClass70_109 = null;
		aClass70_108 = null;
		aClass70_110 = null;
		aClass70_112 = null;
		aClass70_105 = null;
		aClass70_106 = null;
		aClass70_107 = null;
		aClass32_1 = null;
		aClass70_111 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class46 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class46(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static90.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static90.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass46_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class46(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static90.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static90.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass46_1 = local12;
		} else {
			@Pc(134) Class21 local134 = new Class21(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static90.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static90.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass21_1 = local134;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZI)I")
	public static int method279() {
		return Static38.anInt1331 + Static98.anInt2846;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!rf;I)V")
	public static void method280(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class70 arg1) {
		@Pc(5) Class70 local5 = arg1.method2927();
		@Pc(11) int local11 = 0;
		@Pc(14) short[] local14 = new short[16];
		for (@Pc(16) int local16 = 0; local16 < Static149.anInt4001; local16++) {
			@Pc(22) Class1_Sub1_Sub2 local22 = Static90.method1963(local16);
			if ((!arg0 || local22.aBoolean8) && local22.aClass70_49.method2927().method2902(local5) != -1) {
				if (local11 >= 250) {
					Static72.anInt2240 = -1;
					Static104.aShortArray25 = null;
					return;
				}
				if (local11 >= local14.length) {
					@Pc(60) short[] local60 = new short[local14.length * 2];
					for (@Pc(62) int local62 = 0; local62 < local11; local62++) {
						local60[local62] = local14[local62];
					}
					local14 = local60;
				}
				local14[local11++] = (short) local16;
			}
		}
		Static104.aShortArray25 = local14;
		Static72.anInt2240 = local11;
		Static7.anInt282 = 0;
		@Pc(103) Class70[] local103 = new Class70[Static72.anInt2240];
		for (@Pc(105) int local105 = 0; local105 < Static72.anInt2240; local105++) {
			local103[local105] = Static90.method1963(local14[local105]).aClass70_49;
		}
		Static93.method2012(local103, Static104.aShortArray25);
	}
}
