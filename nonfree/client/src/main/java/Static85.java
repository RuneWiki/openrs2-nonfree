import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!ga;")
	public static Class107 aClass107_2;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[[Lclient!gaa;")
	public static Class108[][] aClass108ArrayArray2;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!ga;")
	public static final Class107 aClass107_1 = new Class107("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	public static final int[] anIntArray91 = new int[200];

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public static int anInt2279 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!vv;I)I")
	public static int method2232(@OriginalArg(0) Class363 arg0) {
		if (Static64.aClass363_7 == arg0) {
			return 7681;
		} else if (arg0 == Static25.aClass363_1) {
			return 8448;
		} else if (Static95.aClass363_3 == arg0) {
			return 34165;
		} else if (Static428.aClass363_4 == arg0) {
			return 260;
		} else if (Static537.aClass363_6 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBII)V")
	public static void method2237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static552.aClass3_Sub48_30.aClass23_Sub8_1.method3378() * arg0 >> 8;
		if (arg2 == -1 && !Static48.aBoolean89) {
			Static389.method6143();
		} else if (arg2 != -1 && (Static148.anInt3680 != arg2 || !Static161.method3405()) && local13 != 0 && !Static48.aBoolean89) {
			Static428.method6581(local13, arg1, arg2, Static399.aClass181_75);
			Static545.method7726();
		}
		if (Static148.anInt3680 != arg2) {
			Static408.aClass3_Sub7_Sub5_3 = null;
		}
		Static148.anInt3680 = arg2;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
	public static boolean method2240(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 5 || arg0 == 58 || arg0 == 25 || arg0 == 46 || arg0 == 47 || arg0 == 11;
	}
}
