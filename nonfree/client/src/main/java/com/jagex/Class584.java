package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xr")
public class Class584 {

	@OriginalMember(owner = "client!xr", name = "p", descriptor = "J")
	public long aLong293;

	@OriginalMember(owner = "client!xr", name = "a", descriptor = "[I")
	public int[] anIntArray512;

	@OriginalMember(owner = "client!xr", name = "g", descriptor = "[F")
	float[] aFloatArray115;

	@OriginalMember(owner = "client!xr", name = "l", descriptor = "[[I")
	int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!xr", name = "h", descriptor = "[[I")
	int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!xr", name = "x", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!xr", name = "s", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!xr", name = "<init>", descriptor = "(J[I[F[[I[[I[S[S)V", line = 12)
	public Class584(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) short[] arg6) {
		this.aLong293 = arg0 * 3125814776544842647L;
		this.anIntArray512 = arg1;
		this.aFloatArray115 = arg2;
		this.anIntArrayArray67 = arg3;
		this.anIntArrayArray68 = arg4;
		this.aShortArray131 = arg5;
		this.aShortArray132 = arg6;
	}

	@OriginalMember(owner = "client!xr", name = "p", descriptor = "(Lclient!zm;I)I", line = 16)
	static final int method33269(@OriginalArg(0) Class623 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt5573 * 1251812153) {
				case 1:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!xr", name = "<init>", descriptor = "(Lclient!xc;Z)V", line = 22)
	public Class584(@OriginalArg(0) Class571 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.anIntArray512 = new int[arg0.anIntArray504.length];
			this.aFloatArray115 = new float[arg0.anIntArray504.length];
			this.anIntArrayArray67 = new int[arg0.anIntArray504.length][3];
			this.anIntArrayArray68 = new int[arg0.anIntArray504.length][3];
			System.arraycopy(arg0.anIntArray504, 0, this.anIntArray512, 0, this.anIntArray512.length);
		} else {
			this.anIntArray512 = new int[arg0.anIntArray506.length];
			this.aFloatArray115 = new float[arg0.anIntArray506.length];
			this.anIntArrayArray67 = new int[arg0.anIntArray506.length][3];
			this.anIntArrayArray68 = new int[arg0.anIntArray506.length][3];
			System.arraycopy(arg0.anIntArray506, 0, this.anIntArray512, 0, this.anIntArray512.length);
		}
		if (arg0.aShortArray127 != null) {
			this.aShortArray131 = new short[arg0.aShortArray127.length];
			System.arraycopy(arg0.aShortArray127, 0, this.aShortArray131, 0, this.aShortArray131.length);
		}
		if (arg0.aShortArray125 != null) {
			this.aShortArray132 = new short[arg0.aShortArray125.length];
			System.arraycopy(arg0.aShortArray125, 0, this.aShortArray132, 0, this.aShortArray132.length);
		}
	}

	@OriginalMember(owner = "client!xr", name = "iz", descriptor = "(IIIIIIS)V", line = 5372)
	static final void method33270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class52.anInt1127 * 701602229;
		@Pc(5) int[] local5 = Class52.anIntArray167;
		client.anInt3180 = 0;
		@Pc(15) int local15;
		if (client.anInt3065 * -1773414811 == 2) {
			local15 = Class131.aClass163Array1.length;
		} else {
			local15 = local3 + client.anInt3163 * 1758488217;
		}
		@Pc(24) int local24;
		@Pc(292) int local292;
		@Pc(360) int local360;
		@Pc(301) int local301;
		@Pc(218) int local218;
		@Pc(530) int local530;
		@Pc(739) int local739;
		@Pc(548) int local548;
		@Pc(553) int local553;
		@Pc(959) int local959;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(29) Class571 local29 = null;
			@Pc(46) Class26_Sub1_Sub1_Sub1 local46;
			if (client.anInt3065 * -1773414811 == 2) {
				@Pc(38) Class163 local38 = Class131.aClass163Array1[local24];
				if (!local38.aBoolean623) {
					continue;
				}
				local46 = local38.method23278();
				if (client.anInt3100 * -630801869 != local46.anInt2356 * 410946737) {
					continue;
				}
				if (local38.anInt3447 * 1116282821 >= 0) {
					local29 = ((Class26_Sub1_Sub1_Sub1_Sub1) local46).aClass571_1;
					if (local29.anIntArray508 != null) {
						local29 = local29.method33044(Class424.aClass165_1, Class424.aClass165_1);
						if (local29 == null) {
							continue;
						}
					}
				}
			} else {
				if (local24 < local3) {
					local46 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local5[local24]];
				} else {
					local46 = (Class26_Sub1_Sub1_Sub1) ((Class3_Sub29) client.aClass581_21.method33217((long) client.anIntArray303[local24 - local3])).anObject2;
					local29 = ((Class26_Sub1_Sub1_Sub1_Sub1) local46).aClass571_1;
					if (local29.anIntArray508 != null) {
						local29 = local29.method33044(Class424.aClass165_1, Class424.aClass165_1);
						if (local29 == null) {
							continue;
						}
					}
				}
				if (local46.anInt2360 * -1682084097 < 0 || local46.anInt2356 * 410946737 != client.anInt3100 * -630801869 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != local46.aByte101) {
					continue;
				}
			}
			Class573.method33077(local46, local46.method21479(), false);
			if (!(client.aFloatArray96[0] < 0.0F)) {
				if (local46.method16653()) {
					@Pc(159) Class399 local159 = local46.method16654();
					if (local159 != null && client.anInt3180 * -392459069 < client.anInt3096 * 1542128793) {
						client.anIntArray312[client.anInt3180 * -392459069] = Class224.aClass611_8.method33592(local159.method27556()) / 2;
						client.anIntArray292[client.anInt3180 * -392459069] = (int) client.aFloatArray96[0];
						client.anIntArray309[client.anInt3180 * -392459069] = (int) client.aFloatArray96[1];
						client.aClass399Array1[client.anInt3180 * -392459069] = local159;
						client.anInt3180 += 1413121003;
					}
				}
				local218 = (int) ((float) arg1 + client.aFloatArray96[1]);
				local218 -= Class224.aClass611_8.anInt5537 * -1760037867;
				@Pc(227) boolean local227 = false;
				@Pc(275) Class6 local275;
				@Pc(438) int local438;
				if (!local46.aBoolean415 && !local46.aClass559_5.method32817()) {
					for (@Pc(241) Class53_Sub3 local241 = (Class53_Sub3) local46.aClass559_5.method32822(); local241 != null; local241 = (Class53_Sub3) local46.aClass559_5.method32837()) {
						@Pc(248) Class53_Sub2 local248 = local241.method10232(client.anInt3034);
						if (local248 != null) {
							@Pc(254) Class414 local254 = local241.aClass414_1;
							@Pc(260) Class26_Sub1_Sub1_Sub1_Sub2 local260 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local5[local24]];
							@Pc(270) Class6 local270;
							if (local260 != null && local260.aBoolean420) {
								local270 = local254.method27736(Class613.aClass21_13);
								local275 = local254.method27730(Class613.aClass21_13);
							} else {
								local270 = local254.method27732(Class613.aClass21_13);
								local275 = local254.method27731(Class613.aClass21_13);
							}
							if (local270 != null && local275 != null) {
								local292 = 255;
								local301 = client.anInt3034 - local248.anInt1134 * -690171467;
								@Pc(311) int local311 = local275.method16782() * 822836269 * local248.anInt1132 / 255;
								@Pc(337) int local337;
								@Pc(347) int local347;
								if (local248.anInt1135 * -371243049 > local301) {
									local337 = local254.anInt4833 * -217741145 == 0 ? 0 : local254.anInt4833 * -217741145 * (local301 / (local254.anInt4833 * -217741145));
									local347 = local275.method16782() * -1151494299 * local248.anInt1133 / 255;
									local360 = local347 + local337 * (local311 - local347) / (local248.anInt1135 * -371243049);
								} else {
									local360 = local311;
									local337 = local254.anInt4827 * 1015289249 + local248.anInt1135 * -371243049 - local301;
									if (local254.anInt4828 * -456815127 >= 0) {
										local292 = (local337 << 8) / (local254.anInt4827 * 1015289249 - local254.anInt4828 * -456815127);
									}
								}
								if (local248.anInt1132 * 822836269 > 0 && local360 < 2) {
									local360 = 2;
								}
								local337 = local270.method16787();
								local347 = (int) (client.aFloatArray96[0] + (float) arg0 - (float) (local270.method16782() >> 1));
								local218 -= local337;
								if (local292 >= 0 && local292 < 255) {
									@Pc(434) int local434 = local292 << 24;
									local438 = local434 | 0xFFFFFF;
									local270.method16794(local347, local218, 0, local438, 1);
									Class613.aClass21_13.method17209(local347, local218, local347 + local360, local337 + local218);
									local275.method16794(local347, local218, 0, local438, 1);
								} else {
									local270.method16783(local347, local218);
									Class613.aClass21_13.method17209(local347, local218, local347 + local360, local218 + local337);
									local275.method16783(local347, local218);
								}
								Class613.aClass21_13.method17079(arg0, arg1, arg0 + arg2, arg3 + arg1);
								local218 -= 2;
								local227 = true;
							}
						} else if (local241.method10237()) {
							local241.method20615();
						}
					}
				}
				if (!local227) {
					local218 -= Class630.aClass493_1.anInt5219 * 1239096745 + 2;
				}
				if (!local46.aBoolean415) {
					@Pc(560) long local560;
					@Pc(573) Class15[] local573;
					if (local29 == null) {
						@Pc(528) Class26_Sub1_Sub1_Sub1_Sub2 local528 = (Class26_Sub1_Sub1_Sub1_Sub2) local46;
						for (local530 = 0; local530 < local528.anIntArray243.length; local530++) {
							if (local528.anIntArray243[local530] >= 0) {
								local548 = local528.anIntArray243[local530];
								local553 = local528.anIntArray244[local530];
								local560 = local553 << 8 | local548;
								@Pc(565) Class6 local565 = (Class6) client.aClass161_15.method23219(local560);
								if (local565 == null) {
									local573 = Class137.method22942(Class294.aClass359_54, local553, 0);
									if (local573 == null) {
										continue;
									}
									local565 = Class613.aClass21_13.method17089(local573[local548], true);
									client.aClass161_15.method23222(local565, local560);
								}
								if (local565 != null) {
									local218 -= local565.method16787();
									local565.method16783((int) (client.aFloatArray96[0] + (float) arg0 - 12.0F), local218);
									local218 -= 2;
								}
							}
						}
					} else {
						@Pc(615) Class26_Sub1_Sub1_Sub1_Sub1 local615 = (Class26_Sub1_Sub1_Sub1_Sub1) local46;
						@Pc(626) int[] local626 = local615.aClass586_1 == null ? local615.aClass571_1.anIntArray507 : local615.aClass586_1.anIntArray513;
						@Pc(637) short[] local637 = local615.aClass586_1 == null ? local615.aClass571_1.aShortArray130 : local615.aClass586_1.aShortArray133;
						if (local637 != null && local626 != null) {
							for (local548 = 0; local548 < local637.length; local548++) {
								if (local637[local548] >= 0 && local626[local548] >= 0) {
									local560 = local626[local548] << 8 | local637[local548];
									local275 = (Class6) client.aClass161_15.method23219(local560);
									if (local275 == null) {
										local573 = Class137.method22942(Class294.aClass359_54, local626[local548], 0);
										if (local573 == null) {
											continue;
										}
										local275 = Class613.aClass21_13.method17089(local573[local637[local548]], true);
										client.aClass161_15.method23222(local275, local560);
									}
									if (local275 != null) {
										local218 -= local275.method16787();
										local275.method16783((int) ((float) arg0 + client.aFloatArray96[0] - (float) (local275.method16782() >> 1)), local218);
										local218 -= 2;
									}
								}
							}
						}
					}
				}
				@Pc(735) int local735;
				@Pc(737) Class68[] local737;
				@Pc(747) Class68 local747;
				if (!(local46 instanceof Class26_Sub1_Sub1_Sub1_Sub2)) {
					local735 = 0;
					local737 = client.aClass68Array1;
					for (local739 = 0; local739 < local737.length; local739++) {
						local747 = local737[local739];
						if (local747 != null && local747.anInt2017 * 207391421 == 1 && client.anIntArray303[local24 - local3] == local747.anInt2012 * 403468169) {
							local275 = Class331.aClass6Array12[local747.anInt2010 * 310804535];
							if (local275.method16787() > local735) {
								local735 = local275.method16787();
							}
							@Pc(858) boolean local858;
							if (local747.anInt2018 * 1294654897 == 0) {
								local858 = true;
							} else {
								local292 = Class498.method29361() * 1000 / (local747.anInt2018 * 1294654897) / 2;
								local858 = client.anInt3034 % (local292 * 2) < local292;
							}
							if (local858) {
								local275.method16783((int) (client.aFloatArray96[0] + (float) arg0 - 12.0F), local218 - local275.method16787());
							}
						}
					}
					if (local735 > 0) {
					}
				} else if (local24 >= 0) {
					local735 = 0;
					local737 = client.aClass68Array1;
					for (local739 = 0; local739 < local737.length; local739++) {
						local747 = local737[local739];
						if (local747 != null && local747.anInt2017 * 207391421 == 10 && local5[local24] == local747.anInt2012 * 403468169) {
							local275 = Class331.aClass6Array12[local747.anInt2010 * 310804535];
							if (local275.method16787() > local735) {
								local735 = local275.method16787();
							}
							local275.method16783((int) (client.aFloatArray96[0] + (float) arg0 - 12.0F), local218 - local275.method16787());
						}
					}
					if (local735 > 0) {
					}
				}
				for (local735 = 0; local735 < Class630.aClass493_1.anInt5218 * -1025928261; local735++) {
					local530 = local46.anIntArray233[local735];
					local739 = local46.anIntArray235[local735];
					@Pc(929) Class443 local929 = null;
					local553 = 0;
					if (local739 >= 0) {
						if (local530 <= client.anInt3034) {
							continue;
						}
						local929 = Class284.aClass465_1.method28628(local46.anIntArray235[local735]);
						local553 = local929.anInt4947 * -1881156037;
					} else if (local530 < 0) {
						continue;
					}
					local959 = local46.anIntArray237[local735];
					@Pc(961) Class443 local961 = null;
					if (local959 >= 0) {
						local961 = Class284.aClass465_1.method28628(local959);
					}
					if (local530 - local553 <= client.anInt3034) {
						if (local929 == null) {
							local46.anIntArray233[local735] = -1;
						} else {
							local360 = local46.method21479() / 2;
							Class573.method33077(local46, local360, false);
							if (client.aFloatArray96[0] > -1.0F) {
								client.aFloatArray96[0] += Class630.aClass493_1.anIntArray479[local735];
								client.aFloatArray96[1] += Class630.aClass493_1.anIntArray480[local735];
								local438 = 0;
								@Pc(1034) int local1034 = 0;
								@Pc(1036) int local1036 = 0;
								@Pc(1038) int local1038 = 0;
								@Pc(1040) int local1040 = 0;
								@Pc(1042) int local1042 = 0;
								@Pc(1044) int local1044 = 0;
								@Pc(1046) int local1046 = 0;
								@Pc(1048) Class6 local1048 = null;
								@Pc(1050) Class6 local1050 = null;
								@Pc(1052) Class6 local1052 = null;
								@Pc(1054) Class6 local1054 = null;
								@Pc(1056) int local1056 = 0;
								@Pc(1058) int local1058 = 0;
								@Pc(1060) int local1060 = 0;
								@Pc(1062) int local1062 = 0;
								@Pc(1064) int local1064 = 0;
								@Pc(1066) int local1066 = 0;
								@Pc(1068) int local1068 = 0;
								@Pc(1070) int local1070 = 0;
								@Pc(1075) Class6 local1075 = local929.method28258(Class613.aClass21_13);
								if (local1075 != null) {
									local438 = local1075.method16782();
									local1075.method16776(client.anIntArray320);
									local1040 = client.anIntArray320[0];
								}
								@Pc(1093) Class6 local1093 = local929.method28259(Class613.aClass21_13);
								if (local1093 != null) {
									local1034 = local1093.method16782();
									local1093.method16776(client.anIntArray320);
									local1042 = client.anIntArray320[0];
								}
								@Pc(1111) Class6 local1111 = local929.method28260(Class613.aClass21_13);
								if (local1111 != null) {
									local1036 = local1111.method16782();
									local1111.method16776(client.anIntArray320);
									local1044 = client.anIntArray320[0];
								}
								@Pc(1129) Class6 local1129 = local929.method28261(Class613.aClass21_13);
								if (local1129 != null) {
									local1038 = local1129.method16782();
									local1129.method16776(client.anIntArray320);
									local1046 = client.anIntArray320[0];
								}
								if (local961 != null) {
									local1048 = local961.method28258(Class613.aClass21_13);
									if (local1048 != null) {
										local1056 = local1048.method16782();
										local1048.method16776(client.anIntArray320);
										local1064 = client.anIntArray320[0];
									}
									local1050 = local961.method28259(Class613.aClass21_13);
									if (local1050 != null) {
										local1058 = local1050.method16782();
										local1050.method16776(client.anIntArray320);
										local1066 = client.anIntArray320[0];
									}
									local1052 = local961.method28260(Class613.aClass21_13);
									if (local1052 != null) {
										local1060 = local1052.method16782();
										local1052.method16776(client.anIntArray320);
										local1068 = client.anIntArray320[0];
									}
									local1054 = local961.method28261(Class613.aClass21_13);
									if (local1054 != null) {
										local1062 = local1054.method16782();
										local1054.method16776(client.anIntArray320);
										local1070 = client.anIntArray320[0];
									}
								}
								@Pc(1216) Class14 local1216 = Class418.aClass14_11;
								@Pc(1218) Class14 local1218 = Class418.aClass14_11;
								@Pc(1220) Class611 local1220 = Class568.aClass611_12;
								@Pc(1222) Class611 local1222 = Class568.aClass611_12;
								@Pc(1227) int local1227 = local929.anInt4945 * 2120352641;
								@Pc(1239) Class14 local1239;
								@Pc(1245) Class611 local1245;
								if (local1227 >= 0) {
									local1239 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, local1227, true, local929.aBoolean767);
									local1245 = Class379.aClass312_1.method25786(client.anInterface34_1, local1227);
									if (local1239 != null && local1245 != null) {
										local1216 = local1239;
										local1220 = local1245;
									}
								}
								if (local961 != null) {
									local1227 = local961.anInt4945 * 2120352641;
									if (local1227 >= 0) {
										local1239 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, local1227, true, local961.aBoolean767);
										local1245 = Class379.aClass312_1.method25786(client.anInterface34_1, local1227);
										if (local1239 != null && local1245 != null) {
											local1218 = local1239;
											local1222 = local1245;
										}
									}
								}
								@Pc(1293) String local1293 = null;
								@Pc(1297) int local1297 = 0;
								@Pc(1305) String local1305 = local929.method28257(local46.anIntArray236[local735]);
								@Pc(1310) int local1310 = local1220.method33592(local1305);
								if (local961 != null) {
									local1293 = local961.method28257(local46.anIntArray238[local735]);
									local1297 = local1222.method33592(local1293);
								}
								@Pc(1327) int local1327 = 0;
								@Pc(1329) int local1329 = 0;
								if (local1034 > 0) {
									local1327 = local1310 / local1034 + 1;
								}
								if (local961 != null && local1058 > 0) {
									local1329 = local1297 / local1058 + 1;
								}
								@Pc(1350) int local1350 = 0;
								@Pc(1352) int local1352 = local1350;
								if (local438 > 0) {
									local1350 += local438;
								}
								local1350 += 2;
								@Pc(1361) int local1361 = local1350;
								if (local1036 > 0) {
									local1350 += local1036;
								}
								@Pc(1369) int local1369 = local1350;
								@Pc(1371) int local1371 = local1350;
								@Pc(1377) int local1377;
								if (local1034 > 0) {
									local1377 = local1327 * local1034;
									local1350 += local1377;
									local1371 += (local1377 - local1310) / 2;
								} else {
									local1350 += local1310;
								}
								local1377 = local1350;
								if (local1038 > 0) {
									local1350 += local1038;
								}
								@Pc(1404) int local1404 = 0;
								@Pc(1406) int local1406 = 0;
								@Pc(1408) int local1408 = 0;
								@Pc(1410) int local1410 = 0;
								@Pc(1412) int local1412 = 0;
								@Pc(1443) int local1443;
								if (local961 != null) {
									local1350 += 2;
									local1404 = local1350;
									if (local1056 > 0) {
										local1350 += local1056;
									}
									local1350 += 2;
									local1406 = local1350;
									if (local1060 > 0) {
										local1350 += local1060;
									}
									local1408 = local1350;
									local1412 = local1350;
									if (local1058 > 0) {
										local1443 = local1058 * local1329;
										local1350 += local1443;
										local1412 += (local1443 - local1297) / 2;
									} else {
										local1350 += local1297;
									}
									local1410 = local1350;
									if (local1062 > 0) {
										local1350 += local1062;
									}
								}
								local1443 = local46.anIntArray233[local735] - client.anInt3034;
								@Pc(1492) int local1492 = local929.anInt4952 * 244967255 - local1443 * 244967255 * local929.anInt4952 / (local929.anInt4947 * -1881156037);
								@Pc(1510) int local1510 = -(local929.anInt4953 * -637208317) + local929.anInt4953 * -637208317 * local1443 / (local929.anInt4947 * -1881156037);
								@Pc(1526) int local1526 = (int) ((float) local1492 + ((float) arg0 + client.aFloatArray96[0] - (float) (local1350 >> 1)));
								@Pc(1539) int local1539 = (int) ((float) local1510 + (client.aFloatArray96[1] + (float) arg1 - 12.0F));
								@Pc(1548) int local1548 = local1539 + 15 + local929.anInt4956 * 1033143651;
								@Pc(1550) int local1550 = 0;
								if (local961 != null) {
									local1550 = local961.anInt4956 * 1033143651 + local1539 + 15;
								}
								@Pc(1564) int local1564 = 255;
								if (local929.anInt4943 * 1039315463 >= 0) {
									local1564 = (local1443 << 8) / (local929.anInt4947 * -1881156037 - local929.anInt4943 * 1039315463);
								}
								@Pc(1592) int local1592;
								if (local1564 >= 0 && local1564 < 255) {
									local1592 = local1564 << 24;
									@Pc(1596) int local1596 = local1592 | 0xFFFFFF;
									if (local1075 != null) {
										local1075.method16794(local1526 + local1352 - local1040, local1539, 0, local1596, 1);
									}
									if (local1111 != null) {
										local1111.method16794(local1361 + local1526 - local1044, local1539, 0, local1596, 1);
									}
									@Pc(1627) int local1627;
									if (local1093 != null) {
										for (local1627 = 0; local1627 < local1327; local1627++) {
											local1093.method16794(local1526 + local1369 - local1042 + local1627 * local1034, local1539, 0, local1596, 1);
										}
									}
									if (local1129 != null) {
										local1129.method16794(local1526 + local1377 - local1046, local1539, 0, local1596, 1);
									}
									local1216.method3329(local1305, local1526 + local1371, local1548, local929.anInt4942 * -551369411 | local1592, 0);
									if (local961 != null) {
										if (local1048 != null) {
											local1048.method16794(local1404 + local1526 - local1064, local1539, 0, local1596, 1);
										}
										if (local1052 != null) {
											local1052.method16794(local1526 + local1406 - local1068, local1539, 0, local1596, 1);
										}
										if (local1050 != null) {
											for (local1627 = 0; local1627 < local1329; local1627++) {
												local1050.method16794(local1526 + local1408 - local1066 + local1058 * local1627, local1539, 0, local1596, 1);
											}
										}
										if (local1054 != null) {
											local1054.method16794(local1410 + local1526 - local1070, local1539, 0, local1596, 1);
										}
										local1218.method3329(local1293, local1526 + local1412, local1550, local961.anInt4942 * -551369411 | local1592, 0);
									}
								} else {
									if (local1075 != null) {
										local1075.method16783(local1352 + local1526 - local1040, local1539);
									}
									if (local1111 != null) {
										local1111.method16783(local1361 + local1526 - local1044, local1539);
									}
									if (local1093 != null) {
										for (local1592 = 0; local1592 < local1327; local1592++) {
											local1093.method16783(local1369 + local1526 - local1042 + local1034 * local1592, local1539);
										}
									}
									if (local1129 != null) {
										local1129.method16783(local1377 + local1526 - local1046, local1539);
									}
									local1216.method3329(local1305, local1371 + local1526, local1548, local929.anInt4942 * -551369411 | 0xFF000000, 0);
									if (local961 != null) {
										if (local1048 != null) {
											local1048.method16783(local1404 + local1526 - local1064, local1539);
										}
										if (local1052 != null) {
											local1052.method16783(local1526 + local1406 - local1068, local1539);
										}
										if (local1050 != null) {
											for (local1592 = 0; local1592 < local1329; local1592++) {
												local1050.method16783(local1408 + local1526 - local1066 + local1592 * local1058, local1539);
											}
										}
										if (local1054 != null) {
											local1054.method16783(local1410 + local1526 - local1070, local1539);
										}
										local1218.method3329(local1293, local1412 + local1526, local1550, local961.anInt4942 * -551369411 | 0xFF000000, 0);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(1908) int local1908;
		for (local24 = 0; local24 < client.anInt3179 * -1481097821; local24++) {
			local1908 = client.anIntArray301[local24];
			@Pc(1915) Class26_Sub1_Sub1_Sub1 local1915;
			if (local1908 < 2048) {
				local1915 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local1908];
			} else {
				local1915 = (Class26_Sub1_Sub1_Sub1) ((Class3_Sub29) client.aClass581_21.method33217((long) (local1908 - 2048))).anObject2;
			}
			local218 = client.anIntArray300[local24];
			@Pc(1937) Class26_Sub1_Sub1_Sub1 local1937;
			if (local218 < 2048) {
				local1937 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local218];
			} else {
				local1937 = (Class26_Sub1_Sub1_Sub1) ((Class3_Sub29) client.aClass581_21.method33217((long) (local218 - 2048))).anObject2;
			}
			Class110.method22014(local1915, local1937, (local1915.anInt2359 -= -28678059) * -1001433859, arg0, arg1, arg2, arg3, arg4, arg5);
		}
		local24 = Class224.aClass611_8.anInt5537 * -1760037867 + 2 + Class224.aClass611_8.anInt5536 * -1990992757;
		for (local1908 = 0; local1908 < client.anInt3180 * -392459069; local1908++) {
			@Pc(1992) int local1992 = client.anIntArray292[local1908];
			local218 = client.anIntArray309[local1908];
			@Pc(2000) int local2000 = client.anIntArray312[local1908];
			@Pc(2002) boolean local2002 = true;
			while (local2002) {
				local2002 = false;
				for (local530 = 0; local530 < local1908; local530++) {
					if (local218 + 2 > client.anIntArray309[local530] - local24 && local218 - local24 < client.anIntArray309[local530] + 2 && local1992 - local2000 < client.anIntArray312[local530] + client.anIntArray292[local530] && local2000 + local1992 > client.anIntArray292[local530] - client.anIntArray312[local530] && client.anIntArray309[local530] - local24 < local218) {
						local218 = client.anIntArray309[local530] - local24;
						local2002 = true;
					}
				}
			}
			client.anIntArray309[local1908] = local218;
			@Pc(2079) String local2079 = client.aClass399Array1[local1908].method27556();
			if (client.anInt3196 * 115410271 == 0) {
				local739 = 16776960;
				local548 = client.aClass399Array1[local1908].method27554();
				if (local548 < 6) {
					local739 = client.anIntArray316[local548];
				}
				if (local548 == 6) {
					local739 = client.anInt3100 * -630801869 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local548 == 7) {
					local739 = client.anInt3100 * -630801869 % 20 < 10 ? 255 : 65535;
				}
				if (local548 == 8) {
					local739 = client.anInt3100 * -630801869 % 20 < 10 ? 45056 : 8454016;
				}
				if (local548 == 9) {
					local553 = 150 - client.aClass399Array1[local1908].method27565() * 150 / client.aClass399Array1[local1908].method27558();
					if (local553 < 50) {
						local739 = local553 * 1280 + 16711680;
					} else if (local553 < 100) {
						local739 = 16776960 - (local553 - 50) * 327680;
					} else if (local553 < 150) {
						local739 = (local553 - 100) * 5 + 65280;
					}
				}
				if (local548 == 10) {
					local553 = 150 - client.aClass399Array1[local1908].method27565() * 150 / client.aClass399Array1[local1908].method27558();
					if (local553 < 50) {
						local739 = local553 * 5 + 16711680;
					} else if (local553 < 100) {
						local739 = 16711935 - (local553 - 50) * 327680;
					} else if (local553 < 150) {
						local739 = (local553 - 100) * 327680 + 255 - (local553 - 100) * 5;
					}
				}
				if (local548 == 11) {
					local553 = 150 - client.aClass399Array1[local1908].method27565() * 150 / client.aClass399Array1[local1908].method27558();
					if (local553 < 50) {
						local739 = 16777215 - local553 * 327685;
					} else if (local553 < 100) {
						local739 = (local553 - 50) * 327685 + 65280;
					} else if (local553 < 150) {
						local739 = 16777215 - (local553 - 100) * 327680;
					}
				}
				local553 = local739 | 0xFF000000;
				local959 = client.aClass399Array1[local1908].method27557();
				if (local959 == 0) {
					Class568.aClass14_13.method3282(local2079, local1992 + arg0, arg1 + local218, local553, -16777216);
				}
				if (local959 == 1) {
					Class568.aClass14_13.method3301(local2079, local1992 + arg0, local218 + arg1, local553, -16777216, -630801869 * client.anInt3100);
				}
				if (local959 == 2) {
					Class568.aClass14_13.method3286(local2079, arg0 + local1992, arg1 + local218, local553, -16777216, client.anInt3100 * -630801869);
				}
				if (local959 == 3) {
					local292 = 150 - client.aClass399Array1[local1908].method27565() * 150 / client.aClass399Array1[local1908].method27558();
					Class568.aClass14_13.method3279(local2079, local1992 + arg0, local218 + arg1, local553, -16777216, client.anInt3100 * -630801869, local292);
				}
				if (local959 == 4) {
					local292 = 150 - client.aClass399Array1[local1908].method27565() * 150 / client.aClass399Array1[local1908].method27558();
					local360 = local292 * (Class224.aClass611_8.method33592(local2079) + 100) / 150;
					Class613.aClass21_13.method17209(local1992 + arg0 - 50, arg1, arg0 + 50 + local1992, arg3 + arg1);
					Class568.aClass14_13.method3329(local2079, arg0 + local1992 + 50 - local360, arg1 + local218, local553, -16777216);
					Class613.aClass21_13.method17079(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
				if (local959 == 5) {
					local292 = 150 - client.aClass399Array1[local1908].method27565() * 150 / client.aClass399Array1[local1908].method27558();
					local360 = 0;
					if (local292 < 25) {
						local360 = local292 - 25;
					} else if (local292 > 125) {
						local360 = local292 - 125;
					}
					local301 = Class224.aClass611_8.anInt5536 * -1990992757 + Class224.aClass611_8.anInt5537 * -1760037867;
					Class613.aClass21_13.method17209(arg0, arg1 + local218 - local301 - 1, arg2 + arg0, local218 + arg1 + 5);
					Class568.aClass14_13.method3282(local2079, local1992 + arg0, arg1 + local218 + local360, local553, -16777216);
					Class613.aClass21_13.method17079(arg0, arg1, arg0 + arg2, arg3 + arg1);
				}
			} else {
				Class568.aClass14_13.method3282(local2079, local1992 + arg0, local218 + arg1, -256, -16777216);
			}
		}
	}
}
