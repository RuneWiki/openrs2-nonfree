import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!aj;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array17;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!dj;")
	public static Class49 aClass49_3;

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public static int anInt1846 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method2027() {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(15, 0);
		local8.method2645();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static31.method490(arg6)) {
			Static43.method746(Static81.aClass132ArrayArray1[arg6], -1, arg5, arg1, arg3, arg4, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)I")
	public static int method2030(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
