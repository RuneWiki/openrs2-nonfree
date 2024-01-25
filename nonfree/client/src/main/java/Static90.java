import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
	public static int anInt2061 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIZI)V")
	public static void method1519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static29.method411(arg2)) {
			Static44.method834(Static450.aClass41ArrayArray2[arg2], arg0, -1, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	public static void method1520() {
		if (Static413.anIntArray484 != null) {
			return;
		}
		Static413.anIntArray484 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
			@Pc(44) float local44 = ((float) (local31 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(53) float local53 = (float) (local31 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(55) int local55 = 0; local55 < 128; local55++) {
				@Pc(62) float local62 = (float) local55 / 128.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(68) float local68 = 0.0F;
				@Pc(72) float local72 = local44 / 60.0F;
				@Pc(75) int local75 = (int) local72;
				@Pc(79) int local79 = local75 % 6;
				@Pc(84) float local84 = local72 - (float) local75;
				@Pc(91) float local91 = (1.0F - local53) * local62;
				@Pc(100) float local100 = (1.0F - local53 * local84) * local62;
				@Pc(112) float local112 = local62 * (1.0F - local53 * (1.0F - local84));
				if (local79 == 0) {
					local64 = local62;
					local66 = local112;
					local68 = local91;
				} else if (local79 == 1) {
					local64 = local100;
					local66 = local62;
					local68 = local91;
				} else if (local79 == 2) {
					local64 = local91;
					local68 = local112;
					local66 = local62;
				} else if (local79 == 3) {
					local66 = local100;
					local64 = local91;
					local68 = local62;
				} else if (local79 == 4) {
					local68 = local62;
					local66 = local91;
					local64 = local112;
				} else if (local79 == 5) {
					local64 = local62;
					local66 = local91;
					local68 = local100;
				}
				local64 = (float) Math.pow((double) local64, local19);
				local66 = (float) Math.pow((double) local66, local19);
				local68 = (float) Math.pow((double) local68, local19);
				@Pc(205) int local205 = (int) (local64 * 256.0F);
				@Pc(210) int local210 = (int) (local66 * 256.0F);
				@Pc(215) int local215 = (int) (local68 * 256.0F);
				@Pc(228) int local228 = local215 + (local205 << 16) + (local210 << 8) - 16777216;
				Static413.anIntArray484[local29++] = local228;
			}
		}
	}
}
