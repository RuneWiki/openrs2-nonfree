import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_59 = new Class272(95, -1);

	@OriginalMember(owner = "client!di", name = "i", descriptor = "S")
	public static short aShort30 = 256;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	public static int anInt2289 = 0;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
	public static int method2050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)Z")
	public static boolean method2051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static199.method3589(arg1, arg0) & Static214.method3765(arg0, arg1);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BIII)V")
	public static void method2052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static278.aClass3_Sub13_Sub1_1.anInt5154 * arg0 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static437.method6178(Static444.aClass246_208, local6, arg1);
			Static127.aBoolean238 = true;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!om;II)Lclient!ai;")
	public static Class3_Sub3_Sub3 method2053(@OriginalArg(0) int arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub11 local14 = new Class3_Sub11(arg1.method5653(arg0, arg2));
		@Pc(45) Class3_Sub3_Sub3 local45 = new Class3_Sub3_Sub3(arg2, local14.method3133(), local14.method3133(), local14.method3116(), local14.method3116(), local14.method3118() == 1, local14.method3118(), local14.method3118());
		@Pc(49) int local49 = local14.method3118();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass130_1.method3548(new Class3_Sub9(local14.method3118(), local14.method3109(), local14.method3109(), local14.method3109(), local14.method3109(), local14.method3109(), local14.method3109(), local14.method3109(), local14.method3109()));
		}
		local45.method242();
		return local45;
	}
}
