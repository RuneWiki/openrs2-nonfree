import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Lclient!kk;")
	public static Class108 aClass108_2;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "[I")
	private static int[] anIntArray162 = new int[3];

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString112 = "Started 3d Library";

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)Z")
	public static boolean method1550() {
		return Static227.anInt4358 == 0 ? Static46.aClass4_Sub6_Sub2_3.method2504() : true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!jl;)V")
	public static void method1551(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3_Sub13 arg1) {
		Static76.anInt5743 = 0;
		@Pc(5) int local5 = 0;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray234;
		@Pc(23) int[] local23 = arg1.anIntArray233;
		@Pc(25) byte local25 = -1;
		@Pc(627) int local627;
		try {
			@Pc(27) int local27 = 0;
			label4471: while (true) {
				local27++;
				if (local27 > arg0) {
					throw new RuntimeException("slow");
				}
				local11++;
				@Pc(45) int local45 = local16[local11];
				@Pc(638) int local638;
				@Pc(471) int local471;
				@Pc(423) String local423;
				if (local45 < 100) {
					if (local45 == 0) {
						Static272.anIntArray571[local5++] = local23[local11];
						continue;
					}
					@Pc(70) int local70;
					if (local45 == 1) {
						local70 = local23[local11];
						Static272.anIntArray571[local5++] = Static2.anIntArray2[local70];
						continue;
					}
					if (local45 == 2) {
						local70 = local23[local11];
						local5--;
						Static222.method3580(local70, Static272.anIntArray571[local5]);
						continue;
					}
					if (local45 == 3) {
						Static51.aStringArray5[local13++] = arg1.aStringArray19[local11];
						continue;
					}
					if (local45 == 6) {
						local11 += local23[local11];
						continue;
					}
					if (local45 == 7) {
						local5 -= 2;
						if (Static272.anIntArray571[local5] != Static272.anIntArray571[local5 + 1]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 8) {
						local5 -= 2;
						if (Static272.anIntArray571[local5] == Static272.anIntArray571[local5 + 1]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 9) {
						local5 -= 2;
						if (Static272.anIntArray571[local5] < Static272.anIntArray571[local5 + 1]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 10) {
						local5 -= 2;
						if (Static272.anIntArray571[local5 + 1] < Static272.anIntArray571[local5]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 21) {
						if (Static76.anInt5743 == 0) {
							return;
						}
						@Pc(242) Class177 local242 = Static292.aClass177Array1[--Static76.anInt5743];
						Static150.aStringArray21 = local242.aStringArray36;
						arg1 = local242.aClass4_Sub3_Sub13_1;
						local11 = local242.anInt5354;
						local23 = arg1.anIntArray233;
						Static154.anIntArray272 = local242.anIntArray613;
						local16 = arg1.anIntArray234;
						continue;
					}
					if (local45 == 25) {
						local70 = local23[local11];
						Static272.anIntArray571[local5++] = Static281.method4348(local70);
						continue;
					}
					if (local45 == 27) {
						local70 = local23[local11];
						local5--;
						Static155.method1938(local70, Static272.anIntArray571[local5]);
						continue;
					}
					if (local45 == 31) {
						local5 -= 2;
						if (Static272.anIntArray571[local5] <= Static272.anIntArray571[local5 + 1]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 32) {
						local5 -= 2;
						if (Static272.anIntArray571[local5 + 1] <= Static272.anIntArray571[local5]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 33) {
						Static272.anIntArray571[local5++] = Static154.anIntArray272[local23[local11]];
						continue;
					}
					@Pc(367) int local367;
					if (local45 == 34) {
						local367 = local23[local11];
						local5--;
						Static154.anIntArray272[local367] = Static272.anIntArray571[local5];
						continue;
					}
					if (local45 == 35) {
						Static51.aStringArray5[local13++] = Static150.aStringArray21[local23[local11]];
						continue;
					}
					if (local45 == 36) {
						local367 = local23[local11];
						local13--;
						Static150.aStringArray21[local367] = Static51.aStringArray5[local13];
						continue;
					}
					if (local45 == 37) {
						local70 = local23[local11];
						local13 -= local70;
						local423 = Static306.method4752(Static51.aStringArray5, local13, local70);
						Static51.aStringArray5[local13++] = local423;
						continue;
					}
					if (local45 == 38) {
						local5--;
						continue;
					}
					if (local45 == 39) {
						local13--;
						continue;
					}
					if (local45 == 40) {
						local70 = local23[local11];
						@Pc(461) Class4_Sub3_Sub13 local461 = Static44.method718(local70);
						@Pc(465) int[] local465 = new int[local461.anInt2662];
						@Pc(469) String[] local469 = new String[local461.anInt2660];
						for (local471 = 0; local471 < local461.anInt2658; local471++) {
							local465[local471] = Static272.anIntArray571[local471 + local5 - local461.anInt2658];
						}
						for (local471 = 0; local471 < local461.anInt2657; local471++) {
							local469[local471] = Static51.aStringArray5[local13 + local471 - local461.anInt2657];
						}
						local5 -= local461.anInt2658;
						local13 -= local461.anInt2657;
						@Pc(534) Class177 local534 = new Class177();
						local534.anIntArray613 = Static154.anIntArray272;
						local534.aStringArray36 = Static150.aStringArray21;
						local534.anInt5354 = local11;
						local534.aClass4_Sub3_Sub13_1 = arg1;
						if (Static76.anInt5743 >= Static292.aClass177Array1.length) {
							throw new RuntimeException();
						}
						Static292.aClass177Array1[Static76.anInt5743++] = local534;
						Static150.aStringArray21 = local469;
						arg1 = local461;
						local11 = -1;
						local16 = local461.anIntArray234;
						Static154.anIntArray272 = local465;
						local23 = local461.anIntArray233;
						continue;
					}
					if (local45 == 42) {
						Static272.anIntArray571[local5++] = Static227.anIntArray462[local23[local11]];
						continue;
					}
					if (local45 == 43) {
						local70 = local23[local11];
						local5--;
						Static227.anIntArray462[local70] = Static272.anIntArray571[local5];
						Static208.method3409(local70);
						continue;
					}
					if (local45 == 44) {
						local627 = local23[local11] & 0xFFFF;
						local70 = local23[local11] >> 16;
						local5--;
						local638 = Static272.anIntArray571[local5];
						if (local638 >= 0 && local638 <= 5000) {
							@Pc(651) byte local651 = -1;
							if (local627 == 105) {
								local651 = 0;
							}
							Static289.anIntArray617[local70] = local638;
							local471 = 0;
							while (true) {
								if (local471 >= local638) {
									continue label4471;
								}
								Static102.anIntArrayArray17[local70][local471] = local651;
								local471++;
							}
						}
						throw new RuntimeException();
					}
					if (local45 == 45) {
						local70 = local23[local11];
						local5--;
						local627 = Static272.anIntArray571[local5];
						if (local627 >= 0 && local627 < Static289.anIntArray617[local70]) {
							Static272.anIntArray571[local5++] = Static102.anIntArrayArray17[local70][local627];
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 46) {
						local70 = local23[local11];
						local5 -= 2;
						local627 = Static272.anIntArray571[local5];
						if (local627 >= 0 && local627 < Static289.anIntArray617[local70]) {
							Static102.anIntArrayArray17[local70][local627] = Static272.anIntArray571[local5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 47) {
						@Pc(771) String local771 = Static16.aStringArray3[local23[local11]];
						if (local771 == null) {
							local771 = "null";
						}
						Static51.aStringArray5[local13++] = local771;
						continue;
					}
					if (local45 == 48) {
						local70 = local23[local11];
						local13--;
						Static16.aStringArray3[local70] = Static51.aStringArray5[local13];
						Static159.method4859(local70);
						continue;
					}
					if (local45 == 51) {
						@Pc(814) Class85 local814 = arg1.aClass85Array1[local23[local11]];
						local5--;
						@Pc(826) Class4_Sub32 local826 = (Class4_Sub32) local814.method1845((long) Static272.anIntArray571[local5]);
						if (local826 != null) {
							local11 += local826.anInt5435;
						}
						continue;
					}
				}
				@Pc(846) boolean local846;
				if (local23[local11] == 1) {
					local846 = true;
				} else {
					local846 = false;
				}
				@Pc(14079) Class189 local14079;
				@Pc(14049) Class189 local14049;
				@Pc(8874) int local8874;
				@Pc(885) Class189 local885;
				@Pc(936) int local936;
				if (local45 >= 300) {
					@Pc(11712) boolean local11712;
					if (local45 < 500) {
						if (local45 == 403) {
							local5 -= 2;
							local627 = Static272.anIntArray571[local5];
							local638 = Static272.anIntArray571[local5 + 1];
							for (local936 = 0; local936 < Static265.anIntArray550.length; local936++) {
								if (local627 == Static265.anIntArray550[local936]) {
									Static154.aClass53_Sub1_Sub1_2.aClass147_2.method3641(local936, local638);
									continue label4471;
								}
							}
							local936 = 0;
							while (true) {
								if (Static240.anIntArray487.length <= local936) {
									continue label4471;
								}
								if (Static240.anIntArray487[local936] == local627) {
									Static154.aClass53_Sub1_Sub1_2.aClass147_2.method3641(local936, local638);
									continue label4471;
								}
								local936++;
							}
						}
						if (local45 == 404) {
							local5 -= 2;
							local627 = Static272.anIntArray571[local5];
							local638 = Static272.anIntArray571[local5 + 1];
							Static154.aClass53_Sub1_Sub1_2.aClass147_2.method3650(local627, local638);
							continue;
						}
						if (local45 == 410) {
							local5--;
							local11712 = Static272.anIntArray571[local5] != 0;
							Static154.aClass53_Sub1_Sub1_2.aClass147_2.method3642(local11712);
							continue;
						}
					} else {
						@Pc(1075) boolean local1075;
						if ((local45 < 1000 || local45 >= 1100) && (local45 < 2000 || local45 >= 2100)) {
							@Pc(1590) String local1590;
							if (local45 >= 1100 && local45 < 1200 || local45 >= 2100 && local45 < 2200) {
								if (local45 >= 2000) {
									local5--;
									local885 = Static114.method1814(Static272.anIntArray571[local5]);
									local45 -= 1000;
								} else {
									local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
								}
								if (local45 == 1100) {
									local5 -= 2;
									local885.anInt5936 = Static272.anIntArray571[local5];
									if (local885.anInt5889 - local885.anInt5897 < local885.anInt5936) {
										local885.anInt5936 = local885.anInt5889 - local885.anInt5897;
									}
									if (local885.anInt5936 < 0) {
										local885.anInt5936 = 0;
									}
									local885.anInt5935 = Static272.anIntArray571[local5 + 1];
									if (local885.anInt5935 > local885.anInt5891 - local885.anInt5953) {
										local885.anInt5935 = local885.anInt5891 - local885.anInt5953;
									}
									if (local885.anInt5935 < 0) {
										local885.anInt5935 = 0;
									}
									Static205.method3283(local885);
									if (local885.anInt5972 == -1) {
										Static7.method111(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1101) {
									local5--;
									local885.anInt5937 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									if (local885.anInt5972 == -1) {
										Static262.method4129(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1102) {
									local5--;
									local885.aBoolean414 = Static272.anIntArray571[local5] == 1;
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1103) {
									local5--;
									local885.anInt5907 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1104) {
									local5--;
									local885.anInt5903 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1105) {
									local5--;
									local885.anInt5951 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1106) {
									local5--;
									local885.anInt5962 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1107) {
									local5--;
									local885.aBoolean411 = Static272.anIntArray571[local5] == 1;
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1108) {
									local885.anInt5943 = 1;
									local5--;
									local885.anInt5899 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									if (local885.anInt5972 == -1) {
										Static51.method779(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1109) {
									local5 -= 6;
									local885.anInt5967 = Static272.anIntArray571[local5];
									local885.anInt5910 = Static272.anIntArray571[local5 + 1];
									local885.anInt5948 = Static272.anIntArray571[local5 + 2];
									local885.anInt5980 = Static272.anIntArray571[local5 + 3];
									local885.anInt5890 = Static272.anIntArray571[local5 + 4];
									local885.anInt5922 = Static272.anIntArray571[local5 + 5];
									Static205.method3283(local885);
									if (local885.anInt5972 == -1) {
										Static131.method1995(local885.anInt5918);
										Static75.method1224(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1110) {
									local5--;
									local638 = Static272.anIntArray571[local5];
									if (local638 != local885.anInt5895) {
										local885.anInt5901 = 0;
										local885.anInt5895 = local638;
										local885.anInt5983 = 1;
										local885.anInt5896 = 0;
										Static205.method3283(local885);
									}
									if (local885.anInt5972 == -1) {
										Static280.method680(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1111) {
									local5--;
									local885.aBoolean419 = Static272.anIntArray571[local5] == 1;
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1112) {
									local13--;
									local1590 = Static51.aStringArray5[local13];
									if (!local1590.equals(local885.aString358)) {
										local885.aString358 = local1590;
										Static205.method3283(local885);
									}
									if (local885.anInt5972 == -1) {
										Static305.method4715(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1113) {
									local5--;
									local885.anInt5958 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1114) {
									local5 -= 3;
									local885.anInt5928 = Static272.anIntArray571[local5];
									local885.anInt5926 = Static272.anIntArray571[local5 + 1];
									local885.anInt5952 = Static272.anIntArray571[local5 + 2];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1115) {
									local5--;
									local885.aBoolean416 = Static272.anIntArray571[local5] == 1;
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1116) {
									local5--;
									local885.anInt5979 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1117) {
									local5--;
									local885.anInt5938 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1118) {
									local5--;
									local885.aBoolean405 = Static272.anIntArray571[local5] == 1;
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1119) {
									local5--;
									local885.aBoolean407 = Static272.anIntArray571[local5] == 1;
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1120) {
									local5 -= 2;
									local885.anInt5889 = Static272.anIntArray571[local5];
									local885.anInt5891 = Static272.anIntArray571[local5 + 1];
									Static205.method3283(local885);
									if (local885.anInt5915 == 0) {
										Static272.method4288(false, local885);
									}
									continue;
								}
								if (local45 == 1121) {
									local5 -= 2;
									local885.aShort50 = (short) Static272.anIntArray571[local5];
									local885.aShort49 = (short) Static272.anIntArray571[local5 + 1];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1122) {
									local5--;
									local885.aBoolean413 = Static272.anIntArray571[local5] == 1;
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1123) {
									local5--;
									local885.anInt5922 = Static272.anIntArray571[local5];
									Static205.method3283(local885);
									if (local885.anInt5972 == -1) {
										Static131.method1995(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1124) {
									local5--;
									local638 = Static272.anIntArray571[local5];
									local885.aBoolean410 = local638 == 1;
									Static205.method3283(local885);
									continue;
								}
							} else if (local45 >= 1200 && local45 < 1300 || !(local45 < 2200 || local45 >= 2300)) {
								if (local45 < 2000) {
									local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
								} else {
									local45 -= 1000;
									local5--;
									local885 = Static114.method1814(Static272.anIntArray571[local5]);
								}
								Static205.method3283(local885);
								if (local45 == 1200 || local45 == 1205 || local45 == 1208 || local45 == 1209) {
									local5 -= 2;
									local936 = Static272.anIntArray571[local5 + 1];
									local638 = Static272.anIntArray571[local5];
									if (local885.anInt5972 == -1) {
										Static280.method676(local885.anInt5918);
										Static131.method1995(local885.anInt5918);
										Static75.method1224(local885.anInt5918);
									}
									if (local638 == -1) {
										local885.anInt5943 = 1;
										local885.anInt5899 = -1;
										local885.anInt5942 = -1;
										continue;
									}
									local885.anInt5966 = local936;
									if (local45 == 1208 || local45 == 1209) {
										local885.aBoolean420 = true;
									} else {
										local885.aBoolean420 = false;
									}
									local885.anInt5942 = local638;
									@Pc(2020) Class165 local2020 = Static287.method4398(local638);
									local885.anInt5910 = local2020.anInt5099;
									local885.anInt5967 = local2020.anInt5066;
									local885.anInt5948 = local2020.anInt5081;
									local885.anInt5980 = local2020.anInt5096;
									local885.anInt5922 = local2020.anInt5058;
									local885.anInt5890 = local2020.anInt5063;
									if (local45 == 1205) {
										local885.aBoolean406 = false;
									} else {
										local885.aBoolean406 = true;
									}
									if (local885.anInt5961 > 0) {
										local885.anInt5922 = local885.anInt5922 * 32 / local885.anInt5961;
									} else if (local885.anInt5931 > 0) {
										local885.anInt5922 = local885.anInt5922 * 32 / local885.anInt5931;
									}
									continue;
								}
								if (local45 == 1201) {
									local885.anInt5943 = 2;
									local5--;
									local885.anInt5899 = Static272.anIntArray571[local5];
									if (local885.anInt5972 == -1) {
										Static51.method779(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1202) {
									local885.anInt5943 = 3;
									local885.anInt5899 = Static154.aClass53_Sub1_Sub1_2.aClass147_2.method3648();
									if (local885.anInt5972 == -1) {
										Static51.method779(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1203) {
									local885.anInt5943 = 6;
									local5--;
									local885.anInt5899 = Static272.anIntArray571[local5];
									if (local885.anInt5972 == -1) {
										Static51.method779(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1204) {
									local885.anInt5943 = 5;
									local5--;
									local885.anInt5899 = Static272.anIntArray571[local5];
									if (local885.anInt5972 == -1) {
										Static51.method779(local885.anInt5918);
									}
									continue;
								}
								if (local45 == 1206) {
									local5 -= 4;
									local885.anInt5976 = Static272.anIntArray571[local5];
									local885.anInt5920 = Static272.anIntArray571[local5 + 1];
									local885.anInt5981 = Static272.anIntArray571[local5 + 2];
									local885.anInt5902 = Static272.anIntArray571[local5 + 3];
									Static205.method3283(local885);
									continue;
								}
								if (local45 == 1207) {
									local5 -= 2;
									local885.anInt5969 = Static272.anIntArray571[local5];
									local885.anInt5921 = Static272.anIntArray571[local5 + 1];
									Static205.method3283(local885);
									continue;
								}
							} else if (local45 >= 1300 && local45 < 1400 || local45 >= 2300 && local45 < 2400) {
								if (local45 < 2000) {
									local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
								} else {
									local45 -= 1000;
									local5--;
									local885 = Static114.method1814(Static272.anIntArray571[local5]);
								}
								if (local45 == 1300) {
									local5--;
									local638 = Static272.anIntArray571[local5] - 1;
									if (local638 >= 0 && local638 <= 9) {
										local13--;
										local885.method4759(Static51.aStringArray5[local13], local638);
										continue;
									}
									local13--;
									continue;
								}
								if (local45 == 1301) {
									local5 -= 2;
									local936 = Static272.anIntArray571[local5 + 1];
									local638 = Static272.anIntArray571[local5];
									local885.aClass189_17 = Static152.method2432(local638, local936);
									continue;
								}
								if (local45 == 1302) {
									local5--;
									local885.aBoolean403 = Static272.anIntArray571[local5] == 1;
									continue;
								}
								if (local45 == 1303) {
									local5--;
									local885.anInt5900 = Static272.anIntArray571[local5];
									continue;
								}
								if (local45 == 1304) {
									local5--;
									local885.anInt5957 = Static272.anIntArray571[local5];
									continue;
								}
								if (local45 == 1305) {
									local13--;
									local885.aString359 = Static51.aStringArray5[local13];
									continue;
								}
								if (local45 == 1306) {
									local13--;
									local885.aString362 = Static51.aStringArray5[local13];
									continue;
								}
								if (local45 == 1307) {
									local885.aStringArray43 = null;
									continue;
								}
								if (local45 == 1308) {
									local5--;
									local885.anInt5894 = Static272.anIntArray571[local5];
									local5--;
									local885.anInt5934 = Static272.anIntArray571[local5];
									continue;
								}
								if (local45 == 1309) {
									local5--;
									local638 = Static272.anIntArray571[local5];
									local5--;
									local936 = Static272.anIntArray571[local5];
									if (local936 >= 1 && local936 <= 10) {
										local885.method4762(local936 - 1, local638);
									}
									continue;
								}
								if (local45 == 1310) {
									local13--;
									local885.aString361 = Static51.aStringArray5[local13];
									continue;
								}
							} else {
								@Pc(2586) int local2586;
								if (local45 >= 1400 && local45 < 1500 || local45 >= 2400 && local45 < 2500) {
									if (local45 < 2000) {
										local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
									} else {
										local5--;
										local885 = Static114.method1814(Static272.anIntArray571[local5]);
										local45 -= 1000;
									}
									local13--;
									local1590 = Static51.aStringArray5[local13];
									@Pc(2524) int[] local2524 = null;
									if (local1590.length() > 0 && local1590.charAt(local1590.length() - 1) == 'Y') {
										local5--;
										local471 = Static272.anIntArray571[local5];
										if (local471 > 0) {
											local2524 = new int[local471];
											while (local471-- > 0) {
												local5--;
												local2524[local471] = Static272.anIntArray571[local5];
											}
										}
										local1590 = local1590.substring(0, local1590.length() - 1);
									}
									@Pc(2581) Object[] local2581 = new Object[local1590.length() + 1];
									for (local2586 = local2581.length - 1; local2586 >= 1; local2586--) {
										if (local1590.charAt(local2586 - 1) == 's') {
											local13--;
											local2581[local2586] = Static51.aStringArray5[local13];
										} else {
											local5--;
											local2581[local2586] = Integer.valueOf(Static272.anIntArray571[local5]);
										}
									}
									local5--;
									local2586 = Static272.anIntArray571[local5];
									if (local2586 == -1) {
										local2581 = null;
									} else {
										local2581[0] = Integer.valueOf(local2586);
									}
									local885.aBoolean404 = true;
									if (local45 == 1400) {
										local885.anObjectArray29 = local2581;
									} else if (local45 == 1401) {
										local885.anObjectArray8 = local2581;
									} else if (local45 == 1402) {
										local885.anObjectArray30 = local2581;
									} else if (local45 == 1403) {
										local885.anObjectArray26 = local2581;
									} else if (local45 == 1404) {
										local885.anObjectArray28 = local2581;
									} else if (local45 == 1405) {
										local885.anObjectArray11 = local2581;
									} else if (local45 == 1406) {
										local885.anObjectArray17 = local2581;
									} else if (local45 == 1407) {
										local885.anObjectArray24 = local2581;
										local885.anIntArray669 = local2524;
									} else if (local45 == 1408) {
										local885.anObjectArray16 = local2581;
									} else if (local45 == 1409) {
										local885.anObjectArray18 = local2581;
									} else if (local45 == 1410) {
										local885.anObjectArray7 = local2581;
									} else if (local45 == 1411) {
										local885.anObjectArray15 = local2581;
									} else if (local45 == 1412) {
										local885.anObjectArray9 = local2581;
									} else if (local45 == 1414) {
										local885.anIntArray670 = local2524;
										local885.anObjectArray3 = local2581;
									} else if (local45 == 1415) {
										local885.anObjectArray25 = local2581;
										local885.anIntArray667 = local2524;
									} else if (local45 == 1416) {
										local885.anObjectArray13 = local2581;
									} else if (local45 == 1417) {
										local885.anObjectArray20 = local2581;
									} else if (local45 == 1418) {
										local885.anObjectArray6 = local2581;
									} else if (local45 == 1419) {
										local885.anObjectArray10 = local2581;
									} else if (local45 == 1420) {
										local885.anObjectArray12 = local2581;
									} else if (local45 == 1421) {
										local885.anObjectArray23 = local2581;
									} else if (local45 == 1422) {
										local885.anObjectArray31 = local2581;
									} else if (local45 == 1423) {
										local885.anObjectArray19 = local2581;
									} else if (local45 == 1424) {
										local885.anObjectArray4 = local2581;
									} else if (local45 == 1425) {
										local885.anObjectArray14 = local2581;
									} else if (local45 == 1426) {
										local885.anObjectArray5 = local2581;
									} else if (local45 == 1427) {
										local885.anObjectArray32 = local2581;
									} else if (local45 == 1428) {
										local885.anObjectArray27 = local2581;
										local885.anIntArray673 = local2524;
									} else if (local45 == 1429) {
										local885.anObjectArray21 = local2581;
										local885.anIntArray665 = local2524;
									}
									continue;
								}
								if (local45 < 1600) {
									local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
									if (local45 == 1500) {
										Static272.anIntArray571[local5++] = local885.anInt5964;
										continue;
									}
									if (local45 == 1501) {
										Static272.anIntArray571[local5++] = local885.anInt5892;
										continue;
									}
									if (local45 == 1502) {
										Static272.anIntArray571[local5++] = local885.anInt5897;
										continue;
									}
									if (local45 == 1503) {
										Static272.anIntArray571[local5++] = local885.anInt5953;
										continue;
									}
									if (local45 == 1504) {
										Static272.anIntArray571[local5++] = local885.aBoolean418 ? 1 : 0;
										continue;
									}
									if (local45 == 1505) {
										Static272.anIntArray571[local5++] = local885.anInt5941;
										continue;
									}
								} else if (local45 < 1700) {
									local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
									if (local45 == 1600) {
										Static272.anIntArray571[local5++] = local885.anInt5936;
										continue;
									}
									if (local45 == 1601) {
										Static272.anIntArray571[local5++] = local885.anInt5935;
										continue;
									}
									if (local45 == 1602) {
										Static51.aStringArray5[local13++] = local885.aString358;
										continue;
									}
									if (local45 == 1603) {
										Static272.anIntArray571[local5++] = local885.anInt5889;
										continue;
									}
									if (local45 == 1604) {
										Static272.anIntArray571[local5++] = local885.anInt5891;
										continue;
									}
									if (local45 == 1605) {
										Static272.anIntArray571[local5++] = local885.anInt5922;
										continue;
									}
									if (local45 == 1606) {
										Static272.anIntArray571[local5++] = local885.anInt5948;
										continue;
									}
									if (local45 == 1607) {
										Static272.anIntArray571[local5++] = local885.anInt5890;
										continue;
									}
									if (local45 == 1608) {
										Static272.anIntArray571[local5++] = local885.anInt5980;
										continue;
									}
									if (local45 == 1609) {
										Static272.anIntArray571[local5++] = local885.anInt5907;
										continue;
									}
									if (local45 == 1610) {
										Static272.anIntArray571[local5++] = local885.anInt5967;
										continue;
									}
									if (local45 == 1611) {
										Static272.anIntArray571[local5++] = local885.anInt5910;
										continue;
									}
									if (local45 == 1612) {
										Static272.anIntArray571[local5++] = local885.anInt5951;
										continue;
									}
								} else if (local45 < 1800) {
									local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
									if (local45 == 1700) {
										Static272.anIntArray571[local5++] = local885.anInt5942;
										continue;
									}
									if (local45 == 1701) {
										if (local885.anInt5942 == -1) {
											Static272.anIntArray571[local5++] = 0;
										} else {
											Static272.anIntArray571[local5++] = local885.anInt5966;
										}
										continue;
									}
									if (local45 == 1702) {
										Static272.anIntArray571[local5++] = local885.anInt5972;
										continue;
									}
								} else if (local45 < 1900) {
									local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
									if (local45 == 1800) {
										Static272.anIntArray571[local5++] = Static41.method687(local885).method3286();
										continue;
									}
									if (local45 == 1801) {
										local5--;
										local638 = Static272.anIntArray571[local5];
										local638--;
										if (local885.aStringArray43 != null && local885.aStringArray43.length > local638 && local885.aStringArray43[local638] != null) {
											Static51.aStringArray5[local13++] = local885.aStringArray43[local638];
											continue;
										}
										Static51.aStringArray5[local13++] = "";
										continue;
									}
									if (local45 == 1802) {
										if (local885.aString359 == null) {
											Static51.aStringArray5[local13++] = "";
										} else {
											Static51.aStringArray5[local13++] = local885.aString359;
										}
										continue;
									}
								} else if (local45 < 2600) {
									local5--;
									local885 = Static114.method1814(Static272.anIntArray571[local5]);
									if (local45 == 2500) {
										Static272.anIntArray571[local5++] = local885.anInt5964;
										continue;
									}
									if (local45 == 2501) {
										Static272.anIntArray571[local5++] = local885.anInt5892;
										continue;
									}
									if (local45 == 2502) {
										Static272.anIntArray571[local5++] = local885.anInt5897;
										continue;
									}
									if (local45 == 2503) {
										Static272.anIntArray571[local5++] = local885.anInt5953;
										continue;
									}
									if (local45 == 2504) {
										Static272.anIntArray571[local5++] = local885.aBoolean418 ? 1 : 0;
										continue;
									}
									if (local45 == 2505) {
										Static272.anIntArray571[local5++] = local885.anInt5941;
										continue;
									}
								} else if (local45 < 2700) {
									local5--;
									local885 = Static114.method1814(Static272.anIntArray571[local5]);
									if (local45 == 2600) {
										Static272.anIntArray571[local5++] = local885.anInt5936;
										continue;
									}
									if (local45 == 2601) {
										Static272.anIntArray571[local5++] = local885.anInt5935;
										continue;
									}
									if (local45 == 2602) {
										Static51.aStringArray5[local13++] = local885.aString358;
										continue;
									}
									if (local45 == 2603) {
										Static272.anIntArray571[local5++] = local885.anInt5889;
										continue;
									}
									if (local45 == 2604) {
										Static272.anIntArray571[local5++] = local885.anInt5891;
										continue;
									}
									if (local45 == 2605) {
										Static272.anIntArray571[local5++] = local885.anInt5922;
										continue;
									}
									if (local45 == 2606) {
										Static272.anIntArray571[local5++] = local885.anInt5948;
										continue;
									}
									if (local45 == 2607) {
										Static272.anIntArray571[local5++] = local885.anInt5890;
										continue;
									}
									if (local45 == 2608) {
										Static272.anIntArray571[local5++] = local885.anInt5980;
										continue;
									}
									if (local45 == 2609) {
										Static272.anIntArray571[local5++] = local885.anInt5907;
										continue;
									}
									if (local45 == 2610) {
										Static272.anIntArray571[local5++] = local885.anInt5967;
										continue;
									}
									if (local45 == 2611) {
										Static272.anIntArray571[local5++] = local885.anInt5910;
										continue;
									}
									if (local45 == 2612) {
										Static272.anIntArray571[local5++] = local885.anInt5951;
										continue;
									}
								} else if (local45 < 2800) {
									if (local45 == 2700) {
										local5--;
										local885 = Static114.method1814(Static272.anIntArray571[local5]);
										Static272.anIntArray571[local5++] = local885.anInt5942;
										continue;
									}
									if (local45 == 2701) {
										local5--;
										local885 = Static114.method1814(Static272.anIntArray571[local5]);
										if (local885.anInt5942 == -1) {
											Static272.anIntArray571[local5++] = 0;
										} else {
											Static272.anIntArray571[local5++] = local885.anInt5966;
										}
										continue;
									}
									if (local45 == 2702) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										@Pc(14176) Class4_Sub27 local14176 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local627);
										if (local14176 == null) {
											Static272.anIntArray571[local5++] = 0;
										} else {
											Static272.anIntArray571[local5++] = 1;
										}
										continue;
									}
									if (local45 == 2703) {
										local5--;
										local885 = Static114.method1814(Static272.anIntArray571[local5]);
										if (local885.aClass189Array4 == null) {
											Static272.anIntArray571[local5++] = 0;
											continue;
										}
										local638 = local885.aClass189Array4.length;
										for (local936 = 0; local936 < local885.aClass189Array4.length; local936++) {
											if (local885.aClass189Array4[local936] == null) {
												local638 = local936;
												break;
											}
										}
										Static272.anIntArray571[local5++] = local638;
										continue;
									}
									if (local45 == 2704 || local45 == 2705) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										@Pc(14272) Class4_Sub27 local14272 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local627);
										if (local14272 != null && local14272.anInt4621 == local638) {
											Static272.anIntArray571[local5++] = 1;
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
								} else if (local45 < 2900) {
									local5--;
									local885 = Static114.method1814(Static272.anIntArray571[local5]);
									if (local45 == 2800) {
										Static272.anIntArray571[local5++] = Static41.method687(local885).method3286();
										continue;
									}
									if (local45 == 2801) {
										local5--;
										local638 = Static272.anIntArray571[local5];
										local638--;
										if (local885.aStringArray43 != null && local638 < local885.aStringArray43.length && local885.aStringArray43[local638] != null) {
											Static51.aStringArray5[local13++] = local885.aStringArray43[local638];
											continue;
										}
										Static51.aStringArray5[local13++] = "";
										continue;
									}
									if (local45 == 2802) {
										if (local885.aString359 == null) {
											Static51.aStringArray5[local13++] = "";
										} else {
											Static51.aStringArray5[local13++] = local885.aString359;
										}
										continue;
									}
								} else if (local45 < 3200) {
									if (local45 == 3100) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static186.method4394("", 0, local423);
										continue;
									}
									if (local45 == 3101) {
										local5 -= 2;
										Static313.method4830(Static154.aClass53_Sub1_Sub1_2, Static272.anIntArray571[local5], Static272.anIntArray571[local5 + 1]);
										continue;
									}
									if (local45 == 3103) {
										Static138.method2064();
										continue;
									}
									if (local45 == 3104) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										local638 = 0;
										if (Static214.method3486(local423)) {
											local638 = Static47.method737(local423);
										}
										Static110.aClass4_Sub10_Sub1_1.method4687(219);
										Static110.aClass4_Sub10_Sub1_1.method4654(local638);
										continue;
									}
									if (local45 == 3105) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static110.aClass4_Sub10_Sub1_1.method4687(149);
										Static110.aClass4_Sub10_Sub1_1.method4619(Static108.method1747(local423));
										continue;
									}
									if (local45 == 3106) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static110.aClass4_Sub10_Sub1_1.method4687(164);
										Static110.aClass4_Sub10_Sub1_1.method4618(local423.length() + 1);
										Static110.aClass4_Sub10_Sub1_1.method4612(local423);
										continue;
									}
									if (local45 == 3107) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										local13--;
										local1590 = Static51.aStringArray5[local13];
										Static3.method7(local627, local1590);
										continue;
									}
									if (local45 == 3108) {
										local5 -= 3;
										local627 = Static272.anIntArray571[local5];
										local936 = Static272.anIntArray571[local5 + 2];
										local638 = Static272.anIntArray571[local5 + 1];
										local14049 = Static114.method1814(local936);
										Static80.method1401(local14049, local627, local638);
										continue;
									}
									if (local45 == 3109) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5];
										local14079 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
										Static80.method1401(local14079, local627, local638);
										continue;
									}
									if (local45 == 3110) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static110.aClass4_Sub10_Sub1_1.method4687(231);
										Static110.aClass4_Sub10_Sub1_1.method4668(local627);
										continue;
									}
								} else if (local45 < 3300) {
									if (local45 == 3200) {
										local5 -= 3;
										Static75.method1227(Static272.anIntArray571[local5 + 2], Static272.anIntArray571[local5], Static272.anIntArray571[local5 + 1], 255);
										continue;
									}
									if (local45 == 3201) {
										local5--;
										Static297.method4481(255, Static272.anIntArray571[local5]);
										continue;
									}
									if (local45 == 3202) {
										local5 -= 2;
										Static155.method1934(255, Static272.anIntArray571[local5 + 1], Static272.anIntArray571[local5]);
										continue;
									}
								} else if (local45 < 3400) {
									if (local45 == 3300) {
										Static272.anIntArray571[local5++] = Static50.anInt954;
										continue;
									}
									if (local45 == 3301) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static4.method70(local627, local638);
										continue;
									}
									if (local45 == 3302) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = Static134.method3298(local638, local627);
										continue;
									}
									if (local45 == 3303) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = Static75.method1226(local638, local627);
										continue;
									}
									if (local45 == 3304) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static18.method264(local627).anInt1963;
										continue;
									}
									if (local45 == 3305) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static294.anIntArray501[local627];
										continue;
									}
									if (local45 == 3306) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static279.anIntArray599[local627];
										continue;
									}
									if (local45 == 3307) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static299.anIntArray637[local627];
										continue;
									}
									if (local45 == 3308) {
										local627 = Static281.anInt5335;
										local638 = Static220.anInt3983 + (Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7);
										local936 = Static295.anInt5480 + (Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7);
										Static272.anIntArray571[local5++] = (local638 << 14) + (local627 << 28) + local936;
										continue;
									}
									if (local45 == 3309) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = local627 >> 14 & 0x3FFF;
										continue;
									}
									if (local45 == 3310) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = local627 >> 28;
										continue;
									}
									if (local45 == 3311) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = local627 & 0x3FFF;
										continue;
									}
									if (local45 == 3312) {
										Static272.anIntArray571[local5++] = Static293.aBoolean371 ? 1 : 0;
										continue;
									}
									if (local45 == 3313) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5] + 32768;
										Static272.anIntArray571[local5++] = Static4.method70(local627, local638);
										continue;
									}
									if (local45 == 3314) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5] + 32768;
										Static272.anIntArray571[local5++] = Static134.method3298(local638, local627);
										continue;
									}
									if (local45 == 3315) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5] + 32768;
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = Static75.method1226(local638, local627);
										continue;
									}
									if (local45 == 3316) {
										if (Static133.anInt2576 >= 2) {
											Static272.anIntArray571[local5++] = Static133.anInt2576;
										} else {
											Static272.anIntArray571[local5++] = 0;
										}
										continue;
									}
									if (local45 == 3317) {
										Static272.anIntArray571[local5++] = Static225.anInt4330;
										continue;
									}
									if (local45 == 3318) {
										Static272.anIntArray571[local5++] = Static254.anInt4847;
										continue;
									}
									if (local45 == 3321) {
										Static272.anIntArray571[local5++] = Static52.anInt2248;
										continue;
									}
									if (local45 == 3322) {
										Static272.anIntArray571[local5++] = Static91.anInt2048;
										continue;
									}
									if (local45 == 3323) {
										if (Static81.anInt1877 >= 5 && Static81.anInt1877 <= 9) {
											Static272.anIntArray571[local5++] = 1;
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
									if (local45 == 3324) {
										if (Static81.anInt1877 >= 5 && Static81.anInt1877 <= 9) {
											Static272.anIntArray571[local5++] = Static81.anInt1877;
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
									if (local45 == 3325) {
										Static272.anIntArray571[local5++] = Static306.aBoolean400 ? 1 : 0;
										continue;
									}
									if (local45 == 3326) {
										Static272.anIntArray571[local5++] = Static154.aClass53_Sub1_Sub1_2.anInt1597;
										continue;
									}
									if (local45 == 3327) {
										Static272.anIntArray571[local5++] = Static154.aClass53_Sub1_Sub1_2.aClass147_2.aBoolean307 ? 1 : 0;
										continue;
									}
									if (local45 == 3328) {
										Static272.anIntArray571[local5++] = Static42.aBoolean47 && !Static207.aBoolean287 ? 1 : 0;
										continue;
									}
									if (local45 == 3329) {
										Static272.anIntArray571[local5++] = Static60.aBoolean67 ? 1 : 0;
										continue;
									}
									if (local45 == 3330) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static262.method4125(local627);
										continue;
									}
									if (local45 == 3331) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static204.method3261(local638, local627, false);
										continue;
									}
									if (local45 == 3332) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static204.method3261(local638, local627, true);
										continue;
									}
									if (local45 == 3333) {
										Static272.anIntArray571[local5++] = Static21.anInt1047;
										continue;
									}
									if (local45 == 3335) {
										Static272.anIntArray571[local5++] = Static9.anInt124;
										continue;
									}
									if (local45 == 3336) {
										local5 -= 4;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										local936 = Static272.anIntArray571[local5 + 2];
										local627 += local638 << 14;
										local627 += local936 << 28;
										local471 = Static272.anIntArray571[local5 + 3];
										local627 += local471;
										Static272.anIntArray571[local5++] = local627;
										continue;
									}
									if (local45 == 3337) {
										Static272.anIntArray571[local5++] = Static259.anInt4939;
										continue;
									}
								} else if (local45 < 3500) {
									@Pc(3389) Class4_Sub3_Sub3 local3389;
									if (local45 == 3400) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										local3389 = Static138.method2057(local627);
										if (local3389.aChar1 == 's') {
										}
										Static51.aStringArray5[local13++] = local3389.method606(local638);
										continue;
									}
									if (local45 == 3408) {
										local5 -= 4;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5];
										local936 = Static272.anIntArray571[local5 + 2];
										local471 = Static272.anIntArray571[local5 + 3];
										@Pc(3434) Class4_Sub3_Sub3 local3434 = Static138.method2057(local936);
										if (local627 == local3434.aChar2 && local638 == local3434.aChar1) {
											if (local638 == 115) {
												Static51.aStringArray5[local13++] = local3434.method606(local471);
											} else {
												Static272.anIntArray571[local5++] = local3434.method601(local471);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local45 == 3409) {
										local5 -= 3;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										local936 = Static272.anIntArray571[local5 + 2];
										if (local638 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(3510) Class4_Sub3_Sub3 local3510 = Static138.method2057(local638);
										if (local3510.aChar1 != local627) {
											throw new RuntimeException("C3409-1");
										}
										Static272.anIntArray571[local5++] = local3510.method604(local936) ? 1 : 0;
										continue;
									}
									if (local45 == 3410) {
										local13--;
										local1590 = Static51.aStringArray5[local13];
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (local627 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local3389 = Static138.method2057(local627);
										if (local3389.aChar1 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static272.anIntArray571[local5++] = local3389.method611(local1590) ? 1 : 0;
										continue;
									}
									if (local45 == 3411) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										@Pc(3604) Class4_Sub3_Sub3 local3604 = Static138.method2057(local627);
										Static272.anIntArray571[local5++] = local3604.aClass85_3.method1842();
										continue;
									}
								} else if (local45 < 3700) {
									if (local45 == 3600) {
										if (Static297.anInt5498 == 0) {
											Static272.anIntArray571[local5++] = -2;
										} else if (Static297.anInt5498 == 1) {
											Static272.anIntArray571[local5++] = -1;
										} else {
											Static272.anIntArray571[local5++] = Static272.anInt5215;
										}
										continue;
									}
									if (local45 == 3601) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static297.anInt5498 == 2 && local627 < Static272.anInt5215) {
											Static51.aStringArray5[local13++] = Static181.aStringArray23[local627];
											continue;
										}
										Static51.aStringArray5[local13++] = "";
										continue;
									}
									if (local45 == 3602) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static297.anInt5498 == 2 && local627 < Static272.anInt5215) {
											Static272.anIntArray571[local5++] = Static157.anIntArray293[local627];
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
									if (local45 == 3603) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static297.anInt5498 == 2 && local627 < Static272.anInt5215) {
											Static272.anIntArray571[local5++] = Static251.anIntArray517[local627];
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
									if (local45 == 3604) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										local5--;
										local638 = Static272.anIntArray571[local5];
										Static138.method2061(local638, local423);
										continue;
									}
									if (local45 == 3605) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static75.method1229(Static108.method1747(local423));
										continue;
									}
									if (local45 == 3606) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static22.method308(Static108.method1747(local423));
										continue;
									}
									if (local45 == 3607) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static250.method3960(false, Static108.method1747(local423));
										continue;
									}
									if (local45 == 3608) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static143.method2193(Static108.method1747(local423));
										continue;
									}
									if (local45 == 3609) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										if (local423.startsWith("<img=0>") || local423.startsWith("<img=1>")) {
											local423 = local423.substring(7);
										}
										Static272.anIntArray571[local5++] = Static160.method2575(local423) ? 1 : 0;
										continue;
									}
									if (local45 == 3610) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static297.anInt5498 == 2 && local627 < Static272.anInt5215) {
											Static51.aStringArray5[local13++] = Static150.aStringArray22[local627];
											continue;
										}
										Static51.aStringArray5[local13++] = "";
										continue;
									}
									if (local45 == 3611) {
										if (Static86.aString108 == null) {
											Static51.aStringArray5[local13++] = "";
										} else {
											Static51.aStringArray5[local13++] = Static213.method3477(Static86.aString108);
										}
										continue;
									}
									if (local45 == 3612) {
										if (Static86.aString108 == null) {
											Static272.anIntArray571[local5++] = 0;
										} else {
											Static272.anIntArray571[local5++] = Static164.anInt3260;
										}
										continue;
									}
									if (local45 == 3613) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static86.aString108 != null && local627 < Static164.anInt3260) {
											Static51.aStringArray5[local13++] = Static213.method3477(Static255.aClass4_Sub15Array1[local627].aString182);
											continue;
										}
										Static51.aStringArray5[local13++] = "";
										continue;
									}
									if (local45 == 3614) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static86.aString108 != null && Static164.anInt3260 > local627) {
											Static272.anIntArray571[local5++] = Static255.aClass4_Sub15Array1[local627].anInt2988;
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
									if (local45 == 3615) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static86.aString108 != null && Static164.anInt3260 > local627) {
											Static272.anIntArray571[local5++] = Static255.aClass4_Sub15Array1[local627].aByte5;
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
									if (local45 == 3616) {
										Static272.anIntArray571[local5++] = Static172.aByte6;
										continue;
									}
									if (local45 == 3617) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static271.method4273(local423);
										continue;
									}
									if (local45 == 3618) {
										Static272.anIntArray571[local5++] = Static185.aByte13;
										continue;
									}
									if (local45 == 3619) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static214.method3488(Static108.method1747(local423));
										continue;
									}
									if (local45 == 3620) {
										Static41.method685();
										continue;
									}
									if (local45 == 3621) {
										if (Static297.anInt5498 == 0) {
											Static272.anIntArray571[local5++] = -1;
										} else {
											Static272.anIntArray571[local5++] = Static239.anInt4517;
										}
										continue;
									}
									if (local45 == 3622) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static297.anInt5498 != 0 && Static239.anInt4517 > local627) {
											Static51.aStringArray5[local13++] = Static216.method3514(Static132.aLongArray16[local627]);
											continue;
										}
										Static51.aStringArray5[local13++] = "";
										continue;
									}
									if (local45 == 3623) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										if (local423.startsWith("<img=0>") || local423.startsWith("<img=1>")) {
											local423 = local423.substring(7);
										}
										Static272.anIntArray571[local5++] = Static69.method1077(local423) ? 1 : 0;
										continue;
									}
									if (local45 == 3624) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static255.aClass4_Sub15Array1 != null && local627 < Static164.anInt3260 && Static255.aClass4_Sub15Array1[local627].aString182.equalsIgnoreCase(Static154.aClass53_Sub1_Sub1_2.aString88)) {
											Static272.anIntArray571[local5++] = 1;
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
									if (local45 == 3625) {
										if (Static237.aString275 == null) {
											Static51.aStringArray5[local13++] = "";
										} else {
											Static51.aStringArray5[local13++] = Static213.method3477(Static237.aString275);
										}
										continue;
									}
									if (local45 == 3626) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static86.aString108 != null && Static164.anInt3260 > local627) {
											Static51.aStringArray5[local13++] = Static255.aClass4_Sub15Array1[local627].aString181;
											continue;
										}
										Static51.aStringArray5[local13++] = "";
										continue;
									}
									if (local45 == 3627) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										if (Static297.anInt5498 == 2 && local627 >= 0 && Static272.anInt5215 > local627) {
											Static272.anIntArray571[local5++] = Static81.aBooleanArray7[local627] ? 1 : 0;
											continue;
										}
										Static272.anIntArray571[local5++] = 0;
										continue;
									}
									if (local45 == 3628) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										if (local423.startsWith("<img=0>") || local423.startsWith("<img=1>")) {
											local423 = local423.substring(7);
										}
										Static272.anIntArray571[local5++] = Static73.method1201(local423);
										continue;
									}
									if (local45 == 3629) {
										Static272.anIntArray571[local5++] = Static188.anInt6080;
										continue;
									}
									if (local45 == 3630) {
										local13--;
										local423 = Static51.aStringArray5[local13];
										Static250.method3960(true, Static108.method1747(local423));
										continue;
									}
									if (local45 == 3631) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static60.aBooleanArray5[local627] ? 1 : 0;
										continue;
									}
								} else if (local45 < 4000) {
									if (local45 == 3903) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static20.aClass163Array1[local627].method4115();
										continue;
									}
									if (local45 == 3904) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static20.aClass163Array1[local627].anInt4984;
										continue;
									}
									if (local45 == 3905) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static20.aClass163Array1[local627].anInt4983;
										continue;
									}
									if (local45 == 3906) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static20.aClass163Array1[local627].anInt4977;
										continue;
									}
									if (local45 == 3907) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static20.aClass163Array1[local627].anInt4981;
										continue;
									}
									if (local45 == 3908) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = Static20.aClass163Array1[local627].anInt4982;
										continue;
									}
									if (local45 == 3910) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										local638 = Static20.aClass163Array1[local627].method4118();
										Static272.anIntArray571[local5++] = local638 == 0 ? 1 : 0;
										continue;
									}
									if (local45 == 3911) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										local638 = Static20.aClass163Array1[local627].method4118();
										Static272.anIntArray571[local5++] = local638 == 2 ? 1 : 0;
										continue;
									}
									if (local45 == 3912) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										local638 = Static20.aClass163Array1[local627].method4118();
										Static272.anIntArray571[local5++] = local638 == 5 ? 1 : 0;
										continue;
									}
									if (local45 == 3913) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										local638 = Static20.aClass163Array1[local627].method4118();
										Static272.anIntArray571[local5++] = local638 == 1 ? 1 : 0;
										continue;
									}
								} else if (local45 >= 4100) {
									@Pc(9775) boolean local9775;
									if (local45 >= 4200) {
										@Pc(3890) Class4_Sub3_Sub12 local3890;
										if (local45 < 4300) {
											if (local45 == 4200) {
												local5--;
												local627 = Static272.anIntArray571[local5];
												Static51.aStringArray5[local13++] = Static287.method4398(local627).aString315;
												continue;
											}
											@Pc(10617) Class165 local10617;
											if (local45 == 4201) {
												local5 -= 2;
												local638 = Static272.anIntArray571[local5 + 1];
												local627 = Static272.anIntArray571[local5];
												local10617 = Static287.method4398(local627);
												if (local638 >= 1 && local638 <= 5 && local10617.aStringArray33[local638 - 1] != null) {
													Static51.aStringArray5[local13++] = local10617.aStringArray33[local638 - 1];
													continue;
												}
												Static51.aStringArray5[local13++] = "";
												continue;
											}
											if (local45 == 4202) {
												local5 -= 2;
												local627 = Static272.anIntArray571[local5];
												local638 = Static272.anIntArray571[local5 + 1];
												local10617 = Static287.method4398(local627);
												if (local638 >= 1 && local638 <= 5 && local10617.aStringArray32[local638 - 1] != null) {
													Static51.aStringArray5[local13++] = local10617.aStringArray32[local638 - 1];
													continue;
												}
												Static51.aStringArray5[local13++] = "";
												continue;
											}
											if (local45 == 4203) {
												local5--;
												local627 = Static272.anIntArray571[local5];
												Static272.anIntArray571[local5++] = Static287.method4398(local627).anInt5103;
												continue;
											}
											if (local45 == 4204) {
												local5--;
												local627 = Static272.anIntArray571[local5];
												Static272.anIntArray571[local5++] = Static287.method4398(local627).anInt5076 == 1 ? 1 : 0;
												continue;
											}
											@Pc(10767) Class165 local10767;
											if (local45 == 4205) {
												local5--;
												local627 = Static272.anIntArray571[local5];
												local10767 = Static287.method4398(local627);
												if (local10767.anInt5090 == -1 && local10767.anInt5101 >= 0) {
													Static272.anIntArray571[local5++] = local10767.anInt5101;
													continue;
												}
												Static272.anIntArray571[local5++] = local627;
												continue;
											}
											if (local45 == 4206) {
												local5--;
												local627 = Static272.anIntArray571[local5];
												local10767 = Static287.method4398(local627);
												if (local10767.anInt5090 >= 0 && local10767.anInt5101 >= 0) {
													Static272.anIntArray571[local5++] = local10767.anInt5101;
													continue;
												}
												Static272.anIntArray571[local5++] = local627;
												continue;
											}
											if (local45 == 4207) {
												local5--;
												local627 = Static272.anIntArray571[local5];
												Static272.anIntArray571[local5++] = Static287.method4398(local627).aBoolean351 ? 1 : 0;
												continue;
											}
											if (local45 == 4208) {
												local5 -= 2;
												local638 = Static272.anIntArray571[local5 + 1];
												local627 = Static272.anIntArray571[local5];
												local3890 = Static114.method1816(local638);
												if (local3890.method1996()) {
													Static51.aStringArray5[local13++] = Static287.method4398(local627).method4166(local3890.aString153, local638);
												} else {
													Static272.anIntArray571[local5++] = Static287.method4398(local627).method4170(local638, local3890.anInt2546);
												}
												continue;
											}
											if (local45 == 4210) {
												local13--;
												local423 = Static51.aStringArray5[local13];
												local5--;
												local638 = Static272.anIntArray571[local5];
												Static227.method3635(local423, local638 == 1);
												Static272.anIntArray571[local5++] = Static76.anInt5738;
												continue;
											}
											if (local45 == 4211) {
												if (Static293.aShortArray114 != null && Static76.anInt5738 > Static167.anInt3497) {
													Static272.anIntArray571[local5++] = Static293.aShortArray114[Static167.anInt3497++] & 0xFFFF;
													continue;
												}
												Static272.anIntArray571[local5++] = -1;
												continue;
											}
											if (local45 == 4212) {
												Static167.anInt3497 = 0;
												continue;
											}
										} else if (local45 < 4400) {
											if (local45 == 4300) {
												local5 -= 2;
												local638 = Static272.anIntArray571[local5 + 1];
												local627 = Static272.anIntArray571[local5];
												local3890 = Static114.method1816(local638);
												if (local3890.method1996()) {
													Static51.aStringArray5[local13++] = Static84.method1495(local627).method4295(local638, local3890.aString153);
												} else {
													Static272.anIntArray571[local5++] = Static84.method1495(local627).method4299(local3890.anInt2546, local638);
												}
												continue;
											}
										} else if (local45 >= 4500) {
											if (local45 >= 4600) {
												if (local45 < 5100) {
													if (local45 == 5000) {
														Static272.anIntArray571[local5++] = Static289.anInt5414;
														continue;
													}
													if (local45 == 5001) {
														local5 -= 3;
														Static289.anInt5414 = Static272.anIntArray571[local5];
														Static253.anInt4838 = Static272.anIntArray571[local5 + 1];
														Static263.anInt5017 = Static272.anIntArray571[local5 + 2];
														Static110.aClass4_Sub10_Sub1_1.method4687(234);
														Static110.aClass4_Sub10_Sub1_1.method4618(Static289.anInt5414);
														Static110.aClass4_Sub10_Sub1_1.method4618(Static253.anInt4838);
														Static110.aClass4_Sub10_Sub1_1.method4618(Static263.anInt5017);
														continue;
													}
													if (local45 == 5002) {
														local13--;
														local423 = Static51.aStringArray5[local13];
														local5 -= 2;
														local638 = Static272.anIntArray571[local5];
														local936 = Static272.anIntArray571[local5 + 1];
														Static110.aClass4_Sub10_Sub1_1.method4687(90);
														Static110.aClass4_Sub10_Sub1_1.method4619(Static108.method1747(local423));
														Static110.aClass4_Sub10_Sub1_1.method4618(local638 - 1);
														Static110.aClass4_Sub10_Sub1_1.method4618(local936);
														continue;
													}
													if (local45 == 5003) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														local1590 = null;
														if (local627 < 100) {
															local1590 = Static261.aStringArray31[local627];
														}
														if (local1590 == null) {
															local1590 = "";
														}
														Static51.aStringArray5[local13++] = local1590;
														continue;
													}
													if (local45 == 5004) {
														local638 = -1;
														local5--;
														local627 = Static272.anIntArray571[local5];
														if (local627 < 100 && Static261.aStringArray31[local627] != null) {
															local638 = Static216.anIntArray447[local627];
														}
														Static272.anIntArray571[local5++] = local638;
														continue;
													}
													if (local45 == 5005) {
														Static272.anIntArray571[local5++] = Static253.anInt4838;
														continue;
													}
													if (local45 == 5008) {
														local13--;
														local423 = Static51.aStringArray5[local13];
														if (local423.startsWith("::")) {
															Static197.method3198(local423);
															continue;
														}
														if (Static133.anInt2576 == 0 && (Static42.aBoolean47 && !Static207.aBoolean287 || Static60.aBoolean67)) {
															continue;
														}
														local1590 = local423.toLowerCase();
														@Pc(4154) byte local4154 = 0;
														@Pc(4156) byte local4156 = 0;
														if (local1590.startsWith(Static141.aString353)) {
															local423 = local423.substring(Static141.aString353.length());
															local4154 = 0;
														} else if (local1590.startsWith(Static168.aString198)) {
															local4154 = 1;
															local423 = local423.substring(Static168.aString198.length());
														} else if (local1590.startsWith(Static51.aString59)) {
															local423 = local423.substring(Static51.aString59.length());
															local4154 = 2;
														} else if (local1590.startsWith(Static171.aString204)) {
															local423 = local423.substring(Static171.aString204.length());
															local4154 = 3;
														} else if (local1590.startsWith(Static188.aString374)) {
															local423 = local423.substring(Static188.aString374.length());
															local4154 = 4;
														} else if (local1590.startsWith(Static182.aString213)) {
															local423 = local423.substring(Static182.aString213.length());
															local4154 = 5;
														} else if (local1590.startsWith(Static187.aString217)) {
															local423 = local423.substring(Static187.aString217.length());
															local4154 = 6;
														} else if (local1590.startsWith(Static284.aString328)) {
															local4154 = 7;
															local423 = local423.substring(Static284.aString328.length());
														} else if (local1590.startsWith(Static204.aString231)) {
															local423 = local423.substring(Static204.aString231.length());
															local4154 = 8;
														} else if (local1590.startsWith(Static214.aString247)) {
															local423 = local423.substring(Static214.aString247.length());
															local4154 = 9;
														} else if (local1590.startsWith(Static7.aString10)) {
															local4154 = 10;
															local423 = local423.substring(Static7.aString10.length());
														} else if (local1590.startsWith(Static183.aString215)) {
															local423 = local423.substring(Static183.aString215.length());
															local4154 = 11;
														} else if (Static9.anInt124 != 0) {
															if (local1590.startsWith(Static31.aString43)) {
																local423 = local423.substring(Static31.aString43.length());
																local4154 = 0;
															} else if (local1590.startsWith(Static304.aString351)) {
																local423 = local423.substring(Static304.aString351.length());
																local4154 = 1;
															} else if (local1590.startsWith(Static107.aString332)) {
																local4154 = 2;
																local423 = local423.substring(Static107.aString332.length());
															} else if (local1590.startsWith(Static256.aString305)) {
																local4154 = 3;
																local423 = local423.substring(Static256.aString305.length());
															} else if (local1590.startsWith(Static186.aString331)) {
																local4154 = 4;
																local423 = local423.substring(Static186.aString331.length());
															} else if (local1590.startsWith(Static152.aString179)) {
																local423 = local423.substring(Static152.aString179.length());
																local4154 = 5;
															} else if (local1590.startsWith(Static235.aString273)) {
																local423 = local423.substring(Static235.aString273.length());
																local4154 = 6;
															} else if (local1590.startsWith(Static304.aString350)) {
																local4154 = 7;
																local423 = local423.substring(Static304.aString350.length());
															} else if (local1590.startsWith(Static276.aString322)) {
																local423 = local423.substring(Static276.aString322.length());
																local4154 = 8;
															} else if (local1590.startsWith(Static171.aString203)) {
																local4154 = 9;
																local423 = local423.substring(Static171.aString203.length());
															} else if (local1590.startsWith(Static252.aString300)) {
																local423 = local423.substring(Static252.aString300.length());
																local4154 = 10;
															} else if (local1590.startsWith(Static216.aString257)) {
																local4154 = 11;
																local423 = local423.substring(Static216.aString257.length());
															}
														}
														local1590 = local423.toLowerCase();
														if (local1590.startsWith(Static109.aString123)) {
															local423 = local423.substring(Static109.aString123.length());
															local4156 = 1;
														} else if (local1590.startsWith(Static151.aString177)) {
															local4156 = 2;
															local423 = local423.substring(Static151.aString177.length());
														} else if (local1590.startsWith(Static62.aString75)) {
															local4156 = 3;
															local423 = local423.substring(Static62.aString75.length());
														} else if (local1590.startsWith(Static300.aString344)) {
															local423 = local423.substring(Static300.aString344.length());
															local4156 = 4;
														} else if (local1590.startsWith(Static127.aString144)) {
															local4156 = 5;
															local423 = local423.substring(Static127.aString144.length());
														} else if (Static9.anInt124 != 0) {
															if (local1590.startsWith(Static132.aString154)) {
																local423 = local423.substring(Static132.aString154.length());
																local4156 = 1;
															} else if (local1590.startsWith(Static235.aString274)) {
																local423 = local423.substring(Static235.aString274.length());
																local4156 = 2;
															} else if (local1590.startsWith(Static145.aString170)) {
																local4156 = 3;
																local423 = local423.substring(Static145.aString170.length());
															} else if (local1590.startsWith(Static220.aString235)) {
																local4156 = 4;
																local423 = local423.substring(Static220.aString235.length());
															} else if (local1590.startsWith(Static127.aString142)) {
																local423 = local423.substring(Static127.aString142.length());
																local4156 = 5;
															}
														}
														Static110.aClass4_Sub10_Sub1_1.method4687(186);
														Static110.aClass4_Sub10_Sub1_1.method4618(0);
														local2586 = Static110.aClass4_Sub10_Sub1_1.anInt5713;
														Static110.aClass4_Sub10_Sub1_1.method4618(local4154);
														Static110.aClass4_Sub10_Sub1_1.method4618(local4156);
														Static236.method3692(Static110.aClass4_Sub10_Sub1_1, local423);
														Static110.aClass4_Sub10_Sub1_1.method4675(Static110.aClass4_Sub10_Sub1_1.anInt5713 - local2586);
														continue;
													}
													if (local45 == 5009) {
														local13 -= 2;
														local423 = Static51.aStringArray5[local13];
														local1590 = Static51.aStringArray5[local13 + 1];
														if (Static133.anInt2576 != 0 || (!Static42.aBoolean47 || Static207.aBoolean287) && !Static60.aBoolean67) {
															Static110.aClass4_Sub10_Sub1_1.method4687(157);
															Static110.aClass4_Sub10_Sub1_1.method4618(0);
															local936 = Static110.aClass4_Sub10_Sub1_1.anInt5713;
															Static110.aClass4_Sub10_Sub1_1.method4619(Static108.method1747(local423));
															Static236.method3692(Static110.aClass4_Sub10_Sub1_1, local1590);
															Static110.aClass4_Sub10_Sub1_1.method4675(Static110.aClass4_Sub10_Sub1_1.anInt5713 - local936);
														}
														continue;
													}
													if (local45 == 5010) {
														local1590 = null;
														local5--;
														local627 = Static272.anIntArray571[local5];
														if (local627 < 100) {
															local1590 = Static118.aStringArray16[local627];
														}
														if (local1590 == null) {
															local1590 = "";
														}
														Static51.aStringArray5[local13++] = local1590;
														continue;
													}
													if (local45 == 5011) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														local1590 = null;
														if (local627 < 100) {
															local1590 = Static16.aStringArray4[local627];
														}
														if (local1590 == null) {
															local1590 = "";
														}
														Static51.aStringArray5[local13++] = local1590;
														continue;
													}
													if (local45 == 5012) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														local638 = -1;
														if (local627 < 100) {
															local638 = Static278.anIntArray598[local627];
														}
														Static272.anIntArray571[local5++] = local638;
														continue;
													}
													if (local45 == 5015) {
														if (Static154.aClass53_Sub1_Sub1_2 == null || Static154.aClass53_Sub1_Sub1_2.aString88 == null) {
															local423 = Static114.aString132;
														} else {
															local423 = Static154.aClass53_Sub1_Sub1_2.method1173();
														}
														Static51.aStringArray5[local13++] = local423;
														continue;
													}
													if (local45 == 5016) {
														Static272.anIntArray571[local5++] = Static263.anInt5017;
														continue;
													}
													if (local45 == 5017) {
														Static272.anIntArray571[local5++] = Static181.anInt3469;
														continue;
													}
													if (local45 == 5050) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														Static51.aStringArray5[local13++] = Static128.method1962(local627).aString369;
														continue;
													}
													@Pc(4879) Class4_Sub3_Sub23 local4879;
													if (local45 == 5051) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														local4879 = Static128.method1962(local627);
														if (local4879.anIntArray677 == null) {
															Static272.anIntArray571[local5++] = 0;
														} else {
															Static272.anIntArray571[local5++] = local4879.anIntArray677.length;
														}
														continue;
													}
													if (local45 == 5052) {
														local5 -= 2;
														local638 = Static272.anIntArray571[local5 + 1];
														local627 = Static272.anIntArray571[local5];
														@Pc(4917) Class4_Sub3_Sub23 local4917 = Static128.method1962(local627);
														local471 = local4917.anIntArray677[local638];
														Static272.anIntArray571[local5++] = local471;
														continue;
													}
													if (local45 == 5053) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														local4879 = Static128.method1962(local627);
														if (local4879.anIntArray676 == null) {
															Static272.anIntArray571[local5++] = 0;
														} else {
															Static272.anIntArray571[local5++] = local4879.anIntArray676.length;
														}
														continue;
													}
													if (local45 == 5054) {
														local5 -= 2;
														local627 = Static272.anIntArray571[local5];
														local638 = Static272.anIntArray571[local5 + 1];
														Static272.anIntArray571[local5++] = Static128.method1962(local627).anIntArray676[local638];
														continue;
													}
													if (local45 == 5055) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														Static51.aStringArray5[local13++] = Static190.method3004(local627).method1914();
														continue;
													}
													if (local45 == 5056) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														@Pc(5025) Class4_Sub3_Sub11 local5025 = Static190.method3004(local627);
														if (local5025.anIntArray212 == null) {
															Static272.anIntArray571[local5++] = 0;
														} else {
															Static272.anIntArray571[local5++] = local5025.anIntArray212.length;
														}
														continue;
													}
													if (local45 == 5057) {
														local5 -= 2;
														local627 = Static272.anIntArray571[local5];
														local638 = Static272.anIntArray571[local5 + 1];
														Static272.anIntArray571[local5++] = Static190.method3004(local627).anIntArray212[local638];
														continue;
													}
													if (local45 == 5058) {
														Static11.aClass27_1 = new Class27();
														local5--;
														Static11.aClass27_1.anInt540 = Static272.anIntArray571[local5];
														Static11.aClass27_1.aClass4_Sub3_Sub11_1 = Static190.method3004(Static11.aClass27_1.anInt540);
														Static11.aClass27_1.anIntArray48 = new int[Static11.aClass27_1.aClass4_Sub3_Sub11_1.method1904()];
														continue;
													}
													if (local45 == 5059) {
														Static110.aClass4_Sub10_Sub1_1.method4687(222);
														Static110.aClass4_Sub10_Sub1_1.method4618(0);
														local627 = Static110.aClass4_Sub10_Sub1_1.anInt5713;
														Static110.aClass4_Sub10_Sub1_1.method4618(0);
														Static110.aClass4_Sub10_Sub1_1.method4668(Static11.aClass27_1.anInt540);
														Static11.aClass27_1.aClass4_Sub3_Sub11_1.method1912(Static11.aClass27_1.anIntArray48, Static110.aClass4_Sub10_Sub1_1);
														Static110.aClass4_Sub10_Sub1_1.method4675(Static110.aClass4_Sub10_Sub1_1.anInt5713 - local627);
														continue;
													}
													if (local45 == 5060) {
														local13--;
														local423 = Static51.aStringArray5[local13];
														Static110.aClass4_Sub10_Sub1_1.method4687(42);
														Static110.aClass4_Sub10_Sub1_1.method4618(0);
														local638 = Static110.aClass4_Sub10_Sub1_1.anInt5713;
														Static110.aClass4_Sub10_Sub1_1.method4619(Static108.method1747(local423));
														Static110.aClass4_Sub10_Sub1_1.method4668(Static11.aClass27_1.anInt540);
														Static11.aClass27_1.aClass4_Sub3_Sub11_1.method1912(Static11.aClass27_1.anIntArray48, Static110.aClass4_Sub10_Sub1_1);
														Static110.aClass4_Sub10_Sub1_1.method4675(Static110.aClass4_Sub10_Sub1_1.anInt5713 - local638);
														continue;
													}
													if (local45 == 5061) {
														Static110.aClass4_Sub10_Sub1_1.method4687(222);
														Static110.aClass4_Sub10_Sub1_1.method4618(0);
														local627 = Static110.aClass4_Sub10_Sub1_1.anInt5713;
														Static110.aClass4_Sub10_Sub1_1.method4618(1);
														Static110.aClass4_Sub10_Sub1_1.method4668(Static11.aClass27_1.anInt540);
														Static11.aClass27_1.aClass4_Sub3_Sub11_1.method1912(Static11.aClass27_1.anIntArray48, Static110.aClass4_Sub10_Sub1_1);
														Static110.aClass4_Sub10_Sub1_1.method4675(Static110.aClass4_Sub10_Sub1_1.anInt5713 - local627);
														continue;
													}
													if (local45 == 5062) {
														local5 -= 2;
														local627 = Static272.anIntArray571[local5];
														local638 = Static272.anIntArray571[local5 + 1];
														Static272.anIntArray571[local5++] = Static128.method1962(local627).aCharArray4[local638];
														continue;
													}
													if (local45 == 5063) {
														local5 -= 2;
														local627 = Static272.anIntArray571[local5];
														local638 = Static272.anIntArray571[local5 + 1];
														Static272.anIntArray571[local5++] = Static128.method1962(local627).aCharArray5[local638];
														continue;
													}
													if (local45 == 5064) {
														local5 -= 2;
														local638 = Static272.anIntArray571[local5 + 1];
														local627 = Static272.anIntArray571[local5];
														if (local638 == -1) {
															Static272.anIntArray571[local5++] = -1;
														} else {
															Static272.anIntArray571[local5++] = Static128.method1962(local627).method4814((char) local638);
														}
														continue;
													}
													if (local45 == 5065) {
														local5 -= 2;
														local638 = Static272.anIntArray571[local5 + 1];
														local627 = Static272.anIntArray571[local5];
														if (local638 == -1) {
															Static272.anIntArray571[local5++] = -1;
														} else {
															Static272.anIntArray571[local5++] = Static128.method1962(local627).method4811((char) local638);
														}
														continue;
													}
													if (local45 == 5066) {
														local5--;
														local627 = Static272.anIntArray571[local5];
														Static272.anIntArray571[local5++] = Static190.method3004(local627).method1904();
														continue;
													}
													if (local45 == 5067) {
														local5 -= 2;
														local627 = Static272.anIntArray571[local5];
														local638 = Static272.anIntArray571[local5 + 1];
														local936 = Static190.method3004(local627).method1906(local638);
														Static272.anIntArray571[local5++] = local936;
														continue;
													}
													if (local45 == 5068) {
														local5 -= 2;
														local627 = Static272.anIntArray571[local5];
														local638 = Static272.anIntArray571[local5 + 1];
														Static11.aClass27_1.anIntArray48[local627] = local638;
														continue;
													}
													if (local45 == 5069) {
														local5 -= 2;
														local627 = Static272.anIntArray571[local5];
														local638 = Static272.anIntArray571[local5 + 1];
														Static11.aClass27_1.anIntArray48[local627] = local638;
														continue;
													}
													if (local45 == 5070) {
														local5 -= 3;
														local627 = Static272.anIntArray571[local5];
														local936 = Static272.anIntArray571[local5 + 2];
														local638 = Static272.anIntArray571[local5 + 1];
														@Pc(5514) Class4_Sub3_Sub11 local5514 = Static190.method3004(local627);
														if (local5514.method1906(local638) != 0) {
															throw new RuntimeException("bad command");
														}
														Static272.anIntArray571[local5++] = local5514.method1905(local936, local638);
														continue;
													}
													if (local45 == 5071) {
														local13--;
														local423 = Static51.aStringArray5[local13];
														local5--;
														local1075 = Static272.anIntArray571[local5] == 1;
														Static170.method2712(local1075, local423);
														Static272.anIntArray571[local5++] = Static76.anInt5738;
														continue;
													}
													if (local45 == 5072) {
														if (Static293.aShortArray114 != null && Static76.anInt5738 > Static167.anInt3497) {
															Static272.anIntArray571[local5++] = Static293.aShortArray114[Static167.anInt3497++] & 0xFFFF;
															continue;
														}
														Static272.anIntArray571[local5++] = -1;
														continue;
													}
													if (local45 == 5073) {
														Static167.anInt3497 = 0;
														continue;
													}
												} else if (local45 < 5200) {
													if (local45 == 5100) {
														if (Static54.aBooleanArray4[86]) {
															Static272.anIntArray571[local5++] = 1;
														} else {
															Static272.anIntArray571[local5++] = 0;
														}
														continue;
													}
													if (local45 == 5101) {
														if (Static54.aBooleanArray4[82]) {
															Static272.anIntArray571[local5++] = 1;
														} else {
															Static272.anIntArray571[local5++] = 0;
														}
														continue;
													}
													if (local45 == 5102) {
														if (Static54.aBooleanArray4[81]) {
															Static272.anIntArray571[local5++] = 1;
														} else {
															Static272.anIntArray571[local5++] = 0;
														}
														continue;
													}
												} else {
													@Pc(8063) boolean local8063;
													if (local45 < 5300) {
														if (local45 == 5200) {
															local5--;
															Static139.method2077(Static272.anIntArray571[local5]);
															continue;
														}
														if (local45 == 5201) {
															Static272.anIntArray571[local5++] = Static131.method1998();
															continue;
														}
														if (local45 == 5205) {
															local5--;
															Static167.method2960(false, -1, -1, Static272.anIntArray571[local5]);
															continue;
														}
														@Pc(9441) Class4_Sub3_Sub22 local9441;
														if (local45 == 5206) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local9441 = Static121.method2401(local627 >> 14 & 0x3FFF, local627 & 0x3FFF);
															if (local9441 == null) {
																Static272.anIntArray571[local5++] = -1;
															} else {
																Static272.anIntArray571[local5++] = local9441.anInt5997;
															}
															continue;
														}
														@Pc(9470) Class4_Sub3_Sub22 local9470;
														if (local45 == 5207) {
															local5--;
															local9470 = Static121.method2412(Static272.anIntArray571[local5]);
															if (local9470 != null && local9470.aString366 != null) {
																Static51.aStringArray5[local13++] = local9470.aString366;
																continue;
															}
															Static51.aStringArray5[local13++] = "";
															continue;
														}
														if (local45 == 5208) {
															Static272.anIntArray571[local5++] = Static281.anInt5332;
															Static272.anIntArray571[local5++] = Static302.anInt5684;
															continue;
														}
														if (local45 == 5209) {
															Static272.anIntArray571[local5++] = Static22.anInt331 + Static121.anInt2962;
															Static272.anIntArray571[local5++] = Static121.anInt2961 + Static121.anInt2960 - Static275.anInt5232 - 1;
															continue;
														}
														if (local45 == 5210) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local9441 = Static121.method2412(local627);
															if (local9441 == null) {
																Static272.anIntArray571[local5++] = 0;
																Static272.anIntArray571[local5++] = 0;
															} else {
																Static272.anIntArray571[local5++] = local9441.anInt5996 >> 14 & 0x3FFF;
																Static272.anIntArray571[local5++] = local9441.anInt5996 & 0x3FFF;
															}
															continue;
														}
														if (local45 == 5211) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local9441 = Static121.method2412(local627);
															if (local9441 == null) {
																Static272.anIntArray571[local5++] = 0;
																Static272.anIntArray571[local5++] = 0;
															} else {
																Static272.anIntArray571[local5++] = local9441.anInt6006 - local9441.anInt5995;
																Static272.anIntArray571[local5++] = local9441.anInt6011 - local9441.anInt6000;
															}
															continue;
														}
														@Pc(9635) Class4_Sub3_Sub7 local9635;
														if (local45 == 5212) {
															local9635 = Static30.method492();
															if (local9635 == null) {
																Static272.anIntArray571[local5++] = -1;
																Static272.anIntArray571[local5++] = -1;
															} else {
																Static272.anIntArray571[local5++] = local9635.anInt1760;
																local638 = Static121.anInt2962 + local9635.anInt1768 << 14 | local9635.anInt1763 << 28 | Static121.anInt2961 + Static121.anInt2960 - local9635.anInt1769 - 1;
																Static272.anIntArray571[local5++] = local638;
															}
															continue;
														}
														if (local45 == 5213) {
															local9635 = Static172.method2726();
															if (local9635 == null) {
																Static272.anIntArray571[local5++] = -1;
																Static272.anIntArray571[local5++] = -1;
															} else {
																Static272.anIntArray571[local5++] = local9635.anInt1760;
																local638 = Static121.anInt2960 + Static121.anInt2961 - local9635.anInt1769 - 1 | local9635.anInt1763 << 28 | local9635.anInt1768 + Static121.anInt2962 << 14;
																Static272.anIntArray571[local5++] = local638;
															}
															continue;
														}
														if (local45 == 5214) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local9441 = Static22.method305();
															if (local9441 != null) {
																local9775 = local9441.method4790(local627 & 0x3FFF, local627 >> 28 & 0x3, anIntArray162, local627 >> 14 & 0x3FFF);
																if (local9775) {
																	Static129.method1971(anIntArray162[1], anIntArray162[2]);
																}
															}
															continue;
														}
														if (local45 == 5215) {
															local5 -= 2;
															local638 = Static272.anIntArray571[local5 + 1];
															local627 = Static272.anIntArray571[local5];
															@Pc(9812) Class178 local9812 = Static121.method2402(local627 >> 14 & 0x3FFF, local627 & 0x3FFF);
															local8063 = false;
															for (@Pc(9819) Class4_Sub3_Sub22 local9819 = (Class4_Sub3_Sub22) local9812.method4369(); local9819 != null; local9819 = (Class4_Sub3_Sub22) local9812.method4377()) {
																if (local9819.anInt5997 == local638) {
																	local8063 = true;
																	break;
																}
															}
															if (local8063) {
																Static272.anIntArray571[local5++] = 1;
															} else {
																Static272.anIntArray571[local5++] = 0;
															}
															continue;
														}
														if (local45 == 5218) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local9441 = Static121.method2412(local627);
															if (local9441 == null) {
																Static272.anIntArray571[local5++] = -1;
															} else {
																Static272.anIntArray571[local5++] = local9441.anInt6010;
															}
															continue;
														}
														if (local45 == 5220) {
															Static272.anIntArray571[local5++] = Static138.anInt2644 == 100 ? 1 : 0;
															continue;
														}
														if (local45 == 5221) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															Static129.method1971(local627 >> 14 & 0x3FFF, local627 & 0x3FFF);
															continue;
														}
														if (local45 == 5222) {
															local9470 = Static22.method305();
															if (local9470 == null) {
																Static272.anIntArray571[local5++] = -1;
																Static272.anIntArray571[local5++] = -1;
															} else {
																local1075 = local9470.method4795(Static121.anInt2962 + Static22.anInt331, Static121.anInt2960 - (Static275.anInt5232 + 1 + -Static121.anInt2961), anIntArray162);
																if (local1075) {
																	Static272.anIntArray571[local5++] = anIntArray162[1];
																	Static272.anIntArray571[local5++] = anIntArray162[2];
																} else {
																	Static272.anIntArray571[local5++] = -1;
																	Static272.anIntArray571[local5++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5223) {
															local5 -= 2;
															local638 = Static272.anIntArray571[local5 + 1];
															local627 = Static272.anIntArray571[local5];
															Static167.method2960(false, local638 & 0x3FFF, local638 >> 14 & 0x3FFF, local627);
															continue;
														}
														if (local45 == 5224) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local9441 = Static22.method305();
															if (local9441 == null) {
																Static272.anIntArray571[local5++] = -1;
																Static272.anIntArray571[local5++] = -1;
															} else {
																local9775 = local9441.method4790(local627 & 0x3FFF, local627 >> 28 & 0x3, anIntArray162, local627 >> 14 & 0x3FFF);
																if (local9775) {
																	Static272.anIntArray571[local5++] = anIntArray162[1];
																	Static272.anIntArray571[local5++] = anIntArray162[2];
																} else {
																	Static272.anIntArray571[local5++] = -1;
																	Static272.anIntArray571[local5++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5225) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local9441 = Static22.method305();
															if (local9441 == null) {
																Static272.anIntArray571[local5++] = -1;
																Static272.anIntArray571[local5++] = -1;
															} else {
																local9775 = local9441.method4795(local627 >> 14 & 0x3FFF, local627 & 0x3FFF, anIntArray162);
																if (local9775) {
																	Static272.anIntArray571[local5++] = anIntArray162[1];
																	Static272.anIntArray571[local5++] = anIntArray162[2];
																} else {
																	Static272.anIntArray571[local5++] = -1;
																	Static272.anIntArray571[local5++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5226) {
															local5--;
															Static238.method3698(Static272.anIntArray571[local5]);
															continue;
														}
														if (local45 == 5227) {
															local5 -= 2;
															local627 = Static272.anIntArray571[local5];
															local638 = Static272.anIntArray571[local5 + 1];
															Static167.method2960(true, local638 & 0x3FFF, local638 >> 14 & 0x3FFF, local627);
															continue;
														}
														if (local45 == 5228) {
															local5--;
															Static240.aBoolean318 = Static272.anIntArray571[local5] == 1;
															continue;
														}
														if (local45 == 5229) {
															Static272.anIntArray571[local5++] = Static240.aBoolean318 ? 1 : 0;
															continue;
														}
														if (local45 == 5230) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															Static303.method4678(local627);
															continue;
														}
														@Pc(10299) Class4 local10299;
														if (local45 == 5231) {
															local5 -= 2;
															local627 = Static272.anIntArray571[local5];
															local1075 = Static272.anIntArray571[local5 + 1] == 1;
															if (Static124.aClass85_9 == null) {
																continue;
															}
															local10299 = Static124.aClass85_9.method1845((long) local627);
															if (local10299 != null && !local1075) {
																local10299.method4854();
																continue;
															}
															if (local10299 == null && local1075) {
																local10299 = new Class4();
																Static124.aClass85_9.method1841(local10299, (long) local627);
															}
															continue;
														}
														@Pc(10350) Class4 local10350;
														if (local45 == 5232) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (Static124.aClass85_9 == null) {
																Static272.anIntArray571[local5++] = 0;
															} else {
																local10350 = Static124.aClass85_9.method1845((long) local627);
																Static272.anIntArray571[local5++] = local10350 == null ? 0 : 1;
															}
															continue;
														}
														if (local45 == 5233) {
															local5 -= 2;
															local627 = Static272.anIntArray571[local5];
															local1075 = Static272.anIntArray571[local5 + 1] == 1;
															if (Static133.aClass85_10 == null) {
																continue;
															}
															local10299 = Static133.aClass85_10.method1845((long) local627);
															if (local10299 != null && !local1075) {
																local10299.method4854();
																continue;
															}
															if (local10299 == null && local1075) {
																local10299 = new Class4();
																Static133.aClass85_10.method1841(local10299, (long) local627);
															}
															continue;
														}
														if (local45 == 5234) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (Static133.aClass85_10 == null) {
																Static272.anIntArray571[local5++] = 0;
															} else {
																local10350 = Static133.aClass85_10.method1845((long) local627);
																Static272.anIntArray571[local5++] = local10350 == null ? 0 : 1;
															}
															continue;
														}
														if (local45 == 5235) {
															Static272.anIntArray571[local5++] = Static121.aClass4_Sub3_Sub22_3 == null ? -1 : Static121.aClass4_Sub3_Sub22_3.anInt5997;
															continue;
														}
													} else if (local45 < 5400) {
														if (local45 == 5300) {
															local5 -= 2;
															local627 = Static272.anIntArray571[local5];
															local638 = Static272.anIntArray571[local5 + 1];
															Static285.method4549(false, 3, local627, local638);
															Static272.anIntArray571[local5++] = Static122.aFrame1 == null ? 0 : 1;
															continue;
														}
														if (local45 == 5301) {
															if (Static122.aFrame1 != null) {
																Static285.method4549(false, Static192.anInt3637, -1, -1);
															}
															continue;
														}
														if (local45 == 5302) {
															@Pc(5750) Class172[] local5750 = Static174.method2738();
															Static272.anIntArray571[local5++] = local5750.length;
															continue;
														}
														if (local45 == 5303) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															@Pc(5772) Class172[] local5772 = Static174.method2738();
															Static272.anIntArray571[local5++] = local5772[local627].anInt5277;
															Static272.anIntArray571[local5++] = local5772[local627].anInt5276;
															continue;
														}
														if (local45 == 5305) {
															local627 = Static179.anInt3403;
															local638 = Static137.anInt2627;
															local936 = -1;
															@Pc(5803) Class172[] local5803 = Static174.method2738();
															for (local2586 = 0; local2586 < local5803.length; local2586++) {
																@Pc(5813) Class172 local5813 = local5803[local2586];
																if (local5813.anInt5277 == local627 && local5813.anInt5276 == local638) {
																	local936 = local2586;
																	break;
																}
															}
															Static272.anIntArray571[local5++] = local936;
															continue;
														}
														if (local45 == 5306) {
															Static272.anIntArray571[local5++] = Static35.method557();
															continue;
														}
														if (local45 == 5307) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 0 || local627 > 2) {
																local627 = 0;
															}
															Static285.method4549(false, local627, -1, -1);
															continue;
														}
														if (local45 == 5308) {
															Static272.anIntArray571[local5++] = Static192.anInt3637;
															continue;
														}
														if (local45 == 5309) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 0 || local627 > 2) {
																local627 = 0;
															}
															Static192.anInt3637 = local627;
															Static66.method1055(Static276.aClass139_4);
															continue;
														}
													} else if (local45 < 5500) {
														if (local45 == 5400) {
															local13 -= 2;
															local1590 = Static51.aStringArray5[local13 + 1];
															local5--;
															local936 = Static272.anIntArray571[local5];
															local423 = Static51.aStringArray5[local13];
															Static110.aClass4_Sub10_Sub1_1.method4687(243);
															Static110.aClass4_Sub10_Sub1_1.method4618(Static111.method1792(local423) + Static111.method1792(local1590) + 1);
															Static110.aClass4_Sub10_Sub1_1.method4612(local423);
															Static110.aClass4_Sub10_Sub1_1.method4612(local1590);
															Static110.aClass4_Sub10_Sub1_1.method4618(local936);
															continue;
														}
														if (local45 == 5401) {
															local5 -= 2;
															Static309.aShortArray124[Static272.anIntArray571[local5]] = (short) Static205.method3289(Static272.anIntArray571[local5 + 1]);
															Static150.method2420();
															Static12.method198();
															Static112.method4413();
															Static61.method1010();
															Static58.method933();
															continue;
														}
														if (local45 == 5405) {
															local5 -= 2;
															local627 = Static272.anIntArray571[local5];
															local638 = Static272.anIntArray571[local5 + 1];
															if (local627 >= 0 && local627 < 2) {
																Static29.anIntArrayArrayArray1[local627] = new int[local638 << 1][4];
															}
															continue;
														}
														if (local45 == 5406) {
															local5 -= 7;
															local638 = Static272.anIntArray571[local5 + 1] << 1;
															local627 = Static272.anIntArray571[local5];
															local471 = Static272.anIntArray571[local5 + 3];
															local936 = Static272.anIntArray571[local5 + 2];
															local2586 = Static272.anIntArray571[local5 + 4];
															local8874 = Static272.anIntArray571[local5 + 5];
															@Pc(8880) int local8880 = Static272.anIntArray571[local5 + 6];
															if (local627 >= 0 && local627 < 2 && Static29.anIntArrayArrayArray1[local627] != null && local638 >= 0 && Static29.anIntArrayArrayArray1[local627].length > local638) {
																Static29.anIntArrayArrayArray1[local627][local638] = new int[] { (local936 >> 14 & 0x3FFF) * 128, local471, (local936 & 0x3FFF) * 128, local8880 };
																Static29.anIntArrayArrayArray1[local627][local638 + 1] = new int[] { (local2586 >> 14 & 0x3FFF) * 128, local8874, (local2586 & 0x3FFF) * 128 };
															}
															continue;
														}
														if (local45 == 5407) {
															local5--;
															local627 = Static29.anIntArrayArrayArray1[Static272.anIntArray571[local5]].length >> 1;
															Static272.anIntArray571[local5++] = local627;
															continue;
														}
														if (local45 == 5411) {
															if (Static122.aFrame1 != null) {
																Static285.method4549(false, Static192.anInt3637, -1, -1);
															}
															if (Static172.aFrame2 == null) {
																Static307.method4756(Static295.method4473(), false);
															} else {
																System.exit(0);
															}
															continue;
														}
														if (local45 == 5419) {
															local423 = "";
															if (Static6.aClass185_2 != null) {
																if (Static6.aClass185_2.anObject7 == null) {
																	local423 = Static200.method3239(Static6.aClass185_2.anInt5622);
																} else {
																	local423 = (String) Static6.aClass185_2.anObject7;
																}
															}
															Static51.aStringArray5[local13++] = local423;
															continue;
														}
														if (local45 == 5420) {
															Static272.anIntArray571[local5++] = Static215.anInt4212 == 3 ? 1 : 0;
															continue;
														}
														if (local45 == 5421) {
															if (Static122.aFrame1 != null) {
																Static285.method4549(false, Static192.anInt3637, -1, -1);
															}
															local13--;
															local423 = Static51.aStringArray5[local13];
															local5--;
															local1075 = Static272.anIntArray571[local5] == 1;
															@Pc(9110) String local9110 = Static295.method4473() + local423;
															if (Static172.aFrame2 != null || local1075 && Static215.anInt4212 != 3 && Static215.aString254.startsWith("win") && !Static83.aBoolean118) {
																Static238.aString276 = local9110;
																Static151.aBoolean206 = local1075;
																Static3.aClass185_1 = Static276.aClass139_4.method3504(local9110);
																continue;
															}
															Static307.method4756(local9110, local1075);
															continue;
														}
														if (local45 == 5422) {
															local13 -= 2;
															local423 = Static51.aStringArray5[local13];
															local1590 = Static51.aStringArray5[local13 + 1];
															local5--;
															local936 = Static272.anIntArray571[local5];
															if (local423.length() > 0) {
																if (Static296.aStringArray38 == null) {
																	Static296.aStringArray38 = new String[Static188.anIntArray681[Static76.anInt5724]];
																}
																Static296.aStringArray38[local936] = local423;
															}
															if (local1590.length() > 0) {
																if (Static87.aStringArray42 == null) {
																	Static87.aStringArray42 = new String[Static188.anIntArray681[Static76.anInt5724]];
																}
																Static87.aStringArray42[local936] = local1590;
															}
															continue;
														}
														if (local45 == 5423) {
															local13--;
															System.out.println(Static51.aStringArray5[local13]);
															continue;
														}
														if (local45 == 5424) {
															local5 -= 11;
															Static222.anInt4294 = Static272.anIntArray571[local5];
															Static136.anInt2587 = Static272.anIntArray571[local5 + 1];
															Static30.anInt497 = Static272.anIntArray571[local5 + 2];
															Static135.anInt2586 = Static272.anIntArray571[local5 + 3];
															Static41.anInt771 = Static272.anIntArray571[local5 + 4];
															Static174.anInt3336 = Static272.anIntArray571[local5 + 5];
															Static36.anInt593 = Static272.anIntArray571[local5 + 6];
															Static142.anInt2741 = Static272.anIntArray571[local5 + 7];
															Static47.anInt881 = Static272.anIntArray571[local5 + 8];
															Static30.anInt504 = Static272.anIntArray571[local5 + 9];
															Static148.anInt2920 = Static272.anIntArray571[local5 + 10];
															Static7.aClass58_4.method1359(Static41.anInt771);
															Static7.aClass58_4.method1359(Static174.anInt3336);
															Static7.aClass58_4.method1359(Static36.anInt593);
															Static7.aClass58_4.method1359(Static142.anInt2741);
															Static7.aClass58_4.method1359(Static47.anInt881);
															Static300.aBoolean390 = true;
															continue;
														}
														if (local45 == 5425) {
															Static298.method4484();
															Static300.aBoolean390 = false;
															continue;
														}
														if (local45 == 5426) {
															local5--;
															Static166.anInt3407 = Static272.anIntArray571[local5];
															continue;
														}
														if (local45 == 5427) {
															local5 -= 2;
															Static82.anInt1937 = Static272.anIntArray571[local5];
															Static110.anInt2232 = Static272.anIntArray571[local5 + 1];
															continue;
														}
														if (local45 == 5428) {
															local5 -= 2;
															local638 = Static272.anIntArray571[local5 + 1];
															local627 = Static272.anIntArray571[local5];
															Static272.anIntArray571[local5++] = Static72.method1176(local627, local638) ? 1 : 0;
															continue;
														}
													} else if (local45 < 5600) {
														if (local45 == 5500) {
															local5 -= 4;
															local627 = Static272.anIntArray571[local5];
															local638 = Static272.anIntArray571[local5 + 1];
															local936 = Static272.anIntArray571[local5 + 2];
															local471 = Static272.anIntArray571[local5 + 3];
															Static310.method4810(local936, (local627 >> 14 & 0x3FFF) - Static220.anInt3983, local471, local638, false, (local627 & 0x3FFF) - Static295.anInt5480);
															continue;
														}
														if (local45 == 5501) {
															local5 -= 4;
															local627 = Static272.anIntArray571[local5];
															local638 = Static272.anIntArray571[local5 + 1];
															local936 = Static272.anIntArray571[local5 + 2];
															local471 = Static272.anIntArray571[local5 + 3];
															Static157.method2549(local638, local936, (local627 >> 14 & 0x3FFF) - Static220.anInt3983, -Static295.anInt5480 + (local627 & 0x3FFF), local471);
															continue;
														}
														if (local45 == 5502) {
															local5 -= 6;
															local627 = Static272.anIntArray571[local5];
															if (local627 >= 2) {
																throw new RuntimeException();
															}
															Static194.anInt5196 = local627;
															local638 = Static272.anIntArray571[local5 + 1];
															if (Static29.anIntArrayArrayArray1[Static194.anInt5196].length >> 1 <= local638 + 1) {
																throw new RuntimeException();
															}
															Static48.anInt915 = 0;
															Static228.anInt4385 = local638;
															Static308.anInt5950 = Static272.anIntArray571[local5 + 2];
															Static56.anInt1165 = Static272.anIntArray571[local5 + 3];
															local936 = Static272.anIntArray571[local5 + 4];
															if (local936 >= 2) {
																throw new RuntimeException();
															}
															Static153.anInt3024 = local936;
															local471 = Static272.anIntArray571[local5 + 5];
															if (Static29.anIntArrayArrayArray1[Static153.anInt3024].length >> 1 <= local471 + 1) {
																throw new RuntimeException();
															}
															Static41.anInt772 = 3;
															Static9.anInt126 = local471;
															continue;
														}
														if (local45 == 5503) {
															Static160.method2576();
															continue;
														}
														if (local45 == 5504) {
															local5 -= 2;
															Static99.method1654(Static272.anIntArray571[local5], Static272.anIntArray571[local5 + 1]);
															continue;
														}
														if (local45 == 5505) {
															Static272.anIntArray571[local5++] = (int) Static198.aFloat147;
															continue;
														}
														if (local45 == 5506) {
															Static272.anIntArray571[local5++] = (int) Static202.aFloat97;
															continue;
														}
														if (local45 == 5507) {
															Static133.method2008();
															continue;
														}
														if (local45 == 5508) {
															Static185.method2986();
															continue;
														}
														if (local45 == 5509) {
															Static124.method1925();
															continue;
														}
														if (local45 == 5510) {
															Static269.method3020();
															continue;
														}
														if (local45 == 5512) {
															Static3.method11();
															continue;
														}
													} else if (local45 < 5700) {
														if (local45 == 5600) {
															local13 -= 2;
															local5--;
															local936 = Static272.anIntArray571[local5];
															local423 = Static51.aStringArray5[local13];
															local1590 = Static51.aStringArray5[local13 + 1];
															if (Static169.anInt3304 == 10 && Static266.anInt5118 == 0 && Static133.anInt2574 == 0 && Static250.anInt4760 == 0 && Static279.anInt5320 == 0) {
																Static229.method3652(local1590, local423, local936);
															}
															continue;
														}
														if (local45 == 5601) {
															Static76.method4656();
															continue;
														}
														if (local45 == 5602) {
															if (Static133.anInt2574 == 0) {
																Static75.anInt1641 = -2;
															}
															continue;
														}
														if (local45 == 5603) {
															local5 -= 4;
															if (Static169.anInt3304 == 10 && Static266.anInt5118 == 0 && Static133.anInt2574 == 0 && Static250.anInt4760 == 0 && Static279.anInt5320 == 0) {
																Static286.method4376(Static272.anIntArray571[local5 + 2], Static272.anIntArray571[local5 + 3], Static272.anIntArray571[local5 + 1], Static272.anIntArray571[local5]);
															}
															continue;
														}
														if (local45 == 5604) {
															local13--;
															if (Static169.anInt3304 == 10 && Static266.anInt5118 == 0 && Static133.anInt2574 == 0 && Static250.anInt4760 == 0 && Static279.anInt5320 == 0) {
																Static3.method13(Static108.method1747(Static51.aStringArray5[local13]));
															}
															continue;
														}
														if (local45 == 5605) {
															local5 -= 7;
															local13 -= 3;
															if (Static169.anInt3304 == 10 && Static266.anInt5118 == 0 && Static133.anInt2574 == 0 && Static250.anInt4760 == 0 && Static279.anInt5320 == 0) {
																Static224.method3590(Static272.anIntArray571[local5 + 6] == 1, Static272.anIntArray571[local5], Static272.anIntArray571[local5 + 4] == 1, Static272.anIntArray571[local5 + 3], Static51.aStringArray5[local13 + 2], Static272.anIntArray571[local5 + 1], Static272.anIntArray571[local5 + 2], Static108.method1747(Static51.aStringArray5[local13]), Static272.anIntArray571[local5 + 5] == 1, Static51.aStringArray5[local13 + 1]);
															}
															continue;
														}
														if (local45 == 5606) {
															if (Static250.anInt4760 == 0) {
																Static268.anInt5174 = -2;
															}
															continue;
														}
														if (local45 == 5607) {
															Static272.anIntArray571[local5++] = Static75.anInt1641;
															continue;
														}
														if (local45 == 5608) {
															Static272.anIntArray571[local5++] = Static93.anInt2582;
															continue;
														}
														if (local45 == 5609) {
															Static272.anIntArray571[local5++] = Static268.anInt5174;
															continue;
														}
														if (local45 == 5610) {
															for (local627 = 0; local627 < 5; local627++) {
																Static51.aStringArray5[local13++] = Static70.aStringArray8.length > local627 ? Static213.method3477(Static70.aStringArray8[local627]) : "";
															}
															Static70.aStringArray8 = null;
															continue;
														}
														if (local45 == 5611) {
															Static272.anIntArray571[local5++] = Static225.anInt4325;
															continue;
														}
													} else if (local45 < 6100) {
														if (local45 == 6001) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 1) {
																local627 = 1;
															}
															if (local627 > 4) {
																local627 = 4;
															}
															Static10.anInt185 = local627;
															if (!Static94.aBoolean138 || !Static56.aBoolean66) {
																if (Static10.anInt185 == 1) {
																	Static158.method2552(0.9F);
																}
																if (Static10.anInt185 == 2) {
																	Static158.method2552(0.8F);
																}
																if (Static10.anInt185 == 3) {
																	Static158.method2552(0.7F);
																}
																if (Static10.anInt185 == 4) {
																	Static158.method2552(0.6F);
																}
															}
															if (Static94.aBoolean138) {
																Static99.method1655();
																if (!Static56.aBoolean66) {
																	Static298.method4492();
																}
															}
															Static12.method198();
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6002) {
															local5--;
															Static280.method665(Static272.anIntArray571[local5] == 1);
															Static227.method3636();
															Static298.method4492();
															Static93.method2015();
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6003) {
															local5--;
															Static141.aBoolean399 = Static272.anIntArray571[local5] == 1;
															Static93.method2015();
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6005) {
															local5--;
															Static117.aBoolean159 = Static272.anIntArray571[local5] == 1;
															Static298.method4492();
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6006) {
															local5--;
															Static233.aBoolean227 = Static272.anIntArray571[local5] == 1;
															((Class24_Sub1) Static158.anInterface5_1).method457(!Static233.aBoolean227);
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6007) {
															local5--;
															Static82.aBoolean117 = Static272.anIntArray571[local5] == 1;
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6008) {
															local5--;
															Static312.aBoolean422 = Static272.anIntArray571[local5] == 1;
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6009) {
															local5--;
															Static27.aBoolean27 = Static272.anIntArray571[local5] == 1;
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6010) {
															local5--;
															Static66.aBoolean75 = Static272.anIntArray571[local5] == 1;
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6011) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 0 || local627 > 2) {
																local627 = 0;
															}
															Static114.anInt2298 = local627;
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6012) {
															if (Static94.aBoolean138) {
																Static164.method2665(0, 0);
															}
															local5--;
															Static56.aBoolean66 = Static272.anIntArray571[local5] == 1;
															if (Static94.aBoolean138 && Static56.aBoolean66) {
																Static158.method2552(0.7F);
															} else {
																if (Static10.anInt185 == 1) {
																	Static158.method2552(0.9F);
																}
																if (Static10.anInt185 == 2) {
																	Static158.method2552(0.8F);
																}
																if (Static10.anInt185 == 3) {
																	Static158.method2552(0.7F);
																}
																if (Static10.anInt185 == 4) {
																	Static158.method2552(0.6F);
																}
															}
															Static298.method4492();
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6014) {
															local5--;
															Static303.aBoolean394 = Static272.anIntArray571[local5] == 1;
															if (Static94.aBoolean138) {
																Static298.method4492();
															}
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6015) {
															local5--;
															Static279.aBoolean363 = Static272.anIntArray571[local5] == 1;
															if (Static94.aBoolean138) {
																Static99.method1655();
															}
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6016) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (Static94.aBoolean138) {
																Static20.aBoolean18 = true;
															}
															if (local627 < 0 || local627 > 2) {
																local627 = 0;
															}
															Static55.anInt1125 = local627;
															continue;
														}
														if (local45 == 6017) {
															local5--;
															Static273.aBoolean122 = Static272.anIntArray571[local5] == 1;
															Static12.method199();
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6018) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 0) {
																local627 = 0;
															}
															if (local627 > 127) {
																local627 = 127;
															}
															Static171.anInt3315 = local627;
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6019) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 0) {
																local627 = 0;
															}
															if (local627 > 255) {
																local627 = 255;
															}
															if (Static24.anInt344 != local627) {
																if (Static24.anInt344 == 0 && Static254.anInt4845 != -1) {
																	Static204.method3264(local627, Static254.anInt4845, Static278.aClass58_98);
																	Static153.aBoolean210 = false;
																} else if (local627 == 0) {
																	Static307.method4755();
																	Static153.aBoolean210 = false;
																} else {
																	Static222.method3578(local627);
																}
																Static24.anInt344 = local627;
															}
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6020) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 0) {
																local627 = 0;
															}
															if (local627 > 127) {
																local627 = 127;
															}
															Static208.anInt4120 = local627;
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															continue;
														}
														if (local45 == 6021) {
															local5--;
															Static85.aBoolean119 = Static272.anIntArray571[local5] == 1;
															Static93.method2015();
															continue;
														}
														if (local45 == 6023) {
															local1075 = false;
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 0) {
																local627 = 0;
															}
															if (local627 > 2) {
																local627 = 2;
															}
															if (Static164.anInt3256 < 96) {
																local627 = 0;
																local1075 = true;
															}
															Static184.method2970(local627);
															Static66.method1055(Static276.aClass139_4);
															Static78.aBoolean104 = false;
															Static272.anIntArray571[local5++] = local1075 ? 0 : 1;
															continue;
														}
														if (local45 == 6024) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (local627 < 0 || local627 > 2) {
																local627 = 0;
															}
															Static21.anInt1051 = local627;
															Static66.method1055(Static276.aClass139_4);
															continue;
														}
														if (local45 == 6027) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (!Static94.aBoolean138) {
																continue;
															}
															if (local627 < 0 || local627 > 1) {
																local627 = 0;
															}
															Static22.method300(local627 == 1);
															continue;
														}
														if (local45 == 6028) {
															local5--;
															Static61.aBoolean69 = Static272.anIntArray571[local5] != 0;
															Static66.method1055(Static276.aClass139_4);
															continue;
														}
													} else if (local45 < 6200) {
														if (local45 == 6101) {
															Static272.anIntArray571[local5++] = Static10.anInt185;
															continue;
														}
														if (local45 == 6102) {
															Static272.anIntArray571[local5++] = Static29.method456() ? 1 : 0;
															continue;
														}
														if (local45 == 6103) {
															Static272.anIntArray571[local5++] = Static141.aBoolean399 ? 1 : 0;
															continue;
														}
														if (local45 == 6105) {
															Static272.anIntArray571[local5++] = Static117.aBoolean159 ? 1 : 0;
															continue;
														}
														if (local45 == 6106) {
															Static272.anIntArray571[local5++] = Static233.aBoolean227 ? 1 : 0;
															continue;
														}
														if (local45 == 6107) {
															Static272.anIntArray571[local5++] = Static82.aBoolean117 ? 1 : 0;
															continue;
														}
														if (local45 == 6108) {
															Static272.anIntArray571[local5++] = Static312.aBoolean422 ? 1 : 0;
															continue;
														}
														if (local45 == 6109) {
															Static272.anIntArray571[local5++] = Static27.aBoolean27 ? 1 : 0;
															continue;
														}
														if (local45 == 6110) {
															Static272.anIntArray571[local5++] = Static66.aBoolean75 ? 1 : 0;
															continue;
														}
														if (local45 == 6111) {
															Static272.anIntArray571[local5++] = Static114.anInt2298;
															continue;
														}
														if (local45 == 6112) {
															Static272.anIntArray571[local5++] = Static56.aBoolean66 ? 1 : 0;
															continue;
														}
														if (local45 == 6114) {
															Static272.anIntArray571[local5++] = Static303.aBoolean394 ? 1 : 0;
															continue;
														}
														if (local45 == 6115) {
															Static272.anIntArray571[local5++] = Static279.aBoolean363 ? 1 : 0;
															continue;
														}
														if (local45 == 6116) {
															Static272.anIntArray571[local5++] = Static55.anInt1125;
															continue;
														}
														if (local45 == 6117) {
															Static272.anIntArray571[local5++] = Static273.aBoolean122 ? 1 : 0;
															continue;
														}
														if (local45 == 6118) {
															Static272.anIntArray571[local5++] = Static171.anInt3315;
															continue;
														}
														if (local45 == 6119) {
															Static272.anIntArray571[local5++] = Static24.anInt344;
															continue;
														}
														if (local45 == 6120) {
															Static272.anIntArray571[local5++] = Static208.anInt4120;
															continue;
														}
														if (local45 == 6121) {
															if (Static94.aBoolean138) {
																Static272.anIntArray571[local5++] = Static94.aBoolean130 ? 1 : 0;
															} else {
																Static272.anIntArray571[local5++] = 0;
															}
															continue;
														}
														if (local45 == 6123) {
															Static272.anIntArray571[local5++] = Static184.method2967();
															continue;
														}
														if (local45 == 6124) {
															Static272.anIntArray571[local5++] = Static21.anInt1051;
															continue;
														}
														if (local45 == 6126) {
															if (Static94.aBoolean138) {
																Static272.anIntArray571[local5++] = Static53.method877() ? 1 : 0;
															} else {
																Static272.anIntArray571[local5++] = 0;
															}
															continue;
														}
														if (local45 == 6127) {
															Static272.anIntArray571[local5++] = Static300.aBoolean391 ? 1 : 0;
															continue;
														}
														if (local45 == 6128) {
															Static272.anIntArray571[local5++] = Static61.aBoolean69 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6300) {
														if (local45 == 6200) {
															local5 -= 2;
															Static275.aShort45 = (short) Static272.anIntArray571[local5];
															if (Static275.aShort45 <= 0) {
																Static275.aShort45 = 256;
															}
															Static164.aShort25 = (short) Static272.anIntArray571[local5 + 1];
															if (Static164.aShort25 <= 0) {
																Static164.aShort25 = 205;
															}
															continue;
														}
														if (local45 == 6201) {
															local5 -= 2;
															Static110.aShort13 = (short) Static272.anIntArray571[local5];
															if (Static110.aShort13 <= 0) {
																Static110.aShort13 = 256;
															}
															Static98.aShort12 = (short) Static272.anIntArray571[local5 + 1];
															if (Static98.aShort12 <= 0) {
																Static98.aShort12 = 320;
															}
															continue;
														}
														if (local45 == 6202) {
															local5 -= 4;
															Static157.aShort18 = (short) Static272.anIntArray571[local5];
															if (Static157.aShort18 <= 0) {
																Static157.aShort18 = 1;
															}
															Static10.aShort1 = (short) Static272.anIntArray571[local5 + 1];
															if (Static10.aShort1 <= 0) {
																Static10.aShort1 = 32767;
															} else if (Static157.aShort18 > Static10.aShort1) {
																Static10.aShort1 = Static157.aShort18;
															}
															Static24.aShort9 = (short) Static272.anIntArray571[local5 + 2];
															if (Static24.aShort9 <= 0) {
																Static24.aShort9 = 1;
															}
															Static280.aShort11 = (short) Static272.anIntArray571[local5 + 3];
															if (Static280.aShort11 <= 0) {
																Static280.aShort11 = 32767;
															} else if (Static24.aShort9 > Static280.aShort11) {
																Static280.aShort11 = Static24.aShort9;
															}
															continue;
														}
														if (local45 == 6203) {
															Static250.method3961(0, false, Static115.aClass189_5.anInt5953, 0, Static115.aClass189_5.anInt5897);
															Static272.anIntArray571[local5++] = Static240.anInt4547;
															Static272.anIntArray571[local5++] = Static69.anInt1333;
															continue;
														}
														if (local45 == 6204) {
															Static272.anIntArray571[local5++] = Static110.aShort13;
															Static272.anIntArray571[local5++] = Static98.aShort12;
															continue;
														}
														if (local45 == 6205) {
															Static272.anIntArray571[local5++] = Static275.aShort45;
															Static272.anIntArray571[local5++] = Static164.aShort25;
															continue;
														}
													} else if (local45 < 6400) {
														if (local45 == 6300) {
															Static272.anIntArray571[local5++] = (int) (Static101.method1677() / 60000L);
															continue;
														}
														if (local45 == 6301) {
															Static272.anIntArray571[local5++] = (int) (Static101.method1677() / 86400000L) - 11745;
															continue;
														}
														if (local45 == 6302) {
															local5 -= 3;
															local627 = Static272.anIntArray571[local5];
															local936 = Static272.anIntArray571[local5 + 2];
															local638 = Static272.anIntArray571[local5 + 1];
															Static313.aCalendar2.clear();
															Static313.aCalendar2.set(11, 12);
															Static313.aCalendar2.set(local936, local638, local627);
															Static272.anIntArray571[local5++] = (int) (Static313.aCalendar2.getTime().getTime() / 86400000L) - 11745;
															continue;
														}
														if (local45 == 6303) {
															Static313.aCalendar2.clear();
															Static313.aCalendar2.setTime(new Date(Static101.method1677()));
															Static272.anIntArray571[local5++] = Static313.aCalendar2.get(1);
															continue;
														}
														if (local45 == 6304) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local1075 = true;
															if (local627 < 0) {
																local1075 = (local627 + 1) % 4 == 0;
															} else if (local627 < 1582) {
																local1075 = local627 % 4 == 0;
															} else if (local627 % 4 != 0) {
																local1075 = false;
															} else if (local627 % 100 != 0) {
																local1075 = true;
															} else if (local627 % 400 != 0) {
																local1075 = false;
															}
															Static272.anIntArray571[local5++] = local1075 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6500) {
														if (local45 == 6405) {
															Static272.anIntArray571[local5++] = Static189.method3001() ? 1 : 0;
															continue;
														}
														if (local45 == 6406) {
															Static272.anIntArray571[local5++] = Static69.method1079() ? 1 : 0;
															continue;
														}
													} else if (local45 < 6600) {
														if (local45 == 6500) {
															if (Static169.anInt3304 == 10 && Static266.anInt5118 == 0 && Static133.anInt2574 == 0 && Static250.anInt4760 == 0) {
																Static272.anIntArray571[local5++] = Static145.method2292() == -1 ? 0 : 1;
																continue;
															}
															Static272.anIntArray571[local5++] = 1;
															continue;
														}
														@Pc(7735) Class154 local7735;
														@Pc(7710) Class63_Sub1 local7710;
														if (local45 == 6501) {
															local7710 = Static131.method1992();
															if (local7710 == null) {
																Static272.anIntArray571[local5++] = -1;
																Static272.anIntArray571[local5++] = 0;
																Static51.aStringArray5[local13++] = "";
																Static272.anIntArray571[local5++] = 0;
																Static51.aStringArray5[local13++] = "";
																Static272.anIntArray571[local5++] = 0;
															} else {
																Static272.anIntArray571[local5++] = local7710.anInt2037;
																Static272.anIntArray571[local5++] = local7710.anInt2020;
																Static51.aStringArray5[local13++] = local7710.aString110;
																local7735 = local7710.method1552();
																Static272.anIntArray571[local5++] = local7735.anInt4470;
																Static51.aStringArray5[local13++] = local7735.aString277;
																Static272.anIntArray571[local5++] = local7710.anInt2023;
															}
															continue;
														}
														if (local45 == 6502) {
															local7710 = Static110.method1778();
															if (local7710 == null) {
																Static272.anIntArray571[local5++] = -1;
																Static272.anIntArray571[local5++] = 0;
																Static51.aStringArray5[local13++] = "";
																Static272.anIntArray571[local5++] = 0;
																Static51.aStringArray5[local13++] = "";
																Static272.anIntArray571[local5++] = 0;
															} else {
																Static272.anIntArray571[local5++] = local7710.anInt2037;
																Static272.anIntArray571[local5++] = local7710.anInt2020;
																Static51.aStringArray5[local13++] = local7710.aString110;
																local7735 = local7710.method1552();
																Static272.anIntArray571[local5++] = local7735.anInt4470;
																Static51.aStringArray5[local13++] = local7735.aString277;
																Static272.anIntArray571[local5++] = local7710.anInt2023;
															}
															continue;
														}
														if (local45 == 6503) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															if (Static169.anInt3304 == 10 && Static266.anInt5118 == 0 && Static133.anInt2574 == 0 && Static250.anInt4760 == 0) {
																Static272.anIntArray571[local5++] = Static307.method4757(local627) ? 1 : 0;
																continue;
															}
															Static272.anIntArray571[local5++] = 0;
															continue;
														}
														if (local45 == 6504) {
															local5--;
															Static203.anInt3909 = Static272.anIntArray571[local5];
															Static66.method1055(Static276.aClass139_4);
															continue;
														}
														if (local45 == 6505) {
															Static272.anIntArray571[local5++] = Static203.anInt3909;
															continue;
														}
														if (local45 == 6506) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															@Pc(7957) Class63_Sub1 local7957 = Static125.method1928(local627);
															if (local7957 == null) {
																Static272.anIntArray571[local5++] = -1;
																Static51.aStringArray5[local13++] = "";
																Static272.anIntArray571[local5++] = 0;
																Static51.aStringArray5[local13++] = "";
																Static272.anIntArray571[local5++] = 0;
															} else {
																Static272.anIntArray571[local5++] = local7957.anInt2020;
																Static51.aStringArray5[local13++] = local7957.aString110;
																@Pc(8003) Class154 local8003 = local7957.method1552();
																Static272.anIntArray571[local5++] = local8003.anInt4470;
																Static51.aStringArray5[local13++] = local8003.aString277;
																Static272.anIntArray571[local5++] = local7957.anInt2023;
															}
															continue;
														}
														if (local45 == 6507) {
															local5 -= 4;
															local627 = Static272.anIntArray571[local5];
															local1075 = Static272.anIntArray571[local5 + 1] == 1;
															local936 = Static272.anIntArray571[local5 + 2];
															local8063 = Static272.anIntArray571[local5 + 3] == 1;
															Static35.method553(local1075, local627, local8063, local936);
															continue;
														}
													} else if (local45 < 6700) {
														if (local45 == 6600) {
															local5--;
															Static212.aBoolean293 = Static272.anIntArray571[local5] == 1;
															Static66.method1055(Static276.aClass139_4);
															continue;
														}
														if (local45 == 6601) {
															Static272.anIntArray571[local5++] = Static212.aBoolean293 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6900) {
														@Pc(8093) Class83 local8093;
														if (local45 == 6800) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local8093 = Static142.method2192(local627);
															if (local8093.aString131 == null) {
																Static51.aStringArray5[local13++] = "";
															} else {
																Static51.aStringArray5[local13++] = local8093.aString131;
															}
															continue;
														}
														if (local45 == 6801) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local8093 = Static142.method2192(local627);
															Static272.anIntArray571[local5++] = local8093.anInt2277;
															continue;
														}
														if (local45 == 6802) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local8093 = Static142.method2192(local627);
															Static272.anIntArray571[local5++] = local8093.anInt2270;
															continue;
														}
														if (local45 == 6803) {
															local5--;
															local627 = Static272.anIntArray571[local5];
															local8093 = Static142.method2192(local627);
															Static272.anIntArray571[local5++] = local8093.anInt2284;
															continue;
														}
													}
												}
											} else if (local45 == 4500) {
												local5 -= 2;
												local627 = Static272.anIntArray571[local5];
												local638 = Static272.anIntArray571[local5 + 1];
												local3890 = Static114.method1816(local638);
												if (local3890.method1996()) {
													Static51.aStringArray5[local13++] = Static198.method4740(local627).method3841(local3890.aString153, local638);
												} else {
													Static272.anIntArray571[local5++] = Static198.method4740(local627).method3837(local3890.anInt2546, local638);
												}
												continue;
											}
										} else if (local45 == 4400) {
											local5 -= 2;
											local627 = Static272.anIntArray571[local5];
											local638 = Static272.anIntArray571[local5 + 1];
											local3890 = Static114.method1816(local638);
											if (local3890.method1996()) {
												Static51.aStringArray5[local13++] = Static6.method99(local627).method4504(local3890.aString153, local638);
											} else {
												Static272.anIntArray571[local5++] = Static6.method99(local627).method4488(local3890.anInt2546, local638);
											}
											continue;
										}
									} else {
										if (local45 == 4100) {
											local13--;
											local423 = Static51.aStringArray5[local13];
											local5--;
											local638 = Static272.anIntArray571[local5];
											Static51.aStringArray5[local13++] = local423 + local638;
											continue;
										}
										if (local45 == 4101) {
											local13 -= 2;
											local423 = Static51.aStringArray5[local13];
											local1590 = Static51.aStringArray5[local13 + 1];
											Static51.aStringArray5[local13++] = local423 + local1590;
											continue;
										}
										if (local45 == 4102) {
											local5--;
											local638 = Static272.anIntArray571[local5];
											local13--;
											local423 = Static51.aStringArray5[local13];
											Static51.aStringArray5[local13++] = local423 + Static212.method3449(local638);
											continue;
										}
										if (local45 == 4103) {
											local13--;
											local423 = Static51.aStringArray5[local13];
											Static51.aStringArray5[local13++] = local423.toLowerCase();
											continue;
										}
										if (local45 == 4104) {
											local5--;
											local627 = Static272.anIntArray571[local5];
											@Pc(11104) long local11104 = (long) local627 * 86400000L + 1014768000000L;
											Static313.aCalendar2.setTime(new Date(local11104));
											local471 = Static313.aCalendar2.get(5);
											local2586 = Static313.aCalendar2.get(2);
											local8874 = Static313.aCalendar2.get(1);
											Static51.aStringArray5[local13++] = local471 + "-" + Static234.aStringArray25[local2586] + "-" + local8874;
											continue;
										}
										if (local45 == 4105) {
											local13 -= 2;
											local1590 = Static51.aStringArray5[local13 + 1];
											local423 = Static51.aStringArray5[local13];
											if (Static154.aClass53_Sub1_Sub1_2.aClass147_2 != null && Static154.aClass53_Sub1_Sub1_2.aClass147_2.aBoolean307) {
												Static51.aStringArray5[local13++] = local1590;
												continue;
											}
											Static51.aStringArray5[local13++] = local423;
											continue;
										}
										if (local45 == 4106) {
											local5--;
											local627 = Static272.anIntArray571[local5];
											Static51.aStringArray5[local13++] = Integer.toString(local627);
											continue;
										}
										if (local45 == 4107) {
											local13 -= 2;
											Static272.anIntArray571[local5++] = Static199.method3233(Static306.method4748(Static51.aStringArray5[local13 + 1], Static9.anInt124, Static51.aStringArray5[local13]));
											continue;
										}
										if (local45 == 4108) {
											local5 -= 2;
											local936 = Static272.anIntArray571[local5 + 1];
											local638 = Static272.anIntArray571[local5];
											local13--;
											local423 = Static51.aStringArray5[local13];
											Static272.anIntArray571[local5++] = Static236.method3693(local936).method2281(local423, local638);
											continue;
										}
										if (local45 == 4109) {
											local5 -= 2;
											local13--;
											local423 = Static51.aStringArray5[local13];
											local638 = Static272.anIntArray571[local5];
											local936 = Static272.anIntArray571[local5 + 1];
											Static272.anIntArray571[local5++] = Static236.method3693(local936).method2268(local423, local638);
											continue;
										}
										if (local45 == 4110) {
											local13 -= 2;
											local423 = Static51.aStringArray5[local13];
											local1590 = Static51.aStringArray5[local13 + 1];
											local5--;
											if (Static272.anIntArray571[local5] == 1) {
												Static51.aStringArray5[local13++] = local423;
											} else {
												Static51.aStringArray5[local13++] = local1590;
											}
											continue;
										}
										if (local45 == 4111) {
											local13--;
											local423 = Static51.aStringArray5[local13];
											Static51.aStringArray5[local13++] = Static97.method2272(local423);
											continue;
										}
										if (local45 == 4112) {
											local13--;
											local423 = Static51.aStringArray5[local13];
											local5--;
											local638 = Static272.anIntArray571[local5];
											if (local638 == -1) {
												throw new RuntimeException("null char");
											}
											Static51.aStringArray5[local13++] = local423 + (char) local638;
											continue;
										}
										if (local45 == 4113) {
											local5--;
											local627 = Static272.anIntArray571[local5];
											Static272.anIntArray571[local5++] = Static122.method1908((char) local627) ? 1 : 0;
											continue;
										}
										if (local45 == 4114) {
											local5--;
											local627 = Static272.anIntArray571[local5];
											Static272.anIntArray571[local5++] = Static40.method636((char) local627) ? 1 : 0;
											continue;
										}
										if (local45 == 4115) {
											local5--;
											local627 = Static272.anIntArray571[local5];
											Static272.anIntArray571[local5++] = Static131.method1997((char) local627) ? 1 : 0;
											continue;
										}
										if (local45 == 4116) {
											local5--;
											local627 = Static272.anIntArray571[local5];
											Static272.anIntArray571[local5++] = Static83.method1478((char) local627) ? 1 : 0;
											continue;
										}
										if (local45 == 4117) {
											local13--;
											local423 = Static51.aStringArray5[local13];
											if (local423 == null) {
												Static272.anIntArray571[local5++] = 0;
											} else {
												Static272.anIntArray571[local5++] = local423.length();
											}
											continue;
										}
										if (local45 == 4118) {
											local5 -= 2;
											local13--;
											local423 = Static51.aStringArray5[local13];
											local638 = Static272.anIntArray571[local5];
											local936 = Static272.anIntArray571[local5 + 1];
											Static51.aStringArray5[local13++] = local423.substring(local638, local936);
											continue;
										}
										if (local45 == 4119) {
											local13--;
											local423 = Static51.aStringArray5[local13];
											local9775 = false;
											@Pc(11550) StringBuffer local11550 = new StringBuffer(local423.length());
											for (local471 = 0; local471 < local423.length(); local471++) {
												@Pc(11564) char local11564 = local423.charAt(local471);
												if (local11564 == '<') {
													local9775 = true;
												} else if (local11564 == '>') {
													local9775 = false;
												} else if (!local9775) {
													local11550.append(local11564);
												}
											}
											Static51.aStringArray5[local13++] = local11550.toString();
											continue;
										}
										if (local45 == 4120) {
											local5 -= 2;
											local13--;
											local423 = Static51.aStringArray5[local13];
											local638 = Static272.anIntArray571[local5];
											local936 = Static272.anIntArray571[local5 + 1];
											Static272.anIntArray571[local5++] = local423.indexOf(local638, local936);
											continue;
										}
										if (local45 == 4121) {
											local5--;
											local936 = Static272.anIntArray571[local5];
											local13 -= 2;
											local423 = Static51.aStringArray5[local13];
											local1590 = Static51.aStringArray5[local13 + 1];
											Static272.anIntArray571[local5++] = local423.indexOf(local1590, local936);
											continue;
										}
										if (local45 == 4122) {
											local5--;
											local627 = Static272.anIntArray571[local5];
											Static272.anIntArray571[local5++] = Character.toLowerCase((char) local627);
											continue;
										}
										if (local45 == 4123) {
											local5--;
											local627 = Static272.anIntArray571[local5];
											Static272.anIntArray571[local5++] = Character.toUpperCase((char) local627);
											continue;
										}
										if (local45 == 4124) {
											local5--;
											local11712 = Static272.anIntArray571[local5] != 0;
											local5--;
											local638 = Static272.anIntArray571[local5];
											Static51.aStringArray5[local13++] = Static293.method4471((long) local638, local11712, 0, Static9.anInt124);
											continue;
										}
									}
								} else {
									if (local45 == 4000) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = local627 + local638;
										continue;
									}
									if (local45 == 4001) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = local627 - local638;
										continue;
									}
									if (local45 == 4002) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = local627 * local638;
										continue;
									}
									if (local45 == 4003) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = local627 / local638;
										continue;
									}
									if (local45 == 4004) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = (int) ((double) local627 * Math.random());
										continue;
									}
									if (local45 == 4005) {
										local5--;
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = (int) ((double) (local627 + 1) * Math.random());
										continue;
									}
									if (local45 == 4006) {
										local5 -= 5;
										local627 = Static272.anIntArray571[local5];
										local936 = Static272.anIntArray571[local5 + 2];
										local471 = Static272.anIntArray571[local5 + 3];
										local638 = Static272.anIntArray571[local5 + 1];
										local2586 = Static272.anIntArray571[local5 + 4];
										Static272.anIntArray571[local5++] = (local2586 - local936) * (-local627 + local638) / (local471 - local936) + local627;
										continue;
									}
									@Pc(11942) long local11942;
									@Pc(11935) long local11935;
									if (local45 == 4007) {
										local5 -= 2;
										local11935 = Static272.anIntArray571[local5];
										local11942 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = (int) (local11942 * local11935 / 100L + local11935);
										continue;
									}
									if (local45 == 4008) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = 0x1 << local638 | local627;
										continue;
									}
									if (local45 == 4009) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = -(0x1 << local638) - 1 & local627;
										continue;
									}
									if (local45 == 4010) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = (local627 & 0x1 << local638) == 0 ? 0 : 1;
										continue;
									}
									if (local45 == 4011) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = local627 % local638;
										continue;
									}
									if (local45 == 4012) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										if (local627 == 0) {
											Static272.anIntArray571[local5++] = 0;
										} else {
											Static272.anIntArray571[local5++] = (int) Math.pow((double) local627, (double) local638);
										}
										continue;
									}
									if (local45 == 4013) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										if (local627 == 0) {
											Static272.anIntArray571[local5++] = 0;
										} else if (local638 == 0) {
											Static272.anIntArray571[local5++] = Integer.MAX_VALUE;
										} else {
											Static272.anIntArray571[local5++] = (int) Math.pow((double) local627, 1.0D / (double) local638);
										}
										continue;
									}
									if (local45 == 4014) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = local638 & local627;
										continue;
									}
									if (local45 == 4015) {
										local5 -= 2;
										local638 = Static272.anIntArray571[local5 + 1];
										local627 = Static272.anIntArray571[local5];
										Static272.anIntArray571[local5++] = local638 | local627;
										continue;
									}
									if (local45 == 4016) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = local638 <= local627 ? local638 : local627;
										continue;
									}
									if (local45 == 4017) {
										local5 -= 2;
										local627 = Static272.anIntArray571[local5];
										local638 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = local627 > local638 ? local627 : local638;
										continue;
									}
									if (local45 == 4018) {
										local5 -= 3;
										local11935 = Static272.anIntArray571[local5];
										@Pc(12278) long local12278 = (long) Static272.anIntArray571[local5 + 2];
										local11942 = Static272.anIntArray571[local5 + 1];
										Static272.anIntArray571[local5++] = (int) (local12278 * local11935 / local11942);
										continue;
									}
								}
							}
						} else {
							if (local45 < 2000) {
								local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
							} else {
								local5--;
								local885 = Static114.method1814(Static272.anIntArray571[local5]);
								local45 -= 1000;
							}
							if (local45 == 1000) {
								local5 -= 4;
								local885.anInt5932 = Static272.anIntArray571[local5];
								local885.anInt5955 = Static272.anIntArray571[local5 + 1];
								local638 = Static272.anIntArray571[local5 + 2];
								if (local638 < 0) {
									local638 = 0;
								} else if (local638 > 5) {
									local638 = 5;
								}
								local936 = Static272.anIntArray571[local5 + 3];
								local885.aByte26 = (byte) local638;
								if (local936 < 0) {
									local936 = 0;
								} else if (local936 > 5) {
									local936 = 5;
								}
								local885.aByte25 = (byte) local936;
								Static205.method3283(local885);
								Static264.method4155(local885);
								if (local885.anInt5972 == -1) {
									Static292.method4442(local885.anInt5918);
								}
								continue;
							}
							if (local45 == 1001) {
								local5 -= 4;
								local885.anInt5931 = Static272.anIntArray571[local5];
								local885.anInt5954 = Static272.anIntArray571[local5 + 1];
								local885.anInt5961 = 0;
								local885.anInt5924 = 0;
								local936 = Static272.anIntArray571[local5 + 3];
								if (local936 < 0) {
									local936 = 0;
								} else if (local936 > 4) {
									local936 = 4;
								}
								local638 = Static272.anIntArray571[local5 + 2];
								if (local638 < 0) {
									local638 = 0;
								} else if (local638 > 4) {
									local638 = 4;
								}
								local885.aByte27 = (byte) local936;
								local885.aByte24 = (byte) local638;
								Static205.method3283(local885);
								Static264.method4155(local885);
								if (local885.anInt5915 == 0) {
									Static272.method4288(false, local885);
								}
								continue;
							}
							if (local45 == 1003) {
								local5--;
								local1075 = Static272.anIntArray571[local5] == 1;
								if (local1075 != local885.aBoolean418) {
									local885.aBoolean418 = local1075;
									Static205.method3283(local885);
								}
								if (local885.anInt5972 == -1) {
									Static257.method4063(local885.anInt5918);
								}
								continue;
							}
							if (local45 == 1004) {
								local5 -= 2;
								local885.anInt5912 = Static272.anIntArray571[local5];
								local885.anInt5974 = Static272.anIntArray571[local5 + 1];
								Static205.method3283(local885);
								Static264.method4155(local885);
								if (local885.anInt5915 == 0) {
									Static272.method4288(false, local885);
								}
								continue;
							}
							if (local45 == 1005) {
								local5--;
								local885.aBoolean408 = Static272.anIntArray571[local5] == 1;
								continue;
							}
						}
					}
				} else if (local45 == 100) {
					local5 -= 3;
					local936 = Static272.anIntArray571[local5 + 2];
					local627 = Static272.anIntArray571[local5];
					local638 = Static272.anIntArray571[local5 + 1];
					if (local638 != 0) {
						local14049 = Static114.method1814(local627);
						if (local14049.aClass189Array4 == null) {
							local14049.aClass189Array4 = new Class189[local936 + 1];
						}
						if (local936 >= local14049.aClass189Array4.length) {
							@Pc(14815) Class189[] local14815 = new Class189[local936 + 1];
							for (local8874 = 0; local8874 < local14049.aClass189Array4.length; local8874++) {
								local14815[local8874] = local14049.aClass189Array4[local8874];
							}
							local14049.aClass189Array4 = local14815;
						}
						if (local936 > 0 && local14049.aClass189Array4[local936 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local936 - 1));
						}
						@Pc(14865) Class189 local14865 = new Class189();
						local14865.anInt5941 = local14865.anInt5918 = local14049.anInt5918;
						local14865.aBoolean417 = true;
						local14865.anInt5972 = local936;
						local14865.anInt5915 = local638;
						local14049.aClass189Array4[local936] = local14865;
						if (local846) {
							Static131.aClass189_8 = local14865;
						} else {
							Static143.aClass189_9 = local14865;
						}
						Static205.method3283(local14049);
						continue;
					}
					throw new RuntimeException();
				} else {
					@Pc(14935) Class189 local14935;
					if (local45 == 101) {
						local885 = local846 ? Static131.aClass189_8 : Static143.aClass189_9;
						if (local885.anInt5972 == -1) {
							if (!local846) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local14935 = Static114.method1814(local885.anInt5918);
						local14935.aClass189Array4[local885.anInt5972] = null;
						Static205.method3283(local14935);
						continue;
					}
					if (local45 == 102) {
						local5--;
						local885 = Static114.method1814(Static272.anIntArray571[local5]);
						local885.aClass189Array4 = null;
						Static205.method3283(local885);
						continue;
					}
					if (local45 == 200) {
						local5 -= 2;
						local627 = Static272.anIntArray571[local5];
						local638 = Static272.anIntArray571[local5 + 1];
						local14079 = Static152.method2432(local627, local638);
						if (local14079 != null && local638 != -1) {
							Static272.anIntArray571[local5++] = 1;
							if (local846) {
								Static131.aClass189_8 = local14079;
							} else {
								Static143.aClass189_9 = local14079;
							}
							continue;
						}
						Static272.anIntArray571[local5++] = 0;
						continue;
					}
					if (local45 == 201) {
						local5--;
						local627 = Static272.anIntArray571[local5];
						local14935 = Static114.method1814(local627);
						if (local14935 == null) {
							Static272.anIntArray571[local5++] = 0;
						} else {
							Static272.anIntArray571[local5++] = 1;
							if (local846) {
								Static131.aClass189_8 = local14935;
							} else {
								Static143.aClass189_9 = local14935;
							}
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15060) Exception local15060) {
			if (arg1.aString159 == null) {
				if (Static166.anInt3406 != 0) {
					Static186.method4394("", 0, "Clientscript error - check log for details");
				}
				Static193.method3072(local15060, "CS2 - scr:" + arg1.aLong217 + " op:" + local25);
			} else {
				@Pc(15069) StringBuffer local15069 = new StringBuffer(30);
				local15069.append("%0a - in: ").append(arg1.aString159);
				for (local627 = Static76.anInt5743 - 1; local627 >= 0; local627--) {
					local15069.append("%0a - via: ").append(Static292.aClass177Array1[local627].aClass4_Sub3_Sub13_1.aString159);
				}
				if (local25 == 40) {
					local627 = local23[local11];
					local15069.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local627));
				}
				if (Static166.anInt3406 != 0) {
					Static186.method4394("", 0, "Clientscript error in: " + arg1.aString159);
				}
				Static193.method3072(local15060, "CS2 - scr:" + arg1.aLong217 + " op:" + local25 + local15069.toString());
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[F")
	public static float[] method1553(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static178.method2786() + Static178.method2789();
		@Pc(9) int local9 = Static178.method2791();
		@Pc(18) float local18 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(31) float local31 = (float) (local9 & 0xFF) / 255.0F;
		Static159.aFloatArray64[3] = 1.0F;
		@Pc(44) float local44 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(46) float local46 = 0.58823526F;
		Static159.aFloatArray64[0] = local7 * local18 * ((float) (arg0 >> 16 & 0xFF) / 255.0F) * local46;
		Static159.aFloatArray64[2] = local31 * ((float) (arg0 & 0xFF) / 255.0F) * local46 * local7;
		Static159.aFloatArray64[1] = local44 * ((float) (arg0 >> 8 & 0xFF) / 255.0F) * local46 * local7;
		return Static159.aFloatArray64;
	}
}
