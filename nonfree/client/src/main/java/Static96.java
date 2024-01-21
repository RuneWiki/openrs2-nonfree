import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_818 = Static120.method1824("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public static int anInt2027 = -1;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_819 = Static120.method1824("To create a new account you need to");

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "Lclient!rd;")
	public static Class80 aClass80_820 = aClass80_819;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "[I")
	public static final int[] anIntArray281 = new int[] { 0, -1, 0, 6, 6, 0, 0, 0, 0, 0, 2, 0, 0, 7, 0, 0, 0, 0, 0, 7, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 5, 0, 6, 0, 4, -1, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 4, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 6, 0, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, -1, 0, 6, 0, 6, 0, 0, 2, 0, -2, 0, 0, 12, -2, 15, 0, 2, 0, 2, 0, 5, 0, 0, 0, 0, 6, 0, -2, 0, 0, 0, 0, 0, -1, 6, 0, -1, 6, 0, 0, 10, -2, 0, 5, 0, 10, 0, 6, 1, 0, -2, 0, 2, 0, 4, 0, 1, 0, 0, 5, 0, 0, -2, 0, 0, 3, 0, 0, 0, 0, 0, 0, 8, -1, 0, 4, 0, -2, 0, 14, 0, 0, 2, 0, 0, 0, 20, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, -2, 0, 0, -2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 7, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0, 0, 24, 0 };

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "[I")
	public static final int[] anIntArray282 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
	public static final int anInt2033 = 3353893;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lclient!cd;")
	public static Class3_Sub1_Sub3 method1446(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub3 local10 = (Class3_Sub1_Sub3) Static176.aClass5_57.method139((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static145.aClass1_25.method60(4, arg0);
		local10 = new Class3_Sub1_Sub3();
		if (local25 != null) {
			local10.method363(arg0, new Class3_Sub17(local25));
		}
		Static176.aClass5_57.method145(local10, (long) arg0);
		return local10;
	}
}
