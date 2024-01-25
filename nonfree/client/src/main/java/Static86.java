import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Lclient!g;")
	public static Class83 aClass83_38;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_58 = new Class62("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public static int anInt1844 = 0;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BIII)I")
	public static int method1459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 <= arg1) {
			return arg1 > arg0 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public static void method1460() {
		if (Static147.anInt3137 == 5) {
			Static147.anInt3137 = 6;
		}
	}
}
