import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fa")
public final class Class209 {

	@OriginalMember(owner = "loader!fa", name = "b", descriptor = "J")
	private static long aLong1327;

	@OriginalMember(owner = "loader!fa", name = "a", descriptor = "J")
	private static long aLong1328;

	@OriginalMember(owner = "loader!fa", name = "a", descriptor = "(I)J")
	public static synchronized long method4671() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong1327 > local1) {
			aLong1328 += aLong1327 - local1;
		}
		aLong1327 = local1;
		return local1 + aLong1328;
	}
}
