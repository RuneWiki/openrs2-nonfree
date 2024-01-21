import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!qc;")
	private static Class60 aClass60_919 = Static121.method2047("Type");

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!qc;")
	private static Class60 aClass60_925 = Static121.method2047("flash1:");

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_920 = aClass60_925;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_921 = aClass60_925;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_922 = Static121.method2047("M");

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!qc;")
	public static Class60 aClass60_923 = Static121.method2047("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!qc;")
	private static Class60 aClass60_926 = Static121.method2047("Hidden");

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_924 = aClass60_926;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_927 = Static121.method2047("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5 = new byte[4][104][104];

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!qc;")
	public static Class60 aClass60_928 = aClass60_919;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Lclient!mf;")
	public static Class48 aClass48_53 = new Class48(64);

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_929 = Static121.method2047("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	public static int anInt2331 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1672() {
		aClass60_921 = null;
		aClass60_920 = null;
		aClass60_928 = null;
		aClass60_926 = null;
		aClass60_924 = null;
		aClass60_919 = null;
		aClass60_922 = null;
		aClass60_929 = null;
		aClass48_53 = null;
		aByteArrayArrayArray5 = null;
		aClass60_927 = null;
		anIntArray233 = null;
		anIntArray232 = null;
		aClass60_923 = null;
		aClass60_925 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBIIIII[Lclient!m;ILclient!ha;[B)V")
	public static void method1673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class45[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class28 arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class4_Sub13 local12 = new Class4_Sub13(arg9);
		while (true) {
			@Pc(18) int local18 = local12.method1237();
			if (local18 == 0) {
				return;
			}
			local7 += local18;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(32) int local32 = local12.method1237();
				if (local32 == 0) {
					break;
				}
				local26 += local32 - 1;
				@Pc(44) int local44 = local26 & 0x3F;
				@Pc(50) int local50 = local26 >> 6 & 0x3F;
				@Pc(54) int local54 = local26 >> 12;
				@Pc(58) int local58 = local12.method1223();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (local54 == arg7 && local50 >= arg4 && arg4 + 8 > local50 && local44 >= arg1 && arg1 + 8 > local44) {
					@Pc(93) Class4_Sub4_Sub5 local93 = Static24.method477(local7);
					@Pc(110) int local110 = Static112.method1920(local66, arg5, local50 & 0x7, local44 & 0x7, local93.anInt1075, local93.anInt1085) + arg3;
					@Pc(127) int local127 = arg2 + Static56.method1032(arg5, local44 & 0x7, local66, local50 & 0x7, local93.anInt1085, local93.anInt1075);
					if (local110 > 0 && local127 > 0 && local110 < 103 && local127 < 103) {
						@Pc(144) int local144 = arg0;
						if ((aByteArrayArrayArray5[1][local110][local127] & 0x2) == 2) {
							local144 = arg0 - 1;
						}
						@Pc(158) Class45 local158 = null;
						if (local144 >= 0) {
							local158 = arg6[local144];
						}
						Static55.method1026(local62, local127, arg0, local110, local7, local158, arg8, arg5 + local66 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method1674() {
		Static7.aClass48_67.method1393();
		Static92.aClass48_51.method1393();
		Static9.aClass48_6.method1393();
	}
}
