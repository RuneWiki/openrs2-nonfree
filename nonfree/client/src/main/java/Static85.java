import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "Lclient!jd;")
	public static Class34 aClass34_5;

	@OriginalMember(owner = "client!pb", name = "hb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "Z")
	public static volatile boolean aBoolean93 = false;

	@OriginalMember(owner = "client!pb", name = "ob", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1221 = Static106.method1849("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1218 = aClass66_1221;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1219 = Static106.method1849("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
	public static int anInt2251 = 0;

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub1_Sub5_Sub2[] aClass1_Sub1_Sub1_Sub5_Sub2Array1 = new Class1_Sub1_Sub1_Sub5_Sub2[2048];

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "[S")
	public static short[] aShortArray66 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1220 = Static106.method1849("l");

	@OriginalMember(owner = "client!pb", name = "pb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1222 = Static106.method1849("<br>");

	@OriginalMember(owner = "client!pb", name = "rb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1223 = Static106.method1849("<col=00ff80>");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!mf;")
	public static Class10 method1539() {
		try {
			return (Class10) Class.forName("Class10_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class10_Sub2();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!sf;Ljava/awt/Component;ILclient!sf;)V")
	public static void method1540(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class5 arg2) {
		if (Static84.aBoolean92) {
			return;
		}
		Static115.method1663();
		@Pc(15) byte[] local15 = arg0.method113(Static109.aClass66_1463, Static133.aClass66_1734);
		Static126.aClass1_Sub1_Sub2_Sub1_15 = new Class1_Sub1_Sub2_Sub1(local15, arg1);
		Static127.aClass1_Sub1_Sub2_Sub1_16 = Static126.aClass1_Sub1_Sub2_Sub1_15.method242();
		Static92.aClass1_Sub1_Sub2_Sub3_4 = Static124.method2009(arg2, Static109.aClass66_1463, Static88.aClass66_1279);
		Static96.aClass1_Sub1_Sub2_Sub3_5 = Static124.method2009(arg2, Static109.aClass66_1463, Static15.aClass66_1743);
		Static89.aClass1_Sub1_Sub2_Sub3_2 = Static124.method2009(arg2, Static109.aClass66_1463, Static42.aClass66_705);
		Static35.aClass1_Sub1_Sub2_Sub3Array3 = Static40.method932(Static109.aClass66_1464, arg2, Static109.aClass66_1463);
		Static84.aClass1_Sub1_Sub2_Sub3Array9 = Static40.method932(Static86.aClass66_1256, arg2, Static109.aClass66_1463);
		Static15.anIntArray500 = new int[256];
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static15.anIntArray500[local65] = local65 * 262144;
		}
		for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
			Static15.anIntArray500[local81 + 64] = local81 * 1024 + 16711680;
		}
		for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
			Static15.anIntArray500[local99 + 128] = local99 * 4 + 16776960;
		}
		for (@Pc(122) int local122 = 0; local122 < 64; local122++) {
			Static15.anIntArray500[local122 + 192] = 16777215;
		}
		Static27.anIntArray104 = new int[256];
		for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
			Static27.anIntArray104[local141] = local141 * 1024;
		}
		for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
			Static27.anIntArray104[local157 + 64] = local157 * 4 + 65280;
		}
		for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
			Static27.anIntArray104[local177 + 128] = local177 * 262144 + 65535;
		}
		for (@Pc(198) int local198 = 0; local198 < 64; local198++) {
			Static27.anIntArray104[local198 + 192] = 16777215;
		}
		Static35.anIntArray115 = new int[256];
		for (@Pc(215) int local215 = 0; local215 < 64; local215++) {
			Static35.anIntArray115[local215] = local215 * 4;
		}
		for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
			Static35.anIntArray115[local231 + 64] = local231 * 262144 + 255;
		}
		for (@Pc(250) int local250 = 0; local250 < 64; local250++) {
			Static35.anIntArray115[local250 + 128] = local250 * 1024 + 16711935;
		}
		for (@Pc(268) int local268 = 0; local268 < 64; local268++) {
			Static35.anIntArray115[local268 + 192] = 16777215;
		}
		Static20.anIntArray85 = new int[256];
		Static42.anIntArray192 = new int[32768];
		Static6.anIntArray51 = new int[32768];
		Static61.method1306(null);
		Static109.aClass66_1472 = Static109.aClass66_1463;
		Static43.anIntArray198 = new int[32768];
		Static109.aClass66_1489 = Static109.aClass66_1463;
		Static123.anIntArray488 = new int[32768];
		Static60.aBoolean74 = false;
		if (Static124.anInt2862 == 0) {
			Static13.aBoolean18 = true;
		} else {
			Static13.aBoolean18 = false;
		}
		Static80.anInt2175 = 0;
		if (Static13.aBoolean18) {
			Static101.method1767();
		} else {
			Static5.method166(Static109.aClass66_1463, Static51.aClass66_852, Static28.aClass5_Sub1_8);
		}
		Static86.method1613(false);
		Static84.aBoolean92 = true;
		Static126.aClass1_Sub1_Sub2_Sub1_15.method226(0, 0);
		Static127.aClass1_Sub1_Sub2_Sub1_16.method226(382, 0);
		Static92.aClass1_Sub1_Sub2_Sub3_4.method997(382 - Static92.aClass1_Sub1_Sub2_Sub3_4.anInt1432 / 2, 18);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!sf;Lclient!sf;)V")
	public static void method1541(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		Static56.aClass5_51 = arg0;
		Static51.aClass5_45 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIII)Z")
	public static boolean method1542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = arg0 >> 14 & 0x7FFF;
		@Pc(26) int local26 = Static129.aClass9_1.method311(Static22.anInt635, arg2, arg1, arg0);
		if (local26 == -1) {
			return false;
		}
		@Pc(37) int local37 = local26 >> 6 & 0x3;
		@Pc(41) int local41 = local26 & 0x1F;
		if (local41 == 10 || local41 == 11 || local41 == 22) {
			@Pc(58) Class1_Sub1_Sub9 local58 = Static122.method1995(local19);
			@Pc(71) int local71;
			@Pc(74) int local74;
			if (local37 == 0 || local37 == 2) {
				local71 = local58.anInt2065;
				local74 = local58.anInt2083;
			} else {
				local74 = local58.anInt2065;
				local71 = local58.anInt2083;
			}
			@Pc(85) int local85 = local58.anInt2061;
			if (local37 != 0) {
				local85 = (local85 << local37 & 0xF) + (local85 >> 4 - local37);
			}
			Static35.method633(arg2, 0, 0, local71, 2, arg1, local74, true, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], local85);
		} else {
			Static35.method633(arg2, local37, local41 + 1, 0, 2, arg1, 0, true, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
		}
		Static104.anInt2550 = 2;
		Static56.anInt1780 = 0;
		Static131.anInt2694 = Static35.anInt866;
		Static14.anInt477 = Static6.anInt308;
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
	public static void method1543() {
		aClass34_5 = null;
		aClass66_1221 = null;
		aClass66_1223 = null;
		aClass1_Sub1_Sub1_Sub5_Sub2Array1 = null;
		aClass66_1222 = null;
		aShortArray66 = null;
		aByteArrayArrayArray14 = null;
		aClass66_1220 = null;
		aClass66_1218 = null;
		aClass66_1219 = null;
	}
}
