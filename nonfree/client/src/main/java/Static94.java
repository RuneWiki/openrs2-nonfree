import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!gg;")
	public static Class84 aClass84_3;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[250][];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V")
	public static void method1834() {
		Static204.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([IIIIIIII)V")
	public static void method1835(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static39.method809(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static39.method809(arg4)) {
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg3 >= arg4 ? arg4 : arg3;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(62) int local62 = arg4 >> 1;
			@Pc(64) int[] local64 = arg0;
			@Pc(69) int[] local69 = new int[local62 * local54];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local39, arg5, arg3, arg4, 0, 32993, arg2, local64, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg3;
				@Pc(96) int[] local96 = local69;
				for (@Pc(98) int local98 = 0; local98 < local62; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local54; local102++) {
						@Pc(109) int local109 = local64[local90++];
						@Pc(114) int local114 = local64[local90++];
						@Pc(119) int local119 = local64[local94++];
						@Pc(124) int local124 = local64[local94++];
						@Pc(130) int local130 = local109 >> 16 & 0xFF;
						@Pc(136) int local136 = local109 >> 8 & 0xFF;
						@Pc(140) int local140 = local109 & 0xFF;
						@Pc(146) int local146 = local109 >> 24 & 0xFF;
						@Pc(152) int local152 = local140 + (local114 & 0xFF);
						@Pc(160) int local160 = local136 + (local114 >> 8 & 0xFF);
						@Pc(168) int local168 = local130 + (local114 >> 16 & 0xFF);
						@Pc(176) int local176 = local146 + (local114 >> 24 & 0xFF);
						@Pc(184) int local184 = local168 + (local119 >> 16 & 0xFF);
						@Pc(192) int local192 = local160 + (local119 >> 8 & 0xFF);
						@Pc(198) int local198 = local152 + (local119 & 0xFF);
						@Pc(206) int local206 = local176 + (local119 >> 24 & 0xFF);
						@Pc(214) int local214 = local192 + (local124 >> 8 & 0xFF);
						@Pc(222) int local222 = local206 + (local124 >> 24 & 0xFF);
						@Pc(228) int local228 = local198 + (local124 & 0xFF);
						@Pc(236) int local236 = local184 + (local124 >> 16 & 0xFF);
						local69[local88++] = local228 >> 2 & 0xFF | (local236 & 0x3FC) << 14 | (local222 & 0x3FC) << 22 | (local214 & 0x3FC) << 6;
					}
					local90 += arg3;
					local94 += arg3;
				}
				local69 = local64;
				arg3 = local54;
				arg4 = local62;
				local64 = local96;
				local39++;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local50 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
