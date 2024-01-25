import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!ac;")
	public static Class4 aClass4_4;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString163 = "M";

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public static int anInt2397 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[Ljava/lang/String;II[S)V")
	public static void method1989(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(8) int local8 = (arg0 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg1[local8];
		arg1[local8] = arg1[arg0];
		arg1[arg0] = local14;
		@Pc(28) short local28 = arg3[local8];
		arg3[local8] = arg3[arg0];
		arg3[arg0] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg0; local40++) {
			if (local14 == null || arg1[local40] != null && arg1[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(64) String local64 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10] = local64;
				@Pc(78) short local78 = arg3[local40];
				arg3[local40] = arg3[local10];
				arg3[local10++] = local78;
			}
		}
		arg1[arg0] = arg1[local10];
		arg1[local10] = local14;
		arg3[arg0] = arg3[local10];
		arg3[local10] = local28;
		method1989(local10 - 1, arg1, arg2, arg3);
		method1989(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method1990() {
		Static21.aClass103_2.method2684();
		Static131.aClass103_26.method2684();
		Static128.aClass103_25.method2684();
		Static187.aClass103_33.method2684();
		Static262.aClass103_50.method2684();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public static void method1991() {
		if (Static342.aFrame2 != null) {
			return;
		}
		@Pc(10) Container local10;
		if (Static212.aFrame1 == null) {
			local10 = Static116.aClass21_4.anApplet1;
		} else {
			local10 = Static212.aFrame1;
		}
		Static200.anInt3944 = local10.getSize().width;
		Static276.anInt5460 = local10.getSize().height;
		@Pc(28) Insets local28;
		if (Static212.aFrame1 == local10) {
			local28 = Static212.aFrame1.getInsets();
			Static276.anInt5460 -= local28.bottom + local28.top;
			Static200.anInt3944 -= local28.left + local28.right;
		}
		if (Static213.method3775() == 1) {
			Static128.anInt2823 = 765;
			Static107.anInt1503 = (Static200.anInt3944 - 765) / 2;
			Static214.anInt4266 = 503;
			Static314.anInt6029 = 0;
		} else if (Static194.anInt1874 < 96 && Static329.anInt6220 == 0) {
			@Pc(74) int local74 = Static200.anInt3944 <= 1024 ? Static200.anInt3944 : 1024;
			Static128.anInt2823 = local74;
			Static107.anInt1503 = (Static200.anInt3944 - local74) / 2;
			@Pc(92) int local92 = Static276.anInt5460 <= 768 ? Static276.anInt5460 : 768;
			Static214.anInt4266 = local92;
			Static314.anInt6029 = 0;
		} else {
			Static128.anInt2823 = Static200.anInt3944;
			Static314.anInt6029 = 0;
			Static214.anInt4266 = Static276.anInt5460;
			Static107.anInt1503 = 0;
		}
		if (Static151.anInt3239 != 0) {
			@Pc(123) boolean local123;
			if (Static128.anInt2823 < 1024 && Static214.anInt4266 < 768) {
				local123 = true;
			} else {
				local123 = false;
			}
		}
		Static269.aCanvas4.setSize(Static128.anInt2823, Static214.anInt4266);
		if (Static128.aClass89_3 != null) {
			Static128.aClass89_3.method5434();
		}
		if (local10 == Static212.aFrame1) {
			local28 = Static212.aFrame1.getInsets();
			Static269.aCanvas4.setLocation(Static107.anInt1503 + local28.left, local28.top + Static314.anInt6029);
		} else {
			Static269.aCanvas4.setLocation(Static107.anInt1503, Static314.anInt6029);
		}
		if (Static161.anInt3337 != -1) {
			Static341.method5541(true);
		}
		Static282.method4683();
	}
}
