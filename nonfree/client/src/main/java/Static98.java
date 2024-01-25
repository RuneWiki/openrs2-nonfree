import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "[I")
	public static final int[] anIntArray115 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
	public static int anInt2403 = 1;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_33 = new Class90(3, -1);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)[Lclient!kga;")
	public static Class178[] method1901() {
		return new Class178[] { Static289.aClass178_3, Static17.aClass178_1, Static536.aClass178_4 };
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method1902() {
		@Pc(9) Class167 local9 = Static461.aClass167_48;
		synchronized (Static461.aClass167_48) {
			Static461.aClass167_48.method3961();
		}
		local9 = Static526.aClass167_59;
		synchronized (Static526.aClass167_59) {
			Static526.aClass167_59.method3961();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZ)V")
	public static void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static403.aClass128_3 == Static162.aClass128_1) {
			if (!Static225.method3649(arg1, 0, 1, 1, false, -2, 0, arg0)) {
				Static225.method3649(arg1, 0, 1, 1, false, -3, 0, arg0);
			}
		} else if (!Static225.method3649(arg1, 0, 1, 1, false, -3, 0, arg0)) {
			Static225.method3649(arg1, 0, 1, 1, false, -2, 0, arg0);
		}
	}
}
