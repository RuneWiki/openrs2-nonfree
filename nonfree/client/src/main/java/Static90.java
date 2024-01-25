import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!hu;")
	public static final Class147 aClass147_3 = new Class147("", 16);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([BI)V")
	public static void method2082(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class4_Sub11 local13 = new Class4_Sub11(arg0);
		while (true) {
			@Pc(17) int local17 = local13.method4905();
			if (local17 == 0) {
				return;
			}
			if (local17 == 2) {
				Static529.anInt9421 = local13.method4936();
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static214.aClass4_Sub19_Sub1_1.anInt3064 != 0 && arg1 != 0 && Static459.anInt8551 < 50 && arg3 != -1) {
			Static104.aClass281Array1[Static459.anInt8551++] = new Class281((byte) 1, arg3, arg1, arg2, arg5, arg4, arg0, null);
		}
	}
}
