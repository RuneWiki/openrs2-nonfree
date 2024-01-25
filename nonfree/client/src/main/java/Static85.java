import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!ta;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!cv;B)I")
	public static int method1343(@OriginalArg(0) Class59 arg0) {
		if (arg0 == Static526.aClass59_4) {
			return 7681;
		} else if (arg0 == Static241.aClass59_1) {
			return 8448;
		} else if (Static351.aClass59_3 == arg0) {
			return 34165;
		} else if (arg0 == Static570.aClass59_5) {
			return 260;
		} else if (arg0 == Static281.aClass59_2) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Z")
	public static boolean method1344(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static573.method7837(arg0, arg1)) {
			return Static533.method7407(arg0, arg1) | (arg1 & 0x9000) != 0 | Static204.method3009(arg1, arg0) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static340.method5138(arg1, arg0) | Static493.method6807(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
	public static void method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg2; local3 <= arg4; local3++) {
			Static455.method6536(arg3, arg1, arg0, Static503.anIntArrayArray12[local3]);
		}
	}
}
