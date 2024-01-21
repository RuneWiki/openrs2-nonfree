import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
	public static int anInt2408;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "Lclient!k;")
	public static Class33 aClass33_36;

	@OriginalMember(owner = "client!qc", name = "pb", descriptor = "Lclient!k;")
	public static Class33 aClass33_37;

	@OriginalMember(owner = "client!qc", name = "ub", descriptor = "I")
	public static int anInt2417;

	@OriginalMember(owner = "client!qc", name = "vb", descriptor = "Lclient!k;")
	public static Class33 aClass33_38;

	@OriginalMember(owner = "client!qc", name = "qb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1086 = Static24.method441("Login attempts exceeded)3");

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1083 = aClass65_1086;

	@OriginalMember(owner = "client!qc", name = "ib", descriptor = "[I")
	public static int[] anIntArray313 = new int[500];

	@OriginalMember(owner = "client!qc", name = "kb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1084 = Static24.method441("p12_full");

	@OriginalMember(owner = "client!qc", name = "ob", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1085 = Static24.method441("Versteckt");

	@OriginalMember(owner = "client!qc", name = "sb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1087 = Static24.method441("backbase2");

	@OriginalMember(owner = "client!qc", name = "tb", descriptor = "I")
	public static int anInt2416 = -1;

	@OriginalMember(owner = "client!qc", name = "wb", descriptor = "[Lclient!uc;")
	public static Class58[] aClass58Array1 = new Class58[4];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!fe;Lclient!wb;)I")
	public static int method1445(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) Class65 arg1) {
		@Pc(10) int local10 = arg0.anInt2342;
		arg0.method1377(arg1.anInt2878);
		arg0.anInt2342 += Static74.aClass1_3.method1(arg0.anInt2342, 0, arg0.aByteArray59, arg1.anInt2878, arg1.aByteArray70);
		return arg0.anInt2342 - local10;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
	public static void method1446(@OriginalArg(1) boolean arg0) {
		if (Static39.aClass13_2 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub8 local11 = new Class2_Sub8(4);
			local11.method1375(arg0 ? 2 : 3);
			local11.method1384(0);
			Static39.aClass13_2.method313(4, local11.aByteArray59);
		} catch (@Pc(32) IOException local32) {
			try {
				Static39.aClass13_2.method316();
			} catch (@Pc(37) Exception local37) {
			}
			Static39.aClass13_2 = null;
			Static26.anInt2924++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
	public static void method1447() {
		Static2.method61();
		Static30.method570();
		Static98.method1694();
		Static21.method1509();
		Static99.method1570();
		Static34.method701();
		Static8.method158();
		Static76.method1303();
		Static80.method1357();
		Static9.method168();
		Static17.method370();
		Static63.method1108();
		((Class4) Static10.anInterface1_1).method124();
		Static104.aClass33_Sub1_48.method1137();
		Static69.aClass33_Sub1_35.method1137();
		Static23.aClass33_Sub1_12.method1137();
		Static25.aClass33_Sub1_13.method1137();
		Static56.aClass33_Sub1_24.method1137();
		Static26.aClass33_Sub1_50.method1137();
		Static67.aClass33_Sub1_33.method1137();
		Static28.aClass33_Sub1_15.method1137();
		Static108.aClass33_Sub1_49.method1137();
		Static19.aClass33_Sub1_31.method1137();
		Static99.aClass33_Sub1_44.method1137();
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V")
	public static void method1448() {
		Static102.aBoolean151 = true;
		Static45.anInt1366 = 0;
		Static100.aClass6_1.anInt308 = 0;
		Static15.aLong24 = 0L;
		Static8.aBoolean23 = true;
		Static98.method1690();
		Static12.aClass2_Sub8_Sub1_8.anInt2342 = 0;
		Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
		Static108.anInt2865 = 0;
		Static24.anInt719 = 0;
		Static41.anInt1302 = -1;
		Static51.aBoolean83 = false;
		Static108.anInt2897 = 0;
		Static33.anInt2359 = 0;
		Static55.anInt1675 = 0;
		Static56.anInt1693 = -1;
		Static57.anInt1714 = -1;
		Static8.anInt307 = -1;
		Static2.method62(0);
		for (@Pc(1681) int local1681 = 0; local1681 < 100; local1681++) {
			Static34.aClass65Array5[local1681] = null;
		}
		Static17.anInt588 = (int) (Math.random() * 110.0D) - 55;
		Static104.anInt2823 = (int) (Math.random() * 100.0D) - 50;
		Static54.anInt1641 = 0;
		Static80.anInt2290 = (int) (Math.random() * 80.0D) - 40;
		Static51.anInt1482 = 0;
		Static24.anInt717 = 0;
		Static98.anInt2765 = 0;
		Static54.anInt1640 = 0;
		Static98.anInt2771 = -1;
		Static3.anInt160 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static80.anInt2291 = 0;
		Static98.anInt2758 = (int) (Math.random() * 30.0D) - 20;
		Static37.anInt1224 = 0;
		Static71.anInt2176 = (int) (Math.random() * 120.0D) - 60;
		Static99.anInt2533 = 0;
		for (@Pc(1760) int local1760 = 0; local1760 < 2048; local1760++) {
			Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local1760] = null;
			Static87.aClass2_Sub8Array1[local1760] = null;
		}
		for (@Pc(1776) int local1776 = 0; local1776 < 32768; local1776++) {
			Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local1776] = null;
		}
		Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[2047] = new Class2_Sub1_Sub1_Sub2_Sub2();
		Static45.aClass52_7.method1590();
		Static36.aClass52_6.method1590();
		@Pc(1808) int local1808;
		for (@Pc(1804) int local1804 = 0; local1804 < 4; local1804++) {
			for (local1808 = 0; local1808 < 104; local1808++) {
				for (@Pc(1812) int local1812 = 0; local1812 < 104; local1812++) {
					Static22.aClass52ArrayArrayArray1[local1804][local1808][local1812] = null;
				}
			}
		}
		Static13.aClass52_3 = new Class52();
		Static37.anInt1225 = 0;
		Static32.anInt1047 = 0;
		Static98.method1695(Static5.anInt237);
		Static5.anInt237 = -1;
		Static98.method1695(Static21.anInt2494);
		Static21.anInt2494 = -1;
		Static98.method1695(Static98.anInt2770);
		Static98.anInt2770 = -1;
		Static98.method1695(Static96.anInt2688);
		Static96.anInt2688 = -1;
		Static98.method1695(Static46.anInt1375);
		Static46.anInt1375 = -1;
		Static98.method1695(Static89.anInt2549);
		Static89.anInt2549 = -1;
		Static98.method1695(Static3.anInt199);
		Static37.anInt1223 = 3;
		Static95.anInt1977 = -1;
		Static3.anInt199 = -1;
		Static55.anInt1673 = 0;
		Static1.anInt1 = 0;
		Static93.aClass65_1182 = null;
		Static51.aBoolean83 = false;
		Static85.aBoolean125 = false;
		Static85.anInt2453 = -1;
		Static67.aClass49_2.method1493(false, new int[5], -1, null);
		for (local1808 = 0; local1808 < 5; local1808++) {
			Static1.aClass65Array1[local1808] = null;
			Static21.aBooleanArray22[local1808] = false;
		}
		Static30.aBoolean64 = true;
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)I")
	public static int method1449() {
		@Pc(14) int local14 = Static25.method447(Static62.anInt1879, Static51.anInt1481, Static87.anInt2520);
		return local14 - Static26.anInt2923 >= 800 || (Static50.aByteArrayArrayArray6[Static62.anInt1879][Static87.anInt2520 >> 7][Static51.anInt1481 >> 7] & 0x4) == 0 ? 3 : Static62.anInt1879;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!k;IZI)Lclient!wc;")
	public static Class2_Sub1_Sub4_Sub4 method1450(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static23.method425(arg0, arg2, arg1) ? Static105.method1740() : null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!k;Z)V")
	public static void method1451(@OriginalArg(0) Class33 arg0) {
		Static22.aClass33_8 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
	public static void method1452() {
		aClass65_1085 = null;
		anIntArray313 = null;
		aClass65_1086 = null;
		aClass65_1084 = null;
		aClass58Array1 = null;
		aClass33_38 = null;
		aClass33_36 = null;
		aClass65_1087 = null;
		aClass33_37 = null;
		aClass65_1083 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!k;Lclient!wb;Lclient!wb;B)[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] method1453(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(4) int local4 = arg0.method1149(arg1);
		@Pc(19) int local19 = arg0.method1144(arg2, local4);
		return Static51.method898(local19, arg0, local4);
	}
}
