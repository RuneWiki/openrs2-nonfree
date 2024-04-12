import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public static int anInt2497;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt2498;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!p;")
	public static Class45 aClass45_31;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 14)
	public static void method1653() {
		Class24.aClass40_720 = null;
		Class24.aClass40_719 = null;
		Class24.aClass40_718 = null;
		Class24.aClass40_722 = null;
		Class24.aClass40_721 = null;
		Class24.aClass40_717 = null;
		aClass45_31 = null;
		Class24.aClass40_716 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZ)I", line = 38)
	public static int method1655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg2 & arg0 - 1;
		@Pc(33) int local33 = Static19.method387(local7, local17);
		@Pc(40) int local40 = Static19.method387(local7 + 1, local17);
		@Pc(51) int local51 = Static19.method387(local7, local17 + 1);
		@Pc(60) int local60 = Static19.method387(local7 + 1, local17 + 1);
		@Pc(67) int local67 = Static72.method1326(local13, local33, arg0, local40);
		@Pc(74) int local74 = Static72.method1326(local13, local51, arg0, local60);
		return Static72.method1326(local23, local67, arg0, local74);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!pc;)V", line = 77)
	public static synchronized void method1657(@OriginalArg(1) Class2_Sub10 arg0) {
		Static20.aClass2_Sub10_1 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V", line = 88)
	public static synchronized void method1658() {
		if (Static20.aClass2_Sub10_1 != null) {
			Static20.aClass2_Sub10_1.method1287(256);
		}
		Static10.method230(256);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 111)
	public static void method1659() {
		Static79.aClass18_1.method1275();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Class54.aLongArray5[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Class2_Sub12.aLongArray6[local29] = 0L;
		}
		Static22.anInt587 = 0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!mc;)I", line = 145)
	public static int method1660(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub13 arg1) {
		if (arg1.anIntArrayArray11 == null || arg0 >= arg1.anIntArrayArray11.length) {
			return -2;
		}
		try {
			@Pc(17) int local17 = 0;
			@Pc(22) int[] local22 = arg1.anIntArrayArray11[arg0];
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(31) int local31 = local22[local17++];
				@Pc(33) int local33 = 0;
				@Pc(35) byte local35 = 0;
				if (local31 == 0) {
					return local24;
				}
				if (local31 == 1) {
					local33 = Class59.anIntArray473[local22[local17++]];
				}
				if (local31 == 15) {
					local35 = 1;
				}
				if (local31 == 16) {
					local35 = 2;
				}
				if (local31 == 17) {
					local35 = 3;
				}
				if (local31 == 2) {
					local33 = Class32.anIntArray312[local22[local17++]];
				}
				if (local31 == 3) {
					local33 = Class12_Sub2.anIntArray234[local22[local17++]];
				}
				@Pc(103) int local103;
				@Pc(116) Class2_Sub2_Sub13 local116;
				@Pc(121) int local121;
				@Pc(133) int local133;
				if (local31 == 4) {
					local103 = local22[local17++] << 16;
					@Pc(110) int local110 = local103 + local22[local17++];
					local116 = Static73.method1340(local110);
					local121 = local22[local17++];
					if (local121 != -1 && (!Static97.method1669(local121).aBoolean66 || Class15.aBoolean37)) {
						for (local133 = 0; local133 < local116.anIntArray331.length; local133++) {
							if (local121 + 1 == local116.anIntArray331[local133]) {
								local33 += local116.anIntArray327[local133];
							}
						}
					}
				}
				if (local31 == 5) {
					local33 = Class38.anIntArray339[local22[local17++]];
				}
				if (local31 == 6) {
					local33 = Class11.anIntArray80[Class32.anIntArray312[local22[local17++]] - 1];
				}
				if (local31 == 7) {
					local33 = Class38.anIntArray339[local22[local17++]] * 100 / 46875;
				}
				if (local31 == 8) {
					local33 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378;
				}
				if (local31 == 9) {
					for (local103 = 0; local103 < 25; local103++) {
						if (Class41.aBooleanArray27[local103]) {
							local33 += Class32.anIntArray312[local103];
						}
					}
				}
				if (local31 == 10) {
					local103 = local22[local17++] << 16;
					local103 += local22[local17++];
					local116 = Static73.method1340(local103);
					local121 = local22[local17++];
					if (local121 != -1 && (!Static97.method1669(local121).aBoolean66 || Class15.aBoolean37)) {
						for (local133 = 0; local133 < local116.anIntArray331.length; local133++) {
							if (local121 + 1 == local116.anIntArray331[local133]) {
								local33 = 999999999;
								break;
							}
						}
					}
				}
				if (local31 == 11) {
					local33 = Class58.anInt2181;
				}
				if (local31 == 12) {
					local33 = Class42.anInt1813;
				}
				if (local31 == 13) {
					local103 = Class38.anIntArray339[local22[local17++]];
					@Pc(315) int local315 = local22[local17++];
					local33 = (0x1 << local315 & local103) == 0 ? 0 : 1;
				}
				if (local31 == 14) {
					local103 = local22[local17++];
					local33 = method1662(local103);
				}
				if (local31 == 18) {
					local33 = (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 >> 7) + Static79.anInt2058;
				}
				if (local31 == 19) {
					local33 = Static28.anInt725 + (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 >> 7);
				}
				if (local31 == 20) {
					local33 = local22[local17++];
				}
				if (local35 == 0) {
					if (local26 == 0) {
						local24 += local33;
					}
					if (local26 == 1) {
						local24 -= local33;
					}
					if (local26 == 2 && local33 != 0) {
						local24 /= local33;
					}
					if (local26 == 3) {
						local24 *= local33;
					}
					local26 = 0;
				} else {
					local26 = local35;
				}
			}
		} catch (@Pc(419) Exception local419) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 353)
	public static void method1661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 1171938384) + arg1);
		@Pc(17) Class2_Sub2_Sub9 local17 = (Class2_Sub2_Sub9) Class64.aClass6_7.method190(local11);
		if (local17 != null) {
			Class42.aClass41_1.method1204(local17);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 394)
	public static int method1662(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub2_Sub1 local7 = Static32.method621(arg0);
		@Pc(10) int local10 = local7.anInt171;
		@Pc(13) int local13 = local7.anInt174;
		@Pc(16) int local16 = local7.anInt170;
		@Pc(23) int local23 = Class61.anIntArray518[local16 - local10];
		return local23 & Class38.anIntArray339[local13] >> local10;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([II)V", line = 419)
	public static synchronized void method1663(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static20.aClass2_Sub10_1 != null) {
			Static20.aClass2_Sub10_1.method1286(arg0, 0, local2);
		}
		Static10.method230(local2);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Graphics;Lclient!fc;III)V", line = 450)
	public static void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) Class2_Sub2_Sub2_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static4.aClass45_4.method1476();
		Static46.aClass2_Sub2_Sub2_Sub3_11.method1320(0, 0);
		arg2.method578(Class21.aClass40_219, 55, 28, 16777215, true);
		if (arg4 == 0) {
			arg2.method578(Class62.aClass40_715, 55, 41, 65280, true);
		}
		if (arg4 == 1) {
			arg2.method578(Applet_Sub1.aClass40_106, 55, 41, 16776960, true);
		}
		if (arg4 == 2) {
			arg2.method578(Class59.aClass40_629, 55, 41, 16711680, true);
		}
		if (arg4 == 3) {
			arg2.method578(Class2_Sub2_Sub1.aClass40_46, 55, 41, 65535, true);
		}
		arg2.method578(Class2_Sub9.aClass40_368, 184, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method578(Class62.aClass40_715, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method578(Applet_Sub1.aClass40_106, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method578(Class59.aClass40_629, 184, 41, 16711680, true);
		}
		arg2.method578(Class44.aClass40_530, 324, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method578(Class62.aClass40_715, 324, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method578(Applet_Sub1.aClass40_106, 324, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method578(Class59.aClass40_629, 324, 41, 16711680, true);
		}
		arg2.method578(Class42.aClass40_522, 458, 33, 16777215, true);
		Static4.aClass45_4.method1474(arg1, 0, 453);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Z", line = 503)
	public static boolean method1665(@OriginalArg(0) int arg0) {
		if (Static84.aBooleanArray31[arg0]) {
			return true;
		} else if (Static49.aClass5_17.method59(arg0)) {
			@Pc(25) int local25 = Static49.aClass5_17.method76(arg0);
			if (local25 == 0) {
				Static84.aBooleanArray31[arg0] = true;
				return true;
			}
			if (Static46.aClass2_Sub2_Sub13ArrayArray1[arg0] == null) {
				Static46.aClass2_Sub2_Sub13ArrayArray1[arg0] = new Class2_Sub2_Sub13[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (Static46.aClass2_Sub2_Sub13ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static49.aClass5_17.method68(local47, arg0);
					if (local61 != null) {
						Static46.aClass2_Sub2_Sub13ArrayArray1[arg0][local47] = new Class2_Sub2_Sub13();
						Static46.aClass2_Sub2_Sub13ArrayArray1[arg0][local47].method1053(new Class2_Sub3(local61));
					}
				}
			}
			Static84.aBooleanArray31[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
