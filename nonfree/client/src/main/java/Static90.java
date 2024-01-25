import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_38 = new Class85("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
	public static void method1619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(0, 15);
		local8.method850();
		local8.anInt994 = arg0;
		local8.anInt996 = arg1;
	}
}
