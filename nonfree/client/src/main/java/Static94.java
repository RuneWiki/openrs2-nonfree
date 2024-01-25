import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!eq", name = "L", descriptor = "Lclient!mr;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_49 = new Class209("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_1 = new Class240(14, 1);

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_2 = new Class240(15, 4);

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_3 = new Class240(16, -2);

	@OriginalMember(owner = "client!eq", name = "B", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_4 = new Class240(17, 0);

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_5 = new Class240(18, -2);

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_6 = new Class240(20, 6);

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_7 = new Class240(21, 8);

	@OriginalMember(owner = "client!eq", name = "F", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_8 = new Class240(22, -2);

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_9 = new Class240(23, 4);

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_10 = new Class240(24, -1);

	@OriginalMember(owner = "client!eq", name = "J", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_50 = new Class209("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "Lclient!di;")
	public static final Class54 aClass54_31 = new Class54(40, 3);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)V")
	public static void method1794(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub5_Sub13 local13 = Static208.method3306(arg0, 8);
		local13.method4545();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method1808(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static457.method683(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}
