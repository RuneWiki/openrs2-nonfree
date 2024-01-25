import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fj")
public final class Class255 {

	@OriginalMember(owner = "loader!fj", name = "b", descriptor = "J")
	private static long aLong214;

	@OriginalMember(owner = "loader!fj", name = "a", descriptor = "J")
	private static long aLong215;

	@OriginalMember(owner = "loader!fj", name = "a", descriptor = "(I)J")
	public static synchronized long method6157() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong215 > local6) {
			aLong214 += aLong215 - local6;
		}
		aLong215 = local6;
		return local6 + aLong214;
	}
}
