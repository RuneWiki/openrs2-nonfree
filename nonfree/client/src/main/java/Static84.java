import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	public static int anInt1908;

	@OriginalMember(owner = "client!dv", name = "D", descriptor = "Lclient!ic;")
	public static Class4_Sub21 aClass4_Sub21_1;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!of;)V")
	public static void method1448(@OriginalArg(1) Class4_Sub30_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static182.anInt3388; local7++) {
			@Pc(13) int local13 = Static149.anIntArray236[local7];
			@Pc(17) Class6_Sub2_Sub1_Sub1 local17 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local13];
			@Pc(21) int local21 = arg0.method4864();
			if ((local21 & 0x2) != 0) {
				local21 += arg0.method4864() << 8;
			}
			if ((local21 & 0x200) != 0) {
				local21 += arg0.method4864() << 16;
			}
			Static90.method1490(local13, arg0, local17, local21);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III[I[ILclient!bv;)Lclient!rr;")
	public static Class57_Sub2 method1449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class30_Sub1 arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg1 * local12 + arg2[local12];
			for (@Pc(24) int local24 = 0; local24 < arg3[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class57_Sub2(arg4, arg1, arg0, local10);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
	public static void method1450() {
		if (Static344.anInt6187 != -1) {
			Static82.method1419(Static344.anInt6187, -1, false, -1);
			Static344.anInt6187 = -1;
		}
	}
}
