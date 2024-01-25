import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	public static int anInt1862;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	public static int anInt1866;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
	public static boolean aBoolean128;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(CI)Z")
	public static boolean method1538(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BIZLjava/lang/String;)V")
	public static void method1539(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static373.method5888();
		if (arg0 == 0) {
			Static162.aClass100_7 = Static280.method4926(Static383.aClass353_64, Static271.aCanvas6, Static535.anInterface4_10, Static348.aClass6_Sub22_19.aClass15_Sub11_1.method4165() * 2, 0);
			if (arg2 != null) {
				Static162.aClass100_7.GA(0);
				@Pc(36) Class133 local36 = Static247.method4287(Static483.aClass353_89, Static113.anInt2236);
				@Pc(45) Class50 local45 = Static162.aClass100_7.method8808(local36, Static651.method2405(Static540.aClass353_110, Static113.anInt2236));
				Static27.method485();
				Static67.method1169(true, arg2, local36, local45, Static162.aClass100_7);
			}
		} else {
			@Pc(58) Class100 local58 = null;
			@Pc(86) Class50 local86;
			if (arg2 != null) {
				local58 = Static280.method4926(Static383.aClass353_64, Static271.aCanvas6, Static535.anInterface4_10, 0, 0);
				local58.GA(0);
				@Pc(77) Class133 local77 = Static247.method4287(Static483.aClass353_89, Static113.anInt2236);
				local86 = local58.method8808(local77, Static651.method2405(Static540.aClass353_110, Static113.anInt2236));
				Static27.method485();
				Static67.method1169(true, arg2, local77, local86, local58);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static162.aClass100_7 = Static280.method4926(Static383.aClass353_64, Static271.aCanvas6, Static535.anInterface4_10, Static348.aClass6_Sub22_19.aClass15_Sub11_1.method4165() * 2, arg0);
					if (arg2 != null) {
						local58.GA(0);
						@Pc(119) Class133 local119 = Static247.method4287(Static483.aClass353_89, Static113.anInt2236);
						@Pc(128) Class50 local128 = local58.method8808(local119, Static651.method2405(Static540.aClass353_110, Static113.anInt2236));
						Static27.method485();
						Static67.method1169(true, arg2, local119, local128, local58);
					}
					if (Static162.aClass100_7.method8795()) {
						@Pc(142) boolean local142 = true;
						try {
							local142 = Static428.aClass6_Sub28_1.anInt6061 > 256;
						} catch (@Pc(152) Throwable local152) {
						}
						@Pc(158) Class6_Sub8 local158;
						if (local142) {
							local158 = Static162.aClass100_7.method8841(146800640);
						} else {
							local158 = Static162.aClass100_7.method8841(104857600);
						}
						Static162.aClass100_7.method8787(local158);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(169) Throwable local169) {
					@Pc(174) int local174 = Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681();
					if (local174 == 2) {
						Static441.aBoolean529 = true;
					}
					Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub22_2);
					method1539(local174, arg1, arg2);
					@Pc(193) Object local193 = null;
					var14 = false;
				} finally {
					if (var14) {
						local86 = null;
						if (local58 != null) {
							try {
								local58.method8789();
							} catch (@Pc(347) Throwable local347) {
							}
						}
					}
				}
				if (local58 != null) {
					try {
						local58.method8789();
					} catch (@Pc(327) Throwable local327) {
					}
				}
				return;
			}
			local86 = null;
			if (local58 != null) {
				try {
					local58.method8789();
				} catch (@Pc(337) Throwable local337) {
				}
			}
		}
		Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6675(!arg1);
		Static348.aClass6_Sub22_19.method3534(arg0, Static348.aClass6_Sub22_19.aClass15_Sub22_2);
		Static50.method879();
		Static162.aClass100_7.method8803();
		Static162.aClass100_7.X(32);
		Static187.aClass154_3 = Static162.aClass100_7.method8838();
		Static562.aClass154_9 = Static162.aClass100_7.method8838();
		Static343.method5556();
		Static162.aClass100_7.method8802(Static348.aClass6_Sub22_19.aClass15_Sub20_1.method5936() == 1);
		if (Static162.aClass100_7.method8836()) {
			Static448.method6930(Static348.aClass6_Sub22_19.aClass15_Sub25_1.method8355() == 1);
		}
		Static637.method8952(Static162.aClass100_7, Static442.anInt7975 >> 3, Static284.anInt7916 >> 3);
		Static245.method5548();
		Static585.aBoolean670 = true;
		Static35.aClass125Array1 = null;
		Static509.aBoolean584 = false;
		Static350.method5633();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)V")
	public static void method1540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static348.aClass6_Sub22_19.aClass15_Sub18_3.method5678() != 0 && arg5 != 0 && Static277.anInt5443 < 50 && arg2 != -1) {
			Static280.aClass224Array1[Static277.anInt5443++] = new Class224((byte) 1, arg2, arg5, arg4, arg0, arg1, arg3, (Class20_Sub2) null);
		}
	}
}
