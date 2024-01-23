import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ka")
public final class Class209 {

	@OriginalMember(owner = "loader!ka", name = "a", descriptor = "J")
	private static long aLong1323;

	@OriginalMember(owner = "loader!ka", name = "b", descriptor = "J")
	private static long aLong1324;

	@OriginalMember(owner = "loader!ka", name = "a", descriptor = "(I)J")
	public static synchronized long method4724() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong1324) {
			aLong1323 += aLong1324 - local1;
		}
		aLong1324 = local1;
		return aLong1323 + local1;
	}
}
