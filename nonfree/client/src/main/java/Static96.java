import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!i", name = "H", descriptor = "[I")
	public static int[] anIntArray195 = new int[100];

	@OriginalMember(owner = "client!i", name = "J", descriptor = "Lclient!lc;")
	public static Class79 aClass79_14 = new Class79(5);

	@OriginalMember(owner = "client!i", name = "M", descriptor = "I")
	public static int anInt2665 = -1;

	@OriginalMember(owner = "client!i", name = "R", descriptor = "I")
	public static int anInt2666 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hc;IIB)Z")
	public static boolean method2050(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) byte[] local9 = arg0.method1874(arg2, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static257.method4148(local9);
			return true;
		}
	}
}
