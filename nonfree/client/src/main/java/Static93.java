import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dea", name = "w", descriptor = "[I")
	public static int[] anIntArray111;

	@OriginalMember(owner = "client!dea", name = "L", descriptor = "I")
	public static int anInt2585 = 0;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)Z")
	public static boolean method2182() {
		if (Static247.aBoolean402) {
			try {
				if ((Boolean) Static646.method1435("showingVideoAd", Static152.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZZB)V")
	public static void method2184(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static252.anInt5530++;
			Static532.method7501();
		}
		if (arg1) {
			Static413.anInt7858++;
			Static549.method7714();
		}
	}
}
