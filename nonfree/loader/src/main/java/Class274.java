import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!he")
public final class Class274 {

	@OriginalMember(owner = "loader!he", name = "b", descriptor = "J")
	private static long aLong228;

	@OriginalMember(owner = "loader!he", name = "a", descriptor = "J")
	private static long aLong229;

	@OriginalMember(owner = "loader!he", name = "a", descriptor = "(Z)J")
	public static synchronized long method6100() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong228 > local1) {
			aLong229 += aLong228 - local1;
		}
		aLong228 = local1;
		return local1 + aLong229;
	}
}
