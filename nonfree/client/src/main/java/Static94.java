import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array16;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	public static int anInt1731;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
	public static int anInt1732 = 0;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public static int anInt1733 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method1708() {
		@Pc(5) Class70 local5 = Static69.aClass70_17;
		synchronized (Static69.aClass70_17) {
			Static69.aClass70_17.method1399();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method1711(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
	public static int method1713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589;
		return local29 >> 19 & 0xFF;
	}
}
