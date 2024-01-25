import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dga", name = "G", descriptor = "Lclient!pl;")
	public static Class259 aClass259_40;

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "I")
	public static int anInt1973 = 0;

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(III)Z")
	public static boolean method1445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[BLclient!lm;B)Lclient!cb;")
	public static Class46 method1447(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class100_Sub1_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static269.anIntArray335, 0);
		if (Static269.anIntArray335[0] == 0) {
			if (Static269.anIntArray335[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static269.anIntArray335, 1);
			if (Static269.anIntArray335[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static269.anIntArray335[1]];
				OpenGL.glGetInfoLogARB(local6, Static269.anIntArray335[1], Static269.anIntArray335, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static269.anIntArray335[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class46(arg2, local6, arg0);
	}
}
