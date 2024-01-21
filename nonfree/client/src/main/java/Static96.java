import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!wd;")
	private static Class80 aClass80_962 = Static2.method59("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
	public static int[] anIntArray325 = new int[500];

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_963 = null;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_964 = Static2.method59("Okay");

	@OriginalMember(owner = "client!r", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_965 = Static2.method59("Aus");

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_966 = Static2.method59(" x");

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_967 = aClass80_962;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1510(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static71.aClass45_1);
		arg0.removeMouseMotionListener(Static71.aClass45_1);
		arg0.removeFocusListener(Static71.aClass45_1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)I")
	public static int method1511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static4.method90(arg0 + 45365, arg1 + 91923, 4) + (Static4.method90(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Static4.method90(arg0, arg1, 1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1512() {
		aClass80_962 = null;
		aClass80_966 = null;
		aClass80_965 = null;
		aClass80_967 = null;
		aClass80_964 = null;
		anIntArray325 = null;
		aClass80_963 = null;
	}
}
