import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!cg")
public final class Class255 {

	@OriginalMember(owner = "loader!cg", name = "b", descriptor = "J")
	private static long aLong212;

	@OriginalMember(owner = "loader!cg", name = "a", descriptor = "J")
	private static long aLong213;

	@OriginalMember(owner = "loader!cg", name = "a", descriptor = "(I)J")
	public static synchronized long method5684() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong212) {
			aLong213 += aLong212 - local1;
		}
		aLong212 = local1;
		return aLong213 + local1;
	}
}
