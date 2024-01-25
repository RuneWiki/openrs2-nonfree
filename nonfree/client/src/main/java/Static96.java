import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIILclient!ab;IIILclient!hg;I)V")
	public static void method1639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class8 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg0 * arg0 + arg5 * arg5;
		if (local16 > arg4) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg2.anInt64 / 2, arg2.anInt116 / 2);
		if (local16 <= local34 * local34) {
			Static294.method4826(arg0, arg6, arg5, arg1, Static133.aClass27Array24[arg7], arg3, arg2);
			return;
		}
		local34 -= 10;
		@Pc(64) int local64;
		if (Static198.anInt4108 == 4) {
			local64 = (int) Static350.aFloat74 & 0x3FFF;
		} else {
			local64 = Static319.anInt5841 + (int) Static350.aFloat74 & 0x3FFF;
		}
		@Pc(75) int local75 = Class106.anIntArray240[local64];
		@Pc(79) int local79 = Class106.anIntArray242[local64];
		if (Static198.anInt4108 != 4) {
			local79 = local79 * 256 / (Static59.anInt1283 + 256);
			local75 = local75 * 256 / (Static59.anInt1283 + 256);
		}
		@Pc(108) int local108 = local79 * arg0 + arg5 * local75 >> 15;
		@Pc(119) int local119 = arg5 * local79 - local75 * arg0 >> 15;
		@Pc(125) double local125 = Math.atan2((double) local108, (double) local119);
		@Pc(132) int local132 = (int) ((double) local34 * Math.sin(local125));
		@Pc(139) int local139 = (int) ((double) local34 * Math.cos(local125));
		Static128.aClass27Array21[arg7].method5329((float) local132 + (float) arg2.anInt64 / 2.0F + (float) arg1, (float) arg2.anInt116 / 2.0F + (float) arg3 - (float) local139, 4096, (int) (-local125 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB[Ljava/lang/Object;I[I)V")
	public static void method1640(@OriginalArg(0) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(31) int local31 = (arg2 + arg0) / 2;
		@Pc(33) int local33 = arg2;
		@Pc(37) int local37 = arg3[local31];
		arg3[local31] = arg3[arg0];
		arg3[arg0] = local37;
		@Pc(51) Object local51 = arg1[local31];
		arg1[local31] = arg1[arg0];
		arg1[arg0] = local51;
		for (@Pc(63) int local63 = arg2; local63 < arg0; local63++) {
			if (arg3[local63] < local37 + (local63 & 0x1)) {
				@Pc(79) int local79 = arg3[local63];
				arg3[local63] = arg3[local33];
				arg3[local33] = local79;
				@Pc(93) Object local93 = arg1[local63];
				arg1[local63] = arg1[local33];
				arg1[local33++] = local93;
			}
		}
		arg3[arg0] = arg3[local33];
		arg3[local33] = local37;
		arg1[arg0] = arg1[local33];
		arg1[local33] = local51;
		method1640(local33 - 1, arg1, arg2, arg3);
		method1640(arg0, arg1, local33 + 1, arg3);
	}
}
