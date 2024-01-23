import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
	public static int[] anIntArray166 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!fd;)Lclient!wg;")
	public static Class4_Sub3_Sub22 method1562(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		@Pc(41) Class4_Sub3_Sub22 local41 = new Class4_Sub3_Sub22(arg0, arg1.method4630(), arg1.method4630(), arg1.method4632(), arg1.method4632(), arg1.method4666() == 1, arg1.method4666());
		@Pc(49) int local49 = arg1.method4666();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local41.aClass114_31.method2625(new Class4_Sub7(arg1.method4666(), arg1.method4666(), arg1.method4653(), arg1.method4653(), arg1.method4653(), arg1.method4653(), arg1.method4653(), arg1.method4653(), arg1.method4653(), arg1.method4653()));
		}
		local41.method4796();
		return local41;
	}
}
