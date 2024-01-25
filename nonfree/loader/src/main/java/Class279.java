import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wc")
public final class Class279 {

	@OriginalMember(owner = "loader!wc", name = "a", descriptor = "J")
	private static long aLong240;

	@OriginalMember(owner = "loader!wc", name = "b", descriptor = "J")
	private static long aLong241;

	@OriginalMember(owner = "loader!wc", name = "a", descriptor = "(B)J")
	public static synchronized long method6141() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong240 > local7) {
			aLong241 += aLong240 - local7;
		}
		aLong240 = local7;
		return local7 + aLong241;
	}
}
