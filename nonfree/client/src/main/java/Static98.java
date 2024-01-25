import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dha", name = "E", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!dha", name = "l", descriptor = "I")
	public static int anInt6103 = 0;

	@OriginalMember(owner = "client!dha", name = "m", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_114 = new Class337(82, -2);

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!hw;I)V")
	public static void method5413(@OriginalArg(0) Class152 arg0) {
		Static411.aClass152_1 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BI)Z")
	public static boolean method5415(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static555.aCharArray6[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg2) {
			Static55.method946(arg1, arg6, arg4, arg3, arg5, arg2);
		} else if (Static275.anInt4919 <= arg5 - arg2 && arg5 + arg2 <= Static529.anInt9089 && Static554.anInt9362 <= arg1 - arg0 && Static62.anInt1300 >= arg0 + arg1) {
			Static595.method8554(arg1, arg4, arg3, arg0, arg6, arg2, arg5);
		} else {
			Static318.method4861(arg2, arg1, arg4, arg3, arg5, arg6, arg0);
		}
	}
}
