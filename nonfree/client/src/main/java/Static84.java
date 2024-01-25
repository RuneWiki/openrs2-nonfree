import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_6 = new Class330();

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
	public static int anInt1705 = 0;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public static void method1390() {
		for (@Pc(3) int local3 = 0; local3 < Static368.anInt6139; local3++) {
			Static108.aClass34Array3[local3] = null;
		}
		Static368.anInt6139 = 0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static68.anInt1380; local21++) {
			for (local25 = 0; local25 < Static357.anInt5961; local25++) {
				for (local29 = 0; local29 < Static429.anInt7422; local29++) {
					@Pc(39) Class217 local39 = Static421.aClass217ArrayArrayArray5[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort77 > 0) {
							local39.aShort77 = (short) (local39.aShort77 * -1);
						}
						if (local39.aShort75 > 0) {
							local39.aShort75 = (short) (local39.aShort75 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static68.anInt1380; local25++) {
			for (local29 = 0; local29 < Static357.anInt5961; local29++) {
				for (@Pc(93) int local93 = 0; local93 < Static429.anInt7422; local93++) {
					@Pc(103) Class217 local103 = Static421.aClass217ArrayArrayArray5[local25][local93][local29];
					if (local103 != null) {
						@Pc(126) boolean local126 = Static421.aClass217ArrayArrayArray5[0][local93][local29] != null && Static421.aClass217ArrayArrayArray5[0][local93][local29].aClass217_1 != null;
						@Pc(134) int local134;
						@Pc(136) int local136;
						@Pc(150) Class217 local150;
						@Pc(158) int local158;
						@Pc(321) int local321;
						@Pc(337) int local337;
						@Pc(344) int local344;
						@Pc(360) int local360;
						@Pc(367) int local367;
						@Pc(371) int local371;
						@Pc(375) int local375;
						@Pc(381) int local381;
						@Pc(420) int local420;
						@Pc(424) int local424;
						if (local103.aShort75 < 0) {
							local134 = local29;
							local136 = local29;
							local150 = Static421.aClass217ArrayArrayArray5[local25][local93][local29 - 1];
							local158 = Static20.aClass61Array2[local25].method8580(local29, local93);
							while (local134 > 0 && local150 != null && local150.aShort75 < 0 && local103.aShort75 == local150.aShort75 && local103.aShort74 == local150.aShort74 && local158 == Static20.aClass61Array2[local25].method8580(local134 - 1, local93) && (local134 - 1 <= 0 || Static20.aClass61Array2[local25].method8580(local134 - 2, local93) == local158)) {
								local134--;
								local150 = Static421.aClass217ArrayArrayArray5[local25][local93][local134 - 1];
							}
							for (local150 = Static421.aClass217ArrayArrayArray5[local25][local93][local29 + 1]; local136 < Static429.anInt7422 && local150 != null && local150.aShort75 < 0 && local103.aShort75 == local150.aShort75 && local103.aShort74 == local150.aShort74 && local158 == Static20.aClass61Array2[local25].method8580(local136 + 1, local93) && (local136 + 1 >= Static429.anInt7422 || local158 == Static20.aClass61Array2[local25].method8580(local136 + 2, local93)); local150 = Static421.aClass217ArrayArrayArray5[local25][local93][local136 + 1]) {
								local136++;
							}
							local321 = local25 + 1 - local25;
							local337 = Static20.aClass61Array2[local126 ? local25 + 1 : local25].method8580(local134, local93);
							local344 = local103.aShort75 * local321 + local337;
							local360 = Static20.aClass61Array2[local126 ? local25 + 1 : local25].method8580(local136 + 1, local93);
							local367 = local321 * local103.aShort75 + local360;
							local371 = local93 << Static115.anInt2156;
							local375 = local134 << Static115.anInt2156;
							local381 = Static302.anInt5267 + (local136 << Static115.anInt2156);
							Static108.aClass34Array3[Static368.anInt6139++] = new Class34(1, local25, local103.aShort74 + local371, local371 - -local103.aShort74, local371 + local103.aShort74, local103.aShort74 + local371, local337, local360, local367, local344, local375, local381, local381, local375);
							for (local420 = local25; local420 <= local25; local420++) {
								for (local424 = local134; local424 <= local136; local424++) {
									Static421.aClass217ArrayArrayArray5[local420][local93][local424].aShort75 = (short) (Static421.aClass217ArrayArrayArray5[local420][local93][local424].aShort75 * -1);
								}
							}
						}
						if (local103.aShort77 < 0) {
							local134 = local93;
							local136 = local93;
							local150 = Static421.aClass217ArrayArrayArray5[local25][local93 - 1][local29];
							local158 = Static20.aClass61Array2[local25].method8580(local29, local93);
							while (local134 > 0 && local150 != null && local150.aShort77 < 0 && local103.aShort77 == local150.aShort77 && local150.aShort76 == local103.aShort76 && Static20.aClass61Array2[local25].method8580(local29, local134 - 1) == local158 && (local134 - 1 <= 0 || Static20.aClass61Array2[local25].method8580(local29, local134 - 2) == local158)) {
								local134--;
								local150 = Static421.aClass217ArrayArrayArray5[local25][local134 - 1][local29];
							}
							for (local150 = Static421.aClass217ArrayArrayArray5[local25][local93 + 1][local29]; Static357.anInt5961 > local136 && local150 != null && local150.aShort77 < 0 && local103.aShort77 == local150.aShort77 && local103.aShort76 == local150.aShort76 && local158 == Static20.aClass61Array2[local25].method8580(local29, local136 + 1) && (Static357.anInt5961 <= local136 + 1 || Static20.aClass61Array2[local25].method8580(local29, local136 + 2) == local158); local150 = Static421.aClass217ArrayArrayArray5[local25][local136 + 1][local29]) {
								local136++;
							}
							local321 = local25 + 1 - local25;
							local337 = Static20.aClass61Array2[local126 ? local25 + 1 : local25].method8580(local29, local134);
							local344 = local103.aShort77 * local321 + local337;
							local360 = Static20.aClass61Array2[local126 ? local25 + 1 : local25].method8580(local29, local136 + 1);
							local367 = local321 * local103.aShort77 + local360;
							local371 = local134 << Static115.anInt2156;
							local375 = (local136 << Static115.anInt2156) + Static302.anInt5267;
							local381 = local29 << Static115.anInt2156;
							Static108.aClass34Array3[Static368.anInt6139++] = new Class34(2, local25, local371, local375, local375, local371, local337, local360, local367, local344, local381 + local103.aShort76, local381 - -local103.aShort76, local381 + local103.aShort76, local381 + local103.aShort76);
							for (local420 = local25; local420 <= local25; local420++) {
								for (local424 = local134; local424 <= local136; local424++) {
									Static421.aClass217ArrayArrayArray5[local420][local424][local29].aShort77 = (short) (Static421.aClass217ArrayArrayArray5[local420][local424][local29].aShort77 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static633.aBoolean755 = true;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "([SII)[S")
	public static short[] method1392(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static652.method4547(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!fc;Lclient!la;B)V")
	public static void method1393(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class207 arg1) {
		Static493.aClass207_105 = arg1;
		Static193.aClass100_13 = arg0;
		Static378.aString68 = "";
		if (Class273.aString81.startsWith("win")) {
			Static378.aString68 = Static378.aString68 + "windows/";
		} else if (Class273.aString81.startsWith("linux")) {
			Static378.aString68 = Static378.aString68 + "linux/";
		} else if (Class273.aString81.startsWith("mac")) {
			Static378.aString68 = Static378.aString68 + "macos/";
		}
		if (Static193.aClass100_13.aBoolean192) {
			Static378.aString68 = Static378.aString68 + "msjava/";
		} else if (Class273.aString82.startsWith("amd64") || Class273.aString82.startsWith("x86_64")) {
			Static378.aString68 = Static378.aString68 + "x86_64/";
		} else if (Class273.aString82.startsWith("i386") || Class273.aString82.startsWith("i486") || Class273.aString82.startsWith("i586") || Class273.aString82.startsWith("x86")) {
			Static378.aString68 = Static378.aString68 + "x86/";
		} else if (Class273.aString82.startsWith("ppc")) {
			Static378.aString68 = Static378.aString68 + "ppc/";
		} else {
			Static378.aString68 = Static378.aString68 + "universal/";
		}
	}
}
