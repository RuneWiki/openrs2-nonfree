import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!cv")
public final class Class324 {

	@OriginalMember(owner = "loader!cv", name = "b", descriptor = "J")
	private static long aLong249;

	@OriginalMember(owner = "loader!cv", name = "a", descriptor = "J")
	private static long aLong250;

	@OriginalMember(owner = "loader!cv", name = "a", descriptor = "(I)J")
	public static synchronized long method8030() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong249) {
			aLong250 += aLong249 - local1;
		}
		aLong249 = local1;
		return aLong250 + local1;
	}
}
