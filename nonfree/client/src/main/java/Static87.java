import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static87 {

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "Lclient!gb;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "Z")
	public static boolean aBoolean141;

	@OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
	public static int anInt2333;

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
	public static int anInt2334;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "Z")
	public static boolean aBoolean142;

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "[I")
	public static final int[] anIntArray254 = new int[256];

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
	public static void method1444() {
		if (anInt2333 > 0) {
			anInterface2_2.method603(anIntArray254, anInt2333);
			anInt2333 = 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
	public static void method1445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt2333 >= anIntArray254.length) {
			anInterface2_2.method603(anIntArray254, anInt2333);
			anInt2333 = 0;
		}
		anIntArray254[anInt2333++] = arg1 - anInt2334;
		anInt2334 = arg1;
		anIntArray254[anInt2333++] = arg2 << 16 | arg3 | arg0 << 8;
	}
}
