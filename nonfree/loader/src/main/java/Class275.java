import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!of")
public final class Class275 {

	@OriginalMember(owner = "loader!of", name = "b", descriptor = "J")
	private static long aLong226;

	@OriginalMember(owner = "loader!of", name = "a", descriptor = "J")
	private static long aLong227;

	@OriginalMember(owner = "loader!of", name = "a", descriptor = "(I)J")
	public static synchronized long method5739(@OriginalArg(0) int arg0) {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong226) {
			aLong227 += aLong226 - local1;
		}
		aLong226 = local1;
		return aLong227 + local1;
	}
}
