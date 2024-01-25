import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!cp;")
	public static final Class39 aClass39_2 = new Class39();

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
	public static final int[] anIntArray131 = new int[4096];

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_38 = new Class103();

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
	public static int[] anIntArray132 = new int[2];

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_34 = new Class85("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([[BI[BI[I[[BI[I)I")
	public static int method1514(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg4[arg1];
		@Pc(13) int local13 = local7 + arg6[arg1];
		@Pc(17) int local17 = arg4[arg3];
		@Pc(23) int local23 = arg6[arg3] + local17;
		@Pc(25) int local25 = local7;
		if (local17 > local7) {
			local25 = local17;
		}
		@Pc(32) int local32 = local13;
		if (local23 < local13) {
			local32 = local23;
		}
		@Pc(43) int local43 = arg2[arg1] & 0xFF;
		if (local43 > (arg2[arg3] & 0xFF)) {
			local43 = arg2[arg3] & 0xFF;
		}
		@Pc(64) byte[] local64 = arg5[arg1];
		@Pc(68) byte[] local68 = arg0[arg3];
		@Pc(77) int local77 = local25 - local7;
		@Pc(82) int local82 = local25 - local17;
		for (@Pc(84) int local84 = local25; local84 < local32; local84++) {
			@Pc(95) int local95 = local68[local82++] + local64[local77++];
			if (local95 < local43) {
				local43 = local95;
			}
		}
		return -local43;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Z")
	public static boolean method1515() {
		return Static186.aBoolean286;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method1516() {
		if (Static288.anInt5652 == -1 || Static78.anInt1476 == -1) {
			return;
		}
		@Pc(21) int local21 = ((Static166.anInt3324 - Static86.anInt1610) * Static1.anInt10 >> 16) + Static86.anInt1610;
		Static1.anInt10 += local21;
		if (Static1.anInt10 >= 65535) {
			if (Static36.aBoolean45) {
				Static51.aBoolean68 = false;
			} else {
				Static51.aBoolean68 = true;
			}
			Static1.anInt10 = 65535;
			Static36.aBoolean45 = true;
		} else {
			Static36.aBoolean45 = false;
			Static51.aBoolean68 = false;
		}
		@Pc(51) float local51 = (float) Static1.anInt10 / 65535.0F;
		@Pc(54) float[] local54 = new float[3];
		@Pc(58) int local58 = Static118.anInt2193 * 2;
		@Pc(83) int local83;
		@Pc(117) int local117;
		@Pc(125) int local125;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(155) int local155;
		for (@Pc(60) int local60 = 0; local60 < 3; local60++) {
			@Pc(71) int local71 = Static155.anIntArrayArrayArray7[Static288.anInt5652][local58][local60] * 3;
			local83 = Static155.anIntArrayArrayArray7[Static288.anInt5652][local58 + 1][local60] * 3;
			local117 = (Static155.anIntArrayArrayArray7[Static288.anInt5652][local58 + 2][local60] + Static155.anIntArrayArrayArray7[Static288.anInt5652][local58 + 2][local60] - Static155.anIntArrayArrayArray7[Static288.anInt5652][local58 + 3][local60]) * 3;
			local125 = Static155.anIntArrayArrayArray7[Static288.anInt5652][local58][local60];
			local129 = local83 - local71;
			local137 = local117 + local71 - local83 * 2;
			local155 = Static155.anIntArrayArrayArray7[Static288.anInt5652][local58 + 2][local60] + local83 - local125 - local117;
			local54[local60] = local51 * ((float) local129 + ((float) local155 * local51 + (float) local137) * local51) + (float) local125;
		}
		Static271.anInt5301 = (int) local54[0] - Static172.anInt4394 * 128;
		Static21.anInt466 = (int) local54[2] - Static12.anInt3797 * 128;
		Static102.anInt1934 = (int) local54[1] * -1;
		@Pc(209) float[] local209 = new float[3];
		local83 = Static278.anInt5483 * 2;
		for (local117 = 0; local117 < 3; local117++) {
			local125 = Static155.anIntArrayArrayArray7[Static78.anInt1476][local83][local117] * 3;
			local129 = Static155.anIntArrayArrayArray7[Static78.anInt1476][local83 + 1][local117] * 3;
			local137 = (Static155.anIntArrayArrayArray7[Static78.anInt1476][local83 + 2][local117] + Static155.anIntArrayArrayArray7[Static78.anInt1476][local83 + 2][local117] - Static155.anIntArrayArrayArray7[Static78.anInt1476][local83 + 3][local117]) * 3;
			local155 = Static155.anIntArrayArrayArray7[Static78.anInt1476][local83][local117];
			@Pc(284) int local284 = local129 - local125;
			@Pc(293) int local293 = local137 + local125 - local129 * 2;
			@Pc(310) int local310 = Static155.anIntArrayArrayArray7[Static78.anInt1476][local83 + 2][local117] + local129 - local155 - local137;
			local209[local117] = ((float) local284 + ((float) local310 * local51 + (float) local293) * local51) * local51 + (float) local155;
		}
		@Pc(345) float local345 = local209[0] - local54[0];
		@Pc(356) float local356 = (local209[1] - local54[1]) * -1.0F;
		@Pc(365) float local365 = local209[2] - local54[2];
		@Pc(375) double local375 = Math.sqrt((double) (local345 * local345 + local365 * local365));
		Static42.anInt731 = (int) (Math.atan2((double) local356, local375) * 2607.5945876176133D) & 0x3FFF;
		Static258.anInt5088 = (int) (-Math.atan2((double) local345, (double) local365) * 2607.5945876176133D) & 0x3FFF;
		Static304.anInt5915 = ((Static155.anIntArrayArrayArray7[Static288.anInt5652][local58 + 2][3] - Static155.anIntArrayArrayArray7[Static288.anInt5652][local58][3]) * Static1.anInt10 >> 16) + Static155.anIntArrayArrayArray7[Static288.anInt5652][local58][3];
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method1518() {
		try {
			if (Static250.anInt4969 == 1) {
				@Pc(12) int local12 = Static188.aClass5_Sub16_Sub1_3.method1665();
				if (local12 > 0 && Static188.aClass5_Sub16_Sub1_3.method1696()) {
					local12 -= Static5.anInt95;
					if (local12 < 0) {
						local12 = 0;
					}
					Static188.aClass5_Sub16_Sub1_3.method1674(local12);
					return;
				}
				Static188.aClass5_Sub16_Sub1_3.method1660();
				Static188.aClass5_Sub16_Sub1_3.method1670();
				if (Static56.aClass93_22 == null) {
					Static250.anInt4969 = 0;
				} else {
					Static250.anInt4969 = 2;
				}
				Static162.aClass5_Sub6_2 = null;
				Static193.aClass217_2 = null;
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static188.aClass5_Sub16_Sub1_3.method1660();
			Static162.aClass5_Sub6_2 = null;
			Static193.aClass217_2 = null;
			Static56.aClass93_22 = null;
			Static250.anInt4969 = 0;
		}
	}
}
