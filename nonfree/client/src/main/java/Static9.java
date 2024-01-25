import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!as;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "Lclient!up;")
	public static final Class246 aClass246_1 = new Class246();

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	public static int anInt359 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 + arg0 > arg5 && arg2 < arg4 + arg5) {
			return arg3 < arg1 + arg6 && arg1 < arg3 + arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method305(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(39) long local39 = arg0;
			while (local39 != 0L) {
				local39 /= 37L;
				local29++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(61) long local61 = arg0;
				arg0 /= 37L;
				local57.append(Static155.aCharArray1[(int) (local61 - arg0 * 37L)]);
			}
			return local57.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZB)Z")
	public static boolean method306(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static126.aClass66_5.method5056();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static126.aClass66_5.method4966();
		} else if (!Static126.aClass66_5.method4999()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static291.aClass28_Sub1_1.aBoolean82 = arg0;
			Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
			return true;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)V")
	public static void method307(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg0, 10);
		local8.method3084();
	}
}
