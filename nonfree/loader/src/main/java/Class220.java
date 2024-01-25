import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!db")
public final class Class220 {

	@OriginalMember(owner = "loader!db", name = "a", descriptor = "J")
	private static long aLong218;

	@OriginalMember(owner = "loader!db", name = "b", descriptor = "J")
	private static long aLong219;

	@OriginalMember(owner = "loader!db", name = "a", descriptor = "(I)J")
	public static synchronized long method6013() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong219 > local1) {
			aLong218 += aLong219 - local1;
		}
		aLong219 = local1;
		return aLong218 + local1;
	}
}
