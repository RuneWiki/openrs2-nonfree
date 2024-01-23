import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Locale;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public static int anInt2075;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Z")
	public static boolean aBoolean126;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "F")
	private static float aFloat45;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
	public static boolean aBoolean127;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Z")
	public static boolean aBoolean128;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	private static int anInt2077;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public static int anInt2078;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString116;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString117;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Z")
	public static boolean aBoolean129;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	private static int anInt2079;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "Z")
	public static boolean aBoolean130;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
	public static int anInt2080;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "Z")
	public static boolean aBoolean131;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	public static int anInt2081;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	private static int anInt2082;

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
	public static boolean aBoolean134;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "F")
	private static float aFloat47;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "Z")
	public static boolean aBoolean135;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "Z")
	public static boolean aBoolean137;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
	public static int anInt2083;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
	private static int anInt2084;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "Z")
	public static boolean aBoolean139;

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "Z")
	public static boolean aBoolean141;

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	private static int anInt2088;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
	public static boolean aBoolean143;

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	private static int anInt2089;

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
	private static int anInt2090;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	private static int anInt2073 = 0;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	private static int anInt2074 = -1;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Z")
	private static boolean aBoolean125 = true;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	private static int anInt2076 = -1;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "Z")
	private static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "Z")
	private static boolean aBoolean133 = true;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "F")
	private static float aFloat46 = 0.0F;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "[F")
	private static float[] aFloatArray20 = new float[16];

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "F")
	private static float aFloat48 = 0.0F;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Z")
	public static boolean aBoolean136 = true;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
	public static int anInt2085 = 0;

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "Z")
	private static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
	private static int anInt2087 = -1;

	@OriginalMember(owner = "client!gi", name = "R", descriptor = "Z")
	private static boolean aBoolean142 = true;

	@OriginalMember(owner = "client!gi", name = "S", descriptor = "F")
	private static float aFloat49 = 0.09765625F;

	@OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
	private static int anInt2091 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method1604((float) local7 * aFloat49, (float) local17 * aFloat49, (float) -local35 * aFloat49, (float) -local25 * aFloat49, 50.0F, 3584.0F);
		method1583(arg0, anInt2083 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean132 = false;
		Static291.anInt5438 = local7;
		Static157.anInt3123 = local17;
		Static311.anInt6034 = local25;
		Static27.anInt403 = local35;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	private static void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt2082 = arg0;
		anInt2079 = arg1;
		anInt2088 = arg2;
		anInt2089 = arg3;
		method1586();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
	public static void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2086 = arg0;
		anInt2078 = arg1;
		method1586();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	public static void method1585() {
		Static164.method2665(0, 0);
		method1601();
		method1600(-1);
		method1610(false);
		method1588(false);
		method1593(false);
		method1595();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
	private static void method1586() {
		aGL1.glViewport(anInt2082 + anInt2086, anInt2079 + anInt2078, anInt2088, anInt2089);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V")
	public static void method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2080 = arg0;
		anInt2083 = arg1;
		aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	public static void method1588(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean125) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean125 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "()V")
	public static void method1589() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "()V")
	public static void method1590() {
		Static164.method2665(0, 0);
		method1601();
		method1597(0);
		method1607(0);
		method1610(false);
		method1588(false);
		method1593(false);
		method1595();
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "()V")
	public static void method1591() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
	private static void method1592(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean136) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean136 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V")
	public static void method1593(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean142) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean142 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method1594(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
		try {
			if (!arg0.isDisplayable()) {
				return -1;
			}
			@Pc(8) GLCapabilities local8 = new GLCapabilities();
			if (arg1 > 0) {
				local8.setSampleBuffers(true);
				local8.setNumSamples(arg1);
			}
			@Pc(18) GLDrawableFactory local18 = GLDrawableFactory.getFactory();
			aGLDrawable1 = local18.getGLDrawable(arg0, local8, null);
			aGLDrawable1.setRealized(true);
			@Pc(29) int local29 = 0;
			@Pc(36) int var6;
			while (true) {
				aGLContext1 = aGLDrawable1.createContext(arg2);
				try {
					var6 = aGLContext1.makeCurrent();
					if (var6 != 0) {
						break;
					}
				} catch (@Pc(41) Exception local41) {
				}
				if (local29++ > 5) {
					return -2;
				}
				Static303.method4677(1000L);
			}
			aGL1 = aGLContext1.getGL();
			aBoolean138 = true;
			anInt2080 = arg0.getSize().width;
			anInt2083 = arg0.getSize().height;
			var6 = method1616();
			if (var6 != 0) {
				method1605();
				return var6;
			}
			method1619();
			method1624();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local29++ > 5) {
						method1605();
						return -3;
					}
					Static303.method4677(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			method1605();
			return -5;
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "()V")
	public static void method1595() {
		if (aBoolean140) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean140 = false;
		}
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "()V")
	public static void method1596() {
		Static164.method2665(0, 0);
		method1601();
		method1597(1);
		method1607(1);
		method1610(false);
		method1588(false);
		method1593(false);
		method1595();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public static void method1597(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2073) {
			return;
		}
		if (arg0 == 0) {
			aGL1.glTexEnvi(8960, 34161, 8448);
		}
		if (arg0 == 1) {
			aGL1.glTexEnvi(8960, 34161, 7681);
		}
		if (arg0 == 2) {
			aGL1.glTexEnvi(8960, 34161, 260);
		}
		if (arg0 == 3) {
			aGL1.glTexEnvi(8960, 34161, 34023);
		}
		if (arg0 == 4) {
			aGL1.glTexEnvi(8960, 34161, 34164);
		}
		if (arg0 == 5) {
			aGL1.glTexEnvi(8960, 34161, 34165);
		}
		anInt2073 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt2080 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt2083 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method1583(0, 0, anInt2080, anInt2083);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)V")
	public static void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method1582(0, 0, anInt2080, anInt2083, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	public static void method1600(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2087) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt2087 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt2087 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "()V")
	private static void method1601() {
		if (aBoolean132) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt2080, 0.0D, (double) anInt2083, -1.0D, 1.0D);
		method1583(0, 0, anInt2080, anInt2083);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean132 = true;
	}

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "()V")
	public static void method1603() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFFFFF)V")
	private static void method1604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray20[0] = local3 / (arg1 - arg0);
		aFloatArray20[1] = 0.0F;
		aFloatArray20[2] = 0.0F;
		aFloatArray20[3] = 0.0F;
		aFloatArray20[4] = 0.0F;
		aFloatArray20[5] = local3 / (arg3 - arg2);
		aFloatArray20[6] = 0.0F;
		aFloatArray20[7] = 0.0F;
		aFloatArray20[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray20[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray20[10] = aFloat45 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray20[11] = -1.0F;
		aFloatArray20[12] = 0.0F;
		aFloatArray20[13] = 0.0F;
		aFloatArray20[14] = aFloat47 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray20[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray20, 0);
		aFloat48 = 0.0F;
		aFloat46 = 0.0F;
	}

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "()V")
	public static void method1605() {
		if (aGL1 != null) {
			try {
				Static53.method882();
				Static2.method3();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static173.method2729();
			try {
				if (GLContext.getCurrent() == aGLContext1) {
					aGLContext1.release();
				}
			} catch (@Pc(18) Throwable local18) {
			}
			try {
				aGLContext1.destroy();
			} catch (@Pc(22) Throwable local22) {
			}
			aGLContext1 = null;
		}
		if (aGLDrawable1 != null) {
			try {
				aGLDrawable1.setRealized(false);
			} catch (@Pc(31) Throwable local31) {
			}
			aGLDrawable1 = null;
		}
		Static196.method3136();
		aBoolean138 = false;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(IIII)V")
	public static void method1606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method1583(anInt2086, anInt2078, anInt2080, anInt2083);
		aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	public static void method1607(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2091) {
			return;
		}
		if (arg0 == 0) {
			aGL1.glTexEnvi(8960, 34162, 8448);
		}
		if (arg0 == 1) {
			aGL1.glTexEnvi(8960, 34162, 7681);
		}
		if (arg0 == 2) {
			aGL1.glTexEnvi(8960, 34162, 260);
		}
		anInt2091 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "()V")
	public static void method1608() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method1600(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt2080, anInt2083, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFF)V")
	public static void method1609(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean140) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean140 = true;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(Z)V")
	public static void method1610(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean133) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean133 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method1611(@OriginalArg(0) Canvas arg0) {
		try {
			if (!arg0.isDisplayable()) {
				return;
			}
			@Pc(5) GLDrawableFactory local5 = GLDrawableFactory.getFactory();
			@Pc(11) GLDrawable local11 = local5.getGLDrawable(arg0, null, null);
			local11.setRealized(true);
			@Pc(18) GLContext local18 = local11.createContext(null);
			local18.makeCurrent();
			local18.release();
			local18.destroy();
			local11.setRealized(false);
		} catch (@Pc(30) Throwable local30) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "()F")
	public static float method1612() {
		return aFloat46;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(F)V")
	public static void method1613(@OriginalArg(0) float arg0) {
		method1621(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "()I")
	public static int method1614() {
		if (aBoolean134 && (anInt2076 <= 0 || anInt2074 != Static173.anInt3332)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt2074 = Static173.anInt3332;
			anInt2076 = local9[0];
		}
		return anInt2076;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
	public static void method1615(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "()I")
	private static int method1616() {
		@Pc(1) int local1 = 0;
		aString117 = aGL1.glGetString(7936);
		aString116 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString117.toLowerCase();
		if (local12.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local12.indexOf("brian paul") != -1 || local12.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(39) String local39 = aGL1.glGetString(7938);
		@Pc(43) String[] local43 = local39.split("[. ]");
		if (local43.length >= 2) {
			try {
				@Pc(52) int local52 = Integer.parseInt(local43[0]);
				@Pc(57) int local57 = Integer.parseInt(local43[1]);
				anInt2084 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt2084 < 12) {
			local1 |= 0x2;
		}
		if (!aGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!aGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(100) int[] local100 = new int[1];
		aGL1.glGetIntegerv(34018, local100, 0);
		anInt2081 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt2090 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt2077 = local100[0];
		if (anInt2081 < 2 || anInt2090 < 2 || anInt2077 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean126 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean135 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean130 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean128 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean143 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean134 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean131 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean137 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean127 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean141 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean139 = true;
		@Pc(197) String local197 = aString116.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static45.method721(' ', local197.replace('/', ' '));
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static214.method3486(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static214.method3486(local224.substring(0, 4))) {
						local204 = Static47.method737(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				aBoolean135 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				aBoolean137 = false;
			}
			if (local204 >= 9200 || local206) {
				aBoolean141 = false;
			}
			aBoolean129 = aBoolean135;
			aBoolean139 = false;
		}
		if (aBoolean135) {
			try {
				@Pc(292) int[] local292 = new int[1];
				aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	public static void method1617(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "()V")
	public static void method1618() {
		if (Static56.aBoolean66) {
			method1610(true);
			method1592(true);
		} else {
			method1610(false);
			method1592(false);
		}
	}

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "()V")
	private static void method1619() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt2075 = local2[0];
		aGL1.glBindTexture(3553, anInt2075);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static196.method3133();
		Static56.method968();
		Static53.method872();
	}

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "()F")
	public static float method1620() {
		return aFloat48;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FF)V")
	public static void method1621(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean132 || arg0 == aFloat48 && arg1 == aFloat46) {
			return;
		}
		aFloat48 = arg0;
		aFloat46 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray20[10] = aFloat45;
			aFloatArray20[14] = aFloat47;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat47 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray20[10] = aFloat45 + local42;
			aFloatArray20[14] = aFloat47 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray20, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "()V")
	public static void method1622() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method1623(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method1594(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "()V")
	private static void method1624() {
		aBoolean132 = false;
		aGL1.glDisable(3553);
		anInt2087 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt2073 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt2091 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean133 = true;
		aBoolean125 = true;
		aBoolean142 = true;
		Static248.method3916();
		aGL1.glActiveTexture(33985);
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		aGL1.glTexEnvi(8960, 34162, 8448);
		aGL1.glActiveTexture(33984);
		aGL1.setSwapInterval(0);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		aGL1.glShadeModel(7425);
		aGL1.glClearDepth(1.0F);
		aGL1.glDepthFunc(515);
		method1591();
		aGL1.glMatrixMode(5890);
		aGL1.glLoadIdentity();
		aGL1.glPolygonMode(1028, 6914);
		aGL1.glEnable(2884);
		aGL1.glCullFace(1029);
		aGL1.glEnable(3042);
		aGL1.glBlendFunc(770, 771);
		aGL1.glEnable(3008);
		aGL1.glAlphaFunc(516, 0.0F);
		aGL1.glEnableClientState(32884);
		aGL1.glEnableClientState(32885);
		aBoolean136 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static178.method2792();
		Static196.method3131();
	}

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "()V")
	public static void method1625() {
		Static164.method2665(0, 0);
		method1601();
		method1597(0);
		method1607(0);
		method1610(false);
		method1588(false);
		method1593(false);
		method1595();
	}
}
