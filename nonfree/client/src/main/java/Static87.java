import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!em", name = "W", descriptor = "I")
	public static int anInt1877;

	@OriginalMember(owner = "client!em", name = "S", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_43 = new Class208(11, 2);

	@OriginalMember(owner = "client!em", name = "T", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_60 = new Class62("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!em", name = "U", descriptor = "I")
	public static int anInt1875 = 0;

	@OriginalMember(owner = "client!em", name = "X", descriptor = "I")
	public static int anInt1878 = 0;

	@OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
	public static int anInt1879 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg2) {
			Static307.method5018(arg0, arg4, arg2, arg6, arg3, arg5);
		} else if (Static179.anInt3768 <= arg5 - arg2 && arg2 + arg5 <= Static121.anInt6758 && Static317.anInt5793 <= arg0 - arg1 && arg0 + arg1 <= Static69.anInt1551) {
			Static334.method5396(arg6, arg5, arg3, arg1, arg0, arg4, arg2);
		} else {
			Static3.method40(arg2, arg0, arg4, arg3, arg1, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ab;B)V")
	public static void method1484(@OriginalArg(0) Class3 arg0) {
		if (!Static45.aBoolean446) {
			return;
		}
		Static77.method1332(Static338.aClass183_99);
		Static76.aClass2_Sub24_Sub2_7.method5734(arg0.anInt94);
		Static76.aClass2_Sub24_Sub2_7.method5715(Static92.anInt1971);
		Static76.aClass2_Sub24_Sub2_7.method5726(arg0.anInt45);
		Static76.aClass2_Sub24_Sub2_7.method5770(Static306.anInt5658);
		Static76.aClass2_Sub24_Sub2_7.method5726(arg0.anInt56);
		Static76.aClass2_Sub24_Sub2_7.method5726(Static67.anInt1508);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static300.method4909(arg3)) {
			Static137.method1144(arg2, Static272.aClass3ArrayArray1[arg3], arg6, arg5, arg7, arg0, arg1, arg4, -1);
		} else if (arg6 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static93.aBooleanArray10[local19] = true;
			}
		} else {
			Static93.aBooleanArray10[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)I")
	public static int method1486(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(160) int local160 = (int) (local60 * 256.0D);
		@Pc(165) int local165 = (int) (local62 * 256.0D);
		@Pc(170) int local170 = (int) (local68 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local170 > 243) {
			local165 >>= 0x4;
		} else if (local170 > 217) {
			local165 >>= 0x3;
		} else if (local170 > 192) {
			local165 >>= 0x2;
		} else if (local170 > 179) {
			local165 >>= 0x1;
		}
		return (local170 >> 1) + (local165 >> 5 << 7) + ((local160 >> 2 & 0x3F) << 10);
	}
}
