import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!cf")
public final class Class323 {

	@OriginalMember(owner = "loader!cf", name = "a", descriptor = "J")
	private static long aLong395;

	@OriginalMember(owner = "loader!cf", name = "b", descriptor = "J")
	private static long aLong396;

	@OriginalMember(owner = "loader!cf", name = "a", descriptor = "(I)J")
	public static synchronized long method7553() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong396 > local6) {
			aLong395 += aLong396 - local6;
		}
		aLong396 = local6;
		return aLong395 + local6;
	}
}
