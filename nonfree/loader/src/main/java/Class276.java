import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ki")
public final class Class276 {

	@OriginalMember(owner = "loader!ki", name = "a", descriptor = "J")
	private static long aLong229;

	@OriginalMember(owner = "loader!ki", name = "b", descriptor = "J")
	private static long aLong230;

	@OriginalMember(owner = "loader!ki", name = "a", descriptor = "(I)J")
	public static synchronized long method6151(@OriginalArg(0) int arg0) {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong229 > local1) {
			aLong230 += aLong229 - local1;
		}
		aLong229 = local1;
		return local1 + aLong230;
	}
}
