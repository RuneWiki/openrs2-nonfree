import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array8;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "[S")
	public static short[] aShortArray33;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!hc;")
	public static Class51 aClass51_31;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "S")
	public static short aShort16 = 32767;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString155 = "Loading wordpack - ";

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method1881(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static265.anInt5544; local11++) {
			if (arg0.equalsIgnoreCase(Static48.aStringArray7[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static83.aClass9_Sub1_Sub1_1.aString12);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIII)V")
	public static void method1882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
		Static171.aClass1_Sub13_Sub1_3.method1766(20);
		Static171.aClass1_Sub13_Sub1_3.method1766(arg1);
		Static171.aClass1_Sub13_Sub1_3.method1766(arg3);
		Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		Static171.aClass1_Sub13_Sub1_3.method1789(arg0);
		Static52.anInt1463 = 0;
		Static170.anInt3979 = 0;
		Static117.anInt3043 = 1;
		Static243.anInt5242 = -3;
	}
}
