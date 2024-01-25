import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!el", name = "d", descriptor = "Lclient!rk;")
	public static Class220 aClass220_1;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_70 = new Class56(48, 28);

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZZ)I")
	public static int method1433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(16) Class4_Sub25 local16 = Static242.method3222(false, arg1);
		if (local16 == null) {
			return 0;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local16.anIntArray345.length; local24++) {
			if (local16.anIntArray345[local24] >= 0 && local16.anIntArray345[local24] < Static416.aClass64_2.anInt1669) {
				@Pc(53) Class80 local53 = Static416.aClass64_2.method1372(local16.anIntArray345[local24]);
				@Pc(63) int local63 = local53.method1605(Static435.aClass240_2.method5128(arg0).anInt6901, arg0);
				if (arg2) {
					local22 += local16.anIntArray344[local24] * local63;
				} else {
					local22 += local63;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1434(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static284.anInt4659 >= 100 && !Static219.aBoolean281 || Static284.anInt4659 >= 200) {
			Static392.method5198(Static128.aClass15_131.method180(Static429.anInt6999));
			return;
		}
		@Pc(33) String local33 = Static112.method1664(arg0);
		if (local33 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(38) int local38 = 0; local38 < Static284.anInt4659; local38++) {
			@Pc(46) String local46 = Static112.method1664(Static322.aStringArray36[local38]);
			if (local46 != null && local46.equals(local33)) {
				Static392.method5198(arg0 + Static7.aClass15_1.method180(Static429.anInt6999));
				return;
			}
			if (Static161.aStringArray27[local38] != null) {
				local76 = Static112.method1664(Static161.aStringArray27[local38]);
				if (local76 != null && local76.equals(local33)) {
					Static392.method5198(arg0 + Static7.aClass15_1.method180(Static429.anInt6999));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < Static66.anInt1316; local108++) {
			local76 = Static112.method1664(aStringArray14[local108]);
			if (local76 != null && local76.equals(local33)) {
				Static392.method5198(Static248.aClass15_79.method180(Static429.anInt6999) + arg0 + Static350.aClass15_107.method180(Static429.anInt6999));
				return;
			}
			if (Static441.aStringArray46[local108] != null) {
				@Pc(151) String local151 = Static112.method1664(Static441.aStringArray46[local108]);
				if (local151 != null && local151.equals(local33)) {
					Static392.method5198(Static248.aClass15_79.method180(Static429.anInt6999) + arg0 + Static350.aClass15_107.method180(Static429.anInt6999));
					return;
				}
			}
		}
		if (Static112.method1664(Static401.aClass8_Sub3_Sub1_Sub1_2.aString60).equals(local33)) {
			Static392.method5198(Static351.aClass15_108.method180(Static429.anInt6999));
		} else {
			Static448.method5935(Static82.aClass146_29);
			Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(arg0));
			Static247.aClass4_Sub9_Sub2_2.method5039(arg0);
		}
	}
}
