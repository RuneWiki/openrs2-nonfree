import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!dw", name = "C", descriptor = "Lclient!vd;")
	public static Class246 aClass246_41;

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)V")
	public static void method5959() {
		Static132.aClass127_13.method3249();
		Static435.aClass248_10.method5663();
		Static417.aClass248_9.method5663();
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(III)Z")
	public static boolean method5961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(B)V")
	public static void method5965() {
		Static115.aClass75_3.ua(((float) Static123.aClass21_Sub1_1.anInt864 * 0.1F + 0.7F) * Static21.aFloat10);
		Static115.aClass75_3.XA(Static354.anInt6359, Static338.aFloat15, Static63.aFloat91, (float) (Static424.anInt2293 << 0), (float) (Static47.anInt1161 << 0), (float) (Static181.anInt3716 << 0));
		Static115.aClass75_3.method2599(Static158.aClass7_2);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static294.method4291(arg4)) {
			return;
		}
		if (Static4.aClass68ArrayArray2[arg4] == null) {
			Static56.method1166(Static300.aClass68ArrayArray3[arg4], -1, arg1, arg2, arg6, arg7, arg8, arg0, arg3, arg5);
		} else {
			Static56.method1166(Static4.aClass68ArrayArray2[arg4], -1, arg1, arg2, arg6, arg7, arg8, arg0, arg3, arg5);
		}
	}
}
