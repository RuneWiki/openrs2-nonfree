import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "F")
	public static float aFloat222;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public static int anInt7543;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method5800() {
		Static432.method5595(Static269.aClass51_9, (long) Static274.anInt4617);
		if (Static183.anInt3293 != -1) {
			Static459.method5332(Static183.anInt3293);
		}
		for (@Pc(23) int local23 = 0; local23 < Static57.anInt967; local23++) {
			if (Static69.aBooleanArray2[local23]) {
				Static308.aBooleanArray28[local23] = true;
			}
			Static271.aBooleanArray26[local23] = Static69.aBooleanArray2[local23];
			Static69.aBooleanArray2[local23] = false;
		}
		Static370.anInt5910 = Static274.anInt4617;
		if (Static269.aClass51_9.method5316()) {
			Static367.aBoolean390 = true;
		}
		if (Static183.anInt3293 != -1) {
			Static57.anInt967 = 0;
			Static272.method3651();
		}
		Static269.aClass51_9.e();
		Static239.method3257(Static269.aClass51_9);
		@Pc(75) int local75 = Static154.method2308();
		if (local75 == -1) {
			local75 = Static194.anInt3446;
		}
		if (local75 == -1) {
			local75 = Static313.anInt5179;
		}
		Static109.method1890(local75);
		Static436.anInt7296 = 0;
	}
}
