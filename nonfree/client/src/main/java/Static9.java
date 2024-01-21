import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "ob", descriptor = "[I")
	private static int[] anIntArray31 = new int[10000];

	@OriginalMember(owner = "client!bc", name = "Eb", descriptor = "[I")
	private static int[] anIntArray37 = new int[10000];

	@OriginalMember(owner = "client!bc", name = "Ob", descriptor = "I")
	private static int anInt276 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ge;II)Lclient!bc;")
	public static Class6_Sub3_Sub1_Sub1 method212(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method110(arg1, 0);
		return local5 == null ? null : new Class6_Sub3_Sub1_Sub1(local5);
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)I")
	public static int method215(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class6_Sub3_Sub1_Sub1.anIntArray41[arg0];
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bc;Lclient!bc;IIIZ)V")
	public static void method218(@OriginalArg(0) Class6_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) Class6_Sub3_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method222();
		arg0.method214();
		arg1.method222();
		arg1.method214();
		anInt276++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray39;
		@Pc(19) int local19 = arg1.anInt274;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt274; local21++) {
			@Pc(27) Class75 local27 = arg0.aClass75Array2[local21];
			if (local27.anInt3185 != 0) {
				local37 = arg0.anIntArray33[local21] - arg3;
				if (local37 <= arg1.anInt273) {
					@Pc(48) int local48 = arg0.anIntArray39[local21] - arg2;
					if (local48 >= arg1.anInt277 && local48 <= arg1.anInt279) {
						@Pc(64) int local64 = arg0.anIntArray38[local21] - arg4;
						if (local64 >= arg1.anInt275 && local64 <= arg1.anInt278) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class75 local81 = arg1.aClass75Array2[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray38[local75] && local37 == arg1.anIntArray33[local75] && local81.anInt3185 != 0) {
									if (arg0.aClass75Array1 == null) {
										arg0.aClass75Array1 = new Class75[arg0.anInt274];
									}
									if (arg1.aClass75Array1 == null) {
										arg1.aClass75Array1 = new Class75[local19];
									}
									@Pc(121) Class75 local121 = arg0.aClass75Array1[local21];
									if (local121 == null) {
										local121 = arg0.aClass75Array1[local21] = new Class75(local27);
									}
									@Pc(138) Class75 local138 = arg1.aClass75Array1[local75];
									if (local138 == null) {
										local138 = arg1.aClass75Array1[local75] = new Class75(local81);
									}
									local121.anInt3190 += local81.anInt3190;
									local121.anInt3188 += local81.anInt3188;
									local121.anInt3187 += local81.anInt3187;
									local121.anInt3185 += local81.anInt3185;
									local138.anInt3190 += local27.anInt3190;
									local138.anInt3188 += local27.anInt3188;
									local138.anInt3187 += local27.anInt3187;
									local138.anInt3185 += local27.anInt3185;
									local13++;
									anIntArray37[local21] = anInt276;
									anIntArray31[local75] = anInt276;
								}
							}
						}
					}
				}
			}
		}
		if (local13 < 3 || !arg5) {
			return;
		}
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt271; local232++) {
			if (anIntArray37[arg0.anIntArray43[local232]] == anInt276 && anIntArray37[arg0.anIntArray32[local232]] == anInt276 && anIntArray37[arg0.anIntArray36[local232]] == anInt276) {
				if (arg0.aByteArray4 == null) {
					arg0.aByteArray4 = new byte[arg0.anInt271];
				}
				arg0.aByteArray4[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt271; local37++) {
			if (anIntArray31[arg1.anIntArray43[local37]] == anInt276 && anIntArray31[arg1.anIntArray32[local37]] == anInt276 && anIntArray31[arg1.anIntArray36[local37]] == anInt276) {
				if (arg1.aByteArray4 == null) {
					arg1.aByteArray4 = new byte[arg1.anInt271];
				}
				arg1.aByteArray4[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "()V")
	public static void method227() {
		anIntArray37 = null;
		anIntArray31 = null;
		Class6_Sub3_Sub1_Sub1.anIntArray41 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public static int method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
