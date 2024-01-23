import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!td")
public final class Class211 {

	@OriginalMember(owner = "loader!td", name = "b", descriptor = "J")
	private static long aLong1325;

	@OriginalMember(owner = "loader!td", name = "a", descriptor = "J")
	private static long aLong1326;

	@OriginalMember(owner = "loader!td", name = "a", descriptor = "(B)J")
	public static synchronized long method4913() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong1325 > local1) {
			aLong1326 += aLong1325 - local1;
		}
		aLong1325 = local1;
		return local1 + aLong1326;
	}
}
