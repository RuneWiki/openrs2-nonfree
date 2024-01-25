import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt1929;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)Lclient!sn;")
	public static Class300 method1878(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static449.aClass300Array1[arg0] : null;
	}
}
