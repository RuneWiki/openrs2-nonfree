import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "Lclient!th;")
	public static Class283 aClass283_1;

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "[C")
	public static final char[] aCharArray12 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BI)V")
	public static void method1463(@OriginalArg(1) int arg0) {
		if (Static268.anInt5100 == arg0) {
			return;
		}
		if (Static268.anInt5100 == 0) {
			Static537.method7447();
		}
		if (arg0 == 12) {
			if (Static306.aString51 == null) {
				Static225.method3895(Static328.aString55, Static418.anInt7355, Static308.aString52);
			} else {
				Static499.method6865(Static418.anInt7355);
			}
		}
		if (arg0 != 12 && Static20.aClass56_1 != null) {
			Static20.aClass56_1.method1312();
			Static20.aClass56_1 = null;
		}
		if (arg0 == 2) {
			Static485.method6637(Static321.anInt5892 != Static170.anInt3050);
		}
		if (arg0 == 6) {
			Static412.method5563(Static170.anInt3050 != Static253.anInt4956);
		}
		if (arg0 == 4) {
			if (Static306.aString51 == null) {
				Static409.method6081(Static328.aString55, Static308.aString52);
			} else {
				Static298.method4741();
			}
		} else if (arg0 == 5) {
			if (Static306.aString51 == null) {
				Static225.method3895(Static328.aString55, Static418.anInt7355, Static308.aString52);
			} else {
				Static499.method6865(Static418.anInt7355);
			}
		} else if (arg0 == 8) {
			if (Static306.aString51 == null) {
				Static225.method3895(Static328.aString55, Static418.anInt7355, Static308.aString52);
			} else {
				Static499.method6865(Static418.anInt7355);
			}
		} else if (arg0 == 11) {
			if (Static306.aString51 == null) {
				Static409.method6081(Static328.aString55, Static308.aString52);
			} else {
				Static298.method4741();
			}
		}
		if (Static399.method6025(Static268.anInt5100)) {
			Static429.aClass171_146.anInt4998 = 2;
			Static441.aClass171_137.anInt4998 = 2;
			Static140.aClass171_55.anInt4998 = 2;
			Static266.aClass171_150.anInt4998 = 2;
			Static342.aClass171_98.anInt4998 = 2;
			Static193.aClass171_125.anInt4998 = 2;
			Static13.aClass171_12.anInt4998 = 2;
		}
		if (Static399.method6025(arg0)) {
			Static532.anInt8953 = 0;
			Static386.anInt7017 = 1;
			Static302.anInt5575 = 1;
			Static41.anInt864 = 0;
			Static277.anInt5226 = 0;
			Static306.method4837(true);
			Static429.aClass171_146.anInt4998 = 1;
			Static441.aClass171_137.anInt4998 = 1;
			Static140.aClass171_55.anInt4998 = 1;
			Static266.aClass171_150.anInt4998 = 1;
			Static342.aClass171_98.anInt4998 = 1;
			Static193.aClass171_125.anInt4998 = 1;
			Static13.aClass171_12.anInt4998 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static234.method4047();
		}
		if (arg0 == 1) {
			Static303.method4785(Static513.aClass122_10, Static543.aClass171_154);
		} else {
			Static270.method4435();
		}
		@Pc(249) boolean local249 = arg0 == 1 || Static160.method2489(arg0) || Static82.method3792(arg0);
		@Pc(266) boolean local266 = Static268.anInt5100 == 1 || Static160.method2489(Static268.anInt5100) || Static82.method3792(Static268.anInt5100);
		if (local249 != local266) {
			if (local249) {
				Static507.anInt8581 = Static59.anInt1145;
				if (Static544.aClass1_Sub22_Sub1_1.anInt5439 == 0) {
					Static67.method1229();
				} else {
					Static224.method3892(Static59.anInt1145, Static544.aClass1_Sub22_Sub1_1.anInt5439, Static235.aClass171_78);
				}
				Static322.aClass114_2.method2592(false);
			} else {
				Static67.method1229();
				Static322.aClass114_2.method2592(true);
			}
		}
		if (Static399.method6025(arg0) || arg0 == 12) {
			Static513.aClass122_10.method7238();
		}
		Static268.anInt5100 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BII)Z")
	public static boolean method1465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
