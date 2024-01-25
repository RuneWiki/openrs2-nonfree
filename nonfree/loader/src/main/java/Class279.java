import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!nk")
public final class Class279 {

	@OriginalMember(owner = "loader!nk", name = "b", descriptor = "J")
	private static long aLong230;

	@OriginalMember(owner = "loader!nk", name = "a", descriptor = "J")
	private static long aLong231;

	@OriginalMember(owner = "loader!nk", name = "a", descriptor = "(B)J")
	public static synchronized long method6099() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong231 > local1) {
			aLong230 += aLong231 - local1;
		}
		aLong231 = local1;
		return local1 + aLong230;
	}
}
