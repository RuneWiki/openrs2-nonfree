import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	public static int anInt2320;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1279 = Static106.method1849("logo");

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1280 = Static106.method1849("Cabbage");

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1281 = Static106.method1849("blinken1:");

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array20 = new Class66[200];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method1628() {
		Static77.anInt2149 = 0;
		Static101.anInt2503 = 0;
		Static96.method1737();
		Static57.method1261();
		Static118.method1954();
		Static83.method1507();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static77.anInt2149; local19++) {
			local25 = Static101.anIntArray421[local19];
			if (Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local25].anInt1285 != Static22.anInt636) {
				Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local25] = null;
			}
		}
		if (Static105.anInt2602 != Static133.aClass1_Sub12_Sub1_3.anInt1694) {
			throw new RuntimeException("gpp1 pos:" + Static133.aClass1_Sub12_Sub1_3.anInt1694 + " psize:" + Static105.anInt2602);
		}
		for (local25 = 0; local25 < Static111.anInt2653; local25++) {
			if (Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[Static51.anIntArray239[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static111.anInt2653);
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1629(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V")
	public static void method1630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static44.anIntArrayArrayArray3[arg0][local7 + arg1][arg2 + local11] = 0;
			}
		}
		if (arg1 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static44.anIntArrayArrayArray3[arg0][arg1][local11 + arg2] = Static44.anIntArrayArrayArray3[arg0][arg1 - 1][local11 + arg2];
			}
		}
		if (arg2 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static44.anIntArrayArrayArray3[arg0][arg1 + local11][arg2] = Static44.anIntArrayArrayArray3[arg0][arg1 + local11][arg2 - 1];
			}
		}
		if (arg1 > 0 && Static44.anIntArrayArrayArray3[arg0][arg1 - 1][arg2] != 0) {
			Static44.anIntArrayArrayArray3[arg0][arg1][arg2] = Static44.anIntArrayArrayArray3[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && Static44.anIntArrayArrayArray3[arg0][arg1][arg2 - 1] != 0) {
			Static44.anIntArrayArrayArray3[arg0][arg1][arg2] = Static44.anIntArrayArrayArray3[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && Static44.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1] != 0) {
			Static44.anIntArrayArrayArray3[arg0][arg1][arg2] = Static44.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public static void method1631() {
		aClass66_1279 = null;
		aClass66_1281 = null;
		aClass66Array20 = null;
		aClass66_1280 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)Lclient!sc;")
	public static Class66 method1632(@OriginalArg(0) int arg0) {
		return Static105.method1838(arg0, false);
	}
}
