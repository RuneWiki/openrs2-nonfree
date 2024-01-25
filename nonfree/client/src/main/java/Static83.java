import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public static int anInt1402;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt1405;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_35 = new Class40(47, -2);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IC)Z")
	public static boolean method1316(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public static void method1317() {
		for (@Pc(14) Class6_Sub48 local14 = (Class6_Sub48) Static445.aClass275_162.method6366(); local14 != null; local14 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
			if (Static248.method3541(local14.anInt8333)) {
				Static145.method2164(local14);
			}
		}
		if (Static374.anInt6451 == 1) {
			Static287.method7854();
			return;
		}
		Static41.method573(Static519.anInt8950, Static377.anInt6491, anInt1402, Static353.anInt6216);
		@Pc(57) int local57 = Static338.aClass146_7.method3173(Static141.aClass104_69.method2145(Static470.anInt7957));
		for (@Pc(62) Class6_Sub48 local62 = (Class6_Sub48) Static445.aClass275_162.method6366(); local62 != null; local62 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
			@Pc(68) int local68 = Static479.method7871(local62);
			if (local68 > local57) {
				local57 = local68;
			}
		}
		Static519.anInt8950 = Static374.anInt6451 * 16 + (Static206.aBoolean233 ? 26 : 22);
		Static353.anInt6216 = local57 + 8;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public static void method1321() {
		Static58.anImage1 = null;
		Static478.aFont1 = null;
	}
}
