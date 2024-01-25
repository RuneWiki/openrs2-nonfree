import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dda", name = "u", descriptor = "[I")
	public static final int[] anIntArray92 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1894(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIZIIIIIZ)Z")
	public static boolean method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0];
		@Pc(13) int local13 = Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0];
		if (local8 < 0 || Static460.anInt8640 <= local8 || local13 < 0 || Static292.anInt7682 <= local13) {
			return false;
		} else if (arg4 >= 0 && arg4 < Static460.anInt8640 && arg3 >= 0 && arg3 < Static292.anInt7682) {
			@Pc(67) int local67 = Static515.method7678(arg4, arg7, arg5, Static248.anIntArray320, arg3, arg1, arg0, Static485.anIntArray585, arg6, arg2, Static403.aClass350Array1[Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103], local8, local13, Static443.aClass2_Sub2_Sub1_Sub1_2.method6311());
			if (local67 < 1) {
				return false;
			}
			Static567.anInt10049 = Static248.anIntArray320[local67 - 1];
			Static387.anInt7430 = Static485.anIntArray585[local67 - 1];
			Static394.aBoolean643 = false;
			Static124.method2510();
			return true;
		} else {
			return false;
		}
	}
}
