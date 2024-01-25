import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static94 {

	@OriginalMember(owner = "client!ek", name = "H", descriptor = "[I")
	public static final int[] anIntArray76 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
	public static void method1356(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static149.anInt7384 = arg1;
		Static13.anInt263 = arg0;
		Static74.anInt1413 = 0;
		Static271.anInt4271 = 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!vg;)V")
	public static void method1357(@OriginalArg(1) Class250 arg0) {
		if (arg0.anInt7020 == Static350.anInt5712) {
			Static145.aBooleanArray15[arg0.anInt6962] = true;
		}
	}
}
