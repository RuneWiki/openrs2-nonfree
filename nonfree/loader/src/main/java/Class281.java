import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ig")
public final class Class281 {

	@OriginalMember(owner = "loader!ig", name = "a", descriptor = "J")
	private static long aLong229;

	@OriginalMember(owner = "loader!ig", name = "b", descriptor = "J")
	private static long aLong230;

	@OriginalMember(owner = "loader!ig", name = "a", descriptor = "(B)J")
	public static synchronized long method6360() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (local7 < aLong229) {
			aLong230 += aLong229 - local7;
		}
		aLong229 = local7;
		return local7 + aLong230;
	}
}
