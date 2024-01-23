import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ha")
public final class Class198 {

	@OriginalMember(owner = "loader!ha", name = "b", descriptor = "J")
	private static long aLong219;

	@OriginalMember(owner = "loader!ha", name = "a", descriptor = "J")
	private static long aLong220;

	@OriginalMember(owner = "loader!ha", name = "a", descriptor = "(I)J")
	public static synchronized long method4880() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong219) {
			aLong220 += aLong219 - local6;
		}
		aLong219 = local6;
		return local6 + aLong220;
	}
}
