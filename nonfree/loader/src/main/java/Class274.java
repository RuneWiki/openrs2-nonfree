import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fp")
public final class Class274 {

	@OriginalMember(owner = "loader!fp", name = "b", descriptor = "J")
	private static long aLong236;

	@OriginalMember(owner = "loader!fp", name = "a", descriptor = "J")
	private static long aLong237;

	@OriginalMember(owner = "loader!fp", name = "a", descriptor = "(I)J")
	public static synchronized long method6023(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong237) {
			aLong236 += aLong237 - local6;
		}
		aLong237 = local6;
		return local6 + aLong236;
	}
}
