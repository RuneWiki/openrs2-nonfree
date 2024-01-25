import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "[I")
	public static final int[] anIntArray17 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_5 = new Class208(51, 0);

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_5 = new Class62("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
	public static final int[] anIntArray20 = new int[4096];

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[I")
	public static final int[] anIntArray21 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V")
	public static void method96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static86.method1459(Static69.anInt1551, arg3, Static317.anInt5793);
		@Pc(17) int local17 = Static86.method1459(Static69.anInt1551, arg2, Static317.anInt5793);
		@Pc(23) int local23 = Static86.method1459(Static121.anInt6758, arg0, Static179.anInt3768);
		@Pc(29) int local29 = Static86.method1459(Static121.anInt6758, arg5, Static179.anInt3768);
		@Pc(42) int local42 = Static86.method1459(Static69.anInt1551, arg1 + arg3, Static317.anInt5793);
		@Pc(50) int local50 = Static86.method1459(Static69.anInt1551, arg2 - arg1, Static317.anInt5793);
		for (@Pc(52) int local52 = local11; local52 < local42; local52++) {
			Static307.method5019(Static152.anIntArrayArray30[local52], local29, arg4, local23);
		}
		for (@Pc(72) int local72 = local17; local72 > local50; local72--) {
			Static307.method5019(Static152.anIntArrayArray30[local72], local29, arg4, local23);
		}
		@Pc(94) int local94 = Static86.method1459(Static121.anInt6758, arg1 + arg0, Static179.anInt3768);
		@Pc(103) int local103 = Static86.method1459(Static121.anInt6758, arg5 - arg1, Static179.anInt3768);
		for (@Pc(105) int local105 = local42; local105 <= local50; local105++) {
			@Pc(111) int[] local111 = Static152.anIntArrayArray30[local105];
			Static307.method5019(local111, local94, arg4, local23);
			Static307.method5019(local111, local29, arg4, local103);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!gn;)V")
	public static void method98(@OriginalArg(1) Class1_Sub2_Sub1 arg0) {
		@Pc(9) boolean local9 = false;
		if (arg0.anInt5415 == Static339.anInt6265 || arg0.anInt5366 == -1 || arg0.anInt5405 != 0) {
			local9 = true;
		} else {
			@Pc(27) Class102 local27 = Static333.aClass50_2.method1175(arg0.anInt5366);
			if (local27.aBoolean212 || local27.anIntArray229[arg0.anInt5407] < arg0.anInt5367 + 1) {
				local9 = true;
			}
		}
		if (local9) {
			@Pc(59) int local59 = arg0.anInt5415 - arg0.anInt5416;
			@Pc(65) int local65 = Static339.anInt6265 - arg0.anInt5416;
			@Pc(77) int local77 = arg0.anInt5378 * 128 + arg0.method4792() * 64;
			@Pc(89) int local89 = arg0.anInt5392 * 128 + arg0.method4792() * 64;
			@Pc(100) int local100 = arg0.anInt5379 * 128 + arg0.method4792() * 64;
			@Pc(112) int local112 = arg0.anInt5395 * 128 + arg0.method4792() * 64;
			arg0.anInt6800 = (local65 * local100 + local77 * (local59 - local65)) / local59;
			arg0.anInt6798 = (local112 * local65 + (local59 - local65) * local89) / local59;
		}
		arg0.anInt5429 = 0;
		if (arg0.anInt5376 == 0) {
			arg0.method4796(8192);
		}
		if (arg0.anInt5376 == 1) {
			arg0.method4796(12288);
		}
		if (arg0.anInt5376 == 2) {
			arg0.method4796(0);
		}
		if (arg0.anInt5376 == 3) {
			arg0.method4796(4096);
		}
	}
}
