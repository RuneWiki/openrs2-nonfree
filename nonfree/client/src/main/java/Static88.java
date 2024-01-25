import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "S")
	public static short aShort25 = 205;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V")
	public static void method1379(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(21) int local21 = (arg0 + arg2) / 2;
		@Pc(23) int local23 = arg2;
		@Pc(27) String local27 = arg1[local21];
		arg1[local21] = arg1[arg0];
		arg1[arg0] = local27;
		@Pc(41) short local41 = arg3[local21];
		arg3[local21] = arg3[arg0];
		arg3[arg0] = local41;
		for (@Pc(53) int local53 = arg2; local53 < arg0; local53++) {
			if (local27 == null || arg1[local53] != null && (local53 & 0x1) > arg1[local53].compareTo(local27)) {
				@Pc(73) String local73 = arg1[local53];
				arg1[local53] = arg1[local23];
				arg1[local23] = local73;
				@Pc(87) short local87 = arg3[local53];
				arg3[local53] = arg3[local23];
				arg3[local23++] = local87;
			}
		}
		arg1[arg0] = arg1[local23];
		arg1[local23] = local27;
		arg3[arg0] = arg3[local23];
		arg3[local23] = local41;
		method1379(local23 - 1, arg1, arg2, arg3);
		method1379(arg0, arg1, local23 + 1, arg3);
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	public static void method1383() {
		Static471.aClass59_31 = null;
		Static303.aClass59_13 = null;
		Static113.aClass59_3 = null;
		Static430.aClass59_32 = null;
		Static428.aClass59_23 = null;
		Static27.aClass59_1 = null;
		Static145.aClass59_4 = null;
		Static113.aClass59Array2 = null;
		Static545.aClass59_33 = null;
	}
}
