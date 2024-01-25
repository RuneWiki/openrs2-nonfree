import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!er", name = "o", descriptor = "I")
	public static int anInt1651;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "I")
	public static int anInt1650 = 0;

	@OriginalMember(owner = "client!er", name = "n", descriptor = "[I")
	public static final int[] anIntArray206 = new int[14];

	@OriginalMember(owner = "client!er", name = "p", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!er", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString64 = "Connecting to update server";

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()V")
	public static void method1606() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static269.aClass204ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static269.aClass204ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static222.anInt4391; local6++) {
					for (local9 = 0; local9 < Static74.anInt3404; local9++) {
						if (Static269.aClass204ArrayArrayArray3[local3][local6][local9] != null) {
							Static269.aClass204ArrayArrayArray3[local3][local6][local9].method5337();
						}
						Static269.aClass204ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static269.aClass204ArrayArrayArray3 = null;
		Static288.aClass41Array5 = null;
		if (Static198.aClass204ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static198.aClass204ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static222.anInt4391; local6++) {
					for (local9 = 0; local9 < Static74.anInt3404; local9++) {
						if (Static198.aClass204ArrayArrayArray2[local3][local6][local9] != null) {
							Static198.aClass204ArrayArrayArray2[local3][local6][local9].method5337();
						}
						Static198.aClass204ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static198.aClass204ArrayArrayArray2 = null;
		Static236.aClass41Array4 = null;
		Static138.aClass204ArrayArrayArray1 = null;
		Static7.aClass41Array1 = null;
		Static93.anInt1792 = 0;
		if (Static263.aClass210Array2 != null) {
			for (local3 = 0; local3 < Static93.anInt1792; local3++) {
				Static263.aClass210Array2[local3] = null;
			}
		}
		if (Static184.aClass5_Sub3Array3 != null) {
			for (local3 = 0; local3 < Static10.anInt234; local3++) {
				Static184.aClass5_Sub3Array3[local3] = null;
			}
			Static10.anInt234 = 0;
		}
		if (Static327.aClass1_Sub31_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static160.anInt3182; local3++) {
				Static327.aClass1_Sub31_Sub1Array3[local3] = null;
			}
			for (local6 = 0; local6 < Static56.anInt1240; local6++) {
				for (local9 = 0; local9 < Static222.anInt4391; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static74.anInt3404; local160++) {
						Static116.anIntArrayArrayArray7[local6][local9][local160] = 0;
					}
				}
			}
			Static160.anInt3182 = 0;
		}
		Static335.anIntArrayArrayArray13 = null;
		Static268.method4681();
		Static46.aClass175_1.method4667();
		Static202.aClass28_1 = null;
		Static23.anIntArrayArray1 = null;
		Static245.aClass21_7 = null;
		Static271.aClass2_12 = null;
	}
}
