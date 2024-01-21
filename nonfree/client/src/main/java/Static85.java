import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!qc", name = "dd", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_21;

	@OriginalMember(owner = "client!qc", name = "ed", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_8;

	@OriginalMember(owner = "client!qc", name = "sd", descriptor = "Lclient!sa;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!qc", name = "Nc", descriptor = "I")
	public static int anInt2207 = 0;

	@OriginalMember(owner = "client!qc", name = "Oc", descriptor = "Lclient!gd;")
	public static Class22 aClass22_30 = new Class22(64);

	@OriginalMember(owner = "client!qc", name = "Xc", descriptor = "I")
	public static int anInt2215 = 0;

	@OriginalMember(owner = "client!qc", name = "kd", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1026 = Static14.method2017("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!qc", name = "qd", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1028 = Static14.method2017("Duell akzeptieren");

	@OriginalMember(owner = "client!qc", name = "vd", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1029 = Static14.method2017("Add ignore");

	@OriginalMember(owner = "client!qc", name = "xd", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1030 = aClass36_1029;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "(I)V")
	public static void method1556() {
		try {
			@Pc(2) Graphics local2 = Static107.aCanvas1.getGraphics();
			Static96.aClass14_31.method1470(553, local2, 205);
		} catch (@Pc(10) Exception local10) {
			Static107.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(B)V")
	public static void method1557() {
		Static77.anIntArray241 = null;
		Static61.anIntArray198 = null;
		Static89.aByteArrayArrayArray8 = null;
		Static40.anIntArray256 = null;
		Static13.anIntArrayArray7 = null;
		Static20.anIntArrayArrayArray3 = null;
		Static35.aByteArrayArrayArray5 = null;
		Static80.anIntArray245 = null;
		Static10.aByteArrayArrayArray2 = null;
		Static110.anIntArray342 = null;
		Static111.aByteArrayArrayArray9 = null;
		Static22.aByteArrayArrayArray4 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!pc;BZ)V")
	public static void method1558(@OriginalArg(0) Class51 arg0, @OriginalArg(2) boolean arg1) {
		if (Static80.aClass51_4 != null) {
			try {
				Static80.aClass51_4.method1483();
			} catch (@Pc(8) Exception local8) {
			}
			Static80.aClass51_4 = null;
		}
		Static80.aClass51_4 = arg0;
		Static38.method746(arg1);
		Static53.aClass2_Sub12_3.anInt1939 = 0;
		Static82.aClass2_Sub1_Sub3_1 = null;
		Static52.anInt1433 = 0;
		Static15.aClass2_Sub12_1 = null;
		while (true) {
			@Pc(38) Class2_Sub1_Sub3 local38 = (Class2_Sub1_Sub3) Static91.aClass31_6.method910();
			if (local38 == null) {
				while (true) {
					local38 = (Class2_Sub1_Sub3) Static73.aClass31_4.method910();
					if (local38 == null) {
						if (Static82.aByte3 != 0) {
							try {
								@Pc(90) Class2_Sub12 local90 = new Class2_Sub12(4);
								local90.method1409(4);
								local90.method1409(Static82.aByte3);
								local90.method1373(0);
								Static80.aClass51_4.method1486(4, local90.aByteArray20);
							} catch (@Pc(111) IOException local111) {
								try {
									Static80.aClass51_4.method1483();
								} catch (@Pc(116) Exception local116) {
								}
								Static80.aClass51_4 = null;
								Static22.anInt580++;
							}
						}
						Static77.anInt2025 = 0;
						Static23.aLong18 = Static66.method1158();
						return;
					}
					Static33.aClass1_2.method2(local38);
					Static60.aClass31_2.method912(local38.aLong89, local38);
					Static62.anInt1619--;
					Static41.anInt1078++;
				}
			}
			Static89.aClass31_5.method912(local38.aLong89, local38);
			Static76.anInt2015++;
			Static43.anInt1148--;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([BZI)I")
	public static int method1559(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static79.method1485(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "(I)V")
	public static void method1560() {
		aClass2_Sub1_Sub1_Sub1_21 = null;
		aClass61_1 = null;
		aClass22_30 = null;
		aClass36_1028 = null;
		aClass36_1026 = null;
		aClass3_Sub1_8 = null;
		aClass36_1029 = null;
		aClass36_1030 = null;
	}
}
