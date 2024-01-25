import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!dca", name = "q", descriptor = "I")
	public static int anInt1542;

	@OriginalMember(owner = "client!dca", name = "m", descriptor = "[Lclient!bi;")
	public static final Interface2[] anInterface2Array2 = new Interface2[128];

	@OriginalMember(owner = "client!dca", name = "o", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_43 = new Class362(17, 3);

	@OriginalMember(owner = "client!dca", name = "u", descriptor = "[Lclient!wi;")
	public static final Class358[] aClass358Array1 = new Class358[6];

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IB)I")
	public static int method1553(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
