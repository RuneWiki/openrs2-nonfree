import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vi")
public final class Class201 {

	@OriginalMember(owner = "loader!vi", name = "a", descriptor = "J")
	private static long aLong218;

	@OriginalMember(owner = "loader!vi", name = "b", descriptor = "J")
	private static long aLong219;

	@OriginalMember(owner = "loader!vi", name = "a", descriptor = "(I)J")
	public static synchronized long method4846() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong218 > local6) {
			aLong219 += aLong218 - local6;
		}
		aLong218 = local6;
		return aLong219 + local6;
	}
}
