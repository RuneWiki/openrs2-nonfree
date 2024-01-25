import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
	public static int anInt2276;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_20 = new Class61(59, -1);

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(CI)Z")
	public static boolean method2052(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
