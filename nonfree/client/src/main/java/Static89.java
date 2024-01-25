import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dl", name = "P", descriptor = "Lclient!kg;")
	public static Class1_Sub28_Sub1 aClass1_Sub28_Sub1_1;

	@OriginalMember(owner = "client!dl", name = "F", descriptor = "Lclient!vm;")
	public static final Class307 aClass307_1 = new Class307();

	@OriginalMember(owner = "client!dl", name = "J", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!dl", name = "L", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_1 = new Class273(14, 0, 4, 1);

	@OriginalMember(owner = "client!dl", name = "N", descriptor = "Lclient!h;")
	public static final Class114 aClass114_50 = new Class114("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!dl", name = "O", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_29 = new Class186(43, 3);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)V")
	public static void method2161(@OriginalArg(1) int arg0) {
		for (@Pc(3) Class1 local3 = Static494.aClass174_36.method4421(); local3 != null; local3 = Static494.aClass174_36.method4429()) {
			if ((local3.aLong244 >> 48 & 0xFFFFL) == (long) arg0) {
				local3.method7983();
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)Z")
	public static boolean method2163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static544.method7953(arg1, arg0) || Static153.method3113(arg1, arg0);
	}
}
