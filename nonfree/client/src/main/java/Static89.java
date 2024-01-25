import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!ep;")
	private static Class93 aClass93_4;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray12;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!ep;")
	private static Class93 aClass93_5;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Lclient!bo;")
	private static Class39 aClass39_1;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
	private static final int[] anIntArray163 = new int[5];

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11 = new String[1000];

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	private static int anInt2189 = 0;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "[[I")
	private static final int[][] anIntArrayArray13 = new int[5][5000];

	@OriginalMember(owner = "client!df", name = "m", descriptor = "I")
	private static int anInt2190 = 0;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "[I")
	private static final int[] anIntArray164 = new int[1000];

	@OriginalMember(owner = "client!df", name = "o", descriptor = "I")
	private static int anInt2191 = 0;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "[Lclient!ho;")
	private static final Class140[] aClass140Array1 = new Class140[50];

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!df", name = "z", descriptor = "[I")
	private static final int[] anIntArray166 = new int[3];

	@OriginalMember(owner = "client!df", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_23 = new Class245(4);

	@OriginalMember(owner = "client!df", name = "C", descriptor = "I")
	private static int anInt2197 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!qc;I)V")
	private static void method1978(@OriginalArg(0) Class6_Sub38 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub4_Sub10 local12 = Static177.method3520(local8);
		if (local12 == null) {
			return;
		}
		anIntArray165 = new int[local12.anInt6727];
		@Pc(21) int local21 = 0;
		aStringArray12 = new String[local12.anInt6729];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt7664;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt7666;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass93_14 == null ? -1 : arg0.aClass93_14.anInt2790;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt7663;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass93_14 == null ? -1 : arg0.aClass93_14.anInt2806;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass93_13 == null ? -1 : arg0.aClass93_13.anInt2790;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass93_13 == null ? -1 : arg0.aClass93_13.anInt2806;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt7660;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt7665;
				}
				anIntArray165[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString98;
				}
				aStringArray12[local27++] = local135;
			}
		}
		anInt2197 = arg0.anInt7662;
		method1980(local12, arg1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!qc;)V")
	public static void method1979(@OriginalArg(0) Class6_Sub38 arg0) {
		method1978(arg0, 200000);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!nk;I)V")
	private static void method1980(@OriginalArg(0) Class6_Sub4_Sub10 arg0, @OriginalArg(1) int arg1) {
		anInt2191 = 0;
		anInt2189 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray475;
		@Pc(11) int[] local11 = arg0.anIntArray476;
		@Pc(13) byte local13 = -1;
		anInt2190 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method1986(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1990(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray164[anInt2191++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray164[anInt2191++] = Static435.aClass234_1.anIntArray491[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static435.aClass234_1.method5832(anIntArray164[--anInt2191], local54);
					} else if (local31 == 3) {
						aStringArray11[anInt2189++] = arg0.aStringArray39[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt2191 -= 2;
						if (anIntArray164[anInt2191] != anIntArray164[anInt2191 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt2191 -= 2;
						if (anIntArray164[anInt2191] == anIntArray164[anInt2191 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt2191 -= 2;
						if (anIntArray164[anInt2191] < anIntArray164[anInt2191 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt2191 -= 2;
						if (anIntArray164[anInt2191] > anIntArray164[anInt2191 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt2190 == 0) {
							return;
						}
						@Pc(216) Class140 local216 = aClass140Array1[--anInt2190];
						arg0 = local216.aClass6_Sub4_Sub10_1;
						local8 = arg0.anIntArray475;
						local11 = arg0.anIntArray476;
						local5 = local216.anInt4364;
						anIntArray165 = local216.anIntArray281;
						aStringArray12 = local216.aStringArray24;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray164[anInt2191++] = Static435.aClass234_1.method5829(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static435.aClass234_1.method5833(anIntArray164[--anInt2191], local54);
					} else if (local31 == 31) {
						anInt2191 -= 2;
						if (anIntArray164[anInt2191] <= anIntArray164[anInt2191 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt2191 -= 2;
						if (anIntArray164[anInt2191] >= anIntArray164[anInt2191 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray164[anInt2191++] = anIntArray165[local11[local5]];
					} else if (local31 == 34) {
						anIntArray165[local11[local5]] = anIntArray164[--anInt2191];
					} else if (local31 == 35) {
						aStringArray11[anInt2189++] = aStringArray12[local11[local5]];
					} else if (local31 == 36) {
						aStringArray12[local11[local5]] = aStringArray11[--anInt2189];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt2189 -= local54;
						@Pc(400) String local400 = Static580.method8172(anInt2189, aStringArray11, local54);
						aStringArray11[anInt2189++] = local400;
					} else if (local31 == 38) {
						anInt2191--;
					} else if (local31 == 39) {
						anInt2189--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class6_Sub4_Sub10 local436 = Static177.method3520(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt6727];
							@Pc(450) String[] local450 = new String[local436.anInt6729];
							for (local452 = 0; local452 < local436.anInt6730; local452++) {
								local446[local452] = anIntArray164[anInt2191 + local452 - local436.anInt6730];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt6728; local471++) {
								local450[local471] = aStringArray11[anInt2189 + local471 - local436.anInt6728];
							}
							anInt2191 -= local436.anInt6730;
							anInt2189 -= local436.anInt6728;
							@Pc(502) Class140 local502 = new Class140();
							local502.aClass6_Sub4_Sub10_1 = arg0;
							local502.anInt4364 = local5;
							local502.anIntArray281 = anIntArray165;
							local502.aStringArray24 = aStringArray12;
							if (anInt2190 >= aClass140Array1.length) {
								throw new RuntimeException();
							}
							aClass140Array1[anInt2190++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray475;
							local11 = local436.anIntArray476;
							local5 = -1;
							anIntArray165 = local446;
							aStringArray12 = local450;
						} else if (local31 == 42) {
							anIntArray164[anInt2191++] = Static67.anIntArray106[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static67.anIntArray106[local54] = anIntArray164[--anInt2191];
							Static316.method5099(local54);
							Static321.aBoolean451 |= Static30.aBooleanArray4[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray164[--anInt2191];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray163[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray13[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray164[--anInt2191];
							if (local603 < 0 || local603 >= anIntArray163[local54]) {
								throw new RuntimeException();
							}
							anIntArray164[anInt2191++] = anIntArrayArray13[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt2191 -= 2;
							local603 = anIntArray164[anInt2191];
							if (local603 < 0 || local603 >= anIntArray163[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray13[local54][local603] = anIntArray164[anInt2191 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static157.aStringArray44[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray11[anInt2189++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static157.aStringArray44[local54] = aStringArray11[--anInt2189];
							Static324.method5242(local54);
						} else if (local31 == 51) {
							@Pc(774) Class305 local774 = arg0.aClass305Array1[local11[local5]];
							@Pc(787) Class6_Sub24 local787 = (Class6_Sub24) local774.method7447((long) anIntArray164[--anInt2191]);
							if (local787 != null) {
								local5 += local787.anInt4156;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString76 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong252).append(" ");
				for (local603 = anInt2190 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass140Array1[local603].aClass6_Sub4_Sub10_1.aLong252).append(" ");
				}
				local856.append("op: ").append(local13);
				Static5.method211(local837, local856.toString());
			} else {
				Static99.method2135("Clientscript error in: " + arg0.aString76);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString76).append("\n");
				for (local603 = anInt2190 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass140Array1[local603].aClass6_Sub4_Sub10_1.aString76).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static5.method211(local837, local856.toString());
				Static280.method3700(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	private static void method1982(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = Static223.method4011(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class93[] local13 = Static279.aClass93ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class93[] local19 = Static336.aClass93ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static279.aClass93ArrayArray1[local9] = new Class93[local22];
			Static589.method5380(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static589.method5380(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1983(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static456.anInt8437 == 0 && (Static200.aBoolean349 && !Static554.aBoolean702 || Static245.aBoolean376)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static222.aClass152_92.method4002(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static222.aClass152_92.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_93.method4002(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static222.aClass152_93.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_94.method4002(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static222.aClass152_94.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_95.method4002(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static222.aClass152_95.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_96.method4002(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static222.aClass152_96.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_97.method4002(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static222.aClass152_97.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_98.method4002(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static222.aClass152_98.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_99.method4002(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static222.aClass152_99.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_100.method4002(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static222.aClass152_100.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_101.method4002(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static222.aClass152_101.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_102.method4002(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static222.aClass152_102.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_103.method4002(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static222.aClass152_103.method4002(0).length());
		} else if (Static286.anInt5468 != 0) {
			if (local11.startsWith(Static222.aClass152_92.method4002(Static286.anInt5468))) {
				local13 = 0;
				arg0 = arg0.substring(Static222.aClass152_92.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_93.method4002(Static286.anInt5468))) {
				local13 = 1;
				arg0 = arg0.substring(Static222.aClass152_93.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_94.method4002(Static286.anInt5468))) {
				local13 = 2;
				arg0 = arg0.substring(Static222.aClass152_94.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_95.method4002(Static286.anInt5468))) {
				local13 = 3;
				arg0 = arg0.substring(Static222.aClass152_95.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_96.method4002(Static286.anInt5468))) {
				local13 = 4;
				arg0 = arg0.substring(Static222.aClass152_96.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_97.method4002(Static286.anInt5468))) {
				local13 = 5;
				arg0 = arg0.substring(Static222.aClass152_97.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_98.method4002(Static286.anInt5468))) {
				local13 = 6;
				arg0 = arg0.substring(Static222.aClass152_98.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_99.method4002(Static286.anInt5468))) {
				local13 = 7;
				arg0 = arg0.substring(Static222.aClass152_99.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_100.method4002(Static286.anInt5468))) {
				local13 = 8;
				arg0 = arg0.substring(Static222.aClass152_100.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_101.method4002(Static286.anInt5468))) {
				local13 = 9;
				arg0 = arg0.substring(Static222.aClass152_101.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_102.method4002(Static286.anInt5468))) {
				local13 = 10;
				arg0 = arg0.substring(Static222.aClass152_102.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_103.method4002(Static286.anInt5468))) {
				local13 = 11;
				arg0 = arg0.substring(Static222.aClass152_103.method4002(Static286.anInt5468).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static222.aClass152_104.method4002(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static222.aClass152_104.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_105.method4002(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static222.aClass152_105.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_106.method4002(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static222.aClass152_106.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_107.method4002(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static222.aClass152_107.method4002(0).length());
		} else if (local11.startsWith(Static222.aClass152_108.method4002(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static222.aClass152_108.method4002(0).length());
		} else if (Static286.anInt5468 != 0) {
			if (local11.startsWith(Static222.aClass152_104.method4002(Static286.anInt5468))) {
				local451 = 1;
				arg0 = arg0.substring(Static222.aClass152_104.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_105.method4002(Static286.anInt5468))) {
				local451 = 2;
				arg0 = arg0.substring(Static222.aClass152_105.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_106.method4002(Static286.anInt5468))) {
				local451 = 3;
				arg0 = arg0.substring(Static222.aClass152_106.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_107.method4002(Static286.anInt5468))) {
				local451 = 4;
				arg0 = arg0.substring(Static222.aClass152_107.method4002(Static286.anInt5468).length());
			} else if (local11.startsWith(Static222.aClass152_108.method4002(Static286.anInt5468))) {
				local451 = 5;
				arg0 = arg0.substring(Static222.aClass152_108.method4002(Static286.anInt5468).length());
			}
		}
		Static298.method4854(Static538.aClass181_109);
		Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
		@Pc(646) int local646 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
		Static547.aClass6_Sub26_Sub2_2.method4950(local13, -81849);
		Static547.aClass6_Sub26_Sub2_2.method4950(local451, -81849);
		Static320.method5175(Static547.aClass6_Sub26_Sub2_2, arg0);
		Static547.aClass6_Sub26_Sub2_2.method4976(Static547.aClass6_Sub26_Sub2_2.anInt5769 - local646);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method1984(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static457.method7117(arg0)) {
			return;
		}
		@Pc(12) Class93[] local12 = Static336.aClass93ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class93 local19 = local12[local14];
			if (local19.anObjectArray18 != null) {
				@Pc(26) Class6_Sub38 local26 = new Class6_Sub38();
				local26.aClass93_14 = local19;
				local26.anObjectArray36 = local19.anObjectArray18;
				method1978(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method1985(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray13[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
	private static void method1986(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class93 local137;
		@Pc(19) int local19;
		@Pc(35) Class93 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(210) Class93 local210;
		@Pc(25) int local25;
		@Pc(158) Class93 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt2191 -= 3;
				local13 = anIntArray164[anInt2191];
				local19 = anIntArray164[anInt2191 + 1];
				local25 = anIntArray164[anInt2191 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static223.method4011(local13);
				if (local35.aClass93Array4 == null) {
					local35.aClass93Array4 = new Class93[local25 + 1];
				}
				if (local35.aClass93Array4.length <= local25) {
					@Pc(54) Class93[] local54 = new Class93[local25 + 1];
					for (local56 = 0; local56 < local35.aClass93Array4.length; local56++) {
						local54[local56] = local35.aClass93Array4[local56];
					}
					local35.aClass93Array4 = local54;
				}
				if (local25 > 0 && local35.aClass93Array4[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class93 local99 = new Class93();
				local99.anInt2823 = local19;
				local99.anInt2820 = local99.anInt2790 = local35.anInt2790;
				local99.anInt2806 = local25;
				local35.aClass93Array4[local25] = local99;
				if (arg1) {
					aClass93_4 = local99;
				} else {
					aClass93_5 = local99;
				}
				Static468.method7221(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass93_4 : aClass93_5;
				if (local137.anInt2806 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static223.method4011(local137.anInt2790);
				local158.aClass93Array4[local137.anInt2806] = null;
				Static468.method7221(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static223.method4011(anIntArray164[--anInt2191]);
				local137.aClass93Array4 = null;
				Static468.method7221(local137);
				return;
			}
			if (arg0 == 200) {
				anInt2191 -= 2;
				local13 = anIntArray164[anInt2191];
				local19 = anIntArray164[anInt2191 + 1];
				local210 = Static100.method2145(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray164[anInt2191++] = 1;
					if (arg1) {
						aClass93_4 = local210;
						return;
					}
					aClass93_5 = local210;
					return;
				}
				anIntArray164[anInt2191++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray164[--anInt2191];
				local158 = Static223.method4011(local13);
				if (local158 != null) {
					anIntArray164[anInt2191++] = 1;
					if (arg1) {
						aClass93_4 = local158;
						return;
					}
					aClass93_5 = local158;
					return;
				}
				anIntArray164[anInt2191++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray164[--anInt2191];
				method1988(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray164[--anInt2191];
				method1982(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt2191 -= 2;
					local13 = anIntArray164[anInt2191];
					local19 = anIntArray164[anInt2191 + 1];
					for (local25 = 0; local25 < Static278.anIntArray401.length; local25++) {
						if (Static278.anIntArray401[local25] == local13) {
							Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1.method1966(local25, Static517.aClass285_2, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static524.anIntArray797.length; local353++) {
						if (Static524.anIntArray797[local353] == local13) {
							Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1.method1966(local353, Static517.aClass285_2, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt2191 -= 2;
					local13 = anIntArray164[anInt2191];
					local19 = anIntArray164[anInt2191 + 1];
					Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1.method1974(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray164[--anInt2191] != 0;
					Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1.method1968(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static223.method4011(anIntArray164[--anInt2191]);
				} else {
					local137 = arg1 ? aClass93_4 : aClass93_5;
				}
				if (arg0 == 1000) {
					anInt2191 -= 4;
					local137.anInt2817 = anIntArray164[anInt2191];
					local137.anInt2774 = anIntArray164[anInt2191 + 1];
					local19 = anIntArray164[anInt2191 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray164[anInt2191 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte35 = (byte) local19;
					local137.aByte36 = (byte) local25;
					Static468.method7221(local137);
					Static169.method3455(local137);
					if (local137.anInt2806 == -1) {
						Static369.method5893(local137.anInt2790);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt2191 -= 4;
					local137.anInt2818 = anIntArray164[anInt2191];
					local137.anInt2827 = anIntArray164[anInt2191 + 1];
					local137.anInt2809 = 0;
					local137.anInt2802 = 0;
					local19 = anIntArray164[anInt2191 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray164[anInt2191 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte33 = (byte) local19;
					local137.aByte34 = (byte) local25;
					Static468.method7221(local137);
					Static169.method3455(local137);
					if (local137.anInt2823 == 0) {
						Static29.method991(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray164[--anInt2191] == 1;
					if (local137.aBoolean234 != local620) {
						local137.aBoolean234 = local620;
						Static468.method7221(local137);
					}
					if (local137.anInt2806 == -1) {
						Static114.method2310(local137.anInt2790);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt2191 -= 2;
					local137.anInt2796 = anIntArray164[anInt2191];
					local137.anInt2807 = anIntArray164[anInt2191 + 1];
					Static468.method7221(local137);
					Static169.method3455(local137);
					if (local137.anInt2823 == 0) {
						Static29.method991(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean228 = anIntArray164[--anInt2191] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static223.method4011(anIntArray164[--anInt2191]);
					} else {
						local137 = arg1 ? aClass93_4 : aClass93_5;
					}
					if (arg0 == 1100) {
						anInt2191 -= 2;
						local137.anInt2761 = anIntArray164[anInt2191];
						if (local137.anInt2761 > local137.anInt2798 - local137.anInt2777) {
							local137.anInt2761 = local137.anInt2798 - local137.anInt2777;
						}
						if (local137.anInt2761 < 0) {
							local137.anInt2761 = 0;
						}
						local137.anInt2789 = anIntArray164[anInt2191 + 1];
						if (local137.anInt2789 > local137.anInt2744 - local137.anInt2738) {
							local137.anInt2789 = local137.anInt2744 - local137.anInt2738;
						}
						if (local137.anInt2789 < 0) {
							local137.anInt2789 = 0;
						}
						Static468.method7221(local137);
						if (local137.anInt2806 == -1) {
							Static14.method646(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2821 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						if (local137.anInt2806 == -1) {
							Static478.method7304(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean231 = anIntArray164[--anInt2191] == 1;
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2755 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2792 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray164[--anInt2191];
						if (local137.anInt2765 != local19) {
							local137.anInt2765 = local19;
							Static468.method7221(local137);
						}
						if (local137.anInt2806 == -1) {
							Static188.method3615(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2771 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean236 = anIntArray164[--anInt2191] == 1;
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2779 = 1;
						local137.anInt2805 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						if (local137.anInt2806 == -1) {
							Static65.method1368(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt2191 -= 6;
						local137.anInt2814 = anIntArray164[anInt2191];
						local137.anInt2754 = anIntArray164[anInt2191 + 1];
						local137.anInt2758 = anIntArray164[anInt2191 + 2];
						local137.anInt2783 = anIntArray164[anInt2191 + 3];
						local137.anInt2816 = anIntArray164[anInt2191 + 4];
						local137.anInt2800 = anIntArray164[anInt2191 + 5];
						Static468.method7221(local137);
						if (local137.anInt2806 == -1) {
							Static25.method963(local137.anInt2790);
							Static245.method4270(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray164[--anInt2191];
						if (local137.anInt2786 != local19) {
							local137.anInt2786 = local19;
							local137.anInt2772 = 0;
							local137.anInt2795 = 1;
							local137.anInt2737 = 0;
							Static468.method7221(local137);
						}
						if (local137.anInt2806 == -1) {
							Static94.method2048(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean221 = anIntArray164[--anInt2191] == 1;
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray11[--anInt2189];
						if (!local1101.equals(local137.aString33)) {
							local137.aString33 = local1101;
							Static468.method7221(local137);
						}
						if (local137.anInt2806 == -1) {
							Static133.method2526(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2778 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						if (local137.anInt2806 == -1) {
							Static497.method7453(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt2191 -= 3;
						local137.anInt2785 = anIntArray164[anInt2191];
						local137.lb = anIntArray164[anInt2191 + 1];
						local137.anInt2763 = anIntArray164[anInt2191 + 2];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean230 = anIntArray164[--anInt2191] == 1;
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2747 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2787 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean225 = anIntArray164[--anInt2191] == 1;
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean227 = anIntArray164[--anInt2191] == 1;
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt2191 -= 2;
						local137.anInt2798 = anIntArray164[anInt2191];
						local137.anInt2744 = anIntArray164[anInt2191 + 1];
						Static468.method7221(local137);
						if (local137.anInt2823 == 0) {
							Static29.method991(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt2191 -= 2;
						local137.anInt2801 = (short) anIntArray164[anInt2191];
						local137.anInt2813 = (short) anIntArray164[anInt2191 + 1];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean222 = anIntArray164[--anInt2191] == 1;
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2800 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						if (local137.anInt2806 == -1) {
							Static25.method963(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray164[--anInt2191];
						local137.aBoolean232 = local19 == 1;
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt2191 -= 2;
						local137.anInt2757 = anIntArray164[anInt2191];
						local137.anInt2808 = anIntArray164[anInt2191 + 1];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2803 = anIntArray164[--anInt2191];
						Static468.method7221(local137);
						return;
					}
					@Pc(1454) Class99 local1454;
					if (arg0 == 1127) {
						anInt2191 -= 2;
						local19 = anIntArray164[anInt2191];
						local25 = anIntArray164[anInt2191 + 1];
						local1454 = Static499.aClass118_2.method3497(local19);
						if (local25 != local1454.anInt2851) {
							local137.method2495(local19, local25);
							return;
						}
						local137.method2504(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray164[--anInt2191];
						local1488 = aStringArray11[--anInt2189];
						local1454 = Static499.aClass118_2.method3497(local19);
						if (!local1454.aString35.equals(local1488)) {
							local137.method2496(local19, local1488);
							return;
						}
						local137.method2504(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static223.method4011(anIntArray164[--anInt2191]);
					} else {
						local137 = arg1 ? aClass93_4 : aClass93_5;
					}
					Static468.method7221(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt2191 -= 2;
						local19 = anIntArray164[anInt2191];
						local25 = anIntArray164[anInt2191 + 1];
						if (local137.anInt2806 == -1) {
							Static370.method5899(local137.anInt2790);
							Static25.method963(local137.anInt2790);
							Static245.method4270(local137.anInt2790);
						}
						if (local19 == -1) {
							local137.anInt2779 = 1;
							local137.anInt2805 = -1;
							local137.anInt2822 = -1;
							return;
						}
						local137.anInt2822 = local19;
						local137.anInt2739 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean224 = true;
						} else {
							local137.aBoolean224 = false;
						}
						@Pc(1630) Class145 local1630 = Static98.aClass203_1.method4899(local19);
						local137.anInt2758 = local1630.anInt4463;
						local137.anInt2783 = local1630.anInt4470;
						local137.anInt2816 = local1630.anInt4449;
						local137.anInt2814 = local1630.anInt4461;
						local137.anInt2754 = local1630.anInt4441;
						local137.anInt2800 = local1630.anInt4465;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2740 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2740 = 1;
						} else {
							local137.anInt2740 = 2;
						}
						if (local137.anInt2809 > 0) {
							local137.anInt2800 = local137.anInt2800 * 32 / local137.anInt2809;
							return;
						}
						if (local137.anInt2818 > 0) {
							local137.anInt2800 = local137.anInt2800 * 32 / local137.anInt2818;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2779 = 2;
						local137.anInt2805 = anIntArray164[--anInt2191];
						if (local137.anInt2806 == -1) {
							Static65.method1368(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2779 = 3;
						local137.anInt2805 = -1;
						if (local137.anInt2806 == -1) {
							Static65.method1368(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2779 = 6;
						local137.anInt2805 = anIntArray164[--anInt2191];
						if (local137.anInt2806 == -1) {
							Static65.method1368(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2779 = 5;
						local137.anInt2805 = anIntArray164[--anInt2191];
						if (local137.anInt2806 == -1) {
							Static65.method1368(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt2191 -= 4;
						local137.anInt2825 = anIntArray164[anInt2191];
						local137.anInt2745 = anIntArray164[anInt2191 + 1];
						local137.anInt2797 = anIntArray164[anInt2191 + 2];
						local137.anInt2743 = anIntArray164[anInt2191 + 3];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt2191 -= 2;
						local137.anInt2794 = anIntArray164[anInt2191];
						local137.anInt2828 = anIntArray164[anInt2191 + 1];
						Static468.method7221(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt2191 -= 4;
						local137.anInt2805 = anIntArray164[anInt2191];
						local137.anInt2773 = anIntArray164[anInt2191 + 1];
						if (anIntArray164[anInt2191 + 2] == 1) {
							local137.anInt2779 = 9;
						} else {
							local137.anInt2779 = 8;
						}
						if (anIntArray164[anInt2191 + 3] == 1) {
							local137.aBoolean224 = true;
						} else {
							local137.aBoolean224 = false;
						}
						if (local137.anInt2806 == -1) {
							Static65.method1368(local137.anInt2790);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2779 = 5;
						local137.anInt2805 = Static412.anInt7714;
						local137.anInt2773 = 0;
						if (local137.anInt2806 == -1) {
							Static65.method1368(local137.anInt2790);
						}
						return;
					}
				} else {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static223.method4011(anIntArray164[--anInt2191]);
						} else {
							local137 = arg1 ? aClass93_4 : aClass93_5;
						}
						if (arg0 == 1300) {
							local19 = anIntArray164[--anInt2191] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2503(aStringArray11[--anInt2189], local19);
								return;
							} else {
								anInt2189--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt2191 -= 2;
							local19 = anIntArray164[anInt2191];
							local25 = anIntArray164[anInt2191 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass93_8 = null;
								return;
							}
							local137.aClass93_8 = Static100.method2145(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray164[--anInt2191];
							if (local19 != Static549.anInt9382 && local19 != Static179.anInt3993 && local19 != Static526.anInt9120) {
								return;
							}
							local137.anInt2819 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2780 = anIntArray164[--anInt2191];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2826 = anIntArray164[--anInt2191];
							return;
						}
						if (arg0 == 1305) {
							local137.aString31 = aStringArray11[--anInt2189];
							return;
						}
						if (arg0 == 1306) {
							local137.aString32 = aStringArray11[--anInt2189];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray17 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2752 = anIntArray164[--anInt2191];
							local137.anInt2760 = anIntArray164[--anInt2191];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray164[--anInt2191];
							local25 = anIntArray164[--anInt2191];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2498(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString34 = aStringArray11[--anInt2189];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2742 = anIntArray164[--anInt2191];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt2191 -= 3;
								local19 = anIntArray164[anInt2191] - 1;
								local25 = anIntArray164[anInt2191 + 1];
								local353 = anIntArray164[anInt2191 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt2191 -= 2;
								local19 = 10;
								local25 = anIntArray164[anInt2191];
								local353 = anIntArray164[anInt2191 + 1];
							}
							if (local137.aByteArray44 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray44 = new byte[11];
								local137.aByteArray45 = new byte[11];
								local137.anIntArray219 = new int[11];
							}
							local137.aByteArray44[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean226 = false;
								for (local2290 = 0; local2290 < local137.aByteArray44.length; local2290++) {
									if (local137.aByteArray44[local2290] != 0) {
										local137.aBoolean226 = true;
										break;
									}
								}
							} else {
								local137.aBoolean226 = true;
							}
							local137.aByteArray45[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2788 = anIntArray164[--anInt2191];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static223.method4011(anIntArray164[--anInt2191]);
						} else {
							local137 = arg1 ? aClass93_4 : aClass93_5;
						}
						if (arg0 == 1499) {
							local137.method2499();
							return;
						}
						local1101 = aStringArray11[--anInt2189];
						@Pc(2376) int[] local2376 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray164[--anInt2191];
							if (local353 > 0) {
								local2376 = new int[local353];
								while (local353-- > 0) {
									local2376[local353] = anIntArray164[--anInt2191];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2428) Object[] local2428 = new Object[local1101.length() + 1];
						for (local2290 = local2428.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2428[local2290] = aStringArray11[--anInt2189];
							} else {
								local2428[local2290] = Integer.valueOf(anIntArray164[--anInt2191]);
							}
						}
						local56 = anIntArray164[--anInt2191];
						if (local56 == -1) {
							local2428 = null;
						} else {
							local2428[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray15 = local2428;
						} else if (arg0 == 1401) {
							local137.anObjectArray3 = local2428;
						} else if (arg0 == 1402) {
							local137.anObjectArray23 = local2428;
						} else if (arg0 == 1403) {
							local137.anObjectArray17 = local2428;
						} else if (arg0 == 1404) {
							local137.anObjectArray8 = local2428;
						} else if (arg0 == 1405) {
							local137.anObjectArray26 = local2428;
						} else if (arg0 == 1406) {
							local137.anObjectArray20 = local2428;
						} else if (arg0 == 1407) {
							local137.anObjectArray25 = local2428;
							local137.anIntArray218 = local2376;
						} else if (arg0 == 1408) {
							local137.anObjectArray14 = local2428;
						} else if (arg0 == 1409) {
							local137.anObjectArray5 = local2428;
						} else if (arg0 == 1410) {
							local137.anObjectArray11 = local2428;
						} else if (arg0 == 1411) {
							local137.anObjectArray6 = local2428;
						} else if (arg0 == 1412) {
							local137.anObjectArray12 = local2428;
						} else if (arg0 == 1414) {
							local137.anObjectArray29 = local2428;
							local137.anIntArray214 = local2376;
						} else if (arg0 == 1415) {
							local137.anObjectArray9 = local2428;
							local137.anIntArray217 = local2376;
						} else if (arg0 == 1416) {
							local137.anObjectArray24 = local2428;
						} else if (arg0 == 1417) {
							local137.anObjectArray33 = local2428;
						} else if (arg0 == 1418) {
							local137.anObjectArray13 = local2428;
						} else if (arg0 == 1419) {
							local137.anObjectArray4 = local2428;
						} else if (arg0 == 1420) {
							local137.anObjectArray7 = local2428;
						} else if (arg0 == 1421) {
							local137.anObjectArray16 = local2428;
						} else if (arg0 == 1422) {
							local137.anObjectArray28 = local2428;
						} else if (arg0 == 1423) {
							local137.anObjectArray21 = local2428;
						} else if (arg0 == 1424) {
							local137.anObjectArray32 = local2428;
						} else if (arg0 == 1425) {
							local137.anObjectArray19 = local2428;
						} else if (arg0 == 1426) {
							local137.anObjectArray10 = local2428;
						} else if (arg0 == 1427) {
							local137.anObjectArray27 = local2428;
						} else if (arg0 == 1428) {
							local137.anObjectArray22 = local2428;
							local137.anIntArray211 = local2376;
						} else if (arg0 == 1429) {
							local137.anObjectArray30 = local2428;
							local137.anIntArray213 = local2376;
						} else if (arg0 == 1430) {
							local137.anObjectArray31 = local2428;
						}
						local137.aBoolean229 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass93_4 : aClass93_5;
						if (arg0 == 1500) {
							anIntArray164[anInt2191++] = local137.anInt2753;
							return;
						}
						if (arg0 == 1501) {
							anIntArray164[anInt2191++] = local137.anInt2750;
							return;
						}
						if (arg0 == 1502) {
							anIntArray164[anInt2191++] = local137.anInt2777;
							return;
						}
						if (arg0 == 1503) {
							anIntArray164[anInt2191++] = local137.anInt2738;
							return;
						}
						if (arg0 == 1504) {
							anIntArray164[anInt2191++] = local137.aBoolean234 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray164[anInt2191++] = local137.anInt2820;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static145.method2679(local137);
							anIntArray164[anInt2191++] = local158 == null ? -1 : local158.anInt2790;
							return;
						}
					} else {
						@Pc(3024) Class99 local3024;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass93_4 : aClass93_5;
							if (arg0 == 1600) {
								anIntArray164[anInt2191++] = local137.anInt2761;
								return;
							}
							if (arg0 == 1601) {
								anIntArray164[anInt2191++] = local137.anInt2789;
								return;
							}
							if (arg0 == 1602) {
								aStringArray11[anInt2189++] = local137.aString33;
								return;
							}
							if (arg0 == 1603) {
								anIntArray164[anInt2191++] = local137.anInt2798;
								return;
							}
							if (arg0 == 1604) {
								anIntArray164[anInt2191++] = local137.anInt2744;
								return;
							}
							if (arg0 == 1605) {
								anIntArray164[anInt2191++] = local137.anInt2800;
								return;
							}
							if (arg0 == 1606) {
								anIntArray164[anInt2191++] = local137.anInt2758;
								return;
							}
							if (arg0 == 1607) {
								anIntArray164[anInt2191++] = local137.anInt2816;
								return;
							}
							if (arg0 == 1608) {
								anIntArray164[anInt2191++] = local137.anInt2783;
								return;
							}
							if (arg0 == 1609) {
								anIntArray164[anInt2191++] = local137.anInt2755;
								return;
							}
							if (arg0 == 1610) {
								anIntArray164[anInt2191++] = local137.anInt2814;
								return;
							}
							if (arg0 == 1611) {
								anIntArray164[anInt2191++] = local137.anInt2754;
								return;
							}
							if (arg0 == 1612) {
								anIntArray164[anInt2191++] = local137.anInt2765;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray164[--anInt2191];
								local3024 = Static499.aClass118_2.method3497(local19);
								if (local3024.method2523()) {
									aStringArray11[anInt2189++] = local137.method2487(local3024.aString35, local19);
									return;
								}
								anIntArray164[anInt2191++] = local137.method2500(local19, local3024.anInt2851);
								return;
							}
							if (arg0 == 1614) {
								anIntArray164[anInt2191++] = local137.anInt2771;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass93_4 : aClass93_5;
							if (arg0 == 1700) {
								anIntArray164[anInt2191++] = local137.anInt2822;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt2822 != -1) {
									anIntArray164[anInt2191++] = local137.anInt2739;
									return;
								}
								anIntArray164[anInt2191++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray164[anInt2191++] = local137.anInt2806;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass93_4 : aClass93_5;
							if (arg0 == 1800) {
								anIntArray164[anInt2191++] = Static69.method1454(local137).method7359();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray164[--anInt2191];
								local19--;
								if (local137.aStringArray17 != null && local19 < local137.aStringArray17.length && local137.aStringArray17[local19] != null) {
									aStringArray11[anInt2189++] = local137.aStringArray17[local19];
									return;
								}
								aStringArray11[anInt2189++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString31 == null) {
									aStringArray11[anInt2189++] = "";
									return;
								}
								aStringArray11[anInt2189++] = local137.aString31;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static223.method4011(anIntArray164[--anInt2191]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass93_4 : aClass93_5;
							}
							if (anInt2197 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray27 == null) {
									return;
								}
								@Pc(3274) Class6_Sub38 local3274 = new Class6_Sub38();
								local3274.aClass93_14 = local137;
								local3274.anObjectArray36 = local137.anObjectArray27;
								local3274.anInt7662 = anInt2197 + 1;
								Static226.aClass211_30.method5173(local3274);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static223.method4011(anIntArray164[--anInt2191]);
							if (arg0 == 2500) {
								anIntArray164[anInt2191++] = local137.anInt2753;
								return;
							}
							if (arg0 == 2501) {
								anIntArray164[anInt2191++] = local137.anInt2750;
								return;
							}
							if (arg0 == 2502) {
								anIntArray164[anInt2191++] = local137.anInt2777;
								return;
							}
							if (arg0 == 2503) {
								anIntArray164[anInt2191++] = local137.anInt2738;
								return;
							}
							if (arg0 == 2504) {
								anIntArray164[anInt2191++] = local137.aBoolean234 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray164[anInt2191++] = local137.anInt2820;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static145.method2679(local137);
								anIntArray164[anInt2191++] = local158 == null ? -1 : local158.anInt2790;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static223.method4011(anIntArray164[--anInt2191]);
							if (arg0 == 2600) {
								anIntArray164[anInt2191++] = local137.anInt2761;
								return;
							}
							if (arg0 == 2601) {
								anIntArray164[anInt2191++] = local137.anInt2789;
								return;
							}
							if (arg0 == 2602) {
								aStringArray11[anInt2189++] = local137.aString33;
								return;
							}
							if (arg0 == 2603) {
								anIntArray164[anInt2191++] = local137.anInt2798;
								return;
							}
							if (arg0 == 2604) {
								anIntArray164[anInt2191++] = local137.anInt2744;
								return;
							}
							if (arg0 == 2605) {
								anIntArray164[anInt2191++] = local137.anInt2800;
								return;
							}
							if (arg0 == 2606) {
								anIntArray164[anInt2191++] = local137.anInt2758;
								return;
							}
							if (arg0 == 2607) {
								anIntArray164[anInt2191++] = local137.anInt2816;
								return;
							}
							if (arg0 == 2608) {
								anIntArray164[anInt2191++] = local137.anInt2783;
								return;
							}
							if (arg0 == 2609) {
								anIntArray164[anInt2191++] = local137.anInt2755;
								return;
							}
							if (arg0 == 2610) {
								anIntArray164[anInt2191++] = local137.anInt2814;
								return;
							}
							if (arg0 == 2611) {
								anIntArray164[anInt2191++] = local137.anInt2754;
								return;
							}
							if (arg0 == 2612) {
								anIntArray164[anInt2191++] = local137.anInt2765;
								return;
							}
							if (arg0 == 2613) {
								anIntArray164[anInt2191++] = local137.anInt2771;
								return;
							}
						} else {
							@Pc(3682) Class6_Sub48 local3682;
							@Pc(3784) Class6_Sub48 local3784;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static223.method4011(anIntArray164[--anInt2191]);
									anIntArray164[anInt2191++] = local137.anInt2822;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static223.method4011(anIntArray164[--anInt2191]);
									if (local137.anInt2822 != -1) {
										anIntArray164[anInt2191++] = local137.anInt2739;
										return;
									}
									anIntArray164[anInt2191++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray164[--anInt2191];
									local3682 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local13);
									if (local3682 != null) {
										anIntArray164[anInt2191++] = 1;
										return;
									}
									anIntArray164[anInt2191++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static223.method4011(anIntArray164[--anInt2191]);
									if (local137.aClass93Array4 == null) {
										anIntArray164[anInt2191++] = 0;
										return;
									}
									local19 = local137.aClass93Array4.length;
									for (local25 = 0; local25 < local137.aClass93Array4.length; local25++) {
										if (local137.aClass93Array4[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray164[anInt2191++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt2191 -= 2;
									local13 = anIntArray164[anInt2191];
									local19 = anIntArray164[anInt2191 + 1];
									local3784 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local13);
									if (local3784 != null && local3784.anInt9207 == local19) {
										anIntArray164[anInt2191++] = 1;
										return;
									}
									anIntArray164[anInt2191++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static223.method4011(anIntArray164[--anInt2191]);
								if (arg0 == 2800) {
									anIntArray164[anInt2191++] = Static69.method1454(local137).method7359();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray164[--anInt2191];
									@Pc(3848) int local3848 = local19 - 1;
									if (local137.aStringArray17 != null && local3848 < local137.aStringArray17.length && local137.aStringArray17[local3848] != null) {
										aStringArray11[anInt2189++] = local137.aStringArray17[local3848];
										return;
									}
									aStringArray11[anInt2189++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString31 == null) {
										aStringArray11[anInt2189++] = "";
										return;
									}
									aStringArray11[anInt2189++] = local137.aString31;
									return;
								}
							} else {
								@Pc(3921) String local3921;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3921 = aStringArray11[--anInt2189];
										Static180.method3570(local3921);
										return;
									}
									if (arg0 == 3101) {
										anInt2191 -= 2;
										Static181.method1439(anIntArray164[anInt2191], Static350.aClass11_Sub1_Sub1_Sub2_4, anIntArray164[anInt2191 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static377.method7562();
										return;
									}
									if (arg0 == 3104) {
										local3921 = aStringArray11[--anInt2189];
										local19 = 0;
										if (Static251.method4415(local3921)) {
											local19 = Static228.method4072(local3921);
										}
										Static298.method4854(Static386.aClass181_82);
										Static547.aClass6_Sub26_Sub2_2.method4979(local19);
										return;
									}
									if (arg0 == 3105) {
										local3921 = aStringArray11[--anInt2189];
										Static298.method4854(Static455.aClass181_95);
										Static547.aClass6_Sub26_Sub2_2.method4950(local3921.length() + 1, -81849);
										Static547.aClass6_Sub26_Sub2_2.method4998(local3921);
										return;
									}
									if (arg0 == 3106) {
										local3921 = aStringArray11[--anInt2189];
										Static298.method4854(Static332.aClass181_69);
										Static547.aClass6_Sub26_Sub2_2.method4950(local3921.length() + 1, -81849);
										Static547.aClass6_Sub26_Sub2_2.method4998(local3921);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray164[--anInt2191];
										local1101 = aStringArray11[--anInt2189];
										Static515.method7175(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt2191 -= 3;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local25 = anIntArray164[anInt2191 + 2];
										local35 = Static223.method4011(local25);
										Static8.method606(local13, local19, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local210 = arg1 ? aClass93_4 : aClass93_5;
										Static8.method606(local13, local19, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray164[--anInt2191];
										Static298.method4854(Static580.aClass181_116);
										Static547.aClass6_Sub26_Sub2_2.method4962(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local3784 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local13);
										if (local3784 != null) {
											Static551.method7862(local3784.anInt9207 != local19, true, local3784);
										}
										Static567.method6404(3, true, local19, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt2191--;
										local13 = anIntArray164[anInt2191];
										local3682 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local13);
										if (local3682 != null && local3682.anInt9210 == 3) {
											Static551.method7862(true, true, local3682);
										}
										return;
									}
									if (arg0 == 3113) {
										Static395.method6254(aStringArray11[--anInt2189]);
										return;
									}
									if (arg0 == 3114) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local1488 = aStringArray11[--anInt2189];
										Static277.method4595("", local13, "", "", local19, local1488);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt2191 -= 3;
										Static445.method6828(anIntArray164[anInt2191 + 1], anIntArray164[anInt2191], 255, anIntArray164[anInt2191 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static496.method7444(255, 50, anIntArray164[--anInt2191]);
										return;
									}
									if (arg0 == 3202) {
										anInt2191 -= 2;
										Static204.method3800(anIntArray164[anInt2191], 255, anIntArray164[anInt2191 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt2191 -= 4;
										Static445.method6828(anIntArray164[anInt2191 + 1], anIntArray164[anInt2191], anIntArray164[anInt2191 + 3], anIntArray164[anInt2191 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt2191 -= 3;
										Static496.method7444(anIntArray164[anInt2191 + 1], anIntArray164[anInt2191 + 2], anIntArray164[anInt2191]);
										return;
									}
									if (arg0 == 3205) {
										anInt2191 -= 3;
										Static204.method3800(anIntArray164[anInt2191], anIntArray164[anInt2191 + 2], anIntArray164[anInt2191 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt2191 -= 4;
										Static96.method2072(anIntArray164[anInt2191 + 1], anIntArray164[anInt2191 + 2], anIntArray164[anInt2191 + 3], false, anIntArray164[anInt2191]);
										return;
									}
									if (arg0 == 3207) {
										anInt2191 -= 4;
										Static96.method2072(anIntArray164[anInt2191 + 1], anIntArray164[anInt2191 + 2], anIntArray164[anInt2191 + 3], true, anIntArray164[anInt2191]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray164[anInt2191++] = Static508.anInt8998;
										return;
									}
									if (arg0 == 3301) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = Static471.method7254(local13, local19, false);
										return;
									}
									if (arg0 == 3302) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = Static306.method4925(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = Static435.method6646(local13, local19, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static409.aClass36_1.method1096(local13).anInt2211;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static499.anIntArray785[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static566.anIntArray824[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static313.anIntArray767[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4669) byte local4669 = Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77;
										local19 = (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 9) + Static191.anInt4147;
										local25 = (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 9) + Static247.anInt5049;
										anIntArray164[anInt2191++] = (local4669 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray164[anInt2191++] = Static156.aBoolean272 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = Static471.method7254(local13, local19, true);
										return;
									}
									if (arg0 == 3314) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = Static306.method4925(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = Static435.method6646(local13, local19, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static456.anInt8437 >= 2) {
											anIntArray164[anInt2191++] = Static456.anInt8437;
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray164[anInt2191++] = Static291.anInt5565;
										return;
									}
									if (arg0 == 3318) {
										anIntArray164[anInt2191++] = Static293.aClass275_2.anInt7968;
										return;
									}
									if (arg0 == 3321) {
										anIntArray164[anInt2191++] = Static180.anInt4052;
										return;
									}
									if (arg0 == 3322) {
										anIntArray164[anInt2191++] = Static127.anInt2741;
										return;
									}
									if (arg0 == 3323) {
										if (Static405.anInt7594 >= 5 && Static405.anInt7594 <= 9) {
											anIntArray164[anInt2191++] = 1;
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static405.anInt7594 >= 5 && Static405.anInt7594 <= 9) {
											anIntArray164[anInt2191++] = Static405.anInt7594;
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray164[anInt2191++] = Static175.aBoolean325 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray164[anInt2191++] = Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453;
										return;
									}
									if (arg0 == 3327) {
										anIntArray164[anInt2191++] = Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1.aBoolean199 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray164[anInt2191++] = Static245.aBoolean376 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static205.method3804(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = Static446.method5087(false, local19, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = Static446.method5087(true, local19, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray164[anInt2191++] = Static518.anInt9045;
										return;
									}
									if (arg0 == 3335) {
										anIntArray164[anInt2191++] = Static286.anInt5468;
										return;
									}
									if (arg0 == 3336) {
										anInt2191 -= 4;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local25 = anIntArray164[anInt2191 + 2];
										local353 = anIntArray164[anInt2191 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray164[anInt2191++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray164[anInt2191++] = Static294.anInt5607;
										return;
									}
									if (arg0 == 3338) {
										anIntArray164[anInt2191++] = Static323.method5222();
										return;
									}
									if (arg0 == 3339) {
										anIntArray164[anInt2191++] = Static494.aBoolean671 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray164[anInt2191++] = Static510.aBoolean503 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray164[anInt2191++] = Static95.aBoolean204 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray164[anInt2191++] = Static401.aClass4_1.method1216();
										return;
									}
									if (arg0 == 3343) {
										anIntArray164[anInt2191++] = Static401.aClass4_1.method1215();
										return;
									}
									if (arg0 == 3344) {
										aStringArray11[anInt2189++] = Static121.method2388();
										return;
									}
									if (arg0 == 3345) {
										aStringArray11[anInt2189++] = Static501.method4268();
										return;
									}
									if (arg0 == 3346) {
										anIntArray164[anInt2191++] = Static324.method5239();
										return;
									}
									if (arg0 == 3347) {
										anIntArray164[anInt2191++] = Static367.anInt6941;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5404) Class252 local5404;
									if (arg0 == 3400) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local5404 = Static550.aClass94_1.method2506(local13);
										aStringArray11[anInt2189++] = local5404.method6269(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt2191 -= 4;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local25 = anIntArray164[anInt2191 + 2];
										local353 = anIntArray164[anInt2191 + 3];
										@Pc(5450) Class252 local5450 = Static550.aClass94_1.method2506(local25);
										if (local5450.aChar3 == local13 && local5450.aChar2 == local19) {
											if (local19 == 115) {
												aStringArray11[anInt2189++] = local5450.method6269(local353);
												return;
											}
											anIntArray164[anInt2191++] = local5450.method6272(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt2191 -= 3;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local25 = anIntArray164[anInt2191 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5526) Class252 local5526 = Static550.aClass94_1.method2506(local19);
										if (local5526.aChar2 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray164[anInt2191++] = local5526.method6278(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray164[--anInt2191];
										local1101 = aStringArray11[--anInt2189];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5404 = Static550.aClass94_1.method2506(local13);
										if (local5404.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray164[anInt2191++] = local5404.method6273(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray164[--anInt2191];
										@Pc(5624) Class252 local5624 = Static550.aClass94_1.method2506(local13);
										anIntArray164[anInt2191++] = local5624.aClass305_33.method7443();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static435.anInt7934 == 0) {
											anIntArray164[anInt2191++] = -2;
											return;
										}
										if (Static435.anInt7934 == 1) {
											anIntArray164[anInt2191++] = -1;
											return;
										}
										anIntArray164[anInt2191++] = Static241.anInt4921;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray164[--anInt2191];
										if (Static435.anInt7934 == 2 && local13 < Static241.anInt4921) {
											aStringArray11[anInt2189++] = Static381.aStringArray42[local13];
											if (Static87.aStringArray9[local13] != null) {
												aStringArray11[anInt2189++] = Static87.aStringArray9[local13];
												return;
											}
											aStringArray11[anInt2189++] = "";
											return;
										}
										aStringArray11[anInt2189++] = "";
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray164[--anInt2191];
										if (Static435.anInt7934 == 2 && local13 < Static241.anInt4921) {
											anIntArray164[anInt2191++] = Static331.anIntArray846[local13];
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray164[--anInt2191];
										if (Static435.anInt7934 == 2 && local13 < Static241.anInt4921) {
											anIntArray164[anInt2191++] = Static578.anIntArray844[local13];
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3921 = aStringArray11[--anInt2189];
										local19 = anIntArray164[--anInt2191];
										Static149.method5592(local3921, local19);
										return;
									}
									if (arg0 == 3605) {
										local3921 = aStringArray11[--anInt2189];
										Static270.method4562(local3921);
										return;
									}
									if (arg0 == 3606) {
										local3921 = aStringArray11[--anInt2189];
										Static91.method2013(local3921);
										return;
									}
									if (arg0 == 3607) {
										local3921 = aStringArray11[--anInt2189];
										Static123.method2421(false, local3921);
										return;
									}
									if (arg0 == 3608) {
										local3921 = aStringArray11[--anInt2189];
										Static327.method5259(local3921);
										return;
									}
									if (arg0 == 3609) {
										local3921 = aStringArray11[--anInt2189];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray164[anInt2191++] = Static504.method7515(local3921) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray164[--anInt2191];
										if (Static435.anInt7934 == 2 && local13 < Static241.anInt4921) {
											aStringArray11[anInt2189++] = Static208.aStringArray25[local13];
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static569.aString114 != null) {
											aStringArray11[anInt2189++] = Static431.method6594(Static569.aString114);
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static569.aString114 != null) {
											anIntArray164[anInt2191++] = Static523.anInt9087;
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray164[--anInt2191];
										if (Static569.aString114 != null && local13 < Static523.anInt9087) {
											aStringArray11[anInt2189++] = Static211.aClass241Array4[local13].aString84;
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray164[--anInt2191];
										if (Static569.aString114 != null && local13 < Static523.anInt9087) {
											anIntArray164[anInt2191++] = Static211.aClass241Array4[local13].anInt7110;
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray164[--anInt2191];
										if (Static569.aString114 != null && local13 < Static523.anInt9087) {
											anIntArray164[anInt2191++] = Static211.aClass241Array4[local13].aByte76;
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray164[anInt2191++] = Static576.aByte108;
										return;
									}
									if (arg0 == 3617) {
										local3921 = aStringArray11[--anInt2189];
										Static214.method3937(local3921);
										return;
									}
									if (arg0 == 3618) {
										anIntArray164[anInt2191++] = Static177.aByte40;
										return;
									}
									if (arg0 == 3619) {
										local3921 = aStringArray11[--anInt2189];
										Static77.method1704(local3921);
										return;
									}
									if (arg0 == 3620) {
										Static401.method6297();
										return;
									}
									if (arg0 == 3621) {
										if (Static435.anInt7934 == 0) {
											anIntArray164[anInt2191++] = -1;
											return;
										}
										anIntArray164[anInt2191++] = Static104.anInt7872;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray164[--anInt2191];
										if (Static435.anInt7934 != 0 && local13 < Static104.anInt7872) {
											aStringArray11[anInt2189++] = Static60.aStringArray7[local13];
											if (Static437.aStringArray46[local13] != null) {
												aStringArray11[anInt2189++] = Static437.aStringArray46[local13];
												return;
											}
											aStringArray11[anInt2189++] = "";
											return;
										}
										aStringArray11[anInt2189++] = "";
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3921 = aStringArray11[--anInt2189];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray164[anInt2191++] = Static178.method3528(local3921) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray164[--anInt2191];
										if (Static211.aClass241Array4 != null && local13 < Static523.anInt9087 && Static211.aClass241Array4[local13].aString85.equalsIgnoreCase(Static350.aClass11_Sub1_Sub1_Sub2_4.aString95)) {
											anIntArray164[anInt2191++] = 1;
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static309.aString68 != null) {
											aStringArray11[anInt2189++] = Static309.aString68;
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray164[--anInt2191];
										if (Static569.aString114 != null && local13 < Static523.anInt9087) {
											aStringArray11[anInt2189++] = Static211.aClass241Array4[local13].aString82;
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray164[--anInt2191];
										if (Static435.anInt7934 == 2 && local13 >= 0 && local13 < Static241.anInt4921) {
											anIntArray164[anInt2191++] = Static199.aBooleanArray13[local13] ? 1 : 0;
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3921 = aStringArray11[--anInt2189];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray164[anInt2191++] = Static410.method6401(local3921);
										return;
									}
									if (arg0 == 3629) {
										anIntArray164[anInt2191++] = Static264.anInt6184;
										return;
									}
									if (arg0 == 3630) {
										local3921 = aStringArray11[--anInt2189];
										Static123.method2421(true, local3921);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static354.aBooleanArray24[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray164[--anInt2191];
										if (Static569.aString114 != null && local13 < Static523.anInt9087) {
											aStringArray11[anInt2189++] = Static211.aClass241Array4[local13].aString85;
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray164[--anInt2191];
										if (Static435.anInt7934 != 0 && local13 < Static104.anInt7872) {
											aStringArray11[anInt2189++] = Static548.aStringArray49[local13];
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static572.aClass48Array1[local13].method1319();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static572.aClass48Array1[local13].anInt1488;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static572.aClass48Array1[local13].anInt1489;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static572.aClass48Array1[local13].anInt1487;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static572.aClass48Array1[local13].anInt1486;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static572.aClass48Array1[local13].anInt1485;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray164[--anInt2191];
										local19 = Static572.aClass48Array1[local13].method1323();
										anIntArray164[anInt2191++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray164[--anInt2191];
										local19 = Static572.aClass48Array1[local13].method1323();
										anIntArray164[anInt2191++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray164[--anInt2191];
										local19 = Static572.aClass48Array1[local13].method1323();
										anIntArray164[anInt2191++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray164[--anInt2191];
										local19 = Static572.aClass48Array1[local13].method1323();
										anIntArray164[anInt2191++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt2191 -= 5;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local25 = anIntArray164[anInt2191 + 2];
										local353 = anIntArray164[anInt2191 + 3];
										local2290 = anIntArray164[anInt2191 + 4];
										anIntArray164[anInt2191++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7134) long local7134;
									@Pc(7127) long local7127;
									if (arg0 == 4007) {
										anInt2191 -= 2;
										local7127 = anIntArray164[anInt2191];
										local7134 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = (int) (local7127 + local7127 * local7134 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										if (local13 == 0) {
											anIntArray164[anInt2191++] = 0;
											return;
										}
										anIntArray164[anInt2191++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										if (local13 == 0) {
											anIntArray164[anInt2191++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray164[anInt2191++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray164[anInt2191++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt2191 -= 3;
										local7127 = anIntArray164[anInt2191];
										local7134 = anIntArray164[anInt2191 + 1];
										@Pc(7515) long local7515 = (long) anIntArray164[anInt2191 + 2];
										anIntArray164[anInt2191++] = (int) (local7127 * local7515 / local7134);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3921 = aStringArray11[--anInt2189];
										local19 = anIntArray164[--anInt2191];
										aStringArray11[anInt2189++] = local3921 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt2189 -= 2;
										local3921 = aStringArray11[anInt2189];
										local1101 = aStringArray11[anInt2189 + 1];
										aStringArray11[anInt2189++] = local3921 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3921 = aStringArray11[--anInt2189];
										local19 = anIntArray164[--anInt2191];
										aStringArray11[anInt2189++] = local3921 + Static462.method7143(local19);
										return;
									}
									if (arg0 == 4103) {
										local3921 = aStringArray11[--anInt2189];
										aStringArray11[anInt2189++] = local3921.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray11[anInt2189++] = method1985(anIntArray164[--anInt2191]);
										return;
									}
									if (arg0 == 4105) {
										anInt2189 -= 2;
										local3921 = aStringArray11[anInt2189];
										local1101 = aStringArray11[anInt2189 + 1];
										if (Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1 != null && Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1.aBoolean199) {
											aStringArray11[anInt2189++] = local1101;
											return;
										}
										aStringArray11[anInt2189++] = local3921;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray164[--anInt2191];
										aStringArray11[anInt2189++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt2189 -= 2;
										anIntArray164[anInt2191++] = Static85.method1891(aStringArray11[anInt2189], aStringArray11[anInt2189 + 1], Static286.anInt5468);
										return;
									}
									@Pc(7798) Class82 local7798;
									if (arg0 == 4108) {
										local3921 = aStringArray11[--anInt2189];
										anInt2191 -= 2;
										local19 = anIntArray164[anInt2191];
										local25 = anIntArray164[anInt2191 + 1];
										local7798 = Static436.method6660(Static29.aClass168_15, local25);
										anIntArray164[anInt2191++] = local7798.method2288(Static569.aClass66Array15, local19, local3921);
										return;
									}
									if (arg0 == 4109) {
										local3921 = aStringArray11[--anInt2189];
										anInt2191 -= 2;
										local19 = anIntArray164[anInt2191];
										local25 = anIntArray164[anInt2191 + 1];
										local7798 = Static436.method6660(Static29.aClass168_15, local25);
										anIntArray164[anInt2191++] = local7798.method2287(local3921, local19, Static569.aClass66Array15);
										return;
									}
									if (arg0 == 4110) {
										anInt2189 -= 2;
										local3921 = aStringArray11[anInt2189];
										local1101 = aStringArray11[anInt2189 + 1];
										if (anIntArray164[--anInt2191] == 1) {
											aStringArray11[anInt2189++] = local3921;
											return;
										}
										aStringArray11[anInt2189++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3921 = aStringArray11[--anInt2189];
										aStringArray11[anInt2189++] = Static177.method3519(local3921);
										return;
									}
									if (arg0 == 4112) {
										local3921 = aStringArray11[--anInt2189];
										local19 = anIntArray164[--anInt2191];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray11[anInt2189++] = local3921 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static372.method8112((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static21.method862((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static537.method7762((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static547.method7828((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3921 = aStringArray11[--anInt2189];
										if (local3921 != null) {
											anIntArray164[anInt2191++] = local3921.length();
											return;
										}
										anIntArray164[anInt2191++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3921 = aStringArray11[--anInt2189];
										anInt2191 -= 2;
										local19 = anIntArray164[anInt2191];
										local25 = anIntArray164[anInt2191 + 1];
										aStringArray11[anInt2189++] = local3921.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3921 = aStringArray11[--anInt2189];
										@Pc(8161) StringBuffer local8161 = new StringBuffer(local3921.length());
										@Pc(8163) boolean local8163 = false;
										for (local353 = 0; local353 < local3921.length(); local353++) {
											@Pc(8170) char local8170 = local3921.charAt(local353);
											if (local8170 == '<') {
												local8163 = true;
											} else if (local8170 == '>') {
												local8163 = false;
											} else if (!local8163) {
												local8161.append(local8170);
											}
										}
										aStringArray11[anInt2189++] = local8161.toString();
										return;
									}
									if (arg0 == 4120) {
										local3921 = aStringArray11[--anInt2189];
										anInt2191 -= 2;
										local19 = anIntArray164[anInt2191];
										local25 = anIntArray164[anInt2191 + 1];
										anIntArray164[anInt2191++] = local3921.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt2189 -= 2;
										local3921 = aStringArray11[anInt2189];
										local1101 = aStringArray11[anInt2189 + 1];
										local25 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = local3921.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray164[--anInt2191] != 0;
										local19 = anIntArray164[--anInt2191];
										aStringArray11[anInt2189++] = Static282.method4622((long) local19, Static286.anInt5468, 0, local412);
										return;
									}
									if (arg0 == 4125) {
										local3921 = aStringArray11[--anInt2189];
										local19 = anIntArray164[--anInt2191];
										@Pc(8384) Class82 local8384 = Static436.method6660(Static29.aClass168_15, local19);
										anIntArray164[anInt2191++] = local8384.method2294(local3921, Static569.aClass66Array15);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray164[--anInt2191];
										aStringArray11[anInt2189++] = Static98.aClass203_1.method4899(local13).aString52;
										return;
									}
									@Pc(8446) Class145 local8446;
									if (arg0 == 4201) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local8446 = Static98.aClass203_1.method4899(local13);
										if (local19 >= 1 && local19 <= 5 && local8446.aStringArray27[local19 - 1] != null) {
											aStringArray11[anInt2189++] = local8446.aStringArray27[local19 - 1];
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local8446 = Static98.aClass203_1.method4899(local13);
										if (local19 >= 1 && local19 <= 5 && local8446.aStringArray26[local19 - 1] != null) {
											aStringArray11[anInt2189++] = local8446.aStringArray26[local19 - 1];
											return;
										}
										aStringArray11[anInt2189++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static98.aClass203_1.method4899(local13).anInt4467;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static98.aClass203_1.method4899(local13).anInt4481 == 1 ? 1 : 0;
										return;
									}
									@Pc(8609) Class145 local8609;
									if (arg0 == 4205) {
										local13 = anIntArray164[--anInt2191];
										local8609 = Static98.aClass203_1.method4899(local13);
										if (local8609.anInt4451 == -1 && local8609.anInt4455 >= 0) {
											anIntArray164[anInt2191++] = local8609.anInt4455;
											return;
										}
										anIntArray164[anInt2191++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray164[--anInt2191];
										local8609 = Static98.aClass203_1.method4899(local13);
										if (local8609.anInt4451 >= 0 && local8609.anInt4455 >= 0) {
											anIntArray164[anInt2191++] = local8609.anInt4455;
											return;
										}
										anIntArray164[anInt2191++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray164[--anInt2191];
										anIntArray164[anInt2191++] = Static98.aClass203_1.method4899(local13).aBoolean360 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local3024 = Static499.aClass118_2.method3497(local19);
										if (local3024.method2523()) {
											aStringArray11[anInt2189++] = Static98.aClass203_1.method4899(local13).method3843(local3024.aString35, local19);
											return;
										}
										anIntArray164[anInt2191++] = Static98.aClass203_1.method4899(local13).method3852(local3024.anInt2851, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1] - 1;
										local8446 = Static98.aClass203_1.method4899(local13);
										if (local8446.anInt4474 == local19) {
											anIntArray164[anInt2191++] = local8446.anInt4454;
											return;
										}
										if (local8446.anInt4475 == local19) {
											anIntArray164[anInt2191++] = local8446.anInt4426;
											return;
										}
										anIntArray164[anInt2191++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3921 = aStringArray11[--anInt2189];
										local19 = anIntArray164[--anInt2191];
										Static221.method3997(local19 == 1, local3921);
										anIntArray164[anInt2191++] = Static503.anInt8951;
										return;
									}
									if (arg0 == 4211) {
										if (Static127.aShortArray31 != null && Static267.anInt5287 < Static503.anInt8951) {
											anIntArray164[anInt2191++] = Static127.aShortArray31[Static267.anInt5287++] & 0xFFFF;
											return;
										}
										anIntArray164[anInt2191++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static267.anInt5287 = 0;
										return;
									}
									if (arg0 == 4214) {
										local3921 = aStringArray11[--anInt2189];
										anInt2191 -= 3;
										local19 = anIntArray164[anInt2191];
										local25 = anIntArray164[anInt2191 + 1];
										local353 = anIntArray164[anInt2191 + 2];
										Static118.method2354(local353, local25, local19 == 1, local3921);
										anIntArray164[anInt2191++] = Static503.anInt8951;
										return;
									}
									if (arg0 == 4215) {
										anInt2189 -= 2;
										anInt2191 -= 2;
										local3921 = aStringArray11[anInt2189];
										local19 = anIntArray164[anInt2191];
										local25 = anIntArray164[anInt2191 + 1];
										@Pc(8984) String local8984 = aStringArray11[anInt2189 + 1];
										Static226.method4056(local25, local3921, local8984, local19 == 1);
										anIntArray164[anInt2191++] = Static503.anInt8951;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local3024 = Static499.aClass118_2.method3497(local19);
										if (local3024.method2523()) {
											aStringArray11[anInt2189++] = Static504.aClass343_2.method7994(local13).method5327(local19, local3024.aString35);
											return;
										}
										anIntArray164[anInt2191++] = Static504.aClass343_2.method7994(local13).method5323(local19, local3024.anInt2851);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local3024 = Static499.aClass118_2.method3497(local19);
										if (local3024.method2523()) {
											aStringArray11[anInt2189++] = Static480.aClass57_11.method1469(local13).method1026(local3024.aString35, local19);
											return;
										}
										anIntArray164[anInt2191++] = Static480.aClass57_11.method1469(local13).method1025(local19, local3024.anInt2851);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt2191 -= 2;
										local13 = anIntArray164[anInt2191];
										local19 = anIntArray164[anInt2191 + 1];
										local3024 = Static499.aClass118_2.method3497(local19);
										if (local3024.method2523()) {
											aStringArray11[anInt2189++] = Static370.aClass17_1.method655(local13).method2429(local19, local3024.aString35);
											return;
										}
										anIntArray164[anInt2191++] = Static370.aClass17_1.method655(local13).method2425(local3024.anInt2851, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray164[--anInt2191];
									@Pc(9212) Class169 local9212 = Static416.aClass250_1.method6264(local13);
									if (local9212.anIntArray329 != null && local9212.anIntArray329.length > 0) {
										local25 = 0;
										local353 = local9212.anIntArray327[0];
										for (local2290 = 1; local2290 < local9212.anIntArray329.length; local2290++) {
											if (local9212.anIntArray327[local2290] > local353) {
												local25 = local2290;
												local353 = local9212.anIntArray327[local2290];
											}
										}
										anIntArray164[anInt2191++] = local9212.anIntArray329[local25];
										return;
									}
									anIntArray164[anInt2191++] = local9212.anInt5182;
									return;
								}
							}
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
	public static void method1987() {
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	private static void method1988(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = Static223.method4011(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class93[] local13 = Static279.aClass93ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class93[] local19 = Static336.aClass93ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static279.aClass93ArrayArray1[local9] = new Class93[local22];
			Static589.method5380(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static589.method5380(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!bca;II)V")
	public static void method1989(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub4_Sub10 local5 = Static6.method505(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray165 = new int[local5.anInt6727];
		aStringArray12 = new String[local5.anInt6729];
		if (local5.aClass26_6 == Static513.aClass26_9 || local5.aClass26_6 == Static306.aClass26_4 || local5.aClass26_6 == Static54.aClass26_1) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static141.aClass93_9 != null) {
				local30 = Static141.aClass93_9.anInt2753;
				local32 = Static141.aClass93_9.anInt2750;
			}
			anIntArray165[0] = Static401.aClass4_1.method1216() - local30;
			anIntArray165[1] = Static401.aClass4_1.method1215() - local32;
		}
		method1980(local5, 200000);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IZ)V")
	private static void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(75) String local75;
		@Pc(1425) boolean local1425;
		@Pc(89) int local89;
		@Pc(157) int local157;
		@Pc(741) int local741;
		@Pc(163) String local163;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray164[anInt2191++] = Static140.anInt2983;
				return;
			}
			if (arg0 == 5001) {
				anInt2191 -= 3;
				Static140.anInt2983 = anIntArray164[anInt2191];
				Static6.aClass135_1 = Static487.method7351(anIntArray164[anInt2191 + 1]);
				if (Static6.aClass135_1 == null) {
					Static6.aClass135_1 = Static549.aClass135_4;
				}
				Static513.anInt9024 = anIntArray164[anInt2191 + 2];
				Static298.method4854(Static382.aClass181_79);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static140.anInt2983, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static6.aClass135_1.anInt4267, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static513.anInt9024, -81849);
				return;
			}
			if (arg0 == 5002) {
				anInt2189 -= 2;
				local75 = aStringArray11[anInt2189];
				local81 = aStringArray11[anInt2189 + 1];
				anInt2191 -= 2;
				local89 = anIntArray164[anInt2191];
				local95 = anIntArray164[anInt2191 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static298.method4854(Static412.aClass181_86);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static392.method6180(local75) + Static392.method6180(local81) + 2, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4998(local75);
				Static547.aClass6_Sub26_Sub2_2.method4950(local89 - 1, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4950(local95, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4998(local81);
				return;
			}
			@Pc(161) Class61 local161;
			if (arg0 == 5003) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local163 = "";
				if (local161 != null && local161.aString18 != null) {
					local163 = local161.aString18;
				}
				aStringArray11[anInt2189++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt1925;
				}
				anIntArray164[anInt2191++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static6.aClass135_1 == null) {
					anIntArray164[anInt2191++] = -1;
					return;
				}
				anIntArray164[anInt2191++] = Static6.aClass135_1.anInt4267;
				return;
			}
			if (arg0 == 5006) {
				local157 = anIntArray164[--anInt2191];
				Static298.method4854(Static371.aClass181_78);
				Static547.aClass6_Sub26_Sub2_2.method4950(local157, -81849);
				return;
			}
			if (arg0 == 5008) {
				local75 = aStringArray11[--anInt2189];
				method1983(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt2189 -= 2;
				local75 = aStringArray11[anInt2189];
				local81 = aStringArray11[anInt2189 + 1];
				if (Static456.anInt8437 != 0 || (!Static200.aBoolean349 || Static554.aBoolean702) && !Static245.aBoolean376) {
					Static298.method4854(Static40.aClass181_10);
					Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
					local89 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
					Static547.aClass6_Sub26_Sub2_2.method4998(local75);
					Static320.method5175(Static547.aClass6_Sub26_Sub2_2, local81);
					Static547.aClass6_Sub26_Sub2_2.method4976(Static547.aClass6_Sub26_Sub2_2.anInt5769 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local163 = "";
				if (local161 != null && local161.aString17 != null) {
					local163 = local161.aString17;
				}
				aStringArray11[anInt2189++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local163 = "";
				if (local161 != null && local161.aString15 != null) {
					local163 = local161.aString15;
				}
				aStringArray11[anInt2189++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt1926;
				}
				anIntArray164[anInt2191++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static350.aClass11_Sub1_Sub1_Sub2_4 == null || Static350.aClass11_Sub1_Sub1_Sub2_4.aString96 == null) {
					local75 = Static319.aString70;
				} else {
					local75 = Static350.aClass11_Sub1_Sub1_Sub2_4.method6223();
				}
				aStringArray11[anInt2189++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray164[anInt2191++] = Static513.anInt9024;
				return;
			}
			if (arg0 == 5017) {
				anIntArray164[anInt2191++] = Static492.method7385();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt1923;
				}
				anIntArray164[anInt2191++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local163 = "";
				if (local161 != null && local161.aString19 != null) {
					local163 = local161.aString19;
				}
				aStringArray11[anInt2189++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static350.aClass11_Sub1_Sub1_Sub2_4 == null || Static350.aClass11_Sub1_Sub1_Sub2_4.aString96 == null) {
					local75 = Static319.aString70;
				} else {
					local75 = Static350.aClass11_Sub1_Sub1_Sub2_4.method6226();
				}
				aStringArray11[anInt2189++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt1921;
				}
				anIntArray164[anInt2191++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt1922;
				}
				anIntArray164[anInt2191++] = local89;
				return;
			}
			if (arg0 == 5025) {
				local157 = anIntArray164[--anInt2191];
				local161 = Static382.method6027(local157);
				local163 = "";
				if (local161 != null && local161.aString16 != null) {
					local163 = local161.aString16;
				}
				aStringArray11[anInt2189++] = local163;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray164[--anInt2191];
				aStringArray11[anInt2189++] = Static189.aClass92_1.method2484(local157).aString54;
				return;
			}
			@Pc(701) Class6_Sub4_Sub7 local701;
			if (arg0 == 5051) {
				local157 = anIntArray164[--anInt2191];
				local701 = Static189.aClass92_1.method2484(local157);
				if (local701.anIntArray312 == null) {
					anIntArray164[anInt2191++] = 0;
					return;
				}
				anIntArray164[anInt2191++] = local701.anIntArray312.length;
				return;
			}
			if (arg0 == 5052) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				@Pc(746) Class6_Sub4_Sub7 local746 = Static189.aClass92_1.method2484(local157);
				local95 = local746.anIntArray312[local741];
				anIntArray164[anInt2191++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray164[--anInt2191];
				local701 = Static189.aClass92_1.method2484(local157);
				if (local701.anIntArray313 == null) {
					anIntArray164[anInt2191++] = 0;
					return;
				}
				anIntArray164[anInt2191++] = local701.anIntArray313.length;
				return;
			}
			if (arg0 == 5054) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				anIntArray164[anInt2191++] = Static189.aClass92_1.method2484(local157).anIntArray313[local741];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray164[--anInt2191];
				aStringArray11[anInt2189++] = Static96.aClass221_2.method5320(local157).method961();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray164[--anInt2191];
				@Pc(872) Class6_Sub4_Sub1 local872 = Static96.aClass221_2.method5320(local157);
				if (local872.anIntArray63 == null) {
					anIntArray164[anInt2191++] = 0;
					return;
				}
				anIntArray164[anInt2191++] = local872.anIntArray63.length;
				return;
			}
			if (arg0 == 5057) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				anIntArray164[anInt2191++] = Static96.aClass221_2.method5320(local157).anIntArray63[local741];
				return;
			}
			if (arg0 == 5058) {
				aClass39_1 = new Class39();
				aClass39_1.anInt1256 = anIntArray164[--anInt2191];
				aClass39_1.aClass6_Sub4_Sub1_1 = Static96.aClass221_2.method5320(aClass39_1.anInt1256);
				aClass39_1.anIntArray78 = new int[aClass39_1.aClass6_Sub4_Sub1_1.method959()];
				return;
			}
			if (arg0 == 5059) {
				Static298.method4854(Static12.aClass181_4);
				Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
				local157 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
				Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4962(aClass39_1.anInt1256);
				aClass39_1.aClass6_Sub4_Sub1_1.method967(Static547.aClass6_Sub26_Sub2_2, aClass39_1.anIntArray78);
				Static547.aClass6_Sub26_Sub2_2.method4976(Static547.aClass6_Sub26_Sub2_2.anInt5769 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray11[--anInt2189];
				Static298.method4854(Static433.aClass181_91);
				Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
				local741 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
				Static547.aClass6_Sub26_Sub2_2.method4998(local75);
				Static547.aClass6_Sub26_Sub2_2.method4962(aClass39_1.anInt1256);
				aClass39_1.aClass6_Sub4_Sub1_1.method967(Static547.aClass6_Sub26_Sub2_2, aClass39_1.anIntArray78);
				Static547.aClass6_Sub26_Sub2_2.method4976(Static547.aClass6_Sub26_Sub2_2.anInt5769 - local741);
				return;
			}
			if (arg0 == 5061) {
				Static298.method4854(Static12.aClass181_4);
				Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
				local157 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
				Static547.aClass6_Sub26_Sub2_2.method4950(1, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4962(aClass39_1.anInt1256);
				aClass39_1.aClass6_Sub4_Sub1_1.method967(Static547.aClass6_Sub26_Sub2_2, aClass39_1.anIntArray78);
				Static547.aClass6_Sub26_Sub2_2.method4976(Static547.aClass6_Sub26_Sub2_2.anInt5769 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				anIntArray164[anInt2191++] = Static189.aClass92_1.method2484(local157).aCharArray2[local741];
				return;
			}
			if (arg0 == 5063) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				anIntArray164[anInt2191++] = Static189.aClass92_1.method2484(local157).aCharArray3[local741];
				return;
			}
			if (arg0 == 5064) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				if (local741 == -1) {
					anIntArray164[anInt2191++] = -1;
					return;
				}
				anIntArray164[anInt2191++] = Static189.aClass92_1.method2484(local157).method4096((char) local741);
				return;
			}
			if (arg0 == 5065) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				if (local741 == -1) {
					anIntArray164[anInt2191++] = -1;
					return;
				}
				anIntArray164[anInt2191++] = Static189.aClass92_1.method2484(local157).method4093((char) local741);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray164[--anInt2191];
				anIntArray164[anInt2191++] = Static96.aClass221_2.method5320(local157).method959();
				return;
			}
			if (arg0 == 5067) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				local89 = Static96.aClass221_2.method5320(local157).method960(local741).anInt3347;
				anIntArray164[anInt2191++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				aClass39_1.anIntArray78[local157] = local741;
				return;
			}
			if (arg0 == 5069) {
				anInt2191 -= 2;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				aClass39_1.anIntArray78[local157] = local741;
				return;
			}
			if (arg0 == 5070) {
				anInt2191 -= 3;
				local157 = anIntArray164[anInt2191];
				local741 = anIntArray164[anInt2191 + 1];
				local89 = anIntArray164[anInt2191 + 2];
				@Pc(1377) Class6_Sub4_Sub1 local1377 = Static96.aClass221_2.method5320(local157);
				if (local1377.method960(local741).anInt3347 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray164[anInt2191++] = local1377.method962(local89, local741);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray11[--anInt2189];
				local1425 = anIntArray164[--anInt2191] == 1;
				Static224.method4021(local75, local1425);
				anIntArray164[anInt2191++] = Static503.anInt8951;
				return;
			}
			if (arg0 == 5072) {
				if (Static127.aShortArray31 != null && Static267.anInt5287 < Static503.anInt8951) {
					anIntArray164[anInt2191++] = Static127.aShortArray31[Static267.anInt5287++] & 0xFFFF;
					return;
				}
				anIntArray164[anInt2191++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static267.anInt5287 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static387.aClass273_1.method6617(86)) {
					anIntArray164[anInt2191++] = 1;
					return;
				}
				anIntArray164[anInt2191++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static387.aClass273_1.method6617(82)) {
					anIntArray164[anInt2191++] = 1;
					return;
				}
				anIntArray164[anInt2191++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static387.aClass273_1.method6617(81)) {
					anIntArray164[anInt2191++] = 1;
					return;
				}
				anIntArray164[anInt2191++] = 0;
				return;
			}
		} else {
			@Pc(2762) int local2762;
			@Pc(2036) boolean local2036;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static349.method5695(anIntArray164[--anInt2191]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray164[anInt2191++] = Static115.method2330();
					return;
				}
				if (arg0 == 5205) {
					Static289.method4773(-1, anIntArray164[--anInt2191], -1, false);
					return;
				}
				@Pc(1625) Class6_Sub4_Sub12 local1625;
				if (arg0 == 5206) {
					local157 = anIntArray164[--anInt2191];
					local1625 = Static461.method102(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1625 == null) {
						anIntArray164[anInt2191++] = -1;
						return;
					}
					anIntArray164[anInt2191++] = local1625.anInt6893;
					return;
				}
				@Pc(1658) Class6_Sub4_Sub12 local1658;
				if (arg0 == 5207) {
					local1658 = Static461.method92(anIntArray164[--anInt2191]);
					if (local1658 != null && local1658.aString79 != null) {
						aStringArray11[anInt2189++] = local1658.aString79;
						return;
					}
					aStringArray11[anInt2189++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray164[anInt2191++] = Static288.anInt5497;
					anIntArray164[anInt2191++] = Static183.anInt4068;
					return;
				}
				if (arg0 == 5209) {
					anIntArray164[anInt2191++] = Static556.anInt9488 + Static461.anInt57;
					anIntArray164[anInt2191++] = Static567.anInt7671 + Static461.anInt58;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray164[--anInt2191];
					local1625 = Static461.method92(local157);
					if (local1625 == null) {
						anIntArray164[anInt2191++] = 0;
						anIntArray164[anInt2191++] = 0;
						return;
					}
					anIntArray164[anInt2191++] = local1625.anInt6889 >> 14 & 0x3FFF;
					anIntArray164[anInt2191++] = local1625.anInt6889 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray164[--anInt2191];
					local1625 = Static461.method92(local157);
					if (local1625 == null) {
						anIntArray164[anInt2191++] = 0;
						anIntArray164[anInt2191++] = 0;
						return;
					}
					anIntArray164[anInt2191++] = local1625.anInt6895 - local1625.anInt6896;
					anIntArray164[anInt2191++] = local1625.anInt6898 - local1625.anInt6894;
					return;
				}
				@Pc(1848) Class6_Sub7 local1848;
				if (arg0 == 5212) {
					local1848 = Static50.method1207();
					if (local1848 == null) {
						anIntArray164[anInt2191++] = -1;
						anIntArray164[anInt2191++] = -1;
						return;
					}
					anIntArray164[anInt2191++] = local1848.anInt1365;
					local741 = local1848.anInt1363 << 28 | local1848.anInt1361 + Static461.anInt57 << 14 | local1848.anInt1366 + Static461.anInt58;
					anIntArray164[anInt2191++] = local741;
					return;
				}
				if (arg0 == 5213) {
					local1848 = Static55.method1268();
					if (local1848 == null) {
						anIntArray164[anInt2191++] = -1;
						anIntArray164[anInt2191++] = -1;
						return;
					}
					anIntArray164[anInt2191++] = local1848.anInt1365;
					local741 = local1848.anInt1363 << 28 | local1848.anInt1361 + Static461.anInt57 << 14 | local1848.anInt1366 + Static461.anInt58;
					anIntArray164[anInt2191++] = local741;
					return;
				}
				@Pc(1996) boolean local1996;
				if (arg0 == 5214) {
					local157 = anIntArray164[--anInt2191];
					local1625 = Static163.method3316();
					if (local1625 != null) {
						local1996 = local1625.method5807(local157 & 0x3FFF, anIntArray166, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1996) {
							Static177.method3526(anIntArray166[2], anIntArray166[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					@Pc(2034) Class143 local2034 = Static461.method91(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local2036 = false;
					for (@Pc(2041) Class6_Sub4_Sub12 local2041 = (Class6_Sub4_Sub12) local2034.method3839(); local2041 != null; local2041 = (Class6_Sub4_Sub12) local2034.method3833()) {
						if (local2041.anInt6893 == local741) {
							local2036 = true;
							break;
						}
					}
					if (local2036) {
						anIntArray164[anInt2191++] = 1;
						return;
					}
					anIntArray164[anInt2191++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray164[--anInt2191];
					local1625 = Static461.method92(local157);
					if (local1625 == null) {
						anIntArray164[anInt2191++] = -1;
						return;
					}
					anIntArray164[anInt2191++] = local1625.anInt6901;
					return;
				}
				if (arg0 == 5220) {
					anIntArray164[anInt2191++] = Static297.anInt4703 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray164[--anInt2191];
					Static177.method3526(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1658 = Static163.method3316();
					if (local1658 != null) {
						local1425 = local1658.method5813(anIntArray166, Static567.anInt7671 + Static461.anInt58, Static556.anInt9488 + Static461.anInt57);
						if (local1425) {
							anIntArray164[anInt2191++] = anIntArray166[1];
							anIntArray164[anInt2191++] = anIntArray166[2];
							return;
						}
						anIntArray164[anInt2191++] = -1;
						anIntArray164[anInt2191++] = -1;
						return;
					}
					anIntArray164[anInt2191++] = -1;
					anIntArray164[anInt2191++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					Static289.method4773(local741 >> 14 & 0x3FFF, local157, local741 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray164[--anInt2191];
					local1625 = Static163.method3316();
					if (local1625 != null) {
						local1996 = local1625.method5807(local157 & 0x3FFF, anIntArray166, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1996) {
							anIntArray164[anInt2191++] = anIntArray166[1];
							anIntArray164[anInt2191++] = anIntArray166[2];
							return;
						}
						anIntArray164[anInt2191++] = -1;
						anIntArray164[anInt2191++] = -1;
						return;
					}
					anIntArray164[anInt2191++] = -1;
					anIntArray164[anInt2191++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray164[--anInt2191];
					local1625 = Static163.method3316();
					if (local1625 != null) {
						local1996 = local1625.method5813(anIntArray166, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1996) {
							anIntArray164[anInt2191++] = anIntArray166[1];
							anIntArray164[anInt2191++] = anIntArray166[2];
							return;
						}
						anIntArray164[anInt2191++] = -1;
						anIntArray164[anInt2191++] = -1;
						return;
					}
					anIntArray164[anInt2191++] = -1;
					anIntArray164[anInt2191++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static477.method7301(anIntArray164[--anInt2191]);
					return;
				}
				if (arg0 == 5227) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					Static289.method4773(local741 >> 14 & 0x3FFF, local157, local741 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static300.aBoolean431 = anIntArray164[--anInt2191] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray164[anInt2191++] = Static300.aBoolean431 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray164[--anInt2191];
					Static501.method4262(local157);
					return;
				}
				@Pc(2554) Class6 local2554;
				if (arg0 == 5231) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local1425 = anIntArray164[anInt2191 + 1] == 1;
					if (Static121.aClass305_16 != null) {
						local2554 = Static121.aClass305_16.method7447((long) local157);
						if (local2554 != null && !local1425) {
							local2554.method8151();
							return;
						}
						if (local2554 == null && local1425) {
							local2554 = new Class6();
							Static121.aClass305_16.method7448((long) local157, local2554);
						}
					}
					return;
				}
				@Pc(2596) Class6 local2596;
				if (arg0 == 5232) {
					local157 = anIntArray164[--anInt2191];
					if (Static121.aClass305_16 != null) {
						local2596 = Static121.aClass305_16.method7447((long) local157);
						anIntArray164[anInt2191++] = local2596 == null ? 0 : 1;
						return;
					}
					anIntArray164[anInt2191++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local1425 = anIntArray164[anInt2191 + 1] == 1;
					if (Static52.aClass305_9 != null) {
						local2554 = Static52.aClass305_9.method7447((long) local157);
						if (local2554 != null && !local1425) {
							local2554.method8151();
							return;
						}
						if (local2554 == null && local1425) {
							local2554 = new Class6();
							Static52.aClass305_9.method7448((long) local157, local2554);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray164[--anInt2191];
					if (Static52.aClass305_9 != null) {
						local2596 = Static52.aClass305_9.method7447((long) local157);
						anIntArray164[anInt2191++] = local2596 == null ? 0 : 1;
						return;
					}
					anIntArray164[anInt2191++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray164[anInt2191++] = Static461.aClass6_Sub4_Sub12_2 == null ? -1 : Static461.aClass6_Sub4_Sub12_2.anInt6893;
					return;
				}
				if (arg0 == 5236) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = local741 >> 14 & 0x3FFF;
					local95 = local741 & 0x3FFF;
					local2762 = Static123.method2423(local157, local89, local95);
					if (local2762 < 0) {
						anIntArray164[anInt2191++] = -1;
						return;
					}
					anIntArray164[anInt2191++] = local2762;
					return;
				}
				if (arg0 == 5237) {
					Static578.method8143();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					Static98.method2097(3, local157, false, local741);
					anIntArray164[anInt2191++] = Static345.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static345.aFrame2 != null) {
						Static98.method2097(Static104.aClass6_Sub6_Sub1_4.anInt1173, -1, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2846) Class34[] local2846 = Static331.method8153();
					anIntArray164[anInt2191++] = local2846.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray164[--anInt2191];
					@Pc(2870) Class34[] local2870 = Static331.method8153();
					anIntArray164[anInt2191++] = local2870[local157].anInt1205;
					anIntArray164[anInt2191++] = local2870[local157].anInt1207;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static104.aClass6_Sub6_Sub1_4.anInt1160;
					local741 = Static104.aClass6_Sub6_Sub1_4.anInt1169;
					local89 = -1;
					@Pc(2907) Class34[] local2907 = Static331.method8153();
					for (local2762 = 0; local2762 < local2907.length; local2762++) {
						@Pc(2914) Class34 local2914 = local2907[local2762];
						if (local2914.anInt1205 == local157 && local2914.anInt1207 == local741) {
							local89 = local2762;
							break;
						}
					}
					anIntArray164[anInt2191++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray164[anInt2191++] = Static298.method4852();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray164[--anInt2191];
					if (local157 >= 1 && local157 <= 2) {
						Static98.method2097(local157, -1, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1173;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray164[--anInt2191];
					if (local157 >= 1 && local157 <= 2) {
						Static104.aClass6_Sub6_Sub1_4.anInt1173 = local157;
						Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt2189 -= 2;
					local75 = aStringArray11[anInt2189];
					local81 = aStringArray11[anInt2189 + 1];
					local89 = anIntArray164[--anInt2191];
					Static298.method4854(Static22.aClass181_6);
					Static547.aClass6_Sub26_Sub2_2.method4950(Static392.method6180(local75) + Static392.method6180(local81) + 1, -81849);
					Static547.aClass6_Sub26_Sub2_2.method4998(local75);
					Static547.aClass6_Sub26_Sub2_2.method4998(local81);
					Static547.aClass6_Sub26_Sub2_2.method4950(local89, -81849);
					return;
				}
				if (arg0 == 5401) {
					anInt2191 -= 2;
					Static388.aShortArray83[anIntArray164[anInt2191]] = (short) Static17.method842(anIntArray164[anInt2191 + 1]);
					Static98.aClass203_1.method4903();
					Static98.aClass203_1.method4907();
					Static504.aClass343_2.method7992();
					Static101.method2148();
					return;
				}
				if (arg0 == 5405) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static132.anIntArrayArrayArray22[local157] = new int[local741 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt2191 -= 7;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1] << 1;
					local89 = anIntArray164[anInt2191 + 2];
					local95 = anIntArray164[anInt2191 + 3];
					local2762 = anIntArray164[anInt2191 + 4];
					@Pc(3182) int local3182 = anIntArray164[anInt2191 + 5];
					@Pc(3188) int local3188 = anIntArray164[anInt2191 + 6];
					if (local157 >= 0 && local157 < 2 && Static132.anIntArrayArrayArray22[local157] != null && local741 >= 0 && local741 < Static132.anIntArrayArrayArray22[local157].length) {
						Static132.anIntArrayArrayArray22[local157][local741] = new int[] { (local89 >> 14 & 0x3FFF) << 9, local95 << 2, (local89 & 0x3FFF) << 9, local3188 };
						Static132.anIntArrayArrayArray22[local157][local741 + 1] = new int[] { (local2762 >> 14 & 0x3FFF) << 9, local3182 << 2, (local2762 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static132.anIntArrayArrayArray22[anIntArray164[--anInt2191]].length >> 1;
					anIntArray164[anInt2191++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static345.aFrame2 != null) {
						Static98.method2097(Static104.aClass6_Sub6_Sub1_4.anInt1173, -1, false, -1);
					}
					if (Static138.aFrame1 != null) {
						Static277.method4599();
						System.exit(0);
						return;
					}
					local75 = Static51.aString12 == null ? Static44.method1136() : Static51.aString12;
					Static367.method5851(Static414.aClass246_5, false, local75, Static5.anInt145 == 1);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static255.aClass280_4 != null) {
						if (Static255.aClass280_4.anObject16 == null) {
							local75 = Static258.method4481(Static255.aClass280_4.anInt8466);
						} else {
							local75 = (String) Static255.aClass280_4.anObject16;
						}
					}
					aStringArray11[anInt2189++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray164[anInt2191++] = Static414.aClass246_5.aBoolean534 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static345.aFrame2 != null) {
						Static98.method2097(Static104.aClass6_Sub6_Sub1_4.anInt1173, -1, false, -1);
					}
					local75 = aStringArray11[--anInt2189];
					local1425 = anIntArray164[--anInt2191] == 1;
					local163 = Static44.method1136() + local75;
					Static367.method5851(Static414.aClass246_5, local1425, local163, Static5.anInt145 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt2189 -= 2;
					local75 = aStringArray11[anInt2189];
					local81 = aStringArray11[anInt2189 + 1];
					local89 = anIntArray164[--anInt2191];
					if (local75.length() > 0) {
						if (Static450.aStringArray48 == null) {
							Static450.aStringArray48 = new String[Static144.anIntArray230[Static38.aClass162_1.anInt4926]];
						}
						Static450.aStringArray48[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static129.aStringArray18 == null) {
							Static129.aStringArray18 = new String[Static144.anIntArray230[Static38.aClass162_1.anInt4926]];
						}
						Static129.aStringArray18[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray11[--anInt2189]);
					return;
				}
				if (arg0 == 5424) {
					anInt2191 -= 11;
					Static427.anInt9634 = anIntArray164[anInt2191];
					Static359.anInt6349 = anIntArray164[anInt2191 + 1];
					Static413.anInt7741 = anIntArray164[anInt2191 + 2];
					Static580.anInt9818 = anIntArray164[anInt2191 + 3];
					Static514.anInt9028 = anIntArray164[anInt2191 + 4];
					Static467.anInt8607 = anIntArray164[anInt2191 + 5];
					Static209.anInt4410 = anIntArray164[anInt2191 + 6];
					Static504.anInt8966 = anIntArray164[anInt2191 + 7];
					Static87.anInt2167 = anIntArray164[anInt2191 + 8];
					Static532.anInt9208 = anIntArray164[anInt2191 + 9];
					Static524.anInt9094 = anIntArray164[anInt2191 + 10];
					Static132.aClass168_118.method4427(Static514.anInt9028);
					Static132.aClass168_118.method4427(Static467.anInt8607);
					Static132.aClass168_118.method4427(Static209.anInt4410);
					Static132.aClass168_118.method4427(Static504.anInt8966);
					Static132.aClass168_118.method4427(Static87.anInt2167);
					Static31.aClass66_6 = null;
					Static135.aClass66_20 = null;
					Static236.aClass66_23 = null;
					Static33.aClass66_7 = null;
					Static515.aClass66_30 = null;
					Static73.aClass66_17 = null;
					Static53.aClass66_12 = null;
					Static12.aClass66_5 = null;
					Static28.aBoolean82 = true;
					return;
				}
				if (arg0 == 5425) {
					Static367.method5849();
					Static28.aBoolean82 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt2191 -= 2;
					Static440.anInt8040 = anIntArray164[anInt2191];
					Static553.anInt9423 = anIntArray164[anInt2191 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt2191 -= 2;
					Static557.anInt9493 = anIntArray164[anInt2191 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					anIntArray164[anInt2191++] = Static535.method7757(local157, local741) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static27.method980(false, false, aStringArray11[--anInt2189]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static590.method5698("accountcreated", Static87.anApplet1);
						return;
					} catch (@Pc(3720) Throwable local3720) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static590.method5698("accountcreatestarted", Static87.anApplet1);
						return;
					} catch (@Pc(3731) Throwable local3731) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt2191 -= 4;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					local95 = anIntArray164[anInt2191 + 3];
					Static350.method5060((local157 & 0x3FFF) - Static247.anInt5049, local89, (local157 >> 14 & 0x3FFF) - Static191.anInt4147, local95, local741 << 2, false);
					return;
				}
				if (arg0 == 5501) {
					anInt2191 -= 4;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					local95 = anIntArray164[anInt2191 + 3];
					Static400.method6288(local95, (local157 & 0x3FFF) - Static247.anInt5049, local741 << 2, local89, (local157 >> 14 & 0x3FFF) - Static191.anInt4147);
					return;
				}
				if (arg0 == 5502) {
					anInt2191 -= 6;
					local157 = anIntArray164[anInt2191];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static454.anInt8403 = local157;
					local741 = anIntArray164[anInt2191 + 1];
					if (local741 + 1 >= Static132.anIntArrayArrayArray22[Static454.anInt8403].length >> 1) {
						throw new RuntimeException();
					}
					Static154.anInt3344 = local741;
					Static319.anInt6039 = 0;
					Static343.anInt6636 = anIntArray164[anInt2191 + 2];
					Static566.anInt9591 = anIntArray164[anInt2191 + 3];
					local89 = anIntArray164[anInt2191 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static35.anInt1112 = local89;
					local95 = anIntArray164[anInt2191 + 5];
					if (local95 + 1 >= Static132.anIntArrayArrayArray22[Static35.anInt1112].length >> 1) {
						throw new RuntimeException();
					}
					Static402.anInt9648 = local95;
					Static84.anInt1994 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static37.method1092();
					return;
				}
				if (arg0 == 5504) {
					anInt2191 -= 2;
					Static67.method1399(anIntArray164[anInt2191], anIntArray164[anInt2191 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray164[anInt2191++] = (int) Static200.aFloat100 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray164[anInt2191++] = (int) Static412.aFloat175 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static489.method7368();
					return;
				}
				if (arg0 == 5508) {
					Static131.method2519();
					return;
				}
				if (arg0 == 5509) {
					Static577.method8135();
					return;
				}
				if (arg0 == 5510) {
					Static300.method4865();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray164[--anInt2191];
					local741 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local741 -= Static191.anInt4147;
					if (local741 < 0) {
						local741 = 0;
					} else if (local741 >= Static228.anInt4746) {
						local741 = Static228.anInt4746;
					}
					local89 -= Static247.anInt5049;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static44.anInt1275) {
						local89 = Static44.anInt1275;
					}
					Static99.anInt2351 = (local741 << 9) + 256;
					Static131.anInt2843 = (local89 << 9) + 256;
					Static84.anInt1994 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static277.method4593();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt2189 -= 2;
					local75 = aStringArray11[anInt2189];
					local81 = aStringArray11[anInt2189 + 1];
					local89 = anIntArray164[--anInt2191];
					if (Static325.anInt6149 != 3) {
						return;
					}
					if (Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						Static319.aString70 = local75;
						Static148.aString116 = local81;
						Static518.anInt9045 = local89;
						Static145.method2683(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static463.method7159();
					return;
				}
				if (arg0 == 5602) {
					if (Static558.anInt9502 == 0) {
						Static103.anInt2393 = -2;
						Static443.anInt8147 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt2191 -= 4;
					if (Static325.anInt6149 != 3) {
						return;
					}
					if (Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						Static538.method7766(anIntArray164[anInt2191 + 3], anIntArray164[anInt2191], anIntArray164[anInt2191 + 1], anIntArray164[anInt2191 + 2]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt2189--;
					if (Static325.anInt6149 != 3) {
						return;
					}
					if (Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						Static127.method2491(Static118.method2353(aStringArray11[anInt2189]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt2189 -= 2;
					if (Static325.anInt6149 != 3) {
						return;
					}
					if (Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						Static252.method4420(false, aStringArray11[anInt2189 + 1], Static118.method2353(aStringArray11[anInt2189]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static159.anInt3401 == 0) {
						Static350.anInt5890 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray164[anInt2191++] = Static443.anInt8147;
					return;
				}
				if (arg0 == 5608) {
					anIntArray164[anInt2191++] = Static220.anInt4641;
					return;
				}
				if (arg0 == 5609) {
					anIntArray164[anInt2191++] = Static350.anInt5890;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray11[anInt2189++] = Static380.aStringArray41.length > local157 ? Static431.method6594(Static380.aStringArray41[local157]) : "";
					}
					Static380.aStringArray41 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray164[anInt2191++] = Static310.anInt5847;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray164[--anInt2191];
					if (Static325.anInt6149 != 7) {
						return;
					}
					if (Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						if (Static52.aClass64_1 != null) {
							Static52.aClass64_1.method1812();
							Static52.aClass64_1 = null;
						}
						Static518.anInt9045 = local157;
						Static145.method2683(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray164[anInt2191++] = Static443.anInt8147;
					return;
				}
				if (arg0 == 5615) {
					anInt2189 -= 2;
					local75 = aStringArray11[anInt2189];
					local81 = aStringArray11[anInt2189 + 1];
					if (Static325.anInt6149 != 3) {
						return;
					}
					if (Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						if (Static52.aClass64_1 != null) {
							Static52.aClass64_1.method1812();
							Static52.aClass64_1 = null;
						}
						Static319.aString70 = local75;
						Static148.aString116 = local81;
						Static145.method2683(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static366.method5845(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray164[anInt2191++] = Static103.anInt2393;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray164[--anInt2191];
					Static241.method4243(local157, false);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray164[--anInt2191];
					Static241.method4243(local157, true);
					return;
				}
				if (arg0 == 5620) {
					Static178.method3533();
					if (Static91.aString22 != "" && Static91.aString22 != "") {
						anIntArray164[anInt2191++] = 1;
						return;
					}
					anIntArray164[anInt2191++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt2189 -= 2;
					if (Static325.anInt6149 != 3) {
						return;
					}
					if (Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						Static252.method4420(true, aStringArray11[anInt2189 + 1], Static118.method2353(aStringArray11[anInt2189]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4525) Class280 local4525 = Static414.aClass246_5.method6136("3", false);
					while (local4525.anInt8467 == 0) {
						Static566.method8004(1L);
					}
					if (local4525.anInt8467 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4545) Class155 local4545 = (Class155) local4525.anObject16;
					if (local4545.method4080().exists()) {
						@Pc(4555) Class6_Sub26 local4555 = new Class6_Sub26(50);
						try {
							local4545.method4079(50, local4555.aByteArray65, 0);
						} catch (@Pc(4564) IOException local4564) {
						}
					}
					try {
						local4545.method4077();
						return;
					} catch (@Pc(4570) Exception local4570) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static303.aString67 != null) {
						anIntArray164[anInt2191++] = 1;
						return;
					}
					anIntArray164[anInt2191++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray164[anInt2191++] = (int) (Static347.aLong149 >> 32);
					anIntArray164[anInt2191++] = (int) (Static347.aLong149 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1172 = local157;
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6002) {
					Static104.aClass6_Sub6_Sub1_4.method1082(anIntArray164[--anInt2191] == 1);
					Static190.method3621();
					Static579.method6614();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6003) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean133 = anIntArray164[--anInt2191] == 1;
					Static579.method6614();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6005) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean121 = anIntArray164[--anInt2191] == 1;
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6006) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean136 = anIntArray164[--anInt2191] == 1;
					Static323.aClass9_8.method5432(!Static104.aClass6_Sub6_Sub1_4.aBoolean136);
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6007) {
					Static104.aClass6_Sub6_Sub1_4.anInt1156 = anIntArray164[--anInt2191];
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6008) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean131 = anIntArray164[--anInt2191] == 1;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6009) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean124 = anIntArray164[--anInt2191] == 1;
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6010) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean138 = anIntArray164[--anInt2191] == 1;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static104.aClass6_Sub6_Sub1_4.method1062(Static5.anInt145, local157);
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6012) {
					Static104.aClass6_Sub6_Sub1_4.method1063(Static5.anInt145, anIntArray164[--anInt2191] == 1);
					Static397.method6265();
					Static200.method3771();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6014) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean129 = anIntArray164[--anInt2191] == 1;
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6015) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean128 = anIntArray164[--anInt2191] == 1;
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1166 = local157;
					Static419.method6517(Static5.anInt145);
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					return;
				}
				if (arg0 == 6017) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean122 = anIntArray164[--anInt2191] == 1;
					Static143.method2662();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1155 = local157;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static104.aClass6_Sub6_Sub1_4.anInt1170) {
						if (Static104.aClass6_Sub6_Sub1_4.anInt1170 == 0 && Static499.anInt8891 != -1) {
							Static386.method6071(Static378.aClass168_88, local157, Static499.anInt8891);
							Static439.aBoolean592 = false;
						} else if (local157 == 0) {
							Static136.method2556();
							Static439.aBoolean592 = false;
						} else {
							Static579.method6616(local157);
						}
						Static104.aClass6_Sub6_Sub1_4.anInt1170 = local157;
					}
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1178 = local157;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6021) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean140 = anIntArray164[--anInt2191] == 1;
					Static579.method6614();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray164[--anInt2191];
					local1425 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static205.anInt4372 < 96) {
						local157 = 0;
						local1425 = true;
					}
					Static318.method5130(local157);
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					anIntArray164[anInt2191++] = local1425 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1161 = local157;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > Static104.method6578(Static205.anInt4372)) {
						local157 = 0;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1162 = local157;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static115.method2333(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean123 = anIntArray164[--anInt2191] != 0;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					return;
				}
				if (arg0 == 6029) {
					Static104.aClass6_Sub6_Sub1_4.anInt1156 = anIntArray164[--anInt2191];
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					return;
				}
				if (arg0 == 6030) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean130 = anIntArray164[--anInt2191] != 0;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static190.method3621();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static419.method6517(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1182 = local157;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1165 = local157;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					return;
				}
				if (arg0 == 6034) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean135 = anIntArray164[--anInt2191] == 1;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static397.method6265();
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6035) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean141 = anIntArray164[--anInt2191] == 1;
					Static190.method3621();
					Static579.method6614();
					return;
				}
				if (arg0 == 6036) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static104.aClass6_Sub6_Sub1_4.method1072(local157);
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					return;
				}
				if (arg0 == 6037) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1177 = local157;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6038) {
					local157 = anIntArray164[--anInt2191];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static104.aClass6_Sub6_Sub1_4.anInt1176 && Static499.anInt8891 == Static422.anInt7840) {
						if (Static104.aClass6_Sub6_Sub1_4.anInt1176 == 0) {
							Static386.method6071(Static378.aClass168_88, local157, Static499.anInt8891);
							Static439.aBoolean592 = false;
						} else if (local157 == 0) {
							Static136.method2556();
							Static439.aBoolean592 = false;
						} else {
							Static579.method6616(local157);
						}
					}
					Static104.aClass6_Sub6_Sub1_4.anInt1176 = local157;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 6039) {
					local157 = anIntArray164[--anInt2191];
					if (local157 > 255 || local157 < 0) {
						local157 = 0;
					}
					if (local157 != Static104.aClass6_Sub6_Sub1_4.anInt1164) {
						Static104.aClass6_Sub6_Sub1_4.anInt1164 = local157;
						Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
						Static54.aBoolean151 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1172;
					return;
				}
				if (arg0 == 6102) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.method1066(Static5.anInt145) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean133 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean121 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean136 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1156;
					return;
				}
				if (arg0 == 6108) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean131 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean124 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean138 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145);
					return;
				}
				if (arg0 == 6112) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.method1064(Static5.anInt145) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean129 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean128 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1166;
					return;
				}
				if (arg0 == 6117) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean122 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1155;
					return;
				}
				if (arg0 == 6119) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1170;
					return;
				}
				if (arg0 == 6120) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1178;
					return;
				}
				if (arg0 == 6121) {
					anIntArray164[anInt2191++] = Static323.aClass9_8.method5464() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray164[anInt2191++] = Static297.method4044();
					return;
				}
				if (arg0 == 6124) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1161;
					return;
				}
				if (arg0 == 6125) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1162;
					return;
				}
				if (arg0 == 6126) {
					anIntArray164[anInt2191++] = Static323.aClass9_8.method5439() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean126 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean123 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1156;
					return;
				}
				if (arg0 == 6130) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean130 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray164[anInt2191++] = Static5.anInt145;
					return;
				}
				if (arg0 == 6132) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1182;
					return;
				}
				if (arg0 == 6133) {
					anIntArray164[anInt2191++] = Static414.aClass246_5.aBoolean534 && !Static414.aClass246_5.aBoolean535 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray164[anInt2191++] = Static104.method6578(Static205.anInt4372);
					return;
				}
				if (arg0 == 6135) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1165;
					return;
				}
				if (arg0 == 6136) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean135 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6158) boolean local6158 = true;
					try {
						local6158 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6168) Throwable local6168) {
					}
					anIntArray164[anInt2191++] = local6158 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray164[anInt2191++] = Static239.method4221(Static5.anInt145, 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.method1084(Static5.anInt145);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6216) byte local6216 = 0;
					if (Static553.method7874(Static5.anInt145) && Static205.anInt4372 < 96) {
						local6216 = 1;
					}
					anIntArray164[anInt2191++] = local6216;
					return;
				}
				if (arg0 == 6141) {
					if (Static205.anInt4372 < 96) {
						anIntArray164[anInt2191++] = 0;
						return;
					}
					anIntArray164[anInt2191++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1177;
					return;
				}
				if (arg0 == 6143) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1176;
					return;
				}
				if (arg0 == 6144) {
					anIntArray164[anInt2191++] = Static488.aBoolean662 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1164;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt2191 -= 2;
					Static145.aShort32 = (short) anIntArray164[anInt2191];
					if (Static145.aShort32 <= 0) {
						Static145.aShort32 = 256;
					}
					Static225.aShort42 = (short) anIntArray164[anInt2191 + 1];
					if (Static225.aShort42 <= 0) {
						Static225.aShort42 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt2191 -= 2;
					Static294.aShort49 = (short) anIntArray164[anInt2191];
					if (Static294.aShort49 <= 0) {
						Static294.aShort49 = 256;
					}
					Static366.aShort68 = (short) anIntArray164[anInt2191 + 1];
					if (Static366.aShort68 <= 0) {
						Static366.aShort68 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt2191 -= 4;
					Static385.aShort75 = (short) anIntArray164[anInt2191];
					if (Static385.aShort75 <= 0) {
						Static385.aShort75 = 1;
					}
					Static561.aShort27 = (short) anIntArray164[anInt2191 + 1];
					if (Static561.aShort27 <= 0) {
						Static561.aShort27 = 32767;
					} else if (Static561.aShort27 < Static385.aShort75) {
						Static561.aShort27 = Static385.aShort75;
					}
					Static439.aShort84 = (short) anIntArray164[anInt2191 + 2];
					if (Static439.aShort84 <= 0) {
						Static439.aShort84 = 1;
					}
					Static390.aShort76 = (short) anIntArray164[anInt2191 + 3];
					if (Static390.aShort76 <= 0) {
						Static390.aShort76 = 32767;
						return;
					}
					if (Static390.aShort76 < Static439.aShort84) {
						Static390.aShort76 = Static439.aShort84;
					}
					return;
				}
				if (arg0 == 6203) {
					Static283.method4648(Static93.aClass93_6.anInt2738, false, 0, Static93.aClass93_6.anInt2777, 0);
					anIntArray164[anInt2191++] = Static272.anInt5327;
					anIntArray164[anInt2191++] = Static16.anInt779;
					return;
				}
				if (arg0 == 6204) {
					anIntArray164[anInt2191++] = Static294.aShort49;
					anIntArray164[anInt2191++] = Static366.aShort68;
					return;
				}
				if (arg0 == 6205) {
					anIntArray164[anInt2191++] = Static145.aShort32;
					anIntArray164[anInt2191++] = Static225.aShort42;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray164[anInt2191++] = (int) (Static174.method3502() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray164[anInt2191++] = (int) (Static174.method3502() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local89, local741, local157);
					local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray164[anInt2191++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static174.method3502()));
					anIntArray164[anInt2191++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray164[--anInt2191];
					local1425 = true;
					if (local157 < 0) {
						local1425 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1425 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1425 = false;
					} else if (local157 % 100 != 0) {
						local1425 = true;
					} else if (local157 % 400 != 0) {
						local1425 = false;
					}
					anIntArray164[anInt2191++] = local1425 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray164[anInt2191++] = Static439.method6700() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray164[anInt2191++] = Static369.method5896() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static325.anInt6149 == 7 && Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						if (Static436.aBoolean588) {
							anIntArray164[anInt2191++] = 0;
							return;
						}
						if (Static111.aLong57 > Static174.method3502() - 1000L) {
							anIntArray164[anInt2191++] = 1;
							return;
						}
						Static436.aBoolean588 = true;
						Static298.method4854(Static128.aClass181_32);
						Static547.aClass6_Sub26_Sub2_2.method4979(Static100.anInt2364);
						anIntArray164[anInt2191++] = 0;
						return;
					}
					anIntArray164[anInt2191++] = 1;
					return;
				}
				@Pc(6833) Class262 local6833;
				@Pc(6800) Class116_Sub1 local6800;
				if (arg0 == 6501) {
					local6800 = Static229.method4082();
					if (local6800 != null) {
						anIntArray164[anInt2191++] = local6800.anInt3901;
						anIntArray164[anInt2191++] = local6800.anInt3892;
						aStringArray11[anInt2189++] = local6800.aString40;
						local6833 = local6800.method3475();
						anIntArray164[anInt2191++] = local6833.anInt7748;
						aStringArray11[anInt2189++] = local6833.aString99;
						anIntArray164[anInt2191++] = local6800.anInt3893;
						anIntArray164[anInt2191++] = local6800.anInt3900;
						aStringArray11[anInt2189++] = local6800.aString39;
						return;
					}
					anIntArray164[anInt2191++] = -1;
					anIntArray164[anInt2191++] = 0;
					aStringArray11[anInt2189++] = "";
					anIntArray164[anInt2191++] = 0;
					aStringArray11[anInt2189++] = "";
					anIntArray164[anInt2191++] = 0;
					anIntArray164[anInt2191++] = 0;
					aStringArray11[anInt2189++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6800 = Static184.method3595();
					if (local6800 != null) {
						anIntArray164[anInt2191++] = local6800.anInt3901;
						anIntArray164[anInt2191++] = local6800.anInt3892;
						aStringArray11[anInt2189++] = local6800.aString40;
						local6833 = local6800.method3475();
						anIntArray164[anInt2191++] = local6833.anInt7748;
						aStringArray11[anInt2189++] = local6833.aString99;
						anIntArray164[anInt2191++] = local6800.anInt3893;
						anIntArray164[anInt2191++] = local6800.anInt3900;
						aStringArray11[anInt2189++] = local6800.aString39;
						return;
					}
					anIntArray164[anInt2191++] = -1;
					anIntArray164[anInt2191++] = 0;
					aStringArray11[anInt2189++] = "";
					anIntArray164[anInt2191++] = 0;
					aStringArray11[anInt2189++] = "";
					anIntArray164[anInt2191++] = 0;
					anIntArray164[anInt2191++] = 0;
					aStringArray11[anInt2189++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray164[--anInt2191];
					local81 = aStringArray11[--anInt2189];
					if (Static325.anInt6149 == 7 && Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
						anIntArray164[anInt2191++] = Static87.method1963(local81, local157) ? 1 : 0;
						return;
					}
					anIntArray164[anInt2191++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static104.aClass6_Sub6_Sub1_4.anInt1175 = anIntArray164[--anInt2191];
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					return;
				}
				if (arg0 == 6505) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1175;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray164[--anInt2191];
					@Pc(7190) Class116_Sub1 local7190 = Static224.method4022(local157);
					if (local7190 != null) {
						anIntArray164[anInt2191++] = local7190.anInt3892;
						aStringArray11[anInt2189++] = local7190.aString40;
						@Pc(7214) Class262 local7214 = local7190.method3475();
						anIntArray164[anInt2191++] = local7214.anInt7748;
						aStringArray11[anInt2189++] = local7214.aString99;
						anIntArray164[anInt2191++] = local7190.anInt3893;
						anIntArray164[anInt2191++] = local7190.anInt3900;
						aStringArray11[anInt2189++] = local7190.aString39;
						return;
					}
					anIntArray164[anInt2191++] = -1;
					aStringArray11[anInt2189++] = "";
					anIntArray164[anInt2191++] = 0;
					aStringArray11[anInt2189++] = "";
					anIntArray164[anInt2191++] = 0;
					anIntArray164[anInt2191++] = 0;
					aStringArray11[anInt2189++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt2191 -= 4;
					local157 = anIntArray164[anInt2191];
					local1425 = anIntArray164[anInt2191 + 1] == 1;
					local89 = anIntArray164[anInt2191 + 2];
					local2036 = anIntArray164[anInt2191 + 3] == 1;
					Static542.method7788(local2036, local1425, local157, local89);
					return;
				}
				if (arg0 == 6508) {
					Static88.method1976();
					return;
				}
				if (arg0 == 6509) {
					if (Static325.anInt6149 != 7) {
						return;
					}
					Static316.aBoolean443 = anIntArray164[--anInt2191] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray164[anInt2191++] = Static167.anInt3844;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static104.aClass6_Sub6_Sub1_4.aBoolean137 = anIntArray164[--anInt2191] == 1;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					return;
				}
				if (arg0 == 6601) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.aBoolean137 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static212.aClass192_1 == Static486.aClass192_3) {
				if (arg0 == 6700) {
					local157 = Static459.aClass305_24.method7443();
					if (Static6.anInt302 != -1) {
						local157++;
					}
					anIntArray164[anInt2191++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray164[--anInt2191];
					if (Static6.anInt302 != -1) {
						if (local157 == 0) {
							anIntArray164[anInt2191++] = Static6.anInt302;
							return;
						}
						local157--;
					}
					@Pc(7501) Class6_Sub48 local7501 = (Class6_Sub48) Static459.aClass305_24.method7445();
					while (local157-- > 0) {
						local7501 = (Class6_Sub48) Static459.aClass305_24.method7449();
					}
					anIntArray164[anInt2191++] = local7501.anInt9207;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray164[--anInt2191];
					if (Static336.aClass93ArrayArray2[local157] == null) {
						aStringArray11[anInt2189++] = "";
						return;
					}
					local81 = Static336.aClass93ArrayArray2[local157][0].aString30;
					if (local81 == null) {
						aStringArray11[anInt2189++] = "";
						return;
					}
					aStringArray11[anInt2189++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray164[--anInt2191];
					if (Static336.aClass93ArrayArray2[local157] == null) {
						anIntArray164[anInt2191++] = 0;
						return;
					}
					anIntArray164[anInt2191++] = Static336.aClass93ArrayArray2[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					if (Static336.aClass93ArrayArray2[local157] == null) {
						aStringArray11[anInt2189++] = "";
						return;
					}
					local163 = Static336.aClass93ArrayArray2[local157][local741].aString30;
					if (local163 == null) {
						aStringArray11[anInt2189++] = "";
						return;
					}
					aStringArray11[anInt2189++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					if (Static336.aClass93ArrayArray2[local157] == null) {
						anIntArray164[anInt2191++] = 0;
						return;
					}
					anIntArray164[anInt2191++] = Static336.aClass93ArrayArray2[local157][local741].anInt2804;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 1, "", local89);
					return;
				}
				if (arg0 == 6708) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 2, "", local89);
					return;
				}
				if (arg0 == 6709) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 3, "", local89);
					return;
				}
				if (arg0 == 6710) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 4, "", local89);
					return;
				}
				if (arg0 == 6711) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 5, "", local89);
					return;
				}
				if (arg0 == 6712) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 6, "", local89);
					return;
				}
				if (arg0 == 6713) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 7, "", local89);
					return;
				}
				if (arg0 == 6714) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 8, "", local89);
					return;
				}
				if (arg0 == 6715) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 9, "", local89);
					return;
				}
				if (arg0 == 6716) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					Static303.method4902(local157 << 16 | local741, 10, "", local89);
					return;
				}
				if (arg0 == 6717) {
					anInt2191 -= 3;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					local89 = anIntArray164[anInt2191 + 2];
					@Pc(8089) Class93 local8089 = Static100.method2145(local89, local157 << 16 | local741);
					Static353.method5744();
					@Pc(8094) Class6_Sub44 local8094 = Static69.method1454(local8089);
					Static178.method3537(local8094.anInt8798, local8094.method7359(), local8089);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8122) Class137 local8122;
				if (arg0 == 6800) {
					local157 = anIntArray164[--anInt2191];
					local8122 = Static17.aClass42_3.method1147(local157);
					if (local8122.aString46 == null) {
						aStringArray11[anInt2189++] = "";
						return;
					}
					aStringArray11[anInt2189++] = local8122.aString46;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray164[--anInt2191];
					local8122 = Static17.aClass42_3.method1147(local157);
					anIntArray164[anInt2191++] = local8122.anInt4328;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray164[--anInt2191];
					local8122 = Static17.aClass42_3.method1147(local157);
					anIntArray164[anInt2191++] = local8122.anInt4313;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray164[--anInt2191];
					local8122 = Static17.aClass42_3.method1147(local157);
					anIntArray164[anInt2191++] = local8122.anInt4326;
					return;
				}
				if (arg0 == 6804) {
					anInt2191 -= 2;
					local157 = anIntArray164[anInt2191];
					local741 = anIntArray164[anInt2191 + 1];
					@Pc(8244) Class99 local8244 = Static499.aClass118_2.method3497(local741);
					if (local8244.method2523()) {
						aStringArray11[anInt2189++] = Static17.aClass42_3.method1147(local157).method3763(local741, local8244.aString35);
						return;
					}
					anIntArray164[anInt2191++] = Static17.aClass42_3.method1147(local157).method3772(local8244.anInt2851, local741);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray164[anInt2191++] = Static200.aBoolean349 && !Static554.aBoolean702 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray164[anInt2191++] = Static70.anInt1700;
					return;
				}
				if (arg0 == 6902) {
					anIntArray164[anInt2191++] = Static385.anInt7230;
					return;
				}
				if (arg0 == 6903) {
					anIntArray164[anInt2191++] = Static49.anInt1350;
					return;
				}
				if (arg0 == 6904) {
					anIntArray164[anInt2191++] = Static444.anInt8180;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static255.aClass280_4 != null) {
						if (Static255.aClass280_4.anObject16 == null) {
							local75 = Static258.method4481(Static255.aClass280_4.anInt8466);
						} else {
							local75 = (String) Static255.aClass280_4.anObject16;
						}
					}
					aStringArray11[anInt2189++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray164[anInt2191++] = Static177.anInt3968;
					return;
				}
				if (arg0 == 6907) {
					anIntArray164[anInt2191++] = Static429.anInt7863;
					return;
				}
				if (arg0 == 6908) {
					anIntArray164[anInt2191++] = Static536.anInt9249;
					return;
				}
				if (arg0 == 6909) {
					anIntArray164[anInt2191++] = Static448.aBoolean602 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray164[anInt2191++] = Static179.anInt3991;
					return;
				}
				if (arg0 == 6911) {
					anIntArray164[anInt2191++] = Static381.anInt7162;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static104.aClass6_Sub6_Sub1_4.method1067();
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1197 = Static5.anInt145;
					anIntArray164[anInt2191++] = local157;
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 7001) {
					Static104.aClass6_Sub6_Sub1_4.method1069();
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 7002) {
					Static104.aClass6_Sub6_Sub1_4.method1080();
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 7003) {
					Static104.aClass6_Sub6_Sub1_4.method1068();
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 7004) {
					Static104.aClass6_Sub6_Sub1_4.method1073();
					Static190.method3621();
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 7005) {
					Static104.aClass6_Sub6_Sub1_4.anInt1157 = 0;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static104.aClass6_Sub6_Sub1_4.anInt1197 == 2) {
						Static104.aClass6_Sub6_Sub1_4.aBoolean142 = true;
						return;
					}
					if (Static104.aClass6_Sub6_Sub1_4.anInt1197 == 1) {
						Static104.aClass6_Sub6_Sub1_4.aBoolean139 = true;
						return;
					}
					if (Static104.aClass6_Sub6_Sub1_4.anInt1197 == 3) {
						Static104.aClass6_Sub6_Sub1_4.aBoolean143 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray164[anInt2191++] = Static104.aClass6_Sub6_Sub1_4.anInt1157;
					return;
				}
				if (arg0 == 7008) {
					if (Static5.anInt145 == 0 && Static205.anInt4372 < 96) {
						anIntArray164[anInt2191++] = 2;
						return;
					}
					anIntArray164[anInt2191++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(IZ)V")
	public static void method1991() {
	}
}
