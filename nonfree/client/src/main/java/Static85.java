import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "[Lclient!ofa;")
	public static final Interface18[] anInterface18Array2 = new Interface18[75];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
	public static int method1783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static301.anIntArrayArray59 == null ? 0 : Static301.anIntArrayArray59[arg0][arg1] & 0xFFFFFF;
	}
}
