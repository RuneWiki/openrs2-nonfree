import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!pn")
public final class Class203 {

	@OriginalMember(owner = "loader!pn", name = "b", descriptor = "J")
	private static long aLong219;

	@OriginalMember(owner = "loader!pn", name = "a", descriptor = "J")
	private static long aLong220;

	@OriginalMember(owner = "loader!pn", name = "a", descriptor = "(B)J")
	public static synchronized long method4820() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong219 > local7) {
			aLong220 += aLong219 - local7;
		}
		aLong219 = local7;
		return aLong220 + local7;
	}
}
