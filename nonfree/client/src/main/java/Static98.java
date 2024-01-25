import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!eq;")
	public static final Class60 aClass60_2 = new Class60();

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	public static int anInt2364 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method2063() {
		Static153.aClass87_30.method2477();
		Static318.aClass87_56.method2477();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Lclient!pd;")
	public static Class1_Sub27 method2064() {
		if (Static79.aClass16_24 == null || Static93.aClass183_1 == null) {
			return null;
		}
		Static93.aClass183_1.method4844(Static79.aClass16_24);
		@Pc(23) Class1_Sub27 local23 = (Class1_Sub27) Static93.aClass183_1.method4850();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class139 local32 = Static255.method4606(local23.anInt4777);
			return local32 != null && local32.aBoolean391 && local32.method3810() ? local23 : Static169.method3377();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!bg;II)V")
	public static void method2065(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (Static349.aClass190_5 == null) {
			return;
		}
		try {
			Static349.aClass190_5.method4929(0L);
			Static349.aClass190_5.method4928(arg1, arg0.aByteArray81, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
	public static void method2066() {
		Static115.anInt2635 = 0;
		Static188.aClass16_22.method421();
		Static188.aClass16_22.method416(Static326.aClass1_Sub23_3);
		Static115.anInt2635++;
	}
}
