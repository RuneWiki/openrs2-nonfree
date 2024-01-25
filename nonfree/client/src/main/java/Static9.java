import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_193 = new Class107(4, 8);

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Lclient!ev;")
	public static Class69 aClass69_3 = new Class69();

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
	public static void method5190() {
		for (@Pc(4) Class4_Sub4 local4 = (Class4_Sub4) Static228.aClass141_5.method3362(); local4 != null; local4 = (Class4_Sub4) Static228.aClass141_5.method3362()) {
			Static135.method2322(local4);
		}
		@Pc(32) int local32;
		@Pc(31) int local31;
		if (Static38.aClass135_Sub1_1.method4244(Static143.anInt2766)) {
			local32 = 0;
			local31 = 3;
		} else {
			local31 = Static170.anInt3116;
			local32 = Static170.anInt3116;
		}
		Static57.method1243();
		for (@Pc(44) int local44 = local32; local44 <= local31; local44++) {
			Static57.method1236();
			Static57.method1244(local44);
			Static57.method1252(local44);
		}
		Static57.method1242();
		Static57.method1238();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V")
	public static void method5193() {
		Static193.method2984(Static28.aClass179_1);
		for (@Pc(22) Class1_Sub23 local22 = (Class1_Sub23) Static101.aClass96_16.method2342(); local22 != null; local22 = (Class1_Sub23) Static101.aClass96_16.method2339()) {
			if (!local22.method6017()) {
				local22 = (Class1_Sub23) Static101.aClass96_16.method2342();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt3058 == 0) {
				Static441.method5820(true, true, local22);
			}
		}
		if (Static182.aClass251_6 != null) {
			Static408.method5469(Static182.aClass251_6);
			Static182.aClass251_6 = null;
		}
	}
}
