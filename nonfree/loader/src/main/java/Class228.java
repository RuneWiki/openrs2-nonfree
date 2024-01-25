import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rr")
public final class Class228 {

	@OriginalMember(owner = "loader!rr", name = "b", descriptor = "J")
	private static long aLong222;

	@OriginalMember(owner = "loader!rr", name = "a", descriptor = "J")
	private static long aLong223;

	@OriginalMember(owner = "loader!rr", name = "a", descriptor = "(B)J")
	public static synchronized long method5906() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong223) {
			aLong222 += aLong223 - local1;
		}
		aLong223 = local1;
		return aLong222 + local1;
	}
}
