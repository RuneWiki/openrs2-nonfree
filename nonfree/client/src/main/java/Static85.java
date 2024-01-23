import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_56;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!p;")
	public static Class75 aClass75_4;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public static int anInt2169;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
	public static int[] anIntArray211 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_640 = Static184.method2923("headicons_pk");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZZZ)Lclient!bj;")
	public static Class15_Sub1 method1529(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) Class96 local13 = null;
		if (Static17.aClass56_1 != null) {
			local13 = new Class96(arg0, Static17.aClass56_1, Static218.aClass56Array1[arg0], 1000000);
		}
		return new Class15_Sub1(local13, Static150.aClass96_4, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!i;SJLclient!i;I)V")
	public static void method1530(@OriginalArg(1) int arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) short arg2, @OriginalArg(4) long arg3, @OriginalArg(5) Class41 arg4, @OriginalArg(6) int arg5) {
		if (Static94.aBoolean123 || Static179.anInt4150 >= 500) {
			return;
		}
		Static59.aClass41Array24[Static179.anInt4150] = arg1;
		Static177.aClass41Array63[Static179.anInt4150] = arg4;
		Static48.aShortArray34[Static179.anInt4150] = arg2;
		Static65.aLongArray4[Static179.anInt4150] = arg3;
		Static148.anIntArray346[Static179.anInt4150] = arg0;
		Static192.anIntArray451[Static179.anInt4150] = arg5;
		Static179.anInt4150++;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!nb;)V")
	public static void method1531(@OriginalArg(1) Class15 arg0) {
		Static160.aClass15_34 = arg0;
	}
}
