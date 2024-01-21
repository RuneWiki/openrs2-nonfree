import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lclient!qf;")
	public static Class77 aClass77_5;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
	public static int anInt1779 = 100;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
	public static int anInt1781 = 0;

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
	public static int anInt1782 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIBIIILclient!qf;)V")
	public static void method1248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class77 arg6) {
		if (Static177.aBoolean156) {
			Static124.anInt2672 = 32;
		} else {
			Static124.anInt2672 = 0;
		}
		Static177.aBoolean156 = false;
		@Pc(141) int local141;
		if (Static129.anInt2784 != 0) {
			if (arg1 >= arg0 && arg0 + 16 > arg1 && arg4 >= arg5 && arg5 + 16 > arg4) {
				arg6.anInt3213 -= 4;
				Static186.method3014(arg6);
			} else if (arg0 <= arg1 && arg1 < arg0 + 16 && arg4 >= arg3 + arg5 - 16 && arg4 < arg3 + arg5) {
				arg6.anInt3213 += 4;
				Static186.method3014(arg6);
			} else if (arg0 - Static124.anInt2672 <= arg1 && Static124.anInt2672 + arg0 + 16 > arg1 && arg5 + 16 <= arg4 && arg3 + arg5 - 16 > arg4) {
				local141 = (arg3 - 32) * arg3 / arg2;
				if (local141 < 8) {
					local141 = 8;
				}
				@Pc(157) int local157 = arg4 - local141 / 2 - arg5 - 16;
				@Pc(163) int local163 = arg3 - local141 - 32;
				arg6.anInt3213 = local157 * (arg2 - arg3) / local163;
				Static186.method3014(arg6);
				Static177.aBoolean156 = true;
			}
		}
		if (Static147.anInt3297 == 0) {
			return;
		}
		local141 = arg6.anInt3251;
		if (arg0 - local141 <= arg1 && arg4 >= arg5 && arg0 + 16 > arg1 && arg3 + arg5 >= arg4) {
			arg6.anInt3213 += Static147.anInt3297 * 45;
			Static186.method3014(arg6);
		}
	}
}
