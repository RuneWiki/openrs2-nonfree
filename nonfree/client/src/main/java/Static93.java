import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "J")
	private static long aLong55;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "J")
	private static long aLong56;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)J")
	public static synchronized long method2172() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (local7 < aLong56) {
			aLong55 += aLong56 - local7;
		}
		aLong56 = local7;
		return local7 + aLong55;
	}
}
