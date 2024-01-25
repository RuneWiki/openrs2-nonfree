import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "Lclient!bc;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "Z")
	public static boolean aBoolean151;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_75 = new Class221("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "[Lclient!gr;")
	public static final Class91[] aClass91Array1 = new Class91[4];

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	public static int anInt1955 = 0;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
	public static int anInt1958 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([BI)[B")
	public static byte[] method1780(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static406.method5656(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIII)V")
	public static void method1781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static69.method1260(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(26) int local26 = arg3;
		@Pc(29) int local29 = -arg3;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(86) int local86;
		if (Static313.anInt5542 <= arg1 && arg1 <= Static345.anInt6084) {
			@Pc(52) int[] local52 = Static267.anIntArrayArray38[arg1];
			local61 = Static355.method5388(Static332.anInt5823, arg4 - arg3, Static202.anInt3722);
			local69 = Static355.method5388(Static332.anInt5823, arg3 + arg4, Static202.anInt3722);
			local78 = Static355.method5388(Static332.anInt5823, arg4 - local15, Static202.anInt3722);
			local86 = Static355.method5388(Static332.anInt5823, local15 + arg4, Static202.anInt3722);
			Static264.method4096(local52, arg5, local78, local61);
			Static264.method4096(local52, arg2, local86, local78);
			Static264.method4096(local52, arg5, local69, local86);
		}
		while (local26 > local10) {
			local36 += 2;
			local38 += 2;
			local29 += local36;
			local34 += local38;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				Static41.anIntArray129[local31] = local10;
				local34 -= local31 << 1;
			}
			local10++;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(218) int[] local218;
			@Pc(152) int local152;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				local152 = arg1 - local26;
				local61 = arg1 + local26;
				if (Static313.anInt5542 <= local61 && Static345.anInt6084 >= local152) {
					if (local15 > local26) {
						local69 = Static41.anIntArray129[local26];
						local78 = Static355.method5388(Static332.anInt5823, local10 + arg4, Static202.anInt3722);
						local86 = Static355.method5388(Static332.anInt5823, arg4 - local10, Static202.anInt3722);
						local198 = Static355.method5388(Static332.anInt5823, local69 + arg4, Static202.anInt3722);
						local207 = Static355.method5388(Static332.anInt5823, arg4 - local69, Static202.anInt3722);
						if (local61 <= Static345.anInt6084) {
							local218 = Static267.anIntArrayArray38[local61];
							Static264.method4096(local218, arg5, local207, local86);
							Static264.method4096(local218, arg2, local198, local207);
							Static264.method4096(local218, arg5, local78, local198);
						}
						if (local152 >= Static313.anInt5542) {
							local218 = Static267.anIntArrayArray38[local152];
							Static264.method4096(local218, arg5, local207, local86);
							Static264.method4096(local218, arg2, local198, local207);
							Static264.method4096(local218, arg5, local78, local198);
						}
					} else {
						local69 = Static355.method5388(Static332.anInt5823, arg4 + local10, Static202.anInt3722);
						local78 = Static355.method5388(Static332.anInt5823, arg4 - local10, Static202.anInt3722);
						if (Static345.anInt6084 >= local61) {
							Static264.method4096(Static267.anIntArrayArray38[local61], arg5, local69, local78);
						}
						if (local152 >= Static313.anInt5542) {
							Static264.method4096(Static267.anIntArrayArray38[local152], arg5, local69, local78);
						}
					}
				}
			}
			local152 = arg1 - local10;
			local61 = arg1 + local10;
			if (Static313.anInt5542 <= local61 && Static345.anInt6084 >= local152) {
				local69 = local26 + arg4;
				local78 = arg4 - local26;
				if (local69 >= Static332.anInt5823 && Static202.anInt3722 >= local78) {
					local69 = Static355.method5388(Static332.anInt5823, local69, Static202.anInt3722);
					local78 = Static355.method5388(Static332.anInt5823, local78, Static202.anInt3722);
					if (local10 >= local15) {
						if (local61 <= Static345.anInt6084) {
							Static264.method4096(Static267.anIntArrayArray38[local61], arg5, local69, local78);
						}
						if (local152 >= Static313.anInt5542) {
							Static264.method4096(Static267.anIntArrayArray38[local152], arg5, local69, local78);
						}
					} else {
						local86 = local10 <= local31 ? local31 : Static41.anIntArray129[local10];
						local198 = Static355.method5388(Static332.anInt5823, arg4 + local86, Static202.anInt3722);
						local207 = Static355.method5388(Static332.anInt5823, arg4 - local86, Static202.anInt3722);
						if (Static345.anInt6084 >= local61) {
							local218 = Static267.anIntArrayArray38[local61];
							Static264.method4096(local218, arg5, local207, local78);
							Static264.method4096(local218, arg2, local198, local207);
							Static264.method4096(local218, arg5, local69, local198);
						}
						if (local152 >= Static313.anInt5542) {
							local218 = Static267.anIntArrayArray38[local152];
							Static264.method4096(local218, arg5, local207, local78);
							Static264.method4096(local218, arg2, local198, local207);
							Static264.method4096(local218, arg5, local69, local198);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)J")
	public static long method1784() {
		return Static240.aClass103_1.method4084();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IJ)V")
	public static void method1787(@OriginalArg(1) long arg0) {
		@Pc(16) int local16 = Static289.anInt5124 + Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328;
		@Pc(21) int local21 = Static77.anInt1491 + Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317;
		if (Static243.anInt4394 - local16 < -500 || Static243.anInt4394 - local16 > 500 || Static301.anInt5428 - local21 < -500 || Static301.anInt5428 - local21 > 500) {
			Static301.anInt5428 = local21;
			Static243.anInt4394 = local16;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (local16 != Static243.anInt4394) {
			local67 = local16 - Static243.anInt4394;
			local75 = (int) ((long) local67 * arg0 / 320L);
			if (local67 > 0) {
				if (local75 == 0) {
					local75 = 1;
				} else if (local75 > local67) {
					local75 = local67;
				}
			} else if (local75 == 0) {
				local75 = -1;
			} else if (local75 < local67) {
				local75 = local67;
			}
			Static243.anInt4394 += local75;
		}
		if (!Static223.aBoolean308) {
			Static295.aFloat73 += (float) arg0 * Static85.aFloat18 / 6.0F;
			Static18.aFloat8 += (float) arg0 * Static375.aFloat45 / 6.0F;
		}
		if (Static301.anInt5428 != local21) {
			local67 = local21 - Static301.anInt5428;
			local75 = (int) (arg0 * (long) local67 / 320L);
			if (local67 <= 0) {
				if (local75 == 0) {
					local75 = -1;
				} else if (local67 > local75) {
					local75 = local67;
				}
			} else if (local75 == 0) {
				local75 = 1;
			} else if (local75 > local67) {
				local75 = local67;
			}
			Static301.anInt5428 += local75;
		}
		Static203.method3381();
	}
}
