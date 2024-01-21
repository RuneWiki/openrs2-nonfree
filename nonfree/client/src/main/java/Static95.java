import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!u", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "Lclient!le;")
	public static Class38 aClass38_4;

	@OriginalMember(owner = "client!u", name = "O", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "[I")
	public static int[] anIntArray319;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!va;")
	private static Class61 aClass61_971 = Static88.method1421(" from your ignore list first");

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!va;")
	private static Class61 aClass61_972 = Static88.method1421("Loading )2 please wait)3");

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	public static int anInt2437 = 0;

	@OriginalMember(owner = "client!u", name = "R", descriptor = "Lclient!va;")
	private static Class61 aClass61_978 = Static88.method1421("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Lclient!va;")
	public static Class61 aClass61_973 = aClass61_978;

	@OriginalMember(owner = "client!u", name = "B", descriptor = "I")
	public static volatile int anInt2441 = 0;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Lclient!va;")
	private static Class61 aClass61_974 = Static88.method1421("Offline");

	@OriginalMember(owner = "client!u", name = "D", descriptor = "I")
	public static int anInt2442 = 0;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Lclient!va;")
	public static Class61 aClass61_975 = aClass61_972;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "Lclient!va;")
	public static Class61 aClass61_976 = aClass61_974;

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "Lclient!va;")
	public static Class61 aClass61_977 = aClass61_971;

	@OriginalMember(owner = "client!u", name = "S", descriptor = "Lclient!va;")
	public static Class61 aClass61_979 = Static88.method1421("_");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lclient!va;")
	public static Class61 method1508() {
		@Pc(12) Class61 local12 = new Class61();
		local12.aByteArray18 = new byte[100];
		local12.anInt2559 = 0;
		return local12;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method1509(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static50.anIntArrayArray11[local7][local11] = 0;
				Static49.anIntArrayArray10[local7][local11] = 99999999;
			}
		}
		Static50.anIntArrayArray11[arg8][arg10] = 99;
		Static49.anIntArrayArray10[arg8][arg10] = 0;
		local11 = arg8;
		@Pc(54) byte local54 = 0;
		Static99.anIntArray333[0] = arg8;
		@Pc(60) int local60 = arg10;
		@Pc(62) int local62 = 0;
		@Pc(65) int local65 = local54 + 1;
		Static96.anIntArray320[0] = arg10;
		@Pc(69) boolean local69 = false;
		@Pc(72) int local72 = Static99.anIntArray333.length;
		@Pc(77) int[][] local77 = Static15.aClass12Array1[Static101.anInt2582].anIntArrayArray6;
		@Pc(191) int local191;
		while (local62 != local65) {
			local60 = Static96.anIntArray320[local62];
			local11 = Static99.anIntArray333[local62];
			local62 = (local62 + 1) % local72;
			if (local11 == arg7 && arg1 == local60) {
				local69 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static15.aClass12Array1[Static101.anInt2582].method256(local60, arg5, local11, arg9 - 1, arg7, arg1)) {
					local69 = true;
					break;
				}
				if (arg9 < 10 && Static15.aClass12Array1[Static101.anInt2582].method258(arg5, local11, arg7, arg1, local60, arg9 - 1)) {
					local69 = true;
					break;
				}
			}
			if (arg6 != 0 && arg2 != 0 && Static15.aClass12Array1[Static101.anInt2582].method255(arg1, arg6, arg2, local60, local11, arg7, arg3)) {
				local69 = true;
				break;
			}
			local191 = Static49.anIntArrayArray10[local11][local60] + 1;
			if (local11 > 0 && Static50.anIntArrayArray11[local11 - 1][local60] == 0 && (local77[local11 - 1][local60] & 0x1280108) == 0) {
				Static99.anIntArray333[local65] = local11 - 1;
				Static96.anIntArray320[local65] = local60;
				Static50.anIntArrayArray11[local11 - 1][local60] = 2;
				local65 = (local65 + 1) % local72;
				Static49.anIntArrayArray10[local11 - 1][local60] = local191;
			}
			if (local11 < 103 && Static50.anIntArrayArray11[local11 + 1][local60] == 0 && (local77[local11 + 1][local60] & 0x1280180) == 0) {
				Static99.anIntArray333[local65] = local11 + 1;
				Static96.anIntArray320[local65] = local60;
				Static50.anIntArrayArray11[local11 + 1][local60] = 8;
				local65 = (local65 + 1) % local72;
				Static49.anIntArrayArray10[local11 + 1][local60] = local191;
			}
			if (local60 > 0 && Static50.anIntArrayArray11[local11][local60 - 1] == 0 && (local77[local11][local60 - 1] & 0x1280102) == 0) {
				Static99.anIntArray333[local65] = local11;
				Static96.anIntArray320[local65] = local60 - 1;
				Static50.anIntArrayArray11[local11][local60 - 1] = 1;
				Static49.anIntArrayArray10[local11][local60 - 1] = local191;
				local65 = (local65 + 1) % local72;
			}
			if (local60 < 103 && Static50.anIntArrayArray11[local11][local60 + 1] == 0 && (local77[local11][local60 + 1] & 0x1280120) == 0) {
				Static99.anIntArray333[local65] = local11;
				Static96.anIntArray320[local65] = local60 + 1;
				local65 = (local65 + 1) % local72;
				Static50.anIntArrayArray11[local11][local60 + 1] = 4;
				Static49.anIntArrayArray10[local11][local60 + 1] = local191;
			}
			if (local11 > 0 && local60 > 0 && Static50.anIntArrayArray11[local11 - 1][local60 - 1] == 0 && (local77[local11 - 1][local60 - 1] & 0x128010E) == 0 && (local77[local11 - 1][local60] & 0x1280108) == 0 && (local77[local11][local60 - 1] & 0x1280102) == 0) {
				Static99.anIntArray333[local65] = local11 - 1;
				Static96.anIntArray320[local65] = local60 - 1;
				local65 = (local65 + 1) % local72;
				Static50.anIntArrayArray11[local11 - 1][local60 - 1] = 3;
				Static49.anIntArrayArray10[local11 - 1][local60 - 1] = local191;
			}
			if (local11 < 103 && local60 > 0 && Static50.anIntArrayArray11[local11 + 1][local60 - 1] == 0 && (local77[local11 + 1][local60 - 1] & 0x1280183) == 0 && (local77[local11 + 1][local60] & 0x1280180) == 0 && (local77[local11][local60 - 1] & 0x1280102) == 0) {
				Static99.anIntArray333[local65] = local11 + 1;
				Static96.anIntArray320[local65] = local60 - 1;
				local65 = (local65 + 1) % local72;
				Static50.anIntArrayArray11[local11 + 1][local60 - 1] = 9;
				Static49.anIntArrayArray10[local11 + 1][local60 - 1] = local191;
			}
			if (local11 > 0 && local60 < 103 && Static50.anIntArrayArray11[local11 - 1][local60 + 1] == 0 && (local77[local11 - 1][local60 + 1] & 0x1280138) == 0 && (local77[local11 - 1][local60] & 0x1280108) == 0 && (local77[local11][local60 + 1] & 0x1280120) == 0) {
				Static99.anIntArray333[local65] = local11 - 1;
				Static96.anIntArray320[local65] = local60 + 1;
				local65 = (local65 + 1) % local72;
				Static50.anIntArrayArray11[local11 - 1][local60 + 1] = 6;
				Static49.anIntArrayArray10[local11 - 1][local60 + 1] = local191;
			}
			if (local11 < 103 && local60 < 103 && Static50.anIntArrayArray11[local11 + 1][local60 + 1] == 0 && (local77[local11 + 1][local60 + 1] & 0x12801E0) == 0 && (local77[local11 + 1][local60] & 0x1280180) == 0 && (local77[local11][local60 + 1] & 0x1280120) == 0) {
				Static99.anIntArray333[local65] = local11 + 1;
				Static96.anIntArray320[local65] = local60 + 1;
				Static50.anIntArrayArray11[local11 + 1][local60 + 1] = 12;
				Static49.anIntArrayArray10[local11 + 1][local60 + 1] = local191;
				local65 = (local65 + 1) % local72;
			}
		}
		Static18.anInt613 = 0;
		@Pc(824) int local824;
		@Pc(828) int local828;
		@Pc(835) int local835;
		if (!local69) {
			if (!arg0) {
				return false;
			}
			local191 = 1000;
			local824 = 100;
			for (local828 = arg7 - 10; local828 <= arg7 + 10; local828++) {
				for (local835 = arg1 - 10; local835 <= arg1 + 10; local835++) {
					if (local828 >= 0 && local835 >= 0 && local828 < 104 && local835 < 104 && Static49.anIntArrayArray10[local828][local835] < 100) {
						@Pc(856) int local856 = 0;
						if (arg1 > local835) {
							local856 = arg1 - local835;
						} else if (local835 > arg2 + arg1 - 1) {
							local856 = local835 + 1 - arg1 - arg2;
						}
						@Pc(884) int local884 = 0;
						if (arg7 > local828) {
							local884 = arg7 - local828;
						} else if (local828 > arg7 + arg6 - 1) {
							local884 = local828 + 1 - arg7 - arg6;
						}
						@Pc(929) int local929 = local884 * local884 + local856 * local856;
						if (local191 > local929 || local929 == local191 && local824 > Static49.anIntArrayArray10[local828][local835]) {
							local824 = Static49.anIntArrayArray10[local828][local835];
							local11 = local828;
							local60 = local835;
							local191 = local929;
						}
					}
				}
			}
			if (local191 == 1000) {
				return false;
			}
			if (local11 == arg8 && local60 == arg10) {
				return false;
			}
			Static18.anInt613 = 1;
		}
		@Pc(997) byte local997 = 0;
		Static99.anIntArray333[0] = local11;
		local62 = local997 + 1;
		Static96.anIntArray320[0] = local60;
		local191 = local824 = Static50.anIntArrayArray11[local11][local60];
		while (local11 != arg8 || arg10 != local60) {
			if (local824 != local191) {
				local824 = local191;
				Static99.anIntArray333[local62] = local11;
				Static96.anIntArray320[local62++] = local60;
			}
			if ((local191 & 0x2) != 0) {
				local11++;
			} else if ((local191 & 0x8) != 0) {
				local11--;
			}
			if ((local191 & 0x1) != 0) {
				local60++;
			} else if ((local191 & 0x4) != 0) {
				local60--;
			}
			local191 = Static50.anIntArrayArray11[local11][local60];
		}
		if (local62 > 0) {
			local72 = local62--;
			@Pc(1088) int local1088 = Static99.anIntArray333[local62];
			local828 = Static96.anIntArray320[local62];
			if (local72 > 25) {
				local72 = 25;
			}
			if (arg4 == 0) {
				Static50.aClass10_Sub10_Sub1_3.method1167(104);
				Static50.aClass10_Sub10_Sub1_3.method1126(local72 + local72 + 3);
			}
			if (arg4 == 1) {
				Static50.aClass10_Sub10_Sub1_3.method1167(142);
				Static50.aClass10_Sub10_Sub1_3.method1126(local72 + local72 + 14 + 3);
			}
			if (arg4 == 2) {
				Static50.aClass10_Sub10_Sub1_3.method1167(20);
				Static50.aClass10_Sub10_Sub1_3.method1126(local72 + local72 + 3);
			}
			Static35.anInt1020 = Static99.anIntArray333[0];
			Static50.anInt1406 = Static96.anIntArray320[0];
			for (local835 = 1; local835 < local72; local835++) {
				local62--;
				Static50.aClass10_Sub10_Sub1_3.method1113(Static99.anIntArray333[local62] - local1088);
				Static50.aClass10_Sub10_Sub1_3.method1137(Static96.anIntArray320[local62] - local828);
			}
			Static50.aClass10_Sub10_Sub1_3.method1154(Static19.aBooleanArray2[82] ? 1 : 0);
			Static50.aClass10_Sub10_Sub1_3.method1146(Static7.anInt80 + local828);
			Static50.aClass10_Sub10_Sub1_3.method1140(local1088 + Static107.anInt2431);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public static void method1510() {
		aClass38_4 = null;
		aClass61_979 = null;
		aClass61_972 = null;
		aClass61_971 = null;
		aClass61_977 = null;
		aClass61_976 = null;
		aClass61_978 = null;
		aClass61_973 = null;
		aByteArrayArrayArray9 = null;
		aFontMetrics1 = null;
		aClass61_975 = null;
		aClass61_974 = null;
		anIntArray319 = null;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	public static void method1511() {
		@Pc(10) int local10 = Static55.aClass10_Sub10_Sub1_4.method1171(8);
		@Pc(19) int local19;
		if (Static10.anInt305 > local10) {
			for (local19 = local10; local19 < Static10.anInt305; local19++) {
				Static93.anIntArray232[Static15.anInt449++] = Static58.anIntArray170[local19];
			}
		}
		if (Static10.anInt305 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static10.anInt305 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(53) int local53 = Static58.anIntArray170[local19];
			@Pc(57) Class10_Sub1_Sub5_Sub2_Sub2 local57 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local53];
			@Pc(64) int local64 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
			if (local64 == 0) {
				Static58.anIntArray170[Static10.anInt305++] = local53;
				local57.anInt1631 = anInt2442;
			} else {
				@Pc(84) int local84 = Static55.aClass10_Sub10_Sub1_4.method1171(2);
				if (local84 == 0) {
					Static58.anIntArray170[Static10.anInt305++] = local53;
					local57.anInt1631 = anInt2442;
					Static12.anIntArray46[Static76.anInt2030++] = local53;
				} else {
					@Pc(126) int local126;
					@Pc(140) int local140;
					if (local84 == 1) {
						Static58.anIntArray170[Static10.anInt305++] = local53;
						local57.anInt1631 = anInt2442;
						local126 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
						local57.method920(local126, false);
						local140 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
						if (local140 == 1) {
							Static12.anIntArray46[Static76.anInt2030++] = local53;
						}
					} else if (local84 == 2) {
						Static58.anIntArray170[Static10.anInt305++] = local53;
						local57.anInt1631 = anInt2442;
						local126 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
						local57.method920(local126, true);
						local140 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
						local57.method920(local140, true);
						@Pc(196) int local196 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
						if (local196 == 1) {
							Static12.anIntArray46[Static76.anInt2030++] = local53;
						}
					} else if (local84 == 3) {
						Static93.anIntArray232[Static15.anInt449++] = local53;
					}
				}
			}
		}
	}
}
