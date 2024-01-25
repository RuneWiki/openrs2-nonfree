import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_120 = new Class159("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!cn;")
	public static final Class33 aClass33_2 = new Class33();

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	public static int anInt2546 = -50;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public static void method2239(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static74.anInt1921 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([[BI[[BI[B[II[I)I")
	public static int method2241(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg5[arg3];
		@Pc(15) int local15 = arg6[arg3] + local9;
		@Pc(19) int local19 = arg5[arg1];
		@Pc(25) int local25 = arg6[arg1] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(49) int local49 = arg4[arg3] & 0xFF;
		if (local49 > (arg4[arg1] & 0xFF)) {
			local49 = arg4[arg1] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg2[arg3];
		@Pc(74) byte[] local74 = arg0[arg1];
		@Pc(79) int local79 = local27 - local9;
		@Pc(84) int local84 = local27 - local19;
		for (@Pc(91) int local91 = local27; local91 < local34; local91++) {
			@Pc(103) int local103 = local74[local84++] + local70[local79++];
			if (local103 < local49) {
				local49 = local103;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!hl;IIIBIILclient!hl;II)V")
	public static void method2242(@OriginalArg(0) Class8_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class8_Sub1_Sub2 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method4339();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class58 local21 = (Class58) Static7.aClass198_8.method5210((long) local7);
		if (local21 == null) {
			@Pc(28) Class110[] local28 = Static362.method3088(Static316.aClass193_99, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static274.aClass47_9.method2677(local28[0]);
			Static7.aClass198_8.method5201(local21, (long) local7);
		}
		Static160.method3157(arg4.anInt6702, arg1 >> 1, arg4.anInt6701, 0, arg6 >> 1, arg4.method4349() * 64);
		@Pc(73) int local73 = arg3 + Static185.anIntArray328[0] - 18;
		@Pc(83) int local83 = Static185.anIntArray328[1] + arg2 - 54 - 16;
		@Pc(91) int local91 = local73 + arg5 / 4 * 18;
		@Pc(99) int local99 = local83 + arg5 % 4 * 18;
		local21.method4269(local91, local99);
		if (arg0 == arg4) {
			Static274.aClass47_9.method2727(local99 - 1, 18, 18, -256, local91 - 1);
		}
		@Pc(121) Class2_Sub6 local121 = Static328.method5319();
		local121.anInt5749 = local99;
		local121.anInt5751 = local91 + 16;
		local121.anInt5747 = local99 + 16;
		local121.aClass8_Sub1_Sub2_1 = arg0;
		local121.anInt5750 = local91;
		Static197.aClass32_8.method844(local121);
	}
}
