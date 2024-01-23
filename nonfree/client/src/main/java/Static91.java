import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
	public static int anInt2191 = 5063219;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "Lclient!ih;")
	public static Class2_Sub16_Sub1 aClass2_Sub16_Sub1_1 = new Class2_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	public static int anInt2195 = 0;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "[I")
	public static int[] anIntArray199 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
	public static void method1625() {
		Static211.aClass2_Sub16_Sub1_2.method2198(28);
		Static211.aClass2_Sub16_Sub1_2.method2168(0);
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
	public static void method1627(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static275.aBooleanArray20[arg0]) {
			return;
		}
		Static152.aClass42_42.method1270(arg0);
		if (Static262.aClass56ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(34) int local34 = 0; local34 < Static262.aClass56ArrayArray1[arg0].length; local34++) {
			if (Static262.aClass56ArrayArray1[arg0][local34] != null) {
				if (Static262.aClass56ArrayArray1[arg0][local34].anInt2092 == 2) {
					local27 = false;
				} else {
					Static262.aClass56ArrayArray1[arg0][local34] = null;
				}
			}
		}
		if (local27) {
			Static262.aClass56ArrayArray1[arg0] = null;
		}
		Static275.aBooleanArray20[arg0] = false;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!g;II)V")
	public static void method1628(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2) {
		if (Static68.anInt1741 < 2 && Static73.anInt1823 == 0 && !Static287.aBoolean373) {
			return;
		}
		@Pc(19) String local19 = Static277.method4337();
		if (arg1 == null) {
			@Pc(86) int local86 = Static237.aClass2_Sub8_Sub5_5.method1240(local19, arg2 + 4, arg0 + 15, Static273.aRandom1, Static187.anInt3990);
			Static253.method3981(15, arg0, arg2 + 4, local86 + Static237.aClass2_Sub8_Sub5_5.method1237(local19));
			return;
		}
		@Pc(31) Class2_Sub8_Sub5 local31 = arg1.method1558(Static9.aClass93Array5);
		if (local31 == null) {
			local31 = Static237.aClass2_Sub8_Sub5_5;
		}
		local31.method1228(local19, arg2, arg0, arg1.anInt2057, arg1.anInt2031, arg1.anInt2078, arg1.anInt2111, arg1.anInt2098, arg1.anInt2072, Static273.aRandom1, Static187.anInt3990, Static155.anIntArray351);
		Static253.method3981(Static155.anIntArray351[3], Static155.anIntArray351[1], Static155.anIntArray351[0], Static155.anIntArray351[2]);
	}
}
