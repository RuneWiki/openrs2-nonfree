import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fd", name = "Nc", descriptor = "I")
	public static int anInt1869 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	public static void method1508(@OriginalArg(1) int arg0) {
		if (arg0 == Static337.anInt5814) {
			return;
		}
		Static92.anInt2048 = Static290.anInt5893 = Static120.anIntArray250[arg0];
		Static164.aClass92_7.method4464(50, (int) ((double) Static92.anInt2048 * 34.46D));
		Static254.anIntArrayArrayArray16 = new int[4][Static92.anInt2048 >> 3][Static290.anInt5893 >> 3];
		Static116.anIntArrayArray16 = new int[Static92.anInt2048][Static290.anInt5893];
		Static251.anIntArrayArray49 = new int[Static92.anInt2048][Static290.anInt5893];
		for (@Pc(52) int local52 = 0; local52 < 4; local52++) {
			Static345.aClass174Array1[local52] = Static322.method5313(Static290.anInt5893, Static92.anInt2048);
		}
		Static173.aByteArrayArrayArray6 = new byte[4][Static92.anInt2048][Static290.anInt5893];
		Static15.method316(Static290.anInt5893, Static92.anInt2048);
		Static213.method3696(Static164.aClass92_7, Static92.anInt2048 >> 3, Static290.anInt5893 >> 3);
		Static337.anInt5814 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1516(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static183.aClass141_1);
		arg0.removeFocusListener(Static183.aClass141_1);
		Static9.anInt6463 = -1;
	}
}
