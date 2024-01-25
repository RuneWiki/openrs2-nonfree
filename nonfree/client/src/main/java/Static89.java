import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "[S")
	public static short[] aShortArray6;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_43 = new Class129(11, 6);

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_44 = new Class129(99, 3);

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "Z")
	public static boolean aBoolean110 = true;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIB)V")
	public static void method1303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static98.anInt3331 / (float) Static98.anInt3334;
		@Pc(11) int local11 = arg1;
		@Pc(17) int local17 = arg0;
		if (local9 < 1.0F) {
			local17 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(44) int local44 = arg2 - (arg1 - local11) / 2;
		@Pc(53) int local53 = arg3 - (arg0 - local17) / 2;
		Static390.anInt6394 = -1;
		Static438.anInt7278 = -1;
		Static110.anInt1841 = Static98.anInt3331 - Static98.anInt3331 * local53 / local17;
		Static282.anInt4369 = Static98.anInt3334 * local44 / local11;
		Static462.method6054();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
	public static void method1304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class5_Sub2_Sub9 local16 = Static72.method1073(11, arg1);
		local16.method3026();
		local16.anInt3818 = arg0;
		local16.anInt3826 = arg2;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!za;Lclient!um;)V")
	public static void method1305(@OriginalArg(1) Class200 arg0, @OriginalArg(2) Class243 arg1) {
		if (Static351.aBoolean390) {
			return;
		}
		arg0.t(0);
		Static306.aClass49_11 = arg0.method5871(Static470.method4665(arg1, Static94.anInt1631));
		Static306.aClass49_11.method5785((Static178.anInt5792 - Static306.aClass49_11.RA()) / 2, (Static102.anInt1723 - Static306.aClass49_11.Q()) / 2);
		Static66.aClass49_6 = arg0.method5871(Static470.method4665(arg1, Static1.anInt4522));
		Static66.aClass49_6.method5785((Static178.anInt5792 - Static66.aClass49_6.RA()) / 2, 18);
		Static351.aBoolean390 = true;
	}
}
