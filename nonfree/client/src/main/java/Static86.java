import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "I")
	public static int anInt7215 = 0;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(FFII[FIFIIIIII)V")
	public static void method5986(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg11 - arg6;
		@Pc(9) int local9 = arg2 - arg4;
		@Pc(13) int local13 = arg8 - arg7;
		@Pc(38) float local38 = (float) local13 * arg3[2] + arg3[1] * (float) local5 + (float) local9 * arg3[0];
		@Pc(59) float local59 = (float) local13 * arg3[5] + arg3[4] * (float) local5 + (float) local9 * arg3[3];
		@Pc(80) float local80 = (float) local5 * arg3[7] + arg3[6] * (float) local9 + (float) local13 * arg3[8];
		@Pc(99) float local99;
		@Pc(93) float local93;
		if (arg9 == 0) {
			local93 = arg5 + 0.5F - local80;
			local99 = local38 + arg0 + 0.5F;
		} else if (arg9 == 1) {
			local93 = arg5 + local80 + 0.5F;
			local99 = arg0 + local38 + 0.5F;
		} else if (arg9 == 2) {
			local99 = arg0 + 0.5F - local38;
			local93 = arg1 + 0.5F - local59;
		} else if (arg9 == 3) {
			local93 = arg1 + 0.5F - local59;
			local99 = arg0 + local38 + 0.5F;
		} else if (arg9 == 4) {
			local99 = arg5 + local80 + 0.5F;
			local93 = arg1 + 0.5F - local59;
		} else {
			local93 = arg1 + 0.5F - local59;
			local99 = arg5 + 0.5F - local80;
		}
		@Pc(208) float local208;
		if (arg10 == 1) {
			local208 = local99;
			local99 = -local93;
			local93 = local208;
		} else if (arg10 == 2) {
			local93 = -local93;
			local99 = -local99;
		} else if (arg10 == 3) {
			local208 = local99;
			local99 = local93;
			local93 = -local208;
		}
		Static362.aFloat141 = local99;
		Static403.aFloat204 = local93;
	}
}
