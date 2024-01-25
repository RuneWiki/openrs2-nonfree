import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!ph;")
	public static Class187 aClass187_23;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Z")
	public static boolean aBoolean73;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray9 = new byte[1000][];

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!je;")
	public static final Class127 aClass127_4 = new Class127(1, 2, 2, 0);

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!cd;")
	public static final Class36 aClass36_5 = new Class36("", 12);

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "Lclient!os;")
	public static final Class182 aClass182_54 = new Class182("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(FB)F")
	public static float method1066(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILclient!za;IIII)V")
	public static void method1068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface10 local11 = (Interface10) Static96.method1755(arg4, arg6, arg0);
		@Pc(20) Class126 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(46) int local46;
		if (local11 != null) {
			local20 = Static342.aClass237_4.method5212(local11.method5706());
			local26 = local11.method5705() & 0x3;
			local30 = local11.method5702();
			if (local20.anInt3783 == -1) {
				local46 = arg2;
				if (local20.anInt3778 > 0) {
					local46 = arg1;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg3.method5831(4, arg7, arg5, local46);
					} else if (local26 == 1) {
						arg3.method5870(4, local46, arg5, arg7);
					} else if (local26 == 2) {
						arg3.method5831(4, arg7 + 3, arg5, local46);
					} else if (local26 == 3) {
						arg3.method5870(4, local46, arg5 + 3, arg7);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg3.method5853(arg5, arg7, local46, 1, 1);
					} else if (local26 == 1) {
						arg3.method5853(arg5, arg7 + 3, local46, 1, 1);
					} else if (local26 == 2) {
						arg3.method5853(arg5 + 3, arg7 + 3, local46, 1, 1);
					} else if (local26 == 3) {
						arg3.method5853(arg5 + 3, arg7, local46, 1, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg3.method5870(4, local46, arg5, arg7);
					} else if (local26 == 1) {
						arg3.method5831(4, arg7 + 3, arg5, local46);
					} else if (local26 == 2) {
						arg3.method5870(4, local46, arg5 + 3, arg7);
					} else if (local26 == 3) {
						arg3.method5831(4, arg7, arg5, local46);
					}
				}
			} else {
				Static368.method4942(local26, arg7, arg5, local20, arg3);
			}
		}
		local11 = (Interface10) Static106.method1867(arg4, arg6, arg0, rj.class);
		if (local11 != null) {
			local20 = Static342.aClass237_4.method5212(local11.method5706());
			local26 = local11.method5705() & 0x3;
			local30 = local11.method5702();
			if (local20.anInt3783 != -1) {
				Static368.method4942(local26, arg7, arg5, local20, arg3);
			} else if (local30 == 9) {
				local46 = -1118482;
				if (local20.anInt3778 > 0) {
					local46 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg3.method5840(arg7, arg5, arg5 + 3, arg7 + 3, local46);
				} else {
					arg3.method5840(arg7, arg5 + 3, arg5, arg7 + 3, local46);
				}
			}
		}
		local11 = (Interface10) Static447.method5138(arg4, arg6, arg0);
		if (local11 == null) {
			return;
		}
		local20 = Static342.aClass237_4.method5212(local11.method5706());
		local26 = local11.method5705() & 0x3;
		if (local20.anInt3783 != -1) {
			Static368.method4942(local26, arg7, arg5, local20, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIFIIFIF)[F")
	public static float[] method1069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[6] = -local25;
		local6[4] = 1.0F;
		local6[8] = local17;
		local6[5] = 0;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[3] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg1 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(83) float local83 = 1.0F - local77;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg5 * arg5 + arg0 * arg0));
		if (local106 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local79 = (float) arg5 / local106;
				local72 = (float) -arg0 / local106;
			}
			local70[8] = local77 + local83 * local79 * local79;
			local70[4] = local77;
			local70[6] = local72 * local79 * local83;
			local70[5] = local94 * local72;
			local70[2] = local83 * local72 * local79;
			local70[3] = -local79 * local94;
			local70[0] = local72 * local72 * local83 + local77;
			local70[1] = local94 * local79;
			local70[7] = -local72 * local94;
			local9[0] = local70[6] * local6[2] + local6[0] * local70[0] + local6[1] * local70[3];
			local9[1] = local70[7] * local6[2] + local70[4] * local6[1] + local6[0] * local70[1];
			local9[3] = local70[3] * local6[4] + local70[0] * local6[3] + local70[6] * local6[5];
			local9[2] = local6[0] * local70[2] + local70[5] * local6[1] + local70[8] * local6[2];
			local9[4] = local70[7] * local6[5] + local6[3] * local70[1] + local6[4] * local70[4];
			local9[6] = local6[8] * local70[6] + local70[3] * local6[7] + local6[6] * local70[0];
			local9[5] = local6[4] * local70[5] + local70[2] * local6[3] + local6[5] * local70[8];
			local9[7] = local70[1] * local6[6] + local70[4] * local6[7] + local70[7] * local6[8];
			local9[8] = local70[8] * local6[8] + local70[2] * local6[6] + local6[7] * local70[5];
		}
		local9[5] *= arg4;
		local9[6] *= arg2;
		local9[0] *= arg6;
		local9[2] *= arg6;
		local9[4] *= arg4;
		local9[8] *= arg2;
		local9[7] *= arg2;
		local9[3] *= arg4;
		local9[1] *= arg6;
		return local9;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1071(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
