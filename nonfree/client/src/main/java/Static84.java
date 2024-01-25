import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "Lclient!gaa;")
	private static Class108 aClass108_2;

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "Lclient!jh;")
	private static Class159 aClass159_1;

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "[I")
	private static int[] anIntArray87;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "Lclient!gaa;")
	private static Class108 aClass108_3;

	@OriginalMember(owner = "client!dba", name = "w", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray9;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "[Lclient!bo;")
	private static final Class35[] aClass35Array1 = new Class35[50];

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
	private static int anInt2261 = 0;

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "[[I")
	private static final int[][] anIntArrayArray19 = new int[5][5000];

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray8 = new String[1000];

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "[I")
	private static final int[] anIntArray88 = new int[1000];

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
	private static int anInt2264 = 0;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
	private static int anInt2266 = 0;

	@OriginalMember(owner = "client!dba", name = "x", descriptor = "[I")
	private static final int[] anIntArray89 = new int[5];

	@OriginalMember(owner = "client!dba", name = "z", descriptor = "[I")
	private static final int[] anIntArray90 = new int[3];

	@OriginalMember(owner = "client!dba", name = "A", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_10 = new Class112(4);

	@OriginalMember(owner = "client!dba", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
	private static int anInt2271 = 0;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!jea;I)V")
	private static void method2217(@OriginalArg(0) Class3_Sub1_Sub9 arg0, @OriginalArg(1) int arg1) {
		anInt2264 = 0;
		anInt2261 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray325;
		@Pc(11) int[] local11 = arg0.anIntArray326;
		@Pc(13) byte local13 = -1;
		anInt2266 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label270: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(839) boolean local839;
					if (local11[local5] == 1) {
						local839 = true;
					} else {
						local839 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method2220(local31, local839);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2228(local31, local839);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray88[anInt2264++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray88[anInt2264++] = Static514.aClass166_1.anIntArray337[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static514.aClass166_1.method4936(anIntArray88[--anInt2264], local54);
					} else if (local31 == 3) {
						aStringArray8[anInt2261++] = arg0.aStringArray21[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt2264 -= 2;
						if (anIntArray88[anInt2264] != anIntArray88[anInt2264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt2264 -= 2;
						if (anIntArray88[anInt2264] == anIntArray88[anInt2264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt2264 -= 2;
						if (anIntArray88[anInt2264] < anIntArray88[anInt2264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt2264 -= 2;
						if (anIntArray88[anInt2264] > anIntArray88[anInt2264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt2266 == 0) {
							return;
						}
						@Pc(216) Class35 local216 = aClass35Array1[--anInt2266];
						arg0 = local216.aClass3_Sub1_Sub9_1;
						local8 = arg0.anIntArray325;
						local11 = arg0.anIntArray326;
						local5 = local216.anInt1026;
						anIntArray87 = local216.anIntArray49;
						aStringArray9 = local216.aStringArray6;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray88[anInt2264++] = Static514.aClass166_1.method4928(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static514.aClass166_1.method4933(anIntArray88[--anInt2264], local54);
					} else if (local31 == 31) {
						anInt2264 -= 2;
						if (anIntArray88[anInt2264] <= anIntArray88[anInt2264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt2264 -= 2;
						if (anIntArray88[anInt2264] >= anIntArray88[anInt2264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray88[anInt2264++] = anIntArray87[local11[local5]];
					} else if (local31 == 34) {
						anIntArray87[local11[local5]] = anIntArray88[--anInt2264];
					} else if (local31 == 35) {
						aStringArray8[anInt2261++] = aStringArray9[local11[local5]];
					} else if (local31 == 36) {
						aStringArray9[local11[local5]] = aStringArray8[--anInt2261];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt2261 -= local54;
						@Pc(400) String local400 = Static157.method3365(aStringArray8, local54, anInt2261);
						aStringArray8[anInt2261++] = local400;
					} else if (local31 == 38) {
						anInt2264--;
					} else if (local31 == 39) {
						anInt2261--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub1_Sub9 local436 = Static634.method8592(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5691];
							@Pc(450) String[] local450 = new String[local436.anInt5692];
							for (local452 = 0; local452 < local436.anInt5689; local452++) {
								local446[local452] = anIntArray88[anInt2264 + local452 - local436.anInt5689];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5696; local471++) {
								local450[local471] = aStringArray8[anInt2261 + local471 - local436.anInt5696];
							}
							anInt2264 -= local436.anInt5689;
							anInt2261 -= local436.anInt5696;
							@Pc(502) Class35 local502 = new Class35();
							local502.aClass3_Sub1_Sub9_1 = arg0;
							local502.anInt1026 = local5;
							local502.anIntArray49 = anIntArray87;
							local502.aStringArray6 = aStringArray9;
							if (anInt2266 >= aClass35Array1.length) {
								throw new RuntimeException();
							}
							aClass35Array1[anInt2266++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray325;
							local11 = local436.anIntArray326;
							local5 = -1;
							anIntArray87 = local446;
							aStringArray9 = local450;
						} else if (local31 == 42) {
							anIntArray88[anInt2264++] = Static477.anIntArray533[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static477.anIntArray533[local54] = anIntArray88[--anInt2264];
							Static401.method6381(local54);
							Static555.aBoolean799 |= Static158.aBooleanArray10[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray88[--anInt2264];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray89[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label270;
									}
									anIntArrayArray19[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray88[--anInt2264];
							if (local603 < 0 || local603 >= anIntArray89[local54]) {
								throw new RuntimeException();
							}
							anIntArray88[anInt2264++] = anIntArrayArray19[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt2264 -= 2;
							local603 = anIntArray88[anInt2264];
							if (local603 < 0 || local603 >= anIntArray89[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray19[local54][local603] = anIntArray88[anInt2264 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static648.aStringArray42[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray8[anInt2261++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static648.aStringArray42[local54] = aStringArray8[--anInt2261];
							Static610.method8288(local54);
						} else if (local31 == 51) {
							@Pc(774) Class307 local774 = arg0.aClass307Array1[local11[local5]];
							@Pc(787) Class3_Sub8 local787 = (Class3_Sub8) local774.method7424((long) anIntArray88[--anInt2264]);
							if (local787 != null) {
								local5 += local787.anInt706;
							}
						} else if (local31 == 86) {
							if (anIntArray88[--anInt2264] == 1) {
								local5 += local11[local5];
							}
						} else if (local31 == 87 && anIntArray88[--anInt2264] == 0) {
							local5 += local11[local5];
						}
					}
				}
			}
		} catch (@Pc(874) Exception local874) {
			@Pc(893) StringBuffer local893;
			if (arg0.aString53 == null) {
				local893 = new StringBuffer(30);
				local893.append("CS2: ").append(arg0.aLong277).append(" ");
				for (local603 = anInt2266 - 1; local603 >= 0; local603--) {
					local893.append("v: ").append(aClass35Array1[local603].aClass3_Sub1_Sub9_1.aLong277).append(" ");
				}
				local893.append("op: ").append(local13);
				Static544.method7724(local893.toString(), local874);
			} else {
				Static496.method7251("Clientscript error in: " + arg0.aString53);
				local893 = new StringBuffer(30);
				local893.append("Clientscript error in: ").append(arg0.aString53).append("\n");
				for (local603 = anInt2266 - 1; local603 >= 0; local603--) {
					local893.append("via: ").append(aClass35Array1[local603].aClass3_Sub1_Sub9_1.aString53).append("\n");
				}
				local893.append("Op: ").append(local13).append("\n");
				@Pc(933) String local933 = local874.getMessage();
				if (local933 != null && local933.length() > 0) {
					local893.append("Message: ").append(local933).append("\n");
				}
				Static544.method7724(local893.toString(), local874);
				Static117.method2792(local893.toString());
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!nha;II)V")
	public static void method2218(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub1_Sub9 local5 = Static285.method4970(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray87 = new int[local5.anInt5691];
		aStringArray9 = new String[local5.anInt5692];
		if (local5.aClass229_6 == Static177.aClass229_1 || local5.aClass229_6 == Static247.aClass229_5 || local5.aClass229_6 == Static320.aClass229_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static505.aClass108_10 != null) {
				local30 = Static505.aClass108_10.anInt4070;
				local32 = Static505.aClass108_10.anInt4053;
			}
			anIntArray87[0] = Static501.aClass59_5.method4107() - local30;
			anIntArray87[1] = Static501.aClass59_5.method4106() - local32;
		}
		method2217(local5, 200000);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)V")
	public static void method2219() {
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(IZ)V")
	private static void method2220(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class108 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class108 local35;
		@Pc(210) Class108 local210;
		@Pc(13) int local13;
		@Pc(158) Class108 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt2264 -= 3;
				local13 = anIntArray88[anInt2264];
				local19 = anIntArray88[anInt2264 + 1];
				local25 = anIntArray88[anInt2264 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static113.method8285(local13);
				if (local35.aClass108Array1 == null) {
					local35.aClass108Array1 = new Class108[local25 + 1];
				}
				if (local35.aClass108Array1.length <= local25) {
					@Pc(54) Class108[] local54 = new Class108[local25 + 1];
					for (local56 = 0; local56 < local35.aClass108Array1.length; local56++) {
						local54[local56] = local35.aClass108Array1[local56];
					}
					local35.aClass108Array1 = local54;
				}
				if (local25 > 0 && local35.aClass108Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class108 local99 = new Class108();
				local99.anInt4018 = local19;
				local99.anInt4046 = local99.anInt4043 = local35.anInt4043;
				local99.anInt4083 = local25;
				local35.aClass108Array1[local25] = local99;
				if (arg1) {
					aClass108_3 = local99;
				} else {
					aClass108_2 = local99;
				}
				Static139.method3135(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass108_3 : aClass108_2;
				if (local137.anInt4083 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static113.method8285(local137.anInt4043);
				local158.aClass108Array1[local137.anInt4083] = null;
				Static139.method3135(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static113.method8285(anIntArray88[--anInt2264]);
				local137.aClass108Array1 = null;
				Static139.method3135(local137);
				return;
			}
			if (arg0 == 200) {
				anInt2264 -= 2;
				local13 = anIntArray88[anInt2264];
				local19 = anIntArray88[anInt2264 + 1];
				local210 = Static526.method6818(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray88[anInt2264++] = 1;
					if (arg1) {
						aClass108_3 = local210;
						return;
					}
					aClass108_2 = local210;
					return;
				}
				anIntArray88[anInt2264++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray88[--anInt2264];
				local158 = Static113.method8285(local13);
				if (local158 != null) {
					anIntArray88[anInt2264++] = 1;
					if (arg1) {
						aClass108_3 = local158;
						return;
					}
					aClass108_2 = local158;
					return;
				}
				anIntArray88[anInt2264++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray88[--anInt2264];
				method2229(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray88[--anInt2264];
				method2223(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt2264 -= 2;
					local13 = anIntArray88[anInt2264];
					local19 = anIntArray88[anInt2264 + 1];
					if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static51.anIntArray53.length; local25++) {
						if (Static51.anIntArray53[local25] == local13) {
							Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1.method8175(Static510.aClass97_2, local19, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static131.anIntArray159.length; local357++) {
						if (Static131.anIntArray159[local357] == local13) {
							Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1.method8175(Static510.aClass97_2, local19, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt2264 -= 2;
					local13 = anIntArray88[anInt2264];
					local19 = anIntArray88[anInt2264 + 1];
					if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 == null) {
						return;
					}
					Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1.method8185(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray88[--anInt2264] != 0;
					if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 == null) {
						return;
					}
					Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1.method8173(local420);
					return;
				}
				if (arg0 == 411) {
					anInt2264 -= 2;
					local13 = anIntArray88[anInt2264];
					local19 = anIntArray88[anInt2264 + 1];
					if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 == null) {
						return;
					}
					Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1.method8182(local19, Static367.aClass281_1, local13);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static113.method8285(anIntArray88[--anInt2264]);
					} else {
						local137 = arg1 ? aClass108_3 : aClass108_2;
					}
					if (arg0 == 1100) {
						anInt2264 -= 2;
						local137.anInt4056 = anIntArray88[anInt2264];
						if (local137.anInt4056 > local137.anInt4084 - local137.anInt4067) {
							local137.anInt4056 = local137.anInt4084 - local137.anInt4067;
						}
						if (local137.anInt4056 < 0) {
							local137.anInt4056 = 0;
						}
						local137.anInt4009 = anIntArray88[anInt2264 + 1];
						if (local137.anInt4009 > local137.anInt4035 - local137.anInt4037) {
							local137.anInt4009 = local137.anInt4035 - local137.anInt4037;
						}
						if (local137.anInt4009 < 0) {
							local137.anInt4009 = 0;
						}
						Static139.method3135(local137);
						if (local137.anInt4083 == -1) {
							Static182.method3696(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt4069 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						if (local137.anInt4083 == -1) {
							Static559.method7894(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean343 = anIntArray88[--anInt2264] == 1;
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt4022 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt4049 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray88[--anInt2264];
						if (local137.anInt4020 != local19) {
							local137.anInt4020 = local19;
							Static139.method3135(local137);
						}
						if (local137.anInt4083 == -1) {
							Static521.method7461(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt4092 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean345 = anIntArray88[--anInt2264] == 1;
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt4044 = 1;
						local137.anInt4097 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						if (local137.anInt4083 == -1) {
							Static502.method7317(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt2264 -= 6;
						local137.anInt4032 = anIntArray88[anInt2264];
						local137.anInt4011 = anIntArray88[anInt2264 + 1];
						local137.anInt4063 = anIntArray88[anInt2264 + 2];
						local137.anInt4085 = anIntArray88[anInt2264 + 3];
						local137.anInt4064 = anIntArray88[anInt2264 + 4];
						local137.anInt4071 = anIntArray88[anInt2264 + 5];
						Static139.method3135(local137);
						if (local137.anInt4083 == -1) {
							Static351.method5756(local137.anInt4043);
							Static410.method6442(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray88[--anInt2264];
						if (local137.anInt4015 != local19) {
							local137.anInt4015 = local19;
							local137.anInt4025 = 0;
							local137.anInt4095 = 1;
							local137.anInt4065 = 0;
							@Pc(1110) Class290 local1110 = local137.anInt4015 == -1 ? null : Static618.aClass222_2.method5867(local137.anInt4015);
							if (local1110 != null) {
								Static468.method6973(local137.anInt4025, local1110);
							}
							Static139.method3135(local137);
						}
						if (local137.anInt4083 == -1) {
							Static241.method4617(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean337 = anIntArray88[--anInt2264] == 1;
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray8[--anInt2261];
						if (!local1161.equals(local137.aString39)) {
							local137.aString39 = local1161;
							Static139.method3135(local137);
						}
						if (local137.anInt4083 == -1) {
							Static504.method7367(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt4101 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						if (local137.anInt4083 == -1) {
							Static533.method7599(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt2264 -= 3;
						local137.anInt4094 = anIntArray88[anInt2264];
						local137.anInt4045 = anIntArray88[anInt2264 + 1];
						local137.anInt4013 = anIntArray88[anInt2264 + 2];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean348 = anIntArray88[--anInt2264] == 1;
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt4068 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt4026 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean347 = anIntArray88[--anInt2264] == 1;
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean340 = anIntArray88[--anInt2264] == 1;
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt2264 -= 2;
						local137.anInt4084 = anIntArray88[anInt2264];
						local137.anInt4035 = anIntArray88[anInt2264 + 1];
						Static139.method3135(local137);
						if (local137.anInt4018 == 0) {
							Static62.method1330(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean353 = anIntArray88[--anInt2264] == 1;
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt4071 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						if (local137.anInt4083 == -1) {
							Static351.method5756(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray88[--anInt2264];
						local137.aBoolean342 = local19 == 1;
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt2264 -= 2;
						local137.anInt4036 = anIntArray88[anInt2264];
						local137.anInt4079 = anIntArray88[anInt2264 + 1];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt4073 = anIntArray88[--anInt2264];
						Static139.method3135(local137);
						return;
					}
					@Pc(1489) Class140 local1489;
					if (arg0 == 1127) {
						anInt2264 -= 2;
						local19 = anIntArray88[anInt2264];
						local25 = anIntArray88[anInt2264 + 1];
						local1489 = Static513.aClass49_2.method1857(local19);
						if (local25 != local1489.anInt5140) {
							local137.method3529(local19, local25);
							return;
						}
						local137.method3517(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray88[--anInt2264];
						local1523 = aStringArray8[--anInt2261];
						local1489 = Static513.aClass49_2.method1857(local19);
						if (!local1489.aString48.equals(local1523)) {
							local137.method3530(local19, local1523);
							return;
						}
						local137.method3517(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray88[--anInt2264];
						if (local137.anInt4018 != 5 && arg0 == 1129 || local137.anInt4018 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt4040 != local19) {
							local137.anInt4040 = local19;
							Static139.method3135(local137);
						}
						if (local137.anInt4083 == -1) {
							Static206.method5564(local137.anInt4043);
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static113.method8285(anIntArray88[--anInt2264]);
					} else {
						local137 = arg1 ? aClass108_3 : aClass108_2;
					}
					Static139.method3135(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt2264 -= 2;
						local19 = anIntArray88[anInt2264];
						local25 = anIntArray88[anInt2264 + 1];
						if (local137.anInt4083 == -1) {
							Static584.method8057(local137.anInt4043);
							Static351.method5756(local137.anInt4043);
							Static410.method6442(local137.anInt4043);
						}
						if (local19 == -1) {
							local137.anInt4044 = 1;
							local137.anInt4097 = -1;
							local137.anInt4059 = -1;
							return;
						}
						local137.anInt4059 = local19;
						local137.anInt4012 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean350 = true;
						} else {
							local137.aBoolean350 = false;
						}
						@Pc(1713) Class237 local1713 = Static367.aClass281_1.method6975(local19);
						local137.anInt4063 = local1713.anInt7303;
						local137.anInt4085 = local1713.anInt7265;
						local137.anInt4064 = local1713.anInt7313;
						local137.anInt4032 = local1713.anInt7306;
						local137.anInt4011 = local1713.anInt7305;
						local137.anInt4071 = local1713.anInt7283;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt4090 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt4090 = 1;
						} else {
							local137.anInt4090 = 2;
						}
						if (local137.anInt4088 > 0) {
							local137.anInt4071 = local137.anInt4071 * 32 / local137.anInt4088;
							return;
						}
						if (local137.anInt4087 > 0) {
							local137.anInt4071 = local137.anInt4071 * 32 / local137.anInt4087;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt4044 = 2;
						local137.anInt4097 = anIntArray88[--anInt2264];
						if (local137.anInt4083 == -1) {
							Static502.method7317(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt4044 = 3;
						local137.anInt4097 = -1;
						if (local137.anInt4083 == -1) {
							Static502.method7317(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt4044 = 6;
						local137.anInt4097 = anIntArray88[--anInt2264];
						if (local137.anInt4083 == -1) {
							Static502.method7317(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt4044 = 5;
						local137.anInt4097 = anIntArray88[--anInt2264];
						if (local137.anInt4083 == -1) {
							Static502.method7317(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt2264 -= 4;
						local137.anInt4062 = anIntArray88[anInt2264];
						local137.anInt4042 = anIntArray88[anInt2264 + 1];
						local137.anInt4058 = anIntArray88[anInt2264 + 2];
						local137.anInt4061 = anIntArray88[anInt2264 + 3];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt2264 -= 2;
						local137.anInt4082 = anIntArray88[anInt2264];
						local137.anInt4100 = anIntArray88[anInt2264 + 1];
						Static139.method3135(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt2264 -= 4;
						local137.anInt4097 = anIntArray88[anInt2264];
						local137.anInt4016 = anIntArray88[anInt2264 + 1];
						if (anIntArray88[anInt2264 + 2] == 1) {
							local137.anInt4044 = 9;
						} else {
							local137.anInt4044 = 8;
						}
						if (anIntArray88[anInt2264 + 3] == 1) {
							local137.aBoolean350 = true;
						} else {
							local137.aBoolean350 = false;
						}
						if (local137.anInt4083 == -1) {
							Static502.method7317(local137.anInt4043);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt4044 = 5;
						local137.anInt4097 = Static399.anInt7626;
						local137.anInt4016 = 0;
						if (local137.anInt4083 == -1) {
							Static502.method7317(local137.anInt4043);
						}
						return;
					}
				} else {
					@Pc(2373) int local2373;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static113.method8285(anIntArray88[--anInt2264]);
						} else {
							local137 = arg1 ? aClass108_3 : aClass108_2;
						}
						if (arg0 == 1300) {
							local19 = anIntArray88[--anInt2264] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method3523(aStringArray8[--anInt2261], local19);
								return;
							}
							anInt2261--;
							return;
						}
						if (arg0 == 1301) {
							anInt2264 -= 2;
							local19 = anIntArray88[anInt2264];
							local25 = anIntArray88[anInt2264 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass108_5 = null;
								return;
							}
							local137.aClass108_5 = Static526.method6818(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray88[--anInt2264];
							if (local19 != Static255.anInt5650 && local19 != Static126.anInt3177 && local19 != Static338.anInt6675) {
								return;
							}
							local137.lb = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt4077 = anIntArray88[--anInt2264];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt4075 = anIntArray88[--anInt2264];
							return;
						}
						if (arg0 == 1305) {
							local137.aString37 = aStringArray8[--anInt2261];
							return;
						}
						if (arg0 == 1306) {
							local137.aString35 = aStringArray8[--anInt2261];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray13 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt4028 = anIntArray88[--anInt2264];
							local137.anInt4089 = anIntArray88[--anInt2264];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray88[--anInt2264];
							local25 = anIntArray88[--anInt2264];
							if (local25 >= 1 && local25 <= 10) {
								local137.method3532(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString36 = aStringArray8[--anInt2261];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt4047 = anIntArray88[--anInt2264];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt2264 -= 3;
								local19 = anIntArray88[anInt2264] - 1;
								local25 = anIntArray88[anInt2264 + 1];
								local357 = anIntArray88[anInt2264 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt2264 -= 2;
								local19 = 10;
								local25 = anIntArray88[anInt2264];
								local357 = anIntArray88[anInt2264 + 1];
							}
							if (local137.aByteArray36 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray36 = new byte[11];
								local137.aByteArray37 = new byte[11];
								local137.anIntArray219 = new int[11];
							}
							local137.aByteArray36[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean339 = false;
								for (local2373 = 0; local2373 < local137.aByteArray36.length; local2373++) {
									if (local137.aByteArray36[local2373] != 0) {
										local137.aBoolean339 = true;
										break;
									}
								}
							} else {
								local137.aBoolean339 = true;
							}
							local137.aByteArray37[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt4098 = anIntArray88[--anInt2264];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static113.method8285(anIntArray88[--anInt2264]);
						} else {
							local137 = arg1 ? aClass108_3 : aClass108_2;
						}
						if (arg0 == 1499) {
							local137.method3534();
							return;
						}
						local1161 = aStringArray8[--anInt2261];
						@Pc(2459) int[] local2459 = null;
						if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
							local357 = anIntArray88[--anInt2264];
							if (local357 > 0) {
								local2459 = new int[local357];
								while (local357-- > 0) {
									local2459[local357] = anIntArray88[--anInt2264];
								}
							}
							local1161 = local1161.substring(0, local1161.length() - 1);
						}
						@Pc(2511) Object[] local2511 = new Object[local1161.length() + 1];
						for (local2373 = local2511.length - 1; local2373 >= 1; local2373--) {
							if (local1161.charAt(local2373 - 1) == 's') {
								local2511[local2373] = aStringArray8[--anInt2261];
							} else {
								local2511[local2373] = Integer.valueOf(anIntArray88[--anInt2264]);
							}
						}
						local56 = anIntArray88[--anInt2264];
						if (local56 == -1) {
							local2511 = null;
						} else {
							local2511[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray27 = local2511;
						} else if (arg0 == 1401) {
							local137.anObjectArray5 = local2511;
						} else if (arg0 == 1402) {
							local137.anObjectArray28 = local2511;
						} else if (arg0 == 1403) {
							local137.anObjectArray2 = local2511;
						} else if (arg0 == 1404) {
							local137.anObjectArray7 = local2511;
						} else if (arg0 == 1405) {
							local137.anObjectArray19 = local2511;
						} else if (arg0 == 1406) {
							local137.anObjectArray25 = local2511;
						} else if (arg0 == 1407) {
							local137.anObjectArray4 = local2511;
							local137.anIntArray222 = local2459;
						} else if (arg0 == 1408) {
							local137.anObjectArray31 = local2511;
						} else if (arg0 == 1409) {
							local137.anObjectArray21 = local2511;
						} else if (arg0 == 1410) {
							local137.anObjectArray6 = local2511;
						} else if (arg0 == 1411) {
							local137.anObjectArray23 = local2511;
						} else if (arg0 == 1412) {
							local137.anObjectArray12 = local2511;
						} else if (arg0 == 1414) {
							local137.anObjectArray29 = local2511;
							local137.anIntArray216 = local2459;
						} else if (arg0 == 1415) {
							local137.anObjectArray16 = local2511;
							local137.anIntArray215 = local2459;
						} else if (arg0 == 1416) {
							local137.anObjectArray8 = local2511;
						} else if (arg0 == 1417) {
							local137.anObjectArray10 = local2511;
						} else if (arg0 == 1418) {
							local137.anObjectArray15 = local2511;
						} else if (arg0 == 1419) {
							local137.anObjectArray17 = local2511;
						} else if (arg0 == 1420) {
							local137.anObjectArray30 = local2511;
						} else if (arg0 == 1421) {
							local137.anObjectArray9 = local2511;
						} else if (arg0 == 1422) {
							local137.anObjectArray20 = local2511;
						} else if (arg0 == 1423) {
							local137.anObjectArray11 = local2511;
						} else if (arg0 == 1424) {
							local137.anObjectArray13 = local2511;
						} else if (arg0 == 1425) {
							local137.anObjectArray22 = local2511;
						} else if (arg0 == 1426) {
							local137.anObjectArray3 = local2511;
						} else if (arg0 == 1427) {
							local137.anObjectArray14 = local2511;
						} else if (arg0 == 1428) {
							local137.anObjectArray24 = local2511;
							local137.anIntArray223 = local2459;
						} else if (arg0 == 1429) {
							local137.anObjectArray1 = local2511;
							local137.anIntArray220 = local2459;
						} else if (arg0 == 1430) {
							local137.anObjectArray18 = local2511;
						}
						local137.aBoolean349 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass108_3 : aClass108_2;
						if (arg0 == 1500) {
							anIntArray88[anInt2264++] = local137.anInt4070;
							return;
						}
						if (arg0 == 1501) {
							anIntArray88[anInt2264++] = local137.anInt4053;
							return;
						}
						if (arg0 == 1502) {
							anIntArray88[anInt2264++] = local137.anInt4067;
							return;
						}
						if (arg0 == 1503) {
							anIntArray88[anInt2264++] = local137.anInt4037;
							return;
						}
						if (arg0 == 1504) {
							anIntArray88[anInt2264++] = local137.aBoolean352 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray88[anInt2264++] = local137.anInt4046;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static200.method3945(local137);
							anIntArray88[anInt2264++] = local158 == null ? -1 : local158.anInt4043;
							return;
						}
					} else {
						@Pc(3107) Class140 local3107;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass108_3 : aClass108_2;
							if (arg0 == 1600) {
								anIntArray88[anInt2264++] = local137.anInt4056;
								return;
							}
							if (arg0 == 1601) {
								anIntArray88[anInt2264++] = local137.anInt4009;
								return;
							}
							if (arg0 == 1602) {
								aStringArray8[anInt2261++] = local137.aString39;
								return;
							}
							if (arg0 == 1603) {
								anIntArray88[anInt2264++] = local137.anInt4084;
								return;
							}
							if (arg0 == 1604) {
								anIntArray88[anInt2264++] = local137.anInt4035;
								return;
							}
							if (arg0 == 1605) {
								anIntArray88[anInt2264++] = local137.anInt4071;
								return;
							}
							if (arg0 == 1606) {
								anIntArray88[anInt2264++] = local137.anInt4063;
								return;
							}
							if (arg0 == 1607) {
								anIntArray88[anInt2264++] = local137.anInt4064;
								return;
							}
							if (arg0 == 1608) {
								anIntArray88[anInt2264++] = local137.anInt4085;
								return;
							}
							if (arg0 == 1609) {
								anIntArray88[anInt2264++] = local137.anInt4022;
								return;
							}
							if (arg0 == 1610) {
								anIntArray88[anInt2264++] = local137.anInt4032;
								return;
							}
							if (arg0 == 1611) {
								anIntArray88[anInt2264++] = local137.anInt4011;
								return;
							}
							if (arg0 == 1612) {
								anIntArray88[anInt2264++] = local137.anInt4020;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray88[--anInt2264];
								local3107 = Static513.aClass49_2.method1857(local19);
								if (local3107.method4349()) {
									aStringArray8[anInt2261++] = local137.method3522(local3107.aString48, local19);
									return;
								}
								anIntArray88[anInt2264++] = local137.method3527(local3107.anInt5140, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray88[anInt2264++] = local137.anInt4092;
								return;
							}
							if (arg0 == 2614) {
								anIntArray88[anInt2264++] = local137.anInt4044 == 1 ? local137.anInt4097 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass108_3 : aClass108_2;
							if (arg0 == 1700) {
								anIntArray88[anInt2264++] = local137.anInt4059;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt4059 != -1) {
									anIntArray88[anInt2264++] = local137.anInt4012;
									return;
								}
								anIntArray88[anInt2264++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray88[anInt2264++] = local137.anInt4083;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass108_3 : aClass108_2;
							if (arg0 == 1800) {
								anIntArray88[anInt2264++] = Static71.method1836(local137).method1191();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray88[--anInt2264];
								local19--;
								if (local137.aStringArray13 != null && local19 < local137.aStringArray13.length && local137.aStringArray13[local19] != null) {
									aStringArray8[anInt2261++] = local137.aStringArray13[local19];
									return;
								}
								aStringArray8[anInt2261++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString37 == null) {
									aStringArray8[anInt2261++] = "";
									return;
								}
								aStringArray8[anInt2261++] = local137.aString37;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static113.method8285(anIntArray88[--anInt2264]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass108_3 : aClass108_2;
							}
							if (anInt2271 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray14 == null) {
									return;
								}
								@Pc(3376) Class3_Sub51 local3376 = new Class3_Sub51();
								local3376.aClass108_13 = local137;
								local3376.anObjectArray33 = local137.anObjectArray14;
								local3376.anInt10305 = anInt2271 + 1;
								Static306.aClass276_42.method6906(local3376);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static113.method8285(anIntArray88[--anInt2264]);
							if (arg0 == 2500) {
								anIntArray88[anInt2264++] = local137.anInt4070;
								return;
							}
							if (arg0 == 2501) {
								anIntArray88[anInt2264++] = local137.anInt4053;
								return;
							}
							if (arg0 == 2502) {
								anIntArray88[anInt2264++] = local137.anInt4067;
								return;
							}
							if (arg0 == 2503) {
								anIntArray88[anInt2264++] = local137.anInt4037;
								return;
							}
							if (arg0 == 2504) {
								anIntArray88[anInt2264++] = local137.aBoolean352 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray88[anInt2264++] = local137.anInt4046;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static200.method3945(local137);
								anIntArray88[anInt2264++] = local158 == null ? -1 : local158.anInt4043;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static113.method8285(anIntArray88[--anInt2264]);
							if (arg0 == 2600) {
								anIntArray88[anInt2264++] = local137.anInt4056;
								return;
							}
							if (arg0 == 2601) {
								anIntArray88[anInt2264++] = local137.anInt4009;
								return;
							}
							if (arg0 == 2602) {
								aStringArray8[anInt2261++] = local137.aString39;
								return;
							}
							if (arg0 == 2603) {
								anIntArray88[anInt2264++] = local137.anInt4084;
								return;
							}
							if (arg0 == 2604) {
								anIntArray88[anInt2264++] = local137.anInt4035;
								return;
							}
							if (arg0 == 2605) {
								anIntArray88[anInt2264++] = local137.anInt4071;
								return;
							}
							if (arg0 == 2606) {
								anIntArray88[anInt2264++] = local137.anInt4063;
								return;
							}
							if (arg0 == 2607) {
								anIntArray88[anInt2264++] = local137.anInt4064;
								return;
							}
							if (arg0 == 2608) {
								anIntArray88[anInt2264++] = local137.anInt4085;
								return;
							}
							if (arg0 == 2609) {
								anIntArray88[anInt2264++] = local137.anInt4022;
								return;
							}
							if (arg0 == 2610) {
								anIntArray88[anInt2264++] = local137.anInt4032;
								return;
							}
							if (arg0 == 2611) {
								anIntArray88[anInt2264++] = local137.anInt4011;
								return;
							}
							if (arg0 == 2612) {
								anIntArray88[anInt2264++] = local137.anInt4020;
								return;
							}
							if (arg0 == 2613) {
								anIntArray88[anInt2264++] = local137.anInt4092;
								return;
							}
							if (arg0 == 2614) {
								anIntArray88[anInt2264++] = local137.anInt4044 == 1 ? local137.anInt4097 : -1;
								return;
							}
						} else {
							@Pc(3905) Class3_Sub50 local3905;
							@Pc(3803) Class3_Sub50 local3803;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static113.method8285(anIntArray88[--anInt2264]);
									anIntArray88[anInt2264++] = local137.anInt4059;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static113.method8285(anIntArray88[--anInt2264]);
									if (local137.anInt4059 != -1) {
										anIntArray88[anInt2264++] = local137.anInt4012;
										return;
									}
									anIntArray88[anInt2264++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray88[--anInt2264];
									local3803 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local13);
									if (local3803 != null) {
										anIntArray88[anInt2264++] = 1;
										return;
									}
									anIntArray88[anInt2264++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static113.method8285(anIntArray88[--anInt2264]);
									if (local137.aClass108Array1 == null) {
										anIntArray88[anInt2264++] = 0;
										return;
									}
									local19 = local137.aClass108Array1.length;
									for (local25 = 0; local25 < local137.aClass108Array1.length; local25++) {
										if (local137.aClass108Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray88[anInt2264++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt2264 -= 2;
									local13 = anIntArray88[anInt2264];
									local19 = anIntArray88[anInt2264 + 1];
									local3905 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local13);
									if (local3905 != null && local3905.anInt9575 == local19) {
										anIntArray88[anInt2264++] = 1;
										return;
									}
									anIntArray88[anInt2264++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static113.method8285(anIntArray88[--anInt2264]);
								if (arg0 == 2800) {
									anIntArray88[anInt2264++] = Static71.method1836(local137).method1191();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray88[--anInt2264];
									local19--;
									if (local137.aStringArray13 != null && local19 < local137.aStringArray13.length && local137.aStringArray13[local19] != null) {
										aStringArray8[anInt2261++] = local137.aStringArray13[local19];
										return;
									}
									aStringArray8[anInt2261++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString37 == null) {
										aStringArray8[anInt2261++] = "";
										return;
									}
									aStringArray8[anInt2261++] = local137.aString37;
									return;
								}
							} else {
								@Pc(4042) String local4042;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4042 = aStringArray8[--anInt2261];
										Static401.method6380(local4042);
										return;
									}
									if (arg0 == 3101) {
										anInt2264 -= 2;
										Static415.method6508(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2, anIntArray88[anInt2264 + 1], anIntArray88[anInt2264]);
										return;
									}
									if (arg0 == 3103) {
										Static420.method6550();
										return;
									}
									if (arg0 == 3104) {
										local4042 = aStringArray8[--anInt2261];
										local19 = 0;
										if (Static621.method8474(local4042)) {
											local19 = Static607.method8246(local4042);
										}
										@Pc(4102) Class3_Sub26 local4102 = Static640.method8636(Static183.aClass344_44, Static403.aClass294_3);
										local4102.aClass3_Sub15_Sub1_3.method8419(local19);
										Static472.method5189(local4102);
										return;
									}
									@Pc(4131) Class3_Sub26 local4131;
									if (arg0 == 3105) {
										local4042 = aStringArray8[--anInt2261];
										local4131 = Static640.method8636(Static620.aClass344_122, Static403.aClass294_3);
										local4131.aClass3_Sub15_Sub1_3.method8448(local4042.length() + 1);
										local4131.aClass3_Sub15_Sub1_3.method8417(local4042);
										Static472.method5189(local4131);
										return;
									}
									if (arg0 == 3106) {
										local4042 = aStringArray8[--anInt2261];
										local4131 = Static640.method8636(Static522.aClass344_110, Static403.aClass294_3);
										local4131.aClass3_Sub15_Sub1_3.method8448(local4042.length() + 1);
										local4131.aClass3_Sub15_Sub1_3.method8417(local4042);
										Static472.method5189(local4131);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray88[--anInt2264];
										local1161 = aStringArray8[--anInt2261];
										Static468.method6972(local1161, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt2264 -= 3;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local25 = anIntArray88[anInt2264 + 2];
										local35 = Static113.method8285(local25);
										Static232.method4481(local13, local19, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local210 = arg1 ? aClass108_3 : aClass108_2;
										Static232.method4481(local13, local19, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray88[--anInt2264];
										local4131 = Static640.method8636(Static145.aClass344_125, Static403.aClass294_3);
										local4131.aClass3_Sub15_Sub1_3.method8464(local13);
										Static472.method5189(local4131);
										return;
									}
									if (arg0 == 3111) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local3905 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local13);
										if (local3905 != null) {
											Static488.method7168(local3905.anInt9575 != local19, true, local3905);
										}
										Static648.method8675(3, true, local13, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt2264--;
										local13 = anIntArray88[anInt2264];
										local3803 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local13);
										if (local3803 != null && local3803.anInt9574 == 3) {
											Static488.method7168(true, true, local3803);
										}
										return;
									}
									if (arg0 == 3113) {
										Static35.method697(aStringArray8[--anInt2261]);
										return;
									}
									if (arg0 == 3114) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local1523 = aStringArray8[--anInt2261];
										Static97.method2492("", "", local13, "", local19, local1523);
										return;
									}
									if (arg0 == 3115) {
										anInt2264 -= 11;
										@Pc(4432) Class117[] local4432 = Static505.method7370();
										@Pc(4435) Class178[] local4435 = Static324.method5445();
										Static402.method6833(anIntArray88[anInt2264 + 5], anIntArray88[anInt2264 + 6], anIntArray88[anInt2264 + 8], anIntArray88[anInt2264 + 7], anIntArray88[anInt2264 + 10], anIntArray88[anInt2264 + 4], anIntArray88[anInt2264 + 9], anIntArray88[anInt2264 + 3], anIntArray88[anInt2264 + 2], local4435[anIntArray88[anInt2264 + 1]], local4432[anIntArray88[anInt2264]]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt2264 -= 3;
										Static167.method3515(255, anIntArray88[anInt2264], 256, anIntArray88[anInt2264 + 1], anIntArray88[anInt2264 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static85.method2237(255, 50, anIntArray88[--anInt2264]);
										return;
									}
									if (arg0 == 3202) {
										anInt2264 -= 2;
										Static496.method7253(anIntArray88[anInt2264], 255, anIntArray88[anInt2264 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt2264 -= 4;
										Static167.method3515(anIntArray88[anInt2264 + 3], anIntArray88[anInt2264], 256, anIntArray88[anInt2264 + 1], anIntArray88[anInt2264 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt2264 -= 3;
										Static85.method2237(anIntArray88[anInt2264 + 1], anIntArray88[anInt2264 + 2], anIntArray88[anInt2264]);
										return;
									}
									if (arg0 == 3205) {
										anInt2264 -= 3;
										Static496.method7253(anIntArray88[anInt2264], anIntArray88[anInt2264 + 2], anIntArray88[anInt2264 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt2264 -= 4;
										Static474.method7012(anIntArray88[anInt2264 + 2], anIntArray88[anInt2264 + 3], anIntArray88[anInt2264], 256, false, anIntArray88[anInt2264 + 1]);
										return;
									}
									if (arg0 == 3207) {
										anInt2264 -= 4;
										Static474.method7012(anIntArray88[anInt2264 + 2], anIntArray88[anInt2264 + 3], anIntArray88[anInt2264], 256, true, anIntArray88[anInt2264 + 1]);
										return;
									}
									if (arg0 == 3208) {
										anInt2264 -= 5;
										Static167.method3515(anIntArray88[anInt2264 + 3], anIntArray88[anInt2264], anIntArray88[anInt2264 + 4], anIntArray88[anInt2264 + 1], anIntArray88[anInt2264 + 2]);
										return;
									}
									if (arg0 == 3209) {
										anInt2264 -= 5;
										Static474.method7012(anIntArray88[anInt2264 + 2], anIntArray88[anInt2264 + 3], anIntArray88[anInt2264], anIntArray88[anInt2264 + 4], false, anIntArray88[anInt2264 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray88[anInt2264++] = Static251.anInt5580;
										return;
									}
									if (arg0 == 3301) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = Static578.method8020(local13, local19, false);
										return;
									}
									if (arg0 == 3302) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = Static346.method5689(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = Static497.method7257(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static126.aClass9_1.method105(local13).anInt1104;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static143.anIntArray191[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static641.anIntArray626[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static311.anIntArray367[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4960) byte local4960 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128;
										local19 = (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 >> 9) + Static446.anInt8090;
										local25 = (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 >> 9) + Static124.anInt3150;
										anIntArray88[anInt2264++] = (local4960 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray88[anInt2264++] = Static87.aBoolean195 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = Static578.method8020(local13, local19, true);
										return;
									}
									if (arg0 == 3314) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = Static346.method5689(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = Static497.method7257(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static106.anInt2660 >= 2) {
											anIntArray88[anInt2264++] = Static106.anInt2660;
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray88[anInt2264++] = Static285.anInt5873;
										return;
									}
									if (arg0 == 3318) {
										anIntArray88[anInt2264++] = Static621.aClass278_5.anInt8394;
										return;
									}
									if (arg0 == 3321) {
										anIntArray88[anInt2264++] = Static500.anInt8858;
										return;
									}
									if (arg0 == 3322) {
										anIntArray88[anInt2264++] = Static212.anInt9333;
										return;
									}
									if (arg0 == 3323) {
										if (Static417.anInt7801 >= 5 && Static417.anInt7801 <= 9) {
											anIntArray88[anInt2264++] = 1;
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static417.anInt7801 >= 5 && Static417.anInt7801 <= 9) {
											anIntArray88[anInt2264++] = Static417.anInt7801;
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray88[anInt2264++] = Static518.aBoolean849 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray88[anInt2264++] = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6383;
										return;
									}
									if (arg0 == 3327) {
										anIntArray88[anInt2264++] = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 != null && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1.aBoolean831 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray88[anInt2264++] = Static535.aBoolean550 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static433.method6622(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = Static60.method1309(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = Static60.method1309(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray88[anInt2264++] = Static231.anInt5230;
										return;
									}
									if (arg0 == 3335) {
										anIntArray88[anInt2264++] = Static380.anInt7247;
										return;
									}
									if (arg0 == 3336) {
										anInt2264 -= 4;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local25 = anIntArray88[anInt2264 + 2];
										local357 = anIntArray88[anInt2264 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local357;
										anIntArray88[anInt2264++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray88[anInt2264++] = Static134.anInt3486;
										return;
									}
									if (arg0 == 3338) {
										anIntArray88[anInt2264++] = Static473.method7011();
										return;
									}
									if (arg0 == 3339) {
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray88[anInt2264++] = Static386.aBoolean722 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray88[anInt2264++] = Static313.aBoolean541 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray88[anInt2264++] = Static501.aClass59_5.method4107();
										return;
									}
									if (arg0 == 3343) {
										anIntArray88[anInt2264++] = Static501.aClass59_5.method4106();
										return;
									}
									if (arg0 == 3344) {
										aStringArray8[anInt2261++] = Static506.method7377();
										return;
									}
									if (arg0 == 3345) {
										aStringArray8[anInt2261++] = Static629.method8530();
										return;
									}
									if (arg0 == 3346) {
										anIntArray88[anInt2264++] = Static469.method6994();
										return;
									}
									if (arg0 == 3347) {
										anIntArray88[anInt2264++] = Static181.anInt4316;
										return;
									}
									if (arg0 == 3349) {
										anIntArray88[anInt2264++] = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass145_7.method4535() >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5711) Class292 local5711;
									if (arg0 == 3400) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local5711 = Static432.aClass311_1.method7468(local13);
										aStringArray8[anInt2261++] = local5711.method7216(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt2264 -= 4;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local25 = anIntArray88[anInt2264 + 2];
										local357 = anIntArray88[anInt2264 + 3];
										@Pc(5757) Class292 local5757 = Static432.aClass311_1.method7468(local25);
										if (local5757.aChar4 == local13 && local5757.aChar5 == local19) {
											if (local19 == 115) {
												aStringArray8[anInt2261++] = local5757.method7216(local357);
												return;
											}
											anIntArray88[anInt2264++] = local5757.method7212(local357);
											return;
										}
										throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
									}
									if (arg0 == 3409) {
										anInt2264 -= 3;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local25 = anIntArray88[anInt2264 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5843) Class292 local5843 = Static432.aClass311_1.method7468(local19);
										if (local5843.aChar5 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray88[anInt2264++] = local5843.method7219(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray88[--anInt2264];
										local1161 = aStringArray8[--anInt2261];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5711 = Static432.aClass311_1.method7468(local13);
										if (local5711.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray88[anInt2264++] = local5711.method7213(local1161) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray88[--anInt2264];
										@Pc(5941) Class292 local5941 = Static432.aClass311_1.method7468(local13);
										anIntArray88[anInt2264++] = local5941.aClass307_45.method7420();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static175.anInt4151 == 0) {
											anIntArray88[anInt2264++] = -2;
											return;
										}
										if (Static175.anInt4151 == 1) {
											anIntArray88[anInt2264++] = -1;
											return;
										}
										anIntArray88[anInt2264++] = Static409.anInt6024;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray88[--anInt2264];
										if (Static175.anInt4151 == 2 && local13 < Static409.anInt6024) {
											aStringArray8[anInt2261++] = Static573.aStringArray40[local13];
											if (Static175.aStringArray16[local13] != null) {
												aStringArray8[anInt2261++] = Static175.aStringArray16[local13];
												return;
											}
											aStringArray8[anInt2261++] = "";
											return;
										}
										aStringArray8[anInt2261++] = "";
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray88[--anInt2264];
										if (Static175.anInt4151 == 2 && local13 < Static409.anInt6024) {
											anIntArray88[anInt2264++] = Static85.anIntArray91[local13];
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray88[--anInt2264];
										if (Static175.anInt4151 == 2 && local13 < Static409.anInt6024) {
											anIntArray88[anInt2264++] = Static76.anIntArray74[local13];
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4042 = aStringArray8[--anInt2261];
										local19 = anIntArray88[--anInt2264];
										Static636.method4420(local4042, local19);
										return;
									}
									if (arg0 == 3605) {
										local4042 = aStringArray8[--anInt2261];
										Static36.method716(local4042);
										return;
									}
									if (arg0 == 3606) {
										local4042 = aStringArray8[--anInt2261];
										Static211.method4160(local4042);
										return;
									}
									if (arg0 == 3607) {
										local4042 = aStringArray8[--anInt2261];
										Static614.method8354(local4042, false);
										return;
									}
									if (arg0 == 3608) {
										local4042 = aStringArray8[--anInt2261];
										Static412.method6448(local4042);
										return;
									}
									if (arg0 == 3609) {
										local4042 = aStringArray8[--anInt2261];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray88[anInt2264++] = Static203.method3963(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray88[--anInt2264];
										if (Static175.anInt4151 == 2 && local13 < Static409.anInt6024) {
											aStringArray8[anInt2261++] = Static193.aStringArray18[local13];
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static517.aString100 != null) {
											aStringArray8[anInt2261++] = Static622.method7879(Static517.aString100);
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static517.aString100 != null) {
											anIntArray88[anInt2264++] = Static126.anInt3181;
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray88[--anInt2264];
										if (Static517.aString100 != null && local13 < Static126.anInt3181) {
											aStringArray8[anInt2261++] = Static646.aClass323Array1[local13].aString105;
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray88[--anInt2264];
										if (Static517.aString100 != null && local13 < Static126.anInt3181) {
											anIntArray88[anInt2264++] = Static646.aClass323Array1[local13].anInt9459;
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray88[--anInt2264];
										if (Static517.aString100 != null && local13 < Static126.anInt3181) {
											anIntArray88[anInt2264++] = Static646.aClass323Array1[local13].aByte116;
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray88[anInt2264++] = Static350.aByte93;
										return;
									}
									if (arg0 == 3617) {
										local4042 = aStringArray8[--anInt2261];
										Static205.method4053(local4042);
										return;
									}
									if (arg0 == 3618) {
										anIntArray88[anInt2264++] = Static493.aByte105;
										return;
									}
									if (arg0 == 3619) {
										local4042 = aStringArray8[--anInt2261];
										Static27.method485(local4042);
										return;
									}
									if (arg0 == 3620) {
										Static63.method1341();
										return;
									}
									if (arg0 == 3621) {
										if (Static175.anInt4151 == 0) {
											anIntArray88[anInt2264++] = -1;
											return;
										}
										anIntArray88[anInt2264++] = Static644.anInt10532;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray88[--anInt2264];
										if (Static175.anInt4151 != 0 && local13 < Static644.anInt10532) {
											aStringArray8[anInt2261++] = Static615.aStringArray41[local13];
											if (Static228.aStringArray20[local13] != null) {
												aStringArray8[anInt2261++] = Static228.aStringArray20[local13];
												return;
											}
											aStringArray8[anInt2261++] = "";
											return;
										}
										aStringArray8[anInt2261++] = "";
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4042 = aStringArray8[--anInt2261];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray88[anInt2264++] = Static57.method8559(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray88[--anInt2264];
										if (Static646.aClass323Array1 != null && local13 < Static126.anInt3181 && Static646.aClass323Array1[local13].aString107.equalsIgnoreCase(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68)) {
											anIntArray88[anInt2264++] = 1;
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static191.aString44 != null) {
											aStringArray8[anInt2261++] = Static191.aString44;
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray88[--anInt2264];
										if (Static517.aString100 != null && local13 < Static126.anInt3181) {
											aStringArray8[anInt2261++] = Static646.aClass323Array1[local13].aString108;
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray88[--anInt2264];
										if (Static175.anInt4151 == 2 && local13 >= 0 && local13 < Static409.anInt6024) {
											anIntArray88[anInt2264++] = Static439.aBooleanArray16[local13] ? 1 : 0;
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4042 = aStringArray8[--anInt2261];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray88[anInt2264++] = Static30.method572(local4042);
										return;
									}
									if (arg0 == 3629) {
										anIntArray88[anInt2264++] = Static544.anInt9349;
										return;
									}
									if (arg0 == 3630) {
										local4042 = aStringArray8[--anInt2261];
										Static614.method8354(local4042, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static512.aBooleanArray24[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray88[--anInt2264];
										if (Static517.aString100 != null && local13 < Static126.anInt3181) {
											aStringArray8[anInt2261++] = Static646.aClass323Array1[local13].aString107;
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray88[--anInt2264];
										if (Static175.anInt4151 != 0 && local13 < Static644.anInt10532) {
											aStringArray8[anInt2261++] = Static552.aStringArray39[local13];
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static100.aClass298Array1[local13].method7371();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static100.aClass298Array1[local13].anInt8941;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static100.aClass298Array1[local13].anInt8942;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static100.aClass298Array1[local13].anInt8943;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static100.aClass298Array1[local13].anInt8936;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static100.aClass298Array1[local13].anInt8940;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray88[--anInt2264];
										local19 = Static100.aClass298Array1[local13].method7374();
										anIntArray88[anInt2264++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray88[--anInt2264];
										local19 = Static100.aClass298Array1[local13].method7374();
										anIntArray88[anInt2264++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray88[--anInt2264];
										local19 = Static100.aClass298Array1[local13].method7374();
										anIntArray88[anInt2264++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray88[--anInt2264];
										local19 = Static100.aClass298Array1[local13].method7374();
										anIntArray88[anInt2264++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt2264 -= 5;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local25 = anIntArray88[anInt2264 + 2];
										local357 = anIntArray88[anInt2264 + 3];
										local2373 = anIntArray88[anInt2264 + 4];
										anIntArray88[anInt2264++] = local13 + (local19 - local13) * (local2373 - local25) / (local357 - local25);
										return;
									}
									@Pc(7451) long local7451;
									@Pc(7444) long local7444;
									if (arg0 == 4007) {
										anInt2264 -= 2;
										local7444 = anIntArray88[anInt2264];
										local7451 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = (int) (local7444 + local7444 * local7451 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										if (local13 == 0) {
											anIntArray88[anInt2264++] = 0;
											return;
										}
										anIntArray88[anInt2264++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										if (local13 == 0) {
											anIntArray88[anInt2264++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray88[anInt2264++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray88[anInt2264++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt2264 -= 3;
										local7444 = anIntArray88[anInt2264];
										local7451 = anIntArray88[anInt2264 + 1];
										@Pc(7832) long local7832 = (long) anIntArray88[anInt2264 + 2];
										anIntArray88[anInt2264++] = (int) (local7444 * local7832 / local7451);
										return;
									}
									if (arg0 == 4019) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray88[anInt2264++] = 256;
										}
										@Pc(7891) double local7891 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray88[anInt2264++] = (int) (Math.pow(2.0D, local7891) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local4042 = aStringArray8[--anInt2261];
										local19 = anIntArray88[--anInt2264];
										aStringArray8[anInt2261++] = local4042 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt2261 -= 2;
										local4042 = aStringArray8[anInt2261];
										local1161 = aStringArray8[anInt2261 + 1];
										aStringArray8[anInt2261++] = local4042 + local1161;
										return;
									}
									if (arg0 == 4102) {
										local4042 = aStringArray8[--anInt2261];
										local19 = anIntArray88[--anInt2264];
										aStringArray8[anInt2261++] = local4042 + Static165.method3467(local19, true);
										return;
									}
									if (arg0 == 4103) {
										local4042 = aStringArray8[--anInt2261];
										aStringArray8[anInt2261++] = local4042.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray8[anInt2261++] = method2231(anIntArray88[--anInt2264]);
										return;
									}
									if (arg0 == 4105) {
										anInt2261 -= 2;
										local4042 = aStringArray8[anInt2261];
										local1161 = aStringArray8[anInt2261 + 1];
										if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 != null && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1.aBoolean831) {
											aStringArray8[anInt2261++] = local1161;
											return;
										}
										aStringArray8[anInt2261++] = local4042;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray88[--anInt2264];
										aStringArray8[anInt2261++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt2261 -= 2;
										anIntArray88[anInt2264++] = Static297.method5116(aStringArray8[anInt2261 + 1], Static380.anInt7247, aStringArray8[anInt2261]);
										return;
									}
									@Pc(8174) Class315 local8174;
									if (arg0 == 4108) {
										local4042 = aStringArray8[--anInt2261];
										anInt2264 -= 2;
										local19 = anIntArray88[anInt2264];
										local25 = anIntArray88[anInt2264 + 1];
										local8174 = Static256.method4821(local25, Static340.aClass181_62);
										anIntArray88[anInt2264++] = local8174.method7568(local19, local4042, Static583.aClass5Array19);
										return;
									}
									if (arg0 == 4109) {
										local4042 = aStringArray8[--anInt2261];
										anInt2264 -= 2;
										local19 = anIntArray88[anInt2264];
										local25 = anIntArray88[anInt2264 + 1];
										local8174 = Static256.method4821(local25, Static340.aClass181_62);
										anIntArray88[anInt2264++] = local8174.method7566(Static583.aClass5Array19, local19, local4042);
										return;
									}
									if (arg0 == 4110) {
										anInt2261 -= 2;
										local4042 = aStringArray8[anInt2261];
										local1161 = aStringArray8[anInt2261 + 1];
										if (anIntArray88[--anInt2264] == 1) {
											aStringArray8[anInt2261++] = local4042;
											return;
										}
										aStringArray8[anInt2261++] = local1161;
										return;
									}
									if (arg0 == 4111) {
										local4042 = aStringArray8[--anInt2261];
										aStringArray8[anInt2261++] = Static320.method5429(local4042);
										return;
									}
									if (arg0 == 4112) {
										local4042 = aStringArray8[--anInt2261];
										local19 = anIntArray88[--anInt2264];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray8[anInt2261++] = local4042 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = method2227((char) local13);
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static127.method2908((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static359.method7960((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static282.method4630((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local4042 = aStringArray8[--anInt2261];
										if (local4042 != null) {
											anIntArray88[anInt2264++] = local4042.length();
											return;
										}
										anIntArray88[anInt2264++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local4042 = aStringArray8[--anInt2261];
										anInt2264 -= 2;
										local19 = anIntArray88[anInt2264];
										local25 = anIntArray88[anInt2264 + 1];
										aStringArray8[anInt2261++] = local4042.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local4042 = aStringArray8[--anInt2261];
										@Pc(8532) StringBuffer local8532 = new StringBuffer(local4042.length());
										@Pc(8534) boolean local8534 = false;
										for (local357 = 0; local357 < local4042.length(); local357++) {
											@Pc(8541) char local8541 = local4042.charAt(local357);
											if (local8541 == '<') {
												local8534 = true;
											} else if (local8541 == '>') {
												local8534 = false;
											} else if (!local8534) {
												local8532.append(local8541);
											}
										}
										aStringArray8[anInt2261++] = local8532.toString();
										return;
									}
									if (arg0 == 4120) {
										local4042 = aStringArray8[--anInt2261];
										anInt2264 -= 2;
										local19 = anIntArray88[anInt2264];
										local25 = anIntArray88[anInt2264 + 1];
										anIntArray88[anInt2264++] = local4042.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt2261 -= 2;
										local4042 = aStringArray8[anInt2261];
										local1161 = aStringArray8[anInt2261 + 1];
										local25 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = local4042.indexOf(local1161, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local420 = anIntArray88[--anInt2264] != 0;
										local19 = anIntArray88[--anInt2264];
										aStringArray8[anInt2261++] = Static328.method5505(0, Static380.anInt7247, local420, (long) local19);
										return;
									}
									if (arg0 == 4125) {
										local4042 = aStringArray8[--anInt2261];
										local19 = anIntArray88[--anInt2264];
										@Pc(8755) Class315 local8755 = Static256.method4821(local19, Static340.aClass181_62);
										anIntArray88[anInt2264++] = local8755.method7564(Static583.aClass5Array19, local4042);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray88[--anInt2264];
										aStringArray8[anInt2261++] = Static367.aClass281_1.method6975(local13).aString84;
										return;
									}
									@Pc(8817) Class237 local8817;
									if (arg0 == 4201) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local8817 = Static367.aClass281_1.method6975(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray30[local19 - 1] != null) {
											aStringArray8[anInt2261++] = local8817.aStringArray30[local19 - 1];
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local8817 = Static367.aClass281_1.method6975(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray29[local19 - 1] != null) {
											aStringArray8[anInt2261++] = local8817.aStringArray29[local19 - 1];
											return;
										}
										aStringArray8[anInt2261++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static367.aClass281_1.method6975(local13).anInt7308;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static367.aClass281_1.method6975(local13).anInt7293 == 1 ? 1 : 0;
										return;
									}
									@Pc(8980) Class237 local8980;
									if (arg0 == 4205) {
										local13 = anIntArray88[--anInt2264];
										local8980 = Static367.aClass281_1.method6975(local13);
										if (local8980.anInt7311 == -1 && local8980.anInt7325 >= 0) {
											anIntArray88[anInt2264++] = local8980.anInt7325;
											return;
										}
										anIntArray88[anInt2264++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray88[--anInt2264];
										local8980 = Static367.aClass281_1.method6975(local13);
										if (local8980.anInt7311 >= 0 && local8980.anInt7325 >= 0) {
											anIntArray88[anInt2264++] = local8980.anInt7325;
											return;
										}
										anIntArray88[anInt2264++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static367.aClass281_1.method6975(local13).aBoolean630 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local3107 = Static513.aClass49_2.method1857(local19);
										if (local3107.method4349()) {
											aStringArray8[anInt2261++] = Static367.aClass281_1.method6975(local13).method6073(local3107.aString48, local19);
											return;
										}
										anIntArray88[anInt2264++] = Static367.aClass281_1.method6975(local13).method6074(local19, local3107.anInt5140);
										return;
									}
									if (arg0 == 4209) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1] - 1;
										local8817 = Static367.aClass281_1.method6975(local13);
										if (local8817.anInt7261 == local19) {
											anIntArray88[anInt2264++] = local8817.anInt7320;
											return;
										}
										if (local8817.anInt7300 == local19) {
											anIntArray88[anInt2264++] = local8817.anInt7274;
											return;
										}
										anIntArray88[anInt2264++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local4042 = aStringArray8[--anInt2261];
										local19 = anIntArray88[--anInt2264];
										Static407.method6417(local4042, local19 == 1);
										anIntArray88[anInt2264++] = Static29.anInt562;
										return;
									}
									if (arg0 == 4211) {
										if (Static179.aShortArray34 != null && Static385.anInt10555 < Static29.anInt562) {
											anIntArray88[anInt2264++] = Static179.aShortArray34[Static385.anInt10555++] & 0xFFFF;
											return;
										}
										anIntArray88[anInt2264++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static385.anInt10555 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray88[--anInt2264];
										anIntArray88[anInt2264++] = Static367.aClass281_1.method6975(local13).anInt7291;
										return;
									}
									if (arg0 == 4214) {
										local4042 = aStringArray8[--anInt2261];
										anInt2264 -= 3;
										local19 = anIntArray88[anInt2264];
										local25 = anIntArray88[anInt2264 + 1];
										local357 = anIntArray88[anInt2264 + 2];
										Static561.method7908(local19 == 1, local4042, local25, local357);
										anIntArray88[anInt2264++] = Static29.anInt562;
										return;
									}
									if (arg0 == 4215) {
										anInt2261 -= 2;
										anInt2264 -= 2;
										local4042 = aStringArray8[anInt2261];
										local19 = anIntArray88[anInt2264];
										local25 = anIntArray88[anInt2264 + 1];
										@Pc(9379) String local9379 = aStringArray8[anInt2261 + 1];
										Static14.method8602(local9379, local4042, local25, local19 == 1);
										anIntArray88[anInt2264++] = Static29.anInt562;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local3107 = Static513.aClass49_2.method1857(local19);
										if (local3107.method4349()) {
											aStringArray8[anInt2261++] = Static604.aClass139_2.method4345(local13).method429(local19, local3107.aString48);
											return;
										}
										anIntArray88[anInt2264++] = Static604.aClass139_2.method4345(local13).method430(local19, local3107.anInt5140);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local3107 = Static513.aClass49_2.method1857(local19);
										if (local3107.method4349()) {
											aStringArray8[anInt2261++] = Static541.aClass349_4.method8123(local13).method6853(local19, local3107.aString48);
											return;
										}
										anIntArray88[anInt2264++] = Static541.aClass349_4.method8123(local13).method6859(local3107.anInt5140, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt2264 -= 2;
										local13 = anIntArray88[anInt2264];
										local19 = anIntArray88[anInt2264 + 1];
										local3107 = Static513.aClass49_2.method1857(local19);
										if (local3107.method4349()) {
											aStringArray8[anInt2261++] = Static5.aClass236_1.method6059(local13).method7121(local19, local3107.aString48);
											return;
										}
										anIntArray88[anInt2264++] = Static5.aClass236_1.method6059(local13).method7125(local19, local3107.anInt5140);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray88[--anInt2264];
									@Pc(9607) Class232 local9607 = Static367.aClass285_1.method7014(local13);
									if (local9607.anIntArray418 != null && local9607.anIntArray418.length > 0) {
										local25 = 0;
										local357 = local9607.anIntArray419[0];
										for (local2373 = 1; local2373 < local9607.anIntArray418.length; local2373++) {
											if (local9607.anIntArray419[local2373] > local357) {
												local25 = local2373;
												local357 = local9607.anIntArray419[local2373];
											}
										}
										anIntArray88[anInt2264++] = local9607.anIntArray418[local25];
										return;
									}
									anIntArray88[anInt2264++] = local9607.anInt7164;
									return;
								}
							}
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static113.method8285(anIntArray88[--anInt2264]);
				} else {
					local137 = arg1 ? aClass108_3 : aClass108_2;
				}
				if (arg0 == 1000) {
					anInt2264 -= 4;
					local137.anInt4096 = anIntArray88[anInt2264];
					local137.anInt4029 = anIntArray88[anInt2264 + 1];
					local19 = anIntArray88[anInt2264 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray88[anInt2264 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte49 = (byte) local19;
					local137.aByte48 = (byte) local25;
					Static139.method3135(local137);
					Static163.method3446(local137);
					if (local137.anInt4083 == -1) {
						Static8.method103(local137.anInt4043);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt2264 -= 4;
					local137.anInt4087 = anIntArray88[anInt2264];
					local137.anInt4030 = anIntArray88[anInt2264 + 1];
					local137.anInt4088 = 0;
					local137.anInt4099 = 0;
					local19 = anIntArray88[anInt2264 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray88[anInt2264 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte50 = (byte) local19;
					local137.aByte47 = (byte) local25;
					Static139.method3135(local137);
					Static163.method3446(local137);
					if (local137.anInt4018 == 0) {
						Static62.method1330(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray88[--anInt2264] == 1;
					if (local137.aBoolean352 != local661) {
						local137.aBoolean352 = local661;
						Static139.method3135(local137);
					}
					if (local137.anInt4083 == -1) {
						Static641.method8644(local137.anInt4043);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt2264 -= 2;
					local137.anInt4034 = anIntArray88[anInt2264];
					local137.anInt4086 = anIntArray88[anInt2264 + 1];
					Static139.method3135(local137);
					Static163.method3446(local137);
					if (local137.anInt4018 == 0) {
						Static62.method1330(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean346 = anIntArray88[--anInt2264] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!wba;)V")
	public static void method2222(@OriginalArg(0) Class3_Sub51 arg0) {
		method2230(arg0, 200000);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
	private static void method2223(@OriginalArg(0) int arg0) {
		@Pc(3) Class108 local3 = Static113.method8285(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class108[] local13 = Static42.aClass108ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class108[] local19 = Static85.aClass108ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static42.aClass108ArrayArray1[local9] = new Class108[local22];
			Static655.method6407(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static655.method6407(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "()V")
	public static void method2224() {
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
	public static void method2225(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static263.method4883(arg0)) {
			return;
		}
		@Pc(12) Class108[] local12 = Static85.aClass108ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class108 local19 = local12[local14];
			if (local19.anObjectArray26 != null) {
				@Pc(26) Class3_Sub51 local26 = new Class3_Sub51();
				local26.aClass108_13 = local19;
				local26.anObjectArray33 = local19.anObjectArray26;
				method2230(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2226(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static106.anInt2660 == 0 && (Static351.aBoolean592 && !Static201.aBoolean410 || Static535.aBoolean550)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static287.aClass176_47.method4986(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static287.aClass176_47.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_48.method4986(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static287.aClass176_48.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_49.method4986(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static287.aClass176_49.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_50.method4986(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static287.aClass176_50.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_51.method4986(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static287.aClass176_51.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_52.method4986(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static287.aClass176_52.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_53.method4986(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static287.aClass176_53.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_54.method4986(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static287.aClass176_54.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_55.method4986(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static287.aClass176_55.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_56.method4986(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static287.aClass176_56.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_57.method4986(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static287.aClass176_57.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_58.method4986(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static287.aClass176_58.method4986(0).length());
		} else if (Static380.anInt7247 != 0) {
			if (local11.startsWith(Static287.aClass176_47.method4986(Static380.anInt7247))) {
				local13 = 0;
				arg0 = arg0.substring(Static287.aClass176_47.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_48.method4986(Static380.anInt7247))) {
				local13 = 1;
				arg0 = arg0.substring(Static287.aClass176_48.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_49.method4986(Static380.anInt7247))) {
				local13 = 2;
				arg0 = arg0.substring(Static287.aClass176_49.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_50.method4986(Static380.anInt7247))) {
				local13 = 3;
				arg0 = arg0.substring(Static287.aClass176_50.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_51.method4986(Static380.anInt7247))) {
				local13 = 4;
				arg0 = arg0.substring(Static287.aClass176_51.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_52.method4986(Static380.anInt7247))) {
				local13 = 5;
				arg0 = arg0.substring(Static287.aClass176_52.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_53.method4986(Static380.anInt7247))) {
				local13 = 6;
				arg0 = arg0.substring(Static287.aClass176_53.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_54.method4986(Static380.anInt7247))) {
				local13 = 7;
				arg0 = arg0.substring(Static287.aClass176_54.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_55.method4986(Static380.anInt7247))) {
				local13 = 8;
				arg0 = arg0.substring(Static287.aClass176_55.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_56.method4986(Static380.anInt7247))) {
				local13 = 9;
				arg0 = arg0.substring(Static287.aClass176_56.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_57.method4986(Static380.anInt7247))) {
				local13 = 10;
				arg0 = arg0.substring(Static287.aClass176_57.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_58.method4986(Static380.anInt7247))) {
				local13 = 11;
				arg0 = arg0.substring(Static287.aClass176_58.method4986(Static380.anInt7247).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static287.aClass176_59.method4986(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static287.aClass176_59.method4986(0).length());
		} else if (local11.startsWith(Class176.lb.method4986(0))) {
			local451 = 2;
			arg0 = arg0.substring(Class176.lb.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_60.method4986(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static287.aClass176_60.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_61.method4986(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static287.aClass176_61.method4986(0).length());
		} else if (local11.startsWith(Static287.aClass176_62.method4986(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static287.aClass176_62.method4986(0).length());
		} else if (Static380.anInt7247 != 0) {
			if (local11.startsWith(Static287.aClass176_59.method4986(Static380.anInt7247))) {
				local451 = 1;
				arg0 = arg0.substring(Static287.aClass176_59.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Class176.lb.method4986(Static380.anInt7247))) {
				local451 = 2;
				arg0 = arg0.substring(Class176.lb.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_60.method4986(Static380.anInt7247))) {
				local451 = 3;
				arg0 = arg0.substring(Static287.aClass176_60.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_61.method4986(Static380.anInt7247))) {
				local451 = 4;
				arg0 = arg0.substring(Static287.aClass176_61.method4986(Static380.anInt7247).length());
			} else if (local11.startsWith(Static287.aClass176_62.method4986(Static380.anInt7247))) {
				local451 = 5;
				arg0 = arg0.substring(Static287.aClass176_62.method4986(Static380.anInt7247).length());
			}
		}
		@Pc(641) Class3_Sub26 local641 = Static640.method8636(Static625.aClass344_124, Static403.aClass294_3);
		local641.aClass3_Sub15_Sub1_3.method8448(0);
		@Pc(650) int local650 = local641.aClass3_Sub15_Sub1_3.anInt10282;
		local641.aClass3_Sub15_Sub1_3.method8448(local13);
		local641.aClass3_Sub15_Sub1_3.method8448(local451);
		Static158.method3377(arg0, local641.aClass3_Sub15_Sub1_3);
		local641.aClass3_Sub15_Sub1_3.method8433(local641.aClass3_Sub15_Sub1_3.anInt10282 - local650);
		Static472.method5189(local641);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(C)I")
	private static int method2227(@OriginalArg(0) char arg0) {
		return Static36.method718(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "(IZ)V")
	private static void method2228(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class3_Sub26 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray88[anInt2264++] = Static32.anInt606;
				return;
			}
			if (arg0 == 5001) {
				anInt2264 -= 3;
				Static32.anInt606 = anIntArray88[anInt2264];
				Static54.aClass167_2 = Static300.method5150(anIntArray88[anInt2264 + 1]);
				if (Static54.aClass167_2 == null) {
					Static54.aClass167_2 = Static446.aClass167_6;
				}
				Static154.anInt3787 = anIntArray88[anInt2264 + 2];
				local52 = Static640.method8636(Static499.aClass344_107, Static403.aClass294_3);
				local52.aClass3_Sub15_Sub1_3.method8448(Static32.anInt606);
				local52.aClass3_Sub15_Sub1_3.method8448(Static54.aClass167_2.anInt5826);
				local52.aClass3_Sub15_Sub1_3.method8448(Static154.anInt3787);
				Static472.method5189(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt2261 -= 2;
				local83 = aStringArray8[anInt2261];
				local89 = aStringArray8[anInt2261 + 1];
				anInt2264 -= 2;
				local97 = anIntArray88[anInt2264];
				local103 = anIntArray88[anInt2264 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub26 local125 = Static640.method8636(Static536.aClass344_113, Static403.aClass294_3);
				local125.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(local83) + Static139.method3132(local89) + 2);
				local125.aClass3_Sub15_Sub1_3.method8417(local83);
				local125.aClass3_Sub15_Sub1_3.method8448(local97 - 1);
				local125.aClass3_Sub15_Sub1_3.method8448(local103);
				local125.aClass3_Sub15_Sub1_3.method8417(local89);
				Static472.method5189(local125);
				return;
			}
			@Pc(179) Class163 local179;
			if (arg0 == 5003) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local181 = "";
				if (local179 != null && local179.aString55 != null) {
					local181 = local179.aString55;
				}
				aStringArray8[anInt2261++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5787;
				}
				anIntArray88[anInt2264++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static54.aClass167_2 == null) {
					anIntArray88[anInt2264++] = -1;
					return;
				}
				anIntArray88[anInt2264++] = Static54.aClass167_2.anInt5826;
				return;
			}
			@Pc(269) Class3_Sub26 local269;
			if (arg0 == 5006) {
				local175 = anIntArray88[--anInt2264];
				local269 = Static640.method8636(Static33.aClass344_10, Static403.aClass294_3);
				local269.aClass3_Sub15_Sub1_3.method8448(local175);
				Static472.method5189(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray8[--anInt2261];
				method2226(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt2261 -= 2;
				local83 = aStringArray8[anInt2261];
				local89 = aStringArray8[anInt2261 + 1];
				if (Static106.anInt2660 != 0 || (!Static351.aBoolean592 || Static201.aBoolean410) && !Static535.aBoolean550) {
					@Pc(328) Class3_Sub26 local328 = Static640.method8636(Static33.aClass344_11, Static403.aClass294_3);
					local328.aClass3_Sub15_Sub1_3.method8448(0);
					local103 = local328.aClass3_Sub15_Sub1_3.anInt10282;
					local328.aClass3_Sub15_Sub1_3.method8417(local83);
					Static158.method3377(local89, local328.aClass3_Sub15_Sub1_3);
					local328.aClass3_Sub15_Sub1_3.method8433(local328.aClass3_Sub15_Sub1_3.anInt10282 - local103);
					Static472.method5189(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local181 = "";
				if (local179 != null && local179.aString57 != null) {
					local181 = local179.aString57;
				}
				aStringArray8[anInt2261++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local181 = "";
				if (local179 != null && local179.aString56 != null) {
					local181 = local179.aString56;
				}
				aStringArray8[anInt2261++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5785;
				}
				anIntArray88[anInt2264++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == null || Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString67 == null) {
					local83 = "";
				} else {
					local83 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5327();
				}
				aStringArray8[anInt2261++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray88[anInt2264++] = Static154.anInt3787;
				return;
			}
			if (arg0 == 5017) {
				anIntArray88[anInt2264++] = Static288.method4992();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt5783;
				}
				anIntArray88[anInt2264++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local181 = "";
				if (local179 != null && local179.aString58 != null) {
					local181 = local179.aString58;
				}
				aStringArray8[anInt2261++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == null || Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString67 == null) {
					local83 = "";
				} else {
					local83 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5331();
				}
				aStringArray8[anInt2261++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5782;
				}
				anIntArray88[anInt2264++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5788;
				}
				anIntArray88[anInt2264++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray88[--anInt2264];
				local179 = Static478.method8207(local175);
				local181 = "";
				if (local179 != null && local179.aString54 != null) {
					local181 = local179.aString54;
				}
				aStringArray8[anInt2261++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray88[--anInt2264];
				aStringArray8[anInt2261++] = Static123.aClass61_1.method2284(local175).aString15;
				return;
			}
			@Pc(736) Class3_Sub1_Sub2 local736;
			if (arg0 == 5051) {
				local175 = anIntArray88[--anInt2264];
				local736 = Static123.aClass61_1.method2284(local175);
				if (local736.anIntArray83 == null) {
					anIntArray88[anInt2264++] = 0;
					return;
				}
				anIntArray88[anInt2264++] = local736.anIntArray83.length;
				return;
			}
			if (arg0 == 5052) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				@Pc(781) Class3_Sub1_Sub2 local781 = Static123.aClass61_1.method2284(local175);
				local103 = local781.anIntArray83[local776];
				anIntArray88[anInt2264++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray88[--anInt2264];
				local736 = Static123.aClass61_1.method2284(local175);
				if (local736.anIntArray86 == null) {
					anIntArray88[anInt2264++] = 0;
					return;
				}
				anIntArray88[anInt2264++] = local736.anIntArray86.length;
				return;
			}
			if (arg0 == 5054) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				anIntArray88[anInt2264++] = Static123.aClass61_1.method2284(local175).anIntArray86[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray88[--anInt2264];
				aStringArray8[anInt2261++] = Static221.aClass136_1.method4290(local175).method7191();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray88[--anInt2264];
				@Pc(907) Class3_Sub1_Sub19 local907 = Static221.aClass136_1.method4290(local175);
				if (local907.anIntArray551 == null) {
					anIntArray88[anInt2264++] = 0;
					return;
				}
				anIntArray88[anInt2264++] = local907.anIntArray551.length;
				return;
			}
			if (arg0 == 5057) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				anIntArray88[anInt2264++] = Static221.aClass136_1.method4290(local175).anIntArray551[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass159_1 = new Class159();
				aClass159_1.anInt5734 = anIntArray88[--anInt2264];
				aClass159_1.aClass3_Sub1_Sub19_1 = Static221.aClass136_1.method4290(aClass159_1.anInt5734);
				aClass159_1.anIntArray331 = new int[aClass159_1.aClass3_Sub1_Sub19_1.method7190()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static640.method8636(Static341.aClass344_82, Static403.aClass294_3);
				local52.aClass3_Sub15_Sub1_3.method8448(0);
				local776 = local52.aClass3_Sub15_Sub1_3.anInt10282;
				local52.aClass3_Sub15_Sub1_3.method8448(0);
				local52.aClass3_Sub15_Sub1_3.method8464(aClass159_1.anInt5734);
				aClass159_1.aClass3_Sub1_Sub19_1.method7187(aClass159_1.anIntArray331, local52.aClass3_Sub15_Sub1_3);
				local52.aClass3_Sub15_Sub1_3.method8433(local52.aClass3_Sub15_Sub1_3.anInt10282 - local776);
				Static472.method5189(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray8[--anInt2261];
				local269 = Static640.method8636(Static230.aClass344_56, Static403.aClass294_3);
				local269.aClass3_Sub15_Sub1_3.method8448(0);
				local97 = local269.aClass3_Sub15_Sub1_3.anInt10282;
				local269.aClass3_Sub15_Sub1_3.method8417(local83);
				local269.aClass3_Sub15_Sub1_3.method8464(aClass159_1.anInt5734);
				aClass159_1.aClass3_Sub1_Sub19_1.method7187(aClass159_1.anIntArray331, local269.aClass3_Sub15_Sub1_3);
				local269.aClass3_Sub15_Sub1_3.method8433(local269.aClass3_Sub15_Sub1_3.anInt10282 - local97);
				Static472.method5189(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static640.method8636(Static341.aClass344_82, Static403.aClass294_3);
				local52.aClass3_Sub15_Sub1_3.method8448(0);
				local776 = local52.aClass3_Sub15_Sub1_3.anInt10282;
				local52.aClass3_Sub15_Sub1_3.method8448(1);
				local52.aClass3_Sub15_Sub1_3.method8464(aClass159_1.anInt5734);
				aClass159_1.aClass3_Sub1_Sub19_1.method7187(aClass159_1.anIntArray331, local52.aClass3_Sub15_Sub1_3);
				local52.aClass3_Sub15_Sub1_3.method8433(local52.aClass3_Sub15_Sub1_3.anInt10282 - local776);
				Static472.method5189(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				anIntArray88[anInt2264++] = Static123.aClass61_1.method2284(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				anIntArray88[anInt2264++] = Static123.aClass61_1.method2284(local175).aCharArray3[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				if (local776 == -1) {
					anIntArray88[anInt2264++] = -1;
					return;
				}
				anIntArray88[anInt2264++] = Static123.aClass61_1.method2284(local175).method2188((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				if (local776 == -1) {
					anIntArray88[anInt2264++] = -1;
					return;
				}
				anIntArray88[anInt2264++] = Static123.aClass61_1.method2284(local175).method2186((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray88[--anInt2264];
				anIntArray88[anInt2264++] = Static221.aClass136_1.method4290(local175).method7190();
				return;
			}
			if (arg0 == 5067) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				local97 = Static221.aClass136_1.method4290(local175).method7184(local776).anInt3889;
				anIntArray88[anInt2264++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				aClass159_1.anIntArray331[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt2264 -= 2;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				aClass159_1.anIntArray331[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt2264 -= 3;
				local175 = anIntArray88[anInt2264];
				local776 = anIntArray88[anInt2264 + 1];
				local97 = anIntArray88[anInt2264 + 2];
				@Pc(1448) Class3_Sub1_Sub19 local1448 = Static221.aClass136_1.method4290(local175);
				if (local1448.method7184(local776).anInt3889 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray88[anInt2264++] = local1448.method7185(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray8[--anInt2261];
				local1496 = anIntArray88[--anInt2264] == 1;
				Static290.method5003(local1496, local83);
				anIntArray88[anInt2264++] = Static29.anInt562;
				return;
			}
			if (arg0 == 5072) {
				if (Static179.aShortArray34 != null && Static385.anInt10555 < Static29.anInt562) {
					anIntArray88[anInt2264++] = Static179.aShortArray34[Static385.anInt10555++] & 0xFFFF;
					return;
				}
				anIntArray88[anInt2264++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static385.anInt10555 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static326.aClass238_1.method6948(86)) {
					anIntArray88[anInt2264++] = 1;
					return;
				}
				anIntArray88[anInt2264++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static326.aClass238_1.method6948(82)) {
					anIntArray88[anInt2264++] = 1;
					return;
				}
				anIntArray88[anInt2264++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static326.aClass238_1.method6948(81)) {
					anIntArray88[anInt2264++] = 1;
					return;
				}
				anIntArray88[anInt2264++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static39.method751(anIntArray88[--anInt2264]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray88[anInt2264++] = Static465.method6960();
					return;
				}
				if (arg0 == 5205) {
					Static563.method7920(false, anIntArray88[--anInt2264], -1, -1);
					return;
				}
				@Pc(1696) Class3_Sub1_Sub16 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray88[--anInt2264];
					local1696 = Static361.method2167(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray88[anInt2264++] = -1;
						return;
					}
					anIntArray88[anInt2264++] = local1696.anInt7071;
					return;
				}
				@Pc(1729) Class3_Sub1_Sub16 local1729;
				if (arg0 == 5207) {
					local1729 = Static361.method2156(anIntArray88[--anInt2264]);
					if (local1729 != null && local1729.aString74 != null) {
						aStringArray8[anInt2261++] = local1729.aString74;
						return;
					}
					aStringArray8[anInt2261++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray88[anInt2264++] = Static41.anInt760;
					anIntArray88[anInt2264++] = Static46.anInt1027;
					return;
				}
				if (arg0 == 5209) {
					anIntArray88[anInt2264++] = Static353.anInt6903 + Static361.anInt2229;
					anIntArray88[anInt2264++] = Static386.anInt8408 + Static361.anInt2230;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray88[--anInt2264];
					local1696 = Static361.method2156(local175);
					if (local1696 == null) {
						anIntArray88[anInt2264++] = 0;
						anIntArray88[anInt2264++] = 0;
						return;
					}
					anIntArray88[anInt2264++] = local1696.anInt7065 >> 14 & 0x3FFF;
					anIntArray88[anInt2264++] = local1696.anInt7065 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray88[--anInt2264];
					local1696 = Static361.method2156(local175);
					if (local1696 == null) {
						anIntArray88[anInt2264++] = 0;
						anIntArray88[anInt2264++] = 0;
						return;
					}
					anIntArray88[anInt2264++] = local1696.anInt7069 - local1696.anInt7073;
					anIntArray88[anInt2264++] = local1696.anInt7072 - local1696.anInt7064;
					return;
				}
				@Pc(1919) Class3_Sub22 local1919;
				if (arg0 == 5212) {
					local1919 = Static245.method4648();
					if (local1919 == null) {
						anIntArray88[anInt2264++] = -1;
						anIntArray88[anInt2264++] = -1;
						return;
					}
					anIntArray88[anInt2264++] = local1919.anInt4123;
					local776 = local1919.anInt4120 << 28 | local1919.anInt4124 + Static361.anInt2229 << 14 | local1919.anInt4117 + Static361.anInt2230;
					anIntArray88[anInt2264++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static309.method5218();
					if (local1919 == null) {
						anIntArray88[anInt2264++] = -1;
						anIntArray88[anInt2264++] = -1;
						return;
					}
					anIntArray88[anInt2264++] = local1919.anInt4123;
					local776 = local1919.anInt4120 << 28 | local1919.anInt4124 + Static361.anInt2229 << 14 | local1919.anInt4117 + Static361.anInt2230;
					anIntArray88[anInt2264++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray88[--anInt2264];
					local1696 = Static472.method5188();
					if (local1696 != null) {
						local2067 = local1696.method5926(anIntArray90, local175 >> 28 & 0x3, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2067) {
							Static280.method4953(anIntArray90[2], anIntArray90[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					@Pc(2105) Class30 local2105 = Static361.method2176(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class3_Sub1_Sub16 local2112 = (Class3_Sub1_Sub16) local2105.method780(); local2112 != null; local2112 = (Class3_Sub1_Sub16) local2105.method783()) {
						if (local2112.anInt7071 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray88[anInt2264++] = 1;
						return;
					}
					anIntArray88[anInt2264++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray88[--anInt2264];
					local1696 = Static361.method2156(local175);
					if (local1696 == null) {
						anIntArray88[anInt2264++] = -1;
						return;
					}
					anIntArray88[anInt2264++] = local1696.anInt7068;
					return;
				}
				if (arg0 == 5220) {
					anIntArray88[anInt2264++] = Static102.anInt9953 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray88[--anInt2264];
					Static280.method4953(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static472.method5188();
					if (local1729 != null) {
						local1496 = local1729.method5923(Static353.anInt6903 + Static361.anInt2229, Static386.anInt8408 + Static361.anInt2230, anIntArray90);
						if (local1496) {
							anIntArray88[anInt2264++] = anIntArray90[1];
							anIntArray88[anInt2264++] = anIntArray90[2];
							return;
						}
						anIntArray88[anInt2264++] = -1;
						anIntArray88[anInt2264++] = -1;
						return;
					}
					anIntArray88[anInt2264++] = -1;
					anIntArray88[anInt2264++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					Static563.method7920(false, local175, local776 & 0x3FFF, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray88[--anInt2264];
					local1696 = Static472.method5188();
					if (local1696 != null) {
						local2067 = local1696.method5926(anIntArray90, local175 >> 28 & 0x3, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray88[anInt2264++] = anIntArray90[1];
							anIntArray88[anInt2264++] = anIntArray90[2];
							return;
						}
						anIntArray88[anInt2264++] = -1;
						anIntArray88[anInt2264++] = -1;
						return;
					}
					anIntArray88[anInt2264++] = -1;
					anIntArray88[anInt2264++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray88[--anInt2264];
					local1696 = Static472.method5188();
					if (local1696 != null) {
						local2067 = local1696.method5923(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray90);
						if (local2067) {
							anIntArray88[anInt2264++] = anIntArray90[1];
							anIntArray88[anInt2264++] = anIntArray90[2];
							return;
						}
						anIntArray88[anInt2264++] = -1;
						anIntArray88[anInt2264++] = -1;
						return;
					}
					anIntArray88[anInt2264++] = -1;
					anIntArray88[anInt2264++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static557.method7848(anIntArray88[--anInt2264]);
					return;
				}
				if (arg0 == 5227) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					Static563.method7920(true, local175, local776 & 0x3FFF, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static378.aBoolean622 = anIntArray88[--anInt2264] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray88[anInt2264++] = Static378.aBoolean622 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray88[--anInt2264];
					Static207.method4077(local175);
					return;
				}
				@Pc(2625) Class3 local2625;
				if (arg0 == 5231) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local1496 = anIntArray88[anInt2264 + 1] == 1;
					if (Static312.aClass307_54 != null) {
						local2625 = Static312.aClass307_54.method7424((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8671();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static312.aClass307_54.method7425((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class3 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray88[--anInt2264];
					if (Static312.aClass307_54 != null) {
						local2667 = Static312.aClass307_54.method7424((long) local175);
						anIntArray88[anInt2264++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray88[anInt2264++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local1496 = anIntArray88[anInt2264 + 1] == 1;
					if (Static487.aClass307_44 != null) {
						local2625 = Static487.aClass307_44.method7424((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8671();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static487.aClass307_44.method7425((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray88[--anInt2264];
					if (Static487.aClass307_44 != null) {
						local2667 = Static487.aClass307_44.method7424((long) local175);
						anIntArray88[anInt2264++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray88[anInt2264++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray88[anInt2264++] = Static361.aClass3_Sub1_Sub16_2 == null ? -1 : Static361.aClass3_Sub1_Sub16_2.anInt7071;
					return;
				}
				if (arg0 == 5236) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static330.method5524(local97, local103, local175);
					if (local2833 < 0) {
						anIntArray88[anInt2264++] = -1;
						return;
					}
					anIntArray88[anInt2264++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static444.method6716();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					Static494.method7243(local776, 3, local175, false);
					anIntArray88[anInt2264++] = Static385.aFrame149 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static385.aFrame149 != null) {
						Static494.method7243(-1, Static552.aClass3_Sub48_30.aClass23_Sub9_2.method3448(), -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class288[] local2919 = Static209.method4114();
					anIntArray88[anInt2264++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray88[--anInt2264];
					@Pc(2943) Class288[] local2943 = Static209.method4114();
					anIntArray88[anInt2264++] = local2943[local175].anInt8634;
					anIntArray88[anInt2264++] = local2943[local175].anInt8630;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static389.anInt7389;
					local776 = Static483.anInt8602;
					local97 = -1;
					@Pc(2978) Class288[] local2978 = Static209.method4114();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class288 local2985 = local2978[local2833];
						if (local2985.anInt8634 == local175 && local2985.anInt8630 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray88[anInt2264++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray88[anInt2264++] = Static626.method8490();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray88[--anInt2264];
					if (local175 >= 1 && local175 <= 2) {
						Static494.method7243(-1, local175, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub9_2.method3448();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray88[--anInt2264];
					if (local175 >= 1 && local175 <= 2) {
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub9_2, local175);
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub9_1, local175);
						Static152.method3314();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt2261 -= 2;
					local83 = aStringArray8[anInt2261];
					local89 = aStringArray8[anInt2261 + 1];
					local97 = anIntArray88[--anInt2264];
					@Pc(3133) Class3_Sub26 local3133 = Static640.method8636(Static477.aClass344_100, Static403.aClass294_3);
					local3133.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(local83) + Static139.method3132(local89) + 1);
					local3133.aClass3_Sub15_Sub1_3.method8417(local83);
					local3133.aClass3_Sub15_Sub1_3.method8417(local89);
					local3133.aClass3_Sub15_Sub1_3.method8448(local97);
					Static472.method5189(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt2264 -= 2;
					Static2.aShortArray1[anIntArray88[anInt2264]] = (short) Static75.method1858(anIntArray88[anInt2264 + 1]);
					Static367.aClass281_1.method6976();
					Static367.aClass281_1.method6971();
					Static604.aClass139_2.method4339();
					Static594.method8139();
					return;
				}
				if (arg0 == 5405) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static360.anIntArrayArrayArray4[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt2264 -= 7;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1] << 1;
					local97 = anIntArray88[anInt2264 + 2];
					local103 = anIntArray88[anInt2264 + 3];
					local2833 = anIntArray88[anInt2264 + 4];
					@Pc(3271) int local3271 = anIntArray88[anInt2264 + 5];
					@Pc(3277) int local3277 = anIntArray88[anInt2264 + 6];
					if (local175 >= 0 && local175 < 2 && Static360.anIntArrayArrayArray4[local175] != null && local776 >= 0 && local776 < Static360.anIntArrayArrayArray4[local175].length) {
						Static360.anIntArrayArrayArray4[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static360.anIntArrayArrayArray4[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static360.anIntArrayArrayArray4[anIntArray88[--anInt2264]].length >> 1;
					anIntArray88[anInt2264++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static385.aFrame149 != null) {
						Static494.method7243(-1, Static552.aClass3_Sub48_30.aClass23_Sub9_2.method3448(), -1, false);
					}
					if (Static599.aFrame141 != null) {
						Static176.method3582();
						System.exit(0);
						return;
					}
					local83 = Static236.aString49 == null ? Static170.method3547() : Static236.aString49;
					Static105.method2573(Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 1, local83, false, Static379.aClass228_6);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static203.aClass376_15 != null) {
						if (Static203.aClass376_15.anObject19 == null) {
							local83 = Static36.method720(Static203.aClass376_15.anInt10512);
						} else {
							local83 = (String) Static203.aClass376_15.anObject19;
						}
					}
					aStringArray8[anInt2261++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray88[anInt2264++] = Static379.aClass228_6.aBoolean614 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static385.aFrame149 != null) {
						Static494.method7243(-1, Static552.aClass3_Sub48_30.aClass23_Sub9_2.method3448(), -1, false);
					}
					local83 = aStringArray8[--anInt2261];
					local1496 = anIntArray88[--anInt2264] == 1;
					local181 = Static170.method3547() + local83;
					Static105.method2573(Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 1, local181, local1496, Static379.aClass228_6);
					return;
				}
				if (arg0 == 5422) {
					anInt2261 -= 2;
					local83 = aStringArray8[anInt2261];
					local89 = aStringArray8[anInt2261 + 1];
					local97 = anIntArray88[--anInt2264];
					if (local83.length() > 0) {
						if (Static174.aStringArray15 == null) {
							Static174.aStringArray15 = new String[Static641.anIntArray628[Static648.aClass62_16.anInt2526]];
						}
						Static174.aStringArray15[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static94.aStringArray11 == null) {
							Static94.aStringArray11 = new String[Static641.anIntArray628[Static648.aClass62_16.anInt2526]];
						}
						Static94.aStringArray11[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray8[--anInt2261]);
					return;
				}
				if (arg0 == 5424) {
					anInt2264 -= 11;
					Static516.anInt9017 = anIntArray88[anInt2264];
					Static53.anInt1128 = anIntArray88[anInt2264 + 1];
					Static568.anInt9655 = anIntArray88[anInt2264 + 2];
					Static73.anInt1917 = anIntArray88[anInt2264 + 3];
					Static24.anInt380 = anIntArray88[anInt2264 + 4];
					Static22.anInt220 = anIntArray88[anInt2264 + 5];
					Static191.anInt4463 = anIntArray88[anInt2264 + 6];
					Static546.anInt9224 = anIntArray88[anInt2264 + 7];
					Static141.anInt3583 = anIntArray88[anInt2264 + 8];
					Static33.anInt613 = anIntArray88[anInt2264 + 9];
					Static342.anInt6744 = anIntArray88[anInt2264 + 10];
					Static150.aClass181_34.method5040(Static24.anInt380);
					Static150.aClass181_34.method5040(Static22.anInt220);
					Static150.aClass181_34.method5040(Static191.anInt4463);
					Static150.aClass181_34.method5040(Static546.anInt9224);
					Static150.aClass181_34.method5040(Static141.anInt3583);
					Static166.aClass5_22 = null;
					Static185.aClass5_24 = null;
					Static333.aClass5_27 = null;
					Static171.aClass5_23 = null;
					Static462.aClass5_34 = null;
					Static24.aClass5_1 = null;
					Static548.aClass5_37 = null;
					Static644.aClass5_39 = null;
					Static599.aBoolean832 = true;
					return;
				}
				if (arg0 == 5425) {
					Static260.method4859();
					Static599.aBoolean832 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt2264 -= 2;
					Static219.anInt5059 = anIntArray88[anInt2264];
					Static83.anInt6965 = anIntArray88[anInt2264 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt2264 -= 2;
					Static96.anInt2551 = anIntArray88[anInt2264 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					anIntArray88[anInt2264++] = Static318.method5387(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static240.method4614(false, aStringArray8[--anInt2261], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static653.method5390("accountcreated", Static632.anApplet2);
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static653.method5390("accountcreatestarted", Static632.anApplet2);
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static425.aClipboard3 != null) {
						@Pc(3842) Transferable local3842 = Static425.aClipboard3.getContents(null);
						if (local3842 != null) {
							try {
								local83 = (String) local3842.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3855) Exception local3855) {
							}
						}
					}
					aStringArray8[anInt2261++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static494.anInt8778 = anIntArray88[--anInt2264];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt2264 -= 4;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					local97 = anIntArray88[anInt2264 + 2];
					local103 = anIntArray88[anInt2264 + 3];
					Static320.method5428(false, (local175 >> 14 & 0x3FFF) - Static446.anInt8090, local776 << 2, local103, local97, (local175 & 0x3FFF) - Static124.anInt3150);
					return;
				}
				if (arg0 == 5501) {
					anInt2264 -= 4;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					local97 = anIntArray88[anInt2264 + 2];
					local103 = anIntArray88[anInt2264 + 3];
					Static373.method5966((local175 & 0x3FFF) - Static124.anInt3150, local103, (local175 >> 14 & 0x3FFF) - Static446.anInt8090, local776 << 2, local97);
					return;
				}
				if (arg0 == 5502) {
					anInt2264 -= 6;
					local175 = anIntArray88[anInt2264];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static322.anInt6492 = local175;
					local776 = anIntArray88[anInt2264 + 1];
					if (local776 + 1 >= Static360.anIntArrayArrayArray4[Static322.anInt6492].length >> 1) {
						throw new RuntimeException();
					}
					Static357.anInt3906 = local776;
					Static39.anInt722 = 0;
					Static408.anInt7676 = anIntArray88[anInt2264 + 2];
					Static369.anInt7035 = anIntArray88[anInt2264 + 3];
					local97 = anIntArray88[anInt2264 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static518.anInt10102 = local97;
					local103 = anIntArray88[anInt2264 + 5];
					if (local103 + 1 >= Static360.anIntArrayArrayArray4[Static518.anInt10102].length >> 1) {
						throw new RuntimeException();
					}
					Static345.anInt6776 = local103;
					Static516.anInt9019 = 3;
					Static155.anInt3810 = -1;
					Static531.anInt9157 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static2.method33();
					return;
				}
				if (arg0 == 5504) {
					anInt2264 -= 2;
					Static380.method6046(anIntArray88[anInt2264], anIntArray88[anInt2264 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray88[anInt2264++] = (int) Static103.aFloat96 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray88[anInt2264++] = (int) Static502.aFloat230 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static44.method2078();
					return;
				}
				if (arg0 == 5508) {
					Static629.method8531();
					return;
				}
				if (arg0 == 5509) {
					Static519.method7452();
					return;
				}
				if (arg0 == 5510) {
					Static150.method3287();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray88[--anInt2264];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static446.anInt8090;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static394.anInt7540) {
						local776 = Static394.anInt7540;
					}
					local97 -= Static124.anInt3150;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static462.anInt8391) {
						local97 = Static462.anInt8391;
					}
					Static89.anInt2312 = (local776 << 9) + 256;
					Static149.anInt3681 = (local97 << 9) + 256;
					Static516.anInt9019 = 4;
					Static155.anInt3810 = -1;
					Static531.anInt9157 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static595.method8145();
					return;
				}
				if (arg0 == 5514) {
					Static467.anInt8439 = anIntArray88[--anInt2264];
					return;
				}
				if (arg0 == 5516) {
					anIntArray88[anInt2264++] = Static467.anInt8439;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray88[--anInt2264];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static446.anInt8090;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static394.anInt7540) {
							local776 = Static394.anInt7540;
						}
						local97 -= Static124.anInt3150;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static462.anInt8391) {
							local97 = Static462.anInt8391;
						}
						Static531.anInt9157 = (local776 << 9) + 256;
						Static155.anInt3810 = (local97 << 9) + 256;
						return;
					}
					Static531.anInt9157 = -1;
					Static155.anInt3810 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt2261 -= 2;
					local83 = aStringArray8[anInt2261];
					local89 = aStringArray8[anInt2261 + 1];
					local97 = anIntArray88[--anInt2264];
					if (local83.length() > 320) {
						return;
					}
					if (Static581.anInt9720 != 3) {
						return;
					}
					if (Static621.anInt10311 == 0 && Static567.anInt9650 == 0) {
						Static141.aString29 = local83;
						Static562.aString109 = local89;
						Static231.anInt5230 = local97;
						Static182.method3694(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static623.method8478();
					return;
				}
				if (arg0 == 5602) {
					if (Static621.anInt10311 == 0) {
						Static520.anInt9063 = -2;
						Static30.anInt570 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt2261--;
					if (Static581.anInt9720 != 3) {
						return;
					}
					if (Static621.anInt10311 == 0 && Static567.anInt9650 == 0) {
						Static147.method3252(aStringArray8[anInt2261]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt2261 -= 2;
					anInt2264 -= 2;
					if (Static581.anInt9720 != 3) {
						return;
					}
					if (Static621.anInt10311 == 0 && Static567.anInt9650 == 0) {
						Static433.method6620(anIntArray88[anInt2264], anIntArray88[anInt2264 + 1] == 1, aStringArray8[anInt2261 + 1], aStringArray8[anInt2261]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static567.anInt9650 == 0) {
						Static278.anInt7456 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray88[anInt2264++] = Static30.anInt570;
					return;
				}
				if (arg0 == 5608) {
					anIntArray88[anInt2264++] = Static390.anInt7399;
					return;
				}
				if (arg0 == 5609) {
					anIntArray88[anInt2264++] = Static278.anInt7456;
					return;
				}
				if (arg0 == 5611) {
					anIntArray88[anInt2264++] = Static126.anInt3178;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray88[--anInt2264];
					if (Static581.anInt9720 != 7) {
						return;
					}
					if (Static621.anInt10311 == 0 && Static567.anInt9650 == 0) {
						if (Static412.aClass51_25 != null) {
							Static412.aClass51_25.method3508();
							Static412.aClass51_25 = null;
						}
						Static231.anInt5230 = local175;
						Static182.method3694(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray88[anInt2264++] = Static30.anInt570;
					return;
				}
				if (arg0 == 5615) {
					anInt2261 -= 2;
					local83 = aStringArray8[anInt2261];
					local89 = aStringArray8[anInt2261 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static581.anInt9720 != 3) {
						return;
					}
					if (Static621.anInt10311 == 0 && Static567.anInt9650 == 0) {
						if (Static412.aClass51_25 != null) {
							Static412.aClass51_25.method3508();
							Static412.aClass51_25 = null;
						}
						Static141.aString29 = local83;
						Static562.aString109 = local89;
						Static182.method3694(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static229.method4376(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray88[anInt2264++] = Static520.anInt9063;
					return;
				}
				if (arg0 == 5618) {
					anInt2264--;
					return;
				}
				if (arg0 == 5619) {
					anInt2264--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray88[anInt2264++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt2261 -= 2;
					anInt2264 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static226.aString47 != null) {
						anIntArray88[anInt2264++] = 1;
						return;
					}
					anIntArray88[anInt2264++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray88[anInt2264++] = (int) (Static100.aLong55 >> 32);
					anIntArray88[anInt2264++] = (int) (Static100.aLong55 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray88[anInt2264++] = Static207.aBoolean425 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static207.aBoolean425 = true;
					Static368.method5896();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray88[--anInt2264];
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub3_1, local175);
					Static612.method8324();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray88[--anInt2264] == 1;
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.lb, local4786 ? 1 : 0);
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub14_1, local4786 ? 1 : 0);
					Static612.method8324();
					Static159.method3381();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray88[--anInt2264] == 1;
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub25_2, local4786 ? 2 : 1);
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub25_1, local4786 ? 2 : 1);
					Static159.method3381();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6005) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub12_1, anIntArray88[--anInt2264] == 1 ? 1 : 0);
					Static612.method8324();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6007) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub22_1, anIntArray88[--anInt2264]);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6008) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub17_1, anIntArray88[--anInt2264] == 1 ? 1 : 0);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6010) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub13_1, anIntArray88[--anInt2264] == 1 ? 1 : 0);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6011) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub20_1, anIntArray88[--anInt2264]);
					Static612.method8324();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6012) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub7_1, anIntArray88[--anInt2264] == 1 ? 1 : 0);
					Static379.method6035();
					Static34.method625();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6014) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub26_1, anIntArray88[--anInt2264] == 1 ? 2 : 0);
					Static612.method8324();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6015) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub28_1, anIntArray88[--anInt2264] == 1 ? 1 : 0);
					Static612.method8324();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6016) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub24_2, anIntArray88[--anInt2264]);
					Static559.method7893(false, Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152());
					Static152.method3314();
					return;
				}
				if (arg0 == 6017) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub1_1, anIntArray88[--anInt2264] == 1 ? 1 : 0);
					Static20.method266();
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6018) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub8_2, anIntArray88[--anInt2264]);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray88[--anInt2264];
					local776 = Static552.aClass3_Sub48_30.aClass23_Sub8_1.method3378();
					if (local175 != local776) {
						if (Static405.method6400(Static581.anInt9720)) {
							if (local776 == 0 && Static148.anInt3680 != -1) {
								Static195.method6190(Static399.aClass181_75, local175, Static148.anInt3680);
								Static545.method7726();
								Static48.aBoolean89 = false;
							} else if (local175 == 0) {
								Static389.method6143();
								Static48.aBoolean89 = false;
							} else {
								Static518.method8303(local175);
							}
						}
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub8_1, local175);
						Static152.method3314();
						Static355.aBoolean601 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub8_3, anIntArray88[--anInt2264]);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static552.aClass3_Sub48_30.aClass23_Sub25_2.method7082();
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub25_1, anIntArray88[--anInt2264] == 1 ? 0 : local175);
					Static159.method3381();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray88[--anInt2264];
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub23_1, local175);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6024) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub24_1, anIntArray88[--anInt2264]);
					Static152.method3314();
					return;
				}
				if (arg0 == 6025) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub29_1, anIntArray88[--anInt2264]);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray88[--anInt2264];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static278.method6285(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub21_1, anIntArray88[--anInt2264] == 0 ? 0 : 1);
					Static152.method3314();
					return;
				}
				if (arg0 == 6029) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub22_1, anIntArray88[--anInt2264]);
					Static152.method3314();
					return;
				}
				if (arg0 == 6030) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub16_1, anIntArray88[--anInt2264] == 0 ? 0 : 1);
					Static152.method3314();
					Static612.method8324();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray88[--anInt2264];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static559.method7893(false, local175);
					return;
				}
				if (arg0 == 6032) {
					anInt2264 -= 2;
					local175 = anIntArray88[anInt2264];
					local1496 = anIntArray88[anInt2264 + 1] == 1;
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, local175);
					if (!local1496) {
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub5_1, 0);
					}
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6033) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub11_1, anIntArray88[--anInt2264]);
					Static152.method3314();
					return;
				}
				if (arg0 == 6034) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub4_1, anIntArray88[--anInt2264] == 1 ? 1 : 0);
					Static152.method3314();
					Static379.method6035();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static552.aClass3_Sub48_30.lb.method4252();
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub14_1, anIntArray88[--anInt2264] == 1 ? 1 : local175);
					Static612.method8324();
					Static159.method3381();
					return;
				}
				if (arg0 == 6036) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub6_1, anIntArray88[--anInt2264]);
					Static152.method3314();
					Static439.aBoolean678 = true;
					return;
				}
				if (arg0 == 6037) {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub8_5, anIntArray88[--anInt2264]);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray88[--anInt2264];
					local776 = Static552.aClass3_Sub48_30.aClass23_Sub8_4.method3378();
					if (local175 != local776 && Static148.anInt3680 == Static20.anInt213) {
						if (!Static405.method6400(Static581.anInt9720)) {
							if (local776 == 0) {
								Static195.method6190(Static399.aClass181_75, local175, Static148.anInt3680);
								Static545.method7726();
								Static48.aBoolean89 = false;
							} else if (local175 == 0) {
								Static389.method6143();
								Static48.aBoolean89 = false;
							} else {
								Static518.method8303(local175);
							}
						}
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub8_4, local175);
						Static152.method3314();
						Static355.aBoolean601 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray88[--anInt2264];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static552.aClass3_Sub48_30.aClass23_Sub2_1.method698()) {
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub2_1, local175);
						Static152.method3314();
						Static355.aBoolean601 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray88[--anInt2264];
					if (local175 != Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3567()) {
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub10_1, local175);
						Static152.method3314();
						Static355.aBoolean601 = false;
						Static424.method8061();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub3_1.method1150();
					return;
				}
				if (arg0 == 6102) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.lb.method4252() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub25_2.method7082() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub12_1.method3750() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub22_1.method6092();
					return;
				}
				if (arg0 == 6108) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub17_1.method4969() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub13_1.method3796() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537();
					return;
				}
				if (arg0 == 6112) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub7_1.method3329() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub26_1.method7099() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub28_1.method7679() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub24_2.method6648();
					return;
				}
				if (arg0 == 6117) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub1_1.method484() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub8_2.method3378();
					return;
				}
				if (arg0 == 6119) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub8_1.method3378();
					return;
				}
				if (arg0 == 6120) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub8_3.method3378();
					return;
				}
				if (arg0 == 6123) {
					anIntArray88[anInt2264++] = Static486.method7130();
					return;
				}
				if (arg0 == 6124) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub24_1.method6648();
					return;
				}
				if (arg0 == 6125) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub29_1.method8509();
					return;
				}
				if (arg0 == 6127) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub19_1.method5517() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub21_1.method5653() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub22_1.method6092();
					return;
				}
				if (arg0 == 6130) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub16_1.method4881() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152();
					return;
				}
				if (arg0 == 6132) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub18_1.method5152();
					return;
				}
				if (arg0 == 6133) {
					anIntArray88[anInt2264++] = Static379.aClass228_6.aBoolean614 && !Static379.aClass228_6.aBoolean613 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub11_1.method3629();
					return;
				}
				if (arg0 == 6136) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub4_1.method1180() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray88[anInt2264++] = Static617.method8379(Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152(), 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub6_1.method2793();
					return;
				}
				if (arg0 == 6142) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub8_5.method3378();
					return;
				}
				if (arg0 == 6143) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub8_4.method3378();
					return;
				}
				if (arg0 == 6144) {
					anIntArray88[anInt2264++] = Static339.aBoolean575 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub2_1.method698();
					return;
				}
				if (arg0 == 6146) {
					anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3567();
					return;
				}
				if (arg0 == 6147) {
					anIntArray88[anInt2264++] = Static2.aClass3_Sub23_1.anInt4394 < 512 || Static339.aBoolean575 || Static111.aBoolean235 ? 1 : 0;
					return;
				}
				if (arg0 == 6148) {
					anIntArray88[anInt2264++] = Static375.aBoolean619 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt2264 -= 2;
					Static311.aShort85 = (short) anIntArray88[anInt2264];
					if (Static311.aShort85 <= 0) {
						Static311.aShort85 = 256;
					}
					Static103.aShort13 = (short) anIntArray88[anInt2264 + 1];
					if (Static103.aShort13 <= 0) {
						Static103.aShort13 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt2264 -= 2;
					Static426.aShort104 = (short) anIntArray88[anInt2264];
					if (Static426.aShort104 <= 0) {
						Static426.aShort104 = 256;
					}
					Static604.aShort118 = (short) anIntArray88[anInt2264 + 1];
					if (Static604.aShort118 <= 0) {
						Static604.aShort118 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt2264 -= 4;
					Static68.aShort11 = (short) anIntArray88[anInt2264];
					if (Static68.aShort11 <= 0) {
						Static68.aShort11 = 1;
					}
					Static423.aShort101 = (short) anIntArray88[anInt2264 + 1];
					if (Static423.aShort101 <= 0) {
						Static423.aShort101 = 32767;
					} else if (Static423.aShort101 < Static68.aShort11) {
						Static423.aShort101 = Static68.aShort11;
					}
					Static82.aShort12 = (short) anIntArray88[anInt2264 + 2];
					if (Static82.aShort12 <= 0) {
						Static82.aShort12 = 1;
					}
					Static373.aShort95 = (short) anIntArray88[anInt2264 + 3];
					if (Static373.aShort95 <= 0) {
						Static373.aShort95 = 32767;
						return;
					}
					if (Static373.aShort95 < Static82.aShort12) {
						Static373.aShort95 = Static82.aShort12;
					}
					return;
				}
				if (arg0 == 6203) {
					Static281.method5313(0, false, Static397.aClass108_9.anInt4067, 0, Static397.aClass108_9.anInt4037);
					anIntArray88[anInt2264++] = Static539.anInt9289;
					anIntArray88[anInt2264++] = Static590.anInt9841;
					return;
				}
				if (arg0 == 6204) {
					anIntArray88[anInt2264++] = Static426.aShort104;
					anIntArray88[anInt2264++] = Static604.aShort118;
					return;
				}
				if (arg0 == 6205) {
					anIntArray88[anInt2264++] = Static311.aShort85;
					anIntArray88[anInt2264++] = Static103.aShort13;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray88[anInt2264++] = (int) (Static444.method6719() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray88[anInt2264++] = (int) (Static444.method6719() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt2264 -= 3;
					local175 = anIntArray88[anInt2264];
					local776 = anIntArray88[anInt2264 + 1];
					local97 = anIntArray88[anInt2264 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local97, local776, local175);
					local103 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray88[anInt2264++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static444.method6719()));
					anIntArray88[anInt2264++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray88[--anInt2264];
					local1496 = true;
					if (local175 < 0) {
						local1496 = (local175 + 1) % 4 == 0;
					} else if (local175 < 1582) {
						local1496 = local175 % 4 == 0;
					} else if (local175 % 4 != 0) {
						local1496 = false;
					} else if (local175 % 100 != 0) {
						local1496 = true;
					} else if (local175 % 400 != 0) {
						local1496 = false;
					}
					anIntArray88[anInt2264++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray88[anInt2264++] = Static181.method3693() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray88[anInt2264++] = Static503.method7334() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static581.anInt9720 == 7 && Static621.anInt10311 == 0 && Static567.anInt9650 == 0) {
						if (Static237.aBoolean473) {
							anIntArray88[anInt2264++] = 0;
							return;
						}
						if (Static300.aLong144 > Static444.method6719() - 1000L) {
							anIntArray88[anInt2264++] = 1;
							return;
						}
						Static237.aBoolean473 = true;
						local52 = Static640.method8636(Static473.aClass344_99, Static403.aClass294_3);
						local52.aClass3_Sub15_Sub1_3.method8419(Static359.anInt9617);
						Static472.method5189(local52);
						anIntArray88[anInt2264++] = 0;
						return;
					}
					anIntArray88[anInt2264++] = 1;
					return;
				}
				@Pc(6862) Class63 local6862;
				@Pc(6829) Class153_Sub1 local6829;
				if (arg0 == 6501) {
					local6829 = Static145.method8498();
					if (local6829 != null) {
						anIntArray88[anInt2264++] = local6829.anInt5586;
						anIntArray88[anInt2264++] = local6829.anInt5570;
						aStringArray8[anInt2261++] = local6829.aString51;
						local6862 = local6829.method4765();
						anIntArray88[anInt2264++] = local6862.anInt2552;
						aStringArray8[anInt2261++] = local6862.aString19;
						anIntArray88[anInt2264++] = local6829.anInt5574;
						anIntArray88[anInt2264++] = local6829.anInt5585;
						aStringArray8[anInt2261++] = local6829.aString52;
						return;
					}
					anIntArray88[anInt2264++] = -1;
					anIntArray88[anInt2264++] = 0;
					aStringArray8[anInt2261++] = "";
					anIntArray88[anInt2264++] = 0;
					aStringArray8[anInt2261++] = "";
					anIntArray88[anInt2264++] = 0;
					anIntArray88[anInt2264++] = 0;
					aStringArray8[anInt2261++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6829 = Static274.method4941();
					if (local6829 != null) {
						anIntArray88[anInt2264++] = local6829.anInt5586;
						anIntArray88[anInt2264++] = local6829.anInt5570;
						aStringArray8[anInt2261++] = local6829.aString51;
						local6862 = local6829.method4765();
						anIntArray88[anInt2264++] = local6862.anInt2552;
						aStringArray8[anInt2261++] = local6862.aString19;
						anIntArray88[anInt2264++] = local6829.anInt5574;
						anIntArray88[anInt2264++] = local6829.anInt5585;
						aStringArray8[anInt2261++] = local6829.aString52;
						return;
					}
					anIntArray88[anInt2264++] = -1;
					anIntArray88[anInt2264++] = 0;
					aStringArray8[anInt2261++] = "";
					anIntArray88[anInt2264++] = 0;
					aStringArray8[anInt2261++] = "";
					anIntArray88[anInt2264++] = 0;
					anIntArray88[anInt2264++] = 0;
					aStringArray8[anInt2261++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray88[--anInt2264];
					local89 = aStringArray8[--anInt2261];
					if (Static581.anInt9720 == 7 && Static621.anInt10311 == 0 && Static567.anInt9650 == 0) {
						anIntArray88[anInt2264++] = Static553.method7813(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray88[anInt2264++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray88[--anInt2264];
					@Pc(7189) Class153_Sub1 local7189 = Static643.method8649(local175);
					if (local7189 != null) {
						anIntArray88[anInt2264++] = local7189.anInt5570;
						aStringArray8[anInt2261++] = local7189.aString51;
						@Pc(7213) Class63 local7213 = local7189.method4765();
						anIntArray88[anInt2264++] = local7213.anInt2552;
						aStringArray8[anInt2261++] = local7213.aString19;
						anIntArray88[anInt2264++] = local7189.anInt5574;
						anIntArray88[anInt2264++] = local7189.anInt5585;
						aStringArray8[anInt2261++] = local7189.aString52;
						return;
					}
					anIntArray88[anInt2264++] = -1;
					aStringArray8[anInt2261++] = "";
					anIntArray88[anInt2264++] = 0;
					aStringArray8[anInt2261++] = "";
					anIntArray88[anInt2264++] = 0;
					anIntArray88[anInt2264++] = 0;
					aStringArray8[anInt2261++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt2264 -= 4;
					local175 = anIntArray88[anInt2264];
					local1496 = anIntArray88[anInt2264 + 1] == 1;
					local97 = anIntArray88[anInt2264 + 2];
					local2107 = anIntArray88[anInt2264 + 3] == 1;
					Static335.method5569(local97, local2107, local1496, local175);
					return;
				}
				if (arg0 == 6508) {
					Static389.method6145();
					return;
				}
				if (arg0 == 6509) {
					if (Static581.anInt9720 != 7) {
						return;
					}
					Static17.aBoolean20 = anIntArray88[--anInt2264] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray88[anInt2264++] = Static356.anInt6937;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static623.aClass244_6 == Static447.aClass244_3) {
					if (arg0 == 6700) {
						local175 = Static40.aClass307_5.method7420();
						if (Static530.anInt9144 != -1) {
							local175++;
						}
						anIntArray88[anInt2264++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray88[--anInt2264];
						if (Static530.anInt9144 != -1) {
							if (local175 == 0) {
								anIntArray88[anInt2264++] = Static530.anInt9144;
								return;
							}
							local175--;
						}
						@Pc(7461) Class3_Sub50 local7461 = (Class3_Sub50) Static40.aClass307_5.method7421();
						while (local175-- > 0) {
							local7461 = (Class3_Sub50) Static40.aClass307_5.method7428();
						}
						anIntArray88[anInt2264++] = local7461.anInt9575;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray88[--anInt2264];
						if (Static85.aClass108ArrayArray2[local175] == null) {
							aStringArray8[anInt2261++] = "";
							return;
						}
						local89 = Static85.aClass108ArrayArray2[local175][0].aString38;
						if (local89 == null) {
							aStringArray8[anInt2261++] = "";
							return;
						}
						aStringArray8[anInt2261++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray88[--anInt2264];
						if (Static85.aClass108ArrayArray2[local175] == null) {
							anIntArray88[anInt2264++] = 0;
							return;
						}
						anIntArray88[anInt2264++] = Static85.aClass108ArrayArray2[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt2264 -= 2;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						if (Static85.aClass108ArrayArray2[local175] == null) {
							aStringArray8[anInt2261++] = "";
							return;
						}
						local181 = Static85.aClass108ArrayArray2[local175][local776].aString38;
						if (local181 == null) {
							aStringArray8[anInt2261++] = "";
							return;
						}
						aStringArray8[anInt2261++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt2264 -= 2;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						if (Static85.aClass108ArrayArray2[local175] == null) {
							anIntArray88[anInt2264++] = 0;
							return;
						}
						anIntArray88[anInt2264++] = Static85.aClass108ArrayArray2[local175][local776].anInt4024;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 1, "", local97);
						return;
					}
					if (arg0 == 6708) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 2, "", local97);
						return;
					}
					if (arg0 == 6709) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 3, "", local97);
						return;
					}
					if (arg0 == 6710) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 4, "", local97);
						return;
					}
					if (arg0 == 6711) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 5, "", local97);
						return;
					}
					if (arg0 == 6712) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 6, "", local97);
						return;
					}
					if (arg0 == 6713) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 7, "", local97);
						return;
					}
					if (arg0 == 6714) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 8, "", local97);
						return;
					}
					if (arg0 == 6715) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 9, "", local97);
						return;
					}
					if (arg0 == 6716) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						Static349.method5731(local175 << 16 | local776, 10, "", local97);
						return;
					}
					if (arg0 == 6717) {
						anInt2264 -= 3;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						local97 = anIntArray88[anInt2264 + 2];
						@Pc(8049) Class108 local8049 = Static526.method6818(local97, local175 << 16 | local776);
						Static32.method596();
						@Pc(8054) Class3_Sub11 local8054 = Static71.method1836(local8049);
						Static386.method6952(local8054.anInt1135, local8049, local8054.method1191());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8082) Class269 local8082;
					if (arg0 == 6800) {
						local175 = anIntArray88[--anInt2264];
						local8082 = Static34.aClass115_1.method3752(local175);
						if (local8082.aString90 == null) {
							aStringArray8[anInt2261++] = "";
							return;
						}
						aStringArray8[anInt2261++] = local8082.aString90;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray88[--anInt2264];
						local8082 = Static34.aClass115_1.method3752(local175);
						anIntArray88[anInt2264++] = local8082.anInt8151;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray88[--anInt2264];
						local8082 = Static34.aClass115_1.method3752(local175);
						anIntArray88[anInt2264++] = local8082.anInt8148;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray88[--anInt2264];
						local8082 = Static34.aClass115_1.method3752(local175);
						anIntArray88[anInt2264++] = local8082.anInt8161;
						return;
					}
					if (arg0 == 6804) {
						anInt2264 -= 2;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						@Pc(8204) Class140 local8204 = Static513.aClass49_2.method1857(local776);
						if (local8204.method4349()) {
							aStringArray8[anInt2261++] = Static34.aClass115_1.method3752(local175).method6794(local776, local8204.aString48);
							return;
						}
						anIntArray88[anInt2264++] = Static34.aClass115_1.method3752(local175).method6799(local8204.anInt5140, local776);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray88[anInt2264++] = Static351.aBoolean592 && !Static201.aBoolean410 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray88[anInt2264++] = Static349.anInt6850;
						return;
					}
					if (arg0 == 6902) {
						anIntArray88[anInt2264++] = Static296.anInt6016;
						return;
					}
					if (arg0 == 6903) {
						anIntArray88[anInt2264++] = Static383.anInt7319;
						return;
					}
					if (arg0 == 6904) {
						anIntArray88[anInt2264++] = Static292.anInt5932;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static203.aClass376_15 != null) {
							if (Static203.aClass376_15.anObject19 == null) {
								local83 = Static36.method720(Static203.aClass376_15.anInt10512);
							} else {
								local83 = (String) Static203.aClass376_15.anObject19;
							}
						}
						aStringArray8[anInt2261++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray88[anInt2264++] = Static144.anInt3606;
						return;
					}
					if (arg0 == 6907) {
						anIntArray88[anInt2264++] = Static611.anInt10114;
						return;
					}
					if (arg0 == 6908) {
						anIntArray88[anInt2264++] = Static377.anInt7134;
						return;
					}
					if (arg0 == 6909) {
						anIntArray88[anInt2264++] = Static47.aBoolean86 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray88[anInt2264++] = Static611.anInt10103;
						return;
					}
					if (arg0 == 6911) {
						anIntArray88[anInt2264++] = Static50.anInt1092;
						return;
					}
					if (arg0 == 6912) {
						anIntArray88[anInt2264++] = Static468.anInt8447;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static592.method8102();
						anIntArray88[anInt2264++] = Static478.anInt9997 = Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152();
						anIntArray88[anInt2264++] = local175;
						Static612.method8324();
						Static152.method3314();
						Static355.aBoolean601 = false;
						return;
					}
					if (arg0 == 7001) {
						Static351.method5758();
						Static612.method8324();
						Static152.method3314();
						Static355.aBoolean601 = false;
						return;
					}
					if (arg0 == 7002) {
						Static596.method8155();
						Static612.method8324();
						Static152.method3314();
						Static355.aBoolean601 = false;
						return;
					}
					if (arg0 == 7003) {
						Static173.method8277();
						Static612.method8324();
						Static152.method3314();
						Static355.aBoolean601 = false;
						return;
					}
					if (arg0 == 7004) {
						Static534.method7607();
						Static612.method8324();
						Static152.method3314();
						Static355.aBoolean601 = false;
						return;
					}
					if (arg0 == 7005) {
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub5_1, 0);
						Static152.method3314();
						Static355.aBoolean601 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static478.anInt9997 == 2) {
							Static448.aBoolean691 = true;
							return;
						}
						if (Static478.anInt9997 == 1) {
							Static255.aBoolean489 = true;
							return;
						}
						if (Static478.anInt9997 == 3) {
							Static144.aBoolean302 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub5_1.method2481();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt2264 -= 2;
						local175 = anIntArray88[anInt2264];
						local776 = anIntArray88[anInt2264 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static567.method7978(local175, local776, false);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray88[--anInt2264];
						if (local175 != -1) {
							Static3.method8622(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray88[--anInt2264];
						if (local175 != -1) {
							Static32.method597(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray88[anInt2264++] = Static493.method7236("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub12_1.method3748() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub13_1.method3798() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5535() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub26_1.method7095() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub24_1.method6646() && Static47.aClass33_3.method6198() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub23_1.method6575() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub29_1.method8508() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub19_1.method5520() && Static47.aClass33_3.method6218() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub16_1.method4882() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub4_1.method1181() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub6_1.method2790() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub28_1.method7680() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3569() ? 1 : 0;
						return;
					}
					if (arg0 == 7214) {
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub18_1.method5148() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub12_1.method8502(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub13_1.method8502(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub20_1.method8502(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub26_1.method8502(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray88[--anInt2264];
						if (!Static47.aClass33_3.method6198()) {
							anIntArray88[anInt2264++] = 3;
							return;
						}
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub24_1.method8502(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub23_1.method8502(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub29_1.method8502(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray88[--anInt2264];
						if (!Static47.aClass33_3.method6218()) {
							anIntArray88[anInt2264++] = 3;
							return;
						}
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub19_1.method8502(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub16_1.method8502(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub4_1.method8502(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub6_1.method8502(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub28_1.method8502(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub10_1.method8502(local175);
						return;
					}
					if (arg0 == 7314) {
						local175 = anIntArray88[--anInt2264];
						anIntArray88[anInt2264++] = Static552.aClass3_Sub48_30.aClass23_Sub18_1.method8502(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)V")
	private static void method2229(@OriginalArg(0) int arg0) {
		@Pc(3) Class108 local3 = Static113.method8285(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class108[] local13 = Static42.aClass108ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class108[] local19 = Static85.aClass108ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static42.aClass108ArrayArray1[local9] = new Class108[local22];
			Static655.method6407(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static655.method6407(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!wba;I)V")
	private static void method2230(@OriginalArg(0) Class3_Sub51 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray33;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub1_Sub9 local12 = Static634.method8592(local8);
		if (local12 == null) {
			return;
		}
		anIntArray87 = new int[local12.anInt5691];
		@Pc(21) int local21 = 0;
		aStringArray9 = new String[local12.anInt5692];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt10306;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt10307;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass108_13 == null ? -1 : arg0.aClass108_13.anInt4043;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt10308;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass108_13 == null ? -1 : arg0.aClass108_13.anInt4083;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass108_14 == null ? -1 : arg0.aClass108_14.anInt4043;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass108_14 == null ? -1 : arg0.aClass108_14.anInt4083;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt10309;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt10310;
				}
				anIntArray87[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString113;
				}
				aStringArray9[local27++] = local135;
			}
		}
		anInt2271 = arg0.anInt10305;
		method2217(local12, arg1);
	}

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method2231(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray10[local20] + "-" + local24;
	}
}
