import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_65 = new Class70(41, 4);

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
	public static int anInt6241 = 0;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[16];

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)V")
	public static void method5017(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static292.aClass39ArrayArrayArray2 = Static23.aClass39ArrayArrayArray1;
			Static199.aClass47Array1 = Static557.aClass47Array3;
		} else {
			Static292.aClass39ArrayArrayArray2 = Static293.aClass39ArrayArrayArray3;
			Static199.aClass47Array1 = Static216.aClass47Array2;
		}
		Static175.anInt9133 = Static292.aClass39ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)I")
	public static int method5018(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Lclient!nw;")
	public static Class243 method5019(@OriginalArg(1) int arg0) {
		@Pc(10) Class243 local10 = (Class243) Static302.aClass222_32.method4430((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static424.aClass270_91.method5704(0, arg0);
		local10 = new Class243();
		if (local20 != null) {
			local10.method4946(new Class1_Sub35(local20));
		}
		local10.method4944();
		Static302.aClass222_32.method4434(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Z")
	public static boolean method5020() {
		if (Static566.aBoolean734) {
			try {
				Static602.method2417(Static590.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return false;
	}
}
