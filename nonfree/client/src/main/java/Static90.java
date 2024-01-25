import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "Lclient!gga;")
	public static Class124 aClass124_23;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	public static int anInt1656;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
	public static int anInt1654 = 0;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_20 = new Class341(22, 3);

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)I")
	public static int method1570() {
		@Pc(10) Class22 local10 = Static68.aClass22_7;
		synchronized (Static68.aClass22_7) {
			return Static68.aClass22_7.method464();
		}
	}
}
