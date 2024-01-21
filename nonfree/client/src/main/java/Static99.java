import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!ga;")
	public static Class29 aClass29_21;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1504 = Static80.method1463("b12_full");

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1509 = Static80.method1463("Bad session id)3");

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1505 = aClass63_1509;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1506 = Static80.method1463("Okay");

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public static int anInt2785 = -1;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1507 = Static80.method1463("Regelversto-8 melden");

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1508 = Static80.method1463("mod_icons");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1834() {
		aClass63_1508 = null;
		anObject4 = null;
		aClass63_1505 = null;
		aClass63_1507 = null;
		anIntArray295 = null;
		aClass63_1504 = null;
		aClass63_1506 = null;
		aClass63_1509 = null;
		aClass29_21 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method1835(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static48.aBoolean74) {
			try {
				@Pc(23) Class59 local23 = (Class59) Class.forName("Class59_Sub1").getDeclaredConstructor().newInstance();
				local23.method1860(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static48.aBoolean74 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B[Ljava/lang/Object;Lclient!wa;IILclient!wa;I)V")
	public static void method1836(@OriginalArg(1) Object[] arg0, @OriginalArg(2) Class6_Sub3_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub3_Sub17 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = (Integer) arg0[0];
		@Pc(15) Class6_Sub3_Sub9 local15 = Static105.method1903(local11);
		if (local15 == null) {
			return;
		}
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int[] local31 = local15.anIntArray177;
		@Pc(34) int[] local34 = local15.anIntArray180;
		@Pc(36) byte local36 = -1;
		try {
			Static115.aClass63Array22 = new Class63[local15.anInt1639];
			@Pc(42) int local42 = 0;
			Static88.anIntArray281 = new int[local15.anInt1640];
			@Pc(48) int local48 = 0;
			@Pc(78) int local78;
			for (@Pc(50) int local50 = 1; local50 < arg0.length; local50++) {
				if (arg0[local50] instanceof Integer) {
					local78 = (Integer) arg0[local50];
					if (local78 == -2147483647) {
						local78 = arg5;
					}
					if (local78 == -2147483646) {
						local78 = arg3;
					}
					if (local78 == -2147483645) {
						local78 = arg1 == null ? -1 : arg1.anInt3233;
					}
					if (local78 == -2147483644) {
						local78 = arg2;
					}
					if (local78 == -2147483643) {
						local78 = arg1 == null ? -1 : arg1.anInt3283;
					}
					if (local78 == -2147483642) {
						local78 = arg4 == null ? -1 : arg4.anInt3233;
					}
					if (local78 == -2147483641) {
						local78 = arg4 == null ? -1 : arg4.anInt3283;
					}
					Static88.anIntArray281[local42++] = local78;
				} else if (arg0[local50] instanceof Class63) {
					Static115.aClass63Array22[local48++] = (Class63) arg0[local50];
				}
			}
			local78 = 0;
			label1235: while (true) {
				local78++;
				if (local78 > 200000) {
					throw new RuntimeException("slow");
				}
				local26++;
				@Pc(167) int local167 = local31[local26];
				@Pc(722) int local722;
				@Pc(600) int local600;
				@Pc(579) int local579;
				@Pc(711) int local711;
				@Pc(537) Class63 local537;
				if (local167 < 100) {
					if (local167 == 0) {
						Static23.anIntArray275[local28++] = local34[local26];
						continue;
					}
					@Pc(188) int local188;
					if (local167 == 1) {
						local188 = local34[local26];
						Static23.anIntArray275[local28++] = Static89.anIntArray283[local188];
						continue;
					}
					if (local167 == 2) {
						local188 = local34[local26];
						local28--;
						Static89.anIntArray283[local188] = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 3) {
						Static42.aClass63Array10[local24++] = local15.aClass63Array14[local26];
						continue;
					}
					if (local167 == 6) {
						local26 += local34[local26];
						continue;
					}
					if (local167 == 7) {
						local28 -= 2;
						if (Static23.anIntArray275[local28] != Static23.anIntArray275[local28 + 1]) {
							local26 += local34[local26];
						}
						continue;
					}
					if (local167 == 8) {
						local28 -= 2;
						if (Static23.anIntArray275[local28 + 1] == Static23.anIntArray275[local28]) {
							local26 += local34[local26];
						}
						continue;
					}
					if (local167 == 9) {
						local28 -= 2;
						if (Static23.anIntArray275[local28] < Static23.anIntArray275[local28 + 1]) {
							local26 += local34[local26];
						}
						continue;
					}
					if (local167 == 10) {
						local28 -= 2;
						if (Static23.anIntArray275[local28 + 1] < Static23.anIntArray275[local28]) {
							local26 += local34[local26];
						}
						continue;
					}
					if (local167 == 21) {
						if (Static4.anInt40 == 0) {
							return;
						}
						@Pc(354) Class31 local354 = Static24.aClass31Array1[--Static4.anInt40];
						Static88.anIntArray281 = local354.anIntArray167;
						local15 = local354.aClass6_Sub3_Sub9_1;
						local26 = local354.anInt1506;
						Static115.aClass63Array22 = local354.aClass63Array13;
						local31 = local15.anIntArray177;
						local34 = local15.anIntArray180;
						continue;
					}
					if (local167 == 25) {
						local188 = local34[local26];
						Static23.anIntArray275[local28++] = Static89.method1599(local188);
						continue;
					}
					if (local167 == 27) {
						local188 = local34[local26];
						local28--;
						Static55.method1112(Static23.anIntArray275[local28], local188);
						continue;
					}
					if (local167 == 31) {
						local28 -= 2;
						if (Static23.anIntArray275[local28 + 1] >= Static23.anIntArray275[local28]) {
							local26 += local34[local26];
						}
						continue;
					}
					if (local167 == 32) {
						local28 -= 2;
						if (Static23.anIntArray275[local28 + 1] <= Static23.anIntArray275[local28]) {
							local26 += local34[local26];
						}
						continue;
					}
					if (local167 == 33) {
						Static23.anIntArray275[local28++] = Static88.anIntArray281[local34[local26]];
						continue;
					}
					@Pc(483) int local483;
					if (local167 == 34) {
						local483 = local34[local26];
						local28--;
						Static88.anIntArray281[local483] = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 35) {
						Static42.aClass63Array10[local24++] = Static115.aClass63Array22[local34[local26]];
						continue;
					}
					if (local167 == 36) {
						local483 = local34[local26];
						local24--;
						Static115.aClass63Array22[local483] = Static42.aClass63Array10[local24];
						continue;
					}
					if (local167 == 37) {
						local188 = local34[local26];
						local24 -= local188;
						local537 = Static42.method920(local188, Static42.aClass63Array10, local24);
						Static42.aClass63Array10[local24++] = local537;
						continue;
					}
					if (local167 == 38) {
						local28--;
						continue;
					}
					if (local167 == 39) {
						local24--;
						continue;
					}
					if (local167 == 40) {
						local188 = local34[local26];
						@Pc(569) Class6_Sub3_Sub9 local569 = Static105.method1903(local188);
						@Pc(573) int[] local573 = new int[local569.anInt1640];
						@Pc(577) Class63[] local577 = new Class63[local569.anInt1639];
						for (local579 = 0; local579 < local569.anInt1635; local579++) {
							local573[local579] = Static23.anIntArray275[local579 + local28 - local569.anInt1635];
						}
						for (local600 = 0; local600 < local569.anInt1632; local600++) {
							local577[local600] = Static42.aClass63Array10[local600 + local24 - local569.anInt1632];
						}
						local24 -= local569.anInt1632;
						local28 -= local569.anInt1635;
						@Pc(636) Class31 local636 = new Class31();
						local636.aClass63Array13 = Static115.aClass63Array22;
						local636.anIntArray167 = Static88.anIntArray281;
						local636.aClass6_Sub3_Sub9_1 = local15;
						local636.anInt1506 = local26;
						local26 = -1;
						local15 = local569;
						Static24.aClass31Array1[Static4.anInt40++] = local636;
						local31 = local569.anIntArray177;
						Static88.anIntArray281 = local573;
						Static115.aClass63Array22 = local577;
						local34 = local569.anIntArray180;
						continue;
					}
					if (local167 == 42) {
						Static23.anIntArray275[local28++] = Static44.anIntArray157[local34[local26]];
						continue;
					}
					if (local167 == 43) {
						local483 = local34[local26];
						local28--;
						Static44.anIntArray157[local483] = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 44) {
						local711 = local34[local26] & 0xFFFF;
						local188 = local34[local26] >> 16;
						local28--;
						local722 = Static23.anIntArray275[local28];
						if (local722 >= 0 && local722 <= 5000) {
							@Pc(738) byte local738 = -1;
							Static98.anIntArray294[local188] = local722;
							if (local711 == 105) {
								local738 = 0;
							}
							local579 = 0;
							while (true) {
								if (local579 >= local722) {
									continue label1235;
								}
								Static82.anIntArrayArray30[local188][local579] = local738;
								local579++;
							}
						}
						throw new RuntimeException();
					}
					if (local167 == 45) {
						local188 = local34[local26];
						local28--;
						local711 = Static23.anIntArray275[local28];
						if (local711 >= 0 && Static98.anIntArray294[local188] > local711) {
							Static23.anIntArray275[local28++] = Static82.anIntArrayArray30[local188][local711];
							continue;
						}
						throw new RuntimeException();
					}
					if (local167 == 46) {
						local28 -= 2;
						local188 = local34[local26];
						local711 = Static23.anIntArray275[local28];
						if (local711 >= 0 && Static98.anIntArray294[local188] > local711) {
							Static82.anIntArrayArray30[local188][local711] = Static23.anIntArray275[local28 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(841) boolean local841;
				if (local34[local26] == 1) {
					local841 = true;
				} else {
					local841 = false;
				}
				@Pc(993) Class6_Sub3_Sub17 local993;
				@Pc(860) int local860;
				@Pc(901) int local901;
				if (local167 < 1000) {
					if (local167 == 100) {
						local28 -= 3;
						local860 = Static23.anIntArray275[local28 + 2];
						local722 = Static23.anIntArray275[local28 + 1];
						local711 = Static23.anIntArray275[local28];
						if (local722 == 0) {
							throw new RuntimeException();
						}
						@Pc(880) Class6_Sub3_Sub17 local880 = Static12.method339(local711);
						if (local880.aClass6_Sub3_Sub17Array2 == null) {
							local880.aClass6_Sub3_Sub17Array2 = new Class6_Sub3_Sub17[local860 + 1];
						}
						if (local860 >= local880.aClass6_Sub3_Sub17Array2.length) {
							@Pc(899) Class6_Sub3_Sub17[] local899 = new Class6_Sub3_Sub17[local860 + 1];
							for (local901 = 0; local901 < local880.aClass6_Sub3_Sub17Array2.length; local901++) {
								local899[local901] = local880.aClass6_Sub3_Sub17Array2[local901];
							}
							local880.aClass6_Sub3_Sub17Array2 = local899;
						}
						if (local860 > 0 && local880.aClass6_Sub3_Sub17Array2[local860 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local860 - 1));
						}
						@Pc(948) Class6_Sub3_Sub17 local948 = new Class6_Sub3_Sub17();
						local948.aBoolean179 = true;
						local948.anInt3283 = local860;
						local948.anInt3284 = local722;
						local948.anInt3274 = local948.anInt3233 = local880.anInt3233;
						local880.aClass6_Sub3_Sub17Array2[local860] = local948;
						if (local841) {
							Static39.aClass6_Sub3_Sub17_3 = local948;
						} else {
							Static4.aClass6_Sub3_Sub17_1 = local948;
						}
						Static73.method1395(local880);
						continue;
					}
					if (local167 == 101) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
						@Pc(998) Class6_Sub3_Sub17 local998 = Static12.method339(local993.anInt3233);
						local998.aClass6_Sub3_Sub17Array2[local993.anInt3283] = null;
						Static73.method1395(local998);
						continue;
					}
					if (local167 == 102) {
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
						local993.aClass6_Sub3_Sub17Array2 = null;
						Static73.method1395(local993);
						continue;
					}
					if (local167 == 200) {
						local28 -= 2;
						local711 = Static23.anIntArray275[local28];
						local722 = Static23.anIntArray275[local28 + 1];
						@Pc(1048) Class6_Sub3_Sub17 local1048 = Static72.method1384(local722, local711);
						if (local1048 != null && local722 != -1) {
							Static23.anIntArray275[local28++] = 1;
							if (local841) {
								Static39.aClass6_Sub3_Sub17_3 = local1048;
							} else {
								Static4.aClass6_Sub3_Sub17_1 = local1048;
							}
							continue;
						}
						Static23.anIntArray275[local28++] = 0;
						continue;
					}
				} else if (local167 >= 1000 && local167 < 1100 || local167 >= 2000 && local167 < 2100) {
					if (local167 < 2000) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
					} else {
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
						local167 -= 1000;
					}
					Static73.method1395(local993);
					if (local167 == 1000) {
						local28 -= 2;
						local993.anInt3287 = Static23.anIntArray275[local28];
						local993.anInt3221 = Static23.anIntArray275[local28 + 1];
						continue;
					}
					if (local167 == 1001) {
						local28 -= 2;
						local993.anInt3230 = Static23.anIntArray275[local28];
						local993.anInt3264 = Static23.anIntArray275[local28 + 1];
						continue;
					}
					if (local167 == 1003) {
						local28--;
						local993.aBoolean182 = Static23.anIntArray275[local28] == 1;
						continue;
					}
				} else if (local167 >= 1100 && local167 < 1200 || !(local167 < 2100 || local167 >= 2200)) {
					if (local167 < 2000) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
					} else {
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
						local167 -= 1000;
					}
					Static73.method1395(local993);
					if (local167 == 1100) {
						local28 -= 2;
						local993.anInt3243 = Static23.anIntArray275[local28];
						if (local993.anInt3243 > local993.anInt3257 - local993.anInt3230) {
							local993.anInt3243 = local993.anInt3257 - local993.anInt3230;
						}
						if (local993.anInt3243 < 0) {
							local993.anInt3243 = 0;
						}
						local993.anInt3291 = Static23.anIntArray275[local28 + 1];
						if (local993.anInt3291 > local993.anInt3219 - local993.anInt3264) {
							local993.anInt3291 = local993.anInt3219 - local993.anInt3264;
						}
						if (local993.anInt3291 < 0) {
							local993.anInt3291 = 0;
						}
						continue;
					}
					if (local167 == 1101) {
						local28--;
						local993.anInt3269 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1102) {
						local28--;
						local993.aBoolean173 = Static23.anIntArray275[local28] == 1;
						continue;
					}
					if (local167 == 1103) {
						local28--;
						local993.anInt3244 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1104) {
						local28--;
						local993.anInt3282 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1105) {
						local28--;
						local993.anInt3281 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1106) {
						local28--;
						local993.anInt3271 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1107) {
						local28--;
						local993.aBoolean178 = Static23.anIntArray275[local28] == 1;
						continue;
					}
					if (local167 == 1108) {
						local993.anInt3262 = 1;
						local28--;
						local993.anInt3253 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1109) {
						local28 -= 6;
						local993.anInt3220 = Static23.anIntArray275[local28];
						local993.anInt3227 = Static23.anIntArray275[local28 + 1];
						local993.anInt3247 = Static23.anIntArray275[local28 + 2];
						local993.anInt3251 = Static23.anIntArray275[local28 + 3];
						local993.anInt3277 = Static23.anIntArray275[local28 + 4];
						local993.anInt3265 = Static23.anIntArray275[local28 + 5];
						continue;
					}
					if (local167 == 1110) {
						local28--;
						local993.anInt3224 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1111) {
						local28--;
						local993.aBoolean171 = Static23.anIntArray275[local28] == 1;
						continue;
					}
					if (local167 == 1112) {
						local24--;
						local993.aClass63_1765 = Static42.aClass63Array10[local24];
						continue;
					}
					if (local167 == 1113) {
						local28--;
						local993.anInt3263 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1114) {
						local28 -= 3;
						local993.anInt3236 = Static23.anIntArray275[local28];
						local993.anInt3270 = Static23.anIntArray275[local28 + 1];
						local993.anInt3218 = Static23.anIntArray275[local28 + 2];
						continue;
					}
					if (local167 == 1115) {
						local28--;
						local993.aBoolean176 = Static23.anIntArray275[local28] == 1;
						continue;
					}
					if (local167 == 1116) {
						local28--;
						local993.anInt3234 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1117) {
						local28--;
						local993.anInt3268 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1118) {
						local28--;
						local993.aBoolean174 = Static23.anIntArray275[local28] == 1;
						continue;
					}
					if (local167 == 1119) {
						local28--;
						local993.aBoolean181 = Static23.anIntArray275[local28] == 1;
						continue;
					}
					if (local167 == 1120) {
						local28 -= 2;
						local993.anInt3257 = Static23.anIntArray275[local28];
						local993.anInt3219 = Static23.anIntArray275[local28 + 1];
						continue;
					}
				} else if (local167 >= 1200 && local167 < 1300 || !(local167 < 2200 || local167 >= 2300)) {
					if (local167 < 2000) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
					} else {
						local167 -= 1000;
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
					}
					Static73.method1395(local993);
					if (local167 == 1200) {
						local28 -= 2;
						local722 = Static23.anIntArray275[local28];
						local860 = Static23.anIntArray275[local28 + 1];
						local993.anInt3279 = local860;
						local993.anInt3293 = local722;
						@Pc(1240) Class6_Sub3_Sub8 local1240 = Static91.method1664(local722);
						local993.anInt3227 = local1240.anInt1360;
						local993.anInt3247 = local1240.anInt1397;
						local993.anInt3220 = local1240.anInt1380;
						local993.anInt3251 = local1240.anInt1359;
						local993.anInt3265 = local1240.anInt1358;
						local993.anInt3277 = local1240.anInt1367;
						if (local993.anInt3230 > 0) {
							local993.anInt3265 = local993.anInt3265 * 32 / local993.anInt3230;
						}
						continue;
					}
					if (local167 == 1201) {
						local993.anInt3262 = 2;
						local28--;
						local993.anInt3253 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1202) {
						local993.anInt3262 = 3;
						local993.anInt3253 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass21_1.method713();
						continue;
					}
				} else if ((local167 < 1300 || local167 >= 1400) && (local167 < 2300 || local167 >= 2400)) {
					@Pc(2819) Class63 local2819;
					if (local167 >= 1400 && local167 < 1500 || local167 >= 2400 && local167 < 2500) {
						if (local167 < 2000) {
							local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
						} else {
							local167 -= 1000;
							local28--;
							local993 = Static12.method339(Static23.anIntArray275[local28]);
						}
						local24--;
						local2819 = Static42.aClass63Array10[local24];
						@Pc(3751) Object[] local3751 = new Object[local2819.method1811() + 1];
						for (local579 = local3751.length - 1; local579 >= 1; local579--) {
							if (local2819.method1810(local579 - 1) == 115) {
								local24--;
								local3751[local579] = Static42.aClass63Array10[local24];
							} else {
								local28--;
								local3751[local579] = Integer.valueOf(Static23.anIntArray275[local28]);
							}
						}
						local28--;
						local3751[0] = Integer.valueOf(Static23.anIntArray275[local28]);
						if (local167 == 1408) {
							local993.anObjectArray13 = local3751;
						}
						if (local167 == 1403) {
							local993.anObjectArray10 = local3751;
						}
						if (local167 == 1409) {
							local993.anObjectArray7 = local3751;
						}
						if (local167 == 1412) {
							local993.anObjectArray11 = local3751;
						}
						if (local167 == 1404) {
							local993.anObjectArray4 = local3751;
						}
						if (local167 == 1415) {
							local993.anObjectArray15 = local3751;
						}
						if (local167 == 1407) {
							local993.anObjectArray8 = local3751;
						}
						if (local167 == 1413) {
							local993.anObjectArray21 = local3751;
						}
						if (local167 == 1411) {
							local993.anObjectArray18 = local3751;
						}
						if (local167 == 1405) {
							local993.anObjectArray20 = local3751;
						}
						if (local167 == 1406) {
							local993.anObjectArray3 = local3751;
						}
						if (local167 == 1400) {
							local993.anObjectArray16 = local3751;
						}
						if (local167 == 1417) {
							local993.anObjectArray5 = local3751;
						}
						if (local167 == 1410) {
							local993.anObjectArray12 = local3751;
						}
						if (local167 == 1416) {
							local993.anObjectArray6 = local3751;
						}
						local993.aBoolean175 = true;
						if (local167 == 1401) {
							local993.anObjectArray9 = local3751;
						}
						if (local167 == 1402) {
							local993.anObjectArray14 = local3751;
						}
						if (local167 == 1414) {
							local993.anObjectArray17 = local3751;
						}
						continue;
					}
					if (local167 < 1600) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
						if (local167 == 1500) {
							Static23.anIntArray275[local28++] = local993.anInt3287;
							continue;
						}
						if (local167 == 1501) {
							Static23.anIntArray275[local28++] = local993.anInt3221;
							continue;
						}
						if (local167 == 1502) {
							Static23.anIntArray275[local28++] = local993.anInt3230;
							continue;
						}
						if (local167 == 1503) {
							Static23.anIntArray275[local28++] = local993.anInt3264;
							continue;
						}
						if (local167 == 1504) {
							Static23.anIntArray275[local28++] = local993.aBoolean182 ? 1 : 0;
							continue;
						}
						if (local167 == 1505) {
							Static23.anIntArray275[local28++] = local993.anInt3274;
							continue;
						}
					} else if (local167 < 1700) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
						if (local167 == 1600) {
							Static23.anIntArray275[local28++] = local993.anInt3243;
							continue;
						}
						if (local167 == 1601) {
							Static23.anIntArray275[local28++] = local993.anInt3291;
							continue;
						}
						if (local167 == 1602) {
							Static42.aClass63Array10[local24++] = local993.aClass63_1765;
							continue;
						}
						if (local167 == 1603) {
							Static23.anIntArray275[local28++] = local993.anInt3257;
							continue;
						}
						if (local167 == 1604) {
							Static23.anIntArray275[local28++] = local993.anInt3219;
							continue;
						}
						if (local167 == 1605) {
							Static23.anIntArray275[local28++] = local993.anInt3265;
							continue;
						}
					} else if (local167 < 1800) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
						if (local167 == 1700) {
							Static23.anIntArray275[local28++] = local993.anInt3293;
							continue;
						}
						if (local167 == 1701) {
							if (local993.anInt3293 == -1) {
								Static23.anIntArray275[local28++] = 0;
							} else {
								Static23.anIntArray275[local28++] = local993.anInt3279;
							}
							continue;
						}
						if (local167 == 1702) {
							Static23.anIntArray275[local28++] = local993.anInt3283;
							continue;
						}
					} else if (local167 < 1900) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
						if (local167 == 1800) {
							Static23.anIntArray275[local28++] = Static47.method1027(Static82.method1498(local993));
							continue;
						}
					} else if (local167 < 2600) {
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
						if (local167 == 2500) {
							Static23.anIntArray275[local28++] = local993.anInt3287;
							continue;
						}
						if (local167 == 2501) {
							Static23.anIntArray275[local28++] = local993.anInt3221;
							continue;
						}
						if (local167 == 2502) {
							Static23.anIntArray275[local28++] = local993.anInt3230;
							continue;
						}
						if (local167 == 2503) {
							Static23.anIntArray275[local28++] = local993.anInt3264;
							continue;
						}
						if (local167 == 2504) {
							Static23.anIntArray275[local28++] = local993.aBoolean182 ? 1 : 0;
							continue;
						}
						if (local167 == 2505) {
							Static23.anIntArray275[local28++] = local993.anInt3274;
							continue;
						}
					} else if (local167 < 2700) {
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
						if (local167 == 2600) {
							Static23.anIntArray275[local28++] = local993.anInt3243;
							continue;
						}
						if (local167 == 2601) {
							Static23.anIntArray275[local28++] = local993.anInt3291;
							continue;
						}
						if (local167 == 2602) {
							Static42.aClass63Array10[local24++] = local993.aClass63_1765;
							continue;
						}
						if (local167 == 2603) {
							Static23.anIntArray275[local28++] = local993.anInt3257;
							continue;
						}
						if (local167 == 2604) {
							Static23.anIntArray275[local28++] = local993.anInt3219;
							continue;
						}
						if (local167 == 2605) {
							Static23.anIntArray275[local28++] = local993.anInt3265;
							continue;
						}
					} else if (local167 < 2800) {
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
						if (local167 == 2700) {
							Static23.anIntArray275[local28++] = local993.anInt3293;
							continue;
						}
						if (local167 == 2701) {
							if (local993.anInt3293 == -1) {
								Static23.anIntArray275[local28++] = 0;
							} else {
								Static23.anIntArray275[local28++] = local993.anInt3279;
							}
							continue;
						}
					} else if (local167 < 2900) {
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
						if (local167 == 2800) {
							Static23.anIntArray275[local28++] = Static47.method1027(Static82.method1498(local993));
							continue;
						}
					} else if (local167 < 3200) {
						if (local167 == 3100) {
							local24--;
							local537 = Static42.aClass63Array10[local24];
							Static46.method996(Static118.aClass63_1735, 0, local537);
							continue;
						}
						if (local167 == 3101) {
							local28 -= 2;
							Static54.method1090(Static23.anIntArray275[local28], Static23.anIntArray275[local28 + 1], Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1);
							continue;
						}
						if (local167 == 3102) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							if (local711 >= 0 && local711 < Static111.anIntArray352.length && Static111.anIntArray352[local711] != -1) {
								Static12.aBoolean22 = true;
								Static86.anInt2366 = local711;
								Static10.aBoolean20 = true;
							}
							continue;
						}
						if (local167 == 3103) {
							Static17.method1723();
							continue;
						}
					} else if (local167 < 3300) {
						if (local167 == 3200) {
							local28 -= 3;
							Static6.method63(Static23.anIntArray275[local28], Static23.anIntArray275[local28 + 1], Static23.anIntArray275[local28 + 2]);
							continue;
						}
						if (local167 == 3201) {
							local28--;
							Static123.method2167(Static23.anIntArray275[local28]);
							continue;
						}
						if (local167 == 3202) {
							local28 -= 2;
							Static105.method1897(Static23.anIntArray275[local28], Static23.anIntArray275[local28 + 1]);
							continue;
						}
					} else if (local167 < 3400) {
						if (local167 == 3300) {
							Static23.anIntArray275[local28++] = Static73.anInt2064;
							continue;
						}
						if (local167 == 3301) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28];
							local722 = Static23.anIntArray275[local28 + 1];
							Static23.anIntArray275[local28++] = Static69.method1360(local711, local722);
							continue;
						}
						if (local167 == 3302) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28];
							local722 = Static23.anIntArray275[local28 + 1];
							Static23.anIntArray275[local28++] = Static42.method932(local711, local722);
							continue;
						}
						if (local167 == 3303) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = Static115.method2094(local722, local711);
							continue;
						}
						if (local167 == 3304) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = Static106.method1921(local711).anInt682;
							continue;
						}
						if (local167 == 3305) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = Static76.anIntArray240[local711];
							continue;
						}
						if (local167 == 3306) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = Static74.anIntArray234[local711];
							continue;
						}
						if (local167 == 3307) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = Static38.anIntArray142[local711];
							continue;
						}
						if (local167 == 3308) {
							local722 = (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 >> 7) + Static80.anInt2169;
							local711 = Static101.anInt2810;
							local860 = Static91.anInt2560 + (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 >> 7);
							Static23.anIntArray275[local28++] = (local711 << 28) + ((local722 << 14) + local860);
							continue;
						}
						if (local167 == 3309) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local711 >> 14 & 0x3FFF;
							continue;
						}
						if (local167 == 3310) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local711 >> 28;
							continue;
						}
						if (local167 == 3311) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local711 & 0x3FFF;
							continue;
						}
						if (local167 == 3312) {
							Static23.anIntArray275[local28++] = Static30.aBoolean49 ? 1 : 0;
							continue;
						}
						if (local167 == 3313) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28] + 32768;
							Static23.anIntArray275[local28++] = Static69.method1360(local711, local722);
							continue;
						}
						if (local167 == 3314) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28] + 32768;
							local722 = Static23.anIntArray275[local28 + 1];
							Static23.anIntArray275[local28++] = Static42.method932(local711, local722);
							continue;
						}
						if (local167 == 3315) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28] + 32768;
							local722 = Static23.anIntArray275[local28 + 1];
							Static23.anIntArray275[local28++] = Static115.method2094(local722, local711);
							continue;
						}
					} else if (local167 < 3700) {
						if (local167 == 3600) {
							if (Static78.anInt2156 == 0) {
								Static23.anIntArray275[local28++] = -2;
							} else if (Static78.anInt2156 == 1) {
								Static23.anIntArray275[local28++] = -1;
							} else {
								Static23.anIntArray275[local28++] = Static5.anInt52;
							}
							continue;
						}
						if (local167 == 3601) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							if (Static78.anInt2156 == 2 && Static5.anInt52 > local711) {
								Static42.aClass63Array10[local24++] = Static65.aClass63Array16[local711];
								continue;
							}
							Static42.aClass63Array10[local24++] = Static118.aClass63_1735;
							continue;
						}
						if (local167 == 3602) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							if (Static78.anInt2156 == 2 && Static5.anInt52 > local711) {
								Static23.anIntArray275[local28++] = Static31.anIntArray127[local711];
								continue;
							}
							Static23.anIntArray275[local28++] = 0;
							continue;
						}
						if (local167 == 3603) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							if (Static78.anInt2156 == 2 && local711 < Static5.anInt52) {
								Static23.anIntArray275[local28++] = Static12.anIntArray50[local711];
								continue;
							}
							Static23.anIntArray275[local28++] = 0;
							continue;
						}
						if (local167 == 3604) {
							local24--;
							local537 = Static42.aClass63Array10[local24];
							local28--;
							local722 = Static23.anIntArray275[local28];
							Static12.method340(local537, local722);
							continue;
						}
					} else if (local167 < 4100) {
						if (local167 == 4000) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local722 + local711;
							continue;
						}
						if (local167 == 4001) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local711 - local722;
							continue;
						}
						if (local167 == 4002) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local711 * local722;
							continue;
						}
						if (local167 == 4003) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local711 / local722;
							continue;
						}
						if (local167 == 4004) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = (int) ((double) local711 * Math.random());
							continue;
						}
						if (local167 == 4005) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = (int) ((double) (local711 + 1) * Math.random());
							continue;
						}
						if (local167 == 4006) {
							local28 -= 5;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							local579 = Static23.anIntArray275[local28 + 3];
							local600 = Static23.anIntArray275[local28 + 4];
							local860 = Static23.anIntArray275[local28 + 2];
							Static23.anIntArray275[local28++] = (local722 - local711) * (-local860 + local600) / (local579 - local860) + local711;
							continue;
						}
						if (local167 == 4007) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local711 + local711 * local722 / 100;
							continue;
						}
						if (local167 == 4008) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28];
							local722 = Static23.anIntArray275[local28 + 1];
							Static23.anIntArray275[local28++] = local711 | 0x1 << local722;
							continue;
						}
						if (local167 == 4009) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28];
							local722 = Static23.anIntArray275[local28 + 1];
							Static23.anIntArray275[local28++] = -(0x1 << local722) - 1 & local711;
							continue;
						}
						if (local167 == 4010) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = (local711 & 0x1 << local722) == 0 ? 0 : 1;
							continue;
						}
						if (local167 == 4011) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local711 % local722;
							continue;
						}
						if (local167 == 4012) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							if (local711 == 0) {
								Static23.anIntArray275[local28++] = 0;
							} else {
								Static23.anIntArray275[local28++] = (int) Math.pow((double) local711, (double) local722);
							}
							continue;
						}
						if (local167 == 4013) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28];
							local722 = Static23.anIntArray275[local28 + 1];
							if (local711 == 0) {
								Static23.anIntArray275[local28++] = 0;
							} else if (local722 == 0) {
								Static23.anIntArray275[local28++] = Integer.MAX_VALUE;
							} else {
								Static23.anIntArray275[local28++] = (int) Math.pow((double) local711, 1.0D / (double) local722);
							}
							continue;
						}
						if (local167 == 4014) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = local722 & local711;
							continue;
						}
						if (local167 == 4015) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28];
							local722 = Static23.anIntArray275[local28 + 1];
							Static23.anIntArray275[local28++] = local711 | local722;
							continue;
						}
					} else if (local167 < 4200) {
						if (local167 == 4100) {
							local24--;
							local537 = Static42.aClass63Array10[local24];
							local28--;
							local722 = Static23.anIntArray275[local28];
							Static42.aClass63Array10[local24++] = Static15.method374(new Class63[] { local537, Static118.method2114(local722) });
							continue;
						}
						if (local167 == 4101) {
							local24 -= 2;
							local2819 = Static42.aClass63Array10[local24 + 1];
							local537 = Static42.aClass63Array10[local24];
							Static42.aClass63Array10[local24++] = Static15.method374(new Class63[] { local537, local2819 });
							continue;
						}
						if (local167 == 4102) {
							local28--;
							local722 = Static23.anIntArray275[local28];
							local24--;
							local537 = Static42.aClass63Array10[local24];
							Static42.aClass63Array10[local24++] = Static15.method374(new Class63[] { local537, Static70.method1365(local722) });
							continue;
						}
						if (local167 == 4103) {
							local24--;
							local537 = Static42.aClass63Array10[local24];
							Static42.aClass63Array10[local24++] = local537.method1829();
							continue;
						}
						if (local167 == 4104) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							@Pc(2911) long local2911 = (long) local711 * 86400000L + 1014768000000L;
							Static66.aCalendar56.setTime(new Date(local2911));
							local579 = Static66.aCalendar56.get(5);
							local600 = Static66.aCalendar56.get(2);
							local901 = Static66.aCalendar56.get(1);
							Static42.aClass63Array10[local24++] = Static15.method374(new Class63[] { Static118.method2114(local579), Static32.aClass63_605, Static17.aClass63Array18[local600], Static32.aClass63_605, Static118.method2114(local901) });
							continue;
						}
						if (local167 == 4105) {
							local24 -= 2;
							local537 = Static42.aClass63Array10[local24];
							local2819 = Static42.aClass63Array10[local24 + 1];
							if (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass21_1 != null && Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass21_1.aBoolean47) {
								Static42.aClass63Array10[local24++] = local2819;
								continue;
							}
							Static42.aClass63Array10[local24++] = local537;
							continue;
						}
						if (local167 == 4106) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static42.aClass63Array10[local24++] = Static118.method2114(local711);
							continue;
						}
						if (local167 == 4107) {
							local24 -= 2;
							Static23.anIntArray275[local28++] = Static42.aClass63Array10[local24].method1804(Static42.aClass63Array10[local24 + 1]);
							continue;
						}
						@Pc(3066) byte[] local3066;
						@Pc(3071) Class6_Sub3_Sub3_Sub1 local3071;
						if (local167 == 4108) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28];
							local860 = Static23.anIntArray275[local28 + 1];
							local24--;
							local537 = Static42.aClass63Array10[local24];
							local3066 = Static60.aClass7_Sub1_9.method110(local860, 0);
							local3071 = new Class6_Sub3_Sub3_Sub1(local3066);
							Static23.anIntArray275[local28++] = local3071.method446(local537, local722);
							continue;
						}
						if (local167 == 4109) {
							local28 -= 2;
							local24--;
							local537 = Static42.aClass63Array10[local24];
							local722 = Static23.anIntArray275[local28];
							local860 = Static23.anIntArray275[local28 + 1];
							local3066 = Static60.aClass7_Sub1_9.method110(local860, 0);
							local3071 = new Class6_Sub3_Sub3_Sub1(local3066);
							Static23.anIntArray275[local28++] = local3071.method443(local537, local722);
							continue;
						}
					} else if (local167 < 4300) {
						if (local167 == 4200) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static42.aClass63Array10[local24++] = Static91.method1664(local711).aClass63_742;
							continue;
						}
						@Pc(3164) Class6_Sub3_Sub8 local3164;
						if (local167 == 4201) {
							local28 -= 2;
							local711 = Static23.anIntArray275[local28];
							local722 = Static23.anIntArray275[local28 + 1];
							local3164 = Static91.method1664(local711);
							if (local722 >= 1 && local722 <= 5 && local3164.aClass63Array11[local722 - 1] != null) {
								Static42.aClass63Array10[local24++] = local3164.aClass63Array11[local722 - 1];
								continue;
							}
							Static42.aClass63Array10[local24++] = Static118.aClass63_1735;
							continue;
						}
						if (local167 == 4202) {
							local28 -= 2;
							local722 = Static23.anIntArray275[local28 + 1];
							local711 = Static23.anIntArray275[local28];
							local3164 = Static91.method1664(local711);
							if (local722 >= 1 && local722 <= 5 && local3164.aClass63Array12[local722 - 1] != null) {
								Static42.aClass63Array10[local24++] = local3164.aClass63Array12[local722 - 1];
								continue;
							}
							Static42.aClass63Array10[local24++] = Static118.aClass63_1735;
							continue;
						}
						if (local167 == 4203) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = Static91.method1664(local711).anInt1378;
							continue;
						}
						if (local167 == 4204) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = Static91.method1664(local711).anInt1401 == 1 ? 1 : 0;
							continue;
						}
						@Pc(3307) Class6_Sub3_Sub8 local3307;
						if (local167 == 4205) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							local3307 = Static91.method1664(local711);
							if (local3307.anInt1386 == -1 && local3307.anInt1377 >= 0) {
								Static23.anIntArray275[local28++] = local3307.anInt1377;
								continue;
							}
							Static23.anIntArray275[local28++] = local711;
							continue;
						}
						if (local167 == 4206) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							local3307 = Static91.method1664(local711);
							if (local3307.anInt1386 >= 0 && local3307.anInt1377 >= 0) {
								Static23.anIntArray275[local28++] = local3307.anInt1377;
								continue;
							}
							Static23.anIntArray275[local28++] = local711;
							continue;
						}
						if (local167 == 4207) {
							local28--;
							local711 = Static23.anIntArray275[local28];
							Static23.anIntArray275[local28++] = Static91.method1664(local711).aBoolean65 ? 1 : 0;
							continue;
						}
					}
				} else {
					if (local167 < 2000) {
						local993 = local841 ? Static39.aClass6_Sub3_Sub17_3 : Static4.aClass6_Sub3_Sub17_1;
					} else {
						local28--;
						local993 = Static12.method339(Static23.anIntArray275[local28]);
						local167 -= 1000;
					}
					if (local167 == 1300) {
						local28--;
						local722 = Static23.anIntArray275[local28] - 1;
						if (local722 >= 0 && local722 <= 9) {
							local24--;
							local993.method2141(local722, Static42.aClass63Array10[local24]);
							continue;
						}
						local24--;
						continue;
					}
					if (local167 == 1301) {
						local28 -= 2;
						local722 = Static23.anIntArray275[local28];
						local860 = Static23.anIntArray275[local28 + 1];
						local993.aClass6_Sub3_Sub17_5 = Static72.method1384(local860, local722);
						continue;
					}
					if (local167 == 1302) {
						local28--;
						local993.aBoolean177 = Static23.anIntArray275[local28] == 1;
						continue;
					}
					if (local167 == 1303) {
						local28--;
						local993.anInt3278 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1304) {
						local28--;
						local993.anInt3266 = Static23.anIntArray275[local28];
						continue;
					}
					if (local167 == 1305) {
						local24--;
						local993.aClass63_1772 = Static42.aClass63Array10[local24];
						continue;
					}
					if (local167 == 1306) {
						local24--;
						local993.aClass63_1773 = Static42.aClass63Array10[local24];
						continue;
					}
				}
				Static92.method1674(null, "CS2 - nosuchop:" + local167);
				return;
			}
		} catch (@Pc(4385) Exception local4385) {
			Static92.method1674(local4385, "CS2 - scr:" + local15.aLong91 + " op:" + local36);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ge;Z)V")
	public static void method1837(@OriginalArg(0) Class7 arg0) {
		Static48.aClass7_28 = arg0;
	}
}
