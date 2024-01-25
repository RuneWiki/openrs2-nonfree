import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "[Lclient!s;")
	public static Class86[] aClass86Array2;

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "Lclient!so;")
	public static final Class314 aClass314_3 = new Class314(12, 16);

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_19 = new Class257(66, 7);

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "[I")
	public static int[] anIntArray106 = new int[2];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)I")
	public static int method2110(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!tp;B)V")
	public static void method2113(@OriginalArg(0) Class331 arg0) {
		if (Static32.anInt1302 == arg0.anInt9558) {
			Static620.aBooleanArray29[arg0.anInt9502] = true;
		}
	}
}
