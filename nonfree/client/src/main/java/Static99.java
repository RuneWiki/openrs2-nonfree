import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_11;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!mc;")
	public static Class1_Sub12 aClass1_Sub12_7;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
	public static int[] anIntArray180 = new int[100];

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_677 = Static106.method1849("welle2:");

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public static int anInt1210 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ma;I)V")
	public static void method903(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static97.anInt2474 != 1) {
			return;
		}
		if (Static35.anInt866 >= 280 && Static35.anInt866 <= 294 && Static6.anInt308 >= 4 && Static6.anInt308 <= 18) {
			Static29.method561(0, 0);
			return;
		}
		if (Static35.anInt866 >= 295 && Static35.anInt866 <= 360 && Static6.anInt308 >= 4 && Static6.anInt308 <= 18) {
			Static29.method561(1, 0);
			return;
		}
		if (Static35.anInt866 >= 390 && Static35.anInt866 <= 404 && Static6.anInt308 >= 4 && Static6.anInt308 <= 18) {
			Static29.method561(0, 1);
			return;
		}
		if (Static35.anInt866 >= 405 && Static35.anInt866 <= 470 && Static6.anInt308 >= 4 && Static6.anInt308 <= 18) {
			Static29.method561(1, 1);
			return;
		}
		if (Static35.anInt866 >= 500 && Static35.anInt866 <= 514 && Static6.anInt308 >= 4 && Static6.anInt308 <= 18) {
			Static29.method561(0, 2);
			return;
		}
		if (Static35.anInt866 >= 515 && Static35.anInt866 <= 580 && Static6.anInt308 >= 4 && Static6.anInt308 <= 18) {
			Static29.method561(1, 2);
			return;
		}
		if (Static35.anInt866 >= 610 && Static35.anInt866 <= 624 && Static6.anInt308 >= 4 && Static6.anInt308 <= 18) {
			Static29.method561(0, 3);
			return;
		}
		if (Static35.anInt866 >= 625 && Static35.anInt866 <= 690 && Static6.anInt308 >= 4 && Static6.anInt308 <= 18) {
			Static29.method561(1, 3);
			return;
		}
		if (Static35.anInt866 >= 708 && Static6.anInt308 >= 4 && Static35.anInt866 <= 758 && Static6.anInt308 <= 20) {
			Static60.aBoolean74 = false;
			Static126.aClass1_Sub1_Sub2_Sub1_15.method226(0, 0);
			Static127.aClass1_Sub1_Sub2_Sub1_16.method226(382, 0);
			Static92.aClass1_Sub1_Sub2_Sub3_4.method997(382 - Static92.aClass1_Sub1_Sub2_Sub3_4.anInt1432 / 2, 18);
			return;
		}
		if (Static131.anInt2691 == -1) {
			return;
		}
		@Pc(264) Class4 local264 = Static18.aClass4Array1[Static131.anInt2691];
		if (local264.aBoolean4 == Static32.aBoolean35) {
			@Pc(288) byte[] local288 = Static41.method897(new Class66[] { local264.aClass66_116, Static111.aClass66_1516 }).method1810();
			Static98.aString4 = new String(local288, 0, local288.length);
			if (Static126.anInt2891 != 0) {
				Static126.anInt2891 = 0;
				Static88.anInt2320 = 43594;
				Static124.anInt2864 = 43594;
				Static6.anInt318 = 443;
			}
			Static60.aBoolean74 = false;
			Static118.anInt2768 = local264.anInt116;
			Static126.aClass1_Sub1_Sub2_Sub1_15.method226(0, 0);
			Static127.aClass1_Sub1_Sub2_Sub1_16.method226(382, 0);
			Static92.aClass1_Sub1_Sub2_Sub3_4.method997(382 - Static92.aClass1_Sub1_Sub2_Sub3_4.anInt1432 / 2, 18);
			return;
		}
		@Pc(389) Class66 local389 = Static41.method897(new Class66[] { Static86.aClass66_1258, local264.aClass66_116, Static111.aClass66_1516, Static13.aClass66_283, Static35.aClass66_501, Static88.method1632(Static87.aBoolean96 ? 1 : 0), Static75.aClass66_1126, Static88.method1632(Static109.anInt2626), Static114.aClass66_1550, Static88.method1632(Static16.anInt485) });
		try {
			arg0.getAppletContext().showDocument(local389.method1844(), "_self");
		} catch (@Pc(398) Exception local398) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method904() {
		aClass1_Sub12_7 = null;
		aClass66_677 = null;
		aClass1_Sub1_Sub2_Sub1_11 = null;
		anIntArray181 = null;
		anIntArray180 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)V")
	public static void method905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static51.method1090(arg1)) {
			Static105.method1804(arg0, Static100.aClass1_Sub10ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	public static void method909() {
		Static86.method1610();
		Static24.method528();
		Static59.method1279();
		Static76.method1452();
		Static27.method546();
		Static32.method625();
		Static114.method1925();
		Static59.method1278();
		Static77.method1474();
		Static131.method1898();
		Static100.method1763();
		Static16.method416();
		((Class57) Static91.anInterface2_1).method1704();
		Static20.aClass60_27.method1747();
		Static97.aClass5_Sub1_25.method118();
		Static68.aClass5_Sub1_19.method118();
		Static122.aClass5_Sub1_29.method118();
		Static86.aClass5_Sub1_23.method118();
		Static1.aClass5_Sub1_3.method118();
		Static28.aClass5_Sub1_8.method118();
		Static96.aClass5_Sub1_24.method118();
		Static112.aClass5_Sub1_26.method118();
		Static43.aClass5_Sub1_16.method118();
		Static9.aClass5_Sub1_6.method118();
		Static121.aClass5_Sub1_28.method118();
		Static76.aClass5_Sub1_20.method118();
	}
}
