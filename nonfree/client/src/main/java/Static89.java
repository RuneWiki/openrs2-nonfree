import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "[S")
	public static short[] aShortArray22;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public static int anInt1937;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[I")
	public static int[] anIntArray199 = new int[128];

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "Z")
	public static boolean aBoolean176 = true;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	public static int anInt1940 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "[I")
	public static int[] anIntArray201 = new int[5];

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Z")
	public static boolean method1511(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
	public static int method1512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 >>> 31;
		return (local3 + arg0) / arg1 - local3;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)Lclient!kk;")
	public static Class69 method1514(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = (Class69) Static57.aClass61_93.method1693((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(32) byte[] local32 = Static24.aClass28_12.method819(Static56.method1121(arg0), Static60.method1155(arg0));
		local6 = new Class69();
		local6.anInt2559 = arg0;
		if (local32 != null) {
			local6.method2009(new Class1_Sub26(local32));
		}
		Static57.aClass61_93.method1694((long) arg0, local6);
		return local6;
	}
}
