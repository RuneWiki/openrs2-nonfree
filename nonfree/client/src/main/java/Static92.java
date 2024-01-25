import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "Lclient!la;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
	public static int anInt1932;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "Lclient!ph;")
	public static Class187 aClass187_38;

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Lclient!s;")
	public static final Class217 aClass217_44 = new Class217(12, 3);

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_38 = new Class27(39, -1);

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "Lclient!gi;")
	public static final Class90 aClass90_1 = new Class90();

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public static int anInt1933 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)I")
	public static int method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class250.anIntArray674[arg0 * 8192 / arg3] >> 1;
		return (arg2 * (65536 - local21) >> 16) + (local21 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ms;I)V")
	public static void method1710(@OriginalArg(0) Class24_Sub3_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt6261 == Static400.anInt6752 || arg0.anInt6211 == -1 || arg0.anInt6250 != 0) {
			local5 = true;
		} else {
			@Pc(31) Class137 local31 = Static281.aClass98_3.method2405(arg0.anInt6211);
			if (local31.aBoolean272 || arg0.anInt6222 + 1 > local31.anIntArray404[arg0.anInt6231]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(59) int local59 = arg0.anInt6261 - arg0.anInt6285;
			@Pc(64) int local64 = Static400.anInt6752 - arg0.anInt6285;
			@Pc(76) int local76 = arg0.anInt6283 * 128 + arg0.method4919() * 64;
			@Pc(88) int local88 = arg0.anInt6246 * 128 + arg0.method4919() * 64;
			@Pc(101) int local101 = arg0.anInt6258 * 128 + arg0.method4919() * 64;
			@Pc(114) int local114 = arg0.anInt6254 * 128 + arg0.method4919() * 64;
			arg0.anInt7092 = (local64 * local101 + (local59 - local64) * local76) / local59;
			arg0.anInt7094 = (local64 * local114 + (local59 - local64) * local88) / local59;
		}
		arg0.anInt6290 = 0;
		if (arg0.anInt6255 == 0) {
			arg0.method4907(false, 8192);
		}
		if (arg0.anInt6255 == 1) {
			arg0.method4907(false, 12288);
		}
		if (arg0.anInt6255 == 2) {
			arg0.method4907(false, 0);
		}
		if (arg0.anInt6255 == 3) {
			arg0.method4907(false, 4096);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII)V")
	public static void method1712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static270.anInt4754;
		@Pc(9) int[] local9 = Static53.anIntArray79;
		Static406.anInt6841 = 0;
		@Pc(172) int local172;
		@Pc(205) int local205;
		@Pc(251) int local251;
		@Pc(328) int local328;
		@Pc(416) int local416;
		@Pc(850) int local850;
		@Pc(550) int local550;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static219.anInt4155; local13++) {
			@Pc(17) Class222 local17 = null;
			@Pc(33) Class24_Sub3_Sub2 local33;
			if (local7 <= local13) {
				local33 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local13 - local7])).aClass24_Sub3_Sub2_Sub1_2;
				local17 = ((Class24_Sub3_Sub2_Sub1) local33).aClass222_1;
				if (local17.anIntArray613 != null) {
					local17 = local17.method4938(Static329.aClass201_9);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local9[local13]];
			}
			if (local33.anInt6263 >= 0 && (Static186.anInt3747 == local33.anInt6217 || local33.aByte98 == Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98)) {
				Static16.method243(local33, arg0 >> 1, local33.method4905(), arg2 >> 1);
				if (Static394.anIntArray650[0] >= 0) {
					if (local33.aString56 != null && (local7 <= local13 || Static35.anInt576 == 0 || Static35.anInt576 == 3 || Static35.anInt576 == 1 && Static120.method2091(((Class24_Sub3_Sub2_Sub2) local33).aString58)) && Static406.anInt6841 < Static364.anInt6198) {
						Static364.anIntArray602[Static406.anInt6841] = Static450.aClass79_10.method1977(local33.aString56) / 2;
						Static364.anIntArray601[Static406.anInt6841] = Static394.anIntArray650[0];
						Static364.anIntArray603[Static406.anInt6841] = Static394.anIntArray650[1];
						Static364.anIntArray605[Static406.anInt6841] = local33.anInt6247;
						Static364.anIntArray604[Static406.anInt6841] = local33.anInt6220;
						Static364.anIntArray606[Static406.anInt6841] = local33.anInt6209;
						Static364.aStringArray42[Static406.anInt6841] = local33.aString56;
						Static406.anInt6841++;
					}
					local172 = arg3 + Static394.anIntArray650[1];
					@Pc(236) Class80[] local236;
					@Pc(243) Class66[] local243;
					@Pc(301) Class80 local301;
					if (local33.aBoolean404 || Static400.anInt6752 >= local33.anInt6253) {
						local172 -= Math.max(Static450.aClass79_10.anInt2290, Static232.aClass80Array13[0].ZA());
					} else {
						@Pc(187) byte local187 = 1;
						if (local7 > local13) {
							@Pc(200) Class24_Sub3_Sub2_Sub2 local200 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local9[local13]];
							local205 = local33.method4923().anInt40;
							if (local200.aBoolean408) {
								local187 = 2;
							}
						} else {
							local205 = local17.anInt6345;
							if (local205 == -1) {
								local205 = local33.method4923().anInt40;
							}
						}
						@Pc(225) Class80[] local225 = Static232.aClass80Array13;
						if (local205 != -1) {
							local236 = (Class80[]) Static209.aClass267_36.method6014((long) local205);
							if (local236 == null) {
								local243 = Static463.method1664(Static21.aClass187_8, local205);
								if (local243 != null) {
									local236 = new Class80[local243.length];
									for (local251 = 0; local251 < local243.length; local251++) {
										local236[local251] = Static412.aClass50_8.method5861(local243[local251]);
									}
									Static209.aClass267_36.method6008(local236, (long) local205);
								}
							}
							if (local236 != null && local236.length >= 2) {
								local225 = local236;
							}
						}
						if (local225.length <= local187) {
							local187 = 1;
						}
						@Pc(297) Class80 local297 = local225[0];
						local301 = local225[local187];
						local172 -= Math.max(Static450.aClass79_10.anInt2290, local297.ZA());
						local251 = Static394.anIntArray650[0] + arg1 - (local297.YA() >> 1);
						local328 = local297.YA() * local33.anInt6215 / 255;
						if (local33.anInt6215 > 0 && local328 < 2) {
							local328 = 2;
						}
						local297.method5558(local251, local172);
						Static412.aClass50_8.HA(local251, local172, local328 + local251, local297.ZA() + local172);
						local301.method5558(local251, local172);
						Static412.aClass50_8.ba(arg1, arg3, arg1 + arg2, arg0 + arg3);
					}
					local172 -= 2;
					if (!local33.aBoolean404) {
						@Pc(399) Class80 local399;
						if (local33.anInt6252 > Static400.anInt6752) {
							local399 = Static203.aClass80Array9[local33.lb ? 2 : 0];
							@Pc(408) Class80 local408 = Static203.aClass80Array9[local33.lb ? 3 : 1];
							if (local33 instanceof Class24_Sub3_Sub2_Sub1) {
								local416 = local17.anInt6352;
								if (local416 == -1) {
									local416 = local33.method4923().anInt37;
								}
							} else {
								local416 = local33.method4923().anInt37;
							}
							if (local416 != -1) {
								local236 = (Class80[]) Static152.aClass267_27.method6014((long) local416);
								if (local236 == null) {
									local243 = Static463.method1664(Static21.aClass187_8, local416);
									if (local243 != null) {
										local236 = new Class80[local243.length];
										for (local251 = 0; local251 < local243.length; local251++) {
											local236[local251] = Static412.aClass50_8.method5861(local243[local251]);
										}
										Static152.aClass267_27.method6008(local236, (long) local416);
									}
								}
								if (local236 != null && local236.length == 4) {
									local408 = local236[local33.lb ? 3 : 1];
									local399 = local236[local33.lb ? 2 : 0];
								}
							}
							@Pc(509) int local509 = local33.anInt6252 - Static400.anInt6752;
							if (local509 > local33.anInt6236) {
								local509 -= local33.anInt6236;
								local251 = local33.anInt6267 == 0 ? 0 : local33.anInt6267 * ((local33.anInt6239 - local509) / local33.anInt6267);
								local550 = local399.YA() * local251 / local33.anInt6239;
							} else {
								local550 = local399.YA();
							}
							local251 = local399.ZA();
							local172 -= local251;
							local328 = Static394.anIntArray650[0] + arg1 - (local399.YA() >> 1);
							local399.method5558(local328, local172);
							Static412.aClass50_8.HA(local328, local172, local550 + local328, local172 - -local251);
							local408.method5558(local328, local172);
							local172 -= 2;
							Static412.aClass50_8.ba(arg1, arg3, arg2 + arg1, arg0 + arg3);
						}
						if (local13 < local7) {
							@Pc(609) Class24_Sub3_Sub2_Sub2 local609 = (Class24_Sub3_Sub2_Sub2) local33;
							if (local609.anInt6324 != -1) {
								local172 -= 25;
								Static83.aClass80Array6[local609.anInt6324].method5558(arg1 + Static394.anIntArray650[0] - 12, local172);
								local172 -= 2;
							}
							if (local609.anInt6311 != -1) {
								local172 -= 25;
								Static153.aClass80Array7[local609.anInt6311].method5558(arg1 + Static394.anIntArray650[0] - 12, local172);
								local172 -= 2;
							}
						} else if (local17.anInt6361 >= 0 && Static153.aClass80Array7.length > local17.anInt6361) {
							local399 = Static153.aClass80Array7[local17.anInt6361];
							local172 -= 25;
							local399.method5558(Static394.anIntArray650[0] + arg1 - (local399.YA() >> 1), local172);
							local172 -= 2;
						}
					}
					@Pc(692) Class65[] local692;
					@Pc(700) Class65 local700;
					if (!(local33 instanceof Class24_Sub3_Sub2_Sub2)) {
						local205 = 0;
						local692 = Static362.aClass65Array1;
						for (local416 = 0; local416 < local692.length; local416++) {
							local700 = local692[local416];
							if (local700 != null && local700.anInt1850 == 1 && Static57.anIntArray91[local13 - local7] == local700.anInt1856) {
								local301 = Static320.aClass80Array18[local700.anInt1854];
								if (local205 < local301.ZA()) {
									local205 = local301.ZA();
								}
								if (Static400.anInt6752 % 20 < 10) {
									local301.method5558(Static394.anIntArray650[0] + arg1 - 12, local172 + -local301.ZA());
								}
							}
						}
						if (local205 > 0) {
						}
					} else if (local13 >= 0) {
						local205 = 0;
						local692 = Static362.aClass65Array1;
						for (local416 = 0; local416 < local692.length; local416++) {
							local700 = local692[local416];
							if (local700 != null && local700.anInt1850 == 10 && local9[local13] == local700.anInt1856) {
								local301 = Static320.aClass80Array18[local700.anInt1854];
								if (local301.ZA() > local205) {
									local205 = local301.ZA();
								}
								local301.method5558(arg1 + Static394.anIntArray650[0] - 12, local172 + -local301.ZA());
							}
						}
						if (local205 > 0) {
						}
					}
					for (local205 = 0; local205 < 4; local205++) {
						if (Static400.anInt6752 < local33.anIntArray607[local205]) {
							local850 = local33.method4905() / 2;
							Static16.method243(local33, arg0 >> 1, local850, arg2 >> 1);
							if (Static394.anIntArray650[0] > -1) {
								local416 = Static219.aClass80Array10[local33.anIntArray609[local205]].YA();
								if (local205 == 1) {
									Static394.anIntArray650[1] -= 20;
								}
								if (local205 == 2) {
									Static394.anIntArray650[0] -= local416 - 9;
									Static394.anIntArray650[1] -= 10;
								}
								if (local205 == 3) {
									Static394.anIntArray650[1] -= 10;
									Static394.anIntArray650[0] += local416 - 9;
								}
								Static219.aClass80Array10[local33.anIntArray609[local205]].method5558(arg1 + Static394.anIntArray650[0] - (local416 >> 1), arg3 - -Static394.anIntArray650[1] - 12);
								Static383.aClass57_5.method5953(arg1 + Static394.anIntArray650[0] - 1, Integer.toString(local33.anIntArray608[local205]), -1, arg3 + Static394.anIntArray650[1] + 3, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1001) int local1001;
		for (@Pc(995) int local995 = 0; local995 < Static192.anInt3853; local995++) {
			local1001 = Static187.anIntArray377[local995];
			@Pc(1010) Class24_Sub3_Sub2 local1010;
			if (local1001 < 2048) {
				local1010 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local1001];
			} else {
				local1010 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) (local1001 - 2048))).aClass24_Sub3_Sub2_Sub1_2;
			}
			local205 = Static150.anIntArray296[local995];
			@Pc(1041) Class24_Sub3_Sub2 local1041;
			if (local205 >= 2048) {
				local1041 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) (local205 - 2048))).aClass24_Sub3_Sub2_Sub1_2;
			} else {
				local1041 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local205];
			}
			Static347.method4712(arg2, local1010, arg0, arg1, --local1010.anInt6266, arg3, local1041);
		}
		local1001 = Static450.aClass79_10.anInt2290 + Static450.aClass79_10.anInt2284 + 2;
		for (local172 = 0; local172 < Static406.anInt6841; local172++) {
			local205 = Static364.anIntArray601[local172];
			local850 = Static364.anIntArray603[local172];
			local416 = Static364.anIntArray602[local172];
			@Pc(1095) boolean local1095 = true;
			while (local1095) {
				local1095 = false;
				for (local550 = 0; local550 < local172; local550++) {
					if (local850 + 2 > Static364.anIntArray603[local550] + -local1001 && local850 - local1001 < Static364.anIntArray603[local550] + 2 && local205 - local416 < Static364.anIntArray602[local550] + Static364.anIntArray601[local550] && Static364.anIntArray601[local550] - Static364.anIntArray602[local550] < local416 + local205 && Static364.anIntArray603[local550] - local1001 < local850) {
						local850 = Static364.anIntArray603[local550] - local1001;
						local1095 = true;
					}
				}
			}
			Static364.anIntArray603[local172] = local850;
			@Pc(1185) String local1185 = Static364.aStringArray42[local172];
			if (Static326.anInt5606 == 0) {
				local251 = 16776960;
				if (Static364.anIntArray605[local172] < 6) {
					local251 = Static157.anIntArray301[Static364.anIntArray605[local172]];
				}
				if (Static364.anIntArray605[local172] == 6) {
					local251 = Static186.anInt3747 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static364.anIntArray605[local172] == 7) {
					local251 = Static186.anInt3747 % 20 < 10 ? 255 : 65535;
				}
				if (Static364.anIntArray605[local172] == 8) {
					local251 = Static186.anInt3747 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static364.anIntArray605[local172] == 9) {
					local328 = 150 - Static364.anIntArray606[local172];
					if (local328 < 50) {
						local251 = local328 * 1280 + 16711680;
					} else if (local328 < 100) {
						local251 = 16776960 - (local328 - 50) * 327680;
					} else if (local328 < 150) {
						local251 = local328 * 5 + 65280 - 500;
					}
				}
				if (Static364.anIntArray605[local172] == 10) {
					local328 = 150 - Static364.anIntArray606[local172];
					if (local328 < 50) {
						local251 = local328 * 5 + 16711680;
					} else if (local328 < 100) {
						local251 = 16711935 - (local328 - 50) * 327680;
					} else if (local328 < 150) {
						local251 = local328 * 327680 + 500 + 255 - local328 * 5 - 32768000;
					}
				}
				if (Static364.anIntArray605[local172] == 11) {
					local328 = 150 - Static364.anIntArray606[local172];
					if (local328 < 50) {
						local251 = 16777215 - local328 * 327685;
					} else if (local328 < 100) {
						local251 = local328 * 327685 + 65280 - 16384250;
					} else if (local328 < 150) {
						local251 = 16777215 - (local328 - 100) * 327680;
					}
				}
				local328 = local251 | 0xFF000000;
				if (Static364.anIntArray604[local172] == 0) {
					Static330.aClass57_3.method5953(local205 + arg1, local1185, local328, arg3 + local850, -16777216);
				}
				if (Static364.anIntArray604[local172] == 1) {
					Static330.aClass57_3.method5947(Static186.anInt3747, arg3 + local850, local328, local205 + arg1, local1185);
				}
				if (Static364.anIntArray604[local172] == 2) {
					Static330.aClass57_3.method5943(Static186.anInt3747, local1185, local850 + arg3, local328, local205 + arg1);
				}
				if (Static364.anIntArray604[local172] == 3) {
					Static330.aClass57_3.method5949(arg3 + local850, local205 + arg1, local328, local1185, Static186.anInt3747, 150 - Static364.anIntArray606[local172]);
				}
				@Pc(1519) int local1519;
				if (Static364.anIntArray604[local172] == 4) {
					local1519 = (150 - Static364.anIntArray606[local172]) * (Static450.aClass79_10.method1977(local1185) + 100) / 150;
					Static412.aClass50_8.HA(local205 + arg1 - 50, arg3, local205 + arg1 + 50, arg3 + arg0);
					Static330.aClass57_3.method5960(arg1 + local205 + 50 - local1519, local328, -16777216, local850 + arg3, local1185);
					Static412.aClass50_8.ba(arg1, arg3, arg2 + arg1, arg0 + arg3);
				}
				if (Static364.anIntArray604[local172] == 5) {
					local1519 = 150 - Static364.anIntArray606[local172];
					@Pc(1579) int local1579 = 0;
					if (local1519 < 25) {
						local1579 = local1519 - 25;
					} else if (local1519 > 125) {
						local1579 = local1519 - 125;
					}
					@Pc(1601) int local1601 = Static450.aClass79_10.anInt2284 + Static450.aClass79_10.anInt2290;
					Static412.aClass50_8.HA(arg1, arg3 + local850 - local1601 - 1, arg2 + arg1, local850 + arg3 + 5);
					Static330.aClass57_3.method5953(local205 + arg1, local1185, local328, local1579 + local850 + arg3, -16777216);
					Static412.aClass50_8.ba(arg1, arg3, arg1 + arg2, arg0 + arg3);
				}
			} else {
				Static330.aClass57_3.method5953(arg1 + local205, local1185, -256, arg3 + local850, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method1713() {
		if (Static314.method4326(Static358.anInt6086) || Static207.method3218(Static358.anInt6086)) {
			Static398.method5280(Static50.anInt906 >> 10, Static80.anInt1679 >> 10, 5000);
		} else {
			@Pc(16) int local16 = Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0] >> 3;
			@Pc(23) int local23 = Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0] >> 3;
			if (local16 >= 0 && local16 < Static2.anInt7 >> 3 && local23 >= 0 && local23 < Static17.anInt315 >> 3) {
				Static398.method5280(local23, local16, 5000);
			} else {
				Static398.method5280(Static17.anInt315 >> 4, Static2.anInt7 >> 4, 0);
			}
		}
		Static63.method1059();
		Static350.method4745();
		Static236.method3461();
		Static152.method2604();
	}
}
