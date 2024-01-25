import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "[I")
	public static final int[] anIntArray76 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	public static void method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg1) {
			Static329.method4871(arg1, arg0, Static280.anIntArrayArray25[arg2], arg3);
		} else {
			Static329.method4871(arg0, arg1, Static280.anIntArrayArray25[arg2], arg3);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public static void method1409() {
		if (Static467.aFileOutputStream2 != null) {
			try {
				Static467.aFileOutputStream2.close();
			} catch (@Pc(9) IOException local9) {
			}
		}
		Static467.aFileOutputStream2 = null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!tg;I)Lclient!bda;")
	public static Class21 method1410(@OriginalArg(0) Class11_Sub1_Sub1 arg0) {
		@Pc(14) Class21 local14;
		if (Static52.aClass21_3 == null) {
			local14 = new Class21();
		} else {
			local14 = Static52.aClass21_3;
			Static52.aClass21_3 = Static52.aClass21_3.aClass21_1;
			local14.aClass21_1 = null;
			Static533.anInt8980--;
		}
		local14.aClass11_Sub1_Sub1_1 = arg0;
		return local14;
	}
}
