import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!oa")
public final class Class278 {

	@OriginalMember(owner = "loader!oa", name = "b", descriptor = "J")
	private static long aLong223;

	@OriginalMember(owner = "loader!oa", name = "a", descriptor = "J")
	private static long aLong224;

	@OriginalMember(owner = "loader!oa", name = "a", descriptor = "(I)J")
	public static synchronized long method6052() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong223 > local6) {
			aLong224 += aLong223 - local6;
		}
		aLong223 = local6;
		return local6 + aLong224;
	}
}
