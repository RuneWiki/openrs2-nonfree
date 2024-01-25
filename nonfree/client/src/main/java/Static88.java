import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "Lclient!uu;")
	public static Class251 aClass251_2;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_69 = new Class189(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "[I")
	public static final int[] anIntArray127 = new int[3];

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!br;IIIIIIBIII)Z")
	public static boolean method1661(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg3;
		@Pc(16) int local16 = arg4 - 64;
		Static244.anIntArrayArray30[64][64] = 99;
		@Pc(26) int local26 = arg3 - 64;
		Static117.anIntArrayArray17[64][64] = 0;
		@Pc(34) byte local34 = 0;
		@Pc(36) int local36 = 0;
		Static195.anIntArray244[0] = arg4;
		@Pc(43) int local43 = local34 + 1;
		Static368.anIntArray399[0] = arg3;
		@Pc(48) int[][] local48 = arg0.anIntArrayArray8;
		while (local36 != local43) {
			local5 = Static195.anIntArray244[local36];
			local7 = Static368.anIntArray399[local36];
			@Pc(62) int local62 = local7 - local26;
			local36 = local36 + 1 & 0xFFF;
			@Pc(73) int local73 = local5 - local16;
			@Pc(79) int local79 = local5 - arg0.anInt1055;
			@Pc(84) int local84 = local7 - arg0.anInt1062;
			if (arg6 == -4) {
				if (arg1 == local5 && arg7 == local7) {
					Static107.anInt2387 = local5;
					Static430.anInt3291 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static225.method3377(2, 2, local5, arg5, arg2, arg7, arg1, local7)) {
					Static430.anInt3291 = local7;
					Static107.anInt2387 = local5;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg0.method744(arg1, arg8, arg5, 2, local5, 2, local7, arg7, arg2)) {
					Static107.anInt2387 = local5;
					Static430.anInt3291 = local7;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg0.method757(local5, 2, arg8, arg7, local7, arg2, arg5, arg1)) {
					Static430.anInt3291 = local7;
					Static107.anInt2387 = local5;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg0.method748(arg6, arg1, local7, 2, local5, arg9, arg7)) {
					Static430.anInt3291 = local7;
					Static107.anInt2387 = local5;
					return true;
				}
			} else if (arg0.method747(arg9, 2, arg7, local7, arg6, local5, arg1)) {
				Static430.anInt3291 = local7;
				Static107.anInt2387 = local5;
				return true;
			}
			@Pc(230) int local230 = Static117.anIntArrayArray17[local73][local62] + 1;
			if (local73 > 0 && Static244.anIntArrayArray30[local73 - 1][local62] == 0 && (local48[local79 - 1][local84] & 0x43A40000) == 0 && (local48[local79 - 1][local84 + 1] & 0x4E240000) == 0) {
				Static195.anIntArray244[local43] = local5 - 1;
				Static368.anIntArray399[local43] = local7;
				Static244.anIntArrayArray30[local73 - 1][local62] = 2;
				local43 = local43 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local73 - 1][local62] = local230;
			}
			if (local73 < 126 && Static244.anIntArrayArray30[local73 + 1][local62] == 0 && (local48[local79 + 2][local84] & 0x60E40000) == 0 && (local48[local79 + 2][local84 + 1] & 0x78240000) == 0) {
				Static195.anIntArray244[local43] = local5 + 1;
				Static368.anIntArray399[local43] = local7;
				local43 = local43 + 1 & 0xFFF;
				Static244.anIntArrayArray30[local73 + 1][local62] = 8;
				Static117.anIntArrayArray17[local73 + 1][local62] = local230;
			}
			if (local62 > 0 && Static244.anIntArrayArray30[local73][local62 - 1] == 0 && (local48[local79][local84 - 1] & 0x43A40000) == 0 && (local48[local79 + 1][local84 - 1] & 0x60E40000) == 0) {
				Static195.anIntArray244[local43] = local5;
				Static368.anIntArray399[local43] = local7 - 1;
				Static244.anIntArrayArray30[local73][local62 - 1] = 1;
				local43 = local43 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local73][local62 - 1] = local230;
			}
			if (local62 < 126 && Static244.anIntArrayArray30[local73][local62 + 1] == 0 && (local48[local79][local84 + 2] & 0x4E240000) == 0 && (local48[local79 + 1][local84 + 2] & 0x78240000) == 0) {
				Static195.anIntArray244[local43] = local5;
				Static368.anIntArray399[local43] = local7 + 1;
				Static244.anIntArrayArray30[local73][local62 + 1] = 4;
				local43 = local43 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local73][local62 + 1] = local230;
			}
			if (local73 > 0 && local62 > 0 && Static244.anIntArrayArray30[local73 - 1][local62 - 1] == 0 && (local48[local79 - 1][local84] & 0x4FA40000) == 0 && (local48[local79 - 1][local84 - 1] & 0x43A40000) == 0 && (local48[local79][local84 - 1] & 0x63E40000) == 0) {
				Static195.anIntArray244[local43] = local5 - 1;
				Static368.anIntArray399[local43] = local7 - 1;
				Static244.anIntArrayArray30[local73 - 1][local62 - 1] = 3;
				local43 = local43 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local73 - 1][local62 - 1] = local230;
			}
			if (local73 < 126 && local62 > 0 && Static244.anIntArrayArray30[local73 + 1][local62 - 1] == 0 && (local48[local79 + 1][local84 - 1] & 0x63E40000) == 0 && (local48[local79 + 2][local84 - 1] & 0x60E40000) == 0 && (local48[local79 + 2][local84] & 0x78E40000) == 0) {
				Static195.anIntArray244[local43] = local5 + 1;
				Static368.anIntArray399[local43] = local7 - 1;
				Static244.anIntArrayArray30[local73 + 1][local62 - 1] = 9;
				local43 = local43 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local73 + 1][local62 - 1] = local230;
			}
			if (local73 > 0 && local62 < 126 && Static244.anIntArrayArray30[local73 - 1][local62 + 1] == 0 && (local48[local79 - 1][local84 + 1] & 0x4FA40000) == 0 && (local48[local79 - 1][local84 + 2] & 0x4E240000) == 0 && (local48[local79][local84 + 2] & 0x7E240000) == 0) {
				Static195.anIntArray244[local43] = local5 - 1;
				Static368.anIntArray399[local43] = local7 + 1;
				Static244.anIntArrayArray30[local73 - 1][local62 + 1] = 6;
				local43 = local43 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local73 - 1][local62 + 1] = local230;
			}
			if (local73 < 126 && local62 < 126 && Static244.anIntArrayArray30[local73 + 1][local62 + 1] == 0 && (local48[local79 + 1][local84 + 2] & 0x7E240000) == 0 && (local48[local79 + 2][local84 + 2] & 0x78240000) == 0 && (local48[local79 + 2][local84 + 1] & 0x78E40000) == 0) {
				Static195.anIntArray244[local43] = local5 + 1;
				Static368.anIntArray399[local43] = local7 + 1;
				Static244.anIntArrayArray30[local73 + 1][local62 + 1] = 12;
				local43 = local43 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local73 + 1][local62 + 1] = local230;
			}
		}
		Static107.anInt2387 = local5;
		Static430.anInt3291 = local7;
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!m;IILclient!li;)Lclient!qa;")
	public static Class172 method1662(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class143 arg4) {
		return new Class172_Sub2(arg1, arg0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)B")
	public static byte method1663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII)V")
	public static void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static452.anInt7626 <= arg2 - arg1 && arg1 + arg2 <= Static82.anInt3956 && arg4 - arg1 >= Static341.anInt5789 && Static309.anInt5495 >= arg4 + arg1) {
			Static172.method2768(arg5, arg0, arg4, arg2, arg3, arg1);
		} else {
			Static176.method2817(arg5, arg3, arg0, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBIZ)V")
	public static void method1666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static55.method1137(arg1)) {
			Static262.method3816(arg3, arg2, arg0, -1, Static178.aClass156ArrayArray2[arg1]);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V")
	public static void method1668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static55.method1137(arg1)) {
			Static70.method1397(Static178.aClass156ArrayArray2[arg1], arg0);
		}
	}
}
