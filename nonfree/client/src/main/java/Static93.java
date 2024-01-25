import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	public static int anInt5013;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_135 = new Class21(30);

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
	public static int anInt5010 = 0;

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
	public static int anInt5014 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method4579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg3 && arg5 == arg6 && arg7 == arg2 && arg0 == arg1) {
			Static1.method47(arg2, arg0, arg3, arg6, arg4);
			return;
		}
		@Pc(41) int local41 = arg3;
		@Pc(43) int local43 = arg6;
		@Pc(47) int local47 = arg3 * 3;
		@Pc(51) int local51 = arg6 * 3;
		@Pc(55) int local55 = arg8 * 3;
		@Pc(59) int local59 = arg5 * 3;
		@Pc(63) int local63 = arg7 * 3;
		@Pc(67) int local67 = arg1 * 3;
		@Pc(77) int local77 = arg2 + local55 - arg3 - local63;
		@Pc(88) int local88 = arg0 + local59 - arg6 - local67;
		@Pc(97) int local97 = local47 + local63 - local55 - local55;
		@Pc(107) int local107 = local51 + local67 - local59 - local59;
		@Pc(111) int local111 = local55 - local47;
		@Pc(116) int local116 = local59 - local51;
		for (@Pc(118) int local118 = 128; local118 <= 4096; local118 += 128) {
			@Pc(126) int local126 = local118 * local118 >> 12;
			@Pc(132) int local132 = local118 * local126 >> 12;
			@Pc(136) int local136 = local132 * local77;
			@Pc(140) int local140 = local132 * local88;
			@Pc(144) int local144 = local97 * local126;
			@Pc(148) int local148 = local107 * local126;
			@Pc(152) int local152 = local111 * local118;
			@Pc(156) int local156 = local116 * local118;
			@Pc(166) int local166 = arg3 + (local152 + local144 + local136 >> 12);
			@Pc(177) int local177 = arg6 + (local156 + local140 + local148 >> 12);
			Static1.method47(local166, local177, local41, local43, arg4);
			local43 = local177;
			local41 = local166;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!at;I)V")
	public static void method4609(@OriginalArg(0) Class1_Sub7 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static242.anInt4948; local3++) {
			@Pc(9) int local9 = arg0.method2134();
			@Pc(15) int local15 = arg0.method2161();
			if (local15 == 65535) {
				local15 = -1;
			}
			if (Static51.aClass135_Sub1Array1[local9] != null) {
				Static51.aClass135_Sub1Array1[local9].anInt4030 = local15;
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!ge;I)V")
	public static void method4630(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7_Sub2 arg1) {
		Static312.aBoolean445 = false;
		Static30.anInt698 = 0;
		Static182.method3458(arg1);
		Static201.method3742(arg1);
		if (Static312.aBoolean445) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt2219) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt2219 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIILclient!ic;Lclient!gt;Ljava/awt/Canvas;)Lclient!fp;")
	public static synchronized Class63 method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static131.aBooleanArray12[local14]) {
				local12 = local14;
				break;
			}
		}
		if (local12 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(60) Class63 local60;
		if (arg0 == 0) {
			local60 = Static364.method6050(arg4, arg2, local12);
		} else if (arg0 == 1) {
			local60 = Static191.method5775(arg4, local12, arg1, arg3, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static131.aBooleanArray12[local12] = true;
		return local60;
	}
}
