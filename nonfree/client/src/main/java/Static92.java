import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public static int anInt1522;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "[Lclient!iu;")
	public static Class180_Sub1[] aClass180_Sub1Array1 = new Class180_Sub1[0];

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "[I")
	public static final int[] anIntArray76 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIB)I")
	public static int method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg1 >> 31 & arg0 - 1;
		return local18 + ((arg1 >>> 31) + arg1) % arg0;
	}
}
