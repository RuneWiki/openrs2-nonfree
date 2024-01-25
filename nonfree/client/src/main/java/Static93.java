import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray13;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "Lclient!gk;")
	private static Class83 aClass83_1;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "[I")
	private static int[] anIntArray114;

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "Lclient!ms;")
	private static Class137 aClass137_7;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "Lclient!ms;")
	private static Class137 aClass137_8;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray12 = new String[1000];

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
	private static int anInt1652 = 0;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "[I")
	private static final int[] anIntArray113 = new int[5];

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar3 = Calendar.getInstance();

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "[Lclient!ch;")
	private static final Class36[] aClass36Array1 = new Class36[50];

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "[[I")
	private static final int[][] anIntArrayArray10 = new int[5][5000];

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "[I")
	private static final int[] anIntArray115 = new int[1000];

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray14 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_12 = new Class26(4);

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "[I")
	private static final int[] anIntArray116 = new int[3];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public static void method1349(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static257.method4460(arg0)) {
			return;
		}
		@Pc(12) Class137[] local12 = Static188.aClass137ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class137 local19 = local12[local14];
			if (local19.anObjectArray27 != null) {
				@Pc(26) Class11_Sub13 local26 = new Class11_Sub13();
				local26.aClass137_5 = local19;
				local26.anObjectArray3 = local19.anObjectArray27;
				method1354(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V")
	public static void method1351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class11_Sub4_Sub9 local5 = Static338.method5540(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray114 = new int[local5.anInt3360];
		aStringArray13 = new String[local5.anInt3358];
		if (local5.anInt3357 == 15 || local5.anInt3357 == 17 || local5.anInt3357 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static238.aClass137_14 != null) {
				local30 = Static238.aClass137_14.anInt4071;
				local32 = Static238.aClass137_14.anInt4098;
			}
			anIntArray114[0] = Static214.aClass29_1.method384() - local30;
			anIntArray114[1] = Static214.aClass29_1.method381() - local32;
		}
		method1352(local5, 200000);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ks;I)V")
	private static void method1352(@OriginalArg(0) Class11_Sub4_Sub9 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray220;
		@Pc(11) int[] local11 = arg0.anIntArray221;
		@Pc(13) byte local13 = -1;
		anInt1652 = 0;
		@Pc(536) int local536;
		@Pc(1696) String local1696;
		try {
			@Pc(17) int local17 = 0;
			label4487: while (true) {
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
						anIntArray115[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray115[local1++] = Static198.anIntArray311[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static297.method4917(anIntArray115[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray12[local3++] = arg0.aStringArray25[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray115[local1] != anIntArray115[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray115[local1] == anIntArray115[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray115[local1] < anIntArray115[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray115[local1] > anIntArray115[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt1652 == 0) {
							return;
						}
						@Pc(190) Class36 local190 = aClass36Array1[--anInt1652];
						arg0 = local190.aClass11_Sub4_Sub9_1;
						local8 = arg0.anIntArray220;
						local11 = arg0.anIntArray221;
						local5 = local190.anInt698;
						anIntArray114 = local190.anIntArray53;
						aStringArray13 = local190.aStringArray6;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray115[local1++] = Static239.method4231(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static103.method1568(local51, anIntArray115[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray115[local1] <= anIntArray115[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray115[local1] >= anIntArray115[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray115[local1++] = anIntArray114[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray114[local299] = anIntArray115[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray12[local3++] = aStringArray13[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray13[local299] = aStringArray12[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static196.method3567(local51, aStringArray12, local3);
						aStringArray12[local3++] = local348;
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
						@Pc(375) Class11_Sub4_Sub9 local375 = Static150.method2271(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt3360];
						@Pc(389) String[] local389 = new String[local375.anInt3358];
						for (local391 = 0; local391 < local375.anInt3361; local391++) {
							local385[local391] = anIntArray115[local1 + local391 - local375.anInt3361];
						}
						for (local410 = 0; local410 < local375.anInt3353; local410++) {
							local389[local410] = aStringArray12[local3 + local410 - local375.anInt3353];
						}
						local1 -= local375.anInt3361;
						local3 -= local375.anInt3353;
						@Pc(441) Class36 local441 = new Class36();
						local441.aClass11_Sub4_Sub9_1 = arg0;
						local441.anInt698 = local5;
						local441.anIntArray53 = anIntArray114;
						local441.aStringArray6 = aStringArray13;
						if (anInt1652 >= aClass36Array1.length) {
							throw new RuntimeException();
						}
						aClass36Array1[anInt1652++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray220;
						local11 = local375.anIntArray221;
						local5 = -1;
						anIntArray114 = local385;
						aStringArray13 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray115[local1++] = Static25.anIntArray516[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static25.anIntArray516[local51] = anIntArray115[local1];
						Static70.method1054(local51);
						Static240.aBoolean321 |= Static315.aBooleanArray25[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray115[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray113[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4487;
								}
								anIntArrayArray10[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray115[local1];
						if (local536 >= 0 && local536 < anIntArray113[local51]) {
							anIntArray115[local1++] = anIntArrayArray10[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray115[local1];
						if (local536 >= 0 && local536 < anIntArray113[local51]) {
							anIntArrayArray10[local51][local536] = anIntArray115[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static218.aStringArray23[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray12[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static218.aStringArray23[local51] = aStringArray12[local3];
						Static117.method1776(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class58 local689 = arg0.aClass58Array1[local11[local5]];
						local1--;
						@Pc(699) Class11_Sub33 local699 = (Class11_Sub33) local689.method1009((long) anIntArray115[local1]);
						if (local699 != null) {
							local5 += local699.anInt5153;
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
				@Pc(750) Class137 local750;
				@Pc(771) int local771;
				@Pc(852) Class137 local852;
				@Pc(919) Class137 local919;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray115[local1];
						local541 = anIntArray115[local1 + 1];
						local740 = anIntArray115[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static166.method2688(local536);
						if (local750.aClass137Array2 == null) {
							local750.aClass137Array2 = new Class137[local740 + 1];
						}
						if (local750.aClass137Array2.length <= local740) {
							@Pc(769) Class137[] local769 = new Class137[local740 + 1];
							for (local771 = 0; local771 < local750.aClass137Array2.length; local771++) {
								local769[local771] = local750.aClass137Array2[local771];
							}
							local750.aClass137Array2 = local769;
						}
						if (local740 > 0 && local750.aClass137Array2[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class137 local814 = new Class137();
						local814.anInt4067 = local541;
						local814.anInt4124 = local814.anInt4044 = local750.anInt4044;
						local814.anInt4095 = local740;
						local750.aClass137Array2[local740] = local814;
						if (local714) {
							aClass137_7 = local814;
						} else {
							aClass137_8 = local814;
						}
						Static69.method1039(local750);
						continue;
					}
					@Pc(873) Class137 local873;
					if (local31 == 101) {
						local852 = local714 ? aClass137_7 : aClass137_8;
						if (local852.anInt4095 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local873 = Static166.method2688(local852.anInt4044);
						local873.aClass137Array2[local852.anInt4095] = null;
						Static69.method1039(local873);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local852 = Static166.method2688(anIntArray115[local1]);
						local852.aClass137Array2 = null;
						Static69.method1039(local852);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray115[local1];
						local541 = anIntArray115[local1 + 1];
						local919 = Static188.method3467(local536, local541);
						if (local919 != null && local541 != -1) {
							anIntArray115[local1++] = 1;
							if (local714) {
								aClass137_7 = local919;
							} else {
								aClass137_8 = local919;
							}
							continue;
						}
						anIntArray115[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray115[local1];
						local873 = Static166.method2688(local536);
						if (local873 == null) {
							anIntArray115[local1++] = 0;
						} else {
							anIntArray115[local1++] = 1;
							if (local714) {
								aClass137_7 = local873;
							} else {
								aClass137_8 = local873;
							}
						}
						continue;
					}
				} else {
					@Pc(1067) boolean local1067;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray115[local1];
							local541 = anIntArray115[local1 + 1];
							for (local740 = 0; local740 < Static349.anIntArray545.length; local740++) {
								if (Static349.anIntArray545[local740] == local536) {
									Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2.method3751(local740, local541);
									continue label4487;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static345.anIntArray544.length) {
									continue label4487;
								}
								if (Static345.anIntArray544[local391] == local536) {
									Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2.method3751(local391, local541);
									continue label4487;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray115[local1];
							local541 = anIntArray115[local1 + 1];
							Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2.method3760(local541, local536);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1067 = anIntArray115[local1] != 0;
							Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2.method3759(local1067);
							continue;
						}
					} else {
						@Pc(1263) boolean local1263;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static166.method2688(anIntArray115[local1]);
							} else {
								local852 = local714 ? aClass137_7 : aClass137_8;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local852.anInt4087 = anIntArray115[local1];
								local852.anInt4115 = anIntArray115[local1 + 1];
								local541 = anIntArray115[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray115[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local852.aByte50 = (byte) local541;
								local852.aByte52 = (byte) local740;
								Static69.method1039(local852);
								Static238.method4217(local852);
								if (local852.anInt4095 == -1) {
									Static197.method3596(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local852.anInt4065 = anIntArray115[local1];
								local852.anInt4081 = anIntArray115[local1 + 1];
								local852.anInt4094 = 0;
								local852.anInt4058 = 0;
								local541 = anIntArray115[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray115[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local852.aByte51 = (byte) local541;
								local852.aByte49 = (byte) local740;
								Static69.method1039(local852);
								Static238.method4217(local852);
								if (local852.anInt4067 == 0) {
									Static351.method5429(false, local852);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1263 = anIntArray115[local1] == 1;
								if (local852.aBoolean268 != local1263) {
									local852.aBoolean268 = local1263;
									Static69.method1039(local852);
								}
								if (local852.anInt4095 == -1) {
									Static131.method2023(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local852.anInt4101 = anIntArray115[local1];
								local852.anInt4113 = anIntArray115[local1 + 1];
								Static69.method1039(local852);
								Static238.method4217(local852);
								if (local852.anInt4067 == 0) {
									Static351.method5429(false, local852);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local852.aBoolean273 = anIntArray115[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || !(local31 < 2100 || local31 >= 2200)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static166.method2688(anIntArray115[local1]);
							} else {
								local852 = local714 ? aClass137_7 : aClass137_8;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local852.anInt4107 = anIntArray115[local1];
								if (local852.anInt4107 > local852.anInt4105 - local852.anInt4060) {
									local852.anInt4107 = local852.anInt4105 - local852.anInt4060;
								}
								if (local852.anInt4107 < 0) {
									local852.anInt4107 = 0;
								}
								local852.anInt4062 = anIntArray115[local1 + 1];
								if (local852.anInt4062 > local852.anInt4079 - local852.anInt4110) {
									local852.anInt4062 = local852.anInt4079 - local852.anInt4110;
								}
								if (local852.anInt4062 < 0) {
									local852.anInt4062 = 0;
								}
								Static69.method1039(local852);
								if (local852.anInt4095 == -1) {
									Static318.method5288(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local852.anInt4048 = anIntArray115[local1];
								Static69.method1039(local852);
								if (local852.anInt4095 == -1) {
									Static64.method941(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local852.aBoolean274 = anIntArray115[local1] == 1;
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local852.anInt4055 = anIntArray115[local1];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local852.anInt4056 = anIntArray115[local1];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray115[local1];
								if (local852.anInt4064 != local541) {
									local852.anInt4064 = local541;
									Static69.method1039(local852);
								}
								if (local852.anInt4095 == -1) {
									Static212.method3828(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local852.anInt4117 = anIntArray115[local1];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local852.aBoolean270 = anIntArray115[local1] == 1;
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1108) {
								local852.anInt4108 = 1;
								local1--;
								local852.anInt4050 = anIntArray115[local1];
								Static69.method1039(local852);
								if (local852.anInt4095 == -1) {
									Static177.method2854(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local852.anInt4080 = anIntArray115[local1];
								local852.anInt4123 = anIntArray115[local1 + 1];
								local852.anInt4120 = anIntArray115[local1 + 2];
								local852.anInt4114 = anIntArray115[local1 + 3];
								local852.anInt4066 = anIntArray115[local1 + 4];
								local852.anInt4078 = anIntArray115[local1 + 5];
								Static69.method1039(local852);
								if (local852.anInt4095 == -1) {
									Static3.method16(local852.anInt4044);
									Static16.method220(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray115[local1];
								if (local852.anInt4076 != local541) {
									local852.anInt4076 = local541;
									local852.anInt4091 = 0;
									local852.anInt4104 = 1;
									local852.anInt4099 = 0;
									Static69.method1039(local852);
								}
								if (local852.anInt4095 == -1) {
									Static281.method4706(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local852.aBoolean276 = anIntArray115[local1] == 1;
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1696 = aStringArray12[local3];
								if (!local1696.equals(local852.aString37)) {
									local852.aString37 = local1696;
									Static69.method1039(local852);
								}
								if (local852.anInt4095 == -1) {
									Static199.method3601(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local852.anInt4118 = anIntArray115[local1];
								Static69.method1039(local852);
								if (local852.anInt4095 == -1) {
									Static275.method4656(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local852.anInt4046 = anIntArray115[local1];
								local852.anInt4052 = anIntArray115[local1 + 1];
								local852.lb = anIntArray115[local1 + 2];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local852.aBoolean278 = anIntArray115[local1] == 1;
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local852.anInt4051 = anIntArray115[local1];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local852.anInt4092 = anIntArray115[local1];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local852.aBoolean263 = anIntArray115[local1] == 1;
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local852.aBoolean275 = anIntArray115[local1] == 1;
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local852.anInt4105 = anIntArray115[local1];
								local852.anInt4079 = anIntArray115[local1 + 1];
								Static69.method1039(local852);
								if (local852.anInt4067 == 0) {
									Static351.method5429(false, local852);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local852.aShort64 = (short) anIntArray115[local1];
								local852.aShort65 = (short) anIntArray115[local1 + 1];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local852.aBoolean277 = anIntArray115[local1] == 1;
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local852.anInt4078 = anIntArray115[local1];
								Static69.method1039(local852);
								if (local852.anInt4095 == -1) {
									Static3.method16(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray115[local1];
								local852.aBoolean272 = local541 == 1;
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local852.anInt4083 = anIntArray115[local1];
								local852.anInt4111 = anIntArray115[local1 + 1];
								Static69.method1039(local852);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || local31 >= 2200 && local31 < 2300) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static166.method2688(anIntArray115[local1]);
							} else {
								local852 = local714 ? aClass137_7 : aClass137_8;
							}
							Static69.method1039(local852);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray115[local1];
								local740 = anIntArray115[local1 + 1];
								if (local852.anInt4095 == -1) {
									Static188.method3465(local852.anInt4044);
									Static3.method16(local852.anInt4044);
									Static16.method220(local852.anInt4044);
								}
								if (local541 == -1) {
									local852.anInt4108 = 1;
									local852.anInt4050 = -1;
									local852.anInt4112 = -1;
									continue;
								}
								local852.anInt4112 = local541;
								local852.anInt4089 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local852.aBoolean264 = true;
								} else {
									local852.aBoolean264 = false;
								}
								@Pc(2086) Class170 local2086 = Static283.method4717(local541);
								local852.anInt4120 = local2086.anInt5331;
								local852.anInt4114 = local2086.anInt5334;
								local852.anInt4066 = local2086.anInt5320;
								local852.anInt4080 = local2086.anInt5313;
								local852.anInt4123 = local2086.anInt5302;
								local852.anInt4078 = local2086.anInt5338;
								if (local31 == 1205 || local31 == 1209) {
									local852.anInt4074 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local852.anInt4074 = 1;
								} else {
									local852.anInt4074 = 2;
								}
								if (local852.anInt4094 > 0) {
									local852.anInt4078 = local852.anInt4078 * 32 / local852.anInt4094;
								} else if (local852.anInt4065 > 0) {
									local852.anInt4078 = local852.anInt4078 * 32 / local852.anInt4065;
								}
								continue;
							}
							if (local31 == 1201) {
								local852.anInt4108 = 2;
								local1--;
								local852.anInt4050 = anIntArray115[local1];
								if (local852.anInt4095 == -1) {
									Static177.method2854(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1202) {
								local852.anInt4108 = 3;
								local852.anInt4050 = -1;
								if (local852.anInt4095 == -1) {
									Static177.method2854(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1203) {
								local852.anInt4108 = 6;
								local1--;
								local852.anInt4050 = anIntArray115[local1];
								if (local852.anInt4095 == -1) {
									Static177.method2854(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1204) {
								local852.anInt4108 = 5;
								local1--;
								local852.anInt4050 = anIntArray115[local1];
								if (local852.anInt4095 == -1) {
									Static177.method2854(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local852.anInt4090 = anIntArray115[local1];
								local852.anInt4096 = anIntArray115[local1 + 1];
								local852.anInt4116 = anIntArray115[local1 + 2];
								local852.anInt4063 = anIntArray115[local1 + 3];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local852.anInt4057 = anIntArray115[local1];
								local852.anInt4086 = anIntArray115[local1 + 1];
								Static69.method1039(local852);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local852.anInt4050 = anIntArray115[local1];
								local852.anInt4054 = anIntArray115[local1 + 1];
								if (anIntArray115[local1 + 2] == 1) {
									local852.anInt4108 = 9;
								} else {
									local852.anInt4108 = 8;
								}
								if (anIntArray115[local1 + 3] == 1) {
									local852.aBoolean264 = true;
								} else {
									local852.aBoolean264 = false;
								}
								if (local852.anInt4095 == -1) {
									Static177.method2854(local852.anInt4044);
								}
								continue;
							}
							if (local31 == 1211) {
								local852.anInt4108 = 5;
								local852.anInt4050 = 2047;
								local852.anInt4054 = 0;
								if (local852.anInt4095 == -1) {
									Static177.method2854(local852.anInt4044);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static166.method2688(anIntArray115[local1]);
							} else {
								local852 = local714 ? aClass137_7 : aClass137_8;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray115[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local852.method3605(local541, aStringArray12[local3]);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray115[local1];
								local740 = anIntArray115[local1 + 1];
								local852.aClass137_12 = Static188.method3467(local541, local740);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local852.aBoolean267 = anIntArray115[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local852.anInt4072 = anIntArray115[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local852.anInt4041 = anIntArray115[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local852.aString38 = aStringArray12[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local852.aString34 = aStringArray12[local3];
								continue;
							}
							if (local31 == 1307) {
								local852.aStringArray33 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local852.anInt4043 = anIntArray115[local1];
								local1--;
								local852.anInt4068 = anIntArray115[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray115[local1];
								local1--;
								local740 = anIntArray115[local1];
								if (local740 >= 1 && local740 <= 10) {
									local852.method3617(local541, local740 - 1);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local852.aString36 = aStringArray12[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local852.anInt4097 = anIntArray115[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local852 = Static166.method2688(anIntArray115[local1]);
								} else {
									local852 = local714 ? aClass137_7 : aClass137_8;
								}
								local3--;
								local1696 = aStringArray12[local3];
								@Pc(2607) int[] local2607 = null;
								if (local1696.length() > 0 && local1696.charAt(local1696.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray115[local1];
									if (local391 > 0) {
										local2607 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2607[local391] = anIntArray115[local1];
										}
									}
									local1696 = local1696.substring(0, local1696.length() - 1);
								}
								@Pc(2653) Object[] local2653 = new Object[local1696.length() + 1];
								for (local410 = local2653.length - 1; local410 >= 1; local410--) {
									if (local1696.charAt(local410 - 1) == 's') {
										local3--;
										local2653[local410] = aStringArray12[local3];
									} else {
										local1--;
										local2653[local410] = Integer.valueOf(anIntArray115[local1]);
									}
								}
								local1--;
								local771 = anIntArray115[local1];
								if (local771 == -1) {
									local2653 = null;
								} else {
									local2653[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local852.anObjectArray24 = local2653;
								} else if (local31 == 1401) {
									local852.anObjectArray14 = local2653;
								} else if (local31 == 1402) {
									local852.anObjectArray9 = local2653;
								} else if (local31 == 1403) {
									local852.anObjectArray5 = local2653;
								} else if (local31 == 1404) {
									local852.anObjectArray32 = local2653;
								} else if (local31 == 1405) {
									local852.anObjectArray31 = local2653;
								} else if (local31 == 1406) {
									local852.anObjectArray10 = local2653;
								} else if (local31 == 1407) {
									local852.anObjectArray28 = local2653;
									local852.anIntArray313 = local2607;
								} else if (local31 == 1408) {
									local852.anObjectArray6 = local2653;
								} else if (local31 == 1409) {
									local852.anObjectArray16 = local2653;
								} else if (local31 == 1410) {
									local852.anObjectArray25 = local2653;
								} else if (local31 == 1411) {
									local852.anObjectArray33 = local2653;
								} else if (local31 == 1412) {
									local852.anObjectArray17 = local2653;
								} else if (local31 == 1414) {
									local852.anObjectArray18 = local2653;
									local852.anIntArray319 = local2607;
								} else if (local31 == 1415) {
									local852.anObjectArray15 = local2653;
									local852.anIntArray316 = local2607;
								} else if (local31 == 1416) {
									local852.anObjectArray13 = local2653;
								} else if (local31 == 1417) {
									local852.anObjectArray20 = local2653;
								} else if (local31 == 1418) {
									local852.anObjectArray19 = local2653;
								} else if (local31 == 1419) {
									local852.anObjectArray11 = local2653;
								} else if (local31 == 1420) {
									local852.anObjectArray12 = local2653;
								} else if (local31 == 1421) {
									local852.anObjectArray8 = local2653;
								} else if (local31 == 1422) {
									local852.anObjectArray4 = local2653;
								} else if (local31 == 1423) {
									local852.anObjectArray29 = local2653;
								} else if (local31 == 1424) {
									local852.anObjectArray21 = local2653;
								} else if (local31 == 1425) {
									local852.anObjectArray23 = local2653;
								} else if (local31 == 1426) {
									local852.anObjectArray26 = local2653;
								} else if (local31 == 1427) {
									local852.anObjectArray30 = local2653;
								} else if (local31 == 1428) {
									local852.anObjectArray22 = local2653;
									local852.anIntArray321 = local2607;
								} else if (local31 == 1429) {
									local852.anObjectArray7 = local2653;
									local852.anIntArray318 = local2607;
								}
								local852.aBoolean262 = true;
								continue;
							}
							if (local31 < 1600) {
								local852 = local714 ? aClass137_7 : aClass137_8;
								if (local31 == 1500) {
									anIntArray115[local1++] = local852.anInt4071;
									continue;
								}
								if (local31 == 1501) {
									anIntArray115[local1++] = local852.anInt4098;
									continue;
								}
								if (local31 == 1502) {
									anIntArray115[local1++] = local852.anInt4060;
									continue;
								}
								if (local31 == 1503) {
									anIntArray115[local1++] = local852.anInt4110;
									continue;
								}
								if (local31 == 1504) {
									anIntArray115[local1++] = local852.aBoolean268 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray115[local1++] = local852.anInt4124;
									continue;
								}
							} else if (local31 < 1700) {
								local852 = local714 ? aClass137_7 : aClass137_8;
								if (local31 == 1600) {
									anIntArray115[local1++] = local852.anInt4107;
									continue;
								}
								if (local31 == 1601) {
									anIntArray115[local1++] = local852.anInt4062;
									continue;
								}
								if (local31 == 1602) {
									aStringArray12[local3++] = local852.aString37;
									continue;
								}
								if (local31 == 1603) {
									anIntArray115[local1++] = local852.anInt4105;
									continue;
								}
								if (local31 == 1604) {
									anIntArray115[local1++] = local852.anInt4079;
									continue;
								}
								if (local31 == 1605) {
									anIntArray115[local1++] = local852.anInt4078;
									continue;
								}
								if (local31 == 1606) {
									anIntArray115[local1++] = local852.anInt4120;
									continue;
								}
								if (local31 == 1607) {
									anIntArray115[local1++] = local852.anInt4066;
									continue;
								}
								if (local31 == 1608) {
									anIntArray115[local1++] = local852.anInt4114;
									continue;
								}
								if (local31 == 1609) {
									anIntArray115[local1++] = local852.anInt4055;
									continue;
								}
								if (local31 == 1610) {
									anIntArray115[local1++] = local852.anInt4080;
									continue;
								}
								if (local31 == 1611) {
									anIntArray115[local1++] = local852.anInt4123;
									continue;
								}
								if (local31 == 1612) {
									anIntArray115[local1++] = local852.anInt4064;
									continue;
								}
							} else if (local31 < 1800) {
								local852 = local714 ? aClass137_7 : aClass137_8;
								if (local31 == 1700) {
									anIntArray115[local1++] = local852.anInt4112;
									continue;
								}
								if (local31 == 1701) {
									if (local852.anInt4112 == -1) {
										anIntArray115[local1++] = 0;
									} else {
										anIntArray115[local1++] = local852.anInt4089;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray115[local1++] = local852.anInt4095;
									continue;
								}
							} else if (local31 < 1900) {
								local852 = local714 ? aClass137_7 : aClass137_8;
								if (local31 == 1800) {
									anIntArray115[local1++] = Static42.method634(local852).method4727();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray115[local1];
									local541--;
									if (local852.aStringArray33 != null && local541 < local852.aStringArray33.length && local852.aStringArray33[local541] != null) {
										aStringArray12[local3++] = local852.aStringArray33[local541];
										continue;
									}
									aStringArray12[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local852.aString38 == null) {
										aStringArray12[local3++] = "";
									} else {
										aStringArray12[local3++] = local852.aString38;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local852 = Static166.method2688(anIntArray115[local1]);
								if (local31 == 2500) {
									anIntArray115[local1++] = local852.anInt4071;
									continue;
								}
								if (local31 == 2501) {
									anIntArray115[local1++] = local852.anInt4098;
									continue;
								}
								if (local31 == 2502) {
									anIntArray115[local1++] = local852.anInt4060;
									continue;
								}
								if (local31 == 2503) {
									anIntArray115[local1++] = local852.anInt4110;
									continue;
								}
								if (local31 == 2504) {
									anIntArray115[local1++] = local852.aBoolean268 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray115[local1++] = local852.anInt4124;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local852 = Static166.method2688(anIntArray115[local1]);
								if (local31 == 2600) {
									anIntArray115[local1++] = local852.anInt4107;
									continue;
								}
								if (local31 == 2601) {
									anIntArray115[local1++] = local852.anInt4062;
									continue;
								}
								if (local31 == 2602) {
									aStringArray12[local3++] = local852.aString37;
									continue;
								}
								if (local31 == 2603) {
									anIntArray115[local1++] = local852.anInt4105;
									continue;
								}
								if (local31 == 2604) {
									anIntArray115[local1++] = local852.anInt4079;
									continue;
								}
								if (local31 == 2605) {
									anIntArray115[local1++] = local852.anInt4078;
									continue;
								}
								if (local31 == 2606) {
									anIntArray115[local1++] = local852.anInt4120;
									continue;
								}
								if (local31 == 2607) {
									anIntArray115[local1++] = local852.anInt4066;
									continue;
								}
								if (local31 == 2608) {
									anIntArray115[local1++] = local852.anInt4114;
									continue;
								}
								if (local31 == 2609) {
									anIntArray115[local1++] = local852.anInt4055;
									continue;
								}
								if (local31 == 2610) {
									anIntArray115[local1++] = local852.anInt4080;
									continue;
								}
								if (local31 == 2611) {
									anIntArray115[local1++] = local852.anInt4123;
									continue;
								}
								if (local31 == 2612) {
									anIntArray115[local1++] = local852.anInt4064;
									continue;
								}
							} else {
								@Pc(3625) Class11_Sub41 local3625;
								@Pc(3541) Class11_Sub41 local3541;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local852 = Static166.method2688(anIntArray115[local1]);
										anIntArray115[local1++] = local852.anInt4112;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local852 = Static166.method2688(anIntArray115[local1]);
										if (local852.anInt4112 == -1) {
											anIntArray115[local1++] = 0;
										} else {
											anIntArray115[local1++] = local852.anInt4089;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray115[local1];
										local3541 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local536);
										if (local3541 == null) {
											anIntArray115[local1++] = 0;
										} else {
											anIntArray115[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local852 = Static166.method2688(anIntArray115[local1]);
										if (local852.aClass137Array2 == null) {
											anIntArray115[local1++] = 0;
											continue;
										}
										local541 = local852.aClass137Array2.length;
										for (local740 = 0; local740 < local852.aClass137Array2.length; local740++) {
											if (local852.aClass137Array2[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray115[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local3625 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local536);
										if (local3625 != null && local3625.anInt6364 == local541) {
											anIntArray115[local1++] = 1;
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local852 = Static166.method2688(anIntArray115[local1]);
									if (local31 == 2800) {
										anIntArray115[local1++] = Static42.method634(local852).method4727();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray115[local1];
										local541--;
										if (local852.aStringArray33 != null && local541 < local852.aStringArray33.length && local852.aStringArray33[local541] != null) {
											aStringArray12[local3++] = local852.aStringArray33[local541];
											continue;
										}
										aStringArray12[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local852.aString38 == null) {
											aStringArray12[local3++] = "";
										} else {
											aStringArray12[local3++] = local852.aString38;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray12[local3];
										Static17.method228(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static322.method5356(Static156.aClass67_Sub3_Sub3_Sub2_2, anIntArray115[local1 + 1], anIntArray115[local1]);
										continue;
									}
									if (local31 == 3103) {
										Static141.method2176();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray12[local3];
										local541 = 0;
										if (Static87.method1251(local348)) {
											local541 = Static87.method1250(local348);
										}
										Static313.aClass11_Sub25_Sub1_5.method2454(220);
										Static313.aClass11_Sub25_Sub1_5.method5168(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray12[local3];
										Static313.aClass11_Sub25_Sub1_5.method2454(62);
										Static313.aClass11_Sub25_Sub1_5.method5186(local348.length() + 1);
										Static313.aClass11_Sub25_Sub1_5.method5173(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray12[local3];
										Static313.aClass11_Sub25_Sub1_5.method2454(52);
										Static313.aClass11_Sub25_Sub1_5.method5186(local348.length() + 1);
										Static313.aClass11_Sub25_Sub1_5.method5173(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray115[local1];
										local3--;
										local1696 = aStringArray12[local3];
										Static9.method117(local536, local1696);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local740 = anIntArray115[local1 + 2];
										local750 = Static166.method2688(local740);
										Static124.method1907(local536, local750, local541);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local919 = local714 ? aClass137_7 : aClass137_8;
										Static124.method1907(local536, local919, local541);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray115[local1];
										Static313.aClass11_Sub25_Sub1_5.method2454(255);
										Static313.aClass11_Sub25_Sub1_5.method5204(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local3625 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local536);
										if (local3625 != null) {
											Static66.method1709(local3625, local3625.anInt6364 != local541, true);
										}
										Static299.method5103(true, 3, local541, local536);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray115[local1];
										local3541 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local536);
										if (local3541 != null && local3541.anInt6363 == 3) {
											Static66.method1709(local3541, true, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static350.method5656(anIntArray115[local1], 255, anIntArray115[local1 + 1], anIntArray115[local1 + 2]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static220.method3943(255, anIntArray115[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static252.method5137(255, anIntArray115[local1 + 1], anIntArray115[local1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray115[local1++] = Static293.anInt5807;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = Static279.method4703(local536, local541, false);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = Static214.method3867(local541, local536, false);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = Static112.method1685(local536, false, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static159.method2562(local536).anInt1407;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static15.anIntArray418[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static8.anIntArray12[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static281.anIntArray428[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static322.anInt6250;
										local541 = (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7) + Static182.anInt3662;
										local740 = (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7) + Static169.anInt6312;
										anIntArray115[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray115[local1++] = Static220.aBoolean298 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = Static279.method4703(local536, local541, true);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = Static214.method3867(local541, local536, true);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = Static112.method1685(local536, true, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static248.anInt4969 >= 2) {
											anIntArray115[local1++] = Static248.anInt4969;
										} else {
											anIntArray115[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray115[local1++] = Static4.anInt23;
										continue;
									}
									if (local31 == 3318) {
										anIntArray115[local1++] = Static155.anInt2961;
										continue;
									}
									if (local31 == 3321) {
										anIntArray115[local1++] = Static212.anInt4343;
										continue;
									}
									if (local31 == 3322) {
										anIntArray115[local1++] = Static107.anInt1990;
										continue;
									}
									if (local31 == 3323) {
										if (Static214.anInt4389 >= 5 && Static214.anInt4389 <= 9) {
											anIntArray115[local1++] = 1;
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static214.anInt4389 >= 5 && Static214.anInt4389 <= 9) {
											anIntArray115[local1++] = Static214.anInt4389;
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray115[local1++] = Static244.aBoolean325 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray115[local1++] = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095;
										continue;
									}
									if (local31 == 3327) {
										anIntArray115[local1++] = Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2.aBoolean288 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray115[local1++] = Static174.aBoolean219 && !Static186.aBoolean239 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray115[local1++] = Static137.aBoolean170 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static322.method5358(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = Static101.method1501(local536, local541, false);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = Static101.method1501(local536, local541, true);
										continue;
									}
									if (local31 == 3333) {
										anIntArray115[local1++] = Static282.anInt5588;
										continue;
									}
									if (local31 == 3335) {
										anIntArray115[local1++] = Static230.anInt4634;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local740 = anIntArray115[local1 + 2];
										local391 = anIntArray115[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray115[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray115[local1++] = Static96.anInt1755;
										continue;
									}
									if (local31 == 3338) {
										anIntArray115[local1++] = Static287.method4786();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4713) Class11_Sub4_Sub19 local4713;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local4713 = Static155.method2502(local536);
										aStringArray12[local3++] = local4713.method5329(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local740 = anIntArray115[local1 + 2];
										local391 = anIntArray115[local1 + 3];
										@Pc(4752) Class11_Sub4_Sub19 local4752 = Static155.method2502(local740);
										if (local4752.aChar5 == local536 && local4752.aChar4 == local541) {
											if (local541 == 115) {
												aStringArray12[local3++] = local4752.method5329(local391);
											} else {
												anIntArray115[local1++] = local4752.method5332(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local740 = anIntArray115[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4818) Class11_Sub4_Sub19 local4818 = Static155.method2502(local541);
										if (local4818.aChar4 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray115[local1++] = local4818.method5334(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray115[local1];
										local3--;
										local1696 = aStringArray12[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4713 = Static155.method2502(local536);
										if (local4713.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray115[local1++] = local4713.method5335(local1696) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray115[local1];
										@Pc(4899) Class11_Sub4_Sub19 local4899 = Static155.method2502(local536);
										anIntArray115[local1++] = local4899.aClass58_36.method1010();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static122.anInt2280 == 0) {
											anIntArray115[local1++] = -2;
										} else if (Static122.anInt2280 == 1) {
											anIntArray115[local1++] = -1;
										} else {
											anIntArray115[local1++] = Static20.anInt374;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static122.anInt2280 == 2 && local536 < Static20.anInt374) {
											aStringArray12[local3++] = Static193.aStringArray30[local536];
											if (Static272.aStringArray40[local536] == null) {
												aStringArray12[local3++] = "";
											} else {
												aStringArray12[local3++] = Static272.aStringArray40[local536];
											}
											continue;
										}
										aStringArray12[local3++] = "";
										aStringArray12[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static122.anInt2280 == 2 && local536 < Static20.anInt374) {
											anIntArray115[local1++] = Static16.anIntArray18[local536];
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static122.anInt2280 == 2 && local536 < Static20.anInt374) {
											anIntArray115[local1++] = Static152.anIntArray425[local536];
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray12[local3];
										local1--;
										local541 = anIntArray115[local1];
										Static89.method1295(local348, local541);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray12[local3];
										Static180.method4115(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray12[local3];
										Static254.method4449(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray12[local3];
										Static309.method5230(false, local348);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray12[local3];
										Static234.method3687(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray12[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray115[local1++] = Static51.method733(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static122.anInt2280 == 2 && local536 < Static20.anInt374) {
											aStringArray12[local3++] = Static91.aStringArray16[local536];
											continue;
										}
										aStringArray12[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static244.aString47 == null) {
											aStringArray12[local3++] = "";
										} else {
											aStringArray12[local3++] = Static352.method5667(Static244.aString47);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static244.aString47 == null) {
											anIntArray115[local1++] = 0;
										} else {
											anIntArray115[local1++] = Static19.anInt1985;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static244.aString47 != null && local536 < Static19.anInt1985) {
											aStringArray12[local3++] = Static119.aClass19Array1[local536].aString3;
											continue;
										}
										aStringArray12[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static244.aString47 != null && local536 < Static19.anInt1985) {
											anIntArray115[local1++] = Static119.aClass19Array1[local536].anInt272;
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static244.aString47 != null && local536 < Static19.anInt1985) {
											anIntArray115[local1++] = Static119.aClass19Array1[local536].aByte1;
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray115[local1++] = Static137.aByte23;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray12[local3];
										Static29.method411(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray115[local1++] = Static163.aByte35;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray12[local3];
										Static73.method1122(local348);
										continue;
									}
									if (local31 == 3620) {
										Static196.method3564();
										continue;
									}
									if (local31 == 3621) {
										if (Static122.anInt2280 == 0) {
											anIntArray115[local1++] = -1;
										} else {
											anIntArray115[local1++] = Static264.anInt5400;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static122.anInt2280 != 0 && local536 < Static264.anInt5400) {
											aStringArray12[local3++] = Static110.aStringArray34[local536];
											if (Static348.aStringArray52[local536] == null) {
												aStringArray12[local3++] = "";
											} else {
												aStringArray12[local3++] = Static348.aStringArray52[local536];
											}
											continue;
										}
										aStringArray12[local3++] = "";
										aStringArray12[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray12[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray115[local1++] = Static350.method5660(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static119.aClass19Array1 != null && local536 < Static19.anInt1985 && Static119.aClass19Array1[local536].aString4.equalsIgnoreCase(Static156.aClass67_Sub3_Sub3_Sub2_2.aString50)) {
											anIntArray115[local1++] = 1;
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static333.aString64 == null) {
											aStringArray12[local3++] = "";
										} else {
											aStringArray12[local3++] = Static333.aString64;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static244.aString47 != null && local536 < Static19.anInt1985) {
											aStringArray12[local3++] = Static119.aClass19Array1[local536].aString5;
											continue;
										}
										aStringArray12[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static122.anInt2280 == 2 && local536 >= 0 && local536 < Static20.anInt374) {
											anIntArray115[local1++] = Static87.aBooleanArray9[local536] ? 1 : 0;
											continue;
										}
										anIntArray115[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray12[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray115[local1++] = Static244.method4309(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray115[local1++] = Static212.anInt4349;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray12[local3];
										Static309.method5230(true, local348);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static144.aBooleanArray12[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static244.aString47 != null && local536 < Static19.anInt1985) {
											aStringArray12[local3++] = Static119.aClass19Array1[local536].aString4;
											continue;
										}
										aStringArray12[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray115[local1];
										if (Static122.anInt2280 != 0 && local536 < Static264.anInt5400) {
											aStringArray12[local3++] = Static92.aStringArray11[local536];
											continue;
										}
										aStringArray12[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static124.aClass116Array1[local536].method2558();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static124.aClass116Array1[local536].anInt3024;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static124.aClass116Array1[local536].anInt3026;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static124.aClass116Array1[local536].anInt3025;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static124.aClass116Array1[local536].anInt3018;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = Static124.aClass116Array1[local536].anInt3023;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray115[local1];
										local541 = Static124.aClass116Array1[local536].method2557();
										anIntArray115[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray115[local1];
										local541 = Static124.aClass116Array1[local536].method2557();
										anIntArray115[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray115[local1];
										local541 = Static124.aClass116Array1[local536].method2557();
										anIntArray115[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray115[local1];
										local541 = Static124.aClass116Array1[local536].method2557();
										anIntArray115[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray115[local1];
										anIntArray115[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										local740 = anIntArray115[local1 + 2];
										local391 = anIntArray115[local1 + 3];
										local410 = anIntArray115[local1 + 4];
										anIntArray115[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6073) long local6073;
									@Pc(6066) long local6066;
									if (local31 == 4007) {
										local1 -= 2;
										local6066 = anIntArray115[local1];
										local6073 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = (int) (local6066 + local6066 * local6073 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										if (local536 == 0) {
											anIntArray115[local1++] = 0;
										} else {
											anIntArray115[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										if (local536 == 0) {
											anIntArray115[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray115[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray115[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray115[local1];
										local541 = anIntArray115[local1 + 1];
										anIntArray115[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6066 = anIntArray115[local1];
										local6073 = anIntArray115[local1 + 1];
										@Pc(6379) long local6379 = (long) anIntArray115[local1 + 2];
										anIntArray115[local1++] = (int) (local6066 * local6379 / local6073);
										continue;
									}
								} else {
									@Pc(6918) boolean local6918;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray12[local3];
											local1--;
											local541 = anIntArray115[local1];
											aStringArray12[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray12[local3];
											local1696 = aStringArray12[local3 + 1];
											aStringArray12[local3++] = local348 + local1696;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray12[local3];
											local1--;
											local541 = anIntArray115[local1];
											aStringArray12[local3++] = local348 + Static18.method245(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray12[local3];
											aStringArray12[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray115[local1];
											@Pc(6505) long local6505 = ((long) local536 + 11745L) * 86400000L;
											aCalendar3.setTime(new Date(local6505));
											local391 = aCalendar3.get(5);
											local410 = aCalendar3.get(2);
											local771 = aCalendar3.get(1);
											aStringArray12[local3++] = local391 + "-" + aStringArray14[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray12[local3];
											local1696 = aStringArray12[local3 + 1];
											if (Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2 != null && Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2.aBoolean288) {
												aStringArray12[local3++] = local1696;
												continue;
											}
											aStringArray12[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray115[local1];
											aStringArray12[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray115[local1++] = Static2.method7(aStringArray12[local3 + 1], Static230.anInt4634, aStringArray12[local3]);
											continue;
										}
										@Pc(6637) Class114 local6637;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray12[local3];
											local1 -= 2;
											local541 = anIntArray115[local1];
											local740 = anIntArray115[local1 + 1];
											local6637 = Static22.method310(Static318.aClass144_101, local740);
											anIntArray115[local1++] = local6637.method2474(local541, Static213.aClass97Array17, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray12[local3];
											local1 -= 2;
											local541 = anIntArray115[local1];
											local740 = anIntArray115[local1 + 1];
											local6637 = Static22.method310(Static318.aClass144_101, local740);
											anIntArray115[local1++] = local6637.method2476(Static213.aClass97Array17, local541, local348);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray12[local3];
											local1696 = aStringArray12[local3 + 1];
											local1--;
											if (anIntArray115[local1] == 1) {
												aStringArray12[local3++] = local348;
											} else {
												aStringArray12[local3++] = local1696;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray12[local3];
											aStringArray12[local3++] = Static81.method1211(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray12[local3];
											local1--;
											local541 = anIntArray115[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray12[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray115[local1];
											anIntArray115[local1++] = Static318.method5286((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray115[local1];
											anIntArray115[local1++] = Static203.method3644((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray115[local1];
											anIntArray115[local1++] = Static118.method1783((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray115[local1];
											anIntArray115[local1++] = Static73.method1124((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray12[local3];
											if (local348 == null) {
												anIntArray115[local1++] = 0;
											} else {
												anIntArray115[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray12[local3];
											local1 -= 2;
											local541 = anIntArray115[local1];
											local740 = anIntArray115[local1 + 1];
											aStringArray12[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray12[local3];
											@Pc(6916) StringBuffer local6916 = new StringBuffer(local348.length());
											local6918 = false;
											for (local391 = 0; local391 < local348.length(); local391++) {
												@Pc(6925) char local6925 = local348.charAt(local391);
												if (local6925 == '<') {
													local6918 = true;
												} else if (local6925 == '>') {
													local6918 = false;
												} else if (!local6918) {
													local6916.append(local6925);
												}
											}
											aStringArray12[local3++] = local6916.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray12[local3];
											local1 -= 2;
											local541 = anIntArray115[local1];
											local740 = anIntArray115[local1 + 1];
											anIntArray115[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray12[local3];
											local1696 = aStringArray12[local3 + 1];
											local1--;
											local740 = anIntArray115[local1];
											anIntArray115[local1++] = local348.indexOf(local1696, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray115[local1];
											anIntArray115[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray115[local1];
											anIntArray115[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1067 = anIntArray115[local1] != 0;
											local1--;
											local541 = anIntArray115[local1];
											aStringArray12[local3++] = Static106.method1615(local1067, Static230.anInt4634, 0, (long) local541);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray12[local3];
											local1--;
											local541 = anIntArray115[local1];
											@Pc(7091) Class114 local7091 = Static22.method310(Static318.aClass144_101, local541);
											anIntArray115[local1++] = local7091.method2470(local348, Static213.aClass97Array17);
											continue;
										}
									} else {
										@Pc(7358) Class11_Sub4_Sub6 local7358;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray115[local1];
												aStringArray12[local3++] = Static283.method4717(local536).aString53;
												continue;
											}
											@Pc(7139) Class170 local7139;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												local7139 = Static283.method4717(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray43[local541 - 1] != null) {
													aStringArray12[local3++] = local7139.aStringArray43[local541 - 1];
													continue;
												}
												aStringArray12[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												local7139 = Static283.method4717(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray42[local541 - 1] != null) {
													aStringArray12[local3++] = local7139.aStringArray42[local541 - 1];
													continue;
												}
												aStringArray12[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray115[local1];
												anIntArray115[local1++] = Static283.method4717(local536).anInt5330;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray115[local1];
												anIntArray115[local1++] = Static283.method4717(local536).anInt5333 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7268) Class170 local7268;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray115[local1];
												local7268 = Static283.method4717(local536);
												if (local7268.anInt5337 == -1 && local7268.anInt5335 >= 0) {
													anIntArray115[local1++] = local7268.anInt5335;
													continue;
												}
												anIntArray115[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray115[local1];
												local7268 = Static283.method4717(local536);
												if (local7268.anInt5337 >= 0 && local7268.anInt5335 >= 0) {
													anIntArray115[local1++] = local7268.anInt5335;
													continue;
												}
												anIntArray115[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray115[local1];
												anIntArray115[local1++] = Static283.method4717(local536).aBoolean347 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												local7358 = Static286.method4771(local541);
												if (local7358.method1176()) {
													aStringArray12[local3++] = Static283.method4717(local536).method4539(local7358.aString12, local541);
												} else {
													anIntArray115[local1++] = Static283.method4717(local536).method4537(local541, local7358.anInt1448);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1] - 1;
												local7139 = Static283.method4717(local536);
												if (local7139.anInt5348 == local541) {
													anIntArray115[local1++] = local7139.anInt5344;
												} else if (local7139.anInt5301 == local541) {
													anIntArray115[local1++] = local7139.anInt5290;
												} else {
													anIntArray115[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray12[local3];
												local1--;
												local541 = anIntArray115[local1];
												Static36.method534(local541 == 1, local348);
												anIntArray115[local1++] = Static112.anInt2070;
												continue;
											}
											if (local31 == 4211) {
												if (Static333.aShortArray112 != null && Static34.anInt640 < Static112.anInt2070) {
													anIntArray115[local1++] = Static333.aShortArray112[Static34.anInt640++] & 0xFFFF;
													continue;
												}
												anIntArray115[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static34.anInt640 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												local7358 = Static286.method4771(local541);
												if (local7358.method1176()) {
													aStringArray12[local3++] = Static156.method2516(local536).method1571(local7358.aString12, local541);
												} else {
													anIntArray115[local1++] = Static156.method2516(local536).method1560(local541, local7358.anInt1448);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												local7358 = Static286.method4771(local541);
												if (local7358.method1176()) {
													aStringArray12[local3++] = Static108.method1650(local536).method1638(local7358.aString12, local541);
												} else {
													anIntArray115[local1++] = Static108.method1650(local536).method1640(local7358.anInt1448, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												local7358 = Static286.method4771(local541);
												if (local7358.method1176()) {
													aStringArray12[local3++] = Static299.method5106(local536).method350(local7358.aString12, local541);
												} else {
													anIntArray115[local1++] = Static299.method5106(local536).method356(local541, local7358.anInt1448);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray115[local1];
												@Pc(7666) Class55 local7666 = Static157.method2529(local536);
												if (local7666.anIntArray74 != null && local7666.anIntArray74.length > 0) {
													local740 = 0;
													local391 = local7666.anIntArray75[0];
													for (local410 = 1; local410 < local7666.anIntArray74.length; local410++) {
														if (local7666.anIntArray75[local410] > local391) {
															local740 = local410;
															local391 = local7666.anIntArray75[local410];
														}
													}
													anIntArray115[local1++] = local7666.anIntArray74[local740];
													continue;
												}
												anIntArray115[local1++] = local7666.anInt1202;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray115[local1++] = Static221.anInt4493;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static221.anInt4493 = anIntArray115[local1];
												Static266.anInt5457 = anIntArray115[local1 + 1];
												Static264.anInt5397 = anIntArray115[local1 + 2];
												Static313.aClass11_Sub25_Sub1_5.method2454(234);
												Static313.aClass11_Sub25_Sub1_5.method5186(Static221.anInt4493);
												Static313.aClass11_Sub25_Sub1_5.method5186(Static266.anInt5457);
												Static313.aClass11_Sub25_Sub1_5.method5186(Static264.anInt5397);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local348 = aStringArray12[local3];
												local1696 = aStringArray12[local3 + 1];
												local1 -= 2;
												local740 = anIntArray115[local1];
												local391 = anIntArray115[local1 + 1];
												if (local1696 == null) {
													local1696 = "";
												}
												if (local1696.length() > 80) {
													local1696 = local1696.substring(0, 80);
												}
												Static313.aClass11_Sub25_Sub1_5.method2454(186);
												Static313.aClass11_Sub25_Sub1_5.method5186(Static350.method5658(local348) + Static350.method5658(local1696) + 2);
												Static313.aClass11_Sub25_Sub1_5.method5173(local348);
												Static313.aClass11_Sub25_Sub1_5.method5186(local740 - 1);
												Static313.aClass11_Sub25_Sub1_5.method5186(local391);
												Static313.aClass11_Sub25_Sub1_5.method5173(local1696);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray115[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static24.aStringArray2[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray12[local3++] = local1696;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray115[local1];
												local541 = -1;
												if (local536 < 100 && Static24.aStringArray2[local536] != null) {
													local541 = Static240.anIntArray380[local536];
												}
												anIntArray115[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray115[local1++] = Static266.anInt5457;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray12[local3];
												if (Static248.anInt4969 == 0 && (Static174.aBoolean219 && !Static186.aBoolean239 || Static137.aBoolean170)) {
													continue;
												}
												local1696 = local348.toLowerCase();
												@Pc(7933) byte local7933 = 0;
												if (local1696.startsWith(Static154.aClass117_54.method2684(0))) {
													local7933 = 0;
													local348 = local348.substring(Static154.aClass117_54.method2684(0).length());
												} else if (local1696.startsWith(Static9.aClass117_4.method2684(0))) {
													local7933 = 1;
													local348 = local348.substring(Static9.aClass117_4.method2684(0).length());
												} else if (local1696.startsWith(Static296.aClass117_99.method2684(0))) {
													local7933 = 2;
													local348 = local348.substring(Static296.aClass117_99.method2684(0).length());
												} else if (local1696.startsWith(Static328.aClass117_111.method2684(0))) {
													local7933 = 3;
													local348 = local348.substring(Static328.aClass117_111.method2684(0).length());
												} else if (local1696.startsWith(Static148.aClass117_50.method2684(0))) {
													local7933 = 4;
													local348 = local348.substring(Static148.aClass117_50.method2684(0).length());
												} else if (local1696.startsWith(Static77.aClass117_121.method2684(0))) {
													local7933 = 5;
													local348 = local348.substring(Static77.aClass117_121.method2684(0).length());
												} else if (local1696.startsWith(Static22.aClass117_14.method2684(0))) {
													local7933 = 6;
													local348 = local348.substring(Static22.aClass117_14.method2684(0).length());
												} else if (local1696.startsWith(Static267.aClass117_90.method2684(0))) {
													local7933 = 7;
													local348 = local348.substring(Static267.aClass117_90.method2684(0).length());
												} else if (local1696.startsWith(Static269.aClass117_91.method2684(0))) {
													local7933 = 8;
													local348 = local348.substring(Static269.aClass117_91.method2684(0).length());
												} else if (local1696.startsWith(Static96.aClass117_37.method2684(0))) {
													local7933 = 9;
													local348 = local348.substring(Static96.aClass117_37.method2684(0).length());
												} else if (local1696.startsWith(Static197.aClass117_71.method2684(0))) {
													local7933 = 10;
													local348 = local348.substring(Static197.aClass117_71.method2684(0).length());
												} else if (local1696.startsWith(Static286.aClass117_98.method2684(0))) {
													local7933 = 11;
													local348 = local348.substring(Static286.aClass117_98.method2684(0).length());
												} else if (Static230.anInt4634 != 0) {
													if (local1696.startsWith(Static154.aClass117_54.method2684(Static230.anInt4634))) {
														local7933 = 0;
														local348 = local348.substring(Static154.aClass117_54.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static9.aClass117_4.method2684(Static230.anInt4634))) {
														local7933 = 1;
														local348 = local348.substring(Static9.aClass117_4.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static296.aClass117_99.method2684(Static230.anInt4634))) {
														local7933 = 2;
														local348 = local348.substring(Static296.aClass117_99.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static328.aClass117_111.method2684(Static230.anInt4634))) {
														local7933 = 3;
														local348 = local348.substring(Static328.aClass117_111.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static148.aClass117_50.method2684(Static230.anInt4634))) {
														local7933 = 4;
														local348 = local348.substring(Static148.aClass117_50.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static77.aClass117_121.method2684(Static230.anInt4634))) {
														local7933 = 5;
														local348 = local348.substring(Static77.aClass117_121.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static22.aClass117_14.method2684(Static230.anInt4634))) {
														local7933 = 6;
														local348 = local348.substring(Static22.aClass117_14.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static267.aClass117_90.method2684(Static230.anInt4634))) {
														local7933 = 7;
														local348 = local348.substring(Static267.aClass117_90.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static269.aClass117_91.method2684(Static230.anInt4634))) {
														local7933 = 8;
														local348 = local348.substring(Static269.aClass117_91.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static96.aClass117_37.method2684(Static230.anInt4634))) {
														local7933 = 9;
														local348 = local348.substring(Static96.aClass117_37.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static197.aClass117_71.method2684(Static230.anInt4634))) {
														local7933 = 10;
														local348 = local348.substring(Static197.aClass117_71.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static286.aClass117_98.method2684(Static230.anInt4634))) {
														local7933 = 11;
														local348 = local348.substring(Static286.aClass117_98.method2684(Static230.anInt4634).length());
													}
												}
												local1696 = local348.toLowerCase();
												@Pc(8371) byte local8371 = 0;
												if (local1696.startsWith(Static157.aClass117_56.method2684(0))) {
													local8371 = 1;
													local348 = local348.substring(Static157.aClass117_56.method2684(0).length());
												} else if (local1696.startsWith(Static63.aClass117_23.method2684(0))) {
													local8371 = 2;
													local348 = local348.substring(Static63.aClass117_23.method2684(0).length());
												} else if (local1696.startsWith(Static270.aClass117_93.method2684(0))) {
													local8371 = 3;
													local348 = local348.substring(Static270.aClass117_93.method2684(0).length());
												} else if (local1696.startsWith(Static306.aClass117_102.method2684(0))) {
													local8371 = 4;
													local348 = local348.substring(Static306.aClass117_102.method2684(0).length());
												} else if (local1696.startsWith(Static303.aClass117_84.method2684(0))) {
													local8371 = 5;
													local348 = local348.substring(Static303.aClass117_84.method2684(0).length());
												} else if (Static230.anInt4634 != 0) {
													if (local1696.startsWith(Static157.aClass117_56.method2684(Static230.anInt4634))) {
														local8371 = 1;
														local348 = local348.substring(Static157.aClass117_56.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static63.aClass117_23.method2684(Static230.anInt4634))) {
														local8371 = 2;
														local348 = local348.substring(Static63.aClass117_23.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static270.aClass117_93.method2684(Static230.anInt4634))) {
														local8371 = 3;
														local348 = local348.substring(Static270.aClass117_93.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static306.aClass117_102.method2684(Static230.anInt4634))) {
														local8371 = 4;
														local348 = local348.substring(Static306.aClass117_102.method2684(Static230.anInt4634).length());
													} else if (local1696.startsWith(Static303.aClass117_84.method2684(Static230.anInt4634))) {
														local8371 = 5;
														local348 = local348.substring(Static303.aClass117_84.method2684(Static230.anInt4634).length());
													}
												}
												Static313.aClass11_Sub25_Sub1_5.method2454(46);
												Static313.aClass11_Sub25_Sub1_5.method5186(0);
												local410 = Static313.aClass11_Sub25_Sub1_5.anInt6076;
												Static313.aClass11_Sub25_Sub1_5.method5186(local7933);
												Static313.aClass11_Sub25_Sub1_5.method5186(local8371);
												Static264.method4569(Static313.aClass11_Sub25_Sub1_5, local348);
												Static313.aClass11_Sub25_Sub1_5.method5183(Static313.aClass11_Sub25_Sub1_5.anInt6076 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray12[local3];
												local1696 = aStringArray12[local3 + 1];
												if (Static248.anInt4969 != 0 || (!Static174.aBoolean219 || Static186.aBoolean239) && !Static137.aBoolean170) {
													Static313.aClass11_Sub25_Sub1_5.method2454(57);
													Static313.aClass11_Sub25_Sub1_5.method5186(0);
													local740 = Static313.aClass11_Sub25_Sub1_5.anInt6076;
													Static313.aClass11_Sub25_Sub1_5.method5173(local348);
													Static264.method4569(Static313.aClass11_Sub25_Sub1_5, local1696);
													Static313.aClass11_Sub25_Sub1_5.method5183(Static313.aClass11_Sub25_Sub1_5.anInt6076 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray115[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static329.aStringArray51[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray12[local3++] = local1696;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray115[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static236.aStringArray35[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray12[local3++] = local1696;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray115[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static277.anIntArray426[local536];
												}
												anIntArray115[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static156.aClass67_Sub3_Sub3_Sub2_2 == null || Static156.aClass67_Sub3_Sub3_Sub2_2.aString51 == null) {
													local348 = Static10.aString2;
												} else {
													local348 = Static156.aClass67_Sub3_Sub3_Sub2_2.method4385();
												}
												aStringArray12[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray115[local1++] = Static264.anInt5397;
												continue;
											}
											if (local31 == 5017) {
												anIntArray115[local1++] = Static276.anInt5526;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray115[local1];
												local541 = 0;
												if (local536 < 100 && Static24.aStringArray2[local536] != null) {
													local541 = Static240.anIntArray380[local536];
												}
												anIntArray115[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray115[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static200.aStringArray32[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray12[local3++] = local1696;
												continue;
											}
											if (local31 == 5020) {
												if (Static156.aClass67_Sub3_Sub3_Sub2_2 == null || Static156.aClass67_Sub3_Sub3_Sub2_2.aString51 == null) {
													local348 = Static10.aString2;
												} else {
													local348 = Static156.aClass67_Sub3_Sub3_Sub2_2.method4391();
												}
												aStringArray12[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray115[local1];
												aStringArray12[local3++] = Static222.method3981(local536).aString60;
												continue;
											}
											@Pc(8865) Class11_Sub4_Sub18 local8865;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray115[local1];
												local8865 = Static222.method3981(local536);
												if (local8865.anIntArray501 == null) {
													anIntArray115[local1++] = 0;
												} else {
													anIntArray115[local1++] = local8865.anIntArray501.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												@Pc(8900) Class11_Sub4_Sub18 local8900 = Static222.method3981(local536);
												local391 = local8900.anIntArray501[local541];
												anIntArray115[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray115[local1];
												local8865 = Static222.method3981(local536);
												if (local8865.anIntArray500 == null) {
													anIntArray115[local1++] = 0;
												} else {
													anIntArray115[local1++] = local8865.anIntArray500.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												anIntArray115[local1++] = Static222.method3981(local536).anIntArray500[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray115[local1];
												aStringArray12[local3++] = Static117.method1777(local536).method4593();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray115[local1];
												@Pc(8995) Class11_Sub4_Sub16 local8995 = Static117.method1777(local536);
												if (local8995.anIntArray409 == null) {
													anIntArray115[local1++] = 0;
												} else {
													anIntArray115[local1++] = local8995.anIntArray409.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												anIntArray115[local1++] = Static117.method1777(local536).anIntArray409[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass83_1 = new Class83();
												local1--;
												aClass83_1.anInt1976 = anIntArray115[local1];
												aClass83_1.aClass11_Sub4_Sub16_1 = Static117.method1777(aClass83_1.anInt1976);
												aClass83_1.anIntArray137 = new int[aClass83_1.aClass11_Sub4_Sub16_1.method4601()];
												continue;
											}
											if (local31 == 5059) {
												Static313.aClass11_Sub25_Sub1_5.method2454(143);
												Static313.aClass11_Sub25_Sub1_5.method5186(0);
												local536 = Static313.aClass11_Sub25_Sub1_5.anInt6076;
												Static313.aClass11_Sub25_Sub1_5.method5186(0);
												Static313.aClass11_Sub25_Sub1_5.method5204(aClass83_1.anInt1976);
												aClass83_1.aClass11_Sub4_Sub16_1.method4602(Static313.aClass11_Sub25_Sub1_5, aClass83_1.anIntArray137);
												Static313.aClass11_Sub25_Sub1_5.method5183(Static313.aClass11_Sub25_Sub1_5.anInt6076 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray12[local3];
												Static313.aClass11_Sub25_Sub1_5.method2454(201);
												Static313.aClass11_Sub25_Sub1_5.method5186(0);
												local541 = Static313.aClass11_Sub25_Sub1_5.anInt6076;
												Static313.aClass11_Sub25_Sub1_5.method5173(local348);
												Static313.aClass11_Sub25_Sub1_5.method5204(aClass83_1.anInt1976);
												aClass83_1.aClass11_Sub4_Sub16_1.method4602(Static313.aClass11_Sub25_Sub1_5, aClass83_1.anIntArray137);
												Static313.aClass11_Sub25_Sub1_5.method5183(Static313.aClass11_Sub25_Sub1_5.anInt6076 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static313.aClass11_Sub25_Sub1_5.method2454(143);
												Static313.aClass11_Sub25_Sub1_5.method5186(0);
												local536 = Static313.aClass11_Sub25_Sub1_5.anInt6076;
												Static313.aClass11_Sub25_Sub1_5.method5186(1);
												Static313.aClass11_Sub25_Sub1_5.method5204(aClass83_1.anInt1976);
												aClass83_1.aClass11_Sub4_Sub16_1.method4602(Static313.aClass11_Sub25_Sub1_5, aClass83_1.anIntArray137);
												Static313.aClass11_Sub25_Sub1_5.method5183(Static313.aClass11_Sub25_Sub1_5.anInt6076 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												anIntArray115[local1++] = Static222.method3981(local536).aCharArray4[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												anIntArray115[local1++] = Static222.method3981(local536).aCharArray5[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												if (local541 == -1) {
													anIntArray115[local1++] = -1;
												} else {
													anIntArray115[local1++] = Static222.method3981(local536).method5244((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												if (local541 == -1) {
													anIntArray115[local1++] = -1;
												} else {
													anIntArray115[local1++] = Static222.method3981(local536).method5252((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray115[local1];
												anIntArray115[local1++] = Static117.method1777(local536).method4601();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												local740 = Static117.method1777(local536).method4598(local541);
												anIntArray115[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												aClass83_1.anIntArray137[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												aClass83_1.anIntArray137[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray115[local1];
												local541 = anIntArray115[local1 + 1];
												local740 = anIntArray115[local1 + 2];
												@Pc(9424) Class11_Sub4_Sub16 local9424 = Static117.method1777(local536);
												if (local9424.method4598(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray115[local1++] = local9424.method4600(local541, local740);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray12[local3];
												local1--;
												local1263 = anIntArray115[local1] == 1;
												Static144.method2188(local1263, local348);
												anIntArray115[local1++] = Static112.anInt2070;
												continue;
											}
											if (local31 == 5072) {
												if (Static333.aShortArray112 != null && Static34.anInt640 < Static112.anInt2070) {
													anIntArray115[local1++] = Static333.aShortArray112[Static34.anInt640++] & 0xFFFF;
													continue;
												}
												anIntArray115[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static34.anInt640 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static278.aClass143_20.method4857(86)) {
													anIntArray115[local1++] = 1;
												} else {
													anIntArray115[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static278.aClass143_20.method4857(82)) {
													anIntArray115[local1++] = 1;
												} else {
													anIntArray115[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static278.aClass143_20.method4857(81)) {
													anIntArray115[local1++] = 1;
												} else {
													anIntArray115[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9947) boolean local9947;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static75.method1146(anIntArray115[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray115[local1++] = Static115.method1771();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static277.method4679(-1, anIntArray115[local1], -1, false);
													continue;
												}
												@Pc(9623) Class11_Sub4_Sub7 local9623;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray115[local1];
													local9623 = Static271.method3813(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9623 == null) {
														anIntArray115[local1++] = -1;
													} else {
														anIntArray115[local1++] = local9623.anInt1916;
													}
													continue;
												}
												@Pc(9647) Class11_Sub4_Sub7 local9647;
												if (local31 == 5207) {
													local1--;
													local9647 = Static271.method3817(anIntArray115[local1]);
													if (local9647 != null && local9647.aString19 != null) {
														aStringArray12[local3++] = local9647.aString19;
														continue;
													}
													aStringArray12[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray115[local1++] = Static153.anInt2895;
													anIntArray115[local1++] = Static195.anInt4518;
													continue;
												}
												if (local31 == 5209) {
													anIntArray115[local1++] = Static247.anInt4959 + Static271.anInt4332;
													anIntArray115[local1++] = Static140.anInt2591 + Static271.anInt4339;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray115[local1];
													local9623 = Static271.method3817(local536);
													if (local9623 == null) {
														anIntArray115[local1++] = 0;
														anIntArray115[local1++] = 0;
													} else {
														anIntArray115[local1++] = local9623.anInt1915 >> 14 & 0x3FFF;
														anIntArray115[local1++] = local9623.anInt1915 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray115[local1];
													local9623 = Static271.method3817(local536);
													if (local9623 == null) {
														anIntArray115[local1++] = 0;
														anIntArray115[local1++] = 0;
													} else {
														anIntArray115[local1++] = local9623.anInt1925 - local9623.anInt1921;
														anIntArray115[local1++] = local9623.anInt1914 - local9623.anInt1920;
													}
													continue;
												}
												@Pc(9789) Class11_Sub8 local9789;
												if (local31 == 5212) {
													local9789 = Static76.method4700();
													if (local9789 == null) {
														anIntArray115[local1++] = -1;
														anIntArray115[local1++] = -1;
													} else {
														anIntArray115[local1++] = local9789.anInt863;
														local541 = local9789.anInt866 << 28 | local9789.anInt864 + Static271.anInt4332 << 14 | local9789.anInt868 + Static271.anInt4339;
														anIntArray115[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9789 = Static49.method710();
													if (local9789 == null) {
														anIntArray115[local1++] = -1;
														anIntArray115[local1++] = -1;
													} else {
														anIntArray115[local1++] = local9789.anInt863;
														local541 = local9789.anInt866 << 28 | local9789.anInt864 + Static271.anInt4332 << 14 | local9789.anInt868 + Static271.anInt4339;
														anIntArray115[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray115[local1];
													local9623 = Static82.method1215();
													if (local9623 != null) {
														local6918 = local9623.method1584(anIntArray116, local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF);
														if (local6918) {
															Static19.method1623(anIntArray116[1], anIntArray116[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray115[local1];
													local541 = anIntArray115[local1 + 1];
													@Pc(9945) Class74 local9945 = Static271.method3804(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9947 = false;
													for (@Pc(9952) Class11_Sub4_Sub7 local9952 = (Class11_Sub4_Sub7) local9945.method1294(); local9952 != null; local9952 = (Class11_Sub4_Sub7) local9945.method1288()) {
														if (local9952.anInt1916 == local541) {
															local9947 = true;
															break;
														}
													}
													if (local9947) {
														anIntArray115[local1++] = 1;
													} else {
														anIntArray115[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray115[local1];
													local9623 = Static271.method3817(local536);
													if (local9623 == null) {
														anIntArray115[local1++] = -1;
													} else {
														anIntArray115[local1++] = local9623.anInt1917;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray115[local1++] = Static145.anInt2660 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray115[local1];
													Static19.method1623(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9647 = Static82.method1215();
													if (local9647 == null) {
														anIntArray115[local1++] = -1;
														anIntArray115[local1++] = -1;
													} else {
														local1263 = local9647.method1590(anIntArray116, Static247.anInt4959 + Static271.anInt4332, Static140.anInt2591 + Static271.anInt4339);
														if (local1263) {
															anIntArray115[local1++] = anIntArray116[1];
															anIntArray115[local1++] = anIntArray116[2];
														} else {
															anIntArray115[local1++] = -1;
															anIntArray115[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray115[local1];
													local541 = anIntArray115[local1 + 1];
													Static277.method4679(local541 >> 14 & 0x3FFF, local536, local541 & 0x3FFF, false);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray115[local1];
													local9623 = Static82.method1215();
													if (local9623 == null) {
														anIntArray115[local1++] = -1;
														anIntArray115[local1++] = -1;
													} else {
														local6918 = local9623.method1584(anIntArray116, local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF);
														if (local6918) {
															anIntArray115[local1++] = anIntArray116[1];
															anIntArray115[local1++] = anIntArray116[2];
														} else {
															anIntArray115[local1++] = -1;
															anIntArray115[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray115[local1];
													local9623 = Static82.method1215();
													if (local9623 == null) {
														anIntArray115[local1++] = -1;
														anIntArray115[local1++] = -1;
													} else {
														local6918 = local9623.method1590(anIntArray116, local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
														if (local6918) {
															anIntArray115[local1++] = anIntArray116[1];
															anIntArray115[local1++] = anIntArray116[2];
														} else {
															anIntArray115[local1++] = -1;
															anIntArray115[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static25.method5362(anIntArray115[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray115[local1];
													local541 = anIntArray115[local1 + 1];
													Static277.method4679(local541 >> 14 & 0x3FFF, local536, local541 & 0x3FFF, true);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static292.aBoolean370 = anIntArray115[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray115[local1++] = Static292.aBoolean370 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray115[local1];
													Static200.method3603(local536);
													continue;
												}
												@Pc(10363) Class11 local10363;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray115[local1];
													local1263 = anIntArray115[local1 + 1] == 1;
													if (Static303.aClass58_29 == null) {
														continue;
													}
													local10363 = Static303.aClass58_29.method1009((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method5701();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class11();
														Static303.aClass58_29.method1006((long) local536, local10363);
													}
													continue;
												}
												@Pc(10402) Class11 local10402;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray115[local1];
													if (Static303.aClass58_29 == null) {
														anIntArray115[local1++] = 0;
													} else {
														local10402 = Static303.aClass58_29.method1009((long) local536);
														anIntArray115[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray115[local1];
													local1263 = anIntArray115[local1 + 1] == 1;
													if (Static253.aClass58_30 == null) {
														continue;
													}
													local10363 = Static253.aClass58_30.method1009((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method5701();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class11();
														Static253.aClass58_30.method1006((long) local536, local10363);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray115[local1];
													if (Static253.aClass58_30 == null) {
														anIntArray115[local1++] = 0;
													} else {
														local10402 = Static253.aClass58_30.method1009((long) local536);
														anIntArray115[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray115[local1++] = Static271.aClass11_Sub4_Sub7_2 == null ? -1 : Static271.aClass11_Sub4_Sub7_2.anInt1916;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray115[local1];
													local541 = anIntArray115[local1 + 1];
													Static226.method4030(local536, false, 3, local541);
													anIntArray115[local1++] = Static29.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static29.aFrame1 != null) {
														Static226.method4030(-1, false, Static70.anInt1316, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10565) Class53[] local10565 = Static34.method511();
													anIntArray115[local1++] = local10565.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray115[local1];
													@Pc(10583) Class53[] local10583 = Static34.method511();
													anIntArray115[local1++] = local10583[local536].anInt1148;
													anIntArray115[local1++] = local10583[local536].anInt1146;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static9.anInt151;
													local541 = Static285.anInt5644;
													local740 = -1;
													@Pc(10612) Class53[] local10612 = Static34.method511();
													for (local410 = 0; local410 < local10612.length; local410++) {
														@Pc(10619) Class53 local10619 = local10612[local410];
														if (local10619.anInt1148 == local536 && local10619.anInt1146 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray115[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray115[local1++] = Static104.method1587();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray115[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static226.method4030(-1, false, local536, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray115[local1++] = Static70.anInt1316;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray115[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static70.anInt1316 = local536;
														Static38.method553(Static77.aClass118_7);
													}
													continue;
												}
											} else {
												@Pc(11074) String local11074;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray12[local3];
														local1696 = aStringArray12[local3 + 1];
														local1--;
														local740 = anIntArray115[local1];
														Static313.aClass11_Sub25_Sub1_5.method2454(141);
														Static313.aClass11_Sub25_Sub1_5.method5186(Static350.method5658(local348) + Static350.method5658(local1696) + 1);
														Static313.aClass11_Sub25_Sub1_5.method5173(local348);
														Static313.aClass11_Sub25_Sub1_5.method5173(local1696);
														Static313.aClass11_Sub25_Sub1_5.method5186(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static84.aShortArray41[anIntArray115[local1]] = (short) Static90.method4106(anIntArray115[local1 + 1]);
														Static119.method1795();
														Static193.method3530();
														Static231.method4369();
														Static340.method4781();
														Static239.method4236();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static131.anIntArrayArrayArray10[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1] << 1;
														local740 = anIntArray115[local1 + 2];
														local391 = anIntArray115[local1 + 3];
														local410 = anIntArray115[local1 + 4];
														local771 = anIntArray115[local1 + 5];
														@Pc(10860) int local10860 = anIntArray115[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static131.anIntArrayArrayArray10[local536] != null && local541 >= 0 && local541 < Static131.anIntArrayArrayArray10[local536].length) {
															Static131.anIntArrayArrayArray10[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10860 };
															Static131.anIntArrayArrayArray10[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static131.anIntArrayArrayArray10[anIntArray115[local1]].length >> 1;
														anIntArray115[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static29.aFrame1 != null) {
															Static226.method4030(-1, false, Static70.anInt1316, -1);
														}
														if (Static241.aFrame2 == null) {
															local348 = Static258.aString52 == null ? Static194.method3136() : Static258.aString52;
															Static30.method430(false, Static77.aClass118_7, Static74.anInt1413 == 1, local348);
														} else {
															Static62.method919();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static253.aClass2_8 != null) {
															if (Static253.aClass2_8.anObject1 == null) {
																local348 = Static142.method2181(Static253.aClass2_8.anInt7);
															} else {
																local348 = (String) Static253.aClass2_8.anObject1;
															}
														}
														aStringArray12[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray115[local1++] = Static167.anInt3322 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static29.aFrame1 != null) {
															Static226.method4030(-1, false, Static70.anInt1316, -1);
														}
														local3--;
														local348 = aStringArray12[local3];
														local1--;
														local1263 = anIntArray115[local1] == 1;
														local11074 = Static194.method3136() + local348;
														Static30.method430(local1263, Static77.aClass118_7, Static74.anInt1413 == 1, local11074);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray12[local3];
														local1696 = aStringArray12[local3 + 1];
														local1--;
														local740 = anIntArray115[local1];
														if (local348.length() > 0) {
															if (Static272.aStringArray41 == null) {
																Static272.aStringArray41 = new String[Static203.anIntArray323[Static68.anInt1264]];
															}
															Static272.aStringArray41[local740] = local348;
														}
														if (local1696.length() > 0) {
															if (Static192.aStringArray29 == null) {
																Static192.aStringArray29 = new String[Static203.anIntArray323[Static68.anInt1264]];
															}
															Static192.aStringArray29[local740] = local1696;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray12[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static240.anInt4836 = anIntArray115[local1];
														Static248.anInt4968 = anIntArray115[local1 + 1];
														Static166.anInt3314 = anIntArray115[local1 + 2];
														Static276.anInt5527 = anIntArray115[local1 + 3];
														Static87.anInt1556 = anIntArray115[local1 + 4];
														Static72.anInt1376 = anIntArray115[local1 + 5];
														Static72.anInt1377 = anIntArray115[local1 + 6];
														Static210.anInt4269 = anIntArray115[local1 + 7];
														Static351.anInt6344 = anIntArray115[local1 + 8];
														Static192.anInt3946 = anIntArray115[local1 + 9];
														Static352.anInt6699 = anIntArray115[local1 + 10];
														Static182.aClass144_49.method3910(Static87.anInt1556);
														Static182.aClass144_49.method3910(Static72.anInt1376);
														Static182.aClass144_49.method3910(Static72.anInt1377);
														Static182.aClass144_49.method3910(Static210.anInt4269);
														Static182.aClass144_49.method3910(Static351.anInt6344);
														Static259.aClass97_17 = null;
														Static341.aClass97_22 = null;
														Static198.aClass97_15 = null;
														Static35.aClass97_4 = null;
														Static191.aClass97_21 = null;
														Static67.aClass97_10 = null;
														Static305.aClass97_20 = null;
														Static311.aClass97_3 = null;
														Static206.aBoolean282 = true;
														continue;
													}
													if (local31 == 5425) {
														Static92.method1348();
														Static206.aBoolean282 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static294.anInt5815 = anIntArray115[local1];
														Static85.anInt1528 = anIntArray115[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static282.anInt5589 = anIntArray115[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														anIntArray115[local1++] = Static227.method4031(local536, local541) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static346.method5618(false, aStringArray12[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														local391 = anIntArray115[local1 + 3];
														Static196.method3563(local740, (local536 & 0x3FFF) - Static169.anInt6312, (local536 >> 14 & 0x3FFF) - Static182.anInt3662, local541, false, local391);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														local391 = anIntArray115[local1 + 3];
														Static267.method4623(local740, (local536 & 0x3FFF) - Static169.anInt6312, (local536 >> 14 & 0x3FFF) - Static182.anInt3662, local391, local541);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray115[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static22.anInt416 = local536;
														local541 = anIntArray115[local1 + 1];
														if (local541 + 1 >= Static131.anIntArrayArrayArray10[Static22.anInt416].length >> 1) {
															throw new RuntimeException();
														}
														Static199.anInt4036 = local541;
														Static274.anInt5510 = 0;
														Static207.anInt4247 = anIntArray115[local1 + 2];
														Static200.anInt4121 = anIntArray115[local1 + 3];
														local740 = anIntArray115[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static204.anInt4169 = local740;
														local391 = anIntArray115[local1 + 5];
														if (local391 + 1 >= Static131.anIntArrayArrayArray10[Static204.anInt4169].length >> 1) {
															throw new RuntimeException();
														}
														Static144.anInt2608 = local391;
														Static81.anInt1498 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static49.method712();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static195.method3968(anIntArray115[local1 + 1], anIntArray115[local1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray115[local1++] = (int) Static21.aFloat10 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray115[local1++] = (int) Static246.aFloat51 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static113.method1753();
														continue;
													}
													if (local31 == 5508) {
														Static240.method4243();
														continue;
													}
													if (local31 == 5509) {
														Static226.method4028();
														continue;
													}
													if (local31 == 5510) {
														Static118.method1785();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray115[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static182.anInt3662;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static24.anInt454) {
															local541 = Static24.anInt454;
														}
														local740 -= Static169.anInt6312;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static240.anInt4832) {
															local740 = Static240.anInt4832;
														}
														Static283.anInt5592 = local541 * 128 + 64;
														Static352.anInt6703 = local740 * 128 + 64;
														Static81.anInt1498 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static215.method3872();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray12[local3];
														local1696 = aStringArray12[local3 + 1];
														local1--;
														local740 = anIntArray115[local1];
														if (Static245.anInt6561 == 10 && Static107.anInt2025 == 0 && Static262.anInt5359 == 0 && Static136.anInt6476 == 0 && Static59.anInt1131 == 0) {
															Static24.method354(local1696, local348, local740);
														}
														continue;
													}
													if (local31 == 5601) {
														Static316.method5284();
														continue;
													}
													if (local31 == 5602) {
														if (Static262.anInt5359 == 0) {
															Static243.anInt6755 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static245.anInt6561 == 10 && Static107.anInt2025 == 0 && Static262.anInt5359 == 0 && Static136.anInt6476 == 0 && Static59.anInt1131 == 0) {
															Static350.method5657(anIntArray115[local1 + 2], anIntArray115[local1 + 1], anIntArray115[local1], anIntArray115[local1 + 3]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static245.anInt6561 == 10 && Static107.anInt2025 == 0 && Static262.anInt5359 == 0 && Static136.anInt6476 == 0 && Static59.anInt1131 == 0) {
															Static257.method4464(Static114.method1765(aStringArray12[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static245.anInt6561 == 10 && Static107.anInt2025 == 0 && Static262.anInt5359 == 0 && Static136.anInt6476 == 0 && Static59.anInt1131 == 0) {
															Static188.method3468(anIntArray115[local1], anIntArray115[local1 + 5] == 1, anIntArray115[local1 + 2], aStringArray12[local3 + 2], aStringArray12[local3 + 1], anIntArray115[local1 + 6] == 1, Static114.method1765(aStringArray12[local3]), anIntArray115[local1 + 3], anIntArray115[local1 + 1], anIntArray115[local1 + 4] == 1);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static136.anInt6476 == 0) {
															Static90.anInt4649 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray115[local1++] = Static243.anInt6755;
														continue;
													}
													if (local31 == 5608) {
														anIntArray115[local1++] = Static99.anInt820;
														continue;
													}
													if (local31 == 5609) {
														anIntArray115[local1++] = Static90.anInt4649;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray12[local3++] = Static300.aStringArray49.length > local536 ? Static352.method5667(Static300.aStringArray49[local536]) : "";
														}
														Static300.aStringArray49 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray115[local1++] = Static236.anInt4752;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static37.anInt693 = local536;
														Static59.method897();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static195.method3970(anIntArray115[local1] == 1);
														Static154.method2471();
														Static59.method897();
														Static76.method4698();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static147.aBoolean182 = anIntArray115[local1] == 1;
														Static76.method4698();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static280.aBoolean11 = anIntArray115[local1] == 1;
														Static59.method897();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static39.aBoolean43 = anIntArray115[local1] == 1;
														Static107.aClass129_4.method4919(!Static39.aBoolean43);
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static54.anInt1026 = anIntArray115[local1];
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static347.aBoolean422 = anIntArray115[local1] == 1;
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static107.aBoolean127 = anIntArray115[local1] == 1;
														Static59.method897();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static190.aBoolean248 = anIntArray115[local1] == 1;
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static103.anInt1883 = local536;
														Static59.method897();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static52.aBoolean313 = anIntArray115[local1] == 1;
														Static111.method1665();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static36.aBoolean36 = anIntArray115[local1] == 1;
														Static59.method897();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static117.aBoolean145 = anIntArray115[local1] == 1;
														Static59.method897();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static82.anInt1504 = local536;
														Static119.method1791();
														Static38.method553(Static77.aClass118_7);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static210.aBoolean289 = anIntArray115[local1] == 1;
														Static293.method4878();
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static289.anInt5719 = local536;
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static249.anInt4975) {
															if (Static249.anInt4975 == 0 && Static43.anInt850 != -1) {
																Static7.method65(local536, Static135.aClass144_38, Static43.anInt850);
																Static120.aBoolean103 = false;
															} else if (local536 == 0) {
																Static223.method3982();
																Static120.aBoolean103 = false;
															} else {
																Static343.method5592(local536);
															}
															Static249.anInt4975 = local536;
														}
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static326.anInt5865 = local536;
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static115.aBoolean144 = anIntArray115[local1] == 1;
														Static76.method4698();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray115[local1];
														local1263 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static355.anInt6753 < 96) {
															local536 = 0;
															local1263 = true;
														}
														Static3.method14(local536);
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														anIntArray115[local1++] = local1263 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static17.anInt285 = local536;
														Static38.method553(Static77.aClass118_7);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0 || local536 > Static239.method4232(Static355.anInt6753)) {
															local536 = 0;
														}
														Static344.anInt6591 = local536;
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static206.method3695(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static79.aBoolean341 = anIntArray115[local1] != 0;
														Static38.method553(Static77.aClass118_7);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static54.anInt1026 = anIntArray115[local1];
														Static38.method553(Static77.aClass118_7);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static55.aBoolean65 = anIntArray115[local1] != 0;
														Static38.method553(Static77.aClass118_7);
														Static59.method897();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static156.method2520(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static276.anInt5525 = local536;
														Static38.method553(Static77.aClass118_7);
														Static212.aBoolean292 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local536 = anIntArray115[local1];
														if (local536 < 0 || local536 > 4) {
															local536 = 2;
														}
														Static150.anInt2727 = local536;
														Static38.method553(Static77.aClass118_7);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray115[local1++] = Static37.anInt693;
														continue;
													}
													if (local31 == 6102) {
														anIntArray115[local1++] = Static283.method4712() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray115[local1++] = Static147.aBoolean182 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray115[local1++] = Static280.aBoolean11 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray115[local1++] = Static39.aBoolean43 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray115[local1++] = Static54.anInt1026;
														continue;
													}
													if (local31 == 6108) {
														anIntArray115[local1++] = Static347.aBoolean422 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray115[local1++] = Static107.aBoolean127 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray115[local1++] = Static190.aBoolean248 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray115[local1++] = Static103.anInt1883;
														continue;
													}
													if (local31 == 6112) {
														anIntArray115[local1++] = Static52.aBoolean313 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray115[local1++] = Static36.aBoolean36 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray115[local1++] = Static117.aBoolean145 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray115[local1++] = Static82.anInt1504;
														continue;
													}
													if (local31 == 6117) {
														anIntArray115[local1++] = Static210.aBoolean289 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray115[local1++] = Static289.anInt5719;
														continue;
													}
													if (local31 == 6119) {
														anIntArray115[local1++] = Static249.anInt4975;
														continue;
													}
													if (local31 == 6120) {
														anIntArray115[local1++] = Static326.anInt5865;
														continue;
													}
													if (local31 == 6121) {
														anIntArray115[local1++] = Static107.aClass129_4.method4992() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray115[local1++] = Static59.method895();
														continue;
													}
													if (local31 == 6124) {
														anIntArray115[local1++] = Static17.anInt285;
														continue;
													}
													if (local31 == 6125) {
														anIntArray115[local1++] = Static344.anInt6591;
														continue;
													}
													if (local31 == 6126) {
														anIntArray115[local1++] = Static107.aClass129_4.method5017() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray115[local1++] = Static193.aBoolean250 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray115[local1++] = Static79.aBoolean341 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray115[local1++] = Static54.anInt1026;
														continue;
													}
													if (local31 == 6130) {
														anIntArray115[local1++] = Static55.aBoolean65 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray115[local1++] = Static74.anInt1413;
														continue;
													}
													if (local31 == 6132) {
														anIntArray115[local1++] = Static276.anInt5525;
														continue;
													}
													if (local31 == 6133) {
														anIntArray115[local1++] = Static167.anInt3322 == 1 || Static167.anInt3322 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray115[local1++] = Static239.method4232(Static355.anInt6753);
														continue;
													}
													if (local31 == 6135) {
														anIntArray115[local1++] = Static150.anInt2727;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static184.aShort60 = (short) anIntArray115[local1];
														if (Static184.aShort60 <= 0) {
															Static184.aShort60 = 256;
														}
														Static111.aShort11 = (short) anIntArray115[local1 + 1];
														if (Static111.aShort11 <= 0) {
															Static111.aShort11 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static72.aShort6 = (short) anIntArray115[local1];
														if (Static72.aShort6 <= 0) {
															Static72.aShort6 = 256;
														}
														Static219.aShort66 = (short) anIntArray115[local1 + 1];
														if (Static219.aShort66 <= 0) {
															Static219.aShort66 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static348.aShort95 = (short) anIntArray115[local1];
														if (Static348.aShort95 <= 0) {
															Static348.aShort95 = 1;
														}
														Static180.aShort67 = (short) anIntArray115[local1 + 1];
														if (Static180.aShort67 <= 0) {
															Static180.aShort67 = 32767;
														} else if (Static180.aShort67 < Static348.aShort95) {
															Static180.aShort67 = Static348.aShort95;
														}
														Static285.aShort77 = (short) anIntArray115[local1 + 2];
														if (Static285.aShort77 <= 0) {
															Static285.aShort77 = 1;
														}
														Static252.aShort83 = (short) anIntArray115[local1 + 3];
														if (Static252.aShort83 <= 0) {
															Static252.aShort83 = 32767;
														} else if (Static252.aShort83 < Static285.aShort77) {
															Static252.aShort83 = Static285.aShort77;
														}
														continue;
													}
													if (local31 == 6203) {
														Static325.method1026(0, 0, Static188.aClass137_11.anInt4110, Static188.aClass137_11.anInt4060, false);
														anIntArray115[local1++] = Static169.anInt6315;
														anIntArray115[local1++] = Static289.anInt5731;
														continue;
													}
													if (local31 == 6204) {
														anIntArray115[local1++] = Static72.aShort6;
														anIntArray115[local1++] = Static219.aShort66;
														continue;
													}
													if (local31 == 6205) {
														anIntArray115[local1++] = Static184.aShort60;
														anIntArray115[local1++] = Static111.aShort11;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray115[local1++] = (int) (Static268.method4627() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray115[local1++] = (int) (Static268.method4627() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														aCalendar3.clear();
														aCalendar3.set(11, 12);
														aCalendar3.set(local740, local541, local536);
														anIntArray115[local1++] = (int) (aCalendar3.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar3.clear();
														aCalendar3.setTime(new Date(Static268.method4627()));
														anIntArray115[local1++] = aCalendar3.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray115[local1];
														local1263 = true;
														if (local536 < 0) {
															local1263 = (local536 + 1) % 4 == 0;
														} else if (local536 < 1582) {
															local1263 = local536 % 4 == 0;
														} else if (local536 % 4 != 0) {
															local1263 = false;
														} else if (local536 % 100 != 0) {
															local1263 = true;
														} else if (local536 % 400 != 0) {
															local1263 = false;
														}
														anIntArray115[local1++] = local1263 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray115[local1++] = Static254.method4447() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray115[local1++] = Static214.method3859() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static245.anInt6561 == 10 && Static107.anInt2025 == 0 && Static262.anInt5359 == 0 && Static136.anInt6476 == 0) {
															anIntArray115[local1++] = Static258.method4484() == -1 ? 0 : 1;
															continue;
														}
														anIntArray115[local1++] = 1;
														continue;
													}
													@Pc(13379) Class158 local13379;
													@Pc(13355) Class157_Sub1 local13355;
													if (local31 == 6501) {
														local13355 = Static29.method412();
														if (local13355 == null) {
															anIntArray115[local1++] = -1;
															anIntArray115[local1++] = 0;
															aStringArray12[local3++] = "";
															anIntArray115[local1++] = 0;
															aStringArray12[local3++] = "";
															anIntArray115[local1++] = 0;
															anIntArray115[local1++] = 0;
														} else {
															anIntArray115[local1++] = local13355.anInt4799;
															anIntArray115[local1++] = local13355.anInt4784;
															aStringArray12[local3++] = local13355.aString44;
															local13379 = local13355.method4215();
															anIntArray115[local1++] = local13379.anInt4941;
															aStringArray12[local3++] = local13379.aString48;
															anIntArray115[local1++] = local13355.anInt4794;
															anIntArray115[local1++] = local13355.anInt4798;
														}
														continue;
													}
													if (local31 == 6502) {
														local13355 = Static147.method2251();
														if (local13355 == null) {
															anIntArray115[local1++] = -1;
															anIntArray115[local1++] = 0;
															aStringArray12[local3++] = "";
															anIntArray115[local1++] = 0;
															aStringArray12[local3++] = "";
															anIntArray115[local1++] = 0;
															anIntArray115[local1++] = 0;
														} else {
															anIntArray115[local1++] = local13355.anInt4799;
															anIntArray115[local1++] = local13355.anInt4784;
															aStringArray12[local3++] = local13355.aString44;
															local13379 = local13355.method4215();
															anIntArray115[local1++] = local13379.anInt4941;
															aStringArray12[local3++] = local13379.aString48;
															anIntArray115[local1++] = local13355.anInt4794;
															anIntArray115[local1++] = local13355.anInt4798;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray115[local1];
														if (Static245.anInt6561 == 10 && Static107.anInt2025 == 0 && Static262.anInt5359 == 0 && Static136.anInt6476 == 0) {
															anIntArray115[local1++] = Static105.method1609(local536) ? 1 : 0;
															continue;
														}
														anIntArray115[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static104.anInt1926 = anIntArray115[local1];
														Static38.method553(Static77.aClass118_7);
														continue;
													}
													if (local31 == 6505) {
														anIntArray115[local1++] = Static104.anInt1926;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray115[local1];
														@Pc(13599) Class157_Sub1 local13599 = Static61.method915(local536);
														if (local13599 == null) {
															anIntArray115[local1++] = -1;
															aStringArray12[local3++] = "";
															anIntArray115[local1++] = 0;
															aStringArray12[local3++] = "";
															anIntArray115[local1++] = 0;
															anIntArray115[local1++] = 0;
														} else {
															anIntArray115[local1++] = local13599.anInt4784;
															aStringArray12[local3++] = local13599.aString44;
															@Pc(13617) Class158 local13617 = local13599.method4215();
															anIntArray115[local1++] = local13617.anInt4941;
															aStringArray12[local3++] = local13617.aString48;
															anIntArray115[local1++] = local13599.anInt4794;
															anIntArray115[local1++] = local13599.anInt4798;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray115[local1];
														local1263 = anIntArray115[local1 + 1] == 1;
														local740 = anIntArray115[local1 + 2];
														local9947 = anIntArray115[local1 + 3] == 1;
														Static318.method5287(local9947, local536, local740, local1263);
														continue;
													}
													if (local31 == 6508) {
														Static338.method5541();
														continue;
													}
													if (local31 == 6509) {
														if (Static245.anInt6561 == 10) {
															local1--;
															if (anIntArray115[local1] == 1) {
																if (Static232.aClass133_1 == null) {
																	Static232.aClass133_1 = new Class133();
																}
															} else if (Static232.aClass133_1 != null) {
																Static232.aClass133_1.method3561();
																Static232.aClass133_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static210.aBoolean290 = anIntArray115[local1] == 1;
														Static38.method553(Static77.aClass118_7);
														continue;
													}
													if (local31 == 6601) {
														anIntArray115[local1++] = Static210.aBoolean290 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static156.anInt2987 == 2) {
													if (local31 == 6700) {
														local536 = Static197.aClass58_18.method1010();
														if (Static270.anInt5491 != -1) {
															local536++;
														}
														anIntArray115[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray115[local1];
														if (Static270.anInt5491 != -1) {
															if (local536 == 0) {
																anIntArray115[local1++] = Static270.anInt5491;
																continue;
															}
															local536--;
														}
														local3541 = (Class11_Sub41) Static197.aClass58_18.method1008();
														while (local536-- > 0) {
															local3541 = (Class11_Sub41) Static197.aClass58_18.method1004();
														}
														anIntArray115[local1++] = local3541.anInt6364;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray115[local1];
														if (Static188.aClass137ArrayArray1[local536] == null) {
															aStringArray12[local3++] = "";
														} else {
															local1696 = Static188.aClass137ArrayArray1[local536][0].aString35;
															if (local1696 == null) {
																aStringArray12[local3++] = "";
															} else {
																aStringArray12[local3++] = local1696.substring(0, local1696.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray115[local1];
														if (Static188.aClass137ArrayArray1[local536] == null) {
															anIntArray115[local1++] = 0;
														} else {
															anIntArray115[local1++] = Static188.aClass137ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														if (Static188.aClass137ArrayArray1[local536] == null) {
															aStringArray12[local3++] = "";
														} else {
															local11074 = Static188.aClass137ArrayArray1[local536][local541].aString35;
															if (local11074 == null) {
																aStringArray12[local3++] = "";
															} else {
																aStringArray12[local3++] = local11074;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														if (Static188.aClass137ArrayArray1[local536] == null) {
															anIntArray115[local1++] = 0;
														} else {
															anIntArray115[local1++] = Static188.aClass137ArrayArray1[local536][local541].anInt4082;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 1, "", local740);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 2, "", local740);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 3, "", local740);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 4, "", local740);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 5, "", local740);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 6, "", local740);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 7, "", local740);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 8, "", local740);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 9, "", local740);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														Static260.method4524(local536 << 16 | local541, 10, "", local740);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray115[local1];
														local541 = anIntArray115[local1 + 1];
														local740 = anIntArray115[local1 + 2];
														local750 = Static188.method3467(local536 << 16 | local541, local740);
														Static129.method1989();
														@Pc(14344) Class11_Sub36 local14344 = Static42.method634(local750);
														Static110.method3647(local14344.anInt5607, local536 << 16 | local541, local750.anInt4043, local750.anInt4068, local740, local14344.method4727());
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14377) Class23 local14377;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray115[local1];
														local14377 = Static212.method3827(local536);
														if (local14377.aString7 == null) {
															aStringArray12[local3++] = "";
														} else {
															aStringArray12[local3++] = local14377.aString7;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray115[local1];
														local14377 = Static212.method3827(local536);
														anIntArray115[local1++] = local14377.anInt303;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray115[local1];
														local14377 = Static212.method3827(local536);
														anIntArray115[local1++] = local14377.anInt299;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray115[local1];
														local14377 = Static212.method3827(local536);
														anIntArray115[local1++] = local14377.anInt297;
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
		} catch (@Pc(14456) Exception local14456) {
			@Pc(14474) StringBuffer local14474;
			if (arg0.aString33 == null) {
				local14474 = new StringBuffer(30);
				local14474.append("CS2: ").append(arg0.aLong215).append(" ");
				for (local536 = anInt1652 - 1; local536 >= 0; local536--) {
					local14474.append("v: ").append(aClass36Array1[local536].aClass11_Sub4_Sub9_1.aLong215).append(" ");
				}
				local14474.append("op: ").append(local13);
				Static38.method554(local14456, local14474.toString());
			} else {
				Static17.method228("Clientscript error in: " + arg0.aString33);
				local14474 = new StringBuffer(30);
				local14474.append("Clientscript error in: ").append(arg0.aString33).append("\n");
				for (local536 = anInt1652 - 1; local536 >= 0; local536--) {
					local14474.append("via: ").append(aClass36Array1[local536].aClass11_Sub4_Sub9_1.aString33).append("\n");
				}
				local14474.append("Op: ").append(local13).append("\n");
				local1696 = local14456.getMessage();
				if (local1696 != null && local1696.length() > 0) {
					local14474.append("Message: ").append(local1696).append("\n");
				}
				Static38.method554(local14456, local14474.toString());
				Static129.method1991(local14474.toString());
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ff;)V")
	public static void method1353(@OriginalArg(0) Class11_Sub13 arg0) {
		method1354(arg0, 200000);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ff;I)V")
	private static void method1354(@OriginalArg(0) Class11_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class11_Sub4_Sub9 local12 = Static150.method2271(local8);
		if (local12 == null) {
			return;
		}
		anIntArray114 = new int[local12.anInt3360];
		@Pc(21) int local21 = 0;
		aStringArray13 = new String[local12.anInt3358];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1535;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1537;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass137_5 == null ? -1 : arg0.aClass137_5.anInt4044;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1543;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass137_5 == null ? -1 : arg0.aClass137_5.anInt4095;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass137_6 == null ? -1 : arg0.aClass137_6.anInt4044;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass137_6 == null ? -1 : arg0.aClass137_6.anInt4095;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1540;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1538;
				}
				anIntArray114[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString13;
				}
				aStringArray13[local27++] = local135;
			}
		}
		method1352(local12, arg1);
	}
}
