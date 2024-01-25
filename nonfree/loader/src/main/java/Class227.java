import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vg")
public final class Class227 {

	@OriginalMember(owner = "loader!vg", name = "b", descriptor = "J")
	private static long aLong234;

	@OriginalMember(owner = "loader!vg", name = "a", descriptor = "J")
	private static long aLong235;

	@OriginalMember(owner = "loader!vg", name = "a", descriptor = "(B)J")
	public static synchronized long method5780() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong235 > local1) {
			aLong234 += aLong235 - local1;
		}
		aLong235 = local1;
		return local1 + aLong234;
	}
}
