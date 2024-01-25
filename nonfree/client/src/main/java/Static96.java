import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Lclient!uj;")
	public static Class6_Sub2_Sub15 aClass6_Sub2_Sub15_5;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	public static int anInt5953;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "Ljava/util/Random;")
	public static final Random aRandom3 = new Random();

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!nf;")
	public static final Class170 aClass170_6 = new Class170();

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
	public static int anInt5951 = -1;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
	public static int anInt5952 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIB)Z")
	public static boolean method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg0; local7++) {
			for (@Pc(11) int local11 = arg1; local11 <= arg3; local11++) {
				if (Static320.anIntArrayArray31[local7][local11] == arg2 && Static443.anIntArrayArray60[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!qn;ILclient!ps;I)Lclient!eq;")
	public static synchronized Class66 method5011(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(4) Interface8 arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static255.aBooleanArray15[local14]) {
				local12 = local14;
				break;
			}
		}
		if (local12 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(55) Class66 local55;
		if (arg4 == 0) {
			local55 = Static436.method6325(arg3, local12, arg0);
		} else if (arg4 == 1) {
			local55 = Static382.method3576(arg3, arg2, arg0, arg1, local12);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static255.aBooleanArray15[local12] = true;
		return local55;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIB[B)I")
	public static int method5039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) int local15 = -1;
		for (@Pc(17) int local17 = arg0; local17 < arg1; local17++) {
			local15 = local15 >>> 8 ^ Class12_Sub6.anIntArray362[(arg2[local17] ^ local15) & 0xFF];
		}
		return ~local15;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIBIII)V")
	public static void method5058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static205.method3146(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg4;
		@Pc(27) int local27 = -arg4;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(45) int local45 = -1;
		@Pc(49) int[] local49 = Static62.anIntArrayArray7[arg1];
		@Pc(53) int local53 = arg3 - local15;
		@Pc(57) int local57 = arg3 + local15;
		Static298.method4405(local49, arg0, local53, arg3 - arg4);
		Static298.method4405(local49, arg2, local57, local53);
		Static298.method4405(local49, arg0, arg3 + arg4, local57);
		while (local24 > local10) {
			local34 += 2;
			local45 += 2;
			local32 += local45;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static201.anIntArray321[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(128) int[] local128;
			@Pc(134) int[] local134;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(186) int local186;
			@Pc(190) int local190;
			@Pc(194) int local194;
			if (local27 >= 0) {
				local24--;
				if (local24 >= local15) {
					local128 = Static62.anIntArrayArray7[local24 + arg1];
					local134 = Static62.anIntArrayArray7[arg1 - local24];
					local139 = arg3 + local10;
					local144 = arg3 - local10;
					Static298.method4405(local128, arg0, local139, local144);
					Static298.method4405(local134, arg0, local139, local144);
				} else {
					local128 = Static62.anIntArrayArray7[arg1 + local24];
					local134 = Static62.anIntArrayArray7[arg1 - local24];
					local139 = Static201.anIntArray321[local24];
					local144 = arg3 + local10;
					local186 = arg3 - local10;
					local190 = arg3 + local139;
					local194 = arg3 - local139;
					Static298.method4405(local128, arg0, local194, local186);
					Static298.method4405(local128, arg2, local190, local194);
					Static298.method4405(local128, arg0, local144, local190);
					Static298.method4405(local134, arg0, local194, local186);
					Static298.method4405(local134, arg2, local190, local194);
					Static298.method4405(local134, arg0, local144, local190);
				}
				local27 -= local24 << 1;
			}
			local128 = Static62.anIntArrayArray7[arg1 + local10];
			local134 = Static62.anIntArrayArray7[arg1 - local10];
			local139 = arg3 + local24;
			local144 = arg3 - local24;
			if (local10 < local15) {
				local186 = local29 >= local10 ? local29 : Static201.anIntArray321[local10];
				local190 = local186 + arg3;
				local194 = arg3 - local186;
				Static298.method4405(local128, arg0, local194, local144);
				Static298.method4405(local128, arg2, local190, local194);
				Static298.method4405(local128, arg0, local139, local190);
				Static298.method4405(local134, arg0, local194, local144);
				Static298.method4405(local134, arg2, local190, local194);
				Static298.method4405(local134, arg0, local139, local190);
			} else {
				Static298.method4405(local128, arg0, local139, local144);
				Static298.method4405(local134, arg0, local139, local144);
			}
		}
	}
}
