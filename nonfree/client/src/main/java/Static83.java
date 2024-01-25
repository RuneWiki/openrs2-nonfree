import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString57 = null;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_195 = new Class56(62, 1);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
	public static boolean method4112(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
	public static void method4115() {
		for (@Pc(18) Class4_Sub18 local18 = (Class4_Sub18) Static342.aClass244_34.method5263(); local18 != null; local18 = (Class4_Sub18) Static342.aClass244_34.method5271()) {
			if (local18.anInt3032 == -1) {
				local18.anInt3034 = 0;
				if (local18.anInt3037 >= 0 && local18.anInt3031 >= 0 && Static337.anInt5497 > local18.anInt3037 && Static282.anInt4644 > local18.anInt3031) {
					Static174.method2446(local18);
				}
			} else {
				local18.method6059();
			}
		}
	}
}
