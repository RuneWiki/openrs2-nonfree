import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "[I")
	public static int[] anIntArray90;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_29 = new Class173(64, 3);

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
	public static int anInt2281 = 0;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_50 = new Class362(78, -2);

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_51 = new Class362(12, 3);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	public static void method2177() {
		Static200.method3417((long) Static106.anInt2418, Static440.aClass44_12);
		if (Static332.anInt6370 != -1) {
			Static26.method343(Static332.anInt6370);
		}
		for (@Pc(19) int local19 = 0; local19 < Static68.anInt1112; local19++) {
			if (Static261.aBooleanArray18[local19]) {
				Static250.aBooleanArray13[local19] = true;
			}
			Static222.aBooleanArray9[local19] = Static261.aBooleanArray18[local19];
			Static261.aBooleanArray18[local19] = false;
		}
		Static47.anInt643 = Static106.anInt2418;
		if (Static332.anInt6370 != -1) {
			Static68.anInt1112 = 0;
			Static329.method5382();
		}
		Static440.aClass44_12.JA();
		Static59.method990(Static440.aClass44_12);
		@Pc(65) int local65 = Static142.method2738();
		if (local65 == -1) {
			local65 = Static180.anInt3622;
		}
		if (local65 == -1) {
			local65 = Static535.anInt9525;
		}
		Static483.method7218(local65);
		Static356.anInt6930 = 0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIILclient!rda;)V")
	public static void method2178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub4_Sub2_Sub1_Sub2 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static597.method3724(local6, 0, local6.length, arg0);
		Static354.method5727(arg1, arg2, local6);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method2179(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
