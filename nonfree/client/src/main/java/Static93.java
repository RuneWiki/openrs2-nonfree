import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!daa", name = "V", descriptor = "I")
	public static int anInt1647;

	// $FF: synthetic field
	@OriginalMember(owner = "client!daa", name = "P", descriptor = "Ljava/lang/Class;")
	private static Class aClass11;

	@OriginalMember(owner = "client!daa", name = "J", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!daa", name = "Q", descriptor = "Z")
	public static volatile boolean aBoolean108 = true;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(JJ)J")
	public static long method1576(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z")
	public static boolean method1577(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(21) Class local21 = (Class) Static533.aHashtable7.get(arg0);
		if (local21 != null) {
			return local21.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(37) File local37 = null;
		if (local37 == null) {
			local37 = (File) Static356.aHashtable4.get(arg0);
		}
		if (local37 != null) {
			try {
				local37 = new File(local37.getCanonicalPath());
				@Pc(57) Class local57 = Class.forName("java.lang.Runtime");
				@Pc(62) Class local62 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(74) Method local74 = local62.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(96) Method local96 = local57.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local74.invoke(local96, Boolean.TRUE);
				local96.invoke(Runtime.getRuntime(), arg1, local37.getPath());
				local74.invoke(local96, Boolean.FALSE);
				Static533.aHashtable7.put(arg0, arg1);
				return true;
			} catch (@Pc(139) NoSuchMethodException local139) {
				System.load(local37.getPath());
				Static533.aHashtable7.put(arg0, aClass11 == null ? (aClass11 = Class14_Sub7_Sub7.a("rn")) : aClass11);
				return true;
			} catch (@Pc(160) Throwable local160) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZIIIII)V")
	public static void method1579(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static5.anInt65 = arg2;
		Static307.anInt5461 = arg1;
		Static116.anInt1895 = arg5;
		Static470.anInt8102 = arg3;
		Static24.anInt330 = arg4;
		if (arg0 && Static116.anInt1895 >= 100) {
			Static229.anInt4393 = Static470.anInt8102 * 512 + 256;
			Static70.anInt1085 = Static24.anInt330 * 512 + 256;
			Static153.anInt2372 = Static388.method5919(Static229.anInt4393, Static70.anInt1085, Static391.anInt6811) - Static5.anInt65;
		}
		Static304.anInt5410 = 2;
		Static124.anInt2024 = -1;
		Static507.anInt8817 = -1;
	}
}
