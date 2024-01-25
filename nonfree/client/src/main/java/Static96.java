import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Z")
	public static boolean aBoolean127;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "[Lclient!rp;")
	public static Interface23[] anInterface23Array1;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[8];

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
	public static void method1286() {
		if (Static633.anInt3426 == -1) {
			return;
		}
		@Pc(13) int local13 = Static714.aClass161_1.method8581();
		@Pc(17) int local17 = Static714.aClass161_1.method8573();
		@Pc(22) Class3_Sub14 local22 = (Class3_Sub14) Static641.aClass357_61.method8391();
		if (local22 != null) {
			local13 = local22.method4292();
			local17 = local22.method4294();
		}
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		if (Static178.aBoolean264) {
			local34 = Static448.method6652();
			local36 = Static143.method2382();
		}
		Static230.method3624(local17, Static272.anInt5005 + local36, local17 - -local36, local13, local36, local34 + Static575.anInt9435, local34, local36, local34, Static633.anInt3426, local13 + local34);
		if (Static440.aClass20_13 != null) {
			Static477.method6996(local13 + local34, local36 + local17);
		}
	}
}
