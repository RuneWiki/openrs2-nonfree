import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_37 = new Class239(6, 6);

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_54 = new Class202("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!qp;")
	public static Class239 aClass239_38 = null;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public static void method1699(@OriginalArg(0) int arg0) {
		Static192.anInt3513 = arg0;
		Static2.aClass231_1.method6240();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIII[FIFII)V")
	public static void method1700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg3 - arg2;
		@Pc(17) int local17 = arg8 - arg0;
		@Pc(21) int local21 = arg7 - arg5;
		@Pc(42) float local42 = arg4[2] * (float) local17 + (float) local5 * arg4[1] + (float) local21 * arg4[0];
		@Pc(63) float local63 = arg4[5] * (float) local17 + arg4[4] * (float) local5 + (float) local21 * arg4[3];
		@Pc(84) float local84 = arg4[8] * (float) local17 + (float) local21 * arg4[6] + arg4[7] * (float) local5;
		@Pc(99) float local99 = (float) Math.sqrt((double) (local63 * local63 + local42 * local42 + local84 * local84));
		@Pc(110) float local110 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg6 + (float) Math.asin((double) (local63 / local99)) / 3.1415927F + 0.5F;
		@Pc(144) float local144;
		if (arg1 == 1) {
			local144 = local110;
			local110 = -local123;
			local123 = local144;
		} else if (arg1 == 2) {
			local123 = -local123;
			local110 = -local110;
		} else if (arg1 == 3) {
			local144 = local110;
			local110 = local123;
			local123 = -local144;
		}
		Static431.aFloat209 = local110;
		Static275.aFloat214 = local123;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
	public static int method1702(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!haa;IIII)V")
	public static void method1703(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static477.method7124(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static515.anInt3809) {
			Static477.method7124(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static477.method7124(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static315.anInt5693) {
			Static477.method7124(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static315.anInt5693) {
			Static477.method7124(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static515.anInt3809 && arg4 <= Static315.anInt5693) {
			Static477.method7124(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static477.method7124(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static515.anInt3809 && arg4 > 0) {
			Static477.method7124(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
