import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "Lclient!jja;")
	public static Class5_Sub30 aClass5_Sub30_1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public static void method1314() {
		Static214.aClass265_21.method6573();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIIB)Z")
	public static boolean method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg4 + arg5;
		@Pc(13) int local13 = arg1 + arg3;
		@Pc(17) int local17 = arg2 + arg0;
		if (!Static13.method189(local13, arg4, local13, local17, local17, local13, local8, arg4, arg2)) {
			return false;
		} else if (Static13.method189(local13, arg4, local13, arg2, local17, local13, local8, local8, arg2)) {
			if (Static62.anInt988 <= arg4) {
				if (!Static13.method189(arg1, local8, local13, arg2, local17, local13, local8, local8, local17)) {
					return false;
				}
				if (!Static13.method189(arg1, local8, arg1, arg2, arg2, local13, local8, local8, local17)) {
					return false;
				}
			} else if (!Static13.method189(arg1, arg4, local13, arg2, local17, local13, arg4, arg4, local17)) {
				return false;
			} else if (!Static13.method189(arg1, arg4, arg1, arg2, arg2, local13, arg4, arg4, local17)) {
				return false;
			}
			if (arg2 < Static668.anInt10414) {
				if (!Static13.method189(arg1, arg4, local13, arg2, arg2, local13, local8, arg4, arg2)) {
					return false;
				}
				if (!Static13.method189(arg1, arg4, arg1, arg2, arg2, local13, local8, local8, arg2)) {
					return false;
				}
			} else if (!Static13.method189(arg1, arg4, local13, local17, local17, local13, local8, arg4, local17)) {
				return false;
			} else if (!Static13.method189(arg1, arg4, arg1, local17, local17, local13, local8, local8, local17)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZB)V")
	public static void method1316(@OriginalArg(0) boolean arg0) {
		if (Static505.aString91.length() == 0) {
			return;
		}
		Static611.method8213("--> " + Static505.aString91);
		Static16.method8199(false, Static505.aString91, arg0);
		Static124.anInt2153 = 0;
		Static505.aString91 = "";
		Static106.anInt1899 = 0;
	}
}
