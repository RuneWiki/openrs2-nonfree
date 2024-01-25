import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Lclient!hi;")
	public static Class80 aClass80_20;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array23;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Lclient!ct;")
	public static Class30 aClass30_111;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_231 = new Class18(33, 11);

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
	public static int anInt7043 = 0;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_219 = new Class217(104, 6);

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_220 = new Class217(48, 2);

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "[I")
	public static final int[] anIntArray521 = new int[14];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!kg;II)Ljava/lang/String;")
	public static String method6073(@OriginalArg(0) Class112 arg0, @OriginalArg(1) int arg1) {
		if (!Static44.method1079(arg0).method5748(arg1) && arg0.anObjectArray6 == null) {
			return null;
		} else if (arg0.aStringArray17 == null || arg0.aStringArray17.length <= arg1 || arg0.aStringArray17[arg1] == null || arg0.aStringArray17[arg1].trim().length() == 0) {
			return Static339.aBoolean444 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray17[arg1];
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6076(@OriginalArg(1) String arg0) {
		Static19.method530(0, 0, "", arg0, "");
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!va;ZI)V")
	public static void method6078(@OriginalArg(0) Class11_Sub2_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (Static51.anInt1301 < arg0.anInt6779) {
			Static280.method5008(arg0);
		} else if (arg0.lb >= Static51.anInt1301) {
			Static276.method4926(arg0);
		} else {
			Static277.method4938(false, arg0);
			local11 = Static83.anInt1863;
			local13 = Static156.anInt3217;
		}
		if (arg0.anInt6729 < 128 || arg0.anInt6726 < 128 || arg0.anInt6729 >= (Static311.anInt5653 - 1) * 128 || arg0.anInt6726 >= (Static189.anInt3820 - 1) * 128) {
			arg0.anInt6795 = -1;
			arg0.anInt6772 = -1;
			arg0.lb = 0;
			local13 = 0;
			arg0.anInt6779 = 0;
			local11 = -1;
			arg0.anInt6729 = arg0.anIntArray505[0] * 128 + arg0.method5894() * 64;
			arg0.anInt6726 = arg0.anIntArray504[0] * 128 + arg0.method5894() * 64;
			arg0.method5892();
		}
		if (arg0 == Static191.aClass11_Sub2_Sub6_Sub1_4 && (arg0.anInt6729 < 1536 || arg0.anInt6726 < 1536 || arg0.anInt6729 >= (Static311.anInt5653 - 12) * 128 || Static189.anInt3820 * 128 - 1536 <= arg0.anInt6726)) {
			arg0.lb = 0;
			arg0.anInt6772 = -1;
			local13 = 0;
			arg0.anInt6795 = -1;
			arg0.anInt6779 = 0;
			local11 = -1;
			arg0.anInt6729 = arg0.anIntArray505[0] * 128 + arg0.method5894() * 64;
			arg0.anInt6726 = arg0.anIntArray504[0] * 128 + arg0.method5894() * 64;
			arg0.method5892();
		}
		@Pc(211) int local211 = Static285.method4343(arg0);
		Static320.method4036(local13, arg0, local211, local11);
		Static87.method1814(arg0);
	}
}
