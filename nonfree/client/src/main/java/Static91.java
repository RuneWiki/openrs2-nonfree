import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
	public static int anInt2080;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
	public static int anInt2083;

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_21 = new Class307(260);

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
	public static void method1927() {
		if (Static211.anInt10646 < 0) {
			return;
		}
		@Pc(17) long local17 = Static517.method6965();
		Static211.anInt10646 = (int) ((long) Static211.anInt10646 + Static198.aLong129 - local17);
		if (Static211.anInt10646 <= 0) {
			Static150.anInt2707 = Static549.aClass208_5.anInt5420;
			Static305.anInt4910 = Static549.aClass208_5.anInt5426;
			Static602.aClass113_3 = Static549.aClass208_5.aClass113_2;
			Static101.aFloat41 = Static549.aClass208_5.aFloat95;
			Static26.aFloat7 = Static549.aClass208_5.aFloat94;
			Static183.aFloat59 = Static549.aClass208_5.aFloat96;
			Static590.aFloat137 = Static549.aClass208_5.aFloat91;
			Static559.aFloat130 = Static549.aClass208_5.aFloat93;
			Static120.aFloat44 = Static549.aClass208_5.aFloat92;
			Static36.anInt1194 = Static549.aClass208_5.anInt5417;
			if (Static538.aClass200_5 != null) {
				Static538.aClass200_5.method4697();
			}
			Static211.anInt10646 = -1;
			Static538.aClass200_5 = Static549.aClass208_5.aClass200_3;
		} else {
			@Pc(85) int local85 = (Static211.anInt10646 << 8) / Static246.anInt3873;
			@Pc(90) int local90 = 255 - local85;
			@Pc(95) float local95 = (float) local85 / 255.0F;
			@Pc(99) float local99 = 1.0F - local95;
			Static305.anInt4910 = (local85 * (Static425.anInt6494 & 0xFF00) + local90 * (Static549.aClass208_5.anInt5426 & 0xFF00) & 0xFF0000) + ((Static425.anInt6494 & 0xFF00FF) * local85 + (local90 * (Static549.aClass208_5.anInt5426 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static183.aFloat59 = (Static549.aClass208_5.aFloat96 - Static413.aFloat102) * local99 + Static413.aFloat102;
			Static150.anInt2707 = (local85 * (Static442.anInt6793 & 0xFF00FF) + (Static549.aClass208_5.anInt5420 & 0xFF00FF) * local90 & 0xFF00FF00) + ((Static549.aClass208_5.anInt5420 & 0xFF00) * local90 + (Static442.anInt6793 & 0xFF00) * local85 & 0xFF0000) >>> 8;
			Static26.aFloat7 = Static562.aFloat132 + (Static549.aClass208_5.aFloat94 - Static562.aFloat132) * local99;
			Static36.anInt1194 = Static549.aClass208_5.anInt5417 * local90 + Static190.anInt10865 * local85 >> 8;
			Static120.aFloat44 = Static207.aFloat60 + local99 * (Static549.aClass208_5.aFloat92 - Static207.aFloat60);
			Static590.aFloat137 = local99 * (Static549.aClass208_5.aFloat91 - Static456.aFloat118) + Static456.aFloat118;
			Static101.aFloat41 = local99 * (Static549.aClass208_5.aFloat95 - Static647.aFloat172) + Static647.aFloat172;
			Static559.aFloat130 = Static573.aFloat136 + local99 * (Static549.aClass208_5.aFloat93 - Static573.aFloat136);
			if (Static549.aClass208_5.aClass113_2 != Static7.aClass113_1) {
				Static602.aClass113_3 = Static126.aClass22_3.method9334(Static7.aClass113_1, Static549.aClass208_5.aClass113_2, local99, Static602.aClass113_3);
			}
			if (Static341.aClass200_4 != Static549.aClass208_5.aClass200_3) {
				if (Static341.aClass200_4 == null) {
					Static538.aClass200_5 = Static549.aClass208_5.aClass200_3;
					if (Static538.aClass200_5 != null) {
						Static538.aClass200_5.method4703(local90, 0);
					}
				} else {
					Static538.aClass200_5 = Static341.aClass200_4;
					if (Static538.aClass200_5 != null) {
						Static538.aClass200_5.method4703(local90, 255);
					}
				}
			}
		}
		Static198.aLong129 = local17;
	}
}
