import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!fo", name = "V", descriptor = "I")
	public static int anInt1650 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1343(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class11_Sub25 local13 = new Class11_Sub25(arg0);
		@Pc(17) int local17 = local13.method5185();
		@Pc(21) int local21 = local13.method5198();
		if (local21 < 0 || Static327.anInt6287 != 0 && local21 > Static327.anInt6287) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(47) byte[] local47 = new byte[local21];
			local13.method5209(local47, local21);
			return local47;
		} else {
			@Pc(59) int local59 = local13.method5198();
			if (local59 < 0 || Static327.anInt6287 != 0 && local59 > Static327.anInt6287) {
				throw new RuntimeException();
			}
			@Pc(80) byte[] local80 = new byte[local59];
			if (local17 == 1) {
				Static334.method5461(local80, local59, arg0, local21);
			} else {
				Static303.aClass71_2.method1235(local13, local80);
			}
			return local80;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIII)V")
	public static void method1345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class10_Sub7 local6 = (Class10_Sub7) Static44.aClass210_3.method5608(); local6 != null; local6 = (Class10_Sub7) Static44.aClass210_3.method5615()) {
			if (Static293.anInt5807 >= local6.anInt6372) {
				local6.method5452();
			} else {
				Static105.method1612(arg0 >> 1, (local6.anInt6375 << 7) + 64, local6.anInt6370 * 2, arg2 >> 1, (local6.anInt6371 << 7) + 64);
				Static106.aClass9_2.method3570(arg1 + Static267.anIntArray414[0], arg3 + Static267.anIntArray414[1], 0, local6.aString63, local6.anInt6374 | 0xFF000000);
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)I")
	public static int method1346(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)V")
	public static void method1348() {
		Static67.aClass97_10 = null;
		Static311.aClass97_3 = null;
		Static198.aClass97_15 = null;
		Static341.aClass97_22 = null;
		Static259.aClass97_17 = null;
		Static191.aClass97_21 = null;
		Static35.aClass97_4 = null;
		Static305.aClass97_20 = null;
	}
}
