import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	public static int anInt2242;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray31 = new int[2][8];

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
	public static void method1503() {
		aFloatArrayArray2 = null;
		anIntArrayArray31 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(F)F")
	public static float method1507(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
