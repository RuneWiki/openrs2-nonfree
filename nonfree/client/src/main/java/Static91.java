import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!en", name = "n", descriptor = "I")
	public static int anInt2263;

	@OriginalMember(owner = "client!en", name = "o", descriptor = "Lclient!rm;")
	public static Class216 aClass216_6;

	@OriginalMember(owner = "client!en", name = "r", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_46 = new Class209("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!en", name = "w", descriptor = "Z")
	public static boolean aBoolean161 = true;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[J[I)V")
	public static void method1764(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static133.method2268(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([Lclient!ji;BLclient!ef;)Lclient!bt;")
	public static Class32 method1767(@OriginalArg(0) Class130[] arg0, @OriginalArg(2) Class49_Sub2 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] == null || arg0[local12].aLong108 <= 0L) {
				return null;
			}
		}
		@Pc(34) long local34 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
			OpenGL.glAttachObjectARB(local34, arg0[local36].aLong108);
		}
		OpenGL.glLinkProgramARB(local34);
		OpenGL.glGetObjectParameterivARB(local34, 35714, Static342.anIntArray498, 0);
		if (Static342.anIntArray498[0] == 0) {
			if (Static342.anIntArray498[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local34, 35716, Static342.anIntArray498, 1);
			if (Static342.anIntArray498[1] > 1) {
				@Pc(87) byte[] local87 = new byte[Static342.anIntArray498[1]];
				OpenGL.glGetInfoLogARB(local34, Static342.anIntArray498[1], Static342.anIntArray498, 0, local87, 0);
				System.out.println(new String(local87));
			}
			if (Static342.anIntArray498[0] == 0) {
				for (@Pc(108) int local108 = 0; local108 < arg0.length; local108++) {
					OpenGL.glDetachObjectARB(local34, arg0[local108].aLong108);
				}
				OpenGL.glDeleteObjectARB(local34);
				return null;
			}
		}
		return new Class32(arg1, local34, arg0);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(III)Z")
	public static boolean method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static37.method607(arg0, arg1) || Static117.method2084(arg0, arg1);
	}
}
