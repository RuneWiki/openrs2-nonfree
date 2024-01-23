import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public static int anInt2200;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt2201;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_654 = Static184.method2923("");

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!i;")
	private static Class41 aClass41_657 = Static184.method2923("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_655 = aClass41_657;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_656 = Static184.method2923("(U4");

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Z")
	public static boolean method1562() {
		return Static108.anInt2618 == 0 ? Static28.aClass2_Sub6_Sub3_1.method2458() : true;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
	public static int method1563() {
		if (Static135.aDouble10 == 3.0D) {
			return 37;
		} else if (Static135.aDouble10 == 4.0D) {
			return 50;
		} else if (Static135.aDouble10 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method1564(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static16.anInt435 > 0) {
			local24 = Static195.aByteArrayArray11[--Static16.anInt435];
			Static195.aByteArrayArray11[Static16.anInt435] = null;
			return local24;
		} else if (arg0 == 5000 && Static127.anInt2963 > 0) {
			local24 = Static123.aByteArrayArray4[--Static127.anInt2963];
			Static123.aByteArrayArray4[Static127.anInt2963] = null;
			return local24;
		} else if (arg0 == 30000 && Static142.anInt3264 > 0) {
			local24 = Static111.aByteArrayArray7[--Static142.anInt3264];
			Static111.aByteArrayArray7[Static142.anInt3264] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}
}
