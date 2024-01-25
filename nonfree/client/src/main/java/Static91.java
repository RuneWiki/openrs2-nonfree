import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!pj;")
	public static final Class156 aClass156_6 = new Class156(128);

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!aa;)Z")
	public static boolean method1717(@OriginalArg(1) int arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(11) int local11 = (Static48.anInt1107 - 104) / 2;
		@Pc(17) int local17 = (Static337.anInt6402 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static350.method5668(arg0, local21, local29, local25)) {
						local40 = local29;
						if (Static153.method2918(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static206.method3829(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(91) int[] local91 = new int[262144];
		for (local29 = 0; local29 < local91.length; local29++) {
			local91[local29] = -16777216;
		}
		Static254.aClass90_15 = arg1.method3288(local91, 512, 512, 512);
		Static279.method4817();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
		@Pc(160) int local160 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(179) int local179 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(183) boolean[][] local183 = new boolean[Static298.anInt5960][Static298.anInt5960];
		@Pc(189) int local189;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(272) int local272;
		@Pc(279) int local279;
		@Pc(283) int local283;
		@Pc(302) int local302;
		for (@Pc(185) int local185 = local11; local185 < local11 + 104; local185 += Static298.anInt5960) {
			for (local189 = local17; local189 < local17 + 104; local189 += Static298.anInt5960) {
				arg1.method3250(0, 0, Static298.anInt5960 * 4, Static298.anInt5960 * 4);
				arg1.method3309(-16777216);
				for (local206 = arg0; local206 <= 3; local206++) {
					for (local210 = 0; local210 < Static298.anInt5960; local210++) {
						for (local214 = 0; local214 < Static298.anInt5960; local214++) {
							local183[local210][local214] = Static350.method5668(arg0, local210 + local185, local206, local189 + local214);
						}
					}
					Static288.aClass41Array5[local206].method5432(local185, local189, Static298.anInt5960 + local185, local189 + Static298.anInt5960, local183);
					if (!Static35.aBoolean79) {
						for (local214 = -4; local214 < Static298.anInt5960; local214++) {
							for (local272 = -4; local272 < Static298.anInt5960; local272++) {
								local279 = local185 + local214;
								local283 = local272 + local189;
								if (local279 >= local11 && local17 <= local283 && Static350.method5668(arg0, local279, local206, local283)) {
									local302 = local206;
									if (Static153.method2918(local283, local279)) {
										local302 = local206 - 1;
									}
									if (local302 >= 0) {
										Static46.method1038(local40, local302, local160, (Static298.anInt5960 - local272) * 4 - 4, local214 * 4, local283, arg1, local279);
									}
								}
							}
						}
					}
				}
				if (Static35.aBoolean79) {
					@Pc(360) Class91 local360 = Static24.aClass91Array1[arg0];
					for (local214 = 0; local214 < Static298.anInt5960; local214++) {
						for (local272 = 0; local272 < Static298.anInt5960; local272++) {
							local279 = local185 + local214;
							local283 = local272 + local189;
							local302 = local360.anIntArrayArray27[local279 - local360.anInt2692][local283 - local360.anInt2685];
							if ((local302 & 0x40240000) != 0) {
								arg1.method3277((Static298.anInt5960 - local272) * 4 - 4, 4, local214 * 4, -1713569622, 4);
							} else if ((local302 & 0x800000) != 0) {
								arg1.method3254(-1713569622, (Static298.anInt5960 - local272) * 4 - 4, local214 * 4, 4);
							} else if ((local302 & 0x2000000) != 0) {
								arg1.method3335(local214 * 4 + 3, 4, (Static298.anInt5960 - local272) * 4 - 4, -1713569622);
							} else if ((local302 & 0x8000000) != 0) {
								arg1.method3254(-1713569622, (Static298.anInt5960 - local272) * 4 - 1, local214 * 4, 4);
							} else if ((local302 & 0x20000000) != 0) {
								arg1.method3335(local214 * 4, 4, (Static298.anInt5960 - local272) * 4 - 4, -1713569622);
							}
						}
					}
				}
				arg1.method3300(0, 0, Static298.anInt5960 * 4, Static298.anInt5960 * 4, local179, 2);
				Static254.aClass90_15.method5452((local185 - local11) * 4 + 48, -((-local17 + local189) * 4) + 464 + -(Static298.anInt5960 * 4), Static298.anInt5960 * 4, Static298.anInt5960 * 4);
			}
		}
		arg1.method3327();
		arg1.method3309(-16777215);
		Static228.method4134();
		Static189.anInt3926 = 0;
		Static50.aClass195_7.method5032();
		if (!Static35.aBoolean79) {
			for (local189 = local11; local189 < local11 + 104; local189++) {
				for (local206 = local17; local206 < local17 + 104; local206++) {
					for (local210 = arg0; local210 <= arg0 + 1 && local210 <= 3; local210++) {
						if (Static350.method5668(arg0, local189, local210, local206)) {
							@Pc(627) Interface8 local627 = (Interface8) Static331.method5551(local210, local189, local206);
							if (local627 == null) {
								local627 = (Interface8) Static66.method1372(local210, local189, local206, tr.class);
							}
							if (local627 == null) {
								local627 = (Interface8) Static264.method4812(local210, local189, local206);
							}
							if (local627 == null) {
								local627 = (Interface8) Static57.method1233(local210, local189, local206);
							}
							if (local627 != null) {
								@Pc(667) Class188 local667 = Static126.method2405(local627.method5697());
								if (!local667.aBoolean474 || Static220.aBoolean369) {
									local279 = local667.anInt5549;
									if (local667.anIntArray697 != null) {
										for (local283 = 0; local283 < local667.anIntArray697.length; local283++) {
											if (local667.anIntArray697[local283] != -1) {
												@Pc(696) Class188 local696 = Static126.method2405(local667.anIntArray697[local283]);
												if (local696.anInt5549 >= 0) {
													local279 = local696.anInt5549;
												}
											}
										}
									}
									if (local279 >= 0) {
										@Pc(715) boolean local715 = false;
										if (local279 >= 0) {
											@Pc(721) Class202 local721 = Static221.method4034(local279);
											if (local721 != null && local721.aBoolean517) {
												local715 = true;
											}
										}
										local302 = local189;
										@Pc(732) int local732 = local206;
										if (local715) {
											@Pc(739) int[][] local739 = Static24.aClass91Array1[local210].anIntArrayArray27;
											@Pc(744) int local744 = Static24.aClass91Array1[local210].anInt2692;
											@Pc(749) int local749 = Static24.aClass91Array1[local210].anInt2685;
											for (@Pc(751) int local751 = 0; local751 < 10; local751++) {
												@Pc(758) int local758 = (int) (Math.random() * 4.0D);
												if (local758 == 0 && local11 < local302 && local302 > local189 - 3 && (local739[local302 - local744 - 1][local732 - local749] & 0x2C0108) == 0) {
													local302--;
												}
												if (local758 == 1 && local302 < local11 + 104 - 1 && local189 + 3 > local302 && (local739[local302 + 1 - local744][local732 - local749] & 0x2C0180) == 0) {
													local302++;
												}
												if (local758 == 2 && local17 < local732 && local206 - 3 < local732 && (local739[local302 - local744][local732 - local749 - 1] & 0x2C0102) == 0) {
													local732--;
												}
												if (local758 == 3 && local732 < local17 + 104 - 1 && local732 < local206 + 3 && (local739[local302 - local744][local732 + 1 - local749] & 0x2C0120) == 0) {
													local732++;
												}
											}
										}
										Static135.anIntArray314[Static189.anInt3926] = local667.anInt5535;
										Static34.anIntArray102[Static189.anInt3926] = local302;
										Static240.anIntArray599[Static189.anInt3926] = local732;
										Static189.anInt3926++;
									}
								}
							}
						}
					}
				}
			}
			if (Static97.aClass6_1 != null) {
				Static324.aClass165_98.anInt4890 = 1;
				Static187.method3638(1024, 64);
				for (local206 = 0; local206 < Static97.aClass6_1.anInt158; local206++) {
					local210 = Static97.aClass6_1.anIntArray21[local206];
					if (local210 >> 28 == Static285.anInt5511) {
						local214 = (local210 >> 14 & 0x3FFF) - Static182.anInt3775;
						local272 = (local210 & 0x3FFF) - Static161.anInt3315;
						if (local214 >= 0 && Static48.anInt1107 > local214 && local272 >= 0 && local272 < Static337.anInt6402) {
							Static50.aClass195_7.method5018(new Class1_Sub37(local206));
						} else {
							@Pc(1024) Class202 local1024 = Static221.method4034(Static97.aClass6_1.anIntArray22[local206]);
							if (local1024.anIntArray744 != null && local214 + local1024.anInt5891 >= 0 && Static48.anInt1107 > local214 + local1024.anInt5909 && local1024.anInt5884 + local272 >= 0 && Static337.anInt6402 > local272 + local1024.anInt5895) {
								Static50.aClass195_7.method5018(new Class1_Sub37(local206));
							}
						}
					}
				}
				Static187.method3638(128, 64);
				Static324.aClass165_98.anInt4890 = 2;
				Static324.aClass165_98.method4495();
			}
		}
		return true;
	}
}
