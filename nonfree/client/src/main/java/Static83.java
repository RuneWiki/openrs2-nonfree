import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!ha;")
	public static Class5_Sub20 aClass5_Sub20_1;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
	public static int anInt2053;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
	public static int anInt2057;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "[I")
	public static final int[] anIntArray116 = new int[14];

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString122 = "Hidden";

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
	public static void method1901(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub9_Sub16 local12 = Static239.method4052(1, arg0);
		local12.method4138();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIII)V")
	public static void method1902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static126.anInt2647 == 0 || arg2 == 0 || Static225.anInt4428 >= 50 || arg3 == -1) {
			return;
		}
		Static77.anIntArray100[Static225.anInt4428] = arg3;
		Static70.anIntArray82[Static225.anInt4428] = arg2;
		Static144.anIntArray189[Static225.anInt4428] = arg0;
		Static94.aClass196Array1[Static225.anInt4428] = null;
		Static337.anIntArray548[Static225.anInt4428] = 0;
		Static48.anIntArray57[Static225.anInt4428] = arg1;
		Static225.anInt4428++;
	}
}
