import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static91 {

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "Lclient!vc;")
	public static Interface4 anInterface4_2;

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "Z")
	public static boolean aBoolean107;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "Z")
	public static boolean aBoolean108;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
	public static int anInt2378;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
	public static int anInt2379;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "[I")
	public static final int[] anIntArray316 = new int[256];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public static void method1474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anIntArray316.length <= anInt2379) {
			anInterface4_2.method1624(anIntArray316, anInt2379);
			anInt2379 = 0;
		}
		anIntArray316[anInt2379++] = arg1 - anInt2378;
		anInt2378 = arg1;
		anIntArray316[anInt2379++] = arg2 << 8 | arg0 | arg3 << 16;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method1475() {
		if (anInt2379 > 0) {
			anInterface4_2.method1624(anIntArray316, anInt2379);
			anInt2379 = 0;
		}
	}
}
