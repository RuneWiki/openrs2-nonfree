import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "Lclient!g;")
	public static Class83 aClass83_41;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_61 = new Class62("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_62 = new Class62("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_45 = new Class208(83, 5);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V")
	public static void method1493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static135.anInt2943 == 0 || arg2 == 0 || Static277.anInt5160 >= 50 || arg1 == -1) {
			return;
		}
		Static104.anIntArray191[Static277.anInt5160] = arg1;
		Static145.anIntArray459[Static277.anInt5160] = arg2;
		Static321.anIntArray511[Static277.anInt5160] = arg0;
		Static349.aClass80Array1[Static277.anInt5160] = null;
		Static283.anIntArray454[Static277.anInt5160] = 0;
		Static55.anIntArray87[Static277.anInt5160] = arg3;
		Static277.anInt5160++;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIILclient!pe;III)Z")
	public static boolean method1496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class178 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg5 - 64;
		@Pc(22) int local22 = arg2 - 64;
		Static233.anIntArrayArray31[64][64] = 99;
		Static39.anIntArrayArray5[64][64] = 0;
		@Pc(44) byte local44 = 0;
		Static326.anIntArray523[0] = arg5;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local44 + 1;
		Static313.anIntArray503[0] = arg2;
		@Pc(58) int[][] local58 = arg6.anIntArrayArray34;
		while (local53 != local50) {
			local7 = Static326.anIntArray523[local50];
			local9 = Static313.anIntArray503[local50];
			local50 = local50 + 1 & 0xFFF;
			@Pc(78) int local78 = local9 - local22;
			@Pc(83) int local83 = local7 - local18;
			@Pc(89) int local89 = local7 - arg6.anInt4991;
			@Pc(95) int local95 = local9 - arg6.anInt4995;
			if (arg1 == -4) {
				if (local7 == arg3 && arg7 == local9) {
					Static15.anInt269 = local7;
					Static123.anInt5934 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static207.method3777(arg9, arg3, local7, arg7, local9, arg4, 2, 2)) {
					Static15.anInt269 = local7;
					Static123.anInt5934 = local9;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg6.method4477(arg4, 2, arg0, arg7, local9, arg9, local7, arg3, 2)) {
					Static123.anInt5934 = local9;
					Static15.anInt269 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg6.method4478(local7, arg7, 2, local9, arg0, arg3, arg4, arg9)) {
					Static15.anInt269 = local7;
					Static123.anInt5934 = local9;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg6.method4474(arg8, local9, arg7, arg1, arg3, 2, local7)) {
					Static123.anInt5934 = local9;
					Static15.anInt269 = local7;
					return true;
				}
			} else if (arg6.method4475(local7, arg7, arg8, arg3, local9, 2, arg1)) {
				Static15.anInt269 = local7;
				Static123.anInt5934 = local9;
				return true;
			}
			@Pc(257) int local257 = Static39.anIntArrayArray5[local83][local78] + 1;
			if (local83 > 0 && Static233.anIntArrayArray31[local83 - 1][local78] == 0 && (local58[local89 - 1][local95] & 0x43A40000) == 0 && (local58[local89 - 1][local95 + 1] & 0x4E240000) == 0) {
				Static326.anIntArray523[local53] = local7 - 1;
				Static313.anIntArray503[local53] = local9;
				Static233.anIntArrayArray31[local83 - 1][local78] = 2;
				local53 = local53 + 1 & 0xFFF;
				Static39.anIntArrayArray5[local83 - 1][local78] = local257;
			}
			if (local83 < 126 && Static233.anIntArrayArray31[local83 + 1][local78] == 0 && (local58[local89 + 2][local95] & 0x60E40000) == 0 && (local58[local89 + 2][local95 + 1] & 0x78240000) == 0) {
				Static326.anIntArray523[local53] = local7 + 1;
				Static313.anIntArray503[local53] = local9;
				local53 = local53 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local83 + 1][local78] = 8;
				Static39.anIntArrayArray5[local83 + 1][local78] = local257;
			}
			if (local78 > 0 && Static233.anIntArrayArray31[local83][local78 - 1] == 0 && (local58[local89][local95 - 1] & 0x43A40000) == 0 && (local58[local89 + 1][local95 - 1] & 0x60E40000) == 0) {
				Static326.anIntArray523[local53] = local7;
				Static313.anIntArray503[local53] = local9 - 1;
				Static233.anIntArrayArray31[local83][local78 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static39.anIntArrayArray5[local83][local78 - 1] = local257;
			}
			if (local78 < 126 && Static233.anIntArrayArray31[local83][local78 + 1] == 0 && (local58[local89][local95 + 2] & 0x4E240000) == 0 && (local58[local89 + 1][local95 + 2] & 0x78240000) == 0) {
				Static326.anIntArray523[local53] = local7;
				Static313.anIntArray503[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local83][local78 + 1] = 4;
				Static39.anIntArrayArray5[local83][local78 + 1] = local257;
			}
			if (local83 > 0 && local78 > 0 && Static233.anIntArrayArray31[local83 - 1][local78 - 1] == 0 && (local58[local89 - 1][local95] & 0x4FA40000) == 0 && (local58[local89 - 1][local95 - 1] & 0x43A40000) == 0 && (local58[local89][local95 - 1] & 0x63E40000) == 0) {
				Static326.anIntArray523[local53] = local7 - 1;
				Static313.anIntArray503[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local83 - 1][local78 - 1] = 3;
				Static39.anIntArrayArray5[local83 - 1][local78 - 1] = local257;
			}
			if (local83 < 126 && local78 > 0 && Static233.anIntArrayArray31[local83 + 1][local78 - 1] == 0 && (local58[local89 + 1][local95 - 1] & 0x63E40000) == 0 && (local58[local89 + 2][local95 - 1] & 0x60E40000) == 0 && (local58[local89 + 2][local95] & 0x78E40000) == 0) {
				Static326.anIntArray523[local53] = local7 + 1;
				Static313.anIntArray503[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local83 + 1][local78 - 1] = 9;
				Static39.anIntArrayArray5[local83 + 1][local78 - 1] = local257;
			}
			if (local83 > 0 && local78 < 126 && Static233.anIntArrayArray31[local83 - 1][local78 + 1] == 0 && (local58[local89 - 1][local95 + 1] & 0x4FA40000) == 0 && (local58[local89 - 1][local95 + 2] & 0x4E240000) == 0 && (local58[local89][local95 + 2] & 0x7E240000) == 0) {
				Static326.anIntArray523[local53] = local7 - 1;
				Static313.anIntArray503[local53] = local9 + 1;
				Static233.anIntArrayArray31[local83 - 1][local78 + 1] = 6;
				local53 = local53 + 1 & 0xFFF;
				Static39.anIntArrayArray5[local83 - 1][local78 + 1] = local257;
			}
			if (local83 < 126 && local78 < 126 && Static233.anIntArrayArray31[local83 + 1][local78 + 1] == 0 && (local58[local89 + 1][local95 + 2] & 0x7E240000) == 0 && (local58[local89 + 2][local95 + 2] & 0x78240000) == 0 && (local58[local89 + 2][local95 + 1] & 0x78E40000) == 0) {
				Static326.anIntArray523[local53] = local7 + 1;
				Static313.anIntArray503[local53] = local9 + 1;
				Static233.anIntArrayArray31[local83 + 1][local78 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static39.anIntArrayArray5[local83 + 1][local78 + 1] = local257;
			}
		}
		Static15.anInt269 = local7;
		Static123.anInt5934 = local9;
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLclient!cr;Ljava/lang/String;Z)V")
	public static void method1497(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) String arg2) {
		@Pc(20) int local20 = Static209.aClass24_6.method331(250, null, arg2);
		@Pc(29) int local29 = Static209.aClass24_6.method324(null, arg2, 250) * 13;
		Static383.aClass48_9.method2470(6, 6, local20 + 4 + 4, local29 - -4 - -4, -16777216, 0);
		Static383.aClass48_9.method2534(6, 6, local20 + 4 + 4, local29 + 4 + 4, -1, 0);
		arg1.method4660(1, null, 10, null, 1, 0, local20, 0, null, 10, arg2, -1, 0, local29, -1);
		Static330.method5311(6, local20 + 8, 6, local29 + 8);
		if (arg0) {
			Static383.aClass48_9.method2538();
		}
	}
}
