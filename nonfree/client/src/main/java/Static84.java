import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "[F")
	public static final float[] aFloatArray12 = new float[16];

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "Lclient!s;")
	public static final Class217 aClass217_40 = new Class217(4, 12);

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	public static int anInt1815 = 0;

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
	public static int anInt1816 = -1;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)I")
	public static int method1604(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)B")
	public static byte method1605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
