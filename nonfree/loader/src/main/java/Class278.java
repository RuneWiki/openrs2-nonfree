import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!kq")
public final class Class278 {

	@OriginalMember(owner = "loader!kq", name = "b", descriptor = "J")
	private static long aLong268;

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "J")
	private static long aLong269;

	@OriginalMember(owner = "loader!kq", name = "a", descriptor = "(I)J")
	public static synchronized long method6134() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong268) {
			aLong269 += aLong268 - local1;
		}
		aLong268 = local1;
		return aLong269 + local1;
	}
}
