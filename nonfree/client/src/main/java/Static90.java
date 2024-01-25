import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dm", name = "Wb", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!dm", name = "sc", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)Lclient!fv;")
	public static Class111 method1579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass111_1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BII)V")
	public static void method1580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static142.anInt2691 == 1) {
			Static157.method2280(Static129.aClass1_Sub51_3, arg1, arg0);
		} else if (Static142.anInt2691 == 2) {
			Static396.method5494(arg0, arg1);
		}
		Static142.anInt2691 = 0;
		Static129.aClass1_Sub51_3 = null;
	}
}
