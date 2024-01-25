import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "[I")
	public static int[] anIntArray618;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!al;")
	public static final Class11 aClass11_141 = new Class11(4);

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
	public static int anInt6472 = 0;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)I")
	public static int method5758() {
		return Static95.anInt2210;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
	public static void method5761() {
		@Pc(11) Class11 local11 = Static281.aClass11_124;
		synchronized (Static281.aClass11_124) {
			Static281.aClass11_124.method215(5);
		}
	}
}
