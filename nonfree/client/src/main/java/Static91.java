import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
	public static int anInt5955;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Lclient!oa;")
	public static Class121 aClass121_11;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Lclient!jv;")
	public static final Class165 aClass165_13 = new Class165(0, 1);

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!nj;")
	public static final Class212 aClass212_24 = new Class212(8);

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method5093() {
		Static13.method200(Static176.aClass121_5, (long) Static358.anInt6263);
		if (Static487.anInt8139 != -1) {
			Static344.method5182(Static487.anInt8139);
		}
		for (@Pc(23) int local23 = 0; local23 < Static73.anInt1201; local23++) {
			if (Static258.aBooleanArray27[local23]) {
				Static44.aBooleanArray5[local23] = true;
			}
			Static40.aBooleanArray4[local23] = Static258.aBooleanArray27[local23];
			Static258.aBooleanArray27[local23] = false;
		}
		Static557.anInt9311 = Static358.anInt6263;
		if (Static176.aClass121_5.method7142()) {
			Static364.aBoolean436 = true;
		}
		if (Static487.anInt8139 != -1) {
			Static73.anInt1201 = 0;
			Static89.method1430();
		}
		Static176.aClass121_5.F();
		Static457.method3508(Static176.aClass121_5);
		@Pc(73) int local73 = Static322.method4985();
		if (local73 == -1) {
			local73 = Static278.anInt6564;
		}
		if (local73 == -1) {
			local73 = Static48.anInt822;
		}
		Static41.method572(local73);
		Static267.anInt4424 = 0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!dda;I)Z")
	public static boolean method5095(@OriginalArg(0) Interface6 arg0) {
		@Pc(18) Class313 local18 = Static260.aClass100_1.method2008(arg0.method7555());
		if (local18.anInt8446 == -1) {
			return true;
		} else {
			@Pc(31) Class111 local31 = Static32.aClass245_1.method5768(local18.anInt8446);
			return local31.anInt2677 == -1 ? true : local31.method2215();
		}
	}
}
