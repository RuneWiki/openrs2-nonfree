import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "Lclient!rk;")
	public static Class180 aClass180_28;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "S")
	public static short aShort41 = 320;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I")
	public static int method1869(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([SI)[S")
	public static short[] method1870(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static366.method4206(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
