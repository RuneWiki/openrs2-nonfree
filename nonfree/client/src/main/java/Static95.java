import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dia", name = "z", descriptor = "Lclient!eq;")
	public static Class97 aClass97_21;

	@OriginalMember(owner = "client!dia", name = "q", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_21 = new Class269(58, 16);

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!dia", name = "y", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_23 = new Class274(54, 3);

	@OriginalMember(owner = "client!dia", name = "A", descriptor = "Lclient!ee;")
	public static final Class86 aClass86_5 = new Class86("LIVE", 0);

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "([SII)[S")
	public static short[] method1658(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static649.method4859(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
