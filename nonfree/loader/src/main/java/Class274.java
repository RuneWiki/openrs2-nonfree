import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bd")
public final class Class274 {

	@OriginalMember(owner = "loader!bd", name = "b", descriptor = "J")
	private static long aLong231;

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "J")
	private static long aLong232;

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(B)J")
	public static synchronized long method5973() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong231) {
			aLong232 += aLong231 - local6;
		}
		aLong231 = local6;
		return aLong232 + local6;
	}
}
