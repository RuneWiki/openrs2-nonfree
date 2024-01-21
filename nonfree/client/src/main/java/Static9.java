import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!qc;")
	public static Class60 aClass60_59 = Static121.method2047("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	public static int anInt156 = 0;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "Lclient!mf;")
	public static Class48 aClass48_6 = new Class48(100);

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Lclient!qc;")
	public static Class60 aClass60_60 = Static121.method2047("<img=0>");

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array2 = new Class60[500];

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "Lclient!qc;")
	private static Class60 aClass60_61 = Static121.method2047("Username: ");

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "Lclient!qc;")
	public static Class60 aClass60_62 = aClass60_61;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
	public static int anInt159 = 0;

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "Lclient!qc;")
	public static Class60 aClass60_63 = Static121.method2047("mapdots");

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "Lclient!qc;")
	public static Class60 aClass60_64 = Static121.method2047("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILclient!kd;)V")
	public static void method134(@OriginalArg(0) int arg0, @OriginalArg(2) Class40_Sub1 arg1) {
		if (Static83.aClass4_Sub13_4 == null) {
			Static10.method201(255, true, (byte) 0, 255, null, 0);
			Static131.aClass40_Sub1Array1[arg0] = arg1;
		} else {
			Static83.aClass4_Sub13_4.anInt1643 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static83.aClass4_Sub13_4.method1215();
			@Pc(20) int local20 = Static83.aClass4_Sub13_4.method1215();
			arg1.method1128(local16, local20);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
	public static boolean method135(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method136() {
		aClass60_62 = null;
		aClass60_60 = null;
		aClass60Array2 = null;
		aClass60_59 = null;
		aClass60_61 = null;
		aClass60_63 = null;
		aClass60_64 = null;
		aClass48_6 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Lclient!qc;")
	public static Class60 method137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static114.aClass60_1103;
		} else if (local8 < -6) {
			return Static13.aClass60_146;
		} else if (local8 < -3) {
			return Static125.aClass60_1178;
		} else if (local8 < 0) {
			return Static82.aClass60_809;
		} else if (local8 > 9) {
			return Static88.aClass60_849;
		} else if (local8 > 6) {
			return Static88.aClass60_848;
		} else if (local8 > 3) {
			return Static130.aClass60_1216;
		} else if (local8 > 0) {
			return Static112.aClass60_1090;
		} else {
			return Static129.aClass60_1204;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	public static void method138() {
		if (Static46.aClass39_1 != null) {
			Static46.aClass39_1.method1684();
		}
		if (Static110.aClass39_2 != null) {
			Static110.aClass39_2.method1684();
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	public static void method139() {
		Static99.aClass48_55.method1393();
	}
}
