import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "Lclient!h;")
	public static Class33 aClass33_11;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "Lclient!jg;")
	public static Class44 aClass44_16;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_770 = Static65.method1172("Hierhin gehen");

	@OriginalMember(owner = "client!lg", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_771 = Static65.method1172("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!a;I)V")
	public static void method1558(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1 arg1) {
		if (Static52.aClass1_1 != null) {
			try {
				Static52.aClass1_1.method10();
			} catch (@Pc(8) Exception local8) {
			}
			Static52.aClass1_1 = null;
		}
		Static52.aClass1_1 = arg1;
		Static89.method1481(arg0);
		Static170.aClass3_Sub2_Sub13_1 = null;
		Static92.aClass3_Sub4_4.anInt232 = 0;
		Static68.aClass3_Sub4_2 = null;
		Static51.anInt1389 = 0;
		while (true) {
			@Pc(37) Class3_Sub2_Sub13 local37 = (Class3_Sub2_Sub13) Static9.aClass54_1.method1598();
			if (local37 == null) {
				while (true) {
					local37 = (Class3_Sub2_Sub13) Static110.aClass54_7.method1598();
					if (local37 == null) {
						if (Static58.aByte3 != 0) {
							try {
								@Pc(92) Class3_Sub4 local92 = new Class3_Sub4(4);
								local92.method206(4);
								local92.method206(Static58.aByte3);
								local92.method198(0);
								Static52.aClass1_1.method6(local92.aByteArray5, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									Static52.aClass1_1.method10();
								} catch (@Pc(118) Exception local118) {
								}
								Static52.aClass1_1 = null;
								Static2.anInt22++;
							}
						}
						Static154.anInt3473 = 0;
						Static105.aLong84 = Static150.method2481();
						return;
					}
					Static80.aClass7_1.method299(local37);
					Static40.aClass54_4.method1603(local37.aLong143, local37);
					Static15.anInt408--;
					Static74.anInt1883++;
				}
			}
			Static182.aClass54_13.method1603(local37.aLong143, local37);
			Static23.anInt531--;
			Static137.anInt3204++;
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(Z)V")
	public static void method1559() {
		aClass44_16 = null;
		aClass46_771 = null;
		aClass46_770 = null;
		aClass33_11 = null;
	}
}
