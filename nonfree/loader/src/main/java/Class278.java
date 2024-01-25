import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hm")
public final class Class278 {

	@OriginalMember(owner = "loader!hm", name = "a", descriptor = "J")
	private static long aLong233;

	@OriginalMember(owner = "loader!hm", name = "b", descriptor = "J")
	private static long aLong234;

	@OriginalMember(owner = "loader!hm", name = "a", descriptor = "(B)J")
	public static synchronized long method5854() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (aLong233 > local9) {
			aLong234 += aLong233 - local9;
		}
		aLong233 = local9;
		return aLong234 + local9;
	}
}
