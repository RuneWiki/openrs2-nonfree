import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!fd;")
	private static Class72 aClass72_9;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
	private static int[] anIntArray212;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!ri;")
	private static Class179 aClass179_1;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!fd;")
	private static Class72 aClass72_10;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray20;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray19 = new String[1000];

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	private static int anInt2169 = 0;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
	private static final int[] anIntArray213 = new int[5];

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "[Lclient!vj;")
	private static final Class211[] aClass211Array1 = new Class211[50];

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
	private static final int[] anIntArray214 = new int[1000];

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray25 = new int[5][5000];

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_34 = new Class154(4);

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "[I")
	private static final int[] anIntArray215 = new int[3];

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray21 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
	public static void method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub1_Sub13 local5 = Static38.method724(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray212 = new int[local5.anInt4194];
		aStringArray20 = new String[local5.anInt4192];
		if (local5.anInt4197 == 15 || local5.anInt4197 == 17 || local5.anInt4197 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static142.aClass72_13 != null) {
				local30 = Static142.aClass72_13.anInt1861;
				local32 = Static142.aClass72_13.anInt1854;
			}
			anIntArray212[0] = Static38.anInt830 - local30;
			anIntArray212[1] = Static184.anInt4055 - local32;
		}
		method1759(local5, 200000);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!jb;)V")
	public static void method1756(@OriginalArg(0) Class4_Sub22 arg0) {
		method1758(arg0, 200000);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method1757(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static266.method4641(arg0)) {
			return;
		}
		@Pc(12) Class72[] local12 = Static158.aClass72ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class72 local19 = local12[local14];
			if (local19.anObjectArray27 != null) {
				@Pc(26) Class4_Sub22 local26 = new Class4_Sub22();
				local26.aClass72_12 = local19;
				local26.anObjectArray34 = local19.anObjectArray27;
				method1758(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!jb;I)V")
	private static void method1758(@OriginalArg(0) Class4_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub1_Sub13 local12 = Static309.method5199(local8);
		if (local12 == null) {
			return;
		}
		anIntArray212 = new int[local12.anInt4194];
		@Pc(21) int local21 = 0;
		aStringArray20 = new String[local12.anInt4192];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3116;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3125;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass72_12 == null ? -1 : arg0.aClass72_12.anInt1830;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3124;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass72_12 == null ? -1 : arg0.aClass72_12.anInt1849;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass72_11 == null ? -1 : arg0.aClass72_11.anInt1830;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass72_11 == null ? -1 : arg0.aClass72_11.anInt1849;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3123;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3120;
				}
				anIntArray212[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString106;
				}
				aStringArray20[local27++] = local135;
			}
		}
		method1759(local12, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ml;I)V")
	private static void method1759(@OriginalArg(0) Class4_Sub1_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray358;
		@Pc(11) int[] local11 = arg0.anIntArray357;
		@Pc(13) byte local13 = -1;
		anInt2169 = 0;
		@Pc(536) int local536;
		@Pc(1699) String local1699;
		try {
			@Pc(17) int local17 = 0;
			label4411: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				@Pc(541) int local541;
				@Pc(391) int local391;
				@Pc(410) int local410;
				@Pc(348) String local348;
				if (local31 < 100) {
					if (local31 == 0) {
						anIntArray214[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray214[local1++] = Static103.anIntArray295[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static22.method393(anIntArray214[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray19[local3++] = arg0.aStringArray31[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray214[local1] != anIntArray214[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray214[local1] == anIntArray214[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray214[local1] < anIntArray214[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray214[local1] > anIntArray214[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt2169 == 0) {
							return;
						}
						@Pc(190) Class211 local190 = aClass211Array1[--anInt2169];
						arg0 = local190.aClass4_Sub1_Sub13_1;
						local8 = arg0.anIntArray358;
						local11 = arg0.anIntArray357;
						local5 = local190.anInt6658;
						anIntArray212 = local190.anIntArray530;
						aStringArray20 = local190.aStringArray45;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray214[local1++] = Static44.method807(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static18.method360(local51, anIntArray214[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray214[local1] <= anIntArray214[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray214[local1] >= anIntArray214[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray214[local1++] = anIntArray212[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray212[local299] = anIntArray214[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray19[local3++] = aStringArray20[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray20[local299] = aStringArray19[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static112.method2072(aStringArray19, local3, local51);
						aStringArray19[local3++] = local348;
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
						@Pc(375) Class4_Sub1_Sub13 local375 = Static309.method5199(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt4194];
						@Pc(389) String[] local389 = new String[local375.anInt4192];
						for (local391 = 0; local391 < local375.anInt4196; local391++) {
							local385[local391] = anIntArray214[local1 + local391 - local375.anInt4196];
						}
						for (local410 = 0; local410 < local375.anInt4193; local410++) {
							local389[local410] = aStringArray19[local3 + local410 - local375.anInt4193];
						}
						local1 -= local375.anInt4196;
						local3 -= local375.anInt4193;
						@Pc(441) Class211 local441 = new Class211();
						local441.aClass4_Sub1_Sub13_1 = arg0;
						local441.anInt6658 = local5;
						local441.anIntArray530 = anIntArray212;
						local441.aStringArray45 = aStringArray20;
						if (anInt2169 >= aClass211Array1.length) {
							throw new RuntimeException();
						}
						aClass211Array1[anInt2169++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray358;
						local11 = local375.anIntArray357;
						local5 = -1;
						anIntArray212 = local385;
						aStringArray20 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray214[local1++] = Static289.anIntArray486[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static289.anIntArray486[local51] = anIntArray214[local1];
						Static148.method4011(local51);
						Static156.aBoolean291 |= Static72.aBooleanArray12[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray214[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray213[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4411;
								}
								anIntArrayArray25[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray214[local1];
						if (local536 >= 0 && local536 < anIntArray213[local51]) {
							anIntArray214[local1++] = anIntArrayArray25[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray214[local1];
						if (local536 >= 0 && local536 < anIntArray213[local51]) {
							anIntArrayArray25[local51][local536] = anIntArray214[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static60.aStringArray7[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray19[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static60.aStringArray7[local51] = aStringArray19[local3];
						Static336.method5527(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class198 local689 = arg0.aClass198Array1[local11[local5]];
						local1--;
						@Pc(699) Class4_Sub36 local699 = (Class4_Sub36) local689.method5261((long) anIntArray214[local1]);
						if (local699 != null) {
							local5 += local699.anInt5967;
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
				@Pc(740) int local740;
				@Pc(771) int local771;
				@Pc(855) Class72 local855;
				@Pc(750) Class72 local750;
				@Pc(922) Class72 local922;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray214[local1];
						local541 = anIntArray214[local1 + 1];
						local740 = anIntArray214[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static66.method1243(local536);
						if (local750.aClass72Array1 == null) {
							local750.aClass72Array1 = new Class72[local740 + 1];
						}
						if (local750.aClass72Array1.length <= local740) {
							@Pc(769) Class72[] local769 = new Class72[local740 + 1];
							for (local771 = 0; local771 < local750.aClass72Array1.length; local771++) {
								local769[local771] = local750.aClass72Array1[local771];
							}
							local750.aClass72Array1 = local769;
						}
						if (local740 > 0 && local750.aClass72Array1[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class72 local814 = new Class72();
						local814.anInt1825 = local541;
						local814.anInt1813 = local814.anInt1830 = local750.anInt1830;
						local814.anInt1849 = local740;
						local814.aBoolean159 = true;
						local750.aClass72Array1[local740] = local814;
						if (local714) {
							aClass72_9 = local814;
						} else {
							aClass72_10 = local814;
						}
						Static238.method4097(local750);
						continue;
					}
					@Pc(876) Class72 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass72_9 : aClass72_10;
						if (local855.anInt1849 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static66.method1243(local855.anInt1830);
						local876.aClass72Array1[local855.anInt1849] = null;
						Static238.method4097(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static66.method1243(anIntArray214[local1]);
						local855.aClass72Array1 = null;
						Static238.method4097(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray214[local1];
						local541 = anIntArray214[local1 + 1];
						local922 = Static289.method4934(local541, local536);
						if (local922 != null && local541 != -1) {
							anIntArray214[local1++] = 1;
							if (local714) {
								aClass72_9 = local922;
							} else {
								aClass72_10 = local922;
							}
							continue;
						}
						anIntArray214[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray214[local1];
						local876 = Static66.method1243(local536);
						if (local876 == null) {
							anIntArray214[local1++] = 0;
						} else {
							anIntArray214[local1++] = 1;
							if (local714) {
								aClass72_9 = local876;
							} else {
								aClass72_10 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray214[local1];
							local541 = anIntArray214[local1 + 1];
							for (local740 = 0; local740 < Static332.anIntArray522.length; local740++) {
								if (Static332.anIntArray522[local740] == local536) {
									Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4.method3920(local740, local541);
									continue label4411;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static178.anIntArray516.length) {
									continue label4411;
								}
								if (Static178.anIntArray516[local391] == local536) {
									Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4.method3920(local391, local541);
									continue label4411;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray214[local1];
							local541 = anIntArray214[local1 + 1];
							Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4.method3915(local541, local536);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray214[local1] != 0;
							Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4.method3923(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || local31 >= 2000 && local31 < 2100) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static66.method1243(anIntArray214[local1]);
							} else {
								local855 = local714 ? aClass72_9 : aClass72_10;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt1796 = anIntArray214[local1];
								local855.anInt1805 = anIntArray214[local1 + 1];
								local541 = anIntArray214[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray214[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte33 = (byte) local541;
								local855.aByte34 = (byte) local740;
								Static238.method4097(local855);
								Static328.method5395(local855);
								if (local855.anInt1849 == -1) {
									Static139.method2754(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt1827 = anIntArray214[local1];
								local855.anInt1799 = anIntArray214[local1 + 1];
								local855.anInt1889 = 0;
								local855.anInt1870 = 0;
								local541 = anIntArray214[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray214[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.aByte36 = (byte) local541;
								local855.aByte35 = (byte) local740;
								Static238.method4097(local855);
								Static328.method5395(local855);
								if (local855.anInt1825 == 0) {
									Static124.method3067(false, local855);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray214[local1] == 1;
								if (local855.aBoolean148 != local1266) {
									local855.aBoolean148 = local1266;
									Static238.method4097(local855);
								}
								if (local855.anInt1849 == -1) {
									Static249.method4315(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt1833 = anIntArray214[local1];
								local855.anInt1812 = anIntArray214[local1 + 1];
								Static238.method4097(local855);
								Static328.method5395(local855);
								if (local855.anInt1825 == 0) {
									Static124.method3067(false, local855);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean156 = anIntArray214[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static66.method1243(anIntArray214[local1]);
							} else {
								local855 = local714 ? aClass72_9 : aClass72_10;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt1841 = anIntArray214[local1];
								if (local855.anInt1841 > local855.anInt1844 - local855.anInt1829) {
									local855.anInt1841 = local855.anInt1844 - local855.anInt1829;
								}
								if (local855.anInt1841 < 0) {
									local855.anInt1841 = 0;
								}
								local855.anInt1864 = anIntArray214[local1 + 1];
								if (local855.anInt1864 > local855.anInt1795 - local855.anInt1806) {
									local855.anInt1864 = local855.anInt1795 - local855.anInt1806;
								}
								if (local855.anInt1864 < 0) {
									local855.anInt1864 = 0;
								}
								Static238.method4097(local855);
								if (local855.anInt1849 == -1) {
									Static302.method5118(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt1862 = anIntArray214[local1];
								Static238.method4097(local855);
								if (local855.anInt1849 == -1) {
									Static306.method5193(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean160 = anIntArray214[local1] == 1;
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt1847 = anIntArray214[local1];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt1880 = anIntArray214[local1];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray214[local1];
								if (local855.anInt1882 != local541) {
									local855.anInt1882 = local541;
									Static238.method4097(local855);
								}
								if (local855.anInt1849 == -1) {
									Static296.method5023(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt1837 = anIntArray214[local1];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean146 = anIntArray214[local1] == 1;
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt1794 = 1;
								local1--;
								local855.anInt1879 = anIntArray214[local1];
								Static238.method4097(local855);
								if (local855.anInt1849 == -1) {
									Static32.method3142(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt1852 = anIntArray214[local1];
								local855.anInt1797 = anIntArray214[local1 + 1];
								local855.anInt1817 = anIntArray214[local1 + 2];
								local855.anInt1867 = anIntArray214[local1 + 3];
								local855.anInt1857 = anIntArray214[local1 + 4];
								local855.anInt1878 = anIntArray214[local1 + 5];
								Static238.method4097(local855);
								if (local855.anInt1849 == -1) {
									Static276.method4775(local855.anInt1830);
									Static167.method3162(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray214[local1];
								if (local855.anInt1836 != local541) {
									local855.anInt1836 = local541;
									local855.anInt1808 = 0;
									local855.anInt1821 = 1;
									local855.anInt1832 = 0;
									Static238.method4097(local855);
								}
								if (local855.anInt1849 == -1) {
									Static3.method27(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean162 = anIntArray214[local1] == 1;
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray19[local3];
								if (!local1699.equals(local855.aString61)) {
									local855.aString61 = local1699;
									Static238.method4097(local855);
								}
								if (local855.anInt1849 == -1) {
									Static255.method4359(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt1800 = anIntArray214[local1];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt1859 = anIntArray214[local1];
								local855.anInt1873 = anIntArray214[local1 + 1];
								local855.anInt1819 = anIntArray214[local1 + 2];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean154 = anIntArray214[local1] == 1;
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt1842 = anIntArray214[local1];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt1872 = anIntArray214[local1];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean152 = anIntArray214[local1] == 1;
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean145 = anIntArray214[local1] == 1;
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt1844 = anIntArray214[local1];
								local855.anInt1795 = anIntArray214[local1 + 1];
								Static238.method4097(local855);
								if (local855.anInt1825 == 0) {
									Static124.method3067(false, local855);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort38 = (short) anIntArray214[local1];
								local855.aShort37 = (short) anIntArray214[local1 + 1];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean147 = anIntArray214[local1] == 1;
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt1878 = anIntArray214[local1];
								Static238.method4097(local855);
								if (local855.anInt1849 == -1) {
									Static276.method4775(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray214[local1];
								local855.aBoolean150 = local541 == 1;
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt1816 = anIntArray214[local1];
								local855.anInt1850 = anIntArray214[local1 + 1];
								Static238.method4097(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static66.method1243(anIntArray214[local1]);
							} else {
								local855 = local714 ? aClass72_9 : aClass72_10;
							}
							Static238.method4097(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray214[local1];
								local740 = anIntArray214[local1 + 1];
								if (local855.anInt1849 == -1) {
									Static152.method2933(local855.anInt1830);
									Static276.method4775(local855.anInt1830);
									Static167.method3162(local855.anInt1830);
								}
								if (local541 == -1) {
									local855.anInt1794 = 1;
									local855.anInt1879 = -1;
									local855.lb = -1;
									continue;
								}
								local855.lb = local541;
								local855.anInt1807 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local855.aBoolean151 = true;
								} else {
									local855.aBoolean151 = false;
								}
								@Pc(2081) Class142 local2081 = Static247.method4270(local541);
								local855.anInt1817 = local2081.anInt4474;
								local855.anInt1867 = local2081.anInt4467;
								local855.anInt1857 = local2081.anInt4490;
								local855.anInt1852 = local2081.anInt4513;
								local855.anInt1797 = local2081.anInt4497;
								local855.anInt1878 = local2081.anInt4472;
								if (local31 == 1205 || local31 == 1209) {
									local855.anInt1811 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local855.anInt1811 = 1;
								} else {
									local855.anInt1811 = 2;
								}
								if (local855.anInt1889 > 0) {
									local855.anInt1878 = local855.anInt1878 * 32 / local855.anInt1889;
								} else if (local855.anInt1827 > 0) {
									local855.anInt1878 = local855.anInt1878 * 32 / local855.anInt1827;
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt1794 = 2;
								local1--;
								local855.anInt1879 = anIntArray214[local1];
								if (local855.anInt1849 == -1) {
									Static32.method3142(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt1794 = 3;
								local855.anInt1879 = -1;
								if (local855.anInt1849 == -1) {
									Static32.method3142(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt1794 = 6;
								local1--;
								local855.anInt1879 = anIntArray214[local1];
								if (local855.anInt1849 == -1) {
									Static32.method3142(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt1794 = 5;
								local1--;
								local855.anInt1879 = anIntArray214[local1];
								if (local855.anInt1849 == -1) {
									Static32.method3142(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt1865 = anIntArray214[local1];
								local855.anInt1824 = anIntArray214[local1 + 1];
								local855.anInt1877 = anIntArray214[local1 + 2];
								local855.anInt1801 = anIntArray214[local1 + 3];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt1890 = anIntArray214[local1];
								local855.anInt1875 = anIntArray214[local1 + 1];
								Static238.method4097(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.anInt1879 = anIntArray214[local1];
								local855.anInt1822 = anIntArray214[local1 + 1];
								if (anIntArray214[local1 + 2] == 1) {
									local855.anInt1794 = 9;
								} else {
									local855.anInt1794 = 8;
								}
								if (anIntArray214[local1 + 3] == 1) {
									local855.aBoolean151 = true;
								} else {
									local855.aBoolean151 = false;
								}
								if (local855.anInt1849 == -1) {
									Static32.method3142(local855.anInt1830);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt1794 = 5;
								local855.anInt1879 = 2047;
								local855.anInt1822 = 0;
								if (local855.anInt1849 == -1) {
									Static32.method3142(local855.anInt1830);
								}
								continue;
							}
						} else if ((local31 < 1300 || local31 >= 1400) && (local31 < 2300 || local31 >= 2400)) {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static66.method1243(anIntArray214[local1]);
								} else {
									local855 = local714 ? aClass72_9 : aClass72_10;
								}
								local3--;
								local1699 = aStringArray19[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray214[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray214[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray19[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray214[local1]);
									}
								}
								local1--;
								local771 = anIntArray214[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray25 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray18 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray30 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray31 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray24 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray14 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray28 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray7 = local2638;
									local855.anIntArray194 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray10 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray12 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray6 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray26 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray11 = local2638;
								} else if (local31 == 1414) {
									local855.anObjectArray21 = local2638;
									local855.anIntArray191 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray13 = local2638;
									local855.anIntArray190 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray23 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray16 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray22 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray4 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray29 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray2 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray19 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray5 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray15 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray3 = local2638;
									local855.anIntArray183 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray9 = local2638;
									local855.anIntArray185 = local2592;
								}
								local855.aBoolean158 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass72_9 : aClass72_10;
								if (local31 == 1500) {
									anIntArray214[local1++] = local855.anInt1861;
									continue;
								}
								if (local31 == 1501) {
									anIntArray214[local1++] = local855.anInt1854;
									continue;
								}
								if (local31 == 1502) {
									anIntArray214[local1++] = local855.anInt1829;
									continue;
								}
								if (local31 == 1503) {
									anIntArray214[local1++] = local855.anInt1806;
									continue;
								}
								if (local31 == 1504) {
									anIntArray214[local1++] = local855.aBoolean148 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray214[local1++] = local855.anInt1813;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass72_9 : aClass72_10;
								if (local31 == 1600) {
									anIntArray214[local1++] = local855.anInt1841;
									continue;
								}
								if (local31 == 1601) {
									anIntArray214[local1++] = local855.anInt1864;
									continue;
								}
								if (local31 == 1602) {
									aStringArray19[local3++] = local855.aString61;
									continue;
								}
								if (local31 == 1603) {
									anIntArray214[local1++] = local855.anInt1844;
									continue;
								}
								if (local31 == 1604) {
									anIntArray214[local1++] = local855.anInt1795;
									continue;
								}
								if (local31 == 1605) {
									anIntArray214[local1++] = local855.anInt1878;
									continue;
								}
								if (local31 == 1606) {
									anIntArray214[local1++] = local855.anInt1817;
									continue;
								}
								if (local31 == 1607) {
									anIntArray214[local1++] = local855.anInt1857;
									continue;
								}
								if (local31 == 1608) {
									anIntArray214[local1++] = local855.anInt1867;
									continue;
								}
								if (local31 == 1609) {
									anIntArray214[local1++] = local855.anInt1847;
									continue;
								}
								if (local31 == 1610) {
									anIntArray214[local1++] = local855.anInt1852;
									continue;
								}
								if (local31 == 1611) {
									anIntArray214[local1++] = local855.anInt1797;
									continue;
								}
								if (local31 == 1612) {
									anIntArray214[local1++] = local855.anInt1882;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass72_9 : aClass72_10;
								if (local31 == 1700) {
									anIntArray214[local1++] = local855.lb;
									continue;
								}
								if (local31 == 1701) {
									if (local855.lb == -1) {
										anIntArray214[local1++] = 0;
									} else {
										anIntArray214[local1++] = local855.anInt1807;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray214[local1++] = local855.anInt1849;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass72_9 : aClass72_10;
								if (local31 == 1800) {
									anIntArray214[local1++] = Static46.method876(local855).method261();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray214[local1];
									local541--;
									if (local855.aStringArray17 != null && local541 < local855.aStringArray17.length && local855.aStringArray17[local541] != null) {
										aStringArray19[local3++] = local855.aStringArray17[local541];
										continue;
									}
									aStringArray19[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString59 == null) {
										aStringArray19[local3++] = "";
									} else {
										aStringArray19[local3++] = local855.aString59;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static66.method1243(anIntArray214[local1]);
								if (local31 == 2500) {
									anIntArray214[local1++] = local855.anInt1861;
									continue;
								}
								if (local31 == 2501) {
									anIntArray214[local1++] = local855.anInt1854;
									continue;
								}
								if (local31 == 2502) {
									anIntArray214[local1++] = local855.anInt1829;
									continue;
								}
								if (local31 == 2503) {
									anIntArray214[local1++] = local855.anInt1806;
									continue;
								}
								if (local31 == 2504) {
									anIntArray214[local1++] = local855.aBoolean148 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray214[local1++] = local855.anInt1813;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static66.method1243(anIntArray214[local1]);
								if (local31 == 2600) {
									anIntArray214[local1++] = local855.anInt1841;
									continue;
								}
								if (local31 == 2601) {
									anIntArray214[local1++] = local855.anInt1864;
									continue;
								}
								if (local31 == 2602) {
									aStringArray19[local3++] = local855.aString61;
									continue;
								}
								if (local31 == 2603) {
									anIntArray214[local1++] = local855.anInt1844;
									continue;
								}
								if (local31 == 2604) {
									anIntArray214[local1++] = local855.anInt1795;
									continue;
								}
								if (local31 == 2605) {
									anIntArray214[local1++] = local855.anInt1878;
									continue;
								}
								if (local31 == 2606) {
									anIntArray214[local1++] = local855.anInt1817;
									continue;
								}
								if (local31 == 2607) {
									anIntArray214[local1++] = local855.anInt1857;
									continue;
								}
								if (local31 == 2608) {
									anIntArray214[local1++] = local855.anInt1867;
									continue;
								}
								if (local31 == 2609) {
									anIntArray214[local1++] = local855.anInt1847;
									continue;
								}
								if (local31 == 2610) {
									anIntArray214[local1++] = local855.anInt1852;
									continue;
								}
								if (local31 == 2611) {
									anIntArray214[local1++] = local855.anInt1797;
									continue;
								}
								if (local31 == 2612) {
									anIntArray214[local1++] = local855.anInt1882;
									continue;
								}
							} else {
								@Pc(3610) Class4_Sub8 local3610;
								@Pc(3526) Class4_Sub8 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static66.method1243(anIntArray214[local1]);
										anIntArray214[local1++] = local855.lb;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static66.method1243(anIntArray214[local1]);
										if (local855.lb == -1) {
											anIntArray214[local1++] = 0;
										} else {
											anIntArray214[local1++] = local855.anInt1807;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray214[local1];
										local3526 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local536);
										if (local3526 == null) {
											anIntArray214[local1++] = 0;
										} else {
											anIntArray214[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static66.method1243(anIntArray214[local1]);
										if (local855.aClass72Array1 == null) {
											anIntArray214[local1++] = 0;
											continue;
										}
										local541 = local855.aClass72Array1.length;
										for (local740 = 0; local740 < local855.aClass72Array1.length; local740++) {
											if (local855.aClass72Array1[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray214[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local3610 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local536);
										if (local3610 != null && local3610.anInt1670 == local541) {
											anIntArray214[local1++] = 1;
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static66.method1243(anIntArray214[local1]);
									if (local31 == 2800) {
										anIntArray214[local1++] = Static46.method876(local855).method261();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray214[local1];
										local541--;
										if (local855.aStringArray17 != null && local541 < local855.aStringArray17.length && local855.aStringArray17[local541] != null) {
											aStringArray19[local3++] = local855.aStringArray17[local541];
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString59 == null) {
											aStringArray19[local3++] = "";
										} else {
											aStringArray19[local3++] = local855.aString59;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray19[local3];
										Static159.method3073(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static241.method4164(Static110.aClass2_Sub2_Sub1_Sub1_1, anIntArray214[local1], anIntArray214[local1 + 1]);
										continue;
									}
									if (local31 == 3103) {
										Static281.method4829(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray19[local3];
										local541 = 0;
										if (Static203.method3608(local348)) {
											local541 = Static120.method2435(local348);
										}
										Static320.aClass4_Sub7_Sub1_3.method1237(107);
										Static320.aClass4_Sub7_Sub1_3.method2387(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray19[local3];
										Static320.aClass4_Sub7_Sub1_3.method1237(140);
										Static320.aClass4_Sub7_Sub1_3.method2416(local348.length() + 1);
										Static320.aClass4_Sub7_Sub1_3.method2373(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray19[local3];
										Static320.aClass4_Sub7_Sub1_3.method1237(103);
										Static320.aClass4_Sub7_Sub1_3.method2416(local348.length() + 1);
										Static320.aClass4_Sub7_Sub1_3.method2373(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray214[local1];
										local3--;
										local1699 = aStringArray19[local3];
										Static54.method996(local1699, local536);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local740 = anIntArray214[local1 + 2];
										local750 = Static66.method1243(local740);
										Static333.method73(local536, local750, local541);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local922 = local714 ? aClass72_9 : aClass72_10;
										Static333.method73(local536, local922, local541);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray214[local1];
										Static320.aClass4_Sub7_Sub1_3.method1237(156);
										Static320.aClass4_Sub7_Sub1_3.method2376(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local3610 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local536);
										if (local3610 != null) {
											Static137.method2730(true, local3610, local3610.anInt1670 != local541);
										}
										Static232.method3954(local541, true, 3, local536);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray214[local1];
										local3526 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local536);
										if (local3526 != null && local3526.anInt1671 == 3) {
											Static137.method2730(true, local3526, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static280.method4789(anIntArray214[local1], anIntArray214[local1 + 2], 255, anIntArray214[local1 + 1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static199.method5393(anIntArray214[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static206.method3640(255, anIntArray214[local1], anIntArray214[local1 + 1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray214[local1++] = Static342.anInt6706;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = Static90.method1610(local541, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = Static151.method2906(local541, local536);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = Static325.method5350(local541, local536);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static223.method3818(local536).anInt5604;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static284.anIntArray464[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static248.anIntArray425[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static16.anIntArray50[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static279.anInt5645;
										local541 = (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7) + Static10.anInt231;
										local740 = (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7) + Static81.anInt1732;
										anIntArray214[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray214[local1++] = Static197.aBoolean352 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray214[local1] + 32768;
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = Static90.method1610(local541, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray214[local1] + 32768;
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = Static151.method2906(local541, local536);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray214[local1] + 32768;
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = Static325.method5350(local541, local536);
										continue;
									}
									if (local31 == 3316) {
										if (Static98.anInt6644 >= 2) {
											anIntArray214[local1++] = Static98.anInt6644;
										} else {
											anIntArray214[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray214[local1++] = Static296.anInt5970;
										continue;
									}
									if (local31 == 3318) {
										anIntArray214[local1++] = Static320.anInt6328;
										continue;
									}
									if (local31 == 3321) {
										anIntArray214[local1++] = Static107.anInt6870;
										continue;
									}
									if (local31 == 3322) {
										anIntArray214[local1++] = Static85.anInt1869;
										continue;
									}
									if (local31 == 3323) {
										if (Static336.anInt6659 >= 5 && Static336.anInt6659 <= 9) {
											anIntArray214[local1++] = 1;
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static336.anInt6659 >= 5 && Static336.anInt6659 <= 9) {
											anIntArray214[local1++] = Static336.anInt6659;
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray214[local1++] = Static282.aBoolean504 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray214[local1++] = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727;
										continue;
									}
									if (local31 == 3327) {
										anIntArray214[local1++] = Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4.aBoolean404 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray214[local1++] = Static289.aBoolean516 && !Static248.aBoolean439 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray214[local1++] = Static337.aBoolean514 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static138.method2737(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = Static91.method1634(local541, false, local536);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = Static91.method1634(local541, true, local536);
										continue;
									}
									if (local31 == 3333) {
										anIntArray214[local1++] = Static114.anInt2467;
										continue;
									}
									if (local31 == 3335) {
										anIntArray214[local1++] = Static253.anInt5246;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local740 = anIntArray214[local1 + 2];
										local391 = anIntArray214[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray214[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray214[local1++] = Static145.anInt3255;
										continue;
									}
									if (local31 == 3338) {
										anIntArray214[local1++] = Static27.method478();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class4_Sub1_Sub17 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local4695 = Static257.method4394(local536);
										aStringArray19[local3++] = local4695.method4084(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local740 = anIntArray214[local1 + 2];
										local391 = anIntArray214[local1 + 3];
										@Pc(4734) Class4_Sub1_Sub17 local4734 = Static257.method4394(local740);
										if (local4734.aChar3 == local536 && local4734.aChar2 == local541) {
											if (local541 == 115) {
												aStringArray19[local3++] = local4734.method4084(local391);
											} else {
												anIntArray214[local1++] = local4734.method4087(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local740 = anIntArray214[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class4_Sub1_Sub17 local4800 = Static257.method4394(local541);
										if (local4800.aChar2 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray214[local1++] = local4800.method4091(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray214[local1];
										local3--;
										local1699 = aStringArray19[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static257.method4394(local536);
										if (local4695.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray214[local1++] = local4695.method4093(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray214[local1];
										@Pc(4881) Class4_Sub1_Sub17 local4881 = Static257.method4394(local536);
										anIntArray214[local1++] = local4881.aClass198_27.method5264();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static104.anInt6825 == 0) {
											anIntArray214[local1++] = -2;
										} else if (Static104.anInt6825 == 1) {
											anIntArray214[local1++] = -1;
										} else {
											anIntArray214[local1++] = Static164.anInt3686;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static104.anInt6825 == 2 && local536 < Static164.anInt3686) {
											aStringArray19[local3++] = Static284.aStringArray41[local536];
											if (Static116.aStringArray6[local536] == null) {
												aStringArray19[local3++] = "";
											} else {
												aStringArray19[local3++] = Static116.aStringArray6[local536];
											}
											continue;
										}
										aStringArray19[local3++] = "";
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static104.anInt6825 == 2 && local536 < Static164.anInt3686) {
											anIntArray214[local1++] = Static218.anIntArray376[local536];
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static104.anInt6825 == 2 && local536 < Static164.anInt3686) {
											anIntArray214[local1++] = Static16.anIntArray49[local536];
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray19[local3];
										local1--;
										local541 = anIntArray214[local1];
										Static183.method3402(local348, local541);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray19[local3];
										Static258.method4400(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray19[local3];
										Static119.method2120(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray19[local3];
										Static347.method5631(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray19[local3];
										Static33.method526(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray19[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray214[local1++] = Static33.method524(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static104.anInt6825 == 2 && local536 < Static164.anInt3686) {
											aStringArray19[local3++] = Static167.aStringArray28[local536];
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static225.aString172 == null) {
											aStringArray19[local3++] = "";
										} else {
											aStringArray19[local3++] = Static281.method4831(Static225.aString172);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static225.aString172 == null) {
											anIntArray214[local1++] = 0;
										} else {
											anIntArray214[local1++] = Static230.anInt4799;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static225.aString172 != null && local536 < Static230.anInt4799) {
											aStringArray19[local3++] = Static297.aClass219Array1[local536].aString259;
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static225.aString172 != null && local536 < Static230.anInt4799) {
											anIntArray214[local1++] = Static297.aClass219Array1[local536].anInt6807;
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static225.aString172 != null && local536 < Static230.anInt4799) {
											anIntArray214[local1++] = Static297.aClass219Array1[local536].aByte75;
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray214[local1++] = Static321.aByte71;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray19[local3];
										Static265.method4627(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray214[local1++] = Static243.aByte65;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray19[local3];
										Static277.method4778(local348);
										continue;
									}
									if (local31 == 3620) {
										Static256.method4368();
										continue;
									}
									if (local31 == 3621) {
										if (Static104.anInt6825 == 0) {
											anIntArray214[local1++] = -1;
										} else {
											anIntArray214[local1++] = Static173.anInt3827;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static104.anInt6825 != 0 && local536 < Static173.anInt3827) {
											aStringArray19[local3++] = Static202.aStringArray33[local536];
											if (Static80.aStringArray16[local536] == null) {
												aStringArray19[local3++] = "";
											} else {
												aStringArray19[local3++] = Static80.aStringArray16[local536];
											}
											continue;
										}
										aStringArray19[local3++] = "";
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray19[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray214[local1++] = Static83.method1465(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static297.aClass219Array1 != null && local536 < Static230.anInt4799 && Static297.aClass219Array1[local536].aString257.equalsIgnoreCase(Static110.aClass2_Sub2_Sub1_Sub1_1.aString22)) {
											anIntArray214[local1++] = 1;
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static292.aString222 == null) {
											aStringArray19[local3++] = "";
										} else {
											aStringArray19[local3++] = Static292.aString222;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static225.aString172 != null && local536 < Static230.anInt4799) {
											aStringArray19[local3++] = Static297.aClass219Array1[local536].aString258;
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static104.anInt6825 == 2 && local536 >= 0 && local536 < Static164.anInt3686) {
											anIntArray214[local1++] = Static213.aBooleanArray22[local536] ? 1 : 0;
											continue;
										}
										anIntArray214[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray19[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray214[local1++] = Static351.method5649(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray214[local1++] = Static10.anInt205;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray19[local3];
										Static347.method5631(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static41.aBooleanArray6[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static225.aString172 != null && local536 < Static230.anInt4799) {
											aStringArray19[local3++] = Static297.aClass219Array1[local536].aString257;
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray214[local1];
										if (Static104.anInt6825 != 0 && local536 < Static173.anInt3827) {
											aStringArray19[local3++] = Static36.aStringArray3[local536];
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static349.aClass190Array1[local536].method4978();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static349.aClass190Array1[local536].anInt5922;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static349.aClass190Array1[local536].anInt5919;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static349.aClass190Array1[local536].anInt5921;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static349.aClass190Array1[local536].anInt5916;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = Static349.aClass190Array1[local536].anInt5917;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray214[local1];
										local541 = Static349.aClass190Array1[local536].method4979();
										anIntArray214[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray214[local1];
										local541 = Static349.aClass190Array1[local536].method4979();
										anIntArray214[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray214[local1];
										local541 = Static349.aClass190Array1[local536].method4979();
										anIntArray214[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray214[local1];
										local541 = Static349.aClass190Array1[local536].method4979();
										anIntArray214[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray214[local1];
										anIntArray214[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										local740 = anIntArray214[local1 + 2];
										local391 = anIntArray214[local1 + 3];
										local410 = anIntArray214[local1 + 4];
										anIntArray214[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray214[local1];
										local6055 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										if (local536 == 0) {
											anIntArray214[local1++] = 0;
										} else {
											anIntArray214[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										if (local536 == 0) {
											anIntArray214[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray214[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray214[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray214[local1];
										local541 = anIntArray214[local1 + 1];
										anIntArray214[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray214[local1];
										local6055 = anIntArray214[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray214[local1 + 2];
										anIntArray214[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray19[local3];
											local1--;
											local541 = anIntArray214[local1];
											aStringArray19[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray19[local3];
											local1699 = aStringArray19[local3 + 1];
											aStringArray19[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray19[local3];
											local1--;
											local541 = anIntArray214[local1];
											aStringArray19[local3++] = local348 + Static17.method355(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray19[local3];
											aStringArray19[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray214[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6487));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray19[local3++] = local391 + "-" + aStringArray21[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray19[local3];
											local1699 = aStringArray19[local3 + 1];
											if (Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4 != null && Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4.aBoolean404) {
												aStringArray19[local3++] = local1699;
												continue;
											}
											aStringArray19[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray214[local1];
											aStringArray19[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray214[local1++] = Static204.method3618(aStringArray19[local3 + 1], Static253.anInt5246, aStringArray19[local3]);
											continue;
										}
										@Pc(6619) Class106 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray19[local3];
											local1 -= 2;
											local541 = anIntArray214[local1];
											local740 = anIntArray214[local1 + 1];
											local6619 = Static191.method3463(Static58.aClass11_24, local740);
											anIntArray214[local1++] = local6619.method2876(local541, local348, Static164.aClass60Array7);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray19[local3];
											local1 -= 2;
											local541 = anIntArray214[local1];
											local740 = anIntArray214[local1 + 1];
											local6619 = Static191.method3463(Static58.aClass11_24, local740);
											anIntArray214[local1++] = local6619.method2882(local541, Static164.aClass60Array7, local348);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray19[local3];
											local1699 = aStringArray19[local3 + 1];
											local1--;
											if (anIntArray214[local1] == 1) {
												aStringArray19[local3++] = local348;
											} else {
												aStringArray19[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray19[local3];
											aStringArray19[local3++] = Static150.method5471(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray19[local3];
											local1--;
											local541 = anIntArray214[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray19[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray214[local1];
											anIntArray214[local1++] = Static332.method5466((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray214[local1];
											anIntArray214[local1++] = Static276.method4776((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray214[local1];
											anIntArray214[local1++] = Static251.method4340((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray214[local1];
											anIntArray214[local1++] = Static49.method921((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray19[local3];
											if (local348 == null) {
												anIntArray214[local1++] = 0;
											} else {
												anIntArray214[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray19[local3];
											local1 -= 2;
											local541 = anIntArray214[local1];
											local740 = anIntArray214[local1 + 1];
											aStringArray19[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray19[local3];
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
											aStringArray19[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray19[local3];
											local1 -= 2;
											local541 = anIntArray214[local1];
											local740 = anIntArray214[local1 + 1];
											anIntArray214[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray19[local3];
											local1699 = aStringArray19[local3 + 1];
											local1--;
											local740 = anIntArray214[local1];
											anIntArray214[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray214[local1];
											anIntArray214[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray214[local1];
											anIntArray214[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray214[local1] != 0;
											local1--;
											local541 = anIntArray214[local1];
											aStringArray19[local3++] = Static93.method1642(local1070, (long) local541, Static253.anInt5246, 0);
											continue;
										}
									} else {
										@Pc(7311) Class4_Sub1_Sub21 local7311;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray214[local1];
												aStringArray19[local3++] = Static247.method4270(local536).aString165;
												continue;
											}
											@Pc(7092) Class142 local7092;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												local7092 = Static247.method4270(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray36[local541 - 1] != null) {
													aStringArray19[local3++] = local7092.aStringArray36[local541 - 1];
													continue;
												}
												aStringArray19[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												local7092 = Static247.method4270(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray37[local541 - 1] != null) {
													aStringArray19[local3++] = local7092.aStringArray37[local541 - 1];
													continue;
												}
												aStringArray19[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray214[local1];
												anIntArray214[local1++] = Static247.method4270(local536).anInt4515;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray214[local1];
												anIntArray214[local1++] = Static247.method4270(local536).anInt4459 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7221) Class142 local7221;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray214[local1];
												local7221 = Static247.method4270(local536);
												if (local7221.anInt4468 == -1 && local7221.anInt4464 >= 0) {
													anIntArray214[local1++] = local7221.anInt4464;
													continue;
												}
												anIntArray214[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray214[local1];
												local7221 = Static247.method4270(local536);
												if (local7221.anInt4468 >= 0 && local7221.anInt4464 >= 0) {
													anIntArray214[local1++] = local7221.anInt4464;
													continue;
												}
												anIntArray214[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray214[local1];
												anIntArray214[local1++] = Static247.method4270(local536).aBoolean380 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												local7311 = Static98.method5502(local541);
												if (local7311.method5561()) {
													aStringArray19[local3++] = Static247.method4270(local536).method3724(local541, local7311.aString247);
												} else {
													anIntArray214[local1++] = Static247.method4270(local536).method3729(local7311.anInt6695, local541);
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray19[local3];
												local1--;
												local541 = anIntArray214[local1];
												Static247.method4276(local541 == 1, local348);
												anIntArray214[local1++] = Static120.anInt2709;
												continue;
											}
											if (local31 == 4211) {
												if (Static162.aShortArray57 != null && Static270.anInt6610 < Static120.anInt2709) {
													anIntArray214[local1++] = Static162.aShortArray57[Static270.anInt6610++] & 0xFFFF;
													continue;
												}
												anIntArray214[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static270.anInt6610 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												local7311 = Static98.method5502(local541);
												if (local7311.method5561()) {
													aStringArray19[local3++] = Static165.method2927(local536).method738(local7311.aString247, local541);
												} else {
													anIntArray214[local1++] = Static165.method2927(local536).method747(local541, local7311.anInt6695);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												local7311 = Static98.method5502(local541);
												if (local7311.method5561()) {
													aStringArray19[local3++] = Static320.method5290(local536).method1079(local7311.aString247, local541);
												} else {
													anIntArray214[local1++] = Static320.method5290(local536).method1085(local7311.anInt6695, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												local7311 = Static98.method5502(local541);
												if (local7311.method5561()) {
													aStringArray19[local3++] = Static315.method1383(local536).method3636(local541, local7311.aString247);
												} else {
													anIntArray214[local1++] = Static315.method1383(local536).method3634(local7311.anInt6695, local541);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray214[local1];
												anIntArray214[local1++] = Static354.method4067(local536).anInt245;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray214[local1++] = Static159.anInt3589;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static159.anInt3589 = anIntArray214[local1];
												Static292.anInt5918 = anIntArray214[local1 + 1];
												Static55.anInt1214 = anIntArray214[local1 + 2];
												Static320.aClass4_Sub7_Sub1_3.method1237(175);
												Static320.aClass4_Sub7_Sub1_3.method2416(Static159.anInt3589);
												Static320.aClass4_Sub7_Sub1_3.method2416(Static292.anInt5918);
												Static320.aClass4_Sub7_Sub1_3.method2416(Static55.anInt1214);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray19[local3];
												local1 -= 2;
												local541 = anIntArray214[local1];
												local740 = anIntArray214[local1 + 1];
												Static320.aClass4_Sub7_Sub1_3.method1237(36);
												Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(local348) + 2);
												Static320.aClass4_Sub7_Sub1_3.method2373(local348);
												Static320.aClass4_Sub7_Sub1_3.method2416(local541 - 1);
												Static320.aClass4_Sub7_Sub1_3.method2416(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray214[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static219.aStringArray39[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray19[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray214[local1];
												local541 = -1;
												if (local536 < 100 && Static219.aStringArray39[local536] != null) {
													local541 = Static18.anIntArray52[local536];
												}
												anIntArray214[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray214[local1++] = Static292.anInt5918;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray19[local3];
												if (Static98.anInt6644 == 0 && (Static289.aBoolean516 && !Static248.aBoolean439 || Static337.aBoolean514)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7764) byte local7764 = 0;
												if (local1699.startsWith(Static337.aString217)) {
													local7764 = 0;
													local348 = local348.substring(Static337.aString217.length());
												} else if (local1699.startsWith(Static304.aString230)) {
													local7764 = 1;
													local348 = local348.substring(Static304.aString230.length());
												} else if (local1699.startsWith(Static132.aString99)) {
													local7764 = 2;
													local348 = local348.substring(Static132.aString99.length());
												} else if (local1699.startsWith(Static191.aString140)) {
													local7764 = 3;
													local348 = local348.substring(Static191.aString140.length());
												} else if (local1699.startsWith(Static139.aString108)) {
													local7764 = 4;
													local348 = local348.substring(Static139.aString108.length());
												} else if (local1699.startsWith(Static301.aString227)) {
													local7764 = 5;
													local348 = local348.substring(Static301.aString227.length());
												} else if (local1699.startsWith(Static211.aString161)) {
													local7764 = 6;
													local348 = local348.substring(Static211.aString161.length());
												} else if (local1699.startsWith(Static312.aString87)) {
													local7764 = 7;
													local348 = local348.substring(Static312.aString87.length());
												} else if (local1699.startsWith(Static349.aString253)) {
													local7764 = 8;
													local348 = local348.substring(Static349.aString253.length());
												} else if (local1699.startsWith(Static27.aString16)) {
													local7764 = 9;
													local348 = local348.substring(Static27.aString16.length());
												} else if (local1699.startsWith(Static350.aString255)) {
													local7764 = 10;
													local348 = local348.substring(Static350.aString255.length());
												} else if (local1699.startsWith(Static197.aString149)) {
													local7764 = 11;
													local348 = local348.substring(Static197.aString149.length());
												} else if (Static253.anInt5246 != 0) {
													if (local1699.startsWith(Static340.aString248)) {
														local7764 = 0;
														local348 = local348.substring(Static340.aString248.length());
													} else if (local1699.startsWith(Static98.aString246)) {
														local7764 = 1;
														local348 = local348.substring(Static98.aString246.length());
													} else if (local1699.startsWith(Static275.aString205)) {
														local7764 = 2;
														local348 = local348.substring(Static275.aString205.length());
													} else if (local1699.startsWith(Static143.aString110)) {
														local7764 = 3;
														local348 = local348.substring(Static143.aString110.length());
													} else if (local1699.startsWith(Static112.aString82)) {
														local7764 = 4;
														local348 = local348.substring(Static112.aString82.length());
													} else if (local1699.startsWith(Static316.aString198)) {
														local7764 = 5;
														local348 = local348.substring(Static316.aString198.length());
													} else if (local1699.startsWith(Static14.aString9)) {
														local7764 = 6;
														local348 = local348.substring(Static14.aString9.length());
													} else if (local1699.startsWith(Static312.aString88)) {
														local7764 = 7;
														local348 = local348.substring(Static312.aString88.length());
													} else if (local1699.startsWith(Static41.aString30)) {
														local7764 = 8;
														local348 = local348.substring(Static41.aString30.length());
													} else if (local1699.startsWith(Static350.aString256)) {
														local7764 = 9;
														local348 = local348.substring(Static350.aString256.length());
													} else if (local1699.startsWith(Static349.aString254)) {
														local7764 = 10;
														local348 = local348.substring(Static349.aString254.length());
													} else if (local1699.startsWith(Static182.aString137)) {
														local7764 = 11;
														local348 = local348.substring(Static182.aString137.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8058) byte local8058 = 0;
												if (local1699.startsWith(Static90.aString68)) {
													local8058 = 1;
													local348 = local348.substring(Static90.aString68.length());
												} else if (local1699.startsWith(Static28.aString224)) {
													local8058 = 2;
													local348 = local348.substring(Static28.aString224.length());
												} else if (local1699.startsWith(Static266.aString196)) {
													local8058 = 3;
													local348 = local348.substring(Static266.aString196.length());
												} else if (local1699.startsWith(Static204.aString152)) {
													local8058 = 4;
													local348 = local348.substring(Static204.aString152.length());
												} else if (local1699.startsWith(Static206.aString153)) {
													local8058 = 5;
													local348 = local348.substring(Static206.aString153.length());
												} else if (Static253.anInt5246 != 0) {
													if (local1699.startsWith(Static287.aString218)) {
														local8058 = 1;
														local348 = local348.substring(Static287.aString218.length());
													} else if (local1699.startsWith(Static27.aString14)) {
														local8058 = 2;
														local348 = local348.substring(Static27.aString14.length());
													} else if (local1699.startsWith(Static318.aString237)) {
														local8058 = 3;
														local348 = local348.substring(Static318.aString237.length());
													} else if (local1699.startsWith(Static121.aString89)) {
														local8058 = 4;
														local348 = local348.substring(Static121.aString89.length());
													} else if (local1699.startsWith(Static355.aString261)) {
														local8058 = 5;
														local348 = local348.substring(Static355.aString261.length());
													}
												}
												Static320.aClass4_Sub7_Sub1_3.method1237(192);
												Static320.aClass4_Sub7_Sub1_3.method2416(0);
												local410 = Static320.aClass4_Sub7_Sub1_3.anInt2667;
												Static320.aClass4_Sub7_Sub1_3.method2416(local7764);
												Static320.aClass4_Sub7_Sub1_3.method2416(local8058);
												Static123.method2467(local348, Static320.aClass4_Sub7_Sub1_3);
												Static320.aClass4_Sub7_Sub1_3.method2392(Static320.aClass4_Sub7_Sub1_3.anInt2667 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray19[local3];
												local1699 = aStringArray19[local3 + 1];
												if (Static98.anInt6644 != 0 || (!Static289.aBoolean516 || Static248.aBoolean439) && !Static337.aBoolean514) {
													Static320.aClass4_Sub7_Sub1_3.method1237(43);
													Static320.aClass4_Sub7_Sub1_3.method2416(0);
													local740 = Static320.aClass4_Sub7_Sub1_3.anInt2667;
													Static320.aClass4_Sub7_Sub1_3.method2373(local348);
													Static123.method2467(local1699, Static320.aClass4_Sub7_Sub1_3);
													Static320.aClass4_Sub7_Sub1_3.method2392(Static320.aClass4_Sub7_Sub1_3.anInt2667 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray214[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static79.aStringArray15[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray19[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray214[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static197.aStringArray32[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray19[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray214[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static234.anIntArray392[local536];
												}
												anIntArray214[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static110.aClass2_Sub2_Sub1_Sub1_1 == null || Static110.aClass2_Sub2_Sub1_Sub1_1.aString23 == null) {
													local348 = Static131.aString96;
												} else {
													local348 = Static110.aClass2_Sub2_Sub1_Sub1_1.method652();
												}
												aStringArray19[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray214[local1++] = Static55.anInt1214;
												continue;
											}
											if (local31 == 5017) {
												anIntArray214[local1++] = Static29.anInt466;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray214[local1];
												local541 = 0;
												if (local536 < 100 && Static219.aStringArray39[local536] != null) {
													local541 = Static18.anIntArray52[local536];
												}
												anIntArray214[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray214[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static169.aStringArray29[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray19[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static110.aClass2_Sub2_Sub1_Sub1_1 == null || Static110.aClass2_Sub2_Sub1_Sub1_1.aString23 == null) {
													local348 = Static131.aString96;
												} else {
													local348 = Static110.aClass2_Sub2_Sub1_Sub1_1.method656();
												}
												aStringArray19[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray214[local1];
												aStringArray19[local3++] = Static71.method1357(local536).aString86;
												continue;
											}
											@Pc(8492) Class4_Sub1_Sub9 local8492;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray214[local1];
												local8492 = Static71.method1357(local536);
												if (local8492.anIntArray246 == null) {
													anIntArray214[local1++] = 0;
												} else {
													anIntArray214[local1++] = local8492.anIntArray246.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												@Pc(8527) Class4_Sub1_Sub9 local8527 = Static71.method1357(local536);
												local391 = local8527.anIntArray246[local541];
												anIntArray214[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray214[local1];
												local8492 = Static71.method1357(local536);
												if (local8492.anIntArray247 == null) {
													anIntArray214[local1++] = 0;
												} else {
													anIntArray214[local1++] = local8492.anIntArray247.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												anIntArray214[local1++] = Static71.method1357(local536).anIntArray247[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray214[local1];
												aStringArray19[local3++] = Static210.method4725(local536).method2619();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray214[local1];
												@Pc(8622) Class4_Sub1_Sub10 local8622 = Static210.method4725(local536);
												if (local8622.anIntArray271 == null) {
													anIntArray214[local1++] = 0;
												} else {
													anIntArray214[local1++] = local8622.anIntArray271.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												anIntArray214[local1++] = Static210.method4725(local536).anIntArray271[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass179_1 = new Class179();
												local1--;
												aClass179_1.anInt5624 = anIntArray214[local1];
												aClass179_1.aClass4_Sub1_Sub10_1 = Static210.method4725(aClass179_1.anInt5624);
												aClass179_1.anIntArray455 = new int[aClass179_1.aClass4_Sub1_Sub10_1.method2620()];
												continue;
											}
											if (local31 == 5059) {
												Static320.aClass4_Sub7_Sub1_3.method1237(243);
												Static320.aClass4_Sub7_Sub1_3.method2416(0);
												local536 = Static320.aClass4_Sub7_Sub1_3.anInt2667;
												Static320.aClass4_Sub7_Sub1_3.method2416(0);
												Static320.aClass4_Sub7_Sub1_3.method2376(aClass179_1.anInt5624);
												aClass179_1.aClass4_Sub1_Sub10_1.method2617(aClass179_1.anIntArray455, Static320.aClass4_Sub7_Sub1_3);
												Static320.aClass4_Sub7_Sub1_3.method2392(Static320.aClass4_Sub7_Sub1_3.anInt2667 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray19[local3];
												Static320.aClass4_Sub7_Sub1_3.method1237(121);
												Static320.aClass4_Sub7_Sub1_3.method2416(0);
												local541 = Static320.aClass4_Sub7_Sub1_3.anInt2667;
												Static320.aClass4_Sub7_Sub1_3.method2373(local348);
												Static320.aClass4_Sub7_Sub1_3.method2376(aClass179_1.anInt5624);
												aClass179_1.aClass4_Sub1_Sub10_1.method2617(aClass179_1.anIntArray455, Static320.aClass4_Sub7_Sub1_3);
												Static320.aClass4_Sub7_Sub1_3.method2392(Static320.aClass4_Sub7_Sub1_3.anInt2667 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static320.aClass4_Sub7_Sub1_3.method1237(243);
												Static320.aClass4_Sub7_Sub1_3.method2416(0);
												local536 = Static320.aClass4_Sub7_Sub1_3.anInt2667;
												Static320.aClass4_Sub7_Sub1_3.method2416(1);
												Static320.aClass4_Sub7_Sub1_3.method2376(aClass179_1.anInt5624);
												aClass179_1.aClass4_Sub1_Sub10_1.method2617(aClass179_1.anIntArray455, Static320.aClass4_Sub7_Sub1_3);
												Static320.aClass4_Sub7_Sub1_3.method2392(Static320.aClass4_Sub7_Sub1_3.anInt2667 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												anIntArray214[local1++] = Static71.method1357(local536).aCharArray2[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												anIntArray214[local1++] = Static71.method1357(local536).aCharArray3[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												if (local541 == -1) {
													anIntArray214[local1++] = -1;
												} else {
													anIntArray214[local1++] = Static71.method1357(local536).method2116((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												if (local541 == -1) {
													anIntArray214[local1++] = -1;
												} else {
													anIntArray214[local1++] = Static71.method1357(local536).method2117((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray214[local1];
												anIntArray214[local1++] = Static210.method4725(local536).method2620();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												local740 = Static210.method4725(local536).method2623(local541);
												anIntArray214[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												aClass179_1.anIntArray455[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												aClass179_1.anIntArray455[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray214[local1];
												local541 = anIntArray214[local1 + 1];
												local740 = anIntArray214[local1 + 2];
												@Pc(9051) Class4_Sub1_Sub10 local9051 = Static210.method4725(local536);
												if (local9051.method2623(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray214[local1++] = local9051.method2624(local740, local541);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray19[local3];
												local1--;
												local1266 = anIntArray214[local1] == 1;
												Static27.method476(local1266, local348);
												anIntArray214[local1++] = Static120.anInt2709;
												continue;
											}
											if (local31 == 5072) {
												if (Static162.aShortArray57 != null && Static270.anInt6610 < Static120.anInt2709) {
													anIntArray214[local1++] = Static162.aShortArray57[Static270.anInt6610++] & 0xFFFF;
													continue;
												}
												anIntArray214[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static270.anInt6610 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static77.aBooleanArray13[86]) {
													anIntArray214[local1++] = 1;
												} else {
													anIntArray214[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static77.aBooleanArray13[82]) {
													anIntArray214[local1++] = 1;
												} else {
													anIntArray214[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static77.aBooleanArray13[81]) {
													anIntArray214[local1++] = 1;
												} else {
													anIntArray214[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9571) boolean local9571;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static94.method1673(anIntArray214[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray214[local1++] = Static220.method3781();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static169.method3176(anIntArray214[local1], false, -1, -1);
													continue;
												}
												@Pc(9247) Class4_Sub1_Sub11 local9247;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray214[local1];
													local9247 = Static42.method2055(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9247 == null) {
														anIntArray214[local1++] = -1;
													} else {
														anIntArray214[local1++] = local9247.anInt3052;
													}
													continue;
												}
												@Pc(9271) Class4_Sub1_Sub11 local9271;
												if (local31 == 5207) {
													local1--;
													local9271 = Static42.method2049(anIntArray214[local1]);
													if (local9271 != null && local9271.aString101 != null) {
														aStringArray19[local3++] = local9271.aString101;
														continue;
													}
													aStringArray19[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray214[local1++] = Static310.anInt6221;
													anIntArray214[local1++] = Static266.anInt5447;
													continue;
												}
												if (local31 == 5209) {
													anIntArray214[local1++] = Static307.anInt3771 + Static42.anInt2446;
													anIntArray214[local1++] = Static35.anInt732 + Static42.anInt2441;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray214[local1];
													local9247 = Static42.method2049(local536);
													if (local9247 == null) {
														anIntArray214[local1++] = 0;
														anIntArray214[local1++] = 0;
													} else {
														anIntArray214[local1++] = local9247.anInt3045 >> 14 & 0x3FFF;
														anIntArray214[local1++] = local9247.anInt3045 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray214[local1];
													local9247 = Static42.method2049(local536);
													if (local9247 == null) {
														anIntArray214[local1++] = 0;
														anIntArray214[local1++] = 0;
													} else {
														anIntArray214[local1++] = local9247.anInt3047 - local9247.anInt3048;
														anIntArray214[local1++] = local9247.anInt3053 - local9247.anInt3051;
													}
													continue;
												}
												@Pc(9413) Class4_Sub20 local9413;
												if (local31 == 5212) {
													local9413 = Static3.method30();
													if (local9413 == null) {
														anIntArray214[local1++] = -1;
														anIntArray214[local1++] = -1;
													} else {
														anIntArray214[local1++] = local9413.anInt3082;
														local541 = local9413.anInt3080 << 28 | local9413.anInt3085 + Static42.anInt2446 << 14 | local9413.anInt3079 + Static42.anInt2441;
														anIntArray214[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9413 = Static248.method4312();
													if (local9413 == null) {
														anIntArray214[local1++] = -1;
														anIntArray214[local1++] = -1;
													} else {
														anIntArray214[local1++] = local9413.anInt3082;
														local541 = local9413.anInt3080 << 28 | local9413.anInt3085 + Static42.anInt2446 << 14 | local9413.anInt3079 + Static42.anInt2441;
														anIntArray214[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray214[local1];
													local9247 = Static131.method2636();
													if (local9247 != null) {
														local6900 = local9247.method2691(anIntArray215, local536 >> 14 & 0x3FFF, local536 & 0x3FFF, local536 >> 28 & 0x3);
														if (local6900) {
															Static206.method3641(anIntArray215[2], anIntArray215[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray214[local1];
													local541 = anIntArray214[local1 + 1];
													@Pc(9569) Class178 local9569 = Static42.method2052(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9571 = false;
													for (@Pc(9576) Class4_Sub1_Sub11 local9576 = (Class4_Sub1_Sub11) local9569.method4773(); local9576 != null; local9576 = (Class4_Sub1_Sub11) local9569.method4771()) {
														if (local9576.anInt3052 == local541) {
															local9571 = true;
															break;
														}
													}
													if (local9571) {
														anIntArray214[local1++] = 1;
													} else {
														anIntArray214[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray214[local1];
													local9247 = Static42.method2049(local536);
													if (local9247 == null) {
														anIntArray214[local1++] = -1;
													} else {
														anIntArray214[local1++] = local9247.anInt3043;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray214[local1++] = Static38.anInt833 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray214[local1];
													Static206.method3641(local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9271 = Static131.method2636();
													if (local9271 == null) {
														anIntArray214[local1++] = -1;
														anIntArray214[local1++] = -1;
													} else {
														local1266 = local9271.method2689(Static307.anInt3771 + Static42.anInt2446, Static35.anInt732 + Static42.anInt2441, anIntArray215);
														if (local1266) {
															anIntArray214[local1++] = anIntArray215[1];
															anIntArray214[local1++] = anIntArray215[2];
														} else {
															anIntArray214[local1++] = -1;
															anIntArray214[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray214[local1];
													local541 = anIntArray214[local1 + 1];
													Static169.method3176(local536, false, local541 >> 14 & 0x3FFF, local541 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray214[local1];
													local9247 = Static131.method2636();
													if (local9247 == null) {
														anIntArray214[local1++] = -1;
														anIntArray214[local1++] = -1;
													} else {
														local6900 = local9247.method2691(anIntArray215, local536 >> 14 & 0x3FFF, local536 & 0x3FFF, local536 >> 28 & 0x3);
														if (local6900) {
															anIntArray214[local1++] = anIntArray215[1];
															anIntArray214[local1++] = anIntArray215[2];
														} else {
															anIntArray214[local1++] = -1;
															anIntArray214[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray214[local1];
													local9247 = Static131.method2636();
													if (local9247 == null) {
														anIntArray214[local1++] = -1;
														anIntArray214[local1++] = -1;
													} else {
														local6900 = local9247.method2689(local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray215);
														if (local6900) {
															anIntArray214[local1++] = anIntArray215[1];
															anIntArray214[local1++] = anIntArray215[2];
														} else {
															anIntArray214[local1++] = -1;
															anIntArray214[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static12.method281(anIntArray214[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray214[local1];
													local541 = anIntArray214[local1 + 1];
													Static169.method3176(local536, true, local541 >> 14 & 0x3FFF, local541 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static343.aBoolean583 = anIntArray214[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray214[local1++] = Static343.aBoolean583 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray214[local1];
													Static77.method1407(local536);
													continue;
												}
												@Pc(9987) Class4 local9987;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray214[local1];
													local1266 = anIntArray214[local1 + 1] == 1;
													if (Static103.aClass198_20 == null) {
														continue;
													}
													local9987 = Static103.aClass198_20.method5261((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5667();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class4();
														Static103.aClass198_20.method5267((long) local536, local9987);
													}
													continue;
												}
												@Pc(10026) Class4 local10026;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray214[local1];
													if (Static103.aClass198_20 == null) {
														anIntArray214[local1++] = 0;
													} else {
														local10026 = Static103.aClass198_20.method5261((long) local536);
														anIntArray214[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray214[local1];
													local1266 = anIntArray214[local1 + 1] == 1;
													if (Static51.aClass198_9 == null) {
														continue;
													}
													local9987 = Static51.aClass198_9.method5261((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5667();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class4();
														Static51.aClass198_9.method5267((long) local536, local9987);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray214[local1];
													if (Static51.aClass198_9 == null) {
														anIntArray214[local1++] = 0;
													} else {
														local10026 = Static51.aClass198_9.method5261((long) local536);
														anIntArray214[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray214[local1++] = Static42.aClass4_Sub1_Sub11_2 == null ? -1 : Static42.aClass4_Sub1_Sub11_2.anInt3052;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray214[local1];
													local541 = anIntArray214[local1 + 1];
													Static39.method732(false, local541, local536, 3);
													anIntArray214[local1++] = Static315.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static315.aFrame2 != null) {
														Static39.method732(false, -1, -1, Static56.anInt1228);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10189) Class196[] local10189 = Static232.method3959();
													anIntArray214[local1++] = local10189.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray214[local1];
													@Pc(10207) Class196[] local10207 = Static232.method3959();
													anIntArray214[local1++] = local10207[local536].anInt6206;
													anIntArray214[local1++] = local10207[local536].anInt6212;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static143.anInt3193;
													local541 = Static229.anInt4770;
													local740 = -1;
													@Pc(10236) Class196[] local10236 = Static232.method3959();
													for (local410 = 0; local410 < local10236.length; local410++) {
														@Pc(10243) Class196 local10243 = local10236[local410];
														if (local10243.anInt6206 == local536 && local10243.anInt6212 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray214[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray214[local1++] = Static11.method265();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray214[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static39.method732(false, -1, -1, local536);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray214[local1++] = Static56.anInt1228;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray214[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static56.anInt1228 = local536;
														Static290.method4960(Static212.aClass120_3);
													}
													continue;
												}
											} else {
												@Pc(10698) String local10698;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray19[local3];
														local1699 = aStringArray19[local3 + 1];
														local1--;
														local740 = anIntArray214[local1];
														Static320.aClass4_Sub7_Sub1_3.method1237(85);
														Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(local348) + Static204.method3620(local1699) + 1);
														Static320.aClass4_Sub7_Sub1_3.method2373(local348);
														Static320.aClass4_Sub7_Sub1_3.method2373(local1699);
														Static320.aClass4_Sub7_Sub1_3.method2416(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static86.aShortArray43[anIntArray214[local1]] = (short) Static339.method5545(anIntArray214[local1 + 1]);
														Static113.method5418();
														Static50.method928();
														Static171.method3212();
														Static148.method4001();
														Static240.method4159();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static45.anIntArrayArrayArray17[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1] << 1;
														local740 = anIntArray214[local1 + 2];
														local391 = anIntArray214[local1 + 3];
														local410 = anIntArray214[local1 + 4];
														local771 = anIntArray214[local1 + 5];
														@Pc(10484) int local10484 = anIntArray214[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static45.anIntArrayArrayArray17[local536] != null && local541 >= 0 && local541 < Static45.anIntArrayArrayArray17[local536].length) {
															Static45.anIntArrayArrayArray17[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10484 };
															Static45.anIntArrayArrayArray17[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static45.anIntArrayArrayArray17[anIntArray214[local1]].length >> 1;
														anIntArray214[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static315.aFrame2 != null) {
															Static39.method732(false, -1, -1, Static56.anInt1228);
														}
														if (Static350.aFrame3 == null) {
															local348 = Static107.aString260 == null ? Static319.method5288() : Static107.aString260;
															Static275.method4768(Static212.aClass120_3, Static6.anInt1971 == 1, local348, false);
														} else {
															Static188.method3431();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static183.aClass51_6 != null) {
															if (Static183.aClass51_6.anObject1 == null) {
																local348 = Static199.method5385(Static183.aClass51_6.anInt1230);
															} else {
																local348 = (String) Static183.aClass51_6.anObject1;
															}
														}
														aStringArray19[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray214[local1++] = Static172.anInt3803 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static315.aFrame2 != null) {
															Static39.method732(false, -1, -1, Static56.anInt1228);
														}
														local3--;
														local348 = aStringArray19[local3];
														local1--;
														local1266 = anIntArray214[local1] == 1;
														local10698 = Static319.method5288() + local348;
														Static275.method4768(Static212.aClass120_3, Static6.anInt1971 == 1, local10698, local1266);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray19[local3];
														local1699 = aStringArray19[local3 + 1];
														local1--;
														local740 = anIntArray214[local1];
														if (local348.length() > 0) {
															if (Static217.aStringArray38 == null) {
																Static217.aStringArray38 = new String[Static214.anIntArray371[Static269.anInt5508]];
															}
															Static217.aStringArray38[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static78.aStringArray14 == null) {
																Static78.aStringArray14 = new String[Static214.anIntArray371[Static269.anInt5508]];
															}
															Static78.aStringArray14[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray19[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static204.anInt4310 = anIntArray214[local1];
														Static123.anInt2768 = anIntArray214[local1 + 1];
														Static225.anInt4722 = anIntArray214[local1 + 2];
														Static71.anInt1616 = anIntArray214[local1 + 3];
														Static156.anInt3493 = anIntArray214[local1 + 4];
														Static40.anInt918 = anIntArray214[local1 + 5];
														Static74.anInt1653 = anIntArray214[local1 + 6];
														Static279.anInt5650 = anIntArray214[local1 + 7];
														Static126.anInt2829 = anIntArray214[local1 + 8];
														Static188.anInt4080 = anIntArray214[local1 + 9];
														Static254.anInt5255 = anIntArray214[local1 + 10];
														Static292.aClass11_130.method274(Static156.anInt3493);
														Static292.aClass11_130.method274(Static40.anInt918);
														Static292.aClass11_130.method274(Static74.anInt1653);
														Static292.aClass11_130.method274(Static279.anInt5650);
														Static292.aClass11_130.method274(Static126.anInt2829);
														Static155.aClass60_18 = null;
														Static159.aClass60_19 = null;
														Static204.aClass60_20 = null;
														Static69.aClass60_5 = null;
														Static315.aClass60_7 = null;
														Static100.aClass60_8 = null;
														Static65.aClass60_4 = null;
														Static264.aClass60_17 = null;
														Static104.aBoolean594 = true;
														continue;
													}
													if (local31 == 5425) {
														Static210.method4723();
														Static104.aBoolean594 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static277.anInt5630 = anIntArray214[local1];
														Static98.anInt6645 = anIntArray214[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static107.anInt6873 = anIntArray214[local1];
														Static225.anInt4711 = anIntArray214[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														anIntArray214[local1++] = Static145.method2847(local541, local536) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static126.method2525(aStringArray19[local3], false);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														local391 = anIntArray214[local1 + 3];
														Static152.method2935(false, (local536 & 0x3FFF) - Static81.anInt1732, local740, (local536 >> 14 & 0x3FFF) - Static10.anInt231, local391, local541);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														local391 = anIntArray214[local1 + 3];
														Static345.method5617(local541, local740, (local536 >> 14 & 0x3FFF) - Static10.anInt231, local391, (local536 & 0x3FFF) - Static81.anInt1732);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray214[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static76.anInt1672 = local536;
														local541 = anIntArray214[local1 + 1];
														if (local541 + 1 >= Static45.anIntArrayArrayArray17[Static76.anInt1672].length >> 1) {
															throw new RuntimeException();
														}
														Static127.anInt2850 = local541;
														Static303.anInt3067 = 0;
														Static47.anInt1069 = anIntArray214[local1 + 2];
														Static268.anInt5466 = anIntArray214[local1 + 3];
														local740 = anIntArray214[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static179.anInt3943 = local740;
														local391 = anIntArray214[local1 + 5];
														if (local391 + 1 >= Static45.anIntArrayArrayArray17[Static179.anInt3943].length >> 1) {
															throw new RuntimeException();
														}
														Static83.anInt1757 = local391;
														Static303.anInt3065 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static354.method4058();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static142.method2793(anIntArray214[local1], anIntArray214[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray214[local1++] = (int) Static174.aFloat39 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray214[local1++] = (int) Static138.aFloat35 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static100.method1860();
														continue;
													}
													if (local31 == 5508) {
														Static333.method71();
														continue;
													}
													if (local31 == 5509) {
														Static40.method772();
														continue;
													}
													if (local31 == 5510) {
														Static115.method2088();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray214[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static10.anInt231;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static92.anInt2048) {
															local541 = Static92.anInt2048;
														}
														local740 -= Static81.anInt1732;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static290.anInt5893) {
															local740 = Static290.anInt5893;
														}
														Static2.anInt5073 = local541 * 128 + 64;
														Static331.anInt6556 = local740 * 128 + 64;
														Static303.anInt3065 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static87.method1560();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray19[local3];
														local1699 = aStringArray19[local3 + 1];
														local1--;
														local740 = anIntArray214[local1];
														if (Static139.anInt3135 == 10 && Static281.anInt5703 == 0 && Static279.anInt5648 == 0 && Static45.anInt5671 == 0 && Static131.anInt2971 == 0) {
															Static225.method3866(local740, local348, local1699);
														}
														continue;
													}
													if (local31 == 5601) {
														Static252.method4346();
														continue;
													}
													if (local31 == 5602) {
														if (Static279.anInt5648 == 0) {
															Static68.anInt1533 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static139.anInt3135 == 10 && Static281.anInt5703 == 0 && Static279.anInt5648 == 0 && Static45.anInt5671 == 0 && Static131.anInt2971 == 0) {
															Static244.method4230(anIntArray214[local1], anIntArray214[local1 + 2], anIntArray214[local1 + 3], anIntArray214[local1 + 1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static139.anInt3135 == 10 && Static281.anInt5703 == 0 && Static279.anInt5648 == 0 && Static45.anInt5671 == 0 && Static131.anInt2971 == 0) {
															Static91.method1635(Static327.method5371(aStringArray19[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static139.anInt3135 == 10 && Static281.anInt5703 == 0 && Static279.anInt5648 == 0 && Static45.anInt5671 == 0 && Static131.anInt2971 == 0) {
															Static124.method3070(anIntArray214[local1], aStringArray19[local3 + 1], aStringArray19[local3 + 2], anIntArray214[local1 + 6] == 1, Static327.method5371(aStringArray19[local3]), anIntArray214[local1 + 4] == 1, anIntArray214[local1 + 2], anIntArray214[local1 + 1], anIntArray214[local1 + 3], anIntArray214[local1 + 5] == 1);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static45.anInt5671 == 0) {
															Static52.anInt1173 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray214[local1++] = Static68.anInt1533;
														continue;
													}
													if (local31 == 5608) {
														anIntArray214[local1++] = Static287.anInt5821;
														continue;
													}
													if (local31 == 5609) {
														anIntArray214[local1++] = Static52.anInt1173;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray19[local3++] = Static65.aStringArray8.length > local536 ? Static281.method4831(Static65.aStringArray8[local536]) : "";
														}
														Static65.aStringArray8 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray214[local1++] = Static148.anInt4857;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static293.anInt5927 = local536;
														Static107.method5712();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static339.method5546(anIntArray214[local1] == 1);
														Static36.method673();
														Static107.method5712();
														Static233.method3964();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static336.aBoolean579 = anIntArray214[local1] == 1;
														Static233.method3964();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static135.aBoolean261 = anIntArray214[local1] == 1;
														Static107.method5712();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static221.aBoolean389 = anIntArray214[local1] == 1;
														Static164.aClass92_7.method4523(!Static221.aBoolean389);
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static235.anInt6712 = anIntArray214[local1];
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static200.aBoolean353 = anIntArray214[local1] == 1;
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static318.aBoolean552 = anIntArray214[local1] == 1;
														Static107.method5712();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static128.aBoolean242 = anIntArray214[local1] == 1;
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static192.anInt4154 = local536;
														Static107.method5712();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static58.aBoolean95 = anIntArray214[local1] == 1;
														Static355.method5714();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static86.aBoolean166 = anIntArray214[local1] == 1;
														Static107.method5712();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static131.aBoolean249 = anIntArray214[local1] == 1;
														Static107.method5712();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static339.anInt6679 = local536;
														Static67.method1249();
														Static290.method4960(Static212.aClass120_3);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static240.aBoolean423 = anIntArray214[local1] == 1;
														Static82.method1451();
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static144.anInt3226 = local536;
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static147.anInt3292) {
															if (Static147.anInt3292 == 0 && Static100.anInt2272 != -1) {
																Static298.method5067(Static20.aClass11_9, local536, Static100.anInt2272);
																Static174.aBoolean320 = false;
															} else if (local536 == 0) {
																Static55.method1009();
																Static174.aBoolean320 = false;
															} else {
																Static238.method4096(local536);
															}
															Static147.anInt3292 = local536;
														}
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static235.anInt6709 = local536;
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static336.aBoolean578 = anIntArray214[local1] == 1;
														Static233.method3964();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray214[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static161.anInt3644 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static239.method5168(local536);
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														anIntArray214[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static351.anInt6806 = local536;
														Static290.method4960(Static212.aClass120_3);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static152.anInt3390 = local536;
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static311.method5227(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static2.aBoolean425 = anIntArray214[local1] != 0;
														Static290.method4960(Static212.aClass120_3);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static235.anInt6712 = anIntArray214[local1];
														Static290.method4960(Static212.aClass120_3);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static68.aBoolean122 = anIntArray214[local1] != 0;
														Static290.method4960(Static212.aClass120_3);
														Static107.method5712();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static306.method5196(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray214[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static273.anInt5611 = local536;
														Static290.method4960(Static212.aClass120_3);
														Static243.aBoolean429 = false;
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray214[local1++] = Static293.anInt5927;
														continue;
													}
													if (local31 == 6102) {
														anIntArray214[local1++] = Static313.method5257() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray214[local1++] = Static336.aBoolean579 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray214[local1++] = Static135.aBoolean261 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray214[local1++] = Static221.aBoolean389 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray214[local1++] = Static235.anInt6712;
														continue;
													}
													if (local31 == 6108) {
														anIntArray214[local1++] = Static200.aBoolean353 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray214[local1++] = Static318.aBoolean552 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray214[local1++] = Static128.aBoolean242 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray214[local1++] = Static192.anInt4154;
														continue;
													}
													if (local31 == 6112) {
														anIntArray214[local1++] = Static58.aBoolean95 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray214[local1++] = Static86.aBoolean166 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray214[local1++] = Static131.aBoolean249 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray214[local1++] = Static339.anInt6679;
														continue;
													}
													if (local31 == 6117) {
														anIntArray214[local1++] = Static240.aBoolean423 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray214[local1++] = Static144.anInt3226;
														continue;
													}
													if (local31 == 6119) {
														anIntArray214[local1++] = Static147.anInt3292;
														continue;
													}
													if (local31 == 6120) {
														anIntArray214[local1++] = Static235.anInt6709;
														continue;
													}
													if (local31 == 6121) {
														anIntArray214[local1++] = Static164.aClass92_7.method4505() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray214[local1++] = Static143.method2802();
														continue;
													}
													if (local31 == 6124) {
														anIntArray214[local1++] = Static351.anInt6806;
														continue;
													}
													if (local31 == 6125) {
														anIntArray214[local1++] = Static152.anInt3390;
														continue;
													}
													if (local31 == 6126) {
														anIntArray214[local1++] = Static164.aClass92_7.method4465() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray214[local1++] = Static64.aBoolean107 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray214[local1++] = Static2.aBoolean425 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray214[local1++] = Static235.anInt6712;
														continue;
													}
													if (local31 == 6130) {
														anIntArray214[local1++] = Static68.aBoolean122 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray214[local1++] = Static6.anInt1971;
														continue;
													}
													if (local31 == 6132) {
														anIntArray214[local1++] = Static273.anInt5611;
														continue;
													}
													if (local31 == 6133) {
														anIntArray214[local1++] = Static172.anInt3803 == 1 || Static172.anInt3803 == 4 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static222.aShort59 = (short) anIntArray214[local1];
														if (Static222.aShort59 <= 0) {
															Static222.aShort59 = 256;
														}
														Static167.aShort53 = (short) anIntArray214[local1 + 1];
														if (Static167.aShort53 <= 0) {
															Static167.aShort53 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static325.aShort81 = (short) anIntArray214[local1];
														if (Static325.aShort81 <= 0) {
															Static325.aShort81 = 256;
														}
														Static71.aShort35 = (short) anIntArray214[local1 + 1];
														if (Static71.aShort35 <= 0) {
															Static71.aShort35 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static84.aShort36 = (short) anIntArray214[local1];
														if (Static84.aShort36 <= 0) {
															Static84.aShort36 = 1;
														}
														Static14.aShort8 = (short) anIntArray214[local1 + 1];
														if (Static14.aShort8 <= 0) {
															Static14.aShort8 = 32767;
														} else if (Static14.aShort8 < Static84.aShort36) {
															Static14.aShort8 = Static84.aShort36;
														}
														Static169.aShort54 = (short) anIntArray214[local1 + 2];
														if (Static169.aShort54 <= 0) {
															Static169.aShort54 = 1;
														}
														Static311.aShort80 = (short) anIntArray214[local1 + 3];
														if (Static311.aShort80 <= 0) {
															Static311.aShort80 = 32767;
														} else if (Static311.aShort80 < Static169.aShort54) {
															Static311.aShort80 = Static169.aShort54;
														}
														continue;
													}
													if (local31 == 6203) {
														Static289.method4937(Static191.aClass72_14.anInt1806, 0, false, 0, Static191.aClass72_14.anInt1829);
														anIntArray214[local1++] = Static1.anInt3;
														anIntArray214[local1++] = Static13.anInt307;
														continue;
													}
													if (local31 == 6204) {
														anIntArray214[local1++] = Static325.aShort81;
														anIntArray214[local1++] = Static71.aShort35;
														continue;
													}
													if (local31 == 6205) {
														anIntArray214[local1++] = Static222.aShort59;
														anIntArray214[local1++] = Static167.aShort53;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray214[local1++] = (int) (Static274.method4763() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray214[local1++] = (int) (Static274.method4763() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray214[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static274.method4763()));
														anIntArray214[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray214[local1];
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
														anIntArray214[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray214[local1++] = Static222.method3816() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray214[local1++] = Static232.method3948() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static139.anInt3135 == 10 && Static281.anInt5703 == 0 && Static279.anInt5648 == 0 && Static45.anInt5671 == 0) {
															anIntArray214[local1++] = Static307.method3190() == -1 ? 0 : 1;
															continue;
														}
														anIntArray214[local1++] = 1;
														continue;
													}
													@Pc(12964) Class197 local12964;
													@Pc(12940) Class83_Sub1 local12940;
													if (local31 == 6501) {
														local12940 = Static310.method5205();
														if (local12940 == null) {
															anIntArray214[local1++] = -1;
															anIntArray214[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray214[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray214[local1++] = 0;
															anIntArray214[local1++] = 0;
														} else {
															anIntArray214[local1++] = local12940.anInt3250;
															anIntArray214[local1++] = local12940.anInt3245;
															aStringArray19[local3++] = local12940.aString111;
															local12964 = local12940.method2846();
															anIntArray214[local1++] = local12964.anInt6216;
															aStringArray19[local3++] = local12964.aString233;
															anIntArray214[local1++] = local12940.anInt3243;
															anIntArray214[local1++] = local12940.anInt3249;
														}
														continue;
													}
													if (local31 == 6502) {
														local12940 = Static153.method2974();
														if (local12940 == null) {
															anIntArray214[local1++] = -1;
															anIntArray214[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray214[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray214[local1++] = 0;
															anIntArray214[local1++] = 0;
														} else {
															anIntArray214[local1++] = local12940.anInt3250;
															anIntArray214[local1++] = local12940.anInt3245;
															aStringArray19[local3++] = local12940.aString111;
															local12964 = local12940.method2846();
															anIntArray214[local1++] = local12964.anInt6216;
															aStringArray19[local3++] = local12964.aString233;
															anIntArray214[local1++] = local12940.anInt3243;
															anIntArray214[local1++] = local12940.anInt3249;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray214[local1];
														if (Static139.anInt3135 == 10 && Static281.anInt5703 == 0 && Static279.anInt5648 == 0 && Static45.anInt5671 == 0) {
															anIntArray214[local1++] = Static311.method5230(local536) ? 1 : 0;
															continue;
														}
														anIntArray214[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static115.anInt2476 = anIntArray214[local1];
														Static290.method4960(Static212.aClass120_3);
														continue;
													}
													if (local31 == 6505) {
														anIntArray214[local1++] = Static115.anInt2476;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray214[local1];
														@Pc(13184) Class83_Sub1 local13184 = Static108.method2007(local536);
														if (local13184 == null) {
															anIntArray214[local1++] = -1;
															aStringArray19[local3++] = "";
															anIntArray214[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray214[local1++] = 0;
															anIntArray214[local1++] = 0;
														} else {
															anIntArray214[local1++] = local13184.anInt3245;
															aStringArray19[local3++] = local13184.aString111;
															@Pc(13202) Class197 local13202 = local13184.method2846();
															anIntArray214[local1++] = local13202.anInt6216;
															aStringArray19[local3++] = local13202.aString233;
															anIntArray214[local1++] = local13184.anInt3243;
															anIntArray214[local1++] = local13184.anInt3249;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray214[local1];
														local1266 = anIntArray214[local1 + 1] == 1;
														local740 = anIntArray214[local1 + 2];
														local9571 = anIntArray214[local1 + 3] == 1;
														Static66.method1240(local1266, local740, local9571, local536);
														continue;
													}
													if (local31 == 6508) {
														Static54.method1000();
														continue;
													}
													if (local31 == 6509) {
														if (Static139.anInt3135 == 10) {
															local1--;
															if (anIntArray214[local1] == 1) {
																if (Static113.aClass66_8 == null) {
																	Static113.aClass66_8 = new Class66();
																}
															} else if (Static113.aClass66_8 != null) {
																Static113.aClass66_8.method1408();
																Static113.aClass66_8 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static166.aBoolean307 = anIntArray214[local1] == 1;
														Static290.method4960(Static212.aClass120_3);
														continue;
													}
													if (local31 == 6601) {
														anIntArray214[local1++] = Static166.aBoolean307 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static189.anInt4083 == 2) {
													if (local31 == 6700) {
														local536 = Static38.aClass198_5.method5264();
														if (Static310.anInt6220 != -1) {
															local536++;
														}
														anIntArray214[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray214[local1];
														if (Static310.anInt6220 != -1) {
															if (local536 == 0) {
																anIntArray214[local1++] = Static310.anInt6220;
																continue;
															}
															local536--;
														}
														local3526 = (Class4_Sub8) Static38.aClass198_5.method5268();
														while (local536-- > 0) {
															local3526 = (Class4_Sub8) Static38.aClass198_5.method5263();
														}
														anIntArray214[local1++] = local3526.anInt1670;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray214[local1];
														if (Static158.aClass72ArrayArray1[local536] == null) {
															aStringArray19[local3++] = "";
														} else {
															local1699 = Static158.aClass72ArrayArray1[local536][0].aString56;
															if (local1699 == null) {
																aStringArray19[local3++] = "";
															} else {
																aStringArray19[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray214[local1];
														if (Static158.aClass72ArrayArray1[local536] == null) {
															anIntArray214[local1++] = 0;
														} else {
															anIntArray214[local1++] = Static158.aClass72ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														if (Static158.aClass72ArrayArray1[local536] == null) {
															aStringArray19[local3++] = "";
														} else {
															local10698 = Static158.aClass72ArrayArray1[local536][local541].aString56;
															if (local10698 == null) {
																aStringArray19[local3++] = "";
															} else {
																aStringArray19[local3++] = local10698;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														if (Static158.aClass72ArrayArray1[local536] == null) {
															anIntArray214[local1++] = 0;
														} else {
															anIntArray214[local1++] = Static158.aClass72ArrayArray1[local536][local541].anInt1871;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(1, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(2, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(3, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(4, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(5, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(6, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(7, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(8, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(9, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														Static9.method5407(10, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray214[local1];
														local541 = anIntArray214[local1 + 1];
														local740 = anIntArray214[local1 + 2];
														local750 = Static289.method4934(local740, local536 << 16 | local541);
														Static138.method2738();
														@Pc(13929) Class4_Sub2 local13929 = Static46.method876(local750);
														Static265.method4635(local750.anInt1815, local750.anInt1851, local740, local13929.anInt258, local13929.method261(), local536 << 16 | local541);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(13962) Class139 local13962;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray214[local1];
														local13962 = Static20.method377(local536);
														if (local13962.aString156 == null) {
															aStringArray19[local3++] = "";
														} else {
															aStringArray19[local3++] = local13962.aString156;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray214[local1];
														local13962 = Static20.method377(local536);
														anIntArray214[local1++] = local13962.anInt4358;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray214[local1];
														local13962 = Static20.method377(local536);
														anIntArray214[local1++] = local13962.anInt4357;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray214[local1];
														local13962 = Static20.method377(local536);
														anIntArray214[local1++] = local13962.anInt4370;
														continue;
													}
												}
											}
										}
									}
								}
							}
						} else {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static66.method1243(anIntArray214[local1]);
							} else {
								local855 = local714 ? aClass72_9 : aClass72_10;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray214[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method1504(aStringArray19[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray214[local1];
								local740 = anIntArray214[local1 + 1];
								local855.aClass72_8 = Static289.method4934(local740, local541);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean161 = anIntArray214[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt1846 = anIntArray214[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt1840 = anIntArray214[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString59 = aStringArray19[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString57 = aStringArray19[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray17 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt1815 = anIntArray214[local1];
								local1--;
								local855.anInt1851 = anIntArray214[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray214[local1];
								local1--;
								local740 = anIntArray214[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method1502(local740 - 1, local541);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString60 = aStringArray19[local3];
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14041) Exception local14041) {
			if (arg0.aString142 == null) {
				Static103.method2841(local14041, "CS2 - scr:" + arg0.aLong259 + " op:" + local13);
			} else {
				Static159.method3073("Clientscript error in: " + arg0.aString142);
				@Pc(14059) StringBuffer local14059 = new StringBuffer(30);
				local14059.append("Clientscript error in: ").append(arg0.aString142).append("\n");
				for (local536 = anInt2169 - 1; local536 >= 0; local536--) {
					local14059.append("via: ").append(aClass211Array1[local536].aClass4_Sub1_Sub13_1.aString142).append("\n");
				}
				local14059.append("Op: ").append(local13).append("\n");
				local1699 = local14041.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14059.append("Message: ").append(local1699).append("\n");
				}
				Static103.method2841(local14041, local14059.toString());
				Static107.method5698(local14059.toString());
			}
		}
	}
}
