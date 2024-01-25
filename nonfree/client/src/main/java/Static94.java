import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!cv", name = "l", descriptor = "Ljava/lang/Class;")
	private static Class aClass9;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_18 = new Class144(11, 7);

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
	public static int anInt2117 = 0;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Z")
	public static final boolean aBoolean153 = false;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "[S")
	public static short[] aShortArray13 = new short[256];

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_8 = new Class313(64);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BII[Ljava/lang/Object;[I)V")
	public static void method1949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		@Pc(54) int local54 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg0; local56 < arg1; local56++) {
			if ((local54 & local56) + local20 > arg3[local56]) {
				@Pc(73) int local73 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16] = local73;
				@Pc(87) Object local87 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16++] = local87;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method1949(arg0, local16 - 1, arg2, arg3);
		method1949(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public static void method1950() {
		try {
			@Pc(17) Method local17 = (aClass9 == null ? (aClass9 = Class67.a("java.lang.Runtime")) : aClass9).getMethod("availableProcessors");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Integer local27 = (Integer) local17.invoke(local21, (Object[]) null);
					Static325.anInt5291 = local27;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(40) Exception local40) {
		}
	}
}
