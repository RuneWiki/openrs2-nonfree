import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!t;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!kc;")
	public static Class11 aClass11_18;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Lclient!fe;")
	public static Class17 aClass17_83;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!lc;")
	public static Class31 aClass31_813 = Static56.method1206("Ok");

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	public static int anInt2339 = 0;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!lc;")
	public static Class31 aClass31_814 = Static56.method1206("Jan");

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public static int anInt2341 = 0;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Lclient!lc;")
	public static Class31 aClass31_815 = Static56.method1206("scape main");

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_816 = Static56.method1206("Cabbage");

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!lc;")
	public static Class31 aClass31_817 = Static56.method1206("Earlier today");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1485() {
		@Pc(10) int local10;
		for (@Pc(3) int local3 = -1; local3 < Static21.anInt1007; local3++) {
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static78.anIntArray322[local3];
			}
			@Pc(20) Class2_Sub1_Sub4_Sub6_Sub1 local20 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local10];
			if (local20 != null && local20.anInt1981 > 0) {
				local20.anInt1981--;
				if (local20.anInt1981 == 0) {
					local20.aClass31_708 = null;
				}
			}
		}
		for (local10 = 0; local10 < Static49.anInt2696; local10++) {
			@Pc(63) int local63 = Static57.anIntArray383[local10];
			@Pc(67) Class2_Sub1_Sub4_Sub6_Sub2 local67 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local63];
			if (local67 != null && local67.anInt1981 > 0) {
				local67.anInt1981--;
				if (local67.anInt1981 == 0) {
					local67.aClass31_708 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZILjava/awt/Graphics;Lclient!hc;I)V")
	public static void method1486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) Class2_Sub1_Sub3_Sub3 arg3, @OriginalArg(5) int arg4) {
		Static62.aClass9_16.method861();
		Static89.aClass2_Sub1_Sub3_Sub1_14.method291(0, 0);
		arg3.method964(Static39.aClass31_540, 55, 28, 16777215, true);
		if (arg4 == 0) {
			arg3.method964(Static102.aClass31_218, 55, 41, 65280, true);
		}
		if (arg4 == 1) {
			arg3.method964(Static44.aClass31_581, 55, 41, 16776960, true);
		}
		if (arg4 == 2) {
			arg3.method964(Static37.aClass31_505, 55, 41, 16711680, true);
		}
		if (arg4 == 3) {
			arg3.method964(Static79.aClass31_796, 55, 41, 65535, true);
		}
		arg3.method964(Static16.aClass31_251, 184, 28, 16777215, true);
		if (arg0 == 0) {
			arg3.method964(Static102.aClass31_218, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg3.method964(Static44.aClass31_581, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg3.method964(Static37.aClass31_505, 184, 41, 16711680, true);
		}
		arg3.method964(Static18.aClass31_267, 324, 28, 16777215, true);
		if (arg1 == 0) {
			arg3.method964(Static102.aClass31_218, 324, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg3.method964(Static44.aClass31_581, 324, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg3.method964(Static37.aClass31_505, 324, 41, 16711680, true);
		}
		arg3.method964(Static34.aClass31_450, 458, 33, 16777215, true);
		Static62.aClass9_16.method863(arg2, 453, 0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method1487() {
		aClass31_816 = null;
		aClass1_1 = null;
		aClass31_817 = null;
		aClass31_813 = null;
		aClass17_83 = null;
		aClass31_815 = null;
		aClass11_18 = null;
		aClass31_814 = null;
		anObject4 = null;
	}
}
