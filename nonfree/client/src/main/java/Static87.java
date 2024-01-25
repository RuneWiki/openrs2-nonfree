import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static87 {

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	public static int anInt1887;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "Lclient!ll;")
	public static Class178 aClass178_1;

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;Z)Lclient!nr;")
	public static Class101 method1777(@OriginalArg(0) Component arg0) {
		return new Class101_Sub1(arg0);
	}
}
