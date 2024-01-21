import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	public static int anInt2590;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[2][8];

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(F)F")
	public static float method1915(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
	public static void method1917() {
		aFloatArrayArray1 = null;
		anIntArrayArray23 = null;
	}
}
