import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!daa", name = "x", descriptor = "Lclient!ph;")
	public static Class255 aClass255_1;

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_38 = new Class319(66, 2);

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "J")
	public static long aLong88 = 0L;

	@OriginalMember(owner = "client!daa", name = "w", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!daa", name = "y", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
	public static void method1701(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1 local14 = Static410.aClass356_31.method7792(); local14 != null; local14 = Static410.aClass356_31.method7795()) {
			if ((long) arg0 == (local14.aLong425 >> 48 & 0xFFFFL)) {
				local14.method7878();
			}
		}
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)Z")
	public static boolean method1702(@OriginalArg(0) int arg0) {
		if (arg0 == 17 || arg0 == 49 || arg0 == 51 || arg0 == 58 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 19 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IBILclient!da;I)Lclient!cu;")
	public static Class60 method1703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class61 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class60(arg0, arg3, arg1, arg2.K(), arg2.KA(), arg2.l(), arg2.J(), arg2.H(), arg2.OA(), arg2.za());
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!ga;II)Lclient!cca;")
	public static Class43 method1704(@OriginalArg(1) Class111 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = arg0.method2441(0, arg1);
		return local11 == null ? null : new Class43(local11);
	}
}
