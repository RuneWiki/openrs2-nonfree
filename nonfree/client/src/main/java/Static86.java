import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!gj", name = "H", descriptor = "[S")
	public static short[] aShortArray31 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "[S")
	public static short[] aShortArray32 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
	public static int anInt1914 = 0;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)I")
	public static int method1624(@OriginalArg(1) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 >= 0) {
			return 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	public static void method1625() {
		Static28.aClass46_5.method1068(5);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILclient!jd;B)Lclient!rj;")
	public static Class2_Sub3_Sub1 method1626(@OriginalArg(0) int arg0, @OriginalArg(2) Class84 arg1) {
		return Static288.method4789(0, arg0, arg1) ? Static59.method1133() : null;
	}
}
