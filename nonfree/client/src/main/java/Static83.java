import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!daa", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject49;

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
	public static int anInt9715 = 0;

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "Lclient!db;")
	public static final Class64 aClass64_490 = new Class64(58, 11);

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "[I")
	public static int[] anIntArray721 = new int[2];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIII)V")
	public static void method7959(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		if (Static555.anInt9335 == 2) {
			Static37.anInt738 = local3;
			Static348.anInt6087 = local11;
			Static235.anInt4750 = 0;
		}
		Static330.aFloat102 = local11;
		Static477.aFloat164 = local3;
		Static404.method5838();
		Static279.aBoolean393 = true;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLclient!e;Ljava/awt/Canvas;Z)Lclient!oa;")
	public static Class66 method7961(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) boolean arg2) {
		return arg2 ? new Class66_Sub2_Sub1(arg1, arg0) : new Class66_Sub2_Sub2(arg1, arg0);
	}
}
