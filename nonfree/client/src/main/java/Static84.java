import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "Lclient!ac;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "Z")
	public static boolean aBoolean112;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "Z")
	public static boolean aBoolean113;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
	public static int anInt2364;

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
	public static int anInt2365;

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_1 = new Class2();

	@OriginalMember(owner = "client!ra", name = "ib", descriptor = "[I")
	public static final int[] anIntArray235 = new int[256];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBIII)V")
	public static void method1620(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anIntArray235.length <= anInt2364) {
			anInterface1_2.method38(anIntArray235, anInt2364);
			anInt2364 = 0;
		}
		anIntArray235[anInt2364++] = arg2 - anInt2365;
		anInt2365 = arg2;
		anIntArray235[anInt2364++] = arg0 | arg1 << 8 | arg3 << 16;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
	public static void method1621() {
		if (anInt2364 > 0) {
			anInterface1_2.method38(anIntArray235, anInt2364);
			anInt2364 = 0;
		}
	}
}
