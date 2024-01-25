import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
	public static final int[] anIntArray150 = new int[14];

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "[I")
	public static final int[] anIntArray151 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!la;Ljava/lang/String;Lclient!r;ZLclient!fo;)V")
	public static void method1453(@OriginalArg(1) Class37 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class162 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class112 arg4) {
		@Pc(12) boolean local12 = !Static582.aBoolean788 || Static14.method247();
		if (!local12) {
			return;
		}
		@Pc(26) int local26;
		@Pc(35) int local35;
		if (Static582.aBoolean788 && local12) {
			@Pc(133) Class112 local133 = Static521.aClass112_10;
			@Pc(139) Class37 local139 = arg2.method6864(local133, Static86.aClass344Array1);
			local26 = local133.method2083(null, 250, arg1);
			local35 = local133.method2075(local133.anInt2426, 250, null, arg1);
			@Pc(158) int local158 = Static471.aClass344_5.anInt8947;
			@Pc(162) int local162 = local158 + 4;
			local35 += local162 * 2;
			local26 += local162 * 2;
			if (local35 < Static502.anInt8004) {
				local35 = Static502.anInt8004;
			}
			if (local26 < Static591.anInt9579) {
				local26 = Static591.anInt9579;
			}
			@Pc(197) int local197 = Static258.aClass322_4.method6534(Static14.anInt330, local26) + Static130.anInt2130;
			@Pc(206) int local206 = Static99.aClass347_2.method7305(Static370.anInt6187, local35) + Static442.anInt7095;
			arg2.method6845(Static541.aClass344_4, false).DA(local197 + Static194.aClass344_1.anInt8947, local206 + Static194.aClass344_1.anInt8946, local26 - Static194.aClass344_1.anInt8947 * 2, local35 + -(Static194.aClass344_1.anInt8946 * 2), 1, 0, 0);
			arg2.method6845(Static194.aClass344_1, true).method7463(local197, local206);
			Static194.aClass344_1.method7122();
			arg2.method6845(Static194.aClass344_1, true).method7463(local197 + local26 - local158, local206);
			Static194.aClass344_1.method7127();
			arg2.method6845(Static194.aClass344_1, true).method7463(local197 + local26 - local158, local35 + local206 + -local158);
			Static194.aClass344_1.method7122();
			arg2.method6845(Static194.aClass344_1, true).method7463(local197, local35 + local206 - local158);
			Static194.aClass344_1.method7127();
			arg2.method6845(Static471.aClass344_5, true).method7457(local197, Static194.aClass344_1.anInt8946 + local206, local158, local35 - Static194.aClass344_1.anInt8946 * 2);
			Static471.aClass344_5.method7115();
			arg2.method6845(Static471.aClass344_5, true).method7457(Static194.aClass344_1.anInt8947 + local197, local206, local26 - Static194.aClass344_1.anInt8947 * 2, local158);
			Static471.aClass344_5.method7115();
			arg2.method6845(Static471.aClass344_5, true).method7457(local197 + local26 - local158, local206 - -Static194.aClass344_1.anInt8946, local158, local35 - Static194.aClass344_1.anInt8946 * 2);
			Static471.aClass344_5.method7115();
			arg2.method6845(Static471.aClass344_5, true).method7457(Static194.aClass344_1.anInt8947 + local197, -local158 + local35 + local206, local26 - Static194.aClass344_1.anInt8947 * 2, local158);
			Static471.aClass344_5.method7115();
			local139.method7710(null, null, arg1, local26 - local162 * 2, local162 + local197, local35 - local162 * 2, Static184.anInt2740 | 0xFF000000, local162 + local206, 1, 0, -1, 1, null, 0, 0);
			Static359.method2627(local35, local197, local26, local206);
		} else {
			local26 = arg4.method2083(null, 250, arg1);
			local35 = arg4.method2084(250, null, arg1) * 13;
			arg2.J(6, 6, local26 + 4 + 4, local35 + 4 + 4, -16777216, 0);
			arg2.method6827(6, 6, local26 + 8, local35 + 8, -1, 0);
			arg0.method7710(null, null, arg1, local26, 10, local35, -1, 10, 1, 0, -1, 1, null, 0, 0);
			Static359.method2627(local35 + 4 + 4, 6, local26 + 8, 6);
		}
		if (arg3) {
			try {
				arg2.method6842();
			} catch (@Pc(429) Exception_Sub1 local429) {
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ew;Lclient!gk;BI)V")
	public static void method1454(@OriginalArg(0) Class99 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub22 local9 = new Class2_Sub22();
		local9.anInt3099 = arg1.method4464();
		local9.anInt3104 = arg1.method4509();
		local9.aByteArrayArrayArray13 = new byte[local9.anInt3099][][];
		local9.anIntArray262 = new int[local9.anInt3099];
		local9.anIntArray260 = new int[local9.anInt3099];
		local9.aClass5Array1 = new Class5[local9.anInt3099];
		local9.aClass5Array2 = new Class5[local9.anInt3099];
		local9.anIntArray261 = new int[local9.anInt3099];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt3099; local56++) {
			try {
				@Pc(62) int local62 = arg1.method4464();
				@Pc(76) String local76;
				@Pc(80) String local80;
				@Pc(82) int local82;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local76 = arg1.method4494();
					local80 = arg1.method4494();
					local82 = 0;
					if (local62 == 1) {
						local82 = arg1.method4509();
					}
					local9.anIntArray260[local56] = local62;
					local9.anIntArray262[local56] = local82;
					local9.aClass5Array2[local56] = arg0.method1775(local80, Static71.method4251(local76));
				} else if (local62 == 3 || local62 == 4) {
					local76 = arg1.method4494();
					local80 = arg1.method4494();
					local82 = arg1.method4464();
					@Pc(137) String[] local137 = new String[local82];
					for (@Pc(139) int local139 = 0; local139 < local82; local139++) {
						local137[local139] = arg1.method4494();
					}
					@Pc(158) byte[][] local158 = new byte[local82][];
					@Pc(169) int local169;
					if (local62 == 3) {
						for (@Pc(163) int local163 = 0; local163 < local82; local163++) {
							local169 = arg1.method4509();
							local158[local163] = new byte[local169];
							arg1.method4504(local169, local158[local163]);
						}
					}
					local9.anIntArray260[local56] = local62;
					@Pc(194) Class[] local194 = new Class[local82];
					for (local169 = 0; local169 < local82; local169++) {
						local194[local169] = Static71.method4251(local137[local169]);
					}
					local9.aClass5Array1[local56] = arg0.method1772(Static71.method4251(local76), local194, local80);
					local9.aByteArrayArrayArray13[local56] = local158;
				}
			} catch (@Pc(233) ClassNotFoundException local233) {
				local9.anIntArray261[local56] = -1;
			} catch (@Pc(240) SecurityException local240) {
				local9.anIntArray261[local56] = -2;
			} catch (@Pc(247) NullPointerException local247) {
				local9.anIntArray261[local56] = -3;
			} catch (@Pc(254) Exception local254) {
				local9.anIntArray261[local56] = -4;
			} catch (@Pc(261) Throwable local261) {
				local9.anIntArray261[local56] = -5;
			}
		}
		Static148.aClass70_6.method1269(local9);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method1457(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local18 - local22 < local8 || local20 - local24 < local16) {
			if (local8 <= local18 - local22) {
				return -1;
			}
			if (local20 - local24 >= local16) {
				return 1;
			}
			@Pc(68) char local68;
			if (local22 == '\u0000') {
				local68 = arg1.charAt(local18++);
			} else {
				local68 = local22;
			}
			@Pc(81) char local81;
			if (local24 == '\u0000') {
				local81 = arg0.charAt(local20++);
			} else {
				local81 = local24;
			}
			local22 = Static244.method3471(local68);
			local24 = Static244.method3471(local81);
			local68 = Static17.method4060(local68, arg2);
			local81 = Static17.method4060(local81, arg2);
			if (local81 != local68 && Character.toUpperCase(local68) != Character.toUpperCase(local81)) {
				local68 = Character.toLowerCase(local68);
				local81 = Character.toLowerCase(local81);
				if (local81 != local68) {
					return Static499.method6469(arg2, local68) - Static499.method6469(arg2, local81);
				}
			}
		}
		@Pc(139) int local139 = Math.min(local8, local16);
		for (@Pc(141) int local141 = 0; local141 < local139; local141++) {
			if (arg2 == 2) {
				local18 = local8 - local141 - 1;
				local20 = local16 - local141 - 1;
			} else {
				local20 = local141;
				local18 = local141;
			}
			@Pc(169) char local169 = arg1.charAt(local18);
			@Pc(173) char local173 = arg0.charAt(local20);
			if (local169 != local173 && Character.toUpperCase(local169) != Character.toUpperCase(local173)) {
				local169 = Character.toLowerCase(local169);
				local173 = Character.toLowerCase(local173);
				if (local173 != local169) {
					return Static499.method6469(arg2, local169) - Static499.method6469(arg2, local173);
				}
			}
		}
		@Pc(217) int local217 = local8 - local16;
		if (local217 != 0) {
			return local217;
		}
		for (@Pc(226) int local226 = 0; local226 < local139; local226++) {
			@Pc(232) char local232 = arg1.charAt(local226);
			@Pc(236) char local236 = arg0.charAt(local226);
			if (local236 != local232) {
				return Static499.method6469(arg2, local232) - Static499.method6469(arg2, local236);
			}
		}
		return 0;
	}
}
