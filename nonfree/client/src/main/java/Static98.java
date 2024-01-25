import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!de", name = "j", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public static void method1636() {
		if (Static563.aClass143_13 == null) {
			return;
		}
		if (Static305.aBoolean315) {
			Static404.method5903();
		}
		Static508.aClass89_1.method1907();
		Static612.method8231();
		Static191.method2757();
		Static88.method1383();
		Static352.method5232();
		Static421.method6408();
		if (Static366.aClass116_2 != null) {
			Static366.aClass116_2.method2423();
		}
		Static436.method6546();
		Static422.method6420();
		Static503.method7250();
		Static384.method5637();
		Static355.method5246(false);
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(50) Class41_Sub1_Sub1_Sub3_Sub2 local50 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local45];
			if (local50 != null) {
				for (@Pc(54) int local54 = 0; local54 < local50.aClass114Array3.length; local54++) {
					local50.aClass114Array3[local54] = null;
				}
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static562.anInt9155; local74++) {
			@Pc(80) Class41_Sub1_Sub1_Sub3_Sub1 local80 = Static278.aClass5_Sub34Array1[local74].aClass41_Sub1_Sub1_Sub3_Sub1_1;
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < local80.aClass114Array3.length; local84++) {
					local80.aClass114Array3[local84] = null;
				}
			}
		}
		Static108.aClass56_4 = null;
		Static269.aClass56_5 = null;
		Static563.aClass143_13.method6225();
		Static563.aClass143_13 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([IIIIIIII)V")
	public static void method1637(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static384.method5636(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static384.method5636(arg2)) {
			@Pc(43) int local43 = 0;
			@Pc(54) int local54 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(58) int local58 = arg3 >> 1;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(64) int[] local64 = arg0;
			@Pc(69) int[] local69 = new int[local58 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local43, arg4, arg3, arg2, 0, 32993, arg5, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(86) int local86 = 0;
				@Pc(88) int local88 = 0;
				@Pc(92) int local92 = arg3;
				for (@Pc(94) int local94 = 0; local94 < local62; local94++) {
					for (@Pc(97) int local97 = 0; local97 < local58; local97++) {
						@Pc(103) int local103 = local64[local88++];
						@Pc(108) int local108 = local64[local88++];
						@Pc(113) int local113 = local64[local92++];
						@Pc(118) int local118 = local64[local92++];
						@Pc(124) int local124 = local103 >> 16 & 0xFF;
						@Pc(130) int local130 = local103 >> 8 & 0xFF;
						@Pc(136) int local136 = local103 >> 24 & 0xFF;
						@Pc(140) int local140 = local103 & 0xFF;
						@Pc(148) int local148 = local136 + (local108 >> 24 & 0xFF);
						@Pc(156) int local156 = local124 + (local108 >> 16 & 0xFF);
						@Pc(162) int local162 = local140 + (local108 & 0xFF);
						@Pc(170) int local170 = local130 + (local108 >> 8 & 0xFF);
						@Pc(178) int local178 = local170 + (local113 >> 8 & 0xFF);
						@Pc(186) int local186 = local156 + (local113 >> 16 & 0xFF);
						@Pc(194) int local194 = local148 + (local113 >> 24 & 0xFF);
						@Pc(200) int local200 = local162 + (local113 & 0xFF);
						@Pc(208) int local208 = local194 + (local118 >> 24 & 0xFF);
						@Pc(216) int local216 = local186 + (local118 >> 16 & 0xFF);
						@Pc(222) int local222 = local200 + (local118 & 0xFF);
						@Pc(230) int local230 = local178 + (local118 >> 8 & 0xFF);
						local69[local86++] = local222 >> 2 & 0xFF | (local230 & 0x3FC) << 6 | (local208 & 0x3FC) << 22 | (local216 & 0x3FC) << 14;
					}
					local88 += arg3;
					local92 += arg3;
				}
				@Pc(279) int[] local279 = local69;
				local69 = local64;
				arg3 = local58;
				local64 = local279;
				arg2 = local62;
				local58 >>= 0x1;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local43++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
