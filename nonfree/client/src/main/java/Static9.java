import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!qfa;")
	public static Class284 aClass284_1;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	public static int anInt230;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_6 = new Class349(11, 6);

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!vea;")
	public static final Class347 aClass347_1 = new Class347();

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([Lclient!caa;II)V")
	public static void method175(@OriginalArg(0) Class12_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class12_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9377;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9377 < local27 + (local29 & 0x1)) {
				@Pc(44) Class12_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method175(arg0, arg1, local10 - 1);
		method175(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ)V")
	public static void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static339.anInt5844 == 1) {
			Static345.method5016(Static150.aClass2_Sub27_1, arg0, arg1);
		} else if (Static339.anInt5844 == 2) {
			Static200.method2511(arg1, arg0);
		}
		Static150.aClass2_Sub27_1 = null;
		Static339.anInt5844 = 0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[Lclient!g;Lclient!uca;)Lclient!nba;")
	public static Class233 method178(@OriginalArg(1) Class118[] arg0, @OriginalArg(2) Class162_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong61 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(39) int local39 = 0; local39 < arg0.length; local39++) {
			OpenGL.glAttachObjectARB(local29, arg0[local39].aLong61);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static104.anIntArray161, 0);
		if (Static104.anIntArray161[0] == 0) {
			if (Static104.anIntArray161[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static104.anIntArray161, 1);
			if (Static104.anIntArray161[1] > 1) {
				@Pc(94) byte[] local94 = new byte[Static104.anIntArray161[1]];
				OpenGL.glGetInfoLogARB(local29, Static104.anIntArray161[1], Static104.anIntArray161, 0, local94, 0);
				System.out.println(new String(local94));
			}
			if (Static104.anIntArray161[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local29, arg0[local115].aLong61);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class233(arg1, local29, arg0);
	}
}
