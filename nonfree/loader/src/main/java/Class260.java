import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!qp")
public final class Class260 {

	@OriginalMember(owner = "loader!qp", name = "b", descriptor = "J")
	private static long aLong244;

	@OriginalMember(owner = "loader!qp", name = "a", descriptor = "J")
	private static long aLong245;

	@OriginalMember(owner = "loader!qp", name = "a", descriptor = "(I)J")
	public static synchronized long method5808() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong244 > local1) {
			aLong245 += aLong244 - local1;
		}
		aLong244 = local1;
		return local1 + aLong245;
	}
}
