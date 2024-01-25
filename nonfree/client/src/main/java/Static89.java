import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
	public static int method1960(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(26) int local26 = (arg0 & 0x7F) * 96 >> 7;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 126) {
			local26 = 126;
		}
		return local26 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!jj;Ljava/lang/String;Z)Lclient!ud;")
	public static Class289 method1961(@OriginalArg(0) int arg0, @OriginalArg(1) Class62_Sub3 arg1, @OriginalArg(2) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static471.anIntArray628, 0);
		if (Static471.anIntArray628[0] == 0) {
			if (Static471.anIntArray628[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static471.anIntArray628, 1);
			if (Static471.anIntArray628[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static471.anIntArray628[1]];
				OpenGL.glGetInfoLogARB(local6, Static471.anIntArray628[1], Static471.anIntArray628, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static471.anIntArray628[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class289(arg1, local6, arg0);
	}
}
