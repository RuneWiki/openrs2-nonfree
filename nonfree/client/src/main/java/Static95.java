import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static95 {

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!al;")
	public static final Class11 aClass11_52 = new Class11(50);

	@OriginalMember(owner = "client!g", name = "K", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_9 = new Class18();

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
	public static int anInt2209 = 0;

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
	public static int anInt2210 = 2;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method2185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static6.anInt136 <= arg0 && Static275.anInt5244 >= arg0 && Static6.anInt136 <= arg7 && Static275.anInt5244 >= arg7 && arg2 >= Static6.anInt136 && Static275.anInt5244 >= arg2 && Static6.anInt136 <= arg8 && Static275.anInt5244 >= arg8 && Static32.anInt750 <= arg4 && Static112.anInt2485 >= arg4 && arg6 >= Static32.anInt750 && Static112.anInt2485 >= arg6 && Static32.anInt750 <= arg3 && arg3 <= Static112.anInt2485 && arg5 >= Static32.anInt750 && Static112.anInt2485 >= arg5) {
			Static171.method3335(arg4, arg8, arg0, arg5, arg1, arg7, arg2, arg3, arg6);
		} else {
			Static90.method2139(arg3, arg4, arg5, arg6, arg0, arg8, arg7, arg1, arg2);
		}
	}
}
