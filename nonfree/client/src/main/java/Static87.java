import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public static int anInt2071;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!vj;I)V")
	public static void method1911(@OriginalArg(0) Class7_Sub7 arg0) {
		arg0.aClass30_Sub1_Sub1_1 = null;
		if (Static435.anInt8018 < 20) {
			Static422.aClass149_6.method3984(arg0);
			Static435.anInt8018++;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIBLclient!qa;I)V")
	public static void method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class42 arg3, @OriginalArg(5) int arg4) {
		arg3.N(arg2, arg1, arg4 + arg2, arg0 + arg1);
		arg3.method5866(arg1, arg4, arg0, -16777216, arg2);
		if (Static22.anInt9607 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static2.anInt5920 / (float) Static2.anInt5911;
		@Pc(37) int local37 = arg4;
		@Pc(39) int local39 = arg0;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg4 * local35);
		} else {
			local37 = (int) ((float) arg0 / local35);
		}
		@Pc(65) int local65 = arg2 + (arg4 - local37) / 2;
		@Pc(74) int local74 = arg1 + (arg0 - local39) / 2;
		if (Static198.aClass84_7 == null || Static198.aClass84_7.c() != arg4 || arg0 != Static198.aClass84_7.la()) {
			Static2.method4935(Static2.anInt5916, Static2.anInt5920 + Static2.anInt5914, Static2.anInt5911 + Static2.anInt5916, Static2.anInt5914, local65, local74, local65 + local37, local74 + local39);
			Static2.method4931(arg3);
			Static198.aClass84_7 = arg3.method5817(local65, local74, local37, local39, false);
		}
		Static198.aClass84_7.method7487(local65, local74);
		@Pc(133) int local133 = local37 * Static397.anInt7483 / Static2.anInt5911;
		@Pc(139) int local139 = local39 * Static524.anInt6022 / Static2.anInt5920;
		@Pc(147) int local147 = local37 * Static516.anInt9256 / Static2.anInt5911 + local65;
		@Pc(161) int local161 = local74 + local39 - local39 * Static540.anInt9596 / Static2.anInt5920 - local139;
		@Pc(163) int local163 = -1996554240;
		if (Static518.aClass138_8 == Static293.aClass138_7) {
			local163 = -1996488705;
		}
		arg3.f(local147, local161, local133, local139, local163, 1);
		arg3.method5834(local147, local161, local133, local139, local163, 0);
		if (Static247.anInt5085 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static40.anInt812 <= 50) {
			local198 = Static40.anInt812 * 5;
		} else {
			local198 = (100 - Static40.anInt812) * 5;
		}
		for (@Pc(212) Class12_Sub12 local212 = (Class12_Sub12) Static2.aClass73_48.method2005(); local212 != null; local212 = (Class12_Sub12) Static2.aClass73_48.method2009()) {
			@Pc(220) Class152 local220 = Static2.aClass93_5.method2480(local212.anInt2333);
			if (Static250.method4316(local220)) {
				@Pc(237) int local237;
				@Pc(249) int local249;
				if (Static420.anInt7807 == local212.anInt2333) {
					local237 = local212.anInt2332 * local37 / Static2.anInt5911 + local65;
					local249 = (Static2.anInt5920 - local212.anInt2334) * local39 / Static2.anInt5920 + local74;
					arg3.method5866(local249 - 2, 4, 4, local198 << 24 | 0xFFFF00, local237 - 2);
				} else if (Static288.anInt5602 != -1 && Static288.anInt5602 == local220.anInt4724) {
					local237 = local65 + local37 * local212.anInt2332 / Static2.anInt5911;
					local249 = local74 + (Static2.anInt5920 - local212.anInt2334) * local39 / Static2.anInt5920;
					arg3.method5866(local249 - 2, 4, 4, local198 << 24 | 0xFFFF00, local237 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method1913() {
		for (@Pc(14) Class12_Sub4_Sub15 local14 = (Class12_Sub4_Sub15) Static376.aClass73_77.method2005(); local14 != null; local14 = (Class12_Sub4_Sub15) Static376.aClass73_77.method2009()) {
			@Pc(19) Class30_Sub1_Sub4 local19 = local14.aClass30_Sub1_Sub4_1;
			if (local19.aBoolean472) {
				local14.method7967();
				local19.method5372();
			} else if (local19.anInt6410 <= Static409.anInt7683) {
				local19.method5370(Static481.anInt8697);
				if (local19.aBoolean472) {
					local14.method7967();
				} else {
					Static135.method2775(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZIII)Z")
	public static boolean method1914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static387.aByteArrayArrayArray18[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static387.aByteArrayArrayArray18[arg3][arg0][arg2] & 0x10) == 0) {
			return Static310.method7307(arg2, arg3, arg0) == arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public static void method1915(@OriginalArg(1) int arg0) {
		Static265.anInt5303 = -1;
		Static404.anInt7598 = arg0;
		Static265.anInt5303 = -1;
		Static505.method7495();
	}
}
