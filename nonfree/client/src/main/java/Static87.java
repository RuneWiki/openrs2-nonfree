import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	private static int anInt1757 = 0;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!d;")
	public static Class4_Sub2_Sub4_Sub1 aClass4_Sub2_Sub4_Sub1_1 = null;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static int anInt1758 = 0;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public static int anInt1759 = 0;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public static int anInt1760 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	public static void method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static251.method3874();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static251.anInt4925 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static251.anInt4925 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static251.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
	public static void method1449() {
		aClass4_Sub2_Sub4_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
	public static void method1450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static251.method3874();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static251.anInt4925 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static251.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIII)V")
	public static void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static251.method3874();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static251.anInt4925 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static251.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([I)V")
	public static void method1453(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt1759;
		arg0[1] = anInt1760;
		arg0[2] = anInt1757;
		arg0[3] = anInt1758;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIIII)V")
	public static void method1454(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static251.method3874();
		@Pc(2) GL local2 = Static251.aGL1;
		local2.glRasterPos2i(arg1, Static251.anInt4925 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static251.aBoolean314 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIII)V")
	public static void method1455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static251.method3874();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static251.anInt4925 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static251.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)V")
	public static void method1456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static251.method3874();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static251.anInt4925 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static251.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIII)V")
	public static void method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static251.anInt4924) {
			arg2 = Static251.anInt4924;
		}
		if (arg3 > Static251.anInt4925) {
			arg3 = Static251.anInt4925;
		}
		anInt1759 = arg0;
		anInt1760 = arg1;
		anInt1757 = arg2;
		anInt1758 = arg3;
		@Pc(27) GL local27 = Static251.aGL1;
		local27.glEnable(3089);
		if (anInt1759 <= anInt1757 && anInt1760 <= anInt1758) {
			local27.glScissor(Static251.anInt4933 + anInt1759, Static251.anInt4921 + (Static251.anInt4925 - anInt1758), anInt1757 - anInt1759, anInt1758 - anInt1760);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method1449();
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(IIII)V")
	public static void method1458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt1759 < arg0) {
			anInt1759 = arg0;
		}
		if (anInt1760 < arg1) {
			anInt1760 = arg1;
		}
		if (anInt1757 > arg2) {
			anInt1757 = arg2;
		}
		if (anInt1758 > arg3) {
			anInt1758 = arg3;
		}
		@Pc(21) GL local21 = Static251.aGL1;
		local21.glEnable(3089);
		if (anInt1759 <= anInt1757 && anInt1760 <= anInt1758) {
			local21.glScissor(Static251.anInt4933 + anInt1759, Static251.anInt4921 + (Static251.anInt4925 - anInt1758), anInt1757 - anInt1759, anInt1758 - anInt1760);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method1449();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIIII)V")
	public static void method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glLineWidth((float) arg5);
		method1448(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "([I)V")
	public static void method1460(@OriginalArg(0) int[] arg0) {
		method1457(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIIIII)V")
	public static void method1461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static251.method3874();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static251.anInt4925 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static251.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()V")
	public static void method1462() {
		anInt1759 = 0;
		anInt1760 = 0;
		anInt1757 = Static251.anInt4924;
		anInt1758 = Static251.anInt4925;
		@Pc(9) GL local9 = Static251.aGL1;
		local9.glDisable(3089);
		method1449();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!d;)V")
	public static void method1463(@OriginalArg(0) Class4_Sub2_Sub4_Sub1 arg0) {
		if (arg0.anInt5191 != anInt1758 - anInt1760) {
			throw new IllegalArgumentException();
		}
		aClass4_Sub2_Sub4_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIIII)V")
	public static void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static251.method3874();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static251.anInt4925 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static251.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()V")
	public static void method1465() {
		Static251.aGL1.glClear(16640);
	}
}
