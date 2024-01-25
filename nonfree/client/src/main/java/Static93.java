import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	public static int anInt2300;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	public static int anInt2298 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI[BLclient!jq;)Lclient!rga;")
	public static Class286 method2062(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class43_Sub1_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static11.anIntArray20, 0);
		if (Static11.anIntArray20[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class286(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V")
	public static void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(15) int local15 = arg4 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static397.method5820(arg3, arg2, arg1, arg0);
			}
		} else if (local10 == 0) {
			Static534.method7034(arg3, arg2, arg4, arg0);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(65) boolean local65 = local10 > local15;
			@Pc(69) int local69;
			@Pc(73) int local73;
			if (local65) {
				local69 = arg0;
				arg0 = arg3;
				local73 = arg4;
				arg3 = local69;
				arg4 = arg1;
				arg1 = local73;
			}
			if (arg4 < arg0) {
				local69 = arg0;
				local73 = arg3;
				arg0 = arg4;
				arg3 = arg1;
				arg4 = local69;
				arg1 = local73;
			}
			local69 = arg3;
			local73 = arg4 - arg0;
			@Pc(105) int local105 = arg1 - arg3;
			@Pc(110) int local110 = -(local73 >> 1);
			if (local105 < 0) {
				local105 = -local105;
			}
			@Pc(126) int local126 = arg1 > arg3 ? 1 : -1;
			@Pc(130) int local130;
			if (local65) {
				for (local130 = arg0; local130 <= arg4; local130++) {
					local110 += local105;
					Static176.anIntArrayArray28[local130][local69] = arg2;
					if (local110 > 0) {
						local110 -= local73;
						local69 += local126;
					}
				}
			} else {
				for (local130 = arg0; local130 <= arg4; local130++) {
					local110 += local105;
					Static176.anIntArrayArray28[local69][local130] = arg2;
					if (local110 > 0) {
						local110 -= local73;
						local69 += local126;
					}
				}
			}
		}
	}
}
