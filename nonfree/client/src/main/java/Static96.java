import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array3;

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array4;

	@OriginalMember(owner = "client!kd", name = "nb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1423 = Static118.method2249("flash2:");

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1421 = aClass65_1423;

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1422 = aClass65_1423;

	@OriginalMember(owner = "client!kd", name = "ob", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_4 = new Class67(30);

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
	public static int anInt2403 = 0;

	@OriginalMember(owner = "client!kd", name = "Eb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1424 = Static118.method2249("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)I")
	public static int method1819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static165.method2845(arg1 - 1, arg0 - 1) + Static165.method2845(arg1 - 1, arg0 + 1) + Static165.method2845(arg1 + 1, arg0 + -1) + Static165.method2845(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static165.method2845(arg1, arg0 - 1) + Static165.method2845(arg1, arg0 + 1) + Static165.method2845(arg1 - 1, arg0) + Static165.method2845(arg1 + 1, arg0);
		@Pc(81) int local81 = Static165.method2845(arg1, arg0);
		return local81 / 4 + local76 / 8 + local47 / 16;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B)V")
	public static void method1822(@OriginalArg(1) byte[] arg0) {
		@Pc(5) int local5 = 0;
		while (true) {
			while (local5 < arg0.length) {
				@Pc(23) int local23 = (arg0[local5++] & 0xFF) * 64 - Static57.anInt1532;
				@Pc(35) int local35 = (arg0[local5++] & 0xFF) * 64 - Static33.anInt974;
				@Pc(64) byte local64;
				@Pc(58) int local58;
				if (local23 > 0 && local35 > 0 && Static190.anInt4160 > local23 + 64 && Static25.anInt737 > local35 + 64) {
					local58 = local23 >> 6;
					@Pc(84) int local84 = Static25.anInt737 - local35 - 1 >> 6;
					for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
						for (@Pc(89) int local89 = -64; local89 < 0; local89++) {
							local64 = arg0[local5++];
							if (local64 != 0) {
								if (Static91.aByteArrayArrayArray55[local58][local84] == null) {
									Static91.aByteArrayArrayArray55[local58][local84] = new byte[4096];
								}
								Static91.aByteArrayArrayArray55[local58][local84][(-(local89 + 1) << 6) + local86] = local64;
								@Pc(133) byte local133 = arg0[local5++];
								if (Static159.aByteArrayArrayArray96[local58][local84] == null) {
									Static159.aByteArrayArrayArray96[local58][local84] = new byte[4096];
								}
								Static159.aByteArrayArrayArray96[local58][local84][local86 + (-(local89 + 1) << 6)] = local133;
							}
						}
					}
				} else {
					for (local58 = -4096; local58 < 0; local58++) {
						local64 = arg0[local5++];
						if (local64 != 0) {
							local5++;
						}
					}
				}
			}
			return;
		}
	}
}
