import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	public static int anInt2426;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15 = new String[8];

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	public static int anInt2428 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method1838() {
		for (@Pc(3) int local3 = 0; local3 < Static139.anInt5524; local3++) {
			@Pc(11) int local11 = Static52.anIntArray111[local3]--;
			if (Static52.anIntArray111[local3] >= -10) {
				@Pc(86) Class76 local86 = Static185.aClass76Array1[local3];
				if (local86 == null) {
					local86 = Static273.method2416(Static146.aClass51_48, Static222.anIntArray427[local3], 0);
					if (local86 == null) {
						continue;
					}
					Static52.anIntArray111[local3] += local86.method2417();
					Static185.aClass76Array1[local3] = local86;
				}
				if (Static52.anIntArray111[local3] < 0) {
					@Pc(213) int local213;
					if (Static207.anIntArray350[local3] == 0) {
						local213 = Static5.anIntArray6[local3] * Static237.anInt5140 >> 8;
					} else {
						@Pc(129) int local129 = (Static207.anIntArray350[local3] & 0xFF) * 128;
						@Pc(137) int local137 = Static207.anIntArray350[local3] >> 16 & 0xFF;
						@Pc(147) int local147 = local137 * 128 + 64 - Static83.aClass9_Sub1_Sub1_1.anInt427;
						if (local147 < 0) {
							local147 = -local147;
						}
						@Pc(160) int local160 = Static207.anIntArray350[local3] >> 8 & 0xFF;
						@Pc(170) int local170 = local160 * 128 + 64 - Static83.aClass9_Sub1_Sub1_1.anInt479;
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(182) int local182 = local147 + local170 - 128;
						if (local129 < local182) {
							Static52.anIntArray111[local3] = -100;
							continue;
						}
						if (local182 < 0) {
							local182 = 0;
						}
						local213 = Static47.anInt1385 * (local129 - local182) * Static5.anIntArray6[local3] / local129 >> 8;
					}
					if (local213 > 0) {
						@Pc(233) Class1_Sub7_Sub1 local233 = local86.method2415().method1067(Static13.aClass46_1);
						@Pc(238) Class1_Sub4_Sub3 local238 = Static269.method1408(local233, local213);
						local238.method1422(Static11.anIntArray44[local3] - 1);
						Static24.aClass1_Sub4_Sub4_1.method3080(local238);
					}
					Static52.anIntArray111[local3] = -100;
				}
			} else {
				Static139.anInt5524--;
				for (@Pc(25) int local25 = local3; local25 < Static139.anInt5524; local25++) {
					Static222.anIntArray427[local25] = Static222.anIntArray427[local25 + 1];
					Static185.aClass76Array1[local25] = Static185.aClass76Array1[local25 + 1];
					Static11.anIntArray44[local25] = Static11.anIntArray44[local25 + 1];
					Static52.anIntArray111[local25] = Static52.anIntArray111[local25 + 1];
					Static207.anIntArray350[local25] = Static207.anIntArray350[local25 + 1];
					Static5.anIntArray6[local25] = Static5.anIntArray6[local25 + 1];
				}
				local3--;
			}
		}
		if (Static1.aBoolean1 && !Static23.method428()) {
			if (Static106.anInt2847 != 0 && Static30.anInt925 != -1) {
				Static262.method4184(Static258.aClass51_83, Static30.anInt925, Static106.anInt2847);
			}
			Static1.aBoolean1 = false;
		} else if (Static106.anInt2847 != 0 && Static30.anInt925 != -1 && !Static23.method428()) {
			Static171.aClass1_Sub13_Sub1_3.method1825(204);
			Static171.aClass1_Sub13_Sub1_3.method1754(Static30.anInt925);
			Static30.anInt925 = -1;
		}
	}
}
