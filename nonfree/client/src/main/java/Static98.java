import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_4 = new Class129(1, 2);

	@OriginalMember(owner = "client!dga", name = "x", descriptor = "I")
	public static int anInt2793 = 0;

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(I)[Lclient!qca;")
	public static Class273[] method2368() {
		if (Static131.aClass273Array1 == null) {
			@Pc(12) Class273[] local12 = Static105.method2436(Static496.aClass104_4);
			@Pc(16) Class273[] local16 = new Class273[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(23) int local23 = Static87.aClass6_Sub33_6.aClass14_Sub16_1.method5719();
			@Pc(87) int local87;
			@Pc(93) Class273 local93;
			label69: for (@Pc(25) int local25 = 0; local25 < local12.length; local25++) {
				@Pc(31) Class273 local31 = local12[local25];
				if ((local31.anInt8192 <= 0 || local31.anInt8192 >= 24) && local31.anInt8190 >= 800 && local31.anInt8193 >= 600 && (local23 != 2 || local31.anInt8190 <= 800 && local31.anInt8193 <= 600) && (local23 != 1 || local31.anInt8190 <= 1024 && local31.anInt8193 <= 768)) {
					for (local87 = 0; local87 < local18; local87++) {
						local93 = local16[local87];
						if (local93.anInt8190 == local31.anInt8190 && local93.anInt8193 == local31.anInt8193) {
							if (local31.anInt8192 > local93.anInt8192) {
								local16[local87] = local31;
							}
							continue label69;
						}
					}
					local16[local18] = local31;
					local18++;
				}
			}
			Static131.aClass273Array1 = new Class273[local18];
			Static653.method6535(local16, 0, Static131.aClass273Array1, 0, local18);
			@Pc(149) int[] local149 = new int[Static131.aClass273Array1.length];
			for (local87 = 0; local87 < Static131.aClass273Array1.length; local87++) {
				local93 = Static131.aClass273Array1[local87];
				local149[local87] = local93.anInt8193 * local93.anInt8190;
			}
			Static174.method3301(local149, Static131.aClass273Array1);
		}
		return Static131.aClass273Array1;
	}
}
