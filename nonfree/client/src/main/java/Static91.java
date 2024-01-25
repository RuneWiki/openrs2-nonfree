import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt2548;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_20 = new Class257(51, 4);

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	public static int anInt2547 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ai;[BII)Lclient!kca;")
	public static Class171 method2153(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static338.anIntArray374, 0);
		if (Static338.anIntArray374[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class171(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public static void method2154(@OriginalArg(1) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		if (Static105.anInt2774 == 1) {
			Static580.aClass16_10.method6069(arg0, arg1, Static384.anInt7465, Static58.anInt1883);
		} else {
			Static580.aClass16_10.method6069(arg0, arg1, 0, 0);
		}
	}
}
