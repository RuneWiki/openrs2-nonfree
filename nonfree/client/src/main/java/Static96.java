import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
	public static void method1937() {
		Static586.method8062(false);
		if (Static573.anInt9346 >= 0 && Static573.anInt9346 != 0) {
			Static428.method6321(Static573.anInt9346, false);
			Static573.anInt9346 = -1;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BII)Z")
	public static boolean method1939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
