import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "Lclient!ni;")
	public static Class223 aClass223_35;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_31 = new Class73(33, -2);

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "[I")
	public static int[] anIntArray86 = new int[1];

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "[I")
	public static final int[] anIntArray87 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2223(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(15) int local15 = arg0.indexOf("--> ");
		if (local15 >= 0) {
			local7 = arg0.substring(0, local15 + 4);
			arg0 = arg0.substring(local15 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(43) int local43 = arg0.indexOf(" ", "directlogin ".length());
			if (local43 >= 0) {
				@Pc(51) int local51 = arg0.length();
				arg0 = arg0.substring(0, local43) + " ";
				for (@Pc(67) int local67 = local43 + 1; local67 < local51; local67++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}
}
