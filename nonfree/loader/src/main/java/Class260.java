import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vs")
public final class Class260 {

	@OriginalMember(owner = "loader!vs", name = "a", descriptor = "J")
	private static long aLong212;

	@OriginalMember(owner = "loader!vs", name = "b", descriptor = "J")
	private static long aLong213;

	@OriginalMember(owner = "loader!vs", name = "a", descriptor = "(I)J")
	public static synchronized long method5657() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong212) {
			aLong213 += aLong212 - local1;
		}
		aLong212 = local1;
		return aLong213 + local1;
	}
}
