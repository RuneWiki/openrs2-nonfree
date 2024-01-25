import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!ph;")
	public static Class187 aClass187_137;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public static int anInt7651;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_113 = new Class27(6, -1);

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_114 = new Class27(55, 4);

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!os;")
	public static final Class182 aClass182_263 = new Class182("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!da;II[IIZ)Lclient!al;")
	public static Class4_Sub1_Sub1 method6092(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg0.aBoolean88 || Static131.method2284(arg2) && Static131.method2284(arg1)) {
			return new Class4_Sub1_Sub1(arg0, 3553, arg2, arg1, false, arg3);
		} else if (arg0.aBoolean92) {
			return new Class4_Sub1_Sub1(arg0, 34037, arg2, arg1, false, arg3);
		} else {
			return new Class4_Sub1_Sub1(arg0, arg2, arg1, Static186.method3002(arg2), Static186.method3002(arg1), arg3);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!da;IIIIB)Lclient!al;")
	public static Class4_Sub1_Sub1 method6102(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.aBoolean88 || Static131.method2284(arg1) && Static131.method2284(arg2)) {
			return new Class4_Sub1_Sub1(arg0, 3553, arg4, arg3, arg1, arg2, true);
		} else if (arg0.aBoolean92) {
			return new Class4_Sub1_Sub1(arg0, 34037, arg4, arg3, arg1, arg2, true);
		} else {
			return new Class4_Sub1_Sub1(arg0, arg4, arg3, arg1, arg2, Static186.method3002(arg1), Static186.method3002(arg2), true);
		}
	}
}
