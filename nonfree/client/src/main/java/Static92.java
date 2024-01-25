import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "Lclient!oi;")
	public static Class185 aClass185_65;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_54 = new Class142("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
	public static final int anInt4212 = 4;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_55 = new Class142("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
	public static int anInt4214 = 0;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "[I")
	public static final int[] anIntArray309 = new int[500];

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_56 = new Class142("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg0 && arg5 == arg8 && arg1 == arg3 && arg2 == arg4) {
			Static72.method929(arg3, arg0, arg2, arg7, arg5);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg5;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg5 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg4 * 3;
		@Pc(68) int local68 = local46 + arg3 - arg0 - local54;
		@Pc(77) int local77 = local50 + arg2 - local58 - arg5;
		@Pc(88) int local88 = local54 + local38 - local46 - local46;
		@Pc(98) int local98 = local58 + local42 - local50 - local50;
		@Pc(102) int local102 = local46 - local38;
		@Pc(107) int local107 = local50 - local42;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(117) int local117 = local109 * local109 >> 12;
			@Pc(123) int local123 = local117 * local109 >> 12;
			@Pc(127) int local127 = local68 * local123;
			@Pc(131) int local131 = local123 * local77;
			@Pc(135) int local135 = local117 * local88;
			@Pc(139) int local139 = local117 * local98;
			@Pc(143) int local143 = local102 * local109;
			@Pc(147) int local147 = local107 * local109;
			@Pc(157) int local157 = (local143 + local135 + local127 >> 12) + arg0;
			@Pc(167) int local167 = arg5 + (local147 + local139 + local131 >> 12);
			Static72.method929(local157, local32, local167, arg7, local34);
			local34 = local167;
			local32 = local157;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)Z")
	public static boolean method3325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	public static void method3328() {
		if (Static126.aClass19_Sub1_1.method3353(Static214.anInt3968) || Static390.anInt6272 == Static130.anInt2040) {
			Static217.method988(Static186.aClass117_3);
			if (Static12.anInt198 != Static390.anInt6272) {
				Static355.method4638();
			}
		} else {
			Static282.method3774(10, Static122.anInt1849, false, Static1.anInt19);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
	public static void method3330() {
		@Pc(1) Class77 local1 = Static309.aClass77_37;
		synchronized (Static309.aClass77_37) {
			Static309.aClass77_37.method1386(5);
		}
		local1 = Static185.aClass77_25;
		synchronized (Static185.aClass77_25) {
			Static185.aClass77_25.method1386(5);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILclient!eb;IIILclient!za;IIIILclient!e;II)Lclient!e;")
	public static Class8 method3331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class64 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class117 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class8 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg11 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method1059(-1, false, arg9) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg13 << 48) + (long) (arg12 - (-(arg0 << 16) - (arg4 << 24))) + ((long) arg5 << 32);
		@Pc(50) Class77 local50 = Static85.aClass77_52;
		@Pc(58) Class8 local58;
		synchronized (Static85.aClass77_52) {
			local58 = (Class8) Static85.aClass77_52.method1387(local48);
		}
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(168) int local168;
		if (local58 == null || arg6.method5732(local58.RA(), local11) != 0) {
			if (local58 != null) {
				local11 = arg6.method5696(local11, local58.RA());
			}
			@Pc(90) byte local90;
			if (arg12 == 1) {
				local90 = 9;
			} else if (arg12 == 2) {
				local90 = 12;
			} else if (arg12 == 3) {
				local90 = 15;
			} else if (arg12 == 4) {
				local90 = 18;
			} else {
				local90 = 21;
			}
			@Pc(128) int[] local128 = new int[] { 64, 96, 128 };
			@Pc(145) Class147 local145 = new Class147(local90 * 3 + 1, local90 * 2 * 3 - local90, 0);
			local152 = local145.method3300(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local90];
			@Pc(170) int local170;
			@Pc(194) int local194;
			for (local158 = 0; local158 < 3; local158++) {
				local164 = local128[local158];
				local168 = local128[local158];
				for (local170 = 0; local170 < local90; local170++) {
					@Pc(178) int local178 = (local170 << 14) / local90;
					@Pc(186) int local186 = local164 * Class1_Sub29.anIntArray537[local178] >> 15;
					local194 = local168 * Class1_Sub29.anIntArray536[local178] >> 15;
					local156[local158][local170] = local145.method3300(local186, 0, local194);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(241) byte local241 = (byte) (arg4 * local168 + arg0 * local170 >> 8);
				@Pc(286) short local286 = (short) (((arg5 & 0x7F) * local170 + (arg13 & 0x7F) * local168 & 0x7F00) + (local168 * (arg13 & 0xFC00) + local170 * (arg5 & 0xFC00) & 0xFC0000) + (local168 * (arg13 & 0x380) + local170 * (arg5 & 0x380) & 0x38000) >> 8);
				for (local194 = 0; local194 < local90; local194++) {
					if (local164 == 0) {
						local145.method3298((byte) -1, local156[0][(local194 + 1) % local90], local241, local156[0][local194], (short) -1, (byte) 1, local152, local286);
					} else {
						local145.method3298((byte) -1, local156[local164 - 1][(local194 + 1) % local90], local241, local156[local164][(local194 + 1) % local90], (short) -1, (byte) 1, local156[local164 - 1][local194], local286);
						local145.method3298((byte) -1, local156[local164][(local194 + 1) % local90], local241, local156[local164][local194], (short) -1, (byte) 1, local156[local164 - 1][local194], local286);
					}
				}
			}
			local58 = arg6.method5678(local145, local11, Static369.anInt5966, 64, 768);
			@Pc(406) Class77 local406 = Static85.aClass77_52;
			synchronized (Static85.aClass77_52) {
				Static85.aClass77_52.method1396(local58, local48);
			}
		}
		@Pc(430) int local430 = (arg12 << 6) - 1;
		@Pc(433) int local433 = -local430;
		@Pc(436) int local436 = -local430;
		@Pc(438) int local438 = local430;
		local152 = local430;
		if (arg7 != 0) {
			if ((arg7 & 0x2) != 0) {
				local436 -= 128;
			}
			if ((arg7 & 0x1) != 0) {
				local152 = local430 + 128;
			}
			if ((arg7 & 0x4) != 0) {
				local438 = local430 + 128;
			}
			if ((arg7 & 0x8) != 0) {
				local433 -= 128;
			}
		}
		@Pc(468) int local468 = arg11.ta();
		local158 = arg11.MA();
		local164 = arg11.Z();
		if (local433 > local468) {
			local468 = local433;
		}
		local168 = arg11.S();
		if (local438 < local158) {
			local158 = local438;
		}
		if (local436 > local164) {
			local164 = local436;
		}
		if (local168 > local152) {
			local168 = local152;
		}
		@Pc(511) Class1_Sub3_Sub14 local511 = null;
		if (arg3 != null) {
			@Pc(518) int local518 = arg3.anIntArray127[arg9];
			local511 = Static402.aClass37_2.method671(local518 >> 16);
			arg9 = local518 & 0xFFFF;
		}
		if (local511 == null) {
			local58 = local58.method5983((byte) 3, local11, true);
			local58.n(local158 - local468 >> 1, 128, local168 - local164 >> 1);
			local58.a(local468 + local158 >> 1, 0, local164 + local168 >> 1);
		} else {
			local58 = local58.method5983((byte) 3, local11, true);
			local58.n(local158 - local468 >> 1, 128, local168 - local164 >> 1);
			local58.a(local158 + local468 >> 1, 0, local168 + local164 >> 1);
			local58.method5981(local511, arg9);
		}
		if (arg2 != 0) {
			local58.W(arg2);
		}
		if (arg8 != 0) {
			local58.K(arg8);
		}
		if (arg10 != 0) {
			local58.a(0, arg10, 0);
		}
		return local58;
	}
}
