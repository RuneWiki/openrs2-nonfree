import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
	public static int anInt2043 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Z")
	public static boolean method1890(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([Lclient!rka;Lclient!aq;I)Lclient!fp;")
	public static Class122 method1894(@OriginalArg(0) Class328[] arg0, @OriginalArg(1) Class22_Sub1 arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			if (arg0[local14] == null || arg0[local14].aLong291 <= 0L) {
				return null;
			}
		}
		@Pc(46) long local46 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(48) int local48 = 0; local48 < arg0.length; local48++) {
			OpenGL.glAttachObjectARB(local46, arg0[local48].aLong291);
		}
		OpenGL.glLinkProgramARB(local46);
		OpenGL.glGetObjectParameterivARB(local46, 35714, Static625.anIntArray698, 0);
		if (Static625.anIntArray698[0] == 0) {
			if (Static625.anIntArray698[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local46, 35716, Static625.anIntArray698, 1);
			if (Static625.anIntArray698[1] > 1) {
				@Pc(110) byte[] local110 = new byte[Static625.anIntArray698[1]];
				OpenGL.glGetInfoLogARB(local46, Static625.anIntArray698[1], Static625.anIntArray698, 0, local110, 0);
				System.out.println(new String(local110));
			}
			if (Static625.anIntArray698[0] == 0) {
				for (@Pc(131) int local131 = 0; local131 < arg0.length; local131++) {
					OpenGL.glDetachObjectARB(local46, arg0[local131].aLong291);
				}
				OpenGL.glDeleteObjectARB(local46);
				return null;
			}
		}
		return new Class122(arg1, local46, arg0);
	}
}
