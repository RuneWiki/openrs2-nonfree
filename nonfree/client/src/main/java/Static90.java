import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static90 {

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Lclient!jg;")
	public static Class4_Sub2_Sub11 aClass4_Sub2_Sub11_11;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!ul;")
	public static Class172 aClass172_42 = new Class172(5);

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "[Lclient!ud;")
	public static Class13_Sub7[] aClass13_Sub7Array3 = new Class13_Sub7[4];

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
	public static int[] anIntArray394 = new int[5];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)I")
	public static int method3970(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
