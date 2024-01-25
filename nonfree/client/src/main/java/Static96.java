import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Z")
	public static boolean aBoolean470;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5420(@OriginalArg(0) String arg0) {
		Static209.aString48 = arg0;
		if (Static1.aClass134_7.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static1.aClass134_7.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static1.aClass134_7.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static125.method2586(Static208.method3879() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static366.method4252(Static1.aClass134_7.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(86) Throwable local86) {
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIII)V")
	public static void method5421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 < arg1) {
			Static135.method2878(Static223.anIntArrayArray124[arg3], arg1, arg0, arg2);
		} else {
			Static135.method2878(Static223.anIntArrayArray124[arg3], arg2, arg0, arg1);
		}
	}
}
