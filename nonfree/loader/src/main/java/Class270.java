import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bc")
public final class Class270 {

	@OriginalMember(owner = "loader!bc", name = "b", descriptor = "J")
	private static long aLong228;

	@OriginalMember(owner = "loader!bc", name = "a", descriptor = "J")
	private static long aLong229;

	@OriginalMember(owner = "loader!bc", name = "a", descriptor = "(I)J")
	public static synchronized long method5875() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong229) {
			aLong228 += aLong229 - local1;
		}
		aLong229 = local1;
		return local1 + aLong228;
	}
}
