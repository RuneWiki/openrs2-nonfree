import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	public static int anInt2327;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_670 = Static38.method685("cross");

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
	public static int anInt2328 = -1;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	public static void method1530(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static52.aBoolean56) {
			Static31.method540();
		} else if (arg0 != -1 && (anInt2328 != arg0 || !Static66.method1059()) && Static81.anInt1983 != 0 && !Static52.aBoolean56) {
			Static132.method2068(Static5.aClass10_Sub1_2, 0, arg0, Static81.anInt1983);
		}
		anInt2328 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method1532() {
		aClass6_670 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!gg;")
	public static RuntimeException_Sub1 method1533(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString2 = local12.aString2 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!wa;Z)Lclient!ai;")
	public static Class6 method1534(@OriginalArg(0) Class87 arg0) {
		if (Static149.method2286(Static179.method2802(arg0)) == 0) {
			return null;
		} else if (arg0.aClass6_1220 == null || arg0.aClass6_1220.method135().method107() == 0) {
			return Static181.aBoolean89 ? Static130.aClass6_872 : null;
		} else {
			return arg0.aClass6_1220;
		}
	}
}
