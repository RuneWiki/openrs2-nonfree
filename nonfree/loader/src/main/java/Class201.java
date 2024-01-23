import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!jo")
public final class Class201 {

	@OriginalMember(owner = "loader!jo", name = "a", descriptor = "J")
	private static long aLong225;

	@OriginalMember(owner = "loader!jo", name = "b", descriptor = "J")
	private static long aLong226;

	@OriginalMember(owner = "loader!jo", name = "a", descriptor = "(I)J")
	public static synchronized long method4692() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong225 > local7) {
			aLong226 += aLong225 - local7;
		}
		aLong225 = local7;
		return local7 + aLong226;
	}
}
