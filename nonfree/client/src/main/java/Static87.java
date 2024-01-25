import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!lr;")
	public static Class129 aClass129_2;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Lclient!ij;")
	public static Class93 aClass93_36;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Z")
	public static boolean aBoolean113;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
	public static final int[] anIntArray136 = new int[13];

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public static int anInt1616 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
	public static void method1561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static290.anInt2766 / (float) Static290.anInt2777;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(43) int local43 = arg2 - (arg3 - local11) / 2;
		@Pc(52) int local52 = arg0 - (arg1 - local13) / 2;
		Static314.anInt6098 = Static290.anInt2766 - Static290.anInt2766 * local52 / local13;
		Static211.anInt4169 = -1;
		Static348.anInt6698 = -1;
		Static32.anInt633 = Static290.anInt2777 * local43 / local11;
		Static255.method4513();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	public static void method1562() {
		Static289.aClass109_52.method2859(5);
		Static149.aClass109_34.method2859(5);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!aa;")
	public static Class2 method1564(@OriginalArg(0) Component arg0) {
		return new Class2_Sub1(arg0);
	}
}
