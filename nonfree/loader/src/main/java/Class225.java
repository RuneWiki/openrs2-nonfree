import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vo")
public final class Class225 {

	@OriginalMember(owner = "loader!vo", name = "a", descriptor = "J")
	private static long aLong239;

	@OriginalMember(owner = "loader!vo", name = "b", descriptor = "J")
	private static long aLong240;

	@OriginalMember(owner = "loader!vo", name = "a", descriptor = "(I)J")
	public static synchronized long method6126() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong239) {
			aLong240 += aLong239 - local1;
		}
		aLong239 = local1;
		return local1 + aLong240;
	}
}
