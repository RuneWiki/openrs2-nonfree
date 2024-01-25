import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "J")
	public static long aLong42 = 0L;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
	public static void method1509() {
		if (Static61.anInt9887 < 0) {
			return;
		}
		@Pc(7) long local7 = Static95.method1587();
		Static61.anInt9887 = (int) ((long) Static61.anInt9887 + Static405.aLong176 - local7);
		if (Static61.anInt9887 > 0) {
			@Pc(27) int local27 = (Static61.anInt9887 << 8) / Static371.anInt6181;
			@Pc(31) int local31 = 255 - local27;
			@Pc(36) float local36 = (float) local27 / 255.0F;
			Static257.anInt4680 = (local27 * (Static127.anInt2303 & 0xFF00FF) + (Static615.aClass48_2.anInt1307 & 0xFF00FF) * local31 & 0xFF00FF00) + ((Static615.aClass48_2.anInt1307 & 0xFF00) * local31 + local27 * (Static127.anInt2303 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(73) float local73 = 1.0F - local36;
			Static471.aFloat143 = Static280.aFloat93 + local73 * (Static615.aClass48_2.aFloat15 - Static280.aFloat93);
			Static463.anInt7780 = local27 * Static101.anInt1980 + Static615.aClass48_2.anInt1309 * local31 >> 8;
			Static16.anInt250 = (local27 * (Static86.anInt1720 & 0xFF00) + local31 * (Static615.aClass48_2.anInt1304 & 0xFF00) & 0xFF0000) + ((Static615.aClass48_2.anInt1304 & 0xFF00FF) * local31 + local27 * (Static86.anInt1720 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static556.aFloat178 = local73 * (Static615.aClass48_2.aFloat11 - Static14.aFloat2) + Static14.aFloat2;
			Static55.aFloat9 = Static148.aFloat35 + (Static615.aClass48_2.aFloat10 - Static148.aFloat35) * local73;
			Static266.aFloat92 = Static550.aFloat174 + (Static615.aClass48_2.aFloat12 - Static550.aFloat174) * local73;
			Static418.aFloat135 = local73 * (Static615.aClass48_2.aFloat14 - Static31.aFloat6) + Static31.aFloat6;
			Static72.aFloat18 = local73 * (Static615.aClass48_2.aFloat13 - Static445.aFloat140) + Static445.aFloat140;
			if (Static615.aClass48_2.aClass130_2 != Static17.aClass130_1) {
				Static625.aClass130_4 = Static550.aClass133_14.method7259(Static17.aClass130_1, Static615.aClass48_2.aClass130_2, local73, Static625.aClass130_4);
			}
		} else {
			Static61.anInt9887 = -1;
			Static463.anInt7780 = Static615.aClass48_2.anInt1309;
			Static471.aFloat143 = Static615.aClass48_2.aFloat15;
			Static55.aFloat9 = Static615.aClass48_2.aFloat10;
			Static72.aFloat18 = Static615.aClass48_2.aFloat13;
			Static16.anInt250 = Static615.aClass48_2.anInt1304;
			Static266.aFloat92 = Static615.aClass48_2.aFloat12;
			Static556.aFloat178 = Static615.aClass48_2.aFloat11;
			Static625.aClass130_4 = Static615.aClass48_2.aClass130_2;
			Static418.aFloat135 = Static615.aClass48_2.aFloat14;
			Static257.anInt4680 = Static615.aClass48_2.anInt1307;
		}
		Static405.aLong176 = local7;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ha;Lclient!raa;)V")
	public static void method1510(@OriginalArg(1) Class133 arg0, @OriginalArg(2) Class295 arg1) {
		@Pc(31) boolean local31 = Static643.aClass275_2.method6644(arg1.anInt8006 | 0xFF000000, arg1.anInt8032, arg1.anInt8010, arg1.aBoolean579 ? Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 : null, arg1.anInt8036, arg0, arg1.anInt7958) == null;
		if (local31) {
			Static588.aClass330_59.method7917(new Class5_Sub14(arg1.anInt8010, arg1.anInt8036, arg1.anInt8032, arg1.anInt8006 | 0xFF000000, arg1.anInt7958, arg1.aBoolean579));
			Static465.method6901(arg1);
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
	public static void method1511() {
		if (Static456.anInt7726 > 1) {
			Static456.anInt7726--;
			Static462.anInt7776 = Static126.anInt2290;
		}
		if (Static353.aBoolean428) {
			Static353.aBoolean428 = false;
			Static364.method5406();
			return;
		}
		if (!Static142.aBoolean190) {
			Static356.method5282();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static119.method1791(); local27++) {
		}
		if (Static151.anInt2620 != 10) {
			return;
		}
		@Pc(49) Class5_Sub48 local49;
		@Pc(58) int local58;
		while (Static340.method5109()) {
			local49 = Static16.method232(Static191.aClass46_37, Static276.aClass251_2);
			local49.aClass5_Sub22_Sub1_2.method5905(0);
			local58 = local49.aClass5_Sub22_Sub1_2.anInt6629;
			Static392.method5816(local49.aClass5_Sub22_Sub1_2);
			local49.aClass5_Sub22_Sub1_2.method5965(local49.aClass5_Sub22_Sub1_2.anInt6629 - local58);
			Static277.method4436(local49);
		}
		if (Static21.aClass5_Sub19_1 == null) {
			if (Static530.aLong253 <= Static95.method1587()) {
				Static21.aClass5_Sub19_1 = Static395.aClass196_1.method4500(Static490.aClass306_5.aString95);
			}
		} else if (Static21.aClass5_Sub19_1.anInt2183 != -1) {
			local49 = Static16.method232(Static543.aClass46_101, Static276.aClass251_2);
			local49.aClass5_Sub22_Sub1_2.method5918(Static21.aClass5_Sub19_1.anInt2183);
			Static277.method4436(local49);
			Static21.aClass5_Sub19_1 = null;
			Static530.aLong253 = Static95.method1587() + 30000L;
		}
		@Pc(129) Class5_Sub13 local129 = (Class5_Sub13) Static75.aClass330_5.method7908();
		@Pc(148) int local148;
		@Pc(170) int local170;
		@Pc(189) int local189;
		@Pc(243) int local243;
		@Pc(250) int local250;
		@Pc(262) int local262;
		@Pc(146) Class5_Sub48 local146;
		if (local129 != null || Static95.method1587() - 2000L > Static13.aLong5) {
			local146 = null;
			local148 = 0;
			for (@Pc(153) Class5_Sub13 local153 = (Class5_Sub13) Static608.aClass330_61.method7908(); local153 != null && (local146 == null || local146.aClass5_Sub22_Sub1_2.anInt6629 - local148 < 240); local153 = (Class5_Sub13) Static608.aClass330_61.method7914()) {
				local153.method9047();
				local170 = local153.method5401();
				if (local170 < -1) {
					local170 = -1;
				} else if (local170 > 65534) {
					local170 = 65534;
				}
				local189 = local153.method5403();
				if (local189 < -1) {
					local189 = -1;
				} else if (local189 > 65534) {
					local189 = 65534;
				}
				if (local189 != Static176.anInt3132 || local170 != Static198.anInt3892) {
					if (local146 == null) {
						local146 = Static16.method232(Static61.aClass46_105, Static276.aClass251_2);
						local146.aClass5_Sub22_Sub1_2.method5905(0);
						local148 = local146.aClass5_Sub22_Sub1_2.anInt6629;
					}
					local243 = local189 - Static176.anInt3132;
					Static176.anInt3132 = local189;
					local250 = local170 - Static198.anInt3892;
					Static198.anInt3892 = local170;
					local262 = (int) ((local153.method5402() - Static13.aLong5) / 20L);
					if (local262 < 8 && local243 >= -32 && local243 <= 31 && local250 >= -32 && local250 <= 31) {
						local250 += 32;
						local243 += 32;
						local146.aClass5_Sub22_Sub1_2.method5918(local250 + (local243 << 6) + (local262 << 12));
					} else if (local262 < 32 && local243 >= -128 && local243 <= 127 && local250 >= -128 && local250 <= 127) {
						local243 += 128;
						local146.aClass5_Sub22_Sub1_2.method5905(local262 + 128);
						local250 += 128;
						local146.aClass5_Sub22_Sub1_2.method5918((local243 << 8) + local250);
					} else if (local262 < 32) {
						local146.aClass5_Sub22_Sub1_2.method5905(local262 + 192);
						if (local189 == 1 || local170 == -1) {
							local146.aClass5_Sub22_Sub1_2.method5949(Integer.MIN_VALUE);
						} else {
							local146.aClass5_Sub22_Sub1_2.method5949(local189 | local170 << 16);
						}
					} else {
						local146.aClass5_Sub22_Sub1_2.method5918(local262 + 57344);
						if (local189 == 1 || local170 == -1) {
							local146.aClass5_Sub22_Sub1_2.method5949(Integer.MIN_VALUE);
						} else {
							local146.aClass5_Sub22_Sub1_2.method5949(local189 | local170 << 16);
						}
					}
					Static13.aLong5 = local153.method5402();
				}
			}
			if (local146 != null) {
				local146.aClass5_Sub22_Sub1_2.method5965(local146.aClass5_Sub22_Sub1_2.anInt6629 - local148);
				Static277.method4436(local146);
			}
		}
		@Pc(461) int local461;
		if (local129 != null) {
			@Pc(447) long local447 = (local129.method5402() - Static619.aLong270) / 50L;
			if (local447 > 32767L) {
				local447 = 32767L;
			}
			Static619.aLong270 = local129.method5402();
			local461 = local129.method5401();
			if (local461 < 0) {
				local461 = 0;
			} else if (local461 > 65535) {
				local461 = 65535;
			}
			local170 = local129.method5403();
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 65535) {
				local170 = 65535;
			}
			@Pc(496) byte local496 = 0;
			if (local129.method5399() == 2) {
				local496 = 1;
			}
			local243 = (int) local447;
			@Pc(515) Class5_Sub48 local515 = Static16.method232(Static240.aClass46_55, Static276.aClass251_2);
			local515.aClass5_Sub22_Sub1_2.method5961(local496 << 15 | local243);
			local515.aClass5_Sub22_Sub1_2.method5959(local461 << 16 | local170);
			Static277.method4436(local515);
		}
		if (Static130.anInt2337 > 0) {
			local146 = Static16.method232(Static451.aClass46_85, Static276.aClass251_2);
			local146.aClass5_Sub22_Sub1_2.method5905(Static130.anInt2337 * 3);
			for (local148 = 0; local148 < Static130.anInt2337; local148++) {
				@Pc(567) Interface1 local567 = Static208.anInterface1Array1[local148];
				@Pc(575) long local575 = (local567.method7647() - Static219.aLong104) / 50L;
				if (local575 > 65535L) {
					local575 = 65535L;
				}
				Static219.aLong104 = local567.method7647();
				local146.aClass5_Sub22_Sub1_2.method5905(local567.method7651());
				local146.aClass5_Sub22_Sub1_2.method5918((int) local575);
			}
			Static277.method4436(local146);
		}
		if (Static403.anInt6727 > 0) {
			Static403.anInt6727--;
		}
		if (Static187.aBoolean232 && Static403.anInt6727 <= 0) {
			Static403.anInt6727 = 20;
			Static187.aBoolean232 = false;
			local146 = Static16.method232(Static238.aClass46_54, Static276.aClass251_2);
			local146.aClass5_Sub22_Sub1_2.method5904((int) Static552.aFloat176 >> 3);
			local146.aClass5_Sub22_Sub1_2.method5961((int) Static311.aFloat95 >> 3);
			Static277.method4436(local146);
		}
		if (Static311.aBoolean389 != Static642.aBoolean725) {
			Static642.aBoolean725 = Static311.aBoolean389;
			local146 = Static16.method232(Static80.aClass46_19, Static276.aClass251_2);
			local146.aClass5_Sub22_Sub1_2.method5905(Static311.aBoolean389 ? 1 : 0);
			Static277.method4436(local146);
		}
		if (!Static339.aBoolean417) {
			local146 = Static16.method232(Static59.aClass46_16, Static276.aClass251_2);
			local146.aClass5_Sub22_Sub1_2.method5905(0);
			local148 = local146.aClass5_Sub22_Sub1_2.anInt6629;
			@Pc(710) Class5_Sub22 local710 = Static97.aClass5_Sub25_8.method3678();
			local146.aClass5_Sub22_Sub1_2.method5925(local710.aByteArray71, 0, local710.anInt6629);
			local146.aClass5_Sub22_Sub1_2.method5965(local146.aClass5_Sub22_Sub1_2.anInt6629 - local148);
			Static277.method4436(local146);
			Static339.aBoolean417 = true;
		}
		if (Static421.aClass217ArrayArrayArray5 != null) {
			if (Static254.anInt4612 == 2) {
				Static497.method7438();
			} else if (Static254.anInt4612 == 3) {
				Static218.method3708();
			}
		}
		if (Static358.aBoolean432) {
			Static358.aBoolean432 = false;
		} else {
			Static216.aFloat87 /= 2.0F;
		}
		if (Static95.aBoolean143) {
			Static95.aBoolean143 = false;
		} else {
			Static444.aFloat139 /= 2.0F;
		}
		Static18.method239();
		if (Static151.anInt2620 != 10) {
			return;
		}
		Static293.method4587();
		Static304.method4759();
		Static533.method7869();
		Static578.anInt4588++;
		if (Static578.anInt4588 > 750) {
			Static364.method5406();
			return;
		}
		Static107.method9046();
		Static509.method7617();
		Static199.method3520();
		for (local58 = Static301.aClass59_1.method1308(true); local58 != -1; local58 = Static301.aClass59_1.method1308(false)) {
			Static6.method115(local58);
			Static329.anIntArray166[Static508.anInt8815++ & 0x1F] = local58;
		}
		@Pc(878) Class295 local878;
		for (@Pc(834) Class5_Sub5_Sub21 local834 = Static628.method8888(); local834 != null; local834 = Static628.method8888()) {
			local461 = local834.method8956();
			local170 = local834.method8955();
			if (local461 == 1) {
				Static320.anIntArray291[local170] = local834.anInt10530;
				Static78.aBoolean117 |= Static578.aBooleanArray15[local170];
				Static199.anIntArray192[Static308.anInt7112++ & 0x1F] = local170;
			} else if (local461 == 2) {
				Static475.aStringArray65[local170] = local834.aString106;
				Static120.anIntArray138[Static509.anInt8839++ & 0x1F] = local170;
			} else if (local461 == 3) {
				local878 = Static107.method9049(local170);
				if (!local834.aString106.equals(local878.aString90)) {
					local878.aString90 = local834.aString106;
					Static465.method6901(local878);
				}
			} else if (local461 == 4) {
				local878 = Static107.method9049(local170);
				local243 = local834.anInt10530;
				local250 = local834.anInt10537;
				local262 = local834.anInt10533;
				if (local878.anInt7969 != local243 || local250 != local878.anInt7982 || local878.anInt8034 != local262) {
					local878.anInt7982 = local250;
					local878.anInt7969 = local243;
					local878.anInt8034 = local262;
					Static465.method6901(local878);
				}
			} else if (local461 == 5) {
				local878 = Static107.method9049(local170);
				if (local878.anInt7992 != local834.anInt10530 || local834.anInt10530 == -1) {
					local878.anInt7992 = local834.anInt10530;
					local878.anInt7964 = 0;
					local878.anInt7966 = 1;
					local878.anInt7975 = 0;
					@Pc(985) Class362 local985 = local878.anInt7992 == -1 ? null : Static435.aClass298_1.method7034(local878.anInt7992);
					if (local985 != null) {
						Static574.method8327(local878.anInt7964, local985);
					}
					Static465.method6901(local878);
				}
			} else if (local461 == 6) {
				local189 = local834.anInt10530;
				local243 = local189 >> 10 & 0x1F;
				local250 = local189 >> 5 & 0x1F;
				local262 = local189 & 0x1F;
				@Pc(1373) int local1373 = (local243 << 19) + (local250 << 11) + (local262 << 3);
				@Pc(1379) Class295 local1379 = Static107.method9049(local170);
				if (local1379.anInt7983 != local1373) {
					local1379.anInt7983 = local1373;
					Static465.method6901(local1379);
				}
			} else if (local461 == 7) {
				local878 = Static107.method9049(local170);
				@Pc(1324) boolean local1324 = local834.anInt10530 == 1;
				if (local1324 != local878.aBoolean567) {
					local878.aBoolean567 = local1324;
					Static465.method6901(local878);
				}
			} else if (local461 == 8) {
				local878 = Static107.method9049(local170);
				if (local878.anInt7999 != local834.anInt10530 || local878.anInt8037 != local834.anInt10537 || local834.anInt10533 != local878.anInt7971) {
					local878.anInt7999 = local834.anInt10530;
					local878.anInt8037 = local834.anInt10537;
					local878.anInt7971 = local834.anInt10533;
					if (local878.anInt8010 != -1) {
						if (local878.anInt8008 > 0) {
							local878.anInt7971 = local878.anInt7971 * 32 / local878.anInt8008;
						} else if (local878.anInt7973 > 0) {
							local878.anInt7971 = local878.anInt7971 * 32 / local878.anInt7973;
						}
					}
					Static465.method6901(local878);
				}
			} else if (local461 == 9) {
				local878 = Static107.method9049(local170);
				if (local878.anInt8010 != local834.anInt10530 || local834.anInt10537 != local878.anInt8036) {
					local878.anInt8036 = local834.anInt10537;
					local878.anInt8010 = local834.anInt10530;
					Static465.method6901(local878);
				}
			} else if (local461 == 10) {
				local878 = Static107.method9049(local170);
				if (local834.anInt10530 != local878.anInt7965 || local878.anInt7955 != local834.anInt10537 || local834.anInt10533 != local878.anInt7976) {
					local878.anInt7955 = local834.anInt10537;
					local878.anInt7976 = local834.anInt10533;
					local878.anInt7965 = local834.anInt10530;
					Static465.method6901(local878);
				}
			} else if (local461 == 11) {
				local878 = Static107.method9049(local170);
				local878.anInt8030 = local878.anInt7962 = local834.anInt10530;
				local878.aByte116 = 0;
				local878.aByte119 = 0;
				local878.anInt7996 = local878.anInt7945 = local834.anInt10537;
				Static465.method6901(local878);
			} else if (local461 == 12) {
				local878 = Static107.method9049(local170);
				local243 = local834.anInt10530;
				if (local878 != null && local878.anInt8001 == 0) {
					if (local243 > local878.anInt8029 - local878.anInt7985) {
						local243 = local878.anInt8029 - local878.anInt7985;
					}
					if (local243 < 0) {
						local243 = 0;
					}
					if (local878.anInt7997 != local243) {
						local878.anInt7997 = local243;
						Static465.method6901(local878);
					}
				}
			} else if (local461 == 14) {
				local878 = Static107.method9049(local170);
				local878.anInt7984 = local834.anInt10530;
			} else if (local461 == 15) {
				Static511.anInt8845 = local834.anInt10530;
				Static302.aBoolean387 = true;
				Static16.anInt249 = local834.anInt10537;
			} else if (local461 == 16) {
				local878 = Static107.method9049(local170);
				local878.anInt7970 = local834.anInt10530;
			} else if (local461 == 17) {
				local878 = Static107.method9049(local170);
				local878.anInt8009 = local834.anInt10530;
			}
		}
		if (Static158.anInt2674 != 0) {
			Static173.anInt3107 += 20;
			if (Static173.anInt3107 >= 400) {
				Static158.anInt2674 = 0;
			}
		}
		Static435.anInt7492++;
		if (Static334.aClass295_11 != null) {
			Static140.anInt2439++;
			if (Static140.anInt2439 >= 15) {
				Static465.method6901(Static334.aClass295_11);
				Static334.aClass295_11 = null;
			}
		}
		Static135.aClass295_7 = null;
		Static172.aBoolean216 = false;
		Static553.aBoolean673 = false;
		Static573.aClass295_9 = null;
		Static377.method5548(null, -1, -1);
		Static138.method2020(null, -1, -1);
		if (!Static285.aBoolean378) {
			Static578.anInt4589 = -1;
		}
		Static422.method1031();
		Static126.anInt2290++;
		if (Static75.aBoolean114) {
			@Pc(1496) Class5_Sub48 local1496 = Static16.method232(Static420.aClass46_79, Static276.aClass251_2);
			local1496.aClass5_Sub22_Sub1_2.method5935(Static189.anInt10184 | Static78.anInt1649 << 28 | Static269.anInt4835 << 14);
			Static277.method4436(local1496);
			Static75.aBoolean114 = false;
		}
		while (true) {
			@Pc(1519) Class5_Sub51 local1519;
			@Pc(1524) Class295 local1524;
			do {
				local1519 = (Class5_Sub51) Static8.aClass330_31.method7911();
				if (local1519 == null) {
					while (true) {
						do {
							local1519 = (Class5_Sub51) Static191.aClass330_16.method7911();
							if (local1519 == null) {
								while (true) {
									do {
										local1519 = (Class5_Sub51) Static354.aClass330_10.method7911();
										if (local1519 == null) {
											if (Static135.aClass295_7 == null) {
												Static349.anInt5874 = 0;
											}
											if (Static443.aClass295_14 != null) {
												Static323.method4915();
											}
											if (Static210.anInt4035 > 0 && Static45.aClass115_1.method2490(82) && Static45.aClass115_1.method2490(81) && Static236.anInt4330 != 0) {
												local461 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 - Static236.anInt4330;
												if (local461 < 0) {
													local461 = 0;
												} else if (local461 > 3) {
													local461 = 3;
												}
												Static180.method2779(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0] + Static565.anInt9560, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0] + Static567.anInt9589, local461);
											}
											Static239.method3987();
											for (local461 = 0; local461 < 5; local461++) {
												@Pc(1714) int local1714 = Static168.anIntArray167[local461]++;
											}
											if (Static78.aBoolean117 && Static520.aLong224 < Static95.method1587() - 60000L) {
												Static182.method2792();
											}
											for (@Pc(1741) Class4_Sub1_Sub2 local1741 = (Class4_Sub1_Sub2) Static403.aClass99_8.method2045(); local1741 != null; local1741 = (Class4_Sub1_Sub2) Static403.aClass99_8.method2047()) {
												if (Static95.method1587() / 1000L - 5L > (long) local1741.anInt5724) {
													if (local1741.aShort86 > 0) {
														Static412.method6340("", 0, local1741.aString57 + Static174.aClass120_19.method2690(Static266.anInt4796), "", "", 5);
													}
													if (local1741.aShort86 == 0) {
														Static412.method6340("", 0, local1741.aString57 + Static174.aClass120_20.method2690(Static266.anInt4796), "", "", 5);
													}
													local1741.method8713();
												}
											}
											Static84.anInt1705++;
											if (Static84.anInt1705 > 500) {
												Static84.anInt1705 = 0;
												local189 = (int) (Math.random() * 8.0D);
												if ((local189 & 0x1) == 1) {
													Static526.anInt9045 += Static342.anInt5769;
												}
												if ((local189 & 0x2) == 2) {
													Static535.anInt9143 += Static109.anInt2059;
												}
												if ((local189 & 0x4) == 4) {
													Static387.anInt6399 += Static480.anInt8171;
												}
											}
											if (Static526.anInt9045 < -50) {
												Static342.anInt5769 = 2;
											}
											if (Static535.anInt9143 < -55) {
												Static109.anInt2059 = 2;
											}
											if (Static526.anInt9045 > 50) {
												Static342.anInt5769 = -2;
											}
											if (Static387.anInt6399 < -40) {
												Static480.anInt8171 = 1;
											}
											if (Static535.anInt9143 > 55) {
												Static109.anInt2059 = -2;
											}
											Static450.anInt7666++;
											if (Static387.anInt6399 > 40) {
												Static480.anInt8171 = -1;
											}
											if (Static450.anInt7666 > 500) {
												Static450.anInt7666 = 0;
												local189 = (int) (Math.random() * 8.0D);
												if ((local189 & 0x1) == 1) {
													Static2.anInt7 += Static207.anInt3978;
												}
												if ((local189 & 0x2) == 2) {
													Static372.anInt6183 += Static532.anInt9101;
												}
											}
											if (Static2.anInt7 < -60) {
												Static207.anInt3978 = 2;
											}
											if (Static2.anInt7 > 60) {
												Static207.anInt3978 = -2;
											}
											if (Static372.anInt6183 < -20) {
												Static532.anInt9101 = 1;
											}
											if (Static372.anInt6183 > 10) {
												Static532.anInt9101 = -1;
											}
											Static152.anInt2629++;
											if (Static152.anInt2629 > 50) {
												@Pc(1967) Class5_Sub48 local1967 = Static16.method232(Static96.aClass46_21, Static276.aClass251_2);
												Static277.method4436(local1967);
											}
											if (Static44.aBoolean55) {
												Static495.method7328();
												Static44.aBoolean55 = false;
											}
											try {
												Static386.method5642();
												return;
											} catch (@Pc(1980) IOException local1980) {
												Static364.method5406();
												return;
											}
										}
										local1524 = local1519.aClass295_19;
										if (local1524.anInt8025 < 0) {
											break;
										}
										local878 = Static107.method9049(local1524.anInt7944);
									} while (local878 == null || local878.aClass295Array2 == null || local878.aClass295Array2.length <= local1524.anInt8025 || local878.aClass295Array2[local1524.anInt8025] != local1524);
									Static370.method5457(local1519);
								}
							}
							local1524 = local1519.aClass295_19;
							if (local1524.anInt8025 < 0) {
								break;
							}
							local878 = Static107.method9049(local1524.anInt7944);
						} while (local878 == null || local878.aClass295Array2 == null || local878.aClass295Array2.length <= local1524.anInt8025 || local1524 != local878.aClass295Array2[local1524.anInt8025]);
						Static370.method5457(local1519);
					}
				}
				local1524 = local1519.aClass295_19;
				if (local1524.anInt8025 < 0) {
					break;
				}
				local878 = Static107.method9049(local1524.anInt7944);
			} while (local878 == null || local878.aClass295Array2 == null || local1524.anInt8025 >= local878.aClass295Array2.length || local878.aClass295Array2[local1524.anInt8025] != local1524);
			Static370.method5457(local1519);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method1512(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(23) char local23 = arg0.charAt(local14);
			if (local23 == '%' && local12 > local14 + 2) {
				local23 = arg0.charAt(local14 + 1);
				@Pc(77) int local77;
				if (local23 >= '0' && local23 <= '9') {
					local77 = local23 - 48;
				} else if (local23 >= 'a' && local23 <= 'f') {
					local77 = local23 - 87;
				} else {
					if (local23 < 'A' || local23 > 'F') {
						local9.append('%');
						continue;
					}
					local77 = local23 + '\n' - 65;
				}
				local23 = arg0.charAt(local14 + 2);
				local77 *= 16;
				if (local23 >= '0' && local23 <= '9') {
					local77 += local23 - '0';
				} else if (local23 >= 'a' && local23 <= 'f') {
					local77 += local23 + '\n' - 97;
				} else {
					if (local23 < 'A' || local23 > 'F') {
						local9.append('%');
						continue;
					}
					local77 += local23 + 10 - 65;
				}
				if (local77 != 0 && Static98.method5415((byte) local77)) {
					local9.append(Static644.method9020((byte) local77));
				}
				local14 += 2;
			} else if (local23 == '+') {
				local9.append(' ');
			} else {
				local9.append(local23);
			}
		}
		return local9.toString();
	}
}
