import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "[I")
	public static int[] anIntArray466;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "[Lclient!aq;")
	public static Class12[] aClass12Array12;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "Lclient!c;")
	public static Class5 aClass5_25;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	public static int anInt5544 = -1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)I")
	public static int method4760(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return (arg0 & 0xFF80) + local47;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!pn;Lclient!pn;Z)V")
	public static void method4761(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_251 != null) {
			arg1.method5628();
		}
		arg1.aClass1_251 = arg0.aClass1_251;
		arg1.aClass1_252 = arg0;
		arg1.aClass1_251.aClass1_252 = arg1;
		arg1.aClass1_252.aClass1_251 = arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIZI)Lclient!up;")
	public static Class1_Sub37 method4762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub37 local7 = new Class1_Sub37();
		local7.anInt6281 = arg0;
		local7.anInt6278 = arg3;
		Static351.aClass197_33.method5166(local7, (long) arg1);
		Static120.method2553(arg0);
		@Pc(26) Class12 local26 = Static9.method319(arg1);
		if (local26 != null) {
			Static6.method247(local26);
		}
		if (Static111.aClass12_7 != null) {
			Static6.method247(Static111.aClass12_7);
			Static111.aClass12_7 = null;
		}
		Static49.method1301();
		if (local26 != null) {
			Static50.method1306(!arg2, local26);
		}
		if (!arg2) {
			Static196.method3781(arg0);
		}
		if (!arg2 && Static89.anInt2231 != -1) {
			Static110.method5416(Static89.anInt2231, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	public static void method4764() {
		if (Static207.aString39.toLowerCase().indexOf("microsoft") != -1) {
			Static335.anIntArray515[188] = 71;
			Static335.anIntArray515[219] = 42;
			Static335.anIntArray515[220] = 74;
			Static335.anIntArray515[187] = 27;
			Static335.anIntArray515[222] = 59;
			Static335.anIntArray515[189] = 26;
			Static335.anIntArray515[192] = 58;
			Static335.anIntArray515[191] = 73;
			Static335.anIntArray515[190] = 72;
			Static335.anIntArray515[223] = 28;
			Static335.anIntArray515[221] = 43;
			Static335.anIntArray515[186] = 57;
			return;
		}
		Static335.anIntArray515[45] = 26;
		Static335.anIntArray515[46] = 72;
		Static335.anIntArray515[59] = 57;
		Static335.anIntArray515[44] = 71;
		Static335.anIntArray515[93] = 43;
		Static335.anIntArray515[61] = 27;
		if (Static207.aMethod2 == null) {
			Static335.anIntArray515[222] = 59;
			Static335.anIntArray515[192] = 58;
		} else {
			Static335.anIntArray515[192] = 28;
			Static335.anIntArray515[520] = 59;
			Static335.anIntArray515[222] = 58;
		}
		Static335.anIntArray515[47] = 73;
		Static335.anIntArray515[91] = 42;
		Static335.anIntArray515[92] = 74;
	}
}
