import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_76 = new Class103(19, 7);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	public static void method1426() {
		if (Static353.aClass125_1 != null) {
			Static353.aClass125_1.method5863();
		}
		if (Static356.aClass125_2 != null) {
			Static356.aClass125_2.method5863();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method1427(@OriginalArg(0) Class34 arg0) {
		if (Static118.anInt2201 < 2 && !Static433.aBoolean798 || Static371.aClass124_10 != null) {
			return;
		}
		@Pc(39) String local39;
		if (Static433.aBoolean798 && Static118.anInt2201 < 2) {
			local39 = Static337.aString67 + Static25.aClass119_11.method2673(Static394.anInt6582) + Static15.aString1 + " ->";
		} else if (Static345.aBoolean678 && Static160.aClass123_1.method2750(81) && Static118.anInt2201 > 2) {
			local39 = Static170.method2397((Class1_Sub19) Static202.aClass227_21.aClass1_225.aClass1_262.aClass1_262);
		} else {
			@Pc(56) Class1_Sub19 local56 = (Class1_Sub19) Static202.aClass227_21.aClass1_225.aClass1_262;
			local39 = Static170.method2397(local56);
			@Pc(62) int[] local62 = null;
			if (Static348.method4710(local56.anInt2416)) {
				local62 = Static342.aClass155_2.method3548((int) local56.aLong74).anIntArray301;
			} else if (local56.anInt2417 != -1) {
				local62 = Static342.aClass155_2.method3548(local56.anInt2417).anIntArray301;
			} else if (Static133.method2050(local56.anInt2416)) {
				@Pc(99) Class25_Sub5_Sub1_Sub1 local99 = Static87.aClass25_Sub5_Sub1_Sub1Array6[(int) local56.aLong74];
				if (local99 != null) {
					@Pc(104) Class54 local104 = local99.aClass54_1;
					if (local104.anIntArray67 != null) {
						local104 = local104.method1148(Static320.aClass249_2);
					}
					if (local104 != null) {
						local62 = local104.anIntArray68;
					}
				}
			} else if (Static385.method5050(local56.anInt2416)) {
				@Pc(140) Class68 local140;
				if (local56.anInt2416 == 1002) {
					local140 = Static341.aClass75_4.method1616((int) local56.aLong74);
				} else {
					local140 = Static341.aClass75_4.method1616((int) (local56.aLong74 >>> 32 & 0x7FFFFFFFL));
				}
				if (local140.anIntArray125 != null) {
					local140 = local140.method1535(Static320.aClass249_2);
				}
				if (local140 != null) {
					local62 = local140.anIntArray126;
				}
			}
			if (local62 != null) {
				local39 = local39 + Static434.method5716(local62);
			}
		}
		if (Static118.anInt2201 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static118.anInt2201 - 2) + Static321.aClass119_129.method2673(Static394.anInt6582);
		}
		if (Static224.aClass124_6 != null) {
			@Pc(212) Class76 local212 = Static224.aClass124_6.method2775(arg0);
			if (local212 == null) {
				local212 = Static121.aClass76_2;
			}
			local212.method4584(Static112.anIntArray144, Static224.aClass124_6.anInt3347, Static224.aClass124_6.anInt3399, Static224.aClass124_6.anInt3376, Static224.aClass124_6.anInt3421, Static224.aClass124_6.anInt3412, Static454.aRandom1, Static299.anIntArray502, Static178.anInt3115, Static57.aClass6Array3, local39, Static394.anInt6584, Static224.aClass124_6.anInt3356, Static392.anInt6557);
			Static384.method5031(Static112.anIntArray144[1], Static112.anIntArray144[3], Static112.anIntArray144[2], Static112.anIntArray144[0]);
		} else if (Static54.aClass124_2 != null && Static183.aClass48_3 == Static191.aClass48_4) {
			@Pc(277) int local277 = Static121.aClass76_2.method4581(Static312.anInt5419 + 16, Static247.anInt4471 + 4, Static299.anIntArray502, Static57.aClass6Array3, local39, Static392.anInt6557, Static454.aRandom1);
			Static384.method5031(Static312.anInt5419, 16, local277 + Static451.aClass89_10.method1995(local39), Static247.anInt4471 + 4);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Z")
	public static boolean method1429(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBLjava/lang/String;I)V")
	public static void method1430(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		Static45.method4316(null, arg0, -1, arg3, arg2, arg1, arg4);
	}
}
