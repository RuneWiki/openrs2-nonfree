import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Z")
	public static boolean aBoolean98;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public static int anInt1858 = 0;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
	public static final int[] anIntArray179 = new int[256];

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_588 = Static181.method2795("<col=40ff00>");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	public static void method1496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22;
		if (arg1 != Static135.anInt2897) {
			Static107.anIntArray304 = new int[arg1];
			for (local22 = 0; local22 < arg1; local22++) {
				Static107.anIntArray304[local22] = (local22 << 12) / arg1;
			}
			Static201.anInt3995 = arg1 - 1;
			Static165.anInt3384 = arg1 == 64 ? 2048 : 4096;
			Static135.anInt2897 = arg1;
		}
		if (arg0 == Static102.anInt2347) {
			return;
		}
		if (arg0 == Static135.anInt2897) {
			Static81.anIntArray174 = Static107.anIntArray304;
		} else {
			Static81.anIntArray174 = new int[arg0];
			for (local22 = 0; local22 < arg0; local22++) {
				Static81.anIntArray174[local22] = (local22 << 12) / arg0;
			}
		}
		Static207.anInt4078 = arg0 - 1;
		Static102.anInt2347 = arg0;
	}
}
