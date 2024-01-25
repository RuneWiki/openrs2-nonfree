import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)Lclient!tl;")
	public static Class6_Sub45 method1458() {
		if (Static487.aClass8_51 == null || Static275.aClass91_1 == null) {
			return null;
		}
		Static275.aClass91_1.method2336(Static487.aClass8_51);
		@Pc(18) Class6_Sub45 local18 = (Class6_Sub45) Static275.aClass91_1.method2338();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class105 local28 = Static487.aClass337_4.method8119(local18.anInt9417);
			return local28 != null && local28.aBoolean244 && local28.method3042(Static487.anInterface25_2) ? local18 : Static29.method526();
		}
	}
}
