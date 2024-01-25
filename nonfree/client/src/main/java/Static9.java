import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_14 = new Class179(82, 6);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public static void method370() {
		Static617.method8513(false);
		if (Static611.anInt9972 >= 0 && Static611.anInt9972 != 0) {
			Static646.method8805(Static611.anInt9972, false);
			Static611.anInt9972 = -1;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([I[[[BZ[IIIIII[IIIBIIZ[I[I)V")
	public static void method372(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(16) int[] arg14, @OriginalArg(17) int[] arg15) {
		if (Static353.anInt6019 == -1) {
			return;
		}
		@Pc(12) int[] local12 = Static367.aClass132_7.Y();
		@Pc(16) int local16 = local12[0];
		@Pc(20) int local20 = local12[1];
		@Pc(24) int local24 = local12[2];
		@Pc(28) int local28 = local12[3];
		@Pc(30) int local30 = local24;
		@Pc(32) int local32 = local28;
		if (Static353.anInt6019 == 1) {
			local30 = (int) ((double) local24 * (double) Static308.anInt5228 / (double) Static554.anInt9288);
			local32 = (int) ((double) local28 * (double) Static308.anInt5228 / (double) Static554.anInt9288);
		}
		if (!Static119.aBoolean126) {
			if (Static353.anInt6019 == 1) {
				Static628.method8639();
			}
			@Pc(69) int local69 = arg7 - Static200.anInt3471;
			@Pc(73) int local73 = arg5 - Static194.anInt3301;
			@Pc(78) int local78 = arg8 - Static84.anInt1660;
			@Pc(100) int local100 = (int) ((Static308.aDouble96 * (double) local78 + Static286.aDouble86 * (double) local69 + (double) local73 * Static135.aDouble42) * (double) local30 / (double) arg13);
			@Pc(122) int local122 = (int) (((double) local78 * Static403.aDouble133 + Static543.aDouble190 * (double) local69 + Static230.aDouble72 * (double) local73) * (double) local32 / (double) arg13);
			@Pc(137) double local137 = Static83.aDouble29 * (double) local78 + Static541.aDouble121 * (double) local73 + Static531.aDouble154 * (double) local69;
			@Pc(145) int local145 = Static583.anInt9586 + local100 - Static115.anInt2065;
			@Pc(152) int local152 = local122 + Static43.anInt964 - Static669.anInt10732;
			@Pc(156) int local156 = Static424.anInt7323 + local145;
			@Pc(161) int local161 = local152 + Static308.anInt5228;
			if (local145 >= 0 && local152 >= 0 && local156 <= Static457.anInt7638 && local161 <= Static554.anInt9288 || Static353.anInt6019 == 2) {
				if (Static353.anInt6019 == 2) {
					Static311.aDouble98 = -local137;
				}
				Static596.anInt9747 = local145;
				Static475.anInt8169 = local152;
			} else if (local156 > 0 && local161 > 0 && Static457.anInt7638 > local145 && Static554.anInt9288 > local152) {
				@Pc(201) int local201 = local145 - Static583.anInt9586;
				@Pc(206) int local206 = local152 - Static43.anInt964;
				@Pc(208) int local208 = 0;
				@Pc(210) int local210 = 0;
				@Pc(212) int local212 = 0;
				@Pc(214) int local214 = 0;
				@Pc(216) double local216 = 0.0D;
				if (Static353.anInt6019 == 0) {
					local208 = local201;
					local210 = local206;
					local216 = local137 + Static311.aDouble98;
				} else if (Static353.anInt6019 == 1) {
					local212 = local201 / Static208.anInt3594;
					local214 = local206 / Static263.anInt4574;
					local210 = local214 * Static263.anInt4574;
					local208 = local212 * Static208.anInt3594;
					local216 = (local137 + Static311.aDouble98) * (double) (local206 * local210 + local208 * local201) / (double) (local201 * local201 + local206 * local206);
				}
				local216 = -local216;
				@Pc(279) int local279 = 0;
				@Pc(281) int local281 = 0;
				@Pc(283) int local283 = 0;
				@Pc(285) int local285 = 0;
				@Pc(287) int local287 = 0;
				@Pc(301) int local301;
				@Pc(296) int local296;
				@Pc(298) int local298;
				@Pc(303) int local303;
				if (local208 < 0) {
					local296 = local208 + Static457.anInt7638;
					local298 = 0;
					local301 = -local208;
					local303 = local301;
					if (Static353.anInt6019 == 1) {
						local283 = 0;
						local287 = -local212;
					}
				} else {
					local296 = Static457.anInt7638 - local208;
					local301 = 0;
					if (Static353.anInt6019 == 1) {
						local287 = local212;
						local283 = Static519.anInt8647 - local212;
					}
					local303 = local208;
					local298 = local296;
				}
				@Pc(339) int local339 = 0;
				@Pc(350) int local350;
				@Pc(345) int local345;
				@Pc(347) int local347;
				@Pc(352) int local352;
				@Pc(369) int local369;
				if (local210 < 0) {
					local345 = local210 + Static554.anInt9288;
					local347 = 0;
					local350 = -local210;
					local352 = local350;
					if (Static353.anInt6019 == 1) {
						local279 = 0;
						local281 = -local214;
						local285 = local281;
						local339 = Static415.anInt7233 + local214;
					}
					local369 = local350;
				} else {
					local350 = 0;
					local345 = Static554.anInt9288 - local210;
					local352 = local210;
					local347 = local345;
					local369 = 0;
					if (Static353.anInt6019 == 1) {
						local281 = local214;
						local285 = 0;
						local279 = Static415.anInt7233 - local214;
						local339 = local279;
					}
				}
				@Pc(407) Class43 local407 = Static502.aClass115_11.aClass43_5;
				@Pc(421) int local421;
				for (@Pc(412) Class2_Sub9 local412 = (Class2_Sub9) local407.method1087(); local412 != null; local412 = (Class2_Sub9) local407.method1088()) {
					@Pc(417) Class2_Sub5[] local417 = local412.aClass2_Sub5Array1;
					@Pc(419) boolean local419 = true;
					for (local421 = 0; local421 < local417.length; local421++) {
						@Pc(427) Class2_Sub5 local427 = local417[local421];
						@Pc(430) int local430 = local427.anInt2082;
						@Pc(433) int local433 = local427.anInt2086;
						@Pc(436) int local436 = local427.anInt2083;
						@Pc(439) int local439 = local427.anInt2084;
						@Pc(446) int local446;
						local427.anInt2086 = local446 = local433 - local210;
						@Pc(454) int local454;
						local427.anInt2084 = local454 = local439 - local210;
						@Pc(462) int local462;
						local427.anInt2083 = local462 = local436 - local208;
						@Pc(466) int local466 = local427.anInt2085;
						@Pc(472) int local472;
						local427.anInt2082 = local472 = local430 - local208;
						if (local419) {
							@Pc(484) int local484 = (local472 < local462 ? local472 : local462) - local466;
							if (Static457.anInt7638 >= local484) {
								@Pc(501) int local501 = (local446 >= local454 ? local454 : local446) - local466;
								if (Static554.anInt9288 >= local501) {
									@Pc(513) int local513 = local466 + (local462 <= local472 ? local472 : local462);
									if (local513 >= 0) {
										@Pc(524) int local524 = local466 + (local446 < local454 ? local454 : local446);
										if (local524 >= 0) {
											local419 = false;
										}
									}
								}
							}
						}
					}
					if (local419) {
						local412.method8436();
						Static379.method5357(local412);
					}
				}
				if (Static353.anInt6019 == 0) {
					Static367.aClass132_7.method7489(Static675.anInterface16_1);
				}
				Static367.aClass132_7.F(-local208, -local210);
				Static367.aClass132_7.b(local301, local350, local296, local345, local216);
				Static224.method3271(Static311.aDouble98 + local216);
				Static187.aDouble60 = local216 + Static311.aDouble98;
				if (Static353.anInt6019 == 1) {
					Static643.anInt10394 = local32;
					Static69.anInt1272 = local20 - Static669.anInt10732 - local210;
					Static629.anInt10267 = local30;
					Static286.anInt4874 = local16 - local208 - Static115.anInt2065;
					Static367.aClass132_7.DA(Static286.anInt4874, Static69.anInt1272, Static629.anInt10267, Static643.anInt10394);
				} else {
					Static69.anInt1272 = local20 + Static43.anInt964 - Static669.anInt10732 - local210;
					Static629.anInt10267 = local30;
					Static286.anInt4874 = Static583.anInt9586 + local16 - local208 - Static115.anInt2065;
					Static643.anInt10394 = local32;
					Static367.aClass132_7.DA(Static286.anInt4874, Static69.anInt1272, Static629.anInt10267, Static643.anInt10394);
				}
				Static228.method3313(Static502.aClass115_11);
				if (local352 > 0) {
					Static367.aClass132_7.KA(0, local347, Static457.anInt7638, local347 + local352);
					Static367.aClass132_7.ya();
					Static367.aClass132_7.GA(Static291.anInt4915);
					Static420.method6264(arg10, arg7, arg5, arg8, arg1, arg9, arg15, arg3, arg14, arg0, arg4, arg11, arg6, arg12, arg2, arg13, 1, false);
				}
				if (local303 > 0) {
					Static367.aClass132_7.KA(local298, local369, local298 + local303, local345 + local369);
					Static367.aClass132_7.ya();
					Static367.aClass132_7.GA(Static291.anInt4915);
					Static420.method6264(arg10, arg7, arg5, arg8, arg1, arg9, arg15, arg3, arg14, arg0, arg4, arg11, arg6, arg12, arg2, arg13, 1, false);
				}
				Static367.aClass132_7.la();
				Static302.method4362();
				if (Static353.anInt6019 == 0) {
					Static367.aClass132_7.method7499();
				}
				Static115.anInt2065 += local208;
				Static311.aDouble98 += local216;
				Static669.anInt10732 += local210;
				Static596.anInt9747 = local100 + Static583.anInt9586 - Static115.anInt2065;
				Static475.anInt8169 = Static43.anInt964 + local122 - Static669.anInt10732;
				if (Static353.anInt6019 == 1) {
					Static622.anInt10138 += local212;
					Static604.anInt4516 += local214;
					for (@Pc(778) int local778 = 0; local778 < Static415.anInt7233; local778++) {
						@Pc(789) int local789 = Static340.method5004(Static604.anInt4516 + local778, Static415.anInt7233) * Static519.anInt8647;
						for (local421 = 0; local421 < Static519.anInt8647; local421++) {
							@Pc(803) int local803 = local789 + Static340.method5004(local421 + Static622.anInt10138, Static519.anInt8647);
							@Pc(841) boolean local841 = local279 <= local778 && local778 < local279 + local281 || local778 >= local285 && local285 + local339 > local778 && local283 <= local421 && local421 < local283 + local287;
							Static155.anInterface16Array1[local803].method8878(local421 * Static208.anInt3594, local778 * Static263.anInt4574, Static208.anInt3594, Static263.anInt4574, local841);
						}
					}
				}
			} else {
				Static119.aBoolean126 = true;
			}
		}
		if (Static119.aBoolean126) {
			Static200.anInt3471 = arg7;
			Static669.anInt10732 = 0;
			Static115.anInt2065 = 0;
			Static194.anInt3301 = arg5;
			Static84.anInt1660 = arg8;
			Static311.aDouble98 = 0.0D;
			Static596.anInt9747 = Static583.anInt9586;
			Static475.anInt8169 = Static43.anInt964;
			if (Static353.anInt6019 == 0) {
				Static367.aClass132_7.method7489(Static675.anInterface16_1);
			}
			Static367.aClass132_7.la();
			Static367.aClass132_7.ya();
			Static367.aClass132_7.GA(Static291.anInt4915);
			Static467.aClass207_29.method8201(Static200.anInt3471, Static194.anInt3301, Static84.anInt1660, Static59.anInt1160, Static383.anInt6432, Static627.anInt10200);
			Static367.aClass132_7.method7517(Static467.aClass207_29);
			if (Static353.anInt6019 == 1) {
				Static69.anInt1272 = local20;
				Static286.anInt4874 = local16;
				Static629.anInt10267 = local30;
				Static643.anInt10394 = local32;
				Static367.aClass132_7.DA(Static286.anInt4874, Static69.anInt1272, Static629.anInt10267, Static643.anInt10394);
			} else {
				Static643.anInt10394 = local32;
				Static629.anInt10267 = local30;
				Static69.anInt1272 = local20 + Static43.anInt964;
				Static286.anInt4874 = Static583.anInt9586 + local16;
				Static367.aClass132_7.DA(Static286.anInt4874, Static69.anInt1272, Static629.anInt10267, Static643.anInt10394);
			}
			Static187.aDouble60 = 0.0D;
			Static502.aClass115_11.method2465();
			Static228.method3313(Static502.aClass115_11);
			Static420.method6264(arg10, arg7, arg5, arg8, arg1, arg9, arg15, arg3, arg14, arg0, arg4, arg11, arg6, arg12, arg2, arg13, 1, false);
			Static302.method4362();
			Static119.aBoolean126 = false;
			if (Static353.anInt6019 == 0) {
				Static367.aClass132_7.method7499();
			}
			if (Static353.anInt6019 == 1) {
				Static658.method8967();
			}
		}
		if (Static353.anInt6019 == 0) {
			Static675.anInterface16_1.method8877(Static596.anInt9747, Static475.anInt8169, Static424.anInt7323, Static308.anInt5228, 0, 0);
		}
		Static281.anInt4834++;
		Static224.method3271(Static311.aDouble98);
		Static229.aDouble71 = Static311.aDouble98;
		if (Static353.anInt6019 == 0 || Static353.anInt6019 == 2) {
			if (Static353.anInt6019 == 2) {
				Static367.aClass132_7.GA(Static291.anInt4915);
				Static367.aClass132_7.ya();
			}
			Static161.anInt2733 = local30;
			Static333.anInt5730 = local32;
			Static289.anInt4893 = Static583.anInt9586 + local16 - Static596.anInt9747 - Static115.anInt2065;
			Static404.anInt5096 = Static43.anInt964 + local20 - Static475.anInt8169 - Static669.anInt10732;
			Static367.aClass132_7.DA(Static289.anInt4893, Static404.anInt5096, Static161.anInt2733, Static333.anInt5730);
		} else if (Static353.anInt6019 == 1) {
			Static404.anInt5096 = local20 - Static669.anInt10732;
			Static161.anInt2733 = local30;
			Static289.anInt4893 = local16 - Static115.anInt2065;
			Static333.anInt5730 = local32;
			Static367.aClass132_7.DA(Static289.anInt4893, Static404.anInt5096, Static161.anInt2733, Static333.anInt5730);
			Static367.aClass132_7.KA(Static596.anInt9747, Static475.anInt8169, Static424.anInt7323 + Static596.anInt9747, Static475.anInt8169 + Static308.anInt5228);
		}
		Static420.method6264(arg10, arg7, arg5, arg8, arg1, arg9, arg15, arg3, arg14, arg0, arg4, arg11, arg6, arg12, arg2, arg13, Static353.anInt6019 == 2 ? 0 : 2, Static353.anInt6019 == 1);
		Static367.aClass132_7.la();
		Static367.aClass132_7.DA(local16, local20, local24, local28);
	}
}
