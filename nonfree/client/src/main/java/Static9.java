import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ao", name = "sb", descriptor = "I")
	public static int anInt250;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(ZI)V")
	public static void method299(@OriginalArg(1) int arg0) {
		Static369.anInt6442 = arg0;
		Static291.aClass154_41.method3748();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	public static void method300() {
		for (@Pc(3) int local3 = 0; local3 < Static98.anInt1946; local3++) {
			@Pc(9) int local9 = Static299.anIntArray651[local3]--;
			if (Static299.anIntArray651[local3] >= -10) {
				@Pc(88) Class236 local88 = Static146.aClass236Array1[local3];
				if (local88 == null) {
					local88 = Static405.method5537(Static14.aClass71_1, Static133.anIntArray281[local3], 0);
					if (local88 == null) {
						continue;
					}
					Static299.anIntArray651[local3] += local88.method5538();
					Static146.aClass236Array1[local3] = local88;
				}
				if (Static299.anIntArray651[local3] < 0) {
					@Pc(135) int local135;
					if (Static21.anIntArray96[local3] == 0) {
						local135 = Static198.anIntArray440[local3] * Static107.anInt2129 >> 8;
					} else {
						@Pc(145) int local145 = Static21.anIntArray96[local3] >> 24 & 0x3;
						if (local145 == Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74) {
							@Pc(165) int local165 = (Static21.anIntArray96[local3] & 0xFF) * 128;
							@Pc(173) int local173 = Static21.anIntArray96[local3] >> 16 & 0xFF;
							@Pc(183) int local183 = local173 * 128 + 64 - Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328;
							if (local183 < 0) {
								local183 = -local183;
							}
							@Pc(199) int local199 = Static21.anIntArray96[local3] >> 8 & 0xFF;
							@Pc(208) int local208 = local199 * 128 + 64 - Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317;
							if (local208 < 0) {
								local208 = -local208;
							}
							@Pc(222) int local222 = local208 + local183 - 128;
							if (local222 > local165) {
								Static299.anIntArray651[local3] = -100;
								continue;
							}
							if (local222 < 0) {
								local222 = 0;
							}
							local135 = (local165 - local222) * Static16.anInt400 * Static198.anIntArray440[local3] / local165 >> 8;
						} else {
							local135 = 0;
						}
					}
					if (local135 > 0) {
						@Pc(260) Class2_Sub4_Sub1 local260 = local88.method5539().method939(Static154.aClass76_1);
						@Pc(265) Class2_Sub2_Sub2 local265 = Static398.method3187(local260, local135);
						local265.method3196(Static17.anIntArray80[local3] - 1);
						Static339.aClass2_Sub2_Sub1_2.method112(local265);
					}
					Static299.anIntArray651[local3] = -100;
				}
			} else {
				Static98.anInt1946--;
				for (@Pc(23) int local23 = local3; local23 < Static98.anInt1946; local23++) {
					Static133.anIntArray281[local23] = Static133.anIntArray281[local23 + 1];
					Static146.aClass236Array1[local23] = Static146.aClass236Array1[local23 + 1];
					Static17.anIntArray80[local23] = Static17.anIntArray80[local23 + 1];
					Static299.anIntArray651[local23] = Static299.anIntArray651[local23 + 1];
					Static21.anIntArray96[local23] = Static21.anIntArray96[local23 + 1];
					Static198.anIntArray440[local23] = Static198.anIntArray440[local23 + 1];
				}
				local3--;
			}
		}
		if (Static327.aBoolean445 && !Static67.method1242()) {
			if (Static193.anInt6666 != 0 && Static4.anInt147 != -1) {
				Static267.method4129(Static193.anInt6666, Static4.anInt147, Static161.aClass71_37);
			}
			Static327.aBoolean445 = false;
		} else if (Static193.anInt6666 != 0 && Static4.anInt147 != -1 && !Static67.method1242()) {
			Static19.method552(Static345.aClass41_182);
			Static39.aClass2_Sub13_Sub2_4.method4218(Static4.anInt147);
			Static4.anInt147 = -1;
		}
	}
}
