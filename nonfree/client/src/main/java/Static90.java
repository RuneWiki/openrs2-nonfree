import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array4;

	@OriginalMember(owner = "client!dg", name = "S", descriptor = "Lclient!bc;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "[I")
	public static final int[] anIntArray143 = new int[8];

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)Z")
	public static boolean method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ow;Z)I")
	public static int method2036(@OriginalArg(0) Class252 arg0) {
		if (arg0 == Static74.aClass252_1) {
			return 5890;
		} else if (Static525.aClass252_4 == arg0) {
			return 34167;
		} else if (arg0 == Static165.aClass252_3) {
			return 34168;
		} else if (arg0 == Static88.aClass252_2) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)Lclient!wf;")
	public static Class361 method2037(@OriginalArg(0) int arg0) {
		@Pc(10) Class361 local10 = (Class361) Static535.aClass10_62.method250((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static154.aClass246_78.method5653(0, arg0);
		local10 = new Class361();
		if (local20 != null) {
			local10.method7693(new Class3_Sub11(local20));
		}
		local10.method7697();
		Static535.aClass10_62.method254(local10, (long) arg0);
		return local10;
	}
}
