import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rk")
public final class Class199 {

	@OriginalMember(owner = "loader!rk", name = "a", descriptor = "J")
	private static long aLong218;

	@OriginalMember(owner = "loader!rk", name = "b", descriptor = "J")
	private static long aLong219;

	@OriginalMember(owner = "loader!rk", name = "a", descriptor = "(I)J")
	public static synchronized long method4715() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong218 > local1) {
			aLong219 += aLong218 - local1;
		}
		aLong218 = local1;
		return aLong219 + local1;
	}
}
