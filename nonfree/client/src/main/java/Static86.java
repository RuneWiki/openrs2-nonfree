import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!rl;")
	public static Class254 aClass254_1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "[I")
	public static final int[] anIntArray179 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method2083() {
		Static222.anInt4501 = 0;
		Static540.anInt9357 = -1;
		Static417.anInt6093 = -1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
	public static void method2085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static295.method4962(false, local35, true);
	}
}
