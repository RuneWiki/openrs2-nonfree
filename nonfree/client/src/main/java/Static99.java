import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method1654() {
		if (Static206.anIntArray393 != null) {
			return;
		}
		Static206.anIntArray393 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(42) float local42 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(51) float local51 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(53) int local53 = 0; local53 < 128; local53++) {
				@Pc(60) float local60 = (float) local53 / 128.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(70) float local70 = local42 / 60.0F;
				@Pc(73) int local73 = (int) local70;
				@Pc(77) int local77 = local73 % 6;
				@Pc(82) float local82 = local70 - (float) local73;
				@Pc(88) float local88 = (1.0F - local51) * local60;
				@Pc(96) float local96 = (1.0F - local82 * local51) * local60;
				@Pc(107) float local107 = local60 * (1.0F - (1.0F - local82) * local51);
				if (local77 == 0) {
					local64 = local107;
					local62 = local60;
					local66 = local88;
				} else if (local77 == 1) {
					local64 = local60;
					local62 = local96;
					local66 = local88;
				} else if (local77 == 2) {
					local66 = local107;
					local62 = local88;
					local64 = local60;
				} else if (local77 == 3) {
					local64 = local96;
					local66 = local60;
					local62 = local88;
				} else if (local77 == 4) {
					local62 = local107;
					local66 = local60;
					local64 = local88;
				} else if (local77 == 5) {
					local64 = local88;
					local66 = local96;
					local62 = local60;
				}
				local62 = (float) Math.pow((double) local62, local19);
				local64 = (float) Math.pow((double) local64, local19);
				local66 = (float) Math.pow((double) local66, local19);
				@Pc(200) int local200 = (int) (local62 * 256.0F);
				@Pc(205) int local205 = (int) (local64 * 256.0F);
				@Pc(210) int local210 = (int) (local66 * 256.0F);
				@Pc(222) int local222 = local210 + (local205 << 8) + (local200 << 16) - 16777216;
				Static206.anIntArray393[local27++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)[Lclient!fa;")
	public static Class76[] method1656() {
		return new Class76[] { Static56.aClass76_1, Static56.aClass76_2, Static56.aClass76_3, Static56.aClass76_4, Static56.aClass76_5, Static56.aClass76_6, Static56.aClass76_7, Static56.aClass76_8, Static56.aClass76_9, Static56.aClass76_10 };
	}
}
