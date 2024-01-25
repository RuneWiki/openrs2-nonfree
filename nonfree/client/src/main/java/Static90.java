import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!qea;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!gda;")
	public static Class126 aClass126_53;

	// $FF: synthetic field
	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Ljava/lang/Class;")
	private static Class aClass9;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt1510 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BFFFFFFI)F")
	public static float method1398(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(11) float local11 = arg4 - arg1;
		@Pc(15) float local15 = arg5 - arg3;
		@Pc(20) float local20 = arg2 - arg0;
		@Pc(22) float local22 = 0.0F;
		@Pc(24) float local24 = 0.0F;
		@Pc(26) float local26 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(44) float local44 = local7 * local11 + arg1;
			@Pc(50) float local50 = arg3 + local7 * local15;
			@Pc(56) float local56 = local20 * local7 + arg0;
			@Pc(61) int local61 = (int) local44 >> 9;
			@Pc(66) int local66 = (int) local56 >> 9;
			if (local61 > 0 && local66 > 0 && local61 < Static271.anInt4910 && local66 < Static613.anInt9909) {
				@Pc(95) int local95 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139;
				if (local95 < 3 && (Static172.aByteArrayArrayArray23[1][local61][local66] & 0x2) != 0) {
					local95++;
				}
				@Pc(126) int local126 = Static668.aClass84Array4[local95].method7625((int) local44, (int) local56);
				if ((float) local126 < local50) {
					if (arg6 < 2) {
						return local7;
					}
					return method1398(local26, local22, local56, local24, local44, local50, arg6 - 1) * 0.1F + local7 - 0.1F;
				}
			}
			local7 += 0.1F;
			local26 = local56;
			local24 = local50;
			local22 = local44;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Z")
	public static boolean method1399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static157.method2868(arg0, arg1) | Static499.method6950(arg1, arg0) | Static113.method3806(arg1, arg0)) & Static306.method4764(arg0, arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZZ)V")
	public static void method1401(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static381.anInt6411 != -1) {
				Static397.method5820(Static381.anInt6411);
			}
			for (@Pc(18) Class5_Sub38 local18 = (Class5_Sub38) Static438.aClass306_31.method6941(); local18 != null; local18 = (Class5_Sub38) Static438.aClass306_31.method6940()) {
				if (!local18.method9219()) {
					local18 = (Class5_Sub38) Static438.aClass306_31.method6941();
					if (local18 == null) {
						break;
					}
				}
				Static655.method9010(false, local18, true);
			}
			Static381.anInt6411 = -1;
			Static438.aClass306_31 = new Class306(8);
			Static141.method2586();
			Static381.anInt6411 = Static598.anInt10850;
			Static417.method6129(false);
			Static352.method5188(-91);
			Static247.method3963(Static381.anInt6411);
		}
		Static386.method5711();
		Static531.aBoolean573 = false;
		Static197.method3299();
		Static586.anInt9462 = -1;
		Static310.method4802(Static27.anInt363);
		Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 = new Class4_Sub1_Sub1_Sub2_Sub1();
		Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 = Static613.anInt9909 * 512 / 2;
		Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 = Static271.anInt4910 * 512 / 2;
		Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0] = Static271.anInt4910 / 2;
		Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0] = Static613.anInt9909 / 2;
		Static282.anInt5025 = 0;
		Static141.anInt2764 = 0;
		if (Static426.anInt7111 == 2) {
			Static141.anInt2764 = Static239.anInt4140 << 9;
			Static282.anInt5025 = Static352.anInt5799 << 9;
		} else {
			Static153.method2791();
		}
		Static8.method134();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FB)F")
	public static float method1403(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Z")
	public static boolean method1405(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		@Pc(8) Class local8 = (Class) Static626.aHashtable15.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(31) File local31 = null;
		if (local31 == null) {
			local31 = (File) Static96.aHashtable19.get(arg0);
		}
		if (local31 != null) {
			try {
				local31 = new File(local31.getCanonicalPath());
				@Pc(51) Class local51 = Class.forName("java.lang.Runtime");
				@Pc(56) Class local56 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(68) Method local68 = local56.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(90) Method local90 = local51.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local68.invoke(local90, Boolean.TRUE);
				local90.invoke(Runtime.getRuntime(), arg1, local31.getPath());
				local68.invoke(local90, Boolean.FALSE);
				Static626.aHashtable15.put(arg0, arg1);
				return true;
			} catch (@Pc(133) NoSuchMethodException local133) {
				System.load(local31.getPath());
				Static626.aHashtable15.put(arg0, aClass9 == null ? (aClass9 = Class76.a("cv")) : aClass9);
				return true;
			} catch (@Pc(154) Throwable local154) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I")
	public static int method1406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg1;
		@Pc(26) int local26 = (arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
		return local26 + ((local8 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8);
	}
}
