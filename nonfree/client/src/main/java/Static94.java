import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
	public static int anInt2320;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_685 = Static184.method2923("blinken1:");

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "[I")
	public static int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_686 = Static184.method2923("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Lclient!ob;")
	public static Class70 aClass70_6 = new Class70(4096);

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "Lclient!id;")
	public static Class43 aClass43_8 = new Class43(64);

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "Lclient!ca;")
	public static Class16 aClass16_6 = new Class16(4);

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_687 = Static184.method2923("b12_full");

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method1638(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = 0; local12 < 104; local12++) {
			for (local16 = 0; local16 < 104; local16++) {
				Static168.anIntArrayArray35[local12][local16] = 0;
				Static202.anIntArrayArray15[local12][local16] = 99999999;
			}
		}
		Static168.anIntArrayArray35[arg4][arg1] = 99;
		Static202.anIntArrayArray15[arg4][arg1] = 0;
		local16 = arg4;
		@Pc(56) int local56 = arg1;
		@Pc(58) byte local58 = 0;
		Static106.anIntArray254[0] = arg4;
		@Pc(65) int local65 = local58 + 1;
		Static84.anIntArray209[0] = arg1;
		@Pc(69) boolean local69 = false;
		@Pc(71) int local71 = 0;
		@Pc(76) int[][] local76 = Static149.aClass42Array1[Static134.anInt3147].anIntArrayArray19;
		@Pc(191) int local191;
		while (local65 != local71) {
			local16 = Static106.anIntArray254[local71];
			local56 = Static84.anIntArray209[local71];
			local71 = local71 + 1 & 0xFFF;
			if (local16 == arg7 && arg10 == local56) {
				local69 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && Static149.aClass42Array1[Static134.anInt3147].method1429(local56, arg5 - 1, arg7, arg10, 2, arg6, local16)) {
					local69 = true;
					break;
				}
				if (arg5 < 10 && Static149.aClass42Array1[Static134.anInt3147].method1437(arg6, local16, arg5 - 1, arg10, 2, local56, arg7)) {
					local69 = true;
					break;
				}
			}
			if (arg2 != 0 && arg3 != 0 && Static149.aClass42Array1[Static134.anInt3147].method1439(2, arg10, arg2, local56, arg3, local16, arg7, arg8)) {
				local69 = true;
				break;
			}
			local191 = Static202.anIntArrayArray15[local16][local56] + 1;
			if (local16 > 0 && Static168.anIntArrayArray35[local16 - 1][local56] == 0 && (local76[local16 - 1][local56] & 0x12C010E) == 0 && (local76[local16 - 1][local56 + 1] & 0x12C0138) == 0) {
				Static106.anIntArray254[local65] = local16 - 1;
				Static84.anIntArray209[local65] = local56;
				Static168.anIntArrayArray35[local16 - 1][local56] = 2;
				local65 = local65 + 1 & 0xFFF;
				Static202.anIntArrayArray15[local16 - 1][local56] = local191;
			}
			if (local16 < 102 && Static168.anIntArrayArray35[local16 + 1][local56] == 0 && (local76[local16 + 2][local56] & 0x12C0183) == 0 && (local76[local16 + 2][local56 + 1] & 0x12C01E0) == 0) {
				Static106.anIntArray254[local65] = local16 + 1;
				Static84.anIntArray209[local65] = local56;
				Static168.anIntArrayArray35[local16 + 1][local56] = 8;
				local65 = local65 + 1 & 0xFFF;
				Static202.anIntArrayArray15[local16 + 1][local56] = local191;
			}
			if (local56 > 0 && Static168.anIntArrayArray35[local16][local56 - 1] == 0 && (local76[local16][local56 - 1] & 0x12C010E) == 0 && (local76[local16 + 1][local56 - 1] & 0x12C0183) == 0) {
				Static106.anIntArray254[local65] = local16;
				Static84.anIntArray209[local65] = local56 - 1;
				Static168.anIntArrayArray35[local16][local56 - 1] = 1;
				local65 = local65 + 1 & 0xFFF;
				Static202.anIntArrayArray15[local16][local56 - 1] = local191;
			}
			if (local56 < 102 && Static168.anIntArrayArray35[local16][local56 + 1] == 0 && (local76[local16][local56 + 2] & 0x12C0138) == 0 && (local76[local16 + 1][local56 + 2] & 0x12C01E0) == 0) {
				Static106.anIntArray254[local65] = local16;
				Static84.anIntArray209[local65] = local56 + 1;
				Static168.anIntArrayArray35[local16][local56 + 1] = 4;
				Static202.anIntArrayArray15[local16][local56 + 1] = local191;
				local65 = local65 + 1 & 0xFFF;
			}
			if (local16 > 0 && local56 > 0 && Static168.anIntArrayArray35[local16 - 1][local56 - 1] == 0 && (local76[local16 - 1][local56] & 0x12C0138) == 0 && (local76[local16 - 1][local56 - 1] & 0x12C010E) == 0 && (local76[local16][local56 - 1] & 0x12C0183) == 0) {
				Static106.anIntArray254[local65] = local16 - 1;
				Static84.anIntArray209[local65] = local56 - 1;
				Static168.anIntArrayArray35[local16 - 1][local56 - 1] = 3;
				local65 = local65 + 1 & 0xFFF;
				Static202.anIntArrayArray15[local16 - 1][local56 - 1] = local191;
			}
			if (local16 < 102 && local56 > 0 && Static168.anIntArrayArray35[local16 + 1][local56 - 1] == 0 && (local76[local16 + 1][local56 - 1] & 0x12C010E) == 0 && (local76[local16 + 2][local56 - 1] & 0x12C0183) == 0 && (local76[local16 + 2][local56] & 0x12C01E0) == 0) {
				Static106.anIntArray254[local65] = local16 + 1;
				Static84.anIntArray209[local65] = local56 - 1;
				local65 = local65 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local16 + 1][local56 - 1] = 9;
				Static202.anIntArrayArray15[local16 + 1][local56 - 1] = local191;
			}
			if (local16 > 0 && local56 < 102 && Static168.anIntArrayArray35[local16 - 1][local56 + 1] == 0 && (local76[local16 - 1][local56 + 1] & 0x12C010E) == 0 && (local76[local16 - 1][local56 + 2] & 0x12C0138) == 0 && (local76[local16][local56 + 2] & 0x12C01E0) == 0) {
				Static106.anIntArray254[local65] = local16 - 1;
				Static84.anIntArray209[local65] = local56 + 1;
				local65 = local65 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local16 - 1][local56 + 1] = 6;
				Static202.anIntArrayArray15[local16 - 1][local56 + 1] = local191;
			}
			if (local16 < 102 && local56 < 102 && Static168.anIntArrayArray35[local16 + 1][local56 + 1] == 0 && (local76[local16 + 1][local56 + 2] & 0x12C0138) == 0 && (local76[local16 + 2][local56 + 2] & 0x12C01E0) == 0 && (local76[local16 + 2][local56 + 1] & 0x12C0183) == 0) {
				Static106.anIntArray254[local65] = local16 + 1;
				Static84.anIntArray209[local65] = local56 + 1;
				local65 = local65 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local16 + 1][local56 + 1] = 12;
				Static202.anIntArrayArray15[local16 + 1][local56 + 1] = local191;
			}
		}
		Static106.anInt2579 = 0;
		@Pc(870) int local870;
		if (!local69) {
			if (!arg0) {
				return false;
			}
			local191 = 1000;
			local870 = 100;
			for (@Pc(877) int local877 = arg7 - 10; local877 <= arg7 + 10; local877++) {
				for (@Pc(884) int local884 = arg10 - 10; local884 <= arg10 + 10; local884++) {
					if (local877 >= 0 && local884 >= 0 && local877 < 104 && local884 < 104 && Static202.anIntArrayArray15[local877][local884] < 100) {
						@Pc(909) int local909 = 0;
						@Pc(911) int local911 = 0;
						if (local884 < arg10) {
							local911 = arg10 - local884;
						} else if (local884 > arg10 + arg3 - 1) {
							local911 = local884 + 1 - arg10 - arg3;
						}
						if (local877 < arg7) {
							local909 = arg7 - local877;
						} else if (arg2 + arg7 - 1 < local877) {
							local909 = local877 + 1 - arg2 - arg7;
						}
						@Pc(981) int local981 = local909 * local909 + local911 * local911;
						if (local191 > local981 || local191 == local981 && local870 > Static202.anIntArrayArray15[local877][local884]) {
							local870 = Static202.anIntArrayArray15[local877][local884];
							local16 = local877;
							local56 = local884;
							local191 = local981;
						}
					}
				}
			}
			if (local191 == 1000) {
				return false;
			}
			if (local16 == arg4 && local56 == arg1) {
				return false;
			}
			Static106.anInt2579 = 1;
		}
		@Pc(1039) byte local1039 = 0;
		Static106.anIntArray254[0] = local16;
		local71 = local1039 + 1;
		Static84.anIntArray209[0] = local56;
		local191 = local870 = Static168.anIntArrayArray35[local16][local56];
		while (local16 != arg4 || local56 != arg1) {
			if (local191 != local870) {
				local870 = local191;
				Static106.anIntArray254[local71] = local16;
				Static84.anIntArray209[local71++] = local56;
			}
			if ((local191 & 0x2) != 0) {
				local16++;
			} else if ((local191 & 0x8) != 0) {
				local16--;
			}
			if ((local191 & 0x1) != 0) {
				local56++;
			} else if ((local191 & 0x4) != 0) {
				local56--;
			}
			local191 = Static168.anIntArrayArray35[local16][local56];
		}
		if (local71 > 0) {
			Static220.method3323(arg9, Static106.anIntArray254, Static84.anIntArray209, local71);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	public static void method1639() {
		Static128.aClass21_1.method2629();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static78.aLongArray5[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static44.aLongArray3[local24] = 0L;
		}
		Static138.anInt3208 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static60.anInt4779 && Static11.anInt385 >= arg2 && Static60.anInt4779 <= arg3 && Static11.anInt385 >= arg3 && arg8 >= Static60.anInt4779 && Static11.anInt385 >= arg8 && arg5 >= Static60.anInt4779 && arg5 <= Static11.anInt385 && arg1 >= Static45.anInt1337 && arg1 <= Static17.anInt457 && arg0 >= Static45.anInt1337 && Static17.anInt457 >= arg0 && Static45.anInt1337 <= arg4 && arg4 <= Static17.anInt457 && Static45.anInt1337 <= arg6 && arg6 <= Static17.anInt457) {
			Static138.method2198(arg3, arg7, arg5, arg0, arg1, arg6, arg4, arg2, arg8);
		} else {
			Static132.method2094(arg2, arg3, arg5, arg7, arg6, arg0, arg1, arg4, arg8);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method1641() {
		if (Static80.anIntArray203 != null && Static135.anIntArray331 != null) {
			return;
		}
		Static80.anIntArray203 = new int[256];
		Static135.anIntArray331 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static80.anIntArray203[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static135.anIntArray331[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
