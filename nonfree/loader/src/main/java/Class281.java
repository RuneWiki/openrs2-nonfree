import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vl")
public final class Class281 {

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "J")
	private static long aLong406;

	@OriginalMember(owner = "loader!vl", name = "b", descriptor = "J")
	private static long aLong407;

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "(B)J")
	public static synchronized long method6366() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong406 > local1) {
			aLong407 += aLong406 - local1;
		}
		aLong406 = local1;
		return aLong407 + local1;
	}
}
