import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard2;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public static int anInt6375 = 0;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
	public static int anInt6376 = 0;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
	public static int anInt6378 = 0;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	public static int anInt6379 = -1;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
	public static int anInt6381 = 104;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!bj;IILclient!bj;ZIZ)I")
	public static int method5548(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub1 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static285.method5110(arg3, arg2, arg5, arg0);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static285.method5110(arg3, arg1, arg4, arg0);
			return arg4 ? -local36 : local36;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!on;I)V")
	public static void method5549(@OriginalArg(0) Class146 arg0) {
		@Pc(11) Class146 local11 = Static186.method4859(arg0);
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (local11 == null) {
			local16 = Static136.anInt2829;
			local19 = Static198.anInt3876;
		} else {
			local16 = local11.anInt4468;
			local19 = local11.anInt4414;
		}
		Static356.method5994(local16, arg0, local19, false);
		Static71.method1643(arg0, local16, local19);
	}
}
