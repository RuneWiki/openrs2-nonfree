import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "Z")
	public static boolean aBoolean128;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	public static int anInt1629 = 0;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString58 = "Loaded interfaces";

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString59 = "slide:";

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1322(@OriginalArg(1) String arg0) {
		return Static68.method1143(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
	public static void method1324(@OriginalArg(0) int arg0) {
		Static313.anInt5907 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static6.anInt118; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static178.anInt3591; local8++) {
				if (Static122.aClass1_Sub17ArrayArrayArray3[arg0][local3][local8] == null) {
					Static122.aClass1_Sub17ArrayArrayArray3[arg0][local3][local8] = new Class1_Sub17(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
	public static void method1325(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = Static46.method824(8, arg0);
		local10.method299();
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V")
	public static void method1327() {
		Static149.method2408((long) Static37.anInt757);
		if (Static287.anInt5450 != -1) {
			Static20.method398(Static287.anInt5450);
		}
		for (@Pc(18) int local18 = 0; local18 < Static156.anInt3310; local18++) {
			if (Static132.aBooleanArray25[local18]) {
				Static307.aBooleanArray65[local18] = true;
			}
			Static213.aBooleanArray44[local18] = Static132.aBooleanArray25[local18];
			Static132.aBooleanArray25[local18] = false;
		}
		if (Static291.aBoolean404) {
			Static218.aBoolean293 = true;
		}
		Static66.anInt1302 = -1;
		Static253.anInt4756 = Static37.anInt757;
		Static110.anInt2181 = -1;
		Static173.aClass146_13 = null;
		if (Static287.anInt5450 != -1) {
			Static156.anInt3310 = 0;
			Static164.method2789();
		}
		if (Static291.aBoolean404) {
			Static133.method2166();
		} else {
			Static41.method731();
		}
		Static147.anInt2946 = 0;
	}
}
