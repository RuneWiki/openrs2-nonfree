import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
	public static int anInt1699;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
	public static int anInt1701;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
	public static int anInt1703;

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
	public static int anInt1698 = 0;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	public static int anInt1700 = 2;

	@OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
	public static int anInt1709 = 0;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public static void method1326() {
		aByteArrayArrayArray4 = null;
		anIntArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!dc;Z)V")
	public static void method1327(@OriginalArg(0) Class31 arg0) {
		Static173.aClass31_1 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public static void method1328() {
		@Pc(6) int local6 = Static101.aClass4_Sub17_Sub1_4.method1898(8);
		@Pc(12) int local12;
		if (Static41.anInt856 > local6) {
			for (local12 = local6; local12 < Static41.anInt856; local12++) {
				Static175.anIntArray298[Static43.anInt5510++] = Static85.anIntArray179[local12];
			}
		}
		if (local6 > Static41.anInt856) {
			throw new RuntimeException("gppov1");
		}
		Static41.anInt856 = 0;
		for (local12 = 0; local12 < local6; local12++) {
			@Pc(59) int local59 = Static85.anIntArray179[local12];
			@Pc(63) Class12_Sub3_Sub2 local63 = Static257.aClass12_Sub3_Sub2Array1[local59];
			@Pc(68) int local68 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
			if (local68 == 0) {
				Static85.anIntArray179[Static41.anInt856++] = local59;
				local63.anInt4167 = Static104.anInt2226;
			} else {
				@Pc(91) int local91 = Static101.aClass4_Sub17_Sub1_4.method1898(2);
				if (local91 == 0) {
					Static85.anIntArray179[Static41.anInt856++] = local59;
					local63.anInt4167 = Static104.anInt2226;
					Static97.anIntArray219[anInt1709++] = local59;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local91 == 1) {
						Static85.anIntArray179[Static41.anInt856++] = local59;
						local63.anInt4167 = Static104.anInt2226;
						local138 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
						local63.method3371(local138, 1);
						local148 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
						if (local148 == 1) {
							Static97.anIntArray219[anInt1709++] = local59;
						}
					} else if (local91 == 2) {
						Static85.anIntArray179[Static41.anInt856++] = local59;
						local63.anInt4167 = Static104.anInt2226;
						if (Static101.aClass4_Sub17_Sub1_4.method1898(1) == 1) {
							local138 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
							local63.method3371(local138, 2);
							local148 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
							local63.method3371(local148, 2);
						} else {
							local138 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
							local63.method3371(local138, 0);
						}
						local138 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
						if (local138 == 1) {
							Static97.anIntArray219[anInt1709++] = local59;
						}
					} else if (local91 == 3) {
						Static175.anIntArray298[Static43.anInt5510++] = local59;
					}
				}
			}
		}
	}
}
