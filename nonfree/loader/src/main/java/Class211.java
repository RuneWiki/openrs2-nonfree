import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wg")
public final class Class211 {

	@OriginalMember(owner = "loader!wg", name = "a", descriptor = "J")
	private static long aLong1326;

	@OriginalMember(owner = "loader!wg", name = "b", descriptor = "J")
	private static long aLong1327;

	@OriginalMember(owner = "loader!wg", name = "a", descriptor = "(B)J")
	public static synchronized long method5217() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong1326 > local7) {
			aLong1327 += aLong1326 - local7;
		}
		aLong1326 = local7;
		return local7 + aLong1327;
	}
}
