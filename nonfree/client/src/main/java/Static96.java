import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
	public static int anInt1957 = 0;

	@OriginalMember(owner = "client!gm", name = "N", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!gm", name = "O", descriptor = "[Lclient!vj;")
	public static Class29_Sub1[] aClass29_Sub1Array3 = new Class29_Sub1[0];

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!hi;III)V")
	public static void method1761(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte9 == 0) {
			arg0.anInt2174 = arg0.anInt2148;
		} else if (arg0.aByte9 == 1) {
			arg0.anInt2174 = (arg2 - arg0.anInt2207) / 2 + arg0.anInt2148;
		} else if (arg0.aByte9 == 2) {
			arg0.anInt2174 = arg2 - arg0.anInt2207 - arg0.anInt2148;
		} else if (arg0.aByte9 == 3) {
			arg0.anInt2174 = arg2 * arg0.anInt2148 >> 14;
		} else if (arg0.aByte9 == 4) {
			arg0.anInt2174 = (arg2 * arg0.anInt2148 >> 14) + (arg2 - arg0.anInt2207) / 2;
		} else {
			arg0.anInt2174 = arg2 - arg0.anInt2207 - (arg2 * arg0.anInt2148 >> 14);
		}
		if (arg0.aByte12 == 0) {
			arg0.anInt2135 = arg0.anInt2192;
		} else if (arg0.aByte12 == 1) {
			arg0.anInt2135 = (arg1 - arg0.anInt2204) / 2 + arg0.anInt2192;
		} else if (arg0.aByte12 == 2) {
			arg0.anInt2135 = arg1 - arg0.anInt2204 - arg0.anInt2192;
		} else if (arg0.aByte12 == 3) {
			arg0.anInt2135 = arg0.anInt2192 * arg1 >> 14;
		} else if (arg0.aByte12 == 4) {
			arg0.anInt2135 = (arg1 * arg0.anInt2192 >> 14) + (arg1 - arg0.anInt2204) / 2;
		} else {
			arg0.anInt2135 = arg1 - (arg0.anInt2192 * arg1 >> 14) - arg0.anInt2204;
		}
		if (!Static95.aBoolean103 || Static37.method679(arg0).anInt3570 == 0 && arg0.anInt2176 != 0) {
			return;
		}
		if (arg0.anInt2174 < 0) {
			arg0.anInt2174 = 0;
		} else if (arg0.anInt2207 + arg0.anInt2174 > arg2) {
			arg0.anInt2174 = arg2 - arg0.anInt2207;
		}
		if (arg0.anInt2135 < 0) {
			arg0.anInt2135 = 0;
		} else if (arg0.anInt2135 + arg0.anInt2204 > arg1) {
			arg0.anInt2135 = arg1 - arg0.anInt2204;
		}
	}

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V")
	public static void method1763() {
		Static173.aClass187_90.method4530();
	}
}
