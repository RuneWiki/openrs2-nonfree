import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array85;

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "Lclient!je;")
	private static Class40 aClass40_1305 = Static69.method1231("purple:");

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "[I")
	private static int[] anIntArray280 = new int[4000];

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "Lclient!je;")
	public static Class40 aClass40_1306 = aClass40_1305;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "Lclient!je;")
	public static Class40 aClass40_1307 = aClass40_1305;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
	public static final int anInt2467 = 3353893;

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1308 = Static69.method1231(" <col=ffffff>");

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
	public static int anInt2470 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIZIBIIIIII)Z")
	public static boolean method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static106.anIntArrayArray23[local3][local7] = 0;
				Static39.anIntArrayArray11[local3][local7] = 99999999;
			}
		}
		local7 = arg9;
		Static106.anIntArrayArray23[arg9][arg0] = 99;
		@Pc(60) int local60 = arg0;
		Static39.anIntArrayArray11[arg9][arg0] = 0;
		@Pc(68) int local68 = 0;
		@Pc(70) byte local70 = 0;
		anIntArray280[0] = arg9;
		@Pc(77) int local77 = local70 + 1;
		Static87.anIntArray139[0] = arg0;
		@Pc(82) int local82 = anIntArray280.length;
		@Pc(87) int[][] local87 = Static70.aClass20Array1[Static105.anInt2531].anIntArrayArray8;
		@Pc(89) boolean local89 = false;
		@Pc(201) int local201;
		while (local68 != local77) {
			local60 = Static87.anIntArray139[local68];
			local7 = anIntArray280[local68];
			local68 = (local68 + 1) % local82;
			if (arg8 == local7 && local60 == arg7) {
				local89 = true;
				break;
			}
			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && Static70.aClass20Array1[Static105.anInt2531].method442(arg7, local7, arg10 - 1, local60, arg8, arg6)) {
					local89 = true;
					break;
				}
				if (arg10 < 10 && Static70.aClass20Array1[Static105.anInt2531].method439(local60, local7, arg7, arg6, arg10 - 1, arg8)) {
					local89 = true;
					break;
				}
			}
			if (arg4 != 0 && arg5 != 0 && Static70.aClass20Array1[Static105.anInt2531].method445(local7, arg4, arg1, arg5, arg8, arg7, local60)) {
				local89 = true;
				break;
			}
			local201 = Static39.anIntArrayArray11[local7][local60] + 1;
			if (local7 > 0 && Static106.anIntArrayArray23[local7 - 1][local60] == 0 && (local87[local7 - 1][local60] & 0x12C0108) == 0) {
				anIntArray280[local77] = local7 - 1;
				Static87.anIntArray139[local77] = local60;
				local77 = (local77 + 1) % local82;
				Static106.anIntArrayArray23[local7 - 1][local60] = 2;
				Static39.anIntArrayArray11[local7 - 1][local60] = local201;
			}
			if (local7 < 103 && Static106.anIntArrayArray23[local7 + 1][local60] == 0 && (local87[local7 + 1][local60] & 0x12C0180) == 0) {
				anIntArray280[local77] = local7 + 1;
				Static87.anIntArray139[local77] = local60;
				local77 = (local77 + 1) % local82;
				Static106.anIntArrayArray23[local7 + 1][local60] = 8;
				Static39.anIntArrayArray11[local7 + 1][local60] = local201;
			}
			if (local60 > 0 && Static106.anIntArrayArray23[local7][local60 - 1] == 0 && (local87[local7][local60 - 1] & 0x12C0102) == 0) {
				anIntArray280[local77] = local7;
				Static87.anIntArray139[local77] = local60 - 1;
				local77 = (local77 + 1) % local82;
				Static106.anIntArrayArray23[local7][local60 - 1] = 1;
				Static39.anIntArrayArray11[local7][local60 - 1] = local201;
			}
			if (local60 < 103 && Static106.anIntArrayArray23[local7][local60 + 1] == 0 && (local87[local7][local60 + 1] & 0x12C0120) == 0) {
				anIntArray280[local77] = local7;
				Static87.anIntArray139[local77] = local60 + 1;
				local77 = (local77 + 1) % local82;
				Static106.anIntArrayArray23[local7][local60 + 1] = 4;
				Static39.anIntArrayArray11[local7][local60 + 1] = local201;
			}
			if (local7 > 0 && local60 > 0 && Static106.anIntArrayArray23[local7 - 1][local60 - 1] == 0 && (local87[local7 - 1][local60 - 1] & 0x12C010E) == 0 && (local87[local7 - 1][local60] & 0x12C0108) == 0 && (local87[local7][local60 - 1] & 0x12C0102) == 0) {
				anIntArray280[local77] = local7 - 1;
				Static87.anIntArray139[local77] = local60 - 1;
				Static106.anIntArrayArray23[local7 - 1][local60 - 1] = 3;
				local77 = (local77 + 1) % local82;
				Static39.anIntArrayArray11[local7 - 1][local60 - 1] = local201;
			}
			if (local7 < 103 && local60 > 0 && Static106.anIntArrayArray23[local7 + 1][local60 - 1] == 0 && (local87[local7 + 1][local60 - 1] & 0x12C0183) == 0 && (local87[local7 + 1][local60] & 0x12C0180) == 0 && (local87[local7][local60 - 1] & 0x12C0102) == 0) {
				anIntArray280[local77] = local7 + 1;
				Static87.anIntArray139[local77] = local60 - 1;
				Static106.anIntArrayArray23[local7 + 1][local60 - 1] = 9;
				Static39.anIntArrayArray11[local7 + 1][local60 - 1] = local201;
				local77 = (local77 + 1) % local82;
			}
			if (local7 > 0 && local60 < 103 && Static106.anIntArrayArray23[local7 - 1][local60 + 1] == 0 && (local87[local7 - 1][local60 + 1] & 0x12C0138) == 0 && (local87[local7 - 1][local60] & 0x12C0108) == 0 && (local87[local7][local60 + 1] & 0x12C0120) == 0) {
				anIntArray280[local77] = local7 - 1;
				Static87.anIntArray139[local77] = local60 + 1;
				local77 = (local77 + 1) % local82;
				Static106.anIntArrayArray23[local7 - 1][local60 + 1] = 6;
				Static39.anIntArrayArray11[local7 - 1][local60 + 1] = local201;
			}
			if (local7 < 103 && local60 < 103 && Static106.anIntArrayArray23[local7 + 1][local60 + 1] == 0 && (local87[local7 + 1][local60 + 1] & 0x12C01E0) == 0 && (local87[local7 + 1][local60] & 0x12C0180) == 0 && (local87[local7][local60 + 1] & 0x12C0120) == 0) {
				anIntArray280[local77] = local7 + 1;
				Static87.anIntArray139[local77] = local60 + 1;
				Static106.anIntArrayArray23[local7 + 1][local60 + 1] = 12;
				local77 = (local77 + 1) % local82;
				Static39.anIntArrayArray11[local7 + 1][local60 + 1] = local201;
			}
		}
		Static51.anInt1362 = 0;
		@Pc(809) int local809;
		@Pc(816) int local816;
		@Pc(823) int local823;
		if (!local89) {
			if (!arg3) {
				return false;
			}
			local201 = 1000;
			local809 = 100;
			for (local816 = arg8 - 10; local816 <= arg8 + 10; local816++) {
				for (local823 = arg7 - 10; local823 <= arg7 + 10; local823++) {
					if (local816 >= 0 && local823 >= 0 && local816 < 104 && local823 < 104 && Static39.anIntArrayArray11[local816][local823] < 100) {
						@Pc(849) int local849 = 0;
						if (local816 < arg8) {
							local849 = arg8 - local816;
						} else if (arg8 + arg4 - 1 < local816) {
							local849 = local816 + 1 - arg8 - arg4;
						}
						@Pc(885) int local885 = 0;
						if (arg7 > local823) {
							local885 = arg7 - local823;
						} else if (arg5 + arg7 - 1 < local823) {
							local885 = local823 + 1 - arg5 - arg7;
						}
						@Pc(928) int local928 = local885 * local885 + local849 * local849;
						if (local201 > local928 || local928 == local201 && Static39.anIntArrayArray11[local816][local823] < local809) {
							local809 = Static39.anIntArrayArray11[local816][local823];
							local7 = local816;
							local201 = local928;
							local60 = local823;
						}
					}
				}
			}
			if (local201 == 1000) {
				return false;
			}
			if (local7 == arg9 && arg0 == local60) {
				return false;
			}
			Static51.anInt1362 = 1;
		}
		@Pc(1008) byte local1008 = 0;
		anIntArray280[0] = local7;
		local68 = local1008 + 1;
		Static87.anIntArray139[0] = local60;
		local201 = local809 = Static106.anIntArrayArray23[local7][local60];
		while (local7 != arg9 || arg0 != local60) {
			if (local201 != local809) {
				anIntArray280[local68] = local7;
				Static87.anIntArray139[local68++] = local60;
				local809 = local201;
			}
			if ((local201 & 0x1) != 0) {
				local60++;
			} else if ((local201 & 0x4) != 0) {
				local60--;
			}
			if ((local201 & 0x2) != 0) {
				local7++;
			} else if ((local201 & 0x8) != 0) {
				local7--;
			}
			local201 = Static106.anIntArrayArray23[local7][local60];
		}
		if (local68 > 0) {
			local82 = local68;
			if (local68 > 25) {
				local82 = 25;
			}
			local68--;
			@Pc(1103) int local1103 = anIntArray280[local68];
			local816 = Static87.anIntArray139[local68];
			if (arg2 == 0) {
				Static57.aClass2_Sub9_Sub1_2.method673(120);
				Static57.aClass2_Sub9_Sub1_2.method644(local82 + local82 + 3);
			}
			if (arg2 == 1) {
				Static57.aClass2_Sub9_Sub1_2.method673(95);
				Static57.aClass2_Sub9_Sub1_2.method644(local82 + local82 + 17);
			}
			if (arg2 == 2) {
				Static57.aClass2_Sub9_Sub1_2.method673(74);
				Static57.aClass2_Sub9_Sub1_2.method644(local82 + local82 + 3);
			}
			Static57.aClass2_Sub9_Sub1_2.method616(local816 + Static29.anInt720);
			Static57.aClass2_Sub9_Sub1_2.method645(Static107.anInt2546 + local1103);
			Static57.aClass2_Sub9_Sub1_2.method636(Static51.aBooleanArray14[82] ? 1 : 0);
			Static66.anInt1743 = anIntArray280[0];
			Static58.anInt1517 = Static87.anIntArray139[0];
			for (local823 = 1; local823 < local82; local823++) {
				local68--;
				Static57.aClass2_Sub9_Sub1_2.method644(anIntArray280[local68] - local1103);
				Static57.aClass2_Sub9_Sub1_2.method636(Static87.anIntArray139[local68] - local816);
			}
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	public static void method1789() {
		aClass40_1305 = null;
		aClass2_Sub1_Sub2_Sub1Array85 = null;
		anIntArray280 = null;
		aClass40_1307 = null;
		aClass40_1306 = null;
		aClass40_1308 = null;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)I")
	public static int method1790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
