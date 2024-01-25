import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_29 = new Class96("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "[I")
	public static final int[] anIntArray81 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_30 = new Class96("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "[I")
	public static final int[] anIntArray83 = new int[4];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
	public static void method1251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg1, 5);
		local8.method32();
		local8.anInt35 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1252(@OriginalArg(1) String arg0) {
		if (Static345.aClass152Array1 != null) {
			Static224.method3272(Static327.aClass254_111);
			Static201.aClass1_Sub14_Sub2_2.method4553(Static388.method5637(arg0));
			Static201.aClass1_Sub14_Sub2_2.method4512(arg0);
		}
	}
}
