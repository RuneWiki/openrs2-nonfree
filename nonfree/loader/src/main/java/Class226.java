import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!te")
public final class Class226 {

	@OriginalMember(owner = "loader!te", name = "b", descriptor = "J")
	private static long aLong217;

	@OriginalMember(owner = "loader!te", name = "a", descriptor = "J")
	private static long aLong218;

	@OriginalMember(owner = "loader!te", name = "a", descriptor = "(I)J")
	public static synchronized long method5905() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong217) {
			aLong218 += aLong217 - local1;
		}
		aLong217 = local1;
		return local1 + aLong218;
	}
}
