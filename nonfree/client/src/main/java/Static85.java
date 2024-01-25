import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_19 = new Class215(0, -1);

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	public static int anInt1763 = -1;

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
	public static int anInt1764 = 0;

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
	public static int anInt1765 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
	public static void method1541() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static214.aClass164ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static214.aClass164ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static422.anInt6945; local6++) {
					for (local9 = 0; local9 < Static171.anInt3361; local9++) {
						if (Static214.aClass164ArrayArrayArray4[local3][local6][local9] != null) {
							Static214.aClass164ArrayArrayArray4[local3][local6][local9].method3915();
						}
						Static214.aClass164ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static214.aClass164ArrayArrayArray4 = null;
		Static67.aClass65Array1 = null;
		if (Static2.aClass164ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static2.aClass164ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static422.anInt6945; local6++) {
					for (local9 = 0; local9 < Static171.anInt3361; local9++) {
						if (Static2.aClass164ArrayArrayArray1[local3][local6][local9] != null) {
							Static2.aClass164ArrayArrayArray1[local3][local6][local9].method3915();
						}
						Static2.aClass164ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static2.aClass164ArrayArrayArray1 = null;
		Static285.aClass65Array3 = null;
		Static202.aClass164ArrayArrayArray5 = null;
		Static417.aClass65Array4 = null;
		Static93.anInt1878 = 0;
		if (Static91.aClass136Array2 != null) {
			for (local3 = 0; local3 < Static93.anInt1878; local3++) {
				Static91.aClass136Array2[local3] = null;
			}
		}
		if (Static427.aClass16_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static1.anInt6; local3++) {
				Static427.aClass16_Sub1Array3[local3] = null;
			}
			Static1.anInt6 = 0;
		}
		if (Static106.aClass191Array1 != null) {
			for (local3 = 0; local3 < Static43.anInt7322; local3++) {
				Static106.aClass191Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static235.anInt4487; local6++) {
				for (local9 = 0; local9 < Static422.anInt6945; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static171.anInt3361; local160++) {
						Static444.aLongArrayArrayArray2[local6][local9][local160] = 0L;
					}
				}
			}
			Static43.anInt7322 = 0;
		}
		Static162.anIntArrayArrayArray13 = null;
		Static316.method4217();
		Static18.aClass84_2.method2310();
		Static341.aByteArrayArray29 = null;
		Static447.anIntArrayArray64 = null;
		Static346.aByteArrayArray26 = null;
		Static433.aClass70_1 = null;
		Static261.aClass31_3 = null;
		Static390.aClass19_37 = null;
	}
}
