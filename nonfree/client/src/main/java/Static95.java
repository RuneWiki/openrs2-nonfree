import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "[Lclient!cd;")
	public static final Class3_Sub13[] aClass3_Sub13Array1 = new Class3_Sub13[1024];

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	public static int anInt1572 = -1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I")
	public static int method1282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 << 13 ^ local15;
		@Pc(35) int local35 = Integer.MAX_VALUE & (local21 * local21 * 15731 + 789221) * local21 + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public static void method1284() {
		if (Static179.anIntArray162 != null) {
			return;
		}
		Static179.anIntArray162 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
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
				@Pc(83) float local83 = (float) -local73 + local70;
				@Pc(89) float local89 = local60 * (1.0F - local51);
				@Pc(97) float local97 = local60 * (1.0F - local51 * local83);
				@Pc(108) float local108 = (1.0F - (1.0F - local83) * local51) * local60;
				if (local77 == 0) {
					local62 = local60;
					local64 = local108;
					local66 = local89;
				} else if (local77 == 1) {
					local64 = local60;
					local66 = local89;
					local62 = local97;
				} else if (local77 == 2) {
					local66 = local108;
					local64 = local60;
					local62 = local89;
				} else if (local77 == 3) {
					local62 = local89;
					local66 = local60;
					local64 = local97;
				} else if (local77 == 4) {
					local62 = local108;
					local66 = local60;
					local64 = local89;
				} else if (local77 == 5) {
					local64 = local89;
					local66 = local97;
					local62 = local60;
				}
				local62 = (float) Math.pow((double) local62, local25);
				local64 = (float) Math.pow((double) local64, local25);
				local66 = (float) Math.pow((double) local66, local25);
				@Pc(215) int local215 = (int) (local62 * 256.0F);
				@Pc(220) int local220 = (int) (local64 * 256.0F);
				@Pc(225) int local225 = (int) (local66 * 256.0F);
				@Pc(238) int local238 = local225 + (local215 << 16) + (local220 << 8) - 16777216;
				Static179.anIntArray162[local27++] = local238;
			}
		}
	}
}
