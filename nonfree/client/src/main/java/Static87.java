import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!de", name = "i", descriptor = "[Lclient!uk;")
	public static Class341[] aClass341Array1;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!eq;")
	public static Class97 aClass97_17;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static final int anInt1791 = 1400;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)I")
	public static int method1561() {
		if (Static112.aClass78_4 == null) {
			if (!Static642.aBoolean757 && Static220.aClass2_Sub5_Sub20_17 != null) {
				return Static220.aClass2_Sub5_Sub20_17.anInt10070;
			}
			@Pc(21) int local21 = Static6.aClass40_1.method4504();
			@Pc(25) int local25 = Static6.aClass40_1.method4499();
			@Pc(63) int local63;
			@Pc(65) int local65;
			@Pc(76) int local76;
			@Pc(134) Class2_Sub5_Sub20 local134;
			if (Static155.aBoolean303) {
				@Pc(129) Class309 local129;
				if (local21 > Static254.anInt5025 && local21 < Static133.anInt3038 + Static254.anInt5025) {
					local63 = -1;
					for (local65 = 0; local65 < Static178.anInt3981; local65++) {
						if (Static507.aBoolean636) {
							local76 = Static378.anInt6772 + local65 * 16 + 33;
							if (local76 - 13 < local25 && local76 + 3 >= local25) {
								local63 = local65;
							}
						} else {
							local76 = local65 * 16 + Static378.anInt6772 + 31;
							if (local25 > local76 - 13 && local76 + 3 >= local25) {
								local63 = local65;
							}
						}
					}
					if (local63 != -1) {
						local76 = 0;
						local129 = new Class309(Static61.aClass175_2);
						for (@Pc(229) Class2_Sub5_Sub2 local229 = (Class2_Sub5_Sub2) local129.method7334(); local229 != null; local229 = (Class2_Sub5_Sub2) local129.method7335()) {
							if (local63 == local76++) {
								if (local229.anInt964 == 1) {
									return ((Class2_Sub5_Sub20) local229.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66).anInt10070;
								}
								return -1;
							}
						}
					}
				} else if (Static591.aClass2_Sub5_Sub2_1 != null && local21 > Static331.anInt5908 && Static63.anInt1369 + Static331.anInt5908 > local21) {
					local63 = -1;
					for (local65 = 0; local65 < Static591.aClass2_Sub5_Sub2_1.anInt964; local65++) {
						if (Static507.aBoolean636) {
							local76 = local65 * 16 + Static320.anInt5800 + 33;
							if (local76 - 13 < local25 && local25 <= local76 + 3) {
								local63 = local65;
							}
						} else {
							local76 = local65 * 16 + Static320.anInt5800 + 31;
							if (local76 - 13 < local25 && local25 <= local76 + 3) {
								local63 = local65;
							}
						}
					}
					if (local63 != -1) {
						local76 = 0;
						local129 = new Class309(Static591.aClass2_Sub5_Sub2_1.aClass175_1);
						for (local134 = (Class2_Sub5_Sub20) local129.method7334(); local134 != null; local134 = (Class2_Sub5_Sub20) local129.method7335()) {
							if (local63 == local76++) {
								return local134.anInt10070;
							}
						}
					}
				}
			} else if (local21 > Static254.anInt5025 && Static133.anInt3038 + Static254.anInt5025 > local21) {
				local63 = -1;
				for (local65 = 0; local65 < Static90.anInt1824; local65++) {
					if (Static507.aBoolean636) {
						local76 = Static378.anInt6772 + (Static90.anInt1824 - local65 - 1) * 16 + 33;
						if (local76 - 13 < local25 && local25 <= local76 + 3) {
							local63 = local65;
						}
					} else {
						local76 = Static378.anInt6772 + (-local65 + -1 + Static90.anInt1824) * 16 + 31;
						if (local25 > local76 - 13 && local25 <= local76 + 3) {
							local63 = local65;
						}
					}
				}
				if (local63 != -1) {
					local76 = 0;
					@Pc(347) Class211 local347 = new Class211(Static261.aClass238_28);
					for (local134 = (Class2_Sub5_Sub20) local347.method5217(); local134 != null; local134 = (Class2_Sub5_Sub20) local347.method5216()) {
						if (local76++ == local63) {
							return local134.anInt10070;
						}
					}
				}
			}
		}
		return -1;
	}
}
