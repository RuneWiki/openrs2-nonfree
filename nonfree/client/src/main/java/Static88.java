import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "Lclient!vp;")
	public static Class309 aClass309_4;

	@OriginalMember(owner = "client!dk", name = "O", descriptor = "Lclient!caa;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
	public static int anInt2254 = -1;

	@OriginalMember(owner = "client!dk", name = "L", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_30 = new Class6(6, 10);

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)J")
	public static long method2130() {
		return Static106.aClass125_1.method5264();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIBII)V")
	public static void method2131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class28[] local7 = Static484.aClass28Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(14) Class28 local14 = local7[local9];
			if (local14 != null && local14.anInt1262 == 2) {
				Static77.method1974(arg1 >> 1, local14.anInt1258 * 2, local14.anInt1260, arg3 >> 1, local14.anInt1263, local14.anInt1268);
				if (Static367.anIntArray490[0] > -1 && Static416.anInt7252 % 20 < 10) {
					Static81.aClass12Array8[local14.anInt1264].method7191(Static367.anIntArray490[0] + arg2 - 12, Static367.anIntArray490[1] + arg0 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZI)V")
	public static void method2132(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static506.anInt8606--;
			if (Static506.anInt8606 == 0) {
				Static180.anIntArray297 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static495.anInt8413--;
		if (Static495.anInt8413 == 0) {
			Static392.anIntArray516 = null;
			return;
		}
	}
}
