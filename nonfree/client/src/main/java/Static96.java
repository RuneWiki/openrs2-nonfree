import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!nba;")
	public static Class221 aClass221_2;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public static int anInt2302 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZII)V")
	public static void method2072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if ((arg3 ? Static104.aClass6_Sub6_Sub1_4.anInt1177 : Static104.aClass6_Sub6_Sub1_4.anInt1155) != 0 && arg0 != 0 && Static521.anInt9062 < 50 && arg4 != -1) {
			Static360.aClass161Array1[Static521.anInt9062++] = new Class161((byte) (arg3 ? 3 : 2), arg4, arg0, arg1, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method2073(@OriginalArg(0) Class9 arg0) {
		if (Static85.anInt2084 != Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 && (Static256.aClass224ArrayArrayArray1 != null && Static213.method4938(Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, arg0))) {
			Static85.anInt2084 = Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z")
	public static boolean method2074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static499.method7468(arg0, arg1) || Static188.method3617(arg0, arg1);
	}
}
