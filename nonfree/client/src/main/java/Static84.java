import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
	public static int anInt2277;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
	public static int anInt2282;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_52;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "[J")
	public static long[] aLongArray24 = new long[100];

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
	public static int[] anIntArray192 = new int[5];

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "[I")
	public static int[] anIntArray193 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1217 = null;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1218 = Static33.method650("nav");

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1219 = Static33.method650(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([Lclient!oa;I)Lclient!oa;")
	public static Class56 method1524(@OriginalArg(0) Class56[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static51.method984(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)I")
	public static int method1525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static66.aByteArrayArrayArray3[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static66.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public static void method1526() {
		aClass3_Sub1_Sub1_Sub4_52 = null;
		aClass56_1219 = null;
		anIntArray193 = null;
		anIntArray192 = null;
		aClass56_1218 = null;
		aClass56_1217 = null;
		aLongArray24 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Z")
	public static boolean method1527(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
