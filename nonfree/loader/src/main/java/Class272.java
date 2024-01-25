import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!eu")
public final class Class272 {

	@OriginalMember(owner = "loader!eu", name = "b", descriptor = "J")
	private static long aLong228;

	@OriginalMember(owner = "loader!eu", name = "a", descriptor = "J")
	private static long aLong229;

	@OriginalMember(owner = "loader!eu", name = "a", descriptor = "(I)J")
	public static synchronized long method6113() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong229 > local1) {
			aLong228 += aLong229 - local1;
		}
		aLong229 = local1;
		return aLong228 + local1;
	}
}
