import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
	private static int anInt1941 = 0;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static int anInt1942 = 0;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Lclient!ko;")
	public static Class1_Sub5_Sub6_Sub2 aClass1_Sub5_Sub6_Sub2_1 = null;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	public static int anInt1943 = 0;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public static int anInt1944 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
	public static void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static71.method1416();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static71.anInt1537 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static71.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "()V")
	public static void method1761() {
		Static71.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)V")
	public static void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static71.method1416();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static71.anInt1537 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static71.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ko;)V")
	public static void method1763(@OriginalArg(0) Class1_Sub5_Sub6_Sub2 arg0) {
		if (arg0.anInt3625 != anInt1943 - anInt1942) {
			throw new IllegalArgumentException();
		}
		aClass1_Sub5_Sub6_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([I)V")
	public static void method1764(@OriginalArg(0) int[] arg0) {
		method1772(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "()V")
	public static void method1765() {
		aClass1_Sub5_Sub6_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIILclient!ko;)V")
	public static void method1766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub5_Sub6_Sub2 arg6) {
		if (anInt1943 - anInt1942 != arg6.anInt3625) {
			throw new IllegalStateException();
		}
		Static71.method1416();
		Static71.method1400(arg6.anInt3630);
		Static71.method1392(1);
		Static71.method1380(0);
		@Pc(22) float local22 = (float) arg0 + 0.3F;
		@Pc(27) float local27 = (float) arg2 + 0.3F;
		@Pc(35) float local35 = (float) Static71.anInt1537 - (float) arg1 - 0.3F;
		@Pc(43) float local43 = (float) Static71.anInt1537 - (float) arg3 - 0.3F;
		@Pc(45) GL local45 = Static71.aGL1;
		local45.glTexEnvi(8960, 34176, 34168);
		local45.glBegin(2);
		local45.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local45.glTexCoord2f((local22 - (float) anInt1944) / (float) arg6.anInt3628, ((float) Static71.anInt1537 - local35 - (float) anInt1942) / (float) arg6.anInt3632);
		local45.glVertex2f(local22, local35);
		local45.glTexCoord2f((local27 - (float) anInt1944) / (float) arg6.anInt3628, ((float) Static71.anInt1537 - local43 - (float) anInt1942) / (float) arg6.anInt3632);
		local45.glVertex2f(local27, local43);
		local45.glEnd();
		local45.glTexEnvi(8960, 34176, 5890);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIII)V")
	public static void method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt1944 < arg0) {
			anInt1944 = arg0;
		}
		if (anInt1942 < arg1) {
			anInt1942 = arg1;
		}
		if (anInt1941 > arg2) {
			anInt1941 = arg2;
		}
		if (anInt1943 > arg3) {
			anInt1943 = arg3;
		}
		@Pc(21) GL local21 = Static71.aGL1;
		local21.glEnable(3089);
		if (anInt1944 <= anInt1941 && anInt1942 <= anInt1943) {
			local21.glScissor(Static71.anInt1536 + anInt1944, Static71.anInt1547 + (Static71.anInt1537 - anInt1943), anInt1941 - anInt1944, anInt1943 - anInt1942);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method1765();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII)V")
	public static void method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static71.method1416();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static71.anInt1537 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static71.anInt1537 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static71.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "([I)V")
	public static void method1769(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt1944;
		arg0[1] = anInt1942;
		arg0[2] = anInt1941;
		arg0[3] = anInt1943;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([IIIII)V")
	public static void method1770(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static71.method1416();
		@Pc(2) GL local2 = Static71.aGL1;
		local2.glRasterPos2i(arg1, Static71.anInt1537 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static71.aBoolean168 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIIII)V")
	public static void method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static71.method1416();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static71.anInt1537 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static71.aGL1;
		local20.glBegin(1);
		local20.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(IIII)V")
	public static void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static71.anInt1540) {
			arg2 = Static71.anInt1540;
		}
		if (arg3 > Static71.anInt1537) {
			arg3 = Static71.anInt1537;
		}
		anInt1944 = arg0;
		anInt1942 = arg1;
		anInt1941 = arg2;
		anInt1943 = arg3;
		@Pc(27) GL local27 = Static71.aGL1;
		local27.glEnable(3089);
		if (anInt1944 <= anInt1941 && anInt1942 <= anInt1943) {
			local27.glScissor(Static71.anInt1536 + anInt1944, Static71.anInt1547 + (Static71.anInt1537 - anInt1943), anInt1941 - anInt1944, anInt1943 - anInt1942);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method1765();
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(IIIII)V")
	public static void method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static71.method1416();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static71.anInt1537 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static71.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(IIII)V")
	public static void method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static71.method1416();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static71.anInt1537 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static71.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIIIII)V")
	public static void method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static71.method1416();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static71.anInt1537 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static71.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "()V")
	public static void method1776() {
		anInt1944 = 0;
		anInt1942 = 0;
		anInt1941 = Static71.anInt1540;
		anInt1943 = Static71.anInt1537;
		@Pc(9) GL local9 = Static71.aGL1;
		local9.glDisable(3089);
		method1765();
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(IIIII)V")
	public static void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static71.method1416();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static71.anInt1537 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static71.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(IIIIII)V")
	public static void method1778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glLineWidth((float) arg5);
		method1768(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}
}
