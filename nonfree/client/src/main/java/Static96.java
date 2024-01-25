import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!di", name = "d", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public static int anInt2369;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public static int anInt2368 = 1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)J")
	public static synchronized long method2000() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static251.aLong170) {
			Static479.aLong225 += Static251.aLong170 - local5;
		}
		Static251.aLong170 = local5;
		return Static479.aLong225 + local5;
	}
}
