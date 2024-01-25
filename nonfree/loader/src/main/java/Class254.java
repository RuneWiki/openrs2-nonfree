import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!da")
public final class Class254 {

	@OriginalMember(owner = "loader!da", name = "a", descriptor = "J")
	private static long aLong210;

	@OriginalMember(owner = "loader!da", name = "b", descriptor = "J")
	private static long aLong211;

	@OriginalMember(owner = "loader!da", name = "a", descriptor = "(I)J")
	public static synchronized long method5765() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong211 > local7) {
			aLong210 += aLong211 - local7;
		}
		aLong211 = local7;
		return local7 + aLong210;
	}
}
