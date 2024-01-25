import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wq")
public final class Class275 {

	@OriginalMember(owner = "loader!wq", name = "a", descriptor = "J")
	private static long aLong235;

	@OriginalMember(owner = "loader!wq", name = "b", descriptor = "J")
	private static long aLong236;

	@OriginalMember(owner = "loader!wq", name = "a", descriptor = "(Z)J")
	public static synchronized long method6668() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong235) {
			aLong236 += aLong235 - local6;
		}
		aLong235 = local6;
		return local6 + aLong236;
	}
}
