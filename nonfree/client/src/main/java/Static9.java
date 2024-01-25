import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
	public static int anInt223;

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "[I")
	public static final int[] anIntArray18 = new int[8];

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "[I")
	public static final int[] anIntArray19 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "[I")
	public static final int[] anIntArray20 = new int[4096];

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(FFIF)F")
	public static float method376(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * (arg0 - arg2) + arg2;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method378(@OriginalArg(1) String arg0) {
		return Static182.method3004(arg0);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)Lclient!rb;")
	public static Class245 method379(@OriginalArg(1) int arg0) {
		@Pc(8) Class245[] local8 = Static301.method4736();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			if (local8[local18].anInt7646 == arg0) {
				return local8[local18];
			}
		}
		return null;
	}
}
