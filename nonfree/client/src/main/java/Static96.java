import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!et", name = "k", descriptor = "[Lclient!gg;")
	public static Class3_Sub2[] aClass3_Sub2Array2;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "Lclient!cd;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!et", name = "G", descriptor = "I")
	public static final int anInt2360 = 1407;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Lclient!tt;")
	public static Class219_Sub1 method1837() {
		return Static397.aClass219_Sub1Array3.length > Static34.anInt679 ? Static397.aClass219_Sub1Array3[Static34.anInt679++] : null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIILclient!ya;IIII[[[B)V")
	public static void method1838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class49 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg9 == 0 || arg8 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg6 = arg6 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg9 = 1;
			arg6 = arg6 + 3 & 0x3;
		}
		if (arg9 == 11) {
			arg9 = 8;
			arg6 = arg6 + 3 & 0x3;
		}
		arg7.DA(arg4, arg1, arg5, arg2, arg3, arg0, arg11[arg9 - 1][arg6], arg8, arg10);
	}
}
