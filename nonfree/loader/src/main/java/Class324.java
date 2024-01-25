import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!eba")
public final class Class324 {

	@OriginalMember(owner = "loader!eba", name = "b", descriptor = "J")
	private static long aLong256;

	@OriginalMember(owner = "loader!eba", name = "a", descriptor = "J")
	private static long aLong257;

	@OriginalMember(owner = "loader!eba", name = "a", descriptor = "(Z)J")
	public static synchronized long method7499() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong256 > local1) {
			aLong257 += aLong256 - local1;
		}
		aLong256 = local1;
		return local1 + aLong257;
	}
}
