import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!f", name = "i", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public static int anInt1689;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "Lclient!mr;")
	public static Class135 aClass135_2;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "[Lclient!sb;")
	public static final Class183[] aClass183Array1 = new Class183[16];

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
	public static final int[] anIntArray212 = new int[32];

	@OriginalMember(owner = "client!f", name = "A", descriptor = "I")
	public static int anInt1695 = -1;

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	public static final int anInt1701 = -11713997;

	@OriginalMember(owner = "client!f", name = "R", descriptor = "Ljava/lang/String;")
	public static final String aString66 = "glow2:";

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B[S)[S")
	public static short[] method1645(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static367.method5382(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
