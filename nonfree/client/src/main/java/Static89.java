import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!ta;")
	public static Class14 aClass14_28;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array29;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!ac;")
	public static Class3 aClass3_20;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1079 = Static14.method2017("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1080 = Static14.method2017("backleft2");

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1081 = Static14.method2017("Chat panel redrawn");

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1082 = Static14.method2017("Wordpack geladen)3");

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1083 = Static14.method2017(" ");

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public static int anInt2332 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!ja;")
	public static Class31 aClass31_5 = new Class31(4096);

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1084 = aClass36_1083;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "J")
	public static volatile long aLong71 = 0L;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public static int anInt2336 = 0;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1086 = Static14.method2017("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1085 = aClass36_1086;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "[Lclient!jc;")
	public static Class33[] aClass33Array1 = new Class33[50];

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1087 = Static14.method2017(")3");

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "[I")
	public static int[] anIntArray276 = new int[128];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)I")
	public static int method1638(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kc;Lclient!kc;BLclient!ac;)[Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1[] method1639(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(3) Class3 arg2) {
		@Pc(8) int local8 = arg2.method932(arg0);
		@Pc(22) int local22 = arg2.method936(local8, arg1);
		return Static24.method511(local22, local8, arg2);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1640() {
		aClass36_1086 = null;
		aClass14_28 = null;
		aClass36_1087 = null;
		aClass31_5 = null;
		aClass33Array1 = null;
		aClass36_1084 = null;
		aClass36_1083 = null;
		aClass36_1085 = null;
		aClass3_20 = null;
		aClass36_1082 = null;
		anIntArray276 = null;
		aClass36_1081 = null;
		aClass36_1080 = null;
		aClass2_Sub1_Sub1_Sub3Array29 = null;
		aClass36_1079 = null;
		aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)Lclient!eb;")
	public static Class2_Sub1_Sub5 method1641(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub5 local10 = (Class2_Sub1_Sub5) Static105.aClass22_38.method711((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static32.aClass3_4.method928(arg0, 3);
		local10 = new Class2_Sub1_Sub5();
		if (local20 != null) {
			local10.method516(new Class2_Sub12(local20));
		}
		Static105.aClass22_38.method712(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg3 < 1 || arg0 > 102 || arg3 > 102) {
			return;
		}
		if (Static35.aBoolean51 && Static92.anInt2412 != arg2) {
			return;
		}
		@Pc(33) int local33 = 0;
		if (arg6 == 0) {
			local33 = Static85.aClass61_1.method1710(arg2, arg0, arg3);
		}
		if (arg6 == 1) {
			local33 = Static85.aClass61_1.method1737(arg2, arg0, arg3);
		}
		if (arg6 == 2) {
			local33 = Static85.aClass61_1.method1702(arg2, arg0, arg3);
		}
		if (arg6 == 3) {
			local33 = Static85.aClass61_1.method1713(arg2, arg0, arg3);
		}
		@Pc(96) int local96;
		if (local33 != 0) {
			@Pc(89) int local89 = local33 >> 14 & 0x7FFF;
			local96 = Static85.aClass61_1.method1699(arg2, arg0, arg3, local33);
			@Pc(102) int local102 = local96 >> 6 & 0x3;
			@Pc(106) int local106 = local96 & 0x1F;
			@Pc(117) Class2_Sub1_Sub13 local117;
			if (arg6 == 0) {
				Static85.aClass61_1.method1738(arg2, arg0, arg3);
				local117 = Static2.method2072(local89);
				if (local117.aBoolean95) {
					Static11.aClass4Array1[arg2].method128(arg0, local102, local117.aBoolean103, arg3, local106);
				}
			}
			if (arg6 == 1) {
				Static85.aClass61_1.method1693(arg2, arg0, arg3);
			}
			if (arg6 == 2) {
				Static85.aClass61_1.method1720(arg2, arg0, arg3);
				local117 = Static2.method2072(local89);
				if (arg0 + local117.anInt2326 > 103 || arg3 + local117.anInt2326 > 103 || arg0 + local117.anInt2288 > 103 || arg3 + local117.anInt2288 > 103) {
					return;
				}
				if (local117.aBoolean95) {
					Static11.aClass4Array1[arg2].method134(arg3, local117.aBoolean103, local117.anInt2288, arg0, local102, local117.anInt2326);
				}
			}
			if (arg6 == 3) {
				Static85.aClass61_1.method1709(arg2, arg0, arg3);
				local117 = Static2.method2072(local89);
				if (local117.aBoolean95 && local117.anInt2303 == 1) {
					Static11.aClass4Array1[arg2].method135(arg3, arg0);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local96 = arg2;
		if (arg2 < 3 && (Static16.aByteArrayArrayArray3[1][arg0][arg3] & 0x2) == 2) {
			local96 = arg2 + 1;
		}
		Static56.method1043(arg1, arg4, Static85.aClass61_1, arg3, arg2, local96, arg5, arg0, Static11.aClass4Array1[arg2]);
		return;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLclient!kc;Lclient!kc;I)V")
	public static void method1643(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) Class36 arg2) {
		@Pc(5) short local5 = 151;
		if (Static108.aBoolean131) {
			Static108.aBoolean131 = false;
			Static107.method1939();
			Static51.method1831();
			Static85.method1556();
			Static1.method4();
			Static51.method1834(Static45.anInt1225, Static11.aClass2_Sub1_Sub1_Sub2_1, Static15.anInt316, Static3.anInt1302);
			Static84.method1518(-1, Static94.anInt2471 == -1, Static101.anIntArray323, Static109.anInt2825);
			Static91.aBoolean105 = true;
			Static110.aBoolean133 = true;
			Static105.aBoolean126 = true;
		}
		Static8.method181();
		@Pc(60) int local60 = local5 - 3;
		Static11.aClass2_Sub1_Sub1_Sub2_1.method454(arg2, 257, 148, 0);
		Static11.aClass2_Sub1_Sub1_Sub2_1.method454(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local60 += 15;
			if (arg0) {
				@Pc(85) int local85 = Static11.aClass2_Sub1_Sub1_Sub2_1.method458(arg1) + 4;
				Static54.method1591(257 - local85 / 2, 152, local85, 11, 0);
			}
			Static11.aClass2_Sub1_Sub1_Sub2_1.method454(arg1, 257, 163, 0);
			Static11.aClass2_Sub1_Sub1_Sub2_1.method454(arg1, 256, 162, 16777215);
		}
		Static73.method1296();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)I")
	public static int method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(24) int local24 = 65536 - Class2_Sub1_Sub1_Sub4.anIntArray261[arg2 * 1024 / arg1] >> 1;
		return (arg0 * (65536 - local24) >> 16) + (local24 * arg3 >> 16);
	}
}
