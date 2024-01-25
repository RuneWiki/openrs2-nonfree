import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ln")
public final class Class275 {

	@OriginalMember(owner = "loader!ln", name = "b", descriptor = "J")
	private static long aLong228;

	@OriginalMember(owner = "loader!ln", name = "a", descriptor = "J")
	private static long aLong229;

	@OriginalMember(owner = "loader!ln", name = "a", descriptor = "(B)J")
	public static synchronized long method5699() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong228) {
			aLong229 += aLong228 - local6;
		}
		aLong228 = local6;
		return local6 + aLong229;
	}
}
