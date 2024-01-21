import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!jb;")
	public static Class25 aClass25_27;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public static int anInt2619 = -1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1146 = Static59.method1195("Trade)4compete");

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1141 = aClass60_1146;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1142 = Static59.method1195("leuchten2:");

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1145 = Static59.method1195("Loading textures )2 ");

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1143 = aClass60_1145;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[Lclient!td;")
	public static Class72[] aClass72Array1 = new Class72[4];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	public static int[] anIntArray279 = new int[500];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public static int anInt2622 = 0;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1144 = Static59.method1195(":: (X");

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1148 = Static59.method1195("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1147 = aClass60_1148;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method1692() {
		aClass60_1147 = null;
		aClass60_1148 = null;
		aClass25_27 = null;
		aClass60_1142 = null;
		aClass60_1145 = null;
		anIntArray279 = null;
		aClass72Array1 = null;
		aClass60_1143 = null;
		aClass60_1141 = null;
		aClass60_1144 = null;
		aClass60_1146 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
	public static boolean method1693(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(22) int local22 = Static2.anIntArray22[arg0];
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		return local22 == 10;
	}
}
