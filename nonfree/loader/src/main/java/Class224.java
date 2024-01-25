import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!nc")
public final class Class224 {

	@OriginalMember(owner = "loader!nc", name = "a", descriptor = "J")
	private static long aLong227;

	@OriginalMember(owner = "loader!nc", name = "b", descriptor = "J")
	private static long aLong228;

	@OriginalMember(owner = "loader!nc", name = "a", descriptor = "(I)J")
	public static synchronized long method5767() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong227 > local6) {
			aLong228 += aLong227 - local6;
		}
		aLong227 = local6;
		return aLong228 + local6;
	}
}
