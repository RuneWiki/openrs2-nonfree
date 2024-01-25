import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	public static int anInt193;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_6 = new Class268(68, 1);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!rg;I)Ljava/lang/String;")
	public static String method187(@OriginalArg(0) Class6_Sub40 arg0) {
		return Static231.method3960(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IC)I")
	public static int method193(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class15_Sub18.anIntArray412.length > arg0 ? Class15_Sub18.anIntArray412[arg0] : -1;
	}
}
