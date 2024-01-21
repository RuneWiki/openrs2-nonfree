import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_996 = Static193.method3027("<img=1>");

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt2029 = 0;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "[I")
	public static final int[] anIntArray112 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_997 = Static193.method3027("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_998 = Static193.method3027(": ");

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_999 = Static193.method3027("null");

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1000 = aClass70_997;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1412() {
		@Pc(3) Class44 local3 = Static52.aClass44_1;
		synchronized (Static52.aClass44_1) {
			Static83.anInt1645++;
			Static118.anInt2399 = Static11.anInt301;
			@Pc(23) int local23;
			if (Static88.anInt1710 < 0) {
				for (local23 = 0; local23 < 112; local23++) {
					Static81.aBooleanArray4[local23] = false;
				}
				Static88.anInt1710 = Static62.anInt1308;
			} else {
				while (Static62.anInt1308 != Static88.anInt1710) {
					local23 = Static78.anIntArray84[Static62.anInt1308];
					Static62.anInt1308 = Static62.anInt1308 + 1 & 0x7F;
					if (local23 < 0) {
						Static81.aBooleanArray4[~local23] = false;
					} else {
						Static81.aBooleanArray4[local23] = true;
					}
				}
			}
			Static11.anInt301 = Static40.anInt862;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static119.anInt2428 <= arg6 && arg1 <= Static200.anInt4074 && Static26.anInt554 <= arg2 && arg4 <= Static52.anInt1117) {
			Static141.method2012(arg3, arg2, arg1, arg5, arg0, arg6, arg4);
		} else {
			Static97.method1403(arg0, arg1, arg4, arg3, arg2, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)I")
	public static int method1414(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
