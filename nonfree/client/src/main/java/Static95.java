import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public static int anInt1982;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	public static int anInt1985;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method1805() {
		for (@Pc(12) Class1_Sub5_Sub12 local12 = (Class1_Sub5_Sub12) Static311.aClass96_28.method2340(); local12 != null; local12 = (Class1_Sub5_Sub12) Static311.aClass96_28.method2342()) {
			@Pc(18) Class11_Sub2 local18 = local12.aClass11_Sub2_1;
			if (Static132.anInt2608 != local18.anInt1731 || local18.aBoolean175) {
				local12.method4573();
			} else if (local18.anInt1729 <= Static167.anInt637) {
				local18.method1630(Static38.anInt722);
				if (local18.aBoolean175) {
					local12.method4573();
				} else {
					Static168.method2837(local18.anInt1731, local18.anInt1732, local18.anInt1725, local18.anInt1739, 60, local18, 0, -1L, false);
				}
			}
		}
	}
}
