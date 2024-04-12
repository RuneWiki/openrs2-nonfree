import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
	public static int[] anIntArray548;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public static int anInt2513;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 aClass2_Sub2_Sub2_Sub4_10;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 37)
	public static void method1666() {
		Class63.aClass44_9 = null;
		anIntArray548 = null;
		aClass2_Sub2_Sub2_Sub4_10 = null;
		Class63.anIntArray549 = null;
		Class63.aClass40_724 = null;
		Class63.aClass40_723 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)V", line = 55)
	public static void method1667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Class14.anInt426 = -1;
			Class18_Sub1.anInt477 = -1;
			return;
		}
		@Pc(34) int local34 = Static78.method1383(Static1.anInt8, arg1, arg2) - arg0;
		@Pc(38) int local38 = arg1 - Static44.anInt1114;
		@Pc(42) int local42 = arg2 - Static14.anInt1863;
		@Pc(46) int local46 = Class2_Sub2_Sub12_Sub4.anIntArray386[Static33.anInt824];
		@Pc(50) int local50 = Class2_Sub2_Sub12_Sub4.anIntArray402[Static33.anInt824];
		@Pc(54) int local54 = local34 - Static73.anInt1935;
		@Pc(58) int local58 = Class2_Sub2_Sub12_Sub4.anIntArray386[Static26.anInt686];
		@Pc(62) int local62 = Class2_Sub2_Sub12_Sub4.anIntArray402[Static26.anInt686];
		@Pc(73) int local73 = local58 * local42 + local38 * local62 >> 16;
		@Pc(84) int local84 = local62 * local42 - local58 * local38 >> 16;
		@Pc(86) int local86 = local73;
		@Pc(97) int local97 = local54 * local50 - local84 * local46 >> 16;
		@Pc(108) int local108 = local54 * local46 + local84 * local50 >> 16;
		if (local108 < 50) {
			Class18_Sub1.anInt477 = -1;
			Class14.anInt426 = -1;
		} else {
			Class18_Sub1.anInt477 = (local97 << 9) / local108 + 167;
			Class14.anInt426 = (local86 << 9) / local108 + 256;
		}
	}
}
