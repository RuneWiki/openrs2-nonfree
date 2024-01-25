import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!dn;")
	public static Class69 aClass69_25;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[B")
	public static final byte[] aByteArray22 = new byte[520];

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[S")
	public static final short[] aShortArray37 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method2015() {
		Static62.aClass104Array15 = null;
		Static128.aClass104Array51 = null;
		Static57.aClass104_6 = null;
		Static511.aClass36_4 = null;
		Static186.aClass36_1 = null;
		Static403.aClass36_3 = null;
		Static480.aClass104Array79 = null;
		Static338.aClass104Array32 = null;
		Static342.aClass104Array59 = null;
		Static197.aClass104_17 = null;
		Static130.aClass104Array77 = null;
		Static162.aClass104Array28 = null;
		Static407.aClass104Array70 = null;
		Static90.aClass104Array21 = null;
		Static359.aClass104Array60 = null;
		Static16.aClass104Array86 = null;
		Static237.aClass104Array46 = null;
		Static321.aClass104Array55 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[[B[[BI[BI[II)I")
	public static int method2023(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0[arg3];
		@Pc(15) int local15 = arg5[arg3] + local9;
		@Pc(19) int local19 = arg0[arg6];
		@Pc(25) int local25 = arg5[arg6] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local25 < local15) {
			local34 = local25;
		}
		@Pc(45) int local45 = arg4[arg3] & 0xFF;
		if (local45 > (arg4[arg6] & 0xFF)) {
			local45 = arg4[arg6] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg1[arg3];
		@Pc(78) byte[] local78 = arg2[arg6];
		@Pc(83) int local83 = local27 - local9;
		@Pc(88) int local88 = local27 - local19;
		for (@Pc(90) int local90 = local27; local90 < local34; local90++) {
			@Pc(102) int local102 = local78[local88++] + local74[local83++];
			if (local45 > local102) {
				local45 = local102;
			}
		}
		return -local45;
	}
}
