import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
	public static int anInt2488;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "D")
	public static double aDouble9;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_24 = new Class218(62, 12);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method2446() {
		Static301.aBoolean519 = false;
		Static322.anInt6491 = 0;
		Static244.anInt5486 = 0;
		Static14.aClass92Array16 = new Class92[500];
		Static200.anInt4652 = Static325.anInt6512;
		anInt2488 = 0;
		Static270.aClass92Array6 = new Class92[1000];
		Static206.aClass92Array9 = new Class92[2000];
		Static188.aClass92Array4 = new Class92[500];
		Static476.anInt9172 = 0;
		Static625.anInt10332 = Static325.anInt6512;
		Static467.anIntArrayArrayArray11 = new int[Static626.anInt10336][Static642.anInt10523 + 1][Static158.anInt3845 + 1];
		if (Static185.aClass33_8 instanceof oa) {
			Static20.aBoolean21 = false;
		} else {
			Static20.aBoolean21 = true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII[BI)V")
	public static void method2448(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(19) int local19 = arg1 - arg0 >> 2;
		arg3 += arg0;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg1 - arg0 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(28) int local28 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(33) int local33 = local28 + 1;
			arg2[local28] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg2[local33] = 1;
			arg3 = local38 + 1;
			arg2[local38] = 1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII[F[FI[I[III)V")
	public static void method2449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(12) int local12 = arg1 * arg11 + arg5;
		@Pc(28) int local28 = arg0 + arg4 * arg10;
		@Pc(33) int local33 = arg11 - arg3;
		@Pc(38) int local38 = arg10 - arg3;
		@Pc(42) int local42;
		@Pc(48) int local48;
		if (arg8 == null) {
			for (local42 = 0; local42 < arg2; local42++) {
				local48 = arg3 + local12;
				while (local12 < local48) {
					arg7[local28++] = arg6[local12++];
				}
				local12 += local33;
				local28 += local38;
			}
		} else if (arg6 == null) {
			for (local42 = 0; local42 < arg2; local42++) {
				local48 = local12 + arg3;
				while (local48 > local12) {
					arg9[local28++] = arg8[local12++];
				}
				local12 += local33;
				local28 += local38;
			}
		} else {
			for (local42 = 0; local42 < arg2; local42++) {
				local48 = local12 + arg3;
				while (local48 > local12) {
					arg9[local28] = arg8[local12];
					arg7[local28++] = arg6[local12++];
				}
				local28 += local38;
				local12 += local33;
			}
		}
	}
}
