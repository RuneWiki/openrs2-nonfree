import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!bf;")
	public static Class11 aClass11_58;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!sd;")
	public static Class2 aClass2_17;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[50][];

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1077 = Static56.method972("scrollen:");

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1088 = Static56.method972("Connection timed out)3");

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1078 = aClass5_1088;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1084 = Static56.method972("as it was used to break our rules)3");

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1079 = aClass5_1084;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "[I")
	public static int[] anIntArray269 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
	public static int anInt2361 = 0;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1080 = Static56.method972(",Zffentlicher Chat");

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1081 = Static56.method972("Connection lost");

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1082 = aClass5_1081;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1083 = Static56.method972("(Y");

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1085 = Static56.method972("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	public static int anInt2363 = 0;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1086 = Static56.method972("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1087 = Static56.method972(")1");

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1089 = Static56.method972("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1537() {
		if (Static93.aClass25_1 == null) {
			return;
		}
		Static76.method1698();
		if (Static78.anInt1964 > 0) {
			Static93.aClass25_1.method1156(256);
			Static78.anInt1964 = 0;
		}
		Static93.aClass25_1.method1150();
		Static93.aClass25_1 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLclient!mc;)V")
	public static void method1540(@OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt1516 == 0) {
			return;
		}
		@Pc(40) int local40;
		@Pc(46) int local46;
		if (arg0.anInt1525 != -1 && arg0.anInt1525 < 32768) {
			@Pc(31) Class3_Sub1_Sub1_Sub1_Sub1 local31 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt1525];
			if (local31 != null) {
				local40 = arg0.anInt1567 - local31.anInt1567;
				local46 = arg0.anInt1543 - local31.anInt1543;
				if (local40 != 0 || local46 != 0) {
					arg0.anInt1560 = (int) (Math.atan2((double) local40, (double) local46) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(79) int local79;
		if (arg0.anInt1525 >= 32768) {
			local79 = arg0.anInt1525 - 32768;
			if (Static114.anInt2962 == local79) {
				local79 = 2047;
			}
			@Pc(88) Class3_Sub1_Sub1_Sub1_Sub2 local88 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local79];
			if (local88 != null) {
				local46 = arg0.anInt1567 - local88.anInt1567;
				@Pc(104) int local104 = arg0.anInt1543 - local88.anInt1543;
				if (local46 != 0 || local104 != 0) {
					arg0.anInt1560 = (int) (Math.atan2((double) local46, (double) local104) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1578 != 0 || arg0.anInt1565 != 0) && (arg0.anInt1574 == 0 || arg0.anInt1542 > 0)) {
			local79 = arg0.anInt1567 - (arg0.anInt1578 - Static109.anInt2875 - Static109.anInt2875) * 64;
			local40 = arg0.anInt1543 - (arg0.anInt1565 - Static52.anInt1378 - Static52.anInt1378) * 64;
			if (local79 != 0 || local40 != 0) {
				arg0.anInt1560 = (int) (Math.atan2((double) local79, (double) local40) * 325.949D) & 0x7FF;
			}
			arg0.anInt1565 = 0;
			arg0.anInt1578 = 0;
		}
		local79 = arg0.anInt1560 - arg0.anInt1517 & 0x7FF;
		if (local79 == 0) {
			arg0.anInt1535 = 0;
			return;
		}
		arg0.anInt1535++;
		@Pc(227) boolean local227;
		if (local79 <= 1024) {
			arg0.anInt1517 += arg0.anInt1516;
			local227 = true;
			if (local79 < arg0.anInt1516 || 2048 - arg0.anInt1516 < local79) {
				local227 = false;
				arg0.anInt1517 = arg0.anInt1560;
			}
			if (arg0.anInt1568 == arg0.anInt1579 && (arg0.anInt1535 > 25 || local227)) {
				if (arg0.anInt1549 == -1) {
					arg0.anInt1568 = arg0.anInt1531;
				} else {
					arg0.anInt1568 = arg0.anInt1549;
				}
			}
		} else {
			local227 = true;
			arg0.anInt1517 -= arg0.anInt1516;
			if (local79 < arg0.anInt1516 || local79 > 2048 - arg0.anInt1516) {
				arg0.anInt1517 = arg0.anInt1560;
				local227 = false;
			}
			if (arg0.anInt1568 == arg0.anInt1579 && (arg0.anInt1535 > 25 || local227)) {
				if (arg0.anInt1530 == -1) {
					arg0.anInt1568 = arg0.anInt1531;
				} else {
					arg0.anInt1568 = arg0.anInt1530;
				}
			}
		}
		arg0.anInt1517 &= 0x7FF;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILclient!bf;)Lclient!bb;")
	public static Class3_Sub1_Sub2_Sub1 method1541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static16.method398(arg1, arg0, arg2) ? Static116.method1969() : null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([BIIZIILclient!l;III[Lclient!h;)V")
	public static void method1543(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class30[] arg9) {
		@Pc(10) Class3_Sub6 local10 = new Class3_Sub6(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method1629();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method1629();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(46) int local46 = local24 >> 6 & 0x3F;
				@Pc(50) int local50 = local24 >> 12;
				@Pc(54) int local54 = local10.method1587();
				@Pc(58) int local58 = local54 >> 2;
				@Pc(62) int local62 = local54 & 0x3;
				if (arg4 == local50 && local46 >= arg6 && arg6 + 8 > local46 && arg7 <= local40 && local40 < arg7 + 8) {
					@Pc(97) Class3_Sub1_Sub15 local97 = Static72.method1211(local12);
					@Pc(115) int local115 = arg3 + Static67.method1168(arg1, local46 & 0x7, local40 & 0x7, local62, local97.anInt2331, local97.anInt2312);
					@Pc(133) int local133 = arg8 + Static15.method356(local97.anInt2312, local46 & 0x7, local97.anInt2331, local62, arg1, local40 & 0x7);
					if (local115 > 0 && local133 > 0 && local115 < 103 && local133 < 103) {
						@Pc(152) Class30 local152 = null;
						@Pc(154) int local154 = arg2;
						if ((Static93.aByteArrayArrayArray5[1][local115][local133] & 0x2) == 2) {
							local154 = arg2 - 1;
						}
						if (local154 >= 0) {
							local152 = arg9[local154];
						}
						Static31.method773(local58, arg5, local133, local12, arg2, local115, local152, local62 + arg1 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lclient!sd;")
	public static Class2 method1544(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class2_Sub1");
			@Pc(15) Class2 local15 = (Class2) local11.getDeclaredConstructor().newInstance();
			local15.method1317(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class2_Sub2 local28 = new Class2_Sub2();
			local28.method1317(arg1, arg2, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	public static void method1545() {
		anIntArray269 = null;
		aByteArrayArray7 = null;
		aClass11_58 = null;
		aClass3_Sub1_Sub2_Sub4_11 = null;
		aClass5_1077 = null;
		aClass5_1088 = null;
		aClass5_1083 = null;
		aClass5_1082 = null;
		aClass5_1085 = null;
		aClass5_1079 = null;
		aClass5_1089 = null;
		aClass2_17 = null;
		aClass5_1078 = null;
		aClass5_1084 = null;
		aClass5_1080 = null;
		aClass5_1081 = null;
		aClass5_1086 = null;
		aClass5_1087 = null;
	}
}
