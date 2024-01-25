import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
	public static int anInt2087;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "I")
	public static int anInt2089;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
	public static int anInt2090;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString72 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!fp", name = "S", descriptor = "I")
	public static int anInt2092 = 0;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(II)V")
	public static void method1673(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static42.aFloat25 = 3.0F;
		} else if (arg0 == 50) {
			Static42.aFloat25 = 4.0F;
		} else if (arg0 == 75) {
			Static42.aFloat25 = 6.0F;
		} else if (arg0 == 100) {
			Static42.aFloat25 = 8.0F;
		} else if (arg0 == 200) {
			Static42.aFloat25 = 16.0F;
		}
		Static157.anInt3513 = -1;
		Static157.anInt3513 = -1;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIII)I")
	public static int method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!io;B)Z")
	public static boolean method1675(@OriginalArg(0) Interface5 arg0) {
		@Pc(16) Class56 local16 = Static320.method5290(arg0.method4729());
		if (local16.anInt1306 == -1) {
			return true;
		} else {
			@Pc(28) Class119 local28 = Static92.method1640(local16.anInt1306);
			return local28.anInt3798 == -1 ? true : local28.method3210();
		}
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(II)I")
	public static int method1676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static170.anIntArrayArray37 == null ? 0 : Static170.anIntArrayArray37[arg0][arg1] & 0xFFFFFF;
	}
}
