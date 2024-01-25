import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rf")
public final class Class280 {

	@OriginalMember(owner = "loader!rf", name = "a", descriptor = "J")
	private static long aLong252;

	@OriginalMember(owner = "loader!rf", name = "b", descriptor = "J")
	private static long aLong253;

	@OriginalMember(owner = "loader!rf", name = "a", descriptor = "(B)J")
	public static synchronized long method6396() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong252 > local1) {
			aLong253 += aLong252 - local1;
		}
		aLong252 = local1;
		return aLong253 + local1;
	}
}
