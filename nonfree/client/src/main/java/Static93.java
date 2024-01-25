import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public static int anInt2164;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!fca;")
	public static final Class98 aClass98_1 = new Class98("", 10);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)I")
	public static int method2000(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
