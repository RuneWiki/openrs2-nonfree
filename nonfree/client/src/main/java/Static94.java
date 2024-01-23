import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	public static int anInt2050 = 0;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	private static int anInt2051 = 0;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public static int anInt2052 = 0;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!ra;")
	public static Class2_Sub3_Sub1_Sub2 aClass2_Sub3_Sub1_Sub2_1 = null;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	public static int anInt2053 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	public static void method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static60.method1176();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static60.anInt1344 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static60.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
	public static void method1747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static60.method1176();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static60.anInt1344 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static60.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([I)V")
	public static void method1748(@OriginalArg(0) int[] arg0) {
		method1752(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
	public static void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static60.method1176();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static60.anInt1344 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static60.anInt1344 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static60.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()V")
	public static void method1750() {
		anInt2050 = 0;
		anInt2053 = 0;
		anInt2051 = Static60.anInt1329;
		anInt2052 = Static60.anInt1344;
		@Pc(9) GL local9 = Static60.aGL1;
		local9.glDisable(3089);
		method1753();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([IIIII)V")
	public static void method1751(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static60.method1176();
		@Pc(2) GL local2 = Static60.aGL1;
		local2.glRasterPos2i(arg1, Static60.anInt1344 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static60.aBoolean114 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)V")
	public static void method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static60.anInt1329) {
			arg2 = Static60.anInt1329;
		}
		if (arg3 > Static60.anInt1344) {
			arg3 = Static60.anInt1344;
		}
		anInt2050 = arg0;
		anInt2053 = arg1;
		anInt2051 = arg2;
		anInt2052 = arg3;
		@Pc(27) GL local27 = Static60.aGL1;
		local27.glEnable(3089);
		if (anInt2050 <= anInt2051 && anInt2053 <= anInt2052) {
			local27.glScissor(Static60.anInt1338 + anInt2050, Static60.anInt1343 + (Static60.anInt1344 - anInt2052), anInt2051 - anInt2050, anInt2052 - anInt2053);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method1753();
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "()V")
	public static void method1753() {
		aClass2_Sub3_Sub1_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIII)V")
	public static void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt2050 < arg0) {
			anInt2050 = arg0;
		}
		if (anInt2053 < arg1) {
			anInt2053 = arg1;
		}
		if (anInt2051 > arg2) {
			anInt2051 = arg2;
		}
		if (anInt2052 > arg3) {
			anInt2052 = arg3;
		}
		@Pc(21) GL local21 = Static60.aGL1;
		local21.glEnable(3089);
		if (anInt2050 <= anInt2051 && anInt2053 <= anInt2052) {
			local21.glScissor(Static60.anInt1338 + anInt2050, Static60.anInt1343 + (Static60.anInt1344 - anInt2052), anInt2051 - anInt2050, anInt2052 - anInt2053);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method1753();
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(IIII)V")
	public static void method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static60.method1176();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static60.anInt1344 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static60.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIII)V")
	public static void method1756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static60.method1176();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static60.anInt1344 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static60.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIIII)V")
	public static void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static60.method1176();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static60.anInt1344 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static60.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIIII)V")
	public static void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static60.method1176();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static60.anInt1344 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static60.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ra;)V")
	public static void method1759(@OriginalArg(0) Class2_Sub3_Sub1_Sub2 arg0) {
		if (arg0.anInt5462 != anInt2052 - anInt2053) {
			throw new IllegalArgumentException();
		}
		aClass2_Sub3_Sub1_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "([I)V")
	public static void method1760(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2050;
		arg0[1] = anInt2053;
		arg0[2] = anInt2051;
		arg0[3] = anInt2052;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIIIII)V")
	public static void method1761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glLineWidth((float) arg5);
		method1749(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "()V")
	public static void method1762() {
		Static60.aGL1.glClear(16640);
	}
}
