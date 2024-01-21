import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!va;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
	public static int anInt2067 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!jc;")
	public static RuntimeException_Sub1 method1591(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString2 = local12.aString2 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	public static void method1593(@OriginalArg(1) boolean arg0) {
		Static67.method1334();
		Static44.anInt1134++;
		if (Static44.anInt1134 < 50 && !arg0) {
			return;
		}
		Static44.anInt1134 = 0;
		if (Static75.aBoolean230 || Static91.aClass53_2 == null) {
			return;
		}
		Static176.aClass1_Sub7_Sub1_34.method2808(4);
		try {
			Static91.aClass53_2.method1717(Static176.aClass1_Sub7_Sub1_34.aByteArray38, Static176.aClass1_Sub7_Sub1_34.anInt3592);
			Static176.aClass1_Sub7_Sub1_34.anInt3592 = 0;
		} catch (@Pc(46) IOException local46) {
			Static75.aBoolean230 = true;
		}
	}
}
