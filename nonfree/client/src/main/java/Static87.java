import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "[[Lclient!jk;")
	public static Class124[][] aClass124ArrayArray7;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_167 = new Class12(80, 3);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "[Lclient!ir;")
	public static final Class25_Sub5_Sub1_Sub1[] aClass25_Sub5_Sub1_Sub1Array6 = new Class25_Sub5_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString74 = null;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public static int anInt6711 = -1;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	public static int anInt6712 = 0;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIB)V")
	public static void method5266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static250.anInt4507; local7++) {
			@Pc(13) Rectangle local13 = Class129.aRectangleArray2[local7];
			if (arg2 < local13.x + local13.width && local13.x < arg0 + arg2 && local13.y + local13.height > arg1 && arg1 + arg3 > local13.y) {
				Static408.aBooleanArray25[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public static void method5267() {
		Static277.aClass241_12.method5224();
		Static382.aClass245_8.method5320();
		Static339.aClass215_2.method4767();
		Static341.aClass75_4.method1610();
		Static161.aClass231_2.method5027();
		Static342.aClass155_2.method3542();
		Static174.aClass254_1.method5674();
		Static88.aClass69_1.method1555();
		Static82.aClass105_4.method2294();
		Static208.aClass151_1.method3510();
		Static291.aClass21_1.method397();
		Static392.aClass178_4.method3964();
		Static355.aClass263_4.method5832();
		Static65.aClass86_1.method1917();
		Static300.aClass223_1.method4918();
		Static55.aClass187_1.method4186();
		Static130.aClass164_1.method3757();
		Static95.aClass26_1.method573();
		Static95.aClass163_1.method3754();
		Static271.aClass180_2.method3972();
		Static291.method3976();
		Static171.method5259();
		Static218.method3185();
		Static154.method2257();
		Static151.aClass102_20.method2262(5);
		Static234.aClass102_27.method2262(5);
		Static316.aClass102_44.method2262(5);
		Static250.aClass102_32.method2262(5);
		Static298.aClass102_40.method2262(5);
	}
}
