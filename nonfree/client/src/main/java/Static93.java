import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!en", name = "q", descriptor = "[Lclient!kr;")
	public static Class136[] aClass136Array1;

	@OriginalMember(owner = "client!en", name = "v", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!en", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[200];

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Z")
	public static boolean method1695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
