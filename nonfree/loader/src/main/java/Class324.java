import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!em")
public final class Class324 {

	@OriginalMember(owner = "loader!em", name = "a", descriptor = "J")
	private static long aLong252;

	@OriginalMember(owner = "loader!em", name = "b", descriptor = "J")
	private static long aLong253;

	@OriginalMember(owner = "loader!em", name = "a", descriptor = "(Z)J")
	public static synchronized long method8284() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong252 > local1) {
			aLong253 += aLong252 - local1;
		}
		aLong252 = local1;
		return aLong253 + local1;
	}
}
