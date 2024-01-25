import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!di", name = "N", descriptor = "I")
	public static int anInt1700;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public static void method1452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (Static143.anInt7434 != arg0) {
			Static519.anIntArray155 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static519.anIntArray155[local21] = (local21 << 12) / arg0;
			}
			Static464.anInt7427 = arg0 - 1;
			Static143.anInt7434 = arg0;
			Static197.anInt2872 = arg0 * 32;
		}
		if (Static42.anInt782 == arg1) {
			return;
		}
		if (Static143.anInt7434 == arg1) {
			Static13.anIntArray418 = Static519.anIntArray155;
		} else {
			Static13.anIntArray418 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static13.anIntArray418[local21] = (local21 << 12) / arg1;
			}
		}
		Static42.anInt782 = arg1;
		Static407.anInt6676 = arg1 - 1;
	}
}
