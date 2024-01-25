import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dea", name = "r", descriptor = "I")
	public static int anInt1607;

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_3 = new Class262(7, 2);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "()V")
	public static void method1358() {
		for (@Pc(1) int local1 = Static238.anInt3981; local1 < Static450.anInt7223; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static83.anInt1434; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static405.anInt6657; local7++) {
					@Pc(16) Class228 local16 = Static469.aClass228ArrayArrayArray6[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class12_Sub2_Sub5 local21 = local16.aClass12_Sub2_Sub5_1;
						@Pc(24) Class12_Sub2_Sub5 local24 = local16.aClass12_Sub2_Sub5_2;
						if (local21 != null && local21.method7510()) {
							Static140.method4034(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7510()) {
								Static140.method4034(local24, local1, local4, local7, 1, 1);
								local24.method7507(0, Static337.aClass162_13, 0, local21, false, 0);
								local24.method7511();
							}
							local21.method7511();
						}
						for (@Pc(68) Class180 local68 = local16.aClass180_3; local68 != null; local68 = local68.aClass180_2) {
							@Pc(72) Class12_Sub2_Sub1 local72 = local68.aClass12_Sub2_Sub1_1;
							if (local72 != null && local72.method7510()) {
								Static140.method4034(local72, local1, local4, local7, local72.aShort119 + 1 - local72.aShort120, local72.aShort122 - local72.aShort121 + 1);
								local72.method7511();
							}
						}
						@Pc(108) Class12_Sub2_Sub2 local108 = local16.aClass12_Sub2_Sub2_1;
						if (local108 != null && local108.method7510()) {
							Static344.method5010(local108, local1, local4, local7);
							local108.method7511();
						}
					}
				}
			}
		}
	}
}
