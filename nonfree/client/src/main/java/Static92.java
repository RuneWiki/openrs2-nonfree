import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!s", name = "V", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_23;

	@OriginalMember(owner = "client!s", name = "Hb", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!s", name = "Kb", descriptor = "I")
	public static int anInt2412;

	@OriginalMember(owner = "client!s", name = "Lb", descriptor = "I")
	public static int anInt2413;

	@OriginalMember(owner = "client!s", name = "Nb", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!s", name = "Pb", descriptor = "Lclient!dd;")
	public static Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!s", name = "Qb", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1148 = Static14.method2017(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "Lclient!oc;")
	public static Class2_Sub12_Sub1 aClass2_Sub12_Sub1_3 = new Class2_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "[I")
	public static int[] anIntArray285 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1149 = Static14.method2017("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "I")
	public static int anInt2396 = 0;

	@OriginalMember(owner = "client!s", name = "yb", descriptor = "I")
	public static int anInt2407 = 0;

	@OriginalMember(owner = "client!s", name = "Eb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1150 = Static14.method2017("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!s", name = "Fb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1151 = Static14.method2017(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!s", name = "Gb", descriptor = "[I")
	public static int[] anIntArray290 = new int[256];

	@OriginalMember(owner = "client!s", name = "Ib", descriptor = "I")
	public static int anInt2411 = 0;

	@OriginalMember(owner = "client!s", name = "Jb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1152 = Static14.method2017("(U5");

	@OriginalMember(owner = "client!s", name = "Mb", descriptor = "[I")
	public static int[] anIntArray292 = new int[128];

	@OriginalMember(owner = "client!s", name = "Ob", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1153 = Static14.method2017("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!hd;Z)V")
	public static void method1674(@OriginalArg(0) Class2_Sub1_Sub4_Sub2 arg0) {
		if (arg0.anInt2177 == 0) {
			arg0.anInt2170 = 1024;
		}
		arg0.anInt2148 = 0;
		if (arg0.anInt2177 == 1) {
			arg0.anInt2170 = 1536;
		}
		if (arg0.anInt2177 == 2) {
			arg0.anInt2170 = 0;
		}
		if (arg0.anInt2177 == 3) {
			arg0.anInt2170 = 512;
		}
		@Pc(53) int local53 = arg0.anInt2165 - Static113.anInt2952;
		@Pc(63) int local63 = arg0.anInt2163 * 64 + arg0.anInt2191 * 128;
		@Pc(73) int local73 = arg0.anInt2163 * 64 + arg0.anInt2186 * 128;
		arg0.anInt2149 += (local63 - arg0.anInt2149) / local53;
		arg0.anInt2204 += (local73 - arg0.anInt2204) / local53;
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	public static void method1675() {
		aClass36_1151 = null;
		anIntArray293 = null;
		aClass36_1148 = null;
		aClass36_1149 = null;
		anIntArray294 = null;
		anIntArray285 = null;
		anIntArray292 = null;
		anIntArray291 = null;
		aClass36_1150 = null;
		aClass2_Sub1_Sub1_Sub1_23 = null;
		aClass36_1153 = null;
		aClass36_1152 = null;
		aClass2_Sub12_Sub1_3 = null;
		aClass2_Sub3_1 = null;
		anIntArray290 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[BILclient!bf;)V")
	public static void method1678(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10 arg2) {
		@Pc(17) Class2_Sub5 local17 = new Class2_Sub5();
		local17.aByteArray8 = arg0;
		local17.anInt814 = 0;
		local17.aLong89 = arg1;
		local17.aClass10_1 = arg2;
		@Pc(32) Class8 local32 = Static45.aClass8_3;
		synchronized (Static45.aClass8_3) {
			Static45.aClass8_3.method187(local17);
		}
		Static91.method1654();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIII)V")
	public static void method1683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg3 * (arg3 - 32) / arg2;
		Static96.aClass2_Sub1_Sub1_Sub1Array46[0].method97(arg4, arg1);
		Static96.aClass2_Sub1_Sub1_Sub1Array46[1].method97(arg4, arg1 + arg3 - 16);
		if (local11 < 8) {
			local11 = 8;
		}
		@Pc(45) int local45 = (arg3 - local11 - 32) * arg0 / (arg2 - arg3);
		Static54.method1591(arg4, arg1 + 16, 16, arg3 - 32, Static3.anInt1280);
		Static54.method1591(arg4, arg1 + local45 + 16, 16, local11, Static59.anInt1587);
		Static54.method1584(arg4, arg1 + local45 + 16, local11, Static45.anInt1226);
		Static54.method1584(arg4 + 1, arg1 - -local45 + 16, local11, Static45.anInt1226);
		Static54.method1578(arg4, local45 + arg1 + 16, 16, Static45.anInt1226);
		Static54.method1578(arg4, local45 + arg1 + 17, 16, Static45.anInt1226);
		Static54.method1584(arg4 + 15, local45 + arg1 + 16, local11, Static1.anInt9);
		Static54.method1584(arg4 + 14, local45 + 17 + arg1, local11 - 1, Static1.anInt9);
		Static54.method1578(arg4, local11 + arg1 + local45 + 15, 16, Static1.anInt9);
		Static54.method1578(arg4 + 1, local11 + local45 + 14 + arg1, 15, Static1.anInt9);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ed;[Ljava/lang/Object;ZIIILclient!ed;)V")
	public static void method1684(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub6 arg5) {
		@Pc(11) int local11 = (Integer) arg1[0];
		@Pc(15) Class2_Sub1_Sub17 local15 = Static104.method1919(local11);
		if (local15 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int[] local27 = local15.anIntArray335;
		@Pc(30) int[] local30 = local15.anIntArray336;
		@Pc(37) byte local37 = -1;
		try {
			Static29.aClass36Array17 = new Class36[local15.anInt2776];
			Static25.anIntArray48 = new int[local15.anInt2772];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			@Pc(64) int local64;
			for (@Pc(51) int local51 = 1; local51 < arg1.length; local51++) {
				if (arg1[local51] instanceof Integer) {
					local64 = (Integer) arg1[local51];
					if (local64 == -2147483647) {
						local64 = arg2;
					}
					if (local64 == -2147483646) {
						local64 = arg4;
					}
					if (local64 == -2147483645) {
						local64 = arg0 == null ? -1 : arg0.anInt680;
					}
					if (local64 == -2147483644) {
						local64 = arg3;
					}
					if (local64 == -2147483643) {
						local64 = arg0 == null ? -1 : arg0.anInt710;
					}
					if (local64 == -2147483642) {
						local64 = arg5 == null ? -1 : arg5.anInt680;
					}
					if (local64 == -2147483641) {
						local64 = arg5 == null ? -1 : arg5.anInt710;
					}
					Static25.anIntArray48[local47++] = local64;
				} else if (arg1[local51] instanceof Class36) {
					Static29.aClass36Array17[local49++] = (Class36) arg1[local51];
				}
			}
			local64 = 0;
			label1181: while (true) {
				local64++;
				if (local64 > 200000) {
					throw new RuntimeException("slow");
				}
				local22++;
				@Pc(174) int local174 = local27[local22];
				@Pc(727) int local727;
				@Pc(580) int local580;
				@Pc(606) int local606;
				@Pc(536) Class36 local536;
				@Pc(722) int local722;
				if (local174 < 100) {
					if (local174 == 0) {
						Static19.anIntArray347[local20++] = local30[local22];
						continue;
					}
					@Pc(198) int local198;
					if (local174 == 1) {
						local198 = local30[local22];
						Static19.anIntArray347[local20++] = Static4.anIntArray14[local198];
						continue;
					}
					if (local174 == 2) {
						local198 = local30[local22];
						local20--;
						Static4.anIntArray14[local198] = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 3) {
						Static46.aClass36Array23[local24++] = local15.aClass36Array47[local22];
						continue;
					}
					if (local174 == 6) {
						local22 += local30[local22];
						continue;
					}
					if (local174 == 7) {
						local20 -= 2;
						if (Static19.anIntArray347[local20 + 1] != Static19.anIntArray347[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local174 == 8) {
						local20 -= 2;
						if (Static19.anIntArray347[local20 + 1] == Static19.anIntArray347[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local174 == 9) {
						local20 -= 2;
						if (Static19.anIntArray347[local20] < Static19.anIntArray347[local20 + 1]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local174 == 10) {
						local20 -= 2;
						if (Static19.anIntArray347[local20 + 1] < Static19.anIntArray347[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local174 == 21) {
						if (Static23.anInt590 == 0) {
							return;
						}
						@Pc(359) Class33 local359 = Static89.aClass33Array1[--Static23.anInt590];
						local22 = local359.anInt1264;
						Static25.anIntArray48 = local359.anIntArray170;
						local15 = local359.aClass2_Sub1_Sub17_1;
						local27 = local15.anIntArray335;
						local30 = local15.anIntArray336;
						Static29.aClass36Array17 = local359.aClass36Array24;
						continue;
					}
					if (local174 == 25) {
						local198 = local30[local22];
						Static19.anIntArray347[local20++] = Static4.method133(local198);
						continue;
					}
					if (local174 == 27) {
						local198 = local30[local22];
						local20--;
						Static13.method263(Static19.anIntArray347[local20], local198);
						continue;
					}
					if (local174 == 31) {
						local20 -= 2;
						if (Static19.anIntArray347[local20 + 1] >= Static19.anIntArray347[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local174 == 32) {
						local20 -= 2;
						if (Static19.anIntArray347[local20] >= Static19.anIntArray347[local20 + 1]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local174 == 33) {
						Static19.anIntArray347[local20++] = Static25.anIntArray48[local30[local22]];
						continue;
					}
					@Pc(482) int local482;
					if (local174 == 34) {
						local482 = local30[local22];
						local20--;
						Static25.anIntArray48[local482] = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 35) {
						Static46.aClass36Array23[local24++] = Static29.aClass36Array17[local30[local22]];
						continue;
					}
					if (local174 == 36) {
						local482 = local30[local22];
						local24--;
						Static29.aClass36Array17[local482] = Static46.aClass36Array23[local24];
						continue;
					}
					if (local174 == 37) {
						local198 = local30[local22];
						local24 -= local198;
						local536 = Static32.method708(local24, local198, Static46.aClass36Array23);
						Static46.aClass36Array23[local24++] = local536;
						continue;
					}
					if (local174 == 38) {
						local20--;
						continue;
					}
					if (local174 == 39) {
						local24--;
						continue;
					}
					if (local174 == 40) {
						local198 = local30[local22];
						@Pc(570) Class2_Sub1_Sub17 local570 = Static104.method1919(local198);
						@Pc(574) Class36[] local574 = new Class36[local570.anInt2776];
						@Pc(578) int[] local578 = new int[local570.anInt2772];
						for (local580 = 0; local580 < local570.anInt2779; local580++) {
							local578[local580] = Static19.anIntArray347[local20 + local580 - local570.anInt2779];
						}
						for (local606 = 0; local606 < local570.anInt2781; local606++) {
							local574[local606] = Static46.aClass36Array23[local606 + local24 - local570.anInt2781];
						}
						local20 -= local570.anInt2779;
						local24 -= local570.anInt2781;
						@Pc(639) Class33 local639 = new Class33();
						local639.aClass36Array24 = Static29.aClass36Array17;
						local639.anIntArray170 = Static25.anIntArray48;
						local639.anInt1264 = local22;
						local22 = -1;
						local639.aClass2_Sub1_Sub17_1 = local15;
						local15 = local570;
						Static89.aClass33Array1[Static23.anInt590++] = local639;
						Static25.anIntArray48 = local578;
						local30 = local570.anIntArray336;
						local27 = local570.anIntArray335;
						Static29.aClass36Array17 = local574;
						continue;
					}
					if (local174 == 42) {
						Static19.anIntArray347[local20++] = Static42.anIntArray158[local30[local22]];
						continue;
					}
					if (local174 == 43) {
						local482 = local30[local22];
						local20--;
						Static42.anIntArray158[local482] = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 44) {
						local198 = local30[local22] >> 16;
						local722 = local30[local22] & 0xFFFF;
						local20--;
						local727 = Static19.anIntArray347[local20];
						if (local727 >= 0 && local727 <= 5000) {
							Static40.anIntArray253[local198] = local727;
							@Pc(745) byte local745 = -1;
							if (local722 == 105) {
								local745 = 0;
							}
							local580 = 0;
							while (true) {
								if (local580 >= local727) {
									continue label1181;
								}
								Static104.anIntArrayArray28[local198][local580] = local745;
								local580++;
							}
						}
						throw new RuntimeException();
					}
					if (local174 == 45) {
						local198 = local30[local22];
						local20--;
						local722 = Static19.anIntArray347[local20];
						if (local722 >= 0 && Static40.anIntArray253[local198] > local722) {
							Static19.anIntArray347[local20++] = Static104.anIntArrayArray28[local198][local722];
							continue;
						}
						throw new RuntimeException();
					}
					if (local174 == 46) {
						local198 = local30[local22];
						local20 -= 2;
						local722 = Static19.anIntArray347[local20];
						if (local722 >= 0 && Static40.anIntArray253[local198] > local722) {
							Static104.anIntArrayArray28[local198][local722] = Static19.anIntArray347[local20 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(856) boolean local856;
				if (local30[local22] == 1) {
					local856 = true;
				} else {
					local856 = false;
				}
				@Pc(913) Class2_Sub1_Sub6 local913;
				@Pc(1385) int local1385;
				@Pc(2014) int local2014;
				if (local174 < 1000) {
					if (local174 == 100) {
						local20 -= 3;
						local727 = Static19.anIntArray347[local20 + 1];
						local722 = Static19.anIntArray347[local20];
						local1385 = Static19.anIntArray347[local20 + 2];
						if (local727 == 0) {
							throw new RuntimeException();
						}
						@Pc(3962) Class2_Sub1_Sub6 local3962 = Static71.method1274(local722);
						if (local3962.aClass2_Sub1_Sub6Array1 == null) {
							local3962.aClass2_Sub1_Sub6Array1 = new Class2_Sub1_Sub6[local1385 + 1];
						}
						if (local3962.aClass2_Sub1_Sub6Array1.length <= local1385) {
							@Pc(3981) Class2_Sub1_Sub6[] local3981 = new Class2_Sub1_Sub6[local1385 + 1];
							for (local2014 = 0; local2014 < local3962.aClass2_Sub1_Sub6Array1.length; local2014++) {
								local3981[local2014] = local3962.aClass2_Sub1_Sub6Array1[local2014];
							}
							local3962.aClass2_Sub1_Sub6Array1 = local3981;
						}
						if (local1385 > 0 && local3962.aClass2_Sub1_Sub6Array1[local1385 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1385 - 1));
						}
						@Pc(4030) Class2_Sub1_Sub6 local4030 = new Class2_Sub1_Sub6();
						local4030.anInt710 = local1385;
						local4030.anInt676 = local727;
						local4030.aBoolean27 = true;
						local4030.anInt669 = local4030.anInt680 = local3962.anInt680;
						local3962.aClass2_Sub1_Sub6Array1[local1385] = local4030;
						if (local856) {
							Static77.aClass2_Sub1_Sub6_4 = local4030;
						} else {
							Static68.aClass2_Sub1_Sub6_3 = local4030;
						}
						Static110.method1995(local3962);
						continue;
					}
					if (local174 == 101) {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
						@Pc(4080) Class2_Sub1_Sub6 local4080 = Static71.method1274(local913.anInt680);
						local4080.aClass2_Sub1_Sub6Array1[local913.anInt710] = null;
						Static110.method1995(local4080);
						continue;
					}
					if (local174 == 102) {
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
						local913.aClass2_Sub1_Sub6Array1 = null;
						Static110.method1995(local913);
						continue;
					}
					if (local174 == 200) {
						local20 -= 2;
						local727 = Static19.anIntArray347[local20 + 1];
						local722 = Static19.anIntArray347[local20];
						@Pc(4128) Class2_Sub1_Sub6 local4128 = Static76.method1462(local727, local722);
						if (local4128 != null && local727 != -1) {
							Static19.anIntArray347[local20++] = 1;
							if (local856) {
								Static77.aClass2_Sub1_Sub6_4 = local4128;
							} else {
								Static68.aClass2_Sub1_Sub6_3 = local4128;
							}
							continue;
						}
						Static19.anIntArray347[local20++] = 0;
						continue;
					}
				} else if (local174 >= 1000 && local174 < 1100 || local174 >= 2000 && local174 < 2100) {
					if (local174 >= 2000) {
						local174 -= 1000;
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
					} else {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
					}
					Static110.method1995(local913);
					if (local174 == 1000) {
						local20 -= 2;
						local913.anInt722 = Static19.anIntArray347[local20];
						local913.anInt685 = Static19.anIntArray347[local20 + 1];
						continue;
					}
					if (local174 == 1001) {
						local20 -= 2;
						local913.anInt677 = Static19.anIntArray347[local20];
						local913.anInt660 = Static19.anIntArray347[local20 + 1];
						continue;
					}
					if (local174 == 1003) {
						local20--;
						local913.aBoolean29 = Static19.anIntArray347[local20] == 1;
						continue;
					}
				} else if (local174 >= 1100 && local174 < 1200 || !(local174 < 2100 || local174 >= 2200)) {
					if (local174 >= 2000) {
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
						local174 -= 1000;
					} else {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
					}
					Static110.method1995(local913);
					if (local174 == 1100) {
						local20 -= 2;
						local913.anInt675 = Static19.anIntArray347[local20];
						if (local913.anInt675 > local913.anInt714 - local913.anInt677) {
							local913.anInt675 = local913.anInt714 - local913.anInt677;
						}
						if (local913.anInt675 < 0) {
							local913.anInt675 = 0;
						}
						local913.anInt716 = Static19.anIntArray347[local20 + 1];
						if (local913.anInt686 - local913.anInt660 < local913.anInt716) {
							local913.anInt716 = local913.anInt686 - local913.anInt660;
						}
						if (local913.anInt716 < 0) {
							local913.anInt716 = 0;
						}
						continue;
					}
					if (local174 == 1101) {
						local20--;
						local913.anInt687 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1102) {
						local20--;
						local913.aBoolean31 = Static19.anIntArray347[local20] == 1;
						continue;
					}
					if (local174 == 1103) {
						local20--;
						local913.anInt705 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1104) {
						local20--;
						local913.anInt706 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1105) {
						local20--;
						local913.anInt697 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1106) {
						local20--;
						local913.anInt657 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1107) {
						local20--;
						local913.aBoolean25 = Static19.anIntArray347[local20] == 1;
						continue;
					}
					if (local174 == 1108) {
						local913.anInt700 = 1;
						local20--;
						local913.anInt655 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1109) {
						local20 -= 6;
						local913.anInt696 = Static19.anIntArray347[local20];
						local913.anInt679 = Static19.anIntArray347[local20 + 1];
						local913.anInt672 = Static19.anIntArray347[local20 + 2];
						local913.anInt681 = Static19.anIntArray347[local20 + 3];
						local913.anInt721 = Static19.anIntArray347[local20 + 4];
						local913.anInt691 = Static19.anIntArray347[local20 + 5];
						continue;
					}
					if (local174 == 1110) {
						local20--;
						local913.anInt667 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1111) {
						local20--;
						local913.aBoolean33 = Static19.anIntArray347[local20] == 1;
						continue;
					}
					if (local174 == 1112) {
						local24--;
						local913.aClass36_369 = Static46.aClass36Array23[local24];
						continue;
					}
					if (local174 == 1113) {
						local20--;
						local913.anInt713 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1114) {
						local20 -= 3;
						local913.anInt666 = Static19.anIntArray347[local20];
						local913.anInt717 = Static19.anIntArray347[local20 + 1];
						local913.anInt688 = Static19.anIntArray347[local20 + 2];
						continue;
					}
					if (local174 == 1115) {
						local20--;
						local913.aBoolean26 = Static19.anIntArray347[local20] == 1;
						continue;
					}
					if (local174 == 1116) {
						local20--;
						local913.anInt689 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1117) {
						local20--;
						local913.anInt704 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1118) {
						local20--;
						local913.aBoolean36 = Static19.anIntArray347[local20] == 1;
						continue;
					}
					if (local174 == 1119) {
						local20--;
						local913.aBoolean32 = Static19.anIntArray347[local20] == 1;
						continue;
					}
					if (local174 == 1120) {
						local20 -= 2;
						local913.anInt714 = Static19.anIntArray347[local20];
						local913.anInt686 = Static19.anIntArray347[local20 + 1];
						continue;
					}
				} else if (local174 >= 1200 && local174 < 1300 || !(local174 < 2200 || local174 >= 2300)) {
					if (local174 < 2000) {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
					} else {
						local174 -= 1000;
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
					}
					Static110.method1995(local913);
					if (local174 == 1200) {
						local20 -= 2;
						local727 = Static19.anIntArray347[local20];
						local1385 = Static19.anIntArray347[local20 + 1];
						local913.anInt692 = local1385;
						local913.anInt703 = local727;
						@Pc(1395) Class2_Sub1_Sub18 local1395 = Static43.method832(local727);
						local913.anInt681 = local1395.anInt2826;
						local913.anInt679 = local1395.anInt2831;
						local913.anInt691 = local1395.anInt2838;
						local913.anInt721 = local1395.anInt2844;
						if (local913.anInt677 > 0) {
							local913.anInt691 = local913.anInt691 * 32 / local913.anInt677;
						}
						local913.anInt672 = local1395.anInt2813;
						local913.anInt696 = local1395.anInt2842;
						continue;
					}
					if (local174 == 1201) {
						local913.anInt700 = 2;
						local20--;
						local913.anInt655 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1202) {
						local913.anInt700 = 3;
						local913.anInt655 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass67_2.method2008();
						continue;
					}
				} else if ((local174 < 1300 || local174 >= 1400) && (local174 < 2300 || local174 >= 2400)) {
					@Pc(1904) Class36 local1904;
					if (local174 >= 1400 && local174 < 1500 || local174 >= 2400 && local174 < 2500) {
						if (local174 >= 2000) {
							local20--;
							local913 = Static71.method1274(Static19.anIntArray347[local20]);
							local174 -= 1000;
						} else {
							local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
						}
						local24--;
						local1904 = Static46.aClass36Array23[local24];
						@Pc(3533) Object[] local3533 = new Object[local1904.method1028() + 1];
						for (local580 = local3533.length - 1; local580 >= 1; local580--) {
							if (local1904.method1004(local580 - 1) == 115) {
								local24--;
								local3533[local580] = Static46.aClass36Array23[local24];
							} else {
								local20--;
								local3533[local580] = Integer.valueOf(Static19.anIntArray347[local20]);
							}
						}
						local20--;
						local3533[0] = Integer.valueOf(Static19.anIntArray347[local20]);
						if (local174 == 1401) {
							local913.anObjectArray5 = local3533;
						}
						if (local174 == 1415) {
							local913.anObjectArray1 = local3533;
						}
						if (local174 == 1413) {
							local913.anObjectArray2 = local3533;
						}
						if (local174 == 1411) {
							local913.anObjectArray6 = local3533;
						}
						if (local174 == 1403) {
							local913.anObjectArray9 = local3533;
						}
						if (local174 == 1414) {
							local913.anObjectArray19 = local3533;
						}
						if (local174 == 1405) {
							local913.anObjectArray12 = local3533;
						}
						if (local174 == 1410) {
							local913.anObjectArray18 = local3533;
						}
						if (local174 == 1404) {
							local913.anObjectArray14 = local3533;
						}
						if (local174 == 1417) {
							local913.anObjectArray17 = local3533;
						}
						if (local174 == 1400) {
							local913.anObjectArray8 = local3533;
						}
						if (local174 == 1407) {
							local913.anObjectArray11 = local3533;
						}
						local913.aBoolean34 = true;
						if (local174 == 1408) {
							local913.anObjectArray4 = local3533;
						}
						if (local174 == 1416) {
							local913.anObjectArray15 = local3533;
						}
						if (local174 == 1406) {
							local913.anObjectArray16 = local3533;
						}
						if (local174 == 1412) {
							local913.anObjectArray10 = local3533;
						}
						if (local174 == 1409) {
							local913.anObjectArray7 = local3533;
						}
						if (local174 == 1402) {
							local913.anObjectArray13 = local3533;
						}
						continue;
					}
					if (local174 < 1600) {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
						if (local174 == 1500) {
							Static19.anIntArray347[local20++] = local913.anInt722;
							continue;
						}
						if (local174 == 1501) {
							Static19.anIntArray347[local20++] = local913.anInt685;
							continue;
						}
						if (local174 == 1502) {
							Static19.anIntArray347[local20++] = local913.anInt677;
							continue;
						}
						if (local174 == 1503) {
							Static19.anIntArray347[local20++] = local913.anInt660;
							continue;
						}
						if (local174 == 1504) {
							Static19.anIntArray347[local20++] = local913.aBoolean29 ? 1 : 0;
							continue;
						}
						if (local174 == 1505) {
							Static19.anIntArray347[local20++] = local913.anInt669;
							continue;
						}
					} else if (local174 < 1700) {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
						if (local174 == 1600) {
							Static19.anIntArray347[local20++] = local913.anInt675;
							continue;
						}
						if (local174 == 1601) {
							Static19.anIntArray347[local20++] = local913.anInt716;
							continue;
						}
						if (local174 == 1602) {
							Static46.aClass36Array23[local24++] = local913.aClass36_369;
							continue;
						}
						if (local174 == 1603) {
							Static19.anIntArray347[local20++] = local913.anInt714;
							continue;
						}
						if (local174 == 1604) {
							Static19.anIntArray347[local20++] = local913.anInt686;
							continue;
						}
					} else if (local174 < 1800) {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
						if (local174 == 1700) {
							Static19.anIntArray347[local20++] = local913.anInt703;
							continue;
						}
						if (local174 == 1701) {
							if (local913.anInt703 == -1) {
								Static19.anIntArray347[local20++] = 0;
							} else {
								Static19.anIntArray347[local20++] = local913.anInt692;
							}
							continue;
						}
						if (local174 == 1702) {
							Static19.anIntArray347[local20++] = local913.anInt710;
							continue;
						}
					} else if (local174 < 1900) {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
						if (local174 == 1800) {
							Static19.anIntArray347[local20++] = Static89.method1638(Static67.method1163(local913));
							continue;
						}
					} else if (local174 < 2600) {
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
						if (local174 == 2500) {
							Static19.anIntArray347[local20++] = local913.anInt722;
							continue;
						}
						if (local174 == 2501) {
							Static19.anIntArray347[local20++] = local913.anInt685;
							continue;
						}
						if (local174 == 2502) {
							Static19.anIntArray347[local20++] = local913.anInt677;
							continue;
						}
						if (local174 == 2503) {
							Static19.anIntArray347[local20++] = local913.anInt660;
							continue;
						}
						if (local174 == 2504) {
							Static19.anIntArray347[local20++] = local913.aBoolean29 ? 1 : 0;
							continue;
						}
						if (local174 == 2505) {
							Static19.anIntArray347[local20++] = local913.anInt669;
							continue;
						}
					} else if (local174 < 2700) {
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
						if (local174 == 2600) {
							Static19.anIntArray347[local20++] = local913.anInt675;
							continue;
						}
						if (local174 == 2601) {
							Static19.anIntArray347[local20++] = local913.anInt716;
							continue;
						}
						if (local174 == 2602) {
							Static46.aClass36Array23[local24++] = local913.aClass36_369;
							continue;
						}
						if (local174 == 2603) {
							Static19.anIntArray347[local20++] = local913.anInt714;
							continue;
						}
						if (local174 == 2604) {
							Static19.anIntArray347[local20++] = local913.anInt686;
							continue;
						}
					} else if (local174 < 2800) {
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
						if (local174 == 2700) {
							Static19.anIntArray347[local20++] = local913.anInt703;
							continue;
						}
						if (local174 == 2701) {
							if (local913.anInt703 == -1) {
								Static19.anIntArray347[local20++] = 0;
							} else {
								Static19.anIntArray347[local20++] = local913.anInt692;
							}
							continue;
						}
					} else if (local174 < 2900) {
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
						if (local174 == 2800) {
							Static19.anIntArray347[local20++] = Static89.method1638(Static67.method1163(local913));
							continue;
						}
					} else if (local174 < 3200) {
						if (local174 == 3100) {
							local24--;
							local536 = Static46.aClass36Array23[local24];
							Static40.method1546(local536, 0, Static58.aClass36_735);
							continue;
						}
						if (local174 == 3101) {
							local20 -= 2;
							Static11.method222(Static19.anIntArray347[local20 + 1], Static19.anIntArray347[local20], Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3);
							continue;
						}
						if (local174 == 3102) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							if (local722 >= 0 && Static101.anIntArray323.length > local722 && Static101.anIntArray323[local722] != -1) {
								Static100.aBoolean118 = true;
								Static78.aBoolean85 = true;
								Static109.anInt2825 = local722;
							}
							continue;
						}
						if (local174 == 3103) {
							Static11.method220();
							continue;
						}
					} else if (local174 < 3300) {
						if (local174 == 3200) {
							local20 -= 3;
							Static32.method702(Static19.anIntArray347[local20 + 1], Static19.anIntArray347[local20 + 2], Static19.anIntArray347[local20]);
							continue;
						}
						if (local174 == 3201) {
							local20--;
							Static63.method1123(Static19.anIntArray347[local20]);
							continue;
						}
						if (local174 == 3202) {
							local20 -= 2;
							Static50.method967(Static19.anIntArray347[local20 + 1], Static19.anIntArray347[local20]);
							continue;
						}
					} else if (local174 < 3400) {
						if (local174 == 3300) {
							Static19.anIntArray347[local20++] = Static113.anInt2952;
							continue;
						}
						if (local174 == 3301) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = Static39.method755(local727, local722);
							continue;
						}
						if (local174 == 3302) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = Static35.method725(local727, local722);
							continue;
						}
						if (local174 == 3303) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = Static96.method1806(local722, local727);
							continue;
						}
						if (local174 == 3304) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = Static76.method1461(local722).anInt2010;
							continue;
						}
						if (local174 == 3305) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = Static74.anIntArray236[local722];
							continue;
						}
						if (local174 == 3306) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = Static25.anIntArray49[local722];
							continue;
						}
					} else if (local174 < 3700) {
						if (local174 == 3600) {
							if (Static106.anInt2726 == 0) {
								Static19.anIntArray347[local20++] = -2;
							} else if (Static106.anInt2726 == 1) {
								Static19.anIntArray347[local20++] = -1;
							} else {
								Static19.anIntArray347[local20++] = Static7.anInt189;
							}
							continue;
						}
						if (local174 == 3601) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							if (Static106.anInt2726 == 2 && local722 < Static7.anInt189) {
								Static46.aClass36Array23[local24++] = Static43.aClass36Array21[local722];
								continue;
							}
							Static46.aClass36Array23[local24++] = Static58.aClass36_735;
							continue;
						}
						if (local174 == 3602) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							if (Static106.anInt2726 == 2 && Static7.anInt189 > local722) {
								Static19.anIntArray347[local20++] = Static36.anIntArray130[local722];
								continue;
							}
							Static19.anIntArray347[local20++] = 0;
							continue;
						}
						if (local174 == 3603) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							if (Static106.anInt2726 == 2 && Static7.anInt189 > local722) {
								Static19.anIntArray347[local20++] = Static106.anIntArray330[local722];
								continue;
							}
							Static19.anIntArray347[local20++] = 0;
							continue;
						}
					} else if (local174 < 4100) {
						if (local174 == 4000) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = local727 + local722;
							continue;
						}
						if (local174 == 4001) {
							local20 -= 2;
							local727 = Static19.anIntArray347[local20 + 1];
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = local722 - local727;
							continue;
						}
						if (local174 == 4002) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = local722 * local727;
							continue;
						}
						if (local174 == 4003) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = local722 / local727;
							continue;
						}
						if (local174 == 4004) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = (int) (Math.random() * (double) local722);
							continue;
						}
						if (local174 == 4005) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = (int) ((double) (local722 + 1) * Math.random());
							continue;
						}
						if (local174 == 4006) {
							local20 -= 5;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							local580 = Static19.anIntArray347[local20 + 3];
							local1385 = Static19.anIntArray347[local20 + 2];
							local606 = Static19.anIntArray347[local20 + 4];
							Static19.anIntArray347[local20++] = (local606 - local1385) * (-local722 + local727) / (local580 - local1385) + local722;
							continue;
						}
						if (local174 == 4007) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = local722 + local727 * local722 / 100;
							continue;
						}
						if (local174 == 4008) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = 0x1 << local727 | local722;
							continue;
						}
						if (local174 == 4009) {
							local20 -= 2;
							local727 = Static19.anIntArray347[local20 + 1];
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = local722 & -(0x1 << local727) - 1;
							continue;
						}
						if (local174 == 4010) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = (local722 & 0x1 << local727) == 0 ? 0 : 1;
							continue;
						}
						if (local174 == 4011) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = local722 % local727;
							continue;
						}
						if (local174 == 4012) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							if (local722 == 0) {
								Static19.anIntArray347[local20++] = 0;
							} else {
								Static19.anIntArray347[local20++] = (int) Math.pow((double) local722, (double) local727);
							}
							continue;
						}
						if (local174 == 4013) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							if (local722 == 0) {
								Static19.anIntArray347[local20++] = 0;
							} else if (local727 == 0) {
								Static19.anIntArray347[local20++] = Integer.MAX_VALUE;
							} else {
								Static19.anIntArray347[local20++] = (int) Math.pow((double) local722, 1.0D / (double) local727);
							}
							continue;
						}
						if (local174 == 4014) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = local722 & local727;
							continue;
						}
						if (local174 == 4015) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							Static19.anIntArray347[local20++] = local727 | local722;
							continue;
						}
					} else if (local174 < 4200) {
						if (local174 == 4100) {
							local24--;
							local536 = Static46.aClass36Array23[local24];
							local20--;
							local727 = Static19.anIntArray347[local20];
							Static46.aClass36Array23[local24++] = Static49.method949(new Class36[] { local536, Static57.method1055(local727) });
							continue;
						}
						if (local174 == 4101) {
							local24 -= 2;
							local1904 = Static46.aClass36Array23[local24 + 1];
							local536 = Static46.aClass36Array23[local24];
							Static46.aClass36Array23[local24++] = Static49.method949(new Class36[] { local536, local1904 });
							continue;
						}
						if (local174 == 4102) {
							local24--;
							local536 = Static46.aClass36Array23[local24];
							local20--;
							local727 = Static19.anIntArray347[local20];
							Static46.aClass36Array23[local24++] = Static49.method949(new Class36[] { local536, Static15.method271(local727) });
							continue;
						}
						if (local174 == 4103) {
							local24--;
							local536 = Static46.aClass36Array23[local24];
							Static46.aClass36Array23[local24++] = local536.method1016();
							continue;
						}
						if (local174 == 4104) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							@Pc(1996) long local1996 = (long) local722 * 86400000L + 1014768000000L;
							Static74.aCalendar1.setTime(new Date(local1996));
							local580 = Static74.aCalendar1.get(5);
							local606 = Static74.aCalendar1.get(2);
							local2014 = Static74.aCalendar1.get(1);
							Static46.aClass36Array23[local24++] = Static49.method949(new Class36[] { Static57.method1055(local580), Static91.aClass36_1128, Static14.aClass36Array51[local606], Static91.aClass36_1128, Static57.method1055(local2014) });
							continue;
						}
						if (local174 == 4105) {
							local24 -= 2;
							local536 = Static46.aClass36Array23[local24];
							local1904 = Static46.aClass36Array23[local24 + 1];
							if (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass67_2 != null && Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass67_2.aBoolean134) {
								Static46.aClass36Array23[local24++] = local1904;
								continue;
							}
							Static46.aClass36Array23[local24++] = local536;
							continue;
						}
						if (local174 == 4106) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static46.aClass36Array23[local24++] = Static57.method1055(local722);
							continue;
						}
						if (local174 == 4107) {
							local24 -= 2;
							Static19.anIntArray347[local20++] = Static46.aClass36Array23[local24].method1034(Static46.aClass36Array23[local24 + 1]);
							continue;
						}
						@Pc(2154) Class2_Sub1_Sub1_Sub2 local2154;
						@Pc(2149) byte[] local2149;
						if (local174 == 4108) {
							local20 -= 2;
							local24--;
							local536 = Static46.aClass36Array23[local24];
							local727 = Static19.anIntArray347[local20];
							local1385 = Static19.anIntArray347[local20 + 1];
							local2149 = Static112.aClass3_Sub1_15.method928(0, local1385);
							local2154 = new Class2_Sub1_Sub1_Sub2(local2149);
							Static19.anIntArray347[local20++] = local2154.method473(local536, local727);
							continue;
						}
						if (local174 == 4109) {
							local24--;
							local536 = Static46.aClass36Array23[local24];
							local20 -= 2;
							local727 = Static19.anIntArray347[local20];
							local1385 = Static19.anIntArray347[local20 + 1];
							local2149 = Static112.aClass3_Sub1_15.method928(0, local1385);
							local2154 = new Class2_Sub1_Sub1_Sub2(local2149);
							Static19.anIntArray347[local20++] = local2154.method468(local536, local727);
							continue;
						}
					} else if (local174 < 4300) {
						if (local174 == 4200) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static46.aClass36Array23[local24++] = Static43.method832(local722).aClass36_1397;
							continue;
						}
						@Pc(2249) Class2_Sub1_Sub18 local2249;
						if (local174 == 4201) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							local2249 = Static43.method832(local722);
							if (local727 >= 1 && local727 <= 5 && local2249.aClass36Array49[local727 - 1] != null) {
								Static46.aClass36Array23[local24++] = local2249.aClass36Array49[local727 - 1];
								continue;
							}
							Static46.aClass36Array23[local24++] = Static58.aClass36_735;
							continue;
						}
						if (local174 == 4202) {
							local20 -= 2;
							local722 = Static19.anIntArray347[local20];
							local727 = Static19.anIntArray347[local20 + 1];
							local2249 = Static43.method832(local722);
							if (local727 >= 1 && local727 <= 5 && local2249.aClass36Array50[local727 - 1] != null) {
								Static46.aClass36Array23[local24++] = local2249.aClass36Array50[local727 - 1];
								continue;
							}
							Static46.aClass36Array23[local24++] = Static58.aClass36_735;
							continue;
						}
						if (local174 == 4203) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = Static43.method832(local722).anInt2804;
							continue;
						}
						if (local174 == 4204) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = Static43.method832(local722).anInt2837 == 1 ? 1 : 0;
							continue;
						}
						@Pc(2394) Class2_Sub1_Sub18 local2394;
						if (local174 == 4205) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							local2394 = Static43.method832(local722);
							if (local2394.anInt2823 == -1 && local2394.anInt2836 >= 0) {
								Static19.anIntArray347[local20++] = local2394.anInt2836;
								continue;
							}
							Static19.anIntArray347[local20++] = local722;
							continue;
						}
						if (local174 == 4206) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							local2394 = Static43.method832(local722);
							if (local2394.anInt2823 >= 0 && local2394.anInt2836 >= 0) {
								Static19.anIntArray347[local20++] = local2394.anInt2836;
								continue;
							}
							Static19.anIntArray347[local20++] = local722;
							continue;
						}
						if (local174 == 4207) {
							local20--;
							local722 = Static19.anIntArray347[local20];
							Static19.anIntArray347[local20++] = Static43.method832(local722).aBoolean132 ? 1 : 0;
							continue;
						}
					}
				} else {
					if (local174 >= 2000) {
						local20--;
						local913 = Static71.method1274(Static19.anIntArray347[local20]);
						local174 -= 1000;
					} else {
						local913 = local856 ? Static77.aClass2_Sub1_Sub6_4 : Static68.aClass2_Sub1_Sub6_3;
					}
					if (local174 == 1300) {
						local20--;
						local727 = Static19.anIntArray347[local20] - 1;
						if (local727 >= 0 && local727 <= 9) {
							local24--;
							local913.method546(Static46.aClass36Array23[local24], local727);
							continue;
						}
						local24--;
						continue;
					}
					if (local174 == 1301) {
						local20 -= 2;
						local727 = Static19.anIntArray347[local20];
						local1385 = Static19.anIntArray347[local20 + 1];
						local913.aClass2_Sub1_Sub6_2 = Static76.method1462(local1385, local727);
						continue;
					}
					if (local174 == 1302) {
						local20--;
						local913.aBoolean35 = Static19.anIntArray347[local20] == 1;
						continue;
					}
					if (local174 == 1303) {
						local20--;
						local913.anInt709 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1304) {
						local20--;
						local913.anInt707 = Static19.anIntArray347[local20];
						continue;
					}
					if (local174 == 1305) {
						local24--;
						local913.aClass36_368 = Static46.aClass36Array23[local24];
						continue;
					}
					if (local174 == 1306) {
						local24--;
						local913.aClass36_373 = Static46.aClass36Array23[local24];
						continue;
					}
				}
				return;
			}
		} catch (@Pc(4157) Exception local4157) {
			Static90.method1648(local4157, "CS2 - scr:" + local15.aLong89 + " op:" + local37);
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
	public static void method1685() {
		if (Static40.anInt2199 == 0) {
			return;
		}
		@Pc(10) int local10 = 0;
		if (Static10.anInt243 != 0) {
			local10 = 1;
		}
		@Pc(19) Class2_Sub1_Sub1_Sub2 local19 = Static11.aClass2_Sub1_Sub1_Sub2_1;
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			if (Static99.aClass36Array35[local26] != null) {
				@Pc(36) int local36 = Static88.anIntArray270[local26];
				@Pc(38) byte local38 = 0;
				@Pc(42) Class36 local42 = Static8.aClass36Array5[local26];
				if (local42 != null && local42.method1042(Static95.aClass36_1209)) {
					local38 = 1;
					local42 = local42.method1020(5);
				}
				if (local42 != null && local42.method1042(Static29.aClass36_421)) {
					local42 = local42.method1020(5);
					local38 = 2;
				}
				@Pc(104) int local104;
				if ((local36 == 3 || local36 == 7) && (local36 == 7 || Static3.anInt1302 == 0 || Static3.anInt1302 == 1 && Static26.method549(local42))) {
					local104 = 329 - local10 * 13;
					local10++;
					local19.method456(Static63.aClass36_787, 4, local104, 0);
					local19.method456(Static63.aClass36_787, 4, local104 - 1, 65535);
					@Pc(127) int local127 = local19.method458(Static63.aClass36_787) + 4;
					local127 += local19.method460(32);
					if (local38 == 1) {
						Static4.aClass2_Sub1_Sub1_Sub1Array5[0].method97(local127, local104 - 12);
						local127 += 14;
					}
					if (local38 == 2) {
						Static4.aClass2_Sub1_Sub1_Sub1Array5[1].method97(local127, local104 - 12);
						local127 += 14;
					}
					local19.method456(Static49.method949(new Class36[] { local42, Static118.aClass36_1463, Static99.aClass36Array35[local26] }), local127, local104, 0);
					local19.method456(Static49.method949(new Class36[] { local42, Static118.aClass36_1463, Static99.aClass36Array35[local26] }), local127, local104 - 1, 65535);
					if (local10 >= 5) {
						return;
					}
				}
				if (local36 == 5 && Static3.anInt1302 < 2) {
					local104 = 329 - local10 * 13;
					local19.method456(Static99.aClass36Array35[local26], 4, local104, 0);
					local10++;
					local19.method456(Static99.aClass36Array35[local26], 4, local104 - 1, 65535);
					if (local10 >= 5) {
						return;
					}
				}
				if (local36 == 6 && Static3.anInt1302 < 2) {
					local104 = 329 - local10 * 13;
					local19.method456(Static49.method949(new Class36[] { Static62.aClass36_772, Static34.aClass36_479, local42, Static118.aClass36_1463, Static99.aClass36Array35[local26] }), 4, local104, 0);
					local10++;
					local19.method456(Static49.method949(new Class36[] { Static62.aClass36_772, Static34.aClass36_479, local42, Static118.aClass36_1463, Static99.aClass36Array35[local26] }), 4, local104 - 1, 65535);
					if (local10 >= 5) {
						return;
					}
				}
			}
		}
	}
}
