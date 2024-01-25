import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Lclient!pn;")
	public static final Class186 aClass186_7 = new Class186("", 17);

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public static int anInt1847 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IBI)Z")
	public static boolean method1613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Lclient!hp;")
	public static Class4_Sub1_Sub11 method1614() {
		@Pc(12) Class4_Sub1_Sub11 local12 = (Class4_Sub1_Sub11) Static99.aClass229_1.method5089();
		if (local12 != null) {
			local12.method5684();
			local12.method4662();
			return local12;
		}
		do {
			local12 = (Class4_Sub1_Sub11) Static250.aClass229_4.method5089();
			if (local12 == null) {
				return null;
			}
			if (local12.method2611() > Static282.method3962()) {
				return null;
			}
			local12.method5684();
			local12.method4662();
		} while ((local12.aLong198 & Long.MIN_VALUE) == 0L);
		return local12;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	public static void method1617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static429.method5476(Static122.aClass215_33);
		Static3.aClass4_Sub12_Sub1_5.method2505(arg1);
		Static3.aClass4_Sub12_Sub1_5.method2531(arg0);
	}
}
