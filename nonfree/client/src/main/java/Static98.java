import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!t", name = "W", descriptor = "Z")
	public static boolean aBoolean114;

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "Lclient!he;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
	public static int anInt2606;

	@OriginalMember(owner = "client!t", name = "bb", descriptor = "Z")
	public static boolean aBoolean115;

	@OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
	public static int anInt2607;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "Lclient!te;")
	public static final Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "[I")
	public static final int[] anIntArray318 = new int[256];

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	public static void method1846() {
		if (anInt2606 > 0) {
			anInterface2_2.method794(anIntArray318, anInt2606);
			anInt2606 = 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V")
	public static void method1847(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt2606 >= anIntArray318.length) {
			anInterface2_2.method794(anIntArray318, anInt2606);
			anInt2606 = 0;
		}
		anIntArray318[anInt2606++] = arg2 - anInt2607;
		anInt2607 = arg2;
		anIntArray318[anInt2606++] = arg3 << 8 | arg0 | arg1 << 16;
	}
}
