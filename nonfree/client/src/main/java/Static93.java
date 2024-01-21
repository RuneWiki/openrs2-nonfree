import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!qf;")
	public static Class77 aClass77_7;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!bc;")
	public static Class1 aClass1_13;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_803 = Static120.method1824(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
	public static int anInt1989 = 0;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "[I")
	public static final int[] anIntArray274 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
	public static void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static75.aClass3_Sub1_Sub4_Sub1Array2[0].method567(arg2, arg4);
		Static75.aClass3_Sub1_Sub4_Sub1Array2[1].method567(arg2, arg4 + arg3 - 16);
		@Pc(28) int local28 = (arg3 - 32) * arg3 / arg1;
		if (local28 < 8) {
			local28 = 8;
		}
		@Pc(47) int local47 = (arg3 - local28 - 32) * arg0 / (arg1 - arg3);
		Static24.method2576(arg2, arg4 + 16, 16, arg3 - 32, Static17.anInt448);
		Static24.method2576(arg2, local47 + arg4 + 16, 16, local28, Static160.anInt3565);
		Static24.method2574(arg2, local47 + arg4 + 16, local28, Static26.anInt605);
		Static24.method2574(arg2 + 1, local47 + 16 + arg4, local28, Static26.anInt605);
		Static24.method2573(arg2, arg4 + local47 + 16, 16, Static26.anInt605);
		Static24.method2573(arg2, local47 + arg4 + 17, 16, Static26.anInt605);
		Static24.method2574(arg2 + 15, local47 + arg4 - -16, local28, Static96.anInt2033);
		Static24.method2574(arg2 + 14, local47 + arg4 + 17, local28 - 1, Static96.anInt2033);
		Static24.method2573(arg2, arg4 + local47 + local28 + 15, 16, Static96.anInt2033);
		Static24.method2573(arg2 + 1, local28 + local47 + 14 + arg4, 15, Static96.anInt2033);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIILclient!dd;IJ)Z")
	public static boolean method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static158.method2514(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}
}
