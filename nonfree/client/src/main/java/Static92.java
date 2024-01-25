import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_159 = new Class40(75, 1);

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public static int anInt7190 = 0;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "[I")
	public static final int[] anIntArray575 = new int[1];

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lclient!efa;")
	public static Class8_Sub1 method5966(@OriginalArg(0) int arg0) {
		return Static498.aBoolean571 && Static123.anInt2133 <= arg0 && arg0 <= Static329.anInt5898 ? Static303.aClass8_Sub1Array1[arg0 - Static123.anInt2133] : null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BZILclient!efa;Lclient!efa;IZ)I")
	public static int method5969(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub1 arg2, @OriginalArg(4) Class8_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static526.method7360(arg1, arg3, arg0, arg2);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static526.method7360(arg4, arg3, arg5, arg2);
			return arg5 ? -local36 : local36;
		}
	}
}
