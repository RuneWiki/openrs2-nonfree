import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Z")
	public static boolean aBoolean132;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method1940() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static346.anInt5281 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public static void method1941() {
		Static352.aClass4_Sub5_Sub17_4 = new Class4_Sub5_Sub17(Static279.aClass179_4.method4066(Static164.anInt2984), "", Static530.anInt8205, 1008, -1, 0L, 0, 0, true, false, 0L, true);
	}
}
