import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!g", name = "B", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "I")
	public static int anInt1991 = 0;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "J")
	public static long aLong66 = 0L;

	@OriginalMember(owner = "client!g", name = "G", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!g", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString108 = null;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	public static int anInt1997 = 0;

	@OriginalMember(owner = "client!g", name = "L", descriptor = "[I")
	public static int[] anIntArray160 = new int[500];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
	public static void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18;
		@Pc(46) int local46;
		if (Static69.anInt1334 == 0) {
			@Pc(14) int local14 = Static291.anInt5438;
			@Pc(16) int local16 = Static157.anInt3123;
			local18 = Static311.anInt6034;
			@Pc(30) int local30 = (local16 - local14) * (arg1 - arg3) / arg4 + local14;
			@Pc(32) int local32 = Static27.anInt403;
			local46 = local18 + (local32 - local18) * (arg5 - arg2) / arg0;
			if (Static135.aBoolean177 && (Static187.anInt3560 & 0x40) != 0) {
				@Pc(85) Class189 local85 = Static152.method2432(Static21.anInt1053, Static71.anInt1367);
				if (local85 == null) {
					Static188.method4849();
				} else {
					Static84.method1497(0L, local30, local46, " ->", Static155.aString140, (short) 19, Static237.anInt4467);
				}
			} else {
				if (Static76.anInt5724 == 1) {
					Static84.method1497(0L, local30, local46, "", Static125.aString139, (short) 47, -1);
				}
				Static84.method1497(0L, local30, local46, "", Static206.aString236, (short) 26, -1);
			}
		}
		@Pc(103) long local103 = -1L;
		for (local18 = 0; local18 < Static300.anInt5627; local18++) {
			@Pc(112) long local112 = Static198.aLongArray57[local18];
			local46 = (int) local112 & 0x7F;
			@Pc(124) int local124 = (int) local112 >> 7 & 0x7F;
			@Pc(131) int local131 = Integer.MAX_VALUE & (int) (local112 >>> 32);
			@Pc(138) int local138 = (int) local112 >> 29 & 0x3;
			if (local103 != local112) {
				local103 = local112;
				@Pc(278) int local278;
				if (local138 == 2 && Static304.method4706(Static281.anInt5335, local46, local124, local112)) {
					@Pc(163) Class184 local163 = Static6.method99(local131);
					if (local163.anIntArray631 != null) {
						local163 = local163.method4490();
					}
					if (local163 == null) {
						continue;
					}
					if (Static69.anInt1334 == 1) {
						Static84.method1497(local112, local46, local124, Static313.aString372 + " -> <col=00ffff>" + local163.aString339, Static194.aString321, (short) 16, Static82.anInt1937);
					} else if (Static135.aBoolean177) {
						@Pc(215) Class4_Sub3_Sub12 local215 = Static218.anInt4225 == -1 ? null : Static114.method1816(Static218.anInt4225);
						if ((Static187.anInt3560 & 0x4) != 0 && (local215 == null || local163.method4488(local215.anInt2546, Static218.anInt4225) != local215.anInt2546)) {
							Static84.method1497(local112, local46, local124, Static69.aString81 + " -> <col=00ffff>" + local163.aString339, Static155.aString140, (short) 4, Static237.anInt4467);
						}
					} else {
						@Pc(267) String[] local267 = local163.aStringArray39;
						if (Static185.aBoolean254) {
							local267 = Static278.method4337(local267);
						}
						if (local267 != null) {
							for (local278 = 4; local278 >= 0; local278--) {
								if (local267[local278] != null) {
									@Pc(294) short local294 = 0;
									if (local278 == 0) {
										local294 = 41;
									}
									if (local278 == 1) {
										local294 = 37;
									}
									if (local278 == 2) {
										local294 = 32;
									}
									if (local278 == 3) {
										local294 = 40;
									}
									if (local278 == 4) {
										local294 = 1005;
									}
									@Pc(327) int local327 = -1;
									if (local278 == local163.anInt5514) {
										local327 = local163.anInt5552;
									}
									if (local163.anInt5534 == local278) {
										local327 = local163.anInt5529;
									}
									Static84.method1497(local112, local46, local124, "<col=00ffff>" + local163.aString339, local267[local278], local294, local327);
								}
							}
						}
						Static84.method1497((long) local163.anInt5554, local46, local124, "<col=00ffff>" + local163.aString339, Static13.aString22, (short) 1007, Static110.anInt2232);
					}
				}
				@Pc(501) int local501;
				@Pc(512) int local512;
				@Pc(450) int local450;
				@Pc(464) int local464;
				@Pc(477) Class53_Sub1_Sub2 local477;
				@Pc(577) Class53_Sub1_Sub1 local577;
				if (local138 == 1) {
					@Pc(394) Class53_Sub1_Sub2 local394 = Static110.aClass53_Sub1_Sub2Array1[local131];
					if ((local394.aClass171_1.anInt5263 & 0x1) == 0 && (local394.anInt3974 & 0x7F) == 0 && (local394.anInt4002 & 0x7F) == 0 || (local394.aClass171_1.anInt5263 & 0x1) == 1 && (local394.anInt3974 & 0x7F) == 64 && (local394.anInt4002 & 0x7F) == 64) {
						local450 = local394.anInt3974 - (local394.aClass171_1.anInt5263 - 1) * 64;
						local278 = local394.anInt4002 + 64 - local394.aClass171_1.anInt5263 * 64;
						for (local464 = 0; local464 < Static236.anInt4452; local464++) {
							local477 = Static110.aClass53_Sub1_Sub2Array1[Static278.anIntArray595[local464]];
							if (local477 != null && !local477.aBoolean281 && local477 != local394 && local477.aBoolean282) {
								local501 = local477.anInt3974 - (local477.aClass171_1.anInt5263 - 1) * 64;
								local512 = local477.anInt4002 - (local477.aClass171_1.anInt5263 - 1) * 64;
								if (local501 >= local450 && local477.aClass171_1.anInt5263 <= local394.aClass171_1.anInt5263 - (local501 - local450 >> 7) && local512 >= local278 && local394.aClass171_1.anInt5263 - (local512 - local278 >> 7) >= local477.aClass171_1.anInt5263) {
									Static266.method4189(local477.aClass171_1, local124, Static278.anIntArray595[local464], local46);
									local477.aBoolean281 = true;
								}
							}
						}
						for (local464 = 0; local464 < Static129.anInt2510; local464++) {
							local577 = Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local464]];
							if (local577 != null && !local577.aBoolean281 && local577.aBoolean282) {
								local501 = local577.anInt3974 - (local577.method3324() - 1) * 64;
								local512 = local577.anInt4002 - (local577.method3324() - 1) * 64;
								if (local501 >= local450 && local577.method3324() <= local394.aClass171_1.anInt5263 - (local501 - local450 >> 7) && local278 <= local512 && local577.method3324() <= local394.aClass171_1.anInt5263 - (local512 - local278 >> 7)) {
									Static218.method3525(local124, Static172.anIntArray317[local464], local577, local46);
									local577.aBoolean281 = true;
								}
							}
						}
					}
					if (local394.aBoolean281) {
						continue;
					}
					Static266.method4189(local394.aClass171_1, local124, local131, local46);
					local394.aBoolean281 = true;
				}
				if (local138 == 0) {
					@Pc(682) Class53_Sub1_Sub1 local682 = Static182.aClass53_Sub1_Sub1Array1[local131];
					if ((local682.anInt3974 & 0x7F) == 64 && (local682.anInt4002 & 0x7F) == 64) {
						local450 = local682.anInt3974 - (local682.method3324() - 1) * 64;
						local278 = local682.anInt4002 - (local682.method3324() - 1) * 64;
						for (local464 = 0; local464 < Static236.anInt4452; local464++) {
							local477 = Static110.aClass53_Sub1_Sub2Array1[Static278.anIntArray595[local464]];
							if (local477 != null && !local477.aBoolean281 && local477.aBoolean282) {
								local501 = local477.anInt3974 - (local477.aClass171_1.anInt5263 - 1) * 64;
								local512 = local477.anInt4002 - (local477.aClass171_1.anInt5263 - 1) * 64;
								if (local450 <= local501 && local477.aClass171_1.anInt5263 <= local682.method3324() - (local501 - local450 >> 7) && local278 <= local512 && local477.aClass171_1.anInt5263 <= local682.method3324() - (local512 - local278 >> 7)) {
									Static266.method4189(local477.aClass171_1, local124, Static278.anIntArray595[local464], local46);
									local477.aBoolean281 = true;
								}
							}
						}
						for (local464 = 0; local464 < Static129.anInt2510; local464++) {
							local577 = Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local464]];
							if (local577 != null && !local577.aBoolean281 && local577 != local682 && local577.aBoolean282) {
								local501 = local577.anInt3974 - (local577.method3324() - 1) * 64;
								local512 = local577.anInt4002 + 64 - local577.method3324() * 64;
								if (local501 >= local450 && local577.method3324() <= local682.method3324() - (local501 - local450 >> 7) && local278 <= local512 && local577.method3324() <= local682.method3324() - (local512 - local278 >> 7)) {
									Static218.method3525(local124, Static172.anIntArray317[local464], local577, local46);
									local577.aBoolean281 = true;
								}
							}
						}
					}
					if (local682.aBoolean281) {
						continue;
					}
					Static218.method3525(local124, local131, local682, local46);
					local682.aBoolean281 = true;
				}
				if (local138 == 3) {
					@Pc(952) Class114 local952 = Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local46][local124];
					if (local952 != null) {
						for (@Pc(960) Class4_Sub3_Sub21 local960 = (Class4_Sub3_Sub21) local952.method2626(); local960 != null; local960 = (Class4_Sub3_Sub21) local952.method2628()) {
							local278 = local960.aClass53_Sub2_1.anInt2168;
							@Pc(971) Class165 local971 = Static287.method4398(local278);
							if (Static69.anInt1334 == 1) {
								Static84.method1497((long) local278, local46, local124, Static313.aString372 + " -> <col=ff9040>" + local971.aString315, Static194.aString321, (short) 28, Static82.anInt1937);
							} else if (Static135.aBoolean177) {
								@Pc(986) Class4_Sub3_Sub12 local986 = Static218.anInt4225 == -1 ? null : Static114.method1816(Static218.anInt4225);
								if ((Static187.anInt3560 & 0x1) != 0 && (local986 == null || local971.method4170(Static218.anInt4225, local986.anInt2546) != local986.anInt2546)) {
									Static84.method1497((long) local278, local46, local124, Static69.aString81 + " -> <col=ff9040>" + local971.aString315, Static155.aString140, (short) 48, Static237.anInt4467);
								}
							} else {
								@Pc(1043) String[] local1043 = local971.aStringArray33;
								if (Static185.aBoolean254) {
									local1043 = Static278.method4337(local1043);
								}
								for (local501 = 4; local501 >= 0; local501--) {
									if (local1043 != null && local1043[local501] != null) {
										@Pc(1067) int local1067 = -1;
										if (local971.anInt5088 == local501) {
											local1067 = local971.anInt5073;
										}
										if (local971.anInt5047 == local501) {
											local1067 = local971.anInt5062;
										}
										@Pc(1096) byte local1096 = 0;
										if (local501 == 0) {
											local1096 = 45;
										}
										if (local501 == 1) {
											local1096 = 46;
										}
										if (local501 == 2) {
											local1096 = 38;
										}
										if (local501 == 3) {
											local1096 = 6;
										}
										if (local501 == 4) {
											local1096 = 44;
										}
										Static84.method1497((long) local278, local46, local124, "<col=ff9040>" + local971.aString315, local1043[local501], local1096, local1067);
									}
								}
								Static84.method1497((long) local278, local46, local124, "<col=ff9040>" + local971.aString315, Static13.aString22, (short) 1004, Static110.anInt2232);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!fh;Lclient!ai;Lclient!fh;)V")
	public static void method1521(@OriginalArg(1) Class58 arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class58 arg2) {
		Static36.aClass58_19 = arg2;
		Static165.aClass58_72 = arg0;
		Static214.anInterface1_1 = arg1;
		if (Static36.aClass58_19 != null) {
			Static48.anInt912 = Static36.aClass58_19.method1371(1);
		}
		if (Static165.aClass58_72 != null) {
			Static313.anInt6050 = Static165.aClass58_72.method1371(1);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!fe;")
	public static Class56_Sub1[] method1523(@OriginalArg(0) Class58 arg0, @OriginalArg(3) int arg1) {
		return Static12.method197(arg0, arg1, 0) ? Static186.method4395() : null;
	}
}
