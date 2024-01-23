import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!ph;")
	public static Class138 aClass138_24;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!ph;")
	public static Class138 aClass138_25;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	public static int anInt1525 = 0;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	public static int anInt1530 = 0;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString51 = "M";

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString52 = "Close";

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIZ)I")
	public static int method1248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	public static void method1249() {
		Static245.aClass169_67.method4020(5);
		Static212.aClass169_115.method4020(5);
		Static47.aClass169_34.method4020(5);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qm;I)I")
	public static int method1250(@OriginalArg(0) Class22_Sub3_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt4676;
		@Pc(12) Class78 local12 = arg0.method3659();
		if (local12.anInt2171 == arg0.anInt4566) {
			local8 = arg0.anInt4663;
		} else if (local12.anInt2143 == arg0.anInt4566 || local12.anInt2162 == arg0.anInt4566 || local12.anInt2150 == arg0.anInt4566 || arg0.anInt4566 == local12.anInt2132) {
			local8 = arg0.anInt4658;
		} else if (local12.anInt2151 == arg0.anInt4566 || local12.anInt2148 == arg0.anInt4566 || arg0.anInt4566 == local12.anInt2166 || arg0.anInt4566 == local12.anInt2161) {
			local8 = arg0.anInt4672;
		}
		return local8;
	}
}
