import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
	public static int anInt1716;

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
	public static int anInt1719 = 1;

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "[I")
	public static final int[] anIntArray98 = new int[6];

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_9 = new Class209(8);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!gga;Z)Lclient!aq;")
	public static Class24_Sub1 method1542(@OriginalArg(0) Class6_Sub23 arg0) {
		return new Class24_Sub1(arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8344(), arg0.method8344(), arg0.method8374());
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public static void method1544() {
		@Pc(7) int local7 = Static475.anInt8165;
		@Pc(9) int[] local9 = Static75.anIntArray82;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class2_Sub1_Sub1_Sub3_Sub1 local24 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local9[local16]];
			if (local24 != null && local24.anInt5106 > 0) {
				local24.anInt5106--;
				if (local24.anInt5106 == 0) {
					local24.aString66 = null;
				}
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static133.anInt2316; local50++) {
			@Pc(57) long local57 = (long) Static74.anIntArray80[local50];
			@Pc(63) Class6_Sub44 local63 = (Class6_Sub44) Static349.aClass209_32.method5038(local57);
			if (local63 != null) {
				@Pc(68) Class2_Sub1_Sub1_Sub3_Sub2 local68 = local63.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				if (local68.anInt5106 > 0) {
					local68.anInt5106--;
					if (local68.anInt5106 == 0) {
						local68.aString66 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "([[IB)V")
	public static void method1545(@OriginalArg(0) int[][] arg0) {
		Static173.anIntArrayArray15 = arg0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIIII)V")
	public static void method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static65.anInt1203; local7++) {
			@Pc(13) Rectangle local13 = Class6_Sub1_Sub7.aRectangleArray2[local7];
			if (arg3 < local13.width + local13.x && arg2 + arg3 > local13.x && arg0 < local13.height + local13.y && local13.y < arg0 + arg1) {
				Static224.aBooleanArray12[local7] = true;
			}
		}
		Static629.method8681(arg2 + arg3, arg0, arg1 + arg0, arg3);
	}
}
