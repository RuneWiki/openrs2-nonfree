import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!gk;")
	public static Class87 aClass87_3;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public static int anInt6076;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
	public static final int[] anIntArray368 = new int[13];

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_15 = new Class183(11, 3);

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	public static int anInt6074 = 0;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!la;")
	public static final Class136 aClass136_168 = new Class136(38, -2);

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public static int anInt6077 = 1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([SII)[S")
	public static short[] method4992(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static466.method209(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIZLclient!uu;I)V")
	public static void method4994(@OriginalArg(1) int arg0, @OriginalArg(4) Class250 arg1, @OriginalArg(5) int arg2) {
		Static88.anInt1592 = arg0;
		Static63.anInt7101 = 1;
		Static134.aBoolean185 = false;
		Static28.anInt494 = arg2;
		Static107.anInt1917 = 0;
		Static111.anInt1973 = 10000;
		Static395.aClass250_95 = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)I")
	public static int method4999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = local15 << 1 | arg0 & 0x1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(CI)C")
	public static char method5001(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
