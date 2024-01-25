import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!dq")
public final class Class323 {

	@OriginalMember(owner = "loader!dq", name = "b", descriptor = "J")
	private static long aLong245;

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "J")
	private static long aLong246;

	@OriginalMember(owner = "loader!dq", name = "a", descriptor = "(Z)J")
	public static synchronized long method8000() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong246) {
			aLong245 += aLong246 - local1;
		}
		aLong246 = local1;
		return local1 + aLong245;
	}
}
