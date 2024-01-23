import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lclient!th;")
	public static Class168 aClass168_66;

	@OriginalMember(owner = "client!gh", name = "R", descriptor = "Lclient!th;")
	public static Class168 aClass168_67;

	@OriginalMember(owner = "client!gh", name = "T", descriptor = "[[Lclient!gd;")
	public static Class61[][] aClass61ArrayArray1;

	@OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
	public static int anInt2035 = 255;

	@OriginalMember(owner = "client!gh", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString115 = null;

	@OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
	public static int anInt2040 = 0;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIB)V")
	public static void method1506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 * anInt2035 >> 8;
		if (arg1 == -1 && !Static82.aBoolean132) {
			Static167.method2734();
		} else if (arg1 != -1 && (Static107.anInt1667 != arg1 || !Static183.method2969()) && local5 != 0 && !Static82.aBoolean132) {
			Static5.method2411(arg1, local5, Static310.aClass168_209);
		}
		Static107.anInt1667 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIB)V")
	public static void method1507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub3_Sub6 local9 = Static165.method2679(arg1, arg0, arg2);
		if (local9 == null) {
			return;
		}
		Static61.anIntArray161 = new int[local9.anInt1262];
		if (local9.anInt1260 == 15 || local9.anInt1260 == 17 || local9.anInt1260 == 16) {
			@Pc(41) int local41 = 0;
			@Pc(43) int local43 = 0;
			if (Static246.aClass191_12 != null) {
				local43 = Static246.aClass191_12.anInt6157;
				local41 = Static246.aClass191_12.anInt6123;
			}
			Static61.anIntArray161[1] = Static289.anInt5816 - local43;
			Static61.anIntArray161[0] = Static89.anInt5974 - local41;
		}
		Static127.aStringArray27 = new String[local9.anInt1263];
		Static65.method1145(local9, 200000);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILjava/awt/Component;B)Lclient!ad;")
	public static Class3 method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub1");
			@Pc(10) Class3 local10 = (Class3) local6.getDeclaredConstructor().newInstance();
			local10.method2412(arg2, arg1, arg0);
			return local10;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class3_Sub2 local31 = new Class3_Sub2();
			local31.method2412(arg2, arg1, arg0);
			return local31;
		}
	}
}
