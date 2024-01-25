import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([Lclient!aj;Lclient!ih;I)Lclient!eq;")
	public static Class77 method1530(@OriginalArg(0) Class10[] arg0, @OriginalArg(1) Class106_Sub2 arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] == null || arg0[local5].aLong7 <= 0L) {
				return null;
			}
		}
		@Pc(30) long local30 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
			OpenGL.glAttachObjectARB(local30, arg0[local32].aLong7);
		}
		OpenGL.glLinkProgramARB(local30);
		OpenGL.glGetObjectParameterivARB(local30, 35714, Static19.anIntArray32, 0);
		if (Static19.anIntArray32[0] == 0) {
			if (Static19.anIntArray32[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local30, 35716, Static19.anIntArray32, 1);
			if (Static19.anIntArray32[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static19.anIntArray32[1]];
				OpenGL.glGetInfoLogARB(local30, Static19.anIntArray32[1], Static19.anIntArray32, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static19.anIntArray32[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local30, arg0[local115].aLong7);
				}
				OpenGL.glDeleteObjectARB(local30);
				return null;
			}
		}
		return new Class77(arg1, local30, arg0);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)I")
	public static int method1531() {
		if (Static93.aFrame2 == null) {
			return Static62.aBoolean107 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
	public static void method1532() {
		Static11.aClass91_4.method1999();
	}
}
