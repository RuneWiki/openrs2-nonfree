import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ko")
public final class Class223 {

	@OriginalMember(owner = "loader!ko", name = "b", descriptor = "J")
	private static long aLong219;

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "J")
	private static long aLong220;

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(I)J")
	public static synchronized long method5719() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong219 > local6) {
			aLong220 += aLong219 - local6;
		}
		aLong219 = local6;
		return aLong220 + local6;
	}
}
