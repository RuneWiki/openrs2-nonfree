import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hv")
public final class Class273 {

	@OriginalMember(owner = "loader!hv", name = "b", descriptor = "J")
	private static long aLong220;

	@OriginalMember(owner = "loader!hv", name = "a", descriptor = "J")
	private static long aLong221;

	@OriginalMember(owner = "loader!hv", name = "a", descriptor = "(B)J")
	public static synchronized long method6036() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong221) {
			aLong220 += aLong221 - local1;
		}
		aLong221 = local1;
		return local1 + aLong220;
	}
}
