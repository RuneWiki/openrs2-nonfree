import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!cma", name = "b", descriptor = "Lclient!lb;")
	public static Class221 aClass221_17;

	@OriginalMember(owner = "client!cma", name = "j", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!cma", name = "k", descriptor = "I")
	public static int anInt1479;

	@OriginalMember(owner = "client!cma", name = "o", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!cma", name = "q", descriptor = "I")
	public static int anInt1480 = 0;

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(IIIII)V")
	public static void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static283.anIntArrayArray26 != null) {
			Static283.anIntArrayArray26[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static235.aShortArrayArray2 != null) {
			Static235.aShortArrayArray2[arg0][arg1] = (short) arg3;
		}
		if (Static242.aByteArrayArray6 != null) {
			Static242.aByteArrayArray6[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(Lclient!lk;I)V")
	public static void method1197(@OriginalArg(0) Class3_Sub28_Sub2 arg0) {
		arg0.method5343();
		@Pc(10) int local10 = Static584.anInt9539;
		@Pc(20) Class19_Sub1_Sub3_Sub2_Sub2 local20 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local10] = new Class19_Sub1_Sub3_Sub2_Sub2();
		local20.anInt7796 = local10;
		@Pc(28) int local28 = arg0.method5344(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray430[0] = local39 - Static714.anInt11156;
		@Pc(50) int local50 = local28 & 0x3FFF;
		local20.anInt11204 = (local20.anIntArray430[0] << 9) + (local20.method6592() << 8);
		local20.lb[0] = local50 - Static339.anInt5859;
		local20.anInt11211 = (local20.lb[0] << 9) + (local20.method6592() << 8);
		Static712.anInt11117 = local20.aByte146 = local20.aByte145 = local33;
		if (Static135.method2226(local20.anIntArray430[0], local20.lb[0])) {
			local20.aByte145++;
		}
		if (Static677.aClass3_Sub28Array1[local10] != null) {
			local20.method6615((byte) -115, Static677.aClass3_Sub28Array1[local10]);
		}
		Static558.anInt9284 = 0;
		Static408.anIntArray393[Static558.anInt9284++] = local10;
		Static418.aByteArray58[local10] = 0;
		Static629.anInt10192 = 0;
		for (@Pc(148) int local148 = 1; local148 < 2048; local148++) {
			if (local148 != local10) {
				@Pc(164) int local164 = arg0.method5344(18);
				@Pc(168) int local168 = local164 >> 16;
				@Pc(174) int local174 = local164 >> 8 & 0xFF;
				@Pc(178) int local178 = local164 & 0xFF;
				@Pc(186) Class342 local186 = Static286.aClass342Array5[local148] = new Class342();
				local186.aBoolean692 = false;
				local186.aBoolean691 = false;
				local186.anInt9611 = 0;
				local186.anInt9614 = (local168 << 28) - (-(local174 << 14) - local178);
				local186.anInt9615 = -1;
				Static660.anIntArray591[Static629.anInt10192++] = local148;
				Static418.aByteArray58[local148] = 0;
			}
		}
		arg0.method5346();
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!qfa;")
	public static Class19_Sub1_Sub3 method1199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(15) Class343 local15 = local7.aClass343_2; local15 != null; local15 = local15.aClass343_4) {
			@Pc(19) Class19_Sub1_Sub3 local19 = local15.aClass19_Sub1_Sub3_1;
			if (arg3.isAssignableFrom(local19.getClass()) && local19.aShort121 == arg1 && local19.aShort124 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(BLclient!pi;Lclient!wea;)Lclient!ss;")
	public static Class3_Sub48 method1200(@OriginalArg(1) Class286 arg0, @OriginalArg(2) Class399 arg1) {
		@Pc(8) Class3_Sub48 local8 = Static70.method896();
		local8.aClass286_103 = arg0;
		local8.anInt9730 = arg0.anInt8455;
		if (local8.anInt9730 == -1) {
			local8.aClass3_Sub28_Sub2_1 = new Class3_Sub28_Sub2(260);
		} else if (local8.anInt9730 == -2) {
			local8.aClass3_Sub28_Sub2_1 = new Class3_Sub28_Sub2(10000);
		} else if (local8.anInt9730 <= 18) {
			local8.aClass3_Sub28_Sub2_1 = new Class3_Sub28_Sub2(20);
		} else if (local8.anInt9730 > 98) {
			local8.aClass3_Sub28_Sub2_1 = new Class3_Sub28_Sub2(260);
		} else {
			local8.aClass3_Sub28_Sub2_1 = new Class3_Sub28_Sub2(100);
		}
		local8.aClass3_Sub28_Sub2_1.method5348(arg1);
		local8.aClass3_Sub28_Sub2_1.method5340(local8.aClass286_103.method7095());
		local8.anInt9728 = 0;
		return local8;
	}
}
