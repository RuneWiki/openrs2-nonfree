import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fc")
public final class Class277 {

	@OriginalMember(owner = "loader!fc", name = "b", descriptor = "J")
	private static long aLong227;

	@OriginalMember(owner = "loader!fc", name = "a", descriptor = "J")
	private static long aLong228;

	@OriginalMember(owner = "loader!fc", name = "a", descriptor = "(B)J")
	public static synchronized long method5773() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong228 > local1) {
			aLong227 += aLong228 - local1;
		}
		aLong228 = local1;
		return local1 + aLong227;
	}
}
