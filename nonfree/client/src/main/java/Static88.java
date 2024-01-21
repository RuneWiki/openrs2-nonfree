import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1111 = Static28.method504("Lade Sprites )2 ");

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1112 = Static28.method504("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!of", name = "ib", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1113 = Static28.method504("leuchten3:");

	@OriginalMember(owner = "client!of", name = "jb", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[104][104];

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1114 = Static28.method504("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
	public static int anInt2198 = 0;

	@OriginalMember(owner = "client!of", name = "tb", descriptor = "I")
	public static int anInt2205 = 0;

	@OriginalMember(owner = "client!of", name = "ub", descriptor = "Z")
	public static volatile boolean aBoolean111 = false;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
	public static void method1610() {
		aClass39_1111 = null;
		aClass39_1114 = null;
		aClass39_1112 = null;
		anIntArrayArray16 = null;
		aClass39_1113 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)I")
	public static int method1611() {
		@Pc(14) int local14 = Static94.method1708(Static69.anInt1723, Static119.anInt3113, Static131.anInt3202);
		return local14 - Static97.anInt2445 >= 800 || (Static131.aByteArrayArrayArray7[Static131.anInt3202][Static69.anInt1723 >> 7][Static119.anInt3113 >> 7] & 0x4) == 0 ? 3 : Static131.anInt3202;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V")
	public static void method1612() {
		@Pc(13) int local13 = Static62.aClass4_Sub2_Sub3_Sub3_3.method1265(Static119.aClass39_1722);
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < Static105.anInt2033; local15++) {
			local23 = Static62.aClass4_Sub2_Sub3_Sub3_3.method1265(Static84.method1519(local15));
			if (local13 < local23) {
				local13 = local23;
			}
		}
		local13 += 8;
		Static101.aBoolean122 = true;
		Static126.anInt3156 = Static105.anInt2033 * 15 + 22;
		Static51.anInt2470 = local13;
		local23 = Static105.anInt2033 * 15 + 21;
		@Pc(63) int local63 = Static27.anInt741 - local13 / 2;
		if (local63 + local13 > 765) {
			local63 = 765 - local13;
		}
		@Pc(78) int local78 = Static1.anInt9;
		if (local23 + local78 > 503) {
			local78 = 503 - local23;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		if (local78 < 0) {
			local78 = 0;
		}
		Static65.anInt1666 = local78;
		Static73.anInt1764 = local63;
	}
}
