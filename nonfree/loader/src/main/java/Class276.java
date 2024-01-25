import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ju")
public final class Class276 {

	@OriginalMember(owner = "loader!ju", name = "b", descriptor = "J")
	private static long aLong228;

	@OriginalMember(owner = "loader!ju", name = "a", descriptor = "J")
	private static long aLong229;

	@OriginalMember(owner = "loader!ju", name = "a", descriptor = "(Z)J")
	public static synchronized long method5940() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong228 > local1) {
			aLong229 += aLong228 - local1;
		}
		aLong228 = local1;
		return aLong229 + local1;
	}
}
