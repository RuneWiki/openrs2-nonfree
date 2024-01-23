import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Lclient!o;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_1;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	public static int anInt2483 = 0;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "Lclient!ab;")
	public static Class3 aClass3_11 = new Class3();

	@OriginalMember(owner = "client!he", name = "v", descriptor = "[I")
	public static int[] anIntArray180 = new int[256];

	@OriginalMember(owner = "client!he", name = "x", descriptor = "[I")
	public static int[] anIntArray181 = new int[1000];

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
	public static boolean aBoolean139 = true;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	public static void method1892() {
		Static105.anImage1 = null;
		Static174.aFontMetrics1 = null;
		Static236.aFont1 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V")
	public static void method1893(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg2) / 2;
		@Pc(19) int local19 = arg1[local15];
		@Pc(21) int local21 = arg0;
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local19;
		@Pc(35) Object local35 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg2; local47++) {
			if ((local47 & 0x1) + local19 > arg1[local47]) {
				@Pc(62) int local62 = arg1[local47];
				arg1[local47] = arg1[local21];
				arg1[local21] = local62;
				@Pc(76) Object local76 = arg3[local47];
				arg3[local47] = arg3[local21];
				arg3[local21++] = local76;
			}
		}
		arg1[arg2] = arg1[local21];
		arg1[local21] = local19;
		arg3[arg2] = arg3[local21];
		arg3[local21] = local35;
		method1893(arg0, arg1, local21 - 1, arg3);
		method1893(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ql;I)V")
	public static void method1895(@OriginalArg(0) Class1_Sub13 arg0) {
		while (arg0.aByteArray29.length > arg0.anInt2395) {
			@Pc(13) boolean local13 = false;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			if (arg0.method1772() == 1) {
				local17 = arg0.method1772();
				local15 = arg0.method1772();
				local13 = true;
			}
			@Pc(36) int local36 = arg0.method1772();
			@Pc(40) int local40 = arg0.method1772();
			@Pc(47) int local47 = local36 * 64 - Static209.anInt4574;
			@Pc(58) int local58 = Static174.anInt3997 + Static46.anInt1376 - local40 * 64 - 1;
			@Pc(138) byte local138;
			@Pc(90) int local90;
			if (local47 >= 0 && local58 - 63 >= 0 && local47 + 63 < Static124.anInt3160 && Static174.anInt3997 > local58) {
				@Pc(86) int local86 = local58 >> 6;
				local90 = local47 >> 6;
				for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
					for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
						if (!local13 || local92 >= local17 * 8 && local17 * 8 + 8 > local92 && local96 >= local15 * 8 && local96 < local15 * 8 + 8) {
							local138 = arg0.method1756();
							if (local138 != 0) {
								if (Static117.aByteArrayArrayArray8[local90][local86] == null) {
									Static117.aByteArrayArrayArray8[local90][local86] = new byte[4096];
								}
								Static117.aByteArrayArrayArray8[local90][local86][local92 + (63 - local96 << 6)] = local138;
								@Pc(175) byte local175 = arg0.method1756();
								if (Static191.aByteArrayArrayArray14[local90][local86] == null) {
									Static191.aByteArrayArrayArray14[local90][local86] = new byte[4096];
								}
								Static191.aByteArrayArrayArray14[local90][local86][(63 - local96 << 6) + local92] = local175;
							}
						}
					}
				}
			} else {
				for (local90 = 0; (local13 ? 64 : 4096) > local90; local90++) {
					local138 = arg0.method1756();
					if (local138 != 0) {
						arg0.anInt2395++;
					}
				}
			}
		}
	}
}
