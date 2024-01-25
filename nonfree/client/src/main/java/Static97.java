import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "Lclient!bh;")
	public static Class1_Sub7_Sub2 aClass1_Sub7_Sub2_2;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIII[BI)V")
	public static void method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		if (arg1 > 0 && !Static230.method3483(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static230.method3483(arg3)) {
			@Pc(34) int local34 = Static219.method5965(arg0);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg3 > arg1 ? arg1 : arg3;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(57) byte[] local57 = arg5;
			@Pc(64) byte[] local64 = new byte[local34 * local55 * local51];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local36, arg2, arg1, arg3, 0, arg0, 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(83) int local83 = arg1 * local34;
				@Pc(85) byte[] local85 = local64;
				for (@Pc(87) int local87 = 0; local87 < local34; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(97) int local97 = local87 + local83;
					for (@Pc(99) int local99 = 0; local99 < local55; local99++) {
						for (@Pc(103) int local103 = 0; local103 < local51; local103++) {
							@Pc(109) byte local109 = local57[local93];
							local93 += local34;
							@Pc(119) int local119 = local109 + local57[local93];
							@Pc(125) int local125 = local119 + local57[local97];
							local93 += local34;
							local97 += local34;
							@Pc(139) int local139 = local125 + local57[local97];
							local97 += local34;
							local64[local91] = (byte) (local139 >> 2);
							local91 += local34;
						}
						local93 += local83;
						local97 += local83;
					}
				}
				local64 = local57;
				arg3 = local55;
				local57 = local85;
				arg1 = local51;
				local36++;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
