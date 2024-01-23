import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array3;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "[[[Lclient!ee;")
	public static Class2_Sub13[][][] aClass2_Sub13ArrayArrayArray2;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	public static int anInt2007 = 0;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
	public static int anInt2010 = 0;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString69 = null;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "()V")
	public static void method1542() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glDisableClientState(32886);
		Static116.method1974(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static116.method1947();
		for (@Pc(19) int local19 = 0; local19 < Static296.aClass2_Sub32ArrayArray4[0].length; local19++) {
			@Pc(31) Class2_Sub32 local31 = Static296.aClass2_Sub32ArrayArray4[0][local19];
			if (local31.anInt6048 >= 0 && Static48.method888(Static1.anInterface3_1.method4135(local31.anInt6048))) {
				local1.glColor4fv(Static4.method101(local31.anInt6051), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean401 ? 1.0F : 0.5F);
				local31.method4751(Static52.aClass2_Sub13ArrayArrayArray1, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static116.method1953();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static116.method1958();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([IILclient!vb;Lclient!sd;[[FII[[I[[FI[[F)V")
	public static void method1543(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class183 arg2, @OriginalArg(3) Class156 arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[][] arg9) {
		@Pc(15) int[] local15 = new int[arg0.length / 2];
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(31) int local31 = arg0[local17 + local17];
			@Pc(39) int local39 = arg0[local17 + local17 + 1];
			@Pc(67) int local67;
			if (arg8 == 1) {
				local67 = local31;
				local31 = local39;
				local39 = 128 - local67;
			} else if (arg8 == 2) {
				local31 = 128 - local31;
				local39 = 128 - local39;
			} else if (arg8 == 3) {
				local67 = local31;
				local31 = 128 - local39;
				local39 = local67;
			}
			@Pc(128) float local128;
			@Pc(138) float local138;
			@Pc(118) float local118;
			if (local31 == 0 && local39 == 0) {
				local118 = arg9[arg5][arg1];
				local128 = arg7[arg5][arg1];
				local138 = arg4[arg5][arg1];
			} else if (local31 == 128 && local39 == 0) {
				local128 = arg7[arg5 + 1][arg1];
				local118 = arg9[arg5 + 1][arg1];
				local138 = arg4[arg5 + 1][arg1];
			} else if (local31 == 128 && local39 == 128) {
				local118 = arg9[arg5 + 1][arg1 + 1];
				local128 = arg7[arg5 + 1][arg1 + 1];
				local138 = arg4[arg5 + 1][arg1 + 1];
			} else if (local31 == 0 && local39 == 128) {
				local128 = arg7[arg5][arg1 + 1];
				local118 = arg9[arg5][arg1 + 1];
				local138 = arg4[arg5][arg1 + 1];
			} else {
				@Pc(153) float local153 = (float) local31 / 128.0F;
				local128 = arg7[arg5][arg1];
				@Pc(174) float local174 = local128 + (arg7[arg5 + 1][arg1] - local128) * local153;
				@Pc(179) float local179 = (float) local39 / 128.0F;
				local118 = arg9[arg5][arg1];
				@Pc(193) float local193 = arg7[arg5][arg1 + 1];
				@Pc(210) float local210 = local193 + (arg7[arg5 + 1][arg1 + 1] - local193) * local153;
				local128 = local174 + (local210 - local174) * local179;
				@Pc(226) float local226 = arg9[arg5][arg1 + 1];
				@Pc(234) float local234 = arg4[arg5][arg1 + 1];
				@Pc(248) float local248 = local118 + (arg9[arg5 + 1][arg1] - local118) * local153;
				@Pc(265) float local265 = local234 + local153 * (arg4[arg5 + 1][arg1 + 1] - local234);
				local138 = arg4[arg5][arg1];
				@Pc(288) float local288 = local226 + local153 * (arg9[arg5 + 1][arg1 + 1] - local226);
				local118 = local248 + local179 * (local288 - local248);
				@Pc(310) float local310 = local138 + (arg4[arg5 + 1][arg1] - local138) * local153;
				local138 = local310 + local179 * (local265 - local310);
			}
			@Pc(398) int local398 = Static128.method2318(arg5, local31, arg1, arg6, local39);
			@Pc(404) int local404 = (arg1 << 7) + local39;
			@Pc(410) int local410 = local31 + (arg5 << 7);
			local15[local17] = arg2.method4498(arg3, local410, local398, local404, local118, local128, local138);
		}
		arg2.method4496(local15);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
	public static int method1544() {
		return Static72.aBoolean117 && Static145.aBooleanArray13[81] && Static68.anInt1741 > 2 ? Static131.anIntArray297[Static68.anInt1741 - 2] : Static131.anIntArray297[Static68.anInt1741 - 1];
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)V")
	public static void method1545(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static273.anInt5422 += arg0 * 128;
		@Pc(55) int local55;
		if (Static273.anInt5422 > Static45.anIntArray157.length) {
			Static273.anInt5422 -= Static45.anIntArray157.length;
			local55 = (int) (Math.random() * 12.0D);
			Static263.method4147(Static122.aClass93_Sub1Array1[local55]);
		}
		@Pc(67) int local67 = (256 - arg0) * 128;
		local55 = 0;
		@Pc(73) int local73 = arg0 * 128;
		@Pc(75) int local75;
		@Pc(104) int local104;
		for (local75 = 0; local75 < local67; local75++) {
			local104 = Static185.anIntArray528[local55 + local73] - Static45.anIntArray157[Static45.anIntArray157.length - 1 & local55 + Static273.anInt5422] * arg0 / 6;
			if (local104 < 0) {
				local104 = 0;
			}
			Static185.anIntArray528[local55++] = local104;
		}
		@Pc(130) int local130;
		@Pc(138) int local138;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local104 = local75 * 128;
			for (local130 = 0; local130 < 128; local130++) {
				local138 = (int) (Math.random() * 100.0D);
				if (local138 < 50 && local130 > 10 && local130 < 118) {
					Static185.anIntArray528[local130 + local104] = 255;
				} else {
					Static185.anIntArray528[local104 + local130] = 0;
				}
			}
		}
		for (local75 = 0; local75 < 256 - arg0; local75++) {
			Static263.anIntArray495[local75] = Static263.anIntArray495[local75 + arg0];
		}
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			Static263.anIntArray495[local75] = (int) (Math.sin((double) Static275.anInt5449 / 14.0D) * 16.0D + Math.sin((double) Static275.anInt5449 / 15.0D) * 14.0D + Math.sin((double) Static275.anInt5449 / 16.0D) * 12.0D);
			Static275.anInt5449++;
		}
		Static302.anInt5844 += arg0;
		local75 = (arg0 + (Static268.anInt5236 & 0x1)) / 2;
		if (local75 <= 0) {
			return;
		}
		for (local104 = 0; local104 < Static302.anInt5844; local104++) {
			local130 = (int) (Math.random() * 124.0D) + 2;
			local138 = (int) (Math.random() * 128.0D) + 128;
			Static185.anIntArray528[(local138 << 7) + local130] = 192;
		}
		Static302.anInt5844 = 0;
		@Pc(300) int local300;
		for (local104 = 0; local104 < 256; local104++) {
			local130 = 0;
			local138 = local104 * 128;
			for (local300 = -local75; local300 < 128; local300++) {
				if (local75 + local300 < 128) {
					local130 += Static185.anIntArray528[local138 + local300 + local75];
				}
				if (local300 - local75 - 1 >= 0) {
					local130 -= Static185.anIntArray528[local138 + local300 - local75 - 1];
				}
				if (local300 >= 0) {
					Static122.anIntArray237[local300 + local138] = local130 / (local75 * 2 + 1);
				}
			}
		}
		for (local104 = 0; local104 < 128; local104++) {
			local130 = 0;
			for (local138 = -local75; local138 < 256; local138++) {
				local300 = local138 * 128;
				if (local75 + local138 < 256) {
					local130 += Static122.anIntArray237[local104 + local300 + local75 * 128];
				}
				if (local138 - local75 - 1 >= 0) {
					local130 -= Static122.anIntArray237[local300 + local104 - (local75 + 1) * 128];
				}
				if (local138 >= 0) {
					Static185.anIntArray528[local104 + local300] = local130 / (local75 * 2 + 1);
				}
			}
		}
	}
}
