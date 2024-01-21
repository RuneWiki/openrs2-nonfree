import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt2018;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[2][8];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(F)F")
	public static float method1366(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
	public static void method1368() {
		aFloatArrayArray1 = null;
		anIntArrayArray26 = null;
	}
}
