import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!jd")
public final class Class201 {

	@OriginalMember(owner = "loader!jd", name = "b", descriptor = "J")
	private static long aLong251;

	@OriginalMember(owner = "loader!jd", name = "a", descriptor = "J")
	private static long aLong252;

	@OriginalMember(owner = "loader!jd", name = "a", descriptor = "(B)J")
	public static synchronized long method5066() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong251) {
			aLong252 += aLong251 - local1;
		}
		aLong251 = local1;
		return local1 + aLong252;
	}
}
