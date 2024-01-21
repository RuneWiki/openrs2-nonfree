import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
	public static int[] anIntArray406 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1337 = Static106.method1849("No response from server)3");

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1336 = aClass66_1337;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
	public static int anInt2413 = 0;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1338 = Static106.method1849("(U3");

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	public static int anInt2420 = 0;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1339 = Static106.method1849("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method1712() {
		for (@Pc(15) Class1_Sub1_Sub1_Sub3 local15 = (Class1_Sub1_Sub1_Sub3) Static35.aClass61_8.method1748(); local15 != null; local15 = (Class1_Sub1_Sub1_Sub3) Static35.aClass61_8.method1760()) {
			if (Static22.anInt635 != local15.anInt679 || local15.anInt675 < Static22.anInt636) {
				local15.method2050();
			} else if (Static22.anInt636 >= local15.anInt678) {
				if (local15.anInt668 > 0) {
					@Pc(39) Class1_Sub1_Sub1_Sub5_Sub1 local39 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local15.anInt668 - 1];
					if (local39 != null && local39.anInt1261 >= 0 && local39.anInt1261 < 13312 && local39.anInt1271 >= 0 && local39.anInt1271 < 13312) {
						local15.method526(local39.anInt1271, local39.anInt1261, Static77.method1476(local39.anInt1271, local15.anInt679, local39.anInt1261) - local15.anInt682, Static22.anInt636);
					}
				}
				if (local15.anInt668 < 0) {
					@Pc(91) int local91 = -local15.anInt668 - 1;
					@Pc(98) Class1_Sub1_Sub1_Sub5_Sub2 local98;
					if (local91 == Static25.anInt694) {
						local98 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1;
					} else {
						local98 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local91];
					}
					if (local98 != null && local98.anInt1261 >= 0 && local98.anInt1261 < 13312 && local98.anInt1271 >= 0 && local98.anInt1271 < 13312) {
						local15.method526(local98.anInt1271, local98.anInt1261, Static77.method1476(local98.anInt1271, local15.anInt679, local98.anInt1261) - local15.anInt682, Static22.anInt636);
					}
				}
				local15.method525(Static130.anInt2924);
				Static129.aClass9_1.method315(Static22.anInt635, (int) local15.aDouble7, (int) local15.aDouble1, (int) local15.aDouble4, 60, local15, local15.anInt664, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public static void method1713() {
		@Pc(1) Object local1 = Static108.anObject2;
		synchronized (Static108.anObject2) {
			if (Static96.anInt2466 == 0) {
				Static120.aClass7_4.method285(new Class25(), 5);
			}
			Static96.anInt2466 = 600;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	public static void method1714() {
		aClass66_1337 = null;
		aClass66_1338 = null;
		aClass66_1339 = null;
		anIntArray406 = null;
		aClass66_1336 = null;
	}
}
