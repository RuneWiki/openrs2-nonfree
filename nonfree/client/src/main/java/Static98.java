import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!u", name = "X", descriptor = "Z")
	public static boolean aBoolean122;

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "Lclient!rd;")
	public static Interface3 anInterface3_2;

	@OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
	public static int anInt2670;

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "I")
	public static int anInt2671;

	@OriginalMember(owner = "client!u", name = "ab", descriptor = "[I")
	public static final int[] anIntArray327 = new int[256];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
	public static void method1884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt2671 >= anIntArray327.length) {
			anInterface3_2.method1680(anIntArray327, anInt2671);
			anInt2671 = 0;
		}
		anIntArray327[anInt2671++] = arg0 - anInt2670;
		anInt2670 = arg0;
		anIntArray327[anInt2671++] = arg1 << 8 | arg3 | arg2 << 16;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method1885() {
		if (anInt2671 > 0) {
			anInterface3_2.method1680(anIntArray327, anInt2671);
			anInt2671 = 0;
		}
	}
}
