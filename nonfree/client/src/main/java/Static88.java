import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!pc;")
	public static Class188 aClass188_28;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public static int anInt2012 = 0;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_14 = new Class129(32);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!ql;II)V")
	public static void method1487(@OriginalArg(1) Class4_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt6469 && arg1 != -1) {
			@Pc(20) Class46 local20 = Static9.aClass194_1.method4371(arg1);
			@Pc(23) int local23 = local20.anInt1764;
			if (local23 == 1) {
				arg0.anInt6501 = 1;
				arg0.anInt6517 = arg2;
				arg0.anInt6460 = 0;
				arg0.anInt6513 = 0;
				arg0.anInt6483 = 0;
				Static4.method137(local20, arg0.anInt6483, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
			}
			if (local23 == 2) {
				arg0.anInt6513 = 0;
				return;
			}
		} else if (arg1 == -1 || arg0.anInt6469 == -1 || Static9.aClass194_1.method4371(arg1).anInt1767 >= Static9.aClass194_1.method4371(arg0.anInt6469).anInt1767) {
			arg0.anInt6525 = arg0.anInt6524;
			arg0.anInt6513 = 0;
			arg0.anInt6460 = 0;
			arg0.anInt6483 = 0;
			arg0.anInt6501 = 1;
			arg0.anInt6517 = arg2;
			arg0.anInt6469 = arg1;
			if (arg0.anInt6469 == -1) {
				return;
			}
			Static4.method137(Static9.aClass194_1.method4371(arg0.anInt6469), arg0.anInt6483, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
		}
	}
}
