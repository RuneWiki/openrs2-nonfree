import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
	public static int anInt1820;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "Lclient!vh;")
	public static Class250 aClass250_21;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_27 = new Class237(64, 6);

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_15 = new Class83(8);

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "Lclient!fm;")
	public static final Class87 aClass87_4 = new Class87(1);

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
	public static int anInt1822 = -1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
	public static boolean method1525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static223.anIntArrayArrayArray10[arg0][arg1][arg2];
		if (local7 == -Static48.anInt907) {
			return false;
		} else if (local7 == Static48.anInt907) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static139.anInt2355;
			@Pc(26) int local26 = arg2 << Static139.anInt2355;
			if (Static64.method1127(local22 + 1, Static92.aClass136Array1[arg0].I(arg1, arg2), local26 + 1) && Static64.method1127(local22 + Static337.anInt7424 - 1, Static92.aClass136Array1[arg0].I(arg1 + 1, arg2), local26 + 1) && Static64.method1127(local22 + Static337.anInt7424 - 1, Static92.aClass136Array1[arg0].I(arg1 + 1, arg2 + 1), local26 + Static337.anInt7424 - 1) && Static64.method1127(local22 + 1, Static92.aClass136Array1[arg0].I(arg1, arg2 + 1), local26 + Static337.anInt7424 - 1) && Static64.method1127(local22 + Static122.anInt2160, Static92.aClass136Array1[arg0].I(arg1, arg2), local26 + 1) && Static64.method1127(local22 + Static337.anInt7424 - 1, Static92.aClass136Array1[arg0].I(arg1 + 1, arg2), local26 + Static122.anInt2160) && Static64.method1127(local22 + Static122.anInt2160, Static92.aClass136Array1[arg0].I(arg1, arg2 + 1), local26 + Static337.anInt7424 - 1) && Static64.method1127(local22 + Static337.anInt7424 - 1, Static92.aClass136Array1[arg0].I(arg1, arg2), local26 + Static122.anInt2160) && Static64.method1127(local22 + Static122.anInt2160, Static92.aClass136Array1[arg0].I(arg1, arg2), local26 + Static122.anInt2160)) {
				Static223.anIntArrayArrayArray10[arg0][arg1][arg2] = Static48.anInt907;
				return true;
			} else {
				Static223.anIntArrayArrayArray10[arg0][arg1][arg2] = -Static48.anInt907;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!vh;Lclient!vh;I)V")
	public static void method1526(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class250 arg1) {
		Static347.aClass250_71 = arg0;
		Static49.aClass250_67 = arg1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!lh;I)V")
	public static void method1528(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (Static165.aClass73_5 == null) {
			return;
		}
		try {
			Static165.aClass73_5.method1524(0L);
			Static165.aClass73_5.method1519(24, arg1.aByteArray66, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
