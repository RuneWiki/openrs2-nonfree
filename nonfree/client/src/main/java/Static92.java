import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "Lclient!v;")
	private static Class76 aClass76_966 = Static134.method2017("You can(Wt add yourself to your own ignore list");

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Lclient!pc;")
	public static Class55 aClass55_1 = new Class55();

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
	public static volatile int anInt2149 = 0;

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "Lclient!v;")
	public static Class76 aClass76_967 = aClass76_966;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
	public static int anInt2151 = 0;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	public static int anInt2152 = -1;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Lclient!v;")
	private static Class76 aClass76_968 = Static134.method2017(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
	public static void method1495() {
		aClass76_966 = null;
		aBooleanArray13 = null;
		aClass55_1 = null;
		aClass76_967 = null;
		aClass76_968 = null;
		aByteArrayArray9 = null;
		anIntArray304 = null;
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
	public static void method1496() {
		Static6.aClass76_50 = Static19.aClass76_493;
		Static96.aClass76_1014 = Static34.aClass76_410;
		Static102.aClass76_1074 = Static100.aClass76_1051;
		Static104.aClass76_1092 = Static55.aClass76_616;
		Static31.aClass76_300 = Static91.aClass76_951;
		Static15.aClass76_132 = Static84.aClass76_897;
		Static78.aClass76_863 = Static32.aClass76_327;
		Static105.aClass76_1102 = Static17.aClass76_146;
		Static60.aClass76_656 = Static74.aClass76_816;
		Static33.aClass76_380 = Static98.aClass76_1039;
		Static38.aClass76_464 = Static34.aClass76_411;
		Static33.aClass76_399 = Static100.aClass76_1056;
		Static35.aClass76_417 = Static123.aClass76_1256;
		Static25.aClass76_221 = Static100.aClass76_1060;
		Static40.aClass76_481 = Static24.aClass76_207;
		Static99.aClass76_1302 = Static33.aClass76_388;
		Static94.aClass76_973 = Static85.aClass76_909;
		Static45.aClass76_524 = Static6.aClass76_53;
		Static33.aClass76_386 = Static94.aClass76_977;
		Static100.aClass76_1057 = Static40.aClass76_483;
		Static6.aClass76_48 = Static61.aClass76_663;
		Static127.aClass76_1288 = Static100.aClass76_1061;
		Static33.aClass76_396 = Static100.aClass76_1056;
		Static45.aClass76_523 = Static21.aClass76_197;
		Static33.aClass76_375 = Static100.aClass76_1056;
		Static121.aClass76_1235 = Static132.aClass76_1317;
		Static21.aClass76_192 = Static13.aClass76_105;
		Static26.aClass76_228 = Static27.aClass76_1316;
		Static33.aClass76_395 = Static30.aClass76_610;
		Static115.aClass76_1178 = Static117.aClass76_1202;
		Static33.aClass76_385 = Static98.aClass76_1043;
		Static133.aClass76_1325 = Static84.aClass76_894;
		Static28.aClass76_239 = Static95.aClass76_997;
		Static47.aClass76_539 = Static101.aClass76_1064;
		Static130.aClass76_1308 = Static90.aClass76_940;
		Static14.aClass76_121 = Static79.aClass76_356;
		Static21.aClass76_199 = Static111.aClass76_1147;
		Static14.aClass76_122 = Static55.aClass76_617;
		Static33.aClass76_400 = Static122.aClass76_1244;
		Static79.aClass76_357 = Static64.aClass76_685;
		Static123.aClass76_1257 = Static119.aClass76_1218;
		Static33.aClass76_374 = Static100.aClass76_1056;
		Static38.aClass76_462 = Static120.aClass76_1220;
		Static82.aClass76_890 = aClass76_968;
		Static90.aClass76_944 = Static38.aClass76_465;
		Static59.aClass76_642 = Static2.aClass76_24;
		Static33.aClass76_387 = Static100.aClass76_1056;
		Static35.aClass76_412 = Static47.aClass76_537;
		Static95.aClass76_990 = Static103.aClass76_1091;
		Static87.aClass76_838 = Static49.aClass76_554;
		Static1.aClass76_4 = Static84.aClass76_899;
		Static33.aClass76_409 = Static100.aClass76_1056;
		Static51.aClass76_923 = Static49.aClass76_559;
		Static79.aClass76_364 = Static5.aClass76_44;
		Static100.aClass76_1054 = Static97.aClass76_1027;
		Static63.aClass76_681 = Static103.aClass76_1090;
		Static82.aClass76_887 = Static124.aClass76_1270;
		Static123.aClass76_1260 = Static13.aClass76_103;
		Static43.aClass76_142 = Static82.aClass76_885;
		Static54.aClass76_1197 = Static41.aClass76_489;
		Static96.aClass76_1013 = Static114.aClass76_1161;
		Static33.aClass76_393 = Static45.aClass76_522;
		Static84.aClass76_898 = Static7.aClass76_61;
		Static33.aClass76_406 = Static100.aClass76_1056;
		Static95.aClass76_992 = Static60.aClass76_657;
		Static75.aClass76_827 = Static112.aClass76_1158;
		Static3.aClass76_982 = Static127.aClass76_1286;
		Static27.aClass76_1315 = Static56.aClass76_625;
		Static55.aClass76_618 = Static120.aClass76_1221;
		Static102.aClass76_1072 = Static117.aClass76_1201;
		Static33.aClass76_382 = Static100.aClass76_1056;
		Static18.aClass76_149 = Static94.aClass76_975;
		Static24.aClass76_209 = Static36.aClass76_435;
		Static111.aClass76_1152 = Static42.aClass76_499;
		Static134.aClass76_1330 = Static35.aClass76_414;
		Static95.aClass76_996 = Static52.aClass76_587;
		Static45.aClass76_521 = Static72.aClass76_809;
		Static14.aClass76_116 = Static134.aClass76_1329;
		Static33.aClass76_398 = Static100.aClass76_1056;
		Static20.aClass76_181 = Static100.aClass76_1055;
		Static33.aClass76_401 = Static100.aClass76_1056;
		Static48.aClass76_543 = Static115.aClass76_1181;
		Static33.aClass76_372 = Static100.aClass76_1056;
		Static75.aClass76_823 = Static48.aClass76_540;
		Static82.aClass76_888 = Static14.aClass76_117;
		Static28.aClass76_234 = Static95.aClass76_997;
		Static33.aClass76_404 = Static98.aClass76_1039;
		Static88.aClass76_932 = Static85.aClass76_906;
		Static68.aClass76_724 = Static101.aClass76_1067;
		Static87.aClass76_839 = Static77.aClass76_834;
		Static33.aClass76_369 = Static100.aClass76_1056;
		Static57.aClass76_635 = Static45.aClass76_516;
		Static130.aClass76_1310 = Static20.aClass76_182;
		Static33.aClass76_408 = Static103.aClass76_1088;
		Static30.aClass76_608 = Static98.aClass76_1040;
		Static122.aClass76_1242 = Static91.aClass76_952;
		Static62.aClass76_676 = Static18.aClass76_153;
		Static102.aClass76_1075 = Static100.aClass76_1051;
		Static55.aClass76_615 = Static78.aClass76_866;
		Static72.aClass76_810 = Static124.aClass76_1271;
		Static28.aClass76_233 = Static124.aClass76_1262;
		Static95.aClass76_991 = Static48.aClass76_542;
		Static33.aClass76_384 = Static79.aClass76_358;
		Static33.aClass76_402 = Static100.aClass76_1056;
		Static93.aClass76_972 = Static66.aClass76_706;
		Static79.aClass76_365 = Static28.aClass76_240;
		Static33.aClass76_407 = Static100.aClass76_1056;
		Static79.aClass76_367 = Static35.aClass76_413;
		Static33.aClass76_394 = Static100.aClass76_1056;
		Static33.aClass76_371 = Static100.aClass76_1056;
		Static110.aClass76_1129 = Static121.aClass76_1234;
		Static110.aClass76_1131 = Static124.aClass76_1263;
		Static91.aClass76_950 = Static127.aClass76_1292;
		Static18.aClass76_155 = Static99.aClass76_1300;
		Static66.aClass76_704 = Static13.aClass76_110;
		Static73.aClass76_814 = Static124.aClass76_1264;
		Static65.aClass76_172 = Static19.aClass76_496;
		Static87.aClass76_842 = Static25.aClass76_225;
		Static25.aClass76_226 = Static8.aClass76_70;
		Static90.aClass76_941 = Static130.aClass76_1304;
		Static69.aClass76_744 = Static126.aClass76_1285;
		Static61.aClass76_665 = Static56.aClass76_620;
		Static32.aClass76_328 = Static27.aClass76_1314;
		Static105.aClass76_1104 = Static82.aClass76_883;
		Static118.aClass76_1216 = Static52.aClass76_588;
		Static124.aClass76_1265 = Static78.aClass76_853;
		Static122.aClass76_1241 = Static28.aClass76_236;
		Static85.aClass76_905 = Static75.aClass76_822;
		Static75.aClass76_821 = Static48.aClass76_540;
		Static130.aClass76_1306 = Static103.aClass76_1089;
		Static33.aClass76_390 = Static45.aClass76_520;
		Static74.aClass76_817 = Static124.aClass76_1266;
		Static75.aClass76_829 = Static81.aClass76_877;
		Static51.aClass76_921 = Static12.aClass76_99;
		Static29.aClass76_244 = Static82.aClass76_886;
		Static32.aClass76_332 = Static15.aClass76_131;
		Static20.aClass76_179 = Static21.aClass76_191;
		Static91.aClass76_949 = Static122.aClass76_1248;
		Static20.aClass76_176 = Static103.aClass76_1088;
		Static90.aClass76_939 = Static17.aClass76_147;
		Static33.aClass76_397 = Static95.aClass76_989;
		Static51.aClass76_919 = Static33.aClass76_370;
		Static10.aClass76_94 = Static101.aClass76_1068;
		Static50.aClass76_568 = Static58.aClass76_640;
		Static77.aClass76_833 = Static118.aClass76_1214;
		Static33.aClass76_392 = Static100.aClass76_1056;
		Static33.aClass76_405 = Static76.aClass76_830;
		Static72.aClass76_811 = Static120.aClass76_1223;
		Static1.aClass76_2 = Static32.aClass76_331;
		Static94.aClass76_974 = Static93.aClass76_969;
		Static33.aClass76_381 = Static100.aClass76_1056;
		Static50.aClass76_569 = Static97.aClass76_1028;
		Static29.aClass76_246 = Static106.aClass76_1110;
		Static20.aClass76_180 = Static103.aClass76_1088;
		Static19.aClass76_495 = Static67.aClass76_723;
		Static33.aClass76_378 = Static100.aClass76_1056;
		Static133.aClass76_1323 = Static63.aClass76_678;
		Static20.aClass76_183 = Static103.aClass76_1088;
		Static56.aClass76_623 = Static66.aClass76_703;
		Static13.aClass76_107 = Static102.aClass76_1079;
		Static18.aClass76_158 = Static61.aClass76_664;
		Static13.aClass76_106 = Static7.aClass76_63;
		Static18.aClass76_152 = Static28.aClass76_230;
		Static67.aClass76_719 = Static113.aClass76_1159;
		Static47.aClass76_538 = Static59.aClass76_641;
		Static20.aClass76_177 = Static21.aClass76_191;
		Static67.aClass76_718 = Static95.aClass76_993;
		Static124.aClass76_1269 = Static60.aClass76_660;
		Static124.aClass76_1276 = Static18.aClass76_154;
		Static98.aClass76_1042 = Static29.aClass76_241;
		Static40.aClass76_482 = Static41.aClass76_491;
		Static124.aClass76_1272 = Static78.aClass76_853;
		Static60.aClass76_659 = Static96.aClass76_1011;
		Static33.aClass76_379 = Static100.aClass76_1056;
		Static33.aClass76_383 = Static100.aClass76_1056;
		Static10.aClass76_92 = Static12.aClass76_98;
		Static123.aClass76_1259 = Static96.aClass76_1012;
		Static125.aClass76_1284 = Static96.aClass76_1008;
		Static33.aClass76_403 = Static102.aClass76_1078;
		Static102.aClass76_1085 = Static87.aClass76_841;
		Static29.aClass76_245 = Static100.aClass76_1056;
		Static9.aClass76_71 = Static31.aClass76_303;
		Static102.aClass76_1083 = Static64.aClass76_686;
		Static81.aClass76_876 = Static58.aClass76_639;
		Static117.aClass76_1204 = Static21.aClass76_198;
		Static28.aClass76_235 = Static121.aClass76_1239;
		Static101.aClass76_1066 = Static17.aClass76_145;
		aClass76_967 = Static113.aClass76_1160;
		Static63.aClass76_679 = Static121.aClass76_1240;
		Static33.aClass76_376 = Static79.aClass76_358;
		Static26.aClass76_227 = Static27.aClass76_1316;
		Static102.aClass76_1070 = Static117.aClass76_1201;
		Static79.aClass76_368 = Static28.aClass76_237;
		Static102.aClass76_1073 = Static123.aClass76_1258;
		Static41.aClass76_490 = Static1.aClass76_1;
		Static36.aClass76_436 = Static24.aClass76_211;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!ie;IZII)V")
	public static void method1497(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub5_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = arg0 * arg0 + arg3 * arg3;
		if (local17 <= 4225 || local17 >= 90000) {
			Static21.method324(arg2, arg3, arg4, arg0, arg1);
			return;
		}
		@Pc(43) int local43 = Static60.anInt1576 + Static14.anInt244 & 0x7FF;
		@Pc(47) int local47 = Class4_Sub4_Sub5_Sub1.anIntArray118[local43];
		@Pc(55) int local55 = local47 * 256 / (Static27.anInt2814 + 256);
		@Pc(59) int local59 = Class4_Sub4_Sub5_Sub1.anIntArray119[local43];
		@Pc(67) int local67 = local59 * 256 / (Static27.anInt2814 + 256);
		@Pc(77) int local77 = arg0 * local55 + local67 * arg3 >> 16;
		@Pc(88) int local88 = arg0 * local67 - arg3 * local55 >> 16;
		@Pc(94) double local94 = Math.atan2((double) local77, (double) local88);
		@Pc(100) int local100 = (int) (Math.sin(local94) * 63.0D);
		@Pc(106) int local106 = (int) (Math.cos(local94) * 57.0D);
		Static90.aClass4_Sub4_Sub5_Sub2_3.method904(local100 + arg2 + 4 + 94 - 10, -local106 + -20 + 83 + arg4, local94);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIB)V")
	public static void method1498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static45.anInt1205 == 0 || arg2 == 0 || Static64.anInt1644 >= 50) {
			return;
		}
		Static68.anIntArray236[Static64.anInt1644] = arg0;
		Static82.anIntArray280[Static64.anInt1644] = arg2;
		Static65.anIntArray62[Static64.anInt1644] = arg1;
		Static68.aClass65Array1[Static64.anInt1644] = null;
		Static50.anIntArray162[Static64.anInt1644] = 0;
		Static64.anInt1644++;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLclient!fd;)V")
	public static void method1499(@OriginalArg(2) Class4_Sub10_Sub1 arg0) {
		while (true) {
			@Pc(14) Class4_Sub19 local14 = (Class4_Sub19) Static124.aClass78_14.method1916();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt2144; local21++) {
				if (local14.aClass24Array2[local21] != null) {
					if (local14.aClass24Array2[local21].anInt814 == 2) {
						local14.anIntArray302[local21] = -5;
					}
					if (local14.aClass24Array2[local21].anInt814 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass24Array1[local21] != null) {
					if (local14.aClass24Array1[local21].anInt814 == 2) {
						local14.anIntArray302[local21] = -6;
					}
					if (local14.aClass24Array1[local21].anInt814 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method611(56);
			arg0.method600(0);
			@Pc(100) int local100 = arg0.anInt931;
			arg0.method597(local14.anInt2143);
			for (@Pc(107) int local107 = 0; local107 < local14.anInt2144; local107++) {
				if (local14.anIntArray302[local107] == 0) {
					try {
						@Pc(131) int local131 = local14.anIntArray301[local107];
						@Pc(143) Field local143;
						@Pc(171) int local171;
						if (local131 == 0) {
							local143 = (Field) local14.aClass24Array2[local107].anObject10;
							local171 = local143.getInt(null);
							arg0.method600(0);
							arg0.method597(local171);
						} else if (local131 == 1) {
							local143 = (Field) local14.aClass24Array2[local107].anObject10;
							local143.setInt(null, local14.anIntArray303[local107]);
							arg0.method600(0);
						} else if (local131 == 2) {
							local143 = (Field) local14.aClass24Array2[local107].anObject10;
							local171 = local143.getModifiers();
							arg0.method600(0);
							arg0.method597(local171);
						}
						@Pc(215) Method local215;
						if (local131 == 3) {
							local215 = (Method) local14.aClass24Array1[local107].anObject10;
							@Pc(240) byte[][] local240 = local14.aByteArrayArrayArray6[local107];
							@Pc(244) Object[] local244 = new Object[local240.length];
							for (@Pc(246) int local246 = 0; local246 < local240.length; local246++) {
								@Pc(258) ObjectInputStream local258 = new ObjectInputStream(new ByteArrayInputStream(local240[local246]));
								local244[local246] = local258.readObject();
							}
							@Pc(277) Object local277 = local215.invoke(null, local244);
							if (local277 == null) {
								arg0.method600(0);
							} else if (local277 instanceof Number) {
								arg0.method600(1);
								arg0.method555(((Number) local277).longValue());
							} else if (local277 instanceof Class76) {
								arg0.method600(2);
								arg0.method571((Class76) local277);
							} else {
								arg0.method600(4);
							}
						} else if (local131 == 4) {
							local215 = (Method) local14.aClass24Array1[local107].anObject10;
							local171 = local215.getModifiers();
							arg0.method600(0);
							arg0.method597(local171);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method600(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method600(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method600(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method600(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method600(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method600(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method600(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method600(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method600(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method600(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method600(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method600(-21);
					}
				} else {
					arg0.method600(local14.anIntArray302[local107]);
				}
			}
			arg0.method561(local100);
			arg0.method558(arg0.anInt931 - local100);
			local14.method2004();
		}
	}
}
