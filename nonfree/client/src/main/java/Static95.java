import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "Lclient!qda;")
	public static final Class243 aClass243_6 = new Class243();

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "[Lclient!vi;")
	public static final Class306[] aClass306Array1 = new Class306[4];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Z")
	public static boolean method1856(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 59 || arg0 == 51 || arg0 == 11 || arg0 == 30) {
			return true;
		} else {
			return arg0 == 15 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!fa;IJLclient!qf;IIIII)V")
	public static void method1857(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class245 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) int local11 = arg5 * arg5 + arg6 * arg6;
		if ((long) local11 > arg2) {
			return;
		}
		@Pc(38) int local38 = Math.min(arg3.anInt7249 / 2, arg3.anInt7229 / 2);
		if (local11 <= local38 * local38) {
			Static344.method5465(arg7, arg5, arg6, arg1, arg3, arg0, Static497.aClass119Array15[arg4]);
			return;
		}
		local38 -= 10;
		@Pc(57) int local57;
		if (Static305.anInt5998 == 4) {
			local57 = (int) Static487.aFloat258 & 0x3FFF;
		} else {
			local57 = (int) Static487.aFloat258 + Static262.anInt5488 & 0x3FFF;
		}
		@Pc(68) int local68 = Class5.anIntArray761[local57];
		@Pc(72) int local72 = Class5.anIntArray760[local57];
		if (Static305.anInt5998 != 4) {
			local68 = local68 * 256 / (Static509.anInt8869 + 256);
			local72 = local72 * 256 / (Static509.anInt8869 + 256);
		}
		@Pc(102) int local102 = arg5 * local68 + arg6 * local72 >> 14;
		@Pc(113) int local113 = arg5 * local72 - local68 * arg6 >> 14;
		@Pc(119) double local119 = Math.atan2((double) local102, (double) local113);
		@Pc(126) int local126 = (int) ((double) local38 * Math.sin(local119));
		@Pc(133) int local133 = (int) (Math.cos(local119) * (double) local38);
		Static38.aClass119Array3[arg4].method6675((float) arg3.anInt7249 / 2.0F + (float) arg1 + (float) local126, (float) -local133 + (float) arg7 + (float) arg3.anInt7229 / 2.0F, 4096, (int) (-local119 / 6.283185307179586D * 65535.0D));
	}
}
