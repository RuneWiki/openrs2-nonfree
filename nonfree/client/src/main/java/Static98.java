import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!ka;")
	private static Class107 aClass107_1;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[I")
	private static int[] anIntArray239;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Lclient!rg;")
	private static Class177 aClass177_4;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray13;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "Lclient!rg;")
	private static Class177 aClass177_5;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "[[I")
	private static final int[][] anIntArrayArray15 = new int[5][5000];

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "[I")
	private static final int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "[Lclient!fg;")
	private static final Class60[] aClass60Array1 = new Class60[50];

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
	private static int anInt1938 = 0;

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "[I")
	private static final int[] anIntArray240 = new int[1000];

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray14 = new String[1000];

	@OriginalMember(owner = "client!fq", name = "x", descriptor = "[I")
	private static final int[] anIntArray241 = new int[3];

	@OriginalMember(owner = "client!fq", name = "y", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_55 = new Class140(4);

	@OriginalMember(owner = "client!fq", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray15 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
	public static void method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub1_Sub20 local5 = Static191.method3010(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray239 = new int[local5.anInt6267];
		aStringArray13 = new String[local5.anInt6273];
		if (local5.anInt6271 == 15 || local5.anInt6271 == 17 || local5.anInt6271 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static346.aClass177_25 != null) {
				local30 = Static346.aClass177_25.anInt5201;
				local32 = Static346.aClass177_25.anInt5177;
			}
			anIntArray239[0] = Static179.anInt3693 - local30;
			anIntArray239[1] = Static295.anInt5742 - local32;
		}
		method1800(local5, 200000);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!kb;)V")
	public static void method1797(@OriginalArg(0) Class1_Sub19 arg0) {
		method1799(arg0, 200000);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method1798(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static198.method3725(arg0)) {
			return;
		}
		@Pc(12) Class177[] local12 = Static314.aClass177ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class177 local19 = local12[local14];
			if (local19.anObjectArray10 != null) {
				@Pc(26) Class1_Sub19 local26 = new Class1_Sub19();
				local26.aClass177_9 = local19;
				local26.anObjectArray3 = local19.anObjectArray10;
				method1799(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!kb;I)V")
	private static void method1799(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub1_Sub20 local12 = Static109.method2035(local8);
		if (local12 == null) {
			return;
		}
		anIntArray239 = new int[local12.anInt6267];
		@Pc(21) int local21 = 0;
		aStringArray13 = new String[local12.anInt6273];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3144;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3150;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass177_9 == null ? -1 : arg0.aClass177_9.anInt5219;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3149;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass177_9 == null ? -1 : arg0.aClass177_9.anInt5239;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass177_10 == null ? -1 : arg0.aClass177_10.anInt5219;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass177_10 == null ? -1 : arg0.aClass177_10.anInt5239;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3145;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3148;
				}
				anIntArray239[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString122;
				}
				aStringArray13[local27++] = local135;
			}
		}
		method1800(local12, arg1);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!vf;I)V")
	private static void method1800(@OriginalArg(0) Class1_Sub1_Sub20 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray782;
		@Pc(11) int[] local11 = arg0.anIntArray783;
		@Pc(13) byte local13 = -1;
		anInt1938 = 0;
		@Pc(536) int local536;
		@Pc(1699) String local1699;
		try {
			@Pc(17) int local17 = 0;
			label4457: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				@Pc(541) int local541;
				@Pc(391) int local391;
				@Pc(348) String local348;
				@Pc(410) int local410;
				if (local31 < 100) {
					if (local31 == 0) {
						anIntArray240[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray240[local1++] = Static197.anIntArray793[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static267.method4671(local51, anIntArray240[local1]);
						continue;
					}
					if (local31 == 3) {
						aStringArray14[local3++] = arg0.aStringArray46[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray240[local1] != anIntArray240[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray240[local1] == anIntArray240[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray240[local1] < anIntArray240[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray240[local1] > anIntArray240[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt1938 == 0) {
							return;
						}
						@Pc(190) Class60 local190 = aClass60Array1[--anInt1938];
						arg0 = local190.aClass1_Sub1_Sub20_1;
						local8 = arg0.anIntArray782;
						local11 = arg0.anIntArray783;
						local5 = local190.anInt1777;
						anIntArray239 = local190.anIntArray224;
						aStringArray13 = local190.aStringArray9;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray240[local1++] = Static323.method5414(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static23.method587(anIntArray240[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray240[local1] <= anIntArray240[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray240[local1] >= anIntArray240[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray240[local1++] = anIntArray239[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray239[local299] = anIntArray240[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray14[local3++] = aStringArray13[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray13[local299] = aStringArray14[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static154.method2924(aStringArray14, local51, local3);
						aStringArray14[local3++] = local348;
						continue;
					}
					if (local31 == 38) {
						local1--;
						continue;
					}
					if (local31 == 39) {
						local3--;
						continue;
					}
					if (local31 == 40) {
						local51 = local11[local5];
						@Pc(375) Class1_Sub1_Sub20 local375 = Static109.method2035(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt6267];
						@Pc(389) String[] local389 = new String[local375.anInt6273];
						for (local391 = 0; local391 < local375.anInt6269; local391++) {
							local385[local391] = anIntArray240[local1 + local391 - local375.anInt6269];
						}
						for (local410 = 0; local410 < local375.anInt6266; local410++) {
							local389[local410] = aStringArray14[local3 + local410 - local375.anInt6266];
						}
						local1 -= local375.anInt6269;
						local3 -= local375.anInt6266;
						@Pc(441) Class60 local441 = new Class60();
						local441.aClass1_Sub1_Sub20_1 = arg0;
						local441.anInt1777 = local5;
						local441.anIntArray224 = anIntArray239;
						local441.aStringArray9 = aStringArray13;
						if (anInt1938 >= aClass60Array1.length) {
							throw new RuntimeException();
						}
						aClass60Array1[anInt1938++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray782;
						local11 = local375.anIntArray783;
						local5 = -1;
						anIntArray239 = local385;
						aStringArray13 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray240[local1++] = Static302.anIntArray607[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static302.anIntArray607[local51] = anIntArray240[local1];
						Static191.method3007(local51);
						Static131.aBoolean235 |= Static162.aBooleanArray13[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray240[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray238[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4457;
								}
								anIntArrayArray15[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray240[local1];
						if (local536 >= 0 && local536 < anIntArray238[local51]) {
							anIntArray240[local1++] = anIntArrayArray15[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray240[local1];
						if (local536 >= 0 && local536 < anIntArray238[local51]) {
							anIntArrayArray15[local51][local536] = anIntArray240[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static290.aStringArray39[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray14[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static290.aStringArray39[local51] = aStringArray14[local3];
						Static82.method1591(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class26 local689 = arg0.aClass26Array1[local11[local5]];
						local1--;
						@Pc(699) Class1_Sub37 local699 = (Class1_Sub37) local689.method870((long) anIntArray240[local1]);
						if (local699 != null) {
							local5 += local699.anInt6000;
						}
						continue;
					}
				}
				@Pc(714) boolean local714;
				if (local11[local5] == 1) {
					local714 = true;
				} else {
					local714 = false;
				}
				@Pc(750) Class177 local750;
				@Pc(771) int local771;
				@Pc(855) Class177 local855;
				@Pc(922) Class177 local922;
				@Pc(740) int local740;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray240[local1];
						local541 = anIntArray240[local1 + 1];
						local740 = anIntArray240[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static140.method2694(local536);
						if (local750.aClass177Array2 == null) {
							local750.aClass177Array2 = new Class177[local740 + 1];
						}
						if (local750.aClass177Array2.length <= local740) {
							@Pc(769) Class177[] local769 = new Class177[local740 + 1];
							for (local771 = 0; local771 < local750.aClass177Array2.length; local771++) {
								local769[local771] = local750.aClass177Array2[local771];
							}
							local750.aClass177Array2 = local769;
						}
						if (local740 > 0 && local750.aClass177Array2[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class177 local814 = new Class177();
						local814.anInt5208 = local541;
						local814.anInt5236 = local814.anInt5219 = local750.anInt5219;
						local814.anInt5239 = local740;
						local814.aBoolean445 = true;
						local750.aClass177Array2[local740] = local814;
						if (local714) {
							aClass177_5 = local814;
						} else {
							aClass177_4 = local814;
						}
						Static133.method2517(local750);
						continue;
					}
					@Pc(876) Class177 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass177_5 : aClass177_4;
						if (local855.anInt5239 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static140.method2694(local855.anInt5219);
						local876.aClass177Array2[local855.anInt5239] = null;
						Static133.method2517(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static140.method2694(anIntArray240[local1]);
						local855.aClass177Array2 = null;
						Static133.method2517(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray240[local1];
						local541 = anIntArray240[local1 + 1];
						local922 = Static323.method5412(local536, local541);
						if (local922 != null && local541 != -1) {
							anIntArray240[local1++] = 1;
							if (local714) {
								aClass177_5 = local922;
							} else {
								aClass177_4 = local922;
							}
							continue;
						}
						anIntArray240[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray240[local1];
						local876 = Static140.method2694(local536);
						if (local876 == null) {
							anIntArray240[local1++] = 0;
						} else {
							anIntArray240[local1++] = 1;
							if (local714) {
								aClass177_5 = local876;
							} else {
								aClass177_4 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray240[local1];
							local541 = anIntArray240[local1 + 1];
							for (local740 = 0; local740 < Static12.anIntArray33.length; local740++) {
								if (Static12.anIntArray33[local740] == local536) {
									Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1.method1003(local541, local740);
									continue label4457;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static268.anIntArray653.length) {
									continue label4457;
								}
								if (Static268.anIntArray653[local391] == local536) {
									Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1.method1003(local541, local391);
									continue label4457;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray240[local1];
							local541 = anIntArray240[local1 + 1];
							Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1.method1004(local541, local536);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray240[local1] != 0;
							Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1.method1012(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || local31 >= 2000 && local31 < 2100) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static140.method2694(anIntArray240[local1]);
							} else {
								local855 = local714 ? aClass177_5 : aClass177_4;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt5185 = anIntArray240[local1];
								local855.anInt5257 = anIntArray240[local1 + 1];
								local541 = anIntArray240[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray240[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte56 = (byte) local541;
								local855.aByte54 = (byte) local740;
								Static133.method2517(local855);
								Static144.method2738(local855);
								if (local855.anInt5239 == -1) {
									Static291.method4955(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt5211 = anIntArray240[local1];
								local855.anInt5191 = anIntArray240[local1 + 1];
								local855.anInt5228 = 0;
								local855.anInt5214 = 0;
								local541 = anIntArray240[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray240[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.aByte57 = (byte) local541;
								local855.aByte55 = (byte) local740;
								Static133.method2517(local855);
								Static144.method2738(local855);
								if (local855.anInt5208 == 0) {
									Static217.method3973(false, local855);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray240[local1] == 1;
								if (local855.aBoolean432 != local1266) {
									local855.aBoolean432 = local1266;
									Static133.method2517(local855);
								}
								if (local855.anInt5239 == -1) {
									Static43.method2808(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt5184 = anIntArray240[local1];
								local855.anInt5265 = anIntArray240[local1 + 1];
								Static133.method2517(local855);
								Static144.method2738(local855);
								if (local855.anInt5208 == 0) {
									Static217.method3973(false, local855);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean443 = anIntArray240[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static140.method2694(anIntArray240[local1]);
							} else {
								local855 = local714 ? aClass177_5 : aClass177_4;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt5221 = anIntArray240[local1];
								if (local855.anInt5221 > local855.anInt5181 - local855.anInt5179) {
									local855.anInt5221 = local855.anInt5181 - local855.anInt5179;
								}
								if (local855.anInt5221 < 0) {
									local855.anInt5221 = 0;
								}
								local855.anInt5182 = anIntArray240[local1 + 1];
								if (local855.anInt5182 > local855.anInt5262 - local855.anInt5209) {
									local855.anInt5182 = local855.anInt5262 - local855.anInt5209;
								}
								if (local855.anInt5182 < 0) {
									local855.anInt5182 = 0;
								}
								Static133.method2517(local855);
								if (local855.anInt5239 == -1) {
									Static15.method361(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt5199 = anIntArray240[local1];
								Static133.method2517(local855);
								if (local855.anInt5239 == -1) {
									Static184.method3578(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean442 = anIntArray240[local1] == 1;
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt5264 = anIntArray240[local1];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt5190 = anIntArray240[local1];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray240[local1];
								if (local855.anInt5174 != local541) {
									local855.anInt5174 = local541;
									Static133.method2517(local855);
								}
								if (local855.anInt5239 == -1) {
									Static312.method5688(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt5212 = anIntArray240[local1];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean447 = anIntArray240[local1] == 1;
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt5192 = 1;
								local1--;
								local855.anInt5245 = anIntArray240[local1];
								Static133.method2517(local855);
								if (local855.anInt5239 == -1) {
									Static179.method3488(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt5180 = anIntArray240[local1];
								local855.anInt5261 = anIntArray240[local1 + 1];
								local855.anInt5260 = anIntArray240[local1 + 2];
								local855.anInt5268 = anIntArray240[local1 + 3];
								local855.anInt5203 = anIntArray240[local1 + 4];
								local855.anInt5217 = anIntArray240[local1 + 5];
								Static133.method2517(local855);
								if (local855.anInt5239 == -1) {
									Static339.method5610(local855.anInt5219);
									Static311.method5245(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray240[local1];
								if (local855.anInt5243 != local541) {
									local855.anInt5243 = local541;
									local855.anInt5176 = 0;
									local855.anInt5238 = 1;
									local855.anInt5187 = 0;
									Static133.method2517(local855);
								}
								if (local855.anInt5239 == -1) {
									Static309.method5204(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean439 = anIntArray240[local1] == 1;
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray14[local3];
								if (!local1699.equals(local855.aString205)) {
									local855.aString205 = local1699;
									Static133.method2517(local855);
								}
								if (local855.anInt5239 == -1) {
									Static216.method3966(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt5250 = anIntArray240[local1];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt5247 = anIntArray240[local1];
								local855.anInt5215 = anIntArray240[local1 + 1];
								local855.anInt5271 = anIntArray240[local1 + 2];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean437 = anIntArray240[local1] == 1;
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt5220 = anIntArray240[local1];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt5227 = anIntArray240[local1];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean438 = anIntArray240[local1] == 1;
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean444 = anIntArray240[local1] == 1;
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt5181 = anIntArray240[local1];
								local855.anInt5262 = anIntArray240[local1 + 1];
								Static133.method2517(local855);
								if (local855.anInt5208 == 0) {
									Static217.method3973(false, local855);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort81 = (short) anIntArray240[local1];
								local855.aShort80 = (short) anIntArray240[local1 + 1];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean436 = anIntArray240[local1] == 1;
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt5217 = anIntArray240[local1];
								Static133.method2517(local855);
								if (local855.anInt5239 == -1) {
									Static339.method5610(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray240[local1];
								local855.aBoolean431 = local541 == 1;
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt5200 = anIntArray240[local1];
								local855.anInt5196 = anIntArray240[local1 + 1];
								Static133.method2517(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || local31 >= 2200 && local31 < 2300) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static140.method2694(anIntArray240[local1]);
							} else {
								local855 = local714 ? aClass177_5 : aClass177_4;
							}
							Static133.method2517(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray240[local1];
								local740 = anIntArray240[local1 + 1];
								if (local855.anInt5239 == -1) {
									Static269.method4685(local855.anInt5219);
									Static339.method5610(local855.anInt5219);
									Static311.method5245(local855.anInt5219);
								}
								if (local541 == -1) {
									local855.anInt5192 = 1;
									local855.anInt5245 = -1;
									local855.anInt5252 = -1;
									continue;
								}
								local855.anInt5252 = local541;
								local855.anInt5253 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local855.aBoolean435 = true;
								} else {
									local855.aBoolean435 = false;
								}
								@Pc(2081) Class61 local2081 = Static241.method4285(local541);
								local855.anInt5260 = local2081.anInt1784;
								local855.anInt5268 = local2081.anInt1836;
								local855.anInt5203 = local2081.anInt1781;
								local855.anInt5180 = local2081.anInt1787;
								local855.anInt5261 = local2081.anInt1804;
								local855.anInt5217 = local2081.anInt1829;
								if (local31 == 1205 || local31 == 1209) {
									local855.anInt5178 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local855.anInt5178 = 1;
								} else {
									local855.anInt5178 = 2;
								}
								if (local855.anInt5228 > 0) {
									local855.anInt5217 = local855.anInt5217 * 32 / local855.anInt5228;
								} else if (local855.anInt5211 > 0) {
									local855.anInt5217 = local855.anInt5217 * 32 / local855.anInt5211;
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt5192 = 2;
								local1--;
								local855.anInt5245 = anIntArray240[local1];
								if (local855.anInt5239 == -1) {
									Static179.method3488(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt5192 = 3;
								local855.anInt5245 = -1;
								if (local855.anInt5239 == -1) {
									Static179.method3488(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt5192 = 6;
								local1--;
								local855.anInt5245 = anIntArray240[local1];
								if (local855.anInt5239 == -1) {
									Static179.method3488(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt5192 = 5;
								local1--;
								local855.anInt5245 = anIntArray240[local1];
								if (local855.anInt5239 == -1) {
									Static179.method3488(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt5216 = anIntArray240[local1];
								local855.anInt5231 = anIntArray240[local1 + 1];
								local855.anInt5237 = anIntArray240[local1 + 2];
								local855.anInt5206 = anIntArray240[local1 + 3];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt5267 = anIntArray240[local1];
								local855.anInt5207 = anIntArray240[local1 + 1];
								Static133.method2517(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.anInt5245 = anIntArray240[local1];
								local855.anInt5183 = anIntArray240[local1 + 1];
								if (anIntArray240[local1 + 2] == 1) {
									local855.anInt5192 = 9;
								} else {
									local855.anInt5192 = 8;
								}
								if (anIntArray240[local1 + 3] == 1) {
									local855.aBoolean435 = true;
								} else {
									local855.aBoolean435 = false;
								}
								if (local855.anInt5239 == -1) {
									Static179.method3488(local855.anInt5219);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt5192 = 5;
								local855.anInt5245 = 2047;
								local855.anInt5183 = 0;
								if (local855.anInt5239 == -1) {
									Static179.method3488(local855.anInt5219);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static140.method2694(anIntArray240[local1]);
							} else {
								local855 = local714 ? aClass177_5 : aClass177_4;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray240[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method4689(aStringArray14[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray240[local1];
								local740 = anIntArray240[local1 + 1];
								local855.aClass177_18 = Static323.method5412(local541, local740);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean441 = anIntArray240[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt5255 = anIntArray240[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt5188 = anIntArray240[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString211 = aStringArray14[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString204 = aStringArray14[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray34 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt5229 = anIntArray240[local1];
								local1--;
								local855.anInt5234 = anIntArray240[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray240[local1];
								local1--;
								local740 = anIntArray240[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method4701(local740 - 1, local541);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString209 = aStringArray14[local3];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static140.method2694(anIntArray240[local1]);
								} else {
									local855 = local714 ? aClass177_5 : aClass177_4;
								}
								local3--;
								local1699 = aStringArray14[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray240[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray240[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray14[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray240[local1]);
									}
								}
								local1--;
								local771 = anIntArray240[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray34 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray9 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray31 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray22 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray13 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray16 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray32 = local2638;
									local855.anIntArray661 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray7 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray14 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray19 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray27 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray26 = local2638;
								} else if (local31 == 1414) {
									local855.anObjectArray11 = local2638;
									local855.anIntArray659 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray23 = local2638;
									local855.anIntArray671 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray6 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray35 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray12 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray30 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray25 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray21 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray29 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray15 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray28 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray33 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray24 = local2638;
									local855.anIntArray663 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray18 = local2638;
									local855.anIntArray672 = local2592;
								}
								local855.aBoolean434 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass177_5 : aClass177_4;
								if (local31 == 1500) {
									anIntArray240[local1++] = local855.anInt5201;
									continue;
								}
								if (local31 == 1501) {
									anIntArray240[local1++] = local855.anInt5177;
									continue;
								}
								if (local31 == 1502) {
									anIntArray240[local1++] = local855.anInt5179;
									continue;
								}
								if (local31 == 1503) {
									anIntArray240[local1++] = local855.anInt5209;
									continue;
								}
								if (local31 == 1504) {
									anIntArray240[local1++] = local855.aBoolean432 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray240[local1++] = local855.anInt5236;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass177_5 : aClass177_4;
								if (local31 == 1600) {
									anIntArray240[local1++] = local855.anInt5221;
									continue;
								}
								if (local31 == 1601) {
									anIntArray240[local1++] = local855.anInt5182;
									continue;
								}
								if (local31 == 1602) {
									aStringArray14[local3++] = local855.aString205;
									continue;
								}
								if (local31 == 1603) {
									anIntArray240[local1++] = local855.anInt5181;
									continue;
								}
								if (local31 == 1604) {
									anIntArray240[local1++] = local855.anInt5262;
									continue;
								}
								if (local31 == 1605) {
									anIntArray240[local1++] = local855.anInt5217;
									continue;
								}
								if (local31 == 1606) {
									anIntArray240[local1++] = local855.anInt5260;
									continue;
								}
								if (local31 == 1607) {
									anIntArray240[local1++] = local855.anInt5203;
									continue;
								}
								if (local31 == 1608) {
									anIntArray240[local1++] = local855.anInt5268;
									continue;
								}
								if (local31 == 1609) {
									anIntArray240[local1++] = local855.anInt5264;
									continue;
								}
								if (local31 == 1610) {
									anIntArray240[local1++] = local855.anInt5180;
									continue;
								}
								if (local31 == 1611) {
									anIntArray240[local1++] = local855.anInt5261;
									continue;
								}
								if (local31 == 1612) {
									anIntArray240[local1++] = local855.anInt5174;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass177_5 : aClass177_4;
								if (local31 == 1700) {
									anIntArray240[local1++] = local855.anInt5252;
									continue;
								}
								if (local31 == 1701) {
									if (local855.anInt5252 == -1) {
										anIntArray240[local1++] = 0;
									} else {
										anIntArray240[local1++] = local855.anInt5253;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray240[local1++] = local855.anInt5239;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass177_5 : aClass177_4;
								if (local31 == 1800) {
									anIntArray240[local1++] = Static47.method1096(local855).method4898();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray240[local1];
									local541--;
									if (local855.aStringArray34 != null && local541 < local855.aStringArray34.length && local855.aStringArray34[local541] != null) {
										aStringArray14[local3++] = local855.aStringArray34[local541];
										continue;
									}
									aStringArray14[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString211 == null) {
										aStringArray14[local3++] = "";
									} else {
										aStringArray14[local3++] = local855.aString211;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static140.method2694(anIntArray240[local1]);
								if (local31 == 2500) {
									anIntArray240[local1++] = local855.anInt5201;
									continue;
								}
								if (local31 == 2501) {
									anIntArray240[local1++] = local855.anInt5177;
									continue;
								}
								if (local31 == 2502) {
									anIntArray240[local1++] = local855.anInt5179;
									continue;
								}
								if (local31 == 2503) {
									anIntArray240[local1++] = local855.anInt5209;
									continue;
								}
								if (local31 == 2504) {
									anIntArray240[local1++] = local855.aBoolean432 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray240[local1++] = local855.anInt5236;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static140.method2694(anIntArray240[local1]);
								if (local31 == 2600) {
									anIntArray240[local1++] = local855.anInt5221;
									continue;
								}
								if (local31 == 2601) {
									anIntArray240[local1++] = local855.anInt5182;
									continue;
								}
								if (local31 == 2602) {
									aStringArray14[local3++] = local855.aString205;
									continue;
								}
								if (local31 == 2603) {
									anIntArray240[local1++] = local855.anInt5181;
									continue;
								}
								if (local31 == 2604) {
									anIntArray240[local1++] = local855.anInt5262;
									continue;
								}
								if (local31 == 2605) {
									anIntArray240[local1++] = local855.anInt5217;
									continue;
								}
								if (local31 == 2606) {
									anIntArray240[local1++] = local855.anInt5260;
									continue;
								}
								if (local31 == 2607) {
									anIntArray240[local1++] = local855.anInt5203;
									continue;
								}
								if (local31 == 2608) {
									anIntArray240[local1++] = local855.anInt5268;
									continue;
								}
								if (local31 == 2609) {
									anIntArray240[local1++] = local855.anInt5264;
									continue;
								}
								if (local31 == 2610) {
									anIntArray240[local1++] = local855.anInt5180;
									continue;
								}
								if (local31 == 2611) {
									anIntArray240[local1++] = local855.anInt5261;
									continue;
								}
								if (local31 == 2612) {
									anIntArray240[local1++] = local855.anInt5174;
									continue;
								}
							} else {
								@Pc(3610) Class1_Sub9 local3610;
								@Pc(3526) Class1_Sub9 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static140.method2694(anIntArray240[local1]);
										anIntArray240[local1++] = local855.anInt5252;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static140.method2694(anIntArray240[local1]);
										if (local855.anInt5252 == -1) {
											anIntArray240[local1++] = 0;
										} else {
											anIntArray240[local1++] = local855.anInt5253;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray240[local1];
										local3526 = (Class1_Sub9) Static348.aClass26_20.method870((long) local536);
										if (local3526 == null) {
											anIntArray240[local1++] = 0;
										} else {
											anIntArray240[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static140.method2694(anIntArray240[local1]);
										if (local855.aClass177Array2 == null) {
											anIntArray240[local1++] = 0;
											continue;
										}
										local541 = local855.aClass177Array2.length;
										for (local740 = 0; local740 < local855.aClass177Array2.length; local740++) {
											if (local855.aClass177Array2[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray240[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local3610 = (Class1_Sub9) Static348.aClass26_20.method870((long) local536);
										if (local3610 != null && local3610.anInt1104 == local541) {
											anIntArray240[local1++] = 1;
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static140.method2694(anIntArray240[local1]);
									if (local31 == 2800) {
										anIntArray240[local1++] = Static47.method1096(local855).method4898();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray240[local1];
										@Pc(3659) int local3659 = local541 - 1;
										if (local855.aStringArray34 != null && local3659 < local855.aStringArray34.length && local855.aStringArray34[local3659] != null) {
											aStringArray14[local3++] = local855.aStringArray34[local3659];
											continue;
										}
										aStringArray14[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString211 == null) {
											aStringArray14[local3++] = "";
										} else {
											aStringArray14[local3++] = local855.aString211;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray14[local3];
										Static88.method1697(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static188.method3648(Static130.aClass5_Sub3_Sub3_Sub1_1, anIntArray240[local1], anIntArray240[local1 + 1]);
										continue;
									}
									if (local31 == 3103) {
										Static323.method5410(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray14[local3];
										local541 = 0;
										if (Static335.method5579(local348)) {
											local541 = Static280.method4822(local348);
										}
										Static248.aClass1_Sub7_Sub1_2.method728(144);
										Static248.aClass1_Sub7_Sub1_2.method3098(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray14[local3];
										Static248.aClass1_Sub7_Sub1_2.method728(126);
										Static248.aClass1_Sub7_Sub1_2.method3108(local348.length() + 1);
										Static248.aClass1_Sub7_Sub1_2.method3124(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray14[local3];
										Static248.aClass1_Sub7_Sub1_2.method728(171);
										Static248.aClass1_Sub7_Sub1_2.method3108(local348.length() + 1);
										Static248.aClass1_Sub7_Sub1_2.method3124(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray240[local1];
										local3--;
										local1699 = aStringArray14[local3];
										Static130.method2458(local1699, local536);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local740 = anIntArray240[local1 + 2];
										local750 = Static140.method2694(local740);
										Static56.method1213(local750, local541, local536);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local922 = local714 ? aClass177_5 : aClass177_4;
										Static56.method1213(local922, local541, local536);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray240[local1];
										Static248.aClass1_Sub7_Sub1_2.method728(211);
										Static248.aClass1_Sub7_Sub1_2.method3128(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local3610 = (Class1_Sub9) Static348.aClass26_20.method870((long) local536);
										if (local3610 != null) {
											Static125.method2404(local3610, true, local3610.anInt1104 != local541);
										}
										Static269.method4698(local536, local541, true, 3);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray240[local1];
										local3526 = (Class1_Sub9) Static348.aClass26_20.method870((long) local536);
										if (local3526 != null && local3526.anInt1106 == 3) {
											Static125.method2404(local3526, true, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static12.method315(255, anIntArray240[local1], anIntArray240[local1 + 1], anIntArray240[local1 + 2]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static332.method5566(anIntArray240[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static241.method4287(anIntArray240[local1 + 1], 255, anIntArray240[local1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray240[local1++] = Static215.anInt4246;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = Static34.method907(local536, local541);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = Static205.method3805(local536, local541);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = Static333.method4244(local536, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static37.method944(local536).anInt4596;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static333.anIntArray595[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static343.anIntArray624[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static291.anIntArray712[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static285.anInt5511;
										local541 = (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7) + Static182.anInt3775;
										local740 = (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7) + Static161.anInt3315;
										anIntArray240[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray240[local1++] = Static220.aBoolean369 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray240[local1] + 32768;
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = Static34.method907(local536, local541);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray240[local1] + 32768;
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = Static205.method3805(local536, local541);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray240[local1] + 32768;
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = Static333.method4244(local536, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static180.anInt3759 >= 2) {
											anIntArray240[local1++] = Static180.anInt3759;
										} else {
											anIntArray240[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray240[local1++] = Static210.anInt4174;
										continue;
									}
									if (local31 == 3318) {
										anIntArray240[local1++] = Static232.anInt6331;
										continue;
									}
									if (local31 == 3321) {
										anIntArray240[local1++] = Static283.anInt5493;
										continue;
									}
									if (local31 == 3322) {
										anIntArray240[local1++] = Static186.anInt3867;
										continue;
									}
									if (local31 == 3323) {
										if (Static307.anInt5908 >= 5 && Static307.anInt5908 <= 9) {
											anIntArray240[local1++] = 1;
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static307.anInt5908 >= 5 && Static307.anInt5908 <= 9) {
											anIntArray240[local1++] = Static307.anInt5908;
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray240[local1++] = Static214.aBoolean362 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray240[local1++] = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330;
										continue;
									}
									if (local31 == 3327) {
										anIntArray240[local1++] = Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1.aBoolean88 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray240[local1++] = Static115.aBoolean193 && !Static300.aBoolean507 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray240[local1++] = Static206.aBoolean350 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static317.method5336(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = Static76.method1468(local536, false, local541);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = Static76.method1468(local536, true, local541);
										continue;
									}
									if (local31 == 3333) {
										anIntArray240[local1++] = Static87.anInt1718;
										continue;
									}
									if (local31 == 3335) {
										anIntArray240[local1++] = Static257.anInt5015;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local740 = anIntArray240[local1 + 2];
										local391 = anIntArray240[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray240[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray240[local1++] = Static61.anInt1330;
										continue;
									}
									if (local31 == 3338) {
										anIntArray240[local1++] = Static315.method5322();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class1_Sub1_Sub19 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local4695 = Static307.method5167(local536);
										aStringArray14[local3++] = local4695.method5403(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local740 = anIntArray240[local1 + 2];
										local391 = anIntArray240[local1 + 3];
										@Pc(4734) Class1_Sub1_Sub19 local4734 = Static307.method5167(local740);
										if (local4734.aChar4 == local536 && local4734.aChar5 == local541) {
											if (local541 == 115) {
												aStringArray14[local3++] = local4734.method5403(local391);
											} else {
												anIntArray240[local1++] = local4734.method5409(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local740 = anIntArray240[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class1_Sub1_Sub19 local4800 = Static307.method5167(local541);
										if (local4800.aChar5 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray240[local1++] = local4800.method5408(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray240[local1];
										local3--;
										local1699 = aStringArray14[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static307.method5167(local536);
										if (local4695.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray240[local1++] = local4695.method5411(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray240[local1];
										@Pc(4881) Class1_Sub1_Sub19 local4881 = Static307.method5167(local536);
										anIntArray240[local1++] = local4881.aClass26_30.method875();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static30.anInt780 == 0) {
											anIntArray240[local1++] = -2;
										} else if (Static30.anInt780 == 1) {
											anIntArray240[local1++] = -1;
										} else {
											anIntArray240[local1++] = Static290.anInt5612;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static30.anInt780 == 2 && local536 < Static290.anInt5612) {
											aStringArray14[local3++] = Static257.aStringArray33[local536];
											if (Static294.aStringArray40[local536] == null) {
												aStringArray14[local3++] = "";
											} else {
												aStringArray14[local3++] = Static294.aStringArray40[local536];
											}
											continue;
										}
										aStringArray14[local3++] = "";
										aStringArray14[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static30.anInt780 == 2 && local536 < Static290.anInt5612) {
											anIntArray240[local1++] = Static205.anIntArray493[local536];
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static30.anInt780 == 2 && local536 < Static290.anInt5612) {
											anIntArray240[local1++] = Static264.anIntArray684[local536];
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray14[local3];
										local1--;
										local541 = anIntArray240[local1];
										Static216.method3967(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray14[local3];
										Static147.method2797(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray14[local3];
										Static180.method3540(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray14[local3];
										Static11.method4793(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray14[local3];
										Static291.method4958(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray14[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray240[local1++] = Static339.method5607(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static30.anInt780 == 2 && local536 < Static290.anInt5612) {
											aStringArray14[local3++] = Static68.aStringArray7[local536];
											continue;
										}
										aStringArray14[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static50.aString40 == null) {
											aStringArray14[local3++] = "";
										} else {
											aStringArray14[local3++] = Static21.method564(Static50.aString40);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static50.aString40 == null) {
											anIntArray240[local1++] = 0;
										} else {
											anIntArray240[local1++] = Static229.anInt1684;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static50.aString40 != null && local536 < Static229.anInt1684) {
											aStringArray14[local3++] = Static23.aClass123Array1[local536].aString155;
											continue;
										}
										aStringArray14[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static50.aString40 != null && local536 < Static229.anInt1684) {
											anIntArray240[local1++] = Static23.aClass123Array1[local536].anInt3833;
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static50.aString40 != null && local536 < Static229.anInt1684) {
											anIntArray240[local1++] = Static23.aClass123Array1[local536].aByte38;
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray240[local1++] = Static161.aByte29;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray14[local3];
										Static87.method1673(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray240[local1++] = Static99.aByte16;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray14[local3];
										Static232.method5538(local348);
										continue;
									}
									if (local31 == 3620) {
										Static81.method1561();
										continue;
									}
									if (local31 == 3621) {
										if (Static30.anInt780 == 0) {
											anIntArray240[local1++] = -1;
										} else {
											anIntArray240[local1++] = Static227.anInt4474;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static30.anInt780 != 0 && local536 < Static227.anInt4474) {
											aStringArray14[local3++] = Static313.aStringArray44[local536];
											if (Static310.aStringArray43[local536] == null) {
												aStringArray14[local3++] = "";
											} else {
												aStringArray14[local3++] = Static310.aStringArray43[local536];
											}
											continue;
										}
										aStringArray14[local3++] = "";
										aStringArray14[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray14[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray240[local1++] = Static340.method3661(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static23.aClass123Array1 != null && local536 < Static229.anInt1684 && Static23.aClass123Array1[local536].aString154.equalsIgnoreCase(Static130.aClass5_Sub3_Sub3_Sub1_1.aString130)) {
											anIntArray240[local1++] = 1;
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static317.aString245 == null) {
											aStringArray14[local3++] = "";
										} else {
											aStringArray14[local3++] = Static317.aString245;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static50.aString40 != null && local536 < Static229.anInt1684) {
											aStringArray14[local3++] = Static23.aClass123Array1[local536].aString153;
											continue;
										}
										aStringArray14[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static30.anInt780 == 2 && local536 >= 0 && local536 < Static290.anInt5612) {
											anIntArray240[local1++] = Static333.aBooleanArray26[local536] ? 1 : 0;
											continue;
										}
										anIntArray240[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray14[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray240[local1++] = Static82.method1585(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray240[local1++] = Static8.anInt216;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray14[local3];
										Static11.method4793(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static140.aBooleanArray10[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static50.aString40 != null && local536 < Static229.anInt1684) {
											aStringArray14[local3++] = Static23.aClass123Array1[local536].aString154;
											continue;
										}
										aStringArray14[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray240[local1];
										if (Static30.anInt780 != 0 && local536 < Static227.anInt4474) {
											aStringArray14[local3++] = Static66.aStringArray6[local536];
											continue;
										}
										aStringArray14[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static24.aClass169Array1[local536].method4565();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static24.aClass169Array1[local536].anInt5021;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static24.aClass169Array1[local536].anInt5020;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static24.aClass169Array1[local536].anInt5018;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static24.aClass169Array1[local536].anInt5028;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = Static24.aClass169Array1[local536].anInt5025;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray240[local1];
										local541 = Static24.aClass169Array1[local536].method4564();
										anIntArray240[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray240[local1];
										local541 = Static24.aClass169Array1[local536].method4564();
										anIntArray240[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray240[local1];
										local541 = Static24.aClass169Array1[local536].method4564();
										anIntArray240[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray240[local1];
										local541 = Static24.aClass169Array1[local536].method4564();
										anIntArray240[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray240[local1];
										anIntArray240[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										local740 = anIntArray240[local1 + 2];
										local391 = anIntArray240[local1 + 3];
										local410 = anIntArray240[local1 + 4];
										anIntArray240[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray240[local1];
										local6055 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										if (local536 == 0) {
											anIntArray240[local1++] = 0;
										} else {
											anIntArray240[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										if (local536 == 0) {
											anIntArray240[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray240[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray240[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray240[local1];
										local541 = anIntArray240[local1 + 1];
										anIntArray240[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray240[local1];
										local6055 = anIntArray240[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray240[local1 + 2];
										anIntArray240[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray14[local3];
											local1--;
											local541 = anIntArray240[local1];
											aStringArray14[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray14[local3];
											local1699 = aStringArray14[local3 + 1];
											aStringArray14[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray14[local3];
											local1--;
											local541 = anIntArray240[local1];
											aStringArray14[local3++] = local348 + Static72.method1426(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray14[local3];
											aStringArray14[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray240[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6487));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray14[local3++] = local391 + "-" + aStringArray15[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray14[local3];
											local1699 = aStringArray14[local3 + 1];
											if (Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1 != null && Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1.aBoolean88) {
												aStringArray14[local3++] = local1699;
												continue;
											}
											aStringArray14[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray240[local1];
											aStringArray14[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray240[local1++] = Static87.method1675(Static257.anInt5015, aStringArray14[local3 + 1], aStringArray14[local3]);
											continue;
										}
										@Pc(6619) Class38 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray14[local3];
											local1 -= 2;
											local541 = anIntArray240[local1];
											local740 = anIntArray240[local1 + 1];
											local6619 = Static179.method3492(Static236.aClass165_72, local740);
											anIntArray240[local1++] = local6619.method1311(Static233.aClass90Array12, local541, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray14[local3];
											local1 -= 2;
											local541 = anIntArray240[local1];
											local740 = anIntArray240[local1 + 1];
											local6619 = Static179.method3492(Static236.aClass165_72, local740);
											anIntArray240[local1++] = local6619.method1309(Static233.aClass90Array12, local541, local348);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray14[local3];
											local1699 = aStringArray14[local3 + 1];
											local1--;
											if (anIntArray240[local1] == 1) {
												aStringArray14[local3++] = local348;
											} else {
												aStringArray14[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray14[local3];
											aStringArray14[local3++] = Static149.method2394(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray14[local3];
											local1--;
											local541 = anIntArray240[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray14[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray240[local1];
											anIntArray240[local1++] = Static275.method4783((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray240[local1];
											anIntArray240[local1++] = Static88.method1695((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray240[local1];
											anIntArray240[local1++] = Static324.method5450((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray240[local1];
											anIntArray240[local1++] = Static245.method4335((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray14[local3];
											if (local348 == null) {
												anIntArray240[local1++] = 0;
											} else {
												anIntArray240[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray14[local3];
											local1 -= 2;
											local541 = anIntArray240[local1];
											local740 = anIntArray240[local1 + 1];
											aStringArray14[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray14[local3];
											@Pc(6898) StringBuffer local6898 = new StringBuffer(local348.length());
											local6900 = false;
											for (local391 = 0; local391 < local348.length(); local391++) {
												@Pc(6907) char local6907 = local348.charAt(local391);
												if (local6907 == '<') {
													local6900 = true;
												} else if (local6907 == '>') {
													local6900 = false;
												} else if (!local6900) {
													local6898.append(local6907);
												}
											}
											aStringArray14[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray14[local3];
											local1 -= 2;
											local541 = anIntArray240[local1];
											local740 = anIntArray240[local1 + 1];
											anIntArray240[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray14[local3];
											local1699 = aStringArray14[local3 + 1];
											local1--;
											local740 = anIntArray240[local1];
											anIntArray240[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray240[local1];
											anIntArray240[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray240[local1];
											anIntArray240[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray240[local1] != 0;
											local1--;
											local541 = anIntArray240[local1];
											aStringArray14[local3++] = Static102.method1912(local1070, (long) local541, 0, Static257.anInt5015);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray14[local3];
											local1--;
											local541 = anIntArray240[local1];
											@Pc(7073) Class38 local7073 = Static179.method3492(Static236.aClass165_72, local541);
											anIntArray240[local1++] = local7073.method1307(Static233.aClass90Array12, local348);
											continue;
										}
									} else {
										@Pc(7340) Class1_Sub1_Sub18 local7340;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray240[local1];
												aStringArray14[local3++] = Static241.method4285(local536).aString74;
												continue;
											}
											@Pc(7121) Class61 local7121;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												local7121 = Static241.method4285(local536);
												if (local541 >= 1 && local541 <= 5 && local7121.aStringArray11[local541 - 1] != null) {
													aStringArray14[local3++] = local7121.aStringArray11[local541 - 1];
													continue;
												}
												aStringArray14[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												local7121 = Static241.method4285(local536);
												if (local541 >= 1 && local541 <= 5 && local7121.aStringArray10[local541 - 1] != null) {
													aStringArray14[local3++] = local7121.aStringArray10[local541 - 1];
													continue;
												}
												aStringArray14[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray240[local1];
												anIntArray240[local1++] = Static241.method4285(local536).anInt1801;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray240[local1];
												anIntArray240[local1++] = Static241.method4285(local536).anInt1803 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7250) Class61 local7250;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray240[local1];
												local7250 = Static241.method4285(local536);
												if (local7250.anInt1827 == -1 && local7250.anInt1831 >= 0) {
													anIntArray240[local1++] = local7250.anInt1831;
													continue;
												}
												anIntArray240[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray240[local1];
												local7250 = Static241.method4285(local536);
												if (local7250.anInt1827 >= 0 && local7250.anInt1831 >= 0) {
													anIntArray240[local1++] = local7250.anInt1831;
													continue;
												}
												anIntArray240[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray240[local1];
												anIntArray240[local1++] = Static241.method4285(local536).aBoolean159 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												local7340 = Static305.method5149(local541);
												if (local7340.method4869()) {
													aStringArray14[local3++] = Static241.method4285(local536).method1730(local541, local7340.aString220);
												} else {
													anIntArray240[local1++] = Static241.method4285(local536).method1732(local541, local7340.anInt5480);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1] - 1;
												local7121 = Static241.method4285(local536);
												if (local7121.anInt1790 == local541) {
													anIntArray240[local1++] = local7121.anInt1830;
												} else if (local7121.anInt1828 == local541) {
													anIntArray240[local1++] = local7121.anInt1798;
												} else {
													anIntArray240[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray14[local3];
												local1--;
												local541 = anIntArray240[local1];
												Static296.method5068(local348, local541 == 1);
												anIntArray240[local1++] = Static243.anInt4740;
												continue;
											}
											if (local31 == 4211) {
												if (Static37.aShortArray16 != null && Static154.anInt3081 < Static243.anInt4740) {
													anIntArray240[local1++] = Static37.aShortArray16[Static154.anInt3081++] & 0xFFFF;
													continue;
												}
												anIntArray240[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static154.anInt3081 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												local7340 = Static305.method5149(local541);
												if (local7340.method4869()) {
													aStringArray14[local3++] = Static232.method5539(local536).method3564(local7340.aString220, local541);
												} else {
													anIntArray240[local1++] = Static232.method5539(local536).method3569(local541, local7340.anInt5480);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												local7340 = Static305.method5149(local541);
												if (local7340.method4869()) {
													aStringArray14[local3++] = Static126.method2405(local536).method4913(local541, local7340.aString220);
												} else {
													anIntArray240[local1++] = Static126.method2405(local536).method4906(local541, local7340.anInt5480);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												local7340 = Static305.method5149(local541);
												if (local7340.method4869()) {
													aStringArray14[local3++] = Static159.method2994(local536).method1712(local7340.aString220, local541);
												} else {
													anIntArray240[local1++] = Static159.method2994(local536).method1710(local541, local7340.anInt5480);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray240[local1];
												@Pc(7648) Class45 local7648 = Static126.method2408(local536);
												if (local7648.anIntArray167 != null && local7648.anIntArray167.length > 0) {
													local740 = 0;
													local391 = local7648.anIntArray168[0];
													for (local410 = 1; local410 < local7648.anIntArray167.length; local410++) {
														if (local7648.anIntArray168[local410] > local391) {
															local740 = local410;
															local391 = local7648.anIntArray168[local410];
														}
													}
													anIntArray240[local1++] = local7648.anIntArray167[local740];
													continue;
												}
												anIntArray240[local1++] = local7648.anInt1488;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray240[local1++] = Static194.anInt3965;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static194.anInt3965 = anIntArray240[local1];
												Static309.anInt5945 = anIntArray240[local1 + 1];
												Static58.anInt1292 = anIntArray240[local1 + 2];
												Static248.aClass1_Sub7_Sub1_2.method728(85);
												Static248.aClass1_Sub7_Sub1_2.method3108(Static194.anInt3965);
												Static248.aClass1_Sub7_Sub1_2.method3108(Static309.anInt5945);
												Static248.aClass1_Sub7_Sub1_2.method3108(Static58.anInt1292);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray14[local3];
												local1 -= 2;
												local541 = anIntArray240[local1];
												local740 = anIntArray240[local1 + 1];
												Static248.aClass1_Sub7_Sub1_2.method728(148);
												Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(local348) + 2);
												Static248.aClass1_Sub7_Sub1_2.method3124(local348);
												Static248.aClass1_Sub7_Sub1_2.method3108(local541 - 1);
												Static248.aClass1_Sub7_Sub1_2.method3108(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray240[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static297.aStringArray41[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray14[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray240[local1];
												local541 = -1;
												if (local536 < 100 && Static297.aStringArray41[local536] != null) {
													local541 = Static222.anIntArray561[local536];
												}
												anIntArray240[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray240[local1++] = Static309.anInt5945;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray14[local3];
												if (Static180.anInt3759 == 0 && (Static115.aBoolean193 && !Static300.aBoolean507 || Static206.aBoolean350)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7888) byte local7888 = 0;
												if (local1699.startsWith(Static47.aString36)) {
													local7888 = 0;
													local348 = local348.substring(Static47.aString36.length());
												} else if (local1699.startsWith(Static209.aString168)) {
													local7888 = 1;
													local348 = local348.substring(Static209.aString168.length());
												} else if (local1699.startsWith(Static177.aString149)) {
													local7888 = 2;
													local348 = local348.substring(Static177.aString149.length());
												} else if (local1699.startsWith(Static164.aString134)) {
													local7888 = 3;
													local348 = local348.substring(Static164.aString134.length());
												} else if (local1699.startsWith(Static225.aString133)) {
													local7888 = 4;
													local348 = local348.substring(Static225.aString133.length());
												} else if (local1699.startsWith(Static154.aString120)) {
													local7888 = 5;
													local348 = local348.substring(Static154.aString120.length());
												} else if (local1699.startsWith(Static295.aString228)) {
													local7888 = 6;
													local348 = local348.substring(Static295.aString228.length());
												} else if (local1699.startsWith(Static57.aString47)) {
													local7888 = 7;
													local348 = local348.substring(Static57.aString47.length());
												} else if (local1699.startsWith(Static90.aString72)) {
													local7888 = 8;
													local348 = local348.substring(Static90.aString72.length());
												} else if (local1699.startsWith(Static101.aString79)) {
													local7888 = 9;
													local348 = local348.substring(Static101.aString79.length());
												} else if (local1699.startsWith(Static86.aString66)) {
													local7888 = 10;
													local348 = local348.substring(Static86.aString66.length());
												} else if (local1699.startsWith(Static201.aString163)) {
													local7888 = 11;
													local348 = local348.substring(Static201.aString163.length());
												} else if (Static257.anInt5015 != 0) {
													if (local1699.startsWith(Static170.aString147)) {
														local7888 = 0;
														local348 = local348.substring(Static170.aString147.length());
													} else if (local1699.startsWith(Static108.aString86)) {
														local7888 = 1;
														local348 = local348.substring(Static108.aString86.length());
													} else if (local1699.startsWith(Static1.aString1)) {
														local7888 = 2;
														local348 = local348.substring(Static1.aString1.length());
													} else if (local1699.startsWith(Static277.aString249)) {
														local7888 = 3;
														local348 = local348.substring(Static277.aString249.length());
													} else if (local1699.startsWith(Static245.aString193)) {
														local7888 = 4;
														local348 = local348.substring(Static245.aString193.length());
													} else if (local1699.startsWith(Static125.aString102)) {
														local7888 = 5;
														local348 = local348.substring(Static125.aString102.length());
													} else if (local1699.startsWith(Static325.aString189)) {
														local7888 = 6;
														local348 = local348.substring(Static325.aString189.length());
													} else if (local1699.startsWith(Static87.aString67)) {
														local7888 = 7;
														local348 = local348.substring(Static87.aString67.length());
													} else if (local1699.startsWith(Static29.aString23)) {
														local7888 = 8;
														local348 = local348.substring(Static29.aString23.length());
													} else if (local1699.startsWith(Static236.aString184)) {
														local7888 = 9;
														local348 = local348.substring(Static236.aString184.length());
													} else if (local1699.startsWith(Static327.aString250)) {
														local7888 = 10;
														local348 = local348.substring(Static327.aString250.length());
													} else if (local1699.startsWith(Static211.aString171)) {
														local7888 = 11;
														local348 = local348.substring(Static211.aString171.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8182) byte local8182 = 0;
												if (local1699.startsWith(Static315.aString244)) {
													local8182 = 1;
													local348 = local348.substring(Static315.aString244.length());
												} else if (local1699.startsWith(Static309.aString236)) {
													local8182 = 2;
													local348 = local348.substring(Static309.aString236.length());
												} else if (local1699.startsWith(Static20.aString13)) {
													local8182 = 3;
													local348 = local348.substring(Static20.aString13.length());
												} else if (local1699.startsWith(Static202.aString164)) {
													local8182 = 4;
													local348 = local348.substring(Static202.aString164.length());
												} else if (local1699.startsWith(Static189.aString158)) {
													local8182 = 5;
													local348 = local348.substring(Static189.aString158.length());
												} else if (Static257.anInt5015 != 0) {
													if (local1699.startsWith(Static224.aString182)) {
														local8182 = 1;
														local348 = local348.substring(Static224.aString182.length());
													} else if (local1699.startsWith(Static8.aString7)) {
														local8182 = 2;
														local348 = local348.substring(Static8.aString7.length());
													} else if (local1699.startsWith(Static310.aString237)) {
														local8182 = 3;
														local348 = local348.substring(Static310.aString237.length());
													} else if (local1699.startsWith(Static267.aString203)) {
														local8182 = 4;
														local348 = local348.substring(Static267.aString203.length());
													} else if (local1699.startsWith(Static291.aString225)) {
														local8182 = 5;
														local348 = local348.substring(Static291.aString225.length());
													}
												}
												Static248.aClass1_Sub7_Sub1_2.method728(212);
												Static248.aClass1_Sub7_Sub1_2.method3108(0);
												local410 = Static248.aClass1_Sub7_Sub1_2.anInt3368;
												Static248.aClass1_Sub7_Sub1_2.method3108(local7888);
												Static248.aClass1_Sub7_Sub1_2.method3108(local8182);
												Static147.method2794(local348, Static248.aClass1_Sub7_Sub1_2);
												Static248.aClass1_Sub7_Sub1_2.method3102(Static248.aClass1_Sub7_Sub1_2.anInt3368 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray14[local3];
												local1699 = aStringArray14[local3 + 1];
												if (Static180.anInt3759 != 0 || (!Static115.aBoolean193 || Static300.aBoolean507) && !Static206.aBoolean350) {
													Static248.aClass1_Sub7_Sub1_2.method728(229);
													Static248.aClass1_Sub7_Sub1_2.method3108(0);
													local740 = Static248.aClass1_Sub7_Sub1_2.anInt3368;
													Static248.aClass1_Sub7_Sub1_2.method3124(local348);
													Static147.method2794(local1699, Static248.aClass1_Sub7_Sub1_2);
													Static248.aClass1_Sub7_Sub1_2.method3102(Static248.aClass1_Sub7_Sub1_2.anInt3368 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray240[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static273.aStringArray37[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray14[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray240[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static43.aStringArray24[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray14[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray240[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static339.anIntArray800[local536];
												}
												anIntArray240[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static130.aClass5_Sub3_Sub3_Sub1_1 == null || Static130.aClass5_Sub3_Sub3_Sub1_1.aString129 == null) {
													local348 = Static142.aString123;
												} else {
													local348 = Static130.aClass5_Sub3_Sub3_Sub1_1.method3064();
												}
												aStringArray14[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray240[local1++] = Static58.anInt1292;
												continue;
											}
											if (local31 == 5017) {
												anIntArray240[local1++] = Static160.anInt3190;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray240[local1];
												local541 = 0;
												if (local536 < 100 && Static297.aStringArray41[local536] != null) {
													local541 = Static222.anIntArray561[local536];
												}
												anIntArray240[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray240[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static44.aStringArray3[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray14[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static130.aClass5_Sub3_Sub3_Sub1_1 == null || Static130.aClass5_Sub3_Sub3_Sub1_1.aString129 == null) {
													local348 = Static142.aString123;
												} else {
													local348 = Static130.aClass5_Sub3_Sub3_Sub1_1.method3061();
												}
												aStringArray14[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray240[local1];
												aStringArray14[local3++] = Static253.method4473(local536).aString24;
												continue;
											}
											@Pc(8616) Class1_Sub1_Sub4 local8616;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray240[local1];
												local8616 = Static253.method4473(local536);
												if (local8616.anIntArray97 == null) {
													anIntArray240[local1++] = 0;
												} else {
													anIntArray240[local1++] = local8616.anIntArray97.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												@Pc(8651) Class1_Sub1_Sub4 local8651 = Static253.method4473(local536);
												local391 = local8651.anIntArray97[local541];
												anIntArray240[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray240[local1];
												local8616 = Static253.method4473(local536);
												if (local8616.anIntArray96 == null) {
													anIntArray240[local1++] = 0;
												} else {
													anIntArray240[local1++] = local8616.anIntArray96.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												anIntArray240[local1++] = Static253.method4473(local536).anIntArray96[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray240[local1];
												aStringArray14[local3++] = Static122.method2174(local536).method4721();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray240[local1];
												@Pc(8746) Class1_Sub1_Sub17 local8746 = Static122.method2174(local536);
												if (local8746.anIntArray676 == null) {
													anIntArray240[local1++] = 0;
												} else {
													anIntArray240[local1++] = local8746.anIntArray676.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												anIntArray240[local1++] = Static122.method2174(local536).anIntArray676[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass107_1 = new Class107();
												local1--;
												aClass107_1.anInt3136 = anIntArray240[local1];
												aClass107_1.aClass1_Sub1_Sub17_1 = Static122.method2174(aClass107_1.anInt3136);
												aClass107_1.anIntArray360 = new int[aClass107_1.aClass1_Sub1_Sub17_1.method4727()];
												continue;
											}
											if (local31 == 5059) {
												Static248.aClass1_Sub7_Sub1_2.method728(143);
												Static248.aClass1_Sub7_Sub1_2.method3108(0);
												local536 = Static248.aClass1_Sub7_Sub1_2.anInt3368;
												Static248.aClass1_Sub7_Sub1_2.method3108(0);
												Static248.aClass1_Sub7_Sub1_2.method3128(aClass107_1.anInt3136);
												aClass107_1.aClass1_Sub1_Sub17_1.method4720(Static248.aClass1_Sub7_Sub1_2, aClass107_1.anIntArray360);
												Static248.aClass1_Sub7_Sub1_2.method3102(Static248.aClass1_Sub7_Sub1_2.anInt3368 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray14[local3];
												Static248.aClass1_Sub7_Sub1_2.method728(96);
												Static248.aClass1_Sub7_Sub1_2.method3108(0);
												local541 = Static248.aClass1_Sub7_Sub1_2.anInt3368;
												Static248.aClass1_Sub7_Sub1_2.method3124(local348);
												Static248.aClass1_Sub7_Sub1_2.method3128(aClass107_1.anInt3136);
												aClass107_1.aClass1_Sub1_Sub17_1.method4720(Static248.aClass1_Sub7_Sub1_2, aClass107_1.anIntArray360);
												Static248.aClass1_Sub7_Sub1_2.method3102(Static248.aClass1_Sub7_Sub1_2.anInt3368 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static248.aClass1_Sub7_Sub1_2.method728(143);
												Static248.aClass1_Sub7_Sub1_2.method3108(0);
												local536 = Static248.aClass1_Sub7_Sub1_2.anInt3368;
												Static248.aClass1_Sub7_Sub1_2.method3108(1);
												Static248.aClass1_Sub7_Sub1_2.method3128(aClass107_1.anInt3136);
												aClass107_1.aClass1_Sub1_Sub17_1.method4720(Static248.aClass1_Sub7_Sub1_2, aClass107_1.anIntArray360);
												Static248.aClass1_Sub7_Sub1_2.method3102(Static248.aClass1_Sub7_Sub1_2.anInt3368 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												anIntArray240[local1++] = Static253.method4473(local536).aCharArray1[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												anIntArray240[local1++] = Static253.method4473(local536).aCharArray2[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												if (local541 == -1) {
													anIntArray240[local1++] = -1;
												} else {
													anIntArray240[local1++] = Static253.method4473(local536).method856((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												if (local541 == -1) {
													anIntArray240[local1++] = -1;
												} else {
													anIntArray240[local1++] = Static253.method4473(local536).method860((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray240[local1];
												anIntArray240[local1++] = Static122.method2174(local536).method4727();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												local740 = Static122.method2174(local536).method4717(local541);
												anIntArray240[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												aClass107_1.anIntArray360[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												aClass107_1.anIntArray360[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray240[local1];
												local541 = anIntArray240[local1 + 1];
												local740 = anIntArray240[local1 + 2];
												@Pc(9175) Class1_Sub1_Sub17 local9175 = Static122.method2174(local536);
												if (local9175.method4717(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray240[local1++] = local9175.method4718(local740, local541);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray14[local3];
												local1--;
												local1266 = anIntArray240[local1] == 1;
												Static1.method48(local1266, local348);
												anIntArray240[local1++] = Static243.anInt4740;
												continue;
											}
											if (local31 == 5072) {
												if (Static37.aShortArray16 != null && Static154.anInt3081 < Static243.anInt4740) {
													anIntArray240[local1++] = Static37.aShortArray16[Static154.anInt3081++] & 0xFFFF;
													continue;
												}
												anIntArray240[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static154.anInt3081 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static220.aBooleanArray24[86]) {
													anIntArray240[local1++] = 1;
												} else {
													anIntArray240[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static220.aBooleanArray24[82]) {
													anIntArray240[local1++] = 1;
												} else {
													anIntArray240[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static220.aBooleanArray24[81]) {
													anIntArray240[local1++] = 1;
												} else {
													anIntArray240[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9695) boolean local9695;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static265.method4611(anIntArray240[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray240[local1++] = Static338.method5606();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static222.method4059(anIntArray240[local1], -1, -1, false);
													continue;
												}
												@Pc(9371) Class1_Sub1_Sub12 local9371;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray240[local1];
													local9371 = Static342.method1967(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9371 == null) {
														anIntArray240[local1++] = -1;
													} else {
														anIntArray240[local1++] = local9371.anInt2833;
													}
													continue;
												}
												@Pc(9395) Class1_Sub1_Sub12 local9395;
												if (local31 == 5207) {
													local1--;
													local9395 = Static342.method1957(anIntArray240[local1]);
													if (local9395 != null && local9395.aString111 != null) {
														aStringArray14[local3++] = local9395.aString111;
														continue;
													}
													aStringArray14[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray240[local1++] = Static120.anInt2343;
													anIntArray240[local1++] = Static33.anInt800;
													continue;
												}
												if (local31 == 5209) {
													anIntArray240[local1++] = Static90.anInt1760 + Static342.anInt2144;
													anIntArray240[local1++] = Static185.anInt1061 + Static342.anInt2150;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray240[local1];
													local9371 = Static342.method1957(local536);
													if (local9371 == null) {
														anIntArray240[local1++] = 0;
														anIntArray240[local1++] = 0;
													} else {
														anIntArray240[local1++] = local9371.anInt2834 >> 14 & 0x3FFF;
														anIntArray240[local1++] = local9371.anInt2834 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray240[local1];
													local9371 = Static342.method1957(local536);
													if (local9371 == null) {
														anIntArray240[local1++] = 0;
														anIntArray240[local1++] = 0;
													} else {
														anIntArray240[local1++] = local9371.anInt2829 - local9371.anInt2824;
														anIntArray240[local1++] = local9371.anInt2830 - local9371.anInt2825;
													}
													continue;
												}
												@Pc(9537) Class1_Sub25 local9537;
												if (local31 == 5212) {
													local9537 = Static8.method284();
													if (local9537 == null) {
														anIntArray240[local1++] = -1;
														anIntArray240[local1++] = -1;
													} else {
														anIntArray240[local1++] = local9537.anInt4124;
														local541 = local9537.anInt4123 << 28 | local9537.anInt4119 + Static342.anInt2144 << 14 | local9537.anInt4125 + Static342.anInt2150;
														anIntArray240[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9537 = Static288.method5421();
													if (local9537 == null) {
														anIntArray240[local1++] = -1;
														anIntArray240[local1++] = -1;
													} else {
														anIntArray240[local1++] = local9537.anInt4124;
														local541 = local9537.anInt4123 << 28 | local9537.anInt4119 + Static342.anInt2144 << 14 | local9537.anInt4125 + Static342.anInt2150;
														anIntArray240[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray240[local1];
													local9371 = Static242.method4296();
													if (local9371 != null) {
														local6900 = local9371.method2737(local536 >> 14 & 0x3FFF, anIntArray241, local536 >> 28 & 0x3, local536 & 0x3FFF);
														if (local6900) {
															Static92.method1718(anIntArray241[1], anIntArray241[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray240[local1];
													local541 = anIntArray240[local1 + 1];
													@Pc(9693) Class4 local9693 = Static342.method1956(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9695 = false;
													for (@Pc(9700) Class1_Sub1_Sub12 local9700 = (Class1_Sub1_Sub12) local9693.method177(); local9700 != null; local9700 = (Class1_Sub1_Sub12) local9693.method182()) {
														if (local9700.anInt2833 == local541) {
															local9695 = true;
															break;
														}
													}
													if (local9695) {
														anIntArray240[local1++] = 1;
													} else {
														anIntArray240[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray240[local1];
													local9371 = Static342.method1957(local536);
													if (local9371 == null) {
														anIntArray240[local1++] = -1;
													} else {
														anIntArray240[local1++] = local9371.anInt2826;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray240[local1++] = Static24.anInt671 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray240[local1];
													Static92.method1718(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9395 = Static242.method4296();
													if (local9395 == null) {
														anIntArray240[local1++] = -1;
														anIntArray240[local1++] = -1;
													} else {
														local1266 = local9395.method2742(Static90.anInt1760 + Static342.anInt2144, Static185.anInt1061 + Static342.anInt2150, anIntArray241);
														if (local1266) {
															anIntArray240[local1++] = anIntArray241[1];
															anIntArray240[local1++] = anIntArray241[2];
														} else {
															anIntArray240[local1++] = -1;
															anIntArray240[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray240[local1];
													local541 = anIntArray240[local1 + 1];
													Static222.method4059(local536, local541 & 0x3FFF, local541 >> 14 & 0x3FFF, false);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray240[local1];
													local9371 = Static242.method4296();
													if (local9371 == null) {
														anIntArray240[local1++] = -1;
														anIntArray240[local1++] = -1;
													} else {
														local6900 = local9371.method2737(local536 >> 14 & 0x3FFF, anIntArray241, local536 >> 28 & 0x3, local536 & 0x3FFF);
														if (local6900) {
															anIntArray240[local1++] = anIntArray241[1];
															anIntArray240[local1++] = anIntArray241[2];
														} else {
															anIntArray240[local1++] = -1;
															anIntArray240[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray240[local1];
													local9371 = Static242.method4296();
													if (local9371 == null) {
														anIntArray240[local1++] = -1;
														anIntArray240[local1++] = -1;
													} else {
														local6900 = local9371.method2742(local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray241);
														if (local6900) {
															anIntArray240[local1++] = anIntArray241[1];
															anIntArray240[local1++] = anIntArray241[2];
														} else {
															anIntArray240[local1++] = -1;
															anIntArray240[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static16.method363(anIntArray240[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray240[local1];
													local541 = anIntArray240[local1 + 1];
													Static222.method4059(local536, local541 & 0x3FFF, local541 >> 14 & 0x3FFF, true);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static20.aBoolean42 = anIntArray240[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray240[local1++] = Static20.aBoolean42 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray240[local1];
													Static245.method4333(local536);
													continue;
												}
												@Pc(10111) Class1 local10111;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray240[local1];
													local1266 = anIntArray240[local1 + 1] == 1;
													if (Static90.aClass26_10 == null) {
														continue;
													}
													local10111 = Static90.aClass26_10.method870((long) local536);
													if (local10111 != null && !local1266) {
														local10111.method5710();
														continue;
													}
													if (local10111 == null && local1266) {
														local10111 = new Class1();
														Static90.aClass26_10.method877((long) local536, local10111);
													}
													continue;
												}
												@Pc(10150) Class1 local10150;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray240[local1];
													if (Static90.aClass26_10 == null) {
														anIntArray240[local1++] = 0;
													} else {
														local10150 = Static90.aClass26_10.method870((long) local536);
														anIntArray240[local1++] = local10150 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray240[local1];
													local1266 = anIntArray240[local1 + 1] == 1;
													if (Static9.aClass26_1 == null) {
														continue;
													}
													local10111 = Static9.aClass26_1.method870((long) local536);
													if (local10111 != null && !local1266) {
														local10111.method5710();
														continue;
													}
													if (local10111 == null && local1266) {
														local10111 = new Class1();
														Static9.aClass26_1.method877((long) local536, local10111);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray240[local1];
													if (Static9.aClass26_1 == null) {
														anIntArray240[local1++] = 0;
													} else {
														local10150 = Static9.aClass26_1.method870((long) local536);
														anIntArray240[local1++] = local10150 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray240[local1++] = Static342.aClass1_Sub1_Sub12_2 == null ? -1 : Static342.aClass1_Sub1_Sub12_2.anInt2833;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray240[local1];
													local541 = anIntArray240[local1 + 1];
													Static294.method5056(local536, false, 3, local541);
													anIntArray240[local1++] = Static292.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static292.aFrame2 != null) {
														Static294.method5056(-1, false, Static142.anInt3154, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10313) Class164[] local10313 = Static302.method4316();
													anIntArray240[local1++] = local10313.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray240[local1];
													@Pc(10331) Class164[] local10331 = Static302.method4316();
													anIntArray240[local1++] = local10331[local536].anInt4856;
													anIntArray240[local1++] = local10331[local536].anInt4851;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static176.anInt3649;
													local541 = Static114.anInt2288;
													local740 = -1;
													@Pc(10360) Class164[] local10360 = Static302.method4316();
													for (local410 = 0; local410 < local10360.length; local410++) {
														@Pc(10367) Class164 local10367 = local10360[local410];
														if (local10367.anInt4856 == local536 && local10367.anInt4851 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray240[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray240[local1++] = Static295.method5063();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray240[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static294.method5056(-1, false, local536, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray240[local1++] = Static142.anInt3154;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray240[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static142.anInt3154 = local536;
														Static114.method2086(Static180.aClass110_6);
													}
													continue;
												}
											} else {
												@Pc(10822) String local10822;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray14[local3];
														local1699 = aStringArray14[local3 + 1];
														local1--;
														local740 = anIntArray240[local1];
														Static248.aClass1_Sub7_Sub1_2.method728(83);
														Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(local348) + Static203.method3794(local1699) + 1);
														Static248.aClass1_Sub7_Sub1_2.method3124(local348);
														Static248.aClass1_Sub7_Sub1_2.method3124(local1699);
														Static248.aClass1_Sub7_Sub1_2.method3108(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static305.aShortArray94[anIntArray240[local1]] = (short) Static160.method3021(anIntArray240[local1 + 1]);
														Static279.method4818();
														Static82.method1589();
														Static256.method4556();
														Static75.method1448();
														Static228.method4134();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static133.anIntArrayArrayArray8[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1] << 1;
														local740 = anIntArray240[local1 + 2];
														local391 = anIntArray240[local1 + 3];
														local410 = anIntArray240[local1 + 4];
														local771 = anIntArray240[local1 + 5];
														@Pc(10608) int local10608 = anIntArray240[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static133.anIntArrayArrayArray8[local536] != null && local541 >= 0 && local541 < Static133.anIntArrayArrayArray8[local536].length) {
															Static133.anIntArrayArrayArray8[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10608 };
															Static133.anIntArrayArrayArray8[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static133.anIntArrayArrayArray8[anIntArray240[local1]].length >> 1;
														anIntArray240[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static292.aFrame2 != null) {
															Static294.method5056(-1, false, Static142.anInt3154, -1);
														}
														if (Static232.aFrame3 == null) {
															local348 = Static3.aString3 == null ? Static290.method4943() : Static3.aString3;
															Static140.method2695(local348, Static258.anInt5029 == 1, Static180.aClass110_6, false);
														} else {
															Static44.method1007();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static99.aClass134_2 != null) {
															if (Static99.aClass134_2.anObject6 == null) {
																local348 = Static352.method5704(Static99.aClass134_2.anInt4034);
															} else {
																local348 = (String) Static99.aClass134_2.anObject6;
															}
														}
														aStringArray14[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray240[local1++] = Static168.anInt3543 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static292.aFrame2 != null) {
															Static294.method5056(-1, false, Static142.anInt3154, -1);
														}
														local3--;
														local348 = aStringArray14[local3];
														local1--;
														local1266 = anIntArray240[local1] == 1;
														local10822 = Static290.method4943() + local348;
														Static140.method2695(local10822, Static258.anInt5029 == 1, Static180.aClass110_6, local1266);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray14[local3];
														local1699 = aStringArray14[local3 + 1];
														local1--;
														local740 = anIntArray240[local1];
														if (local348.length() > 0) {
															if (Static87.aStringArray8 == null) {
																Static87.aStringArray8 = new String[Static81.anIntArray186[Static341.anInt2259]];
															}
															Static87.aStringArray8[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static187.aStringArray27 == null) {
																Static187.aStringArray27 = new String[Static81.anIntArray186[Static341.anInt2259]];
															}
															Static187.aStringArray27[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray14[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static37.anInt891 = anIntArray240[local1];
														Static73.anInt1506 = anIntArray240[local1 + 1];
														Static254.anInt4895 = anIntArray240[local1 + 2];
														Static39.anInt903 = anIntArray240[local1 + 3];
														Static239.anInt4651 = anIntArray240[local1 + 4];
														Static30.anInt777 = anIntArray240[local1 + 5];
														Static32.anInt791 = anIntArray240[local1 + 6];
														Static185.anInt1051 = anIntArray240[local1 + 7];
														Static158.anInt3146 = anIntArray240[local1 + 8];
														Static16.anInt313 = anIntArray240[local1 + 9];
														Static54.anInt3494 = anIntArray240[local1 + 10];
														Static297.aClass165_88.method4486(Static239.anInt4651);
														Static297.aClass165_88.method4486(Static30.anInt777);
														Static297.aClass165_88.method4486(Static32.anInt791);
														Static297.aClass165_88.method4486(Static185.anInt1051);
														Static297.aClass165_88.method4486(Static158.anInt3146);
														Static190.aClass90_13 = null;
														Static306.aClass90_17 = null;
														Static155.aClass90_10 = null;
														Static156.aClass90_11 = null;
														Static44.aClass90_4 = null;
														Static175.aClass90_12 = null;
														Static50.aClass90_7 = null;
														Static88.aClass90_8 = null;
														Static273.aBoolean458 = true;
														continue;
													}
													if (local31 == 5425) {
														Static294.method5054();
														Static273.aBoolean458 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static147.anInt2901 = anIntArray240[local1];
														Static57.anInt1269 = anIntArray240[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static320.anInt6136 = anIntArray240[local1];
														Static338.anInt6420 = anIntArray240[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														anIntArray240[local1++] = Static147.method2796(local541, local536) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static280.method4824(false, aStringArray14[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														local391 = anIntArray240[local1 + 3];
														Static47.method1085((local536 >> 14 & 0x3FFF) - Static182.anInt3775, local541, false, (local536 & 0x3FFF) - Static161.anInt3315, local391, local740);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														local391 = anIntArray240[local1 + 3];
														Static52.method1153(local391, (local536 >> 14 & 0x3FFF) - Static182.anInt3775, local541, local740, (local536 & 0x3FFF) - Static161.anInt3315);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray240[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static304.anInt5854 = local536;
														local541 = anIntArray240[local1 + 1];
														if (local541 + 1 >= Static133.anIntArrayArrayArray8[Static304.anInt5854].length >> 1) {
															throw new RuntimeException();
														}
														Static147.anInt2892 = local541;
														Static141.anInt867 = 0;
														Static296.anInt5749 = anIntArray240[local1 + 2];
														Static72.anInt1505 = anIntArray240[local1 + 3];
														local740 = anIntArray240[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static112.anInt4021 = local740;
														local391 = anIntArray240[local1 + 5];
														if (local391 + 1 >= Static133.anIntArrayArrayArray8[Static112.anInt4021].length >> 1) {
															throw new RuntimeException();
														}
														Static47.anInt1090 = local391;
														Static81.anInt1609 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static198.method3731();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static177.method3479(anIntArray240[local1], anIntArray240[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray240[local1++] = (int) Static233.aFloat86 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray240[local1++] = (int) Static304.aFloat110 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static312.method5687();
														continue;
													}
													if (local31 == 5508) {
														Static258.method4563();
														continue;
													}
													if (local31 == 5509) {
														Static199.method3741();
														continue;
													}
													if (local31 == 5510) {
														Static123.method2197();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray240[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static182.anInt3775;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static48.anInt1107) {
															local541 = Static48.anInt1107;
														}
														local740 -= Static161.anInt3315;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static337.anInt6402) {
															local740 = Static337.anInt6402;
														}
														Static339.anInt6426 = local541 * 128 + 64;
														Static230.anInt4531 = local740 * 128 + 64;
														Static81.anInt1609 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static154.method2923();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray14[local3];
														local1699 = aStringArray14[local3 + 1];
														local1--;
														local740 = anIntArray240[local1];
														if (Static239.anInt4649 == 10 && Static51.anInt5048 == 0 && Static24.anInt674 == 0 && Static76.anInt1538 == 0 && Static11.anInt5390 == 0) {
															Static4.method174(local740, local348, local1699);
														}
														continue;
													}
													if (local31 == 5601) {
														Static151.method3586();
														continue;
													}
													if (local31 == 5602) {
														if (Static24.anInt674 == 0) {
															Static82.anInt1642 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static239.anInt4649 == 10 && Static51.anInt5048 == 0 && Static24.anInt674 == 0 && Static76.anInt1538 == 0 && Static11.anInt5390 == 0) {
															Static159.method2988(anIntArray240[local1 + 1], anIntArray240[local1], anIntArray240[local1 + 2], anIntArray240[local1 + 3]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static239.anInt4649 == 10 && Static51.anInt5048 == 0 && Static24.anInt674 == 0 && Static76.anInt1538 == 0 && Static11.anInt5390 == 0) {
															Static172.method5107(Static57.method1236(aStringArray14[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static239.anInt4649 == 10 && Static51.anInt5048 == 0 && Static24.anInt674 == 0 && Static76.anInt1538 == 0 && Static11.anInt5390 == 0) {
															Static126.method2407(anIntArray240[local1 + 6] == 1, anIntArray240[local1 + 2], anIntArray240[local1 + 1], anIntArray240[local1 + 5] == 1, anIntArray240[local1], anIntArray240[local1 + 4] == 1, anIntArray240[local1 + 3], aStringArray14[local3 + 2], Static57.method1236(aStringArray14[local3]), aStringArray14[local3 + 1]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static76.anInt1538 == 0) {
															Static202.anInt4091 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray240[local1++] = Static82.anInt1642;
														continue;
													}
													if (local31 == 5608) {
														anIntArray240[local1++] = Static193.anInt3948;
														continue;
													}
													if (local31 == 5609) {
														anIntArray240[local1++] = Static202.anInt4091;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray14[local3++] = Static123.aStringArray23.length > local536 ? Static21.method564(Static123.aStringArray23[local536]) : "";
														}
														Static123.aStringArray23 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray240[local1++] = Static122.anInt2361;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static210.anInt4175 = local536;
														Static326.method5479();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static88.method1694(anIntArray240[local1] == 1);
														Static270.method4722();
														Static326.method5479();
														Static309.method5209();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static216.aBoolean364 = anIntArray240[local1] == 1;
														Static309.method5209();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static217.aBoolean365 = anIntArray240[local1] == 1;
														Static326.method5479();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static305.aBoolean515 = anIntArray240[local1] == 1;
														Static34.aClass2_6.method3304(!Static305.aBoolean515);
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static331.anInt6338 = anIntArray240[local1];
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static1.aBoolean14 = anIntArray240[local1] == 1;
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static127.aBoolean226 = anIntArray240[local1] == 1;
														Static326.method5479();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static264.aBoolean464 = anIntArray240[local1] == 1;
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static158.anInt3147 = local536;
														Static326.method5479();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static44.aBoolean87 = anIntArray240[local1] == 1;
														Static275.method4781();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static8.aBoolean28 = anIntArray240[local1] == 1;
														Static326.method5479();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static41.aBoolean83 = anIntArray240[local1] == 1;
														Static326.method5479();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static123.anInt2389 = local536;
														Static311.method5241();
														Static114.method2086(Static180.aClass110_6);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static337.aBoolean564 = anIntArray240[local1] == 1;
														Static148.method4536();
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static115.anInt2304 = local536;
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static211.anInt4208) {
															if (Static211.anInt4208 == 0 && Static43.anInt2906 != -1) {
																Static299.method5095(Static242.aClass165_74, Static43.anInt2906, local536);
																Static275.aBoolean463 = false;
															} else if (local536 == 0) {
																Static217.method3974();
																Static275.aBoolean463 = false;
															} else {
																Static24.method736(local536);
															}
															Static211.anInt4208 = local536;
														}
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static8.anInt201 = local536;
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static272.aBoolean453 = anIntArray240[local1] == 1;
														Static309.method5209();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray240[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static157.anInt3131 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static135.method2613(local536);
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														anIntArray240[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static158.anInt3151 = local536;
														Static114.method2086(Static180.aClass110_6);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static75.anInt1518 = local536;
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static155.method2949(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static268.aBoolean429 = anIntArray240[local1] != 0;
														Static114.method2086(Static180.aClass110_6);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static331.anInt6338 = anIntArray240[local1];
														Static114.method2086(Static180.aClass110_6);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static71.aBoolean129 = anIntArray240[local1] != 0;
														Static114.method2086(Static180.aClass110_6);
														Static326.method5479();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static263.method4608(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray240[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static335.anInt6377 = local536;
														Static114.method2086(Static180.aClass110_6);
														Static7.aBoolean21 = false;
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray240[local1++] = Static210.anInt4175;
														continue;
													}
													if (local31 == 6102) {
														anIntArray240[local1++] = Static123.method2195() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray240[local1++] = Static216.aBoolean364 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray240[local1++] = Static217.aBoolean365 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray240[local1++] = Static305.aBoolean515 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray240[local1++] = Static331.anInt6338;
														continue;
													}
													if (local31 == 6108) {
														anIntArray240[local1++] = Static1.aBoolean14 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray240[local1++] = Static127.aBoolean226 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray240[local1++] = Static264.aBoolean464 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray240[local1++] = Static158.anInt3147;
														continue;
													}
													if (local31 == 6112) {
														anIntArray240[local1++] = Static44.aBoolean87 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray240[local1++] = Static8.aBoolean28 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray240[local1++] = Static41.aBoolean83 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray240[local1++] = Static123.anInt2389;
														continue;
													}
													if (local31 == 6117) {
														anIntArray240[local1++] = Static337.aBoolean564 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray240[local1++] = Static115.anInt2304;
														continue;
													}
													if (local31 == 6119) {
														anIntArray240[local1++] = Static211.anInt4208;
														continue;
													}
													if (local31 == 6120) {
														anIntArray240[local1++] = Static8.anInt201;
														continue;
													}
													if (local31 == 6121) {
														anIntArray240[local1++] = Static34.aClass2_6.method3244() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray240[local1++] = Static187.method3637();
														continue;
													}
													if (local31 == 6124) {
														anIntArray240[local1++] = Static158.anInt3151;
														continue;
													}
													if (local31 == 6125) {
														anIntArray240[local1++] = Static75.anInt1518;
														continue;
													}
													if (local31 == 6126) {
														anIntArray240[local1++] = Static34.aClass2_6.method3238() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray240[local1++] = Static344.aBoolean555 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray240[local1++] = Static268.aBoolean429 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray240[local1++] = Static331.anInt6338;
														continue;
													}
													if (local31 == 6130) {
														anIntArray240[local1++] = Static71.aBoolean129 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray240[local1++] = Static258.anInt5029;
														continue;
													}
													if (local31 == 6132) {
														anIntArray240[local1++] = Static335.anInt6377;
														continue;
													}
													if (local31 == 6133) {
														anIntArray240[local1++] = Static168.anInt3543 == 1 || Static168.anInt3543 == 4 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static156.aShort30 = (short) anIntArray240[local1];
														if (Static156.aShort30 <= 0) {
															Static156.aShort30 = 256;
														}
														Static33.aShort3 = (short) anIntArray240[local1 + 1];
														if (Static33.aShort3 <= 0) {
															Static33.aShort3 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static217.aShort53 = (short) anIntArray240[local1];
														if (Static217.aShort53 <= 0) {
															Static217.aShort53 = 256;
														}
														Static9.aShort2 = (short) anIntArray240[local1 + 1];
														if (Static9.aShort2 <= 0) {
															Static9.aShort2 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static244.aShort61 = (short) anIntArray240[local1];
														if (Static244.aShort61 <= 0) {
															Static244.aShort61 = 1;
														}
														Static233.aShort60 = (short) anIntArray240[local1 + 1];
														if (Static233.aShort60 <= 0) {
															Static233.aShort60 = 32767;
														} else if (Static233.aShort60 < Static244.aShort61) {
															Static233.aShort60 = Static244.aShort61;
														}
														Static87.aShort15 = (short) anIntArray240[local1 + 2];
														if (Static87.aShort15 <= 0) {
															Static87.aShort15 = 1;
														}
														Static175.aShort35 = (short) anIntArray240[local1 + 3];
														if (Static175.aShort35 <= 0) {
															Static175.aShort35 = 32767;
														} else if (Static175.aShort35 < Static87.aShort15) {
															Static175.aShort35 = Static87.aShort15;
														}
														continue;
													}
													if (local31 == 6203) {
														Static10.method290(Static40.aClass177_15.anInt5179, 0, false, 0, Static40.aClass177_15.anInt5209);
														anIntArray240[local1++] = Static332.anInt6364;
														anIntArray240[local1++] = Static258.anInt5022;
														continue;
													}
													if (local31 == 6204) {
														anIntArray240[local1++] = Static217.aShort53;
														anIntArray240[local1++] = Static9.aShort2;
														continue;
													}
													if (local31 == 6205) {
														anIntArray240[local1++] = Static156.aShort30;
														anIntArray240[local1++] = Static33.aShort3;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray240[local1++] = (int) (Static349.method5647() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray240[local1++] = (int) (Static349.method5647() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray240[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static349.method5647()));
														anIntArray240[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray240[local1];
														local1266 = true;
														if (local536 < 0) {
															local1266 = (local536 + 1) % 4 == 0;
														} else if (local536 < 1582) {
															local1266 = local536 % 4 == 0;
														} else if (local536 % 4 != 0) {
															local1266 = false;
														} else if (local536 % 100 != 0) {
															local1266 = true;
														} else if (local536 % 400 != 0) {
															local1266 = false;
														}
														anIntArray240[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray240[local1++] = Static195.method3683() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray240[local1++] = Static311.method5244() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static239.anInt4649 == 10 && Static51.anInt5048 == 0 && Static24.anInt674 == 0 && Static76.anInt1538 == 0) {
															anIntArray240[local1++] = Static292.method5013() == -1 ? 0 : 1;
															continue;
														}
														anIntArray240[local1++] = 1;
														continue;
													}
													@Pc(13088) Class182 local13088;
													@Pc(13064) Class74_Sub1 local13064;
													if (local31 == 6501) {
														local13064 = Static53.method1168();
														if (local13064 == null) {
															anIntArray240[local1++] = -1;
															anIntArray240[local1++] = 0;
															aStringArray14[local3++] = "";
															anIntArray240[local1++] = 0;
															aStringArray14[local3++] = "";
															anIntArray240[local1++] = 0;
															anIntArray240[local1++] = 0;
														} else {
															anIntArray240[local1++] = local13064.anInt2267;
															anIntArray240[local1++] = local13064.anInt2255;
															aStringArray14[local3++] = local13064.aString92;
															local13088 = local13064.method2070();
															anIntArray240[local1++] = local13088.anInt5376;
															aStringArray14[local3++] = local13088.aString216;
															anIntArray240[local1++] = local13064.anInt2260;
															anIntArray240[local1++] = local13064.anInt2266;
														}
														continue;
													}
													if (local31 == 6502) {
														local13064 = Static129.method2435();
														if (local13064 == null) {
															anIntArray240[local1++] = -1;
															anIntArray240[local1++] = 0;
															aStringArray14[local3++] = "";
															anIntArray240[local1++] = 0;
															aStringArray14[local3++] = "";
															anIntArray240[local1++] = 0;
															anIntArray240[local1++] = 0;
														} else {
															anIntArray240[local1++] = local13064.anInt2267;
															anIntArray240[local1++] = local13064.anInt2255;
															aStringArray14[local3++] = local13064.aString92;
															local13088 = local13064.method2070();
															anIntArray240[local1++] = local13088.anInt5376;
															aStringArray14[local3++] = local13088.aString216;
															anIntArray240[local1++] = local13064.anInt2260;
															anIntArray240[local1++] = local13064.anInt2266;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray240[local1];
														if (Static239.anInt4649 == 10 && Static51.anInt5048 == 0 && Static24.anInt674 == 0 && Static76.anInt1538 == 0) {
															anIntArray240[local1++] = Static41.method981(local536) ? 1 : 0;
															continue;
														}
														anIntArray240[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static73.anInt1510 = anIntArray240[local1];
														Static114.method2086(Static180.aClass110_6);
														continue;
													}
													if (local31 == 6505) {
														anIntArray240[local1++] = Static73.anInt1510;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray240[local1];
														@Pc(13308) Class74_Sub1 local13308 = Static51.method4585(local536);
														if (local13308 == null) {
															anIntArray240[local1++] = -1;
															aStringArray14[local3++] = "";
															anIntArray240[local1++] = 0;
															aStringArray14[local3++] = "";
															anIntArray240[local1++] = 0;
															anIntArray240[local1++] = 0;
														} else {
															anIntArray240[local1++] = local13308.anInt2255;
															aStringArray14[local3++] = local13308.aString92;
															@Pc(13326) Class182 local13326 = local13308.method2070();
															anIntArray240[local1++] = local13326.anInt5376;
															aStringArray14[local3++] = local13326.aString216;
															anIntArray240[local1++] = local13308.anInt2260;
															anIntArray240[local1++] = local13308.anInt2266;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray240[local1];
														local1266 = anIntArray240[local1 + 1] == 1;
														local740 = anIntArray240[local1 + 2];
														local9695 = anIntArray240[local1 + 3] == 1;
														Static223.method4078(local536, local740, local9695, local1266);
														continue;
													}
													if (local31 == 6508) {
														Static149.method2392();
														continue;
													}
													if (local31 == 6509) {
														if (Static239.anInt4649 == 10) {
															local1--;
															if (anIntArray240[local1] == 1) {
																if (Static198.aClass216_1 == null) {
																	Static198.aClass216_1 = new Class216();
																}
															} else if (Static198.aClass216_1 != null) {
																Static198.aClass216_1.method5617();
																Static198.aClass216_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static102.aBoolean179 = anIntArray240[local1] == 1;
														Static114.method2086(Static180.aClass110_6);
														continue;
													}
													if (local31 == 6601) {
														anIntArray240[local1++] = Static102.aBoolean179 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static50.anInt1155 == 2) {
													if (local31 == 6700) {
														local536 = Static348.aClass26_20.method875();
														if (Static100.anInt2086 != -1) {
															local536++;
														}
														anIntArray240[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray240[local1];
														if (Static100.anInt2086 != -1) {
															if (local536 == 0) {
																anIntArray240[local1++] = Static100.anInt2086;
																continue;
															}
															local536--;
														}
														local3526 = (Class1_Sub9) Static348.aClass26_20.method871();
														while (local536-- > 0) {
															local3526 = (Class1_Sub9) Static348.aClass26_20.method878();
														}
														anIntArray240[local1++] = local3526.anInt1104;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray240[local1];
														if (Static314.aClass177ArrayArray1[local536] == null) {
															aStringArray14[local3++] = "";
														} else {
															local1699 = Static314.aClass177ArrayArray1[local536][0].aString208;
															if (local1699 == null) {
																aStringArray14[local3++] = "";
															} else {
																aStringArray14[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray240[local1];
														if (Static314.aClass177ArrayArray1[local536] == null) {
															anIntArray240[local1++] = 0;
														} else {
															anIntArray240[local1++] = Static314.aClass177ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														if (Static314.aClass177ArrayArray1[local536] == null) {
															aStringArray14[local3++] = "";
														} else {
															local10822 = Static314.aClass177ArrayArray1[local536][local541].aString208;
															if (local10822 == null) {
																aStringArray14[local3++] = "";
															} else {
																aStringArray14[local3++] = local10822;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														if (Static314.aClass177ArrayArray1[local536] == null) {
															anIntArray240[local1++] = 0;
														} else {
															anIntArray240[local1++] = Static314.aClass177ArrayArray1[local536][local541].anInt5222;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 1, "");
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 2, "");
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 3, "");
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 4, "");
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 5, "");
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 6, "");
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 7, "");
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 8, "");
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 9, "");
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														Static259.method4567(local740, local536 << 16 | local541, 10, "");
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray240[local1];
														local541 = anIntArray240[local1 + 1];
														local740 = anIntArray240[local1 + 2];
														local750 = Static323.method5412(local536 << 16 | local541, local740);
														Static149.method2393();
														@Pc(14053) Class1_Sub35 local14053 = Static47.method1096(local750);
														Static280.method4825(local536 << 16 | local541, local14053.anInt5510, local750.anInt5229, local750.anInt5234, local740, local14053.method4898());
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14086) Class202 local14086;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray240[local1];
														local14086 = Static221.method4034(local536);
														if (local14086.aString234 == null) {
															aStringArray14[local3++] = "";
														} else {
															aStringArray14[local3++] = local14086.aString234;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray240[local1];
														local14086 = Static221.method4034(local536);
														anIntArray240[local1++] = local14086.anInt5886;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray240[local1];
														local14086 = Static221.method4034(local536);
														anIntArray240[local1++] = local14086.anInt5900;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray240[local1];
														local14086 = Static221.method4034(local536);
														anIntArray240[local1++] = local14086.anInt5902;
														continue;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14165) Exception local14165) {
			@Pc(14183) StringBuffer local14183;
			if (arg0.aString251 == null) {
				local14183 = new StringBuffer(30);
				local14183.append("CS2: ").append(arg0.aLong215).append(" ");
				for (local536 = anInt1938 - 1; local536 >= 0; local536--) {
					local14183.append("v: ").append(aClass60Array1[local536].aClass1_Sub1_Sub20_1.aLong215).append(" ");
				}
				local14183.append("op: ").append(local13);
				Static152.method2899(local14183.toString(), local14165);
			} else {
				Static88.method1697("Clientscript error in: " + arg0.aString251);
				local14183 = new StringBuffer(30);
				local14183.append("Clientscript error in: ").append(arg0.aString251).append("\n");
				for (local536 = anInt1938 - 1; local536 >= 0; local536--) {
					local14183.append("via: ").append(aClass60Array1[local536].aClass1_Sub1_Sub20_1.aString251).append("\n");
				}
				local14183.append("Op: ").append(local13).append("\n");
				local1699 = local14165.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14183.append("Message: ").append(local1699).append("\n");
				}
				Static152.method2899(local14183.toString(), local14165);
				Static276.method4789(local14183.toString());
			}
		}
	}
}
