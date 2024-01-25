import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Lclient!m;")
	public static Class181 aClass181_7;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	public static int anInt1772 = -50;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(FIFIIIFI)[F")
	public static float[] method1682(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[8] = local17;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[0] = local17;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg6 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(83) float local83 = 1.0F - local77;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3));
		if (local106 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local79 = (float) arg4 / local106;
				local72 = (float) -arg3 / local106;
			}
			local70[5] = local72 * local94;
			local70[4] = local77;
			local70[3] = -local79 * local94;
			local70[2] = local72 * local79 * local83;
			local70[7] = local94 * -local72;
			local70[8] = local77 + local83 * local79 * local79;
			local70[6] = local79 * local72 * local83;
			local70[1] = local94 * local79;
			local70[0] = local72 * local72 * local83 + local77;
			local9[0] = local70[6] * local6[2] + local6[0] * local70[0] + local6[1] * local70[3];
			local9[1] = local6[1] * local70[4] + local6[0] * local70[1] + local6[2] * local70[7];
			local9[2] = local6[1] * local70[5] + local6[0] * local70[2] + local6[2] * local70[8];
			local9[3] = local70[6] * local6[5] + local6[4] * local70[3] + local6[3] * local70[0];
			local9[4] = local6[3] * local70[1] + local70[4] * local6[4] + local6[5] * local70[7];
			local9[6] = local6[8] * local70[6] + local70[0] * local6[6] + local6[7] * local70[3];
			local9[5] = local70[8] * local6[5] + local6[3] * local70[2] + local6[4] * local70[5];
			local9[7] = local6[7] * local70[4] + local6[6] * local70[1] + local70[7] * local6[8];
			local9[8] = local6[7] * local70[5] + local70[2] * local6[6] + local70[8] * local6[8];
		}
		local9[6] *= arg5;
		local9[3] *= arg0;
		local9[2] *= arg2;
		local9[7] *= arg5;
		local9[4] *= arg0;
		local9[0] *= arg2;
		local9[5] *= arg0;
		local9[8] *= arg5;
		local9[1] *= arg2;
		return local9;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIILjava/lang/String;Lclient!dd;ILclient!ra;Lclient!pa;Lclient!wca;BI)V")
	public static void method1685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) Class52 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class47 arg7, @OriginalArg(8) Class209 arg8, @OriginalArg(9) Class310 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static427.anInt7875 == 4) {
			local13 = (int) Static161.aFloat56 & 0x3FFF;
		} else {
			local13 = Static87.anInt1767 + (int) Static161.aFloat56 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg9.anInt9163 / 2, arg9.anInt9198 / 2) + 10;
		@Pc(47) int local47 = arg0 * arg0 + arg2 * arg2;
		if (local47 > local34 * local34) {
			return;
		}
		@Pc(57) int local57 = Class125.anIntArray381[local13];
		@Pc(61) int local61 = Class125.anIntArray382[local13];
		if (Static427.anInt7875 != 4) {
			local61 = local61 * 256 / (Static3.anInt111 + 256);
			local57 = local57 * 256 / (Static3.anInt111 + 256);
		}
		@Pc(90) int local90 = arg2 * local61 + arg0 * local57 >> 15;
		@Pc(101) int local101 = arg0 * local61 - arg2 * local57 >> 15;
		@Pc(108) int local108 = arg5.method1584(null, arg4, 100);
		@Pc(114) int local114 = local90 - local108 / 2;
		@Pc(122) int local122 = arg5.method1589(null, arg4);
		if (local114 >= -arg9.anInt9163 && local114 <= arg9.anInt9163 && local101 >= -arg9.anInt9198 && local101 <= arg9.anInt9198) {
			arg7.method7612(50, arg3 + arg9.anInt9198 / 2 - local122 - local101 - arg1, null, arg3, local108, arg4, arg9.anInt9163 / 2 + arg6 + local114, arg8, 0, null, arg10, 0, arg6);
		}
	}
}
