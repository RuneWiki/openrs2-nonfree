import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	public static int anInt1862;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "[I")
	public static final int[] anIntArray159 = new int[2048];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIB[B[BIII)V")
	public static void method1547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(26) int local26 = -(arg0 & 0x3);
		for (@Pc(29) int local29 = -arg2; local29 < 0; local29++) {
			@Pc(37) int local37;
			for (@Pc(33) int local33 = local10; local33 < 0; local33++) {
				local37 = arg5++;
				arg4[local37] += arg3[arg6++];
				@Pc(49) int local49 = arg5++;
				arg4[local49] += arg3[arg6++];
				@Pc(61) int local61 = arg5++;
				arg4[local61] += arg3[arg6++];
				@Pc(73) int local73 = arg5++;
				arg4[local73] += arg3[arg6++];
			}
			for (@Pc(88) int local88 = local26; local88 < 0; local88++) {
				local37 = arg5++;
				arg4[local37] += arg3[arg6++];
			}
			arg5 += arg7;
			arg6 += arg1;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method1549() {
		if (Static423.aClass103Array1 == null) {
			Static423.aClass103Array1 = Static136.method2087();
			Static2.aClass103_1 = Static423.aClass103Array1[0];
			Static378.aLong204 = Static413.method5668();
		}
		if (Static521.aClass163_1 == null) {
			Static216.method3353();
		}
		@Pc(23) Class103 local23 = Static2.aClass103_1;
		@Pc(32) int local32 = Static354.method4846();
		if (local23 == Static2.aClass103_1) {
			Static267.aString42 = Static2.aClass103_1.aClass351_1.method7651(Static307.anInt5279);
			if (Static2.aClass103_1.aBoolean196) {
				Static138.anInt2654 = (Static2.aClass103_1.anInt2631 - Static2.aClass103_1.anInt2628) * local32 / 100 + Static2.aClass103_1.anInt2628;
			}
			if (Static2.aClass103_1.aBoolean195) {
				Static267.aString42 = Static267.aString42 + Static138.anInt2654 + "%";
			}
		} else if (Static136.aClass103_23 == Static2.aClass103_1) {
			Static521.aClass163_1 = null;
			Static426.method5887(3);
		} else {
			Static267.aString42 = local23.aClass351_2.method7651(Static307.anInt5279);
			Static138.anInt2654 = local23.anInt2631;
			if (Static2.aClass103_1.aBoolean195) {
				Static267.aString42 = Static267.aString42 + local23.anInt2631 + "%";
			}
			if (Static2.aClass103_1.aBoolean196 || local23.aBoolean196) {
				Static378.aLong204 = Static413.method5668();
			}
		}
		if (Static521.aClass163_1 == null) {
			return;
		}
		Static521.aClass163_1.method3472(Static378.aLong204, Static267.aString42, Static138.anInt2654, Static2.aClass103_1);
		if (Static243.anInterface10Array1 == null) {
			return;
		}
		for (@Pc(134) int local134 = Static92.anInt1988 + 1; local134 < Static243.anInterface10Array1.length; local134++) {
			if (Static243.anInterface10Array1[local134].method6289() >= 100 && Static92.anInt1988 == local134 - 1 && Static216.anInt4135 >= 1 && Static521.aClass163_1.method3459()) {
				try {
					Static243.anInterface10Array1[local134].method6290();
				} catch (@Pc(168) Exception local168) {
					Static243.anInterface10Array1 = null;
					return;
				}
				Static521.aClass163_1.method3461(Static243.anInterface10Array1[local134]);
				Static92.anInt1988++;
				if (Static92.anInt1988 >= Static243.anInterface10Array1.length - 1 && Static243.anInterface10Array1.length > 1) {
					Static92.anInt1988 = Static535.aClass32_1.method543() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIBIII)V")
	public static void method1550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (Static348.aClass1_Sub30_Sub1_1.anInt4863 != 0 && arg2 != 0 && Static507.anInt8646 < 50 && arg4 != -1) {
			Static150.aClass104Array1[Static507.anInt8646++] = new Class104((byte) 2, arg4, arg2, arg1, arg3, arg0);
		}
	}
}
