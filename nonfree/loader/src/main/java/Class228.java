import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wj")
public final class Class228 {

	@OriginalMember(owner = "loader!wj", name = "a", descriptor = "J")
	private static long aLong220;

	@OriginalMember(owner = "loader!wj", name = "b", descriptor = "J")
	private static long aLong221;

	@OriginalMember(owner = "loader!wj", name = "a", descriptor = "(I)J")
	public static synchronized long method5808() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong221) {
			aLong220 += aLong221 - local6;
		}
		aLong221 = local6;
		return local6 + aLong220;
	}
}
