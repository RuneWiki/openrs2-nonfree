import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ee")
public final class Class192 {

	@OriginalMember(owner = "loader!ee", name = "b", descriptor = "J")
	private static long aLong213;

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "J")
	private static long aLong214;

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "(I)J")
	public static synchronized long method4728() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong214) {
			aLong213 += aLong214 - local1;
		}
		aLong214 = local1;
		return aLong213 + local1;
	}
}
