import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	public static int anInt1571 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)Z")
	public static boolean method1287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static290.method3791(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static384.anInt6381;
			@Pc(14) int local14 = arg2 << Static384.anInt6381;
			return Static95.method1363(local10 + 1, Static202.aClass163Array2[arg0].I(arg1, arg2) + arg3, local14 + 1) && Static95.method1363(local10 + Static329.anInt5395 - 1, Static202.aClass163Array2[arg0].I(arg1 + 1, arg2) + arg3, local14 + 1) && Static95.method1363(local10 + Static329.anInt5395 - 1, Static202.aClass163Array2[arg0].I(arg1 + 1, arg2 + 1) + arg3, local14 + Static329.anInt5395 - 1) && Static95.method1363(local10 + 1, Static202.aClass163Array2[arg0].I(arg1, arg2 + 1) + arg3, local14 + Static329.anInt5395 - 1);
		} else {
			return false;
		}
	}
}
