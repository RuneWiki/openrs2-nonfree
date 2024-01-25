import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!vk;")
	public static Class372 aClass372_11;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_139 = new Class100(77, 3);

	@OriginalMember(owner = "client!da", name = "u", descriptor = "I")
	public static int anInt10791 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
	public static void method8982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static313.anInt9045 <= arg1 && Static575.anInt9879 >= arg1) {
			@Pc(19) int local19 = Static258.method3697(arg2, Static370.anInt10475, Static468.anInt355);
			@Pc(25) int local25 = Static258.method3697(arg0, Static370.anInt10475, Static468.anInt355);
			Static405.method6009(arg3, local25, local19, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!da;ZLclient!ha;Ljava/lang/String;Lclient!ie;)V")
	public static void method8992(@OriginalArg(1) Class38 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class137 arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class158 arg4) {
		@Pc(12) boolean local12 = !Static235.aBoolean301 || Static304.method4463();
		if (!local12) {
			return;
		}
		@Pc(30) int local30;
		@Pc(39) int local39;
		if (Static235.aBoolean301 && local12) {
			@Pc(135) Class158 local135 = Static130.aClass158_5;
			@Pc(141) Class38 local141 = arg2.method7870(local135, Static245.aClass356Array5);
			local30 = local135.method3599((Class20[]) null, arg3, 250);
			local39 = local135.method3607(250, (Class20[]) null, arg3, local135.anInt4348);
			@Pc(160) int local160 = Static533.aClass356_2.anInt10341;
			@Pc(164) int local164 = local160 + 4;
			local30 += local164 * 2;
			local39 += local164 * 2;
			if (local39 < Static92.anInt2037) {
				local39 = Static92.anInt2037;
			}
			if (local30 < Static144.anInt2756) {
				local30 = Static144.anInt2756;
			}
			@Pc(198) int local198 = Static613.aClass168_12.method3716(local30, Static258.anInt4461) + Static235.anInt4295;
			@Pc(206) int local206 = Static195.aClass339_6.method8222(local39, Static297.anInt5240) + Static306.anInt5353;
			if (Static128.aBoolean202) {
				local198 += Static619.method8679();
				local206 += Static571.method8194();
			}
			arg2.method7951(Static580.aClass356_3, false).method7406(Static73.aClass356_1.anInt10341 + local198, Static73.aClass356_1.anInt10343 + local206, local30 - Static73.aClass356_1.anInt10341 * 2, local39 - Static73.aClass356_1.anInt10343 * 2, 1, 0, 0);
			arg2.method7951(Static73.aClass356_1, true).method7399(local198, local206);
			Static73.aClass356_1.method8620();
			arg2.method7951(Static73.aClass356_1, true).method7399(local198 + local30 - local160, local206);
			Static73.aClass356_1.method8629();
			arg2.method7951(Static73.aClass356_1, true).method7399(local30 + local198 - local160, local206 + local39 + -local160);
			Static73.aClass356_1.method8620();
			arg2.method7951(Static73.aClass356_1, true).method7399(local198, local39 + local206 - local160);
			Static73.aClass356_1.method8629();
			arg2.method7951(Static533.aClass356_2, true).method7414(local198, Static73.aClass356_1.anInt10343 + local206, local160, local39 - Static73.aClass356_1.anInt10343 * 2);
			Static533.aClass356_2.method8625();
			arg2.method7951(Static533.aClass356_2, true).method7414(Static73.aClass356_1.anInt10341 + local198, local206, local30 - Static73.aClass356_1.anInt10341 * 2, local160);
			Static533.aClass356_2.method8625();
			arg2.method7951(Static533.aClass356_2, true).method7414(local198 + local30 - local160, local206 - -Static73.aClass356_1.anInt10343, local160, local39 - Static73.aClass356_1.anInt10343 * 2);
			Static533.aClass356_2.method8625();
			arg2.method7951(Static533.aClass356_2, true).method7414(local198 + Static73.aClass356_1.anInt10341, -local160 + local39 + local206, local30 - Static73.aClass356_1.anInt10341 * 2, local160);
			Static533.aClass356_2.method8625();
			local141.method8994(0, (Class20[]) null, 1, local30 - local164 * 2, local206 - -local164, 1, 0, arg3, local39 - local164 * 2, (int[]) null, local198 + local164, 0, Static646.anInt10803 | 0xFF000000, (Class1) null, -1);
			Static481.method7124(local39, local206, local30, local198);
		} else {
			local30 = arg4.method3599((Class20[]) null, arg3, 250);
			local39 = arg4.method3603(arg3, (Class20[]) null, 250) * 13;
			arg2.aa(6, 6, local30 + 4 + 4, 4 + 4 + local39, -16777216, 0);
			arg2.method7927(6, 6, local30 + 4 + 4, 4 + 4 + local39, -1, 0);
			arg0.method8994(0, (Class20[]) null, 1, local30, 10, 1, 0, arg3, local39, (int[]) null, 10, 0, -1, (Class1) null, -1);
			Static481.method7124(local39 + 8, 6, local30 + 8, 6);
		}
		if (!arg1) {
			return;
		}
		try {
			if (Static128.aBoolean202) {
				Static678.method9312();
			} else {
				arg2.method7921();
			}
		} catch (@Pc(447) Exception_Sub1 local447) {
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public static void method8997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static277.anInt4826 == 1) {
			Static192.method2991(arg1, arg0, Static633.aClass14_Sub3_Sub11_3);
		} else if (Static277.anInt4826 == 2) {
			if (Static128.aBoolean202) {
				Static581.method8289(Static571.method8194() + arg0, Static619.method8679() + arg1);
			} else {
				Static581.method8289(arg0, arg1);
			}
		}
		Static277.anInt4826 = 0;
		Static633.aClass14_Sub3_Sub11_3 = null;
	}
}
