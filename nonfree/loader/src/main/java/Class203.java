import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!sm")
public final class Class203 {

	@OriginalMember(owner = "loader!sm", name = "b", descriptor = "J")
	private static long aLong252;

	@OriginalMember(owner = "loader!sm", name = "a", descriptor = "J")
	private static long aLong253;

	@OriginalMember(owner = "loader!sm", name = "a", descriptor = "(I)J")
	public static synchronized long method4836() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong253) {
			aLong252 += aLong253 - local1;
		}
		aLong253 = local1;
		return local1 + aLong252;
	}
}
