import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!rp;")
	public static Class172 aClass172_3;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "[Lclient!lq;")
	public static Class125[] aClass125Array2;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Lclient!ji;")
	public static Class97 aClass97_2;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "S")
	public static short aShort14 = 1;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "F")
	public static float aFloat28 = 0.0F;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
	public static void method727() {
		@Pc(1) Class119 local1 = Static139.aClass119_90;
		synchronized (Static139.aClass119_90) {
			Static139.aClass119_90.method3315(5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!on;II)I")
	public static int method728(@OriginalArg(0) Class146 arg0, @OriginalArg(2) int arg1) {
		if (!Static43.method1056(arg0).method708(arg1) && arg0.anObjectArray17 == null) {
			return -1;
		} else if (arg0.anIntArray355 == null || arg1 >= arg0.anIntArray355.length) {
			return -1;
		} else {
			return arg0.anIntArray355[arg1];
		}
	}
}
