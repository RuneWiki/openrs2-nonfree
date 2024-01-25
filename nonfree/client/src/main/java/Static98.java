import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5863(@OriginalArg(0) String arg0) {
		if (Static183.aStringArray40 == null) {
			Static413.method5605();
		}
		@Pc(15) String[] local15 = Static109.method1808('\n', arg0);
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			for (@Pc(21) int local21 = Static371.anInt6171; local21 > 0; local21--) {
				Static183.aStringArray40[local21] = Static183.aStringArray40[local21 - 1];
			}
			Static183.aStringArray40[0] = local15[local17];
			if (Static371.anInt6171 < Static183.aStringArray40.length - 1) {
				if (Static59.anInt1234 > 0) {
					Static59.anInt1234++;
				}
				Static371.anInt6171++;
			}
		}
	}
}
