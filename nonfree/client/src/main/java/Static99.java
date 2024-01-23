import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array11;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!mf;")
	public static Class100 aClass100_2;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
	public static int[] anIntArray222 = new int[14];

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Lclient!tl;")
	public static Class155 aClass155_17 = new Class155(16);

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Lclient!ol;")
	public static Class117 aClass117_7 = new Class117(512);

	@OriginalMember(owner = "client!he", name = "t", descriptor = "I")
	public static volatile int anInt2208 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1657(@OriginalArg(1) String arg0) {
		Static24.aString15 = arg0;
		if (Static43.aClass66_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(22) String local22 = Static43.aClass66_1.anApplet1.getParameter("cookieprefix");
			@Pc(27) String local27 = Static43.aClass66_1.anApplet1.getParameter("cookiehost");
			@Pc(42) String local42 = local22 + "settings=" + arg0 + "; version=1; path=/; domain=" + local27;
			if (arg0.length() == 0) {
				local42 = local42 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local42 = local42 + "; Expires=" + Static101.method2282(Static294.method4792() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static301.method407("document.cookie=\"" + local42 + "\"", Static43.aClass66_1.anApplet1);
		} catch (@Pc(92) Throwable local92) {
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method1659(@OriginalArg(0) int arg0) {
		if (Static115.anInt2536 == 0) {
			Static141.aClass1_Sub3_Sub2_2.method985(arg0);
		} else {
			Static66.anInt3701 = arg0;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	public static void method1660() {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glDisableClientState(32886);
		Static296.method4840(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static296.method4808();
		for (@Pc(19) int local19 = 0; local19 < Static277.aClass1_Sub20ArrayArray3[0].length; local19++) {
			@Pc(31) Class1_Sub20 local31 = Static277.aClass1_Sub20ArrayArray3[0][local19];
			if (local31.anInt3101 >= 0 && Static139.method4752(Static151.anInterface2_1.method4422(local31.anInt3101))) {
				local1.glColor4fv(Static28.method536(local31.anInt3098), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean160 ? 1.0F : 0.5F);
				local31.method2364(Static132.aClass1_Sub14ArrayArrayArray2, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static296.method4822();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static296.method4813();
	}
}
