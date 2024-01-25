import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!mi")
public final class Class279 {

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "J")
	private static long aLong231;

	@OriginalMember(owner = "loader!mi", name = "b", descriptor = "J")
	private static long aLong232;

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(B)J")
	public static synchronized long method6237() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong231) {
			aLong232 += aLong231 - local1;
		}
		aLong231 = local1;
		return aLong232 + local1;
	}
}
