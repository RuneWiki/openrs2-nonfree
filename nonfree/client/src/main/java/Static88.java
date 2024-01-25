import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!kh;")
	public static Class137 aClass137_1;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_59 = new Class186(30, 12);

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
	public static void method1487() {
		@Pc(5) int local5 = 0;
		if (Static126.aClass67_Sub1_1.method4524(Static286.anInt5207)) {
			local5 = 55;
		}
		if (!Static126.aClass67_Sub1_1.aBoolean396) {
			local5 |= 0x40;
		}
		Static110.method1741(local5);
		Static2.aClass74_13.method1680(local5);
		Static390.aClass204_2.method4623(local5);
		Static388.aClass211_1.method4935(local5);
		Static92.aClass89_1.method1916(local5);
		Static119.method1855(local5);
		Static264.method3594(local5);
		Static311.method4306(local5);
		Static87.method1462(local5);
		if (Static73.anInt1749 == 10) {
			Static321.method4406(28);
		} else if (Static73.anInt1749 == 30) {
			Static321.method4406(25);
		}
	}
}
