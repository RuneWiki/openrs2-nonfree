import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
	public static int anInt2618 = 2;

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "[Lclient!cl;")
	public static final Class57[] aClass57Array1 = new Class57[100];

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "[I")
	public static final int[] anIntArray116 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILclient!ka;ILclient!lca;I)V")
	public static void method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class191 arg4) {
		if (arg2 != null) {
			arg4.method4924(arg3, arg2.EA(), arg2.HA(), arg2.V(), arg2.na(), arg2.G(), arg2.fa(), arg1, arg2.RA(), arg0);
		}
	}
}
