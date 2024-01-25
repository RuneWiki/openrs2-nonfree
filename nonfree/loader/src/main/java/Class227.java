import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rf")
public final class Class227 {

	@OriginalMember(owner = "loader!rf", name = "a", descriptor = "J")
	private static long aLong261;

	@OriginalMember(owner = "loader!rf", name = "b", descriptor = "J")
	private static long aLong262;

	@OriginalMember(owner = "loader!rf", name = "a", descriptor = "(I)J")
	public static synchronized long method5782() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong261) {
			aLong262 += aLong261 - local6;
		}
		aLong261 = local6;
		return aLong262 + local6;
	}
}
