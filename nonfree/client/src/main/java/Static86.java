import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!de", name = "N", descriptor = "I")
	public static int anInt1982;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "[I")
	public static final int[] anIntArray93 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!de", name = "P", descriptor = "I")
	public static int anInt1983 = 0;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "Lclient!tc;")
	public static Class305 aClass305_4 = null;

	@OriginalMember(owner = "client!de", name = "R", descriptor = "[I")
	public static final int[] anIntArray94 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(III)Lclient!pga;")
	public static Class2_Sub1 method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass2_Sub1_1 == null ? null : local7.aClass2_Sub1_1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!wk;IZ)V")
	public static void method1923(@OriginalArg(0) Class2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = -1;
		@Pc(12) int local12 = 0;
		if (Static129.anInt10429 < arg0.anInt7616) {
			Static209.method3677(arg0);
		} else if (Static129.anInt10429 > arg0.anInt7633) {
			Static311.method5196(false, arg0);
			local12 = Static46.anInt1149;
			local10 = Static89.anInt2254;
		} else {
			Static220.method3782(arg0);
		}
		if (arg0.anInt9398 < 512 || arg0.anInt9396 < 512 || (Static460.anInt8640 - 1) * 512 <= arg0.anInt9398 || arg0.anInt9396 >= Static292.anInt7682 * 512 - 512) {
			local12 = 0;
			arg0.anInt7621 = -1;
			arg0.anInt7651 = -1;
			arg0.anIntArray484 = null;
			arg0.anInt7638 = -1;
			arg0.anInt7633 = 0;
			arg0.anInt7616 = 0;
			local10 = -1;
			arg0.anInt9398 = arg0.anIntArray487[0] * 512 + arg0.method6311() * 256;
			arg0.anInt9396 = arg0.anIntArray488[0] * 512 + arg0.method6311() * 256;
			arg0.method6304();
		}
		if (arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2 && (arg0.anInt9398 < 6144 || arg0.anInt9396 < 6144 || (Static460.anInt8640 - 12) * 512 <= arg0.anInt9398 || Static292.anInt7682 * 512 - 6144 <= arg0.anInt9396)) {
			arg0.anInt7638 = -1;
			arg0.anInt7616 = 0;
			arg0.anInt7633 = 0;
			arg0.anInt7621 = -1;
			local12 = 0;
			local10 = -1;
			arg0.anInt7651 = -1;
			arg0.anIntArray484 = null;
			arg0.anInt9398 = arg0.anIntArray487[0] * 512 + arg0.method6311() * 256;
			arg0.anInt9396 = arg0.anIntArray488[0] * 512 + arg0.method6311() * 256;
			arg0.method6304();
		}
		@Pc(217) int local217 = Static6.method279(arg0);
		Static1.method126(local12, local10, arg0, local217);
		Static512.method7666(arg0, local10);
		Static538.method7909(arg0);
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
	public static void method1924() {
		for (@Pc(5) int local5 = 0; local5 < Static228.anInt4641; local5++) {
			@Pc(13) Class64 local13 = Static200.aClass64Array1[local5];
			if (local13.aByte22 == 3) {
				if (local13.aClass3_Sub14_Sub2_1 == null) {
					local13.anInt2302 = Integer.MIN_VALUE;
				} else {
					Static485.aClass3_Sub14_Sub1_2.method2816(local13.aClass3_Sub14_Sub2_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(B)V")
	public static void method1926() {
		for (@Pc(13) Class3_Sub37 local13 = (Class3_Sub37) Static516.aClass183_18.method4795(); local13 != null; local13 = (Class3_Sub37) Static516.aClass183_18.method4793()) {
			if (local13.aBoolean594) {
				local13.method5842();
			}
		}
		for (@Pc(32) Class3_Sub37 local32 = (Class3_Sub37) Static22.aClass183_1.method4795(); local32 != null; local32 = (Class3_Sub37) Static22.aClass183_1.method4793()) {
			if (local32.aBoolean594) {
				local32.method5842();
			}
		}
	}
}
