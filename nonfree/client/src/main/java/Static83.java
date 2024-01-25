import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!bi;")
	private static Class26 aClass26_15;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "[I")
	private static int[] anIntArray290;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!ip;")
	private static Class106 aClass106_1;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "Lclient!bi;")
	private static Class26 aClass26_16;

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray21;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
	private static int anInt2156 = 0;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
	private static final int[] anIntArray289 = new int[1000];

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "[Lclient!lh;")
	private static final Class130[] aClass130Array1 = new Class130[50];

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "[[I")
	private static final int[][] anIntArrayArray18 = new int[5][5000];

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "[I")
	private static final int[] anIntArray291 = new int[5];

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[1000];

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "[I")
	private static final int[] anIntArray292 = new int[3];

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_21 = new Class103(4);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	public static void method1761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class7_Sub1_Sub6 local5 = Static89.method1854(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray290 = new int[local5.anInt1416];
		aStringArray21 = new String[local5.anInt1415];
		if (local5.anInt1419 == 15 || local5.anInt1419 == 17 || local5.anInt1419 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static116.aClass26_18 != null) {
				local30 = Static116.aClass26_18.anInt540;
				local32 = Static116.aClass26_18.anInt519;
			}
			anIntArray290[0] = Static240.anInt6396 - local30;
			anIntArray290[1] = Static100.anInt2436 - local32;
		}
		method1764(local5, 200000);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public static void method1762(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static264.method4436(arg0)) {
			return;
		}
		@Pc(12) Class26[] local12 = Static298.aClass26ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class26 local19 = local12[local14];
			if (local19.anObjectArray6 != null) {
				@Pc(26) Class7_Sub25 local26 = new Class7_Sub25();
				local26.aClass26_22 = local19;
				local26.anObjectArray34 = local19.anObjectArray6;
				method1763(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!me;I)V")
	private static void method1763(@OriginalArg(0) Class7_Sub25 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class7_Sub1_Sub6 local12 = Static229.method4021(local8);
		if (local12 == null) {
			return;
		}
		anIntArray290 = new int[local12.anInt1416];
		@Pc(21) int local21 = 0;
		aStringArray21 = new String[local12.anInt1415];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3894;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3895;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass26_22 == null ? -1 : arg0.aClass26_22.anInt492;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3899;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass26_22 == null ? -1 : arg0.aClass26_22.anInt550;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass26_23 == null ? -1 : arg0.aClass26_23.anInt492;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass26_23 == null ? -1 : arg0.aClass26_23.anInt550;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3900;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3893;
				}
				anIntArray290[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString252;
				}
				aStringArray21[local27++] = local135;
			}
		}
		method1764(local12, arg1);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!dd;I)V")
	private static void method1764(@OriginalArg(0) Class7_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray212;
		@Pc(11) int[] local11 = arg0.anIntArray213;
		@Pc(13) byte local13 = -1;
		anInt2156 = 0;
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
						anIntArray289[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray289[local1++] = Static212.anIntArray579[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static74.method1484(local51, anIntArray289[local1]);
						continue;
					}
					if (local31 == 3) {
						aStringArray20[local3++] = arg0.aStringArray10[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray289[local1] != anIntArray289[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray289[local1] == anIntArray289[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray289[local1] < anIntArray289[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray289[local1] > anIntArray289[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt2156 == 0) {
							return;
						}
						@Pc(190) Class130 local190 = aClass130Array1[--anInt2156];
						arg0 = local190.aClass7_Sub1_Sub6_1;
						local8 = arg0.anIntArray212;
						local11 = arg0.anIntArray213;
						local5 = local190.anInt3757;
						anIntArray290 = local190.anIntArray511;
						aStringArray21 = local190.aStringArray34;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray289[local1++] = Static141.method2849(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static316.method5131(local51, anIntArray289[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray289[local1] <= anIntArray289[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray289[local1] >= anIntArray289[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray289[local1++] = anIntArray290[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray290[local299] = anIntArray289[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray20[local3++] = aStringArray21[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray21[local299] = aStringArray20[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static324.method5210(aStringArray20, local51, local3);
						aStringArray20[local3++] = local348;
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
						@Pc(375) Class7_Sub1_Sub6 local375 = Static229.method4021(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt1416];
						@Pc(389) String[] local389 = new String[local375.anInt1415];
						for (local391 = 0; local391 < local375.anInt1420; local391++) {
							local385[local391] = anIntArray289[local1 + local391 - local375.anInt1420];
						}
						for (local410 = 0; local410 < local375.anInt1418; local410++) {
							local389[local410] = aStringArray20[local3 + local410 - local375.anInt1418];
						}
						local1 -= local375.anInt1420;
						local3 -= local375.anInt1418;
						@Pc(441) Class130 local441 = new Class130();
						local441.aClass7_Sub1_Sub6_1 = arg0;
						local441.anInt3757 = local5;
						local441.anIntArray511 = anIntArray290;
						local441.aStringArray34 = aStringArray21;
						if (anInt2156 >= aClass130Array1.length) {
							throw new RuntimeException();
						}
						aClass130Array1[anInt2156++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray212;
						local11 = local375.anIntArray213;
						local5 = -1;
						anIntArray290 = local385;
						aStringArray21 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray289[local1++] = Static165.anIntArray464[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static165.anIntArray464[local51] = anIntArray289[local1];
						Static354.method5700(local51);
						Static261.aBoolean372 |= Static120.aBooleanArray17[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray289[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray291[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4411;
								}
								anIntArrayArray18[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray289[local1];
						if (local536 >= 0 && local536 < anIntArray291[local51]) {
							anIntArray289[local1++] = anIntArrayArray18[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray289[local1];
						if (local536 >= 0 && local536 < anIntArray291[local51]) {
							anIntArrayArray18[local51][local536] = anIntArray289[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static210.aStringArray38[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray20[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static210.aStringArray38[local51] = aStringArray20[local3];
						Static334.method5305(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class10 local689 = arg0.aClass10Array1[local11[local5]];
						local1--;
						@Pc(699) Class7_Sub10 local699 = (Class7_Sub10) local689.method163((long) anIntArray289[local1]);
						if (local699 != null) {
							local5 += local699.anInt2111;
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
				@Pc(855) Class26 local855;
				@Pc(750) Class26 local750;
				@Pc(922) Class26 local922;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray289[local1];
						local541 = anIntArray289[local1 + 1];
						local740 = anIntArray289[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static245.method4231(local536);
						if (local750.aClass26Array1 == null) {
							local750.aClass26Array1 = new Class26[local740 + 1];
						}
						if (local750.aClass26Array1.length <= local740) {
							@Pc(769) Class26[] local769 = new Class26[local740 + 1];
							for (local771 = 0; local771 < local750.aClass26Array1.length; local771++) {
								local769[local771] = local750.aClass26Array1[local771];
							}
							local750.aClass26Array1 = local769;
						}
						if (local740 > 0 && local750.aClass26Array1[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class26 local814 = new Class26();
						local814.anInt520 = local541;
						local814.anInt530 = local814.anInt492 = local750.anInt492;
						local814.anInt550 = local740;
						local814.aBoolean36 = true;
						local750.aClass26Array1[local740] = local814;
						if (local714) {
							aClass26_15 = local814;
						} else {
							aClass26_16 = local814;
						}
						Static245.method4226(local750);
						continue;
					}
					@Pc(876) Class26 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass26_15 : aClass26_16;
						if (local855.anInt550 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static245.method4231(local855.anInt492);
						local876.aClass26Array1[local855.anInt550] = null;
						Static245.method4226(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static245.method4231(anIntArray289[local1]);
						local855.aClass26Array1 = null;
						Static245.method4226(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray289[local1];
						local541 = anIntArray289[local1 + 1];
						local922 = Static23.method4815(local541, local536);
						if (local922 != null && local541 != -1) {
							anIntArray289[local1++] = 1;
							if (local714) {
								aClass26_15 = local922;
							} else {
								aClass26_16 = local922;
							}
							continue;
						}
						anIntArray289[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray289[local1];
						local876 = Static245.method4231(local536);
						if (local876 == null) {
							anIntArray289[local1++] = 0;
						} else {
							anIntArray289[local1++] = 1;
							if (local714) {
								aClass26_15 = local876;
							} else {
								aClass26_16 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray289[local1];
							local541 = anIntArray289[local1 + 1];
							for (local740 = 0; local740 < Static231.anIntArray619.length; local740++) {
								if (Static231.anIntArray619[local740] == local536) {
									Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1.method5586(local541, local740);
									continue label4411;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static285.anIntArray709.length) {
									continue label4411;
								}
								if (Static285.anIntArray709[local391] == local536) {
									Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1.method5586(local541, local391);
									continue label4411;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray289[local1];
							local541 = anIntArray289[local1 + 1];
							Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1.method5589(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray289[local1] != 0;
							Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1.method5580(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || local31 >= 2000 && local31 < 2100) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static245.method4231(anIntArray289[local1]);
							} else {
								local855 = local714 ? aClass26_15 : aClass26_16;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt562 = anIntArray289[local1];
								local855.anInt514 = anIntArray289[local1 + 1];
								local541 = anIntArray289[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray289[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte10 = (byte) local541;
								local855.aByte11 = (byte) local740;
								Static245.method4226(local855);
								Static229.method4029(local855);
								if (local855.anInt550 == -1) {
									Static184.method3382(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt483 = anIntArray289[local1];
								local855.anInt518 = anIntArray289[local1 + 1];
								local855.anInt563 = 0;
								local855.anInt517 = 0;
								local541 = anIntArray289[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray289[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.aByte12 = (byte) local541;
								local855.aByte9 = (byte) local740;
								Static245.method4226(local855);
								Static229.method4029(local855);
								if (local855.anInt520 == 0) {
									Static70.method1378(local855, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray289[local1] == 1;
								if (local855.aBoolean39 != local1266) {
									local855.aBoolean39 = local1266;
									Static245.method4226(local855);
								}
								if (local855.anInt550 == -1) {
									Static264.method4441(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt569 = anIntArray289[local1];
								local855.anInt489 = anIntArray289[local1 + 1];
								Static245.method4226(local855);
								Static229.method4029(local855);
								if (local855.anInt520 == 0) {
									Static70.method1378(local855, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean32 = anIntArray289[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static245.method4231(anIntArray289[local1]);
							} else {
								local855 = local714 ? aClass26_15 : aClass26_16;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt533 = anIntArray289[local1];
								if (local855.anInt533 > local855.anInt506 - local855.anInt523) {
									local855.anInt533 = local855.anInt506 - local855.anInt523;
								}
								if (local855.anInt533 < 0) {
									local855.anInt533 = 0;
								}
								local855.anInt499 = anIntArray289[local1 + 1];
								if (local855.anInt499 > local855.anInt548 - local855.anInt515) {
									local855.anInt499 = local855.anInt548 - local855.anInt515;
								}
								if (local855.anInt499 < 0) {
									local855.anInt499 = 0;
								}
								Static245.method4226(local855);
								if (local855.anInt550 == -1) {
									Static307.method4981(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt527 = anIntArray289[local1];
								Static245.method4226(local855);
								if (local855.anInt550 == -1) {
									Static118.method5344(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean30 = anIntArray289[local1] == 1;
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt559 = anIntArray289[local1];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt486 = anIntArray289[local1];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray289[local1];
								if (local855.anInt573 != local541) {
									local855.anInt573 = local541;
									Static245.method4226(local855);
								}
								if (local855.anInt550 == -1) {
									Static129.method2632(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt574 = anIntArray289[local1];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean29 = anIntArray289[local1] == 1;
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt564 = 1;
								local1--;
								local855.anInt516 = anIntArray289[local1];
								Static245.method4226(local855);
								if (local855.anInt550 == -1) {
									Static55.method1157(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt528 = anIntArray289[local1];
								local855.anInt505 = anIntArray289[local1 + 1];
								local855.anInt525 = anIntArray289[local1 + 2];
								local855.anInt565 = anIntArray289[local1 + 3];
								local855.anInt482 = anIntArray289[local1 + 4];
								local855.anInt531 = anIntArray289[local1 + 5];
								Static245.method4226(local855);
								if (local855.anInt550 == -1) {
									Static177.method3289(local855.anInt492);
									Static61.method1215(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray289[local1];
								if (local855.anInt488 != local541) {
									local855.anInt488 = local541;
									local855.anInt541 = 0;
									local855.anInt554 = 1;
									local855.anInt567 = 0;
									Static245.method4226(local855);
								}
								if (local855.anInt550 == -1) {
									Static275.method4595(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean31 = anIntArray289[local1] == 1;
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray20[local3];
								if (!local1699.equals(local855.aString42)) {
									local855.aString42 = local1699;
									Static245.method4226(local855);
								}
								if (local855.anInt550 == -1) {
									Static249.method1111(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt513 = anIntArray289[local1];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt547 = anIntArray289[local1];
								local855.anInt493 = anIntArray289[local1 + 1];
								local855.anInt561 = anIntArray289[local1 + 2];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean40 = anIntArray289[local1] == 1;
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt508 = anIntArray289[local1];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt545 = anIntArray289[local1];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean27 = anIntArray289[local1] == 1;
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean35 = anIntArray289[local1] == 1;
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt506 = anIntArray289[local1];
								local855.anInt548 = anIntArray289[local1 + 1];
								Static245.method4226(local855);
								if (local855.anInt520 == 0) {
									Static70.method1378(local855, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort9 = (short) anIntArray289[local1];
								local855.aShort8 = (short) anIntArray289[local1 + 1];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean37 = anIntArray289[local1] == 1;
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt531 = anIntArray289[local1];
								Static245.method4226(local855);
								if (local855.anInt550 == -1) {
									Static177.method3289(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray289[local1];
								local855.aBoolean34 = local541 == 1;
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt502 = anIntArray289[local1];
								local855.anInt566 = anIntArray289[local1 + 1];
								Static245.method4226(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static245.method4231(anIntArray289[local1]);
							} else {
								local855 = local714 ? aClass26_15 : aClass26_16;
							}
							Static245.method4226(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray289[local1];
								local740 = anIntArray289[local1 + 1];
								if (local855.anInt550 == -1) {
									Static57.method1169(local855.anInt492);
									Static177.method3289(local855.anInt492);
									Static61.method1215(local855.anInt492);
								}
								if (local541 == -1) {
									local855.anInt564 = 1;
									local855.anInt516 = -1;
									local855.anInt526 = -1;
									continue;
								}
								local855.anInt526 = local541;
								local855.anInt510 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local855.aBoolean33 = true;
								} else {
									local855.aBoolean33 = false;
								}
								@Pc(2081) Class138 local2081 = Static17.method4472(local541);
								local855.anInt525 = local2081.anInt3992;
								local855.anInt565 = local2081.anInt3977;
								local855.anInt482 = local2081.anInt4006;
								local855.anInt528 = local2081.anInt4008;
								local855.anInt505 = local2081.anInt4013;
								local855.anInt531 = local2081.anInt3982;
								if (local31 == 1205 || local31 == 1209) {
									local855.anInt487 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local855.anInt487 = 1;
								} else {
									local855.anInt487 = 2;
								}
								if (local855.anInt563 > 0) {
									local855.anInt531 = local855.anInt531 * 32 / local855.anInt563;
								} else if (local855.anInt483 > 0) {
									local855.anInt531 = local855.anInt531 * 32 / local855.anInt483;
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt564 = 2;
								local1--;
								local855.anInt516 = anIntArray289[local1];
								if (local855.anInt550 == -1) {
									Static55.method1157(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt564 = 3;
								local855.anInt516 = -1;
								if (local855.anInt550 == -1) {
									Static55.method1157(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt564 = 6;
								local1--;
								local855.anInt516 = anIntArray289[local1];
								if (local855.anInt550 == -1) {
									Static55.method1157(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt564 = 5;
								local1--;
								local855.anInt516 = anIntArray289[local1];
								if (local855.anInt550 == -1) {
									Static55.method1157(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt496 = anIntArray289[local1];
								local855.anInt522 = anIntArray289[local1 + 1];
								local855.anInt556 = anIntArray289[local1 + 2];
								local855.anInt560 = anIntArray289[local1 + 3];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt532 = anIntArray289[local1];
								local855.anInt544 = anIntArray289[local1 + 1];
								Static245.method4226(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.anInt516 = anIntArray289[local1];
								local855.anInt511 = anIntArray289[local1 + 1];
								if (anIntArray289[local1 + 2] == 1) {
									local855.anInt564 = 9;
								} else {
									local855.anInt564 = 8;
								}
								if (anIntArray289[local1 + 3] == 1) {
									local855.aBoolean33 = true;
								} else {
									local855.aBoolean33 = false;
								}
								if (local855.anInt550 == -1) {
									Static55.method1157(local855.anInt492);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt564 = 5;
								local855.anInt516 = 2047;
								local855.anInt511 = 0;
								if (local855.anInt550 == -1) {
									Static55.method1157(local855.anInt492);
								}
								continue;
							}
						} else if ((local31 < 1300 || local31 >= 1400) && (local31 < 2300 || local31 >= 2400)) {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static245.method4231(anIntArray289[local1]);
								} else {
									local855 = local714 ? aClass26_15 : aClass26_16;
								}
								local3--;
								local1699 = aStringArray20[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray289[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray289[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray20[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray289[local1]);
									}
								}
								local1--;
								local771 = anIntArray289[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray7 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray19 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray22 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray12 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray16 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray24 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray13 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray28 = local2638;
									local855.anIntArray61 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray18 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray2 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray14 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1414) {
									local855.anObjectArray27 = local2638;
									local855.anIntArray59 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray30 = local2638;
									local855.anIntArray63 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray9 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray11 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray29 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray5 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray23 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray10 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray21 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray25 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray15 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray3 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray31 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray4 = local2638;
									local855.anIntArray71 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray26 = local2638;
									local855.anIntArray74 = local2592;
								}
								local855.aBoolean28 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass26_15 : aClass26_16;
								if (local31 == 1500) {
									anIntArray289[local1++] = local855.anInt540;
									continue;
								}
								if (local31 == 1501) {
									anIntArray289[local1++] = local855.anInt519;
									continue;
								}
								if (local31 == 1502) {
									anIntArray289[local1++] = local855.anInt523;
									continue;
								}
								if (local31 == 1503) {
									anIntArray289[local1++] = local855.anInt515;
									continue;
								}
								if (local31 == 1504) {
									anIntArray289[local1++] = local855.aBoolean39 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray289[local1++] = local855.anInt530;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass26_15 : aClass26_16;
								if (local31 == 1600) {
									anIntArray289[local1++] = local855.anInt533;
									continue;
								}
								if (local31 == 1601) {
									anIntArray289[local1++] = local855.anInt499;
									continue;
								}
								if (local31 == 1602) {
									aStringArray20[local3++] = local855.aString42;
									continue;
								}
								if (local31 == 1603) {
									anIntArray289[local1++] = local855.anInt506;
									continue;
								}
								if (local31 == 1604) {
									anIntArray289[local1++] = local855.anInt548;
									continue;
								}
								if (local31 == 1605) {
									anIntArray289[local1++] = local855.anInt531;
									continue;
								}
								if (local31 == 1606) {
									anIntArray289[local1++] = local855.anInt525;
									continue;
								}
								if (local31 == 1607) {
									anIntArray289[local1++] = local855.anInt482;
									continue;
								}
								if (local31 == 1608) {
									anIntArray289[local1++] = local855.anInt565;
									continue;
								}
								if (local31 == 1609) {
									anIntArray289[local1++] = local855.anInt559;
									continue;
								}
								if (local31 == 1610) {
									anIntArray289[local1++] = local855.anInt528;
									continue;
								}
								if (local31 == 1611) {
									anIntArray289[local1++] = local855.anInt505;
									continue;
								}
								if (local31 == 1612) {
									anIntArray289[local1++] = local855.anInt573;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass26_15 : aClass26_16;
								if (local31 == 1700) {
									anIntArray289[local1++] = local855.anInt526;
									continue;
								}
								if (local31 == 1701) {
									if (local855.anInt526 == -1) {
										anIntArray289[local1++] = 0;
									} else {
										anIntArray289[local1++] = local855.anInt510;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray289[local1++] = local855.anInt550;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass26_15 : aClass26_16;
								if (local31 == 1800) {
									anIntArray289[local1++] = Static45.method1034(local855).method3765();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray289[local1];
									local541--;
									if (local855.aStringArray6 != null && local541 < local855.aStringArray6.length && local855.aStringArray6[local541] != null) {
										aStringArray20[local3++] = local855.aStringArray6[local541];
										continue;
									}
									aStringArray20[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString49 == null) {
										aStringArray20[local3++] = "";
									} else {
										aStringArray20[local3++] = local855.aString49;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static245.method4231(anIntArray289[local1]);
								if (local31 == 2500) {
									anIntArray289[local1++] = local855.anInt540;
									continue;
								}
								if (local31 == 2501) {
									anIntArray289[local1++] = local855.anInt519;
									continue;
								}
								if (local31 == 2502) {
									anIntArray289[local1++] = local855.anInt523;
									continue;
								}
								if (local31 == 2503) {
									anIntArray289[local1++] = local855.anInt515;
									continue;
								}
								if (local31 == 2504) {
									anIntArray289[local1++] = local855.aBoolean39 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray289[local1++] = local855.anInt530;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static245.method4231(anIntArray289[local1]);
								if (local31 == 2600) {
									anIntArray289[local1++] = local855.anInt533;
									continue;
								}
								if (local31 == 2601) {
									anIntArray289[local1++] = local855.anInt499;
									continue;
								}
								if (local31 == 2602) {
									aStringArray20[local3++] = local855.aString42;
									continue;
								}
								if (local31 == 2603) {
									anIntArray289[local1++] = local855.anInt506;
									continue;
								}
								if (local31 == 2604) {
									anIntArray289[local1++] = local855.anInt548;
									continue;
								}
								if (local31 == 2605) {
									anIntArray289[local1++] = local855.anInt531;
									continue;
								}
								if (local31 == 2606) {
									anIntArray289[local1++] = local855.anInt525;
									continue;
								}
								if (local31 == 2607) {
									anIntArray289[local1++] = local855.anInt482;
									continue;
								}
								if (local31 == 2608) {
									anIntArray289[local1++] = local855.anInt565;
									continue;
								}
								if (local31 == 2609) {
									anIntArray289[local1++] = local855.anInt559;
									continue;
								}
								if (local31 == 2610) {
									anIntArray289[local1++] = local855.anInt528;
									continue;
								}
								if (local31 == 2611) {
									anIntArray289[local1++] = local855.anInt505;
									continue;
								}
								if (local31 == 2612) {
									anIntArray289[local1++] = local855.anInt573;
									continue;
								}
							} else {
								@Pc(3610) Class7_Sub17 local3610;
								@Pc(3526) Class7_Sub17 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static245.method4231(anIntArray289[local1]);
										anIntArray289[local1++] = local855.anInt526;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static245.method4231(anIntArray289[local1]);
										if (local855.anInt526 == -1) {
											anIntArray289[local1++] = 0;
										} else {
											anIntArray289[local1++] = local855.anInt510;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray289[local1];
										local3526 = (Class7_Sub17) Static247.aClass10_40.method163((long) local536);
										if (local3526 == null) {
											anIntArray289[local1++] = 0;
										} else {
											anIntArray289[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static245.method4231(anIntArray289[local1]);
										if (local855.aClass26Array1 == null) {
											anIntArray289[local1++] = 0;
											continue;
										}
										local541 = local855.aClass26Array1.length;
										for (local740 = 0; local740 < local855.aClass26Array1.length; local740++) {
											if (local855.aClass26Array1[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray289[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local3610 = (Class7_Sub17) Static247.aClass10_40.method163((long) local536);
										if (local3610 != null && local3610.anInt3252 == local541) {
											anIntArray289[local1++] = 1;
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static245.method4231(anIntArray289[local1]);
									if (local31 == 2800) {
										anIntArray289[local1++] = Static45.method1034(local855).method3765();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray289[local1];
										local541--;
										if (local855.aStringArray6 != null && local541 < local855.aStringArray6.length && local855.aStringArray6[local541] != null) {
											aStringArray20[local3++] = local855.aStringArray6[local541];
											continue;
										}
										aStringArray20[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString49 == null) {
											aStringArray20[local3++] = "";
										} else {
											aStringArray20[local3++] = local855.aString49;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray20[local3];
										Static16.method2749(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static55.method1163(anIntArray289[local1 + 1], anIntArray289[local1], Static252.aClass22_Sub2_Sub1_Sub1_4);
										continue;
									}
									if (local31 == 3103) {
										Static313.method5075(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray20[local3];
										local541 = 0;
										if (Static324.method5212(local348)) {
											local541 = Static281.method4414(local348);
										}
										Static29.aClass7_Sub3_Sub2_1.method2799(207);
										Static29.aClass7_Sub3_Sub2_1.method2765(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray20[local3];
										Static29.aClass7_Sub3_Sub2_1.method2799(143);
										Static29.aClass7_Sub3_Sub2_1.method2735(local348.length() + 1);
										Static29.aClass7_Sub3_Sub2_1.method2738(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray20[local3];
										Static29.aClass7_Sub3_Sub2_1.method2799(95);
										Static29.aClass7_Sub3_Sub2_1.method2735(local348.length() + 1);
										Static29.aClass7_Sub3_Sub2_1.method2738(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray289[local1];
										local3--;
										local1699 = aStringArray20[local3];
										Static221.method3903(local536, local1699);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local740 = anIntArray289[local1 + 2];
										local750 = Static245.method4231(local740);
										Static91.method5060(local750, local536, local541);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local922 = local714 ? aClass26_15 : aClass26_16;
										Static91.method5060(local922, local536, local541);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray289[local1];
										Static29.aClass7_Sub3_Sub2_1.method2799(31);
										Static29.aClass7_Sub3_Sub2_1.method2788(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local3610 = (Class7_Sub17) Static247.aClass10_40.method163((long) local536);
										if (local3610 != null) {
											Static89.method1858(local3610.anInt3252 != local541, true, local3610);
										}
										Static9.method151(true, 3, local536, local541);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray289[local1];
										local3526 = (Class7_Sub17) Static247.aClass10_40.method163((long) local536);
										if (local3526 != null && local3526.anInt3249 == 3) {
											Static89.method1858(true, true, local3526);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static72.method1408(anIntArray289[local1 + 1], 255, anIntArray289[local1 + 2], anIntArray289[local1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static256.method4314(anIntArray289[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static302.method5506(anIntArray289[local1 + 1], 255, anIntArray289[local1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray289[local1++] = Static212.anInt4234;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = Static235.method4087(local541, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = Static56.method1167(local541, local536);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = Static330.method5270(local541, local536);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static163.method3108(local536).anInt6242;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static204.anIntArray557[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static145.anIntArray414[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static212.anIntArray580[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static168.anInt3508;
										local541 = (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7) + Static350.anInt6609;
										local740 = (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7) + Static237.anInt4696;
										anIntArray289[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray289[local1++] = Static204.aBoolean315 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray289[local1] + 32768;
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = Static235.method4087(local541, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray289[local1] + 32768;
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = Static56.method1167(local541, local536);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray289[local1] + 32768;
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = Static330.method5270(local541, local536);
										continue;
									}
									if (local31 == 3316) {
										if (Static244.anInt4842 >= 2) {
											anIntArray289[local1++] = Static244.anInt4842;
										} else {
											anIntArray289[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray289[local1++] = Static62.anInt1605;
										continue;
									}
									if (local31 == 3318) {
										anIntArray289[local1++] = Static65.anInt1630;
										continue;
									}
									if (local31 == 3321) {
										anIntArray289[local1++] = Static152.anInt3253;
										continue;
									}
									if (local31 == 3322) {
										anIntArray289[local1++] = Static182.anInt3703;
										continue;
									}
									if (local31 == 3323) {
										if (Static223.anInt4465 >= 5 && Static223.anInt4465 <= 9) {
											anIntArray289[local1++] = 1;
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static223.anInt4465 >= 5 && Static223.anInt4465 <= 9) {
											anIntArray289[local1++] = Static223.anInt4465;
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray289[local1++] = Static63.aBoolean407 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray289[local1++] = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020;
										continue;
									}
									if (local31 == 3327) {
										anIntArray289[local1++] = Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1.aBoolean478 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray289[local1++] = Static261.aBoolean371 && !Static233.aBoolean343 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray289[local1++] = Static343.aBoolean474 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static337.method5369(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = Static14.method208(local541, false, local536);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = Static14.method208(local541, true, local536);
										continue;
									}
									if (local31 == 3333) {
										anIntArray289[local1++] = Static100.anInt2439;
										continue;
									}
									if (local31 == 3335) {
										anIntArray289[local1++] = Static177.anInt3637;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local740 = anIntArray289[local1 + 2];
										local391 = anIntArray289[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray289[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray289[local1++] = Static37.anInt1055;
										continue;
									}
									if (local31 == 3338) {
										anIntArray289[local1++] = Static86.method1825();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class7_Sub1_Sub16 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local4695 = Static288.method1010(local536);
										aStringArray20[local3++] = local4695.method4895(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local740 = anIntArray289[local1 + 2];
										local391 = anIntArray289[local1 + 3];
										@Pc(4734) Class7_Sub1_Sub16 local4734 = Static288.method1010(local740);
										if (local4734.aChar4 == local536 && local4734.aChar5 == local541) {
											if (local541 == 115) {
												aStringArray20[local3++] = local4734.method4895(local391);
											} else {
												anIntArray289[local1++] = local4734.method4897(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local740 = anIntArray289[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class7_Sub1_Sub16 local4800 = Static288.method1010(local541);
										if (local4800.aChar5 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray289[local1++] = local4800.method4900(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray289[local1];
										local3--;
										local1699 = aStringArray20[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static288.method1010(local536);
										if (local4695.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray289[local1++] = local4695.method4893(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray289[local1];
										@Pc(4881) Class7_Sub1_Sub16 local4881 = Static288.method1010(local536);
										anIntArray289[local1++] = local4881.aClass10_48.method159();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static139.anInt3024 == 0) {
											anIntArray289[local1++] = -2;
										} else if (Static139.anInt3024 == 1) {
											anIntArray289[local1++] = -1;
										} else {
											anIntArray289[local1++] = Static124.anInt2775;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static139.anInt3024 == 2 && local536 < Static124.anInt2775) {
											aStringArray20[local3++] = Static64.aStringArray15[local536];
											if (Static323.aStringArray49[local536] == null) {
												aStringArray20[local3++] = "";
											} else {
												aStringArray20[local3++] = Static323.aStringArray49[local536];
											}
											continue;
										}
										aStringArray20[local3++] = "";
										aStringArray20[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static139.anInt3024 == 2 && local536 < Static124.anInt2775) {
											anIntArray289[local1++] = Static263.anIntArray667[local536];
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static139.anInt3024 == 2 && local536 < Static124.anInt2775) {
											anIntArray289[local1++] = Static299.anIntArray734[local536];
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray20[local3];
										local1--;
										local541 = anIntArray289[local1];
										Static305.method4925(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray20[local3];
										Static266.method4450(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray20[local3];
										Static108.method1054(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray20[local3];
										Static347.method5578(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray20[local3];
										Static252.method5174(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray20[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray289[local1++] = Static94.method1902(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static139.anInt3024 == 2 && local536 < Static124.anInt2775) {
											aStringArray20[local3++] = Static107.aStringArray13[local536];
											continue;
										}
										aStringArray20[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static316.aString392 == null) {
											aStringArray20[local3++] = "";
										} else {
											aStringArray20[local3++] = Static74.method1489(Static316.aString392);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static316.aString392 == null) {
											anIntArray289[local1++] = 0;
										} else {
											anIntArray289[local1++] = Static129.anInt2833;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static316.aString392 != null && local536 < Static129.anInt2833) {
											aStringArray20[local3++] = Static275.aClass115Array1[local536].aString214;
											continue;
										}
										aStringArray20[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static316.aString392 != null && local536 < Static129.anInt2833) {
											anIntArray289[local1++] = Static275.aClass115Array1[local536].anInt3288;
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static316.aString392 != null && local536 < Static129.anInt2833) {
											anIntArray289[local1++] = Static275.aClass115Array1[local536].aByte41;
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray289[local1++] = Static277.aByte62;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray20[local3];
										Static239.method4108(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray289[local1++] = Static21.aByte8;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray20[local3];
										Static204.method3622(local348);
										continue;
									}
									if (local31 == 3620) {
										Static18.method301();
										continue;
									}
									if (local31 == 3621) {
										if (Static139.anInt3024 == 0) {
											anIntArray289[local1++] = -1;
										} else {
											anIntArray289[local1++] = Static2.anInt17;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static139.anInt3024 != 0 && local536 < Static2.anInt17) {
											aStringArray20[local3++] = Static76.aStringArray17[local536];
											if (Static77.aStringArray18[local536] == null) {
												aStringArray20[local3++] = "";
											} else {
												aStringArray20[local3++] = Static77.aStringArray18[local536];
											}
											continue;
										}
										aStringArray20[local3++] = "";
										aStringArray20[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray20[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray289[local1++] = Static271.method4521(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static275.aClass115Array1 != null && local536 < Static129.anInt2833 && Static275.aClass115Array1[local536].aString213.equalsIgnoreCase(Static252.aClass22_Sub2_Sub1_Sub1_4.aString78)) {
											anIntArray289[local1++] = 1;
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static228.aString286 == null) {
											aStringArray20[local3++] = "";
										} else {
											aStringArray20[local3++] = Static228.aString286;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static316.aString392 != null && local536 < Static129.anInt2833) {
											aStringArray20[local3++] = Static275.aClass115Array1[local536].aString215;
											continue;
										}
										aStringArray20[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static139.anInt3024 == 2 && local536 >= 0 && local536 < Static124.anInt2775) {
											anIntArray289[local1++] = Static44.aBooleanArray10[local536] ? 1 : 0;
											continue;
										}
										anIntArray289[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray20[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray289[local1++] = Static210.method3749(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray289[local1++] = Static127.anInt2798;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray20[local3];
										Static347.method5578(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static60.aBooleanArray12[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static316.aString392 != null && local536 < Static129.anInt2833) {
											aStringArray20[local3++] = Static275.aClass115Array1[local536].aString213;
											continue;
										}
										aStringArray20[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray289[local1];
										if (Static139.anInt3024 != 0 && local536 < Static2.anInt17) {
											aStringArray20[local3++] = Static94.aStringArray24[local536];
											continue;
										}
										aStringArray20[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static224.aClass125Array1[local536].method3291();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static224.aClass125Array1[local536].anInt3628;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static224.aClass125Array1[local536].anInt3642;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static224.aClass125Array1[local536].anInt3636;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static224.aClass125Array1[local536].anInt3640;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = Static224.aClass125Array1[local536].anInt3635;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray289[local1];
										local541 = Static224.aClass125Array1[local536].method3293();
										anIntArray289[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray289[local1];
										local541 = Static224.aClass125Array1[local536].method3293();
										anIntArray289[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray289[local1];
										local541 = Static224.aClass125Array1[local536].method3293();
										anIntArray289[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray289[local1];
										local541 = Static224.aClass125Array1[local536].method3293();
										anIntArray289[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray289[local1];
										anIntArray289[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										local740 = anIntArray289[local1 + 2];
										local391 = anIntArray289[local1 + 3];
										local410 = anIntArray289[local1 + 4];
										anIntArray289[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray289[local1];
										local6055 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										if (local536 == 0) {
											anIntArray289[local1++] = 0;
										} else {
											anIntArray289[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										if (local536 == 0) {
											anIntArray289[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray289[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray289[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray289[local1];
										local541 = anIntArray289[local1 + 1];
										anIntArray289[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray289[local1];
										local6055 = anIntArray289[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray289[local1 + 2];
										anIntArray289[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray20[local3];
											local1--;
											local541 = anIntArray289[local1];
											aStringArray20[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray20[local3];
											local1699 = aStringArray20[local3 + 1];
											aStringArray20[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray20[local3];
											local1--;
											local541 = anIntArray289[local1];
											aStringArray20[local3++] = local348 + Static150.method1572(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray20[local3];
											aStringArray20[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray289[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6487));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray20[local3++] = local391 + "-" + aStringArray22[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray20[local3];
											local1699 = aStringArray20[local3 + 1];
											if (Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1 != null && Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1.aBoolean478) {
												aStringArray20[local3++] = local1699;
												continue;
											}
											aStringArray20[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray289[local1];
											aStringArray20[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray289[local1++] = Static341.method5545(aStringArray20[local3 + 1], Static177.anInt3637, aStringArray20[local3]);
											continue;
										}
										@Pc(6619) Class208 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray20[local3];
											local1 -= 2;
											local541 = anIntArray289[local1];
											local740 = anIntArray289[local1 + 1];
											local6619 = Static353.method2012(Static139.aClass180_36, local740);
											anIntArray289[local1++] = local6619.method5375(local348, local541, Static160.aClass52Array10);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray20[local3];
											local1 -= 2;
											local541 = anIntArray289[local1];
											local740 = anIntArray289[local1 + 1];
											local6619 = Static353.method2012(Static139.aClass180_36, local740);
											anIntArray289[local1++] = local6619.method5380(local348, Static160.aClass52Array10, local541);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray20[local3];
											local1699 = aStringArray20[local3 + 1];
											local1--;
											if (anIntArray289[local1] == 1) {
												aStringArray20[local3++] = local348;
											} else {
												aStringArray20[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray20[local3];
											aStringArray20[local3++] = Static16.method2771(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray20[local3];
											local1--;
											local541 = anIntArray289[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray20[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray289[local1];
											anIntArray289[local1++] = Static42.method900((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray289[local1];
											anIntArray289[local1++] = Static125.method2598((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray289[local1];
											anIntArray289[local1++] = Static249.method1109((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray289[local1];
											anIntArray289[local1++] = Static78.method5352((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray20[local3];
											if (local348 == null) {
												anIntArray289[local1++] = 0;
											} else {
												anIntArray289[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray20[local3];
											local1 -= 2;
											local541 = anIntArray289[local1];
											local740 = anIntArray289[local1 + 1];
											aStringArray20[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray20[local3];
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
											aStringArray20[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray20[local3];
											local1 -= 2;
											local541 = anIntArray289[local1];
											local740 = anIntArray289[local1 + 1];
											anIntArray289[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray20[local3];
											local1699 = aStringArray20[local3 + 1];
											local1--;
											local740 = anIntArray289[local1];
											anIntArray289[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray289[local1];
											anIntArray289[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray289[local1];
											anIntArray289[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray289[local1] != 0;
											local1--;
											local541 = anIntArray289[local1];
											aStringArray20[local3++] = Static251.method5273(0, local1070, (long) local541, Static177.anInt3637);
											continue;
										}
									} else {
										@Pc(7311) Class7_Sub1_Sub2 local7311;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray289[local1];
												aStringArray20[local3++] = Static17.method4472(local536).aString261;
												continue;
											}
											@Pc(7092) Class138 local7092;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												local7092 = Static17.method4472(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray36[local541 - 1] != null) {
													aStringArray20[local3++] = local7092.aStringArray36[local541 - 1];
													continue;
												}
												aStringArray20[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												local7092 = Static17.method4472(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray35[local541 - 1] != null) {
													aStringArray20[local3++] = local7092.aStringArray35[local541 - 1];
													continue;
												}
												aStringArray20[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray289[local1];
												anIntArray289[local1++] = Static17.method4472(local536).anInt4010;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray289[local1];
												anIntArray289[local1++] = Static17.method4472(local536).anInt4004 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7221) Class138 local7221;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray289[local1];
												local7221 = Static17.method4472(local536);
												if (local7221.anInt3962 == -1 && local7221.anInt4003 >= 0) {
													anIntArray289[local1++] = local7221.anInt4003;
													continue;
												}
												anIntArray289[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray289[local1];
												local7221 = Static17.method4472(local536);
												if (local7221.anInt3962 >= 0 && local7221.anInt4003 >= 0) {
													anIntArray289[local1++] = local7221.anInt4003;
													continue;
												}
												anIntArray289[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray289[local1];
												anIntArray289[local1++] = Static17.method4472(local536).aBoolean311 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												local7311 = Static113.method2182(local541);
												if (local7311.method197()) {
													aStringArray20[local3++] = Static17.method4472(local536).method3597(local7311.aString18, local541);
												} else {
													anIntArray289[local1++] = Static17.method4472(local536).method3591(local541, local7311.anInt267);
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray20[local3];
												local1--;
												local541 = anIntArray289[local1];
												Static272.method4541(local348, local541 == 1);
												anIntArray289[local1++] = Static66.anInt1665;
												continue;
											}
											if (local31 == 4211) {
												if (Static197.aShortArray62 != null && Static11.anInt3202 < Static66.anInt1665) {
													anIntArray289[local1++] = Static197.aShortArray62[Static11.anInt3202++] & 0xFFFF;
													continue;
												}
												anIntArray289[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static11.anInt3202 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												local7311 = Static113.method2182(local541);
												if (local7311.method197()) {
													aStringArray20[local3++] = Static132.method2664(local536).method4442(local541, local7311.aString18);
												} else {
													anIntArray289[local1++] = Static132.method2664(local536).method4439(local541, local7311.anInt267);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												local7311 = Static113.method2182(local541);
												if (local7311.method197()) {
													aStringArray20[local3++] = Static245.method4227(local536).method3239(local541, local7311.aString18);
												} else {
													anIntArray289[local1++] = Static245.method4227(local536).method3232(local7311.anInt267, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												local7311 = Static113.method2182(local541);
												if (local7311.method197()) {
													aStringArray20[local3++] = Static248.method4272(local536).method499(local7311.aString18, local541);
												} else {
													anIntArray289[local1++] = Static248.method4272(local536).method504(local7311.anInt267, local541);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray289[local1];
												anIntArray289[local1++] = Static136.method2691(local536).anInt2373;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray289[local1++] = Static326.anInt6196;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static326.anInt6196 = anIntArray289[local1];
												Static279.anInt6647 = anIntArray289[local1 + 1];
												Static239.anInt4724 = anIntArray289[local1 + 2];
												Static29.aClass7_Sub3_Sub2_1.method2799(123);
												Static29.aClass7_Sub3_Sub2_1.method2735(Static326.anInt6196);
												Static29.aClass7_Sub3_Sub2_1.method2735(Static279.anInt6647);
												Static29.aClass7_Sub3_Sub2_1.method2735(Static239.anInt4724);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray20[local3];
												local1 -= 2;
												local541 = anIntArray289[local1];
												local740 = anIntArray289[local1 + 1];
												Static29.aClass7_Sub3_Sub2_1.method2799(232);
												Static29.aClass7_Sub3_Sub2_1.method2735(Static344.method5559(local348) + 2);
												Static29.aClass7_Sub3_Sub2_1.method2738(local348);
												Static29.aClass7_Sub3_Sub2_1.method2735(local541 - 1);
												Static29.aClass7_Sub3_Sub2_1.method2735(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray289[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static121.aStringArray30[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray20[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray289[local1];
												local541 = -1;
												if (local536 < 100 && Static121.aStringArray30[local536] != null) {
													local541 = Static121.anIntArray365[local536];
												}
												anIntArray289[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray289[local1++] = Static279.anInt6647;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray20[local3];
												if (Static244.anInt4842 == 0 && (Static261.aBoolean371 && !Static233.aBoolean343 || Static343.aBoolean474)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7764) byte local7764 = 0;
												if (local1699.startsWith(Static261.aString321)) {
													local7764 = 0;
													local348 = local348.substring(Static261.aString321.length());
												} else if (local1699.startsWith(Static344.aString430)) {
													local7764 = 1;
													local348 = local348.substring(Static344.aString430.length());
												} else if (local1699.startsWith(Static2.aString2)) {
													local7764 = 2;
													local348 = local348.substring(Static2.aString2.length());
												} else if (local1699.startsWith(Static76.aString140)) {
													local7764 = 3;
													local348 = local348.substring(Static76.aString140.length());
												} else if (local1699.startsWith(Static212.aString275)) {
													local7764 = 4;
													local348 = local348.substring(Static212.aString275.length());
												} else if (local1699.startsWith(Static64.aString117)) {
													local7764 = 5;
													local348 = local348.substring(Static64.aString117.length());
												} else if (local1699.startsWith(Static246.aString306)) {
													local7764 = 6;
													local348 = local348.substring(Static246.aString306.length());
												} else if (local1699.startsWith(Static69.aString125)) {
													local7764 = 7;
													local348 = local348.substring(Static69.aString125.length());
												} else if (local1699.startsWith(Static4.aString3)) {
													local7764 = 8;
													local348 = local348.substring(Static4.aString3.length());
												} else if (local1699.startsWith(Static242.aString224)) {
													local7764 = 9;
													local348 = local348.substring(Static242.aString224.length());
												} else if (local1699.startsWith(Static36.aString81)) {
													local7764 = 10;
													local348 = local348.substring(Static36.aString81.length());
												} else if (local1699.startsWith(Static111.aString177)) {
													local7764 = 11;
													local348 = local348.substring(Static111.aString177.length());
												} else if (Static177.anInt3637 != 0) {
													if (local1699.startsWith(Static262.aString322)) {
														local7764 = 0;
														local348 = local348.substring(Static262.aString322.length());
													} else if (local1699.startsWith(Static329.aString409)) {
														local7764 = 1;
														local348 = local348.substring(Static329.aString409.length());
													} else if (local1699.startsWith(Static33.aString65)) {
														local7764 = 2;
														local348 = local348.substring(Static33.aString65.length());
													} else if (local1699.startsWith(Static113.aString178)) {
														local7764 = 3;
														local348 = local348.substring(Static113.aString178.length());
													} else if (local1699.startsWith(Static28.aString59)) {
														local7764 = 4;
														local348 = local348.substring(Static28.aString59.length());
													} else if (local1699.startsWith(Static241.aString301)) {
														local7764 = 5;
														local348 = local348.substring(Static241.aString301.length());
													} else if (local1699.startsWith(Static159.aString217)) {
														local7764 = 6;
														local348 = local348.substring(Static159.aString217.length());
													} else if (local1699.startsWith(Static49.aString95)) {
														local7764 = 7;
														local348 = local348.substring(Static49.aString95.length());
													} else if (local1699.startsWith(Static261.aString319)) {
														local7764 = 8;
														local348 = local348.substring(Static261.aString319.length());
													} else if (local1699.startsWith(Static199.aString256)) {
														local7764 = 9;
														local348 = local348.substring(Static199.aString256.length());
													} else if (local1699.startsWith(Static193.aString248)) {
														local7764 = 10;
														local348 = local348.substring(Static193.aString248.length());
													} else if (local1699.startsWith(Static259.aString316)) {
														local7764 = 11;
														local348 = local348.substring(Static259.aString316.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8058) byte local8058 = 0;
												if (local1699.startsWith(Static88.aString259)) {
													local8058 = 1;
													local348 = local348.substring(Static88.aString259.length());
												} else if (local1699.startsWith(Static331.aString413)) {
													local8058 = 2;
													local348 = local348.substring(Static331.aString413.length());
												} else if (local1699.startsWith(Static214.aString276)) {
													local8058 = 3;
													local348 = local348.substring(Static214.aString276.length());
												} else if (local1699.startsWith(Static316.aString393)) {
													local8058 = 4;
													local348 = local348.substring(Static316.aString393.length());
												} else if (local1699.startsWith(Static217.aString436)) {
													local8058 = 5;
													local348 = local348.substring(Static217.aString436.length());
												} else if (Static177.anInt3637 != 0) {
													if (local1699.startsWith(Static261.aString320)) {
														local8058 = 1;
														local348 = local348.substring(Static261.aString320.length());
													} else if (local1699.startsWith(Static47.aString94)) {
														local8058 = 2;
														local348 = local348.substring(Static47.aString94.length());
													} else if (local1699.startsWith(Static161.aString220)) {
														local8058 = 3;
														local348 = local348.substring(Static161.aString220.length());
													} else if (local1699.startsWith(Static211.aString274)) {
														local8058 = 4;
														local348 = local348.substring(Static211.aString274.length());
													} else if (local1699.startsWith(Static2.aString1)) {
														local8058 = 5;
														local348 = local348.substring(Static2.aString1.length());
													}
												}
												Static29.aClass7_Sub3_Sub2_1.method2799(90);
												Static29.aClass7_Sub3_Sub2_1.method2735(0);
												local410 = Static29.aClass7_Sub3_Sub2_1.anInt3005;
												Static29.aClass7_Sub3_Sub2_1.method2735(local7764);
												Static29.aClass7_Sub3_Sub2_1.method2735(local8058);
												Static254.method4307(local348, Static29.aClass7_Sub3_Sub2_1);
												Static29.aClass7_Sub3_Sub2_1.method2768(Static29.aClass7_Sub3_Sub2_1.anInt3005 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray20[local3];
												local1699 = aStringArray20[local3 + 1];
												if (Static244.anInt4842 != 0 || (!Static261.aBoolean371 || Static233.aBoolean343) && !Static343.aBoolean474) {
													Static29.aClass7_Sub3_Sub2_1.method2799(2);
													Static29.aClass7_Sub3_Sub2_1.method2735(0);
													local740 = Static29.aClass7_Sub3_Sub2_1.anInt3005;
													Static29.aClass7_Sub3_Sub2_1.method2738(local348);
													Static254.method4307(local1699, Static29.aClass7_Sub3_Sub2_1);
													Static29.aClass7_Sub3_Sub2_1.method2768(Static29.aClass7_Sub3_Sub2_1.anInt3005 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray289[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static206.aStringArray37[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray20[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray289[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static89.aStringArray23[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray20[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray289[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static215.anIntArray586[local536];
												}
												anIntArray289[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static252.aClass22_Sub2_Sub1_Sub1_4 == null || Static252.aClass22_Sub2_Sub1_Sub1_4.aString80 == null) {
													local348 = Static301.aString368;
												} else {
													local348 = Static252.aClass22_Sub2_Sub1_Sub1_4.method818();
												}
												aStringArray20[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray289[local1++] = Static239.anInt4724;
												continue;
											}
											if (local31 == 5017) {
												anIntArray289[local1++] = Static172.anInt2672;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray289[local1];
												local541 = 0;
												if (local536 < 100 && Static121.aStringArray30[local536] != null) {
													local541 = Static121.anIntArray365[local536];
												}
												anIntArray289[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray289[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static79.aStringArray19[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray20[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static252.aClass22_Sub2_Sub1_Sub1_4 == null || Static252.aClass22_Sub2_Sub1_Sub1_4.aString80 == null) {
													local348 = Static301.aString368;
												} else {
													local348 = Static252.aClass22_Sub2_Sub1_Sub1_4.method820();
												}
												aStringArray20[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray289[local1];
												aStringArray20[local3++] = Static14.method206(local536).aString204;
												continue;
											}
											@Pc(8492) Class7_Sub1_Sub12 local8492;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray289[local1];
												local8492 = Static14.method206(local536);
												if (local8492.anIntArray404 == null) {
													anIntArray289[local1++] = 0;
												} else {
													anIntArray289[local1++] = local8492.anIntArray404.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												@Pc(8527) Class7_Sub1_Sub12 local8527 = Static14.method206(local536);
												local391 = local8527.anIntArray404[local541];
												anIntArray289[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray289[local1];
												local8492 = Static14.method206(local536);
												if (local8492.anIntArray405 == null) {
													anIntArray289[local1++] = 0;
												} else {
													anIntArray289[local1++] = local8492.anIntArray405.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												anIntArray289[local1++] = Static14.method206(local536).anIntArray405[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray289[local1];
												aStringArray20[local3++] = Static259.method4353(local536).method97();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray289[local1];
												@Pc(8622) Class7_Sub1_Sub1 local8622 = Static259.method4353(local536);
												if (local8622.anIntArray17 == null) {
													anIntArray289[local1++] = 0;
												} else {
													anIntArray289[local1++] = local8622.anIntArray17.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												anIntArray289[local1++] = Static259.method4353(local536).anIntArray17[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass106_1 = new Class106();
												local1--;
												aClass106_1.anInt3026 = anIntArray289[local1];
												aClass106_1.aClass7_Sub1_Sub1_1 = Static259.method4353(aClass106_1.anInt3026);
												aClass106_1.anIntArray398 = new int[aClass106_1.aClass7_Sub1_Sub1_1.method104()];
												continue;
											}
											if (local31 == 5059) {
												Static29.aClass7_Sub3_Sub2_1.method2799(150);
												Static29.aClass7_Sub3_Sub2_1.method2735(0);
												local536 = Static29.aClass7_Sub3_Sub2_1.anInt3005;
												Static29.aClass7_Sub3_Sub2_1.method2735(0);
												Static29.aClass7_Sub3_Sub2_1.method2788(aClass106_1.anInt3026);
												aClass106_1.aClass7_Sub1_Sub1_1.method102(aClass106_1.anIntArray398, Static29.aClass7_Sub3_Sub2_1);
												Static29.aClass7_Sub3_Sub2_1.method2768(Static29.aClass7_Sub3_Sub2_1.anInt3005 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray20[local3];
												Static29.aClass7_Sub3_Sub2_1.method2799(72);
												Static29.aClass7_Sub3_Sub2_1.method2735(0);
												local541 = Static29.aClass7_Sub3_Sub2_1.anInt3005;
												Static29.aClass7_Sub3_Sub2_1.method2738(local348);
												Static29.aClass7_Sub3_Sub2_1.method2788(aClass106_1.anInt3026);
												aClass106_1.aClass7_Sub1_Sub1_1.method102(aClass106_1.anIntArray398, Static29.aClass7_Sub3_Sub2_1);
												Static29.aClass7_Sub3_Sub2_1.method2768(Static29.aClass7_Sub3_Sub2_1.anInt3005 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static29.aClass7_Sub3_Sub2_1.method2799(150);
												Static29.aClass7_Sub3_Sub2_1.method2735(0);
												local536 = Static29.aClass7_Sub3_Sub2_1.anInt3005;
												Static29.aClass7_Sub3_Sub2_1.method2735(1);
												Static29.aClass7_Sub3_Sub2_1.method2788(aClass106_1.anInt3026);
												aClass106_1.aClass7_Sub1_Sub1_1.method102(aClass106_1.anIntArray398, Static29.aClass7_Sub3_Sub2_1);
												Static29.aClass7_Sub3_Sub2_1.method2768(Static29.aClass7_Sub3_Sub2_1.anInt3005 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												anIntArray289[local1++] = Static14.method206(local536).aCharArray4[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												anIntArray289[local1++] = Static14.method206(local536).aCharArray5[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												if (local541 == -1) {
													anIntArray289[local1++] = -1;
												} else {
													anIntArray289[local1++] = Static14.method206(local536).method2869((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												if (local541 == -1) {
													anIntArray289[local1++] = -1;
												} else {
													anIntArray289[local1++] = Static14.method206(local536).method2871((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray289[local1];
												anIntArray289[local1++] = Static259.method4353(local536).method104();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												local740 = Static259.method4353(local536).method96(local541);
												anIntArray289[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												aClass106_1.anIntArray398[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												aClass106_1.anIntArray398[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray289[local1];
												local541 = anIntArray289[local1 + 1];
												local740 = anIntArray289[local1 + 2];
												@Pc(9051) Class7_Sub1_Sub1 local9051 = Static259.method4353(local536);
												if (local9051.method96(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray289[local1++] = local9051.method99(local541, local740);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray20[local3];
												local1--;
												local1266 = anIntArray289[local1] == 1;
												Static189.method3446(local1266, local348);
												anIntArray289[local1++] = Static66.anInt1665;
												continue;
											}
											if (local31 == 5072) {
												if (Static197.aShortArray62 != null && Static11.anInt3202 < Static66.anInt1665) {
													anIntArray289[local1++] = Static197.aShortArray62[Static11.anInt3202++] & 0xFFFF;
													continue;
												}
												anIntArray289[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static11.anInt3202 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static17.aBooleanArray24[86]) {
													anIntArray289[local1++] = 1;
												} else {
													anIntArray289[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static17.aBooleanArray24[82]) {
													anIntArray289[local1++] = 1;
												} else {
													anIntArray289[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static17.aBooleanArray24[81]) {
													anIntArray289[local1++] = 1;
												} else {
													anIntArray289[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9571) boolean local9571;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static50.method1091(anIntArray289[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray289[local1++] = Static262.method4383();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static2.method12(-1, false, anIntArray289[local1], -1);
													continue;
												}
												@Pc(9247) Class7_Sub1_Sub10 local9247;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray289[local1];
													local9247 = Static306.method3059(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9247 == null) {
														anIntArray289[local1++] = -1;
													} else {
														anIntArray289[local1++] = local9247.anInt2515;
													}
													continue;
												}
												@Pc(9271) Class7_Sub1_Sub10 local9271;
												if (local31 == 5207) {
													local1--;
													local9271 = Static306.method3072(anIntArray289[local1]);
													if (local9271 != null && local9271.aString173 != null) {
														aStringArray20[local3++] = local9271.aString173;
														continue;
													}
													aStringArray20[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray289[local1++] = Static284.anInt5566;
													anIntArray289[local1++] = Static159.anInt3301;
													continue;
												}
												if (local31 == 5209) {
													anIntArray289[local1++] = Static244.anInt4835 + Static306.anInt3327;
													anIntArray289[local1++] = Static107.anInt1502 + Static306.anInt3329;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray289[local1];
													local9247 = Static306.method3072(local536);
													if (local9247 == null) {
														anIntArray289[local1++] = 0;
														anIntArray289[local1++] = 0;
													} else {
														anIntArray289[local1++] = local9247.anInt2520 >> 14 & 0x3FFF;
														anIntArray289[local1++] = local9247.anInt2520 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray289[local1];
													local9247 = Static306.method3072(local536);
													if (local9247 == null) {
														anIntArray289[local1++] = 0;
														anIntArray289[local1++] = 0;
													} else {
														anIntArray289[local1++] = local9247.anInt2521 - local9247.anInt2519;
														anIntArray289[local1++] = local9247.anInt2517 - local9247.anInt2512;
													}
													continue;
												}
												@Pc(9413) Class7_Sub37 local9413;
												if (local31 == 5212) {
													local9413 = Static87.method4771();
													if (local9413 == null) {
														anIntArray289[local1++] = -1;
														anIntArray289[local1++] = -1;
													} else {
														anIntArray289[local1++] = local9413.anInt5839;
														local541 = local9413.anInt5837 << 28 | local9413.anInt5844 + Static306.anInt3327 << 14 | local9413.anInt5840 + Static306.anInt3329;
														anIntArray289[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9413 = Static200.method3574();
													if (local9413 == null) {
														anIntArray289[local1++] = -1;
														anIntArray289[local1++] = -1;
													} else {
														anIntArray289[local1++] = local9413.anInt5839;
														local541 = local9413.anInt5837 << 28 | local9413.anInt5844 + Static306.anInt3327 << 14 | local9413.anInt5840 + Static306.anInt3329;
														anIntArray289[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray289[local1];
													local9247 = Static338.method5371();
													if (local9247 != null) {
														local6900 = local9247.method2128(anIntArray292, local536 >> 28 & 0x3, local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
														if (local6900) {
															Static222.method3928(anIntArray292[2], anIntArray292[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray289[local1];
													local541 = anIntArray289[local1 + 1];
													@Pc(9569) Class30 local9569 = Static306.method3057(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9571 = false;
													for (@Pc(9576) Class7_Sub1_Sub10 local9576 = (Class7_Sub1_Sub10) local9569.method505(); local9576 != null; local9576 = (Class7_Sub1_Sub10) local9569.method508()) {
														if (local9576.anInt2515 == local541) {
															local9571 = true;
															break;
														}
													}
													if (local9571) {
														anIntArray289[local1++] = 1;
													} else {
														anIntArray289[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray289[local1];
													local9247 = Static306.method3072(local536);
													if (local9247 == null) {
														anIntArray289[local1++] = -1;
													} else {
														anIntArray289[local1++] = local9247.anInt2525;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray289[local1++] = Static339.anInt6444 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray289[local1];
													Static222.method3928(local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9271 = Static338.method5371();
													if (local9271 == null) {
														anIntArray289[local1++] = -1;
														anIntArray289[local1++] = -1;
													} else {
														local1266 = local9271.method2135(anIntArray292, Static244.anInt4835 + Static306.anInt3327, Static107.anInt1502 + Static306.anInt3329);
														if (local1266) {
															anIntArray289[local1++] = anIntArray292[1];
															anIntArray289[local1++] = anIntArray292[2];
														} else {
															anIntArray289[local1++] = -1;
															anIntArray289[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray289[local1];
													local541 = anIntArray289[local1 + 1];
													Static2.method12(local541 & 0x3FFF, false, local536, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray289[local1];
													local9247 = Static338.method5371();
													if (local9247 == null) {
														anIntArray289[local1++] = -1;
														anIntArray289[local1++] = -1;
													} else {
														local6900 = local9247.method2128(anIntArray292, local536 >> 28 & 0x3, local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
														if (local6900) {
															anIntArray289[local1++] = anIntArray292[1];
															anIntArray289[local1++] = anIntArray292[2];
														} else {
															anIntArray289[local1++] = -1;
															anIntArray289[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray289[local1];
													local9247 = Static338.method5371();
													if (local9247 == null) {
														anIntArray289[local1++] = -1;
														anIntArray289[local1++] = -1;
													} else {
														local6900 = local9247.method2135(anIntArray292, local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
														if (local6900) {
															anIntArray289[local1++] = anIntArray292[1];
															anIntArray289[local1++] = anIntArray292[2];
														} else {
															anIntArray289[local1++] = -1;
															anIntArray289[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static168.method3219(anIntArray289[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray289[local1];
													local541 = anIntArray289[local1 + 1];
													Static2.method12(local541 & 0x3FFF, true, local536, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static134.aBoolean225 = anIntArray289[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray289[local1++] = Static134.aBoolean225 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray289[local1];
													Static355.method5705(local536);
													continue;
												}
												@Pc(9987) Class7 local9987;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray289[local1];
													local1266 = anIntArray289[local1 + 1] == 1;
													if (Static153.aClass10_25 == null) {
														continue;
													}
													local9987 = Static153.aClass10_25.method163((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5648();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class7();
														Static153.aClass10_25.method161((long) local536, local9987);
													}
													continue;
												}
												@Pc(10026) Class7 local10026;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray289[local1];
													if (Static153.aClass10_25 == null) {
														anIntArray289[local1++] = 0;
													} else {
														local10026 = Static153.aClass10_25.method163((long) local536);
														anIntArray289[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray289[local1];
													local1266 = anIntArray289[local1 + 1] == 1;
													if (Static66.aClass10_15 == null) {
														continue;
													}
													local9987 = Static66.aClass10_15.method163((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5648();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class7();
														Static66.aClass10_15.method161((long) local536, local9987);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray289[local1];
													if (Static66.aClass10_15 == null) {
														anIntArray289[local1++] = 0;
													} else {
														local10026 = Static66.aClass10_15.method163((long) local536);
														anIntArray289[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray289[local1++] = Static306.aClass7_Sub1_Sub10_2 == null ? -1 : Static306.aClass7_Sub1_Sub10_2.anInt2515;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray289[local1];
													local541 = anIntArray289[local1 + 1];
													Static216.method3821(false, local541, 3, local536);
													anIntArray289[local1++] = Static342.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static342.aFrame2 != null) {
														Static216.method3821(false, -1, Static6.anInt126, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10189) Class201[] local10189 = Static141.method2851();
													anIntArray289[local1++] = local10189.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray289[local1];
													@Pc(10207) Class201[] local10207 = Static141.method2851();
													anIntArray289[local1++] = local10207[local536].anInt6172;
													anIntArray289[local1++] = local10207[local536].anInt6174;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static345.anInt6528;
													local541 = Static227.anInt6305;
													local740 = -1;
													@Pc(10236) Class201[] local10236 = Static141.method2851();
													for (local410 = 0; local410 < local10236.length; local410++) {
														@Pc(10243) Class201 local10243 = local10236[local410];
														if (local10243.anInt6172 == local536 && local10243.anInt6174 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray289[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray289[local1++] = Static213.method3775();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray289[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static216.method3821(false, -1, local536, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray289[local1++] = Static6.anInt126;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray289[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static6.anInt126 = local536;
														Static244.method4220(Static116.aClass21_4);
													}
													continue;
												}
											} else {
												@Pc(10698) String local10698;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray20[local3];
														local1699 = aStringArray20[local3 + 1];
														local1--;
														local740 = anIntArray289[local1];
														Static29.aClass7_Sub3_Sub2_1.method2799(110);
														Static29.aClass7_Sub3_Sub2_1.method2735(Static344.method5559(local348) + Static344.method5559(local1699) + 1);
														Static29.aClass7_Sub3_Sub2_1.method2738(local348);
														Static29.aClass7_Sub3_Sub2_1.method2738(local1699);
														Static29.aClass7_Sub3_Sub2_1.method2735(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static275.aShortArray111[anIntArray289[local1]] = (short) Static120.method2554(anIntArray289[local1 + 1]);
														Static319.method5153();
														Static23.method4814();
														Static296.method5034();
														Static141.method2848();
														Static183.method3347();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static138.anIntArrayArrayArray8[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1] << 1;
														local740 = anIntArray289[local1 + 2];
														local391 = anIntArray289[local1 + 3];
														local410 = anIntArray289[local1 + 4];
														local771 = anIntArray289[local1 + 5];
														@Pc(10484) int local10484 = anIntArray289[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static138.anIntArrayArrayArray8[local536] != null && local541 >= 0 && local541 < Static138.anIntArrayArrayArray8[local536].length) {
															Static138.anIntArrayArrayArray8[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10484 };
															Static138.anIntArrayArrayArray8[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static138.anIntArrayArrayArray8[anIntArray289[local1]].length >> 1;
														anIntArray289[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static342.aFrame2 != null) {
															Static216.method3821(false, -1, Static6.anInt126, -1);
														}
														if (Static212.aFrame1 == null) {
															local348 = Static273.aString342 == null ? Static68.method1368() : Static273.aString342;
															Static59.method1193(local348, false, Static329.anInt6220 == 1, Static116.aClass21_4);
														} else {
															Static288.method1007();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static166.aClass99_7 != null) {
															if (Static166.aClass99_7.anObject2 == null) {
																local348 = Static37.method836(Static166.aClass99_7.anInt2834);
															} else {
																local348 = (String) Static166.aClass99_7.anObject2;
															}
														}
														aStringArray20[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray289[local1++] = Static22.anInt448 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static342.aFrame2 != null) {
															Static216.method3821(false, -1, Static6.anInt126, -1);
														}
														local3--;
														local348 = aStringArray20[local3];
														local1--;
														local1266 = anIntArray289[local1] == 1;
														local10698 = Static68.method1368() + local348;
														Static59.method1193(local10698, local1266, Static329.anInt6220 == 1, Static116.aClass21_4);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray20[local3];
														local1699 = aStringArray20[local3 + 1];
														local1--;
														local740 = anIntArray289[local1];
														if (local348.length() > 0) {
															if (Static48.aStringArray45 == null) {
																Static48.aStringArray45 = new String[Static247.anIntArray644[Static345.anInt6530]];
															}
															Static48.aStringArray45[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static66.aStringArray16 == null) {
																Static66.aStringArray16 = new String[Static247.anIntArray644[Static345.anInt6530]];
															}
															Static66.aStringArray16[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray20[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static243.anInt4806 = anIntArray289[local1];
														Static256.anInt4945 = anIntArray289[local1 + 1];
														Static282.anInt5545 = anIntArray289[local1 + 2];
														Static171.anInt3564 = anIntArray289[local1 + 3];
														Static171.anInt3574 = anIntArray289[local1 + 4];
														Static182.anInt3706 = anIntArray289[local1 + 5];
														Static205.anInt4084 = anIntArray289[local1 + 6];
														Static247.anInt4895 = anIntArray289[local1 + 7];
														Static315.anInt6039 = anIntArray289[local1 + 8];
														Static256.anInt4948 = anIntArray289[local1 + 9];
														Static130.anInt2840 = anIntArray289[local1 + 10];
														Static312.aClass180_89.method4562(Static171.anInt3574);
														Static312.aClass180_89.method4562(Static182.anInt3706);
														Static312.aClass180_89.method4562(Static205.anInt4084);
														Static312.aClass180_89.method4562(Static247.anInt4895);
														Static312.aClass180_89.method4562(Static315.anInt6039);
														Static229.aClass52_25 = null;
														Static143.aClass52_23 = null;
														Static144.aClass52_13 = null;
														Static203.aClass52_21 = null;
														Static252.aClass52_28 = null;
														Static121.aClass52_11 = null;
														Static180.aClass52_19 = null;
														Static352.aClass52_31 = null;
														Static274.aBoolean403 = true;
														continue;
													}
													if (local31 == 5425) {
														Static242.method3141();
														Static274.aBoolean403 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static348.anInt6555 = anIntArray289[local1];
														Static56.anInt1465 = anIntArray289[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static232.anInt4617 = anIntArray289[local1];
														Static227.anInt6306 = anIntArray289[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														anIntArray289[local1++] = Static73.method1457(local536, local541) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static346.method5570(false, aStringArray20[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														local391 = anIntArray289[local1 + 3];
														Static136.method2692(local391, (local536 & 0x3FFF) - Static237.anInt4696, (local536 >> 14 & 0x3FFF) - Static350.anInt6609, local541, local740, false);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														local391 = anIntArray289[local1 + 3];
														Static5.method65(local740, (local536 & 0x3FFF) - Static237.anInt4696, local541, (local536 >> 14 & 0x3FFF) - Static350.anInt6609, local391);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray289[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static138.anInt3018 = local536;
														local541 = anIntArray289[local1 + 1];
														if (local541 + 1 >= Static138.anIntArrayArrayArray8[Static138.anInt3018].length >> 1) {
															throw new RuntimeException();
														}
														Static207.anInt4143 = local541;
														Static10.anInt178 = 0;
														Static108.anInt1314 = anIntArray289[local1 + 2];
														Static133.anInt2885 = anIntArray289[local1 + 3];
														local740 = anIntArray289[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static82.anInt2148 = local740;
														local391 = anIntArray289[local1 + 5];
														if (local391 + 1 >= Static138.anIntArrayArrayArray8[Static82.anInt2148].length >> 1) {
															throw new RuntimeException();
														}
														Static283.anInt5564 = local391;
														Static118.anInt6324 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static82.method1754();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static229.method4028(anIntArray289[local1], anIntArray289[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray289[local1++] = (int) Static18.aFloat7 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray289[local1++] = (int) Static351.aFloat80 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static126.method2604();
														continue;
													}
													if (local31 == 5508) {
														Static131.method2647();
														continue;
													}
													if (local31 == 5509) {
														Static86.method1829();
														continue;
													}
													if (local31 == 5510) {
														Static82.method1760();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray289[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static350.anInt6609;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static15.anInt287) {
															local541 = Static15.anInt287;
														}
														local740 -= Static237.anInt4696;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static325.anInt6173) {
															local740 = Static325.anInt6173;
														}
														Static74.anInt1848 = local541 * 128 + 64;
														Static318.anInt611 = local740 * 128 + 64;
														Static118.anInt6324 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static29.method511();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray20[local3];
														local1699 = aStringArray20[local3 + 1];
														local1--;
														local740 = anIntArray289[local1];
														if (Static85.anInt2215 == 10 && Static191.anInt3822 == 0 && Static125.anInt2778 == 0 && Static339.anInt6449 == 0 && Static120.anInt2721 == 0) {
															Static89.method1856(local740, local1699, local348);
														}
														continue;
													}
													if (local31 == 5601) {
														Static299.method4867();
														continue;
													}
													if (local31 == 5602) {
														if (Static125.anInt2778 == 0) {
															Static346.anInt6535 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static85.anInt2215 == 10 && Static191.anInt3822 == 0 && Static125.anInt2778 == 0 && Static339.anInt6449 == 0 && Static120.anInt2721 == 0) {
															Static78.method5354(anIntArray289[local1 + 1], anIntArray289[local1 + 3], anIntArray289[local1 + 2], anIntArray289[local1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static85.anInt2215 == 10 && Static191.anInt3822 == 0 && Static125.anInt2778 == 0 && Static339.anInt6449 == 0 && Static120.anInt2721 == 0) {
															Static320.method5181(Static199.method3568(aStringArray20[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static85.anInt2215 == 10 && Static191.anInt3822 == 0 && Static125.anInt2778 == 0 && Static339.anInt6449 == 0 && Static120.anInt2721 == 0) {
															Static182.method3336(anIntArray289[local1 + 6] == 1, anIntArray289[local1 + 1], anIntArray289[local1], anIntArray289[local1 + 4] == 1, anIntArray289[local1 + 3], Static199.method3568(aStringArray20[local3]), aStringArray20[local3 + 1], anIntArray289[local1 + 5] == 1, anIntArray289[local1 + 2], aStringArray20[local3 + 2]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static339.anInt6449 == 0) {
															Static353.anInt2411 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray289[local1++] = Static346.anInt6535;
														continue;
													}
													if (local31 == 5608) {
														anIntArray289[local1++] = Static67.anInt6311;
														continue;
													}
													if (local31 == 5609) {
														anIntArray289[local1++] = Static353.anInt2411;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray20[local3++] = Static310.aStringArray47.length > local536 ? Static74.method1489(Static310.aStringArray47[local536]) : "";
														}
														Static310.aStringArray47 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray289[local1++] = Static273.anInt5393;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static289.anInt2339 = local536;
														Static33.method684();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static252.method5176(anIntArray289[local1] == 1);
														Static268.method4491();
														Static33.method684();
														Static268.method4484();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Class22_Sub2_Sub5.lb = anIntArray289[local1] == 1;
														Static268.method4484();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static155.aBoolean244 = anIntArray289[local1] == 1;
														Static33.method684();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static342.aBoolean471 = anIntArray289[local1] == 1;
														Static128.aClass89_3.method5460(!Static342.aBoolean471);
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static2.anInt18 = anIntArray289[local1];
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static308.aBoolean431 = anIntArray289[local1] == 1;
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static70.aBoolean128 = anIntArray289[local1] == 1;
														Static33.method684();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static231.aBoolean341 = anIntArray289[local1] == 1;
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static336.anInt4180 = local536;
														Static33.method684();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static325.aBoolean452 = anIntArray289[local1] == 1;
														Static20.method310();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static140.aBoolean228 = anIntArray289[local1] == 1;
														Static33.method684();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static296.aBoolean432 = anIntArray289[local1] == 1;
														Static33.method684();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static206.anInt4115 = local536;
														Static229.method4027();
														Static244.method4220(Static116.aClass21_4);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static108.aBoolean108 = anIntArray289[local1] == 1;
														Static286.method4742();
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static110.anInt2524 = local536;
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static254.anInt4943) {
															if (Static254.anInt4943 == 0 && Static149.anInt3231 != -1) {
																Static226.method4018(Static149.anInt3231, Static226.aClass180_57, local536);
																Static85.aBoolean152 = false;
															} else if (local536 == 0) {
																Static79.method1632();
																Static85.aBoolean152 = false;
															} else {
																Static170.method5023(local536);
															}
															Static254.anInt4943 = local536;
														}
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static165.anInt3445 = local536;
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static34.aBoolean59 = anIntArray289[local1] == 1;
														Static268.method4484();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray289[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static194.anInt1874 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static218.method3851(local536);
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														anIntArray289[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static27.anInt622 = local536;
														Static244.method4220(Static116.aClass21_4);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static186.anInt3771 = local536;
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static290.method4752(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static35.aBoolean76 = anIntArray289[local1] != 0;
														Static244.method4220(Static116.aClass21_4);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static2.anInt18 = anIntArray289[local1];
														Static244.method4220(Static116.aClass21_4);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static53.aBoolean112 = anIntArray289[local1] != 0;
														Static244.method4220(Static116.aClass21_4);
														Static33.method684();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static244.method4219(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray289[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static244.anInt4807 = local536;
														Static244.method4220(Static116.aClass21_4);
														Static35.aBoolean77 = false;
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray289[local1++] = Static289.anInt2339;
														continue;
													}
													if (local31 == 6102) {
														anIntArray289[local1++] = Static105.method5089() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray289[local1++] = Class22_Sub2_Sub5.lb ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray289[local1++] = Static155.aBoolean244 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray289[local1++] = Static342.aBoolean471 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray289[local1++] = Static2.anInt18;
														continue;
													}
													if (local31 == 6108) {
														anIntArray289[local1++] = Static308.aBoolean431 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray289[local1++] = Static70.aBoolean128 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray289[local1++] = Static231.aBoolean341 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray289[local1++] = Static336.anInt4180;
														continue;
													}
													if (local31 == 6112) {
														anIntArray289[local1++] = Static325.aBoolean452 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray289[local1++] = Static140.aBoolean228 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray289[local1++] = Static296.aBoolean432 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray289[local1++] = Static206.anInt4115;
														continue;
													}
													if (local31 == 6117) {
														anIntArray289[local1++] = Static108.aBoolean108 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray289[local1++] = Static110.anInt2524;
														continue;
													}
													if (local31 == 6119) {
														anIntArray289[local1++] = Static254.anInt4943;
														continue;
													}
													if (local31 == 6120) {
														anIntArray289[local1++] = Static165.anInt3445;
														continue;
													}
													if (local31 == 6121) {
														anIntArray289[local1++] = Static128.aClass89_3.method5485() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray289[local1++] = Static290.method4749();
														continue;
													}
													if (local31 == 6124) {
														anIntArray289[local1++] = Static27.anInt622;
														continue;
													}
													if (local31 == 6125) {
														anIntArray289[local1++] = Static186.anInt3771;
														continue;
													}
													if (local31 == 6126) {
														anIntArray289[local1++] = Static128.aClass89_3.method5430() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray289[local1++] = Static324.aBoolean451 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray289[local1++] = Static35.aBoolean76 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray289[local1++] = Static2.anInt18;
														continue;
													}
													if (local31 == 6130) {
														anIntArray289[local1++] = Static53.aBoolean112 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray289[local1++] = Static329.anInt6220;
														continue;
													}
													if (local31 == 6132) {
														anIntArray289[local1++] = Static244.anInt4807;
														continue;
													}
													if (local31 == 6133) {
														anIntArray289[local1++] = Static22.anInt448 == 1 || Static22.anInt448 == 4 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static264.aShort68 = (short) anIntArray289[local1];
														if (Static264.aShort68 <= 0) {
															Static264.aShort68 = 256;
														}
														Static89.aShort40 = (short) anIntArray289[local1 + 1];
														if (Static89.aShort40 <= 0) {
															Static89.aShort40 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static33.aShort19 = (short) anIntArray289[local1];
														if (Static33.aShort19 <= 0) {
															Static33.aShort19 = 256;
														}
														Static92.aShort41 = (short) anIntArray289[local1 + 1];
														if (Static92.aShort41 <= 0) {
															Static92.aShort41 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static6.aShort2 = (short) anIntArray289[local1];
														if (Static6.aShort2 <= 0) {
															Static6.aShort2 = 1;
														}
														Static101.aShort51 = (short) anIntArray289[local1 + 1];
														if (Static101.aShort51 <= 0) {
															Static101.aShort51 = 32767;
														} else if (Static101.aShort51 < Static6.aShort2) {
															Static101.aShort51 = Static6.aShort2;
														}
														Static4.aShort1 = (short) anIntArray289[local1 + 2];
														if (Static4.aShort1 <= 0) {
															Static4.aShort1 = 1;
														}
														Static33.aShort20 = (short) anIntArray289[local1 + 3];
														if (Static33.aShort20 <= 0) {
															Static33.aShort20 = 32767;
														} else if (Static33.aShort20 < Static4.aShort1) {
															Static33.aShort20 = Static4.aShort1;
														}
														continue;
													}
													if (local31 == 6203) {
														Static216.method3822(Static197.aClass26_21.anInt515, false, 0, Static197.aClass26_21.anInt523, 0);
														anIntArray289[local1++] = Static233.anInt4636;
														anIntArray289[local1++] = Static59.anInt1509;
														continue;
													}
													if (local31 == 6204) {
														anIntArray289[local1++] = Static33.aShort19;
														anIntArray289[local1++] = Static92.aShort41;
														continue;
													}
													if (local31 == 6205) {
														anIntArray289[local1++] = Static264.aShort68;
														anIntArray289[local1++] = Static89.aShort40;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray289[local1++] = (int) (Static335.method5308() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray289[local1++] = (int) (Static335.method5308() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray289[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static335.method5308()));
														anIntArray289[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray289[local1];
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
														anIntArray289[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray289[local1++] = Static268.method4488() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray289[local1++] = Static348.method5588() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static85.anInt2215 == 10 && Static191.anInt3822 == 0 && Static125.anInt2778 == 0 && Static339.anInt6449 == 0) {
															anIntArray289[local1++] = Static191.method3452() == -1 ? 0 : 1;
															continue;
														}
														anIntArray289[local1++] = 1;
														continue;
													}
													@Pc(12964) Class136 local12964;
													@Pc(12940) Class187_Sub1 local12940;
													if (local31 == 6501) {
														local12940 = Static310.method5007();
														if (local12940 == null) {
															anIntArray289[local1++] = -1;
															anIntArray289[local1++] = 0;
															aStringArray20[local3++] = "";
															anIntArray289[local1++] = 0;
															aStringArray20[local3++] = "";
															anIntArray289[local1++] = 0;
															anIntArray289[local1++] = 0;
														} else {
															anIntArray289[local1++] = local12940.anInt5950;
															anIntArray289[local1++] = local12940.anInt5938;
															aStringArray20[local3++] = local12940.aString383;
															local12964 = local12940.method5040();
															anIntArray289[local1++] = local12964.anInt3867;
															aStringArray20[local3++] = local12964.aString250;
															anIntArray289[local1++] = local12940.anInt5942;
															anIntArray289[local1++] = local12940.anInt5953;
														}
														continue;
													}
													if (local31 == 6502) {
														local12940 = Static345.method5562();
														if (local12940 == null) {
															anIntArray289[local1++] = -1;
															anIntArray289[local1++] = 0;
															aStringArray20[local3++] = "";
															anIntArray289[local1++] = 0;
															aStringArray20[local3++] = "";
															anIntArray289[local1++] = 0;
															anIntArray289[local1++] = 0;
														} else {
															anIntArray289[local1++] = local12940.anInt5950;
															anIntArray289[local1++] = local12940.anInt5938;
															aStringArray20[local3++] = local12940.aString383;
															local12964 = local12940.method5040();
															anIntArray289[local1++] = local12964.anInt3867;
															aStringArray20[local3++] = local12964.aString250;
															anIntArray289[local1++] = local12940.anInt5942;
															anIntArray289[local1++] = local12940.anInt5953;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray289[local1];
														if (Static85.anInt2215 == 10 && Static191.anInt3822 == 0 && Static125.anInt2778 == 0 && Static339.anInt6449 == 0) {
															anIntArray289[local1++] = Static48.method4690(local536) ? 1 : 0;
															continue;
														}
														anIntArray289[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static275.anInt5447 = anIntArray289[local1];
														Static244.method4220(Static116.aClass21_4);
														continue;
													}
													if (local31 == 6505) {
														anIntArray289[local1++] = Static275.anInt5447;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray289[local1];
														@Pc(13184) Class187_Sub1 local13184 = Static27.method479(local536);
														if (local13184 == null) {
															anIntArray289[local1++] = -1;
															aStringArray20[local3++] = "";
															anIntArray289[local1++] = 0;
															aStringArray20[local3++] = "";
															anIntArray289[local1++] = 0;
															anIntArray289[local1++] = 0;
														} else {
															anIntArray289[local1++] = local13184.anInt5938;
															aStringArray20[local3++] = local13184.aString383;
															@Pc(13202) Class136 local13202 = local13184.method5040();
															anIntArray289[local1++] = local13202.anInt3867;
															aStringArray20[local3++] = local13202.aString250;
															anIntArray289[local1++] = local13184.anInt5942;
															anIntArray289[local1++] = local13184.anInt5953;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray289[local1];
														local1266 = anIntArray289[local1 + 1] == 1;
														local740 = anIntArray289[local1 + 2];
														local9571 = anIntArray289[local1 + 3] == 1;
														Static94.method1905(local740, local9571, local1266, local536);
														continue;
													}
													if (local31 == 6508) {
														Static302.method5507();
														continue;
													}
													if (local31 == 6509) {
														if (Static85.anInt2215 == 10) {
															local1--;
															if (anIntArray289[local1] == 1) {
																if (Static162.aClass123_4 == null) {
																	Static162.aClass123_4 = new Class123();
																}
															} else if (Static162.aClass123_4 != null) {
																Static162.aClass123_4.method3243();
																Static162.aClass123_4 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static268.aBoolean393 = anIntArray289[local1] == 1;
														Static244.method4220(Static116.aClass21_4);
														continue;
													}
													if (local31 == 6601) {
														anIntArray289[local1++] = Static268.aBoolean393 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static250.anInt4912 == 2) {
													if (local31 == 6700) {
														local536 = Static247.aClass10_40.method159();
														if (Static161.anInt3337 != -1) {
															local536++;
														}
														anIntArray289[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray289[local1];
														if (Static161.anInt3337 != -1) {
															if (local536 == 0) {
																anIntArray289[local1++] = Static161.anInt3337;
																continue;
															}
															local536--;
														}
														local3526 = (Class7_Sub17) Static247.aClass10_40.method157();
														while (local536-- > 0) {
															local3526 = (Class7_Sub17) Static247.aClass10_40.method155();
														}
														anIntArray289[local1++] = local3526.anInt3252;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray289[local1];
														if (Static298.aClass26ArrayArray1[local536] == null) {
															aStringArray20[local3++] = "";
														} else {
															local1699 = Static298.aClass26ArrayArray1[local536][0].aString47;
															if (local1699 == null) {
																aStringArray20[local3++] = "";
															} else {
																aStringArray20[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray289[local1];
														if (Static298.aClass26ArrayArray1[local536] == null) {
															anIntArray289[local1++] = 0;
														} else {
															anIntArray289[local1++] = Static298.aClass26ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														if (Static298.aClass26ArrayArray1[local536] == null) {
															aStringArray20[local3++] = "";
														} else {
															local10698 = Static298.aClass26ArrayArray1[local536][local541].aString47;
															if (local10698 == null) {
																aStringArray20[local3++] = "";
															} else {
																aStringArray20[local3++] = local10698;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														if (Static298.aClass26ArrayArray1[local536] == null) {
															anIntArray289[local1++] = 0;
														} else {
															anIntArray289[local1++] = Static298.aClass26ArrayArray1[local536][local541].anInt504;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 1);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 2);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 3);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 4);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 5);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 6);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 7);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 8);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 9);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														Static319.method5152("", local536 << 16 | local541, local740, 10);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray289[local1];
														local541 = anIntArray289[local1 + 1];
														local740 = anIntArray289[local1 + 2];
														local750 = Static23.method4815(local740, local536 << 16 | local541);
														Static249.method1112();
														@Pc(13929) Class7_Sub27 local13929 = Static45.method1034(local750);
														Static48.method4685(local750.anInt507, local13929.method3765(), local740, local13929.anInt4220, local750.anInt485, local536 << 16 | local541);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(13962) Class155 local13962;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray289[local1];
														local13962 = Static84.method1785(local536);
														if (local13962.aString294 == null) {
															aStringArray20[local3++] = "";
														} else {
															aStringArray20[local3++] = local13962.aString294;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray289[local1];
														local13962 = Static84.method1785(local536);
														anIntArray289[local1++] = local13962.anInt4673;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray289[local1];
														local13962 = Static84.method1785(local536);
														anIntArray289[local1++] = local13962.anInt4663;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray289[local1];
														local13962 = Static84.method1785(local536);
														anIntArray289[local1++] = local13962.anInt4683;
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
								local855 = Static245.method4231(anIntArray289[local1]);
							} else {
								local855 = local714 ? aClass26_15 : aClass26_16;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray289[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method424(aStringArray20[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray289[local1];
								local740 = anIntArray289[local1 + 1];
								local855.aClass26_6 = Static23.method4815(local740, local541);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean41 = anIntArray289[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt503 = anIntArray289[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt524 = anIntArray289[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString49 = aStringArray20[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString44 = aStringArray20[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray6 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt485 = anIntArray289[local1];
								local1--;
								local855.anInt507 = anIntArray289[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray289[local1];
								local1--;
								local740 = anIntArray289[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method435(local541, local740 - 1);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString45 = aStringArray20[local3];
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14041) Exception local14041) {
			if (arg0.aString105 == null) {
				Static46.method1056("CS2 - scr:" + arg0.aLong232 + " op:" + local13, local14041);
			} else {
				Static16.method2749("Clientscript error in: " + arg0.aString105);
				@Pc(14059) StringBuffer local14059 = new StringBuffer(30);
				local14059.append("Clientscript error in: ").append(arg0.aString105).append("\n");
				for (local536 = anInt2156 - 1; local536 >= 0; local536--) {
					local14059.append("via: ").append(aClass130Array1[local536].aClass7_Sub1_Sub6_1.aString105).append("\n");
				}
				local14059.append("Op: ").append(local13).append("\n");
				local1699 = local14041.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14059.append("Message: ").append(local1699).append("\n");
				}
				Static46.method1056(local14059.toString(), local14041);
				Static59.method1195(local14059.toString());
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!me;)V")
	public static void method1766(@OriginalArg(0) Class7_Sub25 arg0) {
		method1763(arg0, 200000);
	}
}
