import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_779 = Static187.method3089("Konfig geladen)3");

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_782 = Static187.method3089("Connection lost)3");

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!vd;")
	public static Class92 aClass92_780 = aClass92_782;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "[I")
	public static final int[] anIntArray157 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
	public static int anInt1855 = 0;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_781 = Static187.method3089(")1 ");

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
	public static int anInt1856 = -1;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
	public static int anInt1857 = 0;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_783 = Static187.method3089("Spieler");

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_784 = Static187.method3089("blinken1:");

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ba;B)Lclient!ba;")
	public static Class11 method1282(@OriginalArg(0) Class11 arg0) {
		@Pc(11) int local11 = Static160.method2511(Static195.method3194(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			arg0 = Static9.method2342(arg0.anInt256);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)J")
	public static long method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass5_1 == null ? 0L : local7.aClass5_1.aLong7;
	}
}
