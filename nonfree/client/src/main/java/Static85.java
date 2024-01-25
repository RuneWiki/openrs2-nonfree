import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	public static int anInt1527;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "J")
	public static long aLong49 = 0L;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public static int anInt1517 = 100;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Lclient!cv;")
	public static final Class51 aClass51_6 = new Class51(32);

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_7 = new Class222(2, 4, 4, 0);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)Z")
	public static boolean method1209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static406.method5515(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static58.anInt1051;
			@Pc(14) int local14 = arg2 << Static58.anInt1051;
			return Static87.method4374(local10 + 1, Static256.aClass70Array2[arg0].I(arg1, arg2) + arg3, local14 + 1) && Static87.method4374(local10 + Static297.anInt4985 - 1, Static256.aClass70Array2[arg0].I(arg1 + 1, arg2) + arg3, local14 + 1) && Static87.method4374(local10 + Static297.anInt4985 - 1, Static256.aClass70Array2[arg0].I(arg1 + 1, arg2 + 1) + arg3, local14 + Static297.anInt4985 - 1) && Static87.method4374(local10 + 1, Static256.aClass70Array2[arg0].I(arg1, arg2 + 1) + arg3, local14 + Static297.anInt4985 - 1);
		} else {
			return false;
		}
	}
}
