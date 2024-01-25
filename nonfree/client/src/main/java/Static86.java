import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	public static int anInt1853;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!ul;")
	public static Class246 aClass246_54;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public static int anInt1856;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
	public static void method1606(@OriginalArg(0) int arg0) {
		if (Static390.anInt6278 == 0) {
			Static244.aClass1_Sub19_Sub4_2.method3684(arg0);
		} else {
			Static53.anInt991 = arg0;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method1608() {
		Static452.anInt7259 = 0;
		@Pc(17) int local17 = Static165.anInt3049 + (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7);
		@Pc(25) int local25 = (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7) + Static345.anInt5799;
		if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static452.anInt7259 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static452.anInt7259 = 1;
		}
		if (Static452.anInt7259 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static452.anInt7259 = 0;
		}
	}
}
