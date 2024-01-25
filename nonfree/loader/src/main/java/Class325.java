import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fu")
public final class Class325 {

	@OriginalMember(owner = "loader!fu", name = "a", descriptor = "J")
	private static long aLong245;

	@OriginalMember(owner = "loader!fu", name = "b", descriptor = "J")
	private static long aLong246;

	@OriginalMember(owner = "loader!fu", name = "a", descriptor = "(B)J")
	public static synchronized long method7843() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (aLong245 > local9) {
			aLong246 += aLong245 - local9;
		}
		aLong245 = local9;
		return aLong246 + local9;
	}
}
