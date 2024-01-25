import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!it")
public final class Class278 {

	@OriginalMember(owner = "loader!it", name = "a", descriptor = "J")
	private static long aLong237;

	@OriginalMember(owner = "loader!it", name = "b", descriptor = "J")
	private static long aLong238;

	@OriginalMember(owner = "loader!it", name = "a", descriptor = "(B)J")
	public static synchronized long method6019() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong238 > local1) {
			aLong237 += aLong238 - local1;
		}
		aLong238 = local1;
		return local1 + aLong237;
	}
}
