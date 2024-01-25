import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_34 = new Class286(73, -1);

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
	public static final int[] anIntArray102 = new int[1];

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_54 = new Class363(72, 3);

	@OriginalMember(owner = "client!di", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[200];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI[B)[B")
	public static byte[] method1455(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static598.method1137(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIILclient!lca;Lclient!lca;)V")
	public static void method1456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub1_Sub5 arg3, @OriginalArg(4) Class6_Sub1_Sub5 arg4) {
		@Pc(4) Class346 local4 = Static308.method4598(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass6_Sub1_Sub5_1 = arg3;
		local4.aClass6_Sub1_Sub5_2 = arg4;
		@Pc(19) int local19 = Static421.aClass67Array7 == Static592.aClass67Array4 ? 1 : 0;
		if (!arg3.method7329()) {
			Static54.aClass6_Sub1ArrayArray2[local19][Static53.anIntArray64[local19]++] = arg3;
		} else if (arg3.method7318()) {
			Static312.aClass6_Sub1ArrayArray3[local19][Static142.anIntArray179[local19]++] = arg3;
		} else {
			Static3.aClass6_Sub1ArrayArray1[local19][Static26.anIntArray39[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7329()) {
			if (arg4.method7318()) {
				Static312.aClass6_Sub1ArrayArray3[local19][Static142.anIntArray179[local19]++] = arg4;
				return;
			}
			Static3.aClass6_Sub1ArrayArray1[local19][Static26.anIntArray39[local19]++] = arg4;
			return;
		}
		Static54.aClass6_Sub1ArrayArray2[local19][Static53.anIntArray64[local19]++] = arg4;
	}
}
