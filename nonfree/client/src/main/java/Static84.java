import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!na", name = "Eb", descriptor = "Lclient!af;")
	public static Class7 aClass7_15;

	@OriginalMember(owner = "client!na", name = "pb", descriptor = "Lclient!lf;")
	public static Class48 aClass48_37 = new Class48(20);

	@OriginalMember(owner = "client!na", name = "xb", descriptor = "I")
	public static int anInt2109 = 0;

	@OriginalMember(owner = "client!na", name = "Ab", descriptor = "[S")
	public static short[] aShortArray33 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!na", name = "Bb", descriptor = "[Lclient!h;")
	public static Class8_Sub1_Sub1_Sub4_Sub1[] aClass8_Sub1_Sub1_Sub4_Sub1Array1 = new Class8_Sub1_Sub1_Sub4_Sub1[2048];

	@OriginalMember(owner = "client!na", name = "Cb", descriptor = "I")
	public static int anInt2112 = 0;

	@OriginalMember(owner = "client!na", name = "Gb", descriptor = "[I")
	public static int[] anIntArray270 = new int[25];

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)Lclient!he;")
	public static Class8_Sub1_Sub11 method1244(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub1_Sub11 local10 = (Class8_Sub1_Sub11) Static86.aClass48_39.method1100((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static120.method1903(arg0, Static39.aClass14_14, Static27.aClass14_7);
		if (local10 != null) {
			Static86.aClass48_39.method1097(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	public static void method1246() {
		for (@Pc(17) Class8_Sub1_Sub1_Sub5 local17 = (Class8_Sub1_Sub1_Sub5) Static42.aClass49_4.method1107(); local17 != null; local17 = (Class8_Sub1_Sub1_Sub5) Static42.aClass49_4.method1109()) {
			if (Static42.anInt1024 != local17.anInt2102 || local17.aBoolean80) {
				local17.method2013();
			} else if (Static21.anInt655 >= local17.anInt2108) {
				local17.method1245(Static69.anInt1683);
				if (local17.aBoolean80) {
					local17.method2013();
				} else {
					Static3.aClass64_1.method1419(local17.anInt2102, local17.anInt2114, local17.anInt2115, local17.anInt2105, 60, local17, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZILclient!dd;Lclient!dd;Lclient!ub;)V")
	public static void method1247(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class14 arg2, @OriginalArg(4) Class8_Sub1_Sub3_Sub4_Sub1 arg3) {
		Static52.aClass14_17 = arg1;
		Static119.aClass14_28 = arg2;
		Static82.aBoolean77 = arg0;
		Static119.aClass14_28.method1144(10);
		Static129.aClass8_Sub1_Sub3_Sub4_Sub1_4 = arg3;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZILclient!md;)V")
	public static void method1248(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub1 arg1) {
		if (Static73.aClass8_Sub20_25 == null) {
			Static77.method1121(255, (byte) 0, 255, 0, null, true);
			Static91.aClass14_Sub1Array1[arg0] = arg1;
		} else {
			Static73.aClass8_Sub20_25.anInt2853 = arg0 * 8 + 5;
			@Pc(20) int local20 = Static73.aClass8_Sub20_25.method1853();
			@Pc(24) int local24 = Static73.aClass8_Sub20_25.method1853();
			arg1.method1175(local20, local24);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (Static108.aBoolean98 && Static42.anInt1024 != arg3) {
			return;
		}
		@Pc(33) int local33 = 0;
		if (arg4 == 0) {
			local33 = Static3.aClass64_1.method1397(arg3, arg2, arg0);
		}
		if (arg4 == 1) {
			local33 = Static3.aClass64_1.method1398(arg3, arg2, arg0);
		}
		if (arg4 == 2) {
			local33 = Static3.aClass64_1.method1435(arg3, arg2, arg0);
		}
		if (arg4 == 3) {
			local33 = Static3.aClass64_1.method1427(arg3, arg2, arg0);
		}
		@Pc(91) int local91;
		if (local33 != 0) {
			@Pc(84) int local84 = local33 >> 14 & 0x7FFF;
			local91 = Static3.aClass64_1.method1389(arg3, arg2, arg0, local33);
			@Pc(95) int local95 = local91 & 0x1F;
			@Pc(101) int local101 = local91 >> 6 & 0x3;
			@Pc(112) Class8_Sub1_Sub4 local112;
			if (arg4 == 0) {
				Static3.aClass64_1.method1388(arg3, arg2, arg0);
				local112 = Static50.method752(local84);
				if (local112.anInt424 != 0) {
					Static97.aClass42Array1[arg3].method1019(local112.aBoolean22, arg2, local101, arg0, local95);
				}
			}
			if (arg4 == 1) {
				Static3.aClass64_1.method1428(arg3, arg2, arg0);
			}
			if (arg4 == 2) {
				Static3.aClass64_1.method1432(arg3, arg2, arg0);
				local112 = Static50.method752(local84);
				if (local112.anInt443 + arg2 > 103 || arg0 + local112.anInt443 > 103 || arg2 + local112.anInt455 > 103 || arg0 + local112.anInt455 > 103) {
					return;
				}
				if (local112.anInt424 != 0) {
					Static97.aClass42Array1[arg3].method1015(local112.aBoolean22, arg0, local101, local112.anInt443, arg2, local112.anInt455);
				}
			}
			if (arg4 == 3) {
				Static3.aClass64_1.method1434(arg3, arg2, arg0);
				local112 = Static50.method752(local84);
				if (local112.anInt424 == 1) {
					Static97.aClass42Array1[arg3].method1030(arg2, arg0);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local91 = arg3;
		if (arg3 < 3 && (Static105.aByteArrayArrayArray5[1][arg2][arg0] & 0x2) == 2) {
			local91 = arg3 + 1;
		}
		Static34.method561(arg3, arg5, local91, Static3.aClass64_1, arg1, Static97.aClass42Array1[arg3], arg2, arg0, arg6);
		return;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
	public static void method1250() {
		aShortArray33 = null;
		anIntArray270 = null;
		aClass48_37 = null;
		aClass7_15 = null;
		aClass8_Sub1_Sub1_Sub4_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BILclient!ic;II)V")
	public static void method1251(@OriginalArg(1) int arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class8_Sub24 local8 = Static69.method1044(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray10 != null) {
			@Pc(18) Class8_Sub19 local18 = new Class8_Sub19();
			local18.aClass34_1240 = arg1;
			local18.aClass8_Sub24_13 = local8;
			local18.anObjectArray3 = local8.anObjectArray10;
			local18.anInt2653 = arg2;
			Static106.method1497(local18);
		}
		@Pc(38) boolean local38 = true;
		if (local8.anInt3143 > 0) {
			local38 = Static124.method1960(local8);
		}
		if (!local38 || !Static120.method1900(Static99.method1445(local8), arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static106.aClass8_Sub20_Sub1_3.method1907(238);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 2) {
			Static106.aClass8_Sub20_Sub1_3.method1907(106);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 3) {
			Static106.aClass8_Sub20_Sub1_3.method1907(107);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 4) {
			Static106.aClass8_Sub20_Sub1_3.method1907(155);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 5) {
			Static106.aClass8_Sub20_Sub1_3.method1907(176);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 6) {
			Static106.aClass8_Sub20_Sub1_3.method1907(89);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 7) {
			Static106.aClass8_Sub20_Sub1_3.method1907(203);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 8) {
			Static106.aClass8_Sub20_Sub1_3.method1907(33);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 9) {
			Static106.aClass8_Sub20_Sub1_3.method1907(214);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
		if (arg2 == 10) {
			Static106.aClass8_Sub20_Sub1_3.method1907(123);
			Static106.aClass8_Sub20_Sub1_3.method1873(arg0);
			Static106.aClass8_Sub20_Sub1_3.method1884(arg3);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1252(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static125.aClass36_1);
		arg0.addMouseMotionListener(Static125.aClass36_1);
		arg0.addFocusListener(Static125.aClass36_1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)Z")
	public static boolean method1253(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
