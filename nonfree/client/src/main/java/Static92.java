import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "Lclient!cl;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_14 = new Class195();

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "[I")
	public static final int[] anIntArray223 = new int[50];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	public static void method1718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static215.anInt4248 = arg1 - Static342.anInt2150;
		Static202.anInt4094 = arg0 - Static342.anInt2144;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
	public static int method1719(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!qj;Lclient!qj;Lclient!qj;)V")
	public static void method1720(@OriginalArg(1) Class165 arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(3) Class165 arg2) {
		Static31.aClass165_11 = arg1;
		Static251.method5679(arg0, arg2);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[I[II)V")
	public static void method1722(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg0) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) int local25 = arg1[local19];
		arg1[local19] = arg1[arg0];
		arg1[arg0] = local25;
		@Pc(39) int local39 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg0; local51++) {
			if (arg1[local51] < (local51 & 0x1) + local25) {
				@Pc(66) int local66 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21] = local66;
				@Pc(80) int local80 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21++] = local80;
			}
		}
		arg1[arg0] = arg1[local21];
		arg1[local21] = local25;
		arg2[arg0] = arg2[local21];
		arg2[local21] = local39;
		method1722(local21 - 1, arg1, arg2, arg3);
		method1722(arg0, arg1, arg2, local21 + 1);
	}
}
