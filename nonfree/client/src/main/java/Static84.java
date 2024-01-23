import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static int anInt1984 = 0;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7 = null;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!ol;")
	public static Class117 aClass117_6 = new Class117(32);

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString57 = "Loaded interfaces";

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public static int anInt1989 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method1480() {
		while (true) {
			if (Static222.aClass1_Sub16_Sub1_3.method2668(Static5.anInt141) >= 27) {
				@Pc(20) int local20 = Static222.aClass1_Sub16_Sub1_3.method2670(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static27.aClass25_Sub1_Sub2Array1[local20] == null) {
						Static27.aClass25_Sub1_Sub2Array1[local20] = new Class25_Sub1_Sub2();
						local27 = true;
					}
					@Pc(44) Class25_Sub1_Sub2 local44 = Static27.aClass25_Sub1_Sub2Array1[local20];
					Static65.anIntArray25[Static147.anInt3493++] = local20;
					local44.anInt1658 = Static32.anInt809;
					if (local44.aClass143_1 != null && local44.aClass143_1.method4068()) {
						Static289.method4725(local44);
					}
					local44.method1250(Static38.method880(Static222.aClass1_Sub16_Sub1_3.method2670(14)));
					@Pc(85) int local85 = Static222.aClass1_Sub16_Sub1_3.method2670(5);
					@Pc(90) int local90 = Static222.aClass1_Sub16_Sub1_3.method2670(5);
					@Pc(95) int local95 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
					if (local90 > 15) {
						local90 -= 32;
					}
					if (local95 == 1) {
						Static95.anIntArray220[Static111.anInt2390++] = local20;
					}
					if (local85 > 15) {
						local85 -= 32;
					}
					@Pc(124) int local124 = Static246.anIntArray551[Static222.aClass1_Sub16_Sub1_3.method2670(3)];
					if (local27) {
						local44.anInt1628 = local44.anInt1681 = local124;
					}
					@Pc(138) int local138 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
					local44.method1239(local44.aClass143_1.anInt5188);
					local44.anInt1615 = local44.aClass143_1.anInt5186;
					local44.anInt1642 = local44.aClass143_1.anInt5183;
					if (local44.anInt1615 == 0) {
						local44.anInt1681 = 0;
					}
					local44.method1235(local138 == 1, local44.method1243(), local85 + Static239.aClass25_Sub1_Sub1_2.anIntArray173[0], Static239.aClass25_Sub1_Sub1_2.anIntArray172[0] - -local90);
					if (local44.aClass143_1.method4068()) {
						Static283.method4671(local44.anIntArray172[0], null, Static145.anInt3477, null, local44.anIntArray173[0], 0, local44);
					}
					continue;
				}
			}
			Static222.aClass1_Sub16_Sub1_3.method2666();
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public static void method1481() {
		Static125.aClass155_22.method4364(5);
		Static183.aClass155_35.method4364(5);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1484(@OriginalArg(0) String arg0) {
		if (Static159.aClass78_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(23) int local23 = 0; local23 < Static159.aClass78_2.anInt2855; local23++) {
			if (Static260.method4429("<br>", " ", Static159.aClass78_2.aStringArray14[local23]).equals(arg0)) {
				return local23;
			}
		}
		return -1;
	}
}
