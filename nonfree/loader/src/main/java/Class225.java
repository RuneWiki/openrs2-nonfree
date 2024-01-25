import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!pm")
public final class Class225 {

	@OriginalMember(owner = "loader!pm", name = "a", descriptor = "J")
	private static long aLong223;

	@OriginalMember(owner = "loader!pm", name = "b", descriptor = "J")
	private static long aLong224;

	@OriginalMember(owner = "loader!pm", name = "a", descriptor = "(I)J")
	public static synchronized long method5865() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong224 > local1) {
			aLong223 += aLong224 - local1;
		}
		aLong224 = local1;
		return aLong223 + local1;
	}
}
