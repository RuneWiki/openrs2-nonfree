import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!em", name = "J", descriptor = "I")
	public static int anInt1331;

	@OriginalMember(owner = "client!em", name = "x", descriptor = "[I")
	public static final int[] anIntArray133 = new int[3];

	@OriginalMember(owner = "client!em", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString14 = "";

	@OriginalMember(owner = "client!em", name = "H", descriptor = "F")
	public static float aFloat9 = 0.0F;

	@OriginalMember(owner = "client!em", name = "K", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!em", name = "L", descriptor = "[I")
	public static final int[] anIntArray134 = new int[4096];

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BLclient!oi;I)Lclient!ul;")
	public static Class252 method1159(@OriginalArg(1) Class185 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method3997(arg1);
		return local16 == null ? null : new Class252(local16);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!l;BILjava/awt/Canvas;Lclient!nt;I)Lclient!za;")
	public static Class117 method1160(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class177 arg3, @OriginalArg(5) int arg4) {
		return new Class117_Sub1(arg1, arg2, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(II)Z")
	public static boolean method1162(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class1_Sub10 local18 = (Class1_Sub10) Static57.aClass14_3.method203(); local18 != null; local18 = (Class1_Sub10) Static57.aClass14_3.method208()) {
			if (Static463.method5977(local18.anInt1057) && local18.aLong31 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!em", name = "f", descriptor = "(I)V")
	public static void method1164() {
		Static178.method2589(Static445.aClass242_119);
		Static426.aClass1_Sub19_Sub2_2.method2930(Static382.anInt4998);
	}
}
