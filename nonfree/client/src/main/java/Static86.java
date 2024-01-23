import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array3;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Lclient!kd;")
	public static Class3_Sub15_Sub2 aClass3_Sub15_Sub2_1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	public static int anInt1599 = 2;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "[C")
	public static char[] aCharArray11 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z")
	public static boolean method1314() {
		try {
			if (Static94.anInt1711 == 2) {
				if (Static165.aClass3_Sub23_1 == null) {
					Static165.aClass3_Sub23_1 = Static322.method3445(Static310.aClass155_122, Static306.anInt6012, Static93.anInt1696);
					if (Static165.aClass3_Sub23_1 == null) {
						return false;
					}
				}
				if (Static2.aClass92_1 == null) {
					Static2.aClass92_1 = new Class92(Static141.aClass155_61, Static81.aClass155_37);
				}
				if (Static204.aClass3_Sub15_Sub4_3.method4567(Static259.aClass155_108, Static165.aClass3_Sub23_1, Static2.aClass92_1)) {
					Static204.aClass3_Sub15_Sub4_3.method4598();
					Static204.aClass3_Sub15_Sub4_3.method4597(Static110.anInt2029);
					Static204.aClass3_Sub15_Sub4_3.method4595(Static305.aBoolean426, Static165.aClass3_Sub23_1);
					Static2.aClass92_1 = null;
					Static165.aClass3_Sub23_1 = null;
					Static310.aClass155_122 = null;
					Static94.anInt1711 = 0;
					return true;
				}
			}
		} catch (@Pc(71) Exception local71) {
			local71.printStackTrace();
			Static204.aClass3_Sub15_Sub4_3.method4592();
			Static94.anInt1711 = 0;
			Static2.aClass92_1 = null;
			Static310.aClass155_122 = null;
			Static165.aClass3_Sub23_1 = null;
		}
		return false;
	}
}
