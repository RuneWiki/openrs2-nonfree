import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_41 = new Class129(75, 5);

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_23 = new Class198("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_24 = new Class198("K", "T", "K", "K");

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "I")
	public static int anInt1563 = 0;

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_25 = new Class198(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public static void method1259() {
		Static49.aClass76Array1 = null;
		Static283.method3500(0, Static102.anInt1723, Static199.anInt3319, 0, Static178.anInt5792, 0, 0, -1);
		if (Static49.aClass76Array1 != null) {
			Static116.method1602(0, Static209.anInt3496, Static178.anInt5792, 0, Static245.anInt3960, Static359.aClass76_13.anInt2122, -1412584499, Static102.anInt1723, Static49.aClass76Array1);
			Static49.aClass76Array1 = null;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)I")
	public static int method1263(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
