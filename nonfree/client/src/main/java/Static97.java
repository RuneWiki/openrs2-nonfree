import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public static int anInt2270 = 0;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_966 = Static51.method932("scape main");

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!cd;")
	private static Class10 aClass10_970 = Static51.method932("Unexpected server response)3");

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_968 = aClass10_970;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Lclient!cd;")
	private static Class10 aClass10_969 = Static51.method932("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Lclient!cd;")
	public static Class10 aClass10_971 = aClass10_969;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
	public static int anInt2273 = 0;

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "[I")
	public static int[] anIntArray239 = new int[128];

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public static void method1606() {
		anIntArray239 = null;
		aClass10_970 = null;
		aClass10_969 = null;
		aClass10_968 = null;
		aClass10_966 = null;
		aClass10_971 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I")
	public static int method1607(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Lclient!sb;")
	public static Class38 method1608() {
		try {
			return (Class38) Class.forName("Class38_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class38_Sub2();
		}
	}
}
