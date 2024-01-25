import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!eba;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_42 = new Class200(9, 0);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!iu;)V")
	public static void method1897(@OriginalArg(1) Class16_Sub4 arg0) {
		arg0.aClass16_Sub1_Sub1_Sub3_1 = null;
		if (Static528.anInt3397 < 20) {
			Static433.aClass19_8.method566(arg0);
			Static528.anInt3397++;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lclient!oc;")
	public static Class64 method1898() {
		try {
			return new Class64_Sub1();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class64) Class.forName("Class64_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class64_Sub3();
			}
		}
	}
}
