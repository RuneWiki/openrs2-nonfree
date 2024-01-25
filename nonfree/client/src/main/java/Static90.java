import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "[I")
	public static final int[] anIntArray527 = new int[4];

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
	public static int anInt8334 = -1;

	@OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
	public static int anInt8336 = 0;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIZBI)Lclient!ab;")
	public static Class3_Sub1 method7198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub1 local7 = new Class3_Sub1();
		local7.anInt24 = arg1;
		local7.anInt25 = arg0;
		Static128.aClass25_7.method434((long) arg3, local7);
		Static416.method6439(arg1);
		@Pc(26) Class344 local26 = Static324.method5363(arg3);
		if (local26 != null) {
			Static605.method8323(local26);
		}
		if (Static9.aClass344_1 != null) {
			Static605.method8323(Static9.aClass344_1);
			Static9.aClass344_1 = null;
		}
		Static246.method4161();
		if (local26 != null) {
			Static335.method5417(!arg2, local26);
		}
		if (!arg2) {
			Static400.method6287(arg1);
		}
		if (!arg2 && Static528.anInt8950 != -1) {
			Static24.method329(Static528.anInt8950, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIILclient!ki;Lclient!ki;)V")
	public static void method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub2_Sub5 arg3, @OriginalArg(4) Class9_Sub2_Sub5 arg4) {
		@Pc(4) Class351 local4 = Static175.method2895(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub2_Sub5_1 = arg3;
		local4.aClass9_Sub2_Sub5_2 = arg4;
		@Pc(19) int local19 = Static637.aClass91Array4 == Static485.aClass91Array1 ? 1 : 0;
		if (!arg3.method8597()) {
			arg3.aClass9_Sub2_23 = Static164.aClass9_Sub2Array1[local19];
			Static164.aClass9_Sub2Array1[local19] = arg3;
		} else if (arg3.method8607()) {
			arg3.aClass9_Sub2_23 = Static250.aClass9_Sub2Array5[local19];
			Static250.aClass9_Sub2Array5[local19] = arg3;
		} else {
			arg3.aClass9_Sub2_23 = Static463.aClass9_Sub2Array6[local19];
			Static463.aClass9_Sub2Array6[local19] = arg3;
			Static334.aBoolean462 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8597()) {
			if (arg4.method8607()) {
				arg4.aClass9_Sub2_23 = Static250.aClass9_Sub2Array5[local19];
				Static250.aClass9_Sub2Array5[local19] = arg4;
				return;
			}
			arg4.aClass9_Sub2_23 = Static463.aClass9_Sub2Array6[local19];
			Static463.aClass9_Sub2Array6[local19] = arg4;
			Static334.aBoolean462 = true;
			return;
		}
		arg4.aClass9_Sub2_23 = Static164.aClass9_Sub2Array1[local19];
		Static164.aClass9_Sub2Array1[local19] = arg4;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BI)V")
	public static void method7201(@OriginalArg(1) int arg0) {
		Static89.anInt6486 = arg0;
		Static614.aClass136_71.method3142();
	}
}
