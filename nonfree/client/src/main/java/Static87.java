import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array4;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!dg;Z)V")
	public static void method1935(@OriginalArg(0) Class2_Sub10 arg0) {
		if (arg0.aByteArray57.length - arg0.anInt4807 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4421();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray57.length - arg0.anInt4807 < 2) {
			return;
		}
		@Pc(47) int local47 = arg0.method4464();
		if (local47 * 6 != arg0.aByteArray57.length - arg0.anInt4807) {
			return;
		}
		while (true) {
			@Pc(67) int local67;
			@Pc(71) int local71;
			do {
				do {
					do {
						if (arg0.aByteArray57.length <= arg0.anInt4807) {
							return;
						}
						local67 = arg0.method4464();
						local71 = arg0.method4444();
					} while (Static31.anIntArray37.length <= local67);
				} while (!Static5.aBooleanArray23[local67]);
			} while (Static20.method679(local67).aChar3 == '1' && (local71 < -1 || local71 > 1));
			Static31.anIntArray37[local67] = local71;
		}
	}
}
