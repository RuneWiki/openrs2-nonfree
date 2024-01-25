import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Z")
	public static boolean aBoolean164;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
	public static final int[] anIntArray115 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method1777(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!sca;[[B)V")
	public static void method1778(@OriginalArg(1) Class231_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(43) int local43;
		for (@Pc(24) int local24 = 0; local24 < local15; local24++) {
			@Pc(30) byte[] local30 = arg1[local24];
			if (local30 != null) {
				@Pc(37) Class1_Sub20 local37 = new Class1_Sub20(local30);
				local43 = Static298.anIntArray348[local24] >> 8;
				@Pc(49) int local49 = Static298.anIntArray348[local24] & 0xFF;
				@Pc(56) int local56 = local43 * 64 - Static376.anInt6631;
				@Pc(62) int local62 = local49 * 64 - Static24.anInt674;
				Static99.method1834();
				arg0.method6681(Static24.anInt674, local37, local62, local56, Static376.anInt6631, Static28.aClass94Array2);
				arg0.method6696(local62, Static136.aClass12_8, local37, local12, local56);
				if (!arg0.aBoolean576 && local43 == Static246.anInt8758 / 8 && Static360.anInt6293 / 8 == local49 && local12[0] != -1) {
					Static498.aClass224_1 = Static117.aClass345_1.method7550(local12[1], Static395.aClass263_1, local12[2], local12[0], local12[3]);
					Static23.anInt6320 = local12[4];
				}
			}
		}
		for (@Pc(130) int local130 = 0; local130 < local15; local130++) {
			@Pc(143) int local143 = (Static298.anIntArray348[local130] >> 8) * 64 - Static376.anInt6631;
			local43 = (Static298.anIntArray348[local130] & 0xFF) * 64 - Static24.anInt674;
			@Pc(158) byte[] local158 = arg1[local130];
			if (local158 == null && Static360.anInt6293 < 800) {
				Static99.method1834();
				arg0.method6692(local143, local43);
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lclient!si;")
	public static Class132 method1779() {
		try {
			return (Class132) Class.forName("Class132_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class132_Sub2();
		}
	}
}
