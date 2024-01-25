import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public static int anInt1868;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
	public static int anInt1869;

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "Lclient!iv;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_37 = new Class2(53, 8);

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
	public static int anInt1865 = 1;

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_41 = new Class55("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_32 = new Class253(85, 8);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method1612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0 - arg5;
		@Pc(20) int local20 = arg4 - arg5;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg4 * arg4;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg4 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local24 * (1 - local56) + local40;
		@Pc(78) int local78 = local28 - local44 * (local56 - 1);
		@Pc(88) int local88 = local32 * (1 - local60) + local48;
		@Pc(101) int local101 = local36 - local52 * (local60 - 1);
		@Pc(105) int local105 = local24 << 2;
		@Pc(109) int local109 = local28 << 2;
		@Pc(113) int local113 = local32 << 2;
		@Pc(117) int local117 = local36 << 2;
		@Pc(121) int local121 = local40 * 3;
		@Pc(127) int local127 = local44 * (local56 - 3);
		@Pc(131) int local131 = local48 * 3;
		@Pc(137) int local137 = (local60 - 3) * local52;
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local105 * (arg4 - 1);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local113 * (local20 - 1);
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(196) int local196;
		@Pc(204) int local204;
		if (arg6 >= Static316.anInt5188 && Static82.anInt1667 >= arg6) {
			@Pc(171) int[] local171 = Static353.anIntArrayArray48[arg6];
			local179 = Static278.method3708(arg2 - arg0, Static137.anInt2576, Static293.anInt4886);
			local187 = Static278.method3708(arg0 + arg2, Static137.anInt2576, Static293.anInt4886);
			local196 = Static278.method3708(arg2 - local15, Static137.anInt2576, Static293.anInt4886);
			local204 = Static278.method3708(local15 + arg2, Static137.anInt2576, Static293.anInt4886);
			Static404.method5769(local171, local179, local196, arg1);
			Static404.method5769(local171, local196, local204, arg3);
			Static404.method5769(local171, local204, local187, arg1);
		}
		while (local9 > 0) {
			@Pc(231) boolean local231 = local20 >= local9;
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local139;
					local69 += local121;
					local139 += local109;
					local7++;
					local121 += local109;
				}
			}
			if (local231) {
				if (local88 < 0) {
					while (local88 < 0) {
						local101 += local147;
						local88 += local131;
						local11++;
						local147 += local117;
						local131 += local117;
					}
				}
				if (local101 < 0) {
					local101 += local147;
					local88 += local131;
					local11++;
					local131 += local117;
					local147 += local117;
				}
				local101 += -local137;
				local88 += -local153;
				local153 -= local113;
				local137 -= local113;
			}
			if (local78 < 0) {
				local78 += local139;
				local69 += local121;
				local139 += local109;
				local7++;
				local121 += local109;
			}
			local69 += -local145;
			local78 += -local127;
			local145 -= local105;
			local9--;
			local127 -= local105;
			local179 = arg6 - local9;
			local187 = arg6 + local9;
			if (local187 >= Static316.anInt5188 && Static82.anInt1667 >= local179) {
				local196 = Static278.method3708(local7 + arg2, Static137.anInt2576, Static293.anInt4886);
				local204 = Static278.method3708(arg2 - local7, Static137.anInt2576, Static293.anInt4886);
				if (local231) {
					@Pc(409) int local409 = Static278.method3708(local11 + arg2, Static137.anInt2576, Static293.anInt4886);
					@Pc(417) int local417 = Static278.method3708(arg2 - local11, Static137.anInt2576, Static293.anInt4886);
					@Pc(424) int[] local424;
					if (Static316.anInt5188 <= local179) {
						local424 = Static353.anIntArrayArray48[local179];
						Static404.method5769(local424, local204, local417, arg1);
						Static404.method5769(local424, local417, local409, arg3);
						Static404.method5769(local424, local409, local196, arg1);
					}
					if (local187 <= Static82.anInt1667) {
						local424 = Static353.anIntArrayArray48[local187];
						Static404.method5769(local424, local204, local417, arg1);
						Static404.method5769(local424, local417, local409, arg3);
						Static404.method5769(local424, local409, local196, arg1);
					}
				} else {
					if (Static316.anInt5188 <= local179) {
						Static404.method5769(Static353.anIntArrayArray48[local179], local204, local196, arg1);
					}
					if (local187 <= Static82.anInt1667) {
						Static404.method5769(Static353.anIntArrayArray48[local187], local204, local196, arg1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V")
	public static void method1613(@OriginalArg(0) int arg0) {
		Static76.method1359();
		Static12.method109();
		Static284.method704(true, arg0);
		Static292.method3871(Static269.aClass51_9, Static25.aClass178_9, Static249.aClass178_74);
		Static68.method1148(Static269.aClass51_9, Static25.aClass178_9);
		Static292.method3874();
		Static290.method3849(Static321.aClass11Array9);
		Static193.method2788();
		if (Static206.anInt3642 == 2) {
			Static138.method2151(3);
		} else if (Static206.anInt3642 == 6) {
			Static138.method2151(7);
		} else if (Static206.anInt3642 == 9) {
			Static138.method2151(10);
		} else if (Static206.anInt3642 == 1) {
			Static361.method4642(Static25.aClass178_9, Static269.aClass51_9);
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIB)V")
	public static void method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static130.aClass153_Sub1_1.anInt5237 != 0 && arg3 != 0 && Static225.anInt4941 < 50 && arg2 != -1) {
			Static205.aClass252Array1[Static225.anInt4941++] = new Class252((byte) 1, arg2, arg3, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
	public static void method1615() {
		if (Static43.aClass51_1 != null) {
			Static43.aClass51_1.method5315();
			Static43.aClass51_1 = null;
			Static421.aClass63_14 = null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1616(@OriginalArg(1) String arg0) {
		Static336.method4383(0, 0, "", arg0, "");
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method1617(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static31.method417(arg0.length - 1, arg0, arg1, 0);
	}
}
