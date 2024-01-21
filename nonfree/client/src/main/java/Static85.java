import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!pc;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "Lclient!fd;")
	public static Class24 aClass24_24;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_1166 = Static69.method1231("::clientdrop");

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_1167 = Static69.method1231("<col=00ff80>");

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!je;")
	private static Class40 aClass40_1168 = Static69.method1231("Aug");

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!je;")
	private static Class40 aClass40_1169 = Static69.method1231("May");

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!je;")
	private static Class40 aClass40_1170 = Static69.method1231("Sep");

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!je;")
	private static Class40 aClass40_1171 = Static69.method1231("Apr");

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!je;")
	private static Class40 aClass40_1172 = Static69.method1231("Jun");

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!je;")
	private static Class40 aClass40_1173 = Static69.method1231("Oct");

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!je;")
	private static Class40 aClass40_1174 = Static69.method1231("Mar");

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!je;")
	private static Class40 aClass40_1175 = Static69.method1231("Dec");

	@OriginalMember(owner = "client!p", name = "r", descriptor = "Lclient!je;")
	private static Class40 aClass40_1176 = Static69.method1231("Feb");

	@OriginalMember(owner = "client!p", name = "x", descriptor = "Lclient!je;")
	private static Class40 aClass40_1177 = Static69.method1231("Jan");

	@OriginalMember(owner = "client!p", name = "D", descriptor = "Lclient!je;")
	private static Class40 aClass40_1179 = Static69.method1231("Jul");

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Lclient!je;")
	private static Class40 aClass40_1178 = Static69.method1231("Nov");

	@OriginalMember(owner = "client!p", name = "s", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array16 = new Class40[] { aClass40_1177, aClass40_1176, aClass40_1174, aClass40_1171, aClass40_1169, aClass40_1172, aClass40_1179, aClass40_1168, aClass40_1170, aClass40_1173, aClass40_1178, aClass40_1175 };

	@OriginalMember(owner = "client!p", name = "w", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array17 = new Class40[200];

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!je;")
	public static Class40 aClass40_1180 = Static69.method1231("(U(Y");

	@OriginalMember(owner = "client!p", name = "F", descriptor = "[I")
	public static int[] anIntArray249 = new int[2000];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IJ)V")
	public static void method1582(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static106.method1831(arg0 - 1L);
			Static106.method1831(1L);
		} else {
			Static106.method1831(arg0);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)I")
	public static int method1586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg3;
			arg3 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg4;
		} else {
			return 7 + 1 - arg5 - arg3;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method1588(@OriginalArg(0) Class2_Sub9 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static104.aClass82_5 != null) {
			@Pc(20) int local20;
			try {
				Static104.aClass82_5.method2144(0L);
				Static104.aClass82_5.method2152(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method619(24, local8);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public static void method1589() {
		aClass40Array16 = null;
		aClass40_1167 = null;
		aClass40Array17 = null;
		anIntArray249 = null;
		aClass40_1166 = null;
		aClass40_1174 = null;
		aClass40_1180 = null;
		aClass40_1175 = null;
		aClass40_1169 = null;
		aClass40_1171 = null;
		aClass40_1170 = null;
		aClass40_1177 = null;
		aClass40_1168 = null;
		aClass40_1178 = null;
		anImage3 = null;
		aClass40_1176 = null;
		aClass40_1179 = null;
		aClass24_24 = null;
		aClass57_2 = null;
		aClass40_1172 = null;
		aClass40_1173 = null;
	}
}
