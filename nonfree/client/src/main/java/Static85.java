import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_32 = new Class57("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!ej", name = "V", descriptor = "[I")
	public static int[] anIntArray170 = new int[2];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
	public static void method1416() {
		Static191.method3045(Static164.anInt2901);
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	public static void method1418() {
		if (Static68.anInt1346 == -1) {
			return;
		}
		@Pc(11) int local11 = Static200.aClass10_1.method5242();
		@Pc(15) int local15 = Static200.aClass10_1.method5240();
		if (Static46.aClass3_Sub33_1 != null) {
			local11 = Static46.aClass3_Sub33_1.method5156();
			local15 = Static46.aClass3_Sub33_1.method5157();
		}
		Static207.method1894(Static199.anInt3567, local11, 0, 0, Static68.anInt1346, 0, local15, Static207.anInt2251, 0);
		if (Static16.aClass62_1 != null) {
			Static122.method1948(local11, local15);
		}
	}
}
