import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
	public static int anInt1572;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[2][8];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(F)F")
	public static float method1479(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
