import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bc")
public final class Class226 {

	@OriginalMember(owner = "loader!bc", name = "b", descriptor = "J")
	private static long aLong220;

	@OriginalMember(owner = "loader!bc", name = "a", descriptor = "J")
	private static long aLong221;

	@OriginalMember(owner = "loader!bc", name = "a", descriptor = "(I)J")
	public static synchronized long method5898() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong221) {
			aLong220 += aLong221 - local1;
		}
		aLong221 = local1;
		return aLong220 + local1;
	}
}
