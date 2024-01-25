import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static91 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public static int anInt6734;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
	public static int[] anIntArray385;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_171 = new Class381(9, 18);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5827(@OriginalArg(1) String arg0) {
		Static464.method6554("", "", 0, "", arg0, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)I")
	public static int method5830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) - (-(arg1 >> 5 << 7) - (arg2 >> 1));
	}
}
