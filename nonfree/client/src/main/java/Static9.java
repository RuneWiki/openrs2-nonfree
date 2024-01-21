import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] aClass1_Sub2_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!vb;")
	public static Class82 aClass82_3;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!ah;")
	public static Class5 aClass5_3 = new Class5(4096);

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	public static int anInt172 = 2;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_87 = Static120.method2057("sl_flags");

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
	public static int anInt178 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Z")
	public static boolean method133(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public static void method137() {
		anIntArrayArray2 = null;
		aClass82_3 = null;
		aClass1_Sub2_Sub2_Sub4_1 = null;
		aClass1_Sub2_Sub2_Sub3Array2 = null;
		aClass81_87 = null;
		aClass5_3 = null;
	}
}
