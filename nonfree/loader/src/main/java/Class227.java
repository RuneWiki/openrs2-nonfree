import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!kl")
public final class Class227 {

	@OriginalMember(owner = "loader!kl", name = "b", descriptor = "J")
	private static long aLong221;

	@OriginalMember(owner = "loader!kl", name = "a", descriptor = "J")
	private static long aLong222;

	@OriginalMember(owner = "loader!kl", name = "a", descriptor = "(I)J")
	public static synchronized long method6071() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong222 > local6) {
			aLong221 += aLong222 - local6;
		}
		aLong222 = local6;
		return aLong221 + local6;
	}
}
