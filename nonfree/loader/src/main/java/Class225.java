import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rg")
public final class Class225 {

	@OriginalMember(owner = "loader!rg", name = "b", descriptor = "J")
	private static long aLong219;

	@OriginalMember(owner = "loader!rg", name = "a", descriptor = "J")
	private static long aLong220;

	@OriginalMember(owner = "loader!rg", name = "a", descriptor = "(I)J")
	public static synchronized long method5800() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong220 > local6) {
			aLong219 += aLong220 - local6;
		}
		aLong220 = local6;
		return local6 + aLong219;
	}
}
