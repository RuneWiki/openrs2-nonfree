import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!cka", name = "f", descriptor = "Lclient!ofa;")
	public static Class265 aClass265_4 = null;

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "[Lclient!mha;")
	public static final Class229_Sub1[] aClass229_Sub1Array1 = new Class229_Sub1[37];

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZZB)V")
	public static void method1335(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static603.anInt10075--;
			if (Static603.anInt10075 == 0) {
				Static321.anIntArray550 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static500.anInt7899--;
		if (Static500.anInt7899 == 0) {
			Static537.anIntArray457 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)I")
	public static int method1336() {
		return Static471.anInt7481 == 1 ? Static117.anInt2122 : 0;
	}

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(I)V")
	public static void method1337() {
		for (@Pc(6) Class3_Sub15 local6 = (Class3_Sub15) Static484.aClass333_30.method7490(); local6 != null; local6 = (Class3_Sub15) Static484.aClass333_30.method7487()) {
			if (local6.aBoolean207) {
				local6.aBoolean207 = false;
			} else {
				Static344.method5009(local6.anInt2738);
			}
		}
	}
}
