import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	public static int anInt1488;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_27 = new Class231("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public static boolean aBoolean88 = true;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method1363() {
		Static64.aClass99_1.method5655();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static389.aLongArray5[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static277.aLongArray3[local22] = 0L;
		}
		Static204.anInt3497 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!pb;ZLjava/lang/String;IZ)V")
	public static void method1366(@OriginalArg(0) Class194 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static232.method3158(arg2, 3, arg0);
			return;
		}
		@Pc(16) String local16;
		if (Static307.aString50.startsWith("win") && Static307.anInt5537 != 3) {
			local16 = null;
			if (arg0.anApplet1 != null) {
				local16 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local16 == null || !local16.equals("1")) {
				@Pc(36) Class136 local36 = Static232.method3158(arg2, 0, arg0);
				Static411.aClass136_7 = local36;
				Static115.aClass194_1 = arg0;
				Static261.aString40 = arg2;
				return;
			}
		}
		if (Static307.aString50.startsWith("mac")) {
			local16 = null;
			if (arg0.anApplet1 != null) {
				local16 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local16 != null && local16.equals("1") && arg1) {
				Static232.method3158(arg2, 1, arg0);
				return;
			}
		}
		Static232.method3158(arg2, 2, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBLclient!tq;)V")
	public static void method1367(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17_Sub1 arg1) {
		Static313.aBoolean397 = false;
		Static422.anInt3434 = 0;
		Static428.method5831(arg1);
		Static86.method1337(arg1);
		if (Static313.aBoolean397) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt7523) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt7523 + " psize:" + arg0);
		}
	}
}
