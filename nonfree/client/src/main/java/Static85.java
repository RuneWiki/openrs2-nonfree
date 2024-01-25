import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!uo;")
	public static Class129 aClass129_2;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_31 = new Class117("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public static int anInt1528 = -1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBIII)V")
	public static void method1231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg2) {
			Static1.method1(arg1, arg0, arg2, arg3);
		} else if (Static280.anInt212 <= arg1 - arg2 && arg2 + arg1 <= Static346.anInt6607 && arg0 - arg4 >= Static240.anInt4829 && arg4 + arg0 <= Static166.anInt3315) {
			Static339.method5567(arg4, arg1, arg3, arg0, arg2);
		} else {
			Static101.method1495(arg0, arg4, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public static void method1232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static216.aClass26_52 = new Class26(arg1);
		Static310.aClass26_55 = new Class26(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
	public static void method1233() {
		@Pc(5) Class26 local5 = Static188.aClass26_36;
		synchronized (Static188.aClass26_36) {
			Static188.aClass26_36.method329(5);
		}
		local5 = Static30.aClass26_3;
		synchronized (Static30.aClass26_3) {
			Static30.aClass26_3.method329(5);
		}
	}
}
