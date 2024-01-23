import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ae")
public final class Class204 {

	@OriginalMember(owner = "loader!ae", name = "b", descriptor = "J")
	private static long aLong1436;

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "J")
	private static long aLong1437;

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(B)J")
	public static synchronized long method5253() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong1437 > local1) {
			aLong1436 += aLong1437 - local1;
		}
		aLong1437 = local1;
		return aLong1436 + local1;
	}
}
