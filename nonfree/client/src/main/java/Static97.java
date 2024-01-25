import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
	public static int anInt6022;

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
	public static int anInt6027 = 0;

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "[F")
	public static final float[] aFloatArray43 = new float[4];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)Z")
	public static boolean method5064(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
