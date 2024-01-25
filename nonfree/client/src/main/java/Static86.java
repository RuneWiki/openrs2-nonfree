import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!di", name = "p", descriptor = "I")
	public static int anInt1814;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_10 = new Class353();

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_54 = new Class235(83, 7);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1501(@OriginalArg(0) Class134 arg0) {
		for (@Pc(14) Class8_Sub7 local14 = (Class8_Sub7) Static293.aClass209_2.method4194(); local14 != null; local14 = (Class8_Sub7) Static293.aClass209_2.method4191()) {
			if (local14.aBoolean438) {
				local14.method4404(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z")
	public static boolean method1502() {
		@Pc(12) Class1 local12 = Static310.aClass353_32.aClass1_271.aClass1_286;
		if (local12 == null || local12 == Static310.aClass353_32.aClass1_271) {
			return false;
		}
		@Pc(23) Class1_Sub51 local23 = (Class1_Sub51) local12;
		if (local23.anInt9638 >= 2000) {
			local23.anInt9638 -= 2000;
		}
		return local23.anInt9638 == 1010;
	}
}
