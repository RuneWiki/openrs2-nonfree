import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fj")
public final class Class273 {

	@OriginalMember(owner = "loader!fj", name = "b", descriptor = "J")
	private static long aLong239;

	@OriginalMember(owner = "loader!fj", name = "a", descriptor = "J")
	private static long aLong240;

	@OriginalMember(owner = "loader!fj", name = "a", descriptor = "(B)J")
	public static synchronized long method6055() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong239 > local1) {
			aLong240 += aLong239 - local1;
		}
		aLong239 = local1;
		return aLong240 + local1;
	}
}
