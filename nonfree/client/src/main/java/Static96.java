import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!pc;")
	public static Class188 aClass188_32;

	@OriginalMember(owner = "client!em", name = "v", descriptor = "[I")
	public static int[] anIntArray119;

	@OriginalMember(owner = "client!em", name = "w", descriptor = "I")
	public static int anInt2175;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_28 = new Class44(58, 2);

	@OriginalMember(owner = "client!em", name = "s", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_41 = new Class256("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!em", name = "t", descriptor = "I")
	public static int anInt2174 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)I")
	public static int method1603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static64.method1259(arg0 + 91923, arg1 + 45365, 4) + (Static64.method1259(arg0 + 37821, arg1 + 10294, 2) - 128 >> 1) + (Static64.method1259(arg0, arg1, 1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZIIZI)V")
	public static void method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(11) int local11 = (arg3 + arg1) / 2;
		@Pc(13) int local13 = arg3;
		@Pc(17) Class23_Sub1 local17 = Static393.aClass23_Sub1Array2[local11];
		Static393.aClass23_Sub1Array2[local11] = Static393.aClass23_Sub1Array2[arg1];
		Static393.aClass23_Sub1Array2[arg1] = local17;
		for (@Pc(29) int local29 = arg3; local29 < arg1; local29++) {
			if (Static374.method5251(local17, arg0, Static393.aClass23_Sub1Array2[local29], arg2, arg5, arg4) <= 0) {
				@Pc(46) Class23_Sub1 local46 = Static393.aClass23_Sub1Array2[local29];
				Static393.aClass23_Sub1Array2[local29] = Static393.aClass23_Sub1Array2[local13];
				Static393.aClass23_Sub1Array2[local13++] = local46;
			}
		}
		Static393.aClass23_Sub1Array2[arg1] = Static393.aClass23_Sub1Array2[local13];
		Static393.aClass23_Sub1Array2[local13] = local17;
		method1604(arg0, local13 - 1, arg2, arg3, arg4, arg5);
		method1604(arg0, arg1, arg2, local13 + 1, arg4, arg5);
	}
}
