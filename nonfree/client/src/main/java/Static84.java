import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array8;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
	public static int anInt1818;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!pe;")
	public static Class65 aClass65_793 = Static119.method1462("::fpson");

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	public static int anInt1812 = 0;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	public static int anInt1814 = -1;

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
	public static int anInt1817 = 0;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "[I")
	public static int[] anIntArray241 = new int[500];

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "Lclient!pe;")
	public static Class65 aClass65_794 = Static119.method1462("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "Lclient!pe;")
	public static Class65 aClass65_795 = Static119.method1462("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public static void method1364() {
		Static116.anInt2564 = -1;
		Static49.anInt1205 = 0;
		Static90.anInt1997 = 0;
		Static3.aBoolean5 = false;
		Static76.anInt1698 = 0;
		Static133.anInt2905 = -1;
		Static44.anInt1075 = -1;
		Static126.anInt2710 = 0;
		Static49.aClass2_Sub4_Sub1_1.anInt1298 = 0;
		Static72.anInt1648 = 0;
		Static15.anInt365 = -1;
		Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
		Static93.anInt2077 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1.length; local35++) {
			if (Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local35] != null) {
				Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local35].anInt1971 = -1;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1.length; local58++) {
			if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local58] != null) {
				Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local58].anInt1971 = -1;
			}
		}
		Static77.method1292();
		Static98.method1604(30);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static100.aBooleanArray16[local81] = true;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)Lclient!wa;")
	public static Class2_Sub22 method1365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class2_Sub22 local3 = Static35.method645(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass2_Sub22Array2 == null || arg1 >= local3.aClass2_Sub22Array2.length) {
			return null;
		} else {
			return local3.aClass2_Sub22Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method1366() {
		aClass2_Sub1_Sub4_Sub1Array8 = null;
		aClass65_795 = null;
		aClass65_794 = null;
		aClass65_793 = null;
		anIntArray241 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!pe;Lclient!na;Lclient!pe;I)Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1 method1367(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(8) int local8 = arg1.method1690(arg0);
		@Pc(19) int local19 = arg1.method1667(arg2, local8);
		return Static75.method1679(local8, arg1, local19);
	}
}
