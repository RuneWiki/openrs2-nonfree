import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!cr")
public final class Class222 {

	@OriginalMember(owner = "loader!cr", name = "b", descriptor = "J")
	private static long aLong212;

	@OriginalMember(owner = "loader!cr", name = "a", descriptor = "J")
	private static long aLong213;

	@OriginalMember(owner = "loader!cr", name = "a", descriptor = "(B)J")
	public static synchronized long method5753() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (aLong213 > local9) {
			aLong212 += aLong213 - local9;
		}
		aLong213 = local9;
		return aLong212 + local9;
	}
}
