import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public static int anInt1631;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!jj;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "I")
	public static int anInt1634 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
	public static void method1541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(4, (long) arg1);
		local9.method2486();
		local9.anInt2674 = arg2;
		local9.anInt2680 = arg3;
		local9.anInt2679 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
	public static void method1542(@OriginalArg(0) int arg0) {
		Static69.anInt1350 = -1;
		Static609.anInt10718 = arg0;
		Static69.anInt1350 = -1;
		Static366.method6212();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Z")
	public static boolean method1543(@OriginalArg(1) int arg0) {
		if (arg0 == 23 || arg0 == 25 || arg0 == 6 || arg0 == 47 || arg0 == 60) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1007;
		}
	}
}
