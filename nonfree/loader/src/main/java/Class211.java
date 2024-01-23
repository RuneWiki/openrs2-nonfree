import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wi")
public final class Class211 {

	@OriginalMember(owner = "loader!wi", name = "a", descriptor = "J")
	private static long aLong1328;

	@OriginalMember(owner = "loader!wi", name = "b", descriptor = "J")
	private static long aLong1329;

	@OriginalMember(owner = "loader!wi", name = "a", descriptor = "(I)J")
	public static synchronized long method4828() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong1328) {
			aLong1329 += aLong1328 - local1;
		}
		aLong1328 = local1;
		return local1 + aLong1329;
	}
}
