import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!es", name = "H", descriptor = "Lclient!b;")
	public static Class16 aClass16_7;

	@OriginalMember(owner = "client!es", name = "J", descriptor = "I")
	public static int anInt1672 = 0;

	@OriginalMember(owner = "client!es", name = "M", descriptor = "[I")
	public static final int[] anIntArray209 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!es", name = "Q", descriptor = "[S")
	public static final short[] aShortArray26 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(I)V")
	public static void method1626() {
		Static259.anInt5034 = 0;
		Static187.anInt3904 = 0;
		Static244.anInt4762 = 0;
		Static267.anInt5160 = 0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
	public static void method1627() {
		@Pc(10) Class140 local10 = Static44.aClass140_25;
		synchronized (Static44.aClass140_25) {
			Static44.aClass140_25.method3824(5);
		}
	}
}
