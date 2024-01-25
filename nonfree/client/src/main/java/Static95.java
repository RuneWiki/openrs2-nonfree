import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
	public static int anInt2058;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray21 = new int[2][8];

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[2][8];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(F)F")
	public static float method1976(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
