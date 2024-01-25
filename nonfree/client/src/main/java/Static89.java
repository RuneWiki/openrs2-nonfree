import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
	public static int anInt2681 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(FZIFIFLclient!cn;IFI[BFII)V")
	public static void method2284(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) Class53 arg4, @OriginalArg(8) float arg5, @OriginalArg(10) byte[] arg6, @OriginalArg(11) float arg7, @OriginalArg(13) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(60) int local60;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg1;
			arg4.method5030(arg3 / (float) 16, arg8, arg5 * 127.0F, 0, arg0 / (float) 128, arg7 / (float) 128, local12);
			arg7 *= 2.0F;
			arg3 *= 2.0F;
			arg5 *= arg2;
			arg0 *= 2.0F;
			for (local60 = 0; local60 < 16384; local60++) {
				arg6[local18] = (byte) (int) ((float) arg6[local18] + local12[local60]);
				local18++;
			}
		}
		local18 = arg1;
		for (local60 = 0; local60 < 16384; local60++) {
			arg6[local18] = (byte) (arg6[local18] + 127);
			local18++;
		}
	}
}
