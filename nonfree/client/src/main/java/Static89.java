import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt1730;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[2][8];

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(F)F")
	public static float method1630(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
