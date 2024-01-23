import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ig", name = "V", descriptor = "Lclient!mg;")
	public static Class1_Sub1_Sub14 aClass1_Sub1_Sub14_4;

	@OriginalMember(owner = "client!ig", name = "W", descriptor = "Lclient!he;")
	public static Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!ig", name = "fb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_653 = Static200.method3116("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
	public static int anInt1994 = 0;

	@OriginalMember(owner = "client!ig", name = "hb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_654 = Static200.method3116("(Z");

	@OriginalMember(owner = "client!ig", name = "ib", descriptor = "Lclient!ff;")
	public static Class33 aClass33_5 = new Class33(4096);

	@OriginalMember(owner = "client!ig", name = "kb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_656 = Static200.method3116("Your account is already logged in)3");

	@OriginalMember(owner = "client!ig", name = "jb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_655 = aClass60_656;

	@OriginalMember(owner = "client!ig", name = "lb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_657 = Static200.method3116("(U4");

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIZI)V")
	public static void method1481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static124.anInt2763; local8++) {
			if (Static6.anIntArray20[local8] + Static1.anIntArray9[local8] > arg1 && arg1 + arg0 > Static6.anIntArray20[local8] && arg3 < Static91.anIntArray252[local8] + Static34.anIntArray123[local8] && arg3 + arg2 > Static34.anIntArray123[local8]) {
				Static47.aBooleanArray4[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)I")
	public static int method1482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class1_Sub27 local17 = (Class1_Sub27) Static121.aClass33_7.method1071((long) arg1);
		if (local17 == null) {
			return 0;
		} else if (arg0 >= 0 && local17.anIntArray657.length > arg0) {
			return local17.anIntArray657[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)I")
	public static int method1484(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static54.method1053(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!kh;B)Lclient!kh;")
	public static Class60 method1485(@OriginalArg(0) Class60 arg0) {
		@Pc(14) Class1_Sub10 local14 = Static44.method761(arg0);
		return local14 == null ? Static31.aClass60_265 : local14.aClass60_512;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V")
	public static void method1486(@OriginalArg(0) int arg0) {
		if (arg0 == Static134.anInt2902) {
			return;
		}
		if (Static134.anInt2902 == 0) {
			Static207.method3209();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static204.anInt4324 = 0;
			Static113.anInt2595 = 0;
			Static104.anInt2370 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static97.aClass55_2 != null) {
			Static97.aClass55_2.method1754();
			Static97.aClass55_2 = null;
		}
		if (Static134.anInt2902 == 25) {
			Static37.anInt862 = 1;
			Static21.anInt493 = 0;
			Static78.anInt1882 = 0;
			Static189.anInt4072 = 1;
			Static3.anInt70 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static93.method1624(Static78.aCanvas1, Static152.aClass7_Sub1_23, Static5.aClass7_Sub1_2);
		} else {
			Static208.method3256();
		}
		Static134.anInt2902 = arg0;
	}
}
