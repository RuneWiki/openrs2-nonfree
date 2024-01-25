import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!lj")
public final class Class231 {

	@OriginalMember(owner = "loader!lj", name = "b", descriptor = "J")
	private static long aLong220;

	@OriginalMember(owner = "loader!lj", name = "a", descriptor = "J")
	private static long aLong221;

	@OriginalMember(owner = "loader!lj", name = "a", descriptor = "(I)J")
	public static synchronized long method6141(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong220 > local6) {
			aLong221 += aLong220 - local6;
		}
		aLong220 = local6;
		return aLong221 + local6;
	}
}
