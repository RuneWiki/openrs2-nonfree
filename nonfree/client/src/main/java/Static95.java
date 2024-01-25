import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!en", name = "f", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
	public static final boolean aBoolean107 = false;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(CI)Z")
	public static boolean method1666(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIZIII)Lclient!qs;")
	public static Class96 method1667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 76724863L ^ (long) arg3 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg1 * 67481L ^ (long) arg2 * 97549L ^ (long) arg4 * 986053L;
		@Pc(39) Class96 local39 = (Class96) Static268.aClass126_37.method2822(local33);
		if (local39 == null) {
			local39 = Static253.aClass51_7.method5351(arg1, arg2, arg0, arg4, arg3, arg5);
			Static268.aClass126_37.method2824(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public static void method1669() {
		for (@Pc(10) Class7_Sub37 local10 = (Class7_Sub37) Static276.aClass85_30.method2010(); local10 != null; local10 = (Class7_Sub37) Static276.aClass85_30.method2000()) {
			if (local10.anInt5480 == -1) {
				local10.anInt5474 = 0;
				if (local10.anInt5481 >= 0 && local10.anInt5477 >= 0 && Static333.anInt3375 > local10.anInt5481 && Static102.anInt2086 > local10.anInt5477) {
					Static388.method4968(local10);
				}
			} else {
				local10.method5802();
			}
		}
	}
}
