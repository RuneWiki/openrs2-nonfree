import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "Lclient!fl;")
	public static Class83 aClass83_2;

	@OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
	public static int anInt1855;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_35 = new Class57("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_28 = new Class244(66, 2);

	@OriginalMember(owner = "client!ep", name = "M", descriptor = "Lclient!us;")
	public static final Class234 aClass234_38 = new Class234(75, 10);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public static void method1497() {
		for (@Pc(14) Class3_Sub36 local14 = (Class3_Sub36) Static230.aClass138_34.method3051(); local14 != null; local14 = (Class3_Sub36) Static230.aClass138_34.method3050()) {
			if (local14.anInt5101 > 0) {
				local14.anInt5101--;
			}
			if (local14.anInt5101 != 0) {
				if (local14.anInt5106 > 0) {
					local14.anInt5106--;
				}
				if (local14.anInt5106 == 0 && local14.anInt5104 >= 1 && local14.anInt5110 >= 1 && local14.anInt5104 <= Static12.anInt161 - 2 && local14.anInt5110 <= Static44.anInt787 - 2 && (local14.anInt5103 < 0 || Static13.method4663(local14.anInt5100, local14.anInt5103))) {
					Static298.method4593(local14.anInt5110, local14.anInt5112, -1, local14.anInt5100, local14.anInt5108, local14.anInt5103, local14.anInt5109, local14.anInt5104);
					local14.anInt5106 = -1;
					if (local14.anInt5114 == local14.anInt5103 && local14.anInt5114 == -1) {
						local14.method5700();
					} else if (local14.anInt5103 == local14.anInt5114 && local14.anInt5102 == local14.anInt5109 && local14.anInt5105 == local14.anInt5100) {
						local14.method5700();
					}
				}
			} else if (local14.anInt5114 < 0 || Static13.method4663(local14.anInt5105, local14.anInt5114)) {
				Static298.method4593(local14.anInt5110, local14.anInt5112, -1, local14.anInt5105, local14.anInt5108, local14.anInt5114, local14.anInt5102, local14.anInt5104);
				local14.method5700();
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBIIIIII)V")
	public static void method1498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg1;
		@Pc(25) int local25 = arg6 - arg1;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = arg6 * arg6;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg6 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(74) int local74 = local45 + local29 * (1 - local61);
		@Pc(83) int local83 = local33 - (local61 - 1) * local49;
		@Pc(93) int local93 = (1 - local65) * local37 + local53;
		@Pc(102) int local102 = local41 - local57 * (local65 - 1);
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local33 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(118) int local118 = local41 << 2;
		@Pc(122) int local122 = local45 * 3;
		@Pc(128) int local128 = local49 * (local61 - 3);
		@Pc(132) int local132 = local53 * 3;
		@Pc(138) int local138 = (local65 - 3) * local57;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg6 - 1);
		@Pc(148) int local148 = local118;
		@Pc(167) int local167;
		@Pc(176) int local176;
		@Pc(187) int local187;
		@Pc(198) int local198;
		if (arg0 >= Static26.anInt345 && arg0 <= Static272.anInt4750) {
			@Pc(158) int[] local158 = Static325.anIntArrayArray50[arg0];
			local167 = Static97.method1633(arg5 - arg3, Static365.anInt6140, Static221.anInt3917);
			local176 = Static97.method1633(arg5 + arg3, Static365.anInt6140, Static221.anInt3917);
			local187 = Static97.method1633(arg5 - local16, Static365.anInt6140, Static221.anInt3917);
			local198 = Static97.method1633(arg5 + local16, Static365.anInt6140, Static221.anInt3917);
			Static349.method5265(local167, local187, arg4, local158);
			Static349.method5265(local187, local198, arg2, local158);
			Static349.method5265(local198, local176, arg4, local158);
		}
		@Pc(222) int local222 = (local25 - 1) * local114;
		while (local9 > 0) {
			@Pc(231) boolean local231 = local9 <= local25;
			if (local231) {
				if (local93 < 0) {
					while (local93 < 0) {
						local102 += local148;
						local93 += local132;
						local148 += local118;
						local11++;
						local132 += local118;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local93 += local132;
					local11++;
					local148 += local118;
					local132 += local118;
				}
				local93 += -local222;
				local102 += -local138;
				local222 -= local114;
				local138 -= local114;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local83 += local140;
					local74 += local122;
					local7++;
					local122 += local110;
					local140 += local110;
				}
			}
			if (local83 < 0) {
				local74 += local122;
				local83 += local140;
				local122 += local110;
				local7++;
				local140 += local110;
			}
			local83 += -local128;
			local74 += -local146;
			local128 -= local106;
			local9--;
			local146 -= local106;
			local167 = arg0 - local9;
			local176 = arg0 + local9;
			if (Static26.anInt345 <= local176 && local167 <= Static272.anInt4750) {
				local187 = Static97.method1633(arg5 + local7, Static365.anInt6140, Static221.anInt3917);
				local198 = Static97.method1633(arg5 - local7, Static365.anInt6140, Static221.anInt3917);
				if (local231) {
					@Pc(412) int local412 = Static97.method1633(local11 + arg5, Static365.anInt6140, Static221.anInt3917);
					@Pc(421) int local421 = Static97.method1633(arg5 - local11, Static365.anInt6140, Static221.anInt3917);
					@Pc(432) int[] local432;
					if (Static26.anInt345 <= local167) {
						local432 = Static325.anIntArrayArray50[local167];
						Static349.method5265(local198, local421, arg4, local432);
						Static349.method5265(local421, local412, arg2, local432);
						Static349.method5265(local412, local187, arg4, local432);
					}
					if (Static272.anInt4750 >= local176) {
						local432 = Static325.anIntArrayArray50[local176];
						Static349.method5265(local198, local421, arg4, local432);
						Static349.method5265(local421, local412, arg2, local432);
						Static349.method5265(local412, local187, arg4, local432);
					}
				} else {
					if (local167 >= Static26.anInt345) {
						Static349.method5265(local198, local187, arg4, Static325.anIntArrayArray50[local167]);
					}
					if (Static272.anInt4750 >= local176) {
						Static349.method5265(local198, local187, arg4, Static325.anIntArrayArray50[local176]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIJLjava/lang/String;ZILjava/lang/String;ZI)V")
	public static void method1499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) String arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) String arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static287.aBoolean397 && Static105.anInt2076 < 500) {
			@Pc(16) int local16 = arg9 == -1 ? Static103.anInt2047 : arg9;
			@Pc(30) Class3_Sub4 local30 = new Class3_Sub4(arg7, arg5, local16, arg0, arg1, arg4, arg2, arg3, arg6, arg8);
			Static47.aClass138_7.method3053(local30);
			Static105.anInt2076++;
		}
	}
}
