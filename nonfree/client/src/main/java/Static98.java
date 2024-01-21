import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!md", name = "s", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array7;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "[S")
	public static short[] aShortArray14 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!kb;")
	private static Class46 aClass46_788 = Static65.method1172("Loading sprites )2 ");

	@OriginalMember(owner = "client!md", name = "i", descriptor = "I")
	public static int anInt2362 = 0;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_789 = Static65.method1172("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!md", name = "u", descriptor = "Lclient!kb;")
	public static Class46 aClass46_790 = aClass46_788;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	public static int anInt2371 = 128;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	public static int anInt2375 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!og;IIIB[Lclient!qf;I[BI)V")
	public static void method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class69[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class3_Sub4 local17 = new Class3_Sub4(arg8);
		while (true) {
			@Pc(21) int local21 = local17.method209();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local17.method209();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(53) int local53 = local32 >> 6 & 0x3F;
				@Pc(57) int local57 = local32 >> 12;
				@Pc(61) int local61 = local32 & 0x3F;
				@Pc(65) int local65 = local17.method191();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (arg3 == local57 && arg7 <= local53 && arg7 + 8 > local53 && local61 >= arg9 && arg9 + 8 > local61) {
					@Pc(96) Class3_Sub2_Sub9 local96 = Static136.method2319(local12);
					@Pc(113) int local113 = arg0 + Static135.method2316(local96.anInt1795, local61 & 0x7, local53 & 0x7, arg4, local73, local96.anInt1825);
					@Pc(130) int local130 = Static92.method1534(local96.anInt1825, local73, local53 & 0x7, local61 & 0x7, local96.anInt1795, arg4) + arg1;
					if (local113 > 0 && local130 > 0 && local113 < 103 && local130 < 103) {
						@Pc(145) Class69 local145 = null;
						@Pc(147) int local147 = arg5;
						if ((Static119.aByteArrayArrayArray5[1][local113][local130] & 0x2) == 2) {
							local147 = arg5 - 1;
						}
						if (local147 >= 0) {
							local145 = arg6[local147];
						}
						Static31.method571(arg4 + local73 & 0x3, local130, local12, local145, arg2, local113, local69, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BZI)Lclient!kb;")
	public static Class46 method1604(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class46 local9 = new Class46();
		local9.aByteArray17 = new byte[arg0];
		local9.anInt2034 = 0;
		for (@Pc(18) int local18 = arg2; local18 < arg0 + arg2; local18++) {
			if (arg1[local18] != 0) {
				local9.aByteArray17[local9.anInt2034++] = arg1[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!jg;Lclient!jg;Lclient!jg;B)V")
	public static void method1605(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class44 arg2) {
		Static58.aClass44_10 = arg1;
		Static169.aClass44_30 = arg0;
		Static179.aClass44_35 = arg2;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	public static void method1606() {
		aClass46_790 = null;
		aClass3_Sub2_Sub3_Sub3Array7 = null;
		aShortArray14 = null;
		aClass46_788 = null;
		aClass46_789 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lclient!h;")
	public static Class33 method1607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class33 local7 = Static179.method2873(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass33Array2 == null || arg0 >= local7.aClass33Array2.length) {
			return null;
		} else {
			return local7.aClass33Array2[arg0];
		}
	}
}
