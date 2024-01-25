import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!di", name = "I", descriptor = "[I")
	public static int[] anIntArray186;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_26 = new Class306("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!di", name = "H", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_21 = new Class37();

	@OriginalMember(owner = "client!di", name = "J", descriptor = "I")
	public static int anInt1831 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ph;B[BI)Lclient!ob;")
	public static Class213 method1569(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static520.anIntArray819, 0);
		if (Static520.anIntArray819[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class213(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZFFF)I")
	public static int method1570(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(21) float local21 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local21 > local12 && local35 < local21) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local35 > local21) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
